// <PLEAC>
// -*- scala -*-
// @@PLEAC@@_NAME
// @@SKIP@@ Scala

// @@PLEAC@@_WEB
// @@SKIP@@ http://www.scala-lang.org/

// </PLEAC>

package org.nicerobot.pleac;

/**
 * @author nicerobot
 * 
 */


// ^^PLEAC^^_1.0
//-----------------------------
// TODO $string = '\n';                     # two characters, \ and an n
// TODO $string = 'Jon \'Maddog\' Orwant';  # literal single quotes
//-----------------------------
// TODO $string = "\n";                     # a "newline" character
// TODO $string = "Jon \"Maddog\" Orwant";  # literal double quotes
//-----------------------------
// TODO $string = q/Jon 'Maddog' Orwant/;   # literal single quotes
//-----------------------------
// TODO $string = q[Jon 'Maddog' Orwant];   # literal single quotes
// TODO $string = q{Jon 'Maddog' Orwant};   # literal single quotes
// TODO $string = q(Jon 'Maddog' Orwant);   # literal single quotes
// TODO $string = q<Jon 'Maddog' Orwant>;   # literal single quotes
//-----------------------------
// TODO $a = <<"EOF";
// TODO This is a multiline here document
// TODO terminated by EOF on a line by itself
// TODO EOF
//-----------------------------

// ^^PLEAC^^_1.1
//-----------------------------
// TODO $value = substr($string, $offset, $count);
// TODO $value = substr($string, $offset);

// TODO substr($string, $offset, $count) = $newstring;
// TODO substr($string, $offset)         = $newtail;
//-----------------------------
// get a 5-byte string, skip 3, then grab 2 8-byte strings, then the rest
// TODO ($leading, $s1, $s2, $trailing) =
// TODO     unpack("A5 x3 A8 A8 A*", $data);

// split at five byte boundaries
// TODO @fivers = unpack("A5" x (length($string)/5), $string);

// chop string into individual characters
// TODO @chars  = unpack("A1" x length($string), $string);
//-----------------------------
// TODO $string = "This is what you have";
//         +012345678901234567890  Indexing forwards  (left to right)
//          109876543210987654321- Indexing backwards (right to left)
//           note that 0 means 10 or 20, etc. above

// TODO $first  = substr($string, 0, 1);  # "T"
// TODO $start  = substr($string, 5, 2);  # "is"
// TODO $rest   = substr($string, 13);    # "you have"
// TODO $last   = substr($string, -1);    # "e"
// TODO $end    = substr($string, -4);    # "have"
// TODO $piece  = substr($string, -8, 3); # "you"
//-----------------------------
// TODO $string = "This is what you have";
// TODO print $string;
//This is what you have

// TODO substr($string, 5, 2) = "wasn't"; # change "is" to "wasn't"
//This wasn't what you have

// TODO substr($string, -12)  = "ondrous";# replace last 12 characters
//This wasn't wondrous

// TODO substr($string, 0, 1) = "";       # delete first character
//his wasn't wondrous

// TODO substr($string, -10)  = "";       # delete last 10 characters
//his wasn'
//-----------------------------
// you can test substrings with =~
// TODO if (substr($string, -10) =~ /pattern/) {
// TODO     print "Pattern matches in last 10 characters\n";
// TODO }

// substitute "at" for "is", restricted to first five characters
// TODO substr($string, 0, 5) =~ s/is/at/g;
//-----------------------------
// exchange the first and last letters in a string
// TODO $a = "make a hat";
// TODO (substr($a,0,1), substr($a,-1)) = (substr($a,-1), substr($a,0,1));
// TODO print $a;
// take a ham
//-----------------------------
// extract column with unpack
// TODO $a = "To be or not to be";
// TODO $b = unpack("x6 A6", $a);  # skip 6, grab 6
// TODO print $b;
// or not

