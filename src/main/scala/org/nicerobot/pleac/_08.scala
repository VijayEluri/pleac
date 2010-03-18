package org.nicerobot.pleac;

/**
 * @author nicerobot
 * 
 */

// ^^PLEAC^^_8.0
//-----------------------------
// TODO while (defined ($line = <DATAFILE>)) {
// TODO     chomp $line;
// TODO     $size = length $line;
// TODO     print "$size\n";                # output size of line
// TODO }
//-----------------------------
// TODO while (<DATAFILE>) {
// TODO     chomp;
// TODO     print length, "\n";             # output size of line
// TODO }
//-----------------------------
// TODO @lines = <DATAFILE>;
//-----------------------------
// TODO undef $/;
// TODO $whole_file = <FILE>;               # 'slurp' mode
//-----------------------------
//% perl -040 -e '$word = <>; print "First word is $word\n";'
//-----------------------------
//% perl -ne 'BEGIN { $/="%%\n" } chomp; print if /Unix/i' fortune.dat
//-----------------------------
// TODO print HANDLE "One", "two", "three"; # "Onetwothree"
// TODO print "Baa baa black sheep.\n";     # Sent to default output handle
//-----------------------------
// TODO $rv = read(HANDLE, $buffer, 4096)
// TODO         or die "Couldn't read from HANDLE : $!\n";
// $rv is the number of bytes read,
// $buffer holds the data read
//-----------------------------
// TODO truncate(HANDLE, $length)
// TODO     or die "Couldn't truncate: $!\n";
// TODO truncate("/tmp/$$.pid", $length)
// TODO     or die "Couldn't truncate: $!\n";
//-----------------------------
// TODO $pos = tell(DATAFILE);
// TODO print "I'm $pos bytes from the start of DATAFILE.\n";
//-----------------------------
// TODO seek(LOGFILE, 0, 2)         or die "Couldn't seek to the end: $!\n";
// TODO seek(DATAFILE, $pos, 0)     or die "Couldn't seek to $pos: $!\n";
// TODO seek(OUT, -20, 1)           or die "Couldn't seek back 20 bytes: $!\n";
//-----------------------------
// TODO $written = syswrite(DATAFILE, $mystring, length($mystring));
// TODO die "syswrite failed: $!\n" unless $written == length($mystring);
// TODO $read = sysread(INFILE, $block, 256, 5);
// TODO warn "only read $read bytes, not 256" if 256 != $read;
//-----------------------------
// TODO $pos = sysseek(HANDLE, 0, 1);       # don't change position
// TODO die "Couldn't sysseek: $!\n" unless defined $pos;
//-----------------------------

// ^^PLEAC^^_8.1
//-----------------------------
// TODO while (defined($line = <FH>) ) {
// TODO     chomp $line;
// TODO     if ($line =~ s/\\$//) {
// TODO         $line .= <FH>;
// TODO         redo unless eof(FH);
// TODO     }
// TODO     # process full record in $line here
// TODO }
//-----------------------------
// DISTFILES = $(DIST_COMMON) $(SOURCES) $(HEADERS) \
//         $(TEXINFOS) $(INFOS) $(MANS) $(DATA)
// DEP_DISTFILES = $(DIST_COMMON) $(SOURCES) $(HEADERS) \
//         $(TEXINFOS) $(INFO_DEPS) $(MANS) $(DATA) \
//         $(EXTRA_DIST)
//-----------------------------
// TODO if ($line =~ s/\\\s*$//) { 
// TODO     # as before
// TODO }
//-----------------------------

// ^^PLEAC^^_8.2
//-----------------------------
// TODO $count = `wc -l < $file`;
// TODO die "wc failed: $?" if $?;
// TODO chomp($count);
//-----------------------------
// TODO open(FILE, "< $file") or die "can't open $file: $!";
// TODO $count++ while <FILE>;
// $count now holds the number of lines read
//-----------------------------
// TODO $count += tr/\n/\n/ while sysread(FILE, $_, 2 ** 16);
//-----------------------------
// TODO open(FILE, "< $file") or die "can't open $file: $!";
// TODO $count++ while <FILE>;
// $count now holds the number of lines read
//-----------------------------
// TODO open(FILE, "< $file") or die "can't open $file: $!";
// TODO for ($count=0; <FILE>; $count++) { }
//-----------------------------
// TODO 1 while <FILE>;
// TODO $count = $.;
//-----------------------------
// TODO $/ = '';            # enable paragraph mode for all reads
// TODO open(FILE, $file) or die "can't open $file: $!";
// TODO 1 while <FILE>;
// TODO $para_count = $.;
//-----------------------------

