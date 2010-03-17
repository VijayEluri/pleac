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
public class _20 {

  public static void _00 () {
  // <PLEAC>

  // ^^PLEAC^^_20.0
  // -----------------------------
  // TODO perl -> http://www.perl.com/CPAN/modules/by-category/15_World_Wide_Web_HTML_HTTP_CGI/
  // -----------------------------
  // TODO perl ->
  // </PLEAC>
  }

  public static void _01 () {
  // <PLEAC>

  // ^^PLEAC^^_20.1
  // -----------------------------
  // TODO perl -> use LWP::Simple;
  // TODO perl -> $content = get($URL);
  // -----------------------------
  // TODO perl -> use LWP::Simple;
  // TODO perl -> unless (defined ($content = get $URL)) {
  // TODO perl -> die "could not get $URL\n";
  // TODO perl -> }
  // -----------------------------
  // ^^INCLUDE^^ include/perl/ch20/titlebytes
  // -----------------------------
  // % titlebytes http://www.tpj.com/
  // http://www.tpj.com/ =>
  // The Perl Journal (109 lines, 4530 bytes)
  // -----------------------------
  // TODO perl ->
  // </PLEAC>
  }

  public static void _02 () {
  // <PLEAC>

  // ^^PLEAC^^_20.2
  // -----------------------------
  // TODO perl -> use LWP::Simple;
  // TODO perl -> use URI::URL;
  // TODO perl ->
  // TODO perl -> my $url = url('http://www.perl.com/cgi-bin/cpan_mod');
  // TODO perl -> $url->query_form(module => 'DB_File', readme => 1);
  // TODO perl -> $content = get($url);
  // -----------------------------
  // TODO perl -> use HTTP::Request::Common qw(POST);
  // TODO perl -> use LWP::UserAgent;
  // TODO perl ->
  // TODO perl -> $ua = LWP::UserAgent->new();
  // TODO perl -> my $req = POST 'http://www.perl.com/cgi-bin/cpan_mod',
  // TODO perl -> [ module => 'DB_File', readme => 1 ];
  // TODO perl -> $content = $ua->request($req)->as_string;
  // -----------------------------
  // TODO perl -> field1=value1&field2=value2&field3=value3
  // -----------------------------
  // TODO perl -> http://www.site.com/path/to/
  // TODO perl -> script.cgi?field1=value1&field2=value2&field3=value3
  // -----------------------------
  // TODO perl -> http://www.site.com/path/to/
  // TODO perl -> script.cgi?arg=%22this+isn%27t+%3CEASY%3E+%26+%3CFUN%3E%22
  // -----------------------------
  // TODO perl -> $ua->proxy(['http', 'ftp'] => 'http://proxy.myorg.com:8081');
  // -----------------------------
  // TODO perl ->
  // </PLEAC>
  }

  public static void _03 () {
  // <PLEAC>

  // ^^PLEAC^^_20.3
  // -----------------------------
  // TODO perl -> use HTML::LinkExtor;
  // TODO perl ->
  // TODO perl -> $parser = HTML::LinkExtor->new(undef, $base_url);
  // TODO perl -> $parser->parse_file($filename);
  // TODO perl -> @links = $parser->links;
  // TODO perl -> foreach $linkarray (@links) {
  // TODO perl -> my @element = @$linkarray;
  // TODO perl -> my $elt_type = shift @element; # element type
  // TODO perl ->
  // TODO perl -> # possibly test whether this is an element we're interested in
  // TODO perl -> while (@element) {
  // TODO perl -> # extract the next attribute and its value
  // TODO perl -> my ($attr_name, $attr_value) = splice(@element, 0, 2);
  // TODO perl -> # ... do something with them ...
  // TODO perl -> }
  // TODO perl -> }
  // -----------------------------
  // TODO perl -> <A HREF="http://www.perl.com/">Home page</A>
  // TODO perl -> <IMG SRC="images/big.gif" LOWSRC="images/big-lowres.gif">
  // -----------------------------
  // TODO perl -> [
  // TODO perl -> [ a, href => "http://www.perl.com/" ],
  // TODO perl -> [ img, src => "images/big.gif",
  // TODO perl -> lowsrc => "images/big-lowres.gif" ]
  // TODO perl -> ]
  // -----------------------------
  // TODO perl -> if ($elt_type eq 'a' && $attr_name eq 'href') {
  // TODO perl -> print "ANCHOR: $attr_value\n"
  // TODO perl -> if $attr_value->scheme =~ /http|ftp/;
  // TODO perl -> }
  // TODO perl -> if ($elt_type eq 'img' && $attr_name eq 'src') {
  // TODO perl -> print "IMAGE:  $attr_value\n";
  // TODO perl -> }
  // -----------------------------
  // ^^INCLUDE^^ include/perl/ch20/xurl
  // -----------------------------
  // % xurl http://www.perl.com/CPAN
  // ftp://ftp@ftp.perl.com/CPAN/CPAN.html
  //
  // http://language.perl.com/misc/CPAN.cgi
  //
  // http://language.perl.com/misc/cpan_module
  //
  // http://language.perl.com/misc/getcpan
  //
  // http://www.perl.com/index.html
  //
  // http://www.perl.com/gifs/lcb.xbm
  // -----------------------------
  // TODO perl -> <URL:http://www.perl.com>
  // -----------------------------
  // TODO perl -> @URLs = ($message =~ /<URL:(.*?)>/g);
  // -----------------------------
  // TODO perl ->
  // </PLEAC>
  }