// TODO ($b, $c) = unpack("x6 A2 X5 A2", $a); # forward 6, grab 2; backward 5, grab 2
// TODO print "$b\n$c\n";
// or
//
// be
//-----------------------------
// TODO sub cut2fmt {
// TODO     my(@positions) = @_;
// TODO     my $template   = '';
// TODO     my $lastpos    = 1;
// TODO     foreach $place (@positions) {
// TODO         $template .= "A" . ($place - $lastpos) . " ";
// TODO         $lastpos   = $place;
// TODO     }
// TODO     $template .= "A*";
// TODO     return $template;
// TODO }

// TODO $fmt = cut2fmt(8, 14, 20, 26, 30);
// TODO print "$fmt\n";
// A7 A6 A6 A6 A4 A*
//-----------------------------

// ^^PLEAC^^_1.2
//-----------------------------
// use $b if $b is true, else $c
// TODO $a = $b || $c;              

// set $x to $y unless $x is already true
// TODO $x ||= $y
//-----------------------------
// use $b if $b is defined, else $c
// TODO $a = defined($b) ? $b : $c;
//-----------------------------
// TODO $foo = $bar || "DEFAULT VALUE";
//-----------------------------
// TODO $dir = shift(@ARGV) || "/tmp";
//-----------------------------
// TODO $dir = $ARGV[0] || "/tmp";
//-----------------------------
// TODO $dir = defined($ARGV[0]) ? shift(@ARGV) : "/tmp";
//-----------------------------
// TODO $dir = @ARGV ? $ARGV[0] : "/tmp";
//-----------------------------
// TODO $count{ $shell || "/bin/sh" }++;
//-----------------------------
// find the user name on Unix systems
// TODO $user = $ENV{USER}
// TODO      || $ENV{LOGNAME}
// TODO      || getlogin()
// TODO      || (getpwuid($<))[0]
// TODO      || "Unknown uid number $<";
//-----------------------------
// TODO $starting_point ||= "Greenwich";
//-----------------------------
// TODO @a = @b unless @a;          # copy only if empty
// TODO @a = @b ? @b : @c;          # assign @b if nonempty, else @c
//-----------------------------

// ^^PLEAC^^_1.3
//-----------------------------
// TODO ($VAR1, $VAR2) = ($VAR2, $VAR1);
//-----------------------------
// TODO $temp    = $a;
// TODO $a       = $b;
// TODO $b       = $temp;
//-----------------------------
// TODO $a       = "alpha";
// TODO $b       = "omega";
// TODO ($a, $b) = ($b, $a);        # the first shall be last -- and versa vice
//-----------------------------
// TODO ($alpha, $beta, $production) = qw(January March August);
// move beta       to alpha,
// move production to beta,
// move alpha      to production
// TODO ($alpha, $beta, $production) = ($beta, $production, $alpha);
//-----------------------------

// ^^PLEAC^^_1.4
//-----------------------------
// TODO $num  = ord($char);
// TODO $char = chr($num);
//-----------------------------
// TODO $char = sprintf("%c", $num);                # slower than chr($num)
// TODO printf("Number %d is character %c\n", $num, $num);
// TODO Number 101 is character e
//-----------------------------
// TODO @ASCII = unpack("C*", $string);
// TODO $STRING = pack("C*", @ascii);
//-----------------------------
// TODO $ascii_value = ord("e");    # now 101
// TODO $character   = chr(101);    # now "e"
//-----------------------------
// TODO printf("Number %d is character %c\n", 101, 101);
//-----------------------------
// TODO @ascii_character_numbers = unpack("C*", "sample");
// TODO print "@ascii_character_numbers\n";
// TODO 115 97 109 112 108 101


// TODO $word = pack("C*", @ascii_character_numbers);
// TODO $word = pack("C*", 115, 97, 109, 112, 108, 101);   # same
// TODO print "$word\n";
// TODO sample
//-----------------------------
// TODO $hal = "HAL";
// TODO @ascii = unpack("C*", $hal);
// TODO foreach $val (@ascii) {
// TODO     $val++;                 # add one to each ASCII value
// TODO }
// TODO $ibm = pack("C*", @ascii);
// TODO print "$ibm\n";             # prints "IBM"
//-----------------------------

// ^^PLEAC^^_1.5
//-----------------------------
// TODO @array = split(//, $string);

