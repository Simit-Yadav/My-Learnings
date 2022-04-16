# BufferedReader Class - Character Stream

<b>Declaration: publiC BufferedReader extends Reader</b>

Used to read data from a character based input stream. Read data line by line by readLine() method. Performance fast.

## Constructor:
- BufferedReader(Reader rd)
- BufferedReader(Reader rd, int size)

## Important Methods:
- <b>int read()</b> : read a single character.
- <b>String readLine()</b> : It is used for reading a line.
- <b>boolean ready()</b> : test whether input stream is ready to read.
- <b>long skip(long x)</b> : used for skipping the characters.
- <b>void close()</b>