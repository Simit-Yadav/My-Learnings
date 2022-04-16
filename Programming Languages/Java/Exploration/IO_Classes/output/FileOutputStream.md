# FileOutputStream Class - Byte Stream

<b>Declaration: public class FielOutputStream extends OutputStream</b>

Used to write data to a file. Use it to write primitive values to a file. It can write both byte and character oriented data.

## Constructors: 
- public FileOutputStream(String filename)
- public FileOutputStream(String filename, boolean append)
- public FileOutputStream(File fileobj)
- public FileOutputStream(File fileobj, boolean append)

## Important Methods: 
- <b>void write(int b)</b> : it is used to write specified byte to a output stream.
- <b>void write(byte[] b)</b>
- <b>void close()</b> : close the output stream connection. 

## Chained:
Often chained with BufferOutputStream for buffering data for fast processing.
