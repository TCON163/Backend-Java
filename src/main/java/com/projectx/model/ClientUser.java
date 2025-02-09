package com.projectx.model;

import lombok.*;

import javax.persistence.*;

// Will handle the Client's information and functionality

@Data @NoArgsConstructor @AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "client_users")
public class ClientUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer clientUserId;



    @OneToOne(cascade = CascadeType.MERGE)
    private User userId;


    @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    @JoinColumn(name = "client_id")
    private Client client;

}
