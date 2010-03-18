package org.nicerobot.pleac;

/**
 * @author nicerobot
 * 
 */

// ^^PLEAC^^_18.1
//-----------------------------
// TODO use Socket;

// TODO @addresses = gethostbyname($name)   or die "Can't resolve $name: $!\n";
// TODO @addresses = map { inet_ntoa($_) } @addresses[4 .. $#addresses];
// @addresses is a list of IP addresses ("208.201.239.48", "208.201.239.49")
//-----------------------------
// TODO use Socket;

// TODO $address = inet_ntoa(inet_aton($name));
// $address is a single IP address "208.201.239.48"
//-----------------------------
// TODO use Socket;

// TODO $name = gethostbyaddr(inet_aton($address), AF_INET)
// TODO             or die "Can't resolve $address: $!\n";
// $name is the hostname ("www.perl.com")
//-----------------------------
// TODO use Socket;
// TODO $packed_address = inet_aton("208.146.140.1");
// TODO $ascii_address  = inet_ntoa($packed_address);
//-----------------------------
// TODO $packed = gethostbyname($hostname)
// TODO             or die "Couldn't resolve address for $hostname: $!\n";
// TODO $address = inet_ntoa($packed);
// TODO print "I will use $address as the address for $hostname\n";
//-----------------------------
// $address is the IP address I'm checking, like "128.138.243.20"
// TODO use Socket;
// TODO $name    = gethostbyaddr(inet_aton($address), AF_INET)
// TODO                 or die "Can't look up $address : $!\n";
// TODO @addr    = gethostbyname($name)
// TODO                 or die "Can't look up $name : $!\n";
// TODO $found   = grep { $address eq inet_ntoa($_) } @addr[4..$#addr];
//-----------------------------
// ^^INCLUDE^^ include/perl/ch18/mxhost
//-----------------------------
//% mxhost cnn.com
//10 mail.turner.com
//
//30 alfw2.turner.com
//-----------------------------
// ^^INCLUDE^^ include/perl/ch18/hostaddrs
//-----------------------------
//% hostaddrs www.ora.com
//helio.ora.com => 204.148.40.9
//
//
//% hostaddrs www.whitehouse.gov
//www.whitehouse.gov => 198.137.240.91 198.137.240.92
//-----------------------------

// ^^PLEAC^^_18.2
//-----------------------------
// TODO use Net::FTP;

// TODO $ftp = Net::FTP->new("ftp.host.com")    or die "Can't connect: $@\n";
// TODO $ftp->login($username, $password)       or die "Couldn't login\n";
// TODO $ftp->cwd($directory)                   or die "Couldn't change directory\n";
// TODO $ftp->get($filename)                    or die "Couldn't get $filename\n";
// TODO $ftp->put($filename)                    or die "Couldn't put $filename\n";
//-----------------------------
// TODO $ftp = Net::FTP->new("ftp.host.com",
// TODO                      Timeout => 30,
// TODO                      Debug   => 1)
// TODO     or die "Can't connect: $@\n";
//-----------------------------
// TODO $ftp->
// TODO login()

// TODO     or die "Couldn't authenticate.\n";

// TODO $ftp->login($username)
// TODO     or die "Still couldn't authenticate.\n";

// TODO $ftp->login($username, $password)
// TODO     or die "Couldn't authenticate, even with explicit username
// TODO             and password.\n";

// TODO $ftp->login($username, $password, $account)
// TODO     or die "No dice.  It hates me.\n";
//-----------------------------
// TODO $ftp->put($localfile, $remotefile)
// TODO     or die "Can't send $localfile: $!\n";
//-----------------------------
// TODO $ftp->put(*STDIN, $remotefile)
// TODO     or die "Can't send from STDIN: $!\n";
//-----------------------------
// TODO $ftp->get($remotefile, $localfile)
// TODO     or die "Can't fetch $remotefile : $!\n";
//-----------------------------
// TODO $ftp->get($remotefile, *STDOUT)
// TODO     or die "Can't fetch $remotefile: $!\n";
//-----------------------------
// TODO $ftp->cwd("/pub/perl/CPAN/images/g-rated");
// TODO print "I'm in the directory ", $ftp->pwd(), "\n";
//-----------------------------
// TODO    $ftp->mkdir("/pub/gnat/perl", 1)
// TODO     or die "Can't create /pub/gnat/perl recursively: $!\n";
//-----------------------------
// TODO @lines = $ftp->ls("/pub/gnat/perl")
// TODO     or die "Can't get a list of files in /pub/gnat/perl: $!";
// TODO $ref_to_lines = $ftp->dir("/pub/perl/CPAN/src/latest.tar.gz")
// TODO     or die "Can't check status of latest.tar.gz: $!\n";
//-----------------------------
// TODO $ftp->quit()    or warn "Couldn't quit.  Oh well.\n";
//-----------------------------

