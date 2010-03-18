package org.nicerobot.pleac;

/**
 * @author nicerobot
 * 
 */

// ^^PLEAC^^_20.0
//-----------------------------
// TODO http://www.perl.com/CPAN/modules/by-category/15_World_Wide_Web_HTML_HTTP_CGI/
//-----------------------------

// ^^PLEAC^^_20.1
//-----------------------------
// TODO use LWP::Simple;
// TODO $content = get($URL);
//-----------------------------
// TODO use LWP::Simple;
// TODO unless (defined ($content = get $URL)) {
// TODO     die "could not get $URL\n";
// TODO }
//-----------------------------
// ^^INCLUDE^^ include/perl/ch20/titlebytes
//-----------------------------
//% titlebytes http://www.tpj.com/
//http://www.tpj.com/ =>
//    The Perl Journal (109 lines, 4530 bytes)
//-----------------------------

// ^^PLEAC^^_20.2
//-----------------------------
// TODO use LWP::Simple;
// TODO use URI::URL;

// TODO my $url = url('http://www.perl.com/cgi-bin/cpan_mod');
// TODO $url->query_form(module => 'DB_File', readme => 1);
// TODO $content = get($url);
//-----------------------------
// TODO use HTTP::Request::Common qw(POST);
// TODO use LWP::UserAgent;

// TODO $ua = LWP::UserAgent->new();
// TODO my $req = POST 'http://www.perl.com/cgi-bin/cpan_mod',
// TODO                [ module => 'DB_File', readme => 1 ];
// TODO $content = $ua->request($req)->as_string;
//-----------------------------
// TODO field1=value1&field2=value2&field3=value3
//-----------------------------
// TODO http://www.site.com/path/to/
// TODO script.cgi?field1=value1&field2=value2&field3=value3
//-----------------------------
// TODO http://www.site.com/path/to/
// TODO script.cgi?arg=%22this+isn%27t+%3CEASY%3E+%26+%3CFUN%3E%22
//-----------------------------
// TODO $ua->proxy(['http', 'ftp'] => 'http://proxy.myorg.com:8081');
//-----------------------------

// ^^PLEAC^^_20.3
//-----------------------------
// TODO use HTML::LinkExtor;

// TODO $parser = HTML::LinkExtor->new(undef, $base_url);
// TODO $parser->parse_file($filename);
// TODO @links = $parser->links;
// TODO foreach $linkarray (@links) {
// TODO     my @element = @$linkarray;
// TODO     my $elt_type = shift @element;                  # element type

// TODO     # possibly test whether this is an element we're interested in
// TODO     while (@element) {
// TODO         # extract the next attribute and its value
// TODO         my ($attr_name, $attr_value) = splice(@element, 0, 2);
// TODO         # ... do something with them ...
// TODO     }
// TODO }
//-----------------------------
// TODO <A HREF="http://www.perl.com/">Home page</A>
// TODO <IMG SRC="images/big.gif" LOWSRC="images/big-lowres.gif">
//-----------------------------
// TODO [
// TODO   [ a,   href   => "http://www.perl.com/" ],
// TODO   [ img, src    => "images/big.gif",
// TODO          lowsrc => "images/big-lowres.gif" ]
// TODO ]
//-----------------------------
// TODO if ($elt_type eq 'a' && $attr_name eq 'href') {
// TODO     print "ANCHOR: $attr_value\n" 
// TODO         if $attr_value->scheme =~ /http|ftp/;
// TODO }
// TODO if ($elt_type eq 'img' && $attr_name eq 'src') {
// TODO     print "IMAGE:  $attr_value\n";
// TODO }
//-----------------------------
// ^^INCLUDE^^ include/perl/ch20/xurl
//-----------------------------
//% xurl http://www.perl.com/CPAN
//ftp://ftp@ftp.perl.com/CPAN/CPAN.html
//
//http://language.perl.com/misc/CPAN.cgi
//
//http://language.perl.com/misc/cpan_module
//
//http://language.perl.com/misc/getcpan
//
//http://www.perl.com/index.html
//
//http://www.perl.com/gifs/lcb.xbm
//-----------------------------
// TODO <URL:http://www.perl.com>
//-----------------------------
// TODO @URLs = ($message =~ /<URL:(.*?)>/g);
//-----------------------------

