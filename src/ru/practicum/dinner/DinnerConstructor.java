package ru.practicum.dinner;

import java.util.HashMap;
import java.util.ArrayList;

public class DinnerConstructor {

    private static HashMap<String, ArrayList<String>> Menu = new HashMap<>();

    static {
        Menu.put("Первое", new ArrayList<>());
        ArrayList<String> orders = new ArrayList<>();
        orders.add("Суп Гороховый");
        orders.add("Суп Борщ");
        orders.add("Суп Щи");
        orders.add("Суп Гаспачо");
        orders.add("Суп Уха");
        orders.add("Суп Харчо");
        Menu.put("Первое", orders);

        Menu.put("Второе", new ArrayList<>());
        ArrayList<String> orders1 = new ArrayList<>();
        orders1.add("Котлета рубленная");
        orders1.add("Минтай отварной");
        orders1.add("Куриная грудка на пару");
        orders1.add("Биточек свиной");
        orders1.add("Мясо по-французски");
        orders1.add("Гуляш из говядины");
        Menu.put("Второе", orders1);

        Menu.put("Напиток", new ArrayList<>());
        ArrayList<String> orders2 = new ArrayList<>();
        orders2.add("Компот из сухофруктов");
        orders2.add("Чай зеленый");
        orders2.add("Чай черный с лимоном");
        orders2.add("Морс клюквенный");
        orders2.add("Морс брусничный");
        orders2.add("Сок яблочный");
        Menu.put("Напиток", orders2);

    }

    public static double addMenu(String dishType, String dishName) {

        if (Menu.containsKey(dishType)) {
            Menu.get(dishType).add(dishName);
            System.out.println(Menu);
        } else {
            System.out.println("Тип блюда не найден: " + dishType);
        }
        // Вывод меню для проверки
       return 0;
    }

    public static boolean checkType(String type) {
        return Menu.containsKey(type);
    }
    public static HashMap<String, ArrayList<String>> getMenu() {
        return Menu; // Предположим, что Menu уже объявлено
    }
}





