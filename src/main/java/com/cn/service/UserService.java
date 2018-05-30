package com.cn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cn.dao.UserDao;
import com.cn.entity.User;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class UserService {

	
	@Autowired
	private UserDao userDao;

	
	public User getUserById(Integer id) {
		return userDao.getUserById(id);
	}

	
	public List<User> getUserList() {
		return userDao.getUserList();
	}

	
	public int add(User user) {
		return userDao.add(user);
	}

	
	public int update(Integer id, User user) {
		return userDao.update(id, user);
	}

	
	public int delete(Integer id) {
		return userDao.delete(id);
	}


	 public PageInfo<User> findAllUser(int pageNum, int pageSize) {
	        //将参数传给这个方法就可以实现物理分页了，非常简单。
	        PageHelper.startPage(pageNum, pageSize);
	        List<User> userDomains = userDao.selectUsers();
	        PageInfo<User> result = new PageInfo<User>(userDomains);
	        return result;
	    }
	
}
