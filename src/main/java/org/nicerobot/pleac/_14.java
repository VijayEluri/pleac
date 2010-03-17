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
public class _14 {

  public static void _00 () {
  // <PLEAC>

  // ^^PLEAC^^_14.0
  // -----------------------------
  // TODO perl -> AsciiDB DBI Db MLDBM OLE Pg Sybase
  // TODO perl ->
  // TODO perl -> CDB_File DBZ_ File Fame Msql ObjStore Postgres XBase
  // TODO perl ->
  // TODO perl -> DBD DB_File Ingperl MySQL Oraperl Sprite
  // -----------------------------
  // TODO perl ->
  // </PLEAC>
  }

  public static void _01 () {
  // <PLEAC>

  // ^^PLEAC^^_14.1
  // -----------------------------
  // TODO perl -> use DB_File; # optional; overrides default
  // TODO perl -> dbmopen %HASH, $FILENAME, 0666 # open database, accessed through %HASH
  // TODO perl -> or die "Can't open $FILENAME: $!\n";
  // TODO perl ->
  // TODO perl -> $V = $HASH{$KEY}; # retrieve from database
  // TODO perl -> $HASH{$KEY} = $VALUE; # put value into database
  // TODO perl -> if (exists $HASH{$KEY}) { # check whether in database
  // TODO perl -> # ...
  // TODO perl -> }
  // TODO perl -> delete $HASH{$KEY}; # remove from database
  // TODO perl -> dbmclose %HASH; # close the database
  // -----------------------------
  // TODO perl -> use DB_File; # load database module
  // TODO perl ->
  // TODO perl -> tie %HASH, "DB_File", $FILENAME # open database, to be accessed
  // TODO perl -> or die "Can't open $FILENAME:$!\n"; # through %HASH
  // TODO perl ->
  // TODO perl -> $V = $HASH{$KEY}; # retrieve from database
  // TODO perl -> $HASH{$KEY} = $VALUE; # put value into database
  // TODO perl -> if (exists $HASH{$KEY}) { # check whether in database
  // TODO perl -> # ...
  // TODO perl -> }
  // TODO perl -> delete $HASH{$KEY}; # delete from database
  // TODO perl -> untie %hash; # close the database
  // -----------------------------
  // ^^INCLUDE^^ include/perl/ch14/userstats
  // -----------------------------
  // TODO perl -> gnat ttyp1 May 29 15:39 (coprolith.frii.com)
  // -----------------------------
  // TODO perl ->
  // </PLEAC>
  }

  public static void _02 () {
  // <PLEAC>

  // ^^PLEAC^^_14.2
  // -----------------------------
  // TODO perl -> dbmopen(%HASH, $FILENAME, 0666) or die "Can't open FILENAME: $!\n";
  // TODO perl -> %HASH = ();
  // TODO perl -> dbmclose %HASH;
  // -----------------------------
  // TODO perl -> use DB_File;
  // TODO perl ->
  // TODO perl -> tie(%HASH, "DB_File", $FILENAME) or die "Can't open FILENAME: $!\n";
  // TODO perl -> %HASH = ();
  // TODO perl -> untie %hash;
  // -----------------------------
  // TODO perl -> unlink $FILENAME
  // TODO perl -> or die "Couldn't unlink $FILENAME to empty the database: $!\n";
  // TODO perl -> dbmopen(%HASH, $FILENAME, 0666)
  // TODO perl -> or die "Couldn't create $FILENAME database: $!\n";
  // -----------------------------
  // TODO perl ->
  // </PLEAC>
  }

  public static void _03 () {
  // <PLEAC>

  // ^^PLEAC^^_14.3
  // -----------------------------
  // ^^INCLUDE^^ include/perl/ch14/db2gdbm
  // -----------------------------
  // % db2gdbm /tmp/users.db /tmp/users.gdbm
  // -----------------------------
  // TODO perl ->
  // </PLEAC>
  }

  public static void _04 () {
  // <PLEAC>

  // ^^PLEAC^^_14.4
  // -----------------------------
  // TODO perl -> %OUTPUT = (%INPUT1, %INPUT2);
  // -----------------------------
  // TODO perl -> %OUTPUT = ();
  // TODO perl -> foreach $href ( \%INPUT1, \%INPUT2 ) {
  // TODO perl -> while (my($key, $value) = each(%$href)) {
  // TODO perl -> if (exists $OUTPUT{$key}) {
  // TODO perl -> # decide which value to use and set $OUTPUT{$key} if necessary
  // TODO perl -> } else {
  // TODO perl -> $OUTPUT{$key} = $value;
  // TODO perl -> }
  // TODO perl -> }
  // TODO perl -> }
  // -----------------------------
  // TODO perl ->
  // </PLEAC>
  }

  public static void _05 () {
  // <PLEAC>

  // ^^PLEAC^^_14.5
  // -----------------------------
  // ^^INCLUDE^^ include/perl/ch14/dblockdemo
  // -----------------------------
  // TODO perl ->
  // </PLEAC>
  }

