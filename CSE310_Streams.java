/*
- Java I/O (Input and Output) is used to process the input and produce the output. 
- Java uses the concept of a stream to make I/O operation fast.
- The java.io package contains all the classes required for input and output operations.
- We can perform file handling in Java by Java I/O API.
- Java brings various Streams with its I/O package that helps the user to perform all the input-output operations.
- These streams support all the types of objects, data-types, characters, files etc to fully execute the I/O operations.

Stream:
  A stream can be defined as a sequence of data. In Java, a stream is composed of bytes.
  There are two kinds of Streams:
  • InputStream − The InputStream is used to read data from a source.
  • OutputStream − The OutputStream is used for writing data to a destination.
Streams can be divided into 2 primary classes based on the data they hold:
  - ByteStream
  - CharacterStream
ByteStream:
  This is used to process data byte by byte (8 bits), i.e., to read and write binary data.
  Though it has many classes, the FileInputStream and the FileOutputStream are the most popular ones.
  The FileInputStream is used to read from the source and FileOutputStream is used to write to the destination.
  Byte stream is used to read and write a single byte (8 bits) of data.
  All byte stream classes are derived from base abstract classes called InputStream and OutputStream.
CharacterStream:
  In Java, characters are stored using Unicode conventions.
  Character stream automatically allows us to read/write data character by character, i.e., to read and write binary data.
  Though it has many classes, the FileReader and the FileWriter are the most popular ones.
  FileReader and FileWriter are character streams used to read from the source and write to the destination respectively.
  Character stream is used to read and write a single character of data.
  All the character stream classes are derived from base abstract classes Reader and Writer.
  InputStreamReader -> byte to char. OutputStreamReader -> char to byte.

FileInputStream:
  This class reads the data from a specific file (byte by byte).
  It is usually used to read the contents of a file with raw bytes, such as images.
  - read() Method:
    •read() - reads a single byte from the file
    •read(byte[] array) - reads the bytes from the file and stores in the specified array
    •read(byte[] array, int start, int length) - reads the number of bytes equal to length
    from the file and stores in the specified array starting from the position start
  - available() Method: To get the number of available bytes, we can use the available() method.
  - skip() Method: To discard and skip the specified number of bytes, we can use the skip(<numOfBytesToSkip>) method.
FileOutputStream:
  This class writes the data to a specific file (byte by byte).
  It is usually used to write the contents of a file with raw bytes, such as images.
  - write() Method:
    •write(int byte) - writes a single byte to the file
    •write(byte[] array) - writes the bytes from the specified array to the file
    •write(byte[] array, int start, int length) - writes the number of bytes equal to length
    from the specified array to the file starting from the position start

FileReader:
  This class reads the data from a specific file (character by character).
  It is usually used to read the contents of a file with characters, such as text files.
  •This class inherits from the Reader Class.
  •FileReader is meant for reading streams of characters. For reading streams of raw bytes,
  consider using a FileInputStream. 
  Constructors:
    •FileReader(File file) – Creates a FileReader , given the File to read from
    •FileReader(String fileName) – Creates a new FileReader , given the name of the file to read from
  Methods:
    •public int read() throws IOException – Reads a single character. This method blocks until a character is
    available, an I/O error occurs, or the end of the stream is reached.
    •public int read(char[] cbuff) throws IOException – Reads characters into an array. This method blocks until
    some input is available, an I/O error occurs, or the end of the stream is reached.
    •public abstract int read(char[] buff, int off, int len) throws IOException – Reads characters into a portion of an
    array. This method blocks until some input is available, an I/O error occurs, or the end of the stream is reached.
FileWriter:
  This is useful to create a file, writing characters into it.
  •This class inherits from the Writer class.
  •It is meant for writing streams of characters. For writing streams of raw bytes, consider using a FileOutputStream.
  •FileWriter creates the output file, if it is not present already.

DataInputStream:
  This class allows an application to read primitive data types from the input stream in a machine-independent way.
DataOutputStream:
  This class allows an application to write primitive data types to the output stream in a machine-independent way.

BufferedInputStream:
  This class is used to read information from streams. It internally uses buffer mechanism to make the performance fast.
  The important points about BufferedInputStream are:
    •When the bytes from the stream are skipped or read, the internal buffer is automatically refilled from the contained
    input stream, many bytes at a time.
    •When a BufferedInputStream is created, an internal buffer array is created.
BufferedOutputStream:
  This class is used for buffering an output stream. It internally uses buffer to store data. It
  adds more efficiency than to write data directly into a stream. So, it makes the performance fast.
  The flush() flushes the data of one stream and sends it into another.
  It is required if you have connected one stream to the other.
What are BufferedInputStream and BufferedOutputStream?
  They are “buffered” versions of FileInputStream and FileOutputStream.
  BufferedInputStream: for faster reading
  BufferedOutputStream: for faster writing
  They wrap around a normal input/output stream to make it more efficient.
What does “buffered” mean?
  Think of a buffer like a temporary storage box in memory.
  Instead of reading/writing one byte at a time (which is slow), buffered streams:
  - collect a bunch of bytes in memory first, and
  - then read/write them all at once — much faster!
  Real-life analogy:
    Imagine you’re filling bottles with water:
    Without buffering: You pour one drop at a time into each bottle — slow and wasteful.
    With buffering: You use a jug to hold a lot of water, then pour it all at once — fast and efficient.
    That’s what buffering does.
  Buffered streams improve performance by minimizing the number of read/write operations.
    Example:
      BufferedInputStream, BufferedOutputStream (for binary data)
      BufferedReader, BufferedWriter (for text data)
 
SequenceInputStream:
  It is a special input stream that allows you to read from multiple input streams,
  one after the other, as if they were one single stream.
  It reads data sequentially.
  Real-world analogy:
    Imagine you have two books, and you want to read both as one continuous story.
    Instead of opening Book 1, then switching to Book 2 manually…
    SequenceInputStream does it for you:
    “Read Book 1 until the end, then immediately start Book 2.”
SequenceOutputStream does not exist in Java!
  Why? Because it doesn't really make sense to "write" to multiple files one after the other.
  Input: Combining multiple things into one makes sense (SequenceInputStream) ✅
  Output: Splitting one thing into many? Not practical in this style ❌
  If you want to write to multiple files, you do it manually with multiple OutputStreams — not through a sequence class.

File class:
  File handling is an important part of any application.
  Java has several methods for creating, reading, updating, and deleting files.
  The File class from the java.io package allows us to work with files.
  To use the File class, create an object of the class, and specify the file name or directory name:
    import java.io.File; // Import the File class
    File myObj = new File("filename.txt"); // Specify the filename
  To create a file in Java, you can use the createNewFile() method. This method returns a boolean value: true if the
  file was successfully created, and false if the file already exists. Note that the method is enclosed in
  a try...catch block. This is necessary because it throws an IOException if an error occurs (if the file cannot be
  created for some reason).
  To create a file in a specific directory (requires permission), specify the path of the file and use double backslashes
  to escape the "\" character (for Windows): File myObj = new File("C:\\Users\\MyName\\filename.txt");
  On Mac and Linux you can just write the path, like: /Users/name/filename.txt

RandomAccessFile class:
  This class is used for reading and writing to random access file. The java.io package has a built-in
  class RandomAccessFile that enables a file to be accessed randomly. The RandomAccessFile class has several
  methods used to move the cursor position in a file.
  If the end-of-file is reached before the desired number of bytes have been read then an EOFException is thrown,
  which is a type of IOException.
  It’s a special class in Java that lets you:
  - Read and write to a file
  - Move around (jump to any part of the file) — not just read/write from start to end 
  Real-world analogy:
    Imagine a notebook:
    Normal streams = You can only read/write from start to end, like turning one page at a time.
    RandomAccessFile = You can flip to any page and read/write directly there!

Files Class for FIle I/O:
  The Files class from java.nio.file simplifies file reading and writing operations.
    Code example (read all lines):
      List<String> lines = Files.readAllLines(Paths.get("input.txt"));
      lines.forEach(System.out.println);
    Code example (read all lines):
      Files.write(Paths.get("output.txt"), lines, StandardCharsets.UTF_8);

Try-With-Resources:
  Java 7 introduced the try-with-resources statement to auto-close streams and avoid resource leaks.
  
Exception Handling in File IO:
  File IO operations can throw exceptions like FileNotFoundException or IOException.
  Always handle em using try-catch blocks or declare them in the throws clause.

Combining Byte and Character Streams:
  Java supports converting byte streams to character streams using InputStreamReader and OutputStreamWriter.

For ObjectStreams refer -> CSE310_ObjectStreams.java
*/

