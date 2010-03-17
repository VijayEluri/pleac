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
public class _18 {

  public static void _01 () {
  // <PLEAC>

  // ^^PLEAC^^_18.1
  // -----------------------------
  // TODO perl -> use Socket;
  // TODO perl ->
  // TODO perl -> @addresses = gethostbyname($name) or die "Can't resolve $name: $!\n";
  // TODO perl -> @addresses = map { inet_ntoa($_) } @addresses[4 .. $#addresses];
  // @addresses is a list of IP addresses ("208.201.239.48", "208.201.239.49")
  // -----------------------------
  // TODO perl -> use Socket;
  // TODO perl ->
  // TODO perl -> $address = inet_ntoa(inet_aton($name));
  // $address is a single IP address "208.201.239.48"
  // -----------------------------
  // TODO perl -> use Socket;
  // TODO perl ->
  // TODO perl -> $name = gethostbyaddr(inet_aton($address), AF_INET)
  // TODO perl -> or die "Can't resolve $address: $!\n";
  // $name is the hostname ("www.perl.com")
  // -----------------------------
  // TODO perl -> use Socket;
  // TODO perl -> $packed_address = inet_aton("208.146.140.1");
  // TODO perl -> $ascii_address = inet_ntoa($packed_address);
  // -----------------------------
  // TODO perl -> $packed = gethostbyname($hostname)
  // TODO perl -> or die "Couldn't resolve address for $hostname: $!\n";
  // TODO perl -> $address = inet_ntoa($packed);
  // TODO perl -> print "I will use $address as the address for $hostname\n";
  // -----------------------------
  // $address is the IP address I'm checking, like "128.138.243.20"
  // TODO perl -> use Socket;
  // TODO perl -> $name = gethostbyaddr(inet_aton($address), AF_INET)
  // TODO perl -> or die "Can't look up $address : $!\n";
  // TODO perl -> @addr = gethostbyname($name)
  // TODO perl -> or die "Can't look up $name : $!\n";
  // TODO perl -> $found = grep { $address eq inet_ntoa($_) } @addr[4..$#addr];
  // -----------------------------
  // ^^INCLUDE^^ include/perl/ch18/mxhost
  // -----------------------------
  // % mxhost cnn.com
  // 10 mail.turner.com
  //
  // 30 alfw2.turner.com
  // -----------------------------
  // ^^INCLUDE^^ include/perl/ch18/hostaddrs
  // -----------------------------
  // % hostaddrs www.ora.com
  // helio.ora.com => 204.148.40.9
  //
  //
  // % hostaddrs www.whitehouse.gov
  // www.whitehouse.gov => 198.137.240.91 198.137.240.92
  // -----------------------------
  // TODO perl ->
  // </PLEAC>
  }

  public static void _02 () {
  // <PLEAC>

  // ^^PLEAC^^_18.2
  // -----------------------------
  // TODO perl -> use Net::FTP;
  // TODO perl ->
  // TODO perl -> $ftp = Net::FTP->new("ftp.host.com") or die "Can't connect: $@\n";
  // TODO perl -> $ftp->login($username, $password) or die "Couldn't login\n";
  // TODO perl -> $ftp->cwd($directory) or die "Couldn't change directory\n";
  // TODO perl -> $ftp->get($filename) or die "Couldn't get $filename\n";
  // TODO perl -> $ftp->put($filename) or die "Couldn't put $filename\n";
  // -----------------------------
  // TODO perl -> $ftp = Net::FTP->new("ftp.host.com",
  // TODO perl -> Timeout => 30,
  // TODO perl -> Debug => 1)
  // TODO perl -> or die "Can't connect: $@\n";
  // -----------------------------
  // TODO perl -> $ftp->
  // TODO perl -> login()
  // TODO perl ->
  // TODO perl -> or die "Couldn't authenticate.\n";
  // TODO perl ->
  // TODO perl -> $ftp->login($username)
  // TODO perl -> or die "Still couldn't authenticate.\n";
  // TODO perl ->
  // TODO perl -> $ftp->login($username, $password)
  // TODO perl -> or die "Couldn't authenticate, even with explicit username
  // TODO perl -> and password.\n";
  // TODO perl ->
  // TODO perl -> $ftp->login($username, $password, $account)
  // TODO perl -> or die "No dice.  It hates me.\n";
  // -----------------------------
  // TODO perl -> $ftp->put($localfile, $remotefile)
  // TODO perl -> or die "Can't send $localfile: $!\n";
  // -----------------------------
  // TODO perl -> $ftp->put(*STDIN, $remotefile)
  // TODO perl -> or die "Can't send from STDIN: $!\n";
  // -----------------------------
  // TODO perl -> $ftp->get($remotefile, $localfile)
  // TODO perl -> or die "Can't fetch $remotefile : $!\n";
  // -----------------------------
  // TODO perl -> $ftp->get($remotefile, *STDOUT)
  // TODO perl -> or die "Can't fetch $remotefile: $!\n";
  // -----------------------------
  // TODO perl -> $ftp->cwd("/pub/perl/CPAN/images/g-rated");
  // TODO perl -> print "I'm in the directory ", $ftp->pwd(), "\n";
  // -----------------------------
  // TODO perl -> $ftp->mkdir("/pub/gnat/perl", 1)
  // TODO perl -> or die "Can't create /pub/gnat/perl recursively: $!\n";
  // -----------------------------
  // TODO perl -> @lines = $ftp->ls("/pub/gnat/perl")
  // TODO perl -> or die "Can't get a list of files in /pub/gnat/perl: $!";
  // TODO perl -> $ref_to_lines = $ftp->dir("/pub/perl/CPAN/src/latest.tar.gz")
  // TODO perl -> or die "Can't check status of latest.tar.gz: $!\n";
  // -----------------------------
  // TODO perl -> $ftp->quit() or warn "Couldn't quit.  Oh well.\n";
  // -----------------------------
  // TODO perl ->
  // </PLEAC>
  }

