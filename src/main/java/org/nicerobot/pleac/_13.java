package org.nicerobot.pleac;

/**
 * @author nicerobot
 * 
 */
public class _13 {

  public static void _00 () {
    // <PLEAC>

    // ^^PLEAC^^_13.0
    // -----------------------------
    // TODO perl -> $object = {}; # hash reference
    // TODO perl -> bless($object, "Data::Encoder"); # bless $object into Data::Encoder class
    // TODO perl -> bless($object); # bless $object into current package
    // -----------------------------
    // TODO perl -> $obj = [3,5];
    // TODO perl -> print ref($obj), " ", $obj->[1], "\n";
    // TODO perl -> bless($obj, "Human::Cannibal");
    // TODO perl -> print ref($obj), " ", $obj->[1], "\n";
    // TODO perl ->
    // TODO perl -> ARRAY 5
    // TODO perl ->
    // TODO perl -> Human::Cannibal 5
    // -----------------------------
    // TODO perl -> $obj->{Stomach} = "Empty"; # directly accessing an object's contents
    // TODO perl -> $obj->{NAME} = "Thag"; # uppercase field name to make it stand out (optional)
    // -----------------------------
    // TODO perl -> $encoded = $object->encode("data");
    // -----------------------------
    // TODO perl -> $encoded = Data::Encoder->encode("data");
    // -----------------------------
    // TODO perl -> sub new {
    // TODO perl -> my $class = shift;
    // TODO perl -> my $self = {}; # allocate new hash for object
    // TODO perl -> bless($self, $class);
    // TODO perl -> return $self;
    // TODO perl -> }
    // -----------------------------
    // TODO perl -> $object = Class->new();
    // -----------------------------
    // TODO perl -> $object = Class::new("Class");
    // -----------------------------
    // TODO perl -> sub class_only_method {
    // TODO perl -> my $class = shift;
    // TODO perl -> die "class method called on object" if ref $class;
    // TODO perl -> # more code here
    // TODO perl -> }
    // -----------------------------
    // TODO perl -> sub instance_only_method {
    // TODO perl -> my $self = shift;
    // TODO perl -> die "instance method called on class" unless ref $self;
    // TODO perl -> # more code here
    // TODO perl -> }
    // -----------------------------
    // TODO perl -> $lector = new Human::Cannibal;
    // TODO perl -> feed $lector "Zak";
    // TODO perl -> move $lector "New York";
    // -----------------------------
    // TODO perl -> $lector = Human::Cannibal->
    // TODO perl -> new();
    // TODO perl ->
    // TODO perl -> $lector->feed("Zak");
    // TODO perl -> $lector->move("New York");
    // -----------------------------
    // TODO perl -> printf STDERR "stuff here\n";
    // -----------------------------
    // TODO perl -> move $obj->{FIELD}; # probably wrong
    // TODO perl -> move $ary[$i]; # probably wrong
    // -----------------------------
    // TODO perl -> $obj->move->{FIELD}; # Surprise!
    // TODO perl -> $ary->move->[$i]; # Surprise!
    // -----------------------------
    // TODO perl -> $obj->{FIELD}->
    // TODO perl -> move()
    // TODO perl -> ; # Nope, you wish
    // TODO perl -> $ary[$i]->
    // TODO perl -> move;
    // TODO perl -> # Nope, you wish
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _01 () {
    // <PLEAC>

    // ^^PLEAC^^_13.1
    // -----------------------------
    // TODO perl -> sub new {
    // TODO perl -> my $class = shift;
    // TODO perl -> my $self = { };
    // TODO perl -> bless($self, $class);
    // TODO perl -> return $self;
    // TODO perl -> }
    // -----------------------------
    // TODO perl -> sub new { bless( { }, shift ) }
    // -----------------------------
    // TODO perl -> sub new { bless({}) }
    // -----------------------------
    // TODO perl -> sub new {
    // TODO perl -> my $self = { }; # allocate anonymous hash
    // TODO perl -> bless($self);
    // TODO perl -> # init two sample attributes/data members/fields
    // TODO perl -> $self->{START} = time();
    // TODO perl -> $self->{AGE} = 0;
    // TODO perl -> return $self;
    // TODO perl -> }
    // -----------------------------
    // TODO perl -> sub new {
    // TODO perl -> my $classname = shift; # What class are we constructing?
    // TODO perl -> my $self = {}; # Allocate new memory
    // TODO perl -> bless($self, $classname); # Mark it of the right type
    // TODO perl -> $self->{START} =
    // TODO perl -> time();
    // TODO perl -> # init data fields
    // TODO perl -> $self->{AGE} =
    // TODO perl -> 0;
    // TODO perl ->
    // TODO perl -> return $self; # And give it back
    // TODO perl -> }
    // -----------------------------
    // TODO perl -> sub new {
    // TODO perl -> my $classname = shift; # What class are we constructing?
    // TODO perl -> my $self = {}; # Allocate new memory
    // TODO perl -> bless($self, $classname); # Mark it of the right type
    // TODO perl -> $self->_init(@_); # Call _init with remaining args
    // TODO perl -> return $self;
    // TODO perl -> }
    // TODO perl ->
    // "private" method to initialize fields. It always sets START to
    // the current time, and AGE to 0. If called with arguments, _init
    // interprets them as key+value pairs to initialize the object with.
    // TODO perl -> sub _init {
    // TODO perl -> my $self = shift;
    // TODO perl -> $self->{START} =
    // TODO perl -> time();
    // TODO perl ->
    // TODO perl -> $self->{AGE} = 0;
    // TODO perl -> if (@_) {
    // TODO perl -> my %extra = @_;
    // TODO perl -> @$self{keys %extra} = values %extra;
    // TODO perl -> }
    // TODO perl -> }
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _02 () {
    // <PLEAC>

    // ^^PLEAC^^_13.2
    // -----------------------------
    // TODO perl -> sub DESTROY {
    // TODO perl -> my $self = shift;
    // TODO perl -> printf("$self dying at %s\n", scalar localtime);
    // TODO perl -> }
    // -----------------------------
    // TODO perl -> $self->{WHATEVER} = $self;
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _03 () {
    // <PLEAC>

    // ^^PLEAC^^_13.3
    // -----------------------------
    // TODO perl -> sub get_name {
    // TODO perl -> my $self = shift;
    // TODO perl -> return $self->{NAME};
    // TODO perl -> }
    // TODO perl ->
    // TODO perl -> sub set_name {
    // TODO perl -> my $self = shift;
    // TODO perl -> $self->{NAME} = shift;
    // TODO perl -> }
    // -----------------------------
    // TODO perl -> sub name {
    // TODO perl -> my $self = shift;
    // TODO perl -> if (@_) { $self->{NAME} = shift }
    // TODO perl -> return $self->{NAME};
    // TODO perl -> }
    // -----------------------------
    // TODO perl -> sub age {
    // TODO perl -> my $self = shift;
    // TODO perl -> my $prev = $self->{AGE};
    // TODO perl -> if (@_) { $self->{AGE} = shift }
    // TODO perl -> return $prev;
    // TODO perl -> }
    // sample call of get and set: happy birthday!
    // TODO perl -> $obj->age( 1 + $obj->age );
    // -----------------------------
    // TODO perl -> $him = Person->
    // TODO perl -> new()
    // TODO perl -> ;
    // TODO perl -> $him->{NAME} = "Sylvester";
    // TODO perl -> $him->{AGE} = 23;
    // -----------------------------
    // TODO perl -> use Carp;
    // TODO perl -> sub name {
    // TODO perl -> my $self = shift;
    // TODO perl -> return $self->{NAME} unless @_;
    // TODO perl -> local $_ = shift;
    // TODO perl -> croak "too many arguments" if @_;
    // TODO perl -> if ($^W) {
    // TODO perl -> /[^\s\w'-]/ && carp "funny characters in name"; #'
    // TODO perl -> /\d/ && carp "numbers in name";
    // TODO perl -> /\S+(\s+\S+)+/ || carp "prefer multiword name";
    // TODO perl -> /\S/ || carp "name is blank";
    // TODO perl -> }
    // TODO perl OOPS s/(\w+)L$1/g; # enforce capitalization
    // TODO perl -> $self->{NAME} = $_;
    // TODO perl -> }
    // -----------------------------
    // TODO perl -> package Person;
    // TODO perl ->
    // this is the same as before...
    // TODO perl -> sub new {
    // TODO perl -> my $that = shift;
    // TODO perl -> my $class = ref($that) || $that;
    // TODO perl -> my $self = {
    // TODO perl -> NAME => undef,
    // TODO perl -> AGE => undef,
    // TODO perl -> PEERS => [],
    // TODO perl -> };
    // TODO perl -> bless($self, $class);
    // TODO perl -> return $self;
    // TODO perl -> }
    // TODO perl ->
    // TODO perl -> use Alias qw(attr);
    // TODO perl -> use vars qw($NAME $AGE @PEERS);
    // TODO perl ->
    // TODO perl -> sub name {
    // TODO perl -> my $self = attr shift;
    // TODO perl -> if (@_) { $NAME = shift; }
    // TODO perl -> return $NAME;
    // TODO perl -> };
    // TODO perl ->
    // TODO perl -> sub age {
    // TODO perl -> my $self = attr shift;
    // TODO perl -> if (@_) { $AGE = shift; }
    // TODO perl -> return $AGE;
    // TODO perl -> }
    // TODO perl ->
    // TODO perl -> sub peers {
    // TODO perl -> my $self = attr shift;
    // TODO perl -> if (@_) { @PEERS = @_; }
    // TODO perl -> return @PEERS;
    // TODO perl -> }
    // TODO perl ->
    // TODO perl -> sub exclaim {
    // TODO perl -> my $self = attr shift;
    // TODO perl -> return sprintf "Hi, I'm %s, age %d, working with %s",
    // TODO perl -> $NAME, $AGE, join(", ", @PEERS);
    // TODO perl -> }
    // TODO perl ->
    // TODO perl -> sub happy_birthday {
    // TODO perl -> my $self = attr shift;
    // TODO perl -> return ++$AGE;
    // TODO perl -> }
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _04 () {
    // <PLEAC>

    // ^^PLEAC^^_13.4
    // -----------------------------
    // TODO perl -> package Person;
    // TODO perl ->
    // TODO perl -> $Body_Count = 0;
    // TODO perl ->
    // TODO perl -> sub population { return $Body_Count }
    // TODO perl ->
    // TODO perl -> sub new { # constructor
    // TODO perl -> $Body_Count++;
    // TODO perl -> return bless({}, shift);
    // TODO perl -> }
    // TODO perl ->
    // TODO perl -> sub DESTROY { --$BodyCount } # destructor
    // TODO perl ->
    // later, the user can say this:
    // TODO perl -> package main;
    // TODO perl ->
    // TODO perl -> for (1..10) { push @people, Person->new }
    // TODO perl -> printf "There are %d people alive.\n", Person->population();
    // TODO perl ->
    // TODO perl -> There are 10 people alive.
    // -----------------------------
    // TODO perl -> $him = Person->
    // TODO perl -> new()
    // TODO perl -> ;
    // TODO perl -> $him->gender("male");
    // TODO perl ->
    // TODO perl -> $her = Person->
    // TODO perl -> new()
    // TODO perl -> ;
    // TODO perl -> $her->gender("female");
    // -----------------------------
    // TODO perl -> FixedArray->Max_Bounds(100); # set for whole class
    // TODO perl -> $alpha = FixedArray->new();
    // TODO perl -> printf "Bound on alpha is %d\n", $alpha->Max_Bounds();
    // TODO perl -> 100
    // TODO perl ->
    // TODO perl -> $beta = FixedArray->new();
    // TODO perl -> $beta->Max_Bounds(50); # still sets for whole class
    // TODO perl -> printf "Bound on alpha is %d\n", $alpha->Max_Bounds();
    // TODO perl -> 50
    // -----------------------------
    // TODO perl -> package FixedArray;
    // TODO perl -> $Bounds = 7; # default
    // TODO perl -> sub new { bless( {}, shift ) }
    // TODO perl -> sub Max_Bounds {
    // TODO perl -> my $proto = shift;
    // TODO perl -> $Bounds = shift if @_; # allow updates
    // TODO perl -> return $Bounds;
    // TODO perl -> }
    // -----------------------------
    // TODO perl -> sub Max_Bounds { $Bounds }
    // -----------------------------
    // TODO perl -> sub new {
    // TODO perl -> my $class = shift;
    // TODO perl -> my $self = bless({}, $class);
    // TODO perl -> $self->{Max_Bounds_ref} = \$Bounds;
    // TODO perl -> return $self;
    // TODO perl -> }
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _05 () {
    // <PLEAC>

    // ^^PLEAC^^_13.5
    // -----------------------------
    // TODO perl -> use Class::Struct; # load struct-building module
    // TODO perl ->
    // TODO perl -> struct Person => { # create a definition for a "Person"
    // TODO perl -> name => '$', # name field is a scalar
    // TODO perl -> age => '$', # age field is also a scalar
    // TODO perl -> peers => '@', # but peers field is an array (reference)
    // TODO perl -> };
    // TODO perl ->
    // TODO perl -> my $p = Person->
    // TODO perl -> new()
    // TODO perl -> ; # allocate an empty Person struct
    // TODO perl ->
    // TODO perl -> $p->name("Jason Smythe"); # set its name field
    // TODO perl -> $p->age(13); # set its age field
    // TODO perl -> $p->peers( ["Wilbur", "Ralph", "Fred" ] ); # set its peers field
    // TODO perl ->
    // or this way:
    // TODO perl -> @{$p->peers} = ("Wilbur", "Ralph", "Fred");
    // TODO perl ->
    // fetch various values, including the zeroth friend
    // TODO perl -> printf "At age %d, %s's first friend is %s.\n",
    // TODO perl -> $p->age, $p->name, $p->peers(0);
    // -----------------------------
    // TODO perl -> use Class::Struct;
    // TODO perl ->
    // TODO perl -> struct Person => {name => '$', age => '$'}; #'
    // TODO perl -> struct Family => {head => 'Person', address => '$', members => '@'}; #'
    // TODO perl ->
    // TODO perl -> $folks = Family->
    // TODO perl -> new();
    // TODO perl ->
    // TODO perl -> $dad = $folks->head;
    // TODO perl -> $dad->name("John");
    // TODO perl -> $dad->age(34);
    // TODO perl ->
    // TODO perl -> printf("%s's age is %d\n", $folks->head->name, $folks->head->age);
    // -----------------------------
    // TODO perl -> sub Person::age {
    // TODO perl -> use Carp;
    // TODO perl -> my ($self, $age) = @_;
    // TODO perl -> if (@_ > 2) { confess "too many arguments" }
    // TODO perl -> elsif (@_ == 1) { return $struct->{'age'} }
    // TODO perl -> elsif (@_ == 2) {
    // TODO perl -> carp "age `$age' isn't numeric" if $age !~ /^\d+/;
    // TODO perl -> carp "age `$age' is unreasonable" if $age > 150;
    // TODO perl -> $self->{'age'} = $age;
    // TODO perl -> }
    // TODO perl -> }
    // -----------------------------
    // TODO perl -> if ($^W) {
    // TODO perl -> carp "age `$age' isn't numeric" if $age !~ /^\d+/;
    // TODO perl -> carp "age `$age' is unreasonable" if $age > 150;
    // TODO perl -> }
    // -----------------------------
    // TODO perl -> my $gripe = $^W ? \&carp : \&croak;
    // TODO perl -> $gripe->("age `$age' isn't numeric") if $age !~ /^\d+/;
    // TODO perl -> $gripe->("age `$age' is unreasonable") if $age > 150;
    // -----------------------------
    // TODO perl -> struct Family => [head => 'Person', address => '$', members => '@']; #'
    // -----------------------------
    // TODO perl -> struct Card => {
    // TODO perl -> name => '$',
    // TODO perl -> color => '$',
    // TODO perl -> cost => '$',
    // TODO perl -> type => '$',
    // TODO perl -> release => '$',
    // TODO perl -> text => '$',
    // TODO perl -> };
    // -----------------------------
    // TODO perl -> struct Card => map { $_ => '$' } qw(name color cost type release text); #'
    // -----------------------------
    // TODO perl -> struct hostent => { reverse qw{
    // TODO perl -> $ name
    // TODO perl -> @ aliases
    // TODO perl -> $ addrtype
    // TODO perl -> $ length
    // TODO perl -> @ addr_list
    // TODO perl -> }};
    // -----------------------------
    // define h_type h_addrtype
    // define h_addr h_addr_list[0]
    // -----------------------------
    // make (hostent object)->
    // TODO perl -> type()
    // TODO perl -> same as (hostent object)->
    // TODO perl -> addrtype()
    // TODO perl ->
    // TODO perl -> *hostent::type = \&hostent::addrtype;
    // TODO perl ->
    // make (hostenv object)->
    // TODO perl -> addr()
    // TODO perl -> same as (hostenv object)->addr_list(0)
    // TODO perl -> sub hostent::addr { shift->addr_list(0,@_) }
    // -----------------------------
    // TODO perl -> package Extra::hostent;
    // TODO perl -> use Net::hostent;
    // TODO perl -> @ISA = qw(hostent);
    // TODO perl -> sub addr { shift->addr_list(0,@_) }
    // TODO perl -> 1;
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _06 () {
    // <PLEAC>

    // ^^PLEAC^^_13.6
    // -----------------------------
    // TODO perl -> my $proto = shift;
    // TODO perl -> my $class = ref($proto) || $proto;
    // TODO perl -> my $parent = ref($proto) && $proto;
    // -----------------------------
    // TODO perl -> $ob1 = SomeClass->
    // TODO perl -> new()
    // TODO perl -> ;
    // later on
    // TODO perl -> $ob2 = (ref $ob1)->
    // TODO perl -> new();
    // -----------------------------
    // TODO perl -> $ob1 = Widget->new();
    // TODO perl -> $ob2 = $ob1->new();
    // -----------------------------
    // TODO perl -> sub new {
    // TODO perl -> my $proto = shift;
    // TODO perl -> my $class = ref($proto) || $proto;
    // TODO perl -> my $parent = ref($proto) && $proto;
    // TODO perl ->
    // TODO perl -> my $self;
    // TODO perl -> # check whether we're shadowing a new from @ISA
    // TODO perl -> if (@ISA && $proto->SUPER::can('new') ) {
    // TODO perl -> $self = $proto->SUPER::new(@_);
    // TODO perl -> } else {
    // TODO perl -> $self = {};
    // TODO perl -> bless ($self, $proto);
    // TODO perl -> }
    // TODO perl -> bless($self, $class);
    // TODO perl ->
    // TODO perl -> $self->{PARENT} = $parent;
    // TODO perl -> $self->{START} = time(); # init data fields
    // TODO perl -> $self->{AGE} = 0;
    // TODO perl -> return $self;
    // TODO perl -> }
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _07 () {
    // <PLEAC>

    // ^^PLEAC^^_13.7
    // -----------------------------
    // TODO perl -> $methname = "flicker";
    // TODO perl -> $obj->$methname(10); # calls $obj->flicker(10);
    // TODO perl ->
    // call three methods on the object, by name
    // TODO perl -> foreach $m ( qw(start run stop) ) {
    // TODO perl -> $obj->
    // TODO perl -> $m();
    // TODO perl ->
    // TODO perl -> }
    // -----------------------------
    // TODO perl -> @methods = qw(name rank serno);
    // TODO perl -> %his_info = map { $_ => $ob->$_() } @methods;
    // TODO perl ->
    // same as this:
    // TODO perl ->
    // TODO perl -> %his_info = (
    // TODO perl -> 'name' => $ob->
    // TODO perl -> name()
    // TODO perl -> ,
    // TODO perl -> 'rank' => $ob->
    // TODO perl -> rank()
    // TODO perl -> ,
    // TODO perl -> 'serno' => $ob->
    // TODO perl -> serno()
    // TODO perl -> ,
    // TODO perl -> );
    // -----------------------------
    // TODO perl -> my $fnref = sub { $ob->method(@_) };
    // -----------------------------
    // TODO perl -> $fnref->(10, "fred");
    // -----------------------------
    // TODO perl -> $obj->method(10, "fred");
    // -----------------------------
    // TODO perl -> $obj->can('method_name')->($obj_target, @arguments)
    // TODO perl -> if $obj_target->isa( ref $obj );
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _08 () {
    // <PLEAC>

    // ^^PLEAC^^_13.8
    // -----------------------------
    // TODO perl -> $obj->isa("HTTP::Message"); # as object method
    // TODO perl -> HTTP::Response->isa("HTTP::Message"); # as class method
    // TODO perl ->
    // TODO perl -> if ($obj->can("method_name")) { .... } # check method validity
    // -----------------------------
    // TODO perl -> $has_io = $fd->isa("IO::Handle");
    // TODO perl -> $itza_handle = IO::Socket->isa("IO::Handle");
    // -----------------------------
    // TODO perl -> $his_print_method = $obj->can('as_string');
    // -----------------------------
    // TODO perl -> Some_Module->VERSION(3.0);
    // TODO perl -> $his_vers = $obj->
    // TODO perl -> VERSION()
    // TODO perl -> ;
    // -----------------------------
    // TODO perl -> use Some_Module 3.0;
    // -----------------------------
    // TODO perl -> use vars qw($VERSION);
    // TODO perl -> $VERSION = '1.01';
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _09 () {
    // <PLEAC>

    // ^^PLEAC^^_13.9
    // -----------------------------
    // TODO perl -> package Person;
    // TODO perl -> sub new {
    // TODO perl -> my $class = shift;
    // TODO perl -> my $self = { };
    // TODO perl -> return bless $self, $class;
    // TODO perl -> }
    // TODO perl -> sub name {
    // TODO perl -> my $self = shift;
    // TODO perl -> $self->{NAME} = shift if @_;
    // TODO perl -> return $self->{NAME};
    // TODO perl -> }
    // TODO perl -> sub age {
    // TODO perl -> my $self = shift;
    // TODO perl -> $self->{AGE} = shift if @_;
    // TODO perl -> return $self->{AGE};
    // TODO perl -> }
    // -----------------------------
    // TODO perl -> use Person;
    // TODO perl -> my $dude = Person->
    // TODO perl -> new()
    // TODO perl -> ;
    // TODO perl -> $dude->name("Jason");
    // TODO perl -> $dude->age(23);
    // TODO perl -> printf "%s is age %d.\n", $dude->name, $dude->age;
    // -----------------------------
    // TODO perl -> package Employee;
    // TODO perl -> use Person;
    // TODO perl -> @ISA = ("Person");
    // TODO perl -> 1;
    // -----------------------------
    // TODO perl -> use Employee;
    // TODO perl -> my $empl = Employee->
    // TODO perl -> new()
    // TODO perl -> ;
    // TODO perl -> $empl->name("Jason");
    // TODO perl -> $empl->age(23);
    // TODO perl -> printf "%s is age %d.\n", $empl->name, $empl->age;
    // -----------------------------
    // TODO perl -> $him = Person::
    // TODO perl -> new()
    // TODO perl -> ; # WRONG
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _10 () {
    // <PLEAC>

    // ^^PLEAC^^_13.10
    // -----------------------------
    // TODO perl -> sub meth {
    // TODO perl -> my $self = shift;
    // TODO perl -> $self->SUPER::
    // TODO perl -> meth()
    // TODO perl -> ;
    // TODO perl -> }
    // -----------------------------
    // TODO perl -> $self->
    // TODO perl -> meth();
    // TODO perl -> # Call wherever first meth is found
    // TODO perl -> $self->Where::
    // TODO perl -> meth();
    // TODO perl -> # Start looking in package "Where"
    // TODO perl -> $self->SUPER::
    // TODO perl -> meth();
    // TODO perl -> # Call overridden version
    // -----------------------------
    // TODO perl -> sub new {
    // TODO perl -> my $classname = shift; # What class are we constructing?
    // TODO perl -> my $self = $classname->SUPER::new(@_);
    // TODO perl -> $self->_init(@_);
    // TODO perl -> return $self; # And give it back
    // TODO perl -> }
    // TODO perl ->
    // TODO perl -> sub _init {
    // TODO perl -> my $self = shift;
    // TODO perl -> $self->{START} = time(); # init data fields
    // TODO perl -> $self->{AGE} = 0;
    // TODO perl -> $self->{EXTRA} = { @_ }; # anything extra
    // TODO perl -> }
    // -----------------------------
    // TODO perl -> $obj = Widget->new( haircolor => red, freckles => 121 );
    // -----------------------------
    // TODO perl -> my $self = bless {}, $class;
    // TODO perl -> for my $class (@ISA) {
    // TODO perl -> my $meth = $class . "::_init";
    // TODO perl -> $self->$meth(@_) if $class->can("_init");
    // TODO perl -> }
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _11 () {
    // <PLEAC>

    // ^^PLEAC^^_13.11
    // -----------------------------
    // TODO perl -> package Person;
    // TODO perl -> use strict;
    // TODO perl -> use Carp;
    // TODO perl -> use vars qw($AUTOLOAD %ok_field);
    // TODO perl ->
    // Authorize four attribute fields
    // TODO perl -> for my $attr ( qw(name age peers parent) ) { $ok_field{$attr}++; }
    // TODO perl ->
    // TODO perl -> sub AUTOLOAD {
    // TODO perl -> my $self = shift;
    // TODO perl -> my $attr = $AUTOLOAD;
    // TODO perl -> $attr =~ s/.*:://;
    // TODO perl -> return unless $attr =~ /[^A-Z]/; # skip DESTROY and all-cap methods
    // TODO perl -> croak "invalid attribute method: ->
    // TODO perl -> $attr()"
    // TODO perl -> unless $ok_field{$attr};
    // TODO perl -> $self->{uc $attr} = shift if @_;
    // TODO perl -> return $self->{uc $attr};
    // TODO perl -> }
    // TODO perl -> sub new {
    // TODO perl -> my $proto = shift;
    // TODO perl -> my $class = ref($proto) || $proto;
    // TODO perl -> my $parent = ref($proto) && $proto;
    // TODO perl -> my $self = {};
    // TODO perl -> bless($self, $class);
    // TODO perl -> $self->parent($parent);
    // TODO perl -> return $self;
    // TODO perl -> }
    // TODO perl -> 1;
    // -----------------------------
    // TODO perl -> use Person;
    // TODO perl -> my ($dad, $kid);
    // TODO perl -> $dad = Person->new;
    // TODO perl -> $dad->name("Jason");
    // TODO perl -> $dad->age(23);
    // TODO perl -> $kid = $dad->new;
    // TODO perl -> $kid->name("Rachel");
    // TODO perl -> $kid->age(2);
    // TODO perl -> printf "Kid's parent is %s\n", $kid->parent->name;
    // Kid's parent is Jason
    // -----------------------------
    // TODO perl -> sub AUTOLOAD {
    // TODO perl -> my $self = shift;
    // TODO perl -> my $attr = $AUTOLOAD;
    // TODO perl -> $attr =~ s/.*:://;
    // TODO perl -> return if $attr eq 'DESTROY';
    // TODO perl ->
    // TODO perl -> if ($ok_field{$attr}) {
    // TODO perl -> $self->{uc $attr} = shift if @_;
    // TODO perl -> return $self->{uc $attr};
    // TODO perl -> } else {
    // TODO perl -> my $superior = "SUPER::$attr";
    // TODO perl -> $self->$superior(@_);
    // TODO perl -> }
    // TODO perl -> }
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _12 () {
    // <PLEAC>

    // ^^PLEAC^^_13.12
    // -----------------------------
    // TODO perl -> sub Employee::age {
    // TODO perl -> my $self = shift;
    // TODO perl -> $self->{Employee_age} = shift if @_;
    // TODO perl -> return $self->{Employee_age};
    // TODO perl -> }
    // -----------------------------
    // TODO perl -> package Person;
    // TODO perl -> use Class::Attributes; # see explanation below
    // TODO perl -> mkattr qw(name age peers parent);
    // -----------------------------
    // TODO perl -> package Employee;
    // TODO perl -> @ISA = qw(Person);
    // TODO perl -> use Class::Attributes;
    // TODO perl -> mkattr qw(salary age boss);
    // -----------------------------
    // TODO perl -> package Class::Attributes;
    // TODO perl -> use strict;
    // TODO perl -> use Carp;
    // TODO perl -> use Exporter ();
    // TODO perl -> use vars qw(@ISA @EXPORT);
    // TODO perl -> @ISA = qw(Exporter);
    // TODO perl -> @EXPORT = qw(mkattr);
    // TODO perl -> sub mkattr {
    // TODO perl -> my $hispack = caller();
    // TODO perl -> for my $attr (@_) {
    // TODO perl -> my($field, $method);
    // TODO perl -> $method = "${hispack}::$attr";
    // TODO perl -> ($field = $method) =~ s/:/_/g;
    // TODO perl -> no strict 'refs'; # here comes the kluglich bit
    // TODO perl -> *$method = sub {
    // TODO perl -> my $self = shift;
    // TODO perl -> confess "too many arguments" if @_ > 1;
    // TODO perl -> $self->{$field} = shift if @_;
    // TODO perl -> return $self->{$field};
    // TODO perl -> };
    // TODO perl -> }
    // TODO perl -> }
    // TODO perl -> 1;
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _13 () {
    // <PLEAC>

    // ^^PLEAC^^_13.13
    // -----------------------------
    // TODO perl -> $node->{NEXT} = $node;
    // -----------------------------
    // TODO perl -> package Ring;
    // TODO perl ->
    // return an empty ring structure
    // TODO perl -> sub new {
    // TODO perl -> my $class = shift;
    // TODO perl -> my $node = { };
    // TODO perl -> $node->{NEXT} = $node->{PREV} = $node;
    // TODO perl -> my $self = { DUMMY => $node, COUNT => 0 };
    // TODO perl -> bless $self, $class;
    // TODO perl -> return $self;
    // TODO perl -> }
    // -----------------------------
    // TODO perl -> use Ring;
    // TODO perl ->
    // TODO perl -> $COUNT = 1000;
    // TODO perl -> for (1 .. 20) {
    // TODO perl -> my $r = Ring->
    // TODO perl -> new()
    // TODO perl -> ;
    // TODO perl -> for ($i = 0; $i < $COUNT; $i++) { $r->insert($i) }
    // TODO perl -> }
    // -----------------------------
    // when a Ring is destroyed, destroy the ring structure it contains
    // TODO perl -> sub DESTROY {
    // TODO perl -> my $ring = shift;
    // TODO perl -> my $node;
    // TODO perl -> for ( $node = $ring->{DUMMY}->{NEXT};
    // TODO perl -> $node != $ring->{DUMMY};
    // TODO perl -> $node = $node->{NEXT} )
    // TODO perl -> {
    // TODO perl -> $ring->delete_node($node);
    // TODO perl -> }
    // TODO perl -> $node->{PREV} = $node->{NEXT} = undef;
    // TODO perl -> }
    // TODO perl ->
    // delete a node from the ring structure
    // TODO perl -> sub delete_node {
    // TODO perl -> my ($ring, $node) = @_;
    // TODO perl -> $node->{PREV}->{NEXT} = $node->{NEXT};
    // TODO perl -> $node->{NEXT}->{PREV} = $node->{PREV};
    // TODO perl -> --$ring->{COUNT};
    // TODO perl -> }
    // -----------------------------
    // $node = $ring->search( $value ) : find $value in the ring
    // structure in $node
    // TODO perl -> sub search {
    // TODO perl -> my ($ring, $value) = @_;
    // TODO perl -> my $node = $ring->{DUMMY}->{NEXT};
    // TODO perl -> while ($node != $ring->{DUMMY} && $node->{VALUE} != $value) {
    // TODO perl -> $node = $node->{NEXT};
    // TODO perl -> }
    // TODO perl -> return $node;
    // TODO perl -> }
    // TODO perl ->
    // $ring->insert( $value ) : insert $value into the ring structure
    // TODO perl -> sub insert {
    // TODO perl -> my ($ring, $value) = @_;
    // TODO perl -> my $node = { VALUE => $value };
    // TODO perl -> $node->{NEXT} = $ring->{DUMMY}->{NEXT};
    // TODO perl -> $ring->{DUMMY}->{NEXT}->{PREV} = $node;
    // TODO perl -> $ring->{DUMMY}->{NEXT} = $node;
    // TODO perl -> $node->{PREV} = $ring->{DUMMY};
    // TODO perl -> ++$ring->{COUNT};
    // TODO perl -> }
    // TODO perl ->
    // $ring->delete_value( $value ) : delete a node from the ring
    // structure by value
    // TODO perl -> sub delete_value {
    // TODO perl -> my ($ring, $value) = @_;
    // TODO perl -> my $node = $ring->search($value);
    // TODO perl -> return if $node == $ring->{DUMMY};
    // TODO perl -> $ring->delete_node($node);
    // TODO perl -> }
    // TODO perl ->
    // TODO perl ->
    // TODO perl -> 1;
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _14 () {
    // <PLEAC>

    // ^^PLEAC^^_13.14
    // -----------------------------
    // TODO perl -> use overload ('<=>' => \&threeway_compare);
    // TODO perl -> sub threeway_compare {
    // TODO perl -> my ($s1, $s2) = @_;
    // TODO perl -> return uc($s1->{NAME}) cmp uc($s2->{NAME});
    // TODO perl -> }
    // TODO perl ->
    // TODO perl -> use overload ( '""' => \&stringify );
    // TODO perl -> sub stringify {
    // TODO perl -> my $self = shift;
    // TODO perl -> return sprintf "%s (%05d)",
    // TODO perl -> ucfirst(lc($self->{NAME})),
    // TODO perl -> $self->{IDNUM};
    // TODO perl -> }
    // -----------------------------
    // TODO perl -> package TimeNumber;
    // TODO perl -> use overload '+' => \&my_plus,
    // TODO perl -> '-' => \&my_minus,
    // TODO perl -> '*' => \&my_star,
    // TODO perl -> '/' => \&my_slash;
    // -----------------------------
    // TODO perl -> sub my_plus {
    // TODO perl -> my($left, $right) = @_;
    // TODO perl -> my $answer = $left->
    // TODO perl -> new();
    // TODO perl ->
    // TODO perl -> $answer->{SECONDS} = $left->{SECONDS} + $right->{SECONDS};
    // TODO perl -> $answer->{MINUTES} = $left->{MINUTES} + $right->{MINUTES};
    // TODO perl -> $answer->{HOURS} = $left->{HOURS} + $right->{HOURS};
    // TODO perl ->
    // TODO perl -> if ($answer->{SECONDS} >= 60) {
    // TODO perl -> $answer->{SECONDS} %= 60;
    // TODO perl -> $answer->{MINUTES} ++;
    // TODO perl -> }
    // TODO perl ->
    // TODO perl -> if ($answer->{MINUTES} >= 60) {
    // TODO perl -> $answer->{MINUTES} %= 60;
    // TODO perl -> $answer->{HOURS} ++;
    // TODO perl -> }
    // TODO perl ->
    // TODO perl -> return $answer;
    // TODO perl ->
    // TODO perl -> }
    // -----------------------------
    // !/usr/bin/perl
    // show_strnum - demo operator overloading
    // TODO perl -> use StrNum;
    // TODO perl ->
    // TODO perl -> $x = StrNum("Red"); $y = StrNum("Black");
    // TODO perl -> $z = $x + $y; $r = $z * 3;
    // TODO perl -> print "values are $x, $y, $z, and $r\n";
    // TODO perl -> print "$x is ", $x < $y ? "LT" : "GE", " $y\n";
    // TODO perl ->
    // values are Red, Black, RedBlack, and RedBlackRedBlackRedBlack
    // Red is GE Black
    // -----------------------------
    // ^^INCLUDE^^ include/perl/ch13/StrNum
    // -----------------------------
    // !/usr/bin/perl
    // demo_fixnum - show operator overloading
    // TODO perl -> use FixNum;
    // TODO perl ->
    // TODO perl -> FixNum->places(5);
    // TODO perl ->
    // TODO perl -> $x = FixNum->new(40);
    // TODO perl -> $y = FixNum->new(12);
    // TODO perl ->
    // TODO perl -> print "sum of $x and $y is ", $x + $y, "\n";
    // TODO perl -> print "product of $x and $y is ", $x * $y, "\n";
    // TODO perl ->
    // TODO perl -> $z = $x / $y;
    // TODO perl -> printf "$z has %d places\n", $z->places;
    // TODO perl -> $z->places(2) unless $z->places;
    // TODO perl -> print "div of $x by $y is $z\n";
    // TODO perl -> print "square of that is ", $z * $z, "\n";
    // TODO perl ->
    // TODO perl -> sum of STRFixNum: 40 and STRFixNum: 12 is STRFixNum: 52
    // TODO perl ->
    // TODO perl -> product of STRFixNum: 40 and STRFixNum: 12 is STRFixNum: 480
    // TODO perl ->
    // TODO perl -> STRFixNum: 3 has 0 places
    // TODO perl ->
    // TODO perl -> div of STRFixNum: 40 by STRFixNum: 12 is STRFixNum: 3.33
    // TODO perl ->
    // TODO perl -> square of that is STRFixNum: 11.11
    // -----------------------------
    // ^^INCLUDE^^ include/perl/ch13/FixNum
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _15 () {
    // <PLEAC>

    // ^^PLEAC^^_13.15
    // -----------------------------
    // TODO perl -> tie $s, "SomeClass"
    // -----------------------------
    // TODO perl -> SomeClass->
    // TODO perl -> TIESCALAR()
    // -----------------------------
    // TODO perl -> $p = $s
    // -----------------------------
    // TODO perl -> $p = $obj->
    // TODO perl -> FETCH()
    // -----------------------------
    // TODO perl -> $s = 10
    // -----------------------------
    // TODO perl -> $obj->STORE(10)
    // -----------------------------
    // !/usr/bin/perl
    // demo_valuering - show tie class
    // TODO perl -> use ValueRing;
    // TODO perl -> tie $color, 'ValueRing', qw(red blue);
    // TODO perl -> print "$color $color $color $color $color $color\n";
    // TODO perl -> red blue red blue red blue
    // TODO perl ->
    // TODO perl ->
    // TODO perl -> $color = 'green';
    // TODO perl -> print "$color $color $color $color $color $color\n";
    // TODO perl -> green red blue green red blue
    // -----------------------------
    // ^^INCLUDE^^ include/perl/ch13/ValueRing
    // -----------------------------
    // TODO perl -> no UnderScore;
    // -----------------------------
    // !/usr/bin/perl
    // nounder_demo - show how to ban $_ from your program
    // TODO perl -> no UnderScore;
    // TODO perl -> @tests = (
    // TODO perl -> "Assignment" => sub { $_ = "Bad" },
    // TODO perl -> "Reading" => sub { print },
    // TODO perl -> "Matching" => sub { $x = /badness/ },
    // TODO perl -> "Chop" => sub { chop },
    // TODO perl -> "Filetest" => sub { -x },
    // TODO perl -> "Nesting" => sub { for (1..3) { print } },
    // TODO perl -> );
    // TODO perl ->
    // TODO perl -> while ( ($name, $code) = splice(@tests, 0, 2) ) {
    // TODO perl -> print "Testing $name: ";
    // TODO perl -> eval { &$code };
    // TODO perl -> print $@ ? "detected" : "missed!";
    // TODO perl -> print "\n";
    // TODO perl -> }
    // -----------------------------
    // TODO perl -> Testing Assignment: detected
    // TODO perl ->
    // TODO perl -> Testing Reading: detected
    // TODO perl ->
    // TODO perl -> Testing Matching: detected
    // TODO perl ->
    // TODO perl -> Testing Chop: detected
    // TODO perl ->
    // TODO perl -> Testing Filetest: detected
    // TODO perl ->
    // TODO perl -> Testing Nesting: 123missed!
    // -----------------------------
    // ^^INCLUDE^^ include/perl/ch13/UnderScore
    // -----------------------------
    // !/usr/bin/perl
    // appendhash_demo - show magic hash that autoappends
    // TODO perl -> use Tie::AppendHash;
    // TODO perl -> tie %tab, 'Tie::AppendHash';
    // TODO perl ->
    // TODO perl -> $tab{beer} = "guinness";
    // TODO perl -> $tab{food} = "potatoes";
    // TODO perl -> $tab{food} = "peas";
    // TODO perl ->
    // TODO perl -> while (my($k, $v) = each %tab) {
    // TODO perl -> print "$k => [@$v]\n";
    // TODO perl -> }
    // -----------------------------
    // TODO perl -> food => [potatoes peas]
    // TODO perl ->
    // TODO perl -> beer => [guinness]
    // -----------------------------
    // ^^INCLUDE^^ include/perl/ch13/Tie/AppendHash.pm
    // -----------------------------
    // !/usr/bin/perl
    // folded_demo - demo hash that magically folds case
    // TODO perl -> use Tie::Folded;
    // TODO perl -> tie %tab, 'Tie::Folded';
    // TODO perl ->
    // TODO perl -> $tab{VILLAIN} = "big ";
    // TODO perl -> $tab{herOine} = "red riding hood";
    // TODO perl -> $tab{villain} .= "bad wolf";
    // TODO perl ->
    // TODO perl -> while ( my($k, $v) = each %tab ) {
    // TODO perl -> print "$k is $v\n";
    // TODO perl -> }
    // -----------------------------
    // TODO perl -> heroine is red riding hood
    // TODO perl ->
    // TODO perl -> villain is big bad wolf
    // -----------------------------
    // ^^INCLUDE^^ include/perl/ch13/Tie/Folded.pm
    // -----------------------------
    // !/usr/bin/perl -w
    // revhash_demo - show hash that permits key *or* value lookups
    // TODO perl -> use strict;
    // TODO perl -> use Tie::RevHash;
    // TODO perl -> my %tab;
    // TODO perl -> tie %tab, 'Tie::RevHash';
    // TODO perl -> %tab = qw{
    // TODO perl -> Red Rojo
    // TODO perl -> Blue Azul
    // TODO perl -> Green Verde
    // TODO perl -> };
    // TODO perl -> $tab{EVIL} = [ "No way!", "Way!!" ];
    // TODO perl ->
    // TODO perl -> while ( my($k, $v) = each %tab ) {
    // TODO perl -> print ref($k) ? "[@$k]" : $k, " => ",
    // TODO perl -> ref($v) ? "[@$v]" : $v, "\n";
    // TODO perl -> }
    // -----------------------------
    // TODO perl -> [No way! Way!!] => EVIL
    // TODO perl ->
    // TODO perl -> EVIL => [No way! Way!!]
    // TODO perl ->
    // TODO perl -> Blue => Azul
    // TODO perl ->
    // TODO perl -> Green => Verde
    // TODO perl ->
    // TODO perl -> Rojo => Red
    // TODO perl ->
    // TODO perl -> Red => Rojo
    // TODO perl ->
    // TODO perl -> Azul => Blue
    // TODO perl ->
    // TODO perl -> Verde => Green
    // -----------------------------
    // ^^INCLUDE^^ include/perl/ch13/Tie/RevHash.pm
    // -----------------------------
    // TODO perl -> use Counter;
    // TODO perl -> tie *CH, 'Counter';
    // TODO perl -> while (<CH>) {
    // TODO perl -> print "Got $_\n";
    // TODO perl -> }
    // -----------------------------
    // ^^INCLUDE^^ include/perl/ch13/Counter
    // -----------------------------
    // TODO perl -> use Tie::Tee;
    // TODO perl -> tie *TEE, 'Tie::Tee', *STDOUT, *STDERR;
    // TODO perl -> print TEE "This line goes both places.\n";
    // -----------------------------
    // !/usr/bin/perl
    // demo_tietee
    // TODO perl -> use Tie::Tee;
    // TODO perl -> use Symbol;
    // TODO perl ->
    // TODO perl -> @handles = (*STDOUT);
    // TODO perl -> for $i ( 1 .. 10 ) {
    // TODO perl -> push(@handles, $handle = gensym());
    // TODO perl -> open($handle, ">/tmp/teetest.$i");
    // TODO perl -> }
    // TODO perl ->
    // TODO perl -> tie *TEE, 'Tie::Tee', @handles;
    // TODO perl -> print TEE "This lines goes many places.\n";
    // -----------------------------
    // ^^INCLUDE^^ include/perl/ch13/Tie/Tee.pm
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }
}
