package com.pcitc.sso.server.uic.system.account.repository;

import org.apache.ibatis.annotations.Param;

import com.pcitc.sso.server.uic.common.repository.MyBatisRepository;
import com.pcitc.sso.server.uic.system.account.entity.Account;

import java.util.List;

@MyBatisRepository
public interface AccountDao {

    int insert(Account account);

    int importAccount(Account account);

    int delete(long id);

    Account getAccount(@Param("name") String name,
                       @Param("type") int type);

    Account getAccountById(long id);

    List<Account> getAccountsByIds(List<Long> ids);

}