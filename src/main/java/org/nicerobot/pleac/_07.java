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
public class _07 {

  public static void _00 () {
  // <PLEAC>

  // Not mine
  // </PLEAC>
  }

  public static void _01 () {
  // <PLEAC>

  // ^^PLEAC^^_7.1
  // -----------------------------
  // TODO perl -> open(SOURCE, "< $path")
  // TODO perl -> or die "Couldn't open $path for reading: $!\n";
  // TODO perl ->
  // TODO perl -> open(SINK, "> $path")
  // TODO perl -> or die "Couldn't open $path for writing: $!\n";
  // -----------------------------
  // TODO perl -> use Fcntl;
  // TODO perl ->
  // TODO perl -> sysopen(SOURCE, $path, O_RDONLY)
  // TODO perl -> or die "Couldn't open $path for reading: $!\n";
  // TODO perl ->
  // TODO perl -> sysopen(SINK, $path, O_WRONLY)
  // TODO perl -> or die "Couldn't open $path for writing: $!\n";
  // -----------------------------
  // TODO perl -> use IO::File;
  // TODO perl ->
  // like Perl's open
  // TODO perl -> $fh = IO::File->new("> $filename")
  // TODO perl -> or die "Couldn't open $filename for writing: $!\n";
  // TODO perl ->
  // like Perl's sysopen
  // TODO perl -> $fh = IO::File->new($filename, O_WRONLY|O_CREAT)
  // TODO perl -> or die "Couldn't open $filename for writing: $!\n";
  // TODO perl ->
  // like stdio's fopen(3)
  // TODO perl -> $fh = IO::File->new($filename, "r+")
  // TODO perl -> or die "Couldn't open $filename for read and write: $!\n";
  // -----------------------------
  // TODO perl -> sysopen(FILEHANDLE, $name, $flags) or die "Can't open $name : $!";
  // TODO perl -> sysopen(FILEHANDLE, $name, $flags, $perms) or die "Can't open $name : $!";
  // -----------------------------
  // TODO perl -> open(FH, "< $path") or die $!;
  // TODO perl -> sysopen(FH, $path, O_RDONLY) or die $!;
  // -----------------------------
  // TODO perl -> open(FH, "> $path") or die $!;
  // TODO perl -> sysopen(FH, $path, O_WRONLY|O_TRUNC|O_CREAT) or die $!;
  // TODO perl -> sysopen(FH, $path, O_WRONLY|O_TRUNC|O_CREAT, 0600) or die $!;
  // -----------------------------
  // TODO perl -> sysopen(FH, $path, O_WRONLY|O_EXCL|O_CREAT) or die $!;
  // TODO perl -> sysopen(FH, $path, O_WRONLY|O_EXCL|O_CREAT, 0600) or die $!;
  // -----------------------------
  // TODO perl -> open(FH, ">> $path") or die $!;
  // TODO perl -> sysopen(FH, $path, O_WRONLY|O_APPEND|O_CREAT) or die $!;
  // TODO perl -> sysopen(FH, $path, O_WRONLY|O_APPEND|O_CREAT, 0600) or die $!;
  // -----------------------------
  // TODO perl -> sysopen(FH, $path, O_WRONLY|O_APPEND) or die $!;
  // -----------------------------
  // TODO perl -> open(FH, "+< $path") or die $!;
  // TODO perl -> sysopen(FH, $path, O_RDWR) or die $!;
  // -----------------------------
  // TODO perl -> sysopen(FH, $path, O_RDWR|O_CREAT) or die $!;
  // TODO perl -> sysopen(FH, $path, O_RDWR|O_CREAT, 0600) or die $!;
  // -----------------------------
  // TODO perl -> sysopen(FH, $path, O_RDWR|O_EXCL|O_CREAT) or die $!;
  // TODO perl -> sysopen(FH, $path, O_RDWR|O_EXCL|O_CREAT, 0600) or die $!;
  // -----------------------------
  // TODO perl ->
  // </PLEAC>
  }

  public static void _02 () {
  // <PLEAC>

  // ^^PLEAC^^_7.2
  // -----------------------------
  // TODO perl -> $filename =~ s#^(\s)#./$1#;
  // TODO perl -> open(HANDLE, "< $filename\0") or die "cannot open $filename : $!\n";
  // -----------------------------
  // TODO perl -> sysopen(HANDLE, $filename, O_RDONLY) or die "cannot open $filename: $!\n";
  // -----------------------------
  // TODO perl -> $filename = shift @ARGV;
  // TODO perl -> open(INPUT, $filename) or die "Couldn't open $filename : $!\n";
  // -----------------------------
  // TODO perl -> open(OUTPUT, ">$filename")
  // TODO perl -> or die "Couldn't open $filename for writing: $!\n";
  // -----------------------------
  // TODO perl -> use Fcntl; # for file constants
  // TODO perl ->
  // TODO perl -> sysopen(OUTPUT, $filename, O_WRONLY|O_TRUNC)
  // TODO perl -> or die "Can't open $filename for writing: $!\n";
  // -----------------------------
  // TODO perl -> $file =~ s#^(\s)#./$1#;
  // TODO perl -> open(OUTPUT, "> $file\0")
  // TODO perl -> or die "Couldn't open $file for OUTPUT : $!\n";
  // -----------------------------
  // TODO perl ->
  // </PLEAC>
  }

