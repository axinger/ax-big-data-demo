package com.axing.demo;

import com.axing.demo.web.domain.MyOrder;
import com.axing.demo.web.service.MyOrderService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    private MyOrderService orderService;



    @Test
    void contextLoads() {

        MyOrder order = new MyOrder();
        order.setNo("no-");
        orderService.save(order);

    }
}