  public static void _03 () {
  // <PLEAC>

  // ^^PLEAC^^_18.3
  // -----------------------------
  // TODO perl -> use Mail::Mailer;
  // TODO perl ->
  // TODO perl -> $mailer = Mail::Mailer->new("sendmail");
  // TODO perl -> $mailer->open({ From => $from_address,
  // TODO perl -> To => $to_address,
  // TODO perl -> Subject => $subject,
  // TODO perl -> })
  // TODO perl -> or die "Can't open: $!\n";
  // TODO perl -> print $mailer $body;
  // TODO perl -> $mailer->
  // TODO perl -> close();
  // -----------------------------
  // TODO perl -> open(SENDMAIL, "|/usr/lib/sendmail -oi -t -odq")
  // TODO perl -> or die "Can't fork for sendmail: $!\n";
  // TODO perl -> print SENDMAIL <<"EOF";
  // TODO perl -> From: User Originating Mail <me\@host>
  // TODO perl -> To: Final Destination <you\@otherhost>
  // TODO perl -> Subject: A relevant subject line
  // TODO perl ->
  // TODO perl -> Body of the message goes here, in as many lines as you like.
  // TODO perl -> EOF
  // TODO perl -> close(SENDMAIL) or warn "sendmail didn't close nicely";
  // -----------------------------
  // TODO perl -> $mailer = Mail::Mailer->new("sendmail");
  // -----------------------------
  // TODO perl -> $mailer = Mail::Mailer->new("mail", "/u/gnat/bin/funkymailer");
  // -----------------------------
  // TODO perl -> $mailer = Mail::Mailer->new("smtp", "mail.myisp.com");
  // -----------------------------
  // TODO perl -> eval {
  // TODO perl -> $mailer = Mail::Mailer->new("bogus", "arguments");
  // TODO perl -> # ...
  // TODO perl -> };
  // TODO perl -> if ($@) {
  // TODO perl -> # the eval failed
  // TODO perl -> print "Couldn't send mail: $@\n";
  // TODO perl -> } else {
  // TODO perl -> # the eval succeeded
  // TODO perl -> print "The authorities have been notified.\n";
  // TODO perl -> }
  // -----------------------------
  // TODO perl -> $mailer->open( 'From' => 'Nathan Torkington <gnat@frii.com>',
  // TODO perl -> 'To' => 'Tom Christiansen <tchrist@perl.com>',
  // TODO perl -> 'Subject' => 'The Perl Cookbook' );
  // -----------------------------
  // TODO perl -> print $mailer <<EO_SIG;
  // TODO perl -> Are we ever going to finish this book?
  // TODO perl -> My wife is threatening to leave me.
  // TODO perl -> She says I love EMACS more than I love her.
  // TODO perl -> Do you have a recipe that can help me?
  // TODO perl ->
  // TODO perl -> Nat
  // TODO perl -> EO_SIG
  // -----------------------------
  // TODO perl -> close($mailer) or die "can't close mailer: $!";
  // -----------------------------
  // TODO perl -> open(SENDMAIL, "|/usr/sbin/sendmail -oi -t -odq")
  // TODO perl -> or die "Can't fork for sendmail: $!\n";
  // TODO perl -> print SENDMAIL <<"EOF";
  // TODO perl -> From: Tom Christiansen <tchrist\@perl.com>
  // TODO perl -> To: Nathan Torkington <gnat\@frii.com>
  // TODO perl -> Subject: Re: The Perl Cookbook
  // TODO perl ->
  // TODO perl -> (1) We will never finish the book.
  // TODO perl -> (2) No man who uses EMACS is deserving of love.
  // TODO perl -> (3) I recommend coq au vi.
  // TODO perl ->
  // TODO perl -> tom
  // TODO perl -> EOF
  // TODO perl -> close(SENDMAIL);
  // -----------------------------
  // TODO perl ->
  // </PLEAC>
  }

