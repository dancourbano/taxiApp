package com.pe.server.taxiApp.service;

import com.pe.server.taxiApp.domain.security.User;
import com.pe.server.taxiApp.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserSecurityService implements UserDetailsService {
    private static final Logger LOG= LoggerFactory.getLogger(UserSecurityService.class);
    @Autowired
    private UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
        User user =userRepository.findByUsername(username);
        if(null==user){
            LOG.warn("username {} not found",username);
            throw  new UsernameNotFoundException("username "+username+" not found");
        }
        return user;
    }
}
