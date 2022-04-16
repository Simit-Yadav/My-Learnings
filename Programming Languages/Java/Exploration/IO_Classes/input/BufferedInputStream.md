
# BufferedInputStream Class - Byte Stream

<b>Declaration: public class BufferedInputStream extends FilterInputStream</b>

It is used to read information from the stream by buffering. Uses buffer mechanism to work faster.

## Constructor: 
- BufferedInputStream(InputStream IS)
- BufferedInputStream(InputStream IS, int size)

## Important Methods:
- <b>int available()</b> : available bytes in input stream.
- <b>int read()</b> : reads next byte from the input stream.
- <b>void close()</b> : close the input stream and releases any of the system resources.
- <b>long skip(long x)</b> : skips over and discards x bytes of data from the input stream. 