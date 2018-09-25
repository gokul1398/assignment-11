import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
class file
{
public static void main(String[] args)throws IOException
{
FileInputStream in=null;
FileOutputStream out=null;
try
{
in=new FileInputStream("F:\\abc.txt");
out=new FileOutputStream("F:\\xyz.txt");
int c;
while((c=in.read())!=-1)
{
out.write(c);
}
}
finally
{if(in!=null){
in.close();
}
if(out!=null){
out.close();
}
}
in=new FileInputStream("C:\\Users\\hp\\Desktop\\xyz.txt");
int c;
while((c=in.read())!=-1)
{
System.out.print((char)c);
}
}
}