// ^^PLEAC^^_20.4
//-----------------------------
// ^^INCLUDE^^ include/perl/ch20/text2html
//-----------------------------
// TODO BEGIN {
// TODO     print "<TABLE>";
// TODO     $_ = encode_entities(scalar <>);
// TODO     s/\n\s+/ /g;  # continuation lines
// TODO     while ( /^(\S+?:)\s*(.*)$/gm ) {                # parse heading
// TODO         print "<TR><TH ALIGN='LEFT'>$1</TH><TD>$2</TD></TR>\n";
// TODO     }
// TODO     print "</TABLE><HR>";
// TODO }
//-----------------------------

// ^^PLEAC^^_20.5
//-----------------------------
// TODO $ascii = `lynx -dump $filename`;
//-----------------------------
// TODO use HTML::FormatText;
// TODO use HTML::Parse;

// TODO $html = parse_htmlfile($filename);
// TODO $formatter = HTML::FormatText->new(leftmargin => 0, rightmargin => 50);
// TODO $ascii = $formatter->format($html);
//-----------------------------
// TODO use HTML::TreeBuilder;
// TODO use HTML::FormatText;

// TODO $html = HTML::TreeBuilder->new();
// TODO $html->parse($document);

// TODO $formatter = HTML::FormatText->new(leftmargin => 0, rightmargin => 50);

// TODO $ascii = $formatter->format($html);
//-----------------------------

// ^^PLEAC^^_20.6
//-----------------------------
// TODO ($plain_text = $html_text) =~ s/<[^>]*>//gs;     #WRONG
//-----------------------------
// TODO use HTML::Parse;
// TODO use HTML::FormatText;
// TODO $plain_text = HTML::FormatText->new->format(parse_html($html_text));
//-----------------------------
//% perl -pe 's/<[^>]*>//g' file
//-----------------------------
//<IMG SRC = "foo.gif"
//     ALT = "Flurp!">
//-----------------------------
//% perl -0777 -pe 's/<[^>]*>//gs' file
//-----------------------------
// TODO {
// TODO     local $/;               # temporary whole-file input mode
// TODO     $html = <FILE>;
// TODO     $html =~ s/<[^>]*>//gs;
// TODO }
//-----------------------------
//<IMG SRC = "foo.gif" ALT = "A > B">
//
//<!-- <A comment> -->
//
//<script>if (a<b && a>c)</script>
//
//<# Just data #>
//
//<![INCLUDE CDATA [ >>>>>>>>>>>> ]]>
//-----------------------------
//<!-- This section commented out.
//    <B>You can't see me!</B>
//-->
//-----------------------------
// TODO package MyParser;
// TODO use HTML::Parser;
// TODO use HTML::Entities qw(decode_entities);

// TODO @ISA = qw(HTML::Parser);

// TODO sub text {
// TODO     my($self, $text) = @_;
// TODO     print decode_entities($text);
// TODO }

// TODO package main;
// TODO MyParser->new->parse_file(*F);
//-----------------------------
// TODO ($title) = ($html =~ m#<TITLE>\s*(.*?)\s*</TITLE>#is);
//-----------------------------
// ^^INCLUDE^^ include/perl/ch20/htitle
//-----------------------------
//% htitle http://www.ora.com
//www.oreilly.com -- Welcome to O'Reilly & Associates!
//
//% htitle http://www.perl.com/ http://www.perl.com/nullvoid
//http://www.perl.com/: The www.perl.com Home Page
//http://www.perl.com/nullvoid: 404 File Not Found
//-----------------------------

// ^^PLEAC^^_20.7
//-----------------------------
// ^^INCLUDE^^ include/perl/ch20/churl
//-----------------------------
//% churl http://www.wizards.com
//http://www.wizards.com:
//
//  FrontPage/FP_Color.gif:  OK
//
//  FrontPage/FP_BW.gif:  BAD
//
//  #FP_Map:  OK
//
//  Games_Library/Welcome.html:  OK
//-----------------------------

