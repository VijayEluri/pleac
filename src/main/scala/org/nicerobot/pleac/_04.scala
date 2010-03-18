package org.nicerobot.pleac;

/**
 * @author nicerobot
 * 
 */


// ^^PLEAC^^_4.0
//-----------------------------
// TODO @nested = ("this", "that", "the", "other");
// TODO @nested = ("this", "that", ("the", "other"));
//-----------------------------
// TODO @tune = ( "The", "Star-Spangled", "Banner" );
//-----------------------------

// ^^PLEAC^^_4.1
//-----------------------------
// TODO @a = ("quick", "brown", "fox");
//-----------------------------
// TODO @a = qw(Why are you teasing me?);
//-----------------------------
// TODO @lines = (<<"END_OF_HERE_DOC" =~ m/^\s*(.+)/gm);
// TODO     The boy stood on the burning deck,
// TODO     It was as hot as glass.
// TODO END_OF_HERE_DOC
//-----------------------------
// TODO @bigarray = ();
// TODO open(DATA, "< mydatafile")       or die "Couldn't read from datafile: $!\n";
// TODO while (<DATA>) {
// TODO     chomp;
// TODO     push(@bigarray, $_);
// TODO }
//-----------------------------
// TODO $banner = 'The Mines of Moria';
// TODO $banner = q(The Mines of Moria);
//-----------------------------
// TODO $name   =  "Gandalf";
// TODO $banner = "Speak, $name, and enter!";
// TODO $banner = qq(Speak, $name, and welcome!);
//-----------------------------
// TODO $his_host   = 'www.perl.com';
// TODO $host_info  = `nslookup $his_host`; # expand Perl variable

// TODO $perl_info  = qx(ps $$);            # that's Perl's $$
// TODO $shell_info = qx'ps $$';            # that's the new shell's $$
//-----------------------------
// TODO @banner = ('Costs', 'only', '$4.95');
// TODO @banner = qw(Costs only $4.95);
// TODO @banner = split(' ', 'Costs only $4.95');
//-----------------------------
// TODO @brax   = qw! ( ) < > { } [ ] !;
// TODO @rings  = qw(Nenya Narya Vilya);
// TODO @tags   = qw<LI TABLE TR TD A IMG H1 P>;
// TODO @sample = qw(The vertical bar (|) looks and behaves like a pipe.);
//-----------------------------
// TODO @banner = qw|The vertical bar (\|) looks and behaves like a pipe.|;
//-----------------------------
// TODO @ships  = qw(Ni–a Pinta Santa Mar’a);               # WRONG
// TODO @ships  = ('Ni–a', 'Pinta', 'Santa Mar’a');         # right
//-----------------------------

// ^^PLEAC^^_4.2
//-----------------------------
// TODO sub commify_series {
// TODO     (@_ == 0) ? ''                                      :
// TODO     (@_ == 1) ? $_[0]                                   :
// TODO     (@_ == 2) ? join(" and ", @_)                       :
// TODO                 join(", ", @_[0 .. ($#_-1)], "and $_[-1]");
// TODO }
//-----------------------------
// TODO @array = ("red", "yellow", "green");
// TODO print "I have ", @array, " marbles.\n";
// TODO print "I have @array marbles.\n";
// TODO I have redyellowgreen marbles.

// TODO I have red yellow green marbles.
//-----------------------------
// ^^INCLUDE^^ include/perl/ch04/commify_series
//-----------------------------
//The list is: just one thing.
//
//The list is: Mutt and Jeff.
//
//The list is: Peter, Paul, and Mary.
//
//The list is: To our parents, Mother Theresa, and God.
//
//The list is: pastrami, ham and cheese, peanut butter and jelly, and tuna.
//
//The list is: recycle tired, old phrases and ponder big, happy thoughts.
//
//The list is: recycle tired, old phrases; ponder 
//
//   big, happy thoughts; and sleep and dream peacefully.
//-----------------------------

// ^^PLEAC^^_4.3
//-----------------------------
// grow or shrink @ARRAY
// TODO $#ARRAY = $NEW_LAST_ELEMENT_INDEX_NUMBER;
//-----------------------------
// TODO $ARRAY[$NEW_LAST_ELEMENT_INDEX_NUMBER] = $VALUE;
//-----------------------------
// TODO sub what_about_that_array {
// TODO     print "The array now has ", scalar(@people), " elements.\n";
// TODO     print "The index of the last element is $#people.\n";
// TODO     print "Element #3 is `$people[3]'.\n";
// TODO }

