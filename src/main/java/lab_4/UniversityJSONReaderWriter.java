package lab_4;

import com.google.gson.Gson;
import lab_2.model.University;

import java.io.*;

public class UniversityJSONReaderWriter {
        public void writeToFile(University university, String path){
            try {
                Gson gson = new Gson();
                String univerText = gson.toJson(university);
                FileWriter fileWriterAnother = new FileWriter(path);
                fileWriterAnother.write(univerText);
                fileWriterAnother.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        public University readFromFile(String path){
            String uniText = "";
            try {
                FileReader fileReaderAnother = new FileReader(path);
                BufferedReader br = new BufferedReader(fileReaderAnother);
                String s;
                while((s = br.readLine()) != null){
                    uniText = uniText + "\n" + s;
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e)
            {
                e.printStackTrace();
            }

            Gson gson = new Gson();
            return gson.fromJson(uniText, University.class);
        }
    }
