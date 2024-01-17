package com.aop.aop.dto;

import org.springframework.stereotype.Repository;

@Repository
public class MembershipDAOImpl implements MembershipDAO{
    @Override
    public void addAccount() {
        System.out.println(getClass() + "DOING MY DB WORK: ADDING AN MEMBERSHIP ACCOUNT");
    }

    @Override
    public boolean addSillyMember() {
        return false;
    }

    @Override
    public void addAccount(Account theAccount) {

    }


}
