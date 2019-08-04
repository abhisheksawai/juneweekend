package staticDemo;
public class TestMemberOuter1 {
		 private int data=30;  
		 static class Inner
		 {  
			 void msg()
			  {
				  System.out.println("data is ");
			 }  
			 
			static void msgstatic()
			  {
				  System.out.println("data is ss ");				  
			  }  
		 }  
		 public static void main(String args[]){  
			 	  //TestMemberOuter1 obj=new TestMemberOuter1();  
			 	  //TestMemberOuter1.Inner in=obj.new Inner();  
			 	 // in.msg();
			 	//  obj.msg();
			 	  Inner in1 = new Inner();
			 	  in1.msg();
			 	  Inner.msgstatic();
			 	 //.msg(); 
		 }
		
}