  public static void _03 () {
  // <PLEAC>

  // ^^PLEAC^^_7.3
  // -----------------------------
  // TODO perl -> $filename =~ s{ ^ ~ ( [^/]* ) }
  // TODO perl -> { $1
  // TODO perl -> ? (getpwnam($1))[7]
  // TODO perl -> : ( $ENV{HOME} || $ENV{LOGDIR}
  // TODO perl -> || (getpwuid($>))[7]
  // TODO perl -> )
  // TODO perl -> }ex;
  // -----------------------------
  // ~user
  // ~user/blah
  // ~
  // ~/blah
  // -----------------------------
  // TODO perl ->
  // </PLEAC>
  }

  public static void _04 () {
  // <PLEAC>

  // ^^PLEAC^^_7.4
  // -----------------------------
  // TODO perl -> open($path, "< $path")
  // TODO perl -> or die "Couldn't open $path for reading : $!\n";
  // -----------------------------
  // Argument "3\n" isn't numeric in multiply at tallyweb line 16, <LOG> chunk 17.
  // -----------------------------
  // Argument "3\n" isn't numeric in multiply at tallyweb
  //
  // line 16, </usr/local/data/mylog3.dat> chunk 17.
  // -----------------------------
  // TODO perl ->
  // </PLEAC>
  }

  public static void _05 () {
  // <PLEAC>

  // Not mine
  // </PLEAC>
  }

  public static void _06 () {
  // <PLEAC>

  // ^^PLEAC^^_7.6
  // -----------------------------
  // TODO perl -> while (<DATA>) {
  // TODO perl -> # process the line
  // TODO perl -> }
  // __DATA__
  // your data goes here
  // -----------------------------
  // TODO perl -> while (<main::DATA>) {
  // TODO perl -> # process the line
  // TODO perl -> }
  // __END__
  // your data goes here
  // -----------------------------
  // TODO perl -> use POSIX qw(strftime);
  // TODO perl ->
  // TODO perl -> $raw_time = (stat(DATA))[9];
  // TODO perl -> $size = -s DATA;
  // TODO perl -> $kilosize = int($size / 1024) . 'k';
  // TODO perl ->
  // TODO perl -> print "<P>Script size is $kilosize\n";
  // TODO perl -> print strftime("<P>Last script update: %c (%Z)\n", localtime($raw_time));
  // TODO perl ->
  // __DATA__
  // DO NOT REMOVE THE PRECEDING LINE.
  // Everything else in this file will be ignored.
  // -----------------------------
  // TODO perl ->
  // </PLEAC>
  }

  public static void _07 () {
  // <PLEAC>

  // ^^PLEAC^^_7.7
  // -----------------------------
  // TODO perl -> while (<>) {
  // TODO perl -> # do something with the line
  // TODO perl -> }
  // -----------------------------
  // TODO perl -> while (<>) {
  // TODO perl -> # ...
  // TODO perl -> }
  // -----------------------------
  // TODO perl -> unshift(@ARGV, '-') unless @ARGV;
  // TODO perl -> while ($ARGV = shift @ARGV) {
  // TODO perl -> unless (open(ARGV, $ARGV)) {
  // TODO perl -> warn "Can't open $ARGV: $!\n";
  // TODO perl -> next;
  // TODO perl -> }
  // TODO perl -> while (defined($_ = <ARGV>)) {
  // TODO perl -> # ...
  // TODO perl -> }
  // TODO perl -> }
  // -----------------------------
  // TODO perl -> @ARGV = glob("*.[Cch]") unless @ARGV;
  // -----------------------------
  // arg demo 1: Process optional -c flag
  // TODO perl -> if (@ARGV && $ARGV[0] eq '-c') {
  // TODO perl -> $chop_first++;
  // TODO perl -> shift;
  // TODO perl -> }
  // TODO perl ->
  // arg demo 2: Process optional -NUMBER flag
  // TODO perl -> if (@ARGV && $ARGV[0] =~ /^-(\d+)$/) {
  // TODO perl -> $columns = $1;
  // TODO perl -> shift;
  // TODO perl -> }
  // TODO perl ->
  // arg demo 3: Process clustering -a, -i, -n, or -u flags
  // TODO perl -> while (@ARGV && $ARGV[0] =~ /^-(.+)/ && (shift, ($_ = $1), 1)) {
  // TODO perl -> next if /^$/;
  // TODO perl -> s/a// && (++$append, redo);
  // TODO perl -> s/i// && (++$ignore_ints, redo);
  // TODO perl -> s/n// && (++$nostdout, redo);
  // TODO perl -> s/u// && (++$unbuffer, redo);
  // TODO perl -> die "usage: $0 [-ainu] [filenames] ...\n";
  // TODO perl -> }
  // -----------------------------
  // TODO perl -> undef $/;
  // TODO perl -> while (<>) {
  // TODO perl -> # $_ now has the complete contents of
  // TODO perl -> # the file whose name is in $ARGV
  // TODO perl -> }
  // -----------------------------
  // TODO perl -> { # create block for local
  // TODO perl -> local $/; # record separator now undef
  // TODO perl -> while (<>) {
  // TODO perl -> # do something; called functions still have
  // TODO perl -> # undeffed version of $/
  // TODO perl -> }
  // TODO perl -> } # $/ restored here
  // -----------------------------
  // TODO perl -> while (<>) {
  // TODO perl -> print "$ARGV:$.:$_";
  // TODO perl -> close ARGV if eof;
  // TODO perl -> }
  // -----------------------------
  // ^^INCLUDE^^ include/perl/ch07/findlogin1
  // -----------------------------
  // ^^INCLUDE^^ include/perl/ch07/findlogin2
  // -----------------------------
  // % perl -ne 'print if /login/'
  // -----------------------------
  // ^^INCLUDE^^ include/perl/ch07/lowercase1
  // -----------------------------
  // ^^INCLUDE^^ include/perl/ch07/lowercase2
  // -----------------------------
  // % perl -Mlocale -pe 's/([^\W0-9_])/\l$1/g'
  // -----------------------------
  // ^^INCLUDE^^ include/perl/ch07/countchunks
  // -----------------------------
  // +0894382237
  // less /etc/motd
  // +0894382239
  // vi ~/.exrc
  // +0894382242
  // date
  // +0894382242
  // who
  // +0894382288
  // telnet home
  // -----------------------------
  // % perl -pe 's/^#\+(\d+)\n/localtime($1) . " "/e'
  // Tue May 5 09:30:37 1998 less /etc/motd
  //
  // Tue May 5 09:30:39 1998 vi ~/.exrc
  //
  // Tue May 5 09:30:42 1998 date
  //
  // Tue May 5 09:30:42 1998 who
  //
  // Tue May 5 09:31:28 1998 telnet home
  // -----------------------------
  // TODO perl ->
  // </PLEAC>
  }

