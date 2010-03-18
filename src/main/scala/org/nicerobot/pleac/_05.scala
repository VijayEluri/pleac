package org.nicerobot.pleac;

/**
 * @author nicerobot
 * 
 */

// ^^PLEAC^^_5.0
//-----------------------------
// TODO %age = ( "Nat",   24,
// TODO          "Jules", 25,
// TODO          "Josh",  17  );
//-----------------------------
// TODO $age{"Nat"}   = 24;
// TODO $age{"Jules"} = 25;
// TODO $age{"Josh"}  = 17;
//-----------------------------
// TODO %food_color = (
// TODO                "Apple"  => "red",
// TODO                "Banana" => "yellow",
// TODO                "Lemon"  => "yellow",
// TODO                "Carrot" => "orange"
// TODO               );
//-----------------------------
// TODO %food_color = (
// TODO                 Apple  => "red",
// TODO                 Banana => "yellow",
// TODO                 Lemon  => "yellow",
// TODO                 Carrot => "orange"
// TODO                );
//-----------------------------

// ^^PLEAC^^_5.1
//-----------------------------
// TODO $HASH{$KEY} = $VALUE;
//-----------------------------
// %food_color defined per the introduction
// TODO $food_color{Raspberry} = "pink";
// TODO print "Known foods:\n";
// TODO foreach $food (keys %food_color) {
// TODO     print "$food\n";
// TODO }

// Known foods:
// 
// Banana
// 
// Apple
// 
// Raspberry
// 
// Carrot
// 
// Lemon
//-----------------------------

// ^^PLEAC^^_5.2
//-----------------------------
// does %HASH have a value for $KEY ?
// TODO if (exists($HASH{$KEY})) {
// TODO     # it exists
// TODO } else {
// TODO     # it doesn't
// TODO }
//-----------------------------
// %food_color per the introduction
// TODO foreach $name ("Banana", "Martini") {
// TODO     if (exists $food_color{$name}) {
// TODO         print "$name is a food.\n";
// TODO     } else {
// TODO         print "$name is a drink.\n";
// TODO     }
// TODO }

// Banana is a food.
// 
// Martini is a drink.
//-----------------------------
// TODO %age = ();
// TODO $age{"Toddler"}  = 3;
// TODO $age{"Unborn"}   = 0;
// TODO $age{"Phantasm"} = undef;

// TODO foreach $thing ("Toddler", "Unborn", "Phantasm", "Relic") {
// TODO     print "$thing: ";
// TODO     print "Exists " if exists $age{$thing};
// TODO     print "Defined " if defined $age{$thing};
// TODO     print "True " if $age{$thing};
// TODO     print "\n";
// TODO }

// Toddler: Exists Defined True 
// 
// Unborn: Exists Defined 
// 
// Phantasm: Exists 
// 
// Relic: 
//-----------------------------
// TODO %size = ();
// TODO while (<>) {
// TODO     chomp;
// TODO     next if $size{$_};              # WRONG attempt to skip
// TODO     $size{$_} = -s $_;
// TODO }
//-----------------------------
// TODO     next if exists $size{$_};
//-----------------------------

// ^^PLEAC^^_5.3
//-----------------------------
// remove $KEY and its value from %HASH
// TODO delete($HASH{$KEY});
//-----------------------------
// %food_color as per Introduction
// TODO sub print_foods {
// TODO     my @foods = keys %food_color;
// TODO     my $food;

// TODO     print "Keys: @foods\n";
// TODO     print "Values: ";

// TODO     foreach $food (@foods) {
// TODO         my $color = $food_color{$food};

// TODO         if (defined $color) {
// TODO             print "$color ";
// TODO         } else {
// TODO             print "(undef) ";
// TODO         }
// TODO     }
// TODO     print "\n";
// TODO }

// TODO print "Initially:\n";
// TODO print_foods();


// TODO print "\nWith Banana undef\n";
// TODO undef $food_color{"Banana"};
// TODO print_foods();


// TODO print "\nWith Banana deleted\n";
// TODO delete $food_color{"Banana"};
// TODO print_foods();


// Initially:
// 
// Keys: Banana Apple Carrot Lemon
// 
// Values: yellow red orange yellow 
// 
// 
// With Banana undef
// 
// Keys: Banana Apple Carrot Lemon
// 
// Values: (undef) red orange yellow 
// 
// 
// With Banana deleted
// 
// Keys: Apple Carrot Lemon
// 
// Values: red orange yellow 
//-----------------------------
// TODO delete @food_color{"Banana", "Apple", "Cabbage"};
//-----------------------------

