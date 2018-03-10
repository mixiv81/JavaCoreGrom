package Lesson9.HW;

public class UserRepository {
    private User[] users;

    public UserRepository(User[] users) {
        this.users = users;
    }

    public User[] getUsers() {
        return users;
    }

    public String[] getUserNames() {
        if (users == null || users.length == 0)
            return null;
        String[] arr = new String[users.length];
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null)
                arr[i] = users[i].getName();
            i++;
        }
        return arr;
    }

    public long[] getUserIds() {
        if (users == null || users.length == 0)
            return null;
        long[] arr = new long[users.length];
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null)
                arr[i] = users[i].getId();
            i++;
        }
        return arr;
    }

    public User getUserNameById(long id) {
        if (users == null || users.length == 0)
            return null;
        int ind = 0;
        for (int i = 0; i < users.length; i++) {
            if (users[i] == null || users[i].getId() != id)
                ind++;
        }
        return users[ind];
    }
}
