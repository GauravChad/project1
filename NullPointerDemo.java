import java.io.*;
 
 public class  NullPointerDemo
{
 
public static void main(String args[])
{
String name = null;
 
 try 
 {
   if(name.equals("sree"))
     System.out.println("not same");
  }
  catch(NullPointerException e)
  {
       System.out.println("Null Pointer Exception caught ");
  }
    finally
{
  
System.out.println("this is funally block after catching null pointer exception");
}
}
}