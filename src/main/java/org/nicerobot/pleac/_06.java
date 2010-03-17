// <PLEAC>
// -*- java -*-
// @@PLEAC@@_NAME
// @@SKIP@@ Java

// @@PLEAC@@_WEB
// @@SKIP@@ http://java.sun.com

// </PLEAC>

package org.nicerobot.pleac;

// <PLEAC>
// Following import is assumed throughout this section.
// This requires Java 1.4 or newer.
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// </PLEAC>

/**
 * @author nicerobot
 * 
 */
@SuppressWarnings ("unused")
public class _06 {

  private static final Class<?> SELF;
  private static final String SELF_NAME = new Exception().getStackTrace()[0].getClassName();
  private static final URL SELF_FILE;
  static {
    Class<?> i = null;
    try {
      i = Class.forName(SELF_NAME);
    } catch (ClassNotFoundException e) {
    }
    SELF = i;
    SELF_FILE = SELF.getResource(String.format("/%s.class",SELF_NAME.replaceAll("[.]", "/")));
  }

  public static void _00 () {

    {
      String pattern = ".";
      String replacement = "replacement";
      String string = "string";
      String meadow = "meadow";

      // <PLEAC>

      // ^^PLEAC^^_6.0
      // -----------------------------
      Matcher match = Pattern.compile(pattern).matcher(string);
      string.replaceFirst(pattern, replacement);
      // -----------------------------
      Pattern.compile("sheep").matcher(meadow).find(); // True if meadow contains "sheep"
      // </PLEAC>

      boolean noSheep =
        // <PLEAC>
        !Pattern.compile("sheep").matcher(meadow).find(); // True if meadow doesn't contain "sheep"
      // </PLEAC>

      // <PLEAC>
      meadow.replaceFirst("old", "new"); // Replace "old" with "new" in meadow
      // </PLEAC>
    }

    for (String meadow : new String[] {
        "Fine bovines demand fine toreadors.",
        "Muskoxen are a polar ovibovine species.",
        "Grooviness went out of fashion decades ago.",
    "Ovines are found typically in oviaries." }) {
      System.out.format("\n%s\n\t--> ", meadow);
      // <PLEAC>
      // -----------------------------
      // Fine bovines demand fine toreadors.
      // Muskoxen are a polar ovibovine species.
      // Grooviness went out of fashion decades ago.
      // -----------------------------
      // Ovines are found typically in oviaries.
      // -----------------------------
      if (Pattern.compile("bovines?\\b", Pattern.CASE_INSENSITIVE).matcher(meadow).find()) {
        System.out.print("Here be sheep!");
      }
      // </PLEAC>
      else {
        System.out.print("No sheep!");
      }
    }

    System.out.println();

    {
      // <PLEAC>
      // -----------------------------
      String string = "good food";
      string = string.replaceFirst("o*", "e");
      // -----------------------------
      // good food
      //
      // geod food
      //
      // geed food
      //
      // geed feed
      //
      // ged food
      //
      // ged fed
      //
      // egood food
      // </PLEAC>
      System.out.println(string);
    }

    // -----------------------------
    // % echo ababacaca | perl -ne 'print "$&\n" if /(a|ba|b)+(a|ac)+/'
    // ababa
    // -----------------------------
    // % echo ababacaca |
    // awk 'match($0,/(a|ba|b)+(a|ac)+/) { print substr($0, RSTART, RLENGTH) }'
    // ababacaca

    {
      String _ = "x 1 x 12 x 123 x 1234 x";
      // <PLEAC>
      // -----------------------------
      Matcher m = Pattern.compile("(\\d+)").matcher(_);
      while (m.find()) {
        System.out.format("Found number %s\n", m.group(1));
      }
      // </PLEAC>
    }

    {
      String _ = "x 1 x 12 x 123 x 1234 x";
      // <PLEAC>
      // -----------------------------
      Matcher m = Pattern.compile("(\\d+)").matcher(_);
      List<Integer> n = new ArrayList<Integer>();
      while (m.find()) {
        n.add(Integer.parseInt(m.group(1)));
      }
      Integer[] numbers = n.toArray(new Integer[0]);
      // </PLEAC>
    }

    {
      // <PLEAC>
      // -----------------------------
      // This is a utility method used in the following example:
      // </PLEAC>
      // <PLEAC include="toList(Iterable<T>)">
      // <PLEAC>
      String digits = "123456789";
      List<String> nonlap = toList(Pattern.compile("(\\d\\d\\d)").matcher(digits));
      List<String> yeslap = toList(Pattern.compile("(?=(\\d\\d\\d))").matcher(digits));
      System.out.format("Non-overlapping:  %s\n", nonlap);
      System.out.format("Overlapping:      %s\n", yeslap);
      // Non-overlapping: 123 456 789
      // Overlapping: 123 234 345 456 567 678 789
      // </PLEAC>
    }

    {
      // <PLEAC>
      // -----------------------------
      String string = "And little lambs eat ivy";
      Matcher m = Pattern.compile("l[^s]*s").matcher(string);
      m.find();
      MatchResult mr = m.toMatchResult(); // Requires Java 1.5 or newer.
      System.out.format("(%s) (%s) (%s)\n",
          string.substring(0, mr.start()), // $`
          m.group(),                       // $&
          string.substring(mr.end()));     // $'
      // (And ) (little lambs) ( eat ivy)
      // </PLEAC>
    }
  }

  public static void _01 () {

    {
      String src = "that is this";
      // <PLEAC>

      // ^^PLEAC^^_6.1
      // -----------------------------
      String dst = src.replaceFirst("this", "that");
      // </PLEAC>
    }

    {
      String src = "that is this";
      // <PLEAC>
      // -----------------------------
      // TODO perl -> ($dst = $src) =~ s/this/that/;
      String dst = src.replaceFirst("this", "that");
      // </PLEAC>
    }

    {
      String word = "1asd2 make asd34zxc all 45 ? wOrds tItlE-caSed ??";
      String manpage = "/usr/man/man3/foo.1";
      // <PLEAC>
      // -----------------------------
      // strip to basename
      String self = Class.class.getResource(String.format("/%s.class",
          new Exception().getStackTrace()[0].getClassName().replaceAll("[.]", "/"))).getFile();
      String progname = self.replaceFirst(String.format("^.*%c", File.separatorChar), "");
      // Make All Words Title-Cased
      Matcher m = Pattern.compile("(\\w+)").matcher(word);
      StringBuffer cap = new StringBuffer();
      while (m.find()) {
        String w = m.group(1);
        m.appendReplacement(cap, String.format("%S%s",w.substring(0,1),w.substring(1).toLowerCase()));
      }
      m.appendTail(cap);
      String capword = cap.toString();
      // /usr/man/man3/foo.1 changes to /usr/man/cat3/foo.1
      String catpage = manpage.replaceFirst("man(?=\\d)", "cat");
      // </PLEAC>
      System.out.format("%s\n%s\n%s\n%s\n", self, progname, capword, catpage);
    }

    {
      // <PLEAC>
      // -----------------------------
      String[] bindirs = {"/usr/bin","/bin","/usr/local/bin"};
      String[] libdirs = new String[bindirs.length];
      int i = 0;
      for (String dir : bindirs) {
        libdirs[i++] = dir.replaceFirst("bin","lib");
      }
      System.out.format("%s\n",Arrays.asList(libdirs));
      // /usr/lib /lib /usr/local/lib
      // </PLEAC>
    }

    {
      String b = "a b x c d x xxXx";
      {
        // <PLEAC>
        // -----------------------------
        String a = b.replaceAll("x","y");   // store changes to b in a
        // </PLEAC>
        System.out.format("a=%s\nb=%s\n",a,b);
      }
      {
        // <PLEAC>
        // change b, count goes in a
        Matcher m = Pattern.compile("x").matcher(b);
        int a = 0;
        StringBuffer c = new StringBuffer();
        while (m.find()) {
          String w = m.group();
          m.appendReplacement(c, "y");
          ++a;
        }
        m.appendTail(c);
        b = c.toString();
        // </PLEAC>
        System.out.format("a=%d\nb=%s\n",a,b);
      }
    }

  }

