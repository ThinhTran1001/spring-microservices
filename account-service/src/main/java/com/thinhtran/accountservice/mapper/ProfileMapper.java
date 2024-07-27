package com.thinhtran.accountservice.mapper;

import com.thinhtran.accountservice.dto.request.ProfileCreationRequest;
import com.thinhtran.accountservice.dto.request.UserCreateRequest;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProfileMapper {

    ProfileCreationRequest toProfileCreationRequest(UserCreateRequest request);

}
