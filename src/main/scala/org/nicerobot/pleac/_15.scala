package org.nicerobot.pleac;

/**
 * @author nicerobot
 * 
 */

// ^^PLEAC^^_15.1
//-----------------------------
// TODO use Getopt::Std;

// -v ARG, -D ARG, -o ARG, sets $opt_v, $opt_D, $opt_o
// TODO getopt("vDo");              
// -v ARG, -D ARG, -o ARG, sets $args{v}, $args{D}, $args{o}
// TODO getopt("vDo", \%args);

// TODO getopts("vDo:");         # -v, -D, -o ARG, sets $opt_v, $opt_D, $opt_o
// TODO getopts("vDo:", \%args); # -v, -D, -o ARG, sets $args{v}, $args{D}, $args{o}
//-----------------------------
// TODO use Getopt::Long;

// TODO GetOptions( "verbose"  => \$verbose,     # --verbose
// TODO             "Debug"    => \$debug,       # --Debug
// TODO             "output=s" => \$output );    # --output=string or --output=string
//-----------------------------
//% rm -r -f /tmp/testdir
//-----------------------------
//% rm -rf /tmp/testdir
//-----------------------------
// TODO use Getopt::Std;
// TODO getopts("o:");
// TODO if ($opt_o) {
// TODO     print "Writing output to $opt_o";
// TODO }
//-----------------------------
// TODO use Getopt::Std;

// TODO %option = ();
// TODO getopts("Do:", \%option);

// TODO if ($option{D}) {
// TODO     print "Debugging mode enabled.\n";
// TODO }

// TODO  # if not set, set output to "-".  opening "-" for writing
// TODO  # means STDOUT
// TODO  $option{o} = "-" unless defined $option{o};
// TODO                              
// TODO print "Writing output to file $option{o}\n" unless $option{o} eq "-";
// TODO open(STDOUT, "> $option{o}")
// TODO      or die "Can't open $option{o} for output: $!\n";
//-----------------------------
//% gnutar --extract --file latest.tar
//-----------------------------
//% gnutar --extract --file=latest.tar
//-----------------------------
// TODO use Getopt::Long;

// TODO GetOptions( "extract" => \$extract,
// TODO             "file=s"  => \$file );

// TODO if ($extract) {
// TODO     print "I'm extracting.\n";
// TODO }

// TODO die "I wish I had a file" unless defined $file;
// TODO print "Working on the file $file\n";
//-----------------------------

// ^^PLEAC^^_15.2
//-----------------------------
// TODO sub I_am_interactive {
// TODO     return -t STDIN && -t STDOUT;
// TODO }
//-----------------------------
// TODO use POSIX qw/getpgrp tcgetpgrp/;

// TODO sub I_am_interactive {
// TODO     local *TTY;  # local file handle
// TODO     open(TTY, "/dev/tty") or die "can't open /dev/tty: $!";
// TODO     my $tpgrp = tcgetpgrp(fileno(TTY));
// TODO     my $pgrp  = getpgrp();
// TODO     close TTY;
// TODO     return ($tpgrp == $pgrp);
// TODO }
//-----------------------------
// TODO while (1) {
// TODO     if (I_am_interactive()) {
// TODO         print "Prompt: ";
// TODO     }
// TODO     $line = <STDIN>;
// TODO     last unless defined $line; 
// TODO     # do something with the line
// TODO }
//-----------------------------
// TODO sub prompt { print "Prompt: " if I_am_interactive() }
// TODO for (prompt(); $line = <STDIN>; prompt()) {
// TODO     # do something with the line
// TODO } 
//-----------------------------

// ^^PLEAC^^_15.3
//-----------------------------
// TODO use Term::Cap;

// TODO $OSPEED = 9600;
// TODO eval {
// TODO     require POSIX;
// TODO     my $termios = POSIX::Termios->new();
// TODO     $termios->getattr;
// TODO     $OSPEED = $termios->getospeed;
// TODO };

