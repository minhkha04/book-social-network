package com.minhkha.identity.dto.response;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = lombok.AccessLevel.PRIVATE)
@Builder
public class AuthenticationResponse {
    String token;
}