  public static void _02 () {

    {
      // <PLEAC>

      // ^^PLEAC^^_6.2
      // -----------------------------
      // TODO perl -> if ($var =~ /^[A-Za-z]+$/) {
      // TODO perl -> # it is purely alphabetic
      // TODO perl -> }
      // </PLEAC>
    }

    {
      // <PLEAC>
      // -----------------------------
      // TODO perl -> use locale;
      // TODO perl -> if ($var =~ /^[^\W\d_]+$/) {
      // TODO perl -> print "var is purely alphabetic\n";
      // TODO perl -> }
      // </PLEAC>
    }

    {
      // <PLEAC>
      // -----------------------------
      // TODO perl -> use locale;
      // TODO perl -> use POSIX 'locale_h';
      // TODO perl ->
      // the following locale string might be different on your system
      // TODO perl -> unless (setlocale(LC_ALL, "fr_CA.ISO8859-1")) {
      // TODO perl -> die "couldn't set locale to French Canadian\n";
      // TODO perl -> }
      // TODO perl ->
      // TODO perl -> while (<DATA>) {
      // TODO perl -> chomp;
      // TODO perl -> if (/^[^\W\d_]+$/) {
      // TODO perl -> print "$_: alphabetic\n";
      // TODO perl -> } else {
      // TODO perl -> print "$_: line noise\n";
      // TODO perl -> }
      // TODO perl -> }
      // TODO perl ->
      // __END__
      // silly
      // façade
      // coöperate
      // niño
      // Renée
      // Molière
      // hæmoglobin
      // naïve
      // tschüß
      // random!stuff#here
      // </PLEAC>
    }

  }

  public static void _03 () {

    {
      // <PLEAC>

      // ^^PLEAC^^_6.3
      // -----------------------------
      // /\S+/ # as many non-whitespace bytes as possible
      // /[A-Za-z'-]+/ # as many letters, apostrophes, and hyphens
      // </PLEAC>
    }

    {
      // <PLEAC>
      // -----------------------------
      // /\b([A-Za-z]+)\b/ # usually best
      // /\s([A-Za-z]+)\s/ # fails at ends or w/ punctuation
      // </PLEAC>
    }

  }

  public static void _04 () {

    {
      // <PLEAC>

      // ^^PLEAC^^_6.4
      // -----------------------------
      // ^^INCLUDE^^ include/perl/ch06/resname
      // </PLEAC>
    }

    {
      // <PLEAC>
      // -----------------------------
      // TODO perl -> s/ # replace
      // TODO perl -> \# # a pound sign
      // TODO perl -> (\w+) # the variable name
      // TODO perl -> \# # another pound sign
      // TODO perl -> /${$1}/xg; # with the value of the global variable
      // </PLEAC>
    }

    {
      // <PLEAC>
      // #-----------------------------
      // TODO perl -> s/ # replace
      // TODO perl -> \# # a pound sign
      // TODO perl -> (\w+) # the variable name
      // TODO perl -> \# # another pound sign
      // TODO perl -> /'$' . $1/xeeg; # ' with the value of *any* variable
      // </PLEAC>
    }

  }

  public static void _05 () {

    {
      // <PLEAC>

      // ^^PLEAC^^_6.5
      // -----------------------------
      // One fish two fish red fish blue fish
      // </PLEAC>
    }

    {
      // <PLEAC>
      // -----------------------------
      // TODO perl -> $WANT = 3;
      // TODO perl -> $count = 0;
      // TODO perl -> while (/(\w+)\s+fish\b/gi) {
      // TODO perl -> if (++$count == $WANT) {
      // TODO perl -> print "The third fish is a $1 one.\n";
      // TODO perl -> # Warning: don't `last' out of this loop
      // TODO perl -> }
      // TODO perl -> }
      // The third fish is a red one.
      // </PLEAC>
    }

    {
      // <PLEAC>
      // -----------------------------
      // TODO perl -> /(?:\w+\s+fish\s+){2}(\w+)\s+fish/i;
      // </PLEAC>
    }

    {
      // <PLEAC>
      // -----------------------------
      // simple way with while loop
      // TODO perl -> $count = 0;
      // TODO perl -> while ($string =~ /PAT/g) {
      // TODO perl -> $count++; # or whatever you'd like to do here
      // TODO perl -> }
      // TODO perl ->
      // same thing with trailing while
      // TODO perl -> $count = 0;
      // TODO perl -> $count++ while $string =~ /PAT/g;
      // TODO perl ->
      // or with for loop
      // TODO perl -> for ($count = 0; $string =~ /PAT/g; $count++) { }
      // TODO perl ->
      // Similar, but this time count overlapping matches
      // TODO perl -> $count++ while $string =~ /(?=PAT)/g;
      // </PLEAC>
    }

    {
      // <PLEAC>
      // -----------------------------
      // TODO perl -> $pond = 'One fish two fish red fish blue fish';
      // TODO perl ->
      // using a temporary
      // TODO perl -> @colors = ($pond =~ /(\w+)\s+fish\b/gi); # get all matches
      // TODO perl -> $color = $colors[2]; # then the one we want
      // TODO perl ->
      // or without a temporary array
      // TODO perl -> $color = ( $pond =~ /(\w+)\s+fish\b/gi )[2]; # just grab element 3
      // TODO perl ->
      // TODO perl -> print "The third fish in the pond is $color.\n";
      // The third fish in the pond is red.
      // </PLEAC>
    }

    {
      // <PLEAC>
      // -----------------------------
      // TODO perl -> $count = 0;
      // TODO perl -> $_ = 'One fish two fish red fish blue fish';
      // TODO perl -> @evens = grep { $count++ % 2 == 1 } /(\w+)\s+fish\b/gi;
      // TODO perl -> print "Even numbered fish are @evens.\n";
      // Even numbered fish are two blue.
      // </PLEAC>
    }

    {
      // <PLEAC>
      // -----------------------------
      // TODO perl -> $count = 0;
      // TODO perl -> s{
      // TODO perl -> \b # makes next \w more efficient
      // TODO perl -> ( \w+ ) # this is what we'll be changing
      // TODO perl -> (
      // TODO perl -> \s+ fish \b
      // TODO perl -> )
      // TODO perl -> }{
      // TODO perl -> if (++$count == 4) {
      // TODO perl -> "sushi" . $2;
      // TODO perl -> } else {
      // TODO perl -> $1 . $2;
      // TODO perl -> }
      // TODO perl -> }gex;
      // One fish two fish red fish sushi fish
      // </PLEAC>
    }

    {
      // <PLEAC>
      // -----------------------------
      // TODO perl -> $pond = 'One fish two fish red fish blue fish swim here.';
      // TODO perl -> $color = ( $pond =~ /\b(\w+)\s+fish\b/gi )[-1];
      // TODO perl -> print "Last fish is $color.\n";
      // Last fish is blue.
      // </PLEAC>
    }

    {
      // <PLEAC>
      // -----------------------------
      // TODO perl -> m{
      // TODO perl -> A # find some pattern A
      // TODO perl -> (?! # mustn't be able to find
      // TODO perl -> .* # something
      // TODO perl -> A # and A
      // TODO perl -> )
      // TODO perl -> $ # through the end of the string
      // TODO perl -> }x
      // </PLEAC>
    }

    {
      // <PLEAC>
      // -----------------------------
      // TODO perl -> $pond = 'One fish two fish red fish blue fish swim here.';
      // TODO perl -> if ($pond =~ m{
      // TODO perl -> \b ( \w+) \s+ fish \b
      // TODO perl -> (?! .* \b fish \b )
      // TODO perl -> }six )
      // TODO perl -> {
      // TODO perl -> print "Last fish is $1.\n";
      // TODO perl -> } else {
      // TODO perl -> print "Failed!\n";
      // TODO perl -> }
      // Last fish is blue.
      // </PLEAC>
    }

  }

