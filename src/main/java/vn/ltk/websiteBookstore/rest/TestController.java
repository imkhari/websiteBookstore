package vn.ltk.websiteBookstore.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import vn.ltk.websiteBookstore.dao.OrderDetailsRepository;

@RestController
public class TestController {
    private OrderDetailsRepository repo;

    @Autowired
    public TestController(OrderDetailsRepository repo){
        this.repo = repo;
    }

    @GetMapping("/")
    public void test(){

    }
}
