package com.thinhtran.profile_service.dto.response;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProfileResponse {

    String id;

    String firstName;

    String lastName;

    LocalDate dob;

    String city;

}
