package logging;
class Console implements Logger
{
   private String dstName;
   Console(String dstName)
   {
      this.dstName = dstName;
   }
   public void connect() throws CannotConnectException
   {
      System.out.println("Exploto lol");
      System.out.println("Las ganas!! arreglado");
   }
   public void disconnect() throws NotConnectedException
   {
   }
   public void log(String msg) throws NotConnectedException
   {
      System.out.println(msg);
   }
}