/* FileOutputStream */

// import java.io.*;

// public class CSE310_Streams {
//     public static void main(String[] args) throws IOException {
//         FileOutputStream fos = new FileOutputStream("learningStreamsInJava.txt");
//         String data = "Hello from FileOutputStream";
//         fos.write(data.getBytes());
//         fos.close();
//     }
// }

/* FileInputStream */

// import java.io.*;

// public class CSE310_Streams {
//     public static void main(String[] args) throws IOException {
//         FileInputStream fis = new FileInputStream("learningStreamsInJava.txt");
//         int ch;
//         while ((ch = fis.read()) != -1) {
//             System.out.println((char) ch);
//         }
//         fis.close();
//     }
// } 

/* DataInputStream and DataOutputStream */

// import java.io.*;

// public class CSE310_Streams {
//     public static void main(String[] args) throws IOException {
//             DataOutputStream dos = new DataOutputStream(new FileOutputStream("data.txt"));
//             dos.writeInt(123);
//             dos.writeDouble(99.99);
//         dos.close();

//         DataInputStream dis = new DataInputStream(new FileInputStream("data.txt"));
//         System.out.println("Int: "+dis.readInt());
//         System.out.println("Double: "+dis.readDouble());
//         dis.close();
//     }
// }

/* InputStream */

