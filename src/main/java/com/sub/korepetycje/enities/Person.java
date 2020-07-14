package com.sub.korepetycje.enities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;


@Entity
public class Person {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String surname;
    private String city;
    private Boolean status;
    private LocalDate date;


    public Person() {
    }

    public Person(String name, String surname, String city, Boolean status) {
        this.name = name;
        this.surname = surname;
        this.city = city;
        this.status = status;
        //this.date = date;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
