package web.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.model.User;

import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class UserDAO {
    private static int PEOPLE_COUNT = 0;

    private List<User> users;

    {
        users = new ArrayList<>();
        users.add(new User(++PEOPLE_COUNT,"Kolya", 20));
        users.add(new User(++PEOPLE_COUNT,"Simon", 7));
        users.add(new User(++PEOPLE_COUNT,"Tanya", 44));
    }

    public List<User> allUsers() {
        return users;
    }

    public User show(int id){
        return users.stream().filter(user -> user.getId() == id).findAny().orElse(null);
    }

    public void save(User user){
        user.setId(++PEOPLE_COUNT);
        users.add(user);
    }

    public void update(int id, User updatedUser){
        User userToUpdate = show(id);
        userToUpdate.setName(updatedUser.getName());
        userToUpdate.setAge(updatedUser.getAge());
    }

    public void delete(int id){
        users.removeIf(user -> user.getId() == id);
    }
}
