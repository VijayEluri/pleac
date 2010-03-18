package org.nicerobot.pleac;

/**
 * @author nicerobot
 * 
 */

// ^^PLEAC^^_7.0
//-----------------------------
// TODO open(INPUT, "< /usr/local/widgets/data")
// TODO     or die "Couldn't open /usr/local/widgets/data for reading: $!\n";

// TODO while (<INPUT>) {
// TODO     print if /blue/;
// TODO }
// TODO close(INPUT);
//-----------------------------
// TODO $var = *STDIN;
// TODO mysub($var, *LOGFILE);
//-----------------------------
// TODO use IO::File;

// TODO $input = IO::File->new("< /usr/local/widgets/data")
// TODO     or die "Couldn't open /usr/local/widgets/data for reading: $!\n";

// TODO while (defined($line = $input->getline())) {
// TODO     chomp($line);
// TODO     STDOUT->print($line) if $line =~ /blue/;
// TODO }
// TODO $input->close();
//-----------------------------
// TODO while (<STDIN>) {                   # reads from STDIN
// TODO     unless (/\d/) {
// TODO         warn "No digit found.\n";   # writes to STDERR
// TODO     }
// TODO     print "Read: ", $_;             # writes to STDOUT
// TODO }
// TODO END { close(STDOUT)                 or die "couldn't close STDOUT: $!" }
//-----------------------------
// TODO open(LOGFILE, "> /tmp/log")     or die "Can't write /tmp/log: $!";
//-----------------------------
// TODO close(FH)           or die "FH didn't close: $!";
//-----------------------------
// TODO $old_fh = select(LOGFILE);                  # switch to LOGFILE for output
// TODO print "Countdown initiated ...\n";
// TODO select($old_fh);                            # return to original output
// TODO print "You have 30 seconds to reach minimum safety distance.\n";
//-----------------------------

// ^^PLEAC^^_7.1
//-----------------------------
// TODO open(SOURCE, "< $path")
// TODO     or die "Couldn't open $path for reading: $!\n";

// TODO open(SINK, "> $path")
// TODO     or die "Couldn't open $path for writing: $!\n";
//-----------------------------
// TODO use Fcntl;

// TODO sysopen(SOURCE, $path, O_RDONLY)
// TODO     or die "Couldn't open $path for reading: $!\n";

// TODO sysopen(SINK, $path, O_WRONLY)
// TODO     or die "Couldn't open $path for writing: $!\n";
//-----------------------------
// TODO use IO::File;

// like Perl's open
// TODO $fh = IO::File->new("> $filename")
// TODO     or die "Couldn't open $filename for writing: $!\n";

// like Perl's sysopen
// TODO $fh = IO::File->new($filename, O_WRONLY|O_CREAT)
// TODO     or die "Couldn't open $filename for writing: $!\n";

// like stdio's fopen(3)
// TODO $fh = IO::File->new($filename, "r+")
// TODO     or die "Couldn't open $filename for read and write: $!\n";
//-----------------------------
// TODO sysopen(FILEHANDLE, $name, $flags)         or die "Can't open $name : $!";
// TODO sysopen(FILEHANDLE, $name, $flags, $perms) or die "Can't open $name : $!";
//-----------------------------
// TODO open(FH, "< $path")                                 or die $!;
// TODO sysopen(FH, $path, O_RDONLY)                        or die $!;
//-----------------------------
// TODO open(FH, "> $path")                                 or die $!;
// TODO sysopen(FH, $path, O_WRONLY|O_TRUNC|O_CREAT)        or die $!;
// TODO sysopen(FH, $path, O_WRONLY|O_TRUNC|O_CREAT, 0600)  or die $!;
//-----------------------------
// TODO sysopen(FH, $path, O_WRONLY|O_EXCL|O_CREAT)         or die $!;
// TODO sysopen(FH, $path, O_WRONLY|O_EXCL|O_CREAT, 0600)   or die $!;
//-----------------------------
// TODO open(FH, ">> $path")                                or die $!;
// TODO sysopen(FH, $path, O_WRONLY|O_APPEND|O_CREAT)       or die $!;
// TODO sysopen(FH, $path, O_WRONLY|O_APPEND|O_CREAT, 0600) or die $!;
//-----------------------------
// TODO sysopen(FH, $path, O_WRONLY|O_APPEND)               or die $!;
//-----------------------------
// TODO open(FH, "+< $path")                                or die $!;
// TODO sysopen(FH, $path, O_RDWR)                          or die $!;
//-----------------------------
// TODO sysopen(FH, $path, O_RDWR|O_CREAT)                  or die $!;
// TODO sysopen(FH, $path, O_RDWR|O_CREAT, 0600)            or die $!;
//-----------------------------
// TODO sysopen(FH, $path, O_RDWR|O_EXCL|O_CREAT)           or die $!;
// TODO sysopen(FH, $path, O_RDWR|O_EXCL|O_CREAT, 0600)     or die $!;
//-----------------------------

