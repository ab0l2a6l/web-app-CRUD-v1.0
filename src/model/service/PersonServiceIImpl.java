package model.service;

import model.entity.Person;
import model.repository.PersonDB;
import model.repository.PersonDBImpl;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;

public class PersonServiceIImpl implements PersonService {
    private PersonServiceIImpl() {
    }

    private static final PersonServiceIImpl PERSON_SERVICE_I = new PersonServiceIImpl();

    public static PersonServiceIImpl getInstance() {
        return PERSON_SERVICE_I;
    }

    PersonDB personDB;

    @Override
    public boolean save(Person person) {
        try {
            personDB = new PersonDBImpl();
            return personDB.save(person);
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean delete(Person person) {
        try {
            personDB = new PersonDBImpl();
            return personDB.delete(person);
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean update(Person person) {
        try {
            personDB = new PersonDBImpl();
            return personDB.update(person);
        } catch (Exception e) {
            return false;
        }

    }

    @Override
    public List<Person> selectAll() {
        List<Person> personList;
        try {
            personDB = new PersonDBImpl();
            personList = personDB.selectAll();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return personList;
    }

    @Override
    public Person selectOne(long id) {
        Person person;
        try {
            personDB = new PersonDBImpl();
            person = personDB.selectOne(id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return person;
    }
}
