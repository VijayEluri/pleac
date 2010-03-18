package org.nicerobot.pleac;

/**
 * @author nicerobot
 * 
 */

  
// ^^PLEAC^^_6.0
//-----------------------------
// TODO match( $string, $pattern );
// TODO subst( $string, $pattern, $replacement );
//-----------------------------
// TODO $meadow =~ m/sheep/;   # True if $meadow contains "sheep"
// TODO $meadow !~ m/sheep/;   # True if $meadow doesn't contain "sheep"
// TODO $meadow =~ s/old/new/; # Replace "old" with "new" in $meadow
//-----------------------------
// Fine bovines demand fine toreadors.
// Muskoxen are a polar ovibovine species.
// Grooviness went out of fashion decades ago.
//-----------------------------
// Ovines are found typically in oviaries.
//-----------------------------
// TODO if ($meadow =~ /\bovines?\b/i) { print "Here be sheep!" }
//-----------------------------
// TODO $string = "good food";
// TODO $string =~ s/o*/e/;
//-----------------------------
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
//-----------------------------
//% echo ababacaca | perl -ne 'print "$&\n" if /(a|ba|b)+(a|ac)+/'
//ababa
//-----------------------------
//% echo ababacaca | 
//    awk 'match($0,/(a|ba|b)+(a|ac)+/) { print substr($0, RSTART, RLENGTH) }'
//ababacaca
//-----------------------------
// TODO while (m/(\d+)/g) {
// TODO     print "Found number $1\n";
// TODO }
//-----------------------------
// TODO @numbers = m/(\d+)/g;
//-----------------------------
// TODO $digits = "123456789";
// TODO @nonlap = $digits =~ /(\d\d\d)/g;
// TODO @yeslap = $digits =~ /(?=(\d\d\d))/g;
// TODO print "Non-overlapping:  @nonlap\n";
// TODO print "Overlapping:      @yeslap\n";
// Non-overlapping:  123 456 789

// Overlapping:      123 234 345 456 567 678 789
//-----------------------------
// TODO $string = "And little lambs eat ivy";
// TODO $string =~ /l[^s]*s/;
// TODO print "($`) ($&) ($')\n";
// (And ) (little lambs) ( eat ivy)
//-----------------------------

// ^^PLEAC^^_6.1
//-----------------------------
// TODO $dst = $src;
// TODO $dst =~ s/this/that/;
//-----------------------------
// TODO ($dst = $src) =~ s/this/that/;
//-----------------------------
// strip to basename
// TODO ($progname = $0)        =~ s!^.*/!!;

// Make All Words Title-Cased
// TODO ($capword  = $word)     =~ s/(\w+)/\\u\L$1/g;

// /usr/man/man3/foo.1 changes to /usr/man/cat3/foo.1
// TODO ($catpage  = $manpage)  =~ s/man(?=\d)/cat/;
//-----------------------------
// TODO @bindirs = qw( /usr/bin /bin /usr/local/bin );
// TODO for (@libdirs = @bindirs) { s/bin/lib/ }
// TODO print "@libdirs\n";
// /usr/lib /lib /usr/local/lib
//-----------------------------
// TODO ($a =  $b) =~ s/x/y/g;      # copy $b and then change $a
// TODO  $a = ($b  =~ s/x/y/g);     # change $b, count goes in $a
//-----------------------------

// ^^PLEAC^^_6.2
//-----------------------------
// TODO if ($var =~ /^[A-Za-z]+$/) {
// TODO     # it is purely alphabetic
// TODO }
//-----------------------------
// TODO use locale;
// TODO if ($var =~ /^[^\W\d_]+$/) {
// TODO     print "var is purely alphabetic\n";
// TODO }
//-----------------------------
// TODO use locale;
// TODO use POSIX 'locale_h';

// the following locale string might be different on your system
// TODO unless (setlocale(LC_ALL, "fr_CA.ISO8859-1")) {
// TODO     die "couldn't set locale to French Canadian\n";
// TODO }

// TODO while (<DATA>) {
// TODO     chomp;
// TODO     if (/^[^\W\d_]+$/) {
// TODO         print "$_: alphabetic\n";
// TODO     } else {
// TODO         print "$_: line noise\n";
// TODO     }
// TODO }

//__END__
//silly
//façade
//coöperate
//niño
//Renée
//Molière
//hæmoglobin
//naïve
//tschüß
//random!stuff#here
//-----------------------------

