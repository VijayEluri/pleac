package org.nicerobot.pleac;

/**
 * @author nicerobot
 * 
 */

// ^^PLEAC^^_12.0
//-----------------------------
// TODO package Alpha;
// TODO $name = "first";

// TODO package Omega;
// TODO $name = "last";

// TODO package main;
// TODO print "Alpha is $Alpha::name, Omega is $Omega::name.\n";
// TODO Alpha is first, Omega is last.
//-----------------------------
// TODO require "FileHandle.pm";            # run-time load
// TODO require FileHandle;                 # ".pm" assumed; same as previous
// TODO use FileHandle;                     # compile-time load

// TODO require "Cards/Poker.pm";           # run-time load
// TODO require Cards::Poker;               # ".pm" assumed; same as previous
// TODO use Cards::Poker;                   # compile-time load
//-----------------------------
// TODO 1    package Cards::Poker;
// TODO 2    use Exporter;
// TODO 3    @ISA = ('Exporter');
// TODO 4    @EXPORT = qw(&shuffle @card_deck);
// TODO 5    @card_deck = ();                       # initialize package global
// TODO 6    sub shuffle { }                        # fill-in definition later
// TODO 7    1;                                     # don't forget this
//-----------------------------

// ^^PLEAC^^_12.1
//-----------------------------
// TODO package YourModule;
// TODO use strict;
// TODO use vars qw(@ISA @EXPORT @EXPORT_OK %EXPORT_TAGS $VERSION);

// TODO use Exporter;
// TODO $VERSION = 1.00;              # Or higher
// TODO @ISA = qw(Exporter);

// TODO @EXPORT      = qw(...);       # Symbols to autoexport (:DEFAULT tag)
// TODO @EXPORT_OK   = qw(...);       # Symbols to export on request
// TODO %EXPORT_TAGS = (              # Define names for sets of symbols
// TODO     TAG1 => [...],
// TODO     TAG2 => [...],
// TODO     ...
// TODO );

//#######################
// your code goes here
//#######################

// TODO 1;                            # this should be your last line
//-----------------------------
// TODO use YourModule;               # Import default symbols into my package.
// TODO use YourModule qw(...);       # Import listed symbols into my package.
// TODO use YourModule ();            # Do not import any symbols
// TODO use YourModule qw(:TAG1);     # Import whole tag set
//-----------------------------
// TODO     @EXPORT = qw(&F1 &F2 @List);
// TODO     @EXPORT = qw( F1  F2 @List);        # same thing
//-----------------------------
// TODO     @EXPORT_OK = qw(Op_Func %Table);
//-----------------------------
// TODO     use YourModule qw(Op_Func %Table F1);
//-----------------------------
// TODO     use YourModule qw(:DEFAULT %Table);
//-----------------------------
// TODO     %EXPORT_TAGS = (
// TODO         Functions => [ qw(F1 F2 Op_Func) ],
// TODO         Variables => [ qw(@List %Table)  ],
// TODO );
//-----------------------------
// TODO     use YourModule qw(:Functions %Table);
//-----------------------------
// TODO     @{
// TODO  
// TODO $YourModule::EXPORT_TAGS{Functions}
// TODO  
// TODO }
// TODO , 
//-----------------------------

// ^^PLEAC^^_12.2
//-----------------------------
// no import
// TODO BEGIN {
// TODO     unless (eval "require $mod") {
// TODO         warn "couldn't load $mod: $@";
// TODO     }
// TODO }

// imports into current package
// TODO BEGIN {
// TODO     unless (eval "use $mod") {
// TODO         warn "couldn't load $mod: $@";
// TODO     }
// TODO }
//-----------------------------
// TODO BEGIN {
// TODO     my($found, @DBs, $mod);
// TODO     $found = 0;
// TODO     @DBs = qw(Giant::Eenie Giant::Meanie Mouse::Mynie Moe);
// TODO     for $mod (@DBs) {
// TODO         if (eval "require $mod") {
// TODO             $mod->
// TODO import
// TODO ();         # if needed
// TODO             $found = 1;
// TODO             last;
// TODO         }
// TODO     }
// TODO     die "None of @DBs loaded" unless $found;
// TODO }
//-----------------------------

