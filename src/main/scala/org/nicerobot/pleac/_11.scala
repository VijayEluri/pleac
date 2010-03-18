package org.nicerobot.pleac;

/**
 * @author nicerobot
 * 
 */

// ^^PLEAC^^_11.0
//-----------------------------
// TODO print $$sref;    # prints the scalar value that the reference $sref refers to
// TODO $$sref = 3;      # assigns to $sref's referent
//-----------------------------
// TODO print ${$sref};             # prints the scalar $sref refers to
// TODO ${$sref} = 3;               # assigns to $sref's referent
//-----------------------------
// TODO $aref = \@array;
//-----------------------------
// TODO $pi = \3.14159;
// TODO $$pi = 4;           # runtime error
//-----------------------------
// TODO $aref = [ 3, 4, 5 ];                                # new anonymous array
// TODO $href = { "How" => "Now", "Brown" => "Cow" };       # new anonymous hash
//-----------------------------
// TODO undef $aref;
// TODO @$aref = (1, 2, 3);
// TODO print $aref;
// TODO ARRAY(0x80c04f0)
//-----------------------------
// TODO $a[4][23][53][21] = "fred";
// TODO print $a[4][23][53][21];
// TODO fred

// TODO print $a[4][23][53];
// TODO ARRAY(0x81e2494)

// TODO print $a[4][23];
// TODO ARRAY(0x81e0748)

// TODO print $a[4];
// TODO ARRAY(0x822cd40)
//-----------------------------
// TODO $op_cit = cite($ibid)       or die "couldn't make a reference";
//-----------------------------
// TODO $Nat = { "Name"     => "Leonhard Euler",
// TODO          "Address"  => "1729 Ramanujan Lane\nMathworld, PI 31416",
// TODO          "Birthday" => 0x5bb5580,
// TODO        };
//-----------------------------

// ^^PLEAC^^_11.1
//-----------------------------
// TODO $aref               = \@array;
// TODO $anon_array         = [1, 3, 5, 7, 9];
// TODO $anon_copy          = [ @array ];
// TODO @$implicit_creation = (2, 4, 6, 8, 10);
//-----------------------------
// TODO push(@$anon_array, 11);
//-----------------------------
// TODO $two = $implicit_creation->[0];
//-----------------------------
// TODO $last_idx  = $#$aref;
// TODO $num_items = @$aref;
//-----------------------------
// TODO $last_idx  = $#{ $aref };
// TODO $num_items = scalar @{ $aref };
//-----------------------------
// check whether $someref contains a simple array reference
// TODO if (ref($someref) ne 'ARRAY') {
// TODO     die "Expected an array reference, not $someref\n";
// TODO }

// TODO print "@{$array_ref}\n";        # print original data

// TODO @order = sort @{ $array_ref };  # sort it

// TODO push @{ $array_ref }, $item;    # append new element to orig array  
//-----------------------------
// TODO sub array_ref {
// TODO     my @array;
// TODO     return \@array;
// TODO }

// TODO $aref1 = array_ref();
// TODO $aref2 = array_ref();
//-----------------------------
// TODO print $array_ref->[$N];         # access item in position N (best)
// TODO print $$array_ref[$N];          # same, but confusing
// TODO print ${$array_ref}[$N];        # same, but still confusing, and ugly to boot
//-----------------------------
// TODO @$pie[3..5];                    # array slice, but a little confusing to read
// TODO @{$pie}[3..5];                  # array slice, easier (?) to read
//-----------------------------
// TODO @{$pie}[3..5] = ("blackberry", "blueberry", "pumpkin");
//-----------------------------
// TODO $sliceref = \@{$pie}[3..5];     # WRONG!
//-----------------------------
// TODO foreach $item ( @{$array_ref} ) {   
// TODO     # $item has data
// TODO }

// TODO for ($idx = 0; $idx <= $#{ $array_ref }; $idx++) {  
// TODO     # $array_ref->[$idx] has data
// TODO }
//-----------------------------

