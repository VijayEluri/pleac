// <PLEAC>
// -*- java -*-
// @@PLEAC@@_NAME
// @@SKIP@@ Java

// @@PLEAC@@_WEB
// @@SKIP@@ http://java.sun.com

package org.nicerobot.pleac;

/**
 * @author nicerobot
 * 
 */
public class _10 {
  public static void _00 () {
  // <PLEAC>

  // ^^PLEAC^^_10.0
  // -----------------------------
  // TODO perl -> sub hello {
  // TODO perl -> $greeted++; # global variable
  // TODO perl -> print "hi there!\n";
  // TODO perl -> }
  // -----------------------------
  // TODO perl -> hello(); # call subroutine hello with no arguments/parameters
  // -----------------------------
  // TODO perl ->
  // </PLEAC>
  }

  public static void _01 () {
  // <PLEAC>

  // ^^PLEAC^^_10.1
  // -----------------------------
  // TODO perl -> sub hypotenuse {
  // TODO perl -> return sqrt( ($_[0] ** 2) + ($_[1] ** 2) );
  // TODO perl -> }
  // TODO perl ->
  // TODO perl -> $diag = hypotenuse(3,4); # $diag is 5
  // -----------------------------
  // TODO perl -> sub hypotenuse {
  // TODO perl -> my ($side1, $side2) = @_;
  // TODO perl -> return sqrt( ($side1 ** 2) + ($side2 ** 2) );
  // TODO perl -> }
  // -----------------------------
  // TODO perl -> print hypotenuse(3, 4), "\n"; # prints 5
  // TODO perl ->
  // TODO perl -> @a = (3, 4);
  // TODO perl -> print hypotenuse(@a), "\n"; # prints 5
  // -----------------------------
  // TODO perl -> @both = (@men, @women);
  // -----------------------------
  // TODO perl -> @nums = (1.4, 3.5, 6.7);
  // TODO perl -> @ints = int_all(@nums); # @nums unchanged
  // TODO perl -> sub int_all {
  // TODO perl -> my @retlist = @_; # make safe copy for return
  // TODO perl -> for my $n (@retlist) { $n = int($n) }
  // TODO perl -> return @retlist;
  // TODO perl -> }
  // -----------------------------
  // TODO perl -> @nums = (1.4, 3.5, 6.7);
  // TODO perl -> trunc_em(@nums); # @nums now (1,3,6)
  // TODO perl -> sub trunc_em {
  // TODO perl -> for (@_) { $_ = int($_) } # truncate each argument
  // TODO perl -> }
  // -----------------------------
  // TODO perl -> $line = chomp(<>); # WRONG
  // -----------------------------
  // TODO perl ->
  // </PLEAC>
  }

  public static void _02 () {
  // <PLEAC>

  // ^^PLEAC^^_10.2
  // -----------------------------
  // TODO perl -> sub somefunc {
  // TODO perl -> my $variable; # $variable is invisible outside somefunc()
  // TODO perl -> my ($another, @an_array, %a_hash); # declaring many variables at once
  // TODO perl ->
  // TODO perl -> # ...
  // TODO perl -> }
  // -----------------------------
  // TODO perl -> my ($name, $age) = @ARGV;
  // TODO perl -> my $start = fetch_time();
  // -----------------------------
  // TODO perl -> my ($a, $b) = @pair;
  // TODO perl -> my $c = fetch_time();
  // TODO perl ->
  // TODO perl -> sub check_x {
  // TODO perl -> my $x = $_[0];
  // TODO perl -> my $y = "whatever";
  // TODO perl -> run_check();
  // TODO perl -> if ($condition) {
  // TODO perl -> print "got $x\n";
  // TODO perl -> }
  // TODO perl -> }
  // -----------------------------
  // TODO perl -> sub save_array {
  // TODO perl -> my @arguments = @_;
  // TODO perl -> push(@Global_Array, \@arguments);
  // TODO perl -> }
  // -----------------------------
  // TODO perl ->
  // </PLEAC>
  }

