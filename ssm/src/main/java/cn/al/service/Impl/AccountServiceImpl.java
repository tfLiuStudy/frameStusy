package cn.al.service.Impl;

import cn.al.dao.IAccountDao;
import cn.al.domain.Account;
import cn.al.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * AccountServiceImpl
 */
@Service("accountService")
public class AccountServiceImpl implements IAccountService {

    /**
     * iAccountDao
     */
    @Autowired
    private IAccountDao accountDao;

    @Override
    public void saveAccount(Account account) {
        accountDao.save(account);
    }

    @Override
    public List<Account> findAllAccount() {
        System.out.println("123");
        return accountDao.findAll();
    }
}
