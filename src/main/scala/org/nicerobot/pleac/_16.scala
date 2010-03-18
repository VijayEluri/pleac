package org.nicerobot.pleac;

/**
 * @author nicerobot
 * 
 */

// ^^PLEAC^^_16.1
//-----------------------------
// TODO $output = `program args`;   # collect output into one multiline string
// TODO @output = `program args`;   # collect output into array, one line per element
//-----------------------------
// TODO open(README, "program args |") or die "Can't run program: $!\n";
// TODO while(<README>) {
// TODO     $output .= $_;
// TODO }
// TODO close(README);
//-----------------------------
// TODO `fsck -y /dev/rsd1a`;       # BAD AND SCARY
//-----------------------------
// TODO use POSIX qw(:sys_wait_h);

// TODO pipe(README, WRITEME);
// TODO if ($pid = fork) {
// TODO     # parent
// TODO     $SIG{CHLD} = sub { 1 while ( waitpid(-1, WNOHANG)) > 0 };
// TODO     close(WRITEME);
// TODO } else {
// TODO     die "cannot fork: $!" unless defined $pid;
// TODO     # child
// TODO     open(STDOUT, ">&=WRITEME")      or die "Couldn't redirect STDOUT: $!";
// TODO     close(README);
// TODO     exec($program, $arg1, $arg2)    or die "Couldn't run $program : $!\n";
// TODO }

// TODO while (<README>) {
// TODO     $string .= $_;
// TODO     # or  push(@strings, $_);
// TODO }
// TODO close(README);
//-----------------------------

// ^^PLEAC^^_16.2
//-----------------------------
// TODO $status = system("vi $myfile");
//-----------------------------
// TODO $status = system("vi", $myfile);
//-----------------------------
// TODO system("cmd1 args | cmd2 | cmd3 >outfile");
// TODO system("cmd args <infile >outfile 2>errfile");
//-----------------------------
// TODO $status = system($program, $arg1, $arg);
// TODO die "$program exited funny: $?" unless $status == 0;
//-----------------------------
// TODO if (($signo = system(@arglist)) &= 127) { 
// TODO     die "program killed by signal $signo\n";
// TODO }
//-----------------------------
// TODO if ($pid = fork) {
// TODO     # parent catches INT and berates user
// TODO     local $SIG{INT} = sub { print "Tsk tsk, no process interruptus\n" };
// TODO     waitpid($pid, 0);
// TODO } else {
// TODO     die "cannot fork: $!" unless defined $pid;
// TODO     # child ignores INT and does its thing
// TODO     $SIG{INT} = "IGNORE";
// TODO     exec("summarize", "/etc/logfiles")             or die "Can't exec: $!\n";
// TODO }
//-----------------------------
// TODO $shell = '/bin/tcsh';
// TODO system $shell '-csh';           # pretend it's a login shell
//-----------------------------
// TODO system {'/bin/tcsh'} '-csh';    # pretend it's a login shell
//-----------------------------
// call expn as vrfy
// TODO system {'/home/tchrist/scripts/expn'} 'vrfy', @ADDRESSES;
//-----------------------------
// TODO @args = ( "echo surprise" );

// TODO system @args;               # subject to shell escapes if @args == 1
// TODO system { $args[0] } @args;  # safe even with one-arg list
//-----------------------------

// ^^PLEAC^^_16.3
//-----------------------------
// TODO exec("archive *.data")
// TODO     or die "Couldn't replace myself with archive: $!\n";
//-----------------------------
// TODO exec("archive", "accounting.data")
// TODO     or die "Couldn't replace myself with archive: $!\n";
//-----------------------------
// TODO exec("archive accounting.data")
// TODO     or die "Couldn't replace myself with archive: $!\n";
//-----------------------------

