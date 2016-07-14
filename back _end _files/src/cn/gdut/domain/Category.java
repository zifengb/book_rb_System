package cn.gdut.domain;

/*
*
*图书类别
*/
public class Category
{
	private Integer uuid; //类别编号
	private String name; //类别名称
	
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
	
	
}
