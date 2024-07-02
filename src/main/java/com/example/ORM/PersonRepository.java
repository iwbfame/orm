package com.example.ORM;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository<Person, PersonId> {

    List<Person> findByCityOfLivingIgnoreCase(String city);
}
