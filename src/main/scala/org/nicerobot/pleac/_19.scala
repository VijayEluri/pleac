package org.nicerobot.pleac;

/**
 * @author nicerobot
 * 
 */

// ^^PLEAC^^_19.0
//-----------------------------
// http://www.perl.com/CPAN/
// http://www.perl.com:8001/bad/mojo.html
// ftp://gatekeeper.dec.com/pub/misc/netlib.tar.Z
// ftp://anonymous@myplace:gatekeeper.dec.com/pub/misc/netlib.tar.Z
// file:///etc/motd
//-----------------------------
// http://mox.perl.com/cgi-bin/program?name=Johann&born=1685
//-----------------------------
// http://mox.perl.com/cgi-bin/program
//-----------------------------

// ^^PLEAC^^_19.1
//-----------------------------
// ^^INCLUDE^^ include/perl/ch19/hiweb
//-----------------------------
// TODO use CGI qw(:standard);
// TODO $who   = param("Name");
// TODO $phone = param("Number");
// TODO @picks = param("Choices");
//-----------------------------
// TODO print header( -TYPE    => 'text/plain',
// TODO               -EXPIRES => '+3d' );
//-----------------------------

// ^^PLEAC^^_19.2
//-----------------------------
// TODO use CGI::Carp;
// TODO warn "This is a complaint";
// TODO die "But this one is serious";
//-----------------------------
// TODO BEGIN {
// TODO     use CGI::Carp qw(carpout);
// TODO     open(LOG, ">>/var/local/cgi-logs/mycgi-log")
// TODO         or die "Unable to append to mycgi-log: $!\n";
// TODO     carpout(*LOG);
// TODO }
//-----------------------------
// TODO use CGI::Carp qw(fatalsToBrowser);
// TODO die "Bad error here";
//-----------------------------

// ^^PLEAC^^_19.3
//-----------------------------
// ^^INCLUDE^^ include/perl/ch19/webwhoami
//-----------------------------
//% perl -wc cgi-script        # just compilation
//
//% perl -w  cgi-script        # parms from stdin
//(offline mode: enter name=value pairs on standard input)
//
//name=joe
//
//number=10
//
//^D
//
//
//% perl -w  cgi-script name=joe number=10    # run with mock form input
//% perl -d  cgi-script name=joe number=10    # ditto, under the debugger
//
//# POST method script in csh
//% (setenv HTTP_METHOD POST; perl -w cgi-script name=joe number=10)
//# POST method script in sh
//% HTTP_METHOD=POST perl -w cgi-script name=joe number=10
//-----------------------------
//% perl -MCGI -le 'print CGI->VERSION'
//2.49
//-----------------------------
// TODO $| = 1;
//-----------------------------

// ^^PLEAC^^_19.4
//-----------------------------
//!/usr/bin/perl -T
// TODO open(FH, "> $ARGV[0]") or die;
//-----------------------------
// Insecure dependency in open while running with -T switch at ...
//-----------------------------
// TODO $file = $ARGV[0];                                   # $file tainted
// TODO unless ($file =~ m#^([\w.-]+)$#) {                  # $1 is untainted
// TODO     die "filename '$file' has invalid characters.\n";
// TODO }
// TODO $file = $1;                                         # $file untainted
//-----------------------------
// TODO unless (-e $filename) {                     # WRONG!
// TODO     open(FH, "> $filename");
// TODO     # ...
// TODO }
//-----------------------------

// ^^PLEAC^^_19.5
//-----------------------------
//Alias /perl/ /real/path/to/perl/scripts/
//
//<Location /perl>
//SetHandler  perl-script
//PerlHandler Apache::Registry
//Options ExecCGI
//</Location>
//
//PerlModule Apache::Registry
//PerlModule CGI
//PerlSendHeader On
//-----------------------------
//<Files *.perl>
//SetHandler  perl-script
//PerlHandler Apache::Registry
//Options ExecCGI
//</Files>
//-----------------------------

