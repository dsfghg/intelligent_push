package com.demo.service.inner.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.demo.dao.BankDAO;
import com.demo.dao.entity.BankDO;
import com.demo.service.inner.TestDbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : Gary
 * @create 2024/10/14 20:02
 */
@Service
public class TestDbServiceImpl implements TestDbService {

    @Autowired
    private BankDAO bankDAO;

    @Override
    public BankDO getBankById(String bankId) {
        return bankDAO.selectOne(new LambdaQueryWrapper<BankDO>().eq(BankDO::getBankId, bankId).eq(BankDO::getIsDeleted,"N").last("limit 1"));
    }
}