// ^^PLEAC^^_11.2
//-----------------------------
// TODO push(@{ $hash{"KEYNAME"} }, "new value");
//-----------------------------
// TODO foreach $string (keys %hash) {
// TODO     print "$string: @{$hash{$string}}\n"; 
// TODO } 
//-----------------------------
// TODO $hash{"a key"} = [ 3, 4, 5 ];       # anonymous array
//-----------------------------
// TODO @values = @{ $hash{"a key"} };
//-----------------------------
// TODO push @{ $hash{"a key"} }, $value;
//-----------------------------
// TODO @residents = @{ $phone2name{$number} };
//-----------------------------
// TODO @residents = exists( $phone2name{$number} )
// TODO                 ? @{ $phone2name{$number} }
// TODO                 : ();
//-----------------------------

// ^^PLEAC^^_11.3
//-----------------------------
// TODO $href = \%hash;
// TODO $anon_hash = { "key1" => "value1", "key2" => "value2", ... };
// TODO $anon_hash_copy = { %hash };
//-----------------------------
// TODO %hash  = %$href;
// TODO $value = $href->{$key};
// TODO @slice = @$href{$key1, $key2, $key3};  # note: no arrow!
// TODO @keys  = keys %$href;
//-----------------------------
// TODO if (ref($someref) ne 'HASH') {
// TODO     die "Expected a hash reference, not $someref\n";
// TODO }
//-----------------------------
// TODO foreach $href ( \%ENV, \%INC ) {       # OR: for $href ( \(%ENV,%INC) ) {
// TODO     foreach $key ( keys %$href ) {
// TODO         print "$key => $href->{$key}\n";
// TODO     }
// TODO }
//-----------------------------
// TODO @values = @$hash_ref{"key1", "key2", "key3"};

// TODO for $val (@$hash_ref{"key1", "key2", "key3"}) {
// TODO     $val += 7;   # add 7 to each value in hash slice
// TODO } 
//-----------------------------

// ^^PLEAC^^_11.4
//-----------------------------
// TODO $cref = \&func;
// TODO $cref = sub { ... };
//-----------------------------
// TODO @returned = $cref->(@arguments);
// TODO @returned = &$cref(@arguments);
//-----------------------------
// TODO $funcname = "thefunc";
// TODO &$funcname();
//-----------------------------
// TODO my %commands = (
// TODO     "happy" => \&joy,
// TODO     "sad"   => \&sullen,
// TODO     "done"  => sub { die "See ya!" },
// TODO     "mad"   => \&angry,
// TODO );

// TODO print "How are you? ";
// TODO chomp($string = <STDIN>);
// TODO if ($commands{$string}) {
// TODO     $commands{$string}->();
// TODO } else {
// TODO     print "No such command: $string\n";
// TODO } 
//-----------------------------
// TODO sub counter_maker {
// TODO     my $start = 0;
// TODO     return sub {                      # this is a closure
// TODO         return $start++;              # lexical from enclosing scope
// TODO     };
// TODO }

// TODO $counter = counter_maker();

// TODO for ($i = 0; $i < 5; $i ++) {
// TODO     print &$counter, "\n";
// TODO }
//-----------------------------
// TODO $counter1 = counter_maker();
// TODO $counter2 = counter_maker();

// TODO for ($i = 0; $i < 5; $i ++) {
// TODO     print &$counter1, "\n";
// TODO }

// TODO print &$counter1, " ", &$counter2, "\n";
// TODO 0

// TODO 1

// TODO 2

// TODO 3

// TODO 4

// TODO 5 0
//-----------------------------
// TODO sub timestamp {
// TODO     my $start_time = time(); 
// TODO     return sub { return time() - $start_time };
// TODO } 
// TODO $early = timestamp(); 
// TODO sleep 20; 
// TODO $later = timestamp(); 
// TODO sleep 10;
// TODO printf "It's been %d seconds since early.\n", $early->();
// TODO printf "It's been %d seconds since later.\n", $later->();
//It's been 30 seconds since early.
//
//It's been 10 seconds since later.
//-----------------------------