// ^^PLEAC^^_6.3
//-----------------------------
///\S+/               # as many non-whitespace bytes as possible
///[A-Za-z'-]+/       # as many letters, apostrophes, and hyphens
//-----------------------------
///\b([A-Za-z]+)\b/            # usually best
///\s([A-Za-z]+)\s/            # fails at ends or w/ punctuation
//-----------------------------

// ^^PLEAC^^_6.4
//-----------------------------
// ^^INCLUDE^^ include/perl/ch06/resname
//-----------------------------
// TODO s/                  # replace
// TODO   \#                #   a pound sign
// TODO   (\w+)             #   the variable name
// TODO   \#                #   another pound sign
// TODO /${$1}/xg;          # with the value of the global variable
//#-----------------------------
// TODO s/                  # replace
// TODO \#                  #   a pound sign
// TODO (\w+)               #   the variable name
// TODO \#                  #   another pound sign
// TODO /'$' . $1/xeeg;     # ' with the value of *any* variable
//-----------------------------

// ^^PLEAC^^_6.5
//-----------------------------
// One fish two fish red fish blue fish
//-----------------------------
// TODO $WANT = 3;
// TODO $count = 0;
// TODO while (/(\w+)\s+fish\b/gi) {
// TODO     if (++$count == $WANT) {
// TODO         print "The third fish is a $1 one.\n";
// TODO         # Warning: don't `last' out of this loop
// TODO     }
// TODO }
// The third fish is a red one.
//-----------------------------
// TODO /(?:\w+\s+fish\s+){2}(\w+)\s+fish/i;
//-----------------------------
// simple way with while loop
// TODO $count = 0;
// TODO while ($string =~ /PAT/g) {
// TODO     $count++;               # or whatever you'd like to do here
// TODO }

// same thing with trailing while
// TODO $count = 0;
// TODO $count++ while $string =~ /PAT/g;

// or with for loop
// TODO for ($count = 0; $string =~ /PAT/g; $count++) { }
// TODO     
// Similar, but this time count overlapping matches
// TODO $count++ while $string =~ /(?=PAT)/g;
//-----------------------------
// TODO $pond  = 'One fish two fish red fish blue fish';

// using a temporary
// TODO @colors = ($pond =~ /(\w+)\s+fish\b/gi);      # get all matches
// TODO $color  = $colors[2];                         # then the one we want

// or without a temporary array
// TODO $color = ( $pond =~ /(\w+)\s+fish\b/gi )[2];  # just grab element 3

// TODO print "The third fish in the pond is $color.\n";
// The third fish in the pond is red.
//-----------------------------
// TODO $count = 0;
// TODO $_ = 'One fish two fish red fish blue fish';
// TODO @evens = grep { $count++ % 2 == 1 } /(\w+)\s+fish\b/gi;
// TODO print "Even numbered fish are @evens.\n";
// Even numbered fish are two blue.
//-----------------------------
// TODO $count = 0;
// TODO s{
// TODO    \b               # makes next \w more efficient
// TODO    ( \w+ )          # this is what we'll be changing
// TODO    (
// TODO      \s+ fish \b
// TODO    )
// TODO }{
// TODO     if (++$count == 4) {
// TODO         "sushi" . $2;
// TODO     } else {
// TODO          $1   . $2;
// TODO     }
// TODO }gex;
// One fish two fish red fish sushi fish
//-----------------------------
// TODO $pond = 'One fish two fish red fish blue fish swim here.';
// TODO $color = ( $pond =~ /\b(\w+)\s+fish\b/gi )[-1];
// TODO print "Last fish is $color.\n";
// Last fish is blue.
//-----------------------------
// TODO m{
// TODO     A               # find some pattern A
// TODO     (?!             # mustn't be able to find
// TODO         .*          # something
// TODO         A           # and A
// TODO     )
// TODO     $               # through the end of the string
// TODO }x
//-----------------------------
// TODO $pond = 'One fish two fish red fish blue fish swim here.';
// TODO if ($pond =~ m{
// TODO                     \b  (  \w+) \s+ fish \b
// TODO                 (?! .* \b fish \b )
// TODO             }six )
// TODO {
// TODO     print "Last fish is $1.\n";
// TODO } else {
// TODO     print "Failed!\n";
// TODO }
// Last fish is blue.
//-----------------------------

