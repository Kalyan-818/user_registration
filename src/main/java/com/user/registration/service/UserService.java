package com.user.registration.service;

import com.user.registration.entity.UserEntity;
import com.user.registration.model.UserRequest;
import com.user.registration.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserService {

    @Autowired
    UserRepository userRepository;

    ModelMapper modelMapper = new ModelMapper();

    public String registerNewUser(UserRequest userRequest) {
        log.info("user request in service layer : {}", userRequest);
        UserEntity userEntity = modelMapper.map(userRequest, UserEntity.class);
        userRepository.save(userEntity);
        return "user saved successfully !!!";
    }
}
