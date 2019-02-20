package com.samsung.tech.gongnam.dao.factory;

import com.samsung.tech.gongnam.dao.UserDao;
import com.samsung.tech.gongnam.dao.connection.ConnectionMaker;
import com.samsung.tech.gongnam.dao.connection.impl.DConnectionMaker;
import com.samsung.tech.gongnam.dao.partner.DUserDao;
import com.samsung.tech.gongnam.dao.partner.NUserDao;

public class DaoFactory {

    public UserDao userDao() {
        return new UserDao(connectionMaker());
    }

    public NUserDao nUserDao() {
        return new NUserDao(connectionMaker());
    }

    public DUserDao dUserDao() {
        return new DUserDao(connectionMaker());
    }

    public ConnectionMaker connectionMaker() {
        return new DConnectionMaker();
    }
}
