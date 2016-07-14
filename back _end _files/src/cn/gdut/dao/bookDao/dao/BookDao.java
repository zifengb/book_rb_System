package cn.gdut.dao.bookDao.dao;

import java.util.List;

import cn.gdut.domain.Book;
import cn.gdut.exception.AppException;

/*
*
*图书持久层
*/
public interface BookDao
{
	/**
	 * 通过图书编号查找图书
	 * @param uuid 图书编号
	 * @return 图书
	 */
	public Book findByUuid(Integer uuid);
	/**
	 * 通过图书名称查找图书
	 * @param name 图书名称
	 * @return 图书
	 */
	public Book findByName(String name);
	/**
	 * 添加图书
	 * @param book 图书信息
	 * @throws AppException
	 */
	public void addBook(Book book) throws AppException;
	/**
	 * 删除图书
	 * @param uuid 图书编号
	 * @throws AppException
	 */
	public void deleteBook(Integer uuid)throws AppException;
	/**
	 * 修改图书
	 * @param book 图书信息
	 * @throws AppException
	 */
	public void updateBook(Book book)throws AppException;
	/**
	 * 查询全部图书(分页)
	 * @return 图书集合
	 */
	public List<Book> findAll(int begin, int pageCount);
	/**
	 * 获取图书总数量
	 * @return 图书数量
	 */
	public int getAmount();
	/**
	 * 按指定条件查找(分页)
	 * @param book 查找条件
	 * @return 图书集合
	 */
	public List<Book> findByPro(Book book,int begin, int pageCount);
	
}
