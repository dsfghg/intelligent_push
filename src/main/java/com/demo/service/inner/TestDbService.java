package com.demo.service.inner;

import com.demo.dao.entity.BankDO;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : Gary
 * @create 2024/10/14 19:31
 */
public interface TestDbService {


    BankDO getBankById(String bankId);

}
