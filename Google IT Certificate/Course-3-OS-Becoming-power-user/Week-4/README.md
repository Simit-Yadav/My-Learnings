# <b>Week - 4 - Filesystems</b>

### <b>Type of file systems</b>
Windows: NTFS  
Linux: ext4  
For all windows,Linux,MAC OS: FAT32

### <b>Partition Table</b>
It tells the OS how the disk is partitioned.
Two types:  
1. MBR - Master Boot Record.
1. GPT - GUID Partition Table

### <b>Disk Partition and filesystem in Windows</b>
From GUI do it with Disk Management.  
From CLI there is a utility called DiskPart. Type it in CLI and good to go.

### <b>Disk Partition and Filesystem in Linux</b>
Utility called <b>parted</b> is used to do it.  
List blocks: lsblk -l -> the command list all the devices connect to the system.  
df -h -> list free space available on each partition. -h for human understandable form.  
fdisk -l devicename(optional) -> list all partitions. 

### <b>Make hard and soft link in Windows</b>
Soft Link: mklink newfilename oldfilename  
Hard Link: mklink /H newfilename oldfilename

### <b>Make hard and soft link in Linux</b>
SOft Link: ln -s oldfilename newfilename  
Hard Link: ln oldfilename newfilename