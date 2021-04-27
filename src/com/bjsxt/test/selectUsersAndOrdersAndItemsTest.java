package com.bjsxt.test;

import com.bjsxt.mapper.UsersMapper;
import com.bjsxt.pojo.Items;
import com.bjsxt.pojo.Orders;
import com.bjsxt.pojo.Users;
import com.bjsxt.utils.MybatisUtils;
import com.sun.org.apache.xpath.internal.operations.Or;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class selectUsersAndOrdersAndItemsTest {
    public static void main(String[] args) {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UsersMapper usersMapper = sqlSession.getMapper(UsersMapper.class);
        Users users = usersMapper.selectUsersAndOrdersAndItems(1);
        System.out.println(users);
        List<Orders> orders = users.getOrders();
        for (Orders order : orders){
            System.out.println(order);
            List<Items> item = order.getItems();
            item.forEach(System.out::println);
        }
    }
}