  public static void _06 () {
  // <PLEAC>

  // ^^PLEAC^^_14.6
  // -----------------------------
  // TODO perl -> use DB_File;
  // TODO perl ->
  // specify the Perl sub to do key comparison using the
  // exported $DB_BTREE hash reference
  // TODO perl -> $DB_BTREE->{'compare'} = sub {
  // TODO perl -> my ($key1, $key2) = @_ ;
  // TODO perl -> return "\L$key1" cmp "\L$key2";
  // TODO perl -> };
  // TODO perl ->
  // TODO perl -> tie(%hash, "DB_File", $filename, O_RDWR|O_CREAT, 0666, $DB_BTREE)
  // TODO perl -> or die "can't tie $filename: $!";
  // -----------------------------
  // ^^INCLUDE^^ include/perl/ch14/sortdemo
  // -----------------------------
  // by 6
  //
  // camp 4
  //
  // Can't 1
  //
  // down 5
  //
  // Gibraltar 7
  //
  // go 3
  //
  // you 2
  // -----------------------------
  // TODO perl -> tie(%hash, "DB_File", undef, O_RDWR|O_CREAT, 0666, $DB_BTREE)
  // TODO perl -> or die "can't tie: $!";
  // -----------------------------
  // TODO perl ->
  // </PLEAC>
  }

  public static void _07 () {
  // <PLEAC>

  // ^^PLEAC^^_14.7
  // -----------------------------
  // TODO perl -> use DB_File;
  // TODO perl ->
  // TODO perl -> tie(@array, "DB_File", "/tmp/textfile", O_RDWR|O_CREAT, 0666, $DB_RECNO)
  // TODO perl -> or die "Cannot open file 'text': $!\n" ;
  // TODO perl ->
  // TODO perl -> $array[4] = "a new line";
  // TODO perl -> untie @array;
  // -----------------------------
  // ^^INCLUDE^^ include/perl/ch14/recno_demo
  // -----------------------------
  // ORIGINAL
  //
  // 0: zero
  //
  // 1: one
  //
  // 2: two
  //
  // 3: three
  //
  // 4: four
  //
  //
  // The last record was [four]
  //
  // The first record was [zero]
  //
  //
  // REVERSE
  //
  // 5: last
  //
  // 4: three
  //
  // 3: Newbie
  //
  // 2: one
  //
  // 1: New One
  //
  // 0: first
  //
  //
  // REVERSE again
  //
  // 5: last
  //
  // 4: three
  //
  // 3: Newbie
  //
  // 2: one
  //
  // 1: New One
  //
  // 0: first
  // -----------------------------
  // TODO perl -> foreach $item (@lines) { }
  // -----------------------------
  // TODO perl -> foreach $i (0 .. $dbobj->length - 1) { }
  // -----------------------------
  // TODO perl -> for ($done_yet = $dbobj->get($k, $v, R_FIRST);
  // TODO perl -> not $done_yet;
  // TODO perl -> $done_yet = $dbobj->get($k, $v, R_NEXT) )
  // TODO perl -> {
  // TODO perl -> # process key or value
  // TODO perl -> }
  // -----------------------------
  // TODO perl ->
  // </PLEAC>
  }

  public static void _08 () {
  // <PLEAC>

  // ^^PLEAC^^_14.8
  // -----------------------------
  // TODO perl -> use MLDBM 'DB_File';
  // TODO perl -> tie(%HASH, 'MLDBM', [... other DBM arguments]) or die $!;
  // -----------------------------
  // %hash is a tied hash
  // TODO perl -> $hash{"Tom Christiansen"} = [ "book author", 'tchrist@perl.com' ];
  // TODO perl -> $hash{"Tom Boutell"} = [ "shareware author", 'boutell@boutell.com' ];
  // TODO perl ->
  // names to compare
  // TODO perl -> $name1 = "Tom Christiansen";
  // TODO perl -> $name2 = "Tom Boutell";
  // TODO perl ->
  // TODO perl -> $tom1 = $hash{$name1}; # snag local pointer
  // TODO perl -> $tom2 = $hash{$name2}; # and another
  // TODO perl ->
  // TODO perl -> print "Two Toming: $tom1 $tom2\n";
  // TODO perl ->
  // TODO perl -> Tom Toming: ARRAY(0x73048) ARRAY(0x73e4c)
  // -----------------------------
  // TODO perl -> if ($tom1->[0] eq $tom2->[0] &&
  // TODO perl -> $tom1->[1] eq $tom2->[1]) {
  // TODO perl -> print "You're having runtime fun with one Tom made two.\n";
  // TODO perl -> } else {
  // TODO perl -> print "No two Toms are ever alike.\n";
  // TODO perl -> }
  // -----------------------------
  // TODO perl -> if ($hash{$name1}->[0] eq $hash{$name2}->[0] && # INEFFICIENT
  // TODO perl -> $hash{$name1}->[1] eq $hash{$name2}->[1]) {
  // TODO perl -> print "You're having runtime fun with one Tom made two.\n";
  // TODO perl -> } else {
  // TODO perl -> print "No two Toms are ever alike.\n";
  // TODO perl -> }
  // -----------------------------
  // TODO perl -> $hash{"Tom Boutell"}->[0] = "Poet Programmer"; # WRONG
  // -----------------------------
  // TODO perl -> $entry = $hash{"Tom Boutell"}; # RIGHT
  // TODO perl -> $entry->[0] = "Poet Programmer";
  // TODO perl -> $hash{"Tom Boutell"} = $entry;
  // -----------------------------
  // TODO perl ->
  // </PLEAC>
  }

