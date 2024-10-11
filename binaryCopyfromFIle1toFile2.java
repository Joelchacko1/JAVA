import java.io.*;
public class binaryCopyfromFIle1toFile2 {
public static void main(String[] args) throws IOException {
    File var1 = new File("input.bin");
      var1.createNewFile();
      File var2 = new File("output.bin");
      var2.createNewFile();

FileInputStream fin = new FileInputStream(var1);
FileOutputStream fout = new FileOutputStream(var2);
int c;
while ((c = fin.read()) != -1) {
fout.write(c);
}
System.out.print("File copied successfully!\ncontent of output file: ");
FileReader fr= new FileReader("output.bin");
while (( c=fr.read())!=-1) {
System.out.print((char)c);
}
}
}
