package cn.al.springIOCSelf.myService.serviceImpl;

import cn.al.springIOCSelf.dao.serviceImpl.AccountDaoImpl;
import cn.al.springIOCSelf.factory.BeanFactory;
import cn.al.springIOCSelf.myService.service.IAccountService;
import org.springframework.stereotype.Component;

/**
 * 业务层的实现类
 * @author tfliu
 */
@Component("accountService")
public class AccountServiceImpl implements IAccountService {

    /**
     * 保存方法
     */
    public void save() {
        System.out.println("save---account");
        AccountDaoImpl accountDao = (AccountDaoImpl) BeanFactory.getBean("IAccountDao");
        accountDao.save();
    }
}
