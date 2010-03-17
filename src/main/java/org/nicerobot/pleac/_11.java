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
public class _11 {

  public static void _00 () {
  // <PLEAC>

  // ^^PLEAC^^_11.0
  // -----------------------------
  // TODO perl -> print $$sref; # prints the scalar value that the reference $sref refers to
  // TODO perl -> $$sref = 3; # assigns to $sref's referent
  // -----------------------------
  // TODO perl -> print ${$sref}; # prints the scalar $sref refers to
  // TODO perl -> ${$sref} = 3; # assigns to $sref's referent
  // -----------------------------
  // TODO perl -> $aref = \@array;
  // -----------------------------
  // TODO perl -> $pi = \3.14159;
  // TODO perl -> $$pi = 4; # runtime error
  // -----------------------------
  // TODO perl -> $aref = [ 3, 4, 5 ]; # new anonymous array
  // TODO perl -> $href = { "How" => "Now", "Brown" => "Cow" }; # new anonymous hash
  // -----------------------------
  // TODO perl -> undef $aref;
  // TODO perl -> @$aref = (1, 2, 3);
  // TODO perl -> print $aref;
  // TODO perl -> ARRAY(0x80c04f0)
  // -----------------------------
  // TODO perl -> $a[4][23][53][21] = "fred";
  // TODO perl -> print $a[4][23][53][21];
  // TODO perl -> fred
  // TODO perl ->
  // TODO perl -> print $a[4][23][53];
  // TODO perl -> ARRAY(0x81e2494)
  // TODO perl ->
  // TODO perl -> print $a[4][23];
  // TODO perl -> ARRAY(0x81e0748)
  // TODO perl ->
  // TODO perl -> print $a[4];
  // TODO perl -> ARRAY(0x822cd40)
  // -----------------------------
  // TODO perl -> $op_cit = cite($ibid) or die "couldn't make a reference";
  // -----------------------------
  // TODO perl -> $Nat = { "Name" => "Leonhard Euler",
  // TODO perl -> "Address" => "1729 Ramanujan Lane\nMathworld, PI 31416",
  // TODO perl -> "Birthday" => 0x5bb5580,
  // TODO perl -> };
  // -----------------------------
  // TODO perl ->
  // </PLEAC>
  }

  public static void _01 () {
  // <PLEAC>

  // ^^PLEAC^^_11.1
  // -----------------------------
  // TODO perl -> $aref = \@array;
  // TODO perl -> $anon_array = [1, 3, 5, 7, 9];
  // TODO perl -> $anon_copy = [ @array ];
  // TODO perl -> @$implicit_creation = (2, 4, 6, 8, 10);
  // -----------------------------
  // TODO perl -> push(@$anon_array, 11);
  // -----------------------------
  // TODO perl -> $two = $implicit_creation->[0];
  // -----------------------------
  // TODO perl -> $last_idx = $#$aref;
  // TODO perl -> $num_items = @$aref;
  // -----------------------------
  // TODO perl -> $last_idx = $#{ $aref };
  // TODO perl -> $num_items = scalar @{ $aref };
  // -----------------------------
  // check whether $someref contains a simple array reference
  // TODO perl -> if (ref($someref) ne 'ARRAY') {
  // TODO perl -> die "Expected an array reference, not $someref\n";
  // TODO perl -> }
  // TODO perl ->
  // TODO perl -> print "@{$array_ref}\n"; # print original data
  // TODO perl ->
  // TODO perl -> @order = sort @{ $array_ref }; # sort it
  // TODO perl ->
  // TODO perl -> push @{ $array_ref }, $item; # append new element to orig array
  // -----------------------------
  // TODO perl -> sub array_ref {
  // TODO perl -> my @array;
  // TODO perl -> return \@array;
  // TODO perl -> }
  // TODO perl ->
  // TODO perl -> $aref1 = array_ref();
  // TODO perl -> $aref2 = array_ref();
  // -----------------------------
  // TODO perl -> print $array_ref->[$N]; # access item in position N (best)
  // TODO perl -> print $$array_ref[$N]; # same, but confusing
  // TODO perl -> print ${$array_ref}[$N]; # same, but still confusing, and ugly to boot
  // -----------------------------
  // TODO perl -> @$pie[3..5]; # array slice, but a little confusing to read
  // TODO perl -> @{$pie}[3..5]; # array slice, easier (?) to read
  // -----------------------------
  // TODO perl -> @{$pie}[3..5] = ("blackberry", "blueberry", "pumpkin");
  // -----------------------------
  // TODO perl -> $sliceref = \@{$pie}[3..5]; # WRONG!
  // -----------------------------
  // TODO perl -> foreach $item ( @{$array_ref} ) {
  // TODO perl -> # $item has data
  // TODO perl -> }
  // TODO perl ->
  // TODO perl -> for ($idx = 0; $idx <= $#{ $array_ref }; $idx++) {
  // TODO perl -> # $array_ref->[$idx] has data
  // TODO perl -> }
  // -----------------------------
  // TODO perl ->
  // </PLEAC>
  }