// ^^PLEAC^^_6.6
//-----------------------------
// ^^INCLUDE^^ include/perl/ch06/killtags
//-----------------------------
// ^^INCLUDE^^ include/perl/ch06/headerfy
//-----------------------------
//% perl -00pe 's{\A(Chapter\s+\d+\s*:.*)}{<H1>$1</H1>}gx' datafile
//-----------------------------
// TODO $/ = '';            # paragraph read mode for readline access
// TODO while (<ARGV>) {
// TODO     while (m#^START(.*?)^END#sm) {  # /s makes . span line boundaries
// TODO                                     # /m makes ^ match near newlines
// TODO         print "chunk $. in $ARGV has <<$1>>\n";
// TODO     }
// TODO }
//-----------------------------

// ^^PLEAC^^_6.7
//-----------------------------
// TODO undef $/;
// TODO @chunks = split(/pattern/, <FILEHANDLE>);
//-----------------------------
// .Ch, .Se and .Ss divide chunks of STDIN
// TODO {
// TODO     local $/ = undef;
// TODO     @chunks = split(/^\.(Ch|Se|Ss)$/m, <>);
// TODO }
// TODO print "I read ", scalar(@chunks), " chunks.\n";
//-----------------------------

// ^^PLEAC^^_6.8
//-----------------------------
// TODO while (<>) {
// TODO     if (/BEGIN PATTERN/ .. /END PATTERN/) {
// TODO         # line falls between BEGIN and END in the
// TODO         # text, inclusive.
// TODO     }
// TODO }

// TODO while (<>) {
// TODO     if ($FIRST_LINE_NUM .. $LAST_LINE_NUM) {
// TODO         # operate only between first and last line, inclusive.
// TODO     }
// TODO }
//-----------------------------
// TODO while (<>) {
// TODO     if (/BEGIN PATTERN/ ... /END PATTERN/) {
// TODO         # line is between BEGIN and END on different lines
// TODO     }
// TODO }

// TODO while (<>) {
// TODO     if ($FIRST_LINE_NUM ... $LAST_LINE_NUM) {
// TODO         # operate only between first and last line, but not same
// TODO     }
// TODO }
//-----------------------------
// command-line to print lines 15 through 17 inclusive (see below)
// TODO perl -ne 'print if 15 .. 17' datafile

// print out all <XMP> .. </XMP> displays from HTML doc
// TODO while (<>) {
// TODO     print if m#<XMP>#i .. m#</XMP>#i;
// TODO }
// TODO     
// same, but as shell command
// perl -ne 'print if m#<XMP>#i .. m#</XMP>#i' document.html
//-----------------------------
// perl -ne 'BEGIN { $top=3; $bottom=5 }  print if $top .. $bottom' /etc/passwd        # previous command FAILS
// perl -ne 'BEGIN { $top=3; $bottom=5 } \
//     print if $. == $top .. $. ==     $bottom' /etc/passwd    # works
// perl -ne 'print if 3 .. 5' /etc/passwd   # also works
//-----------------------------
// TODO print if /begin/ .. /end/;
// TODO print if /begin/ ... /end/;
//-----------------------------
// TODO while (<>) {
// TODO     $in_header =   1  .. /^$/;
// TODO     $in_body   = /^$/ .. eof();
// TODO }
//-----------------------------
// TODO %seen = ();
// TODO while (<>) {
// TODO     next unless /^From:?\s/i .. /^$/;
// TODO     while (/([^<>(),;\s]+\@[^<>(),;\s]+)/g) {
// TODO         print "$1\n" unless $seen{$1}++;
// TODO     }
// TODO }
//-----------------------------

// ^^PLEAC^^_6.9
//-----------------------------
// TODO sub glob2pat {
// TODO     my $globstr = shift;
// TODO     my %patmap = (
// TODO    '*' => '.*',
// TODO    '?' => '.',
// TODO    '[' => '[',
// TODO    ']' => ']',
// TODO     );
// TODO     $globstr =~ s{(.)} { $patmap{$1} || "\Q$1" }ge;
// TODO     return '^' . $globstr . '$'; #'
// TODO }
//-----------------------------

