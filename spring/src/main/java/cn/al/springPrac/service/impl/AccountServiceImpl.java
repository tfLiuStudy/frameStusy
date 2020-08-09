package cn.al.springPrac.service.impl;

import cn.al.springPrac.dao.IAccountDao;
import cn.al.springPrac.dao.impl.AccountDaoImpl;
import cn.al.springPrac.domain.Account;
import cn.al.springPrac.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * serviceImpl
 * @Author: tfliu
 */
@Service("accountService")
public class AccountServiceImpl implements IAccountService {

    /**
     * dao-accountDao
     */
    @Autowired
    private IAccountDao accountDao;

    /**
     * set注入
     * @param accountDao
     */
    public void setAccountDao(AccountDaoImpl accountDao) {
        this.accountDao = accountDao;
    }

    /**
     * findAccount
     * @return
     */
    public List<Account> findAccount() {
        return accountDao.findAccount();
    }
}