// ^^PLEAC^^_7.2
//-----------------------------
// TODO $filename =~ s#^(\s)#./$1#;
// TODO open(HANDLE, "< $filename\0")          or die "cannot open $filename : $!\n";
//-----------------------------
// TODO sysopen(HANDLE, $filename, O_RDONLY)   or die "cannot open $filename: $!\n";
//-----------------------------
// TODO $filename = shift @ARGV;
// TODO open(INPUT, $filename)               or die "Couldn't open $filename : $!\n";
//-----------------------------
// TODO open(OUTPUT, ">$filename")
// TODO     or die "Couldn't open $filename for writing: $!\n";
//-----------------------------
// TODO use Fcntl;                          # for file constants

// TODO sysopen(OUTPUT, $filename, O_WRONLY|O_TRUNC)
// TODO     or die "Can't open $filename for writing: $!\n";
//-----------------------------
// TODO $file =~ s#^(\s)#./$1#;
// TODO open(OUTPUT, "> $file\0")
// TODO         or die "Couldn't open $file for OUTPUT : $!\n";
//-----------------------------

// ^^PLEAC^^_7.3
//-----------------------------
// TODO $filename =~ s{ ^ ~ ( [^/]* ) }
// TODO               { $1
// TODO                     ? (getpwnam($1))[7]
// TODO                     : ( $ENV{HOME} || $ENV{LOGDIR}
// TODO                          || (getpwuid($>))[7]
// TODO                        )
// TODO }ex;
//-----------------------------
//    ~user
//    ~user/blah
//    ~
//    ~/blah
//-----------------------------

// ^^PLEAC^^_7.4
//-----------------------------
// TODO open($path, "< $path")
// TODO     or die "Couldn't open $path for reading : $!\n";
//-----------------------------
//Argument "3\n" isn't numeric in multiply at tallyweb line 16, <LOG> chunk 17.
//-----------------------------
//Argument "3\n" isn't numeric in multiply at tallyweb
//
//    line 16, </usr/local/data/mylog3.dat> chunk 17.
//-----------------------------

// ^^PLEAC^^_7.5
//-----------------------------
// TODO use IO::File;

// TODO $fh = IO::File->new_tmpfile
// TODO         or die "Unable to make new temporary file: $!";
//-----------------------------
// TODO use IO::File;
// TODO use POSIX qw(tmpnam);

// try new temporary filenames until we get one that didn't already exist
// TODO do { $name = tmpnam() }
// TODO     until $fh = IO::File->new($name, O_RDWR|O_CREAT|O_EXCL);

// install atexit-style handler so that when we exit or die,
// we automatically delete this temporary file
// TODO END { unlink($name) or die "Couldn't unlink $name : $!" }

// now go on to use the file ...
//-----------------------------
// TODO for (;;) {
// TODO     $name = tmpnam();
// TODO     sysopen(TMP, $tmpnam, O_RDWR | O_CREAT | O_EXCL) && last;
// TODO }
// TODO unlink $tmpnam;
//-----------------------------
// TODO use IO::File;

// TODO $fh = IO::File->new_tmpfile             or die "IO::File->new_tmpfile: $!";
// TODO $fh->autoflush(1);
// TODO print $fh "$i\n" while $i++ < 10;
// TODO seek($fh, 0, 0)                         or die "seek: $!";
// TODO print "Tmp file has: ", <$fh>;
//-----------------------------

// ^^PLEAC^^_7.6
//-----------------------------
// TODO while (<DATA>) {
// TODO     # process the line
// TODO }
//__DATA__
// your data goes here
//-----------------------------
// TODO while (<main::DATA>) {
// TODO     # process the line
// TODO }
//__END__
// your data goes here
//-----------------------------
// TODO use POSIX qw(strftime);