// ^^PLEAC^^_6.10
//-----------------------------
// TODO while ($line = <>) {
// TODO     if ($line =~ /$pattern/o) {
// TODO         # do something
// TODO     }
// TODO }
//-----------------------------
// ^^INCLUDE^^ include/perl/ch06/popgrep1
//-----------------------------
// ^^INCLUDE^^ include/perl/ch06/popgrep2
//-----------------------------
// TODO while (defined($line = <>)) {
// TODO      if ($line =~ /\bCO\b/) { print $line; next; }
// TODO      if ($line =~ /\bON\b/) { print $line; next; }
// TODO      if ($line =~ /\bMI\b/) { print $line; next; }
// TODO      if ($line =~ /\bWI\b/) { print $line; next; }
// TODO      if ($line =~ /\bMN\b/) { print $line; next; }
// TODO }
//-----------------------------
// ^^INCLUDE^^ include/perl/ch06/popgrep3
//-----------------------------
// TODO sub {
// TODO       m/\b$popstates[0]\b/o || m/\b$popstates[1]\b/o ||
// TODO       m/\b$popstates[2]\b/o || m/\b$popstates[3]\b/o ||
// TODO       m/\b$popstates[4]\b/o
// TODO   }
//-----------------------------
// ^^INCLUDE^^ include/perl/ch06/grepauth
//-----------------------------
// ^^INCLUDE^^ include/perl/ch06/popgrep4
//-----------------------------

// ^^PLEAC^^_6.11
//-----------------------------
// TODO do {
// TODO     print "Pattern? ";
// TODO     chomp($pat = <>);
// TODO     eval { "" =~ /$pat/ };
// TODO     warn "INVALID PATTERN $@" if $@;
// TODO } while $@;
//-----------------------------
// TODO sub is_valid_pattern {
// TODO     my $pat = shift;
// TODO     return eval { "" =~ /$pat/; 1 } || 0;
// TODO }
//-----------------------------
// ^^INCLUDE^^ include/perl/ch06/paragrep
//-----------------------------
// TODO $pat = "You lose @{[ system('rm -rf *')]} big here";
//-----------------------------
// TODO $safe_pat = quotemeta($pat);
// TODO something() if /$safe_pat/;
//-----------------------------
// TODO something() if /\Q$pat/;
//-----------------------------

// ^^PLEAC^^_6.12
//-----------------------------
// TODO use locale;
//-----------------------------
// ^^INCLUDE^^ include/perl/ch06/localeg
// TODO English names: Andreas K Nig

// TODO German names:  Andreas König
//-----------------------------

// ^^PLEAC^^_6.13
//-----------------------------
// TODO use String::Approx qw(amatch);

// TODO if (amatch("PATTERN", @list)) {
// TODO     # matched
// TODO }

// TODO @matches = amatch("PATTERN", @list);
//-----------------------------
// TODO use String::Approx qw(amatch);
// TODO open(DICT, "/usr/dict/words")               or die "Can't open dict: $!";
// TODO while(<DICT>) {
// TODO     print if amatch("balast");
// TODO }

// TODO ballast

// TODO balustrade

// TODO blast

// TODO blastula

// TODO sandblast
//-----------------------------

// ^^PLEAC^^_6.14
//-----------------------------
// TODO while (/(\d+)/g) {
// TODO     print "Found $1\n";
// TODO }
//-----------------------------
// TODO $n = "   49 here";
// TODO $n =~ s/\G /0/g;
// TODO print $n;
// TODO 00049 here
//-----------------------------
// TODO while (/\G,?(\d+)/g) {
// TODO     print "Found number $1\n";
// TODO }
//-----------------------------
// TODO $_ = "The year 1752 lost 10 days on the 3rd of September";

// TODO while (/(\d+)/gc) {
// TODO     print "Found number $1\n";
// TODO }

// TODO if (/\G(\S+)/g) {
// TODO     print "Found $1 after the last number.\n";
// TODO }

//Found number 1752
//
//Found number 10
//
//Found number 3
//
//Found rd after the last number.
//-----------------------------
// TODO print "The position in \$a is ", pos($a);
// TODO pos($a) = 30;
// TODO print "The position in \$_ is ", pos;
// TODO pos = 30;
//-----------------------------

// ^^PLEAC^^_6.15
//-----------------------------
// greedy pattern
// TODO s/<.*>//gs;                     # try to remove tags, very badly

