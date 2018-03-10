package Lesson9.HW;

public class UserRepository {
    private User[] users;

    public UserRepository(User[] users) {
        this.users = users;
    }

    public User[] getUsers() {
        return users;
    }

    private int countArrInd() {
        int countIn = 0;
        for (User user : users) {
            if (user != null)
                countIn++;
        }
        return countIn;
    }

    public String[] getUserNames() {
        String[] arrName = new String[countArrInd()];
        for (int i = 0; i < countArrInd(); i++) {
            if (users[i] != null)
                arrName[i] = users[i].getName();
        }
        return arrName;
    }

    public long[] getUserIds() {
        long[] arrId = new long[countArrInd()];
        for (int i = 0; i < countArrInd(); i++) {
            if (users[i] != null)
                arrId[i] = users[i].getId();
        }
        return arrId;
    }

    public String getUserNameById(long id) {
        String name = null;
        if (users != null)
            for (int i = 0; i < countArrInd(); i++) {
                if (users[i] != null && users[i].getId() == id)
                    name = users[i].getName();
            }
        return name;
    }

    public User getUserByName(String name) {
        if (users != null)
            for (int i = 0; i < countArrInd(); i++) {
                if (users[i] != null && users[i].getName() == name)
                    return users[i];
            }
        return null;
    }

    public User getUserById(long id) {
        if (users != null)
            for (int i = 0; i < countArrInd(); i++) {
                if (users[i] != null && users[i].getId() == id)
                    return users[i];
            }
        return null;
    }

    public User getUserBySessionId(String sessionId) {
        if (users != null)
            for (int i = 0; i < countArrInd(); i++) {
                if (users[i] != null && users[i].getSessionId() == sessionId)
                    return users[i];
            }
        return null;
    }

    private User findById(long id) {
        if (users != null)
            for (int i = 0; i < countArrInd(); i++) {
                if (users[i] != null && users[i].getId() == id)
                    return users[i];
            }
        return null;
    }

    public User save(User user) {
        if (findById(user.getId()) == null)
            for (User us : users) {
                if (us != null && us == user) {
                    continue;
                }
                us = user;
                return us;
            }
        return null;
    }
}