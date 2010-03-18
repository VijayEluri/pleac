package org.nicerobot.pleac;

/**
 * @author nicerobot
 * 
 */

// ^^PLEAC^^_17.0
//-----------------------------
// TODO use Socket;

// TODO $packed_ip   = inet_aton("208.146.240.1");
// TODO $socket_name = sockaddr_in($port, $packed_ip);
//-----------------------------
// TODO use Socket;

// TODO $socket_name = sockaddr_un("/tmp/mysock");
//-----------------------------
// TODO ($port, $packed_ip) = sockaddr_in($socket_name);    # for PF_INET sockets
// TODO ($filename)         = sockaddr_un($socket_name);    # for PF_UNIX sockets
//-----------------------------
// TODO $ip_address = inet_ntoa($packed_ip);
// TODO $packed_ip  = inet_aton("204.148.40.9");
// TODO $packed_ip  = inet_aton("www.oreilly.com");
//-----------------------------

// ^^PLEAC^^_17.1
//-----------------------------
// TODO use IO::Socket;

// TODO $socket = IO::Socket::INET->new(PeerAddr => $remote_host,
// TODO                                 PeerPort => $remote_port,
// TODO                                 Proto    => "tcp",
// TODO                                 Type     => SOCK_STREAM)
// TODO     or die "Couldn't connect to $remote_host:$remote_port : $@\n";

// ... do something with the socket
// TODO print $socket "Why don't you call me anymore?\n";

// TODO $answer = <$socket>;

// and terminate the connection when we're done
// TODO close($socket);
//-----------------------------
// TODO use Socket;

// create a socket
// TODO socket(TO_SERVER, PF_INET, SOCK_STREAM, getprotobyname('tcp'));

// build the address of the remote machine
// TODO $internet_addr = inet_aton($remote_host)
// TODO     or die "Couldn't convert $remote_host into an Internet address: $!\n";
// TODO $paddr = sockaddr_in($remote_port, $internet_addr);

// connect
// TODO connect(TO_SERVER, $paddr)
// TODO     or die "Couldn't connect to $remote_host:$remote_port : $!\n";

// ... do something with the socket
// TODO print TO_SERVER "Why don't you call me anymore?\n";

// and terminate the connection when we're done
// TODO close(TO_SERVER);
//-----------------------------
// TODO $client = IO::Socket::INET->new("www.yahoo.com:80")
// TODO     or die $@;
//-----------------------------
// TODO $s = IO::Socket::INET->new(PeerAddr => "Does not Exist",
// TODO                            Peerport => 80,
// TODO                            Type     => SOCK_STREAM )
// TODO     or die $@;
//-----------------------------
// TODO $s = IO::Socket::INET->new(PeerAddr => "bad.host.com",
// TODO                            PeerPort => 80,
// TODO                            Type     => SOCK_STREAM,
// TODO                            Timeout  => 5 )
// TODO     or die $@;
//-----------------------------
// TODO $inet_addr = inet_aton("208.146.240.1");
// TODO $paddr     = sockaddr_in($port, $inet_addr);
// TODO bind(SOCKET, $paddr)         or die "bind: $!";
//-----------------------------
// TODO $inet_addr = gethostbyname("www.yahoo.com")
// TODO                             or die "Can't resolve www.yahoo.com: $!";
// TODO $paddr     = sockaddr_in($port, $inet_addr);
// TODO bind(SOCKET, $paddr)        or die "bind: $!";
//-----------------------------

// ^^PLEAC^^_17.2
//-----------------------------
// TODO use IO::Socket;

// TODO $server = IO::Socket::INET->new(LocalPort => $server_port,
// TODO                                 Type      => SOCK_STREAM,
// TODO                                 Reuse     => 1,
// TODO                                 Listen    => 10 )   # or SOMAXCONN
// TODO     or die "Couldn't be a tcp server on port $server_port : $@\n";

// TODO while ($client = $server->accept()) {
// TODO     # $client is the new connection
// TODO }

// TODO close($server);
//-----------------------------
// TODO use Socket;

// make the socket
// TODO socket(SERVER, PF_INET, SOCK_STREAM, getprotobyname('tcp'));

// so we can restart our server quickly
// TODO setsockopt(SERVER, SOL_SOCKET, SO_REUSEADDR, 1);

// build up my socket address
// TODO $my_addr = sockaddr_in($server_port, INADDR_ANY);
// TODO bind(SERVER, $my_addr)
// TODO     or die "Couldn't bind to port $server_port : $!\n";

// establish a queue for incoming connections
// TODO listen(SERVER, SOMAXCONN)
// TODO     or die "Couldn't listen on port $server_port : $!\n";

// accept and process connections
// TODO while (accept(CLIENT, SERVER)) {
// TODO     # do something with CLIENT
// TODO }

