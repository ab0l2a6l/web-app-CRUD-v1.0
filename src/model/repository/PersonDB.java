package model.repository;

import model.entity.Person;

import java.util.List;

public interface PersonDB {
    boolean save (Person person);
    boolean delete(Person person);
    boolean update (Person person);
    List<Person> selectAll()throws Exception;
    Person selectOne(long id)throws Exception;
}
