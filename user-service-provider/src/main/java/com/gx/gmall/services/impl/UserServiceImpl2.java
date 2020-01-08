package com.gx.gmall.services.impl;

import com.gx.gmall.entities.UserAddress;
import com.gx.gmall.services.UserService;

import java.util.Arrays;
import java.util.List;

public class UserServiceImpl2 implements UserService {
    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        System.out.println("UserServiceImpl.....new...");
        UserAddress address1 = new UserAddress(1, "四川省成都市武侯区", "1", "晨晨", "028-12345678", "Y");
        UserAddress address2 = new UserAddress(2, "四川省成都市锦江区", "1", "尘尘", "028-12345678", "N");
        return Arrays.asList(address1, address2);
    }
}