package cn.gdut.service.adminService;

import cn.gdut.domain.Administrator;

/*
*
*管理员业务层
*/
public interface AdminService
{
	/**
	 * 管理员登陆
	 * @param administrator 管理员信息
	 * @return 管理员
	 */
	public Administrator login(Administrator administrator);
	/**
	 * 锁定用户
	 * @param uuid 用户编号
	 */
	public void lockUser(Integer uuid);
}
