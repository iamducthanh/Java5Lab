package com.poly.java5lab.service.impl;

import com.poly.java5lab.entity.UserEntity;
import com.poly.java5lab.utils.CookieUtil;
import com.poly.java5lab.utils.SessionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private SessionUtil sessionUtil;

    @Autowired
    private CookieUtil cookieUtil;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        UserEntity userEntity = new UserEntity();
        userEntity.setUsername("fpoly");
        userEntity.setPassword("$2a$10$6LZucgkwCfXT8c0UWxp4tOYY1dH0frALxeFW4GnEJJwqU0f5epDgC");

        UserEntity user = null;
        if(userName.equals(userEntity.getUsername())){
            user = new UserEntity();
            user.setUsername(userName);
            user.setPassword(userEntity.getPassword());
            user.setRole("ROLE_USER");
        }
        if (user == null) {
            System.out.println("User not found! " + userName);
            throw new UsernameNotFoundException("User " + userName + " was not found in the database");
        }
        sessionUtil.set("USER", user);
        System.out.println("Found User: " + user);
        UserEntity rememberUser = sessionUtil.get("remember");
        if(rememberUser.isRemember()){
            int hour = 60*60*24*10;
            cookieUtil.add("user",userName+"%"+ rememberUser.getPassword(),hour);
        } else {
            int hour = 0;
            cookieUtil.add("user",userName+"%"+ rememberUser.getPassword(),hour);
        }

        List<String> roleNames = new ArrayList<>();
        roleNames.add(user.getRole());

        List<GrantedAuthority> grantList = new ArrayList<>();
        if (roleNames != null) {
            for (String role : roleNames) {
                GrantedAuthority authority = new SimpleGrantedAuthority(role);
                grantList.add(authority);
            }
        }
        UserDetails userDetails = new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), grantList);
        return userDetails;
    }

}

