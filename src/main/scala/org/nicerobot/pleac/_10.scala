package org.nicerobot.pleac;

/**
 * @author nicerobot
 * 
 */

// ^^PLEAC^^_10.0
//-----------------------------
// TODO sub hello { 
// TODO     $greeted++;          # global variable 
// TODO     print "hi there!\n";
// TODO }
//-----------------------------
// TODO hello();                 # call subroutine hello with no arguments/parameters
//-----------------------------

// ^^PLEAC^^_10.1
//-----------------------------
// TODO sub hypotenuse {
// TODO     return sqrt( ($_[0] ** 2) + ($_[1] ** 2) );
// TODO }

// TODO $diag = hypotenuse(3,4);  # $diag is 5
//-----------------------------
// TODO sub hypotenuse {
// TODO     my ($side1, $side2) = @_;
// TODO     return sqrt( ($side1 ** 2) + ($side2 ** 2) );
// TODO }
//-----------------------------
// TODO print hypotenuse(3, 4), "\n";               # prints 5

// TODO @a = (3, 4);
// TODO print hypotenuse(@a), "\n";                 # prints 5
//-----------------------------
// TODO @both = (@men, @women);
//-----------------------------
// TODO @nums = (1.4, 3.5, 6.7);
// TODO @ints = int_all(@nums);        # @nums unchanged
// TODO sub int_all {
// TODO     my @retlist = @_;          # make safe copy for return
// TODO     for my $n (@retlist) { $n = int($n) } 
// TODO     return @retlist;
// TODO } 
//-----------------------------
// TODO @nums = (1.4, 3.5, 6.7);
// TODO trunc_em(@nums);               # @nums now (1,3,6)
// TODO sub trunc_em {
// TODO     for (@_) { $_ = int($_) }  # truncate each argument
// TODO } 
//-----------------------------
// TODO $line = chomp(<>);                  # WRONG
//-----------------------------

// ^^PLEAC^^_10.2
//-----------------------------
// TODO sub somefunc {
// TODO     my $variable;                 # $variable is invisible outside somefunc()
// TODO     my ($another, @an_array, %a_hash);     # declaring many variables at once

// TODO     # ...
// TODO }
//-----------------------------
// TODO my ($name, $age) = @ARGV;
// TODO my $start        = fetch_time();
//-----------------------------
// TODO my ($a, $b) = @pair;
// TODO my $c = fetch_time();

// TODO sub check_x {
// TODO     my $x = $_[0];       
// TODO     my $y = "whatever";  
// TODO     run_check();
// TODO     if ($condition) {
// TODO         print "got $x\n";
// TODO     }
// TODO }
//-----------------------------
// TODO sub save_array {
// TODO     my @arguments = @_;
// TODO     push(@Global_Array, \@arguments);
// TODO }
//-----------------------------

// ^^PLEAC^^_10.3
//-----------------------------
// TODO {
// TODO     my $variable;
// TODO     sub mysub {
// TODO         # ... accessing $variable
// TODO     }
// TODO }
//-----------------------------
// TODO BEGIN {
// TODO     my $variable = 1;                       # initial value
// TODO     sub othersub {                          # ... accessing $variable
// TODO     }
// TODO }
//-----------------------------
// TODO {
// TODO     my $counter;
// TODO     sub next_counter { return ++$counter }
// TODO }
//-----------------------------
// TODO BEGIN {
// TODO     my $counter = 42;
// TODO     sub next_counter { return ++$counter }
// TODO     sub prev_counter { return --$counter }
// TODO }
//-----------------------------

// ^^PLEAC^^_10.4
//-----------------------------
// TODO $this_function = (caller(0))[3];
//-----------------------------
// TODO ($package, $filename, $line, $subr, $has_args, $wantarray )= caller($i);
//   0         1         2       3       4          5
//-----------------------------
// TODO $me  = whoami();
// TODO $him = whowasi();

// TODO sub whoami  { (caller(1))[3] }
// TODO sub whowasi { (caller(2))[3] }
//-----------------------------

