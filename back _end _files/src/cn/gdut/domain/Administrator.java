package cn.gdut.domain;

/*
*
*管理员
*/
public class Administrator
{
	private Integer uuid;//管理员编号
	private String name; //名称
	private String password; //密码
	
	public Integer getUuid()
	{
		return uuid;
	}
	public void setUuid(Integer uuid)
	{
		this.uuid = uuid;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getPassword()
	{
		return password;
	}
	public void setPassword(String password)
	{
		this.password = password;
	}
	
}
