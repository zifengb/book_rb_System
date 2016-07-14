package cn.gdut.dao.bookDao.impl;

import java.util.List;

import cn.gdut.dao.bookDao.dao.BookDao;
import cn.gdut.domain.Book;
import cn.gdut.exception.AppException;

/*
*
*图书持久层实现类
*/
public class BookDaoImpl implements BookDao
{

	@Override
	public Book findByUuid(Integer uuid)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book findByName(String name)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addBook(Book book) throws AppException
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteBook(Integer uuid) throws AppException
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void updateBook(Book book) throws AppException
	{
		// TODO Auto-generated method stub

	}

	@Override
	public List<Book> findAll(int begin, int pageCount)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getAmount()
	{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Book> findByPro(Book book,int begin, int pageCount)
	{
		// TODO Auto-generated method stub
		return null;
	}


}
