package lab_4;

import lab_2.controllers.UniversityCreator;
import lab_2.model.University;

import static org.junit.jupiter.api.Assertions.*;

class UniversityJSONReaderWriterTest {

    @org.junit.jupiter.api.Test
    void writeToFile() {
        UniversityJSONReaderWriter universityJSONReaderWriter = new UniversityJSONReaderWriter();
        UniversityCreator universityCreator = new UniversityCreator();
        University university = universityCreator.createUniversityRandomly();
        universityJSONReaderWriter.writeToFile(university, "./src/main/resources/lab4.json");
        University universityFromFile = universityJSONReaderWriter.readFromFile("./src/main/resources/lab4.json");

        assertEquals(universityFromFile, university);
    }
}