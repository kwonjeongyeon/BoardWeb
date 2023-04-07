package com.myspring.biz.user.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myspring.biz.user.UserService;
import com.myspring.biz.user.UserVO;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userDAO;
	// UserServiceImpl Ŭ������ ����Ͻ� �޼ҵ带 ������ ��, ��������� ����� UserDAO ,��ü�� �̿��Ͽ� DB ���� ó��

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
		// Setter ������ ó���� ���� Setter �޼ҵ� �߰�
	}

	public UserVO getUser(UserVO vo) {
		return userDAO.getUser(vo);
	}

}
