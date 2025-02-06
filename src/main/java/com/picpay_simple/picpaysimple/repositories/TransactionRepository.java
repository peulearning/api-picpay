package com.picpay_simple.picpaysimple.repositories;

import com.picpay_simple.picpaysimple.domain.transaction.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