// non-greedy pattern
// TODO s/<.*?>//gs;                    # try to remove tags, still rather badly
//-----------------------------
//<b><i>this</i> and <i>that</i> are important</b> Oh, <b><i>me too!</i></b>
//-----------------------------
// TODO m{ <b><i>(.*?)</i></b> }sx
//-----------------------------
// TODO /BEGIN((?:(?!BEGIN).)*)END/
//-----------------------------
// TODO m{ <b><i>(  (?: (?!</b>|</i>). )*  ) </i></b> }sx
//-----------------------------
// TODO m{ <b><i>(  (?: (?!</[ib]>). )*  ) </i></b> }sx
//-----------------------------
// TODO m{
// TODO     <b><i> 
// TODO     [^<]*  # stuff not possibly bad, and not possibly the end.
// TODO     (?:
// TODO  # at this point, we can have '<' if not part of something bad
// TODO      (?!  </?[ib]>  )   # what we can't have
// TODO      <                  # okay, so match the '<'
// TODO      [^<]*              # and continue with more safe stuff
// TODO     ) *
// TODO     </i></b>
// TODO  }sx
//-----------------------------

// ^^PLEAC^^_6.16
//-----------------------------
// TODO $/ = '';                      # paragrep mode
// TODO while (<>) {
// TODO     while ( m{
// TODO                 \b            # start at a word boundary (begin letters)
// TODO                 (\S+)         # find chunk of non-whitespace
// TODO                 \b            # until another word boundary (end letters)
// TODO                 (
// TODO                     \s+       # separated by some whitespace
// TODO                     \1        # and that very same chunk again
// TODO                     \b        # until another word boundary
// TODO                 ) +           # one or more sets of those
// TODO              }xig
// TODO          )
// TODO     {
// TODO         print "dup word '$1' at paragraph $.\n";
// TODO     }
// TODO }
//-----------------------------
// TODO This is a test
// TODO test of the duplicate word finder.
//-----------------------------
// TODO $a = 'nobody';
// TODO $b = 'bodysnatcher';
// TODO if ("$a $b" =~ /^(\w+)(\w+) \2(\w+)$/) {
// TODO     print "$2 overlaps in $1-$2-$3\n";
// TODO }
// TODO body overlaps in no-body-snatcher
//-----------------------------
// TODO ^(\w+?)(\w+) \2(\w+)$/, 
//-----------------------------
// ^^INCLUDE^^ include/perl/ch06/prime-pattern
//-----------------------------
// solve for 12x + 15y + 16z = 281, maximizing x
// TODO if (($X, $Y, $Z)  =
// TODO    (('o' x 281)  =~ /^(o*)\1{11}(o*)\2{14}(o*)\3{15}$/))
// TODO {
// TODO     ($x, $y, $z) = (length($X), length($Y), length($Z));
// TODO     print "One solution is: x=$x; y=$y; z=$z.\n";
// TODO } else {
// TODO     print "No solution.\n";
// TODO }
//One solution is: x=17; y=3; z=2.
//-----------------------------
// TODO ('o' x 281)  =~ /^(o+)\1{11}(o+)\2{14}(o+)\3{15}$/;
//One solution is: x=17; y=3; z=2

// TODO ('o' x 281)  =~ /^(o*?)\1{11}(o*)\2{14}(o*)\3{15}$/;
//One solution is: x=0; y=7; z=11.

// TODO ('o' x 281)  =~ /^(o+?)\1{11}(o*)\2{14}(o*)\3{15}$/;
//One solution is: x=1; y=3; z=14.
//-----------------------------