  public static void _04 () {
  // <PLEAC>

  // ^^PLEAC^^_18.4
  // -----------------------------
  // TODO perl -> use Net::NNTP;
  // TODO perl ->
  // TODO perl -> $server = Net::NNTP->new("news.host.dom")
  // TODO perl -> or die "Can't connect to news server: $@\n";
  // TODO perl -> ($narticles, $first, $last, $name) = $server->group( "misc.test" )
  // TODO perl -> or die "Can't select misc.test\n";
  // TODO perl -> $headers = $server->head($first)
  // TODO perl -> or die "Can't get headers from article $first in $name\n";
  // TODO perl -> $bodytext = $server->body($first)
  // TODO perl -> or die "Can't get body from article $first in $name\n";
  // TODO perl -> $article = $server->article($first)
  // TODO perl -> or die "Can't get article $first from $name\n";
  // TODO perl ->
  // TODO perl -> $server->
  // TODO perl -> postok()
  // TODO perl ->
  // TODO perl -> or warn "Server didn't tell me I could post.\n";
  // TODO perl ->
  // TODO perl -> $server->post( [ @lines ] )
  // TODO perl -> or die "Can't post: $!\n";
  // -----------------------------
  // TODO perl -> <0401@jpl-devvax.JPL.NASA.GOV>
  // -----------------------------
  // TODO perl -> $server = Net::NNTP->new("news.mycompany.com")
  // TODO perl -> or die "Couldn't connect to news.mycompany.com: $@\n";
  // -----------------------------
  // TODO perl -> $grouplist = $server->
  // TODO perl -> list()
  // TODO perl ->
  // TODO perl -> or die "Couldn't fetch group list\n";
  // TODO perl ->
  // TODO perl -> foreach $group (keys %$grouplist) {
  // TODO perl -> if ($grouplist->{$group}->[2] eq 'y') {
  // TODO perl -> # I can post to $group
  // TODO perl -> }
  // TODO perl -> }
  // -----------------------------
  // TODO perl -> ($narticles, $first, $last, $name) = $server->group("comp.lang.perl.misc")
  // TODO perl -> or die "Can't select comp.lang.perl.misc\n";
  // -----------------------------
  // TODO perl -> @lines = $server->article($message_id)
  // TODO perl -> or die "Can't fetch article $message_id: $!\n";
  // -----------------------------
  // TODO perl -> @group = $server->group("comp.lang.perl.misc")
  // TODO perl -> or die "Can't select group comp.lang.perl.misc\n";
  // TODO perl -> @lines = $server->head($group[1])
  // TODO perl -> or die "Can't get headers from first article in comp.lang.perl.misc\n";
  // -----------------------------
  // TODO perl -> $server->post(@message)
  // TODO perl -> or die "Can't post\n";
  // -----------------------------
  // TODO perl -> unless ($server->
  // TODO perl -> postok()
  // TODO perl -> ) {
  // TODO perl -> warn "You may not post.\n";
  // TODO perl -> }
  // -----------------------------
  // TODO perl ->
  // </PLEAC>
  }