  public static void _08 () {
  // <PLEAC>

  // ^^PLEAC^^_7.8
  // -----------------------------
  // TODO perl -> open(OLD, "< $old") or die "can't open $old: $!";
  // TODO perl -> open(NEW, "> $new") or die "can't open $new: $!";
  // TODO perl -> while (<OLD>) {
  // TODO perl -> # change $_, then...
  // TODO perl -> print NEW $_ or die "can't write $new: $!";
  // TODO perl -> }
  // TODO perl -> close(OLD) or die "can't close $old: $!";
  // TODO perl -> close(NEW) or die "can't close $new: $!";
  // TODO perl -> rename($old, "$old.orig") or die "can't rename $old to $old.orig: $!";
  // TODO perl -> rename($new, $old) or die "can't rename $new to $old: $!";
  // -----------------------------
  // TODO perl -> while (<OLD>) {
  // TODO perl -> if ($. == 20) {
  // TODO perl -> print NEW "Extra line 1\n";
  // TODO perl -> print NEW "Extra line 2\n";
  // TODO perl -> }
  // TODO perl -> print NEW $_;
  // TODO perl -> }
  // -----------------------------
  // TODO perl -> while (<OLD>) {
  // TODO perl -> next if 20 .. 30;
  // TODO perl -> print NEW $_;
  // TODO perl -> }
  // -----------------------------
  // TODO perl ->
  // </PLEAC>
  }

  public static void _09 () {
  // <PLEAC>

  // ^^PLEAC^^_7.9
  // -----------------------------
  // % perl -i.orig -p -e 'FILTER COMMAND' file1 file2 file3 ...
  // -----------------------------
  // !/usr/bin/perl -i.orig -p
  // filter commands go here
  // -----------------------------
  // % perl -pi.orig -e 's/DATE/localtime/e'
  // -----------------------------
  // TODO perl -> while (<>) {
  // TODO perl -> if ($ARGV ne $oldargv) { # are we at the next file?
  // TODO perl -> rename($ARGV, $ARGV . '.orig');
  // TODO perl -> open(ARGVOUT, ">$ARGV"); # plus error check
  // TODO perl -> select(ARGVOUT);
  // TODO perl -> $oldargv = $ARGV;
  // TODO perl -> }
  // TODO perl -> s/DATE/localtime/e;
  // TODO perl -> }
  // TODO perl -> continue{
  // TODO perl -> print;
  // TODO perl -> }
  // TODO perl -> select (STDOUT); # restore default output
  // -----------------------------
  // Dear Sir/Madam/Ravenous Beast,
  // As of DATE, our records show your account
  // is overdue. Please settle by the end of the month.
  // Yours in cheerful usury,
  // --A. Moneylender
  // -----------------------------
  // Dear Sir/Madam/Ravenous Beast,
  // As of Sat Apr 25 12:28:33 1998, our records show your account
  // is overdue. Please settle by the end of the month.
  // Yours in cheerful usury,
  // --A. Moneylender
  // -----------------------------
  // % perl -i.old -pe 's{\bhisvar\b}{hervar}g' *.[Cchy]
  // -----------------------------
  // set up to iterate over the *.c files in the current directory,
  // editing in place and saving the old file with a .orig extension
  // TODO perl -> local $^I = '.orig'; # emulate -i.orig
  // TODO perl -> local @ARGV = glob("*.c"); # initialize list of files
  // TODO perl -> while (<>) {
  // TODO perl -> if ($. == 1) {
  // TODO perl -> print "This line should appear at the top of each file\n";
  // TODO perl -> }
  // TODO perl -> s/\b(p)earl\b/${1}erl/ig; # Correct typos, preserving case
  // TODO perl -> print;
  // TODO perl -> } continue {close ARGV if eof}
  // -----------------------------
  // TODO perl ->
  // </PLEAC>
  }