// ^^PLEAC^^_5.4
//-----------------------------
// TODO while(($key, $value) = each(%HASH)) {
// TODO     # do something with $key and $value
// TODO }
//-----------------------------
// TODO foreach $key (keys %HASH) {
// TODO     $value = $HASH{$key};
// TODO     # do something with $key and $value
// TODO }
//-----------------------------
// %food_color per the introduction
// TODO while(($food, $color) = each(%food_color)) {
// TODO     print "$food is $color.\n";
// TODO }
// Banana is yellow.
// 
// Apple is red.
// 
// Carrot is orange.
// 
// Lemon is yellow.

// TODO foreach $food (keys %food_color) {
// TODO     my $color = $food_color{$food};
// TODO     print "$food is $color.\n";
// TODO }
// Banana is yellow.
// 
// Apple is red.
// 
// Carrot is orange.
// 
// Lemon is yellow.
//-----------------------------
// TODO print
// TODO  
// TODO "$food
// TODO  
// TODO is
// TODO  
// TODO $food_color{$food}.\n"
// TODO  
//-----------------------------
// TODO foreach $food (sort keys %food_color) {
// TODO     print "$food is $food_color{$food}.\n";
// TODO }
// Apple is red.
// 
// Banana is yellow.
// 
// Carrot is orange.
// 
// Lemon is yellow.
//-----------------------------
// TODO while ( ($k,$v) = each %food_color ) {
// TODO     print "Processing $k\n";
// TODO     keys %food_color;               # goes back to the start of %food_color
// TODO }
//-----------------------------
// ^^INCLUDE^^include/perl/ch05/countfrom
//-----------------------------

// ^^PLEAC^^_5.5
//-----------------------------
// TODO while ( ($k,$v) = each %hash ) {
// TODO     print "$k => $v\n";
// TODO }
//-----------------------------
// TODO print map { "$_ => $hash{$_}\n" } keys %hash;
//-----------------------------
// TODO print "@{[ %hash ]}\n";
//-----------------------------
// TODO {
// TODO     my @temp = %hash;
// TODO     print "@temp";
// TODO }
//-----------------------------
// TODO foreach $k (sort keys %hash) {
// TODO     print "$k => $hash{$k}\n";
// TODO }
//-----------------------------

// ^^PLEAC^^_5.6
//-----------------------------
// TODO use Tie::IxHash;
// TODO tie %HASH, "Tie::IxHash";
// manipulate %HASH
// TODO @keys = keys %HASH;         # @keys is in insertion order
//-----------------------------
// initialize
// TODO use Tie::IxHash;

// TODO tie %food_color, "Tie::IxHash";
// TODO $food_color{Banana} = "Yellow";
// TODO $food_color{Apple}  = "Green";
// TODO $food_color{Lemon}  = "Yellow";

// TODO print "In insertion order, the foods are:\n";
// TODO foreach $food (keys %food_color) {
// TODO     print "  $food\n";
// TODO }

// TODO print "Still in insertion order, the foods' colors are:\n";
// TODO while (( $food, $color ) = each %food_color ) {
// TODO     print "$food is colored $color.\n";
// TODO }

//In insertion order, the foods are:
//
//  Banana
//
//  Apple
//
//  Lemon
//
//Still in insertion order, the foods' colors are:
//
//Banana is colored Yellow.
//
//Apple is colored Green.
//
//Lemon is colored Yellow.
//-----------------------------

// ^^PLEAC^^_5.7
//-----------------------------
// TODO %ttys = ();

// TODO open(WHO, "who|")                   or die "can't open who: $!";
// TODO while (<WHO>) {
// TODO     ($user, $tty) = split;
// TODO     push( @{$ttys{$user}}, $tty );
// TODO }

// TODO foreach $user (sort keys %ttys) {
// TODO     print "$user: @{$ttys{$user}}\n";
// TODO }
//-----------------------------
// TODO foreach $user (sort keys %ttys) {
// TODO     print "$user: ", scalar( @{$ttys{$user}} ), " ttys.\n";
// TODO     foreach $tty (sort @{$ttys{$user}}) {
// TODO         @stat = stat("/dev/$tty");
// TODO         $user = @stat ? ( getpwuid($stat[4]) )[0] : "(not available)";
// TODO         print "\t$tty (owned by $user)\n";
// TODO     }
// TODO }
//-----------------------------
// TODO sub multihash_delete {
// TODO     my ($hash, $key, $value) = @_;
// TODO     my $i;

// TODO     return unless ref( $hash->{$key} );
// TODO     for ($i = 0; $i < @{ $hash->{$key} }; $i++) {
// TODO         if ($hash->{$key}->[$i] eq $value) {
// TODO             splice( @{$hash->{$key}}, $i, 1);
// TODO             last;
// TODO         }
// TODO     }

// TODO     delete $hash->{$key} unless @{$hash->{$key}};
// TODO }
//-----------------------------

