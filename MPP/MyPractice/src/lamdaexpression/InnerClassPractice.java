package lamdaexpression;


class OuterClass{
	public void printA() {
		System.out.println("the value of b is ");
	}
}


public class InnerClassPractice {
	
	
	
	
	public static void main(String[] args) {
		
		/*
		OuterClass outerObj=new OuterClass();
		System.out.println(outerObj.a);
		
		// access member inner class
		OuterClass.InnerClass innerObj=new OuterClass().new InnerClass();
		System.out.println(innerObj.b);
		
		
		// accessing member  from static inner class 
		OuterClass.StaticInnerClass staticInnerObj=new OuterClass.StaticInnerClass();
		System.out.println(staticInnerObj.c);
		
		*/
		
		
		
		
		
		OuterClass obj=new OuterClass(){  // member inner class
			int b=8;
			public void printA() {
				System.out.println("the value of b is "+b);
			}
		};
		
		obj.printA();
		
	}
	
	
}


/*
 * 
class OuterClass{
	int a=5;
	class InnerClass{  // memeber inner class
		int b=8;
		public void printA() {
			System.out.println("the value of b is "+b);
		}
	}
	
	static class StaticInnerClass{ // static inner class
		int c=6;
		
	}
}

*/


	
	




