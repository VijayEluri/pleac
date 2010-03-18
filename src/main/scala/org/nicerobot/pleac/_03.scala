package org.nicerobot.pleac;

/**
 * @author nicerobot
 * 
 */


// ^^PLEAC^^_3.0
//-----------------------------
// TODO $sec
//-----------------------------
// TODO $min
//-----------------------------
// TODO $hours
//-----------------------------
// TODO $mday
//-----------------------------
// TODO $month
//-----------------------------
// TODO $year
//-----------------------------
// TODO $wday
//-----------------------------
// TODO $yday
//-----------------------------
// TODO $isdst
//-----------------------------
//Fri Apr 11 09:27:08 1997
//-----------------------------
// using arrays
// TODO print "Today is day ", (localtime)[7], " of the current year.\n";
// Today is day 117 of the current year.

// using Time::tm objects
// TODO use Time::localtime;
// TODO $tm = localtime;
// TODO print "Today is day ", $tm->yday, " of the current year.\n";
// Today is day 117 of the current year.
//-----------------------------

// ^^PLEAC^^_3.1
//-----------------------------
// TODO ($DAY, $MONTH, $YEAR) = (localtime)[3,4,5];
//-----------------------------
// TODO use Time::localtime;
// TODO $tm = localtime;
// TODO ($DAY, $MONTH, $YEAR) = ($tm->mday, $tm->mon, $tm->year);
//-----------------------------
// TODO ($day, $month, $year) = (localtime)[3,4,5];
// TODO printf("The current date is %04d %02d %02d\n", $year+1900, $month+1, $day);
// The current date is 1998 04 28
//-----------------------------
// TODO ($day, $month, $year) = (localtime)[3..5];
//-----------------------------
// TODO use Time::localtime;
// TODO $tm = localtime;
// TODO printf("The current date is %04d-%02d-%02d\n", $tm->year+1900, 
// TODO     ($tm->mon)+1, $tm->mday);
// The current date is 1998-04-28
//-----------------------------
// TODO printf("The current date is %04d-%02d-%02d\n",
// TODO        sub {($_[5]+1900, $_[4]+1, $_[3])}->(localtime));
//-----------------------------
// TODO use POSIX qw(strftime);
// TODO print strftime "%Y-%m-%d\n", localtime;
//-----------------------------

// ^^PLEAC^^_3.2
//-----------------------------
// TODO use Time::Local;
// TODO $TIME = timelocal($sec, $min, $hours, $mday, $mon, $year);
// TODO $TIME = timegm($sec, $min, $hours, $mday, $mon, $year);
//-----------------------------
// $hours, $minutes, and $seconds represent a time today,
// in the current time zone
// TODO use Time::Local;
// TODO $time = timelocal($seconds, $minutes, $hours, (localtime)[3,4,5]);
//-----------------------------
// $day is day in month (1-31)
// $month is month in year (1-12)
// $year is four-digit year e.g., 1967
// $hours, $minutes and $seconds represent UTC time 
// TODO use Time::Local;
// TODO $time = timegm($seconds, $minutes, $hours, $day, $month-1, $year-1900);
//-----------------------------

// ^^PLEAC^^_3.3
//-----------------------------
// TODO ($seconds, $minutes, $hours, $day_of_month, $month, $year,
// TODO     $wday, $yday, $isdst) = localtime($time);
//-----------------------------
// TODO use Time::localtime;        # or Time::gmtime
// TODO $tm = localtime($TIME);     # or gmtime($TIME)
// TODO $seconds = $tm->sec;
// ...
//-----------------------------
// TODO ($seconds, $minutes, $hours, $day_of_month, $month, $year,
// TODO     $wday, $yday, $isdst) = localtime($time);
// TODO printf("Dateline: %02d:%02d:%02d-%04d/%02d/%02d\n",
// TODO     $hours, $minutes, $seconds, $year+1900, $month+1,
// TODO     $day_of_month);
//-----------------------------
// TODO use Time::localtime;
// TODO $tm = localtime($time);
// TODO printf("Dateline: %02d:%02d:%02d-%04d/%02d/%02d\n",
// TODO     $tm->hour, $tm->min, $tm->sec, $tm->year+1900,
// TODO     $tm->mon+1, $tm->mday);
//-----------------------------