// ^^PLEAC^^_8.3
//-----------------------------
// TODO while (<>) {
// TODO     for $chunk (split) {
// TODO         # do something with $chunk
// TODO     }
// TODO }
//-----------------------------
// TODO while (<>) {
// TODO     while ( /(\w[\w'-]*)/g ) {  #'
// TODO         # do something with $1
// TODO     }
// TODO }
//-----------------------------
// Make a word frequency count
// TODO %seen = ();
// TODO while (<>) {
// TODO     while ( /(\w['\w-]*)/g ) {  #'
// TODO         $seen{lc $1}++;
// TODO     }
// TODO }

// output hash in a descending numeric sort of its values
// TODO foreach $word ( sort { $seen{$b} <=> $seen{$a} } keys %seen) {
// TODO     printf "%5d %s\n", $seen{$word}, $word;
// TODO }
//-----------------------------
// Line frequency count
// TODO %seen = ();
// TODO while (<>) {
// TODO     $seen{lc $_}++;
// TODO }
// TODO foreach $line ( sort { $seen{$b} <=> $seen{$a} } keys %seen ) {
// TODO     printf "%5d %s", $seen{$line}, $line;
// TODO }
//-----------------------------

// ^^PLEAC^^_8.4
//-----------------------------
// TODO @lines = <FILE>;
// TODO while ($line = pop @lines) {
// TODO     # do something with $line
// TODO }
//-----------------------------
// TODO @lines = reverse <FILE>;
// TODO foreach $line (@lines) {
// TODO     # do something with $line
// TODO }
//-----------------------------
// TODO for ($i = $#lines; $i != -1; $i--) {
// TODO     $line = $lines[$i];
// TODO }
//-----------------------------
// this enclosing block keeps local $/ temporary
// TODO {           
// TODO     local $/ = '';
// TODO     @paragraphs = reverse <FILE>;
// TODO }

// TODO foreach $paragraph (@paragraphs) {
// TODO     # do something
// TODO }
//-----------------------------

// ^^PLEAC^^_8.5
//-----------------------------
// TODO for (;;) {
// TODO     while (<FH>) { .... }
// TODO     sleep $SOMETIME;
// TODO     seek(FH, 0, 1);
// TODO }
//-----------------------------
// TODO use IO::Seekable;

// TODO for (;;) {
// TODO     while (<FH>) { .... }
// TODO     sleep $SOMETIME;
// TODO     FH->clearerr();
// TODO }
//-----------------------------
// TODO $naptime = 1;

// TODO use IO::Handle;
// TODO open (LOGFILE, "/tmp/logfile") or die "can't open /tmp/logfile: $!";
// TODO for (;;) {
// TODO     while (<LOGFILE>) { print }     # or appropriate processing
// TODO     sleep $naptime;
// TODO     LOGFILE->clearerr();            # clear stdio error flag
// TODO }
//-----------------------------
// TODO for (;;) {
// TODO     for ($curpos = tell(LOGFILE); <LOGFILE>; $curpos = tell(LOGFILE)) {
// TODO         # process $_ here
// TODO     }
// TODO     sleep $naptime;
// TODO     seek(LOGFILE, $curpos, 0);  # seek to where we had been
// TODO }
//-----------------------------
// TODO exit if (stat(LOGFILE))[3] == 0
//-----------------------------
// TODO use File::stat;
// TODO exit if stat(*LOGFILE)->nlink == 0;
//-----------------------------

// ^^PLEAC^^_8.6
//-----------------------------
// TODO srand;
// TODO rand($.) < 1 && ($line = $_) while <>;
// $line is the random line
//-----------------------------
// TODO $/ = "%%\n";
// TODO @ARGV = qw( /usr/share/games/fortunes );
// TODO srand;
// TODO rand($.) < 1 && ($adage = $_) while <>;
// TODO print $adage;
//-----------------------------

// ^^PLEAC^^_8.7
//-----------------------------
// assumes the &shuffle sub from Chapter 4
// TODO while (<INPUT>) {
// TODO     push(@lines, $_);
// TODO }
// TODO @reordered = shuffle(@lines);
// TODO foreach (@reordered) {
// TODO     print OUTPUT $_;
// TODO }
//-----------------------------