// TODO @people = qw(Crosby Stills Nash Young);
// TODO what_about_that_array();
//-----------------------------
// TODO The array now has 4 elements.

// TODO The index of the last element is 3.

// TODO Element #3 is `Young'.
//-----------------------------
// TODO $#people--;
// TODO what_about_that_array();
//-----------------------------
// TODO The array now has 3 elements.

// TODO The index of the last element is 2.

// TODO Element #3 is `'.
//-----------------------------
// TODO $#people = 10_000;
// TODO what_about_that_array();
//-----------------------------
// TODO The array now has 10001 elements.

// TODO The index of the last element is 10000.

// TODO Element #3 is `'.
//-----------------------------
// TODO $people[10_000] = undef;
//-----------------------------

// ^^PLEAC^^_4.4
//-----------------------------
// TODO foreach $item (LIST) {
// TODO     # do something with $item
// TODO }
//-----------------------------
// TODO foreach $user (@bad_users) {
// TODO         complain($user);
// TODO }
//-----------------------------
// TODO foreach $var (sort keys %ENV) {
// TODO     print "$var=$ENV{$var}\n";
// TODO }
//-----------------------------
// TODO foreach $user (@all_users) {
// TODO     $disk_space = get_usage($user);     # find out how much disk space in use
// TODO     if ($disk_space > $MAX_QUOTA) {     # if it's more than we want ...
// TODO         complain($user);                # ... then object vociferously
// TODO     }
// TODO }
//-----------------------------
// TODO foreach (`who`) {
// TODO     if (/tchrist/) {
// TODO         print;
// TODO     }
// TODO }
//-----------------------------
// TODO while (<FH>) {              # $_ is set to the line just read
// TODO     chomp;                  # $_ has a trailing \n removed, if it had one
// TODO     foreach (split) {       # $_ is split on whitespace, into @_
// TODO                             # then $_ is set to each chunk in turn
// TODO         $_ = reverse;       # the characters in $_ are reversed
// TODO         print;              # $_ is printed
// TODO     }
// TODO }
//-----------------------------
// TODO foreach my $item (@array) {
// TODO     print "i = $item\n";
// TODO }
//-----------------------------
// TODO @array = (1,2,3);
// TODO foreach $item (@array) {
// TODO     $item--;
// TODO }
// TODO print "@array\n";
// TODO 0 1 2


// multiply everything in @a and @b by seven
// TODO @a = ( .5, 3 ); @b =( 0, 1 );
// TODO foreach $item (@a, @b) {
// TODO     $item *= 7;
// TODO }
// TODO print "@a @b\n";
// TODO 3.5 21 0 7
//-----------------------------
// trim whitespace in the scalar, the array, and all the values
// in the hash
// TODO foreach ($scalar, @array, @hash{keys %hash}) {
// TODO     s/^\s+//;
// TODO     s/\s+$//;
// TODO }
//-----------------------------
// TODO for $item (@array) {  # same as foreach $item (@array)
// TODO     # do something
// TODO }

// TODO for (@array)      {   # same as foreach $_ (@array)
// TODO     # do something
// TODO }
//-----------------------------

// ^^PLEAC^^_4.5
//-----------------------------
// iterate over elements of array in $ARRAYREF
// TODO foreach $item (@$ARRAYREF) {
// TODO     # do something with $item
// TODO }

// TODO for ($i = 0; $i <= $#$ARRAYREF; $i++) {
// TODO     # do something with $ARRAYREF->[$i]
// TODO }
//-----------------------------
// TODO @fruits = ( "Apple", "Blackberry" );
// TODO $fruit_ref = \@fruits;
// TODO foreach $fruit (@$fruit_ref) {
// TODO     print "$fruit tastes good in a pie.\n";
// TODO }
// TODO Apple tastes good in a pie.

// TODO Blackberry tastes good in a pie.
//-----------------------------
// TODO for ($i=0; $i <= $#$fruit_ref; $i++) {
// TODO     print "$fruit_ref->[$i] tastes good in a pie.\n";
// TODO }
//-----------------------------
// TODO $namelist{felines} = \@rogue_cats;
// TODO foreach $cat ( @{ $namelist{felines} } ) {
// TODO     print "$cat purrs hypnotically..\n";
// TODO }
// TODO print "--More--\nYou are controlled.\n";
//-----------------------------
// TODO for ($i=0; $i <= $#{ $namelist{felines} }; $i++) {
// TODO     print "$namelist{felines}[$i] purrs hypnotically.\n";
// TODO }
//-----------------------------

