package cn.al.springIOCSelf.dao.serviceImpl;

import cn.al.springIOCSelf.dao.service.IAccountDao;
import org.springframework.stereotype.Component;

/**
 * 持久层实现类
 */
@Component("accountDao")
public class AccountDaoImpl implements IAccountDao {

    public void save() {
        System.out.println("save");
    }
}