// ^^PLEAC^^_8.8
//-----------------------------
// looking for line number $DESIRED_LINE_NUMBER
// TODO $. = 0;
// TODO do { $LINE = <HANDLE> } until $. == $DESIRED_LINE_NUMBER || eof;
//-----------------------------
// TODO @lines = <HANDLE>;
// TODO $LINE = $lines[$DESIRED_LINE_NUMBER];
//-----------------------------
// usage: build_index(*DATA_HANDLE, *INDEX_HANDLE)
// TODO sub build_index {
// TODO     my $data_file  = shift;
// TODO     my $index_file = shift;
// TODO     my $offset     = 0;

// TODO     while (<$data_file>) {
// TODO         print $index_file pack("N", $offset);
// TODO         $offset = tell($data_file);
// TODO     }
// TODO }

// usage: line_with_index(*DATA_HANDLE, *INDEX_HANDLE, $LINE_NUMBER)
// returns line or undef if LINE_NUMBER was out of range
// TODO sub line_with_index {
// TODO     my $data_file   = shift;
// TODO     my $index_file  = shift;
// TODO     my $line_number = shift;

// TODO     my $size;               # size of an index entry
// TODO     my $i_offset;           # offset into the index of the entry
// TODO     my $entry;              # index entry
// TODO     my $d_offset;           # offset into the data file

// TODO     $size = length(pack("N", 0));
// TODO     $i_offset = $size * ($line_number-1);
// TODO     seek($index_file, $i_offset, 0) or return;
// TODO     read($index_file, $entry, $size);
// TODO     $d_offset = unpack("N", $entry);
// TODO     seek($data_file, $d_offset, 0);
// TODO     return scalar(<$data_file>);
// TODO }

// usage:
// TODO open(FILE, "< $file")         or die "Can't open $file for reading: $!\n";
// TODO open(INDEX, "+>$file.idx")
// TODO         or die "Can't open $file.idx for read/write: $!\n";
// TODO build_index(*FILE, *INDEX);
// TODO $line = line_with_index(*FILE, *INDEX, $seeking);
//-----------------------------
// TODO use DB_File;
// TODO use Fcntl;

// TODO $tie = tie(@lines, $FILE, "DB_File", O_RDWR, 0666, $DB_RECNO) or die 
// TODO     "Cannot open file $FILE: $!\n";
// extract it
// TODO $line = $lines[$sought - 1];
//-----------------------------
// ^^INCLUDE^^ include/perl/ch08/print_line-v1
//-----------------------------
// ^^INCLUDE^^ include/perl/ch08/print_line-v2
//-----------------------------
// ^^INCLUDE^^ include/perl/ch08/print_line-v3
//-----------------------------

// ^^PLEAC^^_8.9
//-----------------------------
// given $RECORD with field separated by PATTERN,
// extract @FIELDS.
// TODO @FIELDS = split(/PATTERN/, $RECORD);
//-----------------------------
// TODO split(/([+-])/, "3+5-2");
//-----------------------------
// TODO (3, '+', 5, '-', 2)
//-----------------------------
// TODO @fields = split(/:/, $RECORD);
//-----------------------------
// TODO @fields = split(/\s+/, $RECORD);
//-----------------------------
// TODO @fields = split(" ", $RECORD);
//-----------------------------

// ^^PLEAC^^_8.10
//-----------------------------
// TODO open (FH, "+< $file")               or die "can't update $file: $!";
// TODO while ( <FH> ) {
// TODO     $addr = tell(FH) unless eof(FH);
// TODO }
// TODO truncate(FH, $addr)                 or die "can't truncate $file: $!";
//-----------------------------

// ^^PLEAC^^_8.11
//-----------------------------
// TODO binmode(HANDLE);
//-----------------------------
// TODO $gifname = "picture.gif";
// TODO open(GIF, $gifname)         or die "can't open $gifname: $!";

// TODO binmode(GIF);               # now DOS won't mangle binary input from GIF
// TODO binmode(STDOUT);            # now DOS won't mangle binary output to STDOUT

// TODO while (read(GIF, $buff, 8 * 2**10)) {
// TODO     print STDOUT $buff;
// TODO }
//-----------------------------

