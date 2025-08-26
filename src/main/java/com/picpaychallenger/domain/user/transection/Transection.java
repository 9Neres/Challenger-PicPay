package com.picpaychallenger.domain.user.transection;


import com.picpaychallenger.domain.user.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity(name = "transections")
@Table(name = "transections")
@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Transection {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Generated value id in BD
    private Long id;

    private BigDecimal amount;

    @ManyToMany // creating relationship between table
    @JoinColumn(name="sender_id")
    private User sender;

    @ManyToMany
    @JoinColumn(name="receiver_id")
    private User receiver;

    private LocalDateTime timestamp; // transection sending time


}
