package com.yimai.dao;

import org.springframework.stereotype.Component;

import com.yimai.bean.UserInfo;

@Component("userInfoDao")
public interface UserInfoMapper {
    int deleteByPrimaryKey(String userId);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    UserInfo selectByPrimaryKey(String userId);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);
}