// ^^PLEAC^^_19.6
//-----------------------------
// TODO system("command $input @files");            # UNSAFE
//-----------------------------
// TODO system("command", $input, @files);          # safer
//-----------------------------
// TODO chomp($now = `date`);
//-----------------------------
// TODO @output = `grep $input @files`;
//-----------------------------
// TODO die "cannot fork: $!" unless defined ($pid = open(SAFE_KID, "|-"));
// TODO if ($pid == 0) {
// TODO     exec('grep', $input, @files) or die "can't exec grep: $!";
// TODO } else {
// TODO     @output = <SAFE_KID>;
// TODO     close SAFE_KID;                 # $? contains status
// TODO }
//-----------------------------
// TODO open(KID_TO_READ, "$program @options @args |");    # UNSAFE
//-----------------------------
// add error processing as above
// TODO die "cannot fork: $!" unless defined($pid = open(KID_TO_READ, "-|"));

// TODO if ($pid) {   # parent
// TODO    while (<KID_TO_READ>) {
// TODO        # do something interesting
// TODO    }
// TODO    close(KID_TO_READ)               or warn "kid exited $?";

// TODO } else {      # child
// TODO    # reconfigure, then
// TODO    exec($program, @options, @args)  or die "can't exec program: $!";
// TODO }
//-----------------------------
// TODO open(KID_TO_WRITE, "|$program $options @args");   # UNSAFE
//-----------------------------
// TODO $pid = open(KID_TO_WRITE, "|-");
// TODO die "cannot fork: $!" unless defined($pid = open(KID_TO_WRITE, "|-"));
// TODO $SIG{ALRM} = sub { die "whoops, $program pipe broke" };

// TODO if ($pid) {  # parent
// TODO    for (@data) { print KID_TO_WRITE $_ }
// TODO    close(KID_TO_WRITE)              or warn "kid exited $?";

// TODO } else {     # child
// TODO    # reconfigure, then
// TODO    exec($program, @options, @args)  or die "can't exec program: $!";
// TODO }
//-----------------------------

// ^^PLEAC^^_19.7
//-----------------------------
// TODO print ol( li([ qw(red blue green)]) );
// <OL><LI>red</LI> <LI>blue</LI> <LI>green</LI></OL>

// TODO @names = qw(Larry Moe Curly);
// TODO print ul( li({ -TYPE => "disc" }, \@names) );
// <UL><LI TYPE="disc">Larry</LI> <LI TYPE="disc">Moe</LI>
//
//     <LI TYPE="disc">Curly</LI></UL>
//-----------------------------
// TODO print li("alpha");
//     <LI>alpha</LI>

// TODO print li( [ "alpha", "omega"] );
//     <LI>alpha</LI> <LI>omega</LI>
//-----------------------------
// TODO use CGI qw(:standard :html3);

// TODO %hash = (
// TODO     "Wisconsin"  => [ "Superior", "Lake Geneva", "Madison" ],
// TODO     "Colorado"   => [ "Denver", "Fort Collins", "Boulder" ],
// TODO     "Texas"      => [ "Plano", "Austin", "Fort Stockton" ],
// TODO     "California" => [ "Sebastopol", "Santa Rosa", "Berkeley" ],
// TODO );

// TODO $\ = "\n";

// TODO print "<TABLE> <CAPTION>Cities I Have Known</CAPTION>";
// TODO print Tr(th [qw(State Cities)]);
// TODO for $k (sort keys %hash) {
// TODO     print Tr(th($k), td( [ sort @{$hash{$k}} ] ));
// TODO }
// TODO print "</TABLE>";
//-----------------------------
// <TABLE> <CAPTION>Cities I Have Known</CAPTION>
// 
//     <TR><TH>State</TH> <TH>Cities</TH></TR>
// 
//     <TR><TH>California</TH> <TD>Berkeley</TD> <TD>Santa Rosa</TD> 
// 
//    <TD>Sebastopol</TD> </TR>
// 
//     <TR><TH>Colorado</TH> <TD>Boulder</TD> <TD>Denver</TD> 
// 
//    <TD>Fort Collins</TD> </TR>
// 
//     <TR><TH>Texas</TH> <TD>Austin</TD> <TD>Fort Stockton</TD> 
// 
//    <TD>Plano</TD></TR>
// 
//     <TR><TH>Wisconsin</TH> <TD>Lake Geneva</TD> <TD>Madison</TD> 
// 
//    <TD>Superior</TD></TR>
// 
// </TABLE>
//-----------------------------
// TODO print table
// TODO         caption('Cities I have Known'),
// TODO         Tr(th [qw(State Cities)]),
// TODO         map { Tr(th($_), td( [ sort @{$hash{$_}} ] )) } sort keys %hash;
//-----------------------------
// ^^INCLUDE^^ include/perl/ch19/salcheck
//-----------------------------

