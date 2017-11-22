package com.net.dao;


import com.net.domain.User;

/**
 * 功能概要：User的DAO类
 *
 * @author netbingwen
 * @since 2015年9月28日
 */
public interface UserDao {
    /**
     * @param userId
     * @return
     * @author netbingwen
     * @since 2015年9月28日
     */
    public User selectUserById(Integer userId);

}  