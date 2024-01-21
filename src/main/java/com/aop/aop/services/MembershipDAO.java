package com.aop.aop.services;

import com.aop.aop.dao.Account;

public interface MembershipDAO {

    void addAccount();

    boolean addSillyMember();

    void addAccount(Account theAccount);
}
