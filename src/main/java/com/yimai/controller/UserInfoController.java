package com.yimai.controller;

import java.util.Date;
import java.util.UUID;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.yimai.bean.UserInfo;
import com.yimai.dao.UserInfoMapper;

/**
 * 用户操作Controller
 * @author yb
 *
 */
@Controller
public class UserInfoController {
	
	@Resource(name="userInfoDao")
	private UserInfoMapper userInfoDao;
	
	@RequestMapping(value="/manageruser/adduserinfo",method=RequestMethod.POST)
	public ModelAndView addClasses(UserInfo userInfo){
		userInfo.setUserId(UUID.randomUUID().toString().replace("-", ""));
		userInfo.setCreateTime(new Date());
		userInfo.setUserName("张三");
		userInfo.setUserPwd("dddd");
		userInfo.setUserStatus("1");
		userInfoDao.insert(userInfo);
		
		ModelAndView mv=new ModelAndView();
		mv.setViewName("redirect:/manager/classes");
		return mv;
	}
}