// ^^PLEAC^^_16.4
//-----------------------------
// TODO $pid = open(README, "program arguments |")  or die "Couldn't fork: $!\n";
// TODO while (<README>) {
// TODO     # ...
// TODO }
// TODO close(README)                               or die "Couldn't close: $!\n";
//-----------------------------
// TODO $pid = open(WRITEME, "| program arguments") or die "Couldn't fork: $!\n";
// TODO print WRITEME "data\n";
// TODO close(WRITEME)                              or die "Couldn't close: $!\n";
//-----------------------------
// TODO $pid = open(F, "sleep 100000|");    # child goes to sleep
// TODO close(F);                           # and the parent goes to lala land
//-----------------------------
// TODO $pid = open(WRITEME, "| program args");
// TODO print WRITEME "hello\n";            # program will get hello\n on STDIN
// TODO close(WRITEME);                     # program will get EOF on STDIN
//-----------------------------
// TODO $pager = $ENV{PAGER} || '/usr/bin/less';  # XXX: might not exist
// TODO open(STDOUT, "| $pager");
//-----------------------------

// ^^PLEAC^^_16.5
//-----------------------------
// TODO head(100);
// TODO while (<>) {
// TODO     print;
// TODO } 

// TODO sub head {
// TODO     my $lines = shift || 20;
// TODO     return if $pid = open(STDOUT, "|-");
// TODO     die "cannot fork: $!" unless defined $pid;
// TODO     while (<STDIN>) {
// TODO         print;
// TODO         last unless --$lines ;
// TODO     } 
// TODO     exit;
// TODO } 
//-----------------------------
// TODO 1: > Welcome to Linux, version 2.0.33 on a i686

// TODO 2: > 

// TODO 3: >     "The software required `Windows 95 or better', 

// TODO 4: >      so I installed Linux."  
//-----------------------------
// TODO > 1: Welcome to Linux, Kernel version 2.0.33 on a i686

// TODO > 2: 

// TODO > 3:     "The software required `Windows 95 or better', 

// TODO > 4:      so I installed Linux."  
//-----------------------------
// ^^INCLUDE^^ include/perl/ch16/qnumcat
//-----------------------------

// ^^PLEAC^^_16.6
//-----------------------------
// TODO @ARGV = map { /\.(gz|Z)$/ ? "gzip -dc $_ |" : $_  } @ARGV;
// TODO while (<>) {
// TODO     # .......
// TODO } 
//-----------------------------
// TODO @ARGV = map { m#^\w+://# ? "GET $_ |" : $_ } @ARGV;
// TODO while (<>) {
// TODO     # .......
// TODO } 
//-----------------------------
// TODO $pwdinfo = `domainname` =~ /^(\(none\))?$/
// TODO                 ? '< /etc/passwd'
// TODO                 : 'ypcat  passwd |';

// TODO open(PWD, $pwdinfo)                 or die "can't open $pwdinfo: $!";
//-----------------------------
// TODO print "File, please? ";
// TODO chomp($file = <>);
// TODO open (FH, $file)                    or die "can't open $file: $!";
//-----------------------------

// ^^PLEAC^^_16.7
//-----------------------------
// TODO $output = `cmd 2>&1`;                          # with backticks
// or
// TODO $pid = open(PH, "cmd 2>&1 |");                 # with an open pipe
// TODO while (<PH>) { }                               # plus a read
//-----------------------------
// TODO $output = `cmd 2>/dev/null`;                   # with backticks
// or
// TODO $pid = open(PH, "cmd 2>/dev/null |");          # with an open pipe
// TODO while (<PH>) { }                               # plus a read
//-----------------------------
// TODO $output = `cmd 2>&1 1>/dev/null`;              # with backticks
// or
// TODO $pid = open(PH, "cmd 2>&1 1>/dev/null |");     # with an open pipe
// TODO while (<PH>) { }                               # plus a read
//-----------------------------
// TODO $output = `cmd 3>&1 1>&2 2>&3 3>&-`;           # with backticks
// or
// TODO $pid = open(PH, "cmd 3>&1 1>&2 2>&3 3>&-|");   # with an open pipe
// TODO while (<PH>) { }                               # plus a read
//-----------------------------
// TODO system("program args 1>/tmp/program.stdout 2>/tmp/program.stderr");
//-----------------------------
// TODO $output = `cmd 3>&1 1>&2 2>&3 3>&-`;        
//-----------------------------
// TODO $fd3 = $fd1;
// TODO $fd1 = $fd2;
// TODO $fd2 = $fd3;
// TODO $fd3 = undef;
//-----------------------------
// TODO system("prog args 1>tmpfile 2>&1");
// TODO system("prog args 2>&1 1>tmpfile");
//-----------------------------
// system ("prog args 1>tmpfile 2>&1");
// TODO $fd1 = "tmpfile";        # change stdout destination first
// TODO $fd2 = $fd1;             # now point stderr there, too
//-----------------------------
// system("prog args 2>&1 1>tmpfile");
// TODO $fd2 = $fd1;             # stderr same destination as stdout
// TODO $fd1 = "tmpfile";        # but change stdout destination 
//-----------------------------