// TODO $terminal = Term::Cap->Tgetent({OSPEED=>$OSPEED});
// TODO $terminal->Tputs('cl', 1, STDOUT);
//-----------------------------
// TODO system("clear");
//-----------------------------
// TODO $clear = $terminal->Tputs('cl');
// TODO $clear = `clear`;
//-----------------------------
// TODO print $clear;
//-----------------------------

// ^^PLEAC^^_15.4
//-----------------------------
// TODO use Term::ReadKey;

// TODO ($wchar, $hchar, $wpixels, $hpixels) = GetTerminalSize();
//-----------------------------
// TODO use Term::ReadKey;

// TODO ($width) = GetTerminalSize();
// TODO die "You must have at least 10 characters" unless $width >= 10;

// TODO $max = 0;
// TODO foreach (@values) {
// TODO     $max = $_ if $max < $_;
// TODO }

// TODO $ratio = ($width-10)/$max;          # chars per unit
// TODO foreach (@values) {
// TODO     printf("%8.1f %s\n", $_, "*" x ($ratio*$_));
// TODO }
//-----------------------------

// ^^PLEAC^^_15.5
//-----------------------------
// TODO use Term::ANSIColor;

// TODO print color("red"), "Danger, Will Robinson!\n", color("reset");
// TODO print "This is just normal text.\n";
// TODO print colored("<BLINK>Do you hurt yet?</BLINK>", "blink");
//-----------------------------
// TODO use Term::ANSIColor qw(:constants);

// TODO print RED, "Danger, Will Robinson!\n", RESET;
//-----------------------------
// rhyme for the deadly coral snake
// TODO print color("red on_black"),  "venom lack\n";
// TODO print color("red on_yellow"), "kill that fellow\n";

// TODO print color("green on_cyan blink"), "garish!\n";
// TODO print color("reset");
//-----------------------------
// TODO print colored("venom lack\n", "red", "on_black");
// TODO print colored("kill that fellow\n", "red", "on_yellow");

// TODO print colored("garish!\n", "green", "on_cyan", "blink");
//-----------------------------
// TODO use Term::ANSIColor qw(:constants);

// TODO print BLACK, ON_WHITE, "black on white\n";
// TODO print WHITE, ON_BLACK, "white on black\n";
// TODO print GREEN, ON_CYAN, BLINK, "garish!\n";
// TODO print RESET;
//-----------------------------
// TODO END { print color("reset") }
//-----------------------------
// TODO $Term::ANSIColor::EACHLINE = $/;
// TODO print colored(<<EOF, RED, ON_WHITE, BOLD, BLINK);
// TODO This way
// TODO each line
// TODO has its own
// TODO attribute set.
// TODO EOF
//-----------------------------

// ^^PLEAC^^_15.6
//-----------------------------
// TODO use Term::ReadKey;

// TODO ReadMode('cbreak');
// TODO $key = ReadKey(0);
// TODO ReadMode('normal');
//-----------------------------
// ^^INCLUDE^^ include/perl/ch15/sascii
//-----------------------------

// ^^PLEAC^^_15.7
//-----------------------------
// TODO print "\aWake up!\n";
//-----------------------------
// TODO use Term::Cap;

// TODO $OSPEED = 9600;
// TODO eval {
// TODO     require POSIX;
// TODO     my $termios = POSIX::Termios->new();
// TODO     $termios->getattr;
// TODO     $OSPEED = $termios->getospeed;
// TODO };

// TODO $terminal = Term::Cap->Tgetent({OSPEED=>$OSPEED});
// TODO $vb = "";
// TODO eval {
// TODO     $terminal->Trequire("vb");
// TODO     $vb = $terminal->Tputs('vb', 1);
// TODO };

// TODO print $vb;                                  # ring visual bell
//-----------------------------

// ^^PLEAC^^_15.8
//-----------------------------
// ^^INCLUDE^^ include/perl/ch15/demo
//-----------------------------
// HotKey.pm
// TODO package HotKey;

