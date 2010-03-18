package org.nicerobot.pleac;

/**
 * @author nicerobot
 * 
 */
public class _12 {

  public static void _00 () {
    // <PLEAC>

    // ^^PLEAC^^_12.0
    // -----------------------------
    // TODO perl -> package Alpha;
    // TODO perl -> $name = "first";
    // TODO perl ->
    // TODO perl -> package Omega;
    // TODO perl -> $name = "last";
    // TODO perl ->
    // TODO perl -> package main;
    // TODO perl -> print "Alpha is $Alpha::name, Omega is $Omega::name.\n";
    // TODO perl -> Alpha is first, Omega is last.
    // -----------------------------
    // TODO perl -> require "FileHandle.pm"; # run-time load
    // TODO perl -> require FileHandle; # ".pm" assumed; same as previous
    // TODO perl -> use FileHandle; # compile-time load
    // TODO perl ->
    // TODO perl -> require "Cards/Poker.pm"; # run-time load
    // TODO perl -> require Cards::Poker; # ".pm" assumed; same as previous
    // TODO perl -> use Cards::Poker; # compile-time load
    // -----------------------------
    // TODO perl -> 1 package Cards::Poker;
    // TODO perl -> 2 use Exporter;
    // TODO perl -> 3 @ISA = ('Exporter');
    // TODO perl -> 4 @EXPORT = qw(&shuffle @card_deck);
    // TODO perl -> 5 @card_deck = (); # initialize package global
    // TODO perl -> 6 sub shuffle { } # fill-in definition later
    // TODO perl -> 7 1; # don't forget this
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _01 () {
    // <PLEAC>

    // ^^PLEAC^^_12.1
    // -----------------------------
    // TODO perl -> package YourModule;
    // TODO perl -> use strict;
    // TODO perl -> use vars qw(@ISA @EXPORT @EXPORT_OK %EXPORT_TAGS $VERSION);
    // TODO perl ->
    // TODO perl -> use Exporter;
    // TODO perl -> $VERSION = 1.00; # Or higher
    // TODO perl -> @ISA = qw(Exporter);
    // TODO perl ->
    // TODO perl -> @EXPORT = qw(...); # Symbols to autoexport (:DEFAULT tag)
    // TODO perl -> @EXPORT_OK = qw(...); # Symbols to export on request
    // TODO perl -> %EXPORT_TAGS = ( # Define names for sets of symbols
    // TODO perl -> TAG1 => [...],
    // TODO perl -> TAG2 => [...],
    // TODO perl -> ...
    // TODO perl -> );
    // TODO perl ->
    // #######################
    // your code goes here
    // #######################
    // TODO perl ->
    // TODO perl -> 1; # this should be your last line
    // -----------------------------
    // TODO perl -> use YourModule; # Import default symbols into my package.
    // TODO perl -> use YourModule qw(...); # Import listed symbols into my package.
    // TODO perl -> use YourModule (); # Do not import any symbols
    // TODO perl -> use YourModule qw(:TAG1); # Import whole tag set
    // -----------------------------
    // TODO perl -> @EXPORT = qw(&F1 &F2 @List);
    // TODO perl -> @EXPORT = qw( F1 F2 @List); # same thing
    // -----------------------------
    // TODO perl -> @EXPORT_OK = qw(Op_Func %Table);
    // -----------------------------
    // TODO perl -> use YourModule qw(Op_Func %Table F1);
    // -----------------------------
    // TODO perl -> use YourModule qw(:DEFAULT %Table);
    // -----------------------------
    // TODO perl -> %EXPORT_TAGS = (
    // TODO perl -> Functions => [ qw(F1 F2 Op_Func) ],
    // TODO perl -> Variables => [ qw(@List %Table) ],
    // TODO perl -> );
    // -----------------------------
    // TODO perl -> use YourModule qw(:Functions %Table);
    // -----------------------------
    // TODO perl -> @{
    // TODO perl ->
    // TODO perl -> $YourModule::EXPORT_TAGS{Functions}
    // TODO perl ->
    // TODO perl -> }
    // TODO perl -> ,
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _02 () {
    // <PLEAC>

    // ^^PLEAC^^_12.2
    // -----------------------------
    // no import
    // TODO perl -> BEGIN {
    // TODO perl -> unless (eval "require $mod") {
    // TODO perl -> warn "couldn't load $mod: $@";
    // TODO perl -> }
    // TODO perl -> }
    // TODO perl ->
    // imports into current package
    // TODO perl -> BEGIN {
    // TODO perl -> unless (eval "use $mod") {
    // TODO perl -> warn "couldn't load $mod: $@";
    // TODO perl -> }
    // TODO perl -> }
    // -----------------------------
    // TODO perl -> BEGIN {
    // TODO perl -> my($found, @DBs, $mod);
    // TODO perl -> $found = 0;
    // TODO perl -> @DBs = qw(Giant::Eenie Giant::Meanie Mouse::Mynie Moe);
    // TODO perl -> for $mod (@DBs) {
    // TODO perl -> if (eval "require $mod") {
    // TODO perl -> $mod->
    // TODO perl -> import
    // TODO perl -> (); # if needed
    // TODO perl -> $found = 1;
    // TODO perl -> last;
    // TODO perl -> }
    // TODO perl -> }
    // TODO perl -> die "None of @DBs loaded" unless $found;
    // TODO perl -> }
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _03 () {
    // <PLEAC>

    // ^^PLEAC^^_12.3
    // -----------------------------
    // TODO perl -> BEGIN {
    // TODO perl -> unless (@ARGV == 2 && (2 == grep {/^\d+$/} @ARGV)) {
    // TODO perl -> die "usage: $0 num1 num2\n";
    // TODO perl -> }
    // TODO perl -> }
    // TODO perl -> use Some::Module;
    // TODO perl -> use More::Modules;
    // -----------------------------
    // TODO perl -> if ($opt_b) {
    // TODO perl -> require Math::BigInt;
    // TODO perl -> }
    // -----------------------------
    // TODO perl -> use Fcntl qw(O_EXCL O_CREAT O_RDWR);
    // -----------------------------
    // TODO perl -> require Fcntl;
    // TODO perl -> Fcntl->import(qw(O_EXCL O_CREAT O_RDWR));
    // -----------------------------
    // TODO perl -> sub load_module {
    // TODO perl -> require $_[0]; #WRONG
    // TODO perl -> import $_[0]; #WRONG
    // TODO perl -> }
    // -----------------------------
    // TODO perl -> load_module('Fcntl', qw(O_EXCL O_CREAT O_RDWR));
    // TODO perl ->
    // TODO perl -> sub load_module {
    // TODO perl -> eval "require $_[0]";
    // TODO perl -> die if $@;
    // TODO perl -> $_[0]->import(@_[1 .. $#_]);
    // TODO perl -> }
    // -----------------------------
    // TODO perl -> use autouse Fcntl => qw( O_EXCL() O_CREAT() O_RDWR() );
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _04 () {
    // <PLEAC>

    // ^^PLEAC^^_12.4
    // -----------------------------
    // TODO perl -> package Alpha;
    // TODO perl -> my $aa = 10;
    // TODO perl -> $x = "azure";
    // TODO perl ->
    // TODO perl -> package Beta;
    // TODO perl -> my $bb = 20;
    // TODO perl -> $x = "blue";
    // TODO perl ->
    // TODO perl -> package main;
    // TODO perl -> print "$aa, $bb, $x, $Alpha::x, $Beta::x\n";
    // TODO perl -> 10, 20, , azure, blue
    // -----------------------------
    // Flipper.pm
    // TODO perl -> package Flipper;
    // TODO perl -> use strict;
    // TODO perl ->
    // TODO perl -> require Exporter;
    // TODO perl -> use vars qw(@ISA @EXPORT $VERSION);
    // TODO perl -> @ISA = qw(Exporter);
    // TODO perl -> @EXPORT = qw(flip_words flip_boundary);
    // TODO perl -> $VERSION = 1.0;
    // TODO perl ->
    // TODO perl -> my $Separatrix = ' '; # default to blank; must precede functions
    // TODO perl ->
    // TODO perl -> sub flip_boundary {
    // TODO perl -> my $prev_sep = $Separatrix;
    // TODO perl -> if (@_) { $Separatrix = $_[0] }
    // TODO perl -> return $prev_sep;
    // TODO perl -> }
    // TODO perl -> sub flip_words {
    // TODO perl -> my $line = $_[0];
    // TODO perl -> my @words = split($Separatrix, $line);
    // TODO perl -> return join($Separatrix, reverse @words);
    // TODO perl -> }
    // TODO perl -> 1;
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _05 () {
    // <PLEAC>

    // ^^PLEAC^^_12.5
    // -----------------------------
    // TODO perl -> $this_pack = __PACKAGE__;
    // -----------------------------
    // TODO perl -> $that_pack = caller();
    // -----------------------------
    // TODO perl -> print "I am in package __PACKAGE__\n"; # WRONG!
    // TODO perl -> I am in package __PACKAGE__
    // -----------------------------
    // TODO perl -> package Alpha;
    // TODO perl -> runit('$line = <TEMP>');
    // TODO perl ->
    // TODO perl -> package Beta;
    // TODO perl -> sub runit {
    // TODO perl -> my $codestr = shift;
    // TODO perl -> eval $codestr;
    // TODO perl -> die if $@;
    // TODO perl -> }
    // -----------------------------
    // TODO perl -> package Beta;
    // TODO perl -> sub runit {
    // TODO perl -> my $codestr = shift;
    // TODO perl -> my $hispack = caller;
    // TODO perl -> eval "package $hispack; $codestr";
    // TODO perl -> die if $@;
    // TODO perl -> }
    // -----------------------------
    // TODO perl -> package Alpha;
    // TODO perl -> runit( sub { $line = <TEMP> } );
    // TODO perl ->
    // TODO perl -> package Beta;
    // TODO perl -> sub runit {
    // TODO perl -> my $coderef = shift;
    // TODO perl -> &$coderef();
    // TODO perl -> }
    // -----------------------------
    // TODO perl -> open (FH, "< /etc/termcap")
    // TODO perl -> or die "can't open /etc/termcap: $!";
    // TODO perl -> ($a, $b, $c) = nreadline(3, 'FH');
    // TODO perl ->
    // TODO perl -> use Symbol ();
    // TODO perl -> use Carp;
    // TODO perl -> sub nreadline {
    // TODO perl -> my ($count, $handle) = @_;
    // TODO perl -> my(@retlist,$line);
    // TODO perl ->
    // TODO perl -> croak "count must be > 0" unless $count > 0;
    // TODO perl -> $handle = Symbol::qualify($handle, (
    // TODO perl -> caller()
    // TODO perl -> )[0]);
    // TODO perl -> croak "need open filehandle" unless defined fileno($handle);
    // TODO perl ->
    // TODO perl -> push(@retlist, $line) while defined($line = <$handle>) && $count--;
    // TODO perl -> return @retlist;
    // TODO perl -> }
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _06 () {
    // <PLEAC>

    // ^^PLEAC^^_12.6
    // -----------------------------
    // TODO perl -> $Logfile = "/tmp/mylog" unless defined $Logfile;
    // TODO perl -> open(LF, ">>$Logfile")
    // TODO perl -> or die "can't append to $Logfile: $!";
    // TODO perl -> select(((select(LF), $|=1))[0]); # unbuffer LF
    // TODO perl -> logmsg("startup");
    // TODO perl ->
    // TODO perl -> sub logmsg {
    // TODO perl -> my $now = scalar gmtime;
    // TODO perl -> print LF "$0 $$ $now: @_\n"
    // TODO perl -> or die "write to $Logfile failed: $!";
    // TODO perl -> }
    // TODO perl ->
    // TODO perl -> END {
    // TODO perl -> logmsg("shutdown");
    // TODO perl -> close(LF)
    // TODO perl -> or die "close $Logfile failed: $!";
    // TODO perl -> }
    // -----------------------------
    // TODO perl -> use sigtrap qw(die normal-signals error-signals);
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _07 () {
    // <PLEAC>

    // ^^PLEAC^^_12.7
    // -----------------------------
    // % perl -e 'for (@INC) { printf "%d %s\n", $i++, $_ }'
    // 0 /usr/local/perl/lib/i686-linux/5.004
    //
    // 1 /usr/local/perl/lib
    //
    // 2 /usr/local/perl/lib/site_perl/i686-linux
    //
    // 3 /usr/local/perl/lib/site_perl
    //
    // 4 .
    // -----------------------------
    // syntax for sh, bash, ksh, or zsh
    // $ export PERL5LIB=$HOME/perllib
    // TODO perl ->
    // syntax for csh or tcsh
    // % setenv PERL5LIB ~/perllib
    // -----------------------------
    // TODO perl -> use lib "/projects/spectre/lib";
    // -----------------------------
    // TODO perl -> use FindBin;
    // TODO perl -> use lib $FindBin::Bin;
    // -----------------------------
    // TODO perl -> use FindBin qw($Bin);
    // TODO perl -> use lib "$Bin/../lib";
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _08 () {
    // <PLEAC>

    // ^^PLEAC^^_12.8
    // -----------------------------
    // % h2xs -XA -n Planets
    // % h2xs -XA -n Astronomy::Orbits
    // -----------------------------
    // TODO perl -> package Astronomy::Orbits;
    // -----------------------------
    // TODO perl -> require Exporter;
    // TODO perl -> require AutoLoader;
    // TODO perl -> @ISA = qw(Exporter AutoLoader);
    // -----------------------------
    // TODO perl -> require Exporter;
    // TODO perl -> require DynaLoader;
    // TODO perl -> @ISA = qw(Exporter DynaLoader);
    // -----------------------------
    // % make dist
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _09 () {
    // <PLEAC>

    // ^^PLEAC^^_12.9
    // -----------------------------
    // TODO perl -> require Exporter;
    // TODO perl -> require SelfLoader;
    // TODO perl -> @ISA = qw(Exporter SelfLoader);
    //
    // other initialization or declarations here
    //
    // __DATA__
    // sub abc { .... }
    // sub def { .... }
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _10 () {
    // <PLEAC>

    // ^^PLEAC^^_12.10
    // -----------------------------
    // % h2xs -Xn Sample
    // % cd Sample
    // % perl Makefile.PL LIB=~/perllib
    // % (edit Sample.pm)
    // % make install
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _11 () {
    // <PLEAC>

    // ^^PLEAC^^_12.11
    // -----------------------------
    // TODO perl -> package FineTime;
    // TODO perl -> use strict;
    // TODO perl -> require Exporter;
    // TODO perl -> use vars qw(@ISA @EXPORT_OK);
    // TODO perl -> @ISA = qw(Exporter);
    // TODO perl -> @EXPORT_OK = qw(time);
    // TODO perl ->
    // TODO perl -> sub time() {
    // TODO perl -> sub time() { ..... } # TBA
    // -----------------------------
    // TODO perl -> use FineTime qw(time);
    // TODO perl -> $start = time();
    // TODO perl -> 1 while print time() - $start, "\n";
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _12 () {
    // <PLEAC>

    // ^^PLEAC^^_12.12
    // -----------------------------
    // TODO perl -> sub even_only {
    // TODO perl -> my $n = shift;
    // TODO perl -> die "$n is not even" if $n & 1; # one way to test
    // TODO perl -> #....
    // TODO perl -> }
    // -----------------------------
    // TODO perl -> use Carp;
    // TODO perl -> sub even_only {
    // TODO perl -> my $n = shift;
    // TODO perl -> croak "$n is not even" if $n % 2; # here's another
    // TODO perl -> #....
    // TODO perl -> }
    // -----------------------------
    // TODO perl -> use Carp;
    // TODO perl -> sub even_only {
    // TODO perl -> my $n = shift;
    // TODO perl -> if ($n & 1) { # test whether odd number
    // TODO perl -> carp "$n is not even, continuing";
    // TODO perl -> ++$n;
    // TODO perl -> }
    // TODO perl -> #....
    // TODO perl -> }
    // -----------------------------
    // TODO perl -> carp "$n is not even, continuing" if $^W;
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _13 () {
    // <PLEAC>

    // ^^PLEAC^^_12.13
    // -----------------------------
    // TODO perl -> {
    // TODO perl -> no strict 'refs';
    // TODO perl -> $val = ${ $packname . "::" . $varname };
    // TODO perl -> @vals = @{ $packname . "::" . $aryname };
    // TODO perl -> &{ $packname . "::" . $funcname }("args");
    // TODO perl -> ($packname . "::" . $funcname) -> ("args");
    // TODO perl -> }
    // -----------------------------
    // TODO perl -> eval "package $packname; \$'$val = \$$varname"; # set $main'val
    // TODO perl -> die if $@;
    // -----------------------------
    // TODO perl -> printf "log2  of 100 is %.2f\n", log2(100);
    // TODO perl -> printf "log10 of 100 is %.2f\n", log10(100);
    // -----------------------------
    // TODO perl -> $packname = 'main';
    // TODO perl -> for ($i = 2; $i < 1000; $i++) {
    // TODO perl -> $logN = log($i);
    // TODO perl -> eval "sub ${packname}::log$i { log(shift) / $logN }";
    // TODO perl -> die if $@;
    // TODO perl -> }
    // -----------------------------
    // TODO perl -> $packname = 'main';
    // TODO perl -> for ($i = 2; $i < 1000; $i++) {
    // TODO perl -> my $logN = log($i);
    // TODO perl -> no strict 'refs';
    // TODO perl -> *{"${packname}::log$i"} = sub { log(shift) / $logN };
    // TODO perl -> }
    // -----------------------------
    // TODO perl -> *blue = \&Colors::blue;
    // TODO perl -> *main::blue = \&Colors::azure;
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _14 () {
    // <PLEAC>

    // ^^PLEAC^^_12.14
    // -----------------------------
    // Can't locate sys/syscall.ph in @INC (did you run h2ph?)
    //
    // (@INC contains: /usr/lib/perl5/i686-linux/5.00404 /usr/lib/perl5
    //
    // /usr/lib/perl5/site_perl/i686-linux /usr/lib/perl5/site_perl .)
    //
    // at some_program line 7.
    // -----------------------------
    // % cd /usr/include; h2ph sys/syscall.h
    // -----------------------------
    // % cd /usr/include; h2ph *.h */*.h
    // -----------------------------
    // % cd /usr/include; find . -name '*.h' -print | xargs h2ph
    // -----------------------------
    // file FineTime.pm
    // TODO perl -> package main;
    // TODO perl -> require 'sys/syscall.ph';
    // TODO perl -> die "No SYS_gettimeofday in sys/syscall.ph"
    // TODO perl -> unless defined &SYS_gettimeofday;
    // TODO perl ->
    // TODO perl -> package FineTime;
    // TODO perl -> use strict;
    // TODO perl -> require Exporter;
    // TODO perl -> use vars qw(@ISA @EXPORT_OK);
    // TODO perl -> @ISA = qw(Exporter);
    // TODO perl -> @EXPORT_OK = qw(time);
    // TODO perl ->
    // TODO perl -> sub time() {
    // <PLEAC>

    // TODO perl -> my $tv = pack("LL", ()); # presize buffer to two longs
    // TODO perl -> syscall(&main::SYS_gettimeofday, $tv, undef) >= 0
    // TODO perl -> or die "gettimeofday: $!";
    // TODO perl -> my($seconds, $microseconds) = unpack("LL", $tv);
    // TODO perl -> return $seconds + ($microseconds / 1_000_000);
    // TODO perl -> }
    // TODO perl ->
    // TODO perl -> 1;
    // -----------------------------
    // ^^INCLUDE^^ include/perl/ch12/jam
    // -----------------------------
    // % cat > tio.c <<EOF && cc tio.c && a.out
    // #include <sys/ioctl.h>
    // main() {
    // main() { printf("%#08x\n", TIOCSTI); }
    // EOF
    // 0x005412
    // -----------------------------
    // ^^INCLUDE^^ include/perl/ch12/winsz
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _15 () {
    // <PLEAC>

    // ^^PLEAC^^_12.15
    // -----------------------------
    // % perl Makefile.PL
    // % make
    // -----------------------------
    // % h2xs -cn FineTime
    // -----------------------------
    // % perl Makefile.PL
    // -----------------------------
    // 'LIBS' => [''], # e.g., '-lm'
    // -----------------------------
    // 'LIBS' => ['-L/usr/redhat/lib -lrpm'],
    // -----------------------------
    // % perl Makefile.PL LIB=~/perllib
    // -----------------------------
    // TODO perl -> package FineTime;
    // TODO perl -> use strict;
    // TODO perl -> use vars qw($VERSION @ISA @EXPORT_OK);
    // TODO perl -> require Exporter;
    // TODO perl -> require DynaLoader;
    // TODO perl -> @ISA = qw(Exporter DynaLoader);
    // TODO perl -> @EXPORT_OK = qw(time);
    // TODO perl -> $VERSION = '0.01';
    // TODO perl -> bootstrap FineTime $VERSION;
    // TODO perl -> 1;
    // -----------------------------
    // include <unistd.h>
    // include <sys/time.h>
    // include "EXTERN.h"
    // include "perl.h"
    // include "XSUB.h"
    // TODO perl ->
    // TODO perl -> MODULE = FineTime PACKAGE = FineTime
    // TODO perl ->
    // TODO perl -> double
    // TODO perl -> time()
    // TODO perl -> CODE:
    // TODO perl -> struct timeval tv;
    // TODO perl -> gettimeofday(&tv,0);
    // TODO perl -> RETVAL = tv.tv_sec + ((double) tv.tv_usec) / 1000000;
    // TODO perl -> OUTPUT:
    // TODO perl -> RETVAL
    // -----------------------------
    // % make install
    // mkdir ./blib/lib/auto/FineTime
    // cp FineTime.pm ./blib/lib/FineTime.pm
    // /usr/local/bin/perl -I/usr/lib/perl5/i686-linux/5.00403 -I/usr/lib/perl5
    // /usr/lib/perl5/ExtUtils/xsubpp -typemap
    // /usr/lib/perl5/ExtUtils/typemap FineTime.xs
    // FineTime.tc && mv FineTime.tc FineTime.ccc -c -Dbool=char -DHAS_BOOL
    // -O2-DVERSION=\"0.01\" -DXS_VERSION=\"0.01\" -fpic
    // -I/usr/lib/perl5/i686-linux/5.00403/CORE
    // FineTime.cRunning Mkbootstrap for FineTime ()
    // chmod 644 FineTime.bs
    // LD_RUN_PATH="" cc -o blib/arch/auto/FineTime/FineTime.so
    // -shared -L/usr/local/lib FineTime.o
    // chmod 755 blib/arch/auto/FineTime/FineTime.so
    // cp FineTime.bs ./blib/arch/auto/FineTime/FineTime.bs
    // chmod 644 blib/arch/auto/FineTime/FineTime.bs
    // Installing /home/tchrist/perllib/i686-linux/./auto/FineTime/FineTime.so
    // Installing /home/tchrist/perllib/i686-linux/./auto/FineTime/FineTime.bs
    // Installing /home/tchrist/perllib/./FineTime.pm
    // Writing /home/tchrist/perllib/i686-linux/auto/FineTime/.packlist
    // Appending installation info to /home/tchrist/perllib/i686-linux/perllocal.pod
    // -----------------------------
    // % perl -I ~/perllib -MFineTime=time -le '1 while print time()' | head
    // 888177070.090978
    //
    // 888177070.09132
    //
    // 888177070.091389
    //
    // 888177070.091453
    //
    // 888177070.091515
    //
    // 888177070.091577
    //
    // 888177070.091639
    //
    // 888177070.0917
    //
    // 888177070.091763
    //
    // 888177070.091864
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _16 () {
    // <PLEAC>

    // ^^PLEAC^^_12.16
    // -----------------------------
    // =head2 Discussion
    //
    // If we had a I<.h> file with function prototype declarations, we
    // could include that, but since we're writing this one from scratch,
    // we'll use the B<-c> flag to omit building code to translate any
    // C<#define> symbols. The B<-n> flag says to create a module directory
    // named I<FineTime/>, which will have the following files.
    // -----------------------------
    // =for troff
    // .EQ
    // log sub n (x) = { {log sub e (x)} over {log sub e (n)} }
    // .EN
    // -----------------------------
    // =for later
    // next if 1 .. ?^$?;
    // s/^(.)/>$1/;
    // s/(.{73})........*/$1<SNIP>/;
    //
    // =cut back to perl
    // -----------------------------
    // TODO perl -> =begin comment
    // TODO perl ->
    // TODO perl -> if (!open(FILE, $file)) {
    // TODO perl -> unless ($opt_q) { #)
    // TODO perl -> warn "$me: $file: $!\n";
    // TODO perl -> $Errors++;
    // TODO perl -> }
    // TODO perl -> next FILE;
    // TODO perl -> }
    // TODO perl ->
    // TODO perl -> $total = 0;
    // TODO perl -> $matches = 0;
    // TODO perl ->
    // TODO perl -> =end comment
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _17 () {
    // <PLEAC>

    // ^^PLEAC^^_12.17
    // -----------------------------
    // % gunzip Some-Module-4.54.tar.gz
    // % tar xf Some-Module-4.54
    // % cd Some-Module-4.54
    // % perl Makefile.PL
    // % make
    // % make test
    // % make install
    // -----------------------------
    // % gunzip MD5-1.7.tar.gz
    // % tar xf MD5-1.7.tar
    // % cd MD5-1.7
    // % perl Makefile.PL
    // Checking if your kit is complete...
    //
    // Looks good
    //
    // Writing Makefile for MD5
    //
    // % make
    // mkdir ./blib
    //
    // mkdir ./blib/lib
    //
    // cp MD5.pm ./blib/lib/MD5.pm
    //
    // AutoSplitting MD5 (./blib/lib/auto/MD5)
    //
    // /usr/bin/perl -I/usr/local/lib/perl5/i386 ...
    //
    // ...
    //
    // cp MD5.bs ./blib/arch/auto/MD5/MD5.bs
    //
    // chmod 644 ./blib/arch/auto/MD5/MD5.bsmkdir ./blib/man3
    //
    // Manifying ./blib/man3/MD5.3
    //
    // % make test
    // PERL_DL_NONLAZY=1 /usr/bin/perl -I./blib/arch -I./blib/lib
    //
    // -I/usr/local/lib/perl5/i386-freebsd/5.00404 -I/usr/local/lib/perl5 test.pl
    //
    // 1..14
    //
    // ok 1
    //
    // ok 2
    //
    // ...
    //
    // ok 13
    //
    // ok 14
    //
    // % sudo make install
    // Password:
    //
    // Installing /usr/local/lib/perl5/site_perl/i386-freebsd/./auto/MD5/
    //
    // MD5.so
    //
    // Installing /usr/local/lib/perl5/site_perl/i386-freebsd/./auto/MD5/
    //
    // MD5.bs
    //
    // Installing /usr/local/lib/perl5/site_perl/./auto/MD5/autosplit.ix
    //
    // Installing /usr/local/lib/perl5/site_perl/./MD5.pm
    //
    // Installing /usr/local/lib/perl5/man/man3/./MD5.3
    //
    // Writing /usr/local/lib/perl5/site_perl/i386-freebsd/auto/MD5/.packlist
    //
    // Appending installation info to /usr/local/lib/perl5/i386-freebsd/
    //
    // 5.00404/perllocal.pod
    // -----------------------------
    // if you just want the modules installed in your own directory
    // % perl Makefile.PL LIB=~/lib
    //
    // if you have your own a complete distribution
    // % perl Makefile.PL PREFIX=~/perl5-private
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _18 () {
    // <PLEAC>

    // TODO perl -> / ^^PLEAC^^_12.18
    // TODO perl -> /-----------------------------
    // TODO perl -> ackage Some::Module; # must live in Some/Module.pm
    // TODO perl -> // TODO perl -> se strict;
    // TODO perl -> // TODO perl -> equire Exporter;
    // TODO perl -> se vars qw($VERSION @ISA @EXPORT @EXPORT_OK %EXPORT_TAGS);
    // TODO perl -> // TODO perl -> / set the version for version checking
    // TODO perl -> VERSION = 0.01;
    // TODO perl -> // TODO perl -> ISA = qw(Exporter);
    // TODO perl -> EXPORT = qw(&func1 &func2 &func4);
    // TODO perl -> EXPORT_TAGS = ( ); # eg: TAG => [ qw!name1 name2! ],
    // TODO perl -> // TODO perl -> / your exported package globals go here,
    // TODO perl -> / as well as any optionally exported functions
    // TODO perl -> EXPORT_OK = qw($Var1 %Hashit &func3);
    // TODO perl -> // TODO perl -> se vars qw($Var1 %Hashit);
    // TODO perl -> / non-exported package globals go here
    // TODO perl -> se vars qw(@more $stuff);
    // TODO perl -> // TODO perl -> / initialize package globals, first exported ones
    // TODO perl -> Var1 = '';
    // TODO perl -> Hashit = ();
    // TODO perl -> // TODO perl -> / then the others (which are still accessible as
    // $Some::Module::stuff)
    // TODO perl -> stuff = '';
    // TODO perl -> more = ();
    // TODO perl -> // TODO perl -> / all file-scoped lexicals must be created before
    // TODO perl -> / the functions below that use them.
    // TODO perl -> // TODO perl -> / file-private lexicals go here
    // TODO perl -> y $priv_var = '';
    // TODO perl -> y %secret_hash = ();
    // TODO perl -> // TODO perl -> / here's a file-private function as a closure,
    // TODO perl -> / callable as &$priv_func.
    // TODO perl -> y $priv_func = sub {
    // TODO perl -> # stuff goes here.
    // TODO perl -> ;
    // TODO perl -> // TODO perl -> / make all your functions, whether exported or not;
    // TODO perl -> / remember to put something interesting in the {} stubs
    // TODO perl -> ub func1 { .... } # no prototype
    // TODO perl -> ub func2() { .... } # proto'd void
    // TODO perl -> ub func3($$) { .... } # proto'd to 2 scalars
    // TODO perl -> // TODO perl -> / this one isn't auto-exported, but could be called!
    // TODO perl -> ub func4(\%) { .... } # proto'd to 1 hash ref
    // TODO perl -> // TODO perl -> ND { } # module clean-up code here (global destructor)
    // TODO perl -> // TODO perl -> ;
    // TODO perl -> /-----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _19 () {
    // <PLEAC>

    // TODO perl -> / ^^PLEAC^^_12.19
    // TODO perl -> /-----------------------------
    // TODO perl -> /% pmdesc
    // TODO perl -> /-----------------------------
    // TODO perl -> /FileHandle (2.00) - supply object methods for filehandles
    // TODO perl -> /
    // TODO perl -> /IO::File (1.06021) - supply object methods for filehandles
    // TODO perl -> /
    // TODO perl -> /IO::Select (1.10) - OO interface to the select system call
    // TODO perl -> /
    // TODO perl -> /IO::Socket (1.1603) - Object interface to socket communications
    // TODO perl -> /
    // TODO perl -> /...
    // TODO perl -> /-----------------------------
    // TODO perl -> /% pmdesc -v
    // TODO perl -> /
    // TODO perl -> /<<<Modules from /usr/lib/perl5/i686-linux/5.00404>>>
    // TODO perl -> /
    // TODO perl -> /
    // TODO perl -> /FileHandle (2.00) - supply object methods for filehandles
    // TODO perl -> /
    // TODO perl -> / ...
    // TODO perl -> /-----------------------------
    // TODO perl -> / ^^INCLUDE^^ include/perl/ch12/pmdesc
    // TODO perl -> /-----------------------------
    // TODO perl ->
    // </PLEAC>
  }
}