// ^^PLEAC^^_11.5
//-----------------------------
// TODO $scalar_ref = \$scalar;       # get reference to named scalar
//-----------------------------
// TODO undef $anon_scalar_ref;
// TODO $$anon_scalar_ref = 15;
//-----------------------------
// TODO $anon_scalar_ref = \15;
//-----------------------------
// TODO print ${ $scalar_ref };       # dereference it
// TODO ${ $scalar_ref } .= "string"; # alter referent's value
//-----------------------------
// TODO sub new_anon_scalar {
// TODO     my $temp;
// TODO     return \$temp;
// TODO }
//-----------------------------
// TODO $sref = new_anon_scalar();
// TODO $$sref = 3;
// TODO print "Three = $$sref\n";
// TODO @array_of_srefs = ( new_anon_scalar(), new_anon_scalar() );
// TODO ${ $array[0] } = 6.02e23;
// TODO ${ $array[1] } = "avocado";
// TODO print "\@array contains: ", join(", ", map { $$_ } @array ), "\n";
//-----------------------------
// TODO $var        = `uptime`;     # $var holds text
// TODO $vref       = \$var;        # $vref "points to" $var
// TODO if ($$vref =~ /load/) {}    # look at $var, indirectly
// TODO chomp $$vref;               # alter $var, indirectly
//-----------------------------
// check whether $someref contains a simple scalar reference
// TODO if (ref($someref) ne 'SCALAR') {
// TODO     die "Expected a scalar reference, not $someref\n";

// TODO }
//-----------------------------

// ^^PLEAC^^_11.6
//-----------------------------
// TODO @array_of_scalar_refs = ( \$a, \$b );
//-----------------------------
// TODO @array_of_scalar_refs = \( $a, $b );
//-----------------------------
// TODO ${ $array_of_scalar_refs[1] } = 12;         # $b = 12
//-----------------------------
// TODO ($a, $b, $c, $d) = (1 .. 4);        # initialize
// TODO @array =  (\$a, \$b, \$c, \$d);     # refs to each scalar
// TODO @array = \( $a,  $b,  $c,  $d);     # same thing!
// TODO @array = map { \my $anon } 0 .. 3;  # allocate 4 anon scalarresf

// TODO ${ $array[2] } += 9;                # $c now 12

// TODO ${ $array[ $#array ] } *= 5;        # $d now 20
// TODO ${ $array[-1] }        *= 5;        # same; $d now 100

// TODO $tmp   = $array[-1];                # using temporary
// TODO $$tmp *= 5;                         # $d now 500
//-----------------------------
// TODO use Math::Trig qw(pi);              # load the constant pi
// TODO foreach $sref (@array) {            # prepare to change $a,$b,$c,$d
// TODO     ($$sref **= 3) *= (4/3 * pi);   # replace with spherical volumes
// TODO }
//-----------------------------

// ^^PLEAC^^_11.7
//-----------------------------
// TODO $c1 = mkcounter(20); 
// TODO $c2 = mkcounter(77);

// TODO printf "next c1: %d\n", $c1->{NEXT}->();  # 21 
// TODO printf "next c2: %d\n", $c2->{NEXT}->();  # 78 
// TODO printf "next c1: %d\n", $c1->{NEXT}->();  # 22 
// TODO printf "last c1: %d\n", $c1->{PREV}->();  # 21 
// TODO printf "old  c2: %d\n", $c2->{RESET}->(); # 77
//-----------------------------
// TODO sub mkcounter {
// TODO     my $count  = shift; 
// TODO     my $start  = $count; 
// TODO     my $bundle = { 
// TODO         "NEXT"   => sub { return ++$count  }, 
// TODO         "PREV"   => sub { return --$count  }, 
// TODO         "GET"    => sub { return $count    },
// TODO         "SET"    => sub { $count = shift   }, 
// TODO         "BUMP"   => sub { $count += shift  }, 
// TODO         "RESET"  => sub { $count = $start  },
// TODO     }; 
// TODO     $bundle->{"LAST"} = $bundle->{"PREV"}; 
// TODO     return $bundle;
// TODO }
//-----------------------------

// ^^PLEAC^^_11.8
//-----------------------------
// TODO $mref = sub { $obj->meth(@_) }; 
// later...  
// TODO $mref->("args", "go", "here");
//-----------------------------
// TODO $sref = \$obj->meth;
//-----------------------------
// TODO $cref = $obj->can("meth");
//-----------------------------

// ^^PLEAC^^_11.9
//-----------------------------
// TODO $record = {
// TODO     NAME   => "Jason",
// TODO     EMPNO  => 132,
// TODO     TITLE  => "deputy peon",
// TODO     AGE    => 23,
// TODO     SALARY => 37_000,
// TODO     PALS   => [ "Norbert", "Rhys", "Phineas"],
// TODO };

