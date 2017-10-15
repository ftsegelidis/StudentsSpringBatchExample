# StudentsSpringBatchExample
A simple spring batch job example with Quartz Scheduler.

Job steps:
- Reads a csv file that contains students info (id,name,average grade)
- Calculates the average grade and gives an characterization (e.g VERY_GOOG , GOOD etc)
- Prints out to console the results


A Quartz Scheduler runs every time we have declared as cron expression. (e.g  [ 0 0/1 * 1/1 * ? * ] means that the job runs every minute)
To see more about cron values go to : http://www.cronmaker.com/