// ^^PLEAC^^_10.5
//-----------------------------
// TODO array_diff( \@array1, \@array2 );
//-----------------------------
// TODO @a = (1, 2);
// TODO @b = (5, 8);
// TODO @c = add_vecpair( \@a, \@b );
// TODO print "@c\n";
// TODO 6 10
// TODO  

// TODO sub add_vecpair {       # assumes both vectors the same length
// TODO     my ($x, $y) = @_;   # copy in the array references
// TODO     my @result;

// TODO     for (my $i=0; $i < @$x; $i++) {
// TODO       $result[$i] = $x->[$i] + $y->[$i];
// TODO     }

// TODO     return @result;
// TODO }
//-----------------------------
// TODO unless (@_ == 2 && ref($x) eq 'ARRAY' && ref($y) eq 'ARRAY') {
// TODO     die "usage: add_vecpair ARRAYREF1 ARRAYREF2";
// TODO }
//-----------------------------

// ^^PLEAC^^_10.6
//-----------------------------
// TODO if (wantarray()) {
// TODO     # list context
// TODO } 
// TODO elsif (defined wantarray()) {
// TODO     # scalar context
// TODO } 
// TODO else {
// TODO     # void context
// TODO } 
//-----------------------------
// TODO if (wantarray()) {
// TODO     print "In list context\n";
// TODO     return @many_things;
// TODO } elsif (defined wantarray()) {
// TODO     print "In scalar context\n";
// TODO     return $one_thing;
// TODO } else {
// TODO     print "In void context\n";
// TODO     return;  # nothing
// TODO }

// TODO mysub();                    # void context

// TODO $a = mysub();               # scalar context
// TODO if (mysub()) {  }           # scalar context

// TODO @a = mysub();               # list context
// TODO print mysub();              # list context
//-----------------------------

// ^^PLEAC^^_10.7
//-----------------------------
// TODO thefunc(INCREMENT => "20s", START => "+5m", FINISH => "+30m");
// TODO thefunc(START => "+5m", FINISH => "+30m");
// TODO thefunc(FINISH => "+30m");
// TODO thefunc(START => "+5m", INCREMENT => "15s");
//-----------------------------
// TODO sub thefunc {
// TODO     my %args = ( 
// TODO         INCREMENT   => '10s', 
// TODO         FINISH      => 0, 
// TODO         START       => 0, 
// TODO         @_,         # argument pair list goes here
// TODO     );
// TODO     if ($args{INCREMENT}  =~ /m$/ ) { ..... }
// TODO } 
//-----------------------------

// ^^PLEAC^^_10.8
//-----------------------------
// TODO ($a, undef, $c) = func();
//-----------------------------
// TODO ($a, $c) = (func())[0,2];
//-----------------------------
// TODO ($dev,$ino,$DUMMY,$DUMMY,$uid) = stat($filename);
//-----------------------------
// TODO ($dev,$ino,undef,undef,$uid)   = stat($filename);
//-----------------------------
// TODO ($dev,$ino,$uid,$gid)   = (stat($filename))[0,1,4,5];
//-----------------------------
// TODO () = some_function();
//-----------------------------

// ^^PLEAC^^_10.9
//-----------------------------
// TODO ($array_ref, $hash_ref) = somefunc();

// TODO sub somefunc {
// TODO     my @array;
// TODO     my %hash;

// TODO     # ...

// TODO     return ( \@array, \%hash );
// TODO }
//-----------------------------
// TODO sub fn { 
// TODO     .....
// TODO     return (\%a, \%b, \%c); # or                           
// TODO     return \(%a,  %b,  %c); # same thing
// TODO }
//-----------------------------
// TODO (%h0, %h1, %h2)  = fn();    # WRONG!
// TODO @array_of_hashes = fn();    # eg: $array_of_hashes[2]->{"keystring"}
// TODO ($r0, $r1, $r2)  = fn();    # eg: $r2->{"keystring"}

//-----------------------------