// ^^PLEAC^^_12.3
//-----------------------------
// TODO BEGIN {
// TODO     unless (@ARGV == 2 && (2 == grep {/^\d+$/} @ARGV)) {
// TODO         die "usage: $0 num1 num2\n";
// TODO     }
// TODO }
// TODO use Some::Module;
// TODO use More::Modules;
//-----------------------------
// TODO if ($opt_b) {
// TODO     require Math::BigInt;
// TODO }
//-----------------------------
// TODO use Fcntl qw(O_EXCL O_CREAT O_RDWR);
//-----------------------------
// TODO require Fcntl;
// TODO Fcntl->import(qw(O_EXCL O_CREAT O_RDWR));
//-----------------------------
// TODO sub load_module {
// TODO     require $_[0];  #WRONG
// TODO     import  $_[0];  #WRONG
// TODO }
//-----------------------------
// TODO load_module('Fcntl', qw(O_EXCL O_CREAT O_RDWR));

// TODO sub load_module {
// TODO     eval "require $_[0]";
// TODO     die if $@;
// TODO     $_[0]->import(@_[1 .. $#_]);
// TODO }
//-----------------------------
// TODO use autouse Fcntl => qw( O_EXCL() O_CREAT() O_RDWR() );
//-----------------------------

// ^^PLEAC^^_12.4
//-----------------------------
// TODO package Alpha;
// TODO my $aa = 10;
// TODO    $x = "azure";

// TODO package Beta;
// TODO my $bb = 20;
// TODO    $x = "blue";

// TODO package main;
// TODO print "$aa, $bb, $x, $Alpha::x, $Beta::x\n";
// TODO 10, 20, , azure, blue
//-----------------------------
// Flipper.pm
// TODO package Flipper;
// TODO use strict;

// TODO require Exporter;
// TODO use vars qw(@ISA @EXPORT $VERSION);
// TODO @ISA     = qw(Exporter);
// TODO @EXPORT  = qw(flip_words flip_boundary);
// TODO $VERSION = 1.0;

// TODO my $Separatrix = ' ';  # default to blank; must precede functions

// TODO sub flip_boundary {
// TODO     my $prev_sep = $Separatrix;
// TODO     if (@_) { $Separatrix = $_[0] }
// TODO     return $prev_sep;
// TODO }
// TODO sub flip_words {
// TODO     my $line  = $_[0];
// TODO     my @words = split($Separatrix, $line);
// TODO     return join($Separatrix, reverse @words);
// TODO }
// TODO 1;
//-----------------------------

// ^^PLEAC^^_12.5
//-----------------------------
// TODO $this_pack = __PACKAGE__;
//-----------------------------
// TODO $that_pack = caller();
//-----------------------------
// TODO print "I am in package __PACKAGE__\n";              # WRONG!
// TODO I am in package __PACKAGE__
//-----------------------------
// TODO package Alpha;
// TODO runit('$line = <TEMP>');

// TODO package Beta;
// TODO sub runit {
// TODO     my $codestr = shift;
// TODO     eval $codestr;
// TODO     die if $@;
// TODO }
//-----------------------------
// TODO package Beta;
// TODO sub runit {
// TODO     my $codestr = shift;
// TODO     my $hispack = caller;
// TODO     eval "package $hispack; $codestr";
// TODO     die if $@;
// TODO }
//-----------------------------
// TODO package Alpha;
// TODO runit( sub { $line = <TEMP> } );

// TODO package Beta;
// TODO sub runit {
// TODO     my $coderef = shift;
// TODO     &$coderef();
// TODO }
//-----------------------------
// TODO open (FH, "< /etc/termcap")
// TODO     or die "can't open /etc/termcap: $!";
// TODO ($a, $b, $c) = nreadline(3, 'FH');

// TODO use Symbol ();
// TODO use Carp;
// TODO sub nreadline {
// TODO     my ($count, $handle) = @_;
// TODO     my(@retlist,$line);

// TODO     croak "count must be > 0" unless $count > 0;
// TODO     $handle = Symbol::qualify($handle, (
// TODO caller()
// TODO )[0]);
// TODO     croak "need open filehandle" unless defined fileno($handle);

// TODO     push(@retlist, $line) while defined($line = <$handle>) && $count--;
// TODO     return @retlist;
// TODO }
//-----------------------------

