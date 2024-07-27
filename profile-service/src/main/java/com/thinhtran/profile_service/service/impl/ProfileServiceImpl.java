package com.thinhtran.profile_service.service.impl;

import com.thinhtran.profile_service.dto.request.ProfileCreationRequest;
import com.thinhtran.profile_service.dto.response.ProfileResponse;
import com.thinhtran.profile_service.entity.Profile;
import com.thinhtran.profile_service.mapper.ProfileMapper;
import com.thinhtran.profile_service.repository.ProfileRepository;
import com.thinhtran.profile_service.service.ProfileService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@Service
public class ProfileServiceImpl implements ProfileService {

    ProfileRepository profileRepository;

    ProfileMapper profileMapper;

    @Override
    public ProfileResponse createProfile(ProfileCreationRequest request) {
        Profile profile = profileMapper.toProfile(request);
        profile = profileRepository.save(profile);

        return profileMapper.toProfileResponse(profile);
    }

    @Override
    public ProfileResponse getProfile(String id) {
        Profile profile = profileRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Profile not found"));

        return profileMapper.toProfileResponse(profile);
    }
}
