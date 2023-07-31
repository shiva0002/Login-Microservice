package com.login.Config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.login.Repository.UserRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String email) { 

		return userRepository.findByEmail(email).orElseThrow();
	}
}
