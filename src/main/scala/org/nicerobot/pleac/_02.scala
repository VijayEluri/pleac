package org.nicerobot.pleac;

/**
 * @author nicerobot
 * 
 */


// ^^PLEAC^^_2.1
//-----------------------------
// TODO if ($string =~ /PATTERN/) {
// TODO     # is a number
// TODO } else {
// TODO     # is not
// TODO }
//-----------------------------
// TODO warn "has nondigits"        if     /\D/;
// TODO warn "not a natural number" unless /^\d+$/;             # rejects -3
// TODO warn "not an integer"       unless /^-?\d+$/;           # rejects +3
// TODO warn "not an integer"       unless /^[+-]?\d+$/;
// TODO warn "not a decimal number" unless /^-?\d+\.?\d*$/;     # rejects .2
// TODO warn "not a decimal number" unless /^-?(?:\d+(?:\.\d*)?|\.\d+)$/;
// TODO warn "not a C float"
// TODO        unless /^([+-]?)(?=\d|\.\d)\d*(\.\d*)?([Ee]([+-]?\d+))?$/;
//-----------------------------
// TODO sub getnum {
// TODO     use POSIX qw(strtod);
// TODO     my $str = shift;
// TODO     $str =~ s/^\s+//;
// TODO     $str =~ s/\s+$//;
// TODO     $! = 0;
// TODO     my($num, $unparsed) = strtod($str);
// TODO     if (($str eq '') || ($unparsed != 0) || $!) {
// TODO         return;
// TODO     } else {
// TODO         return $num;
// TODO     } 
// TODO } 

// TODO sub is_numeric { defined scalar &getnum } 
//-----------------------------

// ^^PLEAC^^_2.2
//-----------------------------
// equal(NUM1, NUM2, ACCURACY) : returns true if NUM1 and NUM2 are
// equal to ACCURACY number of decimal places

// TODO sub equal {
// TODO     my ($A, $B, $dp) = @_;

// TODO     return sprintf("%.${dp}g", $A) eq sprintf("%.${dp}g", $B);
// TODO   }
//-----------------------------
// TODO $wage = 536;                # $5.36/hour
// TODO $week = 40 * $wage;         # $214.40
// TODO printf("One week's wage is: \$%.2f\n", $week/100);
//
//One week's wage is: $214.40
//-----------------------------

// ^^PLEAC^^_2.3
//-----------------------------
// TODO $rounded = sprintf("%FORMATf", $unrounded);
//-----------------------------
// TODO $a = 0.255;
// TODO $b = sprintf("%.2f", $a);
// TODO print "Unrounded: $a\nRounded: $b\n";
// TODO printf "Unrounded: $a\nRounded: %.2f\n", $a;

// Unrounded: 0.255
// 
// Rounded: 0.26
// 
// Unrounded: 0.255
// 
// Rounded: 0.26
//-----------------------------
// TODO use POSIX;
// TODO print "number\tint\tfloor\tceil\n";
// TODO @a = ( 3.3 , 3.5 , 3.7, -3.3 );
// TODO foreach (@a) {
// TODO     printf( "%.1f\t%.1f\t%.1f\t%.1f\n", 
// TODO         $_, int($_), floor($_), ceil($_) );
// TODO }

// number  int     floor   ceil
// 
//  3.3     3.0     3.0     4.0
// 
//  3.5     3.0     3.0     4.0
// 
//  3.7     3.0     3.0     4.0
// 
// -3.3    -3.0    -4.0    -3.0
//-----------------------------

// ^^PLEAC^^_2.4
//-----------------------------
// TODO sub dec2bin {
// TODO     my $str = unpack("B32", pack("N", shift));
// TODO     $str =~ s/^0+(?=\d)//;   # otherwise you'll get leading zeros
// TODO     return $str;
// TODO }
//-----------------------------
// TODO sub bin2dec {
// TODO     return unpack("N", pack("B32", substr("0" x 32 . shift, -32)));
// TODO }
//-----------------------------
// TODO $num = bin2dec('0110110');  # $num is 54
// TODO $binstr = dec2bin(54);      # $binstr is 110110
//-----------------------------

