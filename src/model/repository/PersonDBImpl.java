package model.repository;

import model.entity.Person;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PersonDBImpl implements PersonDB, AutoCloseable {
    private final Connection connection;
    private PreparedStatement preparedStatement;

    public PersonDBImpl() throws Exception {
        System.out.println("before connection");
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/abolfazl", "root", "Am311865186");
        System.out.println("after connection");
    }

    @Override
    public void save(Person person) throws Exception {
        System.out.println("inserting . . . ");
        preparedStatement = connection.prepareStatement("insert into person (id ,first_name , last_name , age , email , phone_number)values(?,?,?,?,?,?) ");
        preparedStatement.setLong(1, person.getId());
        preparedStatement.setString(2, person.getFirstName());
        preparedStatement.setString(3, person.getLastName());
        preparedStatement.setByte(4, person.getAge());
        preparedStatement.setString(5, person.getEmail());
        preparedStatement.setLong(6, person.getPhoneNumber());
        preparedStatement.executeUpdate();
        System.out.println("inserted . . . ");
    }

    @Override
    public void delete(Person person) throws Exception {
        System.out.println("deleting . . . ");
        preparedStatement = connection.prepareStatement("delete  from person where id = ?");
        preparedStatement.setLong(1, person.getId());
        preparedStatement.executeUpdate();
        System.out.println("deleted . . . ");
    }

    @Override
    public void update(Person person) throws Exception {
        System.out.println("updating  . . . ");
        preparedStatement = connection.prepareStatement("update person set first_name = ?  , last_name = ? , age = ? , email = ? , phone_number = ? where id = ? ");
        preparedStatement.setString(1, person.getFirstName());
        preparedStatement.setString(2, person.getLastName());
        preparedStatement.setString(3, String.valueOf(person.getAge()));
        preparedStatement.setString(4, person.getEmail());
        preparedStatement.setString(5, String.valueOf(person.getPhoneNumber()));
        preparedStatement.setString(6, String.valueOf(person.getId()));
        preparedStatement.executeUpdate();
        System.out.println("updated . . . ");
    }

    @Override
    public List<Person> selectAll() throws Exception {
        System.out.println("selecting . . . ");

        List<Person> personList = new ArrayList<>();
        preparedStatement = connection.prepareStatement("select * from person");
        ResultSet set = preparedStatement.executeQuery();
        while (set.next()) {
            Person person = new Person();
            person.setId(set.getLong("id"));
            person.setFirstName(set.getString("first_name"));
            person.setLastName(set.getString("last_name"));
            person.setEmail(set.getString("email"));
            person.setAge(set.getByte("age"));
            person.setPhoneNumber(set.getLong("phone_number"));
            personList.add(person);
        }
        System.out.println("selected . . . ");
        return personList;
    }

    @Override
    public Person selectOne(long id) throws Exception {
        System.out.println("selecting . . . ");
        Person person = new Person();
        preparedStatement = connection.prepareStatement("select * from person where id = ?");
        preparedStatement.setLong(1, id);
        ResultSet set = preparedStatement.executeQuery();
        if (set.next()) {
            person.setId(id);
            person.setFirstName(set.getString("first_name"));
            person.setLastName(set.getString("last_name"));
            person.setEmail(set.getString("email"));
            person.setAge(set.getByte("age"));
            person.setPhoneNumber(set.getLong("phone_number"));
        }
        System.out.println("selected . . . ");
        return person;
    }

    @Override
    public void close() throws Exception {
        connection.close();
        preparedStatement.close();
    }
}
