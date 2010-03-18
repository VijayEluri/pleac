package org.nicerobot.pleac;

/**
 * @author nicerobot
 * 
 */
public class _19 {

  public static void _00 () {
    // <PLEAC>

    // ^^PLEAC^^_19.0
    // -----------------------------
    // http://www.perl.com/CPAN/
    // http://www.perl.com:8001/bad/mojo.html
    // ftp://gatekeeper.dec.com/pub/misc/netlib.tar.Z
    // ftp://anonymous@myplace:gatekeeper.dec.com/pub/misc/netlib.tar.Z
    // file:///etc/motd
    // -----------------------------
    // http://mox.perl.com/cgi-bin/program?name=Johann&born=1685
    // -----------------------------
    // http://mox.perl.com/cgi-bin/program
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _01 () {
    // <PLEAC>

    // ^^PLEAC^^_19.1
    // -----------------------------
    // ^^INCLUDE^^ include/perl/ch19/hiweb
    // -----------------------------
    // TODO perl -> use CGI qw(:standard);
    // TODO perl -> $who = param("Name");
    // TODO perl -> $phone = param("Number");
    // TODO perl -> @picks = param("Choices");
    // -----------------------------
    // TODO perl -> print header( -TYPE => 'text/plain',
    // TODO perl -> -EXPIRES => '+3d' );
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _02 () {
    // <PLEAC>

    // ^^PLEAC^^_19.2
    // -----------------------------
    // TODO perl -> use CGI::Carp;
    // TODO perl -> warn "This is a complaint";
    // TODO perl -> die "But this one is serious";
    // -----------------------------
    // TODO perl -> BEGIN {
    // TODO perl -> use CGI::Carp qw(carpout);
    // TODO perl -> open(LOG, ">>/var/local/cgi-logs/mycgi-log")
    // TODO perl -> or die "Unable to append to mycgi-log: $!\n";
    // TODO perl -> carpout(*LOG);
    // TODO perl -> }
    // -----------------------------
    // TODO perl -> use CGI::Carp qw(fatalsToBrowser);
    // TODO perl -> die "Bad error here";
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _03 () {
    // <PLEAC>

    // ^^PLEAC^^_19.3
    // -----------------------------
    // ^^INCLUDE^^ include/perl/ch19/webwhoami
    // -----------------------------
    // % perl -wc cgi-script # just compilation
    //
    // % perl -w cgi-script # parms from stdin
    // (offline mode: enter name=value pairs on standard input)
    //
    // name=joe
    //
    // number=10
    //
    // ^D
    //
    //
    // % perl -w cgi-script name=joe number=10 # run with mock form input
    // % perl -d cgi-script name=joe number=10 # ditto, under the debugger
    //
    // # POST method script in csh
    // % (setenv HTTP_METHOD POST; perl -w cgi-script name=joe number=10)
    // # POST method script in sh
    // % HTTP_METHOD=POST perl -w cgi-script name=joe number=10
    // -----------------------------
    // % perl -MCGI -le 'print CGI->VERSION'
    // 2.49
    // -----------------------------
    // TODO perl -> $| = 1;
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _04 () {
    // <PLEAC>

    // ^^PLEAC^^_19.4
    // -----------------------------
    // !/usr/bin/perl -T
    // TODO perl -> open(FH, "> $ARGV[0]") or die;
    // -----------------------------
    // Insecure dependency in open while running with -T switch at ...
    // -----------------------------
    // TODO perl -> $file = $ARGV[0]; # $file tainted
    // TODO perl -> unless ($file =~ m#^([\w.-]+)$#) { # $1 is untainted
    // TODO perl -> die "filename '$file' has invalid characters.\n";
    // TODO perl -> }
    // TODO perl -> $file = $1; # $file untainted
    // -----------------------------
    // TODO perl -> unless (-e $filename) { # WRONG!
    // TODO perl -> open(FH, "> $filename");
    // TODO perl -> # ...
    // TODO perl -> }
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _05 () {
    // <PLEAC>

    // ^^PLEAC^^_19.5
    // -----------------------------
    // Alias /perl/ /real/path/to/perl/scripts/
    //
    // <Location /perl>
    // SetHandler perl-script
    // PerlHandler Apache::Registry
    // Options ExecCGI
    // </Location>
    //
    // PerlModule Apache::Registry
    // PerlModule CGI
    // PerlSendHeader On
    // -----------------------------
    // <Files *.perl>
    // SetHandler perl-script
    // PerlHandler Apache::Registry
    // Options ExecCGI
    // </Files>
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _06 () {
    // <PLEAC>

    // ^^PLEAC^^_19.6
    // -----------------------------
    // TODO perl -> system("command $input @files"); # UNSAFE
    // -----------------------------
    // TODO perl -> system("command", $input, @files); # safer
    // -----------------------------
    // TODO perl -> chomp($now = `date`);
    // -----------------------------
    // TODO perl -> @output = `grep $input @files`;
    // -----------------------------
    // TODO perl -> die "cannot fork: $!" unless defined ($pid = open(SAFE_KID, "|-"));
    // TODO perl -> if ($pid == 0) {
    // TODO perl -> exec('grep', $input, @files) or die "can't exec grep: $!";
    // TODO perl -> } else {
    // TODO perl -> @output = <SAFE_KID>;
    // TODO perl -> close SAFE_KID; # $? contains status
    // TODO perl -> }
    // -----------------------------
    // TODO perl -> open(KID_TO_READ, "$program @options @args |"); # UNSAFE
    // -----------------------------
    // add error processing as above
    // TODO perl -> die "cannot fork: $!" unless defined($pid = open(KID_TO_READ, "-|"));
    // TODO perl ->
    // TODO perl -> if ($pid) { # parent
    // TODO perl -> while (<KID_TO_READ>) {
    // TODO perl -> # do something interesting
    // TODO perl -> }
    // TODO perl -> close(KID_TO_READ) or warn "kid exited $?";
    // TODO perl ->
    // TODO perl -> } else { # child
    // TODO perl -> # reconfigure, then
    // TODO perl -> exec($program, @options, @args) or die "can't exec program: $!";
    // TODO perl -> }
    // -----------------------------
    // TODO perl -> open(KID_TO_WRITE, "|$program $options @args"); # UNSAFE
    // -----------------------------
    // TODO perl -> $pid = open(KID_TO_WRITE, "|-");
    // TODO perl -> die "cannot fork: $!" unless defined($pid = open(KID_TO_WRITE, "|-"));
    // TODO perl -> $SIG{ALRM} = sub { die "whoops, $program pipe broke" };
    // TODO perl ->
    // TODO perl -> if ($pid) { # parent
    // TODO perl -> for (@data) { print KID_TO_WRITE $_ }
    // TODO perl -> close(KID_TO_WRITE) or warn "kid exited $?";
    // TODO perl ->
    // TODO perl -> } else { # child
    // TODO perl -> # reconfigure, then
    // TODO perl -> exec($program, @options, @args) or die "can't exec program: $!";
    // TODO perl -> }
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _07 () {
    // <PLEAC>

    // ^^PLEAC^^_19.7
    // -----------------------------
    // TODO perl -> print ol( li([ qw(red blue green)]) );
    // <OL><LI>red</LI> <LI>blue</LI> <LI>green</LI></OL>
    // TODO perl ->
    // TODO perl -> @names = qw(Larry Moe Curly);
    // TODO perl -> print ul( li({ -TYPE => "disc" }, \@names) );
    // <UL><LI TYPE="disc">Larry</LI> <LI TYPE="disc">Moe</LI>
    //
    // <LI TYPE="disc">Curly</LI></UL>
    // -----------------------------
    // TODO perl -> print li("alpha");
    // <LI>alpha</LI>
    // TODO perl ->
    // TODO perl -> print li( [ "alpha", "omega"] );
    // <LI>alpha</LI> <LI>omega</LI>
    // -----------------------------
    // TODO perl -> use CGI qw(:standard :html3);
    // TODO perl ->
    // TODO perl -> %hash = (
    // TODO perl -> "Wisconsin" => [ "Superior", "Lake Geneva", "Madison" ],
    // TODO perl -> "Colorado" => [ "Denver", "Fort Collins", "Boulder" ],
    // TODO perl -> "Texas" => [ "Plano", "Austin", "Fort Stockton" ],
    // TODO perl -> "California" => [ "Sebastopol", "Santa Rosa", "Berkeley" ],
    // TODO perl -> );
    // TODO perl ->
    // TODO perl -> $\ = "\n";
    // TODO perl ->
    // TODO perl -> print "<TABLE> <CAPTION>Cities I Have Known</CAPTION>";
    // TODO perl -> print Tr(th [qw(State Cities)]);
    // TODO perl -> for $k (sort keys %hash) {
    // TODO perl -> print Tr(th($k), td( [ sort @{$hash{$k}} ] ));
    // TODO perl -> }
    // TODO perl -> print "</TABLE>";
    // -----------------------------
    // <TABLE> <CAPTION>Cities I Have Known</CAPTION>
    //
    // <TR><TH>State</TH> <TH>Cities</TH></TR>
    //
    // <TR><TH>California</TH> <TD>Berkeley</TD> <TD>Santa Rosa</TD>
    //
    // <TD>Sebastopol</TD> </TR>
    //
    // <TR><TH>Colorado</TH> <TD>Boulder</TD> <TD>Denver</TD>
    //
    // <TD>Fort Collins</TD> </TR>
    //
    // <TR><TH>Texas</TH> <TD>Austin</TD> <TD>Fort Stockton</TD>
    //
    // <TD>Plano</TD></TR>
    //
    // <TR><TH>Wisconsin</TH> <TD>Lake Geneva</TD> <TD>Madison</TD>
    //
    // <TD>Superior</TD></TR>
    //
    // </TABLE>
    // -----------------------------
    // TODO perl -> print table
    // TODO perl -> caption('Cities I have Known'),
    // TODO perl -> Tr(th [qw(State Cities)]),
    // TODO perl -> map { Tr(th($_), td( [ sort @{$hash{$_}} ] )) } sort keys %hash;
    // -----------------------------
    // ^^INCLUDE^^ include/perl/ch19/salcheck
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _08 () {
    // <PLEAC>

    // ^^PLEAC^^_19.8
    // -----------------------------
    // TODO perl -> $url = "http://www.perl.com/CPAN/";
    // TODO perl -> print "Location: $url\n\n";
    // TODO perl -> exit;
    // -----------------------------
    // ^^INCLUDE^^ include/perl/ch19/oreobounce
    // -----------------------------
    // Status: 302 Moved Temporarily
    //
    // Set-Cookie: filling=vanilla%20cr%E4me; domain=.perl.com;
    //
    // expires=Tue, 21-Jul-1998 11:58:55 GMT
    //
    // Date: Tue, 21 Apr 1998 11:55:55 GMT
    //
    // Location: http://somewhere.perl.com/nonesuch.html
    //
    // Content-Type: text/html
    //
    // B<<blank line here>>
    // -----------------------------
    // ^^INCLUDE^^ include/perl/ch19/os_snipe
    // -----------------------------
    // TODO perl -> use CGI qw(:standard);
    // TODO perl -> print header( -STATUS => '204 No response' );
    // -----------------------------
    // Status: 204 No response
    //
    // Content-Type: text/html
    //
    // <blank line here>
    // -----------------------------
    // !/bin/sh
    // TODO perl ->
    // TODO perl -> cat <<EOCAT
    // TODO perl -> Status: 204 No response
    // TODO perl ->
    // TODO perl -> EOCAT
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _09 () {
    // <PLEAC>

    // ^^PLEAC^^_19.9
    // -----------------------------
    // ^^INCLUDE^^ include/perl/ch19/dummyhttpd
    // -----------------------------
    // http://somewhere.com/cgi-bin/whatever
    // -----------------------------
    // http://somewhere.com:8989/cgi-bin/whatever
    // -----------------------------
    // % telnet www.perl.com 80
    // GET /bogotic HTTP/1.0
    //
    // <blank line here>
    //
    // HTTP/1.1 404 File Not Found
    //
    // Date: Tue, 21 Apr 1998 11:25:43 GMT
    //
    // Server: Apache/1.2.4
    //
    // Connection: close
    //
    // Content-Type: text/html
    //
    //
    // <HTML><HEAD>
    //
    // <TITLE>404 File Not Found</TITLE>
    //
    // </HEAD><BODY>
    //
    // <H1>File Not Found</H1>
    //
    // The requested URL /bogotic was not found on this server.<P>
    //
    // </BODY></HTML>
    // -----------------------------
    // TODO perl -> % GET -esuSU http://mox.perl.com/perl/bogotic
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
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _10 () {
    // <PLEAC>

    // ^^PLEAC^^_19.10
    // -----------------------------
    // TODO perl -> $preference_value = cookie("preference name");
    // -----------------------------
    // TODO perl -> $packed_cookie = cookie( -NAME => "preference name",
    // TODO perl -> -VALUE => "whatever you'd like",
    // TODO perl -> -EXPIRES => "+2y");
    // -----------------------------
    // TODO perl -> print header(-COOKIE => $packed_cookie);
    // -----------------------------
    // ^^INCLUDE^^ include/perl/ch19/ic_cookies
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _11 () {
    // <PLEAC>

    // ^^PLEAC^^_19.11
    // -----------------------------
    // TODO perl -> print textfield("SEARCH"); # previous SEARCH value is the default
    // -----------------------------
    // ^^INCLUDE^^ include/perl/ch19/who.cgi
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _12 () {
    // <PLEAC>

    // ^^PLEAC^^_19.12
    // -----------------------------
    // TODO perl -> use CGI qw(:standard);
    // TODO perl -> print hidden("bacon");
    // -----------------------------
    // TODO perl -> print submit(-NAME => ".State", -VALUE => "Checkout");
    // -----------------------------
    // TODO perl -> sub to_page { return submit( -NAME => ".State", -VALUE => shift ) }
    // -----------------------------
    // TODO perl -> $page = param(".State") || "Default";
    // -----------------------------
    // TODO perl -> if ($page eq "Default") {
    // TODO perl -> front_page();
    // TODO perl -> } elsif ($page eq "Checkout") {
    // TODO perl -> checkout();
    // TODO perl -> } else {
    // TODO perl -> no_such_page(); # when we get a .State that doesn't exist
    // TODO perl -> }
    // -----------------------------
    // TODO perl -> %States = (
    // TODO perl -> 'Default' => \&front_page,
    // TODO perl -> 'Shirt' => \&shirt,
    // TODO perl -> 'Sweater' => \&sweater,
    // TODO perl -> 'Checkout' => \&checkout,
    // TODO perl -> 'Card' => \&credit_card,
    // TODO perl -> 'Order' => \&order,
    // TODO perl -> 'Cancel' => \&front_page,
    // TODO perl -> );
    // TODO perl ->
    // TODO perl -> if ($States{$page}) {
    // TODO perl -> $States{$page}->(); # call the correct subroutine
    // TODO perl -> } else {
    // TODO perl -> no_such_page();
    // TODO perl -> }
    // -----------------------------
    // TODO perl -> while (($state, $sub) = each %States) {
    // TODO perl -> $sub->( $page eq $state );
    // TODO perl -> }
    // -----------------------------
    // TODO perl -> sub t_shirt {
    // TODO perl -> my $active = shift;
    // TODO perl ->
    // TODO perl -> unless ($active) {
    // TODO perl -> print hidden("size"), hidden("color");
    // TODO perl -> return;
    // TODO perl -> }
    // TODO perl ->
    // TODO perl -> print p("You want to buy a t-shirt?");
    // TODO perl -> print p("Size: ", popup_menu('size', [ qw(XL L M S XS) ]));
    // TODO perl -> print p("Color:", popup_menu('color', [ qw(Black White) ]));
    // TODO perl ->
    // TODO perl -> print p( to_page("Shoes"), to_page("Checkout") );
    // TODO perl -> }
    // -----------------------------
    // TODO perl -> print header("Program Title"), start_html();
    // TODO perl -> print standard_header(), begin_form();
    // TODO perl -> while (($state, $sub) = each %States) {
    // TODO perl -> $sub->( $page eq $state );
    // TODO perl -> }
    // TODO perl -> print standard_footer(), end_form(), end_html();
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _13 () {
    // <PLEAC>

    // ^^PLEAC^^_19.13
    // -----------------------------
    // first open and exclusively lock the file
    // TODO perl -> open(FH, ">>/tmp/formlog") or die "can't append to formlog: $!";
    // TODO perl -> flock(FH, 2) or die "can't flock formlog: $!";
    // TODO perl ->
    // either using the procedural interface
    // TODO perl -> use CGI qw(:standard);
    // TODO perl -> save_parameters(*FH); # with CGI::save
    // TODO perl ->
    // or using the object interface
    // TODO perl -> use CGI;
    // TODO perl -> $query = CGI->new();
    // TODO perl -> $query->save(*FH);
    // TODO perl ->
    // TODO perl -> close(FH) or die "can't close formlog: $!";
    // -----------------------------
    // TODO perl -> use CGI qw(:standard);
    // TODO perl -> open(MAIL, "|/usr/lib/sendmail -oi -t") or die "can't fork sendmail: $!";
    // TODO perl -> print MAIL <<EOF;
    // TODO perl -> From: $0 (your cgi script)
    // TODO perl -> To: hisname\@hishost.com
    // TODO perl -> Subject: mailed form submission
    // TODO perl ->
    // TODO perl -> EOF
    // TODO perl -> save_parameters(*MAIL);
    // TODO perl -> close(MAIL) or die "can't close sendmail: $!";
    // -----------------------------
    // TODO perl -> param("_timestamp", scalar localtime);
    // TODO perl -> param("_environs", %ENV);
    // -----------------------------
    // TODO perl -> use CGI;
    // TODO perl -> open(FORMS, "< /tmp/formlog") or die "can't read formlog: $!";
    // TODO perl -> flock(FORMS, 1) or die "can't lock formlog: $!";
    // TODO perl -> while ($query = CGI->new(*FORMS)) {
    // TODO perl -> last unless $query->param(); # means end of file
    // TODO perl -> %his_env = $query->param('_environs');
    // TODO perl -> $count += $query->param('items requested')
    // TODO perl -> unless $his_env{REMOTE_HOST} =~ /(^|\.)perl\.com$/
    // TODO perl -> }
    // TODO perl -> print "Total orders: $count\n";
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _14 () {
    // <PLEAC>

    // ^^PLEAC^^_19.14
    // -----------------------------
    // ^^INCLUDE^^ include/perl/ch19/chemiserie
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }
}
