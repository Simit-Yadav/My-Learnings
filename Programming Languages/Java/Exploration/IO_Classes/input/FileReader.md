# FileReader Class - Character Stream

<b>Declaration: public class FileReader extends InputStreamReader</b>

Used to read data from a file. Returns data in byte format like FileInputStream class.

## Constructor: 
- FileReader(String filename/path)
- FileReader(File fileobj)

## Important Methods:
- <b>int read()</b> : returns a character in ASCII form. -1 at end of file.
- <b>void close()</b> : used to close the FileReader class.

## Chained:
Often chained with BufferedReader for buffering and fast access.