// TODO @array = unpack("C*", $string);
//-----------------------------
// TODO     while (/(.)/g) { # . is never a newline here
// TODO         # do something with $1
// TODO     }
//-----------------------------
// TODO %seen = ();
// TODO $string = "an apple a day";
// TODO foreach $byte (split //, $string) {
// TODO     $seen{$byte}++;
// TODO }
// TODO print "unique chars are: ", sort(keys %seen), "\n";
// TODO unique chars are:  adelnpy
//-----------------------------
// TODO %seen = ();
// TODO $string = "an apple a day";
// TODO while ($string =~ /(.)/g) {
// TODO     $seen{$1}++;
// TODO }
// TODO print "unique chars are: ", sort(keys %seen), "\n";
// TODO unique chars are:  adelnpy
//-----------------------------
// TODO $sum = 0;
// TODO foreach $ascval (unpack("C*", $string)) {
// TODO     $sum += $ascval;
// TODO }
// TODO print "sum is $sum\n";
// prints "1248" if $string was "an apple a day"
//-----------------------------
// TODO $sum = unpack("%32C*", $string);
//-----------------------------
// ^^INCLUDE^^ include/perl/ch01/sum
//-----------------------------
//% perl sum /etc/termcap
//1510
//-----------------------------
//% sum --sysv /etc/termcap
//1510 851 /etc/termcap
//-----------------------------
// ^^INCLUDE^^ include/perl/ch01/slowcat
//-----------------------------

// ^^PLEAC^^_1.6
//-----------------------------
// TODO $revbytes = reverse($string);
//-----------------------------
// TODO $revwords = join(" ", reverse split(" ", $string));
//-----------------------------
// TODO $gnirts   = reverse($string);       # reverse letters in $string

// TODO @sdrow    = reverse(@words);        # reverse elements in @words

// TODO $confused = reverse(@words);        # reverse letters in join("", @words)
//-----------------------------
// reverse word order
// TODO $string = 'Yoda said, "can you see this?"';
// TODO @allwords    = split(" ", $string);
// TODO $revwords    = join(" ", reverse @allwords);
// TODO print $revwords, "\n";
// TODO this?" see you "can said, Yoda
//-----------------------------
// TODO $revwords = join(" ", reverse split(" ", $string));
//-----------------------------
// TODO $revwords = join("", reverse split(/(\s+)/, $string));
//-----------------------------
// TODO $word = "reviver";
// TODO $is_palindrome = ($word eq reverse($word));
//-----------------------------
//% perl -nle 'print if $_ eq reverse && length > 5' /usr/dict/words
//deedeed
//
//degged
//
//deified
//
//denned
//
//hallah
//
//kakkak
//
//murdrum
//
//redder
//
//repaper
//
//retter
//
//reviver
//
//rotator
//
//sooloos
//
//tebbet
//
//terret
//
//tut-tut
//-----------------------------

// ^^PLEAC^^_1.7
//-----------------------------
// TODO while ($string =~ s/\t+/' ' x (length($&) * 8 - length($`) % 8)/e) {
// TODO     # spin in empty loop until substitution finally fails
// TODO }
//-----------------------------
// TODO use Text::Tabs;
// TODO @expanded_lines  = expand(@lines_with_tabs);
// TODO @tabulated_lines = unexpand(@lines_without_tabs);
//-----------------------------
// TODO while (<>) {
// TODO     1 while s/\t+/' ' x (length($&) * 8 - length($`) % 8)/e;
// TODO     print;
// TODO }
//-----------------------------
// TODO use Text::Tabs;
// TODO $tabstop = 4;
// TODO while (<>) { print expand($_) }
//-----------------------------
// TODO use Text::Tabs;
// TODO while (<>) { print unexpand($_) }
//-----------------------------

// ^^PLEAC^^_1.8
//-----------------------------
//You owe $debt to me.
//-----------------------------
// TODO $text =~ s/\$(\w+)/${$1}/g;
//-----------------------------
// TODO $text =~ s/(\$\w+)/$1/gee;
//-----------------------------
// TODO use vars qw($rows $cols);
// TODO no strict 'refs';                   # for ${$1}/g below
// TODO my $text;