// TODO close(SERVER);
//-----------------------------
// TODO use Socket;

// TODO while ($client_address = accept(CLIENT, SERVER)) {
// TODO     ($port, $packed_ip) = sockaddr_in($client_address);
// TODO     $dotted_quad = inet_ntoa($packed_ip);
// TODO     # do as thou wilt
// TODO }
//-----------------------------
// TODO while ($client = $server->accept()) {
// TODO     # ...
// TODO }
//-----------------------------
// TODO while (($client,$client_address) = $server->accept()) {
// TODO     # ...
// TODO }
//-----------------------------
// TODO use Fcntl qw(F_GETFL F_SETFL O_NONBLOCK);

// TODO $flags = fcntl(SERVER, F_GETFL, 0)
// TODO             or die "Can't get flags for the socket: $!\n";

// TODO $flags = fcntl(SERVER, F_SETFL, $flags | O_NONBLOCK)
// TODO             or die "Can't set flags for the socket: $!\n";
//-----------------------------

// ^^PLEAC^^_17.3
//-----------------------------
// TODO print SERVER "What is your name?\n";
// TODO chomp ($response = <SERVER>);
//-----------------------------
// TODO defined (send(SERVER, $data_to_send, $flags))
// TODO     or die "Can't send : $!\n";

// TODO recv(SERVER, $data_read, $maxlen, $flags)
// TODO     or die "Can't receive: $!\n";
//-----------------------------
// TODO use IO::Socket;

// TODO $server->send($data_to_send, $flags)
// TODO     or die "Can't send: $!\n";

// TODO $server->recv($data_read, $flags)
// TODO     or die "Can't recv: $!\n";
//-----------------------------
// TODO use IO::Select;

// TODO $select = IO::Select->new();
// TODO $select->add(*FROM_SERVER);
// TODO $select->add($to_client);

// TODO @read_from = $select->can_read($timeout);
// TODO foreach $socket (@read_from) {
// TODO     # read the pending data from $socket
// TODO }
//-----------------------------
// TODO use Socket;
// TODO require "sys/socket.ph";    # for &TCP_NODELAY

// TODO setsockopt(SERVER, SOL_SOCKET, &TCP_NODELAY, 1)
// TODO     or die "Couldn't disable Nagle's algorithm: $!\n";
//-----------------------------
// TODO setsockopt(SERVER, SOL_SOCKET, &TCP_NODELAY, 0)
// TODO     or die "Couldn't enable Nagle's algorithm: $!\n";
//-----------------------------
// TODO $rin = '';                          # initialize bitmask
// TODO vec($rin, fileno(SOCKET), 1) = 1;   # mark SOCKET in $rin
// repeat calls to vec() for each socket to check

// TODO $timeout = 10;                      # wait ten seconds

// TODO $nfound = select($rout = $rin, undef, undef, $timeout);
// TODO if (vec($rout, fileno(SOCKET),1)){
// TODO     # data to be read on SOCKET
// TODO }
//-----------------------------

// ^^PLEAC^^_17.4
//-----------------------------
// TODO use Socket;
// TODO socket(SOCKET, PF_INET, SOCK_DGRAM, getprotobyname("udp")) 
// TODO     or die "socket: $!";
//-----------------------------
// TODO use IO::Socket;
// TODO $handle = IO::Socket::INET->new(Proto => 'udp') 
// TODO     or die "socket: $@";     # yes, it uses $@ here
//-----------------------------
// TODO $ipaddr   = inet_aton($HOSTNAME);
// TODO $portaddr = sockaddr_in($PORTNO, $ipaddr);
// TODO send(SOCKET, $MSG, 0, $portaddr) == length($MSG)
// TODO         or die "cannot send to $HOSTNAME($PORTNO): $!";
//-----------------------------
// TODO $portaddr = recv(SOCKET, $MSG, $MAXLEN, 0)      or die "recv: $!";
// TODO ($portno, $ipaddr) = sockaddr_in($portaddr);
// TODO $host = gethostbyaddr($ipaddr, AF_INET);
// TODO print "$host($portno) said $MSG\n";
//-----------------------------
// TODO send(MYSOCKET, $msg_buffer, $flags, $remote_addr)
// TODO     or die "Can't send: $!\n";
//-----------------------------
// ^^INCLUDE^^ include/perl/ch17/clockdrift
//-----------------------------

// ^^PLEAC^^_17.5
//-----------------------------
// TODO use IO::Socket;
// TODO $server = IO::Socket::INET->new(LocalPort => $server_port,
// TODO                                 Proto     => "udp")
// TODO     or die "Couldn't be a udp server on port $server_port : $@\n";
//-----------------------------
// TODO while ($him = $server->recv($datagram, $MAX_TO_READ, $flags)) {
// TODO     # do something
// TODO } 
//-----------------------------
// ^^INCLUDE^^ include/perl/ch17/udpqofd
//-----------------------------
// ^^INCLUDE^^ include/perl/ch17/udpmsg
//-----------------------------

