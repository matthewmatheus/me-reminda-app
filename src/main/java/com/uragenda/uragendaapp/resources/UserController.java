package com.uragenda.uragendaapp.resources;

import com.uragenda.uragendaapp.security.model.UserModel;
import com.uragenda.uragendaapp.security.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;


    @GetMapping("/listar")
    public ResponseEntity<List<UserModel>> listarUsuarios() {
        return ResponseEntity.ok(userRepository.findAll());
    }



    @PostMapping("/salvar")
    public ResponseEntity<UserModel> salvarUsuario(@RequestBody UserModel user){
        return ResponseEntity.ok(userRepository.save(user));
    }



}
