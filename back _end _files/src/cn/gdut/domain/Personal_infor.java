package cn.gdut.domain;

<<<<<<< HEAD
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/*
 * 个人信息
 */
public class Personal_infor implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3020931707876908247L;
=======
/*
 * 个人信息
 */
public class Personal_infor
{
>>>>>>> refs/remotes/origin/master
	private Integer uuid; //用户编号
	private String password;//密码
	private String phoneNum;//联系方式
	private int status;//状态
	private int bad_record;//不良记录
<<<<<<< HEAD
	private String photo;//头像
	private int gender;//性别
	
	public static final int USER_GENDER_OF_MAN = 1;
	public static final int USER_GENDER_OF_WOMAN = 0;
	public static final String USER_GENDER_OF_MAN_VIEW = "男";
	public static final String USER_GENDER_OF_WOMAN_VIEW = "女";
	public static final Map<Integer,String> genderMap = new HashMap<Integer,String>();
	
	public static final int USER_STATUS_OF_NORMAL = 0;
	public static final int USER_STATUS_OF_NOT_ACTIVATED = 1;
	public static final int USER_STATUS_OF_CANCEL = 2;
	public static final int USER_STATUS_OF_LOCKED = 3;
	public static final String USER_STATUS_OF_NORMAL_VIEW = "正常";
	public static final String USER_STATUS_OF_NOT_ACTIVATED_VIEW = "未激活";
	public static final String USER_STATUS_OF_CANCEL_VIEW = "已注销";
	public static final String USER_STATUS_OF_LOCKED_VIEW = "已锁定";
	public static final Map<Integer,String> statusMap = new HashMap<Integer,String>();
	
	static{
		genderMap.put(USER_GENDER_OF_MAN, USER_GENDER_OF_MAN_VIEW);
		genderMap.put(USER_GENDER_OF_WOMAN, USER_GENDER_OF_WOMAN_VIEW);
		
		statusMap.put(USER_STATUS_OF_NORMAL,USER_STATUS_OF_NORMAL_VIEW );
		statusMap.put(USER_STATUS_OF_NOT_ACTIVATED,USER_STATUS_OF_NOT_ACTIVATED_VIEW );
		statusMap.put(USER_STATUS_OF_CANCEL,USER_STATUS_OF_CANCEL_VIEW );
		statusMap.put(USER_STATUS_OF_LOCKED, USER_STATUS_OF_LOCKED_VIEW);
	}
	
	
=======
>>>>>>> refs/remotes/origin/master
	public Integer getUuid()
	{
		return uuid;
	}
	public void setUuid(Integer uuid)
	{
		this.uuid = uuid;
	}
	public String getPassword()
	{
		return password;
	}
	public void setPassword(String password)
	{
		this.password = password;
	}
	public String getPhoneNum()
	{
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum)
	{
		this.phoneNum = phoneNum;
	}
	public int getStatus()
	{
		return status;
	}
	public void setStatus(int status)
	{
		this.status = status;
	}
	public int getBad_record()
	{
		return bad_record;
	}
	public void setBad_record(int bad_record)
	{
		this.bad_record = bad_record;
	}
<<<<<<< HEAD
	public String getPhoto()
	{
		return photo;
	}
	public void setPhoto(String photo)
	{
		this.photo = photo;
	}
	public int getGender()
	{
		return gender;
	}
	public void setGender(int gender)
	{
		this.gender = gender;
	}
=======
>>>>>>> refs/remotes/origin/master
	
}