// ^^PLEAC^^_16.8
//-----------------------------
// TODO use IPC::Open2;

// TODO open2(*README, *WRITEME, $program);
// TODO print WRITEME "here's your input\n";
// TODO $output = <README>;
// TODO close(WRITEME);
// TODO close(README);
//-----------------------------
// TODO open(DOUBLE_HANDLE, "| program args |")     # WRONG
//-----------------------------
// TODO use IPC::Open2;
// TODO use IO::Handle;

// TODO ($reader, $writer) = (IO::Handle->new, IO::Handle->new);
// TODO open2($reader, $writer, $program);
//-----------------------------
// TODO eval {
// TODO     open2($readme, $writeme, @program_and_arguments);
// TODO };
// TODO if ($@) { 
// TODO     if ($@ =~ /^open2/) {
// TODO         warn "open2 failed: $!\n$@\n";
// TODO         return;
// TODO     }
// TODO     die;            # reraise unforeseen exception
// TODO }
//-----------------------------

// ^^PLEAC^^_16.9
//-----------------------------
// TODO @all = `($cmd | sed -e 's/^/stdout: /' ) 2>&1`;
// TODO for (@all) { push @{ s/stdout: // ? \@outlines : \@errlines }, $_ }
// TODO print "STDOUT:\n", @outlines, "\n";
// TODO print "STDERR:\n", @errlines, "\n";
//-----------------------------
// TODO open3(*WRITEHANDLE, *READHANDLE, *ERRHANDLE, "program to run");
//-----------------------------
// TODO use IPC::Open3;
// TODO $pid = open3(*HIS_IN, *HIS_OUT, *HIS_ERR, $cmd);
// TODO close(HIS_IN);  # give end of file to kid, or feed him
// TODO @outlines = <HIS_OUT>;              # read till EOF
// TODO @errlines = <HIS_ERR>;              # XXX: block potential if massive
// TODO print "STDOUT:\n", @outlines, "\n";
// TODO print "STDERR:\n", @errlines, "\n";
//-----------------------------
// ^^INCLUDE^^ include/perl/ch16/cmd3sel
//-----------------------------

// ^^PLEAC^^_16.10
//-----------------------------
// TODO pipe(READER, WRITER);
// TODO if (fork) {
// TODO     # run parent code, either reading or writing, not both
// TODO } else {
// TODO     # run child code, either reading or writing, not both
// TODO }
//-----------------------------
// TODO if ($pid = open(CHILD, "|-")) {
// TODO         # run parent code, writing to child
// TODO } else {
// TODO     die "cannot fork: $!" unless defined $pid;
// TODO     # otherwise run child code here, reading from parent
// TODO }
//-----------------------------
// TODO if ($pid = open(CHILD, "-|")) {
// TODO     # run parent code, reading from child
// TODO } else {
// TODO     die "cannot fork: $!" unless defined $pid;
// TODO     # otherwise run child code here, writing to parent
// TODO }
//-----------------------------
// ^^INCLUDE^^ include/perl/ch16/pipe1
//-----------------------------
// ^^INCLUDE^^ include/perl/ch16/pipe2
//-----------------------------
// ^^INCLUDE^^ include/perl/ch16/pipe3
//-----------------------------
// ^^INCLUDE^^ include/perl/ch16/pipe4
//-----------------------------
// ^^INCLUDE^^ include/perl/ch16/pipe5
//-----------------------------
// ^^INCLUDE^^ include/perl/ch16/pipe6
//-----------------------------
// TODO socketpair(READER, WRITER, AF_UNIX, SOCK_STREAM, PF_UNSPEC);
// TODO shutdown(READER, 1);        # no more writing for reader
// TODO shutdown(WRITER, 0);        # no more reading for writer
//-----------------------------