// ^^PLEAC^^_12.6
//-----------------------------
// TODO $Logfile = "/tmp/mylog" unless defined $Logfile;
// TODO open(LF, ">>$Logfile")
// TODO     or die "can't append to $Logfile: $!";
// TODO select(((select(LF), $|=1))[0]);  # unbuffer LF
// TODO logmsg("startup");

// TODO sub logmsg {
// TODO     my $now = scalar gmtime;
// TODO     print LF "$0 $$ $now: @_\n"
// TODO         or die "write to $Logfile failed: $!";
// TODO }

// TODO END {
// TODO     logmsg("shutdown");
// TODO     close(LF)                     
// TODO         or die "close $Logfile failed: $!";
// TODO }
//-----------------------------
// TODO use sigtrap qw(die normal-signals error-signals);
//-----------------------------

// ^^PLEAC^^_12.7
//-----------------------------
//% perl -e 'for (@INC) { printf "%d %s\n", $i++, $_ }'
//0 /usr/local/perl/lib/i686-linux/5.004
//
//1 /usr/local/perl/lib
//
//2 /usr/local/perl/lib/site_perl/i686-linux
//
//3 /usr/local/perl/lib/site_perl
//
//4 .
//-----------------------------
// syntax for sh, bash, ksh, or zsh
//$ export PERL5LIB=$HOME/perllib

// syntax for csh or tcsh
//% setenv PERL5LIB ~/perllib
//-----------------------------
// TODO use lib "/projects/spectre/lib";
//-----------------------------
// TODO use FindBin;
// TODO use lib $FindBin::Bin;
//-----------------------------
// TODO use FindBin qw($Bin);
// TODO use lib "$Bin/../lib";
//-----------------------------

// ^^PLEAC^^_12.8
//-----------------------------
//% h2xs -XA -n Planets
//% h2xs -XA -n Astronomy::Orbits
//-----------------------------
// TODO package Astronomy::Orbits;
//-----------------------------
// TODO require Exporter;
// TODO require AutoLoader;
// TODO @ISA = qw(Exporter AutoLoader);
//-----------------------------
// TODO require Exporter;
// TODO require DynaLoader;
// TODO @ISA = qw(Exporter DynaLoader);
//-----------------------------
//% make dist
//-----------------------------

// ^^PLEAC^^_12.9
//-----------------------------
// TODO require Exporter;
// TODO require SelfLoader;
// TODO @ISA = qw(Exporter SelfLoader);
//
// other initialization or declarations here
//
//__DATA__
//sub abc { .... }
//sub def { .... }
//-----------------------------

// ^^PLEAC^^_12.10
//-----------------------------
//% h2xs -Xn Sample
//% cd Sample
//% perl Makefile.PL LIB=~/perllib
//% (edit Sample.pm)
//% make install
//-----------------------------

// ^^PLEAC^^_12.11
//-----------------------------
// TODO package FineTime;
// TODO use strict;
// TODO require Exporter;
// TODO use vars qw(@ISA @EXPORT_OK);
// TODO @ISA = qw(Exporter);
// TODO @EXPORT_OK = qw(time);

// TODO sub time() { ..... }  # TBA
//-----------------------------
// TODO use FineTime qw(time);
// TODO $start = time();
// TODO 1 while print time() - $start, "\n";
//-----------------------------

// ^^PLEAC^^_12.12
//-----------------------------
// TODO sub even_only {
// TODO     my $n = shift;
// TODO     die "$n is not even" if $n & 1;  # one way to test
// TODO     #....
// TODO }
//-----------------------------
// TODO use Carp;
// TODO sub even_only {
// TODO     my $n = shift;
// TODO     croak "$n is not even" if $n % 2;  # here's another
// TODO     #....
// TODO }
//-----------------------------
// TODO use Carp;
// TODO sub even_only {
// TODO     my $n = shift;
// TODO     if ($n & 1) {         # test whether odd number
// TODO         carp "$n is not even, continuing";
// TODO         ++$n;
// TODO     }
// TODO     #....
// TODO }
//-----------------------------
// TODO carp "$n is not even, continuing" if $^W;
//-----------------------------

