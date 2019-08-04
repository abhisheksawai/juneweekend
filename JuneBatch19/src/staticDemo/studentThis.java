package staticDemo;

public class studentThis {

	  
		int rollno;  
		String name;  
		float fee;  
		
		//public studentThis(int rollnop,String namep,float feep) { //  this keyword not req
		
		public studentThis(int rollno,String name,float fee) {  // this keyword req
			
		rollno=rollno;  
			name=name;  
			fee=fee;  
			
			// TODO Auto-generated constructor stub
		}

		
		void display(){System.out.println(rollno+" "+name+" "+fee);}  
		} 