// ^^PLEAC^^_6.17
//-----------------------------
// TODO chomp($pattern = <CONFIG_FH>);
// TODO if ( $data =~ /$pattern/ ) { ..... }
//-----------------------------
// TODO /ALPHA|BETA/;
//-----------------------------
// TODO /^(?=.*ALPHA)(?=.*BETA)/s;
//-----------------------------
// TODO /ALPHA.*BETA|BETA.*ALPHA/s;
//-----------------------------
// TODO /^(?:(?!PAT).)*$/s;
//-----------------------------
// TODO /(?=^(?:(?!BAD).)*$)GOOD/s;
//-----------------------------
// TODO if (!($string =~ /pattern/)) { something() }   # ugly
// TODO if (  $string !~ /pattern/)  { something() }   # preferred
//-----------------------------
// TODO if ($string =~ /pat1/ && $string =~ /pat2/ ) { 
// TODO something
// TODO () }
//-----------------------------
// TODO if ($string =~ /pat1/ || $string =~ /pat2/ ) { 
// TODO something
// TODO () }
//-----------------------------
// ^^INCLUDE^^ include/perl/ch06/minigrep
//-----------------------------
// TODO  "labelled" =~ /^(?=.*bell)(?=.*lab)/s
//-----------------------------
// TODO $string =~ /bell/ && $string =~ /lab/
//-----------------------------
// TODO  if ($murray_hill =~ m{
// TODO              ^              # start of string
// TODO             (?=             # zero-width lookahead
// TODO                 .*          # any amount of intervening stuff
// TODO                 bell        # the desired bell string
// TODO             )               # rewind, since we were only looking
// TODO             (?=             # and do the same thing
// TODO                 .*          # any amount of intervening stuff
// TODO                 lab         # and the lab part
// TODO             )
// TODO          }sx )              # /s means . can match newline
// TODO {
// TODO     print "Looks like Bell Labs might be in Murray Hill!\n";
// TODO }
//-----------------------------
// TODO "labelled" =~ /(?:^.*bell.*lab)|(?:^.*lab.*bell)/
//-----------------------------
// TODO $brand = "labelled";
// TODO if ($brand =~ m{
// TODO         (?:                 # non-capturing grouper
// TODO             ^ .*?           # any amount of stuff at the front
// TODO               bell          # look for a bell
// TODO               .*?           # followed by any amount of anything
// TODO               lab           # look for a lab
// TODO           )                 # end grouper
// TODO     |                       # otherwise, try the other direction
// TODO         (?:                 # non-capturing grouper
// TODO             ^ .*?           # any amount of stuff at the front
// TODO               lab           # look for a lab
// TODO               .*?           # followed by any amount of anything
// TODO               bell          # followed by a bell
// TODO           )                 # end grouper
// TODO     }sx )                   # /s means . can match newline
// TODO {
// TODO     print "Our brand has bell and lab separate.\n";
// TODO }
//-----------------------------
// TODO $map =~ /^(?:(?!waldo).)*$/s
//-----------------------------
// TODO if ($map =~ m{
// TODO         ^                   # start of string
// TODO         (?:                 # non-capturing grouper
// TODO             (?!             # look ahead negation
// TODO                 waldo       # is he ahead of us now?
// TODO             )               # is so, the negation failed
// TODO             .               # any character (cuzza /s)
// TODO         ) *                 # repeat that grouping 0 or more
// TODO         $                   # through the end of the string
// TODO     }sx )                   # /s means . can match newline
// TODO {
// TODO     print "There's no waldo here!\n";
// TODO }
//-----------------------------
// TODO  7:15am  up 206 days, 13:30,  4 users,  load average: 1.04, 1.07, 1.04

// TODO USER     TTY      FROM              LOGIN@  IDLE   JCPU   PCPU  WHAT

// TODO tchrist  tty1                       5:16pm 36days 24:43   0.03s  xinit

// TODO tchrist  tty2                       5:19pm  6days  0.43s  0.43s  -tcsh

// TODO tchrist  ttyp0    chthon            7:58am  3days 23.44s  0.44s  -tcsh

// TODO gnat     ttyS4    coprolith         2:01pm 13:36m  0.30s  0.30s  -tcsh
//-----------------------------
//% w | minigrep '^(?!.*ttyp).*tchrist'
//-----------------------------
// TODO m{
// TODO     ^                       # anchored to the start
// TODO     (?!                     # zero-width look-ahead assertion
// TODO         .*                  # any amount of anything (faster than .*?)
// TODO         ttyp                # the string you don't want to find
// TODO     )                       # end look-ahead negation; rewind to start
// TODO     .*                      # any amount of anything (faster than .*?)
// TODO     tchrist                 # now try to find Tom
// TODO }x
//-----------------------------
//% w | grep tchrist | grep -v ttyp
//-----------------------------
//% grep -i 'pattern' files
//% minigrep '(?i)pattern' files
//-----------------------------