// ^^PLEAC^^_2.5
//-----------------------------
// TODO foreach ($X .. $Y) {
// TODO     # $_ is set to every integer from X to Y, inclusive
// TODO }

// TODO foreach $i ($X .. $Y) {
// TODO     # $i is set to every integer from X to Y, inclusive
// TODO     }

// TODO for ($i = $X; $i <= $Y; $i++) {
// TODO     # $i is set to every integer from X to Y, inclusive
// TODO }

// TODO for ($i = $X; $i <= $Y; $i += 7) {
// TODO     # $i is set to every integer from X to Y, stepsize = 7
// TODO }
//-----------------------------
// TODO print "Infancy is: ";
// TODO foreach (0 .. 2) {
// TODO     print "$_ ";
// TODO }
// TODO print "\n";

// TODO print "Toddling is: ";
// TODO foreach $i (3 .. 4) {
// TODO     print "$i ";
// TODO }
// TODO print "\n";

// TODO print "Childhood is: ";
// TODO for ($i = 5; $i <= 12; $i++) {
// TODO     print "$i ";
// TODO }
// TODO print "\n";

// Infancy is: 0 1 2 
// 
// Toddling is: 3 4 
// 
// Childhood is: 5 6 7 8 9 10 11 12 
//-----------------------------

// ^^PLEAC^^_2.6
//-----------------------------
// TODO use Roman;
// TODO $roman = roman($arabic);                        # convert to roman numerals
// TODO $arabic = arabic($roman) if isroman($roman);    # convert from roman numerals
//-----------------------------
// TODO use Roman;
// TODO $roman_fifteen = roman(15);                         # "xv"
// TODO print "Roman for fifteen is $roman_fifteen\n";
// TODO $arabic_fifteen = arabic($roman_fifteen);
// TODO print "Converted back, $roman_fifteen is $arabic_fifteen\n";

// TODO Roman for fifteen is xv

// TODO Converted back, xv is 15
//-----------------------------

// ^^PLEAC^^_2.7
//-----------------------------
// TODO $random = int( rand( $Y-$X+1 ) ) + $X;
//-----------------------------
// TODO $random = int( rand(51)) + 25;
// TODO print "$random\n";
//-----------------------------
// TODO $elt = $array[ rand @array ];
//-----------------------------
// TODO @chars = ( "A" .. "Z", "a" .. "z", 0 .. 9, qw(! @ $ % ^ & *) );
// TODO $password = join("", @chars[ map { rand @chars } ( 1 .. 8 ) ]);
//-----------------------------

// ^^PLEAC^^_2.8
//-----------------------------
// TODO srand EXPR;
//-----------------------------
// TODO srand( <STDIN> );
//-----------------------------

// ^^PLEAC^^_2.9
//-----------------------------
// TODO use Math::TrulyRandom;
// TODO $random = truly_random_value();

// TODO use Math::Random;
// TODO $random = random_uniform();
//-----------------------------

// ^^PLEAC^^_2.10
//-----------------------------
// TODO sub gaussian_rand {
// TODO     my ($u1, $u2);  # uniformly distributed random numbers
// TODO     my $w;          # variance, then a weight
// TODO     my ($g1, $g2);  # gaussian-distributed numbers

// TODO     do {
// TODO         $u1 = 2 * rand() - 1;
// TODO         $u2 = 2 * rand() - 1;
// TODO         $w = $u1*$u1 + $u2*$u2;
// TODO     } while ( $w >= 1 );

