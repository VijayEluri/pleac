package org.nicerobot.pleac;

/**
 * @author nicerobot
 * 
 */

// ^^PLEAC^^_9.0
//-----------------------------
// TODO @entry = stat("/usr/bin/vi") or die "Couldn't stat /usr/bin/vi : $!";
//-----------------------------
// TODO @entry = stat("/usr/bin")    or die "Couldn't stat /usr/bin : $!";
//-----------------------------
// TODO @entry = stat(INFILE)        or die "Couldn't stat INFILE : $!";
//-----------------------------
// TODO use File::stat;

// TODO $inode = stat("/usr/bin/vi");
// TODO $ctime = $inode->ctime;
// TODO $size  = $inode->size;
//-----------------------------
// TODO open( F, "< $filename" )
// TODO     or die "Opening $filename: $!\n";
// TODO unless (-s F && -T _) {
// TODO     die "$filename doesn't have text in it.\n";
// TODO }
//-----------------------------
// TODO opendir(DIRHANDLE, "/usr/bin") or die "couldn't open /usr/bin : $!";
// TODO while ( defined ($filename = readdir(DIRHANDLE)) ) {
// TODO     print "Inside /usr/bin is something called $filename\n";
// TODO }
// TODO closedir(DIRHANDLE);
//-----------------------------

// ^^PLEAC^^_9.1
//-----------------------------
// TODO ($READTIME, $WRITETIME) = (stat($filename))[8,9];

// TODO utime($NEWREADTIME, $NEWWRITETIME, $filename);
//-----------------------------
// TODO $SECONDS_PER_DAY = 60 * 60 * 24;
// TODO ($atime, $mtime) = (stat($file))[8,9];
// TODO $atime -= 7 * $SECONDS_PER_DAY;
// TODO $mtime -= 7 * $SECONDS_PER_DAY;

// TODO utime($atime, $mtime, $file)
// TODO     or die "couldn't backdate $file by a week w/ utime: $!";
//-----------------------------
// TODO $mtime = (stat $file)[9];
// TODO utime(time, $mtime, $file);
//-----------------------------
// TODO use File::stat;
// TODO utime(time, stat($file)->mtime, $file);
//-----------------------------
// ^^INCLUDE^^ include/perl/ch09/uvi
//-----------------------------

// ^^PLEAC^^_9.2
//-----------------------------
// TODO unlink($FILENAME)                 or die "Can't delete $FILENAME: $!\n";
// TODO unlink(@FILENAMES) == @FILENAMES  or die "Couldn't unlink all of @FILENAMES: $!\n";
//-----------------------------
// TODO unlink($file) or die "Can't unlink $file: $!";
//-----------------------------
// TODO unless (($count = unlink(@filelist)) == @filelist) {
// TODO     warn "could only delete $count of "
// TODO             . (@filelist) . " files";
// TODO }
//-----------------------------

// ^^PLEAC^^_9.3
//-----------------------------
// TODO use File::Copy;
// TODO copy($oldfile, $newfile);
//-----------------------------
// TODO open(IN,  "< $oldfile")                     or die "can't open $oldfile: $!";
// TODO open(OUT, "> $newfile")                     or die "can't open $newfile: $!";

// TODO $blksize = (stat IN)[11] || 16384;          # preferred block size?
// TODO while ($len = sysread IN, $buf, $blksize) {
// TODO     if (!defined $len) {
// TODO         next if $! =~ /^Interrupted/;       # ^Z and fg
// TODO         die "System read error: $!\n";
// TODO     }
// TODO     $offset = 0;
// TODO     while ($len) {          # Handle partial writes.
// TODO         defined($written = syswrite OUT, $buf, $len, $offset)
// TODO             or die "System write error: $!\n";
// TODO         $len    -= $written;
// TODO         $offset += $written;
// TODO     };
// TODO }

// TODO close(IN);
// TODO close(OUT);
//-----------------------------
// TODO system("cp $oldfile $newfile");       # unix
// TODO system("copy $oldfile $newfile");     # dos, vms
//-----------------------------
// TODO use File::Copy;

// TODO copy("datafile.dat", "datafile.bak")
// TODO     or die "copy failed: $!";

// TODO move("datafile.new", "datafile.dat")
// TODO     or die "move failed: $!";
//-----------------------------

// ^^PLEAC^^_9.4
//-----------------------------
// TODO %seen = ();

// TODO sub do_my_thing {
// TODO     my $filename = shift;
// TODO     my ($dev, $ino) = stat $filename;

// TODO     unless ($seen{$dev, $ino}++) {
// TODO         # do something with $filename because we haven't
// TODO         # seen it before
// TODO     }
// TODO }
//-----------------------------
// TODO foreach $filename (@files) {
// TODO     ($dev, $ino) = stat $filename;
// TODO     push( @{ $seen{$dev,$ino} }, $filename);
// TODO }

