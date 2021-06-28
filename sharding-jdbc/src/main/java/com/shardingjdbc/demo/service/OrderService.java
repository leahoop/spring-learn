package com.shardingjdbc.demo.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.shardingjdbc.demo.entity.Order;
import com.shardingjdbc.demo.mapper.OrderDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class OrderService {

    @Resource
    OrderDao orderDao;

    public void addOrder() {
        for (int i = 0; i < 10; i++) {
            Order order = new Order();
            order.setPrice(BigDecimal.valueOf(Math.random()));
            order.setUserId(Math.abs(new Random().nextLong()));
            order.setStatus("0");
            orderDao.insert(order);
        }
    }


    //执行新增后，将两库的数据各取一条，来测试
    public List<Order> findOrder() {
        List<Long> list = new ArrayList<>();
        list.add(515493848656796764L);
        list.add(6605115798564666219L);
        QueryWrapper<Order> queryWrapper = new QueryWrapper<>();
        queryWrapper.in("order_id", list);
        List<Order> orders = orderDao.selectList(queryWrapper);
        return orders;
    }
}
