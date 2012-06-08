/* 35 Modify TestLogger to respond appropriately to thrown 
CannotConnectException and NotConnectedException objets*/
import logging.*;
public class TestLogger
{
   public static void main(String[] args)
   {
      System.out.println("Por ahora funciono");
      try {
         System.out.println("Por ahora funciono dentro del try");
         Logger logger = LoggerFactory.newLogger(LoggerFactory.CONSOLE);
         System.out.println("Por ahora funciono dentro creo el objeto");
         logger.connect();
         System.out.println("Me conecto");
         logger.log("test message #1");
         logger.disconnect();
      }
      catch (CannotConnectException cce) {
         String msg = "cannot connect to console-based logger";
         System.err.println(msg);
      }
      catch (NotConnectedException nce){
         String msg = "not connected to console-based logger";
         System.err.println(msg);
      } 
      try{
         Logger logger = LoggerFactory.newLogger(LoggerFactory.FILE, "x.txt");
         logger.connect();
         logger.log("test message #2");
         logger.disconnect();         
      }
      catch (CannotConnectException cce) {
         String msg = "cannot connect to console-based logger";
         System.err.println(msg);
      }
      catch (NotConnectedException nce){
         String msg = "not connected to console-based logger";
         System.err.println(msg);
      }
      
      try{
         Logger logger = LoggerFactory.newLogger(LoggerFactory.FILE);
         logger.connect();
         logger.log("test message #3");
         logger.disconnect();
      }
      catch (CannotConnectException cce) {
         String msg = "cannot connect to console-based logger";
         System.err.println(msg);
      }
      catch (NotConnectedException nce){
         String msg = "not connected to console-based logger";
         System.err.println(msg);
      }
      
   }
}
