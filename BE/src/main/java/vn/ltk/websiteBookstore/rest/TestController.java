package vn.ltk.websiteBookstore.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import vn.ltk.websiteBookstore.dao.OrderDetailRepository;

@RestController
public class TestController {
    private OrderDetailRepository repository;

    @Autowired
    public TestController(OrderDetailRepository repository){
        this.repository = repository;
    }

    @GetMapping("/")
    public void test(){

    }
}