  public static void _09 () {
  // <PLEAC>

  // ^^PLEAC^^_14.9
  // -----------------------------
  // TODO perl -> use MLDBM 'DB_File';
  // TODO perl ->
  // TODO perl -> my ($VARIABLE1,$VARIABLE2);
  // TODO perl -> my $Persistent_Store = '/projects/foo/data';
  // TODO perl -> BEGIN {
  // TODO perl -> my %data;
  // TODO perl -> tie(%data, 'MLDBM', $Persistent_Store)
  // TODO perl -> or die "Can't tie to $Persistent_Store : $!";
  // TODO perl -> $VARIABLE1 = $data{VARIABLE1};
  // TODO perl -> $VARIABLE2 = $data{VARIABLE2};
  // TODO perl -> # ...
  // TODO perl -> untie %data;
  // TODO perl -> }
  // TODO perl -> END {
  // TODO perl -> my %data;
  // TODO perl -> tie (%data, 'MLDBM', $Persistent_Store)
  // TODO perl -> or die "Can't tie to $Persistent_Store : $!";
  // TODO perl -> $data{VARIABLE1} = $VARIABLE1;
  // TODO perl -> $data{VARIABLE2} = $VARIABLE2;
  // TODO perl -> # ...
  // TODO perl -> untie %data;
  // TODO perl -> }
  // -----------------------------
  // TODO perl -> push(@{$db{$user}}, $duration);
  // -----------------------------
  // ^^INCLUDE^^ include/perl/ch14/mldbm_demo
  // gnat 15.3
  // tchrist 2.5
  // jules 22.1
  // tchrist 15.9
  // gnat 8.7
  // -----------------------------
  // TODO perl -> use MLDBM qw(DB_File Storable);
  // -----------------------------
  // TODO perl ->
  // </PLEAC>
  }

  public static void _10 () {
  // <PLEAC>

  // ^^PLEAC^^_14.10
  // -----------------------------
  // TODO perl -> use DBI;
  // TODO perl ->
  // TODO perl ->
  // TODO perl -> $dbh = DBI->connect('DBI:driver:database', 'username', 'auth',
  // TODO perl ->
  // TODO perl -> { RaiseError => 1, AutoCommit => 1});
  // TODO perl ->
  // TODO perl -> $dbh->do($sql);
  // TODO perl ->
  // TODO perl -> $sth = $dbh->prepare($sql);
  // TODO perl ->
  // TODO perl -> $sth->execute();
  // TODO perl ->
  // TODO perl -> while (@row = $sth->fetchrow_array) {
  // TODO perl ->
  // TODO perl -> # ...
  // TODO perl ->
  // TODO perl -> }
  // TODO perl ->
  // TODO perl -> $sth->finish();
  // TODO perl ->
  // TODO perl -> $dbh->disconnect();
  // -----------------------------
  // disconnect(DBI::db=HASH(0x9df84)) invalidates 1 active cursor(s)
  // at -e line 1.
  // -----------------------------
  // ^^INCLUDE^^ include/perl/ch14/dbusers
  // -----------------------------
  // TODO perl ->
  // </PLEAC>
  }

  public static void _11 () {
  // <PLEAC>

  // ^^PLEAC^^_14.11
  // -----------------------------
  // % ggh http://www.perl.com/index.html
  // -----------------------------
  // % ggh perl
  // -----------------------------
  // % ggh mailto:
  // -----------------------------
  // % ggh -regexp '(?i)\bfaq\b'
  // -----------------------------
  // % ggh -epoch http://www.perl.com/perl/
  // -----------------------------
  // % ggh -gmtime http://www.perl.com/perl/
  // -----------------------------
  // % ggh | less
  // -----------------------------
  // % ggh -epoch | sort -rn | less
  // -----------------------------
  // % ggh -epoch | sort -rn | perl -pe 's/\d+/localtime $&/e' | less
  // -----------------------------
  // ^^INCLUDE^^ include/perl/ch14/ggh
  // -----------------------------
  // TODO perl ->
  // </PLEAC>
  }
}
