package com.iamnbty.training.backend.business;

import com.iamnbty.training.backend.entity.User;
import com.iamnbty.training.backend.exception.BaseException;
import com.iamnbty.training.backend.exception.UserException;
import com.iamnbty.training.backend.model.MRegisterRequest;
import com.iamnbty.training.backend.service.UserService;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class TestBusiness {
    private final UserService userservice;

    public TestBusiness(UserService userservice) {
        this.userservice = userservice;
    }


        public String register(MRegisterRequest request) throws BaseException {
        if (request == null) {
            throw UserException.requestNull();
        }
        if (Objects.isNull(request.getEmail())) {
            throw UserException.emailNull();
        }
        return request.getName();
    }
//    public User register(MRegisterRequest request) throws BaseException {
//        User user = userservice.create(request.getEmail(),request.getPassword(),request.getName());
//        //TODO: mapper
//        return user;
//    }


}