  public static void _06 () {

    {
      // <PLEAC>

      // ^^PLEAC^^_6.6
      // -----------------------------
      // ^^INCLUDE^^ include/perl/ch06/killtags
      // </PLEAC>
    }

    {
      // <PLEAC>
      // -----------------------------
      // ^^INCLUDE^^ include/perl/ch06/headerfy
      // </PLEAC>
    }

    {
      // <PLEAC>
      // -----------------------------
      // % perl -00pe 's{\A(Chapter\s+\d+\s*:.*)}{<H1>$1</H1>}gx' datafile
      // </PLEAC>
    }

    {
      // <PLEAC>
      // -----------------------------
      // TODO perl -> $/ = ''; # paragraph read mode for readline access
      // TODO perl -> while (<ARGV>) {
      // TODO perl -> while (m#^START(.*?)^END#sm) { # /s makes . span line boundaries
      // TODO perl -> # /m makes ^ match near newlines
      // TODO perl -> print "chunk $. in $ARGV has <<$1>>\n";
      // TODO perl -> }
      // TODO perl -> }
      // </PLEAC>
    }

  }

  public static void _07 () {

    {
      // <PLEAC>

      // ^^PLEAC^^_6.7
      // -----------------------------
      // TODO perl -> undef $/;
      // TODO perl -> @chunks = split(/pattern/, <FILEHANDLE>);
      // </PLEAC>
    }

    {
      // <PLEAC>
      // -----------------------------
      // .Ch, .Se and .Ss divide chunks of STDIN
      // TODO perl -> {
      // TODO perl -> local $/ = undef;
      // TODO perl -> @chunks = split(/^\.(Ch|Se|Ss)$/m, <>);
      // TODO perl -> }
      // TODO perl -> print "I read ", scalar(@chunks), " chunks.\n";
      // </PLEAC>
    }

  }

  public static void _08 () {

    {
      // <PLEAC>

      // ^^PLEAC^^_6.8
      // -----------------------------
      // TODO perl -> while (<>) {
      // TODO perl -> if (/BEGIN PATTERN/ .. /END PATTERN/) {
      // TODO perl -> # line falls between BEGIN and END in the
      // TODO perl -> # text, inclusive.
      // TODO perl -> }
      // TODO perl -> }
      // TODO perl ->
      // TODO perl -> while (<>) {
      // TODO perl -> if ($FIRST_LINE_NUM .. $LAST_LINE_NUM) {
      // TODO perl -> # operate only between first and last line, inclusive.
      // TODO perl -> }
      // TODO perl -> }
      // </PLEAC>
    }

    {
      // <PLEAC>
      // -----------------------------
      // TODO perl -> while (<>) {
      // TODO perl -> if (/BEGIN PATTERN/ ... /END PATTERN/) {
      // TODO perl -> # line is between BEGIN and END on different lines
      // TODO perl -> }
      // TODO perl -> }
      // TODO perl ->
      // TODO perl -> while (<>) {
      // TODO perl -> if ($FIRST_LINE_NUM ... $LAST_LINE_NUM) {
      // TODO perl -> # operate only between first and last line, but not same
      // TODO perl -> }
      // TODO perl -> }
      // </PLEAC>
    }

    {
      // <PLEAC>
      // -----------------------------
      // command-line to print lines 15 through 17 inclusive (see below)
      // TODO perl -> perl -ne 'print if 15 .. 17' datafile
      // TODO perl ->
      // print out all <XMP> .. </XMP> displays from HTML doc
      // TODO perl -> while (<>) {
      // TODO perl -> print if m#<XMP>#i .. m#</XMP>#i;
      // TODO perl -> }
      // TODO perl ->
      // same, but as shell command
      // perl -ne 'print if m#<XMP>#i .. m#</XMP>#i' document.html
      // </PLEAC>
    }

    {
      // <PLEAC>
      // -----------------------------
      // perl -ne 'BEGIN { $top=3; $bottom=5 } print if $top .. $bottom' /etc/passwd # previous command
      // FAILS
      // perl -ne 'BEGIN { $top=3; $bottom=5 } \
      // print if $. == $top .. $. == $bottom' /etc/passwd # works
      // perl -ne 'print if 3 .. 5' /etc/passwd # also works
      // </PLEAC>
    }

    {
      // <PLEAC>
      // -----------------------------
      // TODO perl -> print if /begin/ .. /end/;
      // TODO perl -> print if /begin/ ... /end/;
      // </PLEAC>
    }

    {
      // <PLEAC>
      // -----------------------------
      // TODO perl -> while (<>) {
      // TODO perl -> $in_header = 1 .. /^$/;
      // TODO perl -> $in_body = /^$/ .. eof();
      // TODO perl -> }
      // </PLEAC>
    }

    {
      // <PLEAC>
      // -----------------------------
      // TODO perl -> %seen = ();
      // TODO perl -> while (<>) {
      // TODO perl -> next unless /^From:?\s/i .. /^$/;
      // TODO perl -> while (/([^<>(),;\s]+\@[^<>(),;\s]+)/g) {
      // TODO perl -> print "$1\n" unless $seen{$1}++;
      // TODO perl -> }
      // TODO perl -> }
      // </PLEAC>
    }

  }

