package ua.univer.lesson13;

import java.util.List;

public class KMDAUtil {
    public static UserKMDA getMaxOklad(List<UserKMDA> users){
        UserKMDA maxOkladUser = users.get(0);
        for (var user : users) {
            if (user.getOklad()> maxOkladUser.getOklad())
                maxOkladUser = user;
        }
        return maxOkladUser;
    }
}
