package com.qf.dao;

import com.qf.domain.UserLogin;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by 54110 on 2019-09-23.
 */
public interface UserLoginRespository extends JpaRepository<UserLogin,Integer> {
}
