package com.example.authentication.api;

import com.example.authentication.model.User;
import com.example.authentication.service.UserService;
import com.example.authentication.model.Role;
import com.example.authentication.model.RoleToUser;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.neo4j.Neo4jProperties;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class UserRessources {
    private final UserService userService;
    @GetMapping("/user")
    public User getUser(@RequestParam String username){
        return userService.getUser(username);
    }
    @GetMapping("/users")
    public List<User> getUsers(){
        return userService.getUsers();
    }
    @GetMapping("/profile")
    public Authentication authentication(Authentication authentication){
        return authentication;
    }
    @PostMapping("/user/save")
    public ResponseEntity<User> saveUser(@RequestBody User user){
        URI uri=URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/api/user/save").toUriString());
        return ResponseEntity.created(uri).body(userService.saveUser(user.getUsername(),user.getPassword()));
    }
    @PostMapping("/role/save")
    public ResponseEntity<Role> saveRole(@RequestBody Role role){
        return ResponseEntity.ok().body(userService.saveRole(role.getName()));
    }
    @PostMapping("/role/addRU")
    public void addROleToUser(@RequestBody RoleToUser form){
        userService.addRoletoUser(form.getUsername(), form.getRoleName());
    }

}
