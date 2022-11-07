import java.io.*;
import java.lang.*;
import java.util.*;

class Celsius
{
public static void main(String args[])throws IOException
{
double f,c;
DataInputStream d= new DataInputStream (System.in);
System.out.println("celcius calculation");
System.out.println("ENTER THE VALUE OF F:");
f=Double.parseDouble(d.readLine());
c=(f-32)/1.8;
System.out.println("celcius value is :"+c );
}
}