// TODO $raw_time = (stat(DATA))[9];
// TODO $size     = -s DATA;
// TODO $kilosize = int($size / 1024) . 'k';

// TODO print "<P>Script size is $kilosize\n";
// TODO print strftime("<P>Last script update: %c (%Z)\n", localtime($raw_time));

//__DATA__
//DO NOT REMOVE THE PRECEDING LINE.
//Everything else in this file will be ignored.
//-----------------------------

// ^^PLEAC^^_7.7
//-----------------------------
// TODO while (<>) {
// TODO     # do something with the line
// TODO }
//-----------------------------
// TODO while (<>) {
// TODO     # ...
// TODO  }
//-----------------------------
// TODO unshift(@ARGV, '-') unless @ARGV;
// TODO while ($ARGV = shift @ARGV) {
// TODO     unless (open(ARGV, $ARGV)) {
// TODO         warn "Can't open $ARGV: $!\n";
// TODO         next;
// TODO     }
// TODO     while (defined($_ = <ARGV>)) {
// TODO         # ...
// TODO     }
// TODO }
//-----------------------------
// TODO @ARGV = glob("*.[Cch]") unless @ARGV;
//-----------------------------
// arg demo 1: Process optional -c flag 
// TODO if (@ARGV && $ARGV[0] eq '-c') { 
// TODO     $chop_first++;
// TODO     shift;
// TODO }

// arg demo 2: Process optional -NUMBER flag    
// TODO if (@ARGV && $ARGV[0] =~ /^-(\d+)$/) { 
// TODO     $columns = $1; 
// TODO     shift;
// TODO }

// arg demo 3: Process clustering -a, -i, -n, or -u flags     
// TODO while (@ARGV && $ARGV[0] =~ /^-(.+)/ && (shift, ($_ = $1), 1)) { 
// TODO     next if /^$/; 
// TODO     s/a// && (++$append,      redo);
// TODO     s/i// && (++$ignore_ints, redo); 
// TODO     s/n// && (++$nostdout,    redo); 
// TODO     s/u// && (++$unbuffer,    redo); 
// TODO     die "usage: $0 [-ainu] [filenames] ...\n";    
// TODO }
//-----------------------------
// TODO undef $/;        
// TODO while (<>) {  
// TODO     # $_ now has the complete contents of   
// TODO     # the file whose name is in $ARGV     
// TODO }
//-----------------------------
// TODO {     # create block for local  
// TODO     local $/;         # record separator now undef  
// TODO     while (<>) {      
// TODO         # do something; called functions still have       
// TODO         # undeffed version of $/  
// TODO     }     
// TODO }                     # $/ restored here
//-----------------------------
// TODO while (<>) {  
// TODO     print "$ARGV:$.:$_";  
// TODO     close ARGV if eof;     
// TODO }
//-----------------------------
// ^^INCLUDE^^ include/perl/ch07/findlogin1
//-----------------------------
// ^^INCLUDE^^ include/perl/ch07/findlogin2
//-----------------------------
//% perl -ne 'print if /login/'
//-----------------------------
// ^^INCLUDE^^ include/perl/ch07/lowercase1
//-----------------------------
// ^^INCLUDE^^ include/perl/ch07/lowercase2
//-----------------------------
//% perl -Mlocale -pe 's/([^\W0-9_])/\l$1/g'
//-----------------------------
// ^^INCLUDE^^ include/perl/ch07/countchunks
//-----------------------------
//+0894382237
//less /etc/motd
//+0894382239
//vi ~/.exrc
//+0894382242
//date
//+0894382242
//who
//+0894382288
//telnet home
//-----------------------------
//% perl -pe 's/^#\+(\d+)\n/localtime($1) . " "/e' 
//Tue May  5 09:30:37 1998     less /etc/motd 
//
//Tue May  5 09:30:39 1998     vi ~/.exrc 
//
//Tue May  5 09:30:42 1998     date
//
//Tue May  5 09:30:42 1998     who 
//
//Tue May  5 09:31:28 1998     telnet home
//-----------------------------

