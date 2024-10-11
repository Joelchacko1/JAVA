import java.io.*;
public class DisplayContentsWithLineNum {
public static void main(String[] args)throws IOException {
File f= new File("Myfile.txt");
f.createNewFile();
BufferedReader br = new BufferedReader(new FileReader("Myfile.txt"));
String line;
int lineNumber = 1;
while ((line = br.readLine()) != null) {
System.out.println(lineNumber++ + ": " + line);
}
}
}


