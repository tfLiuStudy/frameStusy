package cn.al.springTranStudy.service;

import cn.al.springTranStudy.domain.Account;

/**
 * accountService
 */
public interface IAccountService {

    /**
     * 根据 id 查询账户信息
     * @param id
     * @return
     */
    Account findAccountById(Integer id);
    /**
     * 转账
     * @param sourceName 转出账户名称
     * @param targeName 转入账户名称
     * @param money 转账金额
     */
    void transfer(String sourceName,String targeName,Float money);
}
