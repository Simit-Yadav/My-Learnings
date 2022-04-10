# Week - 5 - Process Management

### <b>Kill a task in Windows</b>
command: taskkill /pid id -> (pid means the process id and id means the id).  
GUI: use task manager

### <b>Kill a process in Linux</b>
command: kill pid  
command: kill -KILL pid -> kill process absolutely
command: kill -TSTP pid -> it suspends the process.
command: kill -CONT pid -> continues the process.

### <b>How to view processes and their id in Windows</b>
cmd: tasklist  
powershell: Get-Process  
GUI: use task manager details tab.

### <b>How to view processes on the system and their details on Linux</b>
ps -x  
ps -ef -> all the processes of other users (-e) and (f) means full.  
ps -aux

### <b>See top task running in Linux</b>
cmd: top
cmd: uptime
cmd: lsof
