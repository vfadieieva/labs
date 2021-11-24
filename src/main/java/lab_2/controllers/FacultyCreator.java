package lab_2.controllers;

import lab_2.model.Chair;
import lab_2.model.Faculty;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class FacultyCreator {
    public static final int MIN_NUMBER_FACULTY_SIZE = 5;
    public static final int MAX_NUMBER_FACULTY_SIZE = 10;
    public static final List<String> DICTIONARY_NAMES_OF_FACULTIES = Arrays.asList("Faculty of Information Technologies", "Faculty of Finances and Economics", "Faculty of Law");

    public Faculty createFacultyRandomly() {
        Random random = new Random();
        HumanCreator humanCreator = new HumanCreator();
        ChairCreator chairCreator = new ChairCreator();
        int numberOfChairs = random.nextInt(MIN_NUMBER_FACULTY_SIZE) + MAX_NUMBER_FACULTY_SIZE - MIN_NUMBER_FACULTY_SIZE;
        Faculty faculty = new Faculty();
        faculty.setTitle(DICTIONARY_NAMES_OF_FACULTIES.get(random.nextInt(DICTIONARY_NAMES_OF_FACULTIES.size() - 1)));
        faculty.setManager(humanCreator.createHumanRandomly());
        List<Chair> chairs = new ArrayList<>();

        for (int i = 0; i < numberOfChairs; i++) {
            chairs.add(chairCreator.createChairRandomly());
        }
        faculty.setChairs(chairs);
        return faculty;
    }
}

