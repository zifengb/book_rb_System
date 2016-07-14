package cn.gdut.domain;

/*
*
*库存
*/
public class Repertory
{
	private Integer uuid;//库存编号
	private Integer owner;//所有者编号
	private Integer book;//图书编号
	private int frequency;//出借次数
	private int amount;//数量
	public Integer getUuid()
	{
		return uuid;
	}
	public void setUuid(Integer uuid)
	{
		this.uuid = uuid;
	}
	public Integer getOwner()
	{
		return owner;
	}
	public void setOwner(Integer owner)
	{
		this.owner = owner;
	}
	public Integer getBook()
	{
		return book;
	}
	public void setBook(Integer book)
	{
		this.book = book;
	}
	public int getFrequency()
	{
		return frequency;
	}
	public void setFrequency(int frequency)
	{
		this.frequency = frequency;
	}
	public int getAmount()
	{
		return amount;
	}
	public void setAmount(int amount)
	{
		this.amount = amount;
	}
	
}
