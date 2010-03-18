package org.nicerobot.pleac;

/**
 * @author nicerobot
 * 
 */
public class _16 {

  public static void _01 () {
    // <PLEAC>

    // ^^PLEAC^^_16.1
    // -----------------------------
    // TODO perl -> $output = `program args`; # collect output into one multiline string
    // TODO perl -> @output = `program args`; # collect output into array, one line per element
    // -----------------------------
    // TODO perl -> open(README, "program args |") or die "Can't run program: $!\n";
    // TODO perl -> while(<README>) {
    // TODO perl -> $output .= $_;
    // TODO perl -> }
    // TODO perl -> close(README);
    // -----------------------------
    // TODO perl -> `fsck -y /dev/rsd1a`; # BAD AND SCARY
    // -----------------------------
    // TODO perl -> use POSIX qw(:sys_wait_h);
    // TODO perl ->
    // TODO perl -> pipe(README, WRITEME);
    // TODO perl -> if ($pid = fork) {
    // TODO perl -> # parent
    // TODO perl -> $SIG{CHLD} = sub { 1 while ( waitpid(-1, WNOHANG)) > 0 };
    // TODO perl -> close(WRITEME);
    // TODO perl -> } else {
    // TODO perl -> die "cannot fork: $!" unless defined $pid;
    // TODO perl -> # child
    // TODO perl -> open(STDOUT, ">&=WRITEME") or die "Couldn't redirect STDOUT: $!";
    // TODO perl -> close(README);
    // TODO perl -> exec($program, $arg1, $arg2) or die "Couldn't run $program : $!\n";
    // TODO perl -> }
    // TODO perl ->
    // TODO perl -> while (<README>) {
    // TODO perl -> $string .= $_;
    // TODO perl -> # or push(@strings, $_);
    // TODO perl -> }
    // TODO perl -> close(README);
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _02 () {
    // <PLEAC>

    // ^^PLEAC^^_16.2
    // -----------------------------
    // TODO perl -> $status = system("vi $myfile");
    // -----------------------------
    // TODO perl -> $status = system("vi", $myfile);
    // -----------------------------
    // TODO perl -> system("cmd1 args | cmd2 | cmd3 >outfile");
    // TODO perl -> system("cmd args <infile >outfile 2>errfile");
    // -----------------------------
    // TODO perl -> $status = system($program, $arg1, $arg);
    // TODO perl -> die "$program exited funny: $?" unless $status == 0;
    // -----------------------------
    // TODO perl -> if (($signo = system(@arglist)) &= 127) {
    // TODO perl -> die "program killed by signal $signo\n";
    // TODO perl -> }
    // -----------------------------
    // TODO perl -> if ($pid = fork) {
    // TODO perl -> # parent catches INT and berates user
    // TODO perl -> local $SIG{INT} = sub { print "Tsk tsk, no process interruptus\n" };
    // TODO perl -> waitpid($pid, 0);
    // TODO perl -> } else {
    // TODO perl -> die "cannot fork: $!" unless defined $pid;
    // TODO perl -> # child ignores INT and does its thing
    // TODO perl -> $SIG{INT} = "IGNORE";
    // TODO perl -> exec("summarize", "/etc/logfiles") or die "Can't exec: $!\n";
    // TODO perl -> }
    // -----------------------------
    // TODO perl -> $shell = '/bin/tcsh';
    // TODO perl -> system $shell '-csh'; # pretend it's a login shell
    // -----------------------------
    // TODO perl -> system {'/bin/tcsh'} '-csh'; # pretend it's a login shell
    // -----------------------------
    // call expn as vrfy
    // TODO perl -> system {'/home/tchrist/scripts/expn'} 'vrfy', @ADDRESSES;
    // -----------------------------
    // TODO perl -> @args = ( "echo surprise" );
    // TODO perl ->
    // TODO perl -> system @args; # subject to shell escapes if @args == 1
    // TODO perl -> system { $args[0] } @args; # safe even with one-arg list
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _03 () {
    // <PLEAC>

    // ^^PLEAC^^_16.3
    // -----------------------------
    // TODO perl -> exec("archive *.data")
    // TODO perl -> or die "Couldn't replace myself with archive: $!\n";
    // -----------------------------
    // TODO perl -> exec("archive", "accounting.data")
    // TODO perl -> or die "Couldn't replace myself with archive: $!\n";
    // -----------------------------
    // TODO perl -> exec("archive accounting.data")
    // TODO perl -> or die "Couldn't replace myself with archive: $!\n";
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _04 () {
    // <PLEAC>

    // ^^PLEAC^^_16.4
    // -----------------------------
    // TODO perl -> $pid = open(README, "program arguments |") or die "Couldn't fork: $!\n";
    // TODO perl -> while (<README>) {
    // TODO perl -> # ...
    // TODO perl -> }
    // TODO perl -> close(README) or die "Couldn't close: $!\n";
    // -----------------------------
    // TODO perl -> $pid = open(WRITEME, "| program arguments") or die "Couldn't fork: $!\n";
    // TODO perl -> print WRITEME "data\n";
    // TODO perl -> close(WRITEME) or die "Couldn't close: $!\n";
    // -----------------------------
    // TODO perl -> $pid = open(F, "sleep 100000|"); # child goes to sleep
    // TODO perl -> close(F); # and the parent goes to lala land
    // -----------------------------
    // TODO perl -> $pid = open(WRITEME, "| program args");
    // TODO perl -> print WRITEME "hello\n"; # program will get hello\n on STDIN
    // TODO perl -> close(WRITEME); # program will get EOF on STDIN
    // -----------------------------
    // TODO perl -> $pager = $ENV{PAGER} || '/usr/bin/less'; # XXX: might not exist
    // TODO perl -> open(STDOUT, "| $pager");
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _05 () {
    // <PLEAC>

    // ^^PLEAC^^_16.5
    // -----------------------------
    // TODO perl -> head(100);
    // TODO perl -> while (<>) {
    // TODO perl -> print;
    // TODO perl -> }
    // TODO perl ->
    // TODO perl -> sub head {
    // TODO perl -> my $lines = shift || 20;
    // TODO perl -> return if $pid = open(STDOUT, "|-");
    // TODO perl -> die "cannot fork: $!" unless defined $pid;
    // TODO perl -> while (<STDIN>) {
    // TODO perl -> print;
    // TODO perl -> last unless --$lines ;
    // TODO perl -> }
    // TODO perl -> exit;
    // TODO perl -> }
    // -----------------------------
    // TODO perl -> 1: > Welcome to Linux, version 2.0.33 on a i686
    // TODO perl ->
    // TODO perl -> 2: >
    // TODO perl ->
    // TODO perl -> 3: > "The software required `Windows 95 or better',
    // TODO perl ->
    // TODO perl -> 4: > so I installed Linux."
    // -----------------------------
    // TODO perl -> > 1: Welcome to Linux, Kernel version 2.0.33 on a i686
    // TODO perl ->
    // TODO perl -> > 2:
    // TODO perl ->
    // TODO perl -> > 3: "The software required `Windows 95 or better',
    // TODO perl ->
    // TODO perl -> > 4: so I installed Linux."
    // -----------------------------
    // ^^INCLUDE^^ include/perl/ch16/qnumcat
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _06 () {
    // <PLEAC>

    // ^^PLEAC^^_16.6
    // -----------------------------
    // TODO perl -> @ARGV = map { /\.(gz|Z)$/ ? "gzip -dc $_ |" : $_ } @ARGV;
    // TODO perl -> while (<>) {
    // TODO perl -> # .......
    // TODO perl -> }
    // -----------------------------
    // TODO perl -> @ARGV = map { m#^\w+://# ? "GET $_ |" : $_ } @ARGV;
    // TODO perl -> while (<>) {
    // TODO perl -> # .......
    // TODO perl -> }
    // -----------------------------
    // TODO perl -> $pwdinfo = `domainname` =~ /^(\(none\))?$/
    // TODO perl -> ? '< /etc/passwd'
    // TODO perl -> : 'ypcat passwd |';
    // TODO perl ->
    // TODO perl -> open(PWD, $pwdinfo) or die "can't open $pwdinfo: $!";
    // -----------------------------
    // TODO perl -> print "File, please? ";
    // TODO perl -> chomp($file = <>);
    // TODO perl -> open (FH, $file) or die "can't open $file: $!";
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _07 () {
    // <PLEAC>

    // ^^PLEAC^^_16.7
    // -----------------------------
    // TODO perl -> $output = `cmd 2>&1`; # with backticks
    // or
    // TODO perl -> $pid = open(PH, "cmd 2>&1 |"); # with an open pipe
    // TODO perl -> while (<PH>) { } # plus a read
    // -----------------------------
    // TODO perl -> $output = `cmd 2>/dev/null`; # with backticks
    // or
    // TODO perl -> $pid = open(PH, "cmd 2>/dev/null |"); # with an open pipe
    // TODO perl -> while (<PH>) { } # plus a read
    // -----------------------------
    // TODO perl -> $output = `cmd 2>&1 1>/dev/null`; # with backticks
    // or
    // TODO perl -> $pid = open(PH, "cmd 2>&1 1>/dev/null |"); # with an open pipe
    // TODO perl -> while (<PH>) { } # plus a read
    // -----------------------------
    // TODO perl -> $output = `cmd 3>&1 1>&2 2>&3 3>&-`; # with backticks
    // or
    // TODO perl -> $pid = open(PH, "cmd 3>&1 1>&2 2>&3 3>&-|"); # with an open pipe
    // TODO perl -> while (<PH>) { } # plus a read
    // -----------------------------
    // TODO perl -> system("program args 1>/tmp/program.stdout 2>/tmp/program.stderr");
    // -----------------------------
    // TODO perl -> $output = `cmd 3>&1 1>&2 2>&3 3>&-`;
    // -----------------------------
    // TODO perl -> $fd3 = $fd1;
    // TODO perl -> $fd1 = $fd2;
    // TODO perl -> $fd2 = $fd3;
    // TODO perl -> $fd3 = undef;
    // -----------------------------
    // TODO perl -> system("prog args 1>tmpfile 2>&1");
    // TODO perl -> system("prog args 2>&1 1>tmpfile");
    // -----------------------------
    // system ("prog args 1>tmpfile 2>&1");
    // TODO perl -> $fd1 = "tmpfile"; # change stdout destination first
    // TODO perl -> $fd2 = $fd1; # now point stderr there, too
    // -----------------------------
    // system("prog args 2>&1 1>tmpfile");
    // TODO perl -> $fd2 = $fd1; # stderr same destination as stdout
    // TODO perl -> $fd1 = "tmpfile"; # but change stdout destination
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _08 () {
    // <PLEAC>

    // ^^PLEAC^^_16.8
    // -----------------------------
    // TODO perl -> use IPC::Open2;
    // TODO perl ->
    // TODO perl -> open2(*README, *WRITEME, $program);
    // TODO perl -> print WRITEME "here's your input\n";
    // TODO perl -> $output = <README>;
    // TODO perl -> close(WRITEME);
    // TODO perl -> close(README);
    // -----------------------------
    // TODO perl -> open(DOUBLE_HANDLE, "| program args |") # WRONG
    // -----------------------------
    // TODO perl -> use IPC::Open2;
    // TODO perl -> use IO::Handle;
    // TODO perl ->
    // TODO perl -> ($reader, $writer) = (IO::Handle->new, IO::Handle->new);
    // TODO perl -> open2($reader, $writer, $program);
    // -----------------------------
    // TODO perl -> eval {
    // TODO perl -> open2($readme, $writeme, @program_and_arguments);
    // TODO perl -> };
    // TODO perl -> if ($@) {
    // TODO perl -> if ($@ =~ /^open2/) {
    // TODO perl -> warn "open2 failed: $!\n$@\n";
    // TODO perl -> return;
    // TODO perl -> }
    // TODO perl -> die; # reraise unforeseen exception
    // TODO perl -> }
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _09 () {
    // <PLEAC>

    // ^^PLEAC^^_16.9
    // -----------------------------
    // TODO perl -> @all = `($cmd | sed -e 's/^/stdout: /' ) 2>&1`;
    // TODO perl -> for (@all) { push @{ s/stdout: // ? \@outlines : \@errlines }, $_ }
    // TODO perl -> print "STDOUT:\n", @outlines, "\n";
    // TODO perl -> print "STDERR:\n", @errlines, "\n";
    // -----------------------------
    // TODO perl -> open3(*WRITEHANDLE, *READHANDLE, *ERRHANDLE, "program to run");
    // -----------------------------
    // TODO perl -> use IPC::Open3;
    // TODO perl -> $pid = open3(*HIS_IN, *HIS_OUT, *HIS_ERR, $cmd);
    // TODO perl -> close(HIS_IN); # give end of file to kid, or feed him
    // TODO perl -> @outlines = <HIS_OUT>; # read till EOF
    // TODO perl -> @errlines = <HIS_ERR>; # XXX: block potential if massive
    // TODO perl -> print "STDOUT:\n", @outlines, "\n";
    // TODO perl -> print "STDERR:\n", @errlines, "\n";
    // -----------------------------
    // ^^INCLUDE^^ include/perl/ch16/cmd3sel
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _10 () {
    // <PLEAC>

    // ^^PLEAC^^_16.10
    // -----------------------------
    // TODO perl -> pipe(READER, WRITER);
    // TODO perl -> if (fork) {
    // TODO perl -> # run parent code, either reading or writing, not both
    // TODO perl -> } else {
    // TODO perl -> # run child code, either reading or writing, not both
    // TODO perl -> }
    // -----------------------------
    // TODO perl -> if ($pid = open(CHILD, "|-")) {
    // TODO perl -> # run parent code, writing to child
    // TODO perl -> } else {
    // TODO perl -> die "cannot fork: $!" unless defined $pid;
    // TODO perl -> # otherwise run child code here, reading from parent
    // TODO perl -> }
    // -----------------------------
    // TODO perl -> if ($pid = open(CHILD, "-|")) {
    // TODO perl -> # run parent code, reading from child
    // TODO perl -> } else {
    // TODO perl -> die "cannot fork: $!" unless defined $pid;
    // TODO perl -> # otherwise run child code here, writing to parent
    // TODO perl -> }
    // -----------------------------
    // ^^INCLUDE^^ include/perl/ch16/pipe1
    // -----------------------------
    // ^^INCLUDE^^ include/perl/ch16/pipe2
    // -----------------------------
    // ^^INCLUDE^^ include/perl/ch16/pipe3
    // -----------------------------
    // ^^INCLUDE^^ include/perl/ch16/pipe4
    // -----------------------------
    // ^^INCLUDE^^ include/perl/ch16/pipe5
    // -----------------------------
    // ^^INCLUDE^^ include/perl/ch16/pipe6
    // -----------------------------
    // TODO perl -> socketpair(READER, WRITER, AF_UNIX, SOCK_STREAM, PF_UNSPEC);
    // TODO perl -> shutdown(READER, 1); # no more writing for reader
    // TODO perl -> shutdown(WRITER, 0); # no more reading for writer
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _11 () {
    // <PLEAC>

    // ^^PLEAC^^_16.11
    // -----------------------------
    // % mkfifo /path/to/named.pipe
    // -----------------------------
    // TODO perl -> open(FIFO, "< /path/to/named.pipe") or die $!;
    // TODO perl -> while (<FIFO>) {
    // TODO perl -> print "Got: $_";
    // TODO perl -> }
    // TODO perl -> close(FIFO);
    // -----------------------------
    // TODO perl -> open(FIFO, "> /path/to/named.pipe") or die $!;
    // TODO perl -> print FIFO "Smoke this.\n";
    // TODO perl -> close(FIFO);
    // -----------------------------
    // % mkfifo ~/.plan # isn't this everywhere yet?
    // % mknod ~/.plan p # in case you don't have mkfifo
    // -----------------------------
    // ^^INCLUDE^^ include/perl/ch16/dateplan
    // -----------------------------
    // ^^INCLUDE^^ include/perl/ch16/fifolog
    // -----------------------------
    // TODO perl -> use POSIX qw(:errno_h);
    // TODO perl ->
    // TODO perl -> $SIG{PIPE} = 'IGNORE';
    // ...
    // TODO perl -> $status = print FIFO "Are you there?\n";
    // TODO perl -> if (!$status && $! == EPIPE) {
    // TODO perl -> warn "My reader has forsaken me!\n";
    // TODO perl -> next;
    // TODO perl -> }
    // -----------------------------
    // TODO perl -> use POSIX;
    // TODO perl -> print _POSIX_PIPE_BUF, "\n";
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _12 () {
    // <PLEAC>

    // ^^PLEAC^^_16.12
    // -----------------------------
    // ^^INCLUDE^^ include/perl/ch16/sharetest
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _13 () {
    // <PLEAC>

    // ^^PLEAC^^_16.13
    // -----------------------------
    // % kill -l
    // HUP INT QUIT ILL TRAP ABRT BUS FPE KILL USR1 SEGV USR2 PIPE
    //
    // ALRM TERM CHLD CONT STOP TSTP TTIN TTOU URG XCPU XFSZ VTALRM
    //
    // PROF WINCH POLL PWR
    // -----------------------------
    // % perl -e 'print join(" ", keys %SIG), "\n"'
    // XCPU ILL QUIT STOP EMT ABRT BUS USR1 XFSZ TSTP INT IOT USR2 INFO TTOU
    //
    // ALRM KILL HUP URG PIPE CONT SEGV VTALRM PROF TRAP IO TERM WINCH CHLD
    //
    // FPE TTIN SYS
    // -----------------------------
    // % perl -MConfig -e 'print $Config{sig_name}'
    // ZERO HUP INT QUIT ILL TRAP ABRT EMT FPE KILL BUS SEGV SYS PIPE ALRM
    //
    // TERM URG STOP TSTP CONT CHLD TTIN TTOU IO XCPU XFSZ VTALRM PROF WINCH
    //
    // INFO USR1 USR2 IOT
    // -----------------------------
    // TODO perl -> use Config;
    // TODO perl -> defined $Config{sig_name} or die "No sigs?";
    // TODO perl -> $i = 0; # Config prepends fake 0 signal called "ZERO".
    // TODO perl -> foreach $name (split(' ', $Config{sig_name})) {
    // TODO perl -> $signo{$name} = $i;
    // TODO perl -> $signame[$i] = $name;
    // TODO perl -> $i++;
    // TODO perl -> }
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _14 () {
    // <PLEAC>

    // ^^PLEAC^^_16.14
    // -----------------------------
    // TODO perl -> kill 9 => $pid; # send $pid a signal 9
    // TODO perl -> kill -1 => $pgrp; # send whole job a signal 1
    // TODO perl -> kill USR1 => $$; # send myself a SIGUSR1
    // TODO perl -> kill HUP => @pids; # send a SIGHUP to processes in @pids
    // -----------------------------
    // TODO perl -> use POSIX qw(:errno_h);
    // TODO perl ->
    // TODO perl -> if (kill 0 => $minion) {
    // TODO perl -> print "$minion is alive!\n";
    // TODO perl -> } elsif ($! == EPERM) { # changed uid
    // TODO perl -> print "$minion has escaped my control!\n";
    // TODO perl -> } elsif ($! == ESRCH) {
    // TODO perl -> print "$minion is deceased.\n"; # or zombied
    // TODO perl -> } else {
    // TODO perl -> warn "Odd; I couldn't check on the status of $minion: $!\n";
    // TODO perl -> }
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _15 () {
    // <PLEAC>

    // ^^PLEAC^^_16.15
    // -----------------------------
    // TODO perl -> $SIG{QUIT} = \&got_sig_quit; # call &got_sig_quit for every SIGQUIT
    // TODO perl -> $SIG{PIPE} = 'got_sig_pipe'; # call main::got_sig_pipe for every SIGPIPE
    // TODO perl -> $SIG{INT} = sub { $ouch++ }; # increment $ouch for every SIGINT
    // -----------------------------
    // TODO perl -> $SIG{INT} = 'IGNORE'; # ignore the signal INT
    // -----------------------------
    // TODO perl -> $SIG{STOP} = 'DEFAULT'; # restore default STOP signal handling
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _16 () {
    // <PLEAC>

    // ^^PLEAC^^_16.16
    // -----------------------------
    // the signal handler
    // TODO perl -> sub ding {
    // TODO perl -> $SIG{INT} = \&ding;
    // TODO perl -> warn "\aEnter your name!\n";
    // TODO perl -> }
    // TODO perl ->
    // prompt for name, overriding SIGINT
    // TODO perl -> sub get_name {
    // TODO perl -> local $SIG{INT} = \&ding;
    // TODO perl -> my $name;
    // TODO perl ->
    // TODO perl -> print "Kindly Stranger, please enter your name: ";
    // TODO perl -> chomp( $name = <> );
    // TODO perl -> return $name;
    // TODO perl -> }
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _17 () {
    // <PLEAC>

    // ^^PLEAC^^_16.17
    // -----------------------------
    // TODO perl -> $SIG{INT} = \&got_int;
    // TODO perl -> sub got_int {
    // TODO perl -> $SIG{INT} = \&got_int; # but not for SIGCHLD!
    // TODO perl -> # ...
    // TODO perl -> }
    // -----------------------------
    // TODO perl -> my $interrupted = 0;
    // TODO perl ->
    // TODO perl -> sub got_int {
    // TODO perl -> $interrupted = 1;
    // TODO perl -> $SIG{INT} = 'DEFAULT'; # or 'IGNORE'
    // TODO perl -> die;
    // TODO perl -> }
    // TODO perl ->
    // TODO perl -> eval {
    // TODO perl -> $SIG{INT} = \&got_int;
    // TODO perl -> # ... long-running code that you don't want to restart
    // TODO perl -> };
    // TODO perl ->
    // TODO perl -> if ($interrupted) {
    // TODO perl -> # deal with the signal
    // TODO perl -> }
    // -----------------------------
    // TODO perl -> $SIG{INT} = \&catcher;
    // TODO perl -> sub catcher {
    // TODO perl -> $SIG{INT} = \&catcher;
    // TODO perl -> # ...
    // TODO perl -> }
    // -----------------------------
    // TODO perl -> use Config;
    // TODO perl -> print "Hurrah!\n" if $Config{d_sigaction};
    // -----------------------------
    // % egrep 'S[AV]_(RESTART|INTERRUPT)' /usr/include/*/signal.h
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _18 () {
    // <PLEAC>

    // ^^PLEAC^^_16.18
    // -----------------------------
    // TODO perl -> $SIG{INT} = 'IGNORE';
    // -----------------------------
    // TODO perl -> $SIG{INT} = \&tsktsk;
    // TODO perl ->
    // TODO perl -> sub tsktsk {
    // TODO perl -> $SIG{INT} = \&tsktsk; # See ``Writing A Signal Handler''
    // TODO perl -> warn "\aThe long habit of living indisposeth us for dying.\n";
    // TODO perl -> }
    // -----------------------------
    // % stty -a
    // speed 9600 baud; 38 rows; 80 columns;
    //
    // lflags: icanon isig iexten echo echoe -echok echoke -echonl echoctl
    //
    // -echoprt -altwerase -noflsh -tostop -flusho pendin -nokerninfo
    //
    // -extproc
    //
    // iflags: -istrip icrnl -inlcr -igncr ixon -ixoff ixany imaxbel -ignbrk
    //
    // brkint -inpck -ignpar -parmrk
    //
    // oflags: opost onlcr oxtabs
    //
    // cflags: cread cs8 -parenb -parodd hupcl -clocal -cstopb -crtscts -dsrflow
    //
    // -dtrflow -mdmbuf
    //
    // cchars: discard = ^O; dsusp = ^Y; eof = ^D; eol = <undef;>
    //
    // eol2 = <undef; erase = ^H; intr = ^C; kill = ^U; lnext = ^V;>
    //
    // min = 1; quit = ^\; reprint = ^R; start = ^Q; status = <undef;>
    //
    // stop = ^S; susp = ^Z; time = 0; werase = ^W;
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _19 () {
    // <PLEAC>

    // ^^PLEAC^^_16.19
    // -----------------------------
    // TODO perl -> $SIG{CHLD} = 'IGNORE';
    // -----------------------------
    // TODO perl -> use POSIX ":sys_wait_h";
    // TODO perl ->
    // TODO perl -> $SIG{CHLD} = \&REAPER;
    // TODO perl -> sub REAPER {
    // TODO perl -> my $stiff;
    // TODO perl -> while (($stiff = waitpid(-1, &WNOHANG)) > 0) {
    // TODO perl -> # do something with $stiff if you want
    // TODO perl -> }
    // TODO perl -> $SIG{CHLD} = \&REAPER; # install *after* calling waitpid
    // TODO perl -> }
    // -----------------------------
    // TODO perl -> $exit_value = $? >> 8;
    // TODO perl -> $signal_num = $? & 127;
    // TODO perl -> $dumped_core = $? & 128;
    // -----------------------------
    // TODO perl -> use POSIX qw(:signal_h :errno_h :sys_wait_h);
    // TODO perl ->
    // TODO perl -> $SIG{CHLD} = \&REAPER;
    // TODO perl -> sub REAPER {
    // TODO perl -> my $pid;
    // TODO perl ->
    // TODO perl -> $pid = waitpid(-1, &WNOHANG);
    // TODO perl ->
    // TODO perl -> if ($pid == -1) {
    // TODO perl -> # no child waiting. Ignore it.
    // TODO perl -> } elsif (WIFEXITED($?)) {
    // TODO perl -> print "Process $pid exited.\n";
    // TODO perl -> } else {
    // TODO perl -> print "False alarm on $pid.\n";
    // TODO perl -> }
    // TODO perl -> $SIG{CHLD} = \&REAPER; # in case of unreliable signals
    // TODO perl -> }
    // -----------------------------
    // TODO perl -> use Config;
    // TODO perl -> $has_nonblocking = $Config{d_waitpid} eq "define" ||
    // TODO perl -> $Config{d_wait4} eq "define";
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _20 () {
    // <PLEAC>

    // ^^PLEAC^^_16.20
    // -----------------------------
    // TODO perl -> use POSIX qw(:signal_h);
    // TODO perl ->
    // TODO perl -> $sigset = POSIX::SigSet->new(SIGINT); # define the signals to block
    // TODO perl -> $old_sigset = POSIX::SigSet->new; # where the old sigmask will be kept
    // TODO perl ->
    // TODO perl -> unless (defined sigprocmask(SIG_BLOCK, $sigset, $old_sigset)) {
    // TODO perl -> die "Could not block SIGINT\n";
    // TODO perl -> }
    // -----------------------------
    // TODO perl -> unless (defined sigprocmask(SIG_UNBLOCK, $old_sigset)) {
    // TODO perl -> die "Could not unblock SIGINT\n";
    // TODO perl -> }
    // -----------------------------
    // TODO perl -> use POSIX qw(:signal_h);
    // TODO perl ->
    // TODO perl -> $sigset = POSIX::SigSet->new( SIGINT, SIGKILL );
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _21 () {
    // <PLEAC>

    // ^^PLEAC^^_16.21
    // -----------------------------
    // TODO perl -> $SIG{ALRM} = sub { die "timeout" };
    // TODO perl ->
    // TODO perl -> eval {
    // TODO perl -> alarm(3600);
    // TODO perl -> # long-time operations here
    // TODO perl -> alarm(0);
    // TODO perl -> };
    // TODO perl ->
    // TODO perl -> if ($@) {
    // TODO perl -> if ($@ =~ /timeout/) {
    // TODO perl -> # timed out; do what you will here
    // TODO perl -> } else {
    // TODO perl -> alarm(0); # clear the still-pending alarm
    // TODO perl -> die; # propagate unexpected exception
    // TODO perl -> }
    // TODO perl -> }
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _22 () {
    // <PLEAC>

    // ^^PLEAC^^_16.22
    // -----------------------------
    // Make is like Pascal: everybody likes it, so they go in and change it.
    // --Dennis Ritchie
    // %%
    // I eschew embedded capital letters in names; to my prose-oriented eyes,
    // they are too awkward to read comfortably. They jangle like bad typography.
    // --Rob Pike
    // %%
    // God made the integers; all else is the work of Man.
    // --Kronecker
    // %%
    // I'd rather have :rofix than const. --Dennis Ritchie
    // %%
    // If you want to program in C, program in C. It's a nice language.
    // I use it occasionally... :-) --Larry Wall
    // %%
    // Twisted cleverness is my only skill as a programmer.
    // --Elizabeth Zwicky
    // %%
    // Basically, avoid comments. If your code needs a comment to be understood,
    // it would be better to rewrite it so it's easier to understand.
    // --Rob Pike
    // %%
    // Comments on data are usually much more helpful than on algorithms.
    // --Rob Pike
    // %%
    // Programs that write programs are the happiest programs in the world.
    // --Andrew Hume
    // %%
    // -----------------------------
    // ^^INCLUDE^^ include/perl/ch16/sigrand
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }
}
