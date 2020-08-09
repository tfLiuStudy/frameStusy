package cn.al.springTranStudy.service.impl;

import cn.al.springTranStudy.dao.IAccountDao;
import cn.al.springTranStudy.domain.Account;
import cn.al.springTranStudy.service.IAccountService;

/**
 * accountServiceImpl
 */
public class accountServiceImpl implements IAccountService {

    /**
     * accountDao
     */
    private IAccountDao accountDao;

    /**
     * set
     * @param accountDao
     */
    public void setAccountDao(IAccountDao accountDao) {
        this.accountDao = accountDao;
    }

    /**
     * findById
     * @param id
     * @return
     */
    @Override
    public Account findAccountById(Integer id) {
        return accountDao.findAccountById(id);
    }

    /**
     * transfer
     * @param sourceName 转出账户名称
     * @param targeName 转入账户名称
     * @param money 转账金额
     */
    @Override
    public void transfer(String sourceName, String targeName, Float money) {
        //1.根据名称查询两个账户
        Account source = accountDao.findAccountByName(sourceName);
        Account target = accountDao.findAccountByName(targeName);
        //2.修改两个账户的金额
        source.setMoney(source.getMoney()-money);//转出账户减钱
//        int a = 1/0;
        target.setMoney(target.getMoney()+money);//转入账户加钱
        //3.更新两个账户
        accountDao.updateAccount(source);
        accountDao.updateAccount(target);
    }
}