// ^^PLEAC^^_10.10
//-----------------------------
// TODO return;
//-----------------------------
// TODO sub empty_retval {
// TODO     return ( wantarray ? () : undef );
// TODO }
//-----------------------------
// TODO if (@a = yourfunc()) { ... }
//-----------------------------
// TODO unless ($a = sfunc()) { die "sfunc failed" }
// TODO unless (@a = afunc()) { die "afunc failed" }
// TODO unless (%a = hfunc()) { die "hfunc failed" }
//-----------------------------
// TODO ioctl(....) or die "can't ioctl: $!";
//-----------------------------

// ^^PLEAC^^_10.11
//-----------------------------
// TODO @results = myfunc 3, 5;
//-----------------------------
// TODO @results = myfunc(3, 5);
//-----------------------------
// TODO sub myfunc($);
// TODO @results = myfunc 3, 5;
//-----------------------------
// TODO @results = ( myfunc(3), 5 );
//-----------------------------
// TODO sub LOCK_SH () { 1 }
// TODO sub LOCK_EX () { 2 }
// TODO sub LOCK_UN () { 4 }
//-----------------------------
// TODO sub mypush (\@@) {
// TODO   my $array_ref = shift;
// TODO   my @remainder = @_;

// TODO   # ...
// TODO }
//-----------------------------
// TODO  mypush( $x > 10 ? @a : @b , 3, 5 );          # WRONG
//-----------------------------
// TODO  mypush( @{ $x > 10 ? \@a : \@b }, 3, 5 );    # RIGHT
//-----------------------------
// TODO sub hpush(\%@) {
// TODO     my $href = shift;
// TODO     while ( my ($k, $v) = splice(@_, 0, 2) ) {
// TODO         $href->{$k} = $v;
// TODO     } 
// TODO } 
// TODO hpush(%pieces, "queen" => 9, "rook" => 5);
//-----------------------------

// ^^PLEAC^^_10.12
//-----------------------------
// TODO die "some message";         # raise exception
//-----------------------------
// TODO eval { func() };
// TODO if ($@) {
// TODO     warn "func raised an exception: $@";
// TODO } 
//-----------------------------
// TODO eval { $val = func() };
// TODO warn "func blew up: $@" if $@;
//-----------------------------
// TODO eval { $val = func() };
// TODO if ($@ && $@ !~ /Full moon!/) {
// TODO     die;    # re-raise unknown errors
// TODO }
//-----------------------------
// TODO if (defined wantarray()) {
// TODO         return;
// TODO } else {
// TODO     die "pay attention to my error!";
// TODO }
//-----------------------------

// ^^PLEAC^^_10.13
//-----------------------------
// TODO $age = 18;          # global variable
// TODO if (CONDITION) {
// TODO     local $age = 23;
// TODO     func();         # sees temporary value of 23
// TODO } # restore old value at block exit
//-----------------------------
// TODO $para = get_paragraph(*FH);        # pass filehandle glob 
// TODO $para = get_paragraph(\*FH);       # pass filehandle by glob reference
// TODO $para = get_paragraph(*IO{FH});    # pass filehandle by IO reference
// TODO sub get_paragraph {
// TODO     my $fh = shift;  
// TODO     local $/ = '';        
// TODO     my $paragraph = <$fh>;
// TODO     chomp($paragraph);
// TODO     return $paragraph;
// TODO } 
//-----------------------------
// TODO $contents = get_motd();
// TODO sub get_motd {
// TODO     local *MOTD;
// TODO     open(MOTD, "/etc/motd")        or die "can't open motd: $!";
// TODO     local $/ = undef;  # slurp full file;
// TODO     local $_ = <MOTD>;
// TODO     close (MOTD);
// TODO     return $_;
// TODO } 
//-----------------------------
// TODO return *MOTD;
//-----------------------------
// TODO my @nums = (0 .. 5);
// TODO sub first { 
// TODO     local $nums[3] = 3.14159;
// TODO     second();
// TODO }
// TODO sub second {
// TODO     print "@nums\n";
// TODO } 
// TODO second();
// TODO 0 1 2 3 4 5

