package cn.gdut.domain;

/*
 * 用户
 */
public class User
{
	
	private Integer uuid; //用户编码
	private String userName; //用户名
	private String email; //邮箱
	
	public Integer getUuid()
	{
		return uuid;
	}
	public void setUuid(Integer uuid)
	{
		this.uuid = uuid;
	}
	public String getUserName()
	{
		return userName;
	}
	public void setUserName(String userName)
	{
		this.userName = userName;
	}
	public String getEmail()
	{
		return email;
	}
	public void setEmail(String email)
	{
		this.email = email;
	}
	
}
