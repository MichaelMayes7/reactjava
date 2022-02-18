package com.example.reactjava.Entity;

import javax.persistence.*;

import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private long id;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    private String email;
}
