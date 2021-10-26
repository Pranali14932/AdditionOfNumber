
public class MathDemo {
	public int add(int a,int b){
		return a+b;
		}
		 
		public int subtract(int a,int b){
		return a-b;
		}
		
		public static void main(String args[]){
			MathDemo mathDemo = new MathDemo();
			int sum = mathDemo.add(5,4);
			int diff = mathDemo.subtract(9, 3);
			System.out.println("Sum is "+sum);
			System.out.println("Difference is "+diff);
			 
			}
}
