package org.example.drools.execution;

import org.example.drools.entity.ExerciseRecommend;
import org.example.drools.entity.FoodRecommend;
import org.example.drools.entity.Mother;
import org.example.drools.repository.ApplicationRepository;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import java.util.Collection;
import java.util.List;


public class MotherRecommendation {
    public static void main(final String[] args) {
        execute();
    }

    static void execute() {
        KieContainer kieContainer = KieServices.Factory.get().getKieClasspathContainer();
        KieSession kieSession = kieContainer.newKieSession("RecommendationRules");

        List<Mother> mothers = ApplicationRepository.getMothers();
        mothers.forEach(kieSession::insert);

        System.out.println("==== DROOLS SESSION START ==== ");
        kieSession.fireAllRules();
        kieSession.dispose();
        System.out.println("==== DROOLS SESSION END ==== ");

        System.out.println("==== Food Recommendation For Mother === ");
        Collection<?> foodRecommendations = kieSession.getObjects(o-> o.getClass() == FoodRecommend.class);
        foodRecommendations.forEach(System.out::println);

        System.out.println();
//        System.out.println("==== Food Recommendation For Mother === ");
//        Collection<?> exerciseRecommendation = kieSession.getObjects(o-> o.getClass() == ExerciseRecommend.class);
//        exerciseRecommendation.forEach(System.out::println);
    }
}
