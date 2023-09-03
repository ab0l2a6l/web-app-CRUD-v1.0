package model.repository;

import model.entity.Person;

import java.util.List;

public interface PersonDB {
    void save (Person person)throws Exception;
    void delete(Person person)throws Exception;
    void update (Person person)throws Exception;
    List<Person> selectAll()throws Exception;
    Person selectOne(long id)throws Exception;
}
