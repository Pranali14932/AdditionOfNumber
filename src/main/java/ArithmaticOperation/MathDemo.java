package ArithmaticOperation;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class MathDemo {
	public int add(int a,int b){
		return a+b;
		}
		 
		public int subtract(int a,int b){
		return a-b;
		}
		
		private static final Logger logger = LogManager.getLogger(MathDemo.class); 
		public static void main(String args[]){
			MathDemo mathDemo = new MathDemo();
			int sum = mathDemo.add(5,4);
			int diff = mathDemo.subtract(9, 3);
			
			
			BasicConfigurator.configure();  

			  logger.info("we are in logger info mode"); 
			  logger.info("Sum is "+sum);
			  logger.info("Difference is "+diff);
			}
}