  public static void _09 () {

    {
      // <PLEAC>

      // ^^PLEAC^^_6.9
      // -----------------------------
      // TODO perl -> sub glob2pat {
      // TODO perl -> my $globstr = shift;
      // TODO perl -> my %patmap = (
      // TODO perl -> '*' => '.*',
      // TODO perl -> '?' => '.',
      // TODO perl -> '[' => '[',
      // TODO perl -> ']' => ']',
      // TODO perl -> );
      // TODO perl -> $globstr =~ s{(.)} { $patmap{$1} || "\Q$1" }ge;
      // TODO perl -> return '^' . $globstr . '$'; #'
      // TODO perl -> }
      // </PLEAC>
    }

  }

  public static void _10 () {

    {
      // <PLEAC>

      // ^^PLEAC^^_6.10
      // -----------------------------
      // TODO perl -> while ($line = <>) {
      // TODO perl -> if ($line =~ /$pattern/o) {
      // TODO perl -> # do something
      // TODO perl -> }
      // TODO perl -> }
      // </PLEAC>
    }

    {
      // <PLEAC>
      // -----------------------------
      // ^^INCLUDE^^ include/perl/ch06/popgrep1
      // </PLEAC>
    }

    {
      // <PLEAC>
      // -----------------------------
      // ^^INCLUDE^^ include/perl/ch06/popgrep2
      // </PLEAC>
    }

    {
      // <PLEAC>
      // -----------------------------
      // TODO perl -> while (defined($line = <>)) {
      // TODO perl -> if ($line =~ /\bCO\b/) { print $line; next; }
      // TODO perl -> if ($line =~ /\bON\b/) { print $line; next; }
      // TODO perl -> if ($line =~ /\bMI\b/) { print $line; next; }
      // TODO perl -> if ($line =~ /\bWI\b/) { print $line; next; }
      // TODO perl -> if ($line =~ /\bMN\b/) { print $line; next; }
      // TODO perl -> }
      // </PLEAC>
    }

    {
      // <PLEAC>
      // -----------------------------
      // ^^INCLUDE^^ include/perl/ch06/popgrep3
      // </PLEAC>
    }

    {
      // <PLEAC>
      // -----------------------------
      // TODO perl -> sub {
      // TODO perl -> m/\b$popstates[0]\b/o || m/\b$popstates[1]\b/o ||
      // TODO perl -> m/\b$popstates[2]\b/o || m/\b$popstates[3]\b/o ||
      // TODO perl -> m/\b$popstates[4]\b/o
      // TODO perl -> }
      // </PLEAC>
    }

    {
      // <PLEAC>
      // -----------------------------
      // ^^INCLUDE^^ include/perl/ch06/grepauth
      // </PLEAC>
    }

    {
      // <PLEAC>
      // -----------------------------
      // ^^INCLUDE^^ include/perl/ch06/popgrep4
      // </PLEAC>
    }

  }

  public static void _11 () {

    {
      // <PLEAC>

      // ^^PLEAC^^_6.11
      // -----------------------------
      // TODO perl -> do {
      // TODO perl -> print "Pattern? ";
      // TODO perl -> chomp($pat = <>);
      // TODO perl -> eval { "" =~ /$pat/ };
      // TODO perl -> warn "INVALID PATTERN $@" if $@;
      // TODO perl -> } while $@;
      // </PLEAC>
    }

    {
      // <PLEAC>
      // -----------------------------
      // TODO perl -> sub is_valid_pattern {
      // TODO perl -> my $pat = shift;
      // TODO perl -> return eval { "" =~ /$pat/; 1 } || 0;
      // TODO perl -> }
      // </PLEAC>
    }

    {
      // <PLEAC>
      // -----------------------------
      // ^^INCLUDE^^ include/perl/ch06/paragrep
      // </PLEAC>
    }

    {
      // <PLEAC>
      // -----------------------------
      // TODO perl -> $pat = "You lose @{[ system('rm -rf *')]} big here";
      // </PLEAC>
    }

    {
      // <PLEAC>
      // -----------------------------
      // TODO perl -> $safe_pat = quotemeta($pat);
      // TODO perl -> something() if /$safe_pat/;
      // </PLEAC>
    }

    {
      // <PLEAC>
      // -----------------------------
      // TODO perl -> something() if /\Q$pat/;
      // </PLEAC>
    }

  }

  public static void _12 () {

    {
      // <PLEAC>

      // ^^PLEAC^^_6.12
      // -----------------------------
      // TODO perl -> use locale;
      // </PLEAC>
    }

    {
      // <PLEAC>
      // -----------------------------
      // ^^INCLUDE^^ include/perl/ch06/localeg
      // TODO perl -> English names: Andreas K Nig
      // TODO perl ->
      // TODO perl -> German names: Andreas König
      // </PLEAC>
    }

  }

  public static void _13 () {

    {
      // <PLEAC>

      // ^^PLEAC^^_6.13
      // -----------------------------
      // TODO perl -> use String::Approx qw(amatch);
      // TODO perl ->
      // TODO perl -> if (amatch("PATTERN", @list)) {
      // TODO perl -> # matched
      // TODO perl -> }
      // TODO perl ->
      // TODO perl -> @matches = amatch("PATTERN", @list);
      // </PLEAC>
    }

    {
      // <PLEAC>
      // -----------------------------
      // TODO perl -> use String::Approx qw(amatch);
      // TODO perl -> open(DICT, "/usr/dict/words") or die "Can't open dict: $!";
      // TODO perl -> while(<DICT>) {
      // TODO perl -> print if amatch("balast");
      // TODO perl -> }
      // TODO perl ->
      // TODO perl -> ballast
      // TODO perl ->
      // TODO perl -> balustrade
      // TODO perl ->
      // TODO perl -> blast
      // TODO perl ->
      // TODO perl -> blastula
      // TODO perl ->
      // TODO perl -> sandblast
      // </PLEAC>
    }

  }

  public static void _14 () {

    {
      // <PLEAC>

      // ^^PLEAC^^_6.14
      // -----------------------------
      // TODO perl -> while (/(\d+)/g) {
      // TODO perl -> print "Found $1\n";
      // TODO perl -> }
      // </PLEAC>
    }

    {
      // <PLEAC>
      // -----------------------------
      // TODO perl -> $n = "   49 here";
      // TODO perl -> $n =~ s/\G /0/g;
      // TODO perl -> print $n;
      // TODO perl -> 00049 here
      // </PLEAC>
    }

    {
      // <PLEAC>
      // -----------------------------
      // TODO perl -> while (/\G,?(\d+)/g) {
      // TODO perl -> print "Found number $1\n";
      // TODO perl -> }
      // </PLEAC>
    }

    {
      // <PLEAC>
      // -----------------------------
      // TODO perl -> $_ = "The year 1752 lost 10 days on the 3rd of September";
      // TODO perl ->
      // TODO perl -> while (/(\d+)/gc) {
      // TODO perl -> print "Found number $1\n";
      // TODO perl -> }
      // TODO perl ->
      // TODO perl -> if (/\G(\S+)/g) {
      // TODO perl -> print "Found $1 after the last number.\n";
      // TODO perl -> }
      // TODO perl ->
      // Found number 1752
      //
      // Found number 10
      //
      // Found number 3
      //
      // Found rd after the last number.
      // </PLEAC>
    }

    {
      // <PLEAC>
      // -----------------------------
      // TODO perl -> print "The position in \$a is ", pos($a);
      // TODO perl -> pos($a) = 30;
      // TODO perl -> print "The position in \$_ is ", pos;
      // TODO perl -> pos = 30;
      // </PLEAC>
    }

  }