// import java.io.*;

// public class CSE310_Streams {
//     public static void main(String[] args) throws IOException {
//         InputStream is = System.in;
//         System.out.println("Enter character: ");
//         int ch = is.read();
//         System.out.println("You typed: "+(char) ch);
//     }
// }

/* OutputStream */

// import java.io.*;

// public class CSE310_Streams {
//     public static void main(String[] args) throws IOException {
//         OutputStream os = new FileOutputStream("basic_output.txt");
//         String msg = "Using OutputStream directly!";
//         os.write(msg.getBytes());
//         os.close();
//     }
// }

/* BufferedInputStream */

// import java.io.*;

// public class CSE310_Streams {
//     public static void main(String[] args) throws IOException {
//         FileInputStream fis = new FileInputStream("learningStreamsInJava.txt");
//         BufferedInputStream bis = new BufferedInputStream(fis);
//         int ch;
//         while ((ch = bis.read()) != -1) {
//             System.out.println((char) ch);
//         }
//         bis.close();
//     }
// }

/* BufferedOutputStream */

// import java.io.*;

// public class CSE310_Streams {
//     public static void main(String[] args) throws IOException {
//         FileOutputStream fos = new FileOutputStream("buffered.txt");
//         BufferedOutputStream bos = new BufferedOutputStream(fos);
//         String data = "Hello from BufferedOutputStream";
//         bos.write(data.getBytes());
//         bos.flush();
//         bos.close();
//     }
// }

/* PrintStream */

// import java.io.*;

// public class CSE310_Streams {
//     public static void main(String[] args) throws IOException {
//         PrintStream ps = new PrintStream("printstream.txt");
//         ps.println("Hello using PrintStream");
//         ps.close();
//     }
// }

