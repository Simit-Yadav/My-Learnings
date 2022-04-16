# FileWriter Class - Character Stream

<b>Declaration: public class FileWriter extends OutputStreamWriterJ</b>

Used to write character oriented data to a file. Character oriented class. We dont need to convert string into byte array like done in FileOutputStream it provides methods to write string directly.

## Constructor:
- FileWriter(String file)
- FileWriter(File fileobj)

## Important Methods: 
- <b>void write(String text)</b> 
- <b>void write(char c)</b> 
- <b>void write(char[] c)</b> 
- <b>void flush()</b> : flushes data of FileWriter.
- <b>void close()</b> 

## Chained:
Often chained with BufferedWriter for buffering and fast write operation.