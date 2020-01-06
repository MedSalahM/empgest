package com.mms.empgest.demo.models;

import com.mms.empgest.demo.domain.User;
import com.mms.empgest.demo.repositories.UserRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserDetServ  implements UserDetailsService {
    @Autowired
    UserRepositories userRepositories;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

       Optional<User> user =userRepositories.findUserByUsername(username);
               user.orElseThrow(()-> new UsernameNotFoundException("Not found"+username));
             return user.map(MyUserDet::new).get();
    }
}