// ^^PLEAC^^_7.8
//-----------------------------
// TODO open(OLD, "< $old")         or die "can't open $old: $!";
// TODO open(NEW, "> $new")         or die "can't open $new: $!";
// TODO while (<OLD>) {
// TODO     # change $_, then...
// TODO     print NEW $_            or die "can't write $new: $!";
// TODO }
// TODO close(OLD)                  or die "can't close $old: $!";
// TODO close(NEW)                  or die "can't close $new: $!";
// TODO rename($old, "$old.orig")   or die "can't rename $old to $old.orig: $!";
// TODO rename($new, $old)          or die "can't rename $new to $old: $!";
//-----------------------------
// TODO while (<OLD>) {
// TODO     if ($. == 20) {
// TODO         print NEW "Extra line 1\n";
// TODO         print NEW "Extra line 2\n";
// TODO     }
// TODO     print NEW $_;
// TODO }
//-----------------------------
// TODO while (<OLD>) {
// TODO     next if 20 .. 30;
// TODO     print NEW $_;
// TODO }
//-----------------------------

// ^^PLEAC^^_7.9
//-----------------------------
//% perl -i.orig -p -e 'FILTER COMMAND' file1 file2 file3 ...
//-----------------------------
//!/usr/bin/perl -i.orig -p
// filter commands go here
//-----------------------------
//% perl -pi.orig -e 's/DATE/localtime/e'
//-----------------------------
// TODO while (<>) {
// TODO     if ($ARGV ne $oldargv) {           # are we at the next file?
// TODO         rename($ARGV, $ARGV . '.orig');
// TODO         open(ARGVOUT, ">$ARGV");       # plus error check
// TODO         select(ARGVOUT);
// TODO         $oldargv = $ARGV;
// TODO     }
// TODO     s/DATE/localtime/e;
// TODO }
// TODO continue{
// TODO     print;
// TODO }
// TODO select (STDOUT);                      # restore default output
//-----------------------------
//Dear Sir/Madam/Ravenous Beast,
//    As of DATE, our records show your account
//is overdue.  Please settle by the end of the month.
//Yours in cheerful usury,
//    --A. Moneylender
//-----------------------------
//Dear Sir/Madam/Ravenous Beast,
//    As of Sat Apr 25 12:28:33 1998, our records show your account
//is overdue.  Please settle by the end of the month.
//Yours in cheerful usury,
//    --A. Moneylender
//-----------------------------
//% perl -i.old -pe 's{\bhisvar\b}{hervar}g' *.[Cchy]
//-----------------------------
// set up to iterate over the *.c files in the current directory,
// editing in place and saving the old file with a .orig extension
// TODO local $^I   = '.orig';              # emulate  -i.orig
// TODO local @ARGV = glob("*.c");          # initialize list of files
// TODO while (<>) {
// TODO     if ($. == 1) {
// TODO         print "This line should appear at the top of each file\n";
// TODO     }
// TODO     s/\b(p)earl\b/${1}erl/ig;       # Correct typos, preserving case
// TODO     print;
// TODO } continue {close ARGV if eof} 
//-----------------------------

// ^^PLEAC^^_7.10
//-----------------------------
// TODO open(FH, "+< FILE")                 or die "Opening: $!";
// TODO @ARRAY = <FH>;
// change ARRAY here
// TODO seek(FH,0,0)                        or die "Seeking: $!";
// TODO print FH @ARRAY                     or die "Printing: $!";
// TODO truncate(FH,tell(FH))               or die "Truncating: $!";
// TODO close(FH)                           or die "Closing: $!";
//-----------------------------
// TODO open(F, "+< $infile")       or die "can't read $infile: $!";
// TODO $out = '';
// TODO while (<F>) {
// TODO     s/DATE/localtime/eg;
// TODO     $out .= $_;
// TODO }
// TODO seek(F, 0, 0)               or die "can't seek to start of $infile: $!";
// TODO print F $out                or die "can't print to $infile: $!";
// TODO truncate(F, tell(F))        or die "can't truncate $infile: $!";
// TODO close(F)                    or die "can't close $infile: $!";
//-----------------------------