// ^^PLEAC^^_4.6
//-----------------------------
// TODO %seen = ();
// TODO @uniq = ();
// TODO foreach $item (@list) {
// TODO     unless ($seen{$item}) {
// TODO         # if we get here, we have not seen it before
// TODO         $seen{$item} = 1;
// TODO         push(@uniq, $item);
// TODO     }
// TODO }
//-----------------------------
// TODO %seen = ();
// TODO foreach $item (@list) {
// TODO     push(@uniq, $item) unless $seen{$item}++;
// TODO }
//-----------------------------
// TODO %seen = ();
// TODO foreach $item (@list) {
// TODO     some_func($item) unless $seen{$item}++;
// TODO }
//-----------------------------
// TODO %seen = ();
// TODO foreach $item (@list) {
// TODO     $seen{$item}++;
// TODO }
// TODO @uniq = keys %seen;
//-----------------------------
// TODO %seen = ();
// TODO @uniqu = grep { ! $seen{$_} ++ } @list;
//-----------------------------
// generate a list of users logged in, removing duplicates
// TODO %ucnt = ();
// TODO for (`who`) {
// TODO     s/\s.*\n//;   # kill from first space till end-of-line, yielding username
// TODO     $ucnt{$_}++;  # record the presence of this user
// TODO }
// extract and print unique keys
// TODO @users = sort keys %ucnt;
// TODO print "users logged in: @users\n";
//-----------------------------

// ^^PLEAC^^_4.7
//-----------------------------
// assume @A and @B are already loaded
// TODO %seen = ();                  # lookup table to test membership of B
// TODO @aonly = ();                 # answer

// build lookup table
// TODO foreach $item (@B) { $seen{$item} = 1 }

// find only elements in @A and not in @B
// TODO foreach $item (@A) {
// TODO     unless ($seen{$item}) {
// TODO         # it's not in %seen, so add to @aonly
// TODO         push(@aonly, $item);
// TODO     }
// TODO }
//-----------------------------
// TODO my %seen; # lookup table
// TODO my @aonly;# answer

// build lookup table
// TODO @seen{@B} = ();

// TODO foreach $item (@A) {
// TODO     push(@aonly, $item) unless exists $seen{$item};
// TODO }
//-----------------------------
// TODO foreach $item (@A) {
// TODO     push(@aonly, $item) unless $seen{$item};
// TODO     $seen{$item} = 1;                       # mark as seen
// TODO }
//-----------------------------
// TODO $hash{"key1"} = 1;
// TODO $hash{"key2"} = 2;
//-----------------------------
// TODO @hash{"key1", "key2"} = (1,2);
//-----------------------------
// TODO @seen{@B} = ();
//-----------------------------
// TODO @seen{@B} = (1) x @B;
//-----------------------------

// ^^PLEAC^^_4.8
//-----------------------------
// TODO @a = (1, 3, 5, 6, 7, 8);
// TODO @b = (2, 3, 5, 7, 9);

// TODO @union = @isect = @diff = ();
// TODO %union = %isect = ();
// TODO %count = ();
//-----------------------------
// TODO foreach $e (@a) { $union{$e} = 1 }

// TODO foreach $e (@b) {
// TODO     if ( $union{$e} ) { $isect{$e} = 1 }
// TODO     $union{$e} = 1;
// TODO }
// TODO @union = keys %union;
// TODO @isect = keys %isect;
//-----------------------------
// TODO foreach $e (@a, @b) { $union{$e}++ && $isect{$e}++ }

// TODO @union = keys %union;
// TODO @isect = keys %isect;
//-----------------------------
// TODO foreach $e (@a, @b) { $count{$e}++ }

// TODO foreach $e (keys %count) {
// TODO     push(@union, $e);
// TODO     if ($count{$e} == 2) {
// TODO         push @isect, $e;
// TODO     } else {
// TODO         push @diff, $e;
// TODO     }
// TODO }
//-----------------------------
// TODO @isect = @diff = @union = ();

// TODO foreach $e (@a, @b) { $count{$e}++ }