// TODO foreach $devino (sort keys %seen) {
// TODO     ($dev, $ino) = split(/$;/o, $devino);
// TODO     if (@{$seen{$devino}} > 1) {
// TODO         # @{$seen{$devino}} is a list of filenames for the same file
// TODO     }
// TODO }
//-----------------------------

// ^^PLEAC^^_9.5
//-----------------------------
// TODO opendir(DIR, $dirname) or die "can't opendir $dirname: $!";
// TODO while (defined($file = readdir(DIR))) {
// TODO     # do something with "$dirname/$file"
// TODO }
// TODO closedir(DIR);
//-----------------------------
// TODO $dir = "/usr/local/bin";
// TODO print "Text files in $dir are:\n";
// TODO opendir(BIN, $dir) or die "Can't open $dir: $!";
// TODO while( defined ($file = readdir BIN) ) {
// TODO     print "$file\n" if -T "$dir/$file";
// TODO }
// TODO closedir(BIN);
//-----------------------------
// TODO while ( defined ($file = readdir BIN) ) {
// TODO     next if $file =~ /^\.\.?$/;     # skip . and ..
// TODO     # ...
// TODO }
//-----------------------------
// TODO use DirHandle;

// TODO sub plainfiles {
// TODO    my $dir = shift;
// TODO    my $dh = DirHandle->new($dir)   or die "can't opendir $dir: $!";
// TODO    return sort                     # sort pathnames
// TODO           grep {    -f     }       # choose only "plain" files
// TODO           map  { "$dir/$_" }       # create full paths
// TODO           grep {  !/^\./   }       # filter out dot files
// TODO           $dh->
// TODO read()
// TODO ;             # read all entries
// TODO }
//-----------------------------

// ^^PLEAC^^_9.6
//-----------------------------
// TODO @list = <*.c>;
// TODO @list = glob("*.c");
//-----------------------------
// TODO opendir(DIR, $path);
// TODO @files = grep { /\.c$/ } readdir(DIR);
// TODO closedir(DIR);
//-----------------------------
// TODO use File::KGlob;

// TODO @files = glob("*.c");
//-----------------------------
// TODO @files = grep { /\.[ch]$/i } readdir(DH);
//-----------------------------
// TODO use DirHandle;

// TODO $dh = DirHandle->new($path)   or die "Can't open $path : $!\n";
// TODO @files = grep { /\.[ch]$/i } $dh->read();
//-----------------------------
// TODO opendir(DH, $dir)        or die "Couldn't open $dir for reading: $!";

// TODO @files = ();
// TODO while( defined ($file = readdir(DH)) ) {
// TODO     next unless /\.[ch]$/i;

// TODO     my $filename = "$dir/$file";
// TODO     push(@files, $filename) if -T $file;
// TODO }
//-----------------------------
// TODO @dirs = map  { $_->[1] }                # extract pathnames
// TODO         sort { $a->[0] <=> $b->[0] }    # sort names numeric
// TODO         grep { -d $_->[1] }             # path is a dir
// TODO         map  { [ $_, "$path/$_" ] }     # form (name, path)
// TODO         grep { /^\d+$/ }                # just numerics
// TODO         readdir(DIR);                   # all files
//-----------------------------

// ^^PLEAC^^_9.7
//-----------------------------
// TODO use File::Find;
// TODO sub process_file {
// TODO     # do whatever;
// TODO }
// TODO find(\&process_file, @DIRLIST);
//-----------------------------
// TODO @ARGV = qw(.) unless @ARGV;
// TODO use File::Find;
// TODO find sub { print $File::Find::name, -d && '/', "\n" }, @ARGV;
//-----------------------------
// TODO use File::Find;
// TODO @ARGV = ('.') unless @ARGV;
// TODO my $sum = 0;
// TODO find sub { $sum += -s }, @ARGV;
// TODO print "@ARGV contains $sum bytes\n";
//-----------------------------
// TODO use File::Find;
// TODO @ARGV = ('.') unless @ARGV;
// TODO my ($saved_size, $saved_name) = (-1, '');
// TODO sub biggest {
// TODO     return unless -f && -s _ > $saved_size;
// TODO     $saved_size = -s _;
// TODO     $saved_name = $File::Find::name;
// TODO }
// TODO find(\&biggest, @ARGV);
// TODO print "Biggest file $saved_name in @ARGV is $saved_size bytes long.\n";
//-----------------------------
// TODO use File::Find;
// TODO @ARGV = ('.') unless @ARGV;
// TODO my ($age, $name);
// TODO sub youngest {
// TODO     return if defined $age && $age > (stat($_))[9];
// TODO     $age = (stat(_))[9];
// TODO     $name = $File::Find::name;
// TODO }
// TODO find(\&youngest, @ARGV);
// TODO print "$name " . scalar(localtime($age)) . "\n";
//-----------------------------
// ^^INCLUDE^^ include/perl/ch09/fdirs
//-----------------------------
// TODO find sub { print $File::Find::name if -d }, @ARGV;
//-----------------------------
// TODO find { print $name if -d } @ARGV;
//-----------------------------

