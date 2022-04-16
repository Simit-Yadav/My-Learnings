# BufferedOutputStream Class - Byte Stream

<b>Declaration: public class BufferedOutputStream extends FilterOutputStream</b>

Used to buffer an output stream. Internally uses buffer to store data.

## Constructor:
- <b>BufferedOutputStream(OutputStream os)</b>
- <b>BufferedOutputStream(OutputStream os, int size)</b>

## Important Methods:
- <b>void write(int b)</b>
- <b>void flush()</b> - It flushes the buffered output stream. It flushes the data of one stream and send it into another. I.E. when flush is executed It sends the data from BufferedOutputStream to OutputStream stream chained to it.