// TODO ($rows, $cols) = (24, 80);
// TODO $text = q(I am $rows high and $cols long);  # like single quotes!
// TODO $text =~ s/\$(\w+)/${$1}/g;
// TODO print $text;
// TODO I am 24 high and 80 long
//-----------------------------
// TODO $text = "I am 17 years old";
// TODO $text =~ s/(\d+)/2 * $1/eg; 
//-----------------------------
// TODO 2 * 17
//-----------------------------
// TODO $text = 'I am $AGE years old';      # note single quotes
// TODO $text =~ s/(\$\w+)/$1/eg;           # WRONG
//-----------------------------
// TODO '$AGE'
//-----------------------------
// TODO $text =~ s/(\$\w+)/$1/eeg;          # finds my() variables
//-----------------------------
// expand variables in $text, but put an error message in
// if the variable isn't defined
// TODO $text =~ s{
// TODO      \$                         # find a literal dollar sign
// TODO     (\w+)                       # find a "word" and store it in $1
// TODO }{
// TODO     no strict 'refs';           # for $$1 below
// TODO     if (defined ${$1}) {
// TODO         ${$1};                  # expand global variables only
// TODO     } else {
// TODO         "[NO VARIABLE: \$$1]";  # error msg
// TODO     }
// TODO }egx;
//-----------------------------

// ^^PLEAC^^_1.9
//-----------------------------
// TODO use locale;                     # needed in 5.004 or above

// TODO $big = uc($little);             # "bo peep" -> "BO PEEP"
// TODO $little = lc($big);             # "JOHN"    -> "john"
// TODO $big = "\U$little";             # "bo peep" -> "BO PEEP"
// TODO $little = "\L$big";             # "JOHN"    -> "john"
//-----------------------------
// TODO $big = "\u$little";             # "bo"      -> "Bo"
// TODO $little = "\l$big";             # "BoPeep"    -> "boPeep" 
//-----------------------------
// TODO use locale;                     # needed in 5.004 or above

// TODO $beast   = "dromedary";
// capitalize various parts of $beast
// TODO $capit   = ucfirst($beast);         # Dromedary
// TODO $capit   = "\u\L$beast";            # (same)
// TODO $capall  = uc($beast);              # DROMEDARY
// TODO $capall  = "\U$beast";              # (same)
// TODO $caprest = lcfirst(uc($beast));     # dROMEDARY
// TODO $caprest = "\l\U$beast";            # (same)
//-----------------------------
// capitalize each word's first character, downcase the rest
// TODO $text = "thIS is a loNG liNE";
// TODO $text =~ s/(\w+)/\u\L$1/g;
// TODO print $text;
// TODO This Is A Long Line
//-----------------------------
// TODO if (uc($a) eq uc($b)) {
// TODO     print "a and b are the same\n";
// TODO }
//-----------------------------
// ^^INCLUDE^^ include/perl/ch01/randcap

//% randcap < genesis | head -9
//boOk 01 genesis
//
//
//001:001 in the BEginning goD created the heaven and tHe earTh.
//
//    
//
//001:002 and the earth wAS without ForM, aND void; AnD darkneSS was
//
//   upon The Face of the dEEp. and the spIrit of GOd movEd upOn
//
//   tHe face of the Waters.
//
//
//001:003 and god Said, let there be ligHt: and therE wAs LigHt.
//-----------------------------
// TODO sub randcase {
// TODO     rand(100) < 20 ? ("\040" ^ $_[0]) : $_[0];
// TODO }
//-----------------------------
// TODO $string &= "\177" x length($string);
//-----------------------------