// ^^PLEAC^^_12.13
//-----------------------------
// TODO {
// TODO     no strict 'refs';
// TODO     $val  = ${ $packname . "::" . $varname };
// TODO     @vals = @{ $packname . "::" . $aryname };
// TODO     &{ $packname . "::" . $funcname }("args");
// TODO     ($packname . "::" . $funcname) -> ("args");
// TODO }
//-----------------------------
// TODO eval "package $packname; \$'$val = \$$varname"; # set $main'val
// TODO die if $@;
//-----------------------------
// TODO printf "log2  of 100 is %.2f\n", log2(100);
// TODO printf "log10 of 100 is %.2f\n", log10(100);
//-----------------------------
// TODO $packname = 'main';
// TODO for ($i = 2; $i < 1000; $i++) {
// TODO     $logN = log($i);
// TODO     eval "sub ${packname}::log$i { log(shift) / $logN }";
// TODO     die if $@;
// TODO }
//-----------------------------
// TODO $packname = 'main';
// TODO for ($i = 2; $i < 1000; $i++) {
// TODO     my $logN = log($i);
// TODO     no strict 'refs';
// TODO     *{"${packname}::log$i"} = sub { log(shift) / $logN };
// TODO }
//-----------------------------
// TODO *blue       = \&Colors::blue;
// TODO *main::blue = \&Colors::azure;
//-----------------------------

// ^^PLEAC^^_12.14
//-----------------------------
//Can't locate sys/syscall.ph in @INC (did you run h2ph?)
//
//(@INC contains: /usr/lib/perl5/i686-linux/5.00404 /usr/lib/perl5
//
///usr/lib/perl5/site_perl/i686-linux /usr/lib/perl5/site_perl .)
//
//at some_program line 7.
//-----------------------------
//% cd /usr/include; h2ph sys/syscall.h
//-----------------------------
//% cd /usr/include; h2ph *.h */*.h
//-----------------------------
//% cd /usr/include; find . -name '*.h' -print | xargs h2ph
//-----------------------------
// file FineTime.pm
// TODO package main;
// TODO require 'sys/syscall.ph';
// TODO die "No SYS_gettimeofday in sys/syscall.ph"
// TODO     unless defined &SYS_gettimeofday;

// TODO package FineTime;
// TODO     use strict;
// TODO require Exporter;
// TODO use vars qw(@ISA @EXPORT_OK);
// TODO @ISA = qw(Exporter);
// TODO @EXPORT_OK = qw(time);

// TODO sub time() {
// TODO     my $tv = pack("LL", ());  # presize buffer to two longs
// TODO     syscall(&main::SYS_gettimeofday, $tv, undef) >= 0
// TODO         or die "gettimeofday: $!";
// TODO     my($seconds, $microseconds) = unpack("LL", $tv);
// TODO     return $seconds + ($microseconds / 1_000_000);
// TODO }

// TODO 1;
//-----------------------------
// ^^INCLUDE^^ include/perl/ch12/jam
//-----------------------------
//% cat > tio.c <<EOF && cc tio.c && a.out
//#include <sys/ioctl.h>
//main() { printf("%#08x\n", TIOCSTI); }
//EOF
//0x005412
//-----------------------------
// ^^INCLUDE^^ include/perl/ch12/winsz
//-----------------------------

// ^^PLEAC^^_12.15
//-----------------------------
//% perl Makefile.PL
//% make
//-----------------------------
//% h2xs -cn FineTime
//-----------------------------
//% perl Makefile.PL
//-----------------------------
//'LIBS'      => [''],   # e.g., '-lm'
//-----------------------------
//'LIBS'      => ['-L/usr/redhat/lib -lrpm'],
//-----------------------------
//% perl Makefile.PL LIB=~/perllib
//-----------------------------
// TODO package FineTime;
// TODO use strict;
// TODO use vars qw($VERSION @ISA @EXPORT_OK);
// TODO require Exporter;
// TODO require DynaLoader;
// TODO @ISA = qw(Exporter DynaLoader);
// TODO @EXPORT_OK = qw(time);
// TODO $VERSION = '0.01';
// TODO bootstrap FineTime $VERSION;
// TODO 1;
//-----------------------------
//include <unistd.h>
//include <sys/time.h>
//include "EXTERN.h"
//include "perl.h"
//include "XSUB.h"

