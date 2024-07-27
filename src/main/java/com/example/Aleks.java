package com.example;

import java.util.HashMap;
import java.util.Map;

public class Aleks extends Lion{
    public Aleks(Feline feline) throws Exception {
        super("Самец", feline);
    }

    public Map<String, String> getFriends() {
        Map<String, String> map = new HashMap<>();
        map.put("Зебра","Марти");
        map.put("Бегемотиха","Глория");
        map.put("Жираф","Мелман");

        return map;
    }

    public String getPlaceOfLiving() {
        return "Нью-Йоркский зоопарк";
    }

    @Override
    public int getKittens() {
        return 0;
    }
}