// TODO     $w = sqrt( (-2 * log($w))  / $w );
// TODO     $g2 = $u1 * $w;
// TODO     $g1 = $u2 * $w;
// TODO     # return both if wanted, else just one
// TODO     return wantarray ? ($g1, $g2) : $g1;
// TODO }
//-----------------------------
// weight_to_dist: takes a hash mapping key to weight and returns
// a hash mapping key to probability
// TODO sub weight_to_dist {
// TODO     my %weights = @_;
// TODO     my %dist    = ();
// TODO     my $total   = 0;
// TODO     my ($key, $weight);
// TODO     local $_;

// TODO     foreach (values %weights) {
// TODO         $total += $_;
// TODO     }

// TODO     while ( ($key, $weight) = each %weights ) {
// TODO         $dist{$key} = $weight/$total;
// TODO     }

// TODO     return %dist;
// TODO }

// weighted_rand: takes a hash mapping key to probability, and
// returns the corresponding element
// TODO sub weighted_rand {
// TODO     my %dist = @_;
// TODO     my ($key, $weight);

// TODO     while (1) {                     # to avoid floating point inaccuracies
// TODO         my $rand = rand;
// TODO         while ( ($key, $weight) = each %dist ) {
// TODO             return $key if ($rand -= $weight) < 0;
// TODO         }
// TODO     }
// TODO }
//-----------------------------
// gaussian_rand as above
// TODO $mean = 25;
// TODO $sdev = 2;
// TODO $salary = gaussian_rand() * $sdev + $mean;
// TODO printf("You have been hired at \$%.2f\n", $salary);
//-----------------------------

// ^^PLEAC^^_2.11
//-----------------------------
// TODO BEGIN {
// TODO     use constant PI => 3.14159265358979;

// TODO     sub deg2rad {
// TODO         my $degrees = shift;
// TODO         return ($degrees / 180) * PI;
// TODO     }

// TODO     sub rad2deg {
// TODO         my $radians = shift;
// TODO         return ($radians / PI) * 180;
// TODO     }
// TODO }
//-----------------------------
// TODO use Math::Trig;

// TODO $radians = deg2rad($degrees);
// TODO $degrees = rad2deg($radians);
//-----------------------------
// deg2rad and rad2deg defined either as above or from Math::Trig
// TODO sub degree_sine {
// TODO     my $degrees = shift;
// TODO     my $radians = deg2rad($degrees);
// TODO     my $result = sin($radians);

// TODO     return $result;
// TODO }
//-----------------------------

// ^^PLEAC^^_2.12
//-----------------------------
// TODO sub tan {
// TODO     my $theta = shift;

// TODO     return sin($theta)/cos($theta);
// TODO }
//-----------------------------
// TODO use POSIX;

// TODO $y = acos(3.7);
//-----------------------------
// TODO use Math::Trig;

// TODO $y = acos(3.7);
//-----------------------------
// TODO eval {
// TODO     $y = tan($pi/2);
// TODO } or return undef;
//-----------------------------

// ^^PLEAC^^_2.13
//-----------------------------
// TODO $log_e = log(VALUE);
//-----------------------------
// TODO use POSIX qw(log10);
// TODO $log_10 = log10(VALUE);
//-----------------------------
// TODO sub log_base {
// TODO     my ($base, $value) = @_;
// TODO     return log($value)/log($base);
// TODO }
//-----------------------------
// log_base defined as above
// TODO $answer = log_base(10, 10_000);
// TODO print "log10(10,000) = $answer\n";
// log10(10,000) = 4
//-----------------------------
// TODO use Math::Complex;
// TODO printf "log2(1024) = %lf\n", logn(1024, 2); # watch out for argument order!
// log2(1024) = 10.000000
//-----------------------------

// ^^PLEAC^^_2.14
//-----------------------------
// TODO use PDL;
// $a and $b are both pdl objects
// TODO $c = $a * $b;
//-----------------------------
// TODO sub mmult {
// TODO     my ($m1,$m2) = @_;
// TODO     my ($m1rows,$m1cols) = matdim($m1);
// TODO     my ($m2rows,$m2cols) = matdim($m2);

