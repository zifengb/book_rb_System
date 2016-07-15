package cn.gdut.service.bookService.impl;

import java.util.List;

import cn.gdut.domain.Book;
import cn.gdut.exception.AppException;
import cn.gdut.service.bookService.BookService;

/*
*
*图书业务层实现类
*/
public class BookServiceImpl implements BookService
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
	public List<Book> findByPro(Book book, int begin, int pageCount)
	{
		// TODO Auto-generated method stub
		return null;
	}

}