// TODO MODULE = FineTime           PACKAGE = FineTime

// TODO double
// TODO time()
// TODO     CODE:
// TODO         struct timeval tv;
// TODO         gettimeofday(&tv,0);
// TODO         RETVAL = tv.tv_sec + ((double) tv.tv_usec) / 1000000;
// TODO     OUTPUT:
// TODO         RETVAL
//-----------------------------
//% make install
//mkdir ./blib/lib/auto/FineTime
//cp FineTime.pm ./blib/lib/FineTime.pm
///usr/local/bin/perl -I/usr/lib/perl5/i686-linux/5.00403  -I/usr/lib/perl5
///usr/lib/perl5/ExtUtils/xsubpp -typemap 
//    /usr/lib/perl5/ExtUtils/typemap FineTime.xs
//FineTime.tc && mv FineTime.tc FineTime.ccc -c -Dbool=char -DHAS_BOOL 
//    -O2-DVERSION=\"0.01\" -DXS_VERSION=\"0.01\" -fpic 
//    -I/usr/lib/perl5/i686-linux/5.00403/CORE  
//FineTime.cRunning Mkbootstrap for FineTime ()
//chmod 644 FineTime.bs
//LD_RUN_PATH="" cc -o blib/arch/auto/FineTime/FineTime.so 
//    -shared -L/usr/local/lib FineTime.o
//chmod 755 blib/arch/auto/FineTime/FineTime.so
//cp FineTime.bs ./blib/arch/auto/FineTime/FineTime.bs
//chmod 644 blib/arch/auto/FineTime/FineTime.bs
//Installing /home/tchrist/perllib/i686-linux/./auto/FineTime/FineTime.so
//Installing /home/tchrist/perllib/i686-linux/./auto/FineTime/FineTime.bs
//Installing /home/tchrist/perllib/./FineTime.pm
//Writing /home/tchrist/perllib/i686-linux/auto/FineTime/.packlist
//Appending installation info to /home/tchrist/perllib/i686-linux/perllocal.pod
//-----------------------------
//% perl -I ~/perllib -MFineTime=time -le '1 while print time()' | head
//888177070.090978
//
//888177070.09132
//
//888177070.091389
//
//888177070.091453
//
//888177070.091515
//
//888177070.091577
//
//888177070.091639
//
//888177070.0917
//
//888177070.091763
//
//888177070.091864
//-----------------------------

// ^^PLEAC^^_12.16
//-----------------------------
//=head2 Discussion
//
//If we had a I<.h> file with function prototype declarations, we
//could include that, but since we're writing this one from scratch,
//we'll use the B<-c> flag to omit building code to translate any
//C<#define> symbols. The B<-n> flag says to create a module directory
//named I<FineTime/>, which will have the following files.
//-----------------------------
//=for troff
//.EQ
//log sub n (x) = { {log sub e (x)} over {log sub e (n)} }
//.EN
//-----------------------------
//=for later
//next if 1 .. ?^$?;
//s/^(.)/>$1/;
//s/(.{73})........*/$1<SNIP>/;
//
//=cut back to perl
//-----------------------------
// TODO =begin comment

// TODO if (!open(FILE, $file)) {
// TODO     unless ($opt_q) {  #)
// TODO         warn "$me: $file: $!\n";
// TODO         $Errors++;
// TODO     }
// TODO     next FILE;
// TODO }

// TODO $total = 0;
// TODO $matches = 0;

// TODO =end comment
//-----------------------------