  public static void _15 () {

    {
      // <PLEAC>

      // ^^PLEAC^^_6.15
      // -----------------------------
      // greedy pattern
      // TODO perl -> s/<.*>//gs; # try to remove tags, very badly
      // TODO perl ->
      // non-greedy pattern
      // TODO perl -> s/<.*?>//gs; # try to remove tags, still rather badly
      // </PLEAC>
    }

    {
      // <PLEAC>
      // -----------------------------
      // <b><i>this</i> and <i>that</i> are important</b> Oh, <b><i>me too!</i></b>
      // </PLEAC>
    }

    {
      // <PLEAC>
      // -----------------------------
      // TODO perl -> m{ <b><i>(.*?)</i></b> }sx
      // </PLEAC>
    }

    {
      // <PLEAC>
      // -----------------------------
      // TODO perl -> /BEGIN((?:(?!BEGIN).)*)END/
      // </PLEAC>
    }

    {
      // <PLEAC>
      // -----------------------------
      // TODO perl -> m{ <b><i>( (?: (?!</b>|</i>). )* ) </i></b> }sx
      // </PLEAC>
    }

    {
      // <PLEAC>
      // -----------------------------
      // TODO perl -> m{ <b><i>( (?: (?!</[ib]>). )* ) </i></b> }sx
      // </PLEAC>
    }

    {
      // <PLEAC>
      // -----------------------------
      // TODO perl -> m{
      // TODO perl -> <b><i>
      // TODO perl -> [^<]* # stuff not possibly bad, and not possibly the end.
      // TODO perl -> (?:
      // TODO perl -> # at this point, we can have '<' if not part of something bad
      // TODO perl -> (?! </?[ib]> ) # what we can't have
      // TODO perl -> < # okay, so match the '<'
      // TODO perl -> [^<]* # and continue with more safe stuff
      // TODO perl -> ) *
      // TODO perl -> </i></b>
      // TODO perl -> }sx
      // </PLEAC>
    }

  }

  public static void _16 () {

    {
      // <PLEAC>

      // ^^PLEAC^^_6.16
      // -----------------------------
      // TODO perl -> $/ = ''; # paragrep mode
      // TODO perl -> while (<>) {
      // TODO perl -> while ( m{
      // TODO perl -> \b # start at a word boundary (begin letters)
      // TODO perl -> (\S+) # find chunk of non-whitespace
      // TODO perl -> \b # until another word boundary (end letters)
      // TODO perl -> (
      // TODO perl -> \s+ # separated by some whitespace
      // TODO perl -> \1 # and that very same chunk again
      // TODO perl -> \b # until another word boundary
      // TODO perl -> ) + # one or more sets of those
      // TODO perl -> }xig
      // TODO perl -> )
      // TODO perl -> {
      // TODO perl -> print "dup word '$1' at paragraph $.\n";
      // TODO perl -> }
      // TODO perl -> }
      // </PLEAC>
    }

    {
      // <PLEAC>
      // -----------------------------
      // TODO perl -> This is a test
      // TODO perl -> test of the duplicate word finder.
      // </PLEAC>
    }

    {
      // <PLEAC>
      // -----------------------------
      // TODO perl -> $a = 'nobody';
      // TODO perl -> $b = 'bodysnatcher';
      // TODO perl -> if ("$a $b" =~ /^(\w+)(\w+) \2(\w+)$/) {
      // TODO perl -> print "$2 overlaps in $1-$2-$3\n";
      // TODO perl -> }
      // TODO perl -> body overlaps in no-body-snatcher
      // </PLEAC>
    }

    {
      // <PLEAC>
      // -----------------------------
      // TODO perl -> /^(\w+?)(\w+) \2(\w+)$/,
      // </PLEAC>
    }

    {
      // <PLEAC>
      // -----------------------------
      // ^^INCLUDE^^ include/perl/ch06/prime-pattern
      // </PLEAC>
    }

    {
      // <PLEAC>
      // -----------------------------
      // solve for 12x + 15y + 16z = 281, maximizing x
      // TODO perl -> if (($X, $Y, $Z) =
      // TODO perl -> (('o' x 281) =~ /^(o*)\1{11}(o*)\2{14}(o*)\3{15}$/))
      // TODO perl -> {
      // TODO perl -> ($x, $y, $z) = (length($X), length($Y), length($Z));
      // TODO perl -> print "One solution is: x=$x; y=$y; z=$z.\n";
      // TODO perl -> } else {
      // TODO perl -> print "No solution.\n";
      // TODO perl -> }
      // One solution is: x=17; y=3; z=2.
      // </PLEAC>
    }

    {
      // <PLEAC>
      // -----------------------------
      // TODO perl -> ('o' x 281) =~ /^(o+)\1{11}(o+)\2{14}(o+)\3{15}$/;
      // One solution is: x=17; y=3; z=2
      // TODO perl ->
      // TODO perl -> ('o' x 281) =~ /^(o*?)\1{11}(o*)\2{14}(o*)\3{15}$/;
      // One solution is: x=0; y=7; z=11.
      // TODO perl ->
      // TODO perl -> ('o' x 281) =~ /^(o+?)\1{11}(o*)\2{14}(o*)\3{15}$/;
      // One solution is: x=1; y=3; z=14.
      // </PLEAC>
    }

  }

