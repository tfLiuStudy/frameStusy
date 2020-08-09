package cn.al.springPrac.dao.impl;

import cn.al.springPrac.dao.IAccountDao;
import cn.al.springPrac.domain.Account;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;

/**
 * accountDaoImpl
 * @Author: tfliu
 */
@Repository
public class AccountDaoImpl implements IAccountDao {

    /**
     *  QueryQunner
     */
    @Autowired
    private QueryRunner runner;

    /**
     * queryRunner-inject
     * @param queryRuner
     */
    public void setQueryRuner(QueryRunner queryRuner) {
        this.runner = queryRuner;
    }

    /**
     * findAllAccount
     * @return
     */
    public List<Account> findAccount() {
        try {
            return runner.query("select * from account ",new BeanListHandler<Account>(Account.class));
        }catch(Exception e) {
            throw new RuntimeException(e);
        }
    }
}
