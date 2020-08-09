package cn.al.springPrac.service;

import cn.al.springPrac.domain.Account;
import java.util.List;

/**
 * service
 * @Author:tfliu
 */
public interface IAccountService {

    /**
     * findAll
     * @return
     */
    public List<Account> findAccount();
}