// ^^PLEAC^^_7.11
//-----------------------------
// TODO open(FH, "+< $path")                or die "can't open $path: $!";
// TODO flock(FH, 2)                        or die "can't flock $path: $!";
// update file, then...
// TODO close(FH)                           or die "can't close $path: $!";
//-----------------------------
// TODO sub LOCK_SH()  { 1 }     #  Shared lock (for reading)
// TODO sub LOCK_EX()  { 2 }     #  Exclusive lock (for writing)
// TODO sub LOCK_NB()  { 4 }     #  Non-blocking request (don't stall)
// TODO sub LOCK_UN()  { 8 }     #  Free the lock (careful!)
//-----------------------------
// TODO unless (flock(FH, LOCK_EX|LOCK_NB)) {
// TODO     warn "can't immediately write-lock the file ($!), blocking ...";
// TODO     unless (flock(FH, LOCK_EX)) {
// TODO         die "can't get write-lock on numfile: $!";
// TODO     }
// TODO }
//-----------------------------
// TODO if ($] < 5.004) {                   # test Perl version number
// TODO      my $old_fh = select(FH);
// TODO      local $| = 1;                  # enable command buffering
// TODO      local $\ = '';                 # clear output record separator
// TODO      print "";                      # trigger output flush
// TODO      select($old_fh);               # restore previous filehandle
// TODO }
// TODO flock(FH, LOCK_UN);
//-----------------------------
// TODO use Fcntl qw(:DEFAULT :flock);

// TODO sysopen(FH, "numfile", O_RDWR|O_CREAT)
// TODO                                     or die "can't open numfile: $!";
// TODO flock(FH, LOCK_EX)                  or die "can't write-lock numfile: $!";
// Now we have acquired the lock, it's safe for I/O
// TODO $num = <FH> || 0;                   # DO NOT USE "or" THERE!!
// TODO seek(FH, 0, 0)                      or die "can't rewind numfile : $!";
// TODO truncate(FH, 0)                     or die "can't truncate numfile: $!";
// TODO print FH $num+1, "\n"               or die "can't write numfile: $!";
// TODO close(FH)                           or die "can't close numfile: $!";
//-----------------------------

// ^^PLEAC^^_7.12
//-----------------------------
// TODO $old_fh = select(OUTPUT_HANDLE);
// TODO $| = 1;
// TODO select($old_fh);
//-----------------------------
// TODO use IO::Handle;
// TODO OUTPUT_HANDLE->autoflush(1);
//-----------------------------
// ^^INCLUDE^^ include/perl/ch07/seeme
//-----------------------------
// TODO     select((select(OUTPUT_HANDLE), $| = 1)[0]);
//-----------------------------
// TODO use FileHandle;

// TODO STDERR->autoflush;          # already unbuffered in stdio
// TODO $filehandle->autoflush(0);
//-----------------------------
// TODO use IO::Handle;
// assume REMOTE_CONN is an interactive socket handle,
// but DISK_FILE is a handle to a regular file.
// TODO autoflush REMOTE_CONN  1;           # unbuffer for clarity
// TODO autoflush DISK_FILE    0;           # buffer this for speed
//-----------------------------
// ^^INCLUDE^^ include/perl/ch07/getpcomidx
//-----------------------------

// ^^PLEAC^^_7.13
//-----------------------------
// TODO $rin = '';
// repeat next line for all filehandles to poll
// TODO vec($rin, fileno(FH1), 1) = 1;
// TODO vec($rin, fileno(FH2), 1) = 1;
// TODO vec($rin, fileno(FH3), 1) = 1;

// TODO $nfound = select($rout=$rin, undef, undef, 0);
// TODO if ($nfound) {
// TODO   # input waiting on one or more of those 3 filehandles
// TODO   if (vec($rout,fileno(FH1),1)) { 
// TODO       # do something with FH1
// TODO   }
// TODO   if (vec($rout,fileno(FH2),1)) {
// TODO       # do something with FH2
// TODO   }
// TODO   if (vec($rout,fileno(FH3),1)) {
// TODO       # do something with FH3
// TODO   }
// TODO }
//-----------------------------
// TODO use IO::Select;

// TODO $select = IO::Select->new();
// repeat next line for all filehandles to poll
// TODO $select->add(*FILEHANDLE);
// TODO if (@ready = $select->can_read(0)) {
// TODO     # input waiting on the filehandles in @ready
// TODO }
//-----------------------------
// TODO $rin = '';
// TODO vec($rin, fileno(FILEHANDLE), 1) = 1;
// TODO $nfound = select($rin, undef, undef, 0);    # just check
// TODO if ($nfound) {
// TODO     $line = <FILEHANDLE>;
// TODO     print "I read $line";
// TODO }
//-----------------------------

// ^^PLEAC^^_7.14
//-----------------------------
// TODO use Fcntl;

