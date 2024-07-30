package com.thinhtran.profile_service.controller;

import com.thinhtran.profile_service.dto.request.ProfileCreationRequest;
import com.thinhtran.profile_service.dto.response.ProfileResponse;
import com.thinhtran.profile_service.service.ProfileService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class InternalProfileController {

    ProfileService profileService;

    @PostMapping("/internal/users")
    ProfileResponse createProfile(@RequestBody ProfileCreationRequest request){
        return profileService.createProfile(request);
    }

}
