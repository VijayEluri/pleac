package org.nicerobot.pleac;

/**
 * @author nicerobot
 * 
 */

// ^^PLEAC^^_14.0
//-----------------------------
// TODO AsciiDB   DBI Db     MLDBM    OLE    Pg        Sybase

// TODO CDB_File  DBZ_ File  Fame     Msql   ObjStore  Postgres  XBase

// TODO DBD       DB_File    Ingperl  MySQL  Oraperl   Sprite
//-----------------------------

// ^^PLEAC^^_14.1
//-----------------------------
// TODO use DB_File;                      # optional; overrides default
// TODO dbmopen %HASH, $FILENAME, 0666    # open database, accessed through %HASH
// TODO     or die "Can't open $FILENAME: $!\n";

// TODO $V = $HASH{$KEY};                 # retrieve from database
// TODO $HASH{$KEY} = $VALUE;             # put value into database
// TODO if (exists $HASH{$KEY}) {         # check whether in database
// TODO     # ...
// TODO }
// TODO delete $HASH{$KEY};               # remove from database
// TODO dbmclose %HASH;                   # close the database
//-----------------------------
// TODO use DB_File;                      # load database module

// TODO tie %HASH, "DB_File", $FILENAME   # open database, to be accessed
// TODO     or die "Can't open $FILENAME:$!\n";    # through %HASH

// TODO $V = $HASH{$KEY};                 # retrieve from database
// TODO $HASH{$KEY} = $VALUE;             # put value into database
// TODO if (exists $HASH{$KEY}) {         # check whether in database
// TODO     # ...
// TODO }
// TODO delete $HASH{$KEY};               # delete from database
// TODO untie %hash;                      # close the database
//-----------------------------
// ^^INCLUDE^^ include/perl/ch14/userstats
//-----------------------------
// TODO gnat     ttyp1   May 29 15:39   (coprolith.frii.com)
//-----------------------------

// ^^PLEAC^^_14.2
//-----------------------------
// TODO dbmopen(%HASH, $FILENAME, 0666)         or die "Can't open FILENAME: $!\n";
// TODO %HASH = ();
// TODO dbmclose %HASH;
//-----------------------------
// TODO use DB_File;

// TODO tie(%HASH, "DB_File", $FILENAME)        or die "Can't open FILENAME: $!\n";
// TODO %HASH = ();
// TODO untie %hash;
//-----------------------------
// TODO unlink $FILENAME
// TODO     or die "Couldn't unlink $FILENAME to empty the database: $!\n";
// TODO dbmopen(%HASH, $FILENAME, 0666)
// TODO     or die "Couldn't create $FILENAME database: $!\n";
//-----------------------------

// ^^PLEAC^^_14.3
//-----------------------------
// ^^INCLUDE^^ include/perl/ch14/db2gdbm
//-----------------------------
//% db2gdbm /tmp/users.db /tmp/users.gdbm
//-----------------------------

// ^^PLEAC^^_14.4
//-----------------------------
// TODO %OUTPUT = (%INPUT1, %INPUT2);
//-----------------------------
// TODO %OUTPUT = ();
// TODO foreach $href ( \%INPUT1, \%INPUT2 ) {
// TODO     while (my($key, $value) = each(%$href)) {
// TODO         if (exists $OUTPUT{$key}) {
// TODO             # decide which value to use and set $OUTPUT{$key} if necessary
// TODO         } else {
// TODO             $OUTPUT{$key} = $value;
// TODO         }
// TODO     }
// TODO }
//-----------------------------

// ^^PLEAC^^_14.5
//-----------------------------
// ^^INCLUDE^^ include/perl/ch14/dblockdemo
//-----------------------------

// ^^PLEAC^^_14.6
//-----------------------------
// TODO use DB_File;

// specify the Perl sub to do key comparison using the
// exported $DB_BTREE hash reference
// TODO $DB_BTREE->{'compare'} = sub {
// TODO     my ($key1, $key2) = @_ ;
// TODO     return "\L$key1" cmp "\L$key2";
// TODO };

// TODO tie(%hash, "DB_File", $filename, O_RDWR|O_CREAT, 0666, $DB_BTREE)
// TODO     or die "can't tie $filename: $!";
//-----------------------------
// ^^INCLUDE^^ include/perl/ch14/sortdemo
//-----------------------------
//by           6
//
//camp         4
//
//Can't        1
//
//down         5
//
//Gibraltar    7
//
//go           3
//
//you          2
//-----------------------------
// TODO tie(%hash, "DB_File", undef, O_RDWR|O_CREAT, 0666, $DB_BTREE)
// TODO         or die "can't tie: $!";
//-----------------------------

// ^^PLEAC^^_14.7
//-----------------------------
// TODO use DB_File;

// TODO tie(@array, "DB_File", "/tmp/textfile", O_RDWR|O_CREAT, 0666, $DB_RECNO)
// TODO     or die "Cannot open file 'text': $!\n" ;