  public static void _10 () {
  // <PLEAC>

  // ^^PLEAC^^_7.10
  // -----------------------------
  // TODO perl -> open(FH, "+< FILE") or die "Opening: $!";
  // TODO perl -> @ARRAY = <FH>;
  // change ARRAY here
  // TODO perl -> seek(FH,0,0) or die "Seeking: $!";
  // TODO perl -> print FH @ARRAY or die "Printing: $!";
  // TODO perl -> truncate(FH,tell(FH)) or die "Truncating: $!";
  // TODO perl -> close(FH) or die "Closing: $!";
  // -----------------------------
  // TODO perl -> open(F, "+< $infile") or die "can't read $infile: $!";
  // TODO perl -> $out = '';
  // TODO perl -> while (<F>) {
  // TODO perl -> s/DATE/localtime/eg;
  // TODO perl -> $out .= $_;
  // TODO perl -> }
  // TODO perl -> seek(F, 0, 0) or die "can't seek to start of $infile: $!";
  // TODO perl -> print F $out or die "can't print to $infile: $!";
  // TODO perl -> truncate(F, tell(F)) or die "can't truncate $infile: $!";
  // TODO perl -> close(F) or die "can't close $infile: $!";
  // -----------------------------
  // TODO perl ->
  // </PLEAC>
  }

  public static void _11 () {
  // <PLEAC>

  // ^^PLEAC^^_7.11
  // -----------------------------
  // TODO perl -> open(FH, "+< $path") or die "can't open $path: $!";
  // TODO perl -> flock(FH, 2) or die "can't flock $path: $!";
  // update file, then...
  // TODO perl -> close(FH) or die "can't close $path: $!";
  // -----------------------------
  // TODO perl -> sub LOCK_SH() { 1 } # Shared lock (for reading)
  // TODO perl -> sub LOCK_EX() { 2 } # Exclusive lock (for writing)
  // TODO perl -> sub LOCK_NB() { 4 } # Non-blocking request (don't stall)
  // TODO perl -> sub LOCK_UN() { 8 } # Free the lock (careful!)
  // -----------------------------
  // TODO perl -> unless (flock(FH, LOCK_EX|LOCK_NB)) {
  // TODO perl -> warn "can't immediately write-lock the file ($!), blocking ...";
  // TODO perl -> unless (flock(FH, LOCK_EX)) {
  // TODO perl -> die "can't get write-lock on numfile: $!";
  // TODO perl -> }
  // TODO perl -> }
  // -----------------------------
  // TODO perl -> if ($] < 5.004) { # test Perl version number
  // TODO perl -> my $old_fh = select(FH);
  // TODO perl -> local $| = 1; # enable command buffering
  // TODO perl -> local $\ = ''; # clear output record separator
  // TODO perl -> print ""; # trigger output flush
  // TODO perl -> select($old_fh); # restore previous filehandle
  // TODO perl -> }
  // TODO perl -> flock(FH, LOCK_UN);
  // -----------------------------
  // TODO perl -> use Fcntl qw(:DEFAULT :flock);
  // TODO perl ->
  // TODO perl -> sysopen(FH, "numfile", O_RDWR|O_CREAT)
  // TODO perl -> or die "can't open numfile: $!";
  // TODO perl -> flock(FH, LOCK_EX) or die "can't write-lock numfile: $!";
  // Now we have acquired the lock, it's safe for I/O
  // TODO perl -> $num = <FH> || 0; # DO NOT USE "or" THERE!!
  // TODO perl -> seek(FH, 0, 0) or die "can't rewind numfile : $!";
  // TODO perl -> truncate(FH, 0) or die "can't truncate numfile: $!";
  // TODO perl -> print FH $num+1, "\n" or die "can't write numfile: $!";
  // TODO perl -> close(FH) or die "can't close numfile: $!";
  // -----------------------------
  // TODO perl ->
  // </PLEAC>
  }

