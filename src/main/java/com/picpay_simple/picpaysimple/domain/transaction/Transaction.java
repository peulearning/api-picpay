package com.picpay_simple.picpaysimple.domain.transaction;


import com.picpay_simple.picpaysimple.domain.user.User;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity(name = "transactions")
@Table(name = "transactions")
@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@NoArgsConstructor
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private BigDecimal amount;

    @ManyToOne
    @JoinColumn(name = "sender_id")
    private User sender;

    @ManyToOne
    @JoinColumn(name = "reciever_id")
    private User reciever;

    private LocalDateTime timestamp;

    public Transaction (){

    }

    public void setAmount(BigDecimal value) {
    }

    public void setSender(User sender) {
    }

    public void setReceiver(User receiver) {
    }

    public void setTimeStamp(LocalDateTime now) {
    }
}