/* Write a single byte using FileOutputStream */

// import java.io.FileOutputStream;

// public class CSE310_Streams {
//     public static void main(String[] args) {
//         try {
//             FileOutputStream fout = new FileOutputStream("C:\\Users\\schak\\Java\\data.txt");
//             fout.write(65);
//             fout.close();
//             System.out.println("Success");
//         } catch (Exception e) {
//             System.out.println(e);
//         }
//     }
// }

/* Write Subset of Byte Array */

// import java.io.FileOutputStream;
// import java.io.IOException;

// public class CSE310_Streams {
    
// }

/* Write Portion of a String */

// import java.io.FileOutputStream;
// import java.io.IOException;

// public class CSE310_Streams {
//     public static void main(String[] args) throws IOException {
//         String data = "Hello, FileOutputStream";
//         try (FileOutputStream fos = new FileOutputStream("output.txt")) {
//             byte[] byteData = data.getBytes();
//         }
//     }
// }

/* .available() -> works with FileInputStream only */

// import java.io.*;

// public class CSE310_Streams {
//     public static void main(String[] args) throws IOException {
//         FileOutputStream fos = new FileOutputStream("file.txt");
//         String data = "Hello from FileOutput stream";
//         fos.write(data.getBytes());
//         fos.close();
//         FileInputStream fis = new FileInputStream("file.txt");
//         System.out.println("File available for reading: "+fis.available()+" bytes");
//         fis.read();
//         System.out.println("File available for reading after using read() once: "+fis.available()+" bytes");
//         fis.close();
//     }
// }

/* FileReader */

// import java.io.*;

// public class CSE310_Streams {
//     public static void main(String[] args) {
//         try {
//             FileReader fr = new FileReader("data.txt");
//             int ch;
//             while ((ch = fr.read()) != -1) {
//                 System.out.print((char) ch);
//             }
//             fr.close();
//         } catch (IOException e) {
//             System.out.println("An error occurred while reading the file: "+e.getMessage());
//         }
//     }
// }

/* BufferedReader */

// import java.io.*;

// public class CSE310_Streams {
//     public static void main(String[] args) {
//         try {
//             BufferedReader br = new BufferedReader(new FileReader("data.txt"));
//             String line;
//             while ((line = br.readLine()) != null) {
//                 System.out.println(line);
//             }
//             br.close();
//         } catch (IOException e) {
//             System.out.println("An error occurred while reading the file: "+e.getMessage());
//         }
//     }
// }

/* FileWriter */

// import java.io.*;

// public class CSE310_Streams {
//     public static void main(String[] args) {
//         try {
//             FileWriter fw = new FileWriter("fileWriter.txt");
//             fw.write("Written using FileWriter class");
//             fw.close();
//         } catch (IOException e) {
//             System.out.println("An error has occurred while writing the file: "+e.getMessage());
//         }
//     }
// }

/* BufferedWriter */

// import java.io.*;

// public class CSE310_Streams {
//     public static void main(String[] args) {
//         try {
//             BufferedWriter bw = new BufferedWriter(new FileWriter("bufferedWriter.txt"));
//             bw.write("Written using BufferedWriter class");
//             bw.newLine();
//             bw.write("Another line using BufferedWriter");
//             bw.close();
//         } catch (IOException e) {
//             System.out.println("An error has occurred while writing the file: "+e.getMessage());
//         }
//     }
// }

/* RandomAccessFile */

// import java.io.*;

// public class CSE310_Streams {
//     public static void main(String[] args) throws IOException {
//         RandomAccessFile raf = new RandomAccessFile("data.txt", "rw"); // "rw" = read + write

//         // Write some data
//         raf.writeUTF("Hello");
//         raf.writeInt(42);

//         // Move to the start of the file
//         raf.seek(0);

//         // Read the data back
//         String text = raf.readUTF();
//         int number = raf.readInt();

//         System.out.println("Read: " + text + ", " + number);

//         raf.close();
//     }
// }

