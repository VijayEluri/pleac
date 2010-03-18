package org.nicerobot.pleac;

/**
 * @author nicerobot
 * 
 */
public class _17 {

  public static void _00 () {
    // <PLEAC>

    // ^^PLEAC^^_17.0
    // -----------------------------
    // TODO perl -> use Socket;
    // TODO perl ->
    // TODO perl -> $packed_ip = inet_aton("208.146.240.1");
    // TODO perl -> $socket_name = sockaddr_in($port, $packed_ip);
    // -----------------------------
    // TODO perl -> use Socket;
    // TODO perl ->
    // TODO perl -> $socket_name = sockaddr_un("/tmp/mysock");
    // -----------------------------
    // TODO perl -> ($port, $packed_ip) = sockaddr_in($socket_name); # for PF_INET sockets
    // TODO perl -> ($filename) = sockaddr_un($socket_name); # for PF_UNIX sockets
    // -----------------------------
    // TODO perl -> $ip_address = inet_ntoa($packed_ip);
    // TODO perl -> $packed_ip = inet_aton("204.148.40.9");
    // TODO perl -> $packed_ip = inet_aton("www.oreilly.com");
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _01 () {
    // <PLEAC>

    // ^^PLEAC^^_17.1
    // -----------------------------
    // TODO perl -> use IO::Socket;
    // TODO perl ->
    // TODO perl -> $socket = IO::Socket::INET->new(PeerAddr => $remote_host,
    // TODO perl -> PeerPort => $remote_port,
    // TODO perl -> Proto => "tcp",
    // TODO perl -> Type => SOCK_STREAM)
    // TODO perl -> or die "Couldn't connect to $remote_host:$remote_port : $@\n";
    // TODO perl ->
    // ... do something with the socket
    // TODO perl -> print $socket "Why don't you call me anymore?\n";
    // TODO perl ->
    // TODO perl -> $answer = <$socket>;
    // TODO perl ->
    // and terminate the connection when we're done
    // TODO perl -> close($socket);
    // -----------------------------
    // TODO perl -> use Socket;
    // TODO perl ->
    // create a socket
    // TODO perl -> socket(TO_SERVER, PF_INET, SOCK_STREAM, getprotobyname('tcp'));
    // TODO perl ->
    // build the address of the remote machine
    // TODO perl -> $internet_addr = inet_aton($remote_host)
    // TODO perl -> or die "Couldn't convert $remote_host into an Internet address: $!\n";
    // TODO perl -> $paddr = sockaddr_in($remote_port, $internet_addr);
    // TODO perl ->
    // connect
    // TODO perl -> connect(TO_SERVER, $paddr)
    // TODO perl -> or die "Couldn't connect to $remote_host:$remote_port : $!\n";
    // TODO perl ->
    // ... do something with the socket
    // TODO perl -> print TO_SERVER "Why don't you call me anymore?\n";
    // TODO perl ->
    // and terminate the connection when we're done
    // TODO perl -> close(TO_SERVER);
    // -----------------------------
    // TODO perl -> $client = IO::Socket::INET->new("www.yahoo.com:80")
    // TODO perl -> or die $@;
    // -----------------------------
    // TODO perl -> $s = IO::Socket::INET->new(PeerAddr => "Does not Exist",
    // TODO perl -> Peerport => 80,
    // TODO perl -> Type => SOCK_STREAM )
    // TODO perl -> or die $@;
    // -----------------------------
    // TODO perl -> $s = IO::Socket::INET->new(PeerAddr => "bad.host.com",
    // TODO perl -> PeerPort => 80,
    // TODO perl -> Type => SOCK_STREAM,
    // TODO perl -> Timeout => 5 )
    // TODO perl -> or die $@;
    // -----------------------------
    // TODO perl -> $inet_addr = inet_aton("208.146.240.1");
    // TODO perl -> $paddr = sockaddr_in($port, $inet_addr);
    // TODO perl -> bind(SOCKET, $paddr) or die "bind: $!";
    // -----------------------------
    // TODO perl -> $inet_addr = gethostbyname("www.yahoo.com")
    // TODO perl -> or die "Can't resolve www.yahoo.com: $!";
    // TODO perl -> $paddr = sockaddr_in($port, $inet_addr);
    // TODO perl -> bind(SOCKET, $paddr) or die "bind: $!";
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _02 () {
    // <PLEAC>

    // ^^PLEAC^^_17.2
    // -----------------------------
    // TODO perl -> use IO::Socket;
    // TODO perl ->
    // TODO perl -> $server = IO::Socket::INET->new(LocalPort => $server_port,
    // TODO perl -> Type => SOCK_STREAM,
    // TODO perl -> Reuse => 1,
    // TODO perl -> Listen => 10 ) # or SOMAXCONN
    // TODO perl -> or die "Couldn't be a tcp server on port $server_port : $@\n";
    // TODO perl ->
    // TODO perl -> while ($client = $server->accept()) {
    // TODO perl -> # $client is the new connection
    // TODO perl -> }
    // TODO perl ->
    // TODO perl -> close($server);
    // -----------------------------
    // TODO perl -> use Socket;
    // TODO perl ->
    // make the socket
    // TODO perl -> socket(SERVER, PF_INET, SOCK_STREAM, getprotobyname('tcp'));
    // TODO perl ->
    // so we can restart our server quickly
    // TODO perl -> setsockopt(SERVER, SOL_SOCKET, SO_REUSEADDR, 1);
    // TODO perl ->
    // build up my socket address
    // TODO perl -> $my_addr = sockaddr_in($server_port, INADDR_ANY);
    // TODO perl -> bind(SERVER, $my_addr)
    // TODO perl -> or die "Couldn't bind to port $server_port : $!\n";
    // TODO perl ->
    // establish a queue for incoming connections
    // TODO perl -> listen(SERVER, SOMAXCONN)
    // TODO perl -> or die "Couldn't listen on port $server_port : $!\n";
    // TODO perl ->
    // accept and process connections
    // TODO perl -> while (accept(CLIENT, SERVER)) {
    // TODO perl -> # do something with CLIENT
    // TODO perl -> }
    // TODO perl ->
    // TODO perl -> close(SERVER);
    // -----------------------------
    // TODO perl -> use Socket;
    // TODO perl ->
    // TODO perl -> while ($client_address = accept(CLIENT, SERVER)) {
    // TODO perl -> ($port, $packed_ip) = sockaddr_in($client_address);
    // TODO perl -> $dotted_quad = inet_ntoa($packed_ip);
    // TODO perl -> # do as thou wilt
    // TODO perl -> }
    // -----------------------------
    // TODO perl -> while ($client = $server->accept()) {
    // TODO perl -> # ...
    // TODO perl -> }
    // -----------------------------
    // TODO perl -> while (($client,$client_address) = $server->accept()) {
    // TODO perl -> # ...
    // TODO perl -> }
    // -----------------------------
    // TODO perl -> use Fcntl qw(F_GETFL F_SETFL O_NONBLOCK);
    // TODO perl ->
    // TODO perl -> $flags = fcntl(SERVER, F_GETFL, 0)
    // TODO perl -> or die "Can't get flags for the socket: $!\n";
    // TODO perl ->
    // TODO perl -> $flags = fcntl(SERVER, F_SETFL, $flags | O_NONBLOCK)
    // TODO perl -> or die "Can't set flags for the socket: $!\n";
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _03 () {
    // <PLEAC>

    // ^^PLEAC^^_17.3
    // -----------------------------
    // TODO perl -> print SERVER "What is your name?\n";
    // TODO perl -> chomp ($response = <SERVER>);
    // -----------------------------
    // TODO perl -> defined (send(SERVER, $data_to_send, $flags))
    // TODO perl -> or die "Can't send : $!\n";
    // TODO perl ->
    // TODO perl -> recv(SERVER, $data_read, $maxlen, $flags)
    // TODO perl -> or die "Can't receive: $!\n";
    // -----------------------------
    // TODO perl -> use IO::Socket;
    // TODO perl ->
    // TODO perl -> $server->send($data_to_send, $flags)
    // TODO perl -> or die "Can't send: $!\n";
    // TODO perl ->
    // TODO perl -> $server->recv($data_read, $flags)
    // TODO perl -> or die "Can't recv: $!\n";
    // -----------------------------
    // TODO perl -> use IO::Select;
    // TODO perl ->
    // TODO perl -> $select = IO::Select->new();
    // TODO perl -> $select->add(*FROM_SERVER);
    // TODO perl -> $select->add($to_client);
    // TODO perl ->
    // TODO perl -> @read_from = $select->can_read($timeout);
    // TODO perl -> foreach $socket (@read_from) {
    // TODO perl -> # read the pending data from $socket
    // TODO perl -> }
    // -----------------------------
    // TODO perl -> use Socket;
    // TODO perl -> require "sys/socket.ph"; # for &TCP_NODELAY
    // TODO perl ->
    // TODO perl -> setsockopt(SERVER, SOL_SOCKET, &TCP_NODELAY, 1)
    // TODO perl -> or die "Couldn't disable Nagle's algorithm: $!\n";
    // -----------------------------
    // TODO perl -> setsockopt(SERVER, SOL_SOCKET, &TCP_NODELAY, 0)
    // TODO perl -> or die "Couldn't enable Nagle's algorithm: $!\n";
    // -----------------------------
    // TODO perl -> $rin = ''; # initialize bitmask
    // TODO perl -> vec($rin, fileno(SOCKET), 1) = 1; # mark SOCKET in $rin
    // repeat calls to vec() for each socket to check
    // TODO perl ->
    // TODO perl -> $timeout = 10; # wait ten seconds
    // TODO perl ->
    // TODO perl -> $nfound = select($rout = $rin, undef, undef, $timeout);
    // TODO perl -> if (vec($rout, fileno(SOCKET),1)){
    // TODO perl -> # data to be read on SOCKET
    // TODO perl -> }
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _04 () {
    // <PLEAC>

    // ^^PLEAC^^_17.4
    // -----------------------------
    // TODO perl -> use Socket;
    // TODO perl -> socket(SOCKET, PF_INET, SOCK_DGRAM, getprotobyname("udp"))
    // TODO perl -> or die "socket: $!";
    // -----------------------------
    // TODO perl -> use IO::Socket;
    // TODO perl -> $handle = IO::Socket::INET->new(Proto => 'udp')
    // TODO perl -> or die "socket: $@"; # yes, it uses $@ here
    // -----------------------------
    // TODO perl -> $ipaddr = inet_aton($HOSTNAME);
    // TODO perl -> $portaddr = sockaddr_in($PORTNO, $ipaddr);
    // TODO perl -> send(SOCKET, $MSG, 0, $portaddr) == length($MSG)
    // TODO perl -> or die "cannot send to $HOSTNAME($PORTNO): $!";
    // -----------------------------
    // TODO perl -> $portaddr = recv(SOCKET, $MSG, $MAXLEN, 0) or die "recv: $!";
    // TODO perl -> ($portno, $ipaddr) = sockaddr_in($portaddr);
    // TODO perl -> $host = gethostbyaddr($ipaddr, AF_INET);
    // TODO perl -> print "$host($portno) said $MSG\n";
    // -----------------------------
    // TODO perl -> send(MYSOCKET, $msg_buffer, $flags, $remote_addr)
    // TODO perl -> or die "Can't send: $!\n";
    // -----------------------------
    // ^^INCLUDE^^ include/perl/ch17/clockdrift
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _05 () {
    // <PLEAC>

    // ^^PLEAC^^_17.5
    // -----------------------------
    // TODO perl -> use IO::Socket;
    // TODO perl -> $server = IO::Socket::INET->new(LocalPort => $server_port,
    // TODO perl -> Proto => "udp")
    // TODO perl -> or die "Couldn't be a udp server on port $server_port : $@\n";
    // -----------------------------
    // TODO perl -> while ($him = $server->recv($datagram, $MAX_TO_READ, $flags)) {
    // TODO perl -> # do something
    // TODO perl -> }
    // -----------------------------
    // ^^INCLUDE^^ include/perl/ch17/udpqofd
    // -----------------------------
    // ^^INCLUDE^^ include/perl/ch17/udpmsg
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _06 () {
    // <PLEAC>

    // ^^PLEAC^^_17.6
    // -----------------------------
    // TODO perl -> use IO::Socket;
    // TODO perl ->
    // TODO perl -> unlink "/tmp/mysock";
    // TODO perl -> $server = IO::Socket::UNIX->new(Local => "/tmp/mysock",
    // TODO perl -> Type => SOCK_DGRAM,
    // TODO perl -> Listen => 5 )
    // TODO perl -> or die $@;
    // TODO perl ->
    // TODO perl -> $client = IO::Socket::UNIX->new(Peer => "/tmp/mysock",
    // TODO perl -> Type => SOCK_DGRAM,
    // TODO perl -> Timeout => 10 )
    // TODO perl -> or die $@;
    // -----------------------------
    // TODO perl -> use Socket;
    // TODO perl ->
    // TODO perl -> socket(SERVER, PF_UNIX, SOCK_STREAM, 0);
    // TODO perl -> unlink "/tmp/mysock";
    // TODO perl -> bind(SERVER, sockaddr_un("/tmp/mysock"))
    // TODO perl -> or die "Can't create server: $!";
    // TODO perl ->
    // TODO perl -> socket(CLIENT, PF_UNIX, SOCK_STREAM, 0);
    // TODO perl -> connect(CLIENT, sockaddr_un("/tmp/mysock"))
    // TODO perl -> or die "Can't connect to /tmp/mysock: $!";
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _07 () {
    // <PLEAC>

    // ^^PLEAC^^_17.7
    // -----------------------------
    // TODO perl -> use Socket;
    // TODO perl ->
    // TODO perl -> $other_end = getpeername(SOCKET)
    // TODO perl -> or die "Couldn't identify other end: $!\n";
    // TODO perl -> ($port, $iaddr) = unpack_sockaddr_in($other_end);
    // TODO perl -> $ip_address = inet_ntoa($iaddr);
    // -----------------------------
    // TODO perl -> use Socket;
    // TODO perl ->
    // TODO perl -> $other_end = getpeername(SOCKET)
    // TODO perl -> or die "Couldn't identify other end: $!\n";
    // TODO perl -> ($port, $iaddr) = unpack_sockaddr_in($other_end);
    // TODO perl -> $actual_ip = inet_ntoa($iaddr);
    // TODO perl -> $claimed_hostname = gethostbyaddr($iaddr, AF_INET);
    // TODO perl -> @name_lookup = gethostbyname($claimed_hostname)
    // TODO perl -> or die "Could not look up $claimed_hostname : $!\n";
    // TODO perl -> @resolved_ips = map { inet_ntoa($_) }
    // TODO perl -> @name_lookup[ 4 .. $#ips_for_hostname ];
    // -----------------------------
    // TODO perl -> $packed_ip = gethostbyname($name) or die "Couldn't look up $name : $!\n";
    // TODO perl -> $ip_address = inet_ntoa($packed_ip);
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _08 () {
    // <PLEAC>

    // ^^PLEAC^^_17.8
    // -----------------------------
    // TODO perl -> use Sys::Hostname;
    // TODO perl ->
    // TODO perl -> $hostname = hostname();
    // -----------------------------
    // TODO perl -> use POSIX qw(uname);
    // TODO perl -> ($kernel, $hostname, $release, $version, $hardware) = uname();
    // TODO perl ->
    // TODO perl -> $hostname = (uname)[1]; # or just one
    // -----------------------------
    // TODO perl -> use Socket; # for AF_INET
    // TODO perl -> $address = gethostbyname($hostname)
    // TODO perl -> or die "Couldn't resolve $hostname : $!";
    // TODO perl -> $hostname = gethostbyaddr($address, AF_INET)
    // TODO perl -> or die "Couldn't re-resolve $hostname : $!";
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _09 () {
    // <PLEAC>

    // ^^PLEAC^^_17.9
    // -----------------------------
    // TODO perl -> shutdown(SOCKET, 0); # I/we have stopped reading data
    // TODO perl -> shutdown(SOCKET, 1); # I/we have stopped writing data
    // TODO perl -> shutdown(SOCKET, 2); # I/we have stopped using this socket
    // -----------------------------
    // TODO perl -> $socket->shutdown(0); # I/we have stopped reading data
    // -----------------------------
    // TODO perl -> print SERVER "my request\n"; # send some data
    // TODO perl -> shutdown(SERVER, 1); # send eof; no more writing
    // TODO perl -> $answer = <SERVER>; # but you can still read
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _10 () {
    // <PLEAC>

    // ^^PLEAC^^_17.10
    // -----------------------------
    // ^^INCLUDE^^ include/perl/ch17/biclient
    // -----------------------------
    // TODO perl -> my $byte;
    // TODO perl -> while (sysread($handle, $byte, 1) == 1) {
    // TODO perl -> print STDOUT $byte;
    // TODO perl -> }
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _11 () {
    // <PLEAC>

    // ^^PLEAC^^_17.11
    // -----------------------------
    // set up the socket SERVER, bind and listen ...
    // TODO perl -> use POSIX qw(:sys_wait_h);
    // TODO perl ->
    // TODO perl -> sub REAPER {
    // TODO perl -> 1 until (-1 == waitpid(-1, WNOHANG));
    // TODO perl -> $SIG{CHLD} = \&REAPER; # unless $] >= 5.002
    // TODO perl -> }
    // TODO perl ->
    // TODO perl -> $SIG{CHLD} = \&REAPER;
    // TODO perl ->
    // TODO perl -> while ($hisaddr = accept(CLIENT, SERVER)) {
    // TODO perl -> next if $pid = fork; # parent
    // TODO perl -> die "fork: $!" unless defined $pid; # failure
    // TODO perl -> # otherwise child
    // TODO perl -> close(SERVER); # no use to child
    // TODO perl -> # ... do something
    // TODO perl -> exit; # child leaves
    // TODO perl -> } continue {
    // TODO perl -> close(CLIENT); # no use to parent
    // TODO perl -> }
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _12 () {
    // <PLEAC>

    // ^^PLEAC^^_17.12
    // -----------------------------
    // ^^INCLUDE^^ include/perl/ch17/preforker
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _13 () {
    // <PLEAC>

    // ^^PLEAC^^_17.13
    // -----------------------------
    // ^^INCLUDE^^ include/perl/ch17/nonforker
    // -----------------------------
    // TODO perl -> while ($inbuffer{$client} =~ s/(.*\n)//) {
    // TODO perl -> push( @{$ready{$client}}, $1 );
    // TODO perl -> }
    // -----------------------------
    // TODO perl -> $outbuffer{$client} .= $request;
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _14 () {
    // <PLEAC>

    // ^^PLEAC^^_17.14
    // -----------------------------
    // TODO perl -> use Socket;
    // TODO perl ->
    // TODO perl -> socket(SERVER, PF_INET, SOCK_STREAM, getprotobyname('tcp'));
    // TODO perl -> setsockopt(SERVER, SOL_SOCKET, SO_REUSEADDR, 1);
    // TODO perl -> bind(SERVER, sockaddr_in($server_port, INADDR_ANY))
    // TODO perl -> or die "Binding: $!\n";
    // TODO perl ->
    // accept loop
    // TODO perl -> while (accept(CLIENT, SERVER)) {
    // TODO perl -> $my_socket_address = getsockname(CLIENT);
    // TODO perl -> ($port, $myaddr) = sockaddr_in($my_socket_address);
    // TODO perl -> }
    // -----------------------------
    // TODO perl -> $server = IO::Socket::INET->new(LocalPort => $server_port,
    // TODO perl -> Type => SOCK_STREAM,
    // TODO perl -> Proto => 'tcp',
    // TODO perl -> Listen => 10)
    // TODO perl -> or die "Can't create server socket: $@\n";
    // TODO perl ->
    // TODO perl -> while ($client = $server->accept()) {
    // TODO perl -> $my_socket_address = $client->sockname();
    // TODO perl -> ($port, $myaddr) = sockaddr_in($my_socket_address);
    // TODO perl -> # ...
    // TODO perl -> }
    // -----------------------------
    // TODO perl -> use Socket;
    // TODO perl ->
    // TODO perl -> $port = 4269; # port to bind to
    // TODO perl -> $host = "specific.host.com"; # virtual host to listen on
    // TODO perl ->
    // TODO perl -> socket(Server, PF_INET, SOCK_STREAM, getprotobyname("tcp"))
    // TODO perl -> or die "socket: $!";
    // TODO perl -> bind(Server, sockaddr_in($port, inet_aton($host)))
    // TODO perl -> or die "bind: $!";
    // TODO perl -> while ($client_address = accept(Client, Server)) {
    // TODO perl -> # ...
    // TODO perl -> }
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _15 () {
    // <PLEAC>

    // ^^PLEAC^^_17.15
    // -----------------------------
    // TODO perl -> chroot("/var/daemon")
    // TODO perl -> or die "Couldn't chroot to /var/daemon: $!";
    // -----------------------------
    // TODO perl -> $pid = fork;
    // TODO perl -> exit if $pid;
    // TODO perl -> die "Couldn't fork: $!" unless defined($pid);
    // -----------------------------
    // TODO perl -> use POSIX;
    // TODO perl ->
    // TODO perl -> POSIX::setsid()
    // TODO perl -> or die "Can't start a new session: $!";
    // -----------------------------
    // TODO perl -> $time_to_die = 0;
    // TODO perl ->
    // TODO perl -> sub signal_handler {
    // TODO perl -> $time_to_die = 1;
    // TODO perl -> }
    // TODO perl ->
    // TODO perl -> $SIG{INT} = $SIG{TERM} = $SIG{HUP} = \&signal_handler;
    // trap or ignore $SIG{PIPE}
    // -----------------------------
    // TODO perl -> until ($time_to_die) {
    // TODO perl -> # ...
    // TODO perl -> }
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _16 () {
    // <PLEAC>

    // ^^PLEAC^^_17.16
    // -----------------------------
    // TODO perl -> $SELF = "/usr/local/libexec/myd"; # which program I am
    // TODO perl -> @ARGS = qw(-l /var/log/myd -d); # program arguments
    // TODO perl ->
    // TODO perl -> $SIG{HUP} = \&phoenix;
    // TODO perl ->
    // TODO perl -> sub phoenix {
    // TODO perl -> # close all your connections, kill your children, and
    // TODO perl -> # generally prepare to be reincarnated with dignity.
    // TODO perl -> exec($SELF, @ARGS) or die "Couldn't restart: $!\n";
    // TODO perl -> }
    // -----------------------------
    // TODO perl -> $CONFIG_FILE = "/usr/local/etc/myprog/server_conf.pl";
    // TODO perl -> $SIG{HUP} = \&read_config;
    // TODO perl -> sub read_config {
    // TODO perl -> do $CONFIG_FILE;
    // TODO perl -> }
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _17 () {
    // <PLEAC>

    // ^^PLEAC^^_17.17
    // -----------------------------
    // TODO perl -> May 25 15:50:22 coprolith sniffer: Connection from 207.46.131.141 to
    // TODO perl ->
    // TODO perl -> 207.46.130.164:echo
    // -----------------------------
    // TODO perl -> echo stream tcp nowait nobody /usr/scripts/snfsqrd sniffer
    // -----------------------------
    // ^^INCLUDE^^ include/perl/ch17/backsniff
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _18 () {
    // <PLEAC>

    // ^^PLEAC^^_17.18
    // -----------------------------
    // % fwdport -s nntp -l fw.oursite.com -r news.bigorg.com
    // -----------------------------
    // % fwdport -l myname:9191 -r news.bigorg.com:nntp
    // -----------------------------
    // ^^INCLUDE^^ include/perl/ch17/fwdport
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }
}
