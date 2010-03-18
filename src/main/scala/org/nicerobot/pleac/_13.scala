package org.nicerobot.pleac;

/**
 * @author nicerobot
 * 
 */

// ^^PLEAC^^_13.0
//-----------------------------
// TODO $object = {};                       # hash reference
// TODO bless($object, "Data::Encoder");    # bless $object into Data::Encoder class
// TODO bless($object);                     # bless $object into current package
//-----------------------------
// TODO $obj = [3,5];
// TODO print ref($obj), " ", $obj->[1], "\n";
// TODO bless($obj, "Human::Cannibal");
// TODO print ref($obj), " ", $obj->[1], "\n";

// TODO ARRAY 5

// TODO Human::Cannibal 5
//-----------------------------
// TODO $obj->{Stomach} = "Empty";   # directly accessing an object's contents
// TODO $obj->{NAME}    = "Thag";        # uppercase field name to make it stand out (optional)
//-----------------------------
// TODO $encoded = $object->encode("data");
//-----------------------------
// TODO $encoded = Data::Encoder->encode("data");
//-----------------------------
// TODO sub new {
// TODO     my $class = shift;
// TODO     my $self  = {};         # allocate new hash for object
// TODO     bless($self, $class);
// TODO     return $self;
// TODO }
//-----------------------------
// TODO $object = Class->new();
//-----------------------------
// TODO $object = Class::new("Class");
//-----------------------------
// TODO sub class_only_method {
// TODO     my $class = shift;
// TODO     die "class method called on object" if ref $class;
// TODO     # more code here
// TODO } 
//-----------------------------
// TODO sub instance_only_method {
// TODO     my $self = shift;
// TODO     die "instance method called on class" unless ref $self;
// TODO     # more code here
// TODO } 
//-----------------------------
// TODO $lector = new Human::Cannibal;
// TODO feed $lector "Zak";
// TODO move $lector "New York";
//-----------------------------
// TODO $lector = Human::Cannibal->
// TODO new();

// TODO $lector->feed("Zak");
// TODO $lector->move("New York");
//-----------------------------
// TODO printf STDERR "stuff here\n";
//-----------------------------
// TODO move $obj->{FIELD};                 # probably wrong
// TODO move $ary[$i];                      # probably wrong
//-----------------------------
// TODO $obj->move->{FIELD};                # Surprise!
// TODO $ary->move->[$i];                   # Surprise!
//-----------------------------
// TODO $obj->{FIELD}->
// TODO move()
// TODO ;              # Nope, you wish
// TODO $ary[$i]->
// TODO move;
// TODO                      # Nope, you wish
//-----------------------------

// ^^PLEAC^^_13.1
//-----------------------------
// TODO sub new {
// TODO     my $class = shift;
// TODO     my $self  = { };
// TODO     bless($self, $class);
// TODO     return $self;
// TODO } 
//-----------------------------
// TODO sub new { bless( { }, shift ) }
//-----------------------------
// TODO sub new { bless({}) }
//-----------------------------
// TODO sub new {
// TODO     my $self = { };  # allocate anonymous hash
// TODO     bless($self);
// TODO     # init two sample attributes/data members/fields
// TODO     $self->{START} = time();  
// TODO     $self->{AGE}   = 0;
// TODO     return $self;
// TODO } 
//-----------------------------
// TODO sub new {
// TODO     my $classname  = shift;         # What class are we constructing?
// TODO     my $self      = {};             # Allocate new memory
// TODO     bless($self, $classname);       # Mark it of the right type
// TODO     $self->{START}  = 
// TODO time();
// TODO        # init data fields
// TODO     $self->{AGE}    = 
// TODO 0;

// TODO     return $self;                   # And give it back
// TODO } 
//-----------------------------
// TODO sub new {
// TODO     my $classname  = shift;         # What class are we constructing?
// TODO     my $self      = {};             # Allocate new memory
// TODO     bless($self, $classname);       # Mark it of the right type
// TODO     $self->_init(@_);               # Call _init with remaining args
// TODO     return $self;
// TODO } 

// "private" method to initialize fields.  It always sets START to
// the current time, and AGE to 0.  If called with arguments, _init
// interprets them as key+value pairs to initialize the object with.
// TODO sub _init {
// TODO     my $self = shift;
// TODO     $self->{START} = 
// TODO time();