  public static void _02 () {
  // <PLEAC>

  // ^^PLEAC^^_11.2
  // -----------------------------
  // TODO perl -> push(@{ $hash{"KEYNAME"} }, "new value");
  // -----------------------------
  // TODO perl -> foreach $string (keys %hash) {
  // TODO perl -> print "$string: @{$hash{$string}}\n";
  // TODO perl -> }
  // -----------------------------
  // TODO perl -> $hash{"a key"} = [ 3, 4, 5 ]; # anonymous array
  // -----------------------------
  // TODO perl -> @values = @{ $hash{"a key"} };
  // -----------------------------
  // TODO perl -> push @{ $hash{"a key"} }, $value;
  // -----------------------------
  // TODO perl -> @residents = @{ $phone2name{$number} };
  // -----------------------------
  // TODO perl -> @residents = exists( $phone2name{$number} )
  // TODO perl -> ? @{ $phone2name{$number} }
  // TODO perl -> : ();
  // -----------------------------
  // TODO perl ->
  // </PLEAC>
  }

  public static void _03 () {
  // <PLEAC>

  // ^^PLEAC^^_11.3
  // -----------------------------
  // TODO perl -> $href = \%hash;
  // TODO perl -> $anon_hash = { "key1" => "value1", "key2" => "value2", ... };
  // TODO perl -> $anon_hash_copy = { %hash };
  // -----------------------------
  // TODO perl -> %hash = %$href;
  // TODO perl -> $value = $href->{$key};
  // TODO perl -> @slice = @$href{$key1, $key2, $key3}; # note: no arrow!
  // TODO perl -> @keys = keys %$href;
  // -----------------------------
  // TODO perl -> if (ref($someref) ne 'HASH') {
  // TODO perl -> die "Expected a hash reference, not $someref\n";
  // TODO perl -> }
  // -----------------------------
  // TODO perl -> foreach $href ( \%ENV, \%INC ) { # OR: for $href ( \(%ENV,%INC) ) {
  // TODO perl -> foreach $key ( keys %$href ) {
  // TODO perl -> print "$key => $href->{$key}\n";
  // TODO perl -> }
  // TODO perl -> }
  // -----------------------------
  // TODO perl -> @values = @$hash_ref{"key1", "key2", "key3"};
  // TODO perl ->
  // TODO perl -> for $val (@$hash_ref{"key1", "key2", "key3"}) {
  // TODO perl -> $val += 7; # add 7 to each value in hash slice
  // TODO perl -> }
  // -----------------------------
  // TODO perl ->
  // </PLEAC>
  }