  public static void _12 () {
  // <PLEAC>

  // ^^PLEAC^^_7.12
  // -----------------------------
  // TODO perl -> $old_fh = select(OUTPUT_HANDLE);
  // TODO perl -> $| = 1;
  // TODO perl -> select($old_fh);
  // -----------------------------
  // TODO perl -> use IO::Handle;
  // TODO perl -> OUTPUT_HANDLE->autoflush(1);
  // -----------------------------
  // ^^INCLUDE^^ include/perl/ch07/seeme
  // -----------------------------
  // TODO perl -> select((select(OUTPUT_HANDLE), $| = 1)[0]);
  // -----------------------------
  // TODO perl -> use FileHandle;
  // TODO perl ->
  // TODO perl -> STDERR->autoflush; # already unbuffered in stdio
  // TODO perl -> $filehandle->autoflush(0);
  // -----------------------------
  // TODO perl -> use IO::Handle;
  // assume REMOTE_CONN is an interactive socket handle,
  // but DISK_FILE is a handle to a regular file.
  // TODO perl -> autoflush REMOTE_CONN 1; # unbuffer for clarity
  // TODO perl -> autoflush DISK_FILE 0; # buffer this for speed
  // -----------------------------
  // ^^INCLUDE^^ include/perl/ch07/getpcomidx
  // -----------------------------
  // TODO perl ->
  // </PLEAC>
  }

  public static void _13 () {
  // <PLEAC>

  // ^^PLEAC^^_7.13
  // -----------------------------
  // TODO perl -> $rin = '';
  // repeat next line for all filehandles to poll
  // TODO perl -> vec($rin, fileno(FH1), 1) = 1;
  // TODO perl -> vec($rin, fileno(FH2), 1) = 1;
  // TODO perl -> vec($rin, fileno(FH3), 1) = 1;
  // TODO perl ->
  // TODO perl -> $nfound = select($rout=$rin, undef, undef, 0);
  // TODO perl -> if ($nfound) {
  // TODO perl -> # input waiting on one or more of those 3 filehandles
  // TODO perl -> if (vec($rout,fileno(FH1),1)) {
  // TODO perl -> # do something with FH1
  // TODO perl -> }
  // TODO perl -> if (vec($rout,fileno(FH2),1)) {
  // TODO perl -> # do something with FH2
  // TODO perl -> }
  // TODO perl -> if (vec($rout,fileno(FH3),1)) {
  // TODO perl -> # do something with FH3
  // TODO perl -> }
  // TODO perl -> }
  // -----------------------------
  // TODO perl -> use IO::Select;
  // TODO perl ->
  // TODO perl -> $select = IO::Select->new();
  // repeat next line for all filehandles to poll
  // TODO perl -> $select->add(*FILEHANDLE);
  // TODO perl -> if (@ready = $select->can_read(0)) {
  // TODO perl -> # input waiting on the filehandles in @ready
  // TODO perl -> }
  // -----------------------------
  // TODO perl -> $rin = '';
  // TODO perl -> vec($rin, fileno(FILEHANDLE), 1) = 1;
  // TODO perl -> $nfound = select($rin, undef, undef, 0); # just check
  // TODO perl -> if ($nfound) {
  // TODO perl -> $line = <FILEHANDLE>;
  // TODO perl -> print "I read $line";
  // TODO perl -> }
  // -----------------------------
  // TODO perl ->
  // </PLEAC>
  }

  public static void _14 () {
  // <PLEAC>

  // ^^PLEAC^^_7.14
  // -----------------------------
  // TODO perl -> use Fcntl;
  // TODO perl ->
  // TODO perl -> sysopen(MODEM, "/dev/cua0", O_NONBLOCK|O_RDWR)
  // TODO perl -> or die "Can't open modem: $!\n";
  // -----------------------------
  // TODO perl -> use Fcntl;
  // TODO perl ->
  // TODO perl -> $flags = '';
  // TODO perl -> fcntl(HANDLE, F_GETFL, $flags)
  // TODO perl -> or die "Couldn't get flags for HANDLE : $!\n";
  // TODO perl -> $flags |= O_NONBLOCK;
  // TODO perl -> fcntl(HANDLE, F_SETFL, $flags)
  // TODO perl -> or die "Couldn't set flags for HANDLE: $!\n";
  // -----------------------------
  // TODO perl -> use POSIX qw(:errno_h);
  // TODO perl ->
  // TODO perl -> $rv = syswrite(HANDLE, $buffer, length $buffer);
  // TODO perl -> if (!defined($rv) && $! == EAGAIN) {
  // TODO perl -> # would block
  // TODO perl -> } elsif ($rv != length $buffer) {
  // TODO perl -> # incomplete write
  // TODO perl -> } else {
  // TODO perl -> # successfully wrote
  // TODO perl -> }
  // TODO perl ->
  // TODO perl -> $rv = sysread(HANDLE, $buffer, $BUFSIZ);
  // TODO perl -> if (!defined($rv) && $! == EAGAIN) {
  // TODO perl -> # would block
  // TODO perl -> } else {
  // TODO perl -> # successfully read $rv bytes from HANDLE
  // TODO perl -> }
  // -----------------------------
  // TODO perl ->
  // </PLEAC>
  }

