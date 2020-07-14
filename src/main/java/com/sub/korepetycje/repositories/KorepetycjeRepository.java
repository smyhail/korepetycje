package com.sub.korepetycje.repositories;

import com.sub.korepetycje.enities.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface KorepetycjeRepository extends JpaRepository<Person, Long> {

    //todo test i działa
    @Query("SELECT p FROM Person p")
    List<Person> findAllByTest_pp();


    @Query("SELECT p.city  FROM Person p")
    List<Person> findAllByCity();


}
