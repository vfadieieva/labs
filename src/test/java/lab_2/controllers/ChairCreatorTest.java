package lab_2.controllers;

import lab_2.model.Chair;
import lab_2.model.Group;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;

class ChairCreatorTest {

@Test
void createChairRandomly() {
    float res = 0;
    int count = 1000;
    for (int iter = 0; iter < count; iter++) {
        ChairCreator creator = new ChairCreator();
        Chair chair = creator.createChairRandomly();
        List<Group> groups = chair.getGroups();
        HashSet<Group> groupSet = new HashSet<>();

        for (int i = 0; i < groups.size(); i++) {
            groupSet.add(groups.get(i));
        }

        if (groups.size() != groupSet.size()){
            res++;
        }
    }
    System.out.println("The percentage of content in one chair of the same groups is "+ res / count * 100 + "%");
    }
}