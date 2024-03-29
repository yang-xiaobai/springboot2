package com.example.springboot2.yang.user.dao;

import com.example.springboot2.yang.user.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;


/**
 * Created by yangp on 2017/11/14.
 */

public interface IUserDao extends CrudRepository<UserEntity,Long> {
    Object findByName(String username);
}
