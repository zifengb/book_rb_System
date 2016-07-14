package cn.gdut.domain;

import java.util.Date;

/*
*
*图书
*/
public class Book
{
	private Integer uuid; //图书编号
	private int degree;  //新旧程度
	private Date pub_date;//出版时间
	private String isbn;//ISBN
	private String book_concern;//出版社
	private String author;//作者
	private String picture;//图片路径
	
	private Integer category;//类别

	public Integer getUuid()
	{
		return uuid;
	}

	public void setUuid(Integer uuid)
	{
		this.uuid = uuid;
	}

	public int getDegree()
	{
		return degree;
	}

	public void setDegree(int degree)
	{
		this.degree = degree;
	}

	public Date getPub_date()
	{
		return pub_date;
	}

	public void setPub_date(Date pub_date)
	{
		this.pub_date = pub_date;
	}

	public String getIsbn()
	{
		return isbn;
	}

	public void setIsbn(String isbn)
	{
		this.isbn = isbn;
	}

	public String getBook_concern()
	{
		return book_concern;
	}

	public void setBook_concern(String book_concern)
	{
		this.book_concern = book_concern;
	}

	public String getAuthor()
	{
		return author;
	}

	public void setAuthor(String author)
	{
		this.author = author;
	}

	public String getPicture()
	{
		return picture;
	}

	public void setPicture(String picture)
	{
		this.picture = picture;
	}

	public Integer getCategory()
	{
		return category;
	}

	public void setCategory(Integer category)
	{
		this.category = category;
	}
	
	
	
}