  public static void _17 () {

    {
      // <PLEAC>

      // ^^PLEAC^^_6.17
      // -----------------------------
      // TODO perl -> chomp($pattern = <CONFIG_FH>);
      // TODO perl -> if ( $data =~ /$pattern/ ) { ..... }
      // </PLEAC>
    }

    {
      // <PLEAC>
      // -----------------------------
      // TODO perl -> /ALPHA|BETA/;
      // </PLEAC>
    }

    {
      // <PLEAC>
      // -----------------------------
      // TODO perl -> /^(?=.*ALPHA)(?=.*BETA)/s;
      // </PLEAC>
    }

    {
      // <PLEAC>
      // -----------------------------
      // TODO perl -> /ALPHA.*BETA|BETA.*ALPHA/s;
      // </PLEAC>
    }

    {
      // <PLEAC>
      // -----------------------------
      // TODO perl -> /^(?:(?!PAT).)*$/s;
      // </PLEAC>
    }

    {
      // <PLEAC>
      // -----------------------------
      // TODO perl -> /(?=^(?:(?!BAD).)*$)GOOD/s;
      // </PLEAC>
    }

    {
      // <PLEAC>
      // -----------------------------
      // TODO perl -> if (!($string =~ /pattern/)) { something() } # ugly
      // TODO perl -> if ( $string !~ /pattern/) { something() } # preferred
      // </PLEAC>
    }

    {
      // <PLEAC>
      // -----------------------------
      // TODO perl -> if ($string =~ /pat1/ && $string =~ /pat2/ ) {
      // TODO perl -> something
      // TODO perl -> () }
      // </PLEAC>
    }

    {
      // <PLEAC>
      // -----------------------------
      // TODO perl -> if ($string =~ /pat1/ || $string =~ /pat2/ ) {
      // TODO perl -> something
      // TODO perl -> () }
      // </PLEAC>
    }

    {
      // <PLEAC>
      // -----------------------------
      // ^^INCLUDE^^ include/perl/ch06/minigrep
      // </PLEAC>
    }

    {
      // <PLEAC>
      // -----------------------------
      // TODO perl -> "labelled" =~ /^(?=.*bell)(?=.*lab)/s
      // </PLEAC>
    }

    {
      // <PLEAC>
      // -----------------------------
      // TODO perl -> $string =~ /bell/ && $string =~ /lab/
      // </PLEAC>
    }

    {
      // <PLEAC>
      // -----------------------------
      // TODO perl -> if ($murray_hill =~ m{
      // TODO perl -> ^ # start of string
      // TODO perl -> (?= # zero-width lookahead
      // TODO perl -> .* # any amount of intervening stuff
      // TODO perl -> bell # the desired bell string
      // TODO perl -> ) # rewind, since we were only looking
      // TODO perl -> (?= # and do the same thing
      // TODO perl -> .* # any amount of intervening stuff
      // TODO perl -> lab # and the lab part
      // TODO perl -> )
      // TODO perl -> }sx ) # /s means . can match newline
      // TODO perl -> {
      // TODO perl -> print "Looks like Bell Labs might be in Murray Hill!\n";
      // TODO perl -> }
      // </PLEAC>
    }

    {
      // <PLEAC>
      // -----------------------------
      // TODO perl -> "labelled" =~ /(?:^.*bell.*lab)|(?:^.*lab.*bell)/
      // </PLEAC>
    }

    {
      // <PLEAC>
      // -----------------------------
      // TODO perl -> $brand = "labelled";
      // TODO perl -> if ($brand =~ m{
      // TODO perl -> (?: # non-capturing grouper
      // TODO perl -> ^ .*? # any amount of stuff at the front
      // TODO perl -> bell # look for a bell
      // TODO perl -> .*? # followed by any amount of anything
      // TODO perl -> lab # look for a lab
      // TODO perl -> ) # end grouper
      // TODO perl -> | # otherwise, try the other direction
      // TODO perl -> (?: # non-capturing grouper
      // TODO perl -> ^ .*? # any amount of stuff at the front
      // TODO perl -> lab # look for a lab
      // TODO perl -> .*? # followed by any amount of anything
      // TODO perl -> bell # followed by a bell
      // TODO perl -> ) # end grouper
      // TODO perl -> }sx ) # /s means . can match newline
      // TODO perl -> {
      // TODO perl -> print "Our brand has bell and lab separate.\n";
      // TODO perl -> }
      // </PLEAC>
    }

    {
      // <PLEAC>
      // -----------------------------
      // TODO perl -> $map =~ /^(?:(?!waldo).)*$/s
      // </PLEAC>
    }

    {
      // <PLEAC>
      // -----------------------------
      // TODO perl -> if ($map =~ m{
      // TODO perl -> ^ # start of string
      // TODO perl -> (?: # non-capturing grouper
      // TODO perl -> (?! # look ahead negation
      // TODO perl -> waldo # is he ahead of us now?
      // TODO perl -> ) # is so, the negation failed
      // TODO perl -> . # any character (cuzza /s)
      // TODO perl -> ) * # repeat that grouping 0 or more
      // TODO perl -> $ # through the end of the string
      // TODO perl -> }sx ) # /s means . can match newline
      // TODO perl -> {
      // TODO perl -> print "There's no waldo here!\n";
      // TODO perl -> }
      // </PLEAC>
    }

    {
      // <PLEAC>
      // -----------------------------
      // TODO perl -> 7:15am up 206 days, 13:30, 4 users, load average: 1.04, 1.07, 1.04
      // TODO perl ->
      // TODO perl -> USER TTY FROM LOGIN@ IDLE JCPU PCPU WHAT
      // TODO perl ->
      // TODO perl -> tchrist tty1 5:16pm 36days 24:43 0.03s xinit
      // TODO perl ->
      // TODO perl -> tchrist tty2 5:19pm 6days 0.43s 0.43s -tcsh
      // TODO perl ->
      // TODO perl -> tchrist ttyp0 chthon 7:58am 3days 23.44s 0.44s -tcsh
      // TODO perl ->
      // TODO perl -> gnat ttyS4 coprolith 2:01pm 13:36m 0.30s 0.30s -tcsh
      // </PLEAC>
    }

    {
      // <PLEAC>
      // -----------------------------
      // % w | minigrep '^(?!.*ttyp).*tchrist'
      // </PLEAC>
    }

    {
      // <PLEAC>
      // -----------------------------
      // TODO perl -> m{
      // TODO perl -> ^ # anchored to the start
      // TODO perl -> (?! # zero-width look-ahead assertion
      // TODO perl -> .* # any amount of anything (faster than .*?)
      // TODO perl -> ttyp # the string you don't want to find
      // TODO perl -> ) # end look-ahead negation; rewind to start
      // TODO perl -> .* # any amount of anything (faster than .*?)
      // TODO perl -> tchrist # now try to find Tom
      // TODO perl -> }x
      // </PLEAC>
    }

    {
      // <PLEAC>
      // -----------------------------
      // % w | grep tchrist | grep -v ttyp
      // </PLEAC>
    }

    {
      // <PLEAC>
      // -----------------------------
      // % grep -i 'pattern' files
      // % minigrep '(?i)pattern' files
      // </PLEAC>
    }

  }

