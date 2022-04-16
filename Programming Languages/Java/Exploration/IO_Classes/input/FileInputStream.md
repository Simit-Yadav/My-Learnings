
# FileInputStream Class - Byte Stream

<b>Declaration: public class FileInputStream extends InputStream</b>

## Construtors:
- public FileInputStream(String filename)
- public FileInputStream(File fileobject)

## Important Methods:
- <b>int available()</b> : returns estimated numbers of bytes that can be read from the input stream.
- <b>int read()</b> : read's a byte of data from the input stream. Returns value from 0 - 255 and -1 if EOF.
- <b>int read(byte[] b)</b>
- <b>long skip(long x)</b> : used to skip over and discard x bytes of data from input stream.
- <b>void close()</b> : close the stream.

## Chained:
Often chained with BufferInputStream for buffering data for faster access.