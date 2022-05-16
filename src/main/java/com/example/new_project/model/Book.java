package com.example.new_project.model;

import lombok.Data;
import org.hibernate.type.descriptor.sql.VarcharTypeDescriptor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@Table(name = "abonement")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    private String visits;

    private String name;

    private String surname;

    private String type;

    private String dateofpurchase;

    @ManyToOne
    private User owner;
}