// TODO first();
// TODO 0 1 2 3.14159 4 5
//-----------------------------
// TODO sub first {
// TODO     local $SIG{INT} = 'IGNORE';
// TODO     second();
// TODO } 
//-----------------------------
// TODO sub func {
// TODO     local($x, $y) = @_;
// TODO     #....
// TODO } 
//-----------------------------
// TODO sub func {
// TODO     my($x, $y) = @_;
// TODO     #....
// TODO } 
//-----------------------------
// TODO &func(*Global_Array);
// TODO sub func {
// TODO     local(*aliased_array) = shift;
// TODO     for (@aliased_array) { .... }
// TODO } 
//-----------------------------
// TODO func(\@Global_Array);
// TODO sub func {
// TODO     my $array_ref  = shift;
// TODO     for (@$array_ref) { .... }
// TODO } 
//-----------------------------

// ^^PLEAC^^_10.14
//-----------------------------
// TODO undef &grow;                # silence -w complaints of redefinition
// TODO *grow = \&expand;           
// TODO grow();                     # calls expand()

// TODO {
// TODO     local *grow = \&shrink;         # only until this block exists
// TODO         grow();                 # calls shrink()
// TODO }
//-----------------------------
// TODO *one::var = \%two::Table;   # make %one::var alias for %two::Table
// TODO *one::big = \&two::small;   # make &one::big alias for &two::small
//-----------------------------
// TODO local *fred = \&barney;     # temporarily alias &fred to &barney
//-----------------------------
// TODO $string =  red("careful here");
// TODO print $string;
// TODO <FONT COLOR='red'>careful here</FONT>
//-----------------------------
// TODO sub red { "<FONT COLOR='red'>@_</FONT>" }
//-----------------------------
// TODO sub color_font {
// TODO     my $color = shift;
// TODO     return "<FONT COLOR='$color'>@_</FONT>";
// TODO }
// TODO sub red    { color_font("red", @_)     }
// TODO sub green  { color_font("green", @_)   }
// TODO sub blue   { color_font("blue", @_)    }
// TODO sub purple { color_font("purple", @_)  }
// etc
//-----------------------------
// TODO @colors = qw(red blue green yellow orange purple violet);
// TODO for my $name (@colors) {
// TODO     no strict 'refs';
// TODO     *$name = sub { "<FONT COLOR='$name'>@_</FONT>" };
// TODO } 
//-----------------------------
// TODO *$name = sub ($) { "<FONT COLOR='$name'>$_[0]</FONT>" };
//-----------------------------

// ^^PLEAC^^_10.15
//-----------------------------
// TODO sub AUTOLOAD {
// TODO     use vars qw($AUTOLOAD);
// TODO     my $color = $AUTOLOAD;
// TODO     $color =~ s/.*:://;
// TODO     return "<FONT COLOR='$color'>@_</FONT>";
// TODO } 
//note: sub chartreuse isn't defined.
// TODO print chartreuse("stuff");
//-----------------------------
// TODO {
// TODO     local *yellow = \&violet;  
// TODO     local (*red, *green) = (\&green, \&red);
// TODO     print_stuff();
// TODO } 
//-----------------------------

// ^^PLEAC^^_10.16
//-----------------------------
// TODO sub outer {
// TODO     my $x = $_[0] + 35;
// TODO     sub inner { return $x * 19 }   # WRONG
// TODO     return $x + inner();
// TODO } 
//-----------------------------
// TODO sub outer {
// TODO     my $x = $_[0] + 35;
// TODO     local *inner = sub { return $x * 19 };
// TODO     return $x + inner();
// TODO } 
//-----------------------------

// ^^PLEAC^^_10.17
//-----------------------------
// ^^INCLUDE^^ include/perl/ch10/bysub1
//-----------------------------
// ^^INCLUDE^^ include/perl/ch10/bysub2
//-----------------------------
// ^^INCLUDE^^ include/perl/ch10/bysub3
//-----------------------------
// ^^INCLUDE^^ include/perl/ch10/datesort
//-----------------------------
