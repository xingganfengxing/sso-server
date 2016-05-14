package com.pcitc.sso.server.uic.system.account.repository;


import java.util.List;

import com.pcitc.sso.server.uic.common.repository.MyBatisRepository;
import com.pcitc.sso.server.uic.system.account.entity.SecurityCredential;

@MyBatisRepository
public interface SecurityCredentialDao {

    List<SecurityCredential> getSecurityCredentialsByAccountId(long AccountId);

    List<SecurityCredential> getSecurityCredentialsByAccessKey(String accessKey);

    String getSecretKey(String accessKey);

    Long getAccountIdByAccessKey(String accessKey);

    int insertSecurityCredential(SecurityCredential sc);

    int deleteSecurityCredential(long id);

    int deleteSecurityCredentialsByAccountId(long accountId);

}
