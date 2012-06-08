package logging;
class Console implements Logger
{
   private String dstName;
   Console(String dstName)
   {
      this.dstName = dstName;
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
