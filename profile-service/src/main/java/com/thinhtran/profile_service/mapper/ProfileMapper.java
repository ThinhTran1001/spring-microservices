package com.thinhtran.profile_service.mapper;

import com.thinhtran.profile_service.dto.request.ProfileCreationRequest;
import com.thinhtran.profile_service.dto.response.ProfileResponse;
import com.thinhtran.profile_service.entity.Profile;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProfileMapper {

    Profile toProfile(ProfileCreationRequest request);

    ProfileResponse toProfileResponse(Profile profile);

}