// TODO     $self->{AGE}   = 0;
// TODO     if (@_) {
// TODO         my %extra = @_;
// TODO         @$self{keys %extra} = values %extra;
// TODO     } 
// TODO } 
//-----------------------------

// ^^PLEAC^^_13.2
//-----------------------------
// TODO sub DESTROY {
// TODO     my $self = shift;
// TODO     printf("$self dying at %s\n", scalar localtime);
// TODO } 
//-----------------------------
// TODO $self->{WHATEVER} = $self;
//-----------------------------

// ^^PLEAC^^_13.3
//-----------------------------
// TODO sub get_name {
// TODO     my $self = shift;
// TODO     return $self->{NAME};
// TODO } 

// TODO sub set_name {
// TODO     my $self      = shift;
// TODO     $self->{NAME} = shift;
// TODO } 
//-----------------------------
// TODO sub name {
// TODO     my $self = shift;
// TODO     if (@_) { $self->{NAME} = shift } 
// TODO     return $self->{NAME};
// TODO } 
//-----------------------------
// TODO sub age {
// TODO     my $self = shift;
// TODO     my $prev = $self->{AGE};
// TODO     if (@_) { $self->{AGE} = shift } 
// TODO     return $prev;
// TODO } 
// sample call of get and set: happy birthday!
// TODO $obj->age( 1 + $obj->age );
//-----------------------------
// TODO $him = Person->
// TODO new()
// TODO ;
// TODO $him->{NAME} = "Sylvester";
// TODO $him->{AGE}  = 23;
//-----------------------------
// TODO use Carp;
// TODO sub name {
// TODO     my $self = shift;
// TODO     return $self->{NAME} unless @_;
// TODO     local $_ = shift;
// TODO     croak "too many arguments" if @_;
// TODO     if ($^W) {
// TODO         /[^\s\w'-]/         && carp "funny characters in name"; #'
// TODO         /\d/                && carp "numbers in name";
// TODO         /\S+(\s+\S+)+/      || carp "prefer multiword name";
// TODO         /\S/                || carp "name is blank";
// TODO     } 
// TODO     s/(\w+)/\\u\L$1/g;       # enforce capitalization
// TODO     $self->{NAME} = $_;
// TODO } 
//-----------------------------
// TODO package Person;

// this is the same as before...
// TODO sub new {
// TODO      my $that  = shift;
// TODO      my $class = ref($that) || $that;
// TODO      my $self = {
// TODO            NAME  => undef,
// TODO            AGE   => undef,
// TODO            PEERS => [],
// TODO     };
// TODO     bless($self, $class);
// TODO     return $self;
// TODO }

// TODO use Alias qw(attr);
// TODO use vars qw($NAME $AGE @PEERS);

// TODO sub name {
// TODO     my $self = attr shift;
// TODO     if (@_) { $NAME = shift; }
// TODO     return    $NAME;
// TODO };

// TODO sub age {
// TODO     my $self = attr shift;
// TODO     if (@_) { $AGE = shift; }
// TODO     return    $AGE;
// TODO }

// TODO sub peers {
// TODO     my $self = attr shift;
// TODO     if (@_) { @PEERS = @_; }
// TODO     return    @PEERS;
// TODO }

// TODO sub exclaim {
// TODO     my $self = attr shift;
// TODO     return sprintf "Hi, I'm %s, age %d, working with %s",
// TODO             $NAME, $AGE, join(", ", @PEERS);
// TODO }

// TODO sub happy_birthday {
// TODO     my $self = attr shift;
// TODO     return ++$AGE;
// TODO }
//-----------------------------

// ^^PLEAC^^_13.4
//-----------------------------
// TODO package Person;

// TODO $Body_Count = 0; 

// TODO sub population { return $Body_Count }

// TODO sub new {                                   # constructor
// TODO     $Body_Count++;
// TODO     return bless({}, shift);
// TODO }

// TODO sub DESTROY { --$BodyCount }                # destructor

// later, the user can say this:
// TODO package main;

// TODO for (1..10) { push @people, Person->new }
// TODO printf "There are %d people alive.\n", Person->population();

// TODO There are 10 people alive.
//-----------------------------
// TODO $him = Person->
// TODO new()
// TODO ;
// TODO $him->gender("male");

