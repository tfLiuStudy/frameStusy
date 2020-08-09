package cn.al.springTranStudy.dao;

import cn.al.springTranStudy.domain.Account;

/**
 * IAccountDao
 */
public interface IAccountDao {

    /**
     * 根据 id 查询账户信息
     * @param id
     * @return
     */
    Account findAccountById(Integer id);

    /**
     * 根据名称查询账户信息
     * @return
     */
    Account findAccountByName(String name);

    /**
     * 更新账户信息
     * @param account
     */
    void updateAccount(Account account);
}