// ^^PLEAC^^_17.6
//-----------------------------
// TODO use IO::Socket;

// TODO unlink "/tmp/mysock";
// TODO $server = IO::Socket::UNIX->new(Local     => "/tmp/mysock",
// TODO                                 Type      => SOCK_DGRAM,
// TODO                                 Listen    => 5 )
// TODO     or die $@;

// TODO $client = IO::Socket::UNIX->new(Peer       => "/tmp/mysock",
// TODO                                 Type      => SOCK_DGRAM,
// TODO                                 Timeout   => 10 )
// TODO     or die $@;
//-----------------------------
// TODO use Socket;
// TODO     
// TODO socket(SERVER, PF_UNIX, SOCK_STREAM, 0);
// TODO unlink "/tmp/mysock";
// TODO bind(SERVER, sockaddr_un("/tmp/mysock"))
// TODO     or die "Can't create server: $!";

// TODO socket(CLIENT, PF_UNIX, SOCK_STREAM, 0);
// TODO connect(CLIENT, sockaddr_un("/tmp/mysock"))
// TODO     or die "Can't connect to /tmp/mysock: $!";
//-----------------------------

// ^^PLEAC^^_17.7
//-----------------------------
// TODO use Socket;

// TODO $other_end         = getpeername(SOCKET)
// TODO     or die "Couldn't identify other end: $!\n";
// TODO ($port, $iaddr)    = unpack_sockaddr_in($other_end);
// TODO $ip_address        = inet_ntoa($iaddr);
//-----------------------------
// TODO use Socket;

// TODO $other_end        = getpeername(SOCKET)
// TODO     or die "Couldn't identify other end: $!\n";
// TODO ($port, $iaddr)   = unpack_sockaddr_in($other_end);
// TODO $actual_ip        = inet_ntoa($iaddr);
// TODO $claimed_hostname = gethostbyaddr($iaddr, AF_INET);
// TODO @name_lookup      = gethostbyname($claimed_hostname)
// TODO     or die "Could not look up $claimed_hostname : $!\n";
// TODO @resolved_ips     = map { inet_ntoa($_) }
// TODO     @name_lookup[ 4 .. $#ips_for_hostname ];
//-----------------------------
// TODO $packed_ip  = gethostbyname($name) or die "Couldn't look up $name : $!\n";
// TODO $ip_address = inet_ntoa($packed_ip);
//-----------------------------

// ^^PLEAC^^_17.8
//-----------------------------
// TODO use Sys::Hostname;

// TODO $hostname = hostname();
//-----------------------------
// TODO use POSIX qw(uname);
// TODO ($kernel, $hostname, $release, $version, $hardware) = uname();

// TODO $hostname = (uname)[1];             # or just one
//-----------------------------
// TODO use Socket;                         # for AF_INET
// TODO $address  = gethostbyname($hostname)
// TODO     or die "Couldn't resolve $hostname : $!";
// TODO $hostname = gethostbyaddr($address, AF_INET)
// TODO     or die "Couldn't re-resolve $hostname : $!";
//-----------------------------

// ^^PLEAC^^_17.9
//-----------------------------
// TODO shutdown(SOCKET, 0);                # I/we have stopped reading data
// TODO shutdown(SOCKET, 1);                # I/we have stopped writing data
// TODO shutdown(SOCKET, 2);                # I/we have stopped using this socket
//-----------------------------
// TODO $socket->shutdown(0);               # I/we have stopped reading data
//-----------------------------
// TODO print SERVER "my request\n";        # send some data
// TODO shutdown(SERVER, 1);                # send eof; no more writing
// TODO $answer = <SERVER>;                 # but you can still read
//-----------------------------

// ^^PLEAC^^_17.10
//-----------------------------
// ^^INCLUDE^^ include/perl/ch17/biclient
//-----------------------------
// TODO my $byte;
// TODO while (sysread($handle, $byte, 1) == 1) {
// TODO     print STDOUT $byte;
// TODO }
//-----------------------------

// ^^PLEAC^^_17.11
//-----------------------------
// set up the socket SERVER, bind and listen ...
// TODO use POSIX qw(:sys_wait_h);

// TODO sub REAPER {
// TODO     1 until (-1 == waitpid(-1, WNOHANG));
// TODO     $SIG{CHLD} = \&REAPER;                 # unless $] >= 5.002
// TODO }

// TODO $SIG{CHLD} = \&REAPER;

// TODO while ($hisaddr = accept(CLIENT, SERVER)) {
// TODO     next if $pid = fork;                    # parent
// TODO     die "fork: $!" unless defined $pid;     # failure
// TODO     # otherwise child
// TODO     close(SERVER);                          # no use to child
// TODO     # ... do something
// TODO     exit;                                   # child leaves
// TODO } continue { 
// TODO     close(CLIENT);                          # no use to parent
// TODO }
//-----------------------------

