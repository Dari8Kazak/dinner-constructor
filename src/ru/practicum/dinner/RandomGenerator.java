package ru.practicum.dinner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class RandomGenerator {

    private final HashMap<String, ArrayList<String>> dishes;

    public RandomGenerator(HashMap<String, ArrayList<String>> dishes) {
        this.dishes = dishes;
    }

    public void generateCombinations(int numberOfCombos, List<String> dishTypesParam) {
        Random random = new Random();
        StringBuilder result = new StringBuilder();
        ArrayList<String> dishesTypes;

        try {
            dishesTypes = (ArrayList<String>) dishTypesParam;
        } catch (Exception exc) {
            System.out.println("В метод generateCombinations был передан не ArrayList");
            throw exc;
        }

        for (int i = 0; i < numberOfCombos; i++) {
            int count = 0;
            result.append("[");
            for (String type : dishesTypes) {
                ArrayList<String> dish = this.dishes.get(type);
                result.append(dish.get(random.nextInt(dish.size())));

                if (count < dishesTypes.size() - 1) {
                    result.append(", ");
                    count++;
                }
            }

           result.append("]");
            System.out.println("Бизнес-ланч" + (i + 1));
            System.out.println(result);
            result.setLength(0);
        }

        System.out.println("-".repeat(20));
    }
}
//  void checkType(String type){*/}