// ^^PLEAC^^_9.8
//-----------------------------
// ^^INCLUDE^^ include/perl/ch09/rmtree1
//-----------------------------
// ^^INCLUDE^^ include/perl/ch09/rmtree2
//-----------------------------

// ^^PLEAC^^_9.9
//-----------------------------
// TODO foreach $file (@NAMES) {
// TODO     my $newname = $file;
// TODO     # change $newname
// TODO     rename($file, $newname) or  
// TODO         warn "Couldn't rename $file to $newname: $!\n";
// TODO }
//-----------------------------
// ^^INCLUDE^^ include/perl/ch09/rename
//-----------------------------
//% rename 's/\.orig$//'  *.orig
//% rename 'tr/A-Z/a-z/ unless /^Make/'  *
//% rename '$_ .= ".bad"'  *.f
//% rename 'print "$_: "; s/foo/bar/ if <STDIN> =~ /^y/i'  *
//% find /tmp -name '*~' -print | rename 's/^(.+)~$/.#$1/'
//-----------------------------
//% rename 'use locale; $_ = lc($_) unless /^Make/' *
//-----------------------------

// ^^PLEAC^^_9.10
//-----------------------------
// TODO use File::Basename;

// TODO $base = basename($path);
// TODO $dir  = dirname($path);
// TODO ($base, $dir, $ext) = fileparse($path);
//-----------------------------
// TODO $path = '/usr/lib/libc.a';
// TODO $file = basename($path);    
// TODO $dir  = dirname($path);     

// TODO print "dir is $dir, file is $file\n";
// dir is /usr/lib, file is libc.a
//-----------------------------
// TODO $path = '/usr/lib/libc.a';
// TODO ($name,$dir,$ext) = fileparse($path,'\..*');

// TODO print "dir is $dir, name is $name, extension is $ext\n";
// dir is /usr/lib/, name is libc, extension is .a
//-----------------------------
// TODO fileparse_set_fstype("MacOS");
// TODO $path = "Hard%20Drive:System%20Folder:README.txt";
// TODO ($name,$dir,$ext) = fileparse($path,'\..*');

// TODO print "dir is $dir, name is $name, extension is $ext\n";
// dir is Hard%20Drive:System%20Folder, name is README, extension is .txt
//-----------------------------
// TODO sub extension {
// TODO     my $path = shift;
// TODO     my $ext = (fileparse($path,'\..*'))[2];
// TODO     $ext =~ s/^\.//;
// TODO     return $ext;
// TODO }
//-----------------------------

// ^^PLEAC^^_9.11
//-----------------------------
// ^^INCLUDE^^ include/perl/ch09/symirror
//-----------------------------

// ^^PLEAC^^_9.12
//-----------------------------
//% lst -l /etc
//12695 0600      1     root    wheel      512 Fri May 29 10:42:41 1998 
//
//    /etc/ssh_random_seed
//
//12640 0644      1     root    wheel    10104 Mon May 25  7:39:19 1998 
//
//    /etc/ld.so.cache
//
//12626 0664      1     root    wheel    12288 Sun May 24 19:23:08 1998 
//
//    /etc/psdevtab
//
//12304 0644      1     root     root      237 Sun May 24 13:59:33 1998 
//
//    /etc/exports
//
//12309 0644      1     root     root     3386 Sun May 24 13:24:33 1998 
//
//    /etc/inetd.conf
//
//12399 0644      1     root     root    30205 Sun May 24 10:08:37 1998 
//
//    /etc/sendmail.cf
//
//18774 0644      1     gnat  perldoc     2199 Sun May 24  9:35:57 1998 
//
//    /etc/X11/XMetroconfig
//
//12636 0644      1     root    wheel      290 Sun May 24  9:05:40 1998 
//
//    /etc/mtab
//
//12627 0640      1     root     root        0 Sun May 24  8:24:31 1998 
//
//    /etc/wtmplock
//
//12310 0644      1     root  tchrist       65 Sun May 24  8:23:04 1998 
//
//    /etc/issue
//
//....
//-----------------------------
// ^^INCLUDE^^ include/perl/ch09/lst
//-----------------------------
