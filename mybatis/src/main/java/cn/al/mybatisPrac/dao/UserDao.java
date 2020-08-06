package cn.al.mybatisPrac.dao;

import cn.al.mybatisPrac.domain.User;

import java.util.List;

/**
 * 用户
 */
public interface UserDao {

    /**
     * 获取用户
     * @return
     */
    public List<User> findUserById(int id);
}