// ^^PLEAC^^_8.12
//-----------------------------
// TODO $ADDRESS = $RECSIZE * $RECNO;
// TODO seek(FH, $ADDRESS, 0) or die "seek:$!";
// TODO read(FH, $BUFFER, $RECSIZE);
//-----------------------------
// TODO $ADDRESS = $RECSIZE * ($RECNO-1);
//-----------------------------

// ^^PLEAC^^_8.13
//-----------------------------
// TODO use Fcntl;                          # for SEEK_SET and SEEK_CUR

// TODO $ADDRESS = $RECSIZE * $RECNO;
// TODO seek(FH, $ADDRESS, SEEK_SET)        or die "Seeking: $!";
// TODO read(FH, $BUFFER, $RECSIZE) == $RECSIZE
// TODO                                     or die "Reading: $!";
// TODO @FIELDS = unpack($FORMAT, $BUFFER);
// update fields, then
// TODO $BUFFER = pack($FORMAT, @FIELDS);
// TODO seek(FH, -$RECSIZE, SEEK_CUR)       or die "Seeking: $!";
// TODO print FH $BUFFER;
// TODO close FH                            or die "Closing: $!";
//-----------------------------
// ^^INCLUDE^^ include/perl/ch08/weekearly
//-----------------------------

// ^^PLEAC^^_8.14
//-----------------------------
// TODO $old_rs = $/;                       # save old $/
// TODO $/ = "\0";                          # NULL
// TODO seek(FH, $addr, SEEK_SET)           or die "Seek error: $!\n";
// TODO $string = <FH>;                     # read string
// TODO chomp $string;                      # remove NULL
// TODO $/ = $old_rs;                       # restore old $/
//-----------------------------
// TODO {
// TODO     local $/ = "\0";
// TODO     # ...
// TODO }                           # $/ is automatically restored
//-----------------------------
// ^^INCLUDE^^ include/perl/ch08/bgets
//-----------------------------
// ^^INCLUDE^^ include/perl/ch08/strings
//-----------------------------

// ^^PLEAC^^_8.15
//-----------------------------
// $RECORDSIZE is the length of a record, in bytes.
// $TEMPLATE is the unpack template for the record
// FILE is the file to read from
// @FIELDS is an array, one element per field

// TODO until ( eof(FILE) ) {
// TODO     read(FILE, $record, $RECORDSIZE) == $RECORDSIZE
// TODO         or die "short read\n";
// TODO     @FIELDS = unpack($TEMPLATE, $record);
// TODO }
//-----------------------------
//define UT_LINESIZE           12
//define UT_NAMESIZE           8
//define UT_HOSTSIZE           16

// TODO struct utmp {                       /* here are the pack template codes */
// TODO     short ut_type;                  /* s for short, must be padded      */
// TODO     pid_t ut_pid;                   /* i for integer                    */
// TODO     char ut_line[UT_LINESIZE];      /* A12 for 12-char string           */
// TODO     char ut_id[2];                  /* A2, but need x2 for alignment    */
// TODO     time_t ut_time;                 /* l for long                       */
// TODO     char ut_user[UT_NAMESIZE];      /* A8 for 8-char string             */
// TODO     char ut_host[UT_HOSTSIZE];      /* A16 for 16-char string           */
// TODO     long ut_addr;                   /* l for long                       */
// TODO };
//-----------------------------

// ^^PLEAC^^_8.16
//-----------------------------
// TODO while (<CONFIG>) {
// TODO     chomp;                  # no newline
// TODO     s/#.*//;                # no comments
// TODO     s/^\s+//;               # no leading white
// TODO     s/\s+$//;               # no trailing white
// TODO     next unless length;     # anything left?
// TODO     my ($var, $value) = split(/\s*=\s*/, $_, 2);
// TODO     $User_Preferences{$var} = $value;
// TODO } 
//-----------------------------
// TODO do "$ENV{HOME}/.progrc";
//-----------------------------
// set class C net
// TODO NETMASK = 255.255.255.0
// TODO MTU     = 296
// TODO     
// TODO DEVICE  = cua1
// TODO RATE    = 115200
// TODO MODE    = adaptive
//-----------------------------
// TODO no strict 'refs';
// TODO $$var = $value;
//-----------------------------
// set class C net
// TODO $NETMASK = '255.255.255.0';
// TODO $MTU     = 0x128;
// Brent, please turn on the modem
// TODO $DEVICE  = 'cua1';
// TODO $RATE    = 115_200;
// TODO $MODE    = 'adaptive';
//-----------------------------
// TODO if ($DEVICE =~ /1$/) {
// TODO     $RATE =  28_800;
// TODO } else {
// TODO     $RATE = 115_200;
// TODO } 
//-----------------------------
// TODO $APPDFLT = "/usr/local/share/myprog";

