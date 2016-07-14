package cn.gdut.dao.userDao.impl;

import cn.gdut.dao.userDao.dao.UserDao;
import cn.gdut.domain.Personal_infor;
import cn.gdut.domain.User;
import cn.gdut.exception.AppException;

/*
*
*用户持久层实现类
*/
public class UserDaoImpl implements UserDao
{

	@Override
	public User findByName(String UserName)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Personal_infor findByUuid(Integer uuid)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addUser(User user) throws AppException
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void updateUser(User user) throws AppException
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteUser(Integer uuid) throws AppException
	{
		// TODO Auto-generated method stub

	}

}
