package Lesson9.HW;

public class UserRepository {
    User[] users;

    public UserRepository(User[] users) {
        this.users = users;
    }

    public User[] getUsers() {
        return users;
    }

    public User findById(long id) {
        if (users != null)
            for (User user : users) {
                if (user != null && user.getId() == id)
                    return user;
            }
        return null;
    }

    public User save(User user) {
        if (findById(user.getId()) == null)
            for (User userId : users) {
                if (userId == null)
                    userId = user;
                return userId;
            }
        return null;
    }

    public User update(User user) {
        if (findById(user.getId()) != null)
            for (User userId : users) {
                if (userId.getId() == user.getId())
                    userId = user;
                return userId;
            }
        return null;
    }

    public void delete(long id) {
        User user = findById(id);
        for (User userId : users) {
            if (userId == user)
                userId = null;
        }
    }
}