// ^^PLEAC^^_18.3
//-----------------------------
// TODO use Mail::Mailer;

// TODO $mailer = Mail::Mailer->new("sendmail");
// TODO $mailer->open({ From    => $from_address,
// TODO                 To      => $to_address,
// TODO                 Subject => $subject,
// TODO               })
// TODO     or die "Can't open: $!\n";
// TODO print $mailer $body;
// TODO $mailer->
// TODO close();
//-----------------------------
// TODO open(SENDMAIL, "|/usr/lib/sendmail -oi -t -odq")
// TODO                     or die "Can't fork for sendmail: $!\n";
// TODO print SENDMAIL <<"EOF";
// TODO From: User Originating Mail <me\@host>
// TODO To: Final Destination <you\@otherhost>
// TODO Subject: A relevant subject line

// TODO Body of the message goes here, in as many lines as you like.
// TODO EOF
// TODO close(SENDMAIL)     or warn "sendmail didn't close nicely";
//-----------------------------
// TODO $mailer = Mail::Mailer->new("sendmail");
//-----------------------------
// TODO $mailer = Mail::Mailer->new("mail", "/u/gnat/bin/funkymailer");
//-----------------------------
// TODO $mailer = Mail::Mailer->new("smtp", "mail.myisp.com");
//-----------------------------
// TODO eval {
// TODO     $mailer = Mail::Mailer->new("bogus", "arguments");
// TODO     # ...
// TODO };
// TODO if ($@) {
// TODO     # the eval failed
// TODO     print "Couldn't send mail: $@\n";
// TODO } else {
// TODO     # the eval succeeded
// TODO     print "The authorities have been notified.\n";
// TODO }
//-----------------------------
// TODO $mailer->open( 'From'    => 'Nathan Torkington <gnat@frii.com>',
// TODO                'To'      => 'Tom Christiansen <tchrist@perl.com>',
// TODO                'Subject' => 'The Perl Cookbook' );
//-----------------------------
// TODO print $mailer <<EO_SIG;
// TODO Are we ever going to finish this book?
// TODO My wife is threatening to leave me.
// TODO She says I love EMACS more than I love her.
// TODO Do you have a recipe that can help me?

// TODO Nat
// TODO EO_SIG
//-----------------------------
// TODO close($mailer)                      or die "can't close mailer: $!";
//-----------------------------
// TODO open(SENDMAIL, "|/usr/sbin/sendmail -oi -t -odq")
// TODO             or die "Can't fork for sendmail: $!\n";
// TODO print SENDMAIL <<"EOF";
// TODO From: Tom Christiansen <tchrist\@perl.com>
// TODO To: Nathan Torkington <gnat\@frii.com>
// TODO Subject: Re: The Perl Cookbook

// TODO (1) We will never finish the book.
// TODO (2) No man who uses EMACS is deserving of love.
// TODO (3) I recommend coq au vi.

// TODO tom
// TODO EOF
// TODO close(SENDMAIL);
//-----------------------------

// ^^PLEAC^^_18.4
//-----------------------------
// TODO use Net::NNTP;

// TODO $server = Net::NNTP->new("news.host.dom")
// TODO     or die "Can't connect to news server: $@\n";
// TODO ($narticles, $first, $last, $name) = $server->group( "misc.test" )
// TODO     or die "Can't select misc.test\n";
// TODO $headers  = $server->head($first)
// TODO     or die "Can't get headers from article $first in $name\n";
// TODO $bodytext = $server->body($first)
// TODO     or die "Can't get body from article $first in $name\n";
// TODO $article  = $server->article($first)
// TODO     or die "Can't get article $first from $name\n";