// TODO     unless ($m1cols == $m2rows) {  # raise exception
// TODO         die "IndexError: matrices don't match: $m1cols != $m2rows";
// TODO     }

// TODO     my $result = [];
// TODO     my ($i, $j, $k);

// TODO     for $i (range($m1rows)) {
// TODO         for $j (range($m2cols)) {
// TODO             for $k (range($m1cols)) {
// TODO                 $result->[$i][$j] += $m1->[$i][$k] * $m2->[$k][$j];
// TODO             }
// TODO         }
// TODO     }
// TODO     return $result;
// TODO }

// TODO sub range { 0 .. ($_[0] - 1) }

// TODO sub veclen {
// TODO     my $ary_ref = $_[0];
// TODO     my $type = ref $ary_ref;
// TODO     if ($type ne "ARRAY") { die "$type is bad array ref for $ary_ref" }
// TODO     return scalar(@$ary_ref);
// TODO }

// TODO sub matdim {
// TODO     my $matrix = $_[0];
// TODO     my $rows = veclen($matrix);
// TODO     my $cols = veclen($matrix->[0]);
// TODO     return ($rows, $cols);
// TODO }
//-----------------------------
// TODO use PDL;

// TODO $a = pdl [
// TODO     [ 3, 2, 3 ],
// TODO     [ 5, 9, 8 ],
// TODO ];

// TODO $b = pdl [
// TODO     [ 4, 7 ],
// TODO     [ 9, 3 ],
// TODO     [ 8, 1 ],
// TODO ];

// TODO $c = $a x $b;  # x overload
//-----------------------------
// mmult() and other subroutines as above

// TODO $x = [
// TODO        [ 3, 2, 3 ],
// TODO        [ 5, 9, 8 ],
// TODO ];

// TODO $y = [
// TODO        [ 4, 7 ],
// TODO        [ 9, 3 ],
// TODO        [ 8, 1 ],
// TODO ];

// TODO $z = mmult($x, $y);
//-----------------------------

// ^^PLEAC^^_2.15
//-----------------------------
// $c = $a * $b manually
// TODO $c_real = ( $a_real * $b_real ) - ( $a_imaginary * $b_imaginary );
// TODO $c_imaginary = ( $a_real * $b_imaginary ) + ( $b_real * $a_imaginary );
//-----------------------------
// $c = $a * $b using Math::Complex
// TODO use Math::Complex;
// TODO $c = $a * $b;
//-----------------------------
// TODO $a_real = 3; $a_imaginary = 5;              # 3 + 5i;
// TODO $b_real = 2; $b_imaginary = -2;             # 2 - 2i;
// TODO $c_real = ( $a_real * $b_real ) - ( $a_imaginary * $b_imaginary );
// TODO $c_imaginary = ( $a_real * $b_imaginary ) + ( $b_real * $a_imaginary );
// TODO print "c = ${c_real}+${c_imaginary}i\n";

// TODO c = 16+4i
//-----------------------------
// TODO use Math::Complex;
// TODO $a = Math::Complex->new(3,5);               # or Math::Complex->new(3,5);
// TODO $b = Math::Complex->new(2,-2);
// TODO $c = $a * $b;
// TODO print "c = $c\n";

// TODO c = 16+4i
//-----------------------------
// TODO use Math::Complex;
// TODO $c = cplx(3,5) * cplx(2,-2);                # easier on the eye
// TODO $d = 3 + 4*i;                               # 3 + 4i
// TODO printf "sqrt($d) = %s\n", sqrt($d);

// sqrt(3+4i) = 2+i
//-----------------------------