// TODO $her = Person->
// TODO new()
// TODO ;
// TODO $her->gender("female");
//-----------------------------
// TODO FixedArray->Max_Bounds(100);                # set for whole class
// TODO $alpha = FixedArray->new();
// TODO printf "Bound on alpha is %d\n", $alpha->Max_Bounds();
// TODO 100

// TODO $beta = FixedArray->new();
// TODO $beta->Max_Bounds(50);                      # still sets for whole class
// TODO printf "Bound on alpha is %d\n", $alpha->Max_Bounds();
// TODO 50
//-----------------------------
// TODO package FixedArray;
// TODO $Bounds = 7;  # default
// TODO sub new { bless( {}, shift ) }
// TODO sub Max_Bounds {
// TODO     my $proto  = shift;
// TODO     $Bounds    = shift if @_;          # allow updates
// TODO     return $Bounds;
// TODO } 
//-----------------------------
// TODO sub Max_Bounds { $Bounds }
//-----------------------------
// TODO sub new {
// TODO     my $class = shift;
// TODO     my $self = bless({}, $class);
// TODO     $self->{Max_Bounds_ref} = \$Bounds;
// TODO     return $self;
// TODO } 
//-----------------------------

// ^^PLEAC^^_13.5
//-----------------------------
// TODO use Class::Struct;          # load struct-building module

// TODO struct Person => {          # create a definition for a "Person"
// TODO     name   => '$',          #    name field is a scalar
// TODO     age    => '$',          #    age field is also a scalar
// TODO     peers  => '@',          #    but peers field is an array (reference)
// TODO };

// TODO my $p = Person->
// TODO new()
// TODO ;      # allocate an empty Person struct

// TODO $p->name("Jason Smythe");                   # set its name field
// TODO $p->age(13);                                # set its age field
// TODO $p->peers( ["Wilbur", "Ralph", "Fred" ] );  # set its peers field

// or this way:
// TODO @{$p->peers} = ("Wilbur", "Ralph", "Fred");

// fetch various values, including the zeroth friend
// TODO printf "At age %d, %s's first friend is %s.\n",
// TODO     $p->age, $p->name, $p->peers(0);
//-----------------------------
// TODO use Class::Struct;

// TODO struct Person => {name => '$',      age  => '$'};  #'
// TODO struct Family => {head => 'Person', address => '$', members => '@'};  #'

// TODO $folks  = Family->
// TODO new();

// TODO $dad    = $folks->head;
// TODO $dad->name("John");
// TODO $dad->age(34);

// TODO printf("%s's age is %d\n", $folks->head->name, $folks->head->age);
//-----------------------------
// TODO sub Person::age {
// TODO     use Carp;
// TODO     my ($self, $age) = @_;
// TODO     if    (@_  > 2) {  confess "too many arguments" } 
// TODO     elsif (@_ == 1) {  return $struct->{'age'}      }
// TODO     elsif (@_ == 2) {
// TODO         carp "age `$age' isn't numeric"   if $age !~ /^\d+/;
// TODO         carp "age `$age' is unreasonable" if $age > 150;
// TODO         $self->{'age'} = $age;
// TODO     } 
// TODO } 
//-----------------------------
// TODO if ($^W) { 
// TODO     carp "age `$age' isn't numeric"   if $age !~ /^\d+/;
// TODO     carp "age `$age' is unreasonable" if $age > 150;
// TODO }
//-----------------------------
// TODO my $gripe = $^W ? \&carp : \&croak;
// TODO $gripe->("age `$age' isn't numeric")   if $age !~ /^\d+/;
// TODO $gripe->("age `$age' is unreasonable") if $age > 150;
//-----------------------------
// TODO struct Family => [head => 'Person', address => '$', members => '@'];  #'
//-----------------------------
// TODO struct Card => { 
// TODO     name    => '$',
// TODO     color   => '$',
// TODO     cost    => '$',
// TODO     type    => '$',
// TODO     release => '$',
// TODO     text    => '$',
// TODO };
//-----------------------------
// TODO struct Card => map { $_ => '$' } qw(name color cost type release text); #'
//-----------------------------
// TODO struct hostent => { reverse qw{
// TODO     $ name
// TODO     @ aliases
// TODO     $ addrtype
// TODO     $ length
// TODO     @ addr_list
// TODO }};
//-----------------------------
//define h_type h_addrtype
//define h_addr h_addr_list[0]
//-----------------------------
// make (hostent object)->
// TODO type()
// TODO  same as (hostent object)->
// TODO addrtype()

