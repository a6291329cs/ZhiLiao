package com.csu.userModel.service;

public class userForm {
		private String userId;       //用户编号
		private String userName;     //用户名	
		private String passWord;     //密码
		private String email;        //邮箱
		private String sex;          //性别
		private String userIntro;    //一句话介绍
	    private String address;      //居住地	
		private String industry;     //所在行业
		private String careerEx;     //职业经历
	    private String educationEx;  //教育经历
	    private String simpleIntro;  //个人简介
		private String image; //图片
		
		public userForm(){
			
		}
		
		public userForm(String userId,String userName,String passWord,
				String email,String sex,String userIntro,String address,
				String industry,String careerEx,String educationEx,String simpleIntro,
				String image)
		{
			super();
			this.userId=userId;
			this.userName=userName;
			this.passWord=passWord;
			this.email=email;
			this.sex=sex;
			this.userIntro=userIntro;
			this.address=address;
			this.industry=industry;
			this.careerEx=careerEx;
			this.educationEx=educationEx;
			this.simpleIntro=simpleIntro;
			this.image=image;
		}
	    public String getUserId() {
			return userId;
		}
		public void setUserId(String userId) {
			this.userId = userId;
		}
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getPassWord() {
			return passWord;
		}
		public void setPassWord(String passWord) {
			this.passWord = passWord;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getSex() {
			return sex;
		}
		public void setSex(String sex) {
			this.sex = sex;
		}
		public String getUserIntro() {
			return userIntro;
		}
		public void setUserIntro(String userIntro) {
			this.userIntro = userIntro;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getIndustry() {
			return industry;
		}
		public void setIndustry(String industry) {
			this.industry = industry;
		}
		public String getCareerEx() {
			return careerEx;
		}
		public void setCareerEx(String careerEx) {
			this.careerEx = careerEx;
		}
		public String getEducationEx() {
			return educationEx;
		}
		public void setEducationEx(String educationEx) {
			this.educationEx = educationEx;
		}
		public String getSimpleIntro() {
			return simpleIntro;
		}
		public void setSimpleIntro(String simpleIntro) {
			this.simpleIntro = simpleIntro;
		}
		public String getImage() {
			return image;
		}
		public void setImage(String image) {
			this.image = image;
		}
}