// TODO $server->
// TODO postok()

// TODO     or warn "Server didn't tell me I could post.\n";

// TODO $server->post( [ @lines ] )
// TODO     or die "Can't post: $!\n";
//-----------------------------
// TODO <0401@jpl-devvax.JPL.NASA.GOV>
//-----------------------------
// TODO $server = Net::NNTP->new("news.mycompany.com")
// TODO     or die "Couldn't connect to news.mycompany.com: $@\n";
//-----------------------------
// TODO $grouplist = $server->
// TODO list()

// TODO     or die "Couldn't fetch group list\n";

// TODO foreach $group (keys %$grouplist) {
// TODO     if ($grouplist->{$group}->[2] eq 'y') {
// TODO         # I can post to $group
// TODO     }
// TODO }
//-----------------------------
// TODO ($narticles, $first, $last, $name) = $server->group("comp.lang.perl.misc")
// TODO     or die "Can't select comp.lang.perl.misc\n";
//-----------------------------
// TODO @lines = $server->article($message_id)
// TODO     or die "Can't fetch article $message_id: $!\n";
//-----------------------------
// TODO @group = $server->group("comp.lang.perl.misc")
// TODO     or die "Can't select group comp.lang.perl.misc\n";
// TODO @lines = $server->head($group[1])
// TODO     or die "Can't get headers from first article in comp.lang.perl.misc\n";
//-----------------------------
// TODO $server->post(@message)
// TODO     or die "Can't post\n";
//-----------------------------
// TODO unless ($server->
// TODO postok()
// TODO ) {
// TODO     warn "You may not post.\n";
// TODO }
//-----------------------------

// ^^PLEAC^^_18.5
//-----------------------------
// TODO $pop = Net::POP3->new($mail_server)
// TODO     or die "Can't open connection to $mail_server : $!\n";
// TODO defined ($pop->login($username, $password))
// TODO     or die "Can't authenticate: $!\n";
// TODO $messages = $pop->list
// TODO     or die "Can't get list of undeleted messages: $!\n";
// TODO foreach $msgid (keys %$messages) {
// TODO     $message = $pop->get($msgid);
// TODO     unless (defined $message) {
// TODO         warn "Couldn't fetch $msgid from server: $!\n";
// TODO         next;
// TODO     }
// TODO     # $message is a reference to an array of lines
// TODO     $pop->delete($msgid);
// TODO }
//-----------------------------
// TODO $pop = Net::POP3->new( "pop.myisp.com" )
// TODO     or die "Can't connect to pop.myisp.com: $!\n";
//-----------------------------
// TODO $pop = Net::POP3->new( "pop.myisp.com",
// TODO                        Timeout => 30 )
// TODO     or die "Can't connect to pop.myisp.com : $!\n";
//-----------------------------
// TODO defined ($pop->login("gnat", "S33kr1T Pa55w0rD"))
// TODO     or die "Hey, my username and password didn't work!\n";

// TODO defined ($pop->login( "midget" ))           # use Net::Netrc to find password
// TODO     or die "Authentication failed.\n";

// TODO defined ($pop->
// TODO login())
// TODO                      # current username and Net::Netrc
// TODO     or die "Authentication failed.  Miserably.\n";
//-----------------------------
// TODO $pop->apop( $username, $password )
// TODO     or die "Couldn't authenticate: $!\n";
//-----------------------------
// TODO %undeleted = $pop->
// TODO list();

// TODO foreach $msgnum (keys %undeleted) {
// TODO     print "Message $msgnum is $undeleted{$msgnum} bytes long.\n";
// TODO }
//-----------------------------
// TODO print "Retrieving $msgnum : ";
// TODO $message = $pop->get($msgnum);
// TODO if ($message) {
// TODO     # succeeded
// TODO     print "\n";
// TODO     print @$message;                # print the message
// TODO } else {
// TODO         # failed
// TODO     print "failed ($!)\n";
// TODO }
//-----------------------------

// ^^PLEAC^^_18.6
//-----------------------------
// TODO use Net::Telnet;

// TODO $t = Net::Telnet->new( Timeout => 10,
// TODO                        Prompt  => '/%/',
// TODO                        Host    => $hostname );

