package models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserDataModel {
    private String sex;
    private String birthday;
    private String height;
    private String currentWeight;
    private String goalWeight;
    private String goalDate;
    private String activityLevel;
}