// TODO @ISA = qw(Exporter);
// TODO @EXPORT = qw(cbreak cooked readkey);

// TODO use strict;
// TODO use POSIX qw(:termios_h);
// TODO my ($term, $oterm, $echo, $noecho, $fd_stdin);

// TODO $fd_stdin = fileno(STDIN);
// TODO $term     = POSIX::Termios->new();
// TODO $term->getattr($fd_stdin);
// TODO $oterm     = $term->getlflag();

// TODO $echo     = ECHO | ECHOK | ICANON;
// TODO $noecho   = $oterm & ~$echo;

// TODO sub cbreak {
// TODO     $term->setlflag($noecho);  # ok, so i don't want echo either
// TODO     $term->setcc(VTIME, 1);
// TODO     $term->setattr($fd_stdin, TCSANOW);
// TODO }

// TODO sub cooked {
// TODO     $term->setlflag($oterm);
// TODO     $term->setcc(VTIME, 0);
// TODO     $term->setattr($fd_stdin, TCSANOW);
// TODO }

// TODO sub readkey {
// TODO     my $key = '';
// TODO     cbreak();
// TODO     sysread(STDIN, $key, 1);
// TODO     cooked();
// TODO     return $key;
// TODO }

// TODO END { cooked() }

// TODO 1;
//-----------------------------

// ^^PLEAC^^_15.9
//-----------------------------
// TODO use Term::ReadKey;

// TODO ReadMode ('cbreak');

// TODO if (defined ($char = ReadKey(-1)) ) {
// TODO     # input was waiting and it was $char
// TODO } else {
// TODO     # no input was waiting
// TODO }

// TODO ReadMode ('normal');                  # restore normal tty settings
//-----------------------------

// ^^PLEAC^^_15.10
//-----------------------------
// TODO use Term::ReadKey;

// TODO ReadMode('noecho');
// TODO $password = ReadLine(0);
//-----------------------------
// ^^INCLUDE^^ include/perl/ch15/checkuser
//-----------------------------

// ^^PLEAC^^_15.11
//-----------------------------
// TODO use Term::ReadLine;

// TODO $term = Term::ReadLine->new("APP DESCRIPTION");
// TODO $OUT = $term->OUT || *STDOUT;

// TODO $term->addhistory($fake_line);
// TODO $line = $term->readline(PROMPT);

// TODO print $OUT "Any program output\n";
//-----------------------------
// ^^INCLUDE^^ include/perl/ch15/vbsh
//-----------------------------
// TODO $term->addhistory($seed_line);
//-----------------------------
// TODO $term->remove_history($line_number);
//-----------------------------
// TODO @history = $term->GetHistory;
//-----------------------------

// ^^PLEAC^^_15.12
//-----------------------------
//% rep ps aux
//% rep netstat
//% rep -2.5 lpq
//-----------------------------
// ^^INCLUDE^^ include/perl/ch15/rep
//-----------------------------
// TODO keypad(1);                  # enable keypad mode
// TODO $key = getch();
// TODO if ($key eq 'k'     ||      # vi mode
// TODO     $key eq "\cP"   ||      # emacs mode
// TODO     $key eq KEY_UP)         # arrow mode
// TODO {
// TODO     # do something
// TODO } 
//-----------------------------
//           Template Entry Demonstration 
//
//   Address Data Example                                     Record # ___
//
//   Name: [________________________________________________]
//   Addr: [________________________________________________]
//   City: [__________________]          State: [__]       Zip: [\\\\\] 
//
//   Phone: (\\\) \\\-\\\\                            Password: [^^^^^^^^]
//
//   Enter all information available.
//   Edit fields with left/right arrow keys or "delete".
//   Switch fields with "Tab" or up/down arrow keys.
//   Indicate completion by pressing "Return".
//   Refresh screen with "Control-L".
//   Abort this demo here with "Control-X".
//-----------------------------

// ^^PLEAC^^_15.13
//-----------------------------
// TODO use Expect;