  public static void _04 () {
  // <PLEAC>

  // ^^PLEAC^^_11.4
  // -----------------------------
  // TODO perl -> $cref = \&func;
  // TODO perl -> $cref = sub { ... };
  // -----------------------------
  // TODO perl -> @returned = $cref->(@arguments);
  // TODO perl -> @returned = &$cref(@arguments);
  // -----------------------------
  // TODO perl -> $funcname = "thefunc";
  // TODO perl -> &$funcname();
  // -----------------------------
  // TODO perl -> my %commands = (
  // TODO perl -> "happy" => \&joy,
  // TODO perl -> "sad" => \&sullen,
  // TODO perl -> "done" => sub { die "See ya!" },
  // TODO perl -> "mad" => \&angry,
  // TODO perl -> );
  // TODO perl ->
  // TODO perl -> print "How are you? ";
  // TODO perl -> chomp($string = <STDIN>);
  // TODO perl -> if ($commands{$string}) {
  // TODO perl -> $commands{$string}->();
  // TODO perl -> } else {
  // TODO perl -> print "No such command: $string\n";
  // TODO perl -> }
  // -----------------------------
  // TODO perl -> sub counter_maker {
  // TODO perl -> my $start = 0;
  // TODO perl -> return sub { # this is a closure
  // TODO perl -> return $start++; # lexical from enclosing scope
  // TODO perl -> };
  // TODO perl -> }
  // TODO perl ->
  // TODO perl -> $counter = counter_maker();
  // TODO perl ->
  // TODO perl -> for ($i = 0; $i < 5; $i ++) {
  // TODO perl -> print &$counter, "\n";
  // TODO perl -> }
  // -----------------------------
  // TODO perl -> $counter1 = counter_maker();
  // TODO perl -> $counter2 = counter_maker();
  // TODO perl ->
  // TODO perl -> for ($i = 0; $i < 5; $i ++) {
  // TODO perl -> print &$counter1, "\n";
  // TODO perl -> }
  // TODO perl ->
  // TODO perl -> print &$counter1, " ", &$counter2, "\n";
  // TODO perl -> 0
  // TODO perl ->
  // TODO perl -> 1
  // TODO perl ->
  // TODO perl -> 2
  // TODO perl ->
  // TODO perl -> 3
  // TODO perl ->
  // TODO perl -> 4
  // TODO perl ->
  // TODO perl -> 5 0
  // -----------------------------
  // TODO perl -> sub timestamp {
  // TODO perl -> my $start_time = time();
  // TODO perl -> return sub { return time() - $start_time };
  // TODO perl -> }
  // TODO perl -> $early = timestamp();
  // TODO perl -> sleep 20;
  // TODO perl -> $later = timestamp();
  // TODO perl -> sleep 10;
  // TODO perl -> printf "It's been %d seconds since early.\n", $early->();
  // TODO perl -> printf "It's been %d seconds since later.\n", $later->();
  // It's been 30 seconds since early.
  //
  // It's been 10 seconds since later.
  // -----------------------------
  // TODO perl ->
  // </PLEAC>
  }

  public static void _05 () {
  // <PLEAC>

  // ^^PLEAC^^_11.5
  // -----------------------------
  // TODO perl -> $scalar_ref = \$scalar; # get reference to named scalar
  // -----------------------------
  // TODO perl -> undef $anon_scalar_ref;
  // TODO perl -> $$anon_scalar_ref = 15;
  // -----------------------------
  // TODO perl -> $anon_scalar_ref = \15;
  // -----------------------------
  // TODO perl -> print ${ $scalar_ref }; # dereference it
  // TODO perl -> ${ $scalar_ref } .= "string"; # alter referent's value
  // -----------------------------
  // TODO perl -> sub new_anon_scalar {
  // TODO perl -> my $temp;
  // TODO perl -> return \$temp;
  // TODO perl -> }
  // -----------------------------
  // TODO perl -> $sref = new_anon_scalar();
  // TODO perl -> $$sref = 3;
  // TODO perl -> print "Three = $$sref\n";
  // TODO perl -> @array_of_srefs = ( new_anon_scalar(), new_anon_scalar() );
  // TODO perl -> ${ $array[0] } = 6.02e23;
  // TODO perl -> ${ $array[1] } = "avocado";
  // TODO perl -> print "\@array contains: ", join(", ", map { $$_ } @array ), "\n";
  // -----------------------------
  // TODO perl -> $var = `uptime`; # $var holds text
  // TODO perl -> $vref = \$var; # $vref "points to" $var
  // TODO perl -> if ($$vref =~ /load/) {} # look at $var, indirectly
  // TODO perl -> chomp $$vref; # alter $var, indirectly
  // -----------------------------
  // check whether $someref contains a simple scalar reference
  // TODO perl -> if (ref($someref) ne 'SCALAR') {
  // TODO perl -> die "Expected a scalar reference, not $someref\n";
  // TODO perl ->
  // TODO perl -> }
  // -----------------------------
  // TODO perl ->
  // </PLEAC>
  }

