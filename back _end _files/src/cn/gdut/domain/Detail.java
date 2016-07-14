package cn.gdut.domain;

/*
*
*租借详细
*/
public class Detail
{
	private Integer lease;//租借编码
	private Integer repertory;//库存编号
	private int amount;//数量
	private String comment;//评论
	
	public Integer getLease()
	{
		return lease;
	}
	public void setLease(Integer lease)
	{
		this.lease = lease;
	}
	public Integer getRepertory()
	{
		return repertory;
	}
	public void setRepertory(Integer repertory)
	{
		this.repertory = repertory;
	}
	public int getAmount()
	{
		return amount;
	}
	public void setAmount(int amount)
	{
		this.amount = amount;
	}
	public String getComment()
	{
		return comment;
	}
	public void setComment(String comment)
	{
		this.comment = comment;
	}
	
}
