/* 34 Modify the logging package so that Logger's connect() method throws 
CannotConnectException when it cannot connect to its logging destination, and
the other two methods each throw NotConnectedException when connect()
was not called or when it threw CannotConnectException*/

package logging;
public interface Logger
{
   void connect() throws CannotConnectException;
   void disconnect() throws NotConnectedException;
   void log(String msg) throws NotConnectedException;
}
