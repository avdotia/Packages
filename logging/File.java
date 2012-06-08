package logging;
class File implements Logger
{
   private String dstName;
   File(String dstName)
   {
      this.dstName = dstName;
   }
   public boolean connect() throws CannotConnectException
   {
      if (dstName == null)
         throw new CannotConnectException;

   }
   public boolean disconnect() throws NotConnectedException
   {
      if (dstName == null)
         throw new NotConnectedException;
   }
   public boolean log(String msg) throws NotConnectedException
   {
      if (dstName == null)
         throw new NotConnectedException;
      System.out.println("writing " + msg + " to file " + dstName);
   }
}