// ^^PLEAC^^_12.17
//-----------------------------
//% gunzip Some-Module-4.54.tar.gz
//% tar xf Some-Module-4.54
//% cd Some-Module-4.54
//% perl Makefile.PL
//% make
//% make test
//% make install
//-----------------------------
//% gunzip MD5-1.7.tar.gz
//% tar xf MD5-1.7.tar
//% cd MD5-1.7
//% perl Makefile.PL 
//Checking if your kit is complete...
//
//Looks good
//
//Writing Makefile for MD5
//
//% make
//mkdir ./blib
//
//mkdir ./blib/lib
//
//cp MD5.pm ./blib/lib/MD5.pm
//
//AutoSplitting MD5 (./blib/lib/auto/MD5)
//
///usr/bin/perl -I/usr/local/lib/perl5/i386 ...
//
//...
//
//cp MD5.bs ./blib/arch/auto/MD5/MD5.bs
//
//chmod 644 ./blib/arch/auto/MD5/MD5.bsmkdir ./blib/man3
//
//Manifying ./blib/man3/MD5.3
//
//% make test
//PERL_DL_NONLAZY=1 /usr/bin/perl -I./blib/arch -I./blib/lib
//
//-I/usr/local/lib/perl5/i386-freebsd/5.00404 -I/usr/local/lib/perl5 test.pl
//
//1..14
//
//ok 1
//
//ok 2
//
//...
//
//ok 13
//
//ok 14
//
//% sudo make install
//Password:
//
//Installing /usr/local/lib/perl5/site_perl/i386-freebsd/./auto/MD5/
//
//    MD5.so
//
//Installing /usr/local/lib/perl5/site_perl/i386-freebsd/./auto/MD5/
//
//    MD5.bs
//
//Installing /usr/local/lib/perl5/site_perl/./auto/MD5/autosplit.ix
//
//Installing /usr/local/lib/perl5/site_perl/./MD5.pm
//
//Installing /usr/local/lib/perl5/man/man3/./MD5.3
//
//Writing /usr/local/lib/perl5/site_perl/i386-freebsd/auto/MD5/.packlist
//
//Appending installation info to /usr/local/lib/perl5/i386-freebsd/
//
//5.00404/perllocal.pod
//-----------------------------
// if you just want the modules installed in your own directory
//% perl Makefile.PL LIB=~/lib
//
// if you have your own a complete distribution
//% perl Makefile.PL PREFIX=~/perl5-private
//-----------------------------

// ^^PLEAC^^_12.18
//-----------------------------
// TODO package Some::Module;  # must live in Some/Module.pm

// TODO use strict;

// TODO require Exporter;
// TODO use vars       qw($VERSION @ISA @EXPORT @EXPORT_OK %EXPORT_TAGS);

// set the version for version checking
// TODO $VERSION     = 0.01;

// TODO @ISA         = qw(Exporter);
// TODO @EXPORT      = qw(&func1 &func2 &func4);
// TODO %EXPORT_TAGS = ( );     # eg: TAG => [ qw!name1 name2! ],

// your exported package globals go here,
// as well as any optionally exported functions
// TODO @EXPORT_OK   = qw($Var1 %Hashit &func3);

// TODO use vars qw($Var1 %Hashit);
// non-exported package globals go here
// TODO use vars      qw(@more $stuff);

// initialize package globals, first exported ones
// TODO $Var1   = '';
// TODO %Hashit = ();

// then the others (which are still accessible as $Some::Module::stuff)
// TODO $stuff  = '';
// TODO @more   = ();

// all file-scoped lexicals must be created before
// the functions below that use them.

// file-private lexicals go here
// TODO my $priv_var    = '';
// TODO my %secret_hash = ();

// here's a file-private function as a closure,
// callable as &$priv_func.
// TODO my $priv_func = sub {
// TODO     # stuff goes here.
// TODO };

// make all your functions, whether exported or not;
// remember to put something interesting in the {} stubs
// TODO sub func1      { .... }    # no prototype
// TODO sub func2()    { .... }    # proto'd void
// TODO sub func3($$)  { .... }    # proto'd to 2 scalars

// this one isn't auto-exported, but could be called!
// TODO sub func4(\%)  { .... }    # proto'd to 1 hash ref

// TODO END { }       # module clean-up code here (global destructor)

// TODO 1;
//-----------------------------

// ^^PLEAC^^_12.19
//-----------------------------
//% pmdesc
//-----------------------------
//FileHandle (2.00) - supply object methods for filehandles
//
//IO::File (1.06021) - supply object methods for filehandles
//
//IO::Select (1.10) - OO interface to the select system call
//
//IO::Socket (1.1603) - Object interface to socket communications
//
//...
//-----------------------------
//% pmdesc -v
//
//<<<Modules from /usr/lib/perl5/i686-linux/5.00404>>>
//
//
//FileHandle (2.00) - supply object methods for filehandles
//
//    ...
//-----------------------------
// ^^INCLUDE^^ include/perl/ch12/pmdesc
//-----------------------------