// TODO sysopen(MODEM, "/dev/cua0", O_NONBLOCK|O_RDWR)
// TODO     or die "Can't open modem: $!\n";
//-----------------------------
// TODO use Fcntl;

// TODO $flags = '';
// TODO fcntl(HANDLE, F_GETFL, $flags)
// TODO     or die "Couldn't get flags for HANDLE : $!\n";
// TODO $flags |= O_NONBLOCK;
// TODO fcntl(HANDLE, F_SETFL, $flags)
// TODO     or die "Couldn't set flags for HANDLE: $!\n";
//-----------------------------
// TODO use POSIX qw(:errno_h);

// TODO $rv = syswrite(HANDLE, $buffer, length $buffer);
// TODO if (!defined($rv) && $! == EAGAIN) {
// TODO     # would block
// TODO } elsif ($rv != length $buffer) {
// TODO     # incomplete write
// TODO } else {
// TODO     # successfully wrote
// TODO }

// TODO $rv = sysread(HANDLE, $buffer, $BUFSIZ);
// TODO if (!defined($rv) && $! == EAGAIN) {
// TODO     # would block
// TODO } else {
// TODO     # successfully read $rv bytes from HANDLE
// TODO }
//-----------------------------

// ^^PLEAC^^_7.15
//-----------------------------
// TODO $size = pack("L", 0);
// TODO ioctl(FH, $FIONREAD, $size)     or die "Couldn't call ioctl: $!\n";
// TODO $size = unpack("L", $size);

// $size bytes can be read
//-----------------------------
// TODO require 'sys/ioctl.ph';

// TODO $size = pack("L", 0);
// TODO ioctl(FH, FIONREAD(), $size)    or die "Couldn't call ioctl: $!\n";
// TODO $size = unpack("L", $size);
//-----------------------------
//% grep FIONREAD /usr/include/*/*
///usr/include/asm/ioctls.h:#define FIONREAD      0x541B
//-----------------------------
//% cat > fionread.c
//#include <sys/ioctl.h>
//main() {
//
//    printf("%#08x\n", FIONREAD);
//}
//^D
//% cc -o fionread fionread
//% ./fionread
//0x4004667f
//-----------------------------
// TODO $FIONREAD = 0x4004667f;         # XXX: opsys dependent

// TODO $size = pack("L", 0);
// TODO ioctl(FH, $FIONREAD, $size)     or die "Couldn't call ioctl: $!\n";
// TODO $size = unpack("L", $size);
//-----------------------------

// ^^PLEAC^^_7.16
//-----------------------------
// TODO $variable = *FILEHANDLE;        # save in variable
// TODO subroutine(*FILEHANDLE);        # or pass directly

// TODO sub subroutine {
// TODO     my $fh = shift;
// TODO     print $fh "Hello, filehandle!\n";
// TODO }
//-----------------------------
// TODO use FileHandle;                   # make anon filehandle
// TODO $fh = FileHandle->new();

// TODO use IO::File;                     # 5.004 or higher
// TODO $fh = IO::File->new();
//-----------------------------
// TODO $fh_a = IO::File->new("< /etc/motd")    or die "open /etc/motd: $!";
// TODO $fh_b = *STDIN;
// TODO some_sub($fh_a, $fh_b);
//-----------------------------
// TODO sub return_fh {             # make anon filehandle
// TODO     local *FH;              # must be local, not my
// TODO     # now open it if you want to, then...
// TODO     return *FH;
// TODO }

// TODO $handle = return_fh();
//-----------------------------
// TODO sub accept_fh {
// TODO     my $fh = shift;
// TODO     print $fh "Sending to indirect filehandle\n";
// TODO }
//-----------------------------
// TODO sub accept_fh {
// TODO     local *FH = shift;
// TODO     print  FH "Sending to localized filehandle\n";
// TODO }
//-----------------------------
// TODO accept_fh(*STDOUT);
// TODO accept_fh($handle);
//-----------------------------
// TODO @fd = (*STDIN, *STDOUT, *STDERR);
// TODO print $fd[1] "Type it: ";                           # WRONG
// TODO $got = <$fd[0]>                                     # WRONG
// TODO print $fd[2] "What was that: $got";                 # WRONG
//-----------------------------
// TODO print  { $fd[1] } "funny stuff\n";
// TODO printf { $fd[1] } "Pity the poor %x.\n", 3_735_928_559;
// TODO Pity the poor deadbeef.
//-----------------------------
// TODO $ok = -x "/bin/cat";                
// TODO print { $ok ? $fd[1] : $fd[2] } "cat stat $ok\n";
// TODO print { $fd[ 1 + ($ok || 0) ]  } "cat stat $ok\n";           
//-----------------------------
// TODO $got = readline($fd[0]);
//-----------------------------

