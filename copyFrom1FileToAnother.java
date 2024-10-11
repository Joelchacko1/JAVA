import java.io.*;
public class copyFrom1FileToAnother{
public static void main(String[] args)throws IOException {
    
File f1= new File("Myfile1.txt");
File f2= new File("Myfile2.txt");
if (f1.exists()) {
System.out.println("File 1 exists");
} else {
System.out.println("File 1 does not exist");
return;
}
if (f2.exists()) {
System.out.println("File 2 exists");
} else {
System.out.println("File 2 does not exist");
return;
}
FileInputStream fin= new FileInputStream(f1);
FileOutputStream fout= new FileOutputStream(f2);
int c;
while((c = fin.read()) != -1){
fout.write(c);
}
System.out.println("File Contents copied from file 1 to file 2");
fin = new FileInputStream(f1);
System.out.println("**contents of file 1**");
int i;
while (( i=fin.read())!=-1) {
System.out.print((char)i);
}
System.out.println("\n**contents of file 2**");
fin= new FileInputStream(f2);
while (( i=fin.read())!=-1) {
System.out.print((char)i);
}
fin.close();
fout.close();
}
}