// TODO foreach $e (keys %count) {
// TODO     push(@union, $e);
// TODO     push @{ $count{$e} == 2 ? \@isect : \@diff }, $e;
// TODO }
//-----------------------------

// ^^PLEAC^^_4.9
//-----------------------------
// push
// TODO push(@ARRAY1, @ARRAY2);
//-----------------------------
// TODO @ARRAY1 = (@ARRAY1, @ARRAY2);
//-----------------------------
// TODO @members = ("Time", "Flies");
// TODO @initiates = ("An", "Arrow");
// TODO push(@members, @initiates);
// @members is now ("Time", "Flies", "An", "Arrow")
//-----------------------------
// TODO splice(@members, 2, 0, "Like", @initiates);
// TODO print "@members\n";
// TODO splice(@members, 0, 1, "Fruit");
// TODO splice(@members, -2, 2, "A", "Banana");
// TODO print "@members\n";
//-----------------------------
// TODO Time Flies Like An Arrow

// TODO Fruit Flies Like A Banana
//-----------------------------

// ^^PLEAC^^_4.10
//-----------------------------
// reverse @ARRAY into @REVERSED
// TODO @REVERSED = reverse @ARRAY;
//-----------------------------
// TODO for ($i = $#ARRAY; $i >= 0; $i--) {
// TODO     # do something with $ARRAY[$i]
// TODO }
//-----------------------------
// two-step: sort then reverse
// TODO @ascending = sort { $a cmp $b } @users;
// TODO @descending = reverse @ascending;

// one-step: sort with reverse comparison
// TODO @descending = sort { $b cmp $a } @users;
//-----------------------------

// ^^PLEAC^^_4.11
//-----------------------------
// remove $N elements from front of @ARRAY (shift $N)
// TODO @FRONT = splice(@ARRAY, 0, $N);

// remove $N elements from the end of the array (pop $N)
// TODO @END = splice(@ARRAY, -$N);
//-----------------------------
// TODO sub shift2 (\@) {
// TODO     return splice(@{$_[0]}, 0, 2);
// TODO }

// TODO sub pop2 (\@) {
// TODO     return splice(@{$_[0]}, -2);
// TODO }
//-----------------------------
// TODO @friends = qw(Peter Paul Mary Jim Tim);
// TODO ($this, $that) = shift2(@friends);
// $this contains Peter, $that has Paul, and
// @friends has Mary, Jim, and Tim

// TODO @beverages = qw(Dew Jolt Cola Sprite Fresca);
// TODO @pair = pop2(@beverages);
// $pair[0] contains Sprite, $pair[1] has Fresca,
// and @beverages has (Dew, Jolt, Cola)
//-----------------------------
// TODO $line[5] = \@list;
// TODO @got = pop2( @{ $line[5] } );
//-----------------------------

// ^^PLEAC^^_4.12
//-----------------------------
// TODO my($match, $found, $item);
// TODO foreach $item (@array) {
// TODO     if ($criterion) {
// TODO         $match = $item;  # must save
// TODO         $found = 1;
// TODO         last;
// TODO     }
// TODO }
// TODO if ($found) {
// TODO     ## do something with $match
// TODO } else {
// TODO     ## unfound
// TODO }
//-----------------------------
// TODO my($i, $match_idx);
// TODO for ($i = 0; $i < @array; $i++) {
// TODO     if ($criterion) {
// TODO         $match_idx = $i;    # save the index
// TODO         last;
// TODO     }
// TODO }

// TODO if (defined $match_idx) {
// TODO     ## found in $array[$match_idx]
// TODO } else {
// TODO     ## unfound
// TODO }
//-----------------------------
// TODO foreach $employee (@employees) {
// TODO     if ( $employee->category() eq 'engineer' ) {
// TODO         $highest_engineer = $employee;
// TODO         last;
// TODO     }
// TODO }
// TODO print "Highest paid engineer is: ", $highest_engineer->name(), "\n";
//-----------------------------
// TODO for ($i = 0; $i < @ARRAY; $i++) {
// TODO     last if $criterion;
// TODO }
// TODO if ($i < @ARRAY) {
// TODO     ## found and $i is the index
// TODO } else {
// TODO     ## not found
// TODO }
//-----------------------------

