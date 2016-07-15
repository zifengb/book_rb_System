package cn.gdut.exception;

/*
*
*@author 郑应立
*/
public class AppException extends Exception
{
	private String message;
	
	public AppException(String message)
	{
		super(message);
		this.message = message;
	}
	
	public String getMessage()
	{
		return message;
	}
}
