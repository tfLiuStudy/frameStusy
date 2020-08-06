package cn.al.myBatisSelf.service;

import cn.al.myBatisSelf.dto.User;

import java.util.List;

public interface UserDao {

    /**
     * 获取所有用户
     * @return
     * @throws Exception
     */
    public List<User> getAllUserByMybatis() throws Exception;

    /**
     * 获取所有用户
     * @return
     * @throws Exception
     */
    public List<User> findAll() throws Exception;

    /**
     * 新增用户
     * @param tfliu
     * @return
     */
    public int saveUser(User tfliu);
}
