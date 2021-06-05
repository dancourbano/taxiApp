package com.pe.server.taxiApp.service;

import com.pe.server.taxiApp.domain.security.User;
import com.pe.server.taxiApp.domain.security.UserRole;

import java.util.Set;

public interface UserService {
    User createUser(User user, Set<UserRole> userRoles);
}