// ^^PLEAC^^_16.11
//-----------------------------
//% mkfifo /path/to/named.pipe
//-----------------------------
// TODO open(FIFO, "< /path/to/named.pipe")         or die $!;
// TODO while (<FIFO>) {
// TODO     print "Got: $_";
// TODO }
// TODO close(FIFO);
//-----------------------------
// TODO open(FIFO, "> /path/to/named.pipe")         or die $!;
// TODO print FIFO "Smoke this.\n";
// TODO close(FIFO);
//-----------------------------
//% mkfifo ~/.plan                    # isn't this everywhere yet?
//% mknod  ~/.plan p                  # in case you don't have mkfifo
//-----------------------------
// ^^INCLUDE^^ include/perl/ch16/dateplan
//-----------------------------
// ^^INCLUDE^^ include/perl/ch16/fifolog
//-----------------------------
// TODO use POSIX qw(:errno_h);

// TODO $SIG{PIPE} = 'IGNORE';
// ...
// TODO $status = print FIFO "Are you there?\n";
// TODO if (!$status && $! == EPIPE) {
// TODO     warn "My reader has forsaken me!\n";
// TODO     next;
// TODO }
//-----------------------------
// TODO use POSIX;
// TODO print _POSIX_PIPE_BUF, "\n";
//-----------------------------

// ^^PLEAC^^_16.12
//-----------------------------
// ^^INCLUDE^^ include/perl/ch16/sharetest
//-----------------------------

// ^^PLEAC^^_16.13
//-----------------------------
//% kill -l
//HUP INT QUIT ILL TRAP ABRT BUS FPE KILL USR1 SEGV USR2 PIPE 
//
//ALRM TERM CHLD CONT STOP TSTP TTIN TTOU URG XCPU XFSZ VTALRM 
//
//PROF WINCH POLL PWR
//-----------------------------
//% perl -e 'print join(" ", keys %SIG), "\n"'
//XCPU ILL QUIT STOP EMT ABRT BUS USR1 XFSZ TSTP INT IOT USR2 INFO TTOU
//
//ALRM KILL HUP URG PIPE CONT SEGV VTALRM PROF TRAP IO TERM WINCH CHLD
//
//FPE TTIN SYS
//-----------------------------
//% perl -MConfig -e 'print $Config{sig_name}'
//ZERO HUP INT QUIT ILL TRAP ABRT EMT FPE KILL BUS SEGV SYS PIPE ALRM
//
//TERM URG STOP TSTP CONT CHLD TTIN TTOU IO XCPU XFSZ VTALRM PROF WINCH
//
//INFO USR1 USR2 IOT
//-----------------------------
// TODO use Config;
// TODO defined $Config{sig_name} or die "No sigs?";
// TODO $i = 0;                     # Config prepends fake 0 signal called "ZERO".
// TODO foreach $name (split(' ', $Config{sig_name})) {
// TODO     $signo{$name} = $i;
// TODO     $signame[$i] = $name;
// TODO     $i++;
// TODO }
//-----------------------------

// ^^PLEAC^^_16.14
//-----------------------------
// TODO kill  9     => $pid;                    # send $pid a signal 9
// TODO kill -1     => $pgrp;                   # send whole job a signal 1
// TODO kill  USR1  => $$;                      # send myself a SIGUSR1
// TODO kill  HUP   => @pids;                   # send a SIGHUP to processes in @pids
//-----------------------------
// TODO use POSIX qw(:errno_h);

// TODO if (kill 0 => $minion) {
// TODO     print "$minion is alive!\n";
// TODO } elsif ($! == EPERM) {             # changed uid
// TODO     print "$minion has escaped my control!\n";
// TODO } elsif ($! == ESRCH) {
// TODO     print "$minion is deceased.\n";  # or zombied
// TODO } else {
// TODO     warn "Odd; I couldn't check on the status of $minion: $!\n";
// TODO }
//-----------------------------

