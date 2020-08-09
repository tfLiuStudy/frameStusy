package cn.al.dao.Impl;

import cn.al.dao.IAccountDao;
import cn.al.domain.Account;
import org.springframework.stereotype.Repository;
import java.util.List;

/**
 * accountDaoImpl
 * @Author: tfliu
 */
@Repository("accountDao")
public class AccountDaoImpl implements IAccountDao {

    @Override
    public void save(Account account) {

    }

    @Override
    public List<Account> findAll() {
        return null;
    }
}
