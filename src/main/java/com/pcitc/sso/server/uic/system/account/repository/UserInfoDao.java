package com.pcitc.sso.server.uic.system.account.repository;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.pcitc.sso.server.uic.common.repository.MyBatisRepository;
import com.pcitc.sso.server.uic.system.account.entity.UserInfo;
import com.pcitc.sso.server.uic.system.account.entity.UserInfoDelta;

@MyBatisRepository
public interface UserInfoDao {

    int insert(UserInfo userInfo);

    int delete(long userId);

    int update(UserInfoDelta delta);

    int updateLoanPoint(@Param("userId") long userId,
                        @Param("delta") float delta);

    int updateLendPoint(@Param("userId") long userId,
                        @Param("delta") float delta);

    UserInfo getUserInfo(long userId);

    List<UserInfo> getUserInfoByIds(List<Long> userIds);

}