  public static void _03 () {
  // <PLEAC>

  // ^^PLEAC^^_10.3
  // -----------------------------
  // TODO perl -> {
  // TODO perl -> my $variable;
  // TODO perl -> sub mysub {
  // TODO perl -> # ... accessing $variable
  // TODO perl -> }
  // TODO perl -> }
  // -----------------------------
  // TODO perl -> BEGIN {
  // TODO perl -> my $variable = 1; # initial value
  // TODO perl -> sub othersub { # ... accessing $variable
  // TODO perl -> }
  // TODO perl -> }
  // -----------------------------
  // TODO perl -> {
  // TODO perl -> my $counter;
  // TODO perl -> sub next_counter { return ++$counter }
  // TODO perl -> }
  // -----------------------------
  // TODO perl -> BEGIN {
  // TODO perl -> my $counter = 42;
  // TODO perl -> sub next_counter { return ++$counter }
  // TODO perl -> sub prev_counter { return --$counter }
  // TODO perl -> }
  // -----------------------------
  // TODO perl ->
  // </PLEAC>
  }

  public static void _04 () {
  // <PLEAC>

  // ^^PLEAC^^_10.4
  // -----------------------------
  // TODO perl -> $this_function = (caller(0))[3];
  // -----------------------------
  // TODO perl -> ($package, $filename, $line, $subr, $has_args, $wantarray )= caller($i);
  // 0 1 2 3 4 5
  // -----------------------------
  // TODO perl -> $me = whoami();
  // TODO perl -> $him = whowasi();
  // TODO perl ->
  // TODO perl -> sub whoami { (caller(1))[3] }
  // TODO perl -> sub whowasi { (caller(2))[3] }
  // -----------------------------
  // TODO perl ->
  // </PLEAC>
  }

  public static void _05 () {
  // <PLEAC>

  // ^^PLEAC^^_10.5
  // -----------------------------
  // TODO perl -> array_diff( \@array1, \@array2 );
  // -----------------------------
  // TODO perl -> @a = (1, 2);
  // TODO perl -> @b = (5, 8);
  // TODO perl -> @c = add_vecpair( \@a, \@b );
  // TODO perl -> print "@c\n";
  // TODO perl -> 6 10
  // TODO perl ->
  // TODO perl ->
  // TODO perl -> sub add_vecpair { # assumes both vectors the same length
  // TODO perl -> my ($x, $y) = @_; # copy in the array references
  // TODO perl -> my @result;
  // TODO perl ->
  // TODO perl -> for (my $i=0; $i < @$x; $i++) {
  // TODO perl -> $result[$i] = $x->[$i] + $y->[$i];
  // TODO perl -> }
  // TODO perl ->
  // TODO perl -> return @result;
  // TODO perl -> }
  // -----------------------------
  // TODO perl -> unless (@_ == 2 && ref($x) eq 'ARRAY' && ref($y) eq 'ARRAY') {
  // TODO perl -> die "usage: add_vecpair ARRAYREF1 ARRAYREF2";
  // TODO perl -> }
  // -----------------------------
  // TODO perl ->
  // </PLEAC>
  }

  public static void _06 () {
  // <PLEAC>

  // ^^PLEAC^^_10.6
  // -----------------------------
  // TODO perl -> if (wantarray()) {
  // TODO perl -> # list context
  // TODO perl -> }
  // TODO perl -> elsif (defined wantarray()) {
  // TODO perl -> # scalar context
  // TODO perl -> }
  // TODO perl -> else {
  // TODO perl -> # void context
  // TODO perl -> }
  // -----------------------------
  // TODO perl -> if (wantarray()) {
  // TODO perl -> print "In list context\n";
  // TODO perl -> return @many_things;
  // TODO perl -> } elsif (defined wantarray()) {
  // TODO perl -> print "In scalar context\n";
  // TODO perl -> return $one_thing;
  // TODO perl -> } else {
  // TODO perl -> print "In void context\n";
  // TODO perl -> return; # nothing
  // TODO perl -> }
  // TODO perl ->
  // TODO perl -> mysub(); # void context
  // TODO perl ->
  // TODO perl -> $a = mysub(); # scalar context
  // TODO perl -> if (mysub()) { } # scalar context
  // TODO perl ->
  // TODO perl -> @a = mysub(); # list context
  // TODO perl -> print mysub(); # list context
  // -----------------------------
  // TODO perl ->
  // </PLEAC>
  }

  public static void _07 () {
  // <PLEAC>

  // ^^PLEAC^^_10.7
  // -----------------------------
  // TODO perl -> thefunc(INCREMENT => "20s", START => "+5m", FINISH => "+30m");
  // TODO perl -> thefunc(START => "+5m", FINISH => "+30m");
  // TODO perl -> thefunc(FINISH => "+30m");
  // TODO perl -> thefunc(START => "+5m", INCREMENT => "15s");
  // -----------------------------
  // TODO perl -> sub thefunc {
  // TODO perl -> my %args = (
  // TODO perl -> INCREMENT => '10s',
  // TODO perl -> FINISH => 0,
  // TODO perl -> START => 0,
  // TODO perl -> @_, # argument pair list goes here
  // TODO perl -> );
  // TODO perl -> if ($args{INCREMENT} =~ /m$/ ) { ..... }
  // TODO perl -> }
  // -----------------------------
  // TODO perl ->
  // </PLEAC>
  }