  public static void _05 () {
  // <PLEAC>

  // ^^PLEAC^^_18.5
  // -----------------------------
  // TODO perl -> $pop = Net::POP3->new($mail_server)
  // TODO perl -> or die "Can't open connection to $mail_server : $!\n";
  // TODO perl -> defined ($pop->login($username, $password))
  // TODO perl -> or die "Can't authenticate: $!\n";
  // TODO perl -> $messages = $pop->list
  // TODO perl -> or die "Can't get list of undeleted messages: $!\n";
  // TODO perl -> foreach $msgid (keys %$messages) {
  // TODO perl -> $message = $pop->get($msgid);
  // TODO perl -> unless (defined $message) {
  // TODO perl -> warn "Couldn't fetch $msgid from server: $!\n";
  // TODO perl -> next;
  // TODO perl -> }
  // TODO perl -> # $message is a reference to an array of lines
  // TODO perl -> $pop->delete($msgid);
  // TODO perl -> }
  // -----------------------------
  // TODO perl -> $pop = Net::POP3->new( "pop.myisp.com" )
  // TODO perl -> or die "Can't connect to pop.myisp.com: $!\n";
  // -----------------------------
  // TODO perl -> $pop = Net::POP3->new( "pop.myisp.com",
  // TODO perl -> Timeout => 30 )
  // TODO perl -> or die "Can't connect to pop.myisp.com : $!\n";
  // -----------------------------
  // TODO perl -> defined ($pop->login("gnat", "S33kr1T Pa55w0rD"))
  // TODO perl -> or die "Hey, my username and password didn't work!\n";
  // TODO perl ->
  // TODO perl -> defined ($pop->login( "midget" )) # use Net::Netrc to find password
  // TODO perl -> or die "Authentication failed.\n";
  // TODO perl ->
  // TODO perl -> defined ($pop->
  // TODO perl -> login())
  // TODO perl -> # current username and Net::Netrc
  // TODO perl -> or die "Authentication failed.  Miserably.\n";
  // -----------------------------
  // TODO perl -> $pop->apop( $username, $password )
  // TODO perl -> or die "Couldn't authenticate: $!\n";
  // -----------------------------
  // TODO perl -> %undeleted = $pop->
  // TODO perl -> list();
  // TODO perl ->
  // TODO perl -> foreach $msgnum (keys %undeleted) {
  // TODO perl -> print "Message $msgnum is $undeleted{$msgnum} bytes long.\n";
  // TODO perl -> }
  // -----------------------------
  // TODO perl -> print "Retrieving $msgnum : ";
  // TODO perl -> $message = $pop->get($msgnum);
  // TODO perl -> if ($message) {
  // TODO perl -> # succeeded
  // TODO perl -> print "\n";
  // TODO perl -> print @$message; # print the message
  // TODO perl -> } else {
  // TODO perl -> # failed
  // TODO perl -> print "failed ($!)\n";
  // TODO perl -> }
  // -----------------------------
  // TODO perl ->
  // </PLEAC>
  }

  public static void _06 () {
  // <PLEAC>

  // ^^PLEAC^^_18.6
  // -----------------------------
  // TODO perl -> use Net::Telnet;
  // TODO perl ->
  // TODO perl -> $t = Net::Telnet->new( Timeout => 10,
  // TODO perl -> Prompt => '/%/',
  // TODO perl -> Host => $hostname );
  // TODO perl ->
  // TODO perl -> $t->login($username, $password);
  // TODO perl -> @files = $t->cmd("ls");
  // TODO perl -> $t->print("top");
  // TODO perl -> (undef, $process_string) = $t->waitfor('/\d+ processes/');
  // TODO perl -> $t->close;
  // -----------------------------
  // TODO perl -> /[\$%#>] $/
  // -----------------------------
  // TODO perl -> $telnet = Net::Telnet->new( Errmode => sub { main::log(@_) }, ... );
  // -----------------------------
  // TODO perl -> $telnet->login($username, $password)
  // TODO perl -> or die "Login failed: @{[ $telnet->errmsg() ]}\n";
  // -----------------------------
  // TODO perl -> $telnet->waitfor('/--more--/')
  // -----------------------------
  // TODO perl -> $telnet->waitfor(String => 'greasy smoke', Timeout => 30)
  // -----------------------------
  // TODO perl ->
  // </PLEAC>
  }

