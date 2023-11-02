package org.example.drools.repository;

import org.example.drools.entity.BloodPressure;
import org.example.drools.entity.FamilyDisease;
import org.example.drools.entity.Mother;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ApplicationRepository {

    public static List<Mother> getMothers() {
        List<Mother> mothers =new ArrayList<>();

        Mother mother1 = Mother.newBuilder()
                .withName("Hail")
                .withAge(45)
                .withFamilyDiseases(Arrays.asList(FamilyDisease.HIGH_BLOOD_PRESSURE))
                .withAllergyFood(Arrays.asList("Peanut", "Butter"))
                .withBloodPressure(new BloodPressure(160, 110))
                .withBloodSugar(5.6)
                .withHaemoglobin(20)
                .withPregnant(true)
                .withTrimester(2)
                .build();

        Mother mother2 = Mother.newBuilder()
                .withName("Visa")
                .withAge(45)
                .withFamilyDiseases(Arrays.asList(FamilyDisease.HIGH_BLOOD_PRESSURE))
                .withHistoricalDisease(Arrays.asList("Diabetes"))
                .withBloodPressure(new BloodPressure(120, 50))
                .withBloodSugar(100)
                .withHaemoglobin(10)
                .withPregnant(true)
                .withTrimester(3)
                .build();

        Mother mother3 = Mother.newBuilder()
                .withName("Wai")
                .withAge(25)
                .withDietReligious("Hindu")
                .withBloodPressure(new BloodPressure(120, 50))
                .withBloodSugar(5)
                .withHaemoglobin(10)
                .withPregnant(false)
                .build();

        Mother mother4 = Mother.newBuilder()
                .withName("Four")
                .withAge(25)
                .withDietReligious("Hindu")
                .withBloodPressure(new BloodPressure(120, 50))
                .withBloodSugar(5)
                .withHaemoglobin(10)
                .withPregnant(false)
                .withBreastFeeding(true)
                .withDeliveryMethod("C-Section")
                .build();

        //mothers.add(mother1);
        // mothers.add(mother2);
        // mothers.add(mother3);
        mothers.add(mother4);
        return mothers;
    }
}