  public static void _15 () {
  // <PLEAC>

  // ^^PLEAC^^_7.15
  // -----------------------------
  // TODO perl -> $size = pack("L", 0);
  // TODO perl -> ioctl(FH, $FIONREAD, $size) or die "Couldn't call ioctl: $!\n";
  // TODO perl -> $size = unpack("L", $size);
  // TODO perl ->
  // $size bytes can be read
  // -----------------------------
  // TODO perl -> require 'sys/ioctl.ph';
  // TODO perl ->
  // TODO perl -> $size = pack("L", 0);
  // TODO perl -> ioctl(FH, FIONREAD(), $size) or die "Couldn't call ioctl: $!\n";
  // TODO perl -> $size = unpack("L", $size);
  // -----------------------------
  // % grep FIONREAD /usr/include/*/*
  // /usr/include/asm/ioctls.h:#define FIONREAD 0x541B
  // -----------------------------
  // % cat > fionread.c
  // #include <sys/ioctl.h>
  // main() {
  // <PLEAC>

  //
  // printf("%#08x\n", FIONREAD);
  // }
  // ^D
  // % cc -o fionread fionread
  // % ./fionread
  // 0x4004667f
  // -----------------------------
  // TODO perl -> $FIONREAD = 0x4004667f; # XXX: opsys dependent
  // TODO perl ->
  // TODO perl -> $size = pack("L", 0);
  // TODO perl -> ioctl(FH, $FIONREAD, $size) or die "Couldn't call ioctl: $!\n";
  // TODO perl -> $size = unpack("L", $size);
  // -----------------------------
  // TODO perl ->
  // </PLEAC>
  }

  public static void _16 () {
  // <PLEAC>

  // ^^PLEAC^^_7.16
  // -----------------------------
  // TODO perl -> $variable = *FILEHANDLE; # save in variable
  // TODO perl -> subroutine(*FILEHANDLE); # or pass directly
  // TODO perl ->
  // TODO perl -> sub subroutine {
  // TODO perl -> my $fh = shift;
  // TODO perl -> print $fh "Hello, filehandle!\n";
  // TODO perl -> }
  // -----------------------------
  // TODO perl -> use FileHandle; # make anon filehandle
  // TODO perl -> $fh = FileHandle->new();
  // TODO perl ->
  // TODO perl -> use IO::File; # 5.004 or higher
  // TODO perl -> $fh = IO::File->new();
  // -----------------------------
  // TODO perl -> $fh_a = IO::File->new("< /etc/motd") or die "open /etc/motd: $!";
  // TODO perl -> $fh_b = *STDIN;
  // TODO perl -> some_sub($fh_a, $fh_b);
  // -----------------------------
  // TODO perl -> sub return_fh { # make anon filehandle
  // TODO perl -> local *FH; # must be local, not my
  // TODO perl -> # now open it if you want to, then...
  // TODO perl -> return *FH;
  // TODO perl -> }
  // TODO perl ->
  // TODO perl -> $handle = return_fh();
  // -----------------------------
  // TODO perl -> sub accept_fh {
  // TODO perl -> my $fh = shift;
  // TODO perl -> print $fh "Sending to indirect filehandle\n";
  // TODO perl -> }
  // -----------------------------
  // TODO perl -> sub accept_fh {
  // TODO perl -> local *FH = shift;
  // TODO perl -> print FH "Sending to localized filehandle\n";
  // TODO perl -> }
  // -----------------------------
  // TODO perl -> accept_fh(*STDOUT);
  // TODO perl -> accept_fh($handle);
  // -----------------------------
  // TODO perl -> @fd = (*STDIN, *STDOUT, *STDERR);
  // TODO perl -> print $fd[1] "Type it: "; # WRONG
  // TODO perl -> $got = <$fd[0]> # WRONG
  // TODO perl -> print $fd[2] "What was that: $got"; # WRONG
  // -----------------------------
  // TODO perl -> print { $fd[1] } "funny stuff\n";
  // TODO perl -> printf { $fd[1] } "Pity the poor %x.\n", 3_735_928_559;
  // TODO perl -> Pity the poor deadbeef.
  // -----------------------------
  // TODO perl -> $ok = -x "/bin/cat";
  // TODO perl -> print { $ok ? $fd[1] : $fd[2] } "cat stat $ok\n";
  // TODO perl -> print { $fd[ 1 + ($ok || 0) ] } "cat stat $ok\n";
  // -----------------------------
  // TODO perl -> $got = readline($fd[0]);
  // -----------------------------
  // TODO perl ->
  // </PLEAC>
  }

  public static void _17 () {
  // <PLEAC>

  // ^^PLEAC^^_7.17
  // -----------------------------
  // TODO perl -> use FileCache;
  // TODO perl -> cacheout ($path); # each time you use a filehandle
  // TODO perl -> print $path "output";
  // -----------------------------
  // ^^INCLUDE^^ include/perl/ch07/splitwulog
  // -----------------------------
  // TODO perl ->
  // </PLEAC>
  }