// ^^PLEAC^^_1.10
//-----------------------------
// TODO $answer = $var1 . func() . $var2;   # scalar only
//-----------------------------
// TODO $answer = "STRING @{[ LIST EXPR ]} MORE STRING";
// TODO $answer = "STRING ${\( SCALAR EXPR )} MORE STRING";
//-----------------------------
// TODO $phrase = "I have " . ($n + 1) . " guanacos.";
// TODO $phrase = "I have ${\($n + 1)} guanacos.";
//-----------------------------
// TODO print "I have ",  $n + 1, " guanacos.\n";
//-----------------------------
// TODO some_func("What you want is @{[ split /:/, $rec ]} items");
//-----------------------------
// TODO die "Couldn't send mail" unless send_mail(<<"EOTEXT", $target);
// TODO To: $naughty
// TODO From: Your Bank
// TODO Cc: @{ get_manager_list($naughty) }
// TODO Date: @{[ do { my $now = `date`; chomp $now; $now } ]} (today)

// TODO Dear $naughty,

// TODO Today, you bounced check number @{[ 500 + int rand(100) ]} to us.
// TODO Your account is now closed.

// TODO Sincerely,
// TODO the management
// TODO EOTEXT
//-----------------------------

// ^^PLEAC^^_1.11
//-----------------------------
// all in one
// TODO ($var = <<HERE_TARGET) =~ s/^\s+//gm;
// TODO     your text
// TODO     goes here
// TODO HERE_TARGET

// or with two steps
// TODO $var = <<HERE_TARGET;
// TODO     your text
// TODO     goes here
// TODO HERE_TARGET
// TODO $var =~ s/^\s+//gm;
//-----------------------------
// TODO ($definition = <<'FINIS') =~ s/^\s+//gm;
// TODO     The five varieties of camelids
// TODO     are the familiar camel, his friends
// TODO     the llama and the alpaca, and the
// TODO     rather less well-known guanaco
// TODO     and vicu–a.
// TODO FINIS
//-----------------------------
// TODO sub fix {
// TODO     my $string = shift;
// TODO     $string =~ s/^\s+//gm;
// TODO     return $string;
// TODO }

// TODO print fix(<<"END");
// TODO     My stuff goes here
// TODO END

// With function predeclaration, you can omit the parens:
// TODO print fix <<"END";
// TODO     My stuff goes here
// TODO END
//-----------------------------
// TODO ($quote = <<'    FINIS') =~ s/^\s+//gm;
// TODO         ...we will have peace, when you and all your works have
// TODO         perished--and the works of your dark master to whom you would
// TODO         deliver us. You are a liar, Saruman, and a corrupter of mens
// TODO         hearts.  --Theoden in /usr/src/perl/taint.c
// TODO     FINIS
// TODO $quote =~ s/\s+--/\n--/;      #move attribution to line of its own
//-----------------------------
// TODO if ($REMEMBER_THE_MAIN) {
// TODO     $perl_main_C = dequote<<'    MAIN_INTERPRETER_LOOP';
// TODO         @@@ int
// TODO         @@@ runops() {
// TODO         @@@     SAVEI32(runlevel);
// TODO         @@@     runlevel++;
// TODO         @@@     while ( op = (*op->op_ppaddr)() ) ;
// TODO         @@@     TAINT_NOT;
// TODO         @@@     return 0;
// TODO         @@@ }
// TODO     MAIN_INTERPRETER_LOOP
// TODO     # add more code here if you want
// TODO }
//-----------------------------
// TODO sub dequote;
// TODO $poem = dequote<<EVER_ON_AND_ON;
// TODO        Now far ahead the Road has gone,
// TODO           And I must follow, if I can,
// TODO        Pursuing it with eager feet,
// TODO           Until it joins some larger way
// TODO        Where many paths and errands meet.
// TODO           And whither then? I cannot say.
// TODO                 --Bilbo in /usr/src/perl/pp_ctl.c
// TODO EVER_ON_AND_ON
// TODO print "Here's your poem:\n\n$poem\n";
//-----------------------------
//Here's your poem:  
//
//Now far ahead the Road has gone,
//
//   And I must follow, if I can,
//
//Pursuing it with eager feet,
//
//   Until it joins some larger way
//
//Where many paths and errands meet.
//
//   And whither then? I cannot say.
//
//    --Bilbo in /usr/src/perl/pp_ctl.c
//-----------------------------
// TODO sub dequote {
// TODO     local $_ = shift;
// TODO     my ($white, $leader);  # common whitespace and common leading string
// TODO     if (/^\s*(?:([^\w\s]+)(\s*).*\n)(?:\s*\1\2?.*\n)+$/) {
// TODO         ($white, $leader) = ($2, quotemeta($1));
// TODO     } else {
// TODO         ($white, $leader) = (/^(\s+)/, '');
// TODO     }
// TODO     s/^\s*?$leader(?:$white)?//gm;
// TODO     return $_;
// TODO }
//-----------------------------
// TODO     if (m{
// TODO             ^                       # start of line
// TODO             \s *                    # 0 or more whitespace chars
// TODO             (?:                     # begin first non-remembered grouping
// TODO                  (                  #   begin save buffer $1
// TODO                     [^\w\s]         #     one byte neither space nor word
// TODO                     +               #     1 or more of such
// TODO                  )                  #   end save buffer $1
// TODO                  ( \s* )            #   put 0 or more white in buffer $2
// TODO                  .* \n              #   match through the end of first line
// TODO              )                      # end of first grouping
// TODO              (?:                    # begin second non-remembered grouping
// TODO                 \s *                #   0 or more whitespace chars
// TODO                 \1                  #   whatever string is destined for $1
// TODO                 \2 ?                #   what'll be in $2, but optionally
// TODO                 .* \n               #   match through the end of the line
// TODO              ) +                    # now repeat that group idea 1 or more
// TODO              $                      # until the end of the line
// TODO           }x
// TODO        )
// TODO     {
// TODO         ($white, $leader) = ($2, quotemeta($1));
// TODO     } else {
// TODO         ($white, $leader) = (/^(\s+)/, '');
// TODO     }
// TODO     s{
// TODO          ^                          # start of each line (due to /m)
// TODO          \s *                       # any amount of leading whitespace
// TODO             ?                       #   but minimally matched
// TODO          $leader                    # our quoted, saved per-line leader
// TODO          (?:                        # begin unremembered grouping
// TODO             $white                  #    the same amount
// TODO          ) ?                        # optionalize in case EOL after leader
// TODO     }{}xgm;
//-----------------------------

