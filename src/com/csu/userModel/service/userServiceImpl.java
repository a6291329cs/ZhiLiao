package com.csu.userModel.service;

import com.csu.userModel.dao.daoFactory;
import com.csu.userModel.dao.userBean;
import com.csu.userModel.dao.userDB;

public class userServiceImpl implements userService{
	userDB userDB=daoFactory.getUserDB();
	//将DAO层用户信息转化为service层用户
	private userForm beanToEntity(userBean ub){
		userForm userForm=new userForm();
		userForm.setUserId(String.valueOf(ub.getUserId()));
		if(ub.getUserName()!=null)
			userForm.setUserName(ub.getUserName());
		
		if(ub.getPassWord()!=null)
			userForm.setPassWord(ub.getPassWord());
		
		if(ub.getEmail()!=null)
			userForm.setEmail(ub.getEmail());
		
		if(ub.getSex()!=null)
			userForm.setSex(ub.getSex());
		
		if(ub.getUserIntro()!=null)
		userForm.setUserIntro(ub.getUserIntro());
		
		if(ub.getAddress()!=null)
			userForm.setAddress(ub.getAddress());
		
		if(ub.getIndustry()!=null)
			userForm.setIndustry(ub.getIndustry());
		
		if(ub.getCareerEx()!=null)
			userForm.setCareerEx(ub.getCareerEx());
		
		if(ub.getEducationEx()!=null)
			userForm.setEducationEx(ub.getEducationEx());
		
		if(ub.getSimpleIntro()!=null)
			userForm.setSimpleIntro(ub.getSimpleIntro());
		
		if(ub.getImage()!=null)
			userForm.setImage(ub.getImage());
		
		
		return userForm;
	}
	//将Service层用户信息转化为DAO用户
	private userBean entityToBean(userForm userForm){
		userBean user=new userBean();
		if(userForm.getUserId()!=null)
			    user.setUserId(Integer.parseInt(userForm.getUserId()));
		
		if(userForm.getUserName()!=null)
			    user.setUserName(userForm.getUserName());
		
		if(userForm.getPassWord()!=null)
			    user.setPassWord(userForm.getPassWord());
		
		if(userForm.getEmail()!=null)
			    user.setEmail(userForm.getEmail());
		
		if(userForm.getSex()!=null)
			    user.setSex(userForm.getSex());
		
		if(userForm.getUserIntro()!=null)
			    user.setUserIntro(userForm.getUserIntro());
		
		if(userForm.getAddress()!=null)
			    user.setAddress(userForm.getAddress());
		
		if(userForm.getIndustry()!=null)
			    user.setIndustry(userForm.getIndustry());
		
		if(userForm.getCareerEx()!=null)
			    user.setCareerEx(userForm.getCareerEx());
		
		if(userForm.getEducationEx()!=null)
				user.setEducationEx(userForm.getEducationEx());
			
		if(userForm.getSimpleIntro()!=null)
				user.setSimpleIntro(userForm.getSimpleIntro());
		
		if(userForm.getImage()!=null)
			user.setImage(userForm.getImage());
		 return user;
	}
	@Override
	public boolean isExist(userForm user) {
		return userDB.isExist(this.entityToBean(user));
	}

	@Override
	public boolean add(userForm user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updata(userForm user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public userForm QueryById(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

}
