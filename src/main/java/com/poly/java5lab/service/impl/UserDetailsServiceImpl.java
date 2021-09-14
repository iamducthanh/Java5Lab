package com.poly.java5lab.service.impl;

import com.poly.java5lab.entity.UserEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
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
        }
        if (user == null) {
            System.out.println("User not found! " + userName);
            throw new UsernameNotFoundException("User " + userName + " was not found in the database");
        }
        SessionUtil.getSessionUtil().addObject(req, "USER", user);
//        UsersOnline.usersEmtityOnline.add(user);
        System.out.println("Found User: " + user);

        List<String> roleNames = new ArrayList<>();
        roleNames.add(user.getRole());

        List<GrantedAuthority> grantList = new ArrayList<>();
        if (roleNames != null) {
            for (String role : roleNames) {
                GrantedAuthority authority = new SimpleGrantedAuthority(role);
                grantList.add(authority);
            }
        }
        UserDetails userDetails = (UserDetails) new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), grantList);        return userDetails;
    }

}

}
