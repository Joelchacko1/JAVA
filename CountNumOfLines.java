import java.io.*;
public class CountNumOfLines {
public static void main(String[] args)throws IOException {
File f= new File("Myfile.txt");
f.createNewFile();
BufferedReader br = new BufferedReader(new FileReader("Myfile.txt"));
String line;
int lineNumber = 0;
while ((line = br.readLine()) != null) {
System.out.println(line);
lineNumber++;
}
System.out.println("Number of lines: " + lineNumber);
}
}

