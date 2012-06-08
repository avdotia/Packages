/* 33 Extend the logging package to support a null device in which messages 
are thrown away*/
package logging;
class NullDevice implements Logger {
   private String dstName;
   NullDevice(String dstName)
   {
      
   }
   public boolean connect()
   {
      return true;
   }
   public boolean disconnect()
   {
      return true;
   }
   public boolean log(String msg)
   {
      System.out.println(msg);
      return true;
   }
   
} 
