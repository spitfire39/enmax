package Utils;

import Entities.NewEmaxUser;
import org.springframework.stereotype.Component;
import java.util.Random;


@Component("generateEntity")
public class GenerateEntity {

    private static String generateRandomString(String aToZ) {
        Random rand = new Random();
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < 17; i++) {
            int randIndex=rand.nextInt(aToZ.length());
            res.append(aToZ.charAt(randIndex));
        }
        return res.toString();
    }

    public NewEmaxUser generateEnmaxUser(){
        NewEmaxUser user = new NewEmaxUser(generateRandomString("ABCD1234")+"@domain.com",
                generateRandomString("ABCDabcd..1234"),
                "5555555555",
                "19");
        return user;
    }
}