// TODO *hostent::type = \&hostent::addrtype;

// make (hostenv object)->
// TODO addr()
// TODO  same as (hostenv object)->addr_list(0)
// TODO sub hostent::addr { shift->addr_list(0,@_) }
//-----------------------------
// TODO package Extra::hostent;
// TODO use Net::hostent;
// TODO @ISA = qw(hostent);
// TODO sub addr { shift->addr_list(0,@_) } 
// TODO 1;
//-----------------------------

// ^^PLEAC^^_13.6
//-----------------------------
// TODO my $proto  = shift;
// TODO my $class  = ref($proto) || $proto;
// TODO my $parent = ref($proto) && $proto;
//-----------------------------
// TODO $ob1 = SomeClass->
// TODO new()
// TODO ;
// later on
// TODO $ob2 = (ref $ob1)->
// TODO new();
//-----------------------------
// TODO $ob1 = Widget->new();
// TODO $ob2 = $ob1->new();
//-----------------------------
// TODO sub new {
// TODO     my $proto  = shift;
// TODO     my $class  = ref($proto) || $proto;
// TODO     my $parent = ref($proto) && $proto;

// TODO     my $self;
// TODO     # check whether we're shadowing a new from @ISA
// TODO     if (@ISA && $proto->SUPER::can('new') ) {
// TODO         $self = $proto->SUPER::new(@_);
// TODO     } else { 
// TODO         $self = {};
// TODO         bless ($self, $proto);
// TODO     }
// TODO     bless($self, $class);

// TODO     $self->{PARENT}  = $parent;
// TODO     $self->{START}   = time();   # init data fields
// TODO     $self->{AGE}     = 0;
// TODO     return $self;
// TODO } 
//-----------------------------

// ^^PLEAC^^_13.7
//-----------------------------
// TODO $methname = "flicker";
// TODO $obj->$methname(10);         # calls $obj->flicker(10);

// call three methods on the object, by name
// TODO foreach $m ( qw(start run stop) ) {
// TODO     $obj->
// TODO $m();

// TODO } 
//-----------------------------
// TODO @methods = qw(name rank serno);
// TODO %his_info = map { $_ => $ob->$_() } @methods;

// same as this:

// TODO %his_info = (
// TODO     'name'  => $ob->
// TODO name()
// TODO ,
// TODO     'rank'  => $ob->
// TODO rank()
// TODO ,
// TODO     'serno' => $ob->
// TODO serno()
// TODO ,
// TODO );
//-----------------------------
// TODO my $fnref = sub { $ob->method(@_) };
//-----------------------------
// TODO $fnref->(10, "fred");
//-----------------------------
// TODO $obj->method(10, "fred");
//-----------------------------
// TODO $obj->can('method_name')->($obj_target, @arguments)
// TODO    if $obj_target->isa( ref $obj );
//-----------------------------

// ^^PLEAC^^_13.8
//-----------------------------
// TODO $obj->isa("HTTP::Message");                  # as object method
// TODO HTTP::Response->isa("HTTP::Message");       # as class method

// TODO if ($obj->can("method_name")) { .... }       # check method validity
//-----------------------------
// TODO $has_io = $fd->isa("IO::Handle");
// TODO $itza_handle = IO::Socket->isa("IO::Handle");
//-----------------------------
// TODO $his_print_method = $obj->can('as_string');
//-----------------------------
// TODO Some_Module->VERSION(3.0);
// TODO $his_vers = $obj->
// TODO VERSION()
// TODO ;
//-----------------------------
// TODO use Some_Module 3.0;
//-----------------------------
// TODO use vars qw($VERSION);
// TODO $VERSION = '1.01';
//-----------------------------

// ^^PLEAC^^_13.9
//-----------------------------
// TODO package Person;
// TODO sub new {
// TODO     my $class = shift;
// TODO     my $self  = { };
// TODO     return bless $self, $class;
// TODO } 
// TODO sub name {
// TODO     my $self = shift;
// TODO     $self->{NAME} = shift if @_;
// TODO     return $self->{NAME};
// TODO } 
// TODO sub age {
// TODO     my $self = shift;
// TODO     $self->{AGE} = shift if @_;
// TODO     return $self->{AGE};
// TODO } 
//-----------------------------
// TODO use Person;
// TODO my $dude = Person->
// TODO new()
// TODO ;
// TODO $dude->name("Jason");
// TODO $dude->age(23);
// TODO printf "%s is age %d.\n", $dude->name, $dude->age;
//-----------------------------
// TODO package Employee;
// TODO use Person;
// TODO @ISA = ("Person");
// TODO 1;
//-----------------------------
// TODO use Employee;
// TODO my $empl = Employee->
// TODO new()
// TODO ;
// TODO $empl->name("Jason");
// TODO $empl->age(23);
// TODO printf "%s is age %d.\n", $empl->name, $empl->age;
//-----------------------------
// TODO $him = Person::
// TODO new()
// TODO ;               # WRONG
//-----------------------------

