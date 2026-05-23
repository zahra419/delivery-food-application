package com.example.demo.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.dto.RegisterRequest;
import com.example.demo.model.User;
import com.example.demo.repository.RegisterRepository;



@Service
public class RegisterService {
   private final RegisterRepository registerRepository;
   private final PasswordEncoder passwordEncoder;
   @Autowired
   public RegisterService(RegisterRepository registerRepository, PasswordEncoder passwordEncoder) {
       this.registerRepository = registerRepository;
       this.passwordEncoder = passwordEncoder;
   }
    public void registerUser(RegisterRequest user) {
        User newUser = new User();
        newUser.setEmail(user.getEmail());
        newUser.setPassword(passwordEncoder.encode(user.getPassword()));
        newUser.setFirstname(user.getFirstname());
        newUser.setLastname(user.getLastname());
        registerRepository.save(newUser);
    }
}
