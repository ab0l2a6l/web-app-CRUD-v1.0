package model.service;

import model.entity.Person;
import model.repository.PersonDB;
import model.repository.PersonDBImpl;

import java.util.List;

public class PersonServiceIImpl implements PersonService {
    private PersonServiceIImpl(){}
    private static final PersonServiceIImpl PERSON_SERVICE_I = new PersonServiceIImpl();

    public static PersonServiceIImpl getInstance() {
        return PERSON_SERVICE_I;
    }
    PersonDB personDB ;

    @Override
    public void save(Person person) {
        try {
           personDB = new PersonDBImpl();
           personDB.save(person);
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void delete(Person person) {
        try {
            personDB = new PersonDBImpl();
            personDB.delete(person);
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void update(Person person) {
        try {
            personDB = new PersonDBImpl();
            personDB.update(person);
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Person> selectAll() {
        List<Person> personList;
        try {
            personDB = new PersonDBImpl();
            personList = personDB.selectAll();
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
        return personList;
    }

    @Override
    public Person selectOne(long id) {
        Person person ;
        try {
            personDB = new PersonDBImpl();
           person =  personDB.selectOne(id);
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
        return person;
    }
}