// ^^PLEAC^^_2.16
//-----------------------------
// TODO $number = hex($hexadecimal);         # hexadecimal
// TODO $number = oct($octal);               # octal
//-----------------------------
// TODO print "Gimme a number in decimal, octal, or hex: ";
// TODO $num = <STDIN>;
// TODO chomp $num;
// TODO exit unless defined $num;
// TODO $num = oct($num) if $num =~ /^0/; # does both oct and hex
// TODO printf "%d %x %o\n", $num, $num, $num;
//-----------------------------
// TODO print "Enter file permission in octal: ";
// TODO $permissions = <STDIN>;
// TODO die "Exiting ...\n" unless defined $permissions;
// TODO chomp $permissions;
// TODO $permissions = oct($permissions);   # permissions always octal
// TODO print "The decimal value is $permissions\n";
//-----------------------------

// ^^PLEAC^^_2.17
//-----------------------------
// TODO sub commify {
// TODO     my $text = reverse $_[0];
// TODO     $text =~ s/(\d\d\d)(?=\d)(?!\d*\.)/$1,/g;
// TODO     return scalar reverse $text;
// TODO }
//-----------------------------
// more reasonable web counter :-)
// TODO use Math::TrulyRandom;
// TODO $hits = truly_random_value();       # negative hits!
// TODO $output = "Your web page received $hits accesses last month.\n";
// TODO print commify($output);
// TODO Your web page received -1,740,525,205 accesses last month.
//-----------------------------

// ^^PLEAC^^_2.18
//-----------------------------
// TODO printf "It took %d hour%s\n", $time, $time == 1 ? "" : "s";

// TODO printf "%d hour%s %s enough.\n", $time, 
// TODO         $time == 1 ? ""   : "s",
// TODO         $time == 1 ? "is" : "are";
//-----------------------------
// TODO printf "It took %d centur%s", $time, $time == 1 ? "y" : "ies";
//-----------------------------
// TODO sub noun_plural {
// TODO     local $_ = shift;
// TODO     # order really matters here!
// TODO     s/ss$/sses/                             ||
// TODO     s/([psc]h)$/${1}es/                     ||
// TODO     s/z$/zes/                               ||
// TODO     s/ff$/ffs/                              ||
// TODO     s/f$/ves/                               ||
// TODO     s/ey$/eys/                              ||
// TODO     s/y$/ies/                               ||
// TODO     s/ix$/ices/                             ||
// TODO     s/([sx])$/$1es/                         ||
// TODO     s/$/s/                                  ||
// TODO                 die "can't get here";
// TODO     return $_;
// TODO }
// TODO *verb_singular = \&noun_plural;   # make function alias
//-----------------------------
// TODO use Lingua::EN::Inflect qw(PL classical);
// TODO classical(1);               # why isn't this the default?
// TODO while (<DATA>) {            # each line in the data
// TODO     for (split) {           # each word on the line
// TODO         print "One $_, two ", PL($_), ".\n";
// TODO     }
// TODO } 
// plus one more
// TODO $_ = 'secretary general';
// TODO print "One $_, two ", PL($_), ".\n";

//__END__
//fish fly ox 
//species genus phylum 
//cherub radius jockey 
//index matrix mythos
//phenomenon formula 
//-----------------------------
//One fish, two fish.
//
//One fly, two flies.
//
//One ox, two oxen.
//
//One species, two species.
//
//One genus, two genera.
//
//One phylum, two phyla.
//
//One cherub, two cherubim.
//
//One radius, two radii.
//
//One jockey, two jockeys.
//
//One index, two indices.
//
//One matrix, two matrices.
//
//One mythos, two mythoi.
//
//One phenomenon, two phenomena.
//
//One formula, two formulae.
//
//One secretary general, two secretaries general.
//-----------------------------

// ^^PLEAC^^_2.19
//-----------------------------
//% bigfact 8 9 96 2178
//8          2**3
//
//9          3**2
//
//96         2**5 3
//
//2178       2 3**2 11**2
//-----------------------------
//% bigfact 239322000000000000000000
//+239322000000000000000000 2**19 3 5**18 +39887 
//
//
//% bigfact 25000000000000000000000000
//+25000000000000000000000000 2**24 5**26
//-----------------------------
// ^^INCLUDE^^ include/perl/ch02/bigfact
//-----------------------------
