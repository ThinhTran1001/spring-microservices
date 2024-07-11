package com.thinhtran.accountservice.service.impl;

import com.thinhtran.accountservice.dto.request.UserCreateRequest;
import com.thinhtran.accountservice.dto.request.UserUpdateRequest;
import com.thinhtran.accountservice.entity.User;
import com.thinhtran.accountservice.exception.AppException;
import com.thinhtran.accountservice.exception.ErrorCode;
import com.thinhtran.accountservice.repository.UserRepository;
import com.thinhtran.accountservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User createRequest(UserCreateRequest request) {
        User user = new User();

        if(userRepository.existsByUsername(request.getUsername())){
            throw new AppException(ErrorCode.USER_EXISTED);
        }

        user.setUsername(request.getUsername());
        user.setPassword(request.getPassword());
        user.setFirstName(request.getFirstName());
        user.setLastName(request.getLastName());
        user.setDob(request.getDob());

        return userRepository.save(user);
    }

    @Override
    public User getUserById(UUID userId) {
        return userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User Not Found"));
    }

    @Override
    public User updateRequest(UUID userId, UserUpdateRequest request) {
        User user = getUserById(userId);

        user.setPassword(request.getPassword());
        user.setFirstName(request.getFirstName());
        user.setLastName(request.getLastName());
        user.setDob(request.getDob());

        return userRepository.save(user);
    }

    @Override
    public void deleteUser(UUID userId) {
        userRepository.deleteById(userId);
    }
}
