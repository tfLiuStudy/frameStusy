package cn.al.springTranStudy.dao.impl;

import cn.al.springTranStudy.dao.IAccountDao;
import cn.al.springTranStudy.domain.Account;
import cn.al.springTranStudy.utils.AccountRowMapper;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import java.util.List;

/**
 * AccountDaoImpl
 */
public class AccountDaoImpl extends JdbcDaoSupport implements IAccountDao {

    /**
     * findAccountById
     * @param id
     * @return
     */
    @Override
    public Account findAccountById(Integer id) {
        List<Account> list = getJdbcTemplate().query("select * from account where id = ? ", (ResultSetExtractor<List<Account>>) new AccountRowMapper(),id);
        return list.isEmpty()?null:list.get(0);
    }

    /**
     * findAccountByName
     * @param name
     * @return
     */
    @Override
    public Account findAccountByName(String name) {
        List<Account> list = getJdbcTemplate().query("select * from account where name = ? ", (RowMapper<Account>) new AccountRowMapper(),name);
        if(list.isEmpty()){
            return null; }
        if(list.size()>1){
            throw new RuntimeException("结果集不唯一，不是只有一个账户对象");
        }
        return list.get(0);
    }

    /**
     * updateAccount
     * @param account
     */
    @Override
    public void updateAccount(Account account) {
        getJdbcTemplate().update("update account set money = ? where id = ?",account.getMoney(),account.getId());
    }
}
