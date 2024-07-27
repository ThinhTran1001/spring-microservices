package com.thinhtran.profile_service.service;

import com.thinhtran.profile_service.dto.request.ProfileCreationRequest;
import com.thinhtran.profile_service.dto.response.ProfileResponse;

public interface ProfileService {

    ProfileResponse createProfile(ProfileCreationRequest request);

}