// TODO $array[4] = "a new line";
// TODO untie @array;
//-----------------------------
// ^^INCLUDE^^ include/perl/ch14/recno_demo
//-----------------------------
//ORIGINAL
//
//0: zero
//
//1: one
//
//2: two
//
//3: three
//
//4: four
//
//
//The last record was [four]
//
//The first record was [zero]
//
//
//REVERSE
//
//5: last
//
//4: three
//
//3: Newbie
//
//2: one
//
//1: New One
//
//0: first
//
//
//REVERSE again
//
//5: last
//
//4: three
//
//3: Newbie
//
//2: one
//
//1: New One
//
//0: first
//-----------------------------
// TODO     foreach $item (@lines) { }
//-----------------------------
// TODO     foreach $i (0 .. $dbobj->length - 1) { }
//-----------------------------
// TODO     for ($done_yet = $dbobj->get($k, $v, R_FIRST);
// TODO          not $done_yet;
// TODO          $done_yet = $dbobj->get($k, $v, R_NEXT) )
// TODO     {
// TODO         # process key or value
// TODO     }
//-----------------------------

// ^^PLEAC^^_14.8
//-----------------------------
// TODO use MLDBM 'DB_File';
// TODO tie(%HASH, 'MLDBM', [... other DBM arguments]) or die $!;
//-----------------------------
// %hash is a tied hash
// TODO $hash{"Tom Christiansen"} = [ "book author", 'tchrist@perl.com' ];          
// TODO $hash{"Tom Boutell"} = [ "shareware author", 'boutell@boutell.com' ];

// names to compare
// TODO $name1 = "Tom Christiansen";
// TODO $name2 = "Tom Boutell";

// TODO $tom1 = $hash{$name1};      # snag local pointer
// TODO $tom2 = $hash{$name2};      # and another           

// TODO print "Two Toming: $tom1 $tom2\n";

// TODO Tom Toming: ARRAY(0x73048) ARRAY(0x73e4c)
//-----------------------------
// TODO if ($tom1->[0] eq $tom2->[0] &&
// TODO     $tom1->[1] eq $tom2->[1]) {
// TODO     print "You're having runtime fun with one Tom made two.\n";
// TODO } else {
// TODO     print "No two Toms are ever alike.\n";
// TODO }
//-----------------------------
// TODO if ($hash{$name1}->[0] eq $hash{$name2}->[0] &&     # INEFFICIENT
// TODO     $hash{$name1}->[1] eq $hash{$name2}->[1]) {
// TODO     print "You're having runtime fun with one Tom made two.\n";
// TODO } else {
// TODO     print "No two Toms are ever alike.\n";
// TODO }
//-----------------------------
// TODO $hash{"Tom Boutell"}->[0] = "Poet Programmer";      # WRONG
//-----------------------------
// TODO $entry = $hash{"Tom Boutell"};                      # RIGHT
// TODO $entry->[0] = "Poet Programmer";
// TODO $hash{"Tom Boutell"} = $entry;
//-----------------------------

// ^^PLEAC^^_14.9
//-----------------------------
// TODO use MLDBM 'DB_File';

// TODO my ($VARIABLE1,$VARIABLE2);
// TODO my $Persistent_Store = '/projects/foo/data';
// TODO BEGIN {
// TODO     my %data;
// TODO     tie(%data, 'MLDBM', $Persistent_Store)
// TODO         or die "Can't tie to $Persistent_Store : $!";
// TODO     $VARIABLE1 = $data{VARIABLE1};
// TODO     $VARIABLE2 = $data{VARIABLE2};
// TODO     # ...
// TODO     untie %data;
// TODO }
// TODO END {
// TODO     my %data;
// TODO     tie (%data, 'MLDBM', $Persistent_Store)
// TODO         or die "Can't tie to $Persistent_Store : $!";
// TODO     $data{VARIABLE1} = $VARIABLE1;
// TODO     $data{VARIABLE2} = $VARIABLE2;
// TODO     # ...
// TODO     untie %data;
// TODO }
//-----------------------------
// TODO push(@{$db{$user}}, $duration);
//-----------------------------
// ^^INCLUDE^^ include/perl/ch14/mldbm_demo
//gnat        15.3
//tchrist     2.5
//jules       22.1
//tchrist     15.9
//gnat        8.7
//-----------------------------
// TODO use MLDBM qw(DB_File Storable);
//-----------------------------

// ^^PLEAC^^_14.10
//-----------------------------
// TODO use DBI;


// TODO $dbh = DBI->connect('DBI:driver:database', 'username', 'auth',

// TODO             { RaiseError => 1, AutoCommit => 1});

// TODO $dbh->do($sql);

// TODO $sth = $dbh->prepare($sql);

// TODO $sth->execute();

// TODO while (@row = $sth->fetchrow_array) {

// TODO     # ...

// TODO }

// TODO $sth->finish();

// TODO $dbh->disconnect();
//-----------------------------
//disconnect(DBI::db=HASH(0x9df84)) invalidates 1 active cursor(s) 
//    at -e line 1.
//-----------------------------
// ^^INCLUDE^^ include/perl/ch14/dbusers
//-----------------------------

// ^^PLEAC^^_14.11
//-----------------------------
//% ggh http://www.perl.com/index.html
//-----------------------------
//% ggh perl
//-----------------------------
//% ggh mailto:
//-----------------------------
//% ggh -regexp '(?i)\bfaq\b'
//-----------------------------
//% ggh -epoch http://www.perl.com/perl/
//-----------------------------
//% ggh -gmtime http://www.perl.com/perl/
//-----------------------------
//% ggh | less
//-----------------------------
//% ggh -epoch | sort -rn | less
//-----------------------------
//% ggh -epoch | sort -rn | perl -pe 's/\d+/localtime $&/e' | less
//-----------------------------
// ^^INCLUDE^^ include/perl/ch14/ggh
//-----------------------------
