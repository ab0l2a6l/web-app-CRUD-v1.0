package controler;

import model.entity.Person;
import model.service.PersonService;
import model.service.PersonServiceIImpl;

import java.util.List;

public class PersonControler {
    PersonService personService = PersonServiceIImpl.getInstance();

    public boolean save(Person person) {
           return personService.save(person);
    }

    public boolean delete(Person person) {
       return personService.delete(person);
    }

    public boolean update(Person person) {
        return personService.update(person);
    }

    public List<Person> selectAll() {
       return personService.selectAll();
    }

    public Person selectOne(long id) {
        return personService.selectOne(id);
    }
}