// ^^PLEAC^^_1.12
//-----------------------------
// TODO use Text::Wrap;
// TODO @OUTPUT = wrap($LEADTAB, $NEXTTAB, @PARA);
//-----------------------------
// ^^INCLUDE^^ include/perl/ch01/wrapdemo
//-----------------------------
// TODO 01234567890123456789

// TODO     Folding and

// TODO   splicing is the

// TODO   work of an

// TODO   editor, not a

// TODO   mere collection

// TODO   of silicon and

// TODO   mobile electrons!
//-----------------------------
// merge multiple lines into one, then wrap one long line
// TODO use Text::Wrap;
// TODO undef $/;
// TODO print wrap('', '', split(/\s*\n\s*/, <>));
//-----------------------------
// TODO use Text::Wrap      qw(&wrap $columns);
// TODO use Term::ReadKey   qw(GetTerminalSize);
// TODO ($columns) = GetTerminalSize();
// TODO ($/, $\)  = ('', "\n\n");   # read by paragraph, output 2 newlines
// TODO while (<>) {                # grab a full paragraph
// TODO     s/\s*\n\s*/ /g;         # convert intervening newlines to spaces
// TODO     print wrap('', '', $_); # and format
// TODO }
//-----------------------------

// ^^PLEAC^^_1.13
//-----------------------------
// backslash
// TODO $var =~ s/([CHARLIST])/\\$1/g;

// double
// TODO $var =~ s/([CHARLIST])/$1$1/g;
//-----------------------------
// TODO $string =~ s/%/%%/g;
//-----------------------------
// TODO $string = q(Mom said, "Don't do that."); #'
// TODO $string =~ s/(['"])/\\$1/g;
//-----------------------------
// TODO $string = q(Mom said, "Don't do that.");
// TODO $string =~ s/(['"])/$1$1/g;
//-----------------------------
// TODO $string =~ s/([^A-Z])/\\$1/g;
//-----------------------------
// TODO $string = "this \Qis a test!\E";
// TODO $string = "this is\\ a\\ test\\!";
// TODO $string = "this " . quotemeta("is a test!");
//-----------------------------