// ^^PLEAC^^_7.17
//-----------------------------
// TODO use FileCache;
// TODO cacheout ($path);         # each time you use a filehandle
// TODO print $path "output";
//-----------------------------
// ^^INCLUDE^^ include/perl/ch07/splitwulog
//-----------------------------

// ^^PLEAC^^_7.18
//-----------------------------
// TODO foreach $filehandle (@FILEHANDLES) {
// TODO     print $filehandle $stuff_to_print;
// TODO }
//-----------------------------
// TODO open(MANY, "| tee file1 file2 file3 > /dev/null")   or die $!;
// TODO print MANY "data\n"                                 or die $!;
// TODO close(MANY)                                         or die $!;
//-----------------------------
// `use strict' complains about this one:
// TODO for $fh ('FH1', 'FH2', 'FH3')   { print $fh "whatever\n" }
// but not this one:
// TODO for $fh (*FH1, *FH2, *FH3)      { print $fh "whatever\n" }
//-----------------------------
// TODO open (FH, "| tee file1 file2 file3 >/dev/null");
// TODO print FH "whatever\n";
//-----------------------------
// make STDOUT go to three files, plus original STDOUT
// TODO open (STDOUT, "| tee file1 file2 file3") or die "Teeing off: $!\n";
// TODO print "whatever\n"                       or die "Writing: $!\n";
// TODO close(STDOUT)                            or die "Closing: $!\n";
//-----------------------------

// ^^PLEAC^^_7.19
//-----------------------------
// TODO open(FH, "<&=$FDNUM");      # open FH to the descriptor itself
// TODO open(FH, "<&$FDNUM");       # open FH to a copy of the descriptor

// TODO use IO::Handle;

// TODO $fh->fdopen($FDNUM, "r");   # open file descriptor 3 for reading
//-----------------------------
// TODO use IO::Handle;
// TODO $fh = IO::Handle->new();

// TODO $fh->fdopen(3, "r");            # open fd 3 for reading
//-----------------------------
// TODO $fd = $ENV{MHCONTEXTFD};
// TODO open(MHCONTEXT, "<&=$fd")   or die "couldn't fdopen $fd: $!";
// after processing
// TODO close(MHCONTEXT)            or die "couldn't close context file: $!";
//-----------------------------

// ^^PLEAC^^_7.20
//-----------------------------
// TODO *ALIAS = *ORIGINAL;
//-----------------------------
// TODO open(OUTCOPY, ">&STDOUT")   or die "Couldn't dup STDOUT: $!";
// TODO open(INCOPY,  "<&STDIN" )   or die "Couldn't dup STDIN : $!";
//-----------------------------
// TODO open(OUTALIAS, ">&=STDOUT") or die "Couldn't alias STDOUT: $!";
// TODO open(INALIAS,  "<&=STDIN")  or die "Couldn't alias STDIN : $!";
// TODO open(BYNUMBER, ">&=5")      or die "Couldn't alias file descriptor 5: $!";
//-----------------------------
// take copies of the file descriptors
// TODO open(OLDOUT, ">&STDOUT");
// TODO open(OLDERR, ">&STDERR");

// redirect stdout and stderr
// TODO open(STDOUT, "> /tmp/program.out")  or die "Can't redirect stdout: $!";
// TODO open(STDERR, ">&STDOUT")            or die "Can't dup stdout: $!";

// run the program
// TODO system($joe_random_program);

// close the redirected filehandles
// TODO close(STDOUT)                       or die "Can't close STDOUT: $!";
// TODO close(STDERR)                       or die "Can't close STDERR: $!";

// restore stdout and stderr
// TODO open(STDERR, ">&OLDERR")            or die "Can't restore stderr: $!";
// TODO open(STDOUT, ">&OLDOUT")            or die "Can't restore stdout: $!";

// avoid leaks by closing the independent copies
// TODO close(OLDOUT)                       or die "Can't close OLDOUT: $!";
// TODO close(OLDERR)                       or die "Can't close OLDERR: $!";
//-----------------------------

