package com.uragenda.uragendaapp.security.repository;

import com.uragenda.uragendaapp.security.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserModel, Integer > {

    public Optional<UserModel> findByLogin(String login);
}