// ^^PLEAC^^_3.4
//-----------------------------
// TODO $when = $now + $difference;
// TODO $then = $now - $difference;
//-----------------------------
// TODO use Date::Calc qw(Add_Delta_Days);
// TODO ($y2, $m2, $d2) = Add_Delta_Days($y, $m, $d, $offset);
//-----------------------------
// TODO use Date::Calc qw(Add_Delta_DHMS);
// TODO ($year2, $month2, $day2, $h2, $m2, $s2) = 
// TODO     Add_Delta_DHMS( $year, $month, $day, $hour, $minute, $second,
// TODO                 $days_offset, $hour_offset, $minute_offset, $second_offset );
//-----------------------------
// TODO $birthtime = 96176750;                  # 18/Jan/1973, 3:45:50 am
// TODO $interval = 5 +                         # 5 seconds
// TODO             17 * 60 +                   # 17 minutes
// TODO             2  * 60 * 60 +              # 2 hours
// TODO             55 * 60 * 60 * 24;          # and 55 days
// TODO $then = $birthtime + $interval;
// TODO print "Then is ", scalar(localtime($then)), "\n";
// Then is Wed Mar 14 06:02:55 1973
//-----------------------------
// TODO use Date::Calc qw(Add_Delta_DHMS);
// TODO ($year, $month, $day, $hh, $mm, $ss) = Add_Delta_DHMS(
// TODO     1973, 1, 18, 3, 45, 50, # 18/Jan/1973, 3:45:50 am
// TODO              55, 2, 17, 5); # 55 days, 2 hrs, 17 min, 5 sec
// TODO print "To be precise: $hh:$mm:$ss, $month/$day/$year\n";
// To be precise: 6:2:55, 3/14/1973
//-----------------------------
// TODO use Date::Calc qw(Add_Delta_Days);
// TODO ($year, $month, $day) = Add_Delta_Days(1973, 1, 18, 55);
// TODO print "Nat was 55 days old on: $month/$day/$year\n";
// Nat was 55 days old on: 3/14/1973
//-----------------------------

// ^^PLEAC^^_3.5
//-----------------------------
// TODO $seconds = $recent - $earlier;
//-----------------------------
// TODO use Date::Calc qw(Delta_Days);
// TODO $days = Delta_Days( $year1, $month1, $day1, $year2, $month2, $day2);
//-----------------------------
// TODO use Date::Calc qw(Delta_DHMS);
// TODO ($days, $hours, $minutes, $seconds) =
// TODO   Delta_DHMS( $year1, $month1, $day1, $hour1, $minute1, $seconds1,  # earlier
// TODO               $year2, $month2, $day2, $hour2, $minute2, $seconds2); # later
//-----------------------------
// TODO $bree = 361535725;          # 16 Jun 1981, 4:35:25
// TODO $nat  =  96201950;          # 18 Jan 1973, 3:45:50

// TODO $difference = $bree - $nat;
// TODO print "There were $difference seconds between Nat and Bree\n";
// There were 265333775 seconds between Nat and Bree


// TODO $seconds    =  $difference % 60;
// TODO $difference = ($difference - $seconds) / 60;
// TODO $minutes    =  $difference % 60;
// TODO $difference = ($difference - $minutes) / 60;
// TODO $hours      =  $difference % 24;
// TODO $difference = ($difference - $hours)   / 24;
// TODO $days       =  $difference % 7;
// TODO $weeks      = ($difference - $days)    /  7;

// TODO print "($weeks weeks, $days days, $hours:$minutes:$seconds)\n";
// (438 weeks, 4 days, 23:49:35)
//-----------------------------
// TODO use Date::Calc qw(Delta_Days);
// TODO @bree = (1981, 6, 16);      # 16 Jun 1981
// TODO @nat  = (1973, 1, 18);      # 18 Jan 1973
// TODO $difference = Delta_Days(@nat, @bree);
// TODO print "There were $difference days between Nat and Bree\n";
// There were 3071 days between Nat and Bree
//-----------------------------
// TODO use Date::Calc qw(Delta_DHMS);
// TODO @bree = (1981, 6, 16, 4, 35, 25);   # 16 Jun 1981, 4:35:25
// TODO @nat  = (1973, 1, 18, 3, 45, 50);   # 18 Jan 1973, 3:45:50
// TODO @diff = Delta_DHMS(@nat, @bree);
// TODO print "Bree came $diff[0] days, $diff[1]:$diff[2]:$diff[3] after Nat\n";
// Bree came 3071 days, 0:49:35 after Nat
//-----------------------------