// ^^PLEAC^^_6.18
//-----------------------------
// TODO my $eucjp = q{                 # EUC-JP encoding subcomponents:
// TODO     [\x00-\x7F]                # ASCII/JIS-Roman (one-byte/character)
// TODO   | \x8E[\xA0-\xDF]            # half-width katakana (two bytes/char)
// TODO   | \x8F[\xA1-\xFE][\xA1-\xFE] # JIS X 0212-1990 (three bytes/char)
// TODO   | [\xA1-\xFE][\xA1-\xFE]     # JIS X 0208:1997 (two bytes/char)
// TODO };
//-----------------------------
// TODO /^ (?: $eucjp )*?  \xC5\xEC\xB5\xFE/ox # Trying to find Tokyo
//-----------------------------
// TODO /^ (  (?:eucjp)*? ) $Tokyo/$1$Osaka/ox
//-----------------------------
// TODO /\G (  (?:eucjp)*? ) $Tokyo/$1$Osaka/gox
//-----------------------------
// TODO @chars = /$eucjp/gox; # One character per list element
//-----------------------------
// TODO while (<>) {
// TODO   my @chars = /$eucjp/gox; # One character per list element
// TODO   for my $char (@chars) {
// TODO     if (length($char) == 1) {
// TODO       # Do something interesting with this one-byte character
// TODO     } else {
// TODO       # Do something interesting with this multiple-byte character
// TODO     }
// TODO   }
// TODO   my $line = join("",@chars); # Glue list back together
// TODO   print $line;
// TODO }
//-----------------------------
// TODO $is_eucjp = m/^(?:$eucjp)*$/xo;
//-----------------------------
// TODO $is_eucjp = m/^(?:$eucjp)*$/xo;
// TODO $is_sjis  = m/^(?:$sjis)*$/xo;
//-----------------------------
// TODO while (<>) {
// TODO   my @chars = /$eucjp/gox; # One character per list element
// TODO   for my $euc (@chars) {
// TODO     my $uni = $euc2uni{$char};
// TODO     if (defined $uni) {
// TODO         $euc = $uni;
// TODO     } else {
// TODO         ## deal with unknown EUC->Unicode mapping here.
// TODO     }
// TODO   }
// TODO   my $line = join("",@chars);
// TODO   print $line;
// TODO }
//-----------------------------

// ^^PLEAC^^_6.19
//-----------------------------
// TODO 1 while $addr =~ s/\([^()]*\)//g;
//-----------------------------
// TODO Dear someuser@host.com,

// TODO Please confirm the mail address you gave us Wed May  6 09:38:41
// TODO MDT 1998 by replying to this message.  Include the string
// TODO "Rumpelstiltskin" in that reply, but spelled in reverse; that is,
// TODO start with "Nik...".  Once this is done, your confirmed address will
// TODO be entered into our records.
//-----------------------------

// ^^PLEAC^^_6.20
//-----------------------------
// TODO chomp($answer = <>);
// TODO if    ("SEND"  =~ /^\Q$answer/i) { print "Action is send\n"  }
// TODO elsif ("STOP"  =~ /^\Q$answer/i) { print "Action is stop\n"  }
// TODO elsif ("ABORT" =~ /^\Q$answer/i) { print "Action is abort\n" }
// TODO elsif ("LIST"  =~ /^\Q$answer/i) { print "Action is list\n"  }
// TODO elsif ("EDIT"  =~ /^\Q$answer/i) { print "Action is edit\n"  }
//-----------------------------
// TODO use Text::Abbrev;
// TODO $href = abbrev qw(send abort list edit);
// TODO for (print "Action: "; <>; print "Action: ") {
// TODO     chomp;
// TODO     my $action = $href->{ lc($_) };
// TODO     print "Action is $action\n";
// TODO }
//-----------------------------
// TODO $name = 'send';
// TODO &$name();
//-----------------------------
// assumes that &invoke_editor, &deliver_message,
// $file and $PAGER are defined somewhere else.
// TODO use Text::Abbrev;
// TODO my($href, %actions, $errors);
// TODO %actions = (
// TODO     "edit"  => \&invoke_editor,
// TODO     "send"  => \&deliver_message,
// TODO     "list"  => sub { system($PAGER, $file) },
// TODO     "abort" => sub {
// TODO                     print "See ya!\n";
// TODO                     exit;
// TODO                },
// TODO     ""      => sub {
// TODO                     print "Unknown command: $cmd\n";
// TODO                     $errors++;
// TODO                },
// TODO );

// TODO $href = abbrev(keys %actions);

// TODO local $_;
// TODO for (print "Action: "; <>; print "Action: ") {
// TODO     s/^\s+//;       # trim leading  white space
// TODO     s/\s+$//;       # trim trailing white space
// TODO     next unless $_;
// TODO     $actions->{ $href->{ lc($_) } }->();
// TODO }
//-----------------------------
// TODO $abbreviation = lc($_);
// TODO $expansion    = $href->{$abbreviation};
// TODO $coderef      = $actions->{$expansion};
// TODO &$coderef();
//-----------------------------

// ^^PLEAC^^_6.21
//-----------------------------
//% gunzip -c ~/mail/archive.gz | urlify > archive.urlified
//-----------------------------
//% urlify ~/mail/*.inbox > ~/allmail.urlified
//-----------------------------
// ^^INCLUDE^^ include/perl/ch06/urlify
//-----------------------------