  public static void _04 () {
  // <PLEAC>

  // ^^PLEAC^^_20.4
  // -----------------------------
  // ^^INCLUDE^^ include/perl/ch20/text2html
  // -----------------------------
  // TODO perl -> BEGIN {
  // TODO perl -> print "<TABLE>";
  // TODO perl -> $_ = encode_entities(scalar <>);
  // TODO perl -> s/\n\s+/ /g; # continuation lines
  // TODO perl -> while ( /^(\S+?:)\s*(.*)$/gm ) { # parse heading
  // TODO perl -> print "<TR><TH ALIGN='LEFT'>$1</TH><TD>$2</TD></TR>\n";
  // TODO perl -> }
  // TODO perl -> print "</TABLE><HR>";
  // TODO perl -> }
  // -----------------------------
  // TODO perl ->
  // </PLEAC>
  }

  public static void _05 () {
  // <PLEAC>

  // ^^PLEAC^^_20.5
  // -----------------------------
  // TODO perl -> $ascii = `lynx -dump $filename`;
  // -----------------------------
  // TODO perl -> use HTML::FormatText;
  // TODO perl -> use HTML::Parse;
  // TODO perl ->
  // TODO perl -> $html = parse_htmlfile($filename);
  // TODO perl -> $formatter = HTML::FormatText->new(leftmargin => 0, rightmargin => 50);
  // TODO perl -> $ascii = $formatter->format($html);
  // -----------------------------
  // TODO perl -> use HTML::TreeBuilder;
  // TODO perl -> use HTML::FormatText;
  // TODO perl ->
  // TODO perl -> $html = HTML::TreeBuilder->new();
  // TODO perl -> $html->parse($document);
  // TODO perl ->
  // TODO perl -> $formatter = HTML::FormatText->new(leftmargin => 0, rightmargin => 50);
  // TODO perl ->
  // TODO perl -> $ascii = $formatter->format($html);
  // -----------------------------
  // TODO perl ->
  // </PLEAC>
  }

