package com.bjsxt.mapper;

import com.bjsxt.pojo.Users;

import java.util.List;

public interface UsersMapper {
    List<Users> selectUsersAll();
    Users selectUsersAndRoles(int userid);
    Users selectUsersAndOrders(int userid);
    Users selectUsersAndOrdersAndItems(int userid);
    Users selectUsersByIdLazy(int userid);
}
