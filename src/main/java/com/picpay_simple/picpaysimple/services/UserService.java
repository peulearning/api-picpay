package com.picpay_simple.picpaysimple.services;

import com.picpay_simple.picpaysimple.domain.user.User;
import com.picpay_simple.picpaysimple.domain.user.UserType;
import com.picpay_simple.picpaysimple.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    // Valida se o usuário pode realizar a transação
    public void validateTransaction(User sender, BigDecimal amount) {
        if (sender.getUserType() == UserType.MERCHANT) {
            throw new IllegalArgumentException("Usuário do tipo Lojista não está autorizado a realizar transações");
        }
        if (sender.getBalance().compareTo(amount) < 0) {
            throw new IllegalArgumentException("Saldo insuficiente");
        }
    }

    // Busca um usuário por ID
    @Transactional(readOnly = true)
    public User findUserById(Long id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Usuário não encontrado"));
    }

    // Salva um novo usuário
    public User saveUser(User user) {
        return repository.save(user);
    }
}