// ^^PLEAC^^_20.8
//-----------------------------
// ^^INCLUDE^^ include/perl/ch20/surl
//-----------------------------
//% xurl http://www.perl.com/  | surl | head
//Mon Apr 20 06:16:02 1998  http://electriclichen.com/linux/srom.html
//
//Fri Apr 17 13:38:51 1998  http://www.oreilly.com/
//
//Fri Mar 13 12:16:47 1998  http://www2.binevolve.com/
//
//Sun Mar  8 21:01:27 1998  http://www.perl.org/
//
//Tue Nov 18 13:41:32 1997  http://www.perl.com/universal/header.map
//
//Wed Oct  1 12:55:13 1997  http://www.songline.com/
//
//Sun Aug 17 21:43:51 1997  http://www.perl.com/graphics/perlhome_header.jpg
//
//Sun Aug 17 21:43:47 1997  http://www.perl.com/graphics/perl_id_313c.gif
//
//Sun Aug 17 21:43:46 1997  http://www.perl.com/graphics/ora_logo.gif
//
//Sun Aug 17 21:43:44 1997  http://www.perl.com/graphics/header-nav.gif
//-----------------------------

// ^^PLEAC^^_20.9
//-----------------------------
// TODO sub template {
// TODO     my ($filename, $fillings) = @_;
// TODO     my $text;
// TODO     local $/;                   # slurp mode (undef)
// TODO     local *F;                   # create local filehandle
// TODO     open(F, "< $filename\0")    || return;
// TODO     $text = <F>;                # read whole file
// TODO     close(F);                   # ignore retval
// TODO     # replace quoted words with value in %$fillings hash
// TODO     $text =~ s{ %% ( .*? ) %% }
// TODO               { exists( $fillings->{$1} )
// TODO                       ? $fillings->{$1}
// TODO                       : ""
// TODO               }gsex;
// TODO     return $text;
// TODO }
//-----------------------------
//<!-- simple.template for internal template() function -->
//<HTML><HEAD><TITLE>Report for %%username%%</TITLE></HEAD>
//<BODY><H1>Report for %%username%%</H1>
//%%username%% logged in %%count%% times, for a total of %%total%% minutes.
//-----------------------------
//<!-- fancy.template for Text::Template -->
//<HTML><HEAD><TITLE>Report for {$user}</TITLE></HEAD>
//<BODY><H1>Report for {$user}</H1>
//{ lcfirst($user) } logged in {$count} times, for a total of 
//{ int($total / 60) } minutes.
//-----------------------------
// TODO %fields = (
// TODO             username => $whats_his_name,
// TODO             count    => $login_count,
// TODO             total    => $minute_used,
// TODO );

// TODO print template("/home/httpd/templates/simple.template", \%fields);
//-----------------------------
// ^^INCLUDE^^ include/perl/ch20/userrep
//-----------------------------
// TODO You owe: {$total}
//-----------------------------
// TODO The average was {$count ?  ($total/$count) : 0}.
//-----------------------------
// ^^INCLUDE^^ include/perl/ch20/userrep2
//-----------------------------

// ^^PLEAC^^_20.10
//-----------------------------
// TODO use LWP::Simple;
// TODO mirror($URL, $local_filename);
//-----------------------------

// ^^PLEAC^^_20.11
//-----------------------------
// TODO use LWP::RobotUA;
// TODO $ua = LWP::RobotUA->new('websnuffler/0.1', 'me@wherever.com');
//-----------------------------
// TODO 403 (Forbidden) Forbidden by robots.txt
//-----------------------------
//% GET http://www.webtechniques.com/robots.txt 
//User-agent: *
//
//     Disallow: /stats
//
//     Disallow: /db
//
//     Disallow: /logs
//
//     Disallow: /store
//
//     Disallow: /forms
//
//     Disallow: /gifs
//
//     Disallow: /wais-src
//
//     Disallow: /scripts
//
//     Disallow: /config
//-----------------------------
//% GET http://www.cnn.com/robots.txt | head
//# robots, scram
//
//# $I d : robots.txt,v 1.2 1998/03/10 18:27:01 mreed Exp $
//
//User-agent: *
//
//Disallow: /
//
//User-agent:     Mozilla/3.01 (hotwired-test/0.1)
//
//Disallow:   /cgi-bin
//
//Disallow:   /TRANSCRIPTS
//
//Disallow:   /development
//-----------------------------

