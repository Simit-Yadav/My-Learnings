## Byte Stream and Character Stream
### Byte Stream
- Deal with "raw data". I.E. jpg, audio, video etc.
- Byte by Byte
- Coder responsibility to convert bytes to character
- Does not handle Unicode correctly
- InputStream and OutputStream are the base abstract classes for byte oriented data.
- read/write bytes serially from an external device.

### Character Stream
- Deal with "character data" I.E. text.
- Character by Character
- no worries for coder
- Handle Unicode appropriately.
- Reader and Writer are the base abstract classes for character IO streams.

### Classes
- FileInputStream
- ByteArrayInputStream
- Scanner
- Reader
- FileInputStream
- BufferedInputStream
- Writer
- ByteArrayOutputStream
- BufferedImage
- ImageIO
- FileOutputStream
- BufferedOutputStream