// ^^PLEAC^^_16.15
//-----------------------------
// TODO $SIG{QUIT} = \&got_sig_quit;     # call &got_sig_quit for every SIGQUIT 
// TODO $SIG{PIPE} = 'got_sig_pipe';     # call main::got_sig_pipe for every SIGPIPE 
// TODO $SIG{INT}  = sub { $ouch++ };    # increment $ouch for every SIGINT
//-----------------------------
// TODO $SIG{INT} = 'IGNORE';            # ignore the signal INT
//-----------------------------
// TODO $SIG{STOP} = 'DEFAULT';          # restore default STOP signal handling
//-----------------------------

// ^^PLEAC^^_16.16
//-----------------------------
// the signal handler
// TODO sub ding {
// TODO     $SIG{INT} = \&ding;
// TODO     warn "\aEnter your name!\n";
// TODO }

// prompt for name, overriding SIGINT
// TODO sub get_name {
// TODO     local $SIG{INT} = \&ding;
// TODO     my $name;

// TODO     print "Kindly Stranger, please enter your name: ";
// TODO     chomp( $name = <> );
// TODO     return $name;
// TODO }
//-----------------------------

// ^^PLEAC^^_16.17
//-----------------------------
// TODO $SIG{INT} = \&got_int;
// TODO sub got_int {
// TODO     $SIG{INT} = \&got_int;          # but not for SIGCHLD!
// TODO     # ...
// TODO }
//-----------------------------
// TODO my $interrupted = 0;

// TODO sub got_int {
// TODO     $interrupted = 1;
// TODO     $SIG{INT} = 'DEFAULT';          # or 'IGNORE'
// TODO     die;
// TODO }

// TODO eval {
// TODO     $SIG{INT} = \&got_int;
// TODO     # ... long-running code that you don't want to restart
// TODO };

// TODO if ($interrupted) {
// TODO     # deal with the signal
// TODO }
//-----------------------------
// TODO $SIG{INT} = \&catcher;
// TODO sub catcher {
// TODO     $SIG{INT} = \&catcher;
// TODO     # ...
// TODO }
//-----------------------------
// TODO use Config;
// TODO print "Hurrah!\n" if $Config{d_sigaction};
//-----------------------------
//% egrep 'S[AV]_(RESTART|INTERRUPT)' /usr/include/*/signal.h
//-----------------------------

// ^^PLEAC^^_16.18
//-----------------------------
// TODO $SIG{INT} = 'IGNORE';
//-----------------------------
// TODO $SIG{INT} = \&tsktsk;

// TODO sub tsktsk {
// TODO     $SIG{INT} = \&tsktsk;           # See ``Writing A Signal Handler''
// TODO     warn "\aThe long habit of living indisposeth us for dying.\n";
// TODO }
//-----------------------------
//% stty -a
//speed 9600 baud; 38 rows; 80 columns;
//
//lflags: icanon isig iexten echo echoe -echok echoke -echonl echoctl
//
//  -echoprt -altwerase -noflsh -tostop -flusho pendin -nokerninfo
//
//  -extproc
//
//iflags: -istrip icrnl -inlcr -igncr ixon -ixoff ixany imaxbel -ignbrk
//
//   brkint -inpck -ignpar -parmrk
//
//oflags: opost onlcr oxtabs
//
//cflags: cread cs8 -parenb -parodd hupcl -clocal -cstopb -crtscts -dsrflow
//
//   -dtrflow -mdmbuf
//
//cchars: discard = ^O; dsusp = ^Y; eof = ^D; eol = <undef;>
//
//   eol2 = <undef; erase = ^H; intr = ^C; kill = ^U; lnext = ^V;>
//
//   min = 1; quit = ^\; reprint = ^R; start = ^Q; status = <undef;>
//
//   stop = ^S; susp = ^Z; time = 0; werase = ^W;
//-----------------------------

