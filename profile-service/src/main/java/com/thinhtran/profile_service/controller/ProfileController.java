package com.thinhtran.profile_service.controller;

import com.thinhtran.profile_service.dto.request.ProfileCreationRequest;
import com.thinhtran.profile_service.dto.response.ProfileResponse;
import com.thinhtran.profile_service.service.ProfileService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class ProfileController {

    ProfileService profileService;

    @GetMapping("/users/{profileId}")
    ProfileResponse getProfile(@PathVariable String profileId){
        return profileService.getProfile(profileId);
    }
}
