package org.nicerobot.pleac;

/**
 * @author nicerobot
 * 
 */
public class _15 {

  public static void _01 () {
    // <PLEAC>

    // ^^PLEAC^^_15.1
    // -----------------------------
    // TODO perl -> use Getopt::Std;
    // TODO perl ->
    // -v ARG, -D ARG, -o ARG, sets $opt_v, $opt_D, $opt_o
    // TODO perl -> getopt("vDo");
    // -v ARG, -D ARG, -o ARG, sets $args{v}, $args{D}, $args{o}
    // TODO perl -> getopt("vDo", \%args);
    // TODO perl ->
    // TODO perl -> getopts("vDo:"); # -v, -D, -o ARG, sets $opt_v, $opt_D, $opt_o
    // TODO perl -> getopts("vDo:", \%args); # -v, -D, -o ARG, sets $args{v}, $args{D}, $args{o}
    // -----------------------------
    // TODO perl -> use Getopt::Long;
    // TODO perl ->
    // TODO perl -> GetOptions( "verbose" => \$verbose, # --verbose
    // TODO perl -> "Debug" => \$debug, # --Debug
    // TODO perl -> "output=s" => \$output ); # --output=string or --output=string
    // -----------------------------
    // % rm -r -f /tmp/testdir
    // -----------------------------
    // % rm -rf /tmp/testdir
    // -----------------------------
    // TODO perl -> use Getopt::Std;
    // TODO perl -> getopts("o:");
    // TODO perl -> if ($opt_o) {
    // TODO perl -> print "Writing output to $opt_o";
    // TODO perl -> }
    // -----------------------------
    // TODO perl -> use Getopt::Std;
    // TODO perl ->
    // TODO perl -> %option = ();
    // TODO perl -> getopts("Do:", \%option);
    // TODO perl ->
    // TODO perl -> if ($option{D}) {
    // TODO perl -> print "Debugging mode enabled.\n";
    // TODO perl -> }
    // TODO perl ->
    // TODO perl -> # if not set, set output to "-". opening "-" for writing
    // TODO perl -> # means STDOUT
    // TODO perl -> $option{o} = "-" unless defined $option{o};
    // TODO perl ->
    // TODO perl -> print "Writing output to file $option{o}\n" unless $option{o} eq "-";
    // TODO perl -> open(STDOUT, "> $option{o}")
    // TODO perl -> or die "Can't open $option{o} for output: $!\n";
    // -----------------------------
    // % gnutar --extract --file latest.tar
    // -----------------------------
    // % gnutar --extract --file=latest.tar
    // -----------------------------
    // TODO perl -> use Getopt::Long;
    // TODO perl ->
    // TODO perl -> GetOptions( "extract" => \$extract,
    // TODO perl -> "file=s" => \$file );
    // TODO perl ->
    // TODO perl -> if ($extract) {
    // TODO perl -> print "I'm extracting.\n";
    // TODO perl -> }
    // TODO perl ->
    // TODO perl -> die "I wish I had a file" unless defined $file;
    // TODO perl -> print "Working on the file $file\n";
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _02 () {
    // <PLEAC>

    // ^^PLEAC^^_15.2
    // -----------------------------
    // TODO perl -> sub I_am_interactive {
    // TODO perl -> return -t STDIN && -t STDOUT;
    // TODO perl -> }
    // -----------------------------
    // TODO perl -> use POSIX qw/getpgrp tcgetpgrp/;
    // TODO perl ->
    // TODO perl -> sub I_am_interactive {
    // TODO perl -> local *TTY; # local file handle
    // TODO perl -> open(TTY, "/dev/tty") or die "can't open /dev/tty: $!";
    // TODO perl -> my $tpgrp = tcgetpgrp(fileno(TTY));
    // TODO perl -> my $pgrp = getpgrp();
    // TODO perl -> close TTY;
    // TODO perl -> return ($tpgrp == $pgrp);
    // TODO perl -> }
    // -----------------------------
    // TODO perl -> while (1) {
    // TODO perl -> if (I_am_interactive()) {
    // TODO perl -> print "Prompt: ";
    // TODO perl -> }
    // TODO perl -> $line = <STDIN>;
    // TODO perl -> last unless defined $line;
    // TODO perl -> # do something with the line
    // TODO perl -> }
    // -----------------------------
    // TODO perl -> sub prompt { print "Prompt: " if I_am_interactive() }
    // TODO perl -> for (prompt(); $line = <STDIN>; prompt()) {
    // TODO perl -> # do something with the line
    // TODO perl -> }
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _03 () {
    // <PLEAC>

    // ^^PLEAC^^_15.3
    // -----------------------------
    // TODO perl -> use Term::Cap;
    // TODO perl ->
    // TODO perl -> $OSPEED = 9600;
    // TODO perl -> eval {
    // TODO perl -> require POSIX;
    // TODO perl -> my $termios = POSIX::Termios->new();
    // TODO perl -> $termios->getattr;
    // TODO perl -> $OSPEED = $termios->getospeed;
    // TODO perl -> };
    // TODO perl ->
    // TODO perl -> $terminal = Term::Cap->Tgetent({OSPEED=>$OSPEED});
    // TODO perl -> $terminal->Tputs('cl', 1, STDOUT);
    // -----------------------------
    // TODO perl -> system("clear");
    // -----------------------------
    // TODO perl -> $clear = $terminal->Tputs('cl');
    // TODO perl -> $clear = `clear`;
    // -----------------------------
    // TODO perl -> print $clear;
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _04 () {
    // <PLEAC>

    // ^^PLEAC^^_15.4
    // -----------------------------
    // TODO perl -> use Term::ReadKey;
    // TODO perl ->
    // TODO perl -> ($wchar, $hchar, $wpixels, $hpixels) = GetTerminalSize();
    // -----------------------------
    // TODO perl -> use Term::ReadKey;
    // TODO perl ->
    // TODO perl -> ($width) = GetTerminalSize();
    // TODO perl -> die "You must have at least 10 characters" unless $width >= 10;
    // TODO perl ->
    // TODO perl -> $max = 0;
    // TODO perl -> foreach (@values) {
    // TODO perl -> $max = $_ if $max < $_;
    // TODO perl -> }
    // TODO perl ->
    // TODO perl -> $ratio = ($width-10)/$max; # chars per unit
    // TODO perl -> foreach (@values) {
    // TODO perl -> printf("%8.1f %s\n", $_, "*" x ($ratio*$_));
    // TODO perl -> }
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _05 () {
    // <PLEAC>

    // ^^PLEAC^^_15.5
    // -----------------------------
    // TODO perl -> use Term::ANSIColor;
    // TODO perl ->
    // TODO perl -> print color("red"), "Danger, Will Robinson!\n", color("reset");
    // TODO perl -> print "This is just normal text.\n";
    // TODO perl -> print colored("<BLINK>Do you hurt yet?</BLINK>", "blink");
    // -----------------------------
    // TODO perl -> use Term::ANSIColor qw(:constants);
    // TODO perl ->
    // TODO perl -> print RED, "Danger, Will Robinson!\n", RESET;
    // -----------------------------
    // rhyme for the deadly coral snake
    // TODO perl -> print color("red on_black"), "venom lack\n";
    // TODO perl -> print color("red on_yellow"), "kill that fellow\n";
    // TODO perl ->
    // TODO perl -> print color("green on_cyan blink"), "garish!\n";
    // TODO perl -> print color("reset");
    // -----------------------------
    // TODO perl -> print colored("venom lack\n", "red", "on_black");
    // TODO perl -> print colored("kill that fellow\n", "red", "on_yellow");
    // TODO perl ->
    // TODO perl -> print colored("garish!\n", "green", "on_cyan", "blink");
    // -----------------------------
    // TODO perl -> use Term::ANSIColor qw(:constants);
    // TODO perl ->
    // TODO perl -> print BLACK, ON_WHITE, "black on white\n";
    // TODO perl -> print WHITE, ON_BLACK, "white on black\n";
    // TODO perl -> print GREEN, ON_CYAN, BLINK, "garish!\n";
    // TODO perl -> print RESET;
    // -----------------------------
    // TODO perl -> END { print color("reset") }
    // -----------------------------
    // TODO perl -> $Term::ANSIColor::EACHLINE = $/;
    // TODO perl -> print colored(<<EOF, RED, ON_WHITE, BOLD, BLINK);
    // TODO perl -> This way
    // TODO perl -> each line
    // TODO perl -> has its own
    // TODO perl -> attribute set.
    // TODO perl -> EOF
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _06 () {
    // <PLEAC>

    // ^^PLEAC^^_15.6
    // -----------------------------
    // TODO perl -> use Term::ReadKey;
    // TODO perl ->
    // TODO perl -> ReadMode('cbreak');
    // TODO perl -> $key = ReadKey(0);
    // TODO perl -> ReadMode('normal');
    // -----------------------------
    // ^^INCLUDE^^ include/perl/ch15/sascii
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _07 () {
    // <PLEAC>

    // ^^PLEAC^^_15.7
    // -----------------------------
    // TODO perl -> print "\aWake up!\n";
    // -----------------------------
    // TODO perl -> use Term::Cap;
    // TODO perl ->
    // TODO perl -> $OSPEED = 9600;
    // TODO perl -> eval {
    // TODO perl -> require POSIX;
    // TODO perl -> my $termios = POSIX::Termios->new();
    // TODO perl -> $termios->getattr;
    // TODO perl -> $OSPEED = $termios->getospeed;
    // TODO perl -> };
    // TODO perl ->
    // TODO perl -> $terminal = Term::Cap->Tgetent({OSPEED=>$OSPEED});
    // TODO perl -> $vb = "";
    // TODO perl -> eval {
    // TODO perl -> $terminal->Trequire("vb");
    // TODO perl -> $vb = $terminal->Tputs('vb', 1);
    // TODO perl -> };
    // TODO perl ->
    // TODO perl -> print $vb; # ring visual bell
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _08 () {
    // <PLEAC>

    // ^^PLEAC^^_15.8
    // -----------------------------
    // ^^INCLUDE^^ include/perl/ch15/demo
    // -----------------------------
    // HotKey.pm
    // TODO perl -> package HotKey;
    // TODO perl ->
    // TODO perl -> @ISA = qw(Exporter);
    // TODO perl -> @EXPORT = qw(cbreak cooked readkey);
    // TODO perl ->
    // TODO perl -> use strict;
    // TODO perl -> use POSIX qw(:termios_h);
    // TODO perl -> my ($term, $oterm, $echo, $noecho, $fd_stdin);
    // TODO perl ->
    // TODO perl -> $fd_stdin = fileno(STDIN);
    // TODO perl -> $term = POSIX::Termios->new();
    // TODO perl -> $term->getattr($fd_stdin);
    // TODO perl -> $oterm = $term->getlflag();
    // TODO perl ->
    // TODO perl -> $echo = ECHO | ECHOK | ICANON;
    // TODO perl -> $noecho = $oterm & ~$echo;
    // TODO perl ->
    // TODO perl -> sub cbreak {
    // TODO perl -> $term->setlflag($noecho); # ok, so i don't want echo either
    // TODO perl -> $term->setcc(VTIME, 1);
    // TODO perl -> $term->setattr($fd_stdin, TCSANOW);
    // TODO perl -> }
    // TODO perl ->
    // TODO perl -> sub cooked {
    // TODO perl -> $term->setlflag($oterm);
    // TODO perl -> $term->setcc(VTIME, 0);
    // TODO perl -> $term->setattr($fd_stdin, TCSANOW);
    // TODO perl -> }
    // TODO perl ->
    // TODO perl -> sub readkey {
    // TODO perl -> my $key = '';
    // TODO perl -> cbreak();
    // TODO perl -> sysread(STDIN, $key, 1);
    // TODO perl -> cooked();
    // TODO perl -> return $key;
    // TODO perl -> }
    // TODO perl ->
    // TODO perl -> END { cooked() }
    // TODO perl ->
    // TODO perl -> 1;
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _09 () {
    // <PLEAC>

    // ^^PLEAC^^_15.9
    // -----------------------------
    // TODO perl -> use Term::ReadKey;
    // TODO perl ->
    // TODO perl -> ReadMode ('cbreak');
    // TODO perl ->
    // TODO perl -> if (defined ($char = ReadKey(-1)) ) {
    // TODO perl -> # input was waiting and it was $char
    // TODO perl -> } else {
    // TODO perl -> # no input was waiting
    // TODO perl -> }
    // TODO perl ->
    // TODO perl -> ReadMode ('normal'); # restore normal tty settings
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _10 () {
    // <PLEAC>

    // ^^PLEAC^^_15.10
    // -----------------------------
    // TODO perl -> use Term::ReadKey;
    // TODO perl ->
    // TODO perl -> ReadMode('noecho');
    // TODO perl -> $password = ReadLine(0);
    // -----------------------------
    // ^^INCLUDE^^ include/perl/ch15/checkuser
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _11 () {
    // <PLEAC>

    // ^^PLEAC^^_15.11
    // -----------------------------
    // TODO perl -> use Term::ReadLine;
    // TODO perl ->
    // TODO perl -> $term = Term::ReadLine->new("APP DESCRIPTION");
    // TODO perl -> $OUT = $term->OUT || *STDOUT;
    // TODO perl ->
    // TODO perl -> $term->addhistory($fake_line);
    // TODO perl -> $line = $term->readline(PROMPT);
    // TODO perl ->
    // TODO perl -> print $OUT "Any program output\n";
    // -----------------------------
    // ^^INCLUDE^^ include/perl/ch15/vbsh
    // -----------------------------
    // TODO perl -> $term->addhistory($seed_line);
    // -----------------------------
    // TODO perl -> $term->remove_history($line_number);
    // -----------------------------
    // TODO perl -> @history = $term->GetHistory;
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _12 () {
    // <PLEAC>

    // ^^PLEAC^^_15.12
    // -----------------------------
    // % rep ps aux
    // % rep netstat
    // % rep -2.5 lpq
    // -----------------------------
    // ^^INCLUDE^^ include/perl/ch15/rep
    // -----------------------------
    // TODO perl -> keypad(1); # enable keypad mode
    // TODO perl -> $key = getch();
    // TODO perl -> if ($key eq 'k' || # vi mode
    // TODO perl -> $key eq "\cP" || # emacs mode
    // TODO perl -> $key eq KEY_UP) # arrow mode
    // TODO perl -> {
    // TODO perl -> # do something
    // TODO perl -> }
    // -----------------------------
    // Template Entry Demonstration
    //
    // Address Data Example Record # ___
    //
    // Name: [________________________________________________]
    // Addr: [________________________________________________]
    // City: [__________________] State: [__] Zip: [\\\\\]
    //
    // Phone: (\\\) \\\-\\\\ Password: [^^^^^^^^]
    //
    // Enter all information available.
    // Edit fields with left/right arrow keys or "delete".
    // Switch fields with "Tab" or up/down arrow keys.
    // Indicate completion by pressing "Return".
    // Refresh screen with "Control-L".
    // Abort this demo here with "Control-X".
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _13 () {
    // <PLEAC>

    // ^^PLEAC^^_15.13
    // -----------------------------
    // TODO perl -> use Expect;
    // TODO perl ->
    // TODO perl -> $command = Expect->spawn("program to run")
    // TODO perl -> or die "Couldn't start program: $!\n";
    // TODO perl ->
    // prevent the program's output from being shown on our STDOUT
    // TODO perl -> $command->log_stdout(0);
    // TODO perl ->
    // wait 10 seconds for "Password:" to appear
    // TODO perl -> unless ($command->expect(10, "Password")) {
    // TODO perl -> # timed out
    // TODO perl -> }
    // TODO perl ->
    // wait 20 seconds for something that matches /[lL]ogin: ?/
    // TODO perl -> unless ($command->expect(20, -re => '[lL]ogin: ?')) {
    // TODO perl -> # timed out
    // TODO perl -> }
    // TODO perl ->
    // wait forever for "invalid" to appear
    // TODO perl -> unless ($command->expect(undef, "invalid")) {
    // TODO perl -> # error occurred; the program probably went away
    // TODO perl -> }
    // TODO perl ->
    // send "Hello, world" and a carriage return to the program
    // TODO perl -> print $command "Hello, world\r";
    // TODO perl ->
    // if the program will terminate by itself, finish up with
    // TODO perl -> $command->soft_close();
    // TODO perl ->
    // if the program must be explicitly killed, finish up with
    // TODO perl -> $command->hard_close();
    // -----------------------------
    // TODO perl -> $which = $command->expect(30, "invalid", "succes", "error", "boom");
    // TODO perl -> if ($which) {
    // TODO perl -> # found one of those strings
    // TODO perl -> }
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _14 () {
    // <PLEAC>

    // ^^PLEAC^^_15.14
    // -----------------------------
    // TODO perl -> use Tk;
    // TODO perl ->
    // TODO perl -> $main = MainWindow->new();
    // TODO perl ->
    // Create a horizontal space at the top of the window for the
    // menu to live in.
    // TODO perl -> $menubar = $main->Frame(-relief => "raised",
    // TODO perl -> -borderwidth => 2)
    // TODO perl -> ->pack (-anchor => "nw",
    // TODO perl -> -fill => "x");
    // TODO perl ->
    // Create a button labeled "File" that brings up a menu
    // TODO perl -> $file_menu = $menubar->Menubutton(-text => "File",
    // TODO perl -> -underline => 1)
    // TODO perl -> ->pack (-side => "left" );
    // Create entries in the "File" menu
    // TODO perl -> $file_menu->command(-label => "Print",
    // TODO perl -> -command => \&Print);
    // -----------------------------
    // TODO perl -> $file_menu = $menubar->Menubutton(-text => "File",
    // TODO perl -> -underline => 1,
    // TODO perl -> -menuitems => [
    // TODO perl -> [ Button => "Print",-command => \&Print ],
    // TODO perl -> [ Button => "Save",-command => \&Save ] ])
    // TODO perl -> ->pack(-side => "left");
    // -----------------------------
    // TODO perl -> $file_menu->command(-label => "Quit Immediately",
    // TODO perl -> -command => sub { exit } );
    // -----------------------------
    // TODO perl -> $file_menu->separator();
    // -----------------------------
    // TODO perl -> $options_menu->checkbutton(-label => "Create Debugging File",
    // TODO perl -> -variable => \$debug,
    // TODO perl -> -onvalue => 1,
    // TODO perl -> -offvalue => 0);
    // -----------------------------
    // TODO perl -> $debug_menu->radiobutton(-label => "Level 1",
    // TODO perl -> -variable => \$log_level,
    // TODO perl -> -value => 1);
    // TODO perl ->
    // TODO perl -> $debug_menu->radiobutton(-label => "Level 2",
    // TODO perl -> -variable => \$log_level,
    // TODO perl -> -value => 2);
    // TODO perl ->
    // TODO perl -> $debug_menu->radiobutton(-label => "Level 3",
    // TODO perl -> -variable => \$log_level,
    // TODO perl -> -value => 3);
    // -----------------------------
    // step 1: create the cascading menu entry
    // TODO perl -> $format_menu->cascade (-label => "Font");
    // TODO perl ->
    // step 2: get the new Menu we just made
    // TODO perl -> $font_menu = $format_menu->cget("-menu");
    // TODO perl ->
    // step 3: populate that Menu
    // TODO perl -> $font_menu->radiobutton (-label => "Courier",
    // TODO perl -> -variable => \$font_name,
    // TODO perl -> -value => "courier");
    // TODO perl -> $font_menu->radiobutton (-label => "Times Roman",
    // TODO perl -> -variable => \$font_name,
    // TODO perl -> -value => "times");
    // -----------------------------
    // TODO perl -> $format_menu = $menubar->Menubutton(-text => "Format",
    // TODO perl -> -underline => 1
    // TODO perl -> -tearoff => 0)
    // TODO perl -> ->pack;
    // TODO perl ->
    // TODO perl -> $font_menu = $format_menu->cascade(-label => "Font",
    // TODO perl -> -tearoff => 0);
    // -----------------------------
    // TODO perl -> my $f = $menubar->Menubutton(-text => "Edit", -underline => 0,
    // TODO perl -> -menuitems =>
    // TODO perl -> [
    // TODO perl -> [Button => 'Copy', -command => \&edit_copy ],
    // TODO perl -> [Button => 'Cut', -command => \&edit_cut ],
    // TODO perl -> [Button => 'Paste', -command => \&edit_paste ],
    // TODO perl -> [Button => 'Delete', -command => \&edit_delete ],
    // TODO perl -> [Separator => ''],
    // TODO perl -> [Cascade => 'Object ...', -tearoff => 0,
    // TODO perl -> -menuitems => [
    // TODO perl -> [ Button => "Circle", -command => \&edit_circle ],
    // TODO perl -> [ Button => "Square", -command => \&edit_square ],
    // TODO perl -> [ Button => "Point", -command => \&edit_point ] ] ],
    // TODO perl -> ])->grid(-row => 0, -column => 0, -sticky => 'w');
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _15 () {
    // <PLEAC>

    // ^^PLEAC^^_15.15
    // -----------------------------
    // TODO perl -> use Tk::DialogBox;
    // TODO perl ->
    // TODO perl -> $dialog = $main->DialogBox( -title => "Register This Program",
    // TODO perl -> -buttons => [ "Register", "Cancel" ] );
    // TODO perl ->
    // add widgets to the dialog box with $dialog->Add()
    // TODO perl ->
    // later, when you need to display the dialog box
    // TODO perl -> $button = $dialog->Show();
    // TODO perl -> if ($button eq "Register") {
    // TODO perl -> # ...
    // TODO perl -> } elsif ($button eq "Cancel") {
    // TODO perl -> # ...
    // TODO perl -> } else {
    // TODO perl -> # this shouldn't happen
    // TODO perl -> }
    // -----------------------------
    // ^^INCLUDE^^ include/perl/ch15/tksample3
    // -----------------------------
    // ^^INCLUDE^^ include/perl/ch15/tksample4
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _16 () {
    // <PLEAC>

    // ^^PLEAC^^_15.16
    // -----------------------------
    // TODO perl -> use Tk;
    // TODO perl ->
    // TODO perl -> $main = MainWindow->new();
    // TODO perl ->
    // TODO perl -> $main->bind('<Configure>' => sub {
    // TODO perl -> $xe = $main->XEvent;
    // TODO perl -> $main->maxsize($xe->w, $xe->h);
    // TODO perl -> $main->minsize($xe->w, $xe->h);
    // TODO perl -> });
    // -----------------------------
    // TODO perl -> $widget->pack( -fill => "both", -expand => 1 );
    // TODO perl -> $widget->pack( -fill => "x", -expand => 1 );
    // -----------------------------
    // TODO perl -> $mainarea->pack( -fill => "both", -expand => 1);
    // -----------------------------
    // TODO perl -> $menubar->pack( -fill => "x", -expand => 1 );
    // -----------------------------
    // TODO perl -> $menubar->pack (-fill => "x",
    // TODO perl -> -expand => 1,
    // TODO perl -> -anchor => "nw" );
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _17 () {
    // <PLEAC>

    // ^^PLEAC^^_15.17
    // -----------------------------
    // ^^INCLUDE^^ include/perl/ch15/loader
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _18 () {
    // <PLEAC>

    // ^^PLEAC^^_15.18
    // -----------------------------
    // ^^INCLUDE^^ include/perl/ch15/tcapdemo
    // -----------------------------
    // * _ / | \ -
    // * _ \ - / | / | \ - *
    // * _ \ - / | / | \ - *
    // * \ - | / | - *
    // _ * \ - | / / | - \ *
    // _ * \ - | / / | - \ *
    // * * \ - | / / | - \ *
    // * * \ - | / / | - \ *
    // * * \ - | / / | - \ *
    // * * \ - | / / | - \ *
    // * * \ - | / / | - \ *
    // * * \ - | / / | - \
    // * - \ | / / - \
    // * - * - \ | / | / - \
    // * - * - \ | / | / - \ _
    // - - \ | / _
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _19 () {
    // <PLEAC>

    // ^^PLEAC^^_15.19
    // -----------------------------
    // % tkshufflepod chap15.pod
    // -----------------------------
    // ^^INCLUDE^^ include/perl/ch15/tkshufflepod
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }
}