// ^^PLEAC^^_17.12
//-----------------------------
// ^^INCLUDE^^ include/perl/ch17/preforker
//-----------------------------

// ^^PLEAC^^_17.13
//-----------------------------
// ^^INCLUDE^^ include/perl/ch17/nonforker
//-----------------------------
// TODO while ($inbuffer{$client} =~ s/(.*\n)//) {
// TODO     push( @{$ready{$client}}, $1 );
// TODO }
//-----------------------------
// TODO $outbuffer{$client} .= $request;
//-----------------------------

// ^^PLEAC^^_17.14
//-----------------------------
// TODO use Socket;

// TODO socket(SERVER, PF_INET, SOCK_STREAM, getprotobyname('tcp'));
// TODO setsockopt(SERVER, SOL_SOCKET, SO_REUSEADDR, 1);
// TODO bind(SERVER, sockaddr_in($server_port, INADDR_ANY))
// TODO     or die "Binding: $!\n";

// accept loop
// TODO while (accept(CLIENT, SERVER)) {
// TODO     $my_socket_address = getsockname(CLIENT);
// TODO     ($port, $myaddr)   = sockaddr_in($my_socket_address);
// TODO }
//-----------------------------
// TODO $server = IO::Socket::INET->new(LocalPort => $server_port,
// TODO                                 Type      => SOCK_STREAM,
// TODO                                 Proto     => 'tcp',
// TODO                                 Listen    => 10)
// TODO     or die "Can't create server socket: $@\n";

// TODO while ($client = $server->accept()) {
// TODO     $my_socket_address = $client->sockname();
// TODO     ($port, $myaddr)   = sockaddr_in($my_socket_address);
// TODO     # ...
// TODO }
//-----------------------------
// TODO use Socket;

// TODO $port = 4269;                       # port to bind to
// TODO $host = "specific.host.com";        # virtual host to listen on

// TODO socket(Server, PF_INET, SOCK_STREAM, getprotobyname("tcp"))
// TODO     or die "socket: $!";
// TODO bind(Server, sockaddr_in($port, inet_aton($host)))
// TODO     or die "bind: $!";
// TODO while ($client_address = accept(Client, Server)) {
// TODO     # ...
// TODO }
//-----------------------------

// ^^PLEAC^^_17.15
//-----------------------------
// TODO chroot("/var/daemon")
// TODO     or die "Couldn't chroot to /var/daemon: $!";
//-----------------------------
// TODO $pid = fork;
// TODO exit if $pid;
// TODO die "Couldn't fork: $!" unless defined($pid);
//-----------------------------
// TODO use POSIX;

// TODO POSIX::setsid()
// TODO     or die "Can't start a new session: $!";
//-----------------------------
// TODO $time_to_die = 0;

// TODO sub signal_handler {
// TODO     $time_to_die = 1;
// TODO }

// TODO $SIG{INT} = $SIG{TERM} = $SIG{HUP} = \&signal_handler;
// trap or ignore $SIG{PIPE}
//-----------------------------
// TODO until ($time_to_die) {
// TODO     # ...
// TODO }
//-----------------------------

// ^^PLEAC^^_17.16
//-----------------------------
// TODO $SELF = "/usr/local/libexec/myd";   # which program I am
// TODO @ARGS = qw(-l /var/log/myd -d);     # program arguments

// TODO $SIG{HUP} = \&phoenix;

// TODO sub phoenix {
// TODO     # close all your connections, kill your children, and
// TODO     # generally prepare to be reincarnated with dignity.
// TODO     exec($SELF, @ARGS)              or die "Couldn't restart: $!\n";
// TODO }
//-----------------------------
// TODO $CONFIG_FILE = "/usr/local/etc/myprog/server_conf.pl";
// TODO $SIG{HUP} = \&read_config;
// TODO sub read_config {
// TODO     do $CONFIG_FILE;
// TODO } 
//-----------------------------

// ^^PLEAC^^_17.17
//-----------------------------
// TODO May 25 15:50:22 coprolith sniffer: Connection from 207.46.131.141 to

// TODO 207.46.130.164:echo 
//-----------------------------
// TODO echo    stream  tcp nowait  nobody /usr/scripts/snfsqrd sniffer
//-----------------------------
// ^^INCLUDE^^ include/perl/ch17/backsniff
//-----------------------------

// ^^PLEAC^^_17.18
//-----------------------------
//% fwdport -s nntp -l fw.oursite.com -r news.bigorg.com
//-----------------------------
//% fwdport -l myname:9191 -r news.bigorg.com:nntp
//-----------------------------
// ^^INCLUDE^^ include/perl/ch17/fwdport
//-----------------------------