  public static void _18 () {
  // <PLEAC>

  // ^^PLEAC^^_7.18
  // -----------------------------
  // TODO perl -> foreach $filehandle (@FILEHANDLES) {
  // TODO perl -> print $filehandle $stuff_to_print;
  // TODO perl -> }
  // -----------------------------
  // TODO perl -> open(MANY, "| tee file1 file2 file3 > /dev/null") or die $!;
  // TODO perl -> print MANY "data\n" or die $!;
  // TODO perl -> close(MANY) or die $!;
  // -----------------------------
  // `use strict' complains about this one:
  // TODO perl -> for $fh ('FH1', 'FH2', 'FH3') { print $fh "whatever\n" }
  // but not this one:
  // TODO perl -> for $fh (*FH1, *FH2, *FH3) { print $fh "whatever\n" }
  // -----------------------------
  // TODO perl -> open (FH, "| tee file1 file2 file3 >/dev/null");
  // TODO perl -> print FH "whatever\n";
  // -----------------------------
  // make STDOUT go to three files, plus original STDOUT
  // TODO perl -> open (STDOUT, "| tee file1 file2 file3") or die "Teeing off: $!\n";
  // TODO perl -> print "whatever\n" or die "Writing: $!\n";
  // TODO perl -> close(STDOUT) or die "Closing: $!\n";
  // -----------------------------
  // TODO perl ->
  // </PLEAC>
  }

  public static void _19 () {
  // <PLEAC>

  // ^^PLEAC^^_7.19
  // -----------------------------
  // TODO perl -> open(FH, "<&=$FDNUM"); # open FH to the descriptor itself
  // TODO perl -> open(FH, "<&$FDNUM"); # open FH to a copy of the descriptor
  // TODO perl ->
  // TODO perl -> use IO::Handle;
  // TODO perl ->
  // TODO perl -> $fh->fdopen($FDNUM, "r"); # open file descriptor 3 for reading
  // -----------------------------
  // TODO perl -> use IO::Handle;
  // TODO perl -> $fh = IO::Handle->new();
  // TODO perl ->
  // TODO perl -> $fh->fdopen(3, "r"); # open fd 3 for reading
  // -----------------------------
  // TODO perl -> $fd = $ENV{MHCONTEXTFD};
  // TODO perl -> open(MHCONTEXT, "<&=$fd") or die "couldn't fdopen $fd: $!";
  // after processing
  // TODO perl -> close(MHCONTEXT) or die "couldn't close context file: $!";
  // -----------------------------
  // TODO perl ->
  // </PLEAC>
  }

  public static void _20 () {
  // <PLEAC>

  // ^^PLEAC^^_7.20
  // -----------------------------
  // TODO perl -> *ALIAS = *ORIGINAL;
  // -----------------------------
  // TODO perl -> open(OUTCOPY, ">&STDOUT") or die "Couldn't dup STDOUT: $!";
  // TODO perl -> open(INCOPY, "<&STDIN" ) or die "Couldn't dup STDIN : $!";
  // -----------------------------
  // TODO perl -> open(OUTALIAS, ">&=STDOUT") or die "Couldn't alias STDOUT: $!";
  // TODO perl -> open(INALIAS, "<&=STDIN") or die "Couldn't alias STDIN : $!";
  // TODO perl -> open(BYNUMBER, ">&=5") or die "Couldn't alias file descriptor 5: $!";
  // -----------------------------
  // take copies of the file descriptors
  // TODO perl -> open(OLDOUT, ">&STDOUT");
  // TODO perl -> open(OLDERR, ">&STDERR");
  // TODO perl ->
  // redirect stdout and stderr
  // TODO perl -> open(STDOUT, "> /tmp/program.out") or die "Can't redirect stdout: $!";
  // TODO perl -> open(STDERR, ">&STDOUT") or die "Can't dup stdout: $!";
  // TODO perl ->
  // run the program
  // TODO perl -> system($joe_random_program);
  // TODO perl ->
  // close the redirected filehandles
  // TODO perl -> close(STDOUT) or die "Can't close STDOUT: $!";
  // TODO perl -> close(STDERR) or die "Can't close STDERR: $!";
  // TODO perl ->
  // restore stdout and stderr
  // TODO perl -> open(STDERR, ">&OLDERR") or die "Can't restore stderr: $!";
  // TODO perl -> open(STDOUT, ">&OLDOUT") or die "Can't restore stdout: $!";
  // TODO perl ->
  // avoid leaks by closing the independent copies
  // TODO perl -> close(OLDOUT) or die "Can't close OLDOUT: $!";
  // TODO perl -> close(OLDERR) or die "Can't close OLDERR: $!";
  // -----------------------------
  // TODO perl ->
  // </PLEAC>
  }

