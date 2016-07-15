package cn.gdut.domain;

import java.util.Date;
<<<<<<< HEAD
import java.util.HashMap;
import java.util.Map;
=======
>>>>>>> refs/remotes/origin/master

/*
*
*租借记录
*/
public class Lease
{
	private Integer uuid;  //租借编码
	private Date Lease_time; //交易时间
<<<<<<< HEAD
	private int status;  //状态
=======
	private String status;  //状态
>>>>>>> refs/remotes/origin/master
	private int days;      //出借时长
	
	private Integer lender; //出借方编号
	private Integer borrower; //借入方编号
	
<<<<<<< HEAD
	public static final int LEASE_STATUS_OF_UNCOMMIT = 0;
	public static final int LEASE_STATUS_OF_LENDING = 1;
	public static final int LEASE_STATUS_OF_COMPLETE = 2;
	public static final String LEASE_STATUS_OF_UNCOMMIT_VIEW = "未提交";
	public static final String LEASE_STATUS_OF_LENDING_VIEW = "租借中";
	public static final String LEASE_STATUS_OF_COMPLETE_VIEW = "已归还";
	public static final Map<Integer,String> statusMap = new HashMap<Integer,String>();
	
	static{
		statusMap.put(LEASE_STATUS_OF_UNCOMMIT,LEASE_STATUS_OF_UNCOMMIT_VIEW );
		statusMap.put(LEASE_STATUS_OF_LENDING,LEASE_STATUS_OF_LENDING_VIEW );
		statusMap.put(LEASE_STATUS_OF_COMPLETE, LEASE_STATUS_OF_COMPLETE_VIEW);
	}
	
=======
>>>>>>> refs/remotes/origin/master
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
<<<<<<< HEAD
	public int getStatus()
	{
		return status;
	}
	public void setStatus(int status)
=======
	public String getStatus()
	{
		return status;
	}
	public void setStatus(String status)
>>>>>>> refs/remotes/origin/master
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