// TODO do "$APPDFLT/sysconfig.pl";
// TODO do "$ENV{HOME}/.myprogrc";
//-----------------------------
// TODO do "$ENV{HOME}/.myprogrc";
// TODO     or
// TODO do "$APPDFLT/sysconfig.pl"
//-----------------------------
// TODO { package Settings; do "$ENV{HOME}/.myprogrc" }
//-----------------------------
// TODO eval `cat $ENV{HOME}/.myprogrc`;
//-----------------------------
// TODO $file = "someprog.pl";
// TODO unless ($return = do $file) {
// TODO     warn "couldn't parse $file: $@"         if $@;
// TODO     warn "couldn't do $file: $!"            unless defined $return;
// TODO     warn "couldn't run $file"               unless $return;
// TODO }
//-----------------------------

// ^^PLEAC^^_8.17
//-----------------------------
// TODO ( $dev, $ino, $mode, $nlink, 
// TODO   $uid, $gid, $rdev, $size, 
// TODO   $atime, $mtime, $ctime, 
// TODO   $blksize, $blocks )       = stat($filename)
// TODO         or die "no $filename: $!";

// TODO $mode &= 07777;             # discard file type info
//-----------------------------
// TODO $info = stat($filename)     or die "no $filename: $!";
// TODO if ($info->uid == 0) {
// TODO     print "Superuser owns $filename\n";
// TODO } 
// TODO if ($info->atime > $info->mtime) {
// TODO     print "$filename has been read since it was written.\n";
// TODO } 
//-----------------------------
// TODO use File::stat;

// TODO sub is_safe {
// TODO     my $path = shift;
// TODO     my $info = stat($path);
// TODO     return unless $info;

// TODO     # owner neither superuser nor me 
// TODO     # the real uid is in stored in the $< variable
// TODO     if (($info->uid != 0) && ($info->uid != $<)) {
// TODO         return 0;
// TODO     }

// TODO     # check whether group or other can write file.
// TODO     # use 066 to detect either reading or writing
// TODO     if ($info->mode & 022) {   # someone else can write this
// TODO         return 0 unless -d _;  # non-directories aren't safe
// TODO             # but directories with the sticky bit (01000) are
// TODO         return 0 unless $info->mode & 01000;        
// TODO     }
// TODO     return 1;
// TODO }
//-----------------------------
// TODO use Cwd;
// TODO use POSIX qw(sysconf _PC_CHOWN_RESTRICTED);
// TODO sub is_verysafe {
// TODO     my $path = shift;
// TODO     return is_safe($path) if sysconf(_PC_CHOWN_RESTRICTED);
// TODO     $path = getcwd() . '/' . $path if $path !~ m{^/};
// TODO     do {
// TODO         return unless is_safe($path);
// TODO         $path =~ s#([^/]+|/)$##;               # dirname
// TODO         $path =~ s#/$## if length($path) > 1;  # last slash
// TODO     } while length $path;

// TODO     return 1;
// TODO }
//-----------------------------
// TODO $file = "$ENV{HOME}/.myprogrc";
// TODO readconfig($file) if is_safe($file);
//-----------------------------
// TODO $file = "$ENV{HOME}/.myprogrc";
// TODO if (open(FILE, "< $file")) { 
// TODO     readconfig(*FILE) if is_safe(*FILE);
// TODO }
//-----------------------------

// ^^PLEAC^^_8.18
//-----------------------------
// ^^INCLUDE^^ include/perl/ch08/tailwtmp
//-----------------------------

// ^^PLEAC^^_8.19
//-----------------------------
//% someprog | tee /tmp/output | Mail -s 'check this' user@host.org
//-----------------------------
//% someprog | tctee f1 "|cat -n" f2 ">>f3"
//-----------------------------
// ^^INCLUDE^^ include/perl/ch08/tctee
//-----------------------------

// ^^PLEAC^^_8.20
//-----------------------------
//% laston gnat
//gnat  UID 314 at Mon May 25 08:32:52 1998 on ttyp0 from below.perl.com
//-----------------------------
// ^^INCLUDE^^ include/perl/ch08/laston
//-----------------------------