  public static void _21 () {
  // <PLEAC>

  // ^^PLEAC^^_7.21
  // -----------------------------
  // ^^INCLUDE^^ include/perl/ch07/drivelock
  // -----------------------------
  // TODO perl -> package File::LockDir;
  // module to provide very basic filename-level
  // locks. No fancy systems calls. In theory,
  // directory info is sync'd over NFS. Not
  // stress tested.
  // TODO perl ->
  // TODO perl -> use strict;
  // TODO perl ->
  // TODO perl -> use Exporter;
  // TODO perl -> use vars qw(@ISA @EXPORT);
  // TODO perl -> @ISA = qw(Exporter);
  // TODO perl -> @EXPORT = qw(nflock nunflock);
  // TODO perl ->
  // TODO perl -> use vars qw($Debug $Check);
  // TODO perl -> $Debug ||= 0; # may be predefined
  // TODO perl -> $Check ||= 5; # may be predefined
  // TODO perl ->
  // TODO perl -> use Cwd;
  // TODO perl -> use Fcntl;
  // TODO perl -> use Sys::Hostname;
  // TODO perl -> use File::Basename;
  // TODO perl -> use File::stat;
  // TODO perl -> use Carp;
  // TODO perl ->
  // TODO perl -> my %Locked_Files = ();
  // TODO perl ->
  // usage: nflock(FILE; NAPTILL)
  // TODO perl -> sub nflock($;$) {
  // TODO perl -> my $pathname = shift;
  // TODO perl -> my $naptime = shift || 0;
  // TODO perl -> my $lockname = name2lock($pathname);
  // TODO perl -> my $whosegot = "$lockname/owner";
  // TODO perl -> my $start = time();
  // TODO perl -> my $missed = 0;
  // TODO perl -> local *OWNER;
  // TODO perl ->
  // TODO perl -> # if locking what I've already locked, return
  // TODO perl -> if ($Locked_Files{$pathname}) {
  // TODO perl -> carp "$pathname already locked";
  // TODO perl -> return 1
  // TODO perl -> }
  // TODO perl ->
  // TODO perl -> if (!-w dirname($pathname)) {
  // TODO perl -> croak "can't write to directory of $pathname";
  // TODO perl -> }
  // TODO perl ->
  // TODO perl -> while (1) {
  // TODO perl -> last if mkdir($lockname, 0777);
  // TODO perl -> confess "can't get $lockname: $!" if $missed++ > 10
  // TODO perl -> && !-d $lockname;
  // TODO perl -> if ($Debug) {{
  // TODO perl -> open(OWNER, "< $whosegot") || last; # exit "if"!
  // TODO perl -> my $lockee = <OWNER>;
  // TODO perl -> chomp($lockee);
  // TODO perl -> printf STDERR "%s $0\[$$]: lock on %s held by %s\n",
  // TODO perl -> scalar(localtime), $pathname, $lockee;
  // TODO perl -> close OWNER;
  // TODO perl -> }}
  // TODO perl -> sleep $Check;
  // TODO perl -> return if $naptime && time > $start+$naptime;
  // TODO perl -> }
  // TODO perl -> sysopen(OWNER, $whosegot, O_WRONLY|O_CREAT|O_EXCL)
  // TODO perl -> or croak "can't create $whosegot: $!";
  // TODO perl -> printf OWNER "$0\[$$] on %s since %s\n",
  // TODO perl -> hostname(), scalar(localtime);
  // TODO perl -> close(OWNER)
  // TODO perl -> or croak "close $whosegot: $!";
  // TODO perl -> $Locked_Files{$pathname}++;
  // TODO perl -> return 1;
  // TODO perl -> }
  // TODO perl ->
  // free the locked file
  // TODO perl -> sub nunflock($) {
  // TODO perl -> my $pathname = shift;
  // TODO perl -> my $lockname = name2lock($pathname);
  // TODO perl -> my $whosegot = "$lockname/owner";
  // TODO perl -> unlink($whosegot);
  // TODO perl -> carp "releasing lock on $lockname" if $Debug;
  // TODO perl -> delete $Locked_Files{$pathname};
  // TODO perl -> return rmdir($lockname);
  // TODO perl -> }
  // TODO perl ->
  // helper function
  // TODO perl -> sub name2lock($) {
  // TODO perl -> my $pathname = shift;
  // TODO perl -> my $dir = dirname($pathname);
  // TODO perl -> my $file = basename($pathname);
  // TODO perl -> $dir = getcwd() if $dir eq '.';
  // TODO perl -> my $lockname = "$dir/$file.LOCKDIR";
  // TODO perl -> return $lockname;
  // TODO perl -> }
  // TODO perl ->
  // anything forgotten?
  // TODO perl -> END {
  // TODO perl -> for my $pathname (keys %Locked_Files) {
  // TODO perl -> my $lockname = name2lock($pathname);
  // TODO perl -> my $whosegot = "$lockname/owner";
  // TODO perl -> carp "releasing forgotten $lockname";
  // TODO perl -> unlink($whosegot);
  // TODO perl -> return rmdir($lockname);
  // TODO perl -> }
  // TODO perl -> }
  // TODO perl ->
  // TODO perl -> 1;
  // -----------------------------
  // TODO perl ->
  // </PLEAC>
  }

  public static void _22 () {
  // <PLEAC>

  // ^^PLEAC^^_7.22
  // -----------------------------
  // TODO perl -> 4: 18584 was just here
  // -----------------------------
  // TODO perl -> 29: 24652 ZAPPED 24656
  // -----------------------------
  // % lockarea 5 &
  // % rep -1 'cat /tmp/lkscreen'
  // -----------------------------
  // ^^INCLUDE^^ include/perl/ch07/lockarea
  // -----------------------------
  // TODO perl ->
  // </PLEAC>
  }
}
