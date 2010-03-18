package org.nicerobot.pleac;

/**
 * @author nicerobot
 * 
 */
public class _09 {

  public static void _00 () {
    // <PLEAC>

    // ^^PLEAC^^_9.0
    // -----------------------------
    // TODO perl -> @entry = stat("/usr/bin/vi") or die "Couldn't stat /usr/bin/vi : $!";
    // -----------------------------
    // TODO perl -> @entry = stat("/usr/bin") or die "Couldn't stat /usr/bin : $!";
    // -----------------------------
    // TODO perl -> @entry = stat(INFILE) or die "Couldn't stat INFILE : $!";
    // -----------------------------
    // TODO perl -> use File::stat;
    // TODO perl ->
    // TODO perl -> $inode = stat("/usr/bin/vi");
    // TODO perl -> $ctime = $inode->ctime;
    // TODO perl -> $size = $inode->size;
    // -----------------------------
    // TODO perl -> open( F, "< $filename" )
    // TODO perl -> or die "Opening $filename: $!\n";
    // TODO perl -> unless (-s F && -T _) {
    // TODO perl -> die "$filename doesn't have text in it.\n";
    // TODO perl -> }
    // -----------------------------
    // TODO perl -> opendir(DIRHANDLE, "/usr/bin") or die "couldn't open /usr/bin : $!";
    // TODO perl -> while ( defined ($filename = readdir(DIRHANDLE)) ) {
    // TODO perl -> print "Inside /usr/bin is something called $filename\n";
    // TODO perl -> }
    // TODO perl -> closedir(DIRHANDLE);
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _01 () {
    // <PLEAC>

    // ^^PLEAC^^_9.1
    // -----------------------------
    // TODO perl -> ($READTIME, $WRITETIME) = (stat($filename))[8,9];
    // TODO perl ->
    // TODO perl -> utime($NEWREADTIME, $NEWWRITETIME, $filename);
    // -----------------------------
    // TODO perl -> $SECONDS_PER_DAY = 60 * 60 * 24;
    // TODO perl -> ($atime, $mtime) = (stat($file))[8,9];
    // TODO perl -> $atime -= 7 * $SECONDS_PER_DAY;
    // TODO perl -> $mtime -= 7 * $SECONDS_PER_DAY;
    // TODO perl ->
    // TODO perl -> utime($atime, $mtime, $file)
    // TODO perl -> or die "couldn't backdate $file by a week w/ utime: $!";
    // -----------------------------
    // TODO perl -> $mtime = (stat $file)[9];
    // TODO perl -> utime(time, $mtime, $file);
    // -----------------------------
    // TODO perl -> use File::stat;
    // TODO perl -> utime(time, stat($file)->mtime, $file);
    // -----------------------------
    // ^^INCLUDE^^ include/perl/ch09/uvi
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _02 () {
    // <PLEAC>

    // ^^PLEAC^^_9.2
    // -----------------------------
    // TODO perl -> unlink($FILENAME) or die "Can't delete $FILENAME: $!\n";
    // TODO perl -> unlink(@FILENAMES) == @FILENAMES or die "Couldn't unlink all of @FILENAMES: $!\n";
    // -----------------------------
    // TODO perl -> unlink($file) or die "Can't unlink $file: $!";
    // -----------------------------
    // TODO perl -> unless (($count = unlink(@filelist)) == @filelist) {
    // TODO perl -> warn "could only delete $count of "
    // TODO perl -> . (@filelist) . " files";
    // TODO perl -> }
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _03 () {
    // <PLEAC>

    // ^^PLEAC^^_9.3
    // -----------------------------
    // TODO perl -> use File::Copy;
    // TODO perl -> copy($oldfile, $newfile);
    // -----------------------------
    // TODO perl -> open(IN, "< $oldfile") or die "can't open $oldfile: $!";
    // TODO perl -> open(OUT, "> $newfile") or die "can't open $newfile: $!";
    // TODO perl ->
    // TODO perl -> $blksize = (stat IN)[11] || 16384; # preferred block size?
    // TODO perl -> while ($len = sysread IN, $buf, $blksize) {
    // TODO perl -> if (!defined $len) {
    // TODO perl -> next if $! =~ /^Interrupted/; # ^Z and fg
    // TODO perl -> die "System read error: $!\n";
    // TODO perl -> }
    // TODO perl -> $offset = 0;
    // TODO perl -> while ($len) { # Handle partial writes.
    // TODO perl -> defined($written = syswrite OUT, $buf, $len, $offset)
    // TODO perl -> or die "System write error: $!\n";
    // TODO perl -> $len -= $written;
    // TODO perl -> $offset += $written;
    // TODO perl -> };
    // TODO perl -> }
    // TODO perl ->
    // TODO perl -> close(IN);
    // TODO perl -> close(OUT);
    // -----------------------------
    // TODO perl -> system("cp $oldfile $newfile"); # unix
    // TODO perl -> system("copy $oldfile $newfile"); # dos, vms
    // -----------------------------
    // TODO perl -> use File::Copy;
    // TODO perl ->
    // TODO perl -> copy("datafile.dat", "datafile.bak")
    // TODO perl -> or die "copy failed: $!";
    // TODO perl ->
    // TODO perl -> move("datafile.new", "datafile.dat")
    // TODO perl -> or die "move failed: $!";
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _04 () {
    // <PLEAC>

    // ^^PLEAC^^_9.4
    // -----------------------------
    // TODO perl -> %seen = ();
    // TODO perl ->
    // TODO perl -> sub do_my_thing {
    // TODO perl -> my $filename = shift;
    // TODO perl -> my ($dev, $ino) = stat $filename;
    // TODO perl ->
    // TODO perl -> unless ($seen{$dev, $ino}++) {
    // TODO perl -> # do something with $filename because we haven't
    // TODO perl -> # seen it before
    // TODO perl -> }
    // TODO perl -> }
    // -----------------------------
    // TODO perl -> foreach $filename (@files) {
    // TODO perl -> ($dev, $ino) = stat $filename;
    // TODO perl -> push( @{ $seen{$dev,$ino} }, $filename);
    // TODO perl -> }
    // TODO perl ->
    // TODO perl -> foreach $devino (sort keys %seen) {
    // TODO perl -> ($dev, $ino) = split(/$;/o, $devino);
    // TODO perl -> if (@{$seen{$devino}} > 1) {
    // TODO perl -> # @{$seen{$devino}} is a list of filenames for the same file
    // TODO perl -> }
    // TODO perl -> }
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _05 () {
    // <PLEAC>

    // ^^PLEAC^^_9.5
    // -----------------------------
    // TODO perl -> opendir(DIR, $dirname) or die "can't opendir $dirname: $!";
    // TODO perl -> while (defined($file = readdir(DIR))) {
    // TODO perl -> # do something with "$dirname/$file"
    // TODO perl -> }
    // TODO perl -> closedir(DIR);
    // -----------------------------
    // TODO perl -> $dir = "/usr/local/bin";
    // TODO perl -> print "Text files in $dir are:\n";
    // TODO perl -> opendir(BIN, $dir) or die "Can't open $dir: $!";
    // TODO perl -> while( defined ($file = readdir BIN) ) {
    // TODO perl -> print "$file\n" if -T "$dir/$file";
    // TODO perl -> }
    // TODO perl -> closedir(BIN);
    // -----------------------------
    // TODO perl -> while ( defined ($file = readdir BIN) ) {
    // TODO perl -> next if $file =~ /^\.\.?$/; # skip . and ..
    // TODO perl -> # ...
    // TODO perl -> }
    // -----------------------------
    // TODO perl -> use DirHandle;
    // TODO perl ->
    // TODO perl -> sub plainfiles {
    // TODO perl -> my $dir = shift;
    // TODO perl -> my $dh = DirHandle->new($dir) or die "can't opendir $dir: $!";
    // TODO perl -> return sort # sort pathnames
    // TODO perl -> grep { -f } # choose only "plain" files
    // TODO perl -> map { "$dir/$_" } # create full paths
    // TODO perl -> grep { !/^\./ } # filter out dot files
    // TODO perl -> $dh->
    // TODO perl -> read()
    // TODO perl -> ; # read all entries
    // TODO perl -> }
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _06 () {
    // <PLEAC>

    // ^^PLEAC^^_9.6
    // -----------------------------
    // TODO perl -> @list = <*.c>;
    // TODO perl -> @list = glob("*.c");
    // -----------------------------
    // TODO perl -> opendir(DIR, $path);
    // TODO perl -> @files = grep { /\.c$/ } readdir(DIR);
    // TODO perl -> closedir(DIR);
    // -----------------------------
    // TODO perl -> use File::KGlob;
    // TODO perl ->
    // TODO perl -> @files = glob("*.c");
    // -----------------------------
    // TODO perl -> @files = grep { /\.[ch]$/i } readdir(DH);
    // -----------------------------
    // TODO perl -> use DirHandle;
    // TODO perl ->
    // TODO perl -> $dh = DirHandle->new($path) or die "Can't open $path : $!\n";
    // TODO perl -> @files = grep { /\.[ch]$/i } $dh->read();
    // -----------------------------
    // TODO perl -> opendir(DH, $dir) or die "Couldn't open $dir for reading: $!";
    // TODO perl ->
    // TODO perl -> @files = ();
    // TODO perl -> while( defined ($file = readdir(DH)) ) {
    // TODO perl -> next unless /\.[ch]$/i;
    // TODO perl ->
    // TODO perl -> my $filename = "$dir/$file";
    // TODO perl -> push(@files, $filename) if -T $file;
    // TODO perl -> }
    // -----------------------------
    // TODO perl -> @dirs = map { $_->[1] } # extract pathnames
    // TODO perl -> sort { $a->[0] <=> $b->[0] } # sort names numeric
    // TODO perl -> grep { -d $_->[1] } # path is a dir
    // TODO perl -> map { [ $_, "$path/$_" ] } # form (name, path)
    // TODO perl -> grep { /^\d+$/ } # just numerics
    // TODO perl -> readdir(DIR); # all files
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _07 () {
    // <PLEAC>

    // ^^PLEAC^^_9.7
    // -----------------------------
    // TODO perl -> use File::Find;
    // TODO perl -> sub process_file {
    // TODO perl -> # do whatever;
    // TODO perl -> }
    // TODO perl -> find(\&process_file, @DIRLIST);
    // -----------------------------
    // TODO perl -> @ARGV = qw(.) unless @ARGV;
    // TODO perl -> use File::Find;
    // TODO perl -> find sub { print $File::Find::name, -d && '/', "\n" }, @ARGV;
    // -----------------------------
    // TODO perl -> use File::Find;
    // TODO perl -> @ARGV = ('.') unless @ARGV;
    // TODO perl -> my $sum = 0;
    // TODO perl -> find sub { $sum += -s }, @ARGV;
    // TODO perl -> print "@ARGV contains $sum bytes\n";
    // -----------------------------
    // TODO perl -> use File::Find;
    // TODO perl -> @ARGV = ('.') unless @ARGV;
    // TODO perl -> my ($saved_size, $saved_name) = (-1, '');
    // TODO perl -> sub biggest {
    // TODO perl -> return unless -f && -s _ > $saved_size;
    // TODO perl -> $saved_size = -s _;
    // TODO perl -> $saved_name = $File::Find::name;
    // TODO perl -> }
    // TODO perl -> find(\&biggest, @ARGV);
    // TODO perl -> print "Biggest file $saved_name in @ARGV is $saved_size bytes long.\n";
    // -----------------------------
    // TODO perl -> use File::Find;
    // TODO perl -> @ARGV = ('.') unless @ARGV;
    // TODO perl -> my ($age, $name);
    // TODO perl -> sub youngest {
    // TODO perl -> return if defined $age && $age > (stat($_))[9];
    // TODO perl -> $age = (stat(_))[9];
    // TODO perl -> $name = $File::Find::name;
    // TODO perl -> }
    // TODO perl -> find(\&youngest, @ARGV);
    // TODO perl -> print "$name " . scalar(localtime($age)) . "\n";
    // -----------------------------
    // ^^INCLUDE^^ include/perl/ch09/fdirs
    // -----------------------------
    // TODO perl -> find sub { print $File::Find::name if -d }, @ARGV;
    // -----------------------------
    // TODO perl -> find { print $name if -d } @ARGV;
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _08 () {
    // <PLEAC>

    // ^^PLEAC^^_9.8
    // -----------------------------
    // ^^INCLUDE^^ include/perl/ch09/rmtree1
    // -----------------------------
    // ^^INCLUDE^^ include/perl/ch09/rmtree2
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _09 () {
    // <PLEAC>

    // ^^PLEAC^^_9.9
    // -----------------------------
    // TODO perl -> foreach $file (@NAMES) {
    // TODO perl -> my $newname = $file;
    // TODO perl -> # change $newname
    // TODO perl -> rename($file, $newname) or
    // TODO perl -> warn "Couldn't rename $file to $newname: $!\n";
    // TODO perl -> }
    // -----------------------------
    // ^^INCLUDE^^ include/perl/ch09/rename
    // -----------------------------
    // % rename 's/\.orig$//' *.orig
    // % rename 'tr/A-Z/a-z/ unless /^Make/' *
    // % rename '$_ .= ".bad"' *.f
    // % rename 'print "$_: "; s/foo/bar/ if <STDIN> =~ /^y/i' *
    // % find /tmp -name '*~' -print | rename 's/^(.+)~$/.#$1/'
    // -----------------------------
    // % rename 'use locale; $_ = lc($_) unless /^Make/' *
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _10 () {
    // <PLEAC>

    // ^^PLEAC^^_9.10
    // -----------------------------
    // TODO perl -> use File::Basename;
    // TODO perl ->
    // TODO perl -> $base = basename($path);
    // TODO perl -> $dir = dirname($path);
    // TODO perl -> ($base, $dir, $ext) = fileparse($path);
    // -----------------------------
    // TODO perl -> $path = '/usr/lib/libc.a';
    // TODO perl -> $file = basename($path);
    // TODO perl -> $dir = dirname($path);
    // TODO perl ->
    // TODO perl -> print "dir is $dir, file is $file\n";
    // dir is /usr/lib, file is libc.a
    // -----------------------------
    // TODO perl -> $path = '/usr/lib/libc.a';
    // TODO perl -> ($name,$dir,$ext) = fileparse($path,'\..*');
    // TODO perl ->
    // TODO perl -> print "dir is $dir, name is $name, extension is $ext\n";
    // dir is /usr/lib/, name is libc, extension is .a
    // -----------------------------
    // TODO perl -> fileparse_set_fstype("MacOS");
    // TODO perl -> $path = "Hard%20Drive:System%20Folder:README.txt";
    // TODO perl -> ($name,$dir,$ext) = fileparse($path,'\..*');
    // TODO perl ->
    // TODO perl -> print "dir is $dir, name is $name, extension is $ext\n";
    // dir is Hard%20Drive:System%20Folder, name is README, extension is .txt
    // -----------------------------
    // TODO perl -> sub extension {
    // TODO perl -> my $path = shift;
    // TODO perl -> my $ext = (fileparse($path,'\..*'))[2];
    // TODO perl -> $ext =~ s/^\.//;
    // TODO perl -> return $ext;
    // TODO perl -> }
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _11 () {
    // <PLEAC>

    // ^^PLEAC^^_9.11
    // -----------------------------
    // ^^INCLUDE^^ include/perl/ch09/symirror
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }

  public static void _12 () {
    // <PLEAC>

    // ^^PLEAC^^_9.12
    // -----------------------------
    // % lst -l /etc
    // 12695 0600 1 root wheel 512 Fri May 29 10:42:41 1998
    //
    // /etc/ssh_random_seed
    //
    // 12640 0644 1 root wheel 10104 Mon May 25 7:39:19 1998
    //
    // /etc/ld.so.cache
    //
    // 12626 0664 1 root wheel 12288 Sun May 24 19:23:08 1998
    //
    // /etc/psdevtab
    //
    // 12304 0644 1 root root 237 Sun May 24 13:59:33 1998
    //
    // /etc/exports
    //
    // 12309 0644 1 root root 3386 Sun May 24 13:24:33 1998
    //
    // /etc/inetd.conf
    //
    // 12399 0644 1 root root 30205 Sun May 24 10:08:37 1998
    //
    // /etc/sendmail.cf
    //
    // 18774 0644 1 gnat perldoc 2199 Sun May 24 9:35:57 1998
    //
    // /etc/X11/XMetroconfig
    //
    // 12636 0644 1 root wheel 290 Sun May 24 9:05:40 1998
    //
    // /etc/mtab
    //
    // 12627 0640 1 root root 0 Sun May 24 8:24:31 1998
    //
    // /etc/wtmplock
    //
    // 12310 0644 1 root tchrist 65 Sun May 24 8:23:04 1998
    //
    // /etc/issue
    //
    // ....
    // -----------------------------
    // ^^INCLUDE^^ include/perl/ch09/lst
    // -----------------------------
    // TODO perl ->
    // </PLEAC>
  }
}