  public static void _06 () {
  // <PLEAC>

  // ^^PLEAC^^_20.6
  // -----------------------------
  // TODO perl -> ($plain_text = $html_text) =~ s/<[^>]*>//gs; #WRONG
  // -----------------------------
  // TODO perl -> use HTML::Parse;
  // TODO perl -> use HTML::FormatText;
  // TODO perl -> $plain_text = HTML::FormatText->new->format(parse_html($html_text));
  // -----------------------------
  // % perl -pe 's/<[^>]*>//g' file
  // -----------------------------
  // <IMG SRC = "foo.gif"
  // ALT = "Flurp!">
  // -----------------------------
  // % perl -0777 -pe 's/<[^>]*>//gs' file
  // -----------------------------
  // TODO perl -> {
  // TODO perl -> local $/; # temporary whole-file input mode
  // TODO perl -> $html = <FILE>;
  // TODO perl -> $html =~ s/<[^>]*>//gs;
  // TODO perl -> }
  // -----------------------------
  // <IMG SRC = "foo.gif" ALT = "A > B">
  //
  // <!-- <A comment> -->
  //
  // <script>if (a<b && a>c)</script>
  //
  // <# Just data #>
  //
  // <![INCLUDE CDATA [ >>>>>>>>>>>> ]]>
  // -----------------------------
  // <!-- This section commented out.
  // <B>You can't see me!</B>
  // -->
  // -----------------------------
  // TODO perl -> package MyParser;
  // TODO perl -> use HTML::Parser;
  // TODO perl -> use HTML::Entities qw(decode_entities);
  // TODO perl ->
  // TODO perl -> @ISA = qw(HTML::Parser);
  // TODO perl ->
  // TODO perl -> sub text {
  // TODO perl -> my($self, $text) = @_;
  // TODO perl -> print decode_entities($text);
  // TODO perl -> }
  // TODO perl ->
  // TODO perl -> package main;
  // TODO perl -> MyParser->new->parse_file(*F);
  // -----------------------------
  // TODO perl -> ($title) = ($html =~ m#<TITLE>\s*(.*?)\s*</TITLE>#is);
  // -----------------------------
  // ^^INCLUDE^^ include/perl/ch20/htitle
  // -----------------------------
  // % htitle http://www.ora.com
  // www.oreilly.com -- Welcome to O'Reilly & Associates!
  //
  // % htitle http://www.perl.com/ http://www.perl.com/nullvoid
  // http://www.perl.com/: The www.perl.com Home Page
  // http://www.perl.com/nullvoid: 404 File Not Found
  // -----------------------------
  // TODO perl ->
  // </PLEAC>
  }

  public static void _07 () {
  // <PLEAC>

  // ^^PLEAC^^_20.7
  // -----------------------------
  // ^^INCLUDE^^ include/perl/ch20/churl
  // -----------------------------
  // % churl http://www.wizards.com
  // http://www.wizards.com:
  //
  // FrontPage/FP_Color.gif: OK
  //
  // FrontPage/FP_BW.gif: BAD
  //
  // #FP_Map: OK
  //
  // Games_Library/Welcome.html: OK
  // -----------------------------
  // TODO perl ->
  // </PLEAC>
  }

  public static void _08 () {
  // <PLEAC>

  // ^^PLEAC^^_20.8
  // -----------------------------
  // ^^INCLUDE^^ include/perl/ch20/surl
  // -----------------------------
  // % xurl http://www.perl.com/ | surl | head
  // Mon Apr 20 06:16:02 1998 http://electriclichen.com/linux/srom.html
  //
  // Fri Apr 17 13:38:51 1998 http://www.oreilly.com/
  //
  // Fri Mar 13 12:16:47 1998 http://www2.binevolve.com/
  //
  // Sun Mar 8 21:01:27 1998 http://www.perl.org/
  //
  // Tue Nov 18 13:41:32 1997 http://www.perl.com/universal/header.map
  //
  // Wed Oct 1 12:55:13 1997 http://www.songline.com/
  //
  // Sun Aug 17 21:43:51 1997 http://www.perl.com/graphics/perlhome_header.jpg
  //
  // Sun Aug 17 21:43:47 1997 http://www.perl.com/graphics/perl_id_313c.gif
  //
  // Sun Aug 17 21:43:46 1997 http://www.perl.com/graphics/ora_logo.gif
  //
  // Sun Aug 17 21:43:44 1997 http://www.perl.com/graphics/header-nav.gif
  // -----------------------------
  // TODO perl ->
  // </PLEAC>
  }