// ^^PLEAC^^_5.8
//-----------------------------
// %LOOKUP maps keys to values
// TODO %REVERSE = reverse %LOOKUP;
//-----------------------------
// TODO %surname = ( "Mickey" => "Mantle", "Babe" => "Ruth" );
// TODO %first_name = reverse %surname;
// TODO print $first_name{"Mantle"}, "\n";
// TODO Mickey
//-----------------------------
// TODO ("Mickey", "Mantle", "Babe", "Ruth")
//-----------------------------
// TODO ("Ruth", "Babe", "Mantle", "Mickey")
//-----------------------------
// TODO ("Ruth" => "Babe", "Mantle" => "Mickey")
//-----------------------------
// ^^INCLUDE^^ include/perl/ch05/foodfind
//-----------------------------
// %food_color as per the introduction
// TODO while (($food,$color) = each(%food_color)) {
// TODO     push(@{$foods_with_color{$color}}, $food);
// TODO }

// TODO print "@{$foods_with_color{yellow}} were yellow foods.\n";
// Banana Lemon were yellow foods.
//-----------------------------

// ^^PLEAC^^_5.9
//-----------------------------
// %HASH is the hash to sort
// TODO @keys = sort { criterion() } (keys %hash);
// TODO foreach $key (@keys) {
// TODO     $value = $hash{$key};
// TODO     # do something with $key, $value
// TODO }
//-----------------------------
// TODO foreach $food (sort keys %food_color) {
// TODO     print "$food is $food_color{$food}.\n";
// TODO }
//-----------------------------
// TODO foreach $food (sort { $food_color{$a} cmp $food_color{$b} }
// TODO                 keys %food_color) 
// TODO {
// TODO     print "$food is $food_color{$food}.\n";
// TODO }
//-----------------------------
// TODO @foods = sort { length($food_color{$a}) <=> length($food_color{$b}) } 
// TODO     keys %food_color;
// TODO foreach $food (@foods) {
// TODO     print "$food is $food_color{$food}.\n";
// TODO }
//-----------------------------

// ^^PLEAC^^_5.10
//-----------------------------
// TODO %merged = (%A, %B);
//-----------------------------
// TODO %merged = ();
// TODO while ( ($k,$v) = each(%A) ) {
// TODO     $merged{$k} = $v;
// TODO }
// TODO while ( ($k,$v) = each(%B) ) {
// TODO     $merged{$k} = $v;
// TODO }
//-----------------------------
// %food_color as per the introduction
// TODO %drink_color = ( Galliano  => "yellow",
// TODO                  "Mai Tai" => "blue" );

// TODO %ingested_color = (%drink_color, %food_color);
//-----------------------------
// %food_color per the introduction, then
// TODO %drink_color = ( Galliano  => "yellow",
// TODO                  "Mai Tai" => "blue" );

// TODO %substance_color = ();
// TODO while (($k, $v) = each %food_color) {
// TODO     $substance_color{$k} = $v;
// TODO } 
// TODO while (($k, $v) = each %drink_color) {
// TODO     $substance_color{$k} = $v;
// TODO } 
//-----------------------------
// TODO foreach $substanceref ( \%food_color, \%drink_color ) {
// TODO     while (($k, $v) = each %$substanceref) {
// TODO         $substance_color{$k} = $v;
// TODO     }
// TODO }
//-----------------------------
// TODO foreach $substanceref ( \%food_color, \%drink_color ) {
// TODO     while (($k, $v) = each %$substanceref) {
// TODO         if (exists $substance_color{$k}) {
// TODO             print "Warning: $k seen twice.  Using the first definition.\n";
// TODO             next;
// TODO         }
// TODO         $substance_color{$k} = $v;
// TODO     }
// TODO }
//-----------------------------
// TODO @all_colors{keys %new_colors} = values %new_colors;
//-----------------------------

// ^^PLEAC^^_5.11
//-----------------------------
// TODO my @common = ();
// TODO foreach (keys %hash1) {
// TODO     push(@common, $_) if exists $hash2{$_};
// TODO }
// @common now contains common keys
//-----------------------------
// TODO my @this_not_that = ();
// TODO foreach (keys %hash1) {
// TODO     push(@this_not_that, $_) unless exists $hash2{$_};
// TODO }
//-----------------------------
// %food_color per the introduction

// %citrus_color is a hash mapping citrus food name to its color.
// TODO %citrus_color = ( Lemon  => "yellow",
// TODO                   Orange => "orange",
// TODO                   Lime   => "green" );

// build up a list of non-citrus foods
// TODO @non_citrus = ();

// TODO foreach (keys %food_color) {
// TODO     push (@non_citrus, $_) unless exists $citrus_color{$_};
// TODO }
//-----------------------------

