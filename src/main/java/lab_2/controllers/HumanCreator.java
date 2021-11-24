package lab_2.controllers;

import lab_2.model.Human;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class HumanCreator {
    public static final List<String> DICTIONARY_NAMES = Arrays.asList("Oleg", "Masha", "Sasha", "Kate", "Ivan", "Petr", "Olga", "Mark");
    public static final List<String> DICTIONARY_SURNAMES = Arrays.asList("Didov", "Mikarchuk", "Koval", "Sheva", "Mirov", "Pillat", "Ivancha", "Ivanov");
    public static final List<String> DICTIONARY_DAY_OF_BIRTH = Arrays.asList("05-01-1999", "06-10-1999", "23-09-1998", "15-08-1998", "16-07-2000", "10-03-2000", "28-01-1999", "17-02-1999");

    public Human createHumanRandomly(){
        Random random = new Random();
        Human human  = new Human();
        human.setName(DICTIONARY_NAMES.get(random.nextInt(DICTIONARY_NAMES.size() - 1)));
        human.setSurname(DICTIONARY_SURNAMES.get(random.nextInt(DICTIONARY_SURNAMES.size() - 1)));
        human.setDateOfBirth(DICTIONARY_DAY_OF_BIRTH.get(random.nextInt(DICTIONARY_DAY_OF_BIRTH.size() - 1)));
        return human;
    }

}