// ^^PLEAC^^_1.14
//-----------------------------
// TODO $string =~ s/^\s+//;
// TODO $string =~ s/\s+$//;
//-----------------------------
// TODO $string = trim($string);
// TODO @many   = trim(@many);

// TODO sub trim {
// TODO     my @out = @_;
// TODO     for (@out) {
// TODO         s/^\s+//;
// TODO         s/\s+$//;
// TODO     }
// TODO     return wantarray ? @out : $out[0];
// TODO }
//-----------------------------
// print what's typed, but surrounded by >< symbols
// TODO while(<STDIN>) {
// TODO     chomp;
// TODO     print ">$_<\n";
// TODO }
//-----------------------------

// ^^PLEAC^^_1.15
//-----------------------------
// TODO sub parse_csv {
// TODO     my $text = shift;      # record containing comma-separated values
// TODO     my @new  = ();
// TODO     push(@new, $+) while $text =~ m{
// TODO         # the first part groups the phrase inside the quotes.
// TODO         # see explanation of this pattern in MRE
// TODO         "([^\"\\]*(?:\\.[^\"\\]*)*)",?
// TODO            |  ([^,]+),?
// TODO            | ,
// TODO        }gx;
// TODO        push(@new, undef) if substr($text, -1,1) eq ',';
// TODO        return @new;      # list of values that were comma-separated
// TODO }
//-----------------------------
// TODO use
// TODO Text::ParseWords;

// TODO sub parse_csv {
// TODO     return quoteword(",",0, $_[0]);
// TODO }
//-----------------------------
// TODO $line = q<XYZZY,"","O'Reilly, Inc","Wall, Larry","a \"glug\" bit,",5,
// TODO     "Error, Core Dumped">;
// TODO @fields = parse_csv($line);
// TODO for ($i = 0; $i < @fields; $i++) {
// TODO     print "$i : $fields[$i]\n";
// TODO }
//0 : XYZZY
//
//1 :
//
//2 : O'Reilly, Inc
//
//3 : Wall, Larry
//
//4 : a \"glug\" bit,
//
//5 : 5
//
//6 : Error, Core Dumped
//-----------------------------

// ^^PLEAC^^_1.16
//-----------------------------
// TODO  use Text::Soundex;

// TODO  $CODE  = soundex($STRING);
// TODO  @CODES = soundex(@LIST);
//-----------------------------
// TODO use Text::Soundex;
// TODO use User::pwent;

// TODO print "Lookup user: ";
// TODO chomp($user = <STDIN>);
// TODO exit unless defined $user;
// TODO $name_code = soundex($user);

// TODO while ($uent = getpwent()) {
// TODO     ($firstname, $lastname) = $uent->gecos =~ /(\w+)[^,]*\b(\w+)/;

// TODO     if ($name_code eq soundex($uent->name) ||
// TODO         $name_code eq soundex($lastname)   ||
// TODO         $name_code eq soundex($firstname)  )
// TODO     {
// TODO         printf "%s: %s %s\n", $uent->name, $firstname, $lastname;
// TODO     }
// TODO }
//-----------------------------

