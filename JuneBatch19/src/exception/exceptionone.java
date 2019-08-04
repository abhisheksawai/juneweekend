package exception;

public class exceptionone {
	
	public static void main(String[] args) throws InterruptedException {
		
		int i =10;
		try {
			
		
		System.out.println(i/0);
		}
		catch(Exception e)
		{
			System.out.println("gettign exception");
		}
		
		finally
		{
			System.out.println("finally code");
		}
		System.out.println("remaning code");
		
		Thread.sleep(3000);
	}

}