  public static void _06 () {
  // <PLEAC>

  // ^^PLEAC^^_11.6
  // -----------------------------
  // TODO perl -> @array_of_scalar_refs = ( \$a, \$b );
  // -----------------------------
  // TODO perl -> @array_of_scalar_refs = \( $a, $b );
  // -----------------------------
  // TODO perl -> ${ $array_of_scalar_refs[1] } = 12; # $b = 12
  // -----------------------------
  // TODO perl -> ($a, $b, $c, $d) = (1 .. 4); # initialize
  // TODO perl -> @array = (\$a, \$b, \$c, \$d); # refs to each scalar
  // TODO perl -> @array = \( $a, $b, $c, $d); # same thing!
  // TODO perl -> @array = map { \my $anon } 0 .. 3; # allocate 4 anon scalarresf
  // TODO perl ->
  // TODO perl -> ${ $array[2] } += 9; # $c now 12
  // TODO perl ->
  // TODO perl -> ${ $array[ $#array ] } *= 5; # $d now 20
  // TODO perl -> ${ $array[-1] } *= 5; # same; $d now 100
  // TODO perl ->
  // TODO perl -> $tmp = $array[-1]; # using temporary
  // TODO perl -> $$tmp *= 5; # $d now 500
  // -----------------------------
  // TODO perl -> use Math::Trig qw(pi); # load the constant pi
  // TODO perl -> foreach $sref (@array) { # prepare to change $a,$b,$c,$d
  // TODO perl -> ($$sref **= 3) *= (4/3 * pi); # replace with spherical volumes
  // TODO perl -> }
  // -----------------------------
  // TODO perl ->
  // </PLEAC>
  }

  public static void _07 () {
  // <PLEAC>

  // ^^PLEAC^^_11.7
  // -----------------------------
  // TODO perl -> $c1 = mkcounter(20);
  // TODO perl -> $c2 = mkcounter(77);
  // TODO perl ->
  // TODO perl -> printf "next c1: %d\n", $c1->{NEXT}->(); # 21
  // TODO perl -> printf "next c2: %d\n", $c2->{NEXT}->(); # 78
  // TODO perl -> printf "next c1: %d\n", $c1->{NEXT}->(); # 22
  // TODO perl -> printf "last c1: %d\n", $c1->{PREV}->(); # 21
  // TODO perl -> printf "old  c2: %d\n", $c2->{RESET}->(); # 77
  // -----------------------------
  // TODO perl -> sub mkcounter {
  // TODO perl -> my $count = shift;
  // TODO perl -> my $start = $count;
  // TODO perl -> my $bundle = {
  // TODO perl -> "NEXT" => sub { return ++$count },
  // TODO perl -> "PREV" => sub { return --$count },
  // TODO perl -> "GET" => sub { return $count },
  // TODO perl -> "SET" => sub { $count = shift },
  // TODO perl -> "BUMP" => sub { $count += shift },
  // TODO perl -> "RESET" => sub { $count = $start },
  // TODO perl -> };
  // TODO perl -> $bundle->{"LAST"} = $bundle->{"PREV"};
  // TODO perl -> return $bundle;
  // TODO perl -> }
  // -----------------------------
  // TODO perl ->
  // </PLEAC>
  }

  public static void _08 () {
  // <PLEAC>

  // ^^PLEAC^^_11.8
  // -----------------------------
  // TODO perl -> $mref = sub { $obj->meth(@_) };
  // later...
  // TODO perl -> $mref->("args", "go", "here");
  // -----------------------------
  // TODO perl -> $sref = \$obj->meth;
  // -----------------------------
  // TODO perl -> $cref = $obj->can("meth");
  // -----------------------------
  // TODO perl ->
  // </PLEAC>
  }