// ^^PLEAC^^_4.13
//-----------------------------
// TODO @MATCHING = grep { TEST ($_) } @LIST;
//-----------------------------
// TODO @matching = ();
// TODO foreach (@list) {
// TODO     push(@matching, $_) if TEST ($_);
// TODO }
//-----------------------------
// TODO @bigs = grep { $_ > 1_000_000 } @nums;
// TODO @pigs = grep { $users{$_} > 1e7 } keys %users;
//-----------------------------
// TODO @matching = grep { /^gnat / } `who`;
//-----------------------------
// TODO @engineers = grep { $_->position() eq 'Engineer' } @employees;
//-----------------------------
// TODO @secondary_assistance = grep { $_->income >= 26_000 &&
// TODO                                $_->income <  30_000 }
// TODO                         @applicants;
//-----------------------------

// ^^PLEAC^^_4.14
//-----------------------------
// TODO @sorted = sort { $a <=> $b } @unsorted;
//-----------------------------
// @pids is an unsorted array of process IDs
// TODO foreach my $pid (sort { $a <=> $b } @pids) {
// TODO     print "$pid\n";
// TODO }
// TODO print "Select a process ID to kill:\n";
// TODO chomp ($pid = <>);
// TODO die "Exiting ... \n" unless $pid && $pid =~ /^\d+$/;
// TODO kill('TERM',$pid);
// TODO sleep 2;
// TODO kill('KILL',$pid);
//-----------------------------
// TODO @descending = sort { $b <=> $a } @unsorted;
//-----------------------------
// TODO package Sort_Subs;
// TODO sub revnum { $b <=> $a }

// TODO package Other_Pack;
// TODO @all = sort Sort_Subs::revnum 4, 19, 8, 3;
//-----------------------------
// TODO @all = sort { $b <=> $a } 4, 19, 8, 3;
//-----------------------------

// ^^PLEAC^^_4.15
//-----------------------------
// TODO @ordered = sort { compare() } @unordered;
//-----------------------------
// TODO @precomputed = map { [compute(),$_] } @unordered;
// TODO @ordered_precomputed = sort { $a->[0] <=> $b->[0] } @precomputed;
// TODO @ordered = map { $_->[1] } @ordered_precomputed;
//-----------------------------
// TODO @ordered = map { $_->[1] }
// TODO            sort { $a->[0] <=> $b->[0] }
// TODO            map { [compute(), $_] }
// TODO            @unordered;
//-----------------------------
// TODO @ordered = sort { $a->name cmp $b->name } @employees;
//-----------------------------
// TODO foreach $employee (sort { $a->name cmp $b->name } @employees) {
// TODO     print $employee->name, " earns \$", $employee->salary, "\n";
// TODO }
//-----------------------------
// TODO @sorted_employees = sort { $a->name cmp $b->name } @employees;
// TODO foreach $employee (@sorted_employees) {
// TODO     print $employee->name, " earns \$", $employee->salary, "\n";
// TODO }
// load %bonus
// TODO foreach $employee (@sorted_employees) {
// TODO     if ( $bonus{ $employee->ssn } ) {
// TODO       print $employee->name, " got a bonus!\n";
// TODO     }
// TODO }
//-----------------------------
// TODO @sorted = sort { $a->name cmp $b->name
// TODO                            ||
// TODO                   $b->age <=> $a->age } @employees;
//-----------------------------
// TODO use User::pwent qw(getpwent);
// TODO @users = ();
// fetch all users
// TODO while (defined($user = getpwent)) {
// TODO     push(@users, $user);
// TODO }
// TODO     @users = sort { $a->name cmp $b->name } @users;
// TODO foreach $user (@users) {
// TODO     print $user->name, "\n";
// TODO }
//-----------------------------
// TODO @sorted = sort { substr($a,1,1) cmp substr($b,1,1) } @names;
//-----------------------------
// TODO @sorted = sort { length $a <=> length $b } @strings;
//-----------------------------
// TODO @temp   = map  { [ length $_, $_ ] } @strings;
// TODO @temp   = sort { $a->[0] <=> $b->[0] } @temp;
// TODO @sorted = map  { $_->[1] } @temp;
//-----------------------------
// TODO @sorted = map  { $_->[1] }
// TODO           sort { $a->[0] <=> $b->[0] }
// TODO           map  { [ length $_, $_ ] }
// TODO           @strings;
//-----------------------------
// TODO @temp          = map  { [ /(\d+)/, $_ ] } @fields;
// TODO @sorted_temp   = sort { $a->[0] <=> $b->[0] } @temp;
// TODO @sorted_fields = map  { $_->[1] } @sorted_temp;
//-----------------------------
// TODO @sorted_fields = map  { $_->[1] }
// TODO                  sort { $a->[0] <=> $b->[0] }
// TODO                  map  { [ /(\d+)/, $_ ] }
// TODO                  @fields;
//-----------------------------
// TODO print map  { $_->[0] }             # whole line
// TODO       sort {
// TODO               $a->[1] <=> $b->[1]  # gid
// TODO                       ||
// TODO               $a->[2] <=> $b->[2]  # uid
// TODO                       ||
// TODO               $a->[3] cmp $b->[3]  # login
// TODO       }
// TODO       map  { [ $_, (split /:/)[3,2,0] ] }
// TODO       `cat /etc/passwd`;
//-----------------------------