// ^^PLEAC^^_13.10
//-----------------------------
// TODO sub meth { 
// TODO     my $self = shift;
// TODO     $self->SUPER::
// TODO meth()
// TODO ;
// TODO }
//-----------------------------
// TODO $self->
// TODO meth();
// TODO                 # Call wherever first meth is found
// TODO $self->Where::
// TODO meth();
// TODO          # Start looking in package "Where"
// TODO $self->SUPER::
// TODO meth(); 
// TODO         # Call overridden version
//-----------------------------
// TODO sub new {
// TODO     my $classname  = shift;         # What class are we constructing?
// TODO     my $self       = $classname->SUPER::new(@_);
// TODO     $self->_init(@_);
// TODO     return $self;                   # And give it back
// TODO } 

// TODO sub _init {
// TODO     my $self = shift;
// TODO     $self->{START}   = time();   # init data fields
// TODO     $self->{AGE}     = 0;
// TODO     $self->{EXTRA}   = { @_ };   # anything extra
// TODO }
//-----------------------------
// TODO $obj = Widget->new( haircolor => red, freckles => 121 );
//-----------------------------
// TODO my $self = bless {}, $class;
// TODO for my $class (@ISA) {
// TODO     my $meth = $class . "::_init";
// TODO     $self->$meth(@_) if $class->can("_init");
// TODO } 
//-----------------------------

// ^^PLEAC^^_13.11
//-----------------------------
// TODO package Person;
// TODO use strict;
// TODO use Carp;
// TODO use vars qw($AUTOLOAD %ok_field);

// Authorize four attribute fields
// TODO for my $attr ( qw(name age peers parent) ) { $ok_field{$attr}++; } 

// TODO sub AUTOLOAD {
// TODO     my $self = shift;
// TODO     my $attr = $AUTOLOAD;
// TODO     $attr =~ s/.*:://;
// TODO     return unless $attr =~ /[^A-Z]/;  # skip DESTROY and all-cap methods
// TODO     croak "invalid attribute method: ->
// TODO $attr()"
// TODO  unless $ok_field{$attr};
// TODO     $self->{uc $attr} = shift if @_;
// TODO     return $self->{uc $attr};
// TODO }
// TODO sub new {
// TODO     my $proto  = shift;
// TODO     my $class  = ref($proto) || $proto;
// TODO     my $parent = ref($proto) && $proto;
// TODO     my $self = {};
// TODO     bless($self, $class);
// TODO     $self->parent($parent);
// TODO     return $self;
// TODO } 
// TODO 1;
//-----------------------------
// TODO use Person;
// TODO my ($dad, $kid);
// TODO $dad = Person->new;
// TODO $dad->name("Jason");
// TODO $dad->age(23);
// TODO $kid = $dad->new;
// TODO $kid->name("Rachel");
// TODO $kid->age(2);
// TODO printf "Kid's parent is %s\n", $kid->parent->name;
//Kid's parent is Jason
//-----------------------------
// TODO sub AUTOLOAD {
// TODO     my $self = shift;
// TODO     my $attr = $AUTOLOAD;
// TODO     $attr =~ s/.*:://;
// TODO     return if $attr eq 'DESTROY';   

// TODO     if ($ok_field{$attr}) {
// TODO         $self->{uc $attr} = shift if @_;
// TODO         return $self->{uc $attr};
// TODO     } else {
// TODO         my $superior = "SUPER::$attr";
// TODO         $self->$superior(@_);
// TODO     } 
// TODO }
//-----------------------------

