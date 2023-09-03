package controler;

import model.entity.Person;
import model.service.PersonService;
import model.service.PersonServiceIImpl;

import java.util.List;

public class PersonControler {
    PersonService personService = PersonServiceIImpl.getInstance();

    public void save(Person person) {
        personService.save(person);
    }

    public void delete(Person person) {
        personService.delete(person);
    }

    public void update(Person person) {
        personService.update(person);
    }

    public List<Person> selectAll() {
       return personService.selectAll();
    }

    public Person selectOne(long id) {
        return personService.selectOne(id);
    }
}