// TODO printf "I am %s, and my pals are %s.\n",
// TODO     $record->{NAME},
// TODO     join(", ", @{$record->{PALS}});
//-----------------------------
// store record
// TODO $byname{ $record->{NAME} } = $record;

// later on, look up by name
// TODO if ($rp = $byname{"Aron"}) {        # false if missing
// TODO     printf "Aron is employee %d.\n", $rp->{EMPNO};
// TODO }

// give jason a new pal
// TODO push @{$byname{"Jason"}->{PALS}}, "Theodore";
// TODO printf "Jason now has %d pals\n", scalar @{$byname{"Jason"}->{PALS}};
//-----------------------------
// Go through all records
// TODO while (($name, $record) = each %byname) {
// TODO     printf "%s is employee number %d\n", $name, $record->{EMPNO};
// TODO }
//-----------------------------
// store record
// TODO $employees[ $record->{EMPNO} ] = $record;

// lookup by id
// TODO if ($rp = $employee[132]) {
// TODO     printf "employee number 132 is %s\n", $rp->{NAME};
// TODO }
//-----------------------------
// TODO $byname{"Jason"}->{SALARY} *= 1.035;
//-----------------------------
// TODO @peons   = grep { $_->{TITLE} =~ /peon/i } @employees;
// TODO @tsevens = grep { $_->{AGE}   == 27 }      @employees;
//-----------------------------
// Go through all records
// TODO foreach $rp (sort { $a->{AGE} <=> $b->{AGE} } values %byname) {
// TODO     printf "%s is age %d.\n", $rp->{NAME}, $rp->{AGE};
// TODO     # or with a hash slice on the reference
// TODO     printf "%s is employee number %d.\n", @$rp{'NAME','EMPNO'};
// TODO }
//-----------------------------
// use @byage, an array of arrays of records
// TODO push @{ $byage[ $record->{AGE} ] }, $record;
//-----------------------------
// TODO for ($age = 0; $age <= $#byage; $age++) {
// TODO     next unless $byage[$age];
// TODO     print "Age $age: ";
// TODO     foreach $rp (@{$byage[$age]}) {
// TODO         print $rp->{NAME}, " ";
// TODO     }
// TODO     print "\n";
// TODO }
//-----------------------------
// TODO for ($age = 0; $age <= $#byage; $age++) {
// TODO     next unless $byage[$age];
// TODO     printf "Age %d: %s\n", $age,
// TODO         join(", ", map {$_->{NAME}} @{$byage[$age]});

// TODO }
//-----------------------------

// ^^PLEAC^^_11.10
//-----------------------------
// TODO FieldName: Value
//-----------------------------
// TODO foreach $record (@Array_of_Records) { 
// TODO     for $key (sort keys %$record) {
// TODO         print "$key: $record->{$key}\n";
// TODO     } 
// TODO     print "\n";
// TODO }
//-----------------------------
// TODO $/ = "";                # paragraph read mode
// TODO while (<>) {
// TODO     my @fields = split /^([^:]+):\s*/m;
// TODO     shift @fields;      # for leading null field
// TODO     push(@Array_of_Records, { map /(.*)/, @fields });
// TODO } 
//-----------------------------

// ^^PLEAC^^_11.11
//-----------------------------
// TODO DB<1> $reference = [ { "foo" => "bar" }, 3, sub { print "hello, world\n" } ];
// TODO DB<2> x $reference
// TODO   0  ARRAY(0x1d033c)

// TODO     0  HASH(0x7b390)

// TODO        'foo' = 'bar'>

// TODO     1  3

// TODO     2  CODE(0x21e3e4)

// TODO        - & in ???>
//-----------------------------
// TODO use Data::Dumper;
// TODO print Dumper($reference);
//-----------------------------
// TODO D<1> x \@INC
// TODO   0  ARRAY(0x807d0a8)

// TODO      0  '/home/tchrist/perllib' 

// TODO      1  '/usr/lib/perl5/i686-linux/5.00403'

// TODO      2  '/usr/lib/perl5' 

// TODO      3  '/usr/lib/perl5/site_perl/i686-linux' 

// TODO      4  '/usr/lib/perl5/site_perl' 

// TODO      5  '.'
//-----------------------------
// TODO { package main; require "dumpvar.pl" } 
// TODO *dumpvar = \&main::dumpvar if __PACKAGE__ ne 'main';
// TODO dumpvar("main", "INC");             # show both @INC and %INC
//-----------------------------
// TODO @INC = (