// ^^PLEAC^^_19.8
//-----------------------------
// TODO $url = "http://www.perl.com/CPAN/";
// TODO print "Location: $url\n\n";
// TODO exit;
//-----------------------------
// ^^INCLUDE^^ include/perl/ch19/oreobounce
//-----------------------------
//Status: 302 Moved Temporarily
//
//Set-Cookie: filling=vanilla%20cr%E4me; domain=.perl.com; 
//
//    expires=Tue, 21-Jul-1998 11:58:55 GMT
//
//Date: Tue, 21 Apr 1998 11:55:55 GMT
//
//Location: http://somewhere.perl.com/nonesuch.html
//
//Content-Type: text/html
//
//B<<blank line here>>
//-----------------------------
// ^^INCLUDE^^ include/perl/ch19/os_snipe
//-----------------------------
// TODO use CGI qw(:standard);
// TODO print header( -STATUS => '204 No response' );
//-----------------------------
//Status: 204 No response
//
//Content-Type: text/html
//
//<blank line here>
//-----------------------------
//!/bin/sh

// TODO cat <<EOCAT
// TODO Status: 204 No response
// TODO  
// TODO EOCAT
//-----------------------------

// ^^PLEAC^^_19.9
//-----------------------------
// ^^INCLUDE^^ include/perl/ch19/dummyhttpd
//-----------------------------
//http://somewhere.com/cgi-bin/whatever
//-----------------------------
//http://somewhere.com:8989/cgi-bin/whatever
//-----------------------------
//% telnet www.perl.com 80
//GET /bogotic HTTP/1.0
//
//<blank line here>
//
//HTTP/1.1 404 File Not Found
//
//Date: Tue, 21 Apr 1998 11:25:43 GMT
//
//Server: Apache/1.2.4
//
//Connection: close
//
//Content-Type: text/html
//
//
//<HTML><HEAD>
//
//<TITLE>404 File Not Found</TITLE>
//
//</HEAD><BODY>
//
//<H1>File Not Found</H1>
//
//The requested URL /bogotic was not found on this server.<P>
//
//</BODY></HTML>
//-----------------------------
// TODO % GET -esuSU http://mox.perl.com/perl/bogotic
// GET http://language.perl.com/bogotic
// 
// Host: mox.perl.com
// 
// User-Agent: lwp-request/1.32
// 
// 
// GET http://mox.perl.com/perl/bogotic --> 302 Moved Temporarily
// 
// GET http://www.perl.com/perl/bogotic --> 302 Moved Temporarily
// 
// GET http://language.perl.com/bogotic --> 404 File Not Found
// 
// Connection: close
// 
// Date: Tue, 21 Apr 1998 11:29:03 GMT
// 
// Server: Apache/1.2.4
// 
// Content-Type: text/html
// 
// Client-Date: Tue, 21 Apr 1998 12:29:01 GMT
// 
// Client-Peer: 208.201.239.47:80
// 
// Title: Broken perl.com Links
// 
// 
// <HTML>
// 
// <HEAD><TITLE>An Error Occurred</TITLE></HEAD>
// 
// <BODY>
// 
// <H1>An Error Occurred</h1>
// 
// 404 File Not Found
// 
// </BODY>
// 
// </HTML>
//-----------------------------

// ^^PLEAC^^_19.10
//-----------------------------
// TODO $preference_value = cookie("preference name");
//-----------------------------
// TODO $packed_cookie = cookie( -NAME    => "preference name",
// TODO                          -VALUE   => "whatever you'd like",
// TODO                          -EXPIRES => "+2y");
//-----------------------------
// TODO print header(-COOKIE => $packed_cookie);
//-----------------------------
// ^^INCLUDE^^ include/perl/ch19/ic_cookies
//-----------------------------

// ^^PLEAC^^_19.11
//-----------------------------
// TODO print textfield("SEARCH");          # previous SEARCH value is the default
//-----------------------------
// ^^INCLUDE^^ include/perl/ch19/who.cgi
//-----------------------------

