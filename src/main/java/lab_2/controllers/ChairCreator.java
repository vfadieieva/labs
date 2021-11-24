package lab_2.controllers;

import lab_2.model.Chair;
import lab_2.model.Group;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ChairCreator {
    public static final int MIN_NUMBER_CHAIR_SIZE = 5;
    public static final int MAX_NUMBER_CHAIR_SIZE = 10;
    public static final List<String> DICTIONARY_NAMES_OF_CHAIRS = Arrays.asList("Chair of System Analyses","Chair of Information Security and Telecommunications","Chair of Computer Engineering","Chair of Marketing","Chair of Accounting and Audit");

    public Chair createChairRandomly() {
        Random random = new Random();
        GroupCreator groupCreator = new GroupCreator();
        HumanCreator humanCreator = new HumanCreator();
        int numberOfGroups = random.nextInt(MIN_NUMBER_CHAIR_SIZE) + MAX_NUMBER_CHAIR_SIZE - MIN_NUMBER_CHAIR_SIZE;
        Chair chair = new Chair();
        chair.setTitle(DICTIONARY_NAMES_OF_CHAIRS.get(random.nextInt(DICTIONARY_NAMES_OF_CHAIRS.size() - 1)));
        chair.setManager(humanCreator.createHumanRandomly());
        List<Group> groups = new ArrayList<>();

        for (int i = 0; i < numberOfGroups; i++) {
            groups.add(groupCreator.createGroupRandomly());
        }
        chair.setGroups(groups);
        return chair;
    }
}