// ^^PLEAC^^_13.12
//-----------------------------
// TODO sub Employee::age {
// TODO     my $self = shift;
// TODO     $self->{Employee_age} = shift if @_;
// TODO     return $self->{Employee_age};
// TODO } 
//-----------------------------
// TODO package Person;
// TODO use Class::Attributes;  # see explanation below
// TODO mkattr qw(name age peers parent);
//-----------------------------
// TODO package Employee;
// TODO @ISA = qw(Person);
// TODO use Class::Attributes;
// TODO mkattr qw(salary age boss);
//-----------------------------
// TODO package Class::Attributes;
// TODO use strict;
// TODO use Carp;
// TODO use Exporter ();
// TODO use vars qw(@ISA @EXPORT);
// TODO @ISA = qw(Exporter);
// TODO @EXPORT = qw(mkattr);
// TODO sub mkattr {
// TODO     my $hispack = caller();
// TODO     for my $attr (@_) {
// TODO         my($field, $method);
// TODO         $method = "${hispack}::$attr";
// TODO         ($field = $method) =~ s/:/_/g; 
// TODO         no strict 'refs'; # here comes the kluglich bit
// TODO         *$method = sub {
// TODO             my $self = shift;
// TODO             confess "too many arguments" if @_ > 1;
// TODO             $self->{$field} = shift if @_;
// TODO             return $self->{$field};   
// TODO         };
// TODO     } 
// TODO } 
// TODO 1;
//-----------------------------

// ^^PLEAC^^_13.13
//-----------------------------
// TODO $node->{NEXT} = $node;
//-----------------------------
// TODO package Ring;

// return an empty ring structure
// TODO sub new {
// TODO     my $class = shift;
// TODO     my $node  = { };
// TODO     $node->{NEXT} = $node->{PREV} = $node;
// TODO     my $self  = { DUMMY => $node, COUNT => 0 };
// TODO     bless $self, $class;
// TODO     return $self;
// TODO }
//-----------------------------
// TODO use Ring;

// TODO $COUNT = 1000;
// TODO for (1 .. 20) { 
// TODO     my $r = Ring->
// TODO new()
// TODO ;
// TODO     for ($i = 0; $i < $COUNT; $i++) { $r->insert($i) } 
// TODO }
//-----------------------------
// when a Ring is destroyed, destroy the ring structure it contains 
// TODO sub DESTROY {
// TODO     my $ring = shift;
// TODO     my $node;
// TODO     for ( $node  =  $ring->{DUMMY}->{NEXT};
// TODO           $node !=  $ring->{DUMMY}; 
// TODO           $node  =  $node->{NEXT} )
// TODO     {
// TODO              $ring->delete_node($node);
// TODO     } 
// TODO     $node->{PREV} = $node->{NEXT} = undef;
// TODO } 

// delete a node from the ring structure
// TODO sub delete_node {
// TODO     my ($ring, $node) = @_;
// TODO     $node->{PREV}->{NEXT} = $node->{NEXT};
// TODO     $node->{NEXT}->{PREV} = $node->{PREV};
// TODO     --$ring->{COUNT};
// TODO } 
//-----------------------------
// $node = $ring->search( $value ) : find $value in the ring
// structure in $node
// TODO sub search {
// TODO     my ($ring, $value) = @_;
// TODO     my $node = $ring->{DUMMY}->{NEXT};
// TODO     while ($node != $ring->{DUMMY} && $node->{VALUE} != $value) {
// TODO           $node = $node->{NEXT};
// TODO     }
// TODO     return $node;
// TODO } 

// $ring->insert( $value ) : insert $value into the ring structure
// TODO sub insert {
// TODO     my ($ring, $value) = @_;
// TODO     my $node = { VALUE => $value };
// TODO     $node->{NEXT} = $ring->{DUMMY}->{NEXT};
// TODO     $ring->{DUMMY}->{NEXT}->{PREV} = $node;
// TODO     $ring->{DUMMY}->{NEXT} = $node;
// TODO     $node->{PREV} = $ring->{DUMMY};
// TODO     ++$ring->{COUNT};
// TODO } 

// $ring->delete_value( $value ) : delete a node from the ring
// structure by value
// TODO sub delete_value {
// TODO     my ($ring, $value) = @_;
// TODO     my $node = $ring->search($value);
// TODO     return if $node == $ring->{DUMMY};
// TODO     $ring->delete_node($node);
// TODO }


// TODO 1;
//-----------------------------

// ^^PLEAC^^_13.14
//-----------------------------
// TODO use overload ('<=>' => \&threeway_compare);
// TODO sub threeway_compare {
// TODO     my ($s1, $s2) = @_;
// TODO     return uc($s1->{NAME}) cmp uc($s2->{NAME});
// TODO } 