// ^^PLEAC^^_20.12
//-----------------------------
// TODO while (<LOGFILE>) {
// TODO   my ($client, $identuser, $authuser, $date, $time, $tz, $method,
// TODO       $url, $protocol, $status, $bytes) =
// TODO       /^(\S+) (\S+) (\S+) \[([^:]+):(\d+:\d+:\d+) ([^\]]+) "(\S+) (.*?) (\S+)" (\S+) (\S+)$/ or next;
// TODO   # ...
// TODO }
//-----------------------------

// ^^PLEAC^^_20.13
//-----------------------------
// ^^INCLUDE^^ include/perl/ch20/sumwww
//-----------------------------
//     Date      Hosts  Accesses Unidocs   POST    Home       Bytes
// 
// ----------- ------- -------- -------- ------- ------- --------------
// 
// 19/May/1998     353     6447     3074     352      51       16058246
// 
// 20/May/1998    1938    23868     4288     972     350       61879643
// 
// 21/May/1998    1775    27872     6596    1064     376       64613798
// 
// 22/May/1998    1680    21402     4467     735     285       52437374
// 
// 23/May/1998    1128    21260     4944     592     186       55623059
// 
// Grand Total    6050   100849    10090    3715    1248      250612120
//-----------------------------
// ^^INCLUDE^^ include/perl/ch20/aprept
//-----------------------------
// Domain                  Records 
// 
// ===============================
// 
// US Commercial        222 38.47% 
// 
// US Educational       115 19.93% 
// 
// Network               93 16.12% 
// 
// Unresolved            54  9.36% 
// 
// Australia             48  8.32% 
// 
// Canada                20  3.47% 
// 
// Mexico                 8  1.39% 
// 
// United Kingdom         6  1.04% 
// 
// 
// File                               Bytes          Records 
// 
// =========================================================
// 
// /                           13008  0.89%         6  1.04% 
// 
// /cgi-bin/MxScreen           11870  0.81%         2  0.35% 
// 
// /cgi-bin/pickcards          39431  2.70%        48  8.32% 
// 
// /deckmaster                143793  9.83%        21  3.64% 
// 
// /deckmaster/admin           54447  3.72%         3  0.52% 
//-----------------------------

// ^^PLEAC^^_20.14
//-----------------------------
//<HTML><HEAD><TITLE>Hi!</TITLE></HEAD><BODY>
//<H1>Welcome to Scooby World!</H1>
//I have <A HREF="pictures.html">pictures</A> of the crazy dog
//himself.  Here's one!<P>
//<IMG SRC="scooby.jpg" ALT="Good doggy!"><P>
//<BLINK>He's my hero!</BLINK>  I would like to meet him some day,
//and get my picture taken with him.<P>
//P.S. I am deathly ill.  <A HREF="shergold.html">Please send
//cards</A>.
//</BODY></HTML>
//-----------------------------
//% htmlsub picture photo scooby.html
//<HTML><HEAD><TITLE>Hi!</TITLE></HEAD><BODY>
//
//<H1>Welcome to Scooby World!</H1>
//
//I have <A HREF="pictures.html">photos</A> of the crazy dog
//
//himself.  Here's one!<P>
//
//<IMG SRC="scooby.jpg" ALT="Good doggy!"><P>
//
//<BLINK>He's my hero!</BLINK>  I would like to meet him some day,
//
//and get my photo taken with him.<P>
//
//P.S. I am deathly ill.  <A HREF="shergold.html">Please send
//
//cards</A>.
//
//</BODY></HTML>
//-----------------------------
// ^^INCLUDE^^ include/perl/ch20/htmlsub
//-----------------------------

// ^^PLEAC^^_20.15
//-----------------------------
//% hrefsub shergold.html cards.html scooby.html
//<HTML><HEAD><TITLE>Hi!</TITLE></HEAD><BODY>
//
//<H1>Welcome to Scooby World!</H1>
//
//I have <A HREF="pictures.html">pictures</A> of the crazy dog
//
//himself.  Here's one!<P>
//
//<IMG SRC="scooby.jpg" ALT="Good doggy!"><P>
//
//<BLINK>He's my hero!</BLINK>  I would like to meet him some day,
//
//and get my picture taken with him.<P>
//
//P.S. I am deathly ill.  <a href="cards.html">Please send
//
//cards</A>.
//
//</BODY></HTML>
//-----------------------------
// ^^INCLUDE^^ include/perl/ch20/hrefsub
//-----------------------------