package com.example.springbootonetoone.entity;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "book")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@RequiredArgsConstructor
public class Book {

    @Id
    public Integer bId;

    @Column(name = "bName")
    @NonNull
    public String bName;



}