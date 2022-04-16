
# File Class

File class provides abstraction that deals with most of the machine-dependent complexities of files and path names in a machine-independent language. It is wrapper class for file name and its path.  
  
It encaptulates the properties of a file or path but doesn't contain methods to read/write data to/from a file.

## Constructors: 
<b>File(File parent, String child)</b> ->	It creates a new File instance from a parent abstract pathname and a child pathname string.  

<b>File(String pathname)</b> ->	It creates a new File instance by converting the given pathname string into an abstract pathname.  

<b>File(String parent, String child)</b> ->	It creates a new File instance from a parent pathname string and a child pathname string.  

<b>File(URI uri)</b> ->	It creates a new File instance by converting the given file: URI into an abstract pathname.

## Important Methods
- createTempFile(String prefix, String suffix)
- createNewFile()
- canWrite()
- canExecute()
- canRead()
- isAbsolute()
- isDirectory()
- isFile()
- getName()
- getParent()
- toPath()
- toURI()
- list()
- listFiles()
- getFreeSpace()
- list(FilenameFilter filter)
- mkdir()
- mkdirs()