// ^^PLEAC^^_4.16
//-----------------------------
// TODO unshift(@circular, pop(@circular));  # the last shall be first
// TODO push(@circular, shift(@circular));   # and vice versa
//-----------------------------
// TODO sub grab_and_rotate ( \@ ) {
// TODO     my $listref = shift;
// TODO     my $element = $listref->[0];
// TODO     push(@$listref, shift @$listref);
// TODO     return $element;
// TODO }

// TODO @processes = ( 1, 2, 3, 4, 5 );
// TODO while (1) {
// TODO     $process = grab_and_rotate(@processes);
// TODO     print "Handling process $process\n";
// TODO     sleep 1;
// TODO }
//-----------------------------

// ^^PLEAC^^_4.17
//-----------------------------
// fisher_yates_shuffle( \@array ) : generate a random permutation
// of @array in place
// TODO sub fisher_yates_shuffle {
// TODO     my $array = shift;
// TODO     my $i;
// TODO     for ($i = @$array; --$i; ) {
// TODO         my $j = int rand ($i+1);
// TODO         next if $i == $j;
// TODO         @$array[$i,$j] = @$array[$j,$i];
// TODO     }
// TODO }

// TODO fisher_yates_shuffle( \@array );    # permutes @array in place
//-----------------------------
// TODO $permutations = factorial( scalar @array );
// TODO @shuffle = @array [ n2perm( 1+int(rand $permutations), $#array ) ];
//-----------------------------
// TODO sub naive_shuffle {                             # don't do this
// TODO     for (my $i = 0; $i < @_; $i++) {
// TODO         my $j = int rand @_;                    # pick random element
// TODO         ($_[$i], $_[$j]) = ($_[$j], $_[$i]);    # swap 'em
// TODO     }
// TODO }
//-----------------------------

// ^^PLEAC^^_4.18
//-----------------------------
// TODO awk      cp       ed       login    mount    rmdir    sum
// TODO basename csh      egrep    ls       mt       sed      sync
// TODO cat      date     fgrep    mail     mv       sh       tar
// TODO chgrp    dd       grep     mkdir    ps       sort     touch
// TODO chmod    df       kill     mknod    pwd      stty     vi
// TODO chown    echo     ln       more     rm       su
//-----------------------------
// ^^INCLUDE^^ include/perl/ch04/words
//-----------------------------
//Wrong       Right
//-----       -----
//1 2 3       1 4 7
//4 5 6       2 5 8
//7 8 9       3 6 9
//-----------------------------

// ^^PLEAC^^_4.19
//-----------------------------
//% echo man bites dog | permute
//dog bites man
//
//bites dog man
//
//dog man bites
//
//man dog bites
//
//bites man dog
//
//man bites dog
//-----------------------------
//Set Size            Permutations
//1                   1
//2                   2
//3                   6
//4                   24
//5                   120
//6                   720
//7                   5040
//8                   40320
//9                   362880
//10                  3628800
//11                  39916800
//12                  479001600
//13                  6227020800
//14                  87178291200
//15                  1307674368000
//-----------------------------
// TODO use Math::BigInt;
// TODO     sub factorial {
// TODO     my $n = shift;
// TODO     my $s = 1;
// TODO     $s *= $n-- while $n > 0;
// TODO     return $s;
// TODO }
// TODO print factorial(Math::BigInt->new("500"));
// TODO +1220136... (1035 digits total)
//-----------------------------
// ^^INCLUDE^^ include/perl/ch04/permute
//-----------------------------
// ^^INCLUDE^^ include/perl/ch04/mjd_permute
//-----------------------------
