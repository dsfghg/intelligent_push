package com.demo.controller;

import com.demo.dao.entity.BankDO;
import com.demo.service.inner.TestDbService;
import com.demo.service.outer.WenxinApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : Gary
 * @create 2024/10/14 17:36
 */
@RestController
@RequestMapping("/demo")
public class Main {

    @Autowired
    private TestDbService testDbService;

    @Autowired
    private WenxinApi wenxinApi;

    @GetMapping(value = "/helloWorld")
    public String get() {
        return "Hello World";
    }


    @GetMapping(value = "/testDB")
    public BankDO testDB(@RequestParam("bankId") String bankId) {
        return testDbService.getBankById(bankId);
    }


    @GetMapping(value = "/wenxin/response")
    public String getResponse(@RequestParam("question") String question) {
        return wenxinApi.getWenxinResonse(question);
    }

}