  public static void _09 () {
  // <PLEAC>

  // ^^PLEAC^^_11.9
  // -----------------------------
  // TODO perl -> $record = {
  // TODO perl -> NAME => "Jason",
  // TODO perl -> EMPNO => 132,
  // TODO perl -> TITLE => "deputy peon",
  // TODO perl -> AGE => 23,
  // TODO perl -> SALARY => 37_000,
  // TODO perl -> PALS => [ "Norbert", "Rhys", "Phineas"],
  // TODO perl -> };
  // TODO perl ->
  // TODO perl -> printf "I am %s, and my pals are %s.\n",
  // TODO perl -> $record->{NAME},
  // TODO perl -> join(", ", @{$record->{PALS}});
  // -----------------------------
  // store record
  // TODO perl -> $byname{ $record->{NAME} } = $record;
  // TODO perl ->
  // later on, look up by name
  // TODO perl -> if ($rp = $byname{"Aron"}) { # false if missing
  // TODO perl -> printf "Aron is employee %d.\n", $rp->{EMPNO};
  // TODO perl -> }
  // TODO perl ->
  // give jason a new pal
  // TODO perl -> push @{$byname{"Jason"}->{PALS}}, "Theodore";
  // TODO perl -> printf "Jason now has %d pals\n", scalar @{$byname{"Jason"}->{PALS}};
  // -----------------------------
  // Go through all records
  // TODO perl -> while (($name, $record) = each %byname) {
  // TODO perl -> printf "%s is employee number %d\n", $name, $record->{EMPNO};
  // TODO perl -> }
  // -----------------------------
  // store record
  // TODO perl -> $employees[ $record->{EMPNO} ] = $record;
  // TODO perl ->
  // lookup by id
  // TODO perl -> if ($rp = $employee[132]) {
  // TODO perl -> printf "employee number 132 is %s\n", $rp->{NAME};
  // TODO perl -> }
  // -----------------------------
  // TODO perl -> $byname{"Jason"}->{SALARY} *= 1.035;
  // -----------------------------
  // TODO perl -> @peons = grep { $_->{TITLE} =~ /peon/i } @employees;
  // TODO perl -> @tsevens = grep { $_->{AGE} == 27 } @employees;
  // -----------------------------
  // Go through all records
  // TODO perl -> foreach $rp (sort { $a->{AGE} <=> $b->{AGE} } values %byname) {
  // TODO perl -> printf "%s is age %d.\n", $rp->{NAME}, $rp->{AGE};
  // TODO perl -> # or with a hash slice on the reference
  // TODO perl -> printf "%s is employee number %d.\n", @$rp{'NAME','EMPNO'};
  // TODO perl -> }
  // -----------------------------
  // use @byage, an array of arrays of records
  // TODO perl -> push @{ $byage[ $record->{AGE} ] }, $record;
  // -----------------------------
  // TODO perl -> for ($age = 0; $age <= $#byage; $age++) {
  // TODO perl -> next unless $byage[$age];
  // TODO perl -> print "Age $age: ";
  // TODO perl -> foreach $rp (@{$byage[$age]}) {
  // TODO perl -> print $rp->{NAME}, " ";
  // TODO perl -> }
  // TODO perl -> print "\n";
  // TODO perl -> }
  // -----------------------------
  // TODO perl -> for ($age = 0; $age <= $#byage; $age++) {
  // TODO perl -> next unless $byage[$age];
  // TODO perl -> printf "Age %d: %s\n", $age,
  // TODO perl -> join(", ", map {$_->{NAME}} @{$byage[$age]});
  // TODO perl ->
  // TODO perl -> }
  // -----------------------------
  // TODO perl ->
  // </PLEAC>
  }

  public static void _10 () {
  // <PLEAC>

  // ^^PLEAC^^_11.10
  // -----------------------------
  // TODO perl -> FieldName: Value
  // -----------------------------
  // TODO perl -> foreach $record (@Array_of_Records) {
  // TODO perl -> for $key (sort keys %$record) {
  // TODO perl -> print "$key: $record->{$key}\n";
  // TODO perl -> }
  // TODO perl -> print "\n";
  // TODO perl -> }
  // -----------------------------
  // TODO perl -> $/ = ""; # paragraph read mode
  // TODO perl -> while (<>) {
  // TODO perl -> my @fields = split /^([^:]+):\s*/m;
  // TODO perl -> shift @fields; # for leading null field
  // TODO perl -> push(@Array_of_Records, { map /(.*)/, @fields });
  // TODO perl -> }
  // -----------------------------
  // TODO perl ->
  // </PLEAC>
  }

