package com.qf.controller;

import com.qf.ResponseUser;
import com.qf.domain.UserLogin;
import com.qf.service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by 54110 on 2019-09-23.
 */

@RestController
public class UserLoginController {

    @Autowired
    private UserLoginService userLoginService;

    @RequestMapping("/findAll/{page}/{size}")
    public ResponseUser findAll(@PathVariable("page")int startPage , @PathVariable("size") int pageSize){

        return userLoginService.findAll(startPage,pageSize);
    }

    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public UserLogin update(@RequestBody UserLogin userLogin){
       UserLogin user= userLoginService.findById(userLogin);
        return user;
    }

    @RequestMapping(value = "/updateDetail",method = RequestMethod.POST)
    public UserLogin updateDetail(@RequestBody UserLogin id){
        UserLogin user= userLoginService.update(id);
        return user;
    }

    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    public void delete(@RequestBody UserLogin id){
        Integer id1 = id.getId();
         userLoginService.delete(id1);

    }

    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    public void insert(@RequestBody UserLogin id){

        userLoginService.insert(id);

    }
}
