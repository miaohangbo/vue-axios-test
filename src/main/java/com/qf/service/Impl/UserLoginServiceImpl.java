package com.qf.service.Impl;

import com.qf.ResponseUser;
import com.qf.dao.UserLoginRespository;
import com.qf.domain.UserLogin;
import com.qf.service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Created by 54110 on 2019-09-23.
 */
@Service
public class UserLoginServiceImpl implements UserLoginService {

    @Autowired
    UserLoginRespository userLoginRespository;

    @Override
    public ResponseUser findAll(int startPage ,int pageSize) {
        System.out.println(startPage+"--"+pageSize);
        Pageable page = PageRequest.of(startPage-1,pageSize);
        Page<UserLogin> all = userLoginRespository.findAll(page);
        ResponseUser res = new ResponseUser();
        System.out.println(all.getContent());
        res.setList(all.getContent());
        res.setTotal(all.getTotalElements());
        return res;
    }

    @Override
    public UserLogin findById(UserLogin id) {
        Optional<UserLogin> byId = userLoginRespository.findById(id.getId());
        if (byId.isPresent()){
            return byId.get();
        }
        return null;
    }

    @Override
    public UserLogin update(UserLogin id) {

        UserLogin userLogin = userLoginRespository.saveAndFlush(id);
        return userLogin;
    }

    @Override
    public void delete(Integer id) {
        userLoginRespository.deleteById(id);
    }

    @Override
    public void insert(UserLogin id) {
        userLoginRespository.save(id);
    }
}
