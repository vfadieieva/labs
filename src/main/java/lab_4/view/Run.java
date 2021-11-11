package lab_4.view;

import lab_2.controllers.UniversityCreator;
import lab_2.model.University;
import lab_4.UniversityJSONReaderWriter;

public class Run {
    public static void main(String[] args) {
        UniversityJSONReaderWriter universityJSONReaderWriter = new UniversityJSONReaderWriter();
        UniversityCreator universityCreator = new UniversityCreator();
        University universityBase = universityCreator.createUniversityRandomly();
        universityJSONReaderWriter.writeToFile(universityBase,".src/main/resources/lab4.txt");
        University universityFromFile = universityJSONReaderWriter.readFromFile(".src/main/resources/lab4.txt");
    }
}