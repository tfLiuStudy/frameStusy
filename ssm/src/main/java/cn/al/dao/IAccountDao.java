package cn.al.dao;

import cn.al.domain.Account;
import java.util.List;

/**
 * IAccountDao
 */
public interface IAccountDao {

    /**
     * 保存
     * @param account
     */
    void save(Account account);
    /**
     * 查询所有
     * @return
     */
    List<Account> findAll();
}
