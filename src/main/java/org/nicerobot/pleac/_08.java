package org.nicerobot.pleac;

/**
 * @author nicerobot
 * 
 */
public class _08 {

  public static void _00 () {
    // <PLEAC>

    // ^^PLEAC^^_8.0
    // -----------------------------
    // TODO perl -> while (defined ($line = <DATAFILE>)) {
    // TODO perl -> chomp $line;
    // TODO perl -> $size = length $line;
    // TODO perl -> print "$size\n"; # output size of line
    // TODO perl -> }
    // -----------------------------
    // TODO perl -> while (<DATAFILE>) {
    // TODO perl -> chomp;
    // TODO perl -> print length, "\n"; # output size of line
    // TODO perl -> }
    // -----------------------------
    // TODO perl -> @lines = <DATAFILE>;
    // -----------------------------
    // TODO perl -> undef $/;
    // TODO perl -> $whole_file = <FILE>; # 'slurp' mode
    // -----------------------------
    // % perl -040 -e '$word = <>; print "First word is $word\n";'
    // -----------------------------
    // % perl -ne 'BEGIN { $/="%%\n" } chomp; print if /Unix/i' fortune.dat
    // -----------------------------
    // TODO perl -> print HANDLE "One", "two", "three"; # "Onetwothree"
    // TODO perl -> print "Baa baa black sheep.\n"; # Sent to default output handle
    // -----------------------------
    // TODO perl -> $rv = read(HANDLE, $buffer, 4096)
    // TODO perl -> or die "Couldn't read from HANDLE : $!\n";
    // $rv is the number of bytes read,
    // $buffer holds the data read
    // -----------------------------
    // TODO perl -> truncate(HANDLE, $length)
    // TODO perl -> or die "Couldn't truncate: $!\n";
    // TODO perl -> truncate("/tmp/$$.pid", $length)
    // TODO perl -> or die "Couldn't truncate: $!\n";
    // -----------------------------
    // TODO perl -> $pos = tell(DATAFILE);
    // TODO perl -> print "I'm $pos bytes from the start of DATAFILE.\n";
    // -----------------------------
    // TODO perl -> seek(LOGFILE, 0, 2) or die "Couldn't seek to the end: $!\n";
    // TODO perl -> seek(DATAFILE, $pos, 0) or die "Couldn't seek to $pos: $!\n";
    // TODO perl -> seek(OUT, -20, 1) or die "Couldn't seek back 20 bytes: $!\n";
    // -----------------------------
    // TODO perl -> $written = syswrite(DATAFILE, $mystring, length($mystring));
    // TODO perl -> die "syswrite failed: $!\n" unless $written == length($mystring);
    // TODO perl -> $read = sysread(INFILE, $block, 256, 5);
    // TODO perl -> warn "only read $read bytes, not 256" if 256 != $read;
    // -----------------------------
    // TODO perl -> $pos = sysseek(HANDLE, 0, 1); # don't change position
    // TODO perl -> die "Couldn't sysseek: $!\n" unless defined $pos;
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _01 () {
    // <PLEAC>

    // ^^PLEAC^^_8.1
    // -----------------------------
    // TODO perl -> while (defined($line = <FH>) ) {
    // TODO perl -> chomp $line;
    // TODO perl -> if ($line =~ s/\\$//) {
    // TODO perl -> $line .= <FH>;
    // TODO perl -> redo unless eof(FH);
    // TODO perl -> }
    // TODO perl -> # process full record in $line here
    // TODO perl -> }
    // -----------------------------
    // DISTFILES = $(DIST_COMMON) $(SOURCES) $(HEADERS) \
    // $(TEXINFOS) $(INFOS) $(MANS) $(DATA)
    // DEP_DISTFILES = $(DIST_COMMON) $(SOURCES) $(HEADERS) \
    // $(TEXINFOS) $(INFO_DEPS) $(MANS) $(DATA) \
    // $(EXTRA_DIST)
    // -----------------------------
    // TODO perl -> if ($line =~ s/\\\s*$//) {
    // TODO perl -> # as before
    // TODO perl -> }
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _02 () {
    // <PLEAC>

    // ^^PLEAC^^_8.2
    // -----------------------------
    // TODO perl -> $count = `wc -l < $file`;
    // TODO perl -> die "wc failed: $?" if $?;
    // TODO perl -> chomp($count);
    // -----------------------------
    // TODO perl -> open(FILE, "< $file") or die "can't open $file: $!";
    // TODO perl -> $count++ while <FILE>;
    // $count now holds the number of lines read
    // -----------------------------
    // TODO perl -> $count += tr/\n/\n/ while sysread(FILE, $_, 2 ** 16);
    // -----------------------------
    // TODO perl -> open(FILE, "< $file") or die "can't open $file: $!";
    // TODO perl -> $count++ while <FILE>;
    // $count now holds the number of lines read
    // -----------------------------
    // TODO perl -> open(FILE, "< $file") or die "can't open $file: $!";
    // TODO perl -> for ($count=0; <FILE>; $count++) { }
    // -----------------------------
    // TODO perl -> 1 while <FILE>;
    // TODO perl -> $count = $.;
    // -----------------------------
    // TODO perl -> $/ = ''; # enable paragraph mode for all reads
    // TODO perl -> open(FILE, $file) or die "can't open $file: $!";
    // TODO perl -> 1 while <FILE>;
    // TODO perl -> $para_count = $.;
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _03 () {
    // <PLEAC>

    // ^^PLEAC^^_8.3
    // -----------------------------
    // TODO perl -> while (<>) {
    // TODO perl -> for $chunk (split) {
    // TODO perl -> # do something with $chunk
    // TODO perl -> }
    // TODO perl -> }
    // -----------------------------
    // TODO perl -> while (<>) {
    // TODO perl -> while ( /(\w[\w'-]*)/g ) { #'
    // TODO perl -> # do something with $1
    // TODO perl -> }
    // TODO perl -> }
    // -----------------------------
    // Make a word frequency count
    // TODO perl -> %seen = ();
    // TODO perl -> while (<>) {
    // TODO perl -> while ( /(\w['\w-]*)/g ) { #'
    // TODO perl -> $seen{lc $1}++;
    // TODO perl -> }
    // TODO perl -> }
    // TODO perl ->
    // output hash in a descending numeric sort of its values
    // TODO perl -> foreach $word ( sort { $seen{$b} <=> $seen{$a} } keys %seen) {
    // TODO perl -> printf "%5d %s\n", $seen{$word}, $word;
    // TODO perl -> }
    // -----------------------------
    // Line frequency count
    // TODO perl -> %seen = ();
    // TODO perl -> while (<>) {
    // TODO perl -> $seen{lc $_}++;
    // TODO perl -> }
    // TODO perl -> foreach $line ( sort { $seen{$b} <=> $seen{$a} } keys %seen ) {
    // TODO perl -> printf "%5d %s", $seen{$line}, $line;
    // TODO perl -> }
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _04 () {
    // <PLEAC>

    // ^^PLEAC^^_8.4
    // -----------------------------
    // TODO perl -> @lines = <FILE>;
    // TODO perl -> while ($line = pop @lines) {
    // TODO perl -> # do something with $line
    // TODO perl -> }
    // -----------------------------
    // TODO perl -> @lines = reverse <FILE>;
    // TODO perl -> foreach $line (@lines) {
    // TODO perl -> # do something with $line
    // TODO perl -> }
    // -----------------------------
    // TODO perl -> for ($i = $#lines; $i != -1; $i--) {
    // TODO perl -> $line = $lines[$i];
    // TODO perl -> }
    // -----------------------------
    // this enclosing block keeps local $/ temporary
    // TODO perl -> {
    // TODO perl -> local $/ = '';
    // TODO perl -> @paragraphs = reverse <FILE>;
    // TODO perl -> }
    // TODO perl ->
    // TODO perl -> foreach $paragraph (@paragraphs) {
    // TODO perl -> # do something
    // TODO perl -> }
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _05 () {
    // <PLEAC>

    // ^^PLEAC^^_8.5
    // -----------------------------
    // TODO perl -> for (;;) {
    // TODO perl -> while (<FH>) { .... }
    // TODO perl -> sleep $SOMETIME;
    // TODO perl -> seek(FH, 0, 1);
    // TODO perl -> }
    // -----------------------------
    // TODO perl -> use IO::Seekable;
    // TODO perl ->
    // TODO perl -> for (;;) {
    // TODO perl -> while (<FH>) { .... }
    // TODO perl -> sleep $SOMETIME;
    // TODO perl -> FH->clearerr();
    // TODO perl -> }
    // -----------------------------
    // TODO perl -> $naptime = 1;
    // TODO perl ->
    // TODO perl -> use IO::Handle;
    // TODO perl -> open (LOGFILE, "/tmp/logfile") or die "can't open /tmp/logfile: $!";
    // TODO perl -> for (;;) {
    // TODO perl -> while (<LOGFILE>) { print } # or appropriate processing
    // TODO perl -> sleep $naptime;
    // TODO perl -> LOGFILE->clearerr(); # clear stdio error flag
    // TODO perl -> }
    // -----------------------------
    // TODO perl -> for (;;) {
    // TODO perl -> for ($curpos = tell(LOGFILE); <LOGFILE>; $curpos = tell(LOGFILE)) {
    // TODO perl -> # process $_ here
    // TODO perl -> }
    // TODO perl -> sleep $naptime;
    // TODO perl -> seek(LOGFILE, $curpos, 0); # seek to where we had been
    // TODO perl -> }
    // -----------------------------
    // TODO perl -> exit if (stat(LOGFILE))[3] == 0
    // -----------------------------
    // TODO perl -> use File::stat;
    // TODO perl -> exit if stat(*LOGFILE)->nlink == 0;
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _06 () {
    // <PLEAC>

    // ^^PLEAC^^_8.6
    // -----------------------------
    // TODO perl -> srand;
    // TODO perl -> rand($.) < 1 && ($line = $_) while <>;
    // $line is the random line
    // -----------------------------
    // TODO perl -> $/ = "%%\n";
    // TODO perl -> @ARGV = qw( /usr/share/games/fortunes );
    // TODO perl -> srand;
    // TODO perl -> rand($.) < 1 && ($adage = $_) while <>;
    // TODO perl -> print $adage;
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _07 () {
    // <PLEAC>

    // ^^PLEAC^^_8.7
    // -----------------------------
    // assumes the &shuffle sub from Chapter 4
    // TODO perl -> while (<INPUT>) {
    // TODO perl -> push(@lines, $_);
    // TODO perl -> }
    // TODO perl -> @reordered = shuffle(@lines);
    // TODO perl -> foreach (@reordered) {
    // TODO perl -> print OUTPUT $_;
    // TODO perl -> }
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _08 () {
    // <PLEAC>

    // ^^PLEAC^^_8.8
    // -----------------------------
    // looking for line number $DESIRED_LINE_NUMBER
    // TODO perl -> $. = 0;
    // TODO perl -> do { $LINE = <HANDLE> } until $. == $DESIRED_LINE_NUMBER || eof;
    // -----------------------------
    // TODO perl -> @lines = <HANDLE>;
    // TODO perl -> $LINE = $lines[$DESIRED_LINE_NUMBER];
    // -----------------------------
    // usage: build_index(*DATA_HANDLE, *INDEX_HANDLE)
    // TODO perl -> sub build_index {
    // TODO perl -> my $data_file = shift;
    // TODO perl -> my $index_file = shift;
    // TODO perl -> my $offset = 0;
    // TODO perl ->
    // TODO perl -> while (<$data_file>) {
    // TODO perl -> print $index_file pack("N", $offset);
    // TODO perl -> $offset = tell($data_file);
    // TODO perl -> }
    // TODO perl -> }
    // TODO perl ->
    // usage: line_with_index(*DATA_HANDLE, *INDEX_HANDLE, $LINE_NUMBER)
    // returns line or undef if LINE_NUMBER was out of range
    // TODO perl -> sub line_with_index {
    // TODO perl -> my $data_file = shift;
    // TODO perl -> my $index_file = shift;
    // TODO perl -> my $line_number = shift;
    // TODO perl ->
    // TODO perl -> my $size; # size of an index entry
    // TODO perl -> my $i_offset; # offset into the index of the entry
    // TODO perl -> my $entry; # index entry
    // TODO perl -> my $d_offset; # offset into the data file
    // TODO perl ->
    // TODO perl -> $size = length(pack("N", 0));
    // TODO perl -> $i_offset = $size * ($line_number-1);
    // TODO perl -> seek($index_file, $i_offset, 0) or return;
    // TODO perl -> read($index_file, $entry, $size);
    // TODO perl -> $d_offset = unpack("N", $entry);
    // TODO perl -> seek($data_file, $d_offset, 0);
    // TODO perl -> return scalar(<$data_file>);
    // TODO perl -> }
    // TODO perl ->
    // usage:
    // TODO perl -> open(FILE, "< $file") or die "Can't open $file for reading: $!\n";
    // TODO perl -> open(INDEX, "+>$file.idx")
    // TODO perl -> or die "Can't open $file.idx for read/write: $!\n";
    // TODO perl -> build_index(*FILE, *INDEX);
    // TODO perl -> $line = line_with_index(*FILE, *INDEX, $seeking);
    // -----------------------------
    // TODO perl -> use DB_File;
    // TODO perl -> use Fcntl;
    // TODO perl ->
    // TODO perl -> $tie = tie(@lines, $FILE, "DB_File", O_RDWR, 0666, $DB_RECNO) or die
    // TODO perl -> "Cannot open file $FILE: $!\n";
    // extract it
    // TODO perl -> $line = $lines[$sought - 1];
    // -----------------------------
    // ^^INCLUDE^^ include/perl/ch08/print_line-v1
    // -----------------------------
    // ^^INCLUDE^^ include/perl/ch08/print_line-v2
    // -----------------------------
    // ^^INCLUDE^^ include/perl/ch08/print_line-v3
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _09 () {
    // <PLEAC>

    // ^^PLEAC^^_8.9
    // -----------------------------
    // given $RECORD with field separated by PATTERN,
    // extract @FIELDS.
    // TODO perl -> @FIELDS = split(/PATTERN/, $RECORD);
    // -----------------------------
    // TODO perl -> split(/([+-])/, "3+5-2");
    // -----------------------------
    // TODO perl -> (3, '+', 5, '-', 2)
    // -----------------------------
    // TODO perl -> @fields = split(/:/, $RECORD);
    // -----------------------------
    // TODO perl -> @fields = split(/\s+/, $RECORD);
    // -----------------------------
    // TODO perl -> @fields = split(" ", $RECORD);
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _10 () {
    // <PLEAC>

    // ^^PLEAC^^_8.10
    // -----------------------------
    // TODO perl -> open (FH, "+< $file") or die "can't update $file: $!";
    // TODO perl -> while ( <FH> ) {
    // TODO perl -> $addr = tell(FH) unless eof(FH);
    // TODO perl -> }
    // TODO perl -> truncate(FH, $addr) or die "can't truncate $file: $!";
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _11 () {
    // <PLEAC>

    // ^^PLEAC^^_8.11
    // -----------------------------
    // TODO perl -> binmode(HANDLE);
    // -----------------------------
    // TODO perl -> $gifname = "picture.gif";
    // TODO perl -> open(GIF, $gifname) or die "can't open $gifname: $!";
    // TODO perl ->
    // TODO perl -> binmode(GIF); # now DOS won't mangle binary input from GIF
    // TODO perl -> binmode(STDOUT); # now DOS won't mangle binary output to STDOUT
    // TODO perl ->
    // TODO perl -> while (read(GIF, $buff, 8 * 2**10)) {
    // TODO perl -> print STDOUT $buff;
    // TODO perl -> }
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _12 () {
    // <PLEAC>

    // ^^PLEAC^^_8.12
    // -----------------------------
    // TODO perl -> $ADDRESS = $RECSIZE * $RECNO;
    // TODO perl -> seek(FH, $ADDRESS, 0) or die "seek:$!";
    // TODO perl -> read(FH, $BUFFER, $RECSIZE);
    // -----------------------------
    // TODO perl -> $ADDRESS = $RECSIZE * ($RECNO-1);
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _13 () {
    // <PLEAC>

    // ^^PLEAC^^_8.13
    // -----------------------------
    // TODO perl -> use Fcntl; # for SEEK_SET and SEEK_CUR
    // TODO perl ->
    // TODO perl -> $ADDRESS = $RECSIZE * $RECNO;
    // TODO perl -> seek(FH, $ADDRESS, SEEK_SET) or die "Seeking: $!";
    // TODO perl -> read(FH, $BUFFER, $RECSIZE) == $RECSIZE
    // TODO perl -> or die "Reading: $!";
    // TODO perl -> @FIELDS = unpack($FORMAT, $BUFFER);
    // update fields, then
    // TODO perl -> $BUFFER = pack($FORMAT, @FIELDS);
    // TODO perl -> seek(FH, -$RECSIZE, SEEK_CUR) or die "Seeking: $!";
    // TODO perl -> print FH $BUFFER;
    // TODO perl -> close FH or die "Closing: $!";
    // -----------------------------
    // ^^INCLUDE^^ include/perl/ch08/weekearly
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _14 () {
    // <PLEAC>

    // ^^PLEAC^^_8.14
    // -----------------------------
    // TODO perl -> $old_rs = $/; # save old $/
    // TODO perl -> $/ = "\0"; # NULL
    // TODO perl -> seek(FH, $addr, SEEK_SET) or die "Seek error: $!\n";
    // TODO perl -> $string = <FH>; # read string
    // TODO perl -> chomp $string; # remove NULL
    // TODO perl -> $/ = $old_rs; # restore old $/
    // -----------------------------
    // TODO perl -> {
    // TODO perl -> local $/ = "\0";
    // TODO perl -> # ...
    // TODO perl -> } # $/ is automatically restored
    // -----------------------------
    // ^^INCLUDE^^ include/perl/ch08/bgets
    // -----------------------------
    // ^^INCLUDE^^ include/perl/ch08/strings
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _15 () {
    // <PLEAC>

    // ^^PLEAC^^_8.15
    // -----------------------------
    // $RECORDSIZE is the length of a record, in bytes.
    // $TEMPLATE is the unpack template for the record
    // FILE is the file to read from
    // @FIELDS is an array, one element per field
    // TODO perl ->
    // TODO perl -> until ( eof(FILE) ) {
    // TODO perl -> read(FILE, $record, $RECORDSIZE) == $RECORDSIZE
    // TODO perl -> or die "short read\n";
    // TODO perl -> @FIELDS = unpack($TEMPLATE, $record);
    // TODO perl -> }
    // -----------------------------
    // define UT_LINESIZE 12
    // define UT_NAMESIZE 8
    // define UT_HOSTSIZE 16
    // TODO perl ->
    // TODO perl -> struct utmp { /* here are the pack template codes */
    // TODO perl -> short ut_type; /* s for short, must be padded */
    // TODO perl -> pid_t ut_pid; /* i for integer */
    // TODO perl -> char ut_line[UT_LINESIZE]; /* A12 for 12-char string */
    // TODO perl -> char ut_id[2]; /* A2, but need x2 for alignment */
    // TODO perl -> time_t ut_time; /* l for long */
    // TODO perl -> char ut_user[UT_NAMESIZE]; /* A8 for 8-char string */
    // TODO perl -> char ut_host[UT_HOSTSIZE]; /* A16 for 16-char string */
    // TODO perl -> long ut_addr; /* l for long */
    // TODO perl -> };
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _16 () {
    // <PLEAC>

    // ^^PLEAC^^_8.16
    // -----------------------------
    // TODO perl -> while (<CONFIG>) {
    // TODO perl -> chomp; # no newline
    // TODO perl -> s/#.*//; # no comments
    // TODO perl -> s/^\s+//; # no leading white
    // TODO perl -> s/\s+$//; # no trailing white
    // TODO perl -> next unless length; # anything left?
    // TODO perl -> my ($var, $value) = split(/\s*=\s*/, $_, 2);
    // TODO perl -> $User_Preferences{$var} = $value;
    // TODO perl -> }
    // -----------------------------
    // TODO perl -> do "$ENV{HOME}/.progrc";
    // -----------------------------
    // set class C net
    // TODO perl -> NETMASK = 255.255.255.0
    // TODO perl -> MTU = 296
    // TODO perl ->
    // TODO perl -> DEVICE = cua1
    // TODO perl -> RATE = 115200
    // TODO perl -> MODE = adaptive
    // -----------------------------
    // TODO perl -> no strict 'refs';
    // TODO perl -> $$var = $value;
    // -----------------------------
    // set class C net
    // TODO perl -> $NETMASK = '255.255.255.0';
    // TODO perl -> $MTU = 0x128;
    // Brent, please turn on the modem
    // TODO perl -> $DEVICE = 'cua1';
    // TODO perl -> $RATE = 115_200;
    // TODO perl -> $MODE = 'adaptive';
    // -----------------------------
    // TODO perl -> if ($DEVICE =~ /1$/) {
    // TODO perl -> $RATE = 28_800;
    // TODO perl -> } else {
    // TODO perl -> $RATE = 115_200;
    // TODO perl -> }
    // -----------------------------
    // TODO perl -> $APPDFLT = "/usr/local/share/myprog";
    // TODO perl ->
    // TODO perl -> do "$APPDFLT/sysconfig.pl";
    // TODO perl -> do "$ENV{HOME}/.myprogrc";
    // -----------------------------
    // TODO perl -> do "$ENV{HOME}/.myprogrc";
    // TODO perl -> or
    // TODO perl -> do "$APPDFLT/sysconfig.pl"
    // -----------------------------
    // TODO perl -> { package Settings; do "$ENV{HOME}/.myprogrc" }
    // -----------------------------
    // TODO perl -> eval `cat $ENV{HOME}/.myprogrc`;
    // -----------------------------
    // TODO perl -> $file = "someprog.pl";
    // TODO perl -> unless ($return = do $file) {
    // TODO perl -> warn "couldn't parse $file: $@" if $@;
    // TODO perl -> warn "couldn't do $file: $!" unless defined $return;
    // TODO perl -> warn "couldn't run $file" unless $return;
    // TODO perl -> }
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _17 () {
    // <PLEAC>

    // ^^PLEAC^^_8.17
    // -----------------------------
    // TODO perl -> ( $dev, $ino, $mode, $nlink,
    // TODO perl -> $uid, $gid, $rdev, $size,
    // TODO perl -> $atime, $mtime, $ctime,
    // TODO perl -> $blksize, $blocks ) = stat($filename)
    // TODO perl -> or die "no $filename: $!";
    // TODO perl ->
    // TODO perl -> $mode &= 07777; # discard file type info
    // -----------------------------
    // TODO perl -> $info = stat($filename) or die "no $filename: $!";
    // TODO perl -> if ($info->uid == 0) {
    // TODO perl -> print "Superuser owns $filename\n";
    // TODO perl -> }
    // TODO perl -> if ($info->atime > $info->mtime) {
    // TODO perl -> print "$filename has been read since it was written.\n";
    // TODO perl -> }
    // -----------------------------
    // TODO perl -> use File::stat;
    // TODO perl ->
    // TODO perl -> sub is_safe {
    // TODO perl -> my $path = shift;
    // TODO perl -> my $info = stat($path);
    // TODO perl -> return unless $info;
    // TODO perl ->
    // TODO perl -> # owner neither superuser nor me
    // TODO perl -> # the real uid is in stored in the $< variable
    // TODO perl -> if (($info->uid != 0) && ($info->uid != $<)) {
    // TODO perl -> return 0;
    // TODO perl -> }
    // TODO perl ->
    // TODO perl -> # check whether group or other can write file.
    // TODO perl -> # use 066 to detect either reading or writing
    // TODO perl -> if ($info->mode & 022) { # someone else can write this
    // TODO perl -> return 0 unless -d _; # non-directories aren't safe
    // TODO perl -> # but directories with the sticky bit (01000) are
    // TODO perl -> return 0 unless $info->mode & 01000;
    // TODO perl -> }
    // TODO perl -> return 1;
    // TODO perl -> }
    // -----------------------------
    // TODO perl -> use Cwd;
    // TODO perl -> use POSIX qw(sysconf _PC_CHOWN_RESTRICTED);
    // TODO perl -> sub is_verysafe {
    // TODO perl -> my $path = shift;
    // TODO perl -> return is_safe($path) if sysconf(_PC_CHOWN_RESTRICTED);
    // TODO perl -> $path = getcwd() . '/' . $path if $path !~ m{^/};
    // TODO perl -> do {
    // TODO perl -> return unless is_safe($path);
    // TODO perl -> $path =~ s#([^/]+|/)$##; # dirname
    // TODO perl -> $path =~ s#/$## if length($path) > 1; # last slash
    // TODO perl -> } while length $path;
    // TODO perl ->
    // TODO perl -> return 1;
    // TODO perl -> }
    // -----------------------------
    // TODO perl -> $file = "$ENV{HOME}/.myprogrc";
    // TODO perl -> readconfig($file) if is_safe($file);
    // -----------------------------
    // TODO perl -> $file = "$ENV{HOME}/.myprogrc";
    // TODO perl -> if (open(FILE, "< $file")) {
    // TODO perl -> readconfig(*FILE) if is_safe(*FILE);
    // TODO perl -> }
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _18 () {
    // <PLEAC>

    // ^^PLEAC^^_8.18
    // -----------------------------
    // ^^INCLUDE^^ include/perl/ch08/tailwtmp
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _19 () {
    // <PLEAC>

    // ^^PLEAC^^_8.19
    // -----------------------------
    // % someprog | tee /tmp/output | Mail -s 'check this' user@host.org
    // -----------------------------
    // % someprog | tctee f1 "|cat -n" f2 ">>f3"
    // -----------------------------
    // ^^INCLUDE^^ include/perl/ch08/tctee
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _20 () {
    // <PLEAC>

    // ^^PLEAC^^_8.20
    // -----------------------------
    // % laston gnat
    // gnat UID 314 at Mon May 25 08:32:52 1998 on ttyp0 from below.perl.com
    // -----------------------------
    // ^^INCLUDE^^ include/perl/ch08/laston
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }
}
