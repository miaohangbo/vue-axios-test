package com.qf.service;

import com.qf.ResponseUser;
import com.qf.domain.UserLogin;

/**
 * Created by 54110 on 2019-09-23.
 */
public interface UserLoginService {

    ResponseUser findAll(int startPage , int pageSize);

    UserLogin findById(UserLogin id);

    UserLogin update(UserLogin id);

    void delete(Integer id);

    void insert(UserLogin id);
}
