package models;

import utils.FakeMessageGenerator;

public class PrepareUserDataModel {
    public static UserDataModel getValidData(){
        return UserDataModel.builder()
                .sex("Female")
                .birthday("October")
                .birthday("10")
                .birthday("1992")
                .height("Meters")
                .height(FakeMessageGenerator.generateHeight())
                .currentWeight("Kilograms (kgs)")
                .currentWeight(FakeMessageGenerator.generateCurrentWeight())
                .goalWeight(FakeMessageGenerator.generateGoalWeight())
                .goalDate(FakeMessageGenerator.generateDate())
                .activityLevel("Seated All Day")
                .build();
    }
}