  public static void _18 () {

    {
      // <PLEAC>

      // ^^PLEAC^^_6.18
      // -----------------------------
      // TODO perl -> my $eucjp = q{ # EUC-JP encoding subcomponents:
      // TODO perl -> [\x00-\x7F] # ASCII/JIS-Roman (one-byte/character)
      // TODO perl -> | \x8E[\xA0-\xDF] # half-width katakana (two bytes/char)
      // TODO perl -> | \x8F[\xA1-\xFE][\xA1-\xFE] # JIS X 0212-1990 (three bytes/char)
      // TODO perl -> | [\xA1-\xFE][\xA1-\xFE] # JIS X 0208:1997 (two bytes/char)
      // TODO perl -> };
      // </PLEAC>
    }

    {
      // <PLEAC>
      // -----------------------------
      // TODO perl -> /^ (?: $eucjp )*? \xC5\xEC\xB5\xFE/ox # Trying to find Tokyo
      // </PLEAC>
    }

    {
      // <PLEAC>
      // -----------------------------
      // TODO perl -> /^ ( (?:eucjp)*? ) $Tokyo/$1$Osaka/ox
      // </PLEAC>
    }

    {
      // <PLEAC>
      // -----------------------------
      // TODO perl -> /\G ( (?:eucjp)*? ) $Tokyo/$1$Osaka/gox
      // </PLEAC>
    }

    {
      // <PLEAC>
      // -----------------------------
      // TODO perl -> @chars = /$eucjp/gox; # One character per list element
      // </PLEAC>
    }

    {
      // <PLEAC>
      // -----------------------------
      // TODO perl -> while (<>) {
      // TODO perl -> my @chars = /$eucjp/gox; # One character per list element
      // TODO perl -> for my $char (@chars) {
      // TODO perl -> if (length($char) == 1) {
      // TODO perl -> # Do something interesting with this one-byte character
      // TODO perl -> } else {
      // TODO perl -> # Do something interesting with this multiple-byte character
      // TODO perl -> }
      // TODO perl -> }
      // TODO perl -> my $line = join("",@chars); # Glue list back together
      // TODO perl -> print $line;
      // TODO perl -> }
      // </PLEAC>
    }

    {
      // <PLEAC>
      // -----------------------------
      // TODO perl -> $is_eucjp = m/^(?:$eucjp)*$/xo;
      // </PLEAC>
    }

    {
      // <PLEAC>
      // -----------------------------
      // TODO perl -> $is_eucjp = m/^(?:$eucjp)*$/xo;
      // TODO perl -> $is_sjis = m/^(?:$sjis)*$/xo;
      // </PLEAC>
    }

    {
      // <PLEAC>
      // -----------------------------
      // TODO perl -> while (<>) {
      // TODO perl -> my @chars = /$eucjp/gox; # One character per list element
      // TODO perl -> for my $euc (@chars) {
      // TODO perl -> my $uni = $euc2uni{$char};
      // TODO perl -> if (defined $uni) {
      // TODO perl -> $euc = $uni;
      // TODO perl -> } else {
      // TODO perl -> ## deal with unknown EUC->Unicode mapping here.
      // TODO perl -> }
      // TODO perl -> }
      // TODO perl -> my $line = join("",@chars);
      // TODO perl -> print $line;
      // TODO perl -> }
      // </PLEAC>
    }

  }

  public static void _19 () {

    {
      // <PLEAC>

      // ^^PLEAC^^_6.19
      // -----------------------------
      // TODO perl -> 1 while $addr =~ s/\([^()]*\)//g;
      // </PLEAC>
    }

    {
      // <PLEAC>
      // -----------------------------
      // TODO perl -> Dear someuser@host.com,
      // TODO perl ->
      // TODO perl -> Please confirm the mail address you gave us Wed May 6 09:38:41
      // TODO perl -> MDT 1998 by replying to this message. Include the string
      // TODO perl -> "Rumpelstiltskin" in that reply, but spelled in reverse; that is,
      // TODO perl -> start with "Nik...". Once this is done, your confirmed address will
      // TODO perl -> be entered into our records.
      // </PLEAC>
    }

  }

  public static void _20 () {

    {
      // <PLEAC>

      // ^^PLEAC^^_6.20
      // -----------------------------
      // TODO perl -> chomp($answer = <>);
      // TODO perl -> if ("SEND" =~ /^\Q$answer/i) { print "Action is send\n" }
      // TODO perl -> elsif ("STOP" =~ /^\Q$answer/i) { print "Action is stop\n" }
      // TODO perl -> elsif ("ABORT" =~ /^\Q$answer/i) { print "Action is abort\n" }
      // TODO perl -> elsif ("LIST" =~ /^\Q$answer/i) { print "Action is list\n" }
      // TODO perl -> elsif ("EDIT" =~ /^\Q$answer/i) { print "Action is edit\n" }
      // </PLEAC>
    }

    {
      // <PLEAC>
      // -----------------------------
      // TODO perl -> use Text::Abbrev;
      // TODO perl -> $href = abbrev qw(send abort list edit);
      // TODO perl -> for (print "Action: "; <>; print "Action: ") {
      // TODO perl -> chomp;
      // TODO perl -> my $action = $href->{ lc($_) };
      // TODO perl -> print "Action is $action\n";
      // TODO perl -> }
      // </PLEAC>
    }

    {
      // <PLEAC>
      // -----------------------------
      // TODO perl -> $name = 'send';
      // TODO perl -> &$name();
      // </PLEAC>
    }

    {
      // <PLEAC>
      // -----------------------------
      // assumes that &invoke_editor, &deliver_message,
      // $file and $PAGER are defined somewhere else.
      // TODO perl -> use Text::Abbrev;
      // TODO perl -> my($href, %actions, $errors);
      // TODO perl -> %actions = (
      // TODO perl -> "edit" => \&invoke_editor,
      // TODO perl -> "send" => \&deliver_message,
      // TODO perl -> "list" => sub { system($PAGER, $file) },
      // TODO perl -> "abort" => sub {
      // TODO perl -> print "See ya!\n";
      // TODO perl -> exit;
      // TODO perl -> },
      // TODO perl -> "" => sub {
      // TODO perl -> print "Unknown command: $cmd\n";
      // TODO perl -> $errors++;
      // TODO perl -> },
      // TODO perl -> );
      // TODO perl ->
      // TODO perl -> $href = abbrev(keys %actions);
      // TODO perl ->
      // TODO perl -> local $_;
      // TODO perl -> for (print "Action: "; <>; print "Action: ") {
      // TODO perl -> s/^\s+//; # trim leading white space
      // TODO perl -> s/\s+$//; # trim trailing white space
      // TODO perl -> next unless $_;
      // TODO perl -> $actions->{ $href->{ lc($_) } }->();
      // TODO perl -> }
      // </PLEAC>
    }

    {
      // <PLEAC>
      // -----------------------------
      // TODO perl -> $abbreviation = lc($_);
      // TODO perl -> $expansion = $href->{$abbreviation};
      // TODO perl -> $coderef = $actions->{$expansion};
      // TODO perl -> &$coderef();
      // </PLEAC>
    }

  }

  public static void _21 () {

    {
      // <PLEAC>

      // ^^PLEAC^^_6.21
      // -----------------------------
      // % gunzip -c ~/mail/archive.gz | urlify > archive.urlified
      // </PLEAC>
    }

    {
      // <PLEAC>
      // -----------------------------
      // % urlify ~/mail/*.inbox > ~/allmail.urlified
      // </PLEAC>
    }

    {
      // <PLEAC>
      // -----------------------------
      // ^^INCLUDE^^ include/perl/ch06/urlify
      // </PLEAC>
    }

  }

  public static void _22 () {

    {
      // <PLEAC>

      // ^^PLEAC^^_6.22
      // -----------------------------
      // % tcgrep -ril '^From: .*kate' ~/mail
      // </PLEAC>
    }

    {
      // <PLEAC>
      // -----------------------------
      // ^^INCLUDE^^ include/perl/ch06/tcgrep
      // </PLEAC>
    }

  }

