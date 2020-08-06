package cn.al.mybatisPrac.dao;

import cn.al.mybatisPrac.domain.Account;
import cn.al.mybatisPrac.domain.User;

import java.util.List;

/**
 * accountDao
 */
public interface AccountDao {

    /**
     * 发现所有账户
     * @return
     */
    public List<Account> findAllAccount();
}
