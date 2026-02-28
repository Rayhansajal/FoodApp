package com.example.FoodApp.security;

import lombok.Builder;
import lombok.Data;
import org.springframework.security.core.userdetails.UserDetails;

@Data
@Builder
public class AuthUser implements UserDetails {
}
