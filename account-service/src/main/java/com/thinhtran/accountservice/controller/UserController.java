package com.thinhtran.accountservice.controller;


import com.thinhtran.accountservice.dto.request.UserCreateRequest;
import com.thinhtran.accountservice.dto.request.UserUpdateRequest;
import com.thinhtran.accountservice.dto.response.ApiResponse;
import com.thinhtran.accountservice.entity.User;
import com.thinhtran.accountservice.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @PostMapping
    ApiResponse<User> createUser(@RequestBody @Valid UserCreateRequest request){
        ApiResponse<User> apiResponse = new ApiResponse<>();
        apiResponse.setResult(userService.createRequest(request));
        return apiResponse;
    }

    @GetMapping("/{userId}")
    User getUserById(@PathVariable("userId") UUID userId){
        return userService.getUserById(userId);
    }

    @PutMapping("/{userId}")
    User updateUser(
            @PathVariable("userId") UUID userId,
            @RequestBody UserUpdateRequest userUpdateRequest){
        return userService.updateRequest(userId, userUpdateRequest);
    }

    @DeleteMapping("/{userId}")
    String deleteMapping(@PathVariable("userId") UUID userId){
        userService.deleteUser(userId);
        return "User has been deleted";
    }
}
