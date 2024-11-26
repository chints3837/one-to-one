package com.example.springbootonetoone.entity;


import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "student")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class Student {

    @Id
    public Integer sId;

    @Column(name = "sName")
    @NonNull
    public String sName;

    @Column(name = "sCity")
    public String sCity;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "bIdFK")
    private Book bob;

}
