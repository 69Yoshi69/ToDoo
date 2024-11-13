package com.example.ToDoo.model;


import jakarta.persistence.*;

@Entity
@Table(name="todo")
public class ToDo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String title;
    @Column
    private String description;
    @Column
    private String status;


}

