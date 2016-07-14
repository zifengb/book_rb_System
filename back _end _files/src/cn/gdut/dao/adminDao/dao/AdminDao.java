package cn.gdut.dao.adminDao.dao;

import cn.gdut.domain.Administrator;

/*
*
*管理员数据层
*/
public interface AdminDao
{
	/**
	 * 通过姓名查找管理员
	 * @param name 关于姓名
	 * @return 管理员
	 */
	public Administrator findByName(String name);
	/**
	 * 锁定指定用户编号的用户
	 * @param uuid 用户编号
	 */
	public void lockUser(Integer uuid);
}