// TODO use overload ( '""'  => \&stringify );
// TODO sub stringify {
// TODO     my $self = shift;
// TODO     return sprintf "%s (%05d)", 
// TODO             ucfirst(lc($self->{NAME})),
// TODO             $self->{IDNUM};
// TODO }
//-----------------------------
// TODO package TimeNumber;
// TODO use overload '+' => \&my_plus,
// TODO              '-' => \&my_minus,
// TODO              '*' => \&my_star,
// TODO              '/' => \&my_slash;
//-----------------------------
// TODO sub my_plus {
// TODO     my($left, $right) = @_;
// TODO     my $answer = $left->
// TODO new();

// TODO     $answer->{SECONDS} = $left->{SECONDS} + $right->{SECONDS};
// TODO     $answer->{MINUTES} = $left->{MINUTES} + $right->{MINUTES};
// TODO     $answer->{HOURS}   = $left->{HOURS}   + $right->{HOURS};

// TODO     if ($answer->{SECONDS} >= 60) {
// TODO         $answer->{SECONDS} %= 60;
// TODO         $answer->{MINUTES} ++;
// TODO     } 

// TODO     if ($answer->{MINUTES} >= 60) {
// TODO         $answer->{MINUTES} %= 60;
// TODO         $answer->{HOURS}   ++;
// TODO     } 

// TODO     return $answer;

// TODO } 
//-----------------------------
//!/usr/bin/perl
// show_strnum - demo operator overloading
// TODO use StrNum;           
// TODO     
// TODO $x = StrNum("Red"); $y = StrNum("Black");
// TODO $z = $x + $y; $r = $z * 3;
// TODO print "values are $x, $y, $z, and $r\n";
// TODO print "$x is ", $x < $y ? "LT" : "GE", " $y\n";

// values are Red, Black, RedBlack, and RedBlackRedBlackRedBlack
// Red is GE Black
//-----------------------------
// ^^INCLUDE^^ include/perl/ch13/StrNum
//-----------------------------
//!/usr/bin/perl
// demo_fixnum - show operator overloading
// TODO use FixNum;

// TODO FixNum->places(5);

// TODO $x = FixNum->new(40);
// TODO $y = FixNum->new(12);

// TODO print "sum of $x and $y is ", $x + $y, "\n";
// TODO print "product of $x and $y is ", $x * $y, "\n";

// TODO $z = $x / $y;
// TODO printf "$z has %d places\n", $z->places;
// TODO $z->places(2) unless $z->places;
// TODO print "div of $x by $y is $z\n";
// TODO print "square of that is ", $z * $z, "\n";

// TODO sum of STRFixNum: 40 and STRFixNum: 12 is STRFixNum: 52

// TODO product of STRFixNum: 40 and STRFixNum: 12 is STRFixNum: 480

// TODO STRFixNum: 3 has 0 places

// TODO div of STRFixNum: 40 by STRFixNum: 12 is STRFixNum: 3.33

// TODO square of that is STRFixNum: 11.11
//-----------------------------
// ^^INCLUDE^^ include/perl/ch13/FixNum
//-----------------------------

// ^^PLEAC^^_13.15
//-----------------------------
// TODO tie $s, "SomeClass"
//-----------------------------
// TODO SomeClass->
// TODO TIESCALAR()
//-----------------------------
// TODO $p = $s
//-----------------------------
// TODO $p = $obj->
// TODO FETCH()
//-----------------------------
// TODO $s = 10
//-----------------------------
// TODO $obj->STORE(10)
//-----------------------------
//!/usr/bin/perl
// demo_valuering - show tie class
// TODO use ValueRing;
// TODO tie $color, 'ValueRing', qw(red blue);
// TODO print "$color $color $color $color $color $color\n";
// TODO red blue red blue red blue


// TODO $color = 'green';
// TODO print "$color $color $color $color $color $color\n";
// TODO green red blue green red blue
//-----------------------------
// ^^INCLUDE^^ include/perl/ch13/ValueRing
//-----------------------------
// TODO no UnderScore;
//-----------------------------
//!/usr/bin/perl
// nounder_demo - show how to ban $_ from your program
// TODO no UnderScore;
// TODO @tests = (
// TODO     "Assignment"  => sub { $_ = "Bad" },
// TODO     "Reading"     => sub { print }, 
// TODO     "Matching"    => sub { $x = /badness/ },
// TODO     "Chop"        => sub { chop },
// TODO     "Filetest"    => sub { -x }, 
// TODO     "Nesting"     => sub { for (1..3) { print } },
// TODO );