  public static void _08 () {
  // <PLEAC>

  // ^^PLEAC^^_10.8
  // -----------------------------
  // TODO perl -> ($a, undef, $c) = func();
  // -----------------------------
  // TODO perl -> ($a, $c) = (func())[0,2];
  // -----------------------------
  // TODO perl -> ($dev,$ino,$DUMMY,$DUMMY,$uid) = stat($filename);
  // -----------------------------
  // TODO perl -> ($dev,$ino,undef,undef,$uid) = stat($filename);
  // -----------------------------
  // TODO perl -> ($dev,$ino,$uid,$gid) = (stat($filename))[0,1,4,5];
  // -----------------------------
  // TODO perl -> () = some_function();
  // -----------------------------
  // TODO perl ->
  // </PLEAC>
  }

  public static void _09 () {
  // <PLEAC>

  // ^^PLEAC^^_10.9
  // -----------------------------
  // TODO perl -> ($array_ref, $hash_ref) = somefunc();
  // TODO perl ->
  // TODO perl -> sub somefunc {
  // TODO perl -> my @array;
  // TODO perl -> my %hash;
  // TODO perl ->
  // TODO perl -> # ...
  // TODO perl ->
  // TODO perl -> return ( \@array, \%hash );
  // TODO perl -> }
  // -----------------------------
  // TODO perl -> sub fn {
  // TODO perl -> .....
  // TODO perl -> return (\%a, \%b, \%c); # or
  // TODO perl -> return \(%a, %b, %c); # same thing
  // TODO perl -> }
  // -----------------------------
  // TODO perl -> (%h0, %h1, %h2) = fn(); # WRONG!
  // TODO perl -> @array_of_hashes = fn(); # eg: $array_of_hashes[2]->{"keystring"}
  // TODO perl -> ($r0, $r1, $r2) = fn(); # eg: $r2->{"keystring"}
  // TODO perl ->
  // -----------------------------
  // TODO perl ->
  // </PLEAC>
  }

  public static void _10 () {
  // <PLEAC>

  // ^^PLEAC^^_10.10
  // -----------------------------
  // TODO perl -> return;
  // -----------------------------
  // TODO perl -> sub empty_retval {
  // TODO perl -> return ( wantarray ? () : undef );
  // TODO perl -> }
  // -----------------------------
  // TODO perl -> if (@a = yourfunc()) { ... }
  // -----------------------------
  // TODO perl -> unless ($a = sfunc()) { die "sfunc failed" }
  // TODO perl -> unless (@a = afunc()) { die "afunc failed" }
  // TODO perl -> unless (%a = hfunc()) { die "hfunc failed" }
  // -----------------------------
  // TODO perl -> ioctl(....) or die "can't ioctl: $!";
  // -----------------------------
  // TODO perl ->
  // </PLEAC>
  }

  public static void _11 () {
  // <PLEAC>

  // ^^PLEAC^^_10.11
  // -----------------------------
  // TODO perl -> @results = myfunc 3, 5;
  // -----------------------------
  // TODO perl -> @results = myfunc(3, 5);
  // -----------------------------
  // TODO perl -> sub myfunc($);
  // TODO perl -> @results = myfunc 3, 5;
  // -----------------------------
  // TODO perl -> @results = ( myfunc(3), 5 );
  // -----------------------------
  // TODO perl -> sub LOCK_SH() { 1 } # Shared lock (for reading)
  // TODO perl -> sub LOCK_EX() { 2 } # Exclusive lock (for writing)
  // TODO perl -> sub LOCK_NB() { 4 } # Non-blocking request (don't stall)
  // -----------------------------
  // TODO perl -> sub mypush (\@@) {
  // TODO perl -> my $array_ref = shift;
  // TODO perl -> my @remainder = @_;
  // TODO perl ->
  // TODO perl -> # ...
  // TODO perl -> }
  // -----------------------------
  // TODO perl -> mypush( $x > 10 ? @a : @b , 3, 5 ); # WRONG
  // -----------------------------
  // TODO perl -> mypush( @{ $x > 10 ? \@a : \@b }, 3, 5 ); # RIGHT
  // -----------------------------
  // TODO perl -> sub hpush(\%@) {
  // TODO perl -> my $href = shift;
  // TODO perl -> while ( my ($k, $v) = splice(@_, 0, 2) ) {
  // TODO perl -> $href->{$k} = $v;
  // TODO perl -> }
  // TODO perl -> }
  // TODO perl -> hpush(%pieces, "queen" => 9, "rook" => 5);
  // -----------------------------
  // TODO perl ->
  // </PLEAC>
  }

