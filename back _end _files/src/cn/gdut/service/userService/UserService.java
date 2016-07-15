package cn.gdut.service.userService;

import cn.gdut.domain.User;

/*
*
*用户业务层
*/
public interface UserService
{
	/**
	 * 用户登录
	 * @param user 用户信息
	 * @return 用户信息
	 */
	public User login(User user);
	/**
	 * 修改用户
	 * @param user 用户信息
	 */
	public void updateUser(User user);
	/**
	 * 删除用户
	 * @param uuid 用户编号
	 */
	public void deleteUser(Integer uuid);
	/**
	 * 用户注册
	 * @param user 用户信息
	 */
	public void regist(User user);
}
