/* 33 Extend the logging package to support a null device in which messages 
are thrown away*/
package logging;
class NullDevice implements Logger {
   private String dstName;
   NullDevice(String dstName)
   {
      
   }
   public boolean connect() throws CannotConnectException
   {

   }
   public boolean disconnect() throws NotConnectedException
   {
   }
   public boolean log(String msg) throws NotConnectedException
   {
      System.out.println(msg);
   }
   
} 
