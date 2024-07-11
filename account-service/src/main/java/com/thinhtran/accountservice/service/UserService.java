package com.thinhtran.accountservice.service;


import com.thinhtran.accountservice.dto.request.UserCreateRequest;
import com.thinhtran.accountservice.dto.request.UserUpdateRequest;
import com.thinhtran.accountservice.entity.User;

import java.util.List;
import java.util.UUID;

public interface UserService {

    List<User> getAllUsers();

    User createRequest(UserCreateRequest request);

    User getUserById(UUID userId);

    User updateRequest(UUID userId, UserUpdateRequest request);

    void deleteUser(UUID userId);
}