// TODO while ( ($name, $code) = splice(@tests, 0, 2) ) {
// TODO     print "Testing $name: ";
// TODO     eval { &$code };
// TODO     print $@ ? "detected" : "missed!";
// TODO     print "\n";
// TODO } 
//-----------------------------
// TODO Testing Assignment: detected

// TODO Testing Reading: detected

// TODO Testing Matching: detected

// TODO Testing Chop: detected

// TODO Testing Filetest: detected

// TODO Testing Nesting: 123missed!
//-----------------------------
// ^^INCLUDE^^ include/perl/ch13/UnderScore
//-----------------------------
//!/usr/bin/perl 
// appendhash_demo - show magic hash that autoappends
// TODO use Tie::AppendHash;
// TODO tie %tab, 'Tie::AppendHash';

// TODO $tab{beer} = "guinness";
// TODO $tab{food} = "potatoes";
// TODO $tab{food} = "peas";

// TODO while (my($k, $v) = each %tab) {
// TODO     print "$k => [@$v]\n";
// TODO }
//-----------------------------
// TODO food => [potatoes peas]

// TODO beer => [guinness]
//-----------------------------
// ^^INCLUDE^^ include/perl/ch13/Tie/AppendHash.pm
//-----------------------------
//!/usr/bin/perl 
// folded_demo - demo hash that magically folds case
// TODO use Tie::Folded;
// TODO tie %tab, 'Tie::Folded';

// TODO $tab{VILLAIN}  = "big "; 
// TODO $tab{herOine}  = "red riding hood";
// TODO $tab{villain} .= "bad wolf";   

// TODO while ( my($k, $v) = each %tab ) {
// TODO     print "$k is $v\n";
// TODO }
//-----------------------------
// TODO heroine is red riding hood

// TODO villain is big bad wolf
//-----------------------------
// ^^INCLUDE^^ include/perl/ch13/Tie/Folded.pm
//-----------------------------
//!/usr/bin/perl -w
// revhash_demo - show hash that permits key *or* value lookups
// TODO use strict;
// TODO use Tie::RevHash;
// TODO my %tab;
// TODO tie %tab, 'Tie::RevHash';
// TODO %tab = qw{
// TODO     Red         Rojo
// TODO     Blue        Azul
// TODO     Green       Verde
// TODO };
// TODO $tab{EVIL} = [ "No way!", "Way!!" ];

// TODO while ( my($k, $v) = each %tab ) {
// TODO     print ref($k) ? "[@$k]" : $k, " => ",
// TODO         ref($v) ? "[@$v]" : $v, "\n";
// TODO } 
//-----------------------------
// TODO [No way! Way!!] => EVIL

// TODO EVIL => [No way! Way!!]

// TODO Blue => Azul

// TODO Green => Verde

// TODO Rojo => Red

// TODO Red => Rojo

// TODO Azul => Blue

// TODO Verde => Green
//-----------------------------
// ^^INCLUDE^^ include/perl/ch13/Tie/RevHash.pm
//-----------------------------
// TODO use Counter;
// TODO tie *CH, 'Counter';
// TODO while (<CH>) {
// TODO     print "Got $_\n";
// TODO } 
//-----------------------------
// ^^INCLUDE^^ include/perl/ch13/Counter
//-----------------------------
// TODO use Tie::Tee;
// TODO tie *TEE, 'Tie::Tee', *STDOUT, *STDERR;
// TODO print TEE "This line goes both places.\n";
//-----------------------------
//!/usr/bin/perl
// demo_tietee
// TODO use Tie::Tee;
// TODO use Symbol;

// TODO @handles = (*STDOUT);
// TODO for $i ( 1 .. 10 ) {
// TODO     push(@handles, $handle = gensym());
// TODO     open($handle, ">/tmp/teetest.$i");
// TODO } 

// TODO tie *TEE, 'Tie::Tee', @handles;
// TODO print TEE "This lines goes many places.\n";
//-----------------------------
// ^^INCLUDE^^ include/perl/ch13/Tie/Tee.pm
//-----------------------------
