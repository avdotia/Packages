/* 33 Extend the logging package to support a null device in which messages 
are thrown away*/
package logging;
class NullDevice implements Logger {
   private String dstName;
   NullDevice(String dstName)
   {
      
   }
   public void connect() throws CannotConnectException
   {

   }
   public void disconnect() throws NotConnectedException
   {
   }
   public void log(String msg) throws NotConnectedException
   {
      System.out.println(msg);
   }
   
} 