// ^^PLEAC^^_6.22
//-----------------------------
//% tcgrep -ril '^From: .*kate' ~/mail
//-----------------------------
// ^^INCLUDE^^ include/perl/ch06/tcgrep
//-----------------------------

// ^^PLEAC^^_6.23
//-----------------------------
// TODO m/^m*(d?c{0,3}|c[dm])(l?x{0,3}|x[lc])(v?i{0,3}|i[vx])$/i
//-----------------------------
// TODO s/(\S+)(\s+)(\S+)/$3$2$1/
//-----------------------------
// TODO m/(\w+)\s*=\s*(.*)\s*$/             # keyword is $1, value is $2
//-----------------------------
// TODO m/.{80,}/
//-----------------------------
// TODO m|(\d+)/(\d+)/(\d+) (\d+):(\d+):(\d+)|
//-----------------------------
// TODO s(/usr/bin)(/usr/local/bin)g
//-----------------------------
// TODO s/%([0-9A-Fa-f][0-9A-Fa-f])/chr hex $1/ge
//-----------------------------
// TODO s{
// TODO     /\*                    # Match the opening delimiter
// TODO     .*?                    # Match a minimal number of characters
// TODO     \*/                    # Match the closing delimiter
// TODO } []gsx;
//-----------------------------
// TODO s/^\s+//;
// TODO s/\s+$//;
//-----------------------------
// TODO s/\\n/\n/g;
//-----------------------------
// TODO s/^.*:://
//-----------------------------
// TODO m/^([01]?\d\d|2[0-4]\d|25[0-5])\.([01]?\d\d|2[0-4]\d|25[0-5])\.
// TODO    ([01]?\d\d|2[0-4]\d|25[0-5])\.([01]?\d\d|2[0-4]\d|25[0-5])$/;
//-----------------------------
// TODO s(^.*/)()
//-----------------------------
// TODO $cols = ( ($ENV{TERMCAP} || " ") =~ m/:co#(\d+):/ ) ? $1 : 80;
//-----------------------------
// TODO ($name = " $0 @ARGV") =~ s, /\S+/, ,g;
//-----------------------------
// TODO die "This isn't Linux" unless $^O =~ m/linux/i;
//-----------------------------
// TODO s/\n\s+/ /g
//-----------------------------
// TODO @nums = m/(\d+\.?\d*|\.\d+)/g;
//-----------------------------
// TODO @capwords = m/(\b[^\Wa-z0-9_]+\b)/g;
//-----------------------------
// TODO @lowords = m/(\b[^\WA-Z0-9_]+\b)/g;
//-----------------------------
// TODO @icwords = m/(\b[^\Wa-z0-9_][^\WA-Z0-9_]*\b)/;
//-----------------------------
// TODO @links = m/<A[^>]+?HREF\s*=\s*["']?([^'" >]+?)[ '"]?>/sig;   #"'
//-----------------------------
// TODO ($initial) = m/^\S+\s+(\S)\S*\s+\S/ ? $1 : "";
//-----------------------------
// TODO s/"([^"]*)"/``$1''/g   #"
//-----------------------------
// TODO { local $/ = "";
// TODO   while (<>) {
// TODO     s/\n/ /g;
// TODO     s/ {3,}/  /g;
// TODO     push @sentences, m/(\S.*?[!?.])(?=  |\Z)/g;
// TODO   }
// TODO }
//-----------------------------
// TODO m/(\d{4})-(\d\d)-(\d\d)/            # YYYY in $1, MM in $2, DD in $3
//-----------------------------
// TODO m/ ^
// TODO       (?:
// TODO        1 \s (?: \d\d\d \s)?            # 1, or 1 and area code
// TODO        |                               # ... or ...
// TODO        \(\d\d\d\) \s                   # area code with parens
// TODO        |                               # ... or ...
// TODO        (?: \+\d\d?\d? \s)?             # optional +country code
// TODO        \d\d\d ([\s\-])                 # and area code
// TODO       )
// TODO       \d\d\d (\s|\1)                   # prefix (and area code separator)
// TODO       \d\d\d\d                         # exchange
// TODO         $
// TODO  /x
//-----------------------------
// TODO m/\boh\s+my\s+gh?o(d(dess(es)?|s?)|odness|sh)\b/i
//-----------------------------
// TODO push(@lines, $1)
// TODO     while ($input =~ s/^([^\012\015]*)(\012\015?|\015\012?)//);
//-----------------------------