  public static void _07 () {
  // <PLEAC>

  // ^^PLEAC^^_18.7
  // -----------------------------
  // TODO perl -> use Net::Ping;
  // TODO perl ->
  // TODO perl -> $p = Net::Ping->new()
  // TODO perl -> or die "Can't create new ping object: $!\n";
  // TODO perl -> print "$host is alive" if $p->ping($host);
  // TODO perl -> $p->close;
  // -----------------------------
  // use TCP if we're not root, ICMP if we are
  // TODO perl -> $pong = Net::Ping->new( $> ? "tcp" : "icmp" );
  // TODO perl ->
  // TODO perl -> (defined $pong)
  // TODO perl -> or die "Couldn't create Net::Ping object: $!\n";
  // TODO perl ->
  // TODO perl -> if ($pong->ping("kingkong.com")) {
  // TODO perl -> print "The giant ape lives!\n";
  // TODO perl -> } else {
  // TODO perl -> print "All hail mighty Gamera, friend of children!\n";
  // TODO perl -> }
  // -----------------------------
  // TODO perl ->
  // </PLEAC>
  }

  public static void _08 () {
  // <PLEAC>

  // ^^PLEAC^^_18.8
  // -----------------------------
  // TODO perl -> use Net::Whois;
  // TODO perl ->
  // TODO perl -> $domain_obj = Net::Whois::Domain->new($domain_name)
  // TODO perl -> or die "Couldn't get information on $domain_name: $!\n";
  // TODO perl ->
  // call methods on $domain_obj to get name, tag, address, etc.
  // -----------------------------
  // TODO perl -> $d = Net::Whois::Domain->new( "perl.org" )
  // TODO perl -> or die "Can't get information on perl.org\n";
  // -----------------------------
  // TODO perl -> print "The domain is called ", $d->domain, "\n";
  // TODO perl -> print "Its tag is ", $d->tag, "\n";
  // -----------------------------
  // TODO perl -> print "Mail for ", $d->name, " should be sent to:\n";
  // TODO perl -> print map { "\t$_\n" } $d->address;
  // TODO perl -> print "\t", $d->country, "\n";
  // -----------------------------
  // TODO perl -> $contact_hash = $d->contacts;
  // TODO perl -> if ($contact_hash) {
  // TODO perl -> print "Contacts:\n";
  // TODO perl -> foreach $type (sort keys %$contact_hash) {
  // TODO perl -> print "  $type:\n";
  // TODO perl -> foreach $line (@{$contact_hash->{$type}}) {
  // TODO perl -> print "    $line\n";
  // TODO perl -> }
  // TODO perl -> }
  // TODO perl -> } else {
  // TODO perl -> print "No contact information.\n";
  // TODO perl -> }
  // -----------------------------
  // TODO perl ->
  // </PLEAC>
  }

  public static void _09 () {
  // <PLEAC>

  // ^^PLEAC^^_18.9
  // -----------------------------
  // % cat > expn
  // !/usr/bin/perl -w
  // ...
  // ^D
  // % ln expn vrfy
  // -----------------------------
  // % expn gnat@frii.com
  // Expanding gnat at frii.com (gnat@frii.com):
  //
  // calisto.frii.com Hello coprolith.frii.com [207.46.130.14],
  //
  // pleased to meet you
  //
  // <gnat@mail.frii.com>
  // -----------------------------
  // % expn gnat@frii.com
  // Expanding gnat at mail.frii.net (gnat@frii.com):
  //
  // deimos.frii.com Hello coprolith.frii.com [207.46.130.14],
  //
  // pleased to meet you
  //
  // Nathan Torkington <gnat@deimos.frii.com>
  //
  //
  // Expanding gnat at mx1.frii.net (gnat@frii.com):
  //
  // phobos.frii.com Hello coprolith.frii.com [207.46.130.14],
  //
  // pleased to meet you
  //
  // <gnat@mail.frii.com>
  //
  //
  // E
  // xpanding gnat at mx2.frii.net (gnat@frii.com):
  //
  // europa.frii.com Hello coprolith.frii.com [207.46.130.14],
  //
  // pleased to meet you
  //
  // <gnat@mail.frii.com>
  //
  //
  // Expanding gnat at mx3.frii.net (gnat@frii.com):
  //
  // ns2.winterlan.com Hello coprolith.frii.com [207.46.130.14],
  //
  // pleased to meet you
  //
  // 550 gnat... User unknown
  // -----------------------------
  // ^^INCLUDE^^ include/perl/ch18/expn
  // -----------------------------
  // TODO perl ->
  // </PLEAC>
  }
}
