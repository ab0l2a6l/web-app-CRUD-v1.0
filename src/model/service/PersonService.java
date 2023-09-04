package model.service;

import model.entity.Person;

import java.util.List;

public interface PersonService {
    boolean save (Person person);
    boolean delete(Person person);
    boolean update (Person person);
    List<Person> selectAll();
    Person selectOne(long id);
}