  public static void _11 () {
  // <PLEAC>

  // ^^PLEAC^^_11.11
  // -----------------------------
  // TODO perl -> DB<1> $reference = [ { "foo" => "bar" }, 3, sub { print "hello, world\n" } ];
  // TODO perl -> DB<2> x $reference
  // TODO perl -> 0 ARRAY(0x1d033c)
  // TODO perl ->
  // TODO perl -> 0 HASH(0x7b390)
  // TODO perl ->
  // TODO perl -> 'foo' = 'bar'>
  // TODO perl ->
  // TODO perl -> 1 3
  // TODO perl ->
  // TODO perl -> 2 CODE(0x21e3e4)
  // TODO perl ->
  // TODO perl -> - & in ???>
  // -----------------------------
  // TODO perl -> use Data::Dumper;
  // TODO perl -> print Dumper($reference);
  // -----------------------------
  // TODO perl -> D<1> x \@INC
  // TODO perl -> 0 ARRAY(0x807d0a8)
  // TODO perl ->
  // TODO perl -> 0 '/home/tchrist/perllib'
  // TODO perl ->
  // TODO perl -> 1 '/usr/lib/perl5/i686-linux/5.00403'
  // TODO perl ->
  // TODO perl -> 2 '/usr/lib/perl5'
  // TODO perl ->
  // TODO perl -> 3 '/usr/lib/perl5/site_perl/i686-linux'
  // TODO perl ->
  // TODO perl -> 4 '/usr/lib/perl5/site_perl'
  // TODO perl ->
  // TODO perl -> 5 '.'
  // -----------------------------
  // TODO perl -> { package main; require "dumpvar.pl" }
  // TODO perl -> *dumpvar = \&main::dumpvar if __PACKAGE__ ne 'main';
  // TODO perl -> dumpvar("main", "INC"); # show both @INC and %INC
  // -----------------------------
  // TODO perl -> @INC = (
  // TODO perl ->
  // TODO perl -> 0 '/home/tchrist/perllib/i686-linux'
  // TODO perl ->
  // TODO perl -> 1 '/home/tchrist/perllib'
  // TODO perl ->
  // TODO perl -> 2 '/usr/lib/perl5/i686-linux/5.00404'
  // TODO perl ->
  // TODO perl -> 3 '/usr/lib/perl5'
  // TODO perl ->
  // TODO perl -> 4 '/usr/lib/perl5/site_perl/i686-linux'
  // TODO perl ->
  // TODO perl -> 5 '/usr/lib/perl5/site_perl'
  // TODO perl ->
  // TODO perl -> 6 '.'
  // TODO perl ->
  // TODO perl -> )
  // TODO perl ->
  // TODO perl -> %INC = (
  // TODO perl ->
  // TODO perl -> 'dumpvar.pl' = '/usr/lib/perl5/i686-linux/5.00404/dumpvar.pl'
  // TODO perl ->
  // TODO perl -> 'strict.pm' = '/usr/lib/perl5/i686-linux/5.00404/strict.pm'
  // TODO perl ->
  // TODO perl -> )
  // -----------------------------
  // TODO perl -> use Data::Dumper;
  // TODO perl -> print Dumper(\@INC);
  // TODO perl -> $VAR1 = [
  // TODO perl ->
  // TODO perl -> '/home/tchrist/perllib',
  // TODO perl ->
  // TODO perl -> '/usr/lib/perl5/i686-linux/5.00403',
  // TODO perl ->
  // TODO perl -> '/usr/lib/perl5',
  // TODO perl ->
  // TODO perl -> '/usr/lib/perl5/site_perl/i686-linux',
  // TODO perl ->
  // TODO perl -> '/usr/lib/perl5/site_perl',
  // TODO perl ->
  // TODO perl -> '.'
  // TODO perl ->
  // TODO perl -> ];
  // -----------------------------
  // TODO perl ->
  // </PLEAC>
  }