// TODO $command = Expect->spawn("program to run")
// TODO     or die "Couldn't start program: $!\n";

// prevent the program's output from being shown on our STDOUT
// TODO $command->log_stdout(0);

// wait 10 seconds for "Password:" to appear
// TODO unless ($command->expect(10, "Password")) {
// TODO     # timed out
// TODO }

// wait 20 seconds for something that matches /[lL]ogin: ?/
// TODO unless ($command->expect(20, -re => '[lL]ogin: ?')) {
// TODO     # timed out
// TODO }

// wait forever for "invalid" to appear
// TODO unless ($command->expect(undef, "invalid")) {
// TODO     # error occurred; the program probably went away
// TODO }

// send "Hello, world" and a carriage return to the program
// TODO print $command "Hello, world\r";

// if the program will terminate by itself, finish up with
// TODO $command->soft_close();
// TODO     
// if the program must be explicitly killed, finish up with
// TODO $command->hard_close();
//-----------------------------
// TODO $which = $command->expect(30, "invalid", "succes", "error", "boom");
// TODO if ($which) {
// TODO     # found one of those strings
// TODO }
//-----------------------------

// ^^PLEAC^^_15.14
//-----------------------------
// TODO use Tk;

// TODO $main = MainWindow->new();

// Create a horizontal space at the top of the window for the
// menu to live in.
// TODO $menubar = $main->Frame(-relief              => "raised",
// TODO                         -borderwidth         => 2)
// TODO                 ->pack (-anchor              => "nw",
// TODO                         -fill                => "x");

// Create a button labeled "File" that brings up a menu
// TODO $file_menu = $menubar->Menubutton(-text      => "File",
// TODO                                   -underline => 1)
// TODO                      ->pack      (-side      => "left" );
// Create entries in the "File" menu
// TODO $file_menu->command(-label   => "Print",
// TODO                     -command => \&Print);
//-----------------------------
// TODO $file_menu = $menubar->Menubutton(-text     => "File",
// TODO                                  -underline => 1,
// TODO                                  -menuitems => [
// TODO               [ Button => "Print",-command  => \&Print ],
// TODO                [ Button => "Save",-command  => \&Save  ] ])
// TODO                            ->pack(-side     => "left");
//-----------------------------
// TODO     $file_menu->command(-label   => "Quit Immediately",
// TODO                         -command => sub { exit } );
//-----------------------------
// TODO $file_menu->separator();
//-----------------------------
// TODO $options_menu->checkbutton(-label    => "Create Debugging File",
// TODO                            -variable => \$debug,
// TODO                            -onvalue  => 1,
// TODO                            -offvalue => 0);
//-----------------------------
// TODO $debug_menu->radiobutton(-label    => "Level 1",
// TODO                          -variable => \$log_level,
// TODO                          -value    => 1);

// TODO $debug_menu->radiobutton(-label    => "Level 2",
// TODO                          -variable => \$log_level,
// TODO                          -value    => 2);

// TODO $debug_menu->radiobutton(-label    => "Level 3",
// TODO                          -variable => \$log_level,
// TODO                          -value    => 3);
//-----------------------------
// step 1: create the cascading menu entry
// TODO $format_menu->cascade          (-label    => "Font");

// step 2: get the new Menu we just made
// TODO $font_menu = $format_menu->cget("-menu");

// step 3: populate that Menu
// TODO $font_menu->radiobutton        (-label    => "Courier",
// TODO                                 -variable => \$font_name,
// TODO                                 -value    => "courier");
// TODO $font_menu->radiobutton        (-label    => "Times Roman",
// TODO                                 -variable => \$font_name,
// TODO                                 -value    => "times");
//-----------------------------
// TODO $format_menu = $menubar->Menubutton(-text      => "Format",
// TODO                                     -underline => 1
// TODO                                     -tearoff   => 0)
// TODO                        ->pack;