// ^^PLEAC^^_5.12
//-----------------------------
// TODO use Tie::RefHash;
// TODO tie %hash, "Tie::RefHash";
// you may now use references as the keys to %hash
//-----------------------------
// Class::Somewhere=HASH(0x72048)
// 
// ARRAY(0x72048)
//-----------------------------
// TODO use Tie::RefHash;
// TODO use IO::File;

// TODO tie %name, "Tie::RefHash";
// TODO foreach $filename ("/etc/termcap", "/vmunix", "/bin/cat") {
// TODO     $fh = IO::File->new("< $filename") or next;
// TODO     $name{$fh} = $filename;
// TODO }
// TODO print "open files: ", join(", ", values %name), "\n";
// TODO foreach $file (keys %name) {
// TODO     seek($file, 0, 2);      # seek to the end
// TODO     printf("%s is %d bytes long.\n", $name{$file}, tell($file));
// TODO }
//-----------------------------

// ^^PLEAC^^_5.13
//-----------------------------
// presize %hash to $num
// TODO keys(%hash) = $num;
//-----------------------------
// will have 512 users in %users
// TODO keys(%users) = 512;
//-----------------------------
// TODO keys(%users) = 1000;
//-----------------------------

// ^^PLEAC^^_5.14
//-----------------------------
// TODO %count = ();
// TODO foreach $element (@ARRAY) {
// TODO     $count{$element}++;
// TODO }
//-----------------------------

// ^^PLEAC^^_5.15
//-----------------------------
// TODO %father = ( 'Cain'      => 'Adam',
// TODO             'Abel'      => 'Adam',
// TODO             'Seth'      => 'Adam',
// TODO             'Enoch'     => 'Cain',
// TODO             'Irad'      => 'Enoch',
// TODO             'Mehujael'  => 'Irad',
// TODO             'Methusael' => 'Mehujael',
// TODO             'Lamech'    => 'Methusael',
// TODO             'Jabal'     => 'Lamech',
// TODO             'Jubal'     => 'Lamech',
// TODO             'Tubalcain' => 'Lamech',
// TODO             'Enos'      => 'Seth' );
//-----------------------------
// TODO while (<>) {
// TODO     chomp;
// TODO     do {
// TODO         print "$_ ";        # print the current name
// TODO         $_ = $father{$_};   # set $_ to $_'s father
// TODO     } while defined;        # until we run out of fathers
// TODO     print "\n";
// TODO }
//-----------------------------
// TODO while ( ($k,$v) = each %father ) {
// TODO     push( @{ $children{$v} }, $k );
// TODO }

// TODO $" = ', ';                  # separate output with commas
// TODO while (<>) {
// TODO     chomp;
// TODO     if ($children{$_}) {
// TODO         @children = @{$children{$_}};
// TODO     } else {
// TODO         @children = "nobody";
// TODO     }
// TODO     print "$_ begat @children.\n";
// TODO }
//-----------------------------
// TODO foreach $file (@files) {
// TODO     local *F;               # just in case we want a local FH
// TODO     unless (open (F, "<$file")) {
// TODO         warn "Couldn't read $file: $!; skipping.\n";
// TODO         next;
// TODO     }
// TODO     
// TODO     while (<F>) {
// TODO         next unless /^\s*#\s*include\s*<([^>]+)>/;
// TODO         push(@{$includes{$1}}, $file);
// TODO     }
// TODO     close F;
// TODO }
//-----------------------------
// TODO @include_free = ();                 # list of files that don't include others
// TODO @uniq{map { @$_ } values %includes} = undef;
// TODO foreach $file (sort keys %uniq) {
// TODO         push( @include_free , $file ) unless $includes{$file};
// TODO }
//-----------------------------

// ^^PLEAC^^_5.16
//-----------------------------
//% du pcb
//19      pcb/fix
//
//20      pcb/rev/maybe/yes
//
//10      pcb/rev/maybe/not
//
//705     pcb/rev/maybe
//
//54      pcb/rev/web
//
//1371    pcb/rev
//
//3       pcb/pending/mine
//
//1016    pcb/pending
//
//2412    pcb
//-----------------------------
//2412 pcb
//
//   
//|
//    1371 rev
//
//   
//|       |
//    705 maybe
//
//   
//|       |      |
//      675 .
//
//   
//|       |      |
//  20 yes
//
//   
//|       |      |
//  10 not
//
//   
//|       |
//    612 .
//
//   
//|       |
//     54 web
//
//   
//|
//    1016 pending
//
//   
//|       |
//   1013 .
//
//   
//|       |
//      3 mine
//
//   
//|
//      19 fix
//
//   
//|
//  6 .
//-----------------------------
//% dutree
//% dutree /usr
//% dutree -a 
//% dutree -a /bin
//-----------------------------
// ^^INCLUDE^^ include/perl/ch05/dutree
//-----------------------------
// ^^INCLUDE^^ include/perl/ch05/dutree-orig
//-----------------------------