// ^^PLEAC^^_7.21
//-----------------------------
// ^^INCLUDE^^ include/perl/ch07/drivelock
//-----------------------------
// TODO package File::LockDir;
// module to provide very basic filename-level
// locks.  No fancy systems calls.  In theory,
// directory info is sync'd over NFS.  Not
// stress tested.

// TODO use strict;

// TODO use Exporter;
// TODO use vars qw(@ISA @EXPORT);
// TODO @ISA      = qw(Exporter);
// TODO @EXPORT   = qw(nflock nunflock);

// TODO use vars qw($Debug $Check);
// TODO $Debug  ||= 0;  # may be predefined
// TODO $Check  ||= 5;  # may be predefined

// TODO use Cwd;
// TODO use Fcntl;
// TODO use Sys::Hostname;
// TODO use File::Basename;
// TODO use File::stat;
// TODO use Carp;

// TODO my %Locked_Files = ();

// usage: nflock(FILE; NAPTILL)
// TODO sub nflock($;$) {
// TODO     my $pathname = shift;
// TODO     my $naptime  = shift || 0;
// TODO     my $lockname = name2lock($pathname);
// TODO     my $whosegot = "$lockname/owner";
// TODO     my $start    = time();
// TODO     my $missed   = 0;
// TODO     local *OWNER;

// TODO     # if locking what I've already locked, return
// TODO     if ($Locked_Files{$pathname}) {
// TODO         carp "$pathname already locked";
// TODO         return 1
// TODO     }

// TODO     if (!-w dirname($pathname)) {
// TODO         croak "can't write to directory of $pathname";
// TODO     }

// TODO     while (1) {
// TODO         last if mkdir($lockname, 0777);
// TODO         confess "can't get $lockname: $!" if $missed++ > 10
// TODO                         && !-d $lockname;
// TODO         if ($Debug) {{
// TODO             open(OWNER, "< $whosegot") || last; # exit "if"!
// TODO             my $lockee = <OWNER>;
// TODO             chomp($lockee);
// TODO             printf STDERR "%s $0\[$$]: lock on %s held by %s\n",
// TODO                 scalar(localtime), $pathname, $lockee;
// TODO             close OWNER;
// TODO         }}
// TODO         sleep $Check;
// TODO         return if $naptime && time > $start+$naptime;
// TODO     }
// TODO     sysopen(OWNER, $whosegot, O_WRONLY|O_CREAT|O_EXCL)
// TODO                             or croak "can't create $whosegot: $!";
// TODO     printf OWNER "$0\[$$] on %s since %s\n",
// TODO             hostname(), scalar(localtime);
// TODO     close(OWNER)                
// TODO         or croak "close $whosegot: $!";
// TODO     $Locked_Files{$pathname}++;
// TODO     return 1;
// TODO }

// free the locked file
// TODO sub nunflock($) {
// TODO     my $pathname = shift;
// TODO     my $lockname = name2lock($pathname);
// TODO     my $whosegot = "$lockname/owner";
// TODO     unlink($whosegot);
// TODO     carp "releasing lock on $lockname" if $Debug;
// TODO     delete $Locked_Files{$pathname};
// TODO     return rmdir($lockname);
// TODO }

// helper function
// TODO sub name2lock($) {
// TODO     my $pathname = shift;
// TODO     my $dir  = dirname($pathname);
// TODO     my $file = basename($pathname);
// TODO     $dir = getcwd() if $dir eq '.';
// TODO     my $lockname = "$dir/$file.LOCKDIR";
// TODO     return $lockname;
// TODO }

// anything forgotten?
// TODO END {
// TODO     for my $pathname (keys %Locked_Files) {
// TODO         my $lockname = name2lock($pathname);
// TODO         my $whosegot = "$lockname/owner";
// TODO         carp "releasing forgotten $lockname";
// TODO         unlink($whosegot);
// TODO         return rmdir($lockname);
// TODO     }
// TODO }

// TODO 1;
//-----------------------------

// ^^PLEAC^^_7.22
//-----------------------------
// TODO 4: 18584 was just here
//-----------------------------
// TODO 29: 24652 ZAPPED 24656
//-----------------------------
//% lockarea 5 &
//% rep -1 'cat /tmp/lkscreen'
//-----------------------------
// ^^INCLUDE^^ include/perl/ch07/lockarea
//-----------------------------