  public static void _09 () {
  // <PLEAC>

  // ^^PLEAC^^_20.9
  // -----------------------------
  // TODO perl -> sub template {
  // TODO perl -> my ($filename, $fillings) = @_;
  // TODO perl -> my $text;
  // TODO perl -> local $/; # slurp mode (undef)
  // TODO perl -> local *F; # create local filehandle
  // TODO perl -> open(F, "< $filename\0") || return;
  // TODO perl -> $text = <F>; # read whole file
  // TODO perl -> close(F); # ignore retval
  // TODO perl -> # replace quoted words with value in %$fillings hash
  // TODO perl -> $text =~ s{ %% ( .*? ) %% }
  // TODO perl -> { exists( $fillings->{$1} )
  // TODO perl -> ? $fillings->{$1}
  // TODO perl -> : ""
  // TODO perl -> }gsex;
  // TODO perl -> return $text;
  // TODO perl -> }
  // -----------------------------
  // <!-- simple.template for internal template() function -->
  // <HTML><HEAD><TITLE>Report for %%username%%</TITLE></HEAD>
  // <BODY><H1>Report for %%username%%</H1>
  // %%username%% logged in %%count%% times, for a total of %%total%% minutes.
  // -----------------------------
  // <!-- fancy.template for Text::Template -->
  // <HTML><HEAD><TITLE>Report for {$user}</TITLE></HEAD>
  // <BODY><H1>Report for {$user}</H1>
  // { lcfirst($user) } logged in {$count} times, for a total of
  // { int($total / 60) } minutes.
  // -----------------------------
  // TODO perl -> %fields = (
  // TODO perl -> username => $whats_his_name,
  // TODO perl -> count => $login_count,
  // TODO perl -> total => $minute_used,
  // TODO perl -> );
  // TODO perl ->
  // TODO perl -> print template("/home/httpd/templates/simple.template", \%fields);
  // -----------------------------
  // ^^INCLUDE^^ include/perl/ch20/userrep
  // -----------------------------
  // TODO perl -> You owe: {$total}
  // -----------------------------
  // TODO perl -> The average was {$count ? ($total/$count) : 0}.
  // -----------------------------
  // ^^INCLUDE^^ include/perl/ch20/userrep2
  // -----------------------------
  // TODO perl ->
  // </PLEAC>
  }

  public static void _10 () {
  // <PLEAC>

  // ^^PLEAC^^_20.10
  // -----------------------------
  // TODO perl -> use LWP::Simple;
  // TODO perl -> mirror($URL, $local_filename);
  // -----------------------------
  // TODO perl ->
  // </PLEAC>
  }

  public static void _11 () {
  // <PLEAC>

  // ^^PLEAC^^_20.11
  // -----------------------------
  // TODO perl -> use LWP::RobotUA;
  // TODO perl -> $ua = LWP::RobotUA->new('websnuffler/0.1', 'me@wherever.com');
  // -----------------------------
  // TODO perl -> 403 (Forbidden) Forbidden by robots.txt
  // -----------------------------
  // % GET http://www.webtechniques.com/robots.txt
  // User-agent: *
  //
  // Disallow: /stats
  //
  // Disallow: /db
  //
  // Disallow: /logs
  //
  // Disallow: /store
  //
  // Disallow: /forms
  //
  // Disallow: /gifs
  //
  // Disallow: /wais-src
  //
  // Disallow: /scripts
  //
  // Disallow: /config
  // -----------------------------
  // % GET http://www.cnn.com/robots.txt | head
  // # robots, scram
  //
  // # $I d : robots.txt,v 1.2 1998/03/10 18:27:01 mreed Exp $
  //
  // User-agent: *
  //
  // Disallow: /
  //
  // User-agent: Mozilla/3.01 (hotwired-test/0.1)
  //
  // Disallow: /cgi-bin
  //
  // Disallow: /TRANSCRIPTS
  //
  // Disallow: /development
  // -----------------------------
  // TODO perl ->
  // </PLEAC>
  }

  public static void _12 () {
  // <PLEAC>

  // ^^PLEAC^^_20.12
  // -----------------------------
  // TODO perl -> while (<LOGFILE>) {
  // TODO perl -> my ($client, $identuser, $authuser, $date, $time, $tz, $method,
  // TODO perl -> $url, $protocol, $status, $bytes) =
  // TODO perl -> /^(\S+) (\S+) (\S+) \[([^:]+):(\d+:\d+:\d+) ([^\]]+) "(\S+) (.*?) (\S+)" (\S+)
  // (\S+)$/ or next;
  // TODO perl -> # ...
  // TODO perl -> }
  // -----------------------------
  // TODO perl ->
  // </PLEAC>
  }

