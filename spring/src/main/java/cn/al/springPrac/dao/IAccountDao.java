package cn.al.springPrac.dao;

import cn.al.springPrac.domain.Account;
import java.util.List;

/**
 * dao-accounDao
 */
public interface IAccountDao {

    /**
     * find-account
     * @return
     */
    public List<Account> findAccount();
}
