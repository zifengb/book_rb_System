package cn.gdut.domain;

import java.util.Date;

/*
*
*租借记录
*/
public class Lease
{
	private Integer uuid;  //租借编码
	private Date Lease_time; //交易时间
	private String status;  //状态
	private int days;      //出借时长
	
	private Integer lender; //出借方编号
	private Integer borrower; //借入方编号
	
	public Integer getUuid()
	{
		return uuid;
	}
	public void setUuid(Integer uuid)
	{
		this.uuid = uuid;
	}
	public Date getLease_time()
	{
		return Lease_time;
	}
	public void setLease_time(Date lease_time)
	{
		Lease_time = lease_time;
	}
	public String getStatus()
	{
		return status;
	}
	public void setStatus(String status)
	{
		this.status = status;
	}
	public int getDays()
	{
		return days;
	}
	public void setDays(int days)
	{
		this.days = days;
	}
	public Integer getLender()
	{
		return lender;
	}
	public void setLender(Integer lender)
	{
		this.lender = lender;
	}
	public Integer getBorrower()
	{
		return borrower;
	}
	public void setBorrower(Integer borrower)
	{
		this.borrower = borrower;
	}
	
	
	
	
}
