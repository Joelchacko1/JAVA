import java.io.*;
public class CreatingnWritingContent {
public static void main(String[] args)throws IOException {
File f= new File("Myfile.txt");
f.createNewFile();
FileWriter fw= new FileWriter("Myfile.txt");
fw.write("This is an example of adding data to the file\nThis a program to illustrate the use of files");
fw.close();
FileReader fr= new FileReader(f);
int i;
while (( i=fr.read())!=-1) {
System.out.print((char)i);
}
fr.close();
}
}