// TODO    0  '/home/tchrist/perllib/i686-linux'

// TODO    1  '/home/tchrist/perllib'

// TODO    2  '/usr/lib/perl5/i686-linux/5.00404'

// TODO    3  '/usr/lib/perl5'

// TODO    4  '/usr/lib/perl5/site_perl/i686-linux'

// TODO    5  '/usr/lib/perl5/site_perl'

// TODO    6  '.'

// TODO )

// TODO %INC = (

// TODO    'dumpvar.pl' = '/usr/lib/perl5/i686-linux/5.00404/dumpvar.pl'

// TODO    'strict.pm' = '/usr/lib/perl5/i686-linux/5.00404/strict.pm'

// TODO )
//-----------------------------
// TODO use Data::Dumper; 
// TODO print Dumper(\@INC); 
// TODO $VAR1 = [

// TODO       '/home/tchrist/perllib', 

// TODO       '/usr/lib/perl5/i686-linux/5.00403',

// TODO       '/usr/lib/perl5', 

// TODO       '/usr/lib/perl5/site_perl/i686-linux',

// TODO       '/usr/lib/perl5/site_perl', 

// TODO       '.'

// TODO ];
//-----------------------------

// ^^PLEAC^^_11.12
//-----------------------------
// TODO use Storable;

// TODO $r2 = dclone($r1);
//-----------------------------
// TODO @original = ( \@a, \@b, \@c );
// TODO @surface = @original;
//-----------------------------
// TODO @deep = map { [ @$_ ] } @original;
//-----------------------------
// TODO use Storable qw(dclone); 
// TODO $r2 = dclone($r1);
//-----------------------------
// TODO %newhash = %{ dclone(\%oldhash) };
//-----------------------------

// ^^PLEAC^^_11.13
//-----------------------------
// TODO use Storable; 
// TODO store(\%hash, "filename");

// later on...  
// TODO $href = retrieve("filename");        # by ref
// TODO %hash = %{ retrieve("filename") };   # direct to hash
//-----------------------------
// TODO use Storable qw(nstore); 
// TODO nstore(\%hash, "filename"); 
// later ...  
// TODO $href = retrieve("filename");
//-----------------------------
// TODO use Storable qw(nstore_fd);
// TODO use Fcntl qw(:DEFAULT :flock);
// TODO sysopen(DF, "/tmp/datafile", O_RDWR|O_CREAT, 0666) 
// TODO     or die "can't open /tmp/datafile: $!";
// TODO flock(DF, LOCK_EX)           or die "can't lock /tmp/datafile: $!";
// TODO nstore_fd(\%hash, *DF)
// TODO     or die "can't store hash\n";
// TODO truncate(DF, tell(DF));
// TODO close(DF);
//-----------------------------
// TODO use Storable;
// TODO use Fcntl qw(:DEFAULT :flock);
// TODO open(DF, "< /tmp/datafile")      or die "can't open /tmp/datafile: $!";
// TODO flock(DF, LOCK_SH)               or die "can't lock /tmp/datafile: $!";
// TODO $href = retrieve(*DF);
// TODO close(DF);
//-----------------------------

// ^^PLEAC^^_11.14
//-----------------------------
// TODO use MLDBM qw(DB_File);
// TODO use Fcntl;                            

// TODO tie(%hash, 'MLDBM', 'testfile.db', O_CREAT|O_RDWR, 0666)
// TODO     or die "can't open tie to testfile.db: $!";

// ... act on %hash

// TODO untie %hash;
//-----------------------------
// TODO use MLDBM qw(DB_File);
// TODO use Fcntl;                            
// TODO tie(%hash, 'MLDBM', 'testfile.db', O_CREAT|O_RDWR, 0666)
// TODO     or die "can't open tie to testfile.db: $!";
//-----------------------------
// this doesn't work!
// TODO $hash{"some key"}[4] = "fred";

// RIGHT
// TODO $aref = $hash{"some key"};
// TODO $aref->[4] = "fred";
// TODO $hash{"some key"} = $aref;
//-----------------------------

// ^^PLEAC^^_11.15
//-----------------------------
// ^^INCLUDE^^ include/perl/ch11/bintree
//-----------------------------