  public static void _12 () {
  // <PLEAC>

  // ^^PLEAC^^_10.12
  // -----------------------------
  // TODO perl -> die "some message"; # raise exception
  // -----------------------------
  // TODO perl -> eval { func() };
  // TODO perl -> if ($@) {
  // TODO perl -> warn "func raised an exception: $@";
  // TODO perl -> }
  // -----------------------------
  // TODO perl -> eval { $val = func() };
  // TODO perl -> warn "func blew up: $@" if $@;
  // -----------------------------
  // TODO perl -> eval { $val = func() };
  // TODO perl -> if ($@ && $@ !~ /Full moon!/) {
  // TODO perl -> die; # re-raise unknown errors
  // TODO perl -> }
  // -----------------------------
  // TODO perl -> if (defined wantarray()) {
  // TODO perl -> return;
  // TODO perl -> } else {
  // TODO perl -> die "pay attention to my error!";
  // TODO perl -> }
  // -----------------------------
  // TODO perl ->
  // </PLEAC>
  }

  public static void _13 () {
  // <PLEAC>

  // ^^PLEAC^^_10.13
  // -----------------------------
  // TODO perl -> $age = 18; # global variable
  // TODO perl -> if (CONDITION) {
  // TODO perl -> local $age = 23;
  // TODO perl -> func(); # sees temporary value of 23
  // TODO perl -> } # restore old value at block exit
  // -----------------------------
  // TODO perl -> $para = get_paragraph(*FH); # pass filehandle glob
  // TODO perl -> $para = get_paragraph(\*FH); # pass filehandle by glob reference
  // TODO perl -> $para = get_paragraph(*IO{FH}); # pass filehandle by IO reference
  // TODO perl -> sub get_paragraph {
  // TODO perl -> my $fh = shift;
  // TODO perl -> local $/ = '';
  // TODO perl -> my $paragraph = <$fh>;
  // TODO perl -> chomp($paragraph);
  // TODO perl -> return $paragraph;
  // TODO perl -> }
  // -----------------------------
  // TODO perl -> $contents = get_motd();
  // TODO perl -> sub get_motd {
  // TODO perl -> local *MOTD;
  // TODO perl -> open(MOTD, "/etc/motd") or die "can't open motd: $!";
  // TODO perl -> local $/ = undef; # slurp full file;
  // TODO perl -> local $_ = <MOTD>;
  // TODO perl -> close (MOTD);
  // TODO perl -> return $_;
  // TODO perl -> }
  // -----------------------------
  // TODO perl -> return *MOTD;
  // -----------------------------
  // TODO perl -> my @nums = (0 .. 5);
  // TODO perl -> sub first {
  // TODO perl -> local $nums[3] = 3.14159;
  // TODO perl -> second();
  // TODO perl -> }
  // TODO perl -> sub second {
  // TODO perl -> print "@nums\n";
  // TODO perl -> }
  // TODO perl -> second();
  // TODO perl -> 0 1 2 3 4 5
  // TODO perl ->
  // TODO perl -> first();
  // TODO perl -> 0 1 2 3.14159 4 5
  // -----------------------------
  // TODO perl -> sub first {
  // TODO perl -> local $SIG{INT} = 'IGNORE';
  // TODO perl -> second();
  // TODO perl -> }
  // -----------------------------
  // TODO perl -> sub func {
  // TODO perl -> local($x, $y) = @_;
  // TODO perl -> #....
  // TODO perl -> }
  // -----------------------------
  // TODO perl -> sub func {
  // TODO perl -> my($x, $y) = @_;
  // TODO perl -> #....
  // TODO perl -> }
  // -----------------------------
  // TODO perl -> &func(*Global_Array);
  // TODO perl -> sub func {
  // TODO perl -> local(*aliased_array) = shift;
  // TODO perl -> for (@aliased_array) { .... }
  // TODO perl -> }
  // -----------------------------
  // TODO perl -> func(\@Global_Array);
  // TODO perl -> sub func {
  // TODO perl -> my $array_ref = shift;
  // TODO perl -> for (@$array_ref) { .... }
  // TODO perl -> }
  // -----------------------------
  // TODO perl ->
  // </PLEAC>
  }