// TODO $t->login($username, $password);
// TODO @files = $t->cmd("ls");
// TODO $t->print("top");
// TODO (undef, $process_string) = $t->waitfor('/\d+ processes/');
// TODO $t->close;
//-----------------------------
/[\$%#>] $/
//-----------------------------
// TODO $telnet = Net::Telnet->new( Errmode => sub { main::log(@_) }, ... );
//-----------------------------
// TODO $telnet->login($username, $password)
// TODO     or die "Login failed: @{[ $telnet->errmsg() ]}\n";
//-----------------------------
// TODO $telnet->waitfor('/--more--/')
//-----------------------------
// TODO $telnet->waitfor(String => 'greasy smoke', Timeout => 30)
//-----------------------------

// ^^PLEAC^^_18.7
//-----------------------------
// TODO use Net::Ping;

// TODO $p = Net::Ping->new()
// TODO     or die "Can't create new ping object: $!\n";
// TODO print "$host is alive" if $p->ping($host);
// TODO $p->close;
//-----------------------------
// use TCP if we're not root, ICMP if we are
// TODO $pong = Net::Ping->new( $> ? "tcp" : "icmp" );

// TODO (defined $pong)
// TODO     or die "Couldn't create Net::Ping object: $!\n";

// TODO if ($pong->ping("kingkong.com")) {
// TODO     print "The giant ape lives!\n";
// TODO } else {
// TODO     print "All hail mighty Gamera, friend of children!\n";
// TODO }
//-----------------------------

// ^^PLEAC^^_18.8
//-----------------------------
// TODO use Net::Whois;

// TODO $domain_obj = Net::Whois::Domain->new($domain_name)
// TODO     or die "Couldn't get information on $domain_name: $!\n";

// call methods on $domain_obj to get name, tag, address, etc.
//-----------------------------
// TODO $d = Net::Whois::Domain->new( "perl.org" )
// TODO     or die "Can't get information on perl.org\n";
//-----------------------------
// TODO print "The domain is called ", $d->domain, "\n";
// TODO print "Its tag is ", $d->tag, "\n";
//-----------------------------
// TODO print "Mail for ", $d->name, " should be sent to:\n";
// TODO print map { "\t$_\n" } $d->address;
// TODO print "\t", $d->country, "\n";
//-----------------------------
// TODO $contact_hash = $d->contacts;
// TODO if ($contact_hash) {
// TODO     print "Contacts:\n";
// TODO     foreach $type (sort keys %$contact_hash) {
// TODO         print "  $type:\n";
// TODO         foreach $line (@{$contact_hash->{$type}}) {
// TODO             print "    $line\n";
// TODO         }
// TODO     }
// TODO } else {
// TODO     print "No contact information.\n";
// TODO }
//-----------------------------

// ^^PLEAC^^_18.9
//-----------------------------
//% cat > expn
//!/usr/bin/perl -w
//...
//^D
//% ln expn vrfy
//-----------------------------
//% expn gnat@frii.com
//Expanding gnat at frii.com (gnat@frii.com):
//
//calisto.frii.com Hello coprolith.frii.com [207.46.130.14],
//
//    pleased to meet you
//
//<gnat@mail.frii.com>
//-----------------------------
//% expn gnat@frii.com
//Expanding gnat at mail.frii.net (gnat@frii.com):
//
//deimos.frii.com Hello coprolith.frii.com [207.46.130.14],
//
//    pleased to meet you
//
//Nathan Torkington <gnat@deimos.frii.com>
//
//
//Expanding gnat at mx1.frii.net (gnat@frii.com):
//
//phobos.frii.com Hello coprolith.frii.com [207.46.130.14],
//
//    pleased to meet you
//
//<gnat@mail.frii.com>
//
//
//E
//xpanding gnat at mx2.frii.net (gnat@frii.com):
//
//europa.frii.com Hello coprolith.frii.com [207.46.130.14],
//
//    pleased to meet you
//
//<gnat@mail.frii.com>
//
//
//Expanding gnat at mx3.frii.net (gnat@frii.com):
//
//ns2.winterlan.com Hello coprolith.frii.com [207.46.130.14],
//
//    pleased to meet you
//
//550 gnat... User unknown
//-----------------------------
// ^^INCLUDE^^ include/perl/ch18/expn
//-----------------------------