  public static void _23 () {

    {
      // <PLEAC>

      // ^^PLEAC^^_6.23
      // -----------------------------
      // TODO perl -> m/^m*(d?c{0,3}|c[dm])(l?x{0,3}|x[lc])(v?i{0,3}|i[vx])$/i
      // </PLEAC>
    }

    {
      // <PLEAC>
      // -----------------------------
      // TODO perl -> s/(\S+)(\s+)(\S+)/$3$2$1/
      // </PLEAC>
    }

    {
      // <PLEAC>
      // -----------------------------
      // TODO perl -> m/(\w+)\s*=\s*(.*)\s*$/ # keyword is $1, value is $2
      // </PLEAC>
    }

    {
      // <PLEAC>
      // -----------------------------
      // TODO perl -> m/.{80,}/
      // </PLEAC>
    }

    {
      // <PLEAC>
      // -----------------------------
      // TODO perl -> m|(\d+)/(\d+)/(\d+) (\d+):(\d+):(\d+)|
      // </PLEAC>
    }

    {
      // <PLEAC>
      // -----------------------------
      // TODO perl -> s(/usr/bin)(/usr/local/bin)g
      // </PLEAC>
    }

    {
      // <PLEAC>
      // -----------------------------
      // TODO perl -> s/%([0-9A-Fa-f][0-9A-Fa-f])/chr hex $1/ge
      // </PLEAC>
    }

    {
      // <PLEAC>
      // -----------------------------
      // TODO perl -> s{
      // TODO perl -> /\* # Match the opening delimiter
      // TODO perl -> .*? # Match a minimal number of characters
      // TODO perl -> \*/ # Match the closing delimiter
      // TODO perl -> } []gsx;
      // </PLEAC>
    }

    {
      // <PLEAC>
      // -----------------------------
      // TODO perl -> s/^\s+//;
      // TODO perl -> s/\s+$//;
      // </PLEAC>
    }

    {
      // <PLEAC>
      // -----------------------------
      // TODO perl -> s/\\n/\n/g;
      // </PLEAC>
    }

    {
      // <PLEAC>
      // -----------------------------
      // TODO perl -> s/^.*:://
      // </PLEAC>
    }

    {
      // <PLEAC>
      // -----------------------------
      // TODO perl -> m/^([01]?\d\d|2[0-4]\d|25[0-5])\.([01]?\d\d|2[0-4]\d|25[0-5])\.
      // TODO perl -> ([01]?\d\d|2[0-4]\d|25[0-5])\.([01]?\d\d|2[0-4]\d|25[0-5])$/;
      // </PLEAC>
    }

    {
      // <PLEAC>
      // -----------------------------
      // TODO perl -> s(^.*/)()
      // </PLEAC>
    }

    {
      // <PLEAC>
      // -----------------------------
      // TODO perl -> $cols = ( ($ENV{TERMCAP} || " ") =~ m/:co#(\d+):/ ) ? $1 : 80;
      // </PLEAC>
    }

    {
      // <PLEAC>
      // -----------------------------
      // TODO perl -> ($name = " $0 @ARGV") =~ s, /\S+/, ,g;
      // </PLEAC>
    }

    {
      // <PLEAC>
      // -----------------------------
      // TODO perl -> die "This isn't Linux" unless $^O =~ m/linux/i;
      // </PLEAC>
    }

    {
      // <PLEAC>
      // -----------------------------
      // TODO perl -> s/\n\s+/ /g
      // </PLEAC>
    }

    {
      // <PLEAC>
      // -----------------------------
      // TODO perl -> @nums = m/(\d+\.?\d*|\.\d+)/g;
      // </PLEAC>
    }

    {
      // <PLEAC>
      // -----------------------------
      // TODO perl -> @capwords = m/(\b[^\Wa-z0-9_]+\b)/g;
      // </PLEAC>
    }

    {
      // <PLEAC>
      // -----------------------------
      // TODO perl -> @lowords = m/(\b[^\WA-Z0-9_]+\b)/g;
      // </PLEAC>
    }

    {
      // <PLEAC>
      // -----------------------------
      // TODO perl -> @icwords = m/(\b[^\Wa-z0-9_][^\WA-Z0-9_]*\b)/;
      // </PLEAC>
    }

    {
      // <PLEAC>
      // -----------------------------
      // TODO perl -> @links = m/<A[^>]+?HREF\s*=\s*["']?([^'" >]+?)[ '"]?>/sig; #"'
      // </PLEAC>
    }

    {
      // <PLEAC>
      // -----------------------------
      // TODO perl -> ($initial) = m/^\S+\s+(\S)\S*\s+\S/ ? $1 : "";
      // </PLEAC>
    }

    {
      // <PLEAC>
      // -----------------------------
      // TODO perl -> s/"([^"]*)"/``$1''/g   #"
      // </PLEAC>
    }

    {
      // <PLEAC>
      // -----------------------------
      // TODO perl -> { local $/ = "";
      // TODO perl -> while (<>) {
      // TODO perl -> s/\n/ /g;
      // TODO perl -> s/ {3,}/ /g;
      // TODO perl -> push @sentences, m/(\S.*?[!?.])(?= |\Z)/g;
      // TODO perl -> }
      // TODO perl -> }
      // </PLEAC>
    }

    {
      // <PLEAC>
      // -----------------------------
      // TODO perl -> m/(\d{4})-(\d\d)-(\d\d)/ # YYYY in $1, MM in $2, DD in $3
      // </PLEAC>
    }

    {
      // <PLEAC>
      // -----------------------------
      // TODO perl -> m/ ^
      // TODO perl -> (?:
      // TODO perl -> 1 \s (?: \d\d\d \s)? # 1, or 1 and area code
      // TODO perl -> | # ... or ...
      // TODO perl -> \(\d\d\d\) \s # area code with parens
      // TODO perl -> | # ... or ...
      // TODO perl -> (?: \+\d\d?\d? \s)? # optional +country code
      // TODO perl -> \d\d\d ([\s\-]) # and area code
      // TODO perl -> )
      // TODO perl -> \d\d\d (\s|\1) # prefix (and area code separator)
      // TODO perl -> \d\d\d\d # exchange
      // TODO perl -> $
      // TODO perl -> /x
      // </PLEAC>
    }

    {
      // <PLEAC>
      // -----------------------------
      // TODO perl -> m/\boh\s+my\s+gh?o(d(dess(es)?|s?)|odness|sh)\b/i
      // </PLEAC>
    }

    {
      // <PLEAC>
      // -----------------------------
      // TODO perl -> push(@lines, $1)
      // TODO perl -> while ($input =~ s/^([^\012\015]*)(\012\015?|\015\012?)//);
      // </PLEAC>
    }

  }

  public static void main (String[] args) {
    _06._00();
  }

  public static List<String> toList (final Matcher m) {
    final List<String> t = new ArrayList<String>();
    while (m.find()) {
      t.add(m.group(1));
    }

    return t;
  }
}
