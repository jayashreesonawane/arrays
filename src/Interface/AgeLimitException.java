package Interface;

public class AgeLimitException extends RuntimeException{
		
	public AgeLimitException()
	{
	}
	
	public AgeLimitException(String age)
	{
		System.out.println("This age can not be consider");
	}
}