// ^^PLEAC^^_19.12
//-----------------------------
// TODO use CGI qw(:standard);
// TODO print hidden("bacon");
//-----------------------------
// TODO     print submit(-NAME => ".State", -VALUE => "Checkout");
//-----------------------------
// TODO sub to_page { return submit( -NAME => ".State", -VALUE => shift ) }
//-----------------------------
// TODO $page = param(".State") || "Default";
//-----------------------------
// TODO if ($page eq "Default") {
// TODO     front_page();
// TODO } elsif ($page eq "Checkout") {
// TODO     checkout();
// TODO } else {
// TODO     no_such_page();         # when we get a .State that doesn't exist
// TODO }
//-----------------------------
// TODO %States = (
// TODO     'Default'     => \&front_page,
// TODO     'Shirt'       => \&shirt,
// TODO     'Sweater'     => \&sweater,
// TODO     'Checkout'    => \&checkout,
// TODO     'Card'        => \&credit_card,
// TODO     'Order'       => \&order,
// TODO     'Cancel'      => \&front_page,
// TODO );

// TODO if ($States{$page}) {
// TODO     $States{$page}->();   # call the correct subroutine 
// TODO } else {
// TODO     no_such_page();
// TODO }
//-----------------------------
// TODO while (($state, $sub) = each %States) {
// TODO     $sub->( $page eq $state );
// TODO }
//-----------------------------
// TODO sub t_shirt {
// TODO     my $active = shift;

// TODO     unless ($active) {
// TODO         print hidden("size"), hidden("color");
// TODO         return;
// TODO     }

// TODO     print p("You want to buy a t-shirt?");
// TODO     print p("Size: ", popup_menu('size', [ qw(XL L M S XS) ]));
// TODO     print p("Color:", popup_menu('color', [ qw(Black White) ]));

// TODO     print p( to_page("Shoes"), to_page("Checkout") );
// TODO }
//-----------------------------
// TODO print header("Program Title"), start_html();
// TODO print standard_header(), begin_form();
// TODO while (($state, $sub) = each %States) {
// TODO     $sub->( $page eq $state );
// TODO }
// TODO print standard_footer(), end_form(), end_html();
//-----------------------------

// ^^PLEAC^^_19.13
//-----------------------------
// first open and exclusively lock the file
// TODO open(FH, ">>/tmp/formlog")              or die "can't append to formlog: $!";
// TODO flock(FH, 2)                            or die "can't flock formlog: $!";

// either using the procedural interface
// TODO use CGI qw(:standard);
// TODO save_parameters(*FH);                   # with CGI::save

// or using the object interface
// TODO use CGI;
// TODO $query = CGI->new();
// TODO $query->save(*FH);

// TODO close(FH)                               or die "can't close formlog: $!";
//-----------------------------
// TODO use CGI qw(:standard);
// TODO open(MAIL, "|/usr/lib/sendmail -oi -t") or die "can't fork sendmail: $!";
// TODO print MAIL <<EOF;
// TODO From: $0 (your cgi script)
// TODO To: hisname\@hishost.com
// TODO Subject: mailed form submission

// TODO EOF
// TODO save_parameters(*MAIL);
// TODO close(MAIL)                             or die "can't close sendmail: $!"; 
//-----------------------------
// TODO param("_timestamp", scalar localtime);
// TODO param("_environs", %ENV);
//-----------------------------
// TODO use CGI;
// TODO open(FORMS, "< /tmp/formlog")       or die "can't read formlog: $!";
// TODO flock(FORMS, 1)                     or die "can't lock formlog: $!";
// TODO while ($query = CGI->new(*FORMS)) {
// TODO     last unless $query->param();     # means end of file
// TODO     %his_env = $query->param('_environs');
// TODO     $count  += $query->param('items requested')
// TODO                 unless $his_env{REMOTE_HOST} =~ /(^|\.)perl\.com$/
// TODO }
// TODO print "Total orders: $count\n";
//-----------------------------

// ^^PLEAC^^_19.14
//-----------------------------
// ^^INCLUDE^^ include/perl/ch19/chemiserie
//-----------------------------