  public static void _12 () {
  // <PLEAC>

  // ^^PLEAC^^_11.12
  // -----------------------------
  // TODO perl -> use Storable;
  // TODO perl ->
  // TODO perl -> $r2 = dclone($r1);
  // -----------------------------
  // TODO perl -> @original = ( \@a, \@b, \@c );
  // TODO perl -> @surface = @original;
  // -----------------------------
  // TODO perl -> @deep = map { [ @$_ ] } @original;
  // -----------------------------
  // TODO perl -> use Storable qw(dclone);
  // TODO perl -> $r2 = dclone($r1);
  // -----------------------------
  // TODO perl -> %newhash = %{ dclone(\%oldhash) };
  // -----------------------------
  // TODO perl ->
  // </PLEAC>
  }

  public static void _13 () {
  // <PLEAC>

  // ^^PLEAC^^_11.13
  // -----------------------------
  // TODO perl -> use Storable;
  // TODO perl -> store(\%hash, "filename");
  // TODO perl ->
  // later on...
  // TODO perl -> $href = retrieve("filename"); # by ref
  // TODO perl -> %hash = %{ retrieve("filename") }; # direct to hash
  // -----------------------------
  // TODO perl -> use Storable qw(nstore);
  // TODO perl -> nstore(\%hash, "filename");
  // later ...
  // TODO perl -> $href = retrieve("filename");
  // -----------------------------
  // TODO perl -> use Storable qw(nstore_fd);
  // TODO perl -> use Fcntl qw(:DEFAULT :flock);
  // TODO perl -> sysopen(DF, "/tmp/datafile", O_RDWR|O_CREAT, 0666)
  // TODO perl -> or die "can't open /tmp/datafile: $!";
  // TODO perl -> flock(DF, LOCK_EX) or die "can't lock /tmp/datafile: $!";
  // TODO perl -> nstore_fd(\%hash, *DF)
  // TODO perl -> or die "can't store hash\n";
  // TODO perl -> truncate(DF, tell(DF));
  // TODO perl -> close(DF);
  // -----------------------------
  // TODO perl -> use Storable;
  // TODO perl -> use Fcntl qw(:DEFAULT :flock);
  // TODO perl -> open(DF, "< /tmp/datafile") or die "can't open /tmp/datafile: $!";
  // TODO perl -> flock(DF, LOCK_SH) or die "can't lock /tmp/datafile: $!";
  // TODO perl -> $href = retrieve(*DF);
  // TODO perl -> close(DF);
  // -----------------------------
  // TODO perl ->
  // </PLEAC>
  }

  public static void _14 () {
  // <PLEAC>

  // ^^PLEAC^^_11.14
  // -----------------------------
  // TODO perl -> use MLDBM qw(DB_File);
  // TODO perl -> use Fcntl;
  // TODO perl ->
  // TODO perl -> tie(%hash, 'MLDBM', 'testfile.db', O_CREAT|O_RDWR, 0666)
  // TODO perl -> or die "can't open tie to testfile.db: $!";
  // TODO perl ->
  // ... act on %hash
  // TODO perl ->
  // TODO perl -> untie %hash;
  // -----------------------------
  // TODO perl -> use MLDBM qw(DB_File);
  // TODO perl -> use Fcntl;
  // TODO perl -> tie(%hash, 'MLDBM', 'testfile.db', O_CREAT|O_RDWR, 0666)
  // TODO perl -> or die "can't open tie to testfile.db: $!";
  // -----------------------------
  // this doesn't work!
  // TODO perl -> $hash{"some key"}[4] = "fred";
  // TODO perl ->
  // RIGHT
  // TODO perl -> $aref = $hash{"some key"};
  // TODO perl -> $aref->[4] = "fred";
  // TODO perl -> $hash{"some key"} = $aref;
  // -----------------------------
  // TODO perl ->
  // </PLEAC>
  }

  public static void _15 () {
  // <PLEAC>

  // ^^PLEAC^^_11.15
  // -----------------------------
  // ^^INCLUDE^^ include/perl/ch11/bintree
  // -----------------------------
  // TODO perl ->
  // </PLEAC>
  }
}
