# Week - 2 - Hardware

### <b>Ports</b>
Connection points that we can connect devices to that extend the functionality of a computer.

### <b>Hardware components</b>
CPU(Central Processing Unit), RAM(Random Access Memory), Hard Drive, Motherboard, Power supply.

### <b>Programs</b>
Instructions that tell the computer what to do.

### <b>EDB - External Data Bus</b>
It helps us to move our data from one compunent to another. It's nothing but group of wires which transmit 1s and 0s like follows if 1 pass current and if 0 don't pass current. It comes in many sizes 8, 16, 32, 64 bits.  

If EDB is of size 8 it means it has 8 wires which can carry 8 bits of data or 1 byte of data in one time.  

### <b>Registers</b>
Registers are components present inside CPU. It allows us to store data which our CPU works with. 

### <b>MCC - Memory Controller Chip </b>
MCC is the bridge between the CPU and RAM. 

### <b>Address Bus</b>
Address Bus connects the CPU to the MCC. It sends over the location of the data and than MCC looks for the location for the data and send it to CPU. 

### <B>Cache</b>
It is faster than RAM are stores recently or frequently used data for faster access.  
  
Cache has three different levels:  
1. L1 - smallest and fastest cache.
1. L2
1. L3

### <b>CPU</b>
Brain of our computer which performs all the calcualtions. It has a instruction book which it follows to perform operations. It has predefined instructions for addition, subtraction etc. 
Every line goes into CPU is first broken down into separate instructions.  
  
We just cannot take any component and assume it will work.  
  
To connect our CPU to a mother board we need a compatible motherboard. CPU is connected to motherboard throught a socket.  
  
Currently there are two type of socket: 
1. Land Grid Array (LGA)
1. Pin Grid Array (PGA)
  
Mainly we need a heat sink to cool down heat from our CPU and exit it with a fan.  

### <b>RAM</b>
Lots of types of RAM are found in Computers Commonly found RAM is DRAM.(Dynamic RAM). Stores 1s and 0s in a capacitor found in DRAM. Capacitor is either charged or discharged.  
  
Memory Stick - DIMM  

DDR SDRAM- Double data rate SDRAM.  

### <b>Motherboard</b>
Motherboard is the component which connect all the components together. It has chipset which controls how all other components talk each other. Chipset is main component which connects RAM, CPU and Peripherals. Motherboard is made of two chips:
1. Northernbridge which basically connects CPU. Many time northern is often integrated with other components. 
1. This basically handles I/O like harddisk, etc.
  
Motherboard also has expansion slots. The standard term for them is <b>PCI Express or Peripheral Component Interconnect Express</b>. We can put additional graphics card and etc.
  
The body is known as Form factor. In present we have two type of form factor <b>ATX(Advanced Technology eXtended) and ITX(Information Technology eXtended)</b>. 

### <b>Storage</b>
Basic storage units in computers. I.E bits, bytes, MB, GB  
HDD - Hard disk drives - Interface we use to connect is SATA. 
SSD - Solid State Drives - interface we use to connect is NVMe. Just like USD.   


### <b>Power Supplies</b>
Our computer works on DC power. The use of power supply is basically to supply power how much our computer needs. 

### <b>Mobile Devices</b>
It packs all the components like RAM, CPU and Storage in a complex way in a mobile devices, tablets, watches etc. They basically has a board called <b>SoC - System on Chip</b>packed with CPU, RAM and sometime Storage. Also found in many small devices. 

### <b>Batteries and Charging Systems</b>
Charge Cycle: 1 full charge and discharge of a battery is known as charge cycle. 

### <b>Peripherals</b>
Other components which extend the functionality of the computer.


### <b>BIOS</b>
BIOS - Basic Input Output service  
Drivers - Drivers contains instructions to understand external devices like Keyboard, webcam, printer and etc.  
ROM - Read Only memory.
UEFI - Unified Extensible Firmware Interface.
CMOS chip - It is present on motherboard. It stores basic data like date, time etc and  how to start up the computer
  
BIOS is a software which initialize our hardware and make our computer up and running. It is not stored on hard drive. It is stored on a chip in Motherboard called ROM chip.  
  
UEFI is another player like BIOS. It performs all the operations of BIOS like booting up and initializing hard ware. But, its modern and has better compabilities.

## Review Computer Assembly.