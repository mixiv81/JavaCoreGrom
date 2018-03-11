package Lesson9.HW;

public class PreviousUserRepository {
    private User[] users;

    public PreviousUserRepository(User[] users) {
        this.users = users;
    }

    public User[] getUsers() {
        return users;
    }

    private int countArrInd() {
        int count = 0;
        for (User user : users) {
            if (user != null) {
                count++;
            }
        }
        return count;
    }

    public String[] getUserNames() {
        String[] arrName = new String[countArrInd()];
        for (int i = 0; i < countArrInd(); i++) {
            if (users[i] != null) {
                arrName[i] = users[i].getName();
            }
        }
        return arrName;
    }

    public long[] getUserIds() {
        long[] arrId = new long[countArrInd()];
        for (int i = 0; i < countArrInd(); i++) {
            if (users[i] != null) {
                arrId[i] = users[i].getId();
            }
        }
        return arrId;
    }

    public String getUserNameById(long id) {
        String name = null;
        if (users != null)
            for (User user : users) {
                if (user != null && user.getId() == id)
                    name = user.getName();
            }
        return name;
    }

    public User getUserByName(String name) {
        if (users != null)
            for (User user : users) {
                if (user != null && user.getName().equals(name))
                    return user;
            }
        return null;
    }

    public User getUserById(long id) {
        if (users != null)
            for (User user : users) {
                if (user != null && user.getId() == id)
                    return user;
            }
        return null;
    }

    public User getUserBySessionId(String sessionId) {
        if (users != null)
            for (User user : users) {
                if (user != null && user.getSessionId().equals(sessionId))
                    return user;
            }
        return null;
    }

    private User findById(long id) {
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
