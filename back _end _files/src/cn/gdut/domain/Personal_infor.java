package cn.gdut.domain;

/*
 * 个人信息
 */
public class Personal_infor
{
	private Integer uuid; //用户编号
	private String password;//密码
	private String phoneNum;//联系方式
	private int status;//状态
	private int bad_record;//不良记录
	public Integer getUuid()
	{
		return uuid;
	}
	public void setUuid(Integer uuid)
	{
		this.uuid = uuid;
	}
	public String getPassword()
	{
		return password;
	}
	public void setPassword(String password)
	{
		this.password = password;
	}
	public String getPhoneNum()
	{
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum)
	{
		this.phoneNum = phoneNum;
	}
	public int getStatus()
	{
		return status;
	}
	public void setStatus(int status)
	{
		this.status = status;
	}
	public int getBad_record()
	{
		return bad_record;
	}
	public void setBad_record(int bad_record)
	{
		this.bad_record = bad_record;
	}
	
}