// ^^PLEAC^^_16.19
//-----------------------------
// TODO $SIG{CHLD} = 'IGNORE';
//-----------------------------
// TODO use POSIX ":sys_wait_h";

// TODO $SIG{CHLD} = \&REAPER;
// TODO sub REAPER {
// TODO     my $stiff;
// TODO     while (($stiff = waitpid(-1, &WNOHANG)) > 0) {
// TODO         # do something with $stiff if you want
// TODO     }
// TODO     $SIG{CHLD} = \&REAPER;                  # install *after* calling waitpid
// TODO }
//-----------------------------
// TODO $exit_value  = $? >> 8;
// TODO $signal_num  = $? & 127;
// TODO $dumped_core = $? & 128;
//-----------------------------
// TODO use POSIX qw(:signal_h :errno_h :sys_wait_h);

// TODO $SIG{CHLD} = \&REAPER;
// TODO sub REAPER {
// TODO     my $pid;

// TODO     $pid = waitpid(-1, &WNOHANG);

// TODO     if ($pid == -1) {
// TODO         # no child waiting.  Ignore it.
// TODO     } elsif (WIFEXITED($?)) {
// TODO         print "Process $pid exited.\n";
// TODO     } else {
// TODO         print "False alarm on $pid.\n";
// TODO     }
// TODO     $SIG{CHLD} = \&REAPER;          # in case of unreliable signals
// TODO }
//-----------------------------
// TODO use Config;
// TODO $has_nonblocking = $Config{d_waitpid} eq "define" ||
// TODO                    $Config{d_wait4}   eq "define";
//-----------------------------

// ^^PLEAC^^_16.20
//-----------------------------
// TODO use POSIX qw(:signal_h);

// TODO $sigset = POSIX::SigSet->new(SIGINT);    # define the signals to block
// TODO $old_sigset = POSIX::SigSet->new;        # where the old sigmask will be kept

// TODO unless (defined sigprocmask(SIG_BLOCK, $sigset, $old_sigset)) {
// TODO     die "Could not block SIGINT\n";
// TODO }
//-----------------------------
// TODO unless (defined sigprocmask(SIG_UNBLOCK, $old_sigset)) {
// TODO     die "Could not unblock SIGINT\n";
// TODO }
//-----------------------------
// TODO use POSIX qw(:signal_h);

// TODO $sigset = POSIX::SigSet->new( SIGINT, SIGKILL );
//-----------------------------

// ^^PLEAC^^_16.21
//-----------------------------
// TODO $SIG{ALRM} = sub { die "timeout" };

// TODO eval {
// TODO     alarm(3600);
// TODO     # long-time operations here
// TODO     alarm(0);
// TODO };

// TODO if ($@) {
// TODO     if ($@ =~ /timeout/) {
// TODO                             # timed out; do what you will here
// TODO     } else {
// TODO         alarm(0);           # clear the still-pending alarm
// TODO         die;                # propagate unexpected exception
// TODO     } 
// TODO } 
//-----------------------------

// ^^PLEAC^^_16.22
//-----------------------------
//Make is like Pascal: everybody likes it, so they go in and change it.
//               --Dennis Ritchie
//%%
//I eschew embedded capital letters in names; to my prose-oriented eyes,
//they are too awkward to read comfortably. They jangle like bad typography.
//               --Rob Pike
//%%
//God made the integers; all else is the work of Man.  
//               --Kronecker
//%%
//I'd rather have :rofix than const.          --Dennis Ritchie
//%%
//If you want to program in C, program in C.  It's a nice language.
//I use it occasionally...   :-)              --Larry Wall
//%%
//Twisted cleverness is my only skill as a programmer.       
//               --Elizabeth Zwicky
//%%
//Basically, avoid comments. If your code needs a comment to be understood,
//it would be better to rewrite it so it's easier to understand.  
//               --Rob Pike
//%%
//Comments on data are usually much more helpful than on algorithms.  
//               --Rob Pike
//%% 
//Programs that write programs are the happiest programs in the world.
//               --Andrew Hume 
//%%
//-----------------------------
// ^^INCLUDE^^ include/perl/ch16/sigrand
//-----------------------------