  public static void _14 () {
  // <PLEAC>

  // ^^PLEAC^^_10.14
  // -----------------------------
  // TODO perl -> undef &grow; # silence -w complaints of redefinition
  // TODO perl -> *grow = \&expand;
  // TODO perl -> grow(); # calls expand()
  // TODO perl ->
  // TODO perl -> {
  // TODO perl -> local *grow = \&shrink; # only until this block exists
  // TODO perl -> grow(); # calls shrink()
  // TODO perl -> }
  // -----------------------------
  // TODO perl -> *one::var = \%two::Table; # make %one::var alias for %two::Table
  // TODO perl -> *one::big = \&two::small; # make &one::big alias for &two::small
  // -----------------------------
  // TODO perl -> local *fred = \&barney; # temporarily alias &fred to &barney
  // -----------------------------
  // TODO perl -> $string = red("careful here");
  // TODO perl -> print $string;
  // TODO perl -> <FONT COLOR='red'>careful here</FONT>
  // -----------------------------
  // TODO perl -> sub red { "<FONT COLOR='red'>@_</FONT>" }
  // -----------------------------
  // TODO perl -> sub color_font {
  // TODO perl -> my $color = shift;
  // TODO perl -> return "<FONT COLOR='$color'>@_</FONT>";
  // TODO perl -> }
  // TODO perl -> sub red { color_font("red", @_) }
  // TODO perl -> sub green { color_font("green", @_) }
  // TODO perl -> sub blue { color_font("blue", @_) }
  // TODO perl -> sub purple { color_font("purple", @_) }
  // etc
  // -----------------------------
  // TODO perl -> @colors = qw(red blue green yellow orange purple violet);
  // TODO perl -> for my $name (@colors) {
  // TODO perl -> no strict 'refs';
  // TODO perl -> *$name = sub { "<FONT COLOR='$name'>@_</FONT>" };
  // TODO perl -> }
  // -----------------------------
  // TODO perl -> *$name = sub ($) { "<FONT COLOR='$name'>$_[0]</FONT>" };
  // -----------------------------
  // TODO perl ->
  // </PLEAC>
  }

  public static void _15 () {
  // <PLEAC>

  // ^^PLEAC^^_10.15
  // -----------------------------
  // TODO perl -> sub AUTOLOAD {
  // TODO perl -> use vars qw($AUTOLOAD);
  // TODO perl -> my $color = $AUTOLOAD;
  // TODO perl -> $color =~ s/.*:://;
  // TODO perl -> return "<FONT COLOR='$color'>@_</FONT>";
  // TODO perl -> }
  // note: sub chartreuse isn't defined.
  // TODO perl -> print chartreuse("stuff");
  // -----------------------------
  // TODO perl -> {
  // TODO perl -> local *yellow = \&violet;
  // TODO perl -> local (*red, *green) = (\&green, \&red);
  // TODO perl -> print_stuff();
  // TODO perl -> }
  // -----------------------------
  // TODO perl ->
  // </PLEAC>
  }

  public static void _16 () {
  // <PLEAC>

  // ^^PLEAC^^_10.16
  // -----------------------------
  // TODO perl -> sub outer {
  // TODO perl -> my $x = $_[0] + 35;
  // TODO perl -> sub inner { return $x * 19 } # WRONG
  // TODO perl -> return $x + inner();
  // TODO perl -> }
  // -----------------------------
  // TODO perl -> sub outer {
  // TODO perl -> my $x = $_[0] + 35;
  // TODO perl -> local *inner = sub { return $x * 19 };
  // TODO perl -> return $x + inner();
  // TODO perl -> }
  // -----------------------------
  // TODO perl ->
  // </PLEAC>
  }

  public static void _17 () {
  // <PLEAC>

  // ^^PLEAC^^_10.17
  // -----------------------------
  // ^^INCLUDE^^ include/perl/ch10/bysub1
  // -----------------------------
  // ^^INCLUDE^^ include/perl/ch10/bysub2
  // -----------------------------
  // ^^INCLUDE^^ include/perl/ch10/bysub3
  // -----------------------------
  // ^^INCLUDE^^ include/perl/ch10/datesort
  // -----------------------------
  // TODO perl ->
  // </PLEAC>
  }
}