  public static void _13 () {
  // <PLEAC>

  // ^^PLEAC^^_20.13
  // -----------------------------
  // ^^INCLUDE^^ include/perl/ch20/sumwww
  // -----------------------------
  // Date Hosts Accesses Unidocs POST Home Bytes
  // 
  // ----------- ------- -------- -------- ------- ------- --------------
  // 
  // 19/May/1998 353 6447 3074 352 51 16058246
  // 
  // 20/May/1998 1938 23868 4288 972 350 61879643
  // 
  // 21/May/1998 1775 27872 6596 1064 376 64613798
  // 
  // 22/May/1998 1680 21402 4467 735 285 52437374
  // 
  // 23/May/1998 1128 21260 4944 592 186 55623059
  // 
  // Grand Total 6050 100849 10090 3715 1248 250612120
  // -----------------------------
  // ^^INCLUDE^^ include/perl/ch20/aprept
  // -----------------------------
  // Domain Records
  // 
  // ===============================
  // 
  // US Commercial 222 38.47%
  // 
  // US Educational 115 19.93%
  // 
  // Network 93 16.12%
  // 
  // Unresolved 54 9.36%
  // 
  // Australia 48 8.32%
  // 
  // Canada 20 3.47%
  // 
  // Mexico 8 1.39%
  // 
  // United Kingdom 6 1.04%
  // 
  // 
  // File Bytes Records
  // 
  // =========================================================
  // 
  // / 13008 0.89% 6 1.04%
  // 
  // /cgi-bin/MxScreen 11870 0.81% 2 0.35%
  // 
  // /cgi-bin/pickcards 39431 2.70% 48 8.32%
  // 
  // /deckmaster 143793 9.83% 21 3.64%
  // 
  // /deckmaster/admin 54447 3.72% 3 0.52%
  // -----------------------------
  // TODO perl ->
  // </PLEAC>
  }

  public static void _14 () {
  // <PLEAC>

  // ^^PLEAC^^_20.14
  // -----------------------------
  // <HTML><HEAD><TITLE>Hi!</TITLE></HEAD><BODY>
  // <H1>Welcome to Scooby World!</H1>
  // I have <A HREF="pictures.html">pictures</A> of the crazy dog
  // himself. Here's one!<P>
  // <IMG SRC="scooby.jpg" ALT="Good doggy!"><P>
  // <BLINK>He's my hero!</BLINK> I would like to meet him some day,
  // and get my picture taken with him.<P>
  // P.S. I am deathly ill. <A HREF="shergold.html">Please send
  // cards</A>.
  // </BODY></HTML>
  // -----------------------------
  // % htmlsub picture photo scooby.html
  // <HTML><HEAD><TITLE>Hi!</TITLE></HEAD><BODY>
  //
  // <H1>Welcome to Scooby World!</H1>
  //
  // I have <A HREF="pictures.html">photos</A> of the crazy dog
  //
  // himself. Here's one!<P>
  //
  // <IMG SRC="scooby.jpg" ALT="Good doggy!"><P>
  //
  // <BLINK>He's my hero!</BLINK> I would like to meet him some day,
  //
  // and get my photo taken with him.<P>
  //
  // P.S. I am deathly ill. <A HREF="shergold.html">Please send
  //
  // cards</A>.
  //
  // </BODY></HTML>
  // -----------------------------
  // ^^INCLUDE^^ include/perl/ch20/htmlsub
  // -----------------------------
  // TODO perl ->
  // </PLEAC>
  }

  public static void _15 () {
  // <PLEAC>

  // ^^PLEAC^^_20.15
  // -----------------------------
  // % hrefsub shergold.html cards.html scooby.html
  // <HTML><HEAD><TITLE>Hi!</TITLE></HEAD><BODY>
  //
  // <H1>Welcome to Scooby World!</H1>
  //
  // I have <A HREF="pictures.html">pictures</A> of the crazy dog
  //
  // himself. Here's one!<P>
  //
  // <IMG SRC="scooby.jpg" ALT="Good doggy!"><P>
  //
  // <BLINK>He's my hero!</BLINK> I would like to meet him some day,
  //
  // and get my picture taken with him.<P>
  //
  // P.S. I am deathly ill. <a href="cards.html">Please send
  //
  // cards</A>.
  //
  // </BODY></HTML>
  // -----------------------------
  // ^^INCLUDE^^ include/perl/ch20/hrefsub
  // -----------------------------
  // </PLEAC>
  }
}