// TODO $font_menu  = $format_menu->cascade(-label     => "Font",
// TODO                                     -tearoff   => 0);
//-----------------------------
// TODO my $f = $menubar->Menubutton(-text => "Edit", -underline => 0,
// TODO                               -menuitems =>
// TODO     [
// TODO      [Button => 'Copy',        -command => \&edit_copy ],
// TODO      [Button => 'Cut',         -command => \&edit_cut ],
// TODO      [Button => 'Paste',       -command => \&edit_paste  ],
// TODO      [Button => 'Delete',      -command => \&edit_delete ],
// TODO      [Separator => ''],
// TODO      [Cascade => 'Object ...', -tearoff => 0,
// TODO                                -menuitems => [
// TODO         [ Button => "Circle",  -command => \&edit_circle ],
// TODO         [ Button => "Square",  -command => \&edit_square ],
// TODO         [ Button => "Point",   -command => \&edit_point ] ] ],
// TODO     ])->grid(-row => 0, -column => 0, -sticky => 'w');
//-----------------------------

// ^^PLEAC^^_15.15
//-----------------------------
// TODO use Tk::DialogBox;

// TODO $dialog = $main->DialogBox( -title   => "Register This Program",
// TODO                             -buttons => [ "Register", "Cancel" ] );

// add widgets to the dialog box with $dialog->Add()

// later, when you need to display the dialog box
// TODO $button = $dialog->Show();
// TODO if ($button eq "Register") {
// TODO     # ...
// TODO } elsif ($button eq "Cancel") {
// TODO     # ...
// TODO } else {
// TODO     # this shouldn't happen
// TODO }
//-----------------------------
// ^^INCLUDE^^ include/perl/ch15/tksample3
//-----------------------------
// ^^INCLUDE^^ include/perl/ch15/tksample4
//-----------------------------

// ^^PLEAC^^_15.16
//-----------------------------
// TODO use Tk;

// TODO $main = MainWindow->new();

// TODO $main->bind('<Configure>' => sub {
// TODO     $xe = $main->XEvent;
// TODO     $main->maxsize($xe->w, $xe->h);
// TODO     $main->minsize($xe->w, $xe->h);
// TODO });
//-----------------------------
// TODO $widget->pack( -fill => "both", -expand => 1 );
// TODO $widget->pack( -fill => "x",    -expand => 1 );
//-----------------------------
// TODO $mainarea->pack( -fill => "both", -expand => 1);
//-----------------------------
// TODO $menubar->pack( -fill => "x", -expand => 1 );
//-----------------------------
// TODO $menubar->pack (-fill     => "x",
// TODO                 -expand   => 1,
// TODO                 -anchor   => "nw" );
//-----------------------------

// ^^PLEAC^^_15.17
//-----------------------------
// ^^INCLUDE^^ include/perl/ch15/loader
//-----------------------------

// ^^PLEAC^^_15.18
//-----------------------------
// ^^INCLUDE^^ include/perl/ch15/tcapdemo
//-----------------------------
//*     _                       /     |                       \     -
// *   _ \                     - /   | /                     | \   - *
//  * _   \                   -   / |   /                   |   \ -   *
//   *     \                 -     |     /                 |     -     *
//  _ *     \               -     | /     /               |     - \     *
// _   *     \             -     |   /     /             |     -   \     *
//*     *     \           -     |     /     /           |     -     \     *
// *     *     \         -     |       /     /         |     -       \     *
//  *     *     \       -     |         /     /       |     -         \     *
//   *     *     \     -     |           /     /     |     -           \     *
//    *     *     \   -     |             /     /   |     -             \     *
//     *     *     \ -     |               /     / |     -               \     
//      *     -     \     |                 /     /     -                 \    
//  *   - *   - \   |                   /   | /   -                   \   
//   * -   * -   \ |                     / |   / -                     \ _
//    -     -     \                       |     /                       _
//-----------------------------

// ^^PLEAC^^_15.19
//-----------------------------
//% tkshufflepod chap15.pod
//-----------------------------
// ^^INCLUDE^^ include/perl/ch15/tkshufflepod
//-----------------------------
