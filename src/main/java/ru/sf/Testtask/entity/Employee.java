package ru.sf.Testtask.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String position;

    @Column
    private String firstname;

    @Column
    private String surname;

    @Column
    private String patronymic;

    @Column
    private Date dateofemployment;

    @Column
    private String description;

    protected Employee() {}

    public Employee(String position, String firstname, String surname, String patronymic, Date dateofemployment) {
        this.position = position;
        this.firstname = firstname;
        this.surname = surname;
        this.patronymic = patronymic;
        this.dateofemployment = dateofemployment;
    }

    public Employee(String firstname, String surname, String patronymic, String description) {
        this.firstname = firstname;
        this.surname = surname;
        this.patronymic = patronymic;
        this.description = description;
    }
}
