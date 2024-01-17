package com.aop.aop.dto;

import org.springframework.stereotype.Repository;

@Repository
public class AccountDAOImpl implements AccountDAO{
    @Override
    public void addAccount() {
        System.out.println(getClass() + "DOING MY DB WORK: ADDING AN ACCOUNT");
    }

    @Override
    public boolean addSillyMember() {
        return false;
    }

    @Override
    public void addAccount(Account theAccount) {

    }


}
