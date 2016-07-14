package cn.gdut.dao.userDao.dao;

import cn.gdut.domain.Personal_infor;
import cn.gdut.domain.User;
import cn.gdut.exception.AppException;

/*
*
*用户持久层
*/
public interface UserDao
{
	/**
	 * 通过用户名查找用户信息
	 * @param UserName 用户名
	 * @return 用户
	 */
	public User findByName(String UserName);
	
	/**
	 * 通过用户编号查找个人信息
	 * @param uuid 用户编号
	 * @return 个人信息
	 */
	public Personal_infor findByUuid(Integer uuid);
	
	/**
	 * 添加用户
	 * @param user 用户信息
	 * @throws AppException 
	 */
	public void addUser(User user)throws AppException;
	
	/**
	 * 修改用户
	 * @param user 用户信息
	 * @throws AppException
	 */
	public void updateUser(User user)throws AppException;
	
	/**
	 * 删除用户
	 * @param uuid 用户编号
	 * @throws AppException
	 */
	public void deleteUser(Integer uuid)throws AppException;
	
}
