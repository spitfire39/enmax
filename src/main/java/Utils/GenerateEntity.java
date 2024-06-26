package Utils;

import Entities.Vacancy;
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

    public Vacancy generateMinVacancy(){
        Vacancy vacancy = new Vacancy(generateRandomString("ABCD.....1234"), "QA Engineer",
                "Java", "Scrum", "Ukrainian", "Native",
                "Ukraine", "Remote", "1");
        return vacancy;
    }
}
