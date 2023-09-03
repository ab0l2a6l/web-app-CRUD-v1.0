package model.service;

import model.entity.Person;

import java.util.List;

public interface PersonService {
    void save (Person person);
    void delete(Person person);
    void update (Person person);
    List<Person> selectAll();
    Person selectOne(long id);
}