// ^^PLEAC^^_3.6
//-----------------------------
// TODO ($MONTHDAY, $WEEKDAY, $YEARDAY) = (localtime $DATE)[3,6,7];
// TODO $WEEKNUM = int($YEARDAY / 7) + 1;
//-----------------------------
// TODO use Date::Calc qw(Day_of_Week Week_Number Day_of_Year);
// you have $year, $month, and $day
// $day is day of month, by definition.
// TODO $wday = Day_of_Week($year, $month, $day);
// TODO $wnum = Week_Number($year, $month, $day);
// TODO $dnum = Day_of_Year($year, $month, $day);
//-----------------------------
// TODO use Date::Calc qw(Day_of_Week Week_Number Day_of_Week_to_Text)

// TODO $year  = 1981;
// TODO $month = 6;         # (June)
// TODO $day   = 16;

// TODO $wday = Day_of_Week($year, $month, $day);
// TODO print "$month/$day/$year was a ", Day_of_Week_to_Text($wday), "\n";
//# see comment above

// TODO $wnum = Week_Number($year, $month, $day);
// TODO print "in the $wnum week.\n";
// 6/16/1981 was a Tuesday
// 
// in week number 25.
//-----------------------------

// ^^PLEAC^^_3.7
//-----------------------------
// TODO use Time::Local;
// $date is "1998-06-03" (YYYY-MM-DD form).
// TODO ($yyyy, $mm, $dd) = $date =~ /(\d+)-(\d+)-(\d+)/;
// calculate epoch seconds at midnight on that day in this timezone
// TODO $epoch_seconds = timelocal(0, 0, 0, $dd, $mm, $yyyy);
//-----------------------------
// TODO use Date::Manip qw(ParseDate UnixDate);
// TODO $date = ParseDate($string);
// TODO if (!$date) {
// TODO     # bad date
// TODO } else {
// TODO     @values = UnixDate($date, @formats);
// TODO }
//-----------------------------
// TODO use Date::Manip qw(ParseDate UnixDate);

// TODO while (<>) {
// TODO     $date = ParseDate($_);
// TODO     if (!$date) {
// TODO         warn "Bad date string: $_\n";
// TODO         next;
// TODO     } else {
// TODO         ($year, $month, $day) = UnixDate($date, "%Y", "%m", "%d");
// TODO         print "Date was $month/$day/$year\n";
// TODO     }
// TODO }
//-----------------------------

// ^^PLEAC^^_3.8
//-----------------------------
// TODO $STRING = localtime($EPOCH_SECONDS);
//-----------------------------
// TODO use POSIX qw(strftime);
// TODO $STRING = strftime($FORMAT, $SECONDS, $MINUTES, $HOUR,
// TODO                    $DAY_OF_MONTH, $MONTH, $YEAR, $WEEKDAY,
// TODO                    $YEARDAY, $DST);
//-----------------------------
// TODO use Date::Manip qw(UnixDate);
// TODO $STRING = UnixDate($DATE, $FORMAT);
//-----------------------------
// Sun Sep 21 15:33:36 1997
//-----------------------------
// TODO use Time::Local;
// TODO $time = timelocal(50, 45, 3, 18, 0, 73);
// TODO print "Scalar localtime gives: ", scalar(localtime($time)), "\n";
// Scalar localtime gives: Thu Jan 18 03:45:50 1973
//-----------------------------
// TODO use POSIX qw(strftime);
// TODO use Time::Local;
// TODO $time = timelocal(50, 45, 3, 18, 0, 73);
// TODO print "strftime gives: ", strftime("%A %D", localtime($time)), "\n";
// strftime gives: Thursday 01/18/73
//-----------------------------
// TODO use Date::Manip qw(ParseDate UnixDate);
// TODO $date = ParseDate("18 Jan 1973, 3:45:50");
// TODO $datestr = UnixDate($date, "%a %b %e %H:%M:%S %z %Y");    # as scalar
// TODO print "Date::Manip gives: $datestr\n";
// Date::Manip gives: Thu Jan 18 03:45:50 GMT 1973
//-----------------------------