// ^^PLEAC^^_1.17
//-----------------------------
// ^^INCLUDE^^ include/perl/ch01/fixstyle
//analysed        => analyzed
//built-in        => builtin
//chastized       => chastised
//commandline     => command-line
//de-allocate     => deallocate
//dropin          => drop-in
//hardcode        => hard-code
//meta-data       => metadata
//multicharacter  => multi-character
//multiway        => multi-way
//non-empty       => nonempty
//non-profit      => nonprofit
//non-trappable   => nontrappable
//pre-define      => predefine
//preextend       => pre-extend
//re-compiling    => recompiling
//reenter         => re-enter
//turnkey         => turn-key
//-----------------------------
// ^^INCLUDE^^ include/perl/ch01/fixstyle2
//analysed        => analyzed
//built-in        => builtin
//chastized       => chastised
//commandline     => command-line
//de-allocate     => deallocate
//dropin          => drop-in
//hardcode        => hard-code
//meta-data       => metadata
//multicharacter  => multi-character
//multiway        => multi-way
//non-empty       => nonempty
//non-profit      => nonprofit
//non-trappable   => nontrappable
//pre-define      => predefine
//preextend       => pre-extend
//re-compiling    => recompiling
//reenter         => re-enter
//turnkey         => turn-key
//-----------------------------
// very fast, but whitespace collapse
// TODO while (<>) { 
// TODO     for (split) { 
// TODO         print $change{$_} || $_, " ";
// TODO     }
// TODO     print "\n";
// TODO }
//-----------------------------
// TODO my $pid = open(STDOUT, "|-");
// TODO die "cannot fork: $!" unless defined $pid;
// TODO unless ($pid) {             # child
// TODO         while (<STDIN>) {
// TODO         s/ $//;
// TODO         print;
// TODO     }
// TODO     exit;
// TODO }
//-----------------------------

// ^^PLEAC^^_1.18
//-----------------------------
//% psgrep '/sh\b/'
//-----------------------------
//% psgrep 'command =~ /sh$/'
//-----------------------------
//% psgrep 'uid < 10'
//-----------------------------
//% psgrep 'command =~ /^-/' 'tty ne "?"'
//-----------------------------
//% psgrep 'tty =~ /^[p-t]/'
//-----------------------------
//% psgrep 'uid && tty eq "?"'
//-----------------------------
//% psgrep 'size > 10 * 2**10' 'uid != 0'
//-----------------------------
// FLAGS   UID   PID  PPID PRI  NI   SIZE   RSS WCHAN     STA TTY TIME COMMAND
//
//     0   101  9751     1   0   0  14932  9652 do_select S   p1  0:25 netscape
//
//100000   101  9752  9751   0   0  10636   812 do_select S   p1  0:00 (dns helper)
//-----------------------------
// ^^INCLUDE^^ include/perl/ch01/psgrep
// the following was used to determine column cut points.
// sample input data follows
// 123456789012345678901234567890123456789012345678901234567890123456789012345
//          1         2         3         4         5         6         7
//  Positioning:
//        8     14    20    26  30  34     41    47          59  63  67   72
//        |     |     |     |   |   |      |     |           |   |   |    |
// __END__
//  FLAGS   UID   PID  PPID PRI  NI   SIZE   RSS WCHAN       STA TTY TIME COMMAND
// 
//    100     0     1     0   0   0    760   432 do_select   S   ?   0:02 init
// 
//    140     0   187     1   0   0    784   452 do_select   S   ?   0:02 syslogd
// 
// 100100   101   428     1   0   0   1436   944 do_exit     S    1  0:00 /bin/login
// 
// 100140    99 30217   402   0   0   1552  1008 posix_lock_ S   ?   0:00 httpd
// 
//      0   101   593   428   0   0   1780  1260 copy_thread S    1  0:00 -tcsh
// 
// 100000   101 30639  9562  17   0    924   496             R   p1  0:00 ps axl
// 
//      0   101 25145  9563   0   0   2964  2360 idetape_rea S   p2  0:06 trn
// 
// 100100     0 10116  9564   0   0   1412   928 setup_frame T   p3  0:00 ssh -C www
// 
// 100100     0 26560 26554   0   0   1076   572 setup_frame T   p2  0:00 less
// 
// 100000   101 19058  9562   0   0   1396   900 setup_frame T   p1  0:02 nvi /tmp/a
//-----------------------------
// TODO eval "sub is_desirable { uid < 10 } " . 1;
//-----------------------------
//% psgrep 'no strict "vars";
//          BEGIN { $id = getpwnam("nobody") }
//          uid == $id '
//-----------------------------
// TODO sub id()         { $_->{ID}   }
// TODO sub title()      { $_->{TITLE} }
// TODO sub executive()  { title =~ /(?:vice-)?president/i }

// user search criteria go in the grep clause
// TODO @slowburners = grep { id < 10 && !executive } @employees;
//-----------------------------
