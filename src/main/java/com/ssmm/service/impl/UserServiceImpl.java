package com.ssmm.service.impl;

import com.ssmm.dao.UserMapper;
import com.ssmm.model.User;
import com.ssmm.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Resource
	private UserMapper userMapper;

	public UserMapper getUserMapper() {
		return userMapper;
	}

	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}

	public User getUserById(int id) {
		return userMapper.selectByPrimaryKey(id);
//		List<User> userList = userMapper.getAll();
//		return userList.get(0);
	}

	@Override
	public void saveUser(User user) {
		userMapper.insert(user);
//		抛出运行时异常，sql会自动rollback
//		throw new RuntimeException();
	}

}