// ^^PLEAC^^_3.9
//-----------------------------
// TODO use Time::HiRes qw(gettimeofday);
// TODO $t0 = gettimeofday;
//# do your operation here
// TODO $t1 = gettimeofday;
// TODO $elapsed = $t1 - $t0;
// $elapsed is a floating point value, representing number
// of seconds between $t0 and $t1
//-----------------------------
// TODO use Time::HiRes qw(gettimeofday);
// TODO print "Press return when ready: ";
// TODO $before = gettimeofday;
// TODO $line = <>;
// TODO $elapsed = gettimeofday-$before;
// TODO print "You took $elapsed seconds.\n";
// Press return when ready: 
// 
// You took 0.228149 seconds.
//-----------------------------
// TODO require 'sys/syscall.ph';

// initialize the structures returned by gettimeofday
// TODO $TIMEVAL_T = "LL";
// TODO $done = $start = pack($TIMEVAL_T, ());

// prompt
// TODO print "Press return when ready: ";

// read the time into $start
// TODO syscall(&SYS_gettimeofday, $start, 0) != -1
// TODO            || die "gettimeofday: $!";

// read a line
// TODO $line = <>;

// read the time into $done
// TODO syscall(&SYS_gettimeofday, $done, 0) != -1
// TODO        || die "gettimeofday: $!";

// expand the structure
// TODO @start = unpack($TIMEVAL_T, $start);
// TODO @done  = unpack($TIMEVAL_T, $done);

// fix microseconds
// TODO for ($done[1], $start[1]) { $_ /= 1_000_000 }
// TODO     
// calculate time difference
// TODO $delta_time = sprintf "%.4f", ($done[0]  + $done[1]  )
// TODO                                          -
// TODO                               ($start[0] + $start[1] );

// TODO print "That took $delta_time seconds\n";
// Press return when ready: 
// 
// That took 0.3037 seconds
//-----------------------------
// TODO use Time::HiRes qw(gettimeofday);
// take mean sorting time
// TODO $size = 500;
// TODO $number_of_times = 100;
// TODO $total_time = 0;

// TODO for ($i = 0; $i < $number_of_times; $i++) {
// TODO     my (@array, $j, $begin, $time);
// TODO     # populate array
// TODO     @array = ();
// TODO     for ($j=0; $j<$size; $j++) { push(@array, rand) }

// TODO     # sort it
// TODO     $begin = gettimeofday;
// TODO     @array = sort { $a <=> $b } @array;
// TODO     $time = gettimeofday-$begin;
// TODO     $total_time += $time;
// TODO }

// TODO printf "On average, sorting %d random numbers takes %.5f seconds\n",
// TODO     $size, ($total_time/$number_of_times);
// On average, sorting 500 random numbers takes 0.02821 seconds
//-----------------------------

// ^^PLEAC^^_3.10
//-----------------------------
// TODO select(undef, undef, undef, $time_to_sleep);
//-----------------------------
// TODO use Time::HiRes qw(sleep);
// TODO sleep($time_to_sleep);
//-----------------------------
// TODO while (<>) {
// TODO     select(undef, undef, undef, 0.25);
// TODO     print;
// TODO }
//-----------------------------
// TODO use Time::HiRes qw(sleep);
// TODO while (<>) {
// TODO     sleep(0.25);
// TODO     print;
// TODO }
//-----------------------------

// ^^PLEAC^^_3.11
//-----------------------------
// TODO use Date::Manip qw(ParseDate DateCalc);
// TODO $d1 = ParseDate("Tue, 26 May 1998 23:57:38 -0400");
// TODO $d2 = ParseDate("Wed, 27 May 1998 05:04:03 +0100");
// TODO print DateCalc($d1, $d2);
// +0:0:0:0:0:6:25
//-----------------------------
// ^^INCLUDE^^ include/perl/ch03/hopdelta
//-----------------------------
// Sender               Recipient            Time                   Delta
// 
// Start                wall.org             09:17:12 1998/05/23
// 
// wall.org             mail.brainstorm.net  09:20:56 1998/05/23    44s   3m
// 
// mail.brainstorm.net  jhereg.perl.com      09:20:58 1998/05/23     2s
//  
//-----------------------------
