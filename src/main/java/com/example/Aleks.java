package com.example;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Aleks extends Lion{
    public Aleks(Feline feline) throws Exception {
        super("Самец", feline);
    }

    public Map<String, String> getFriends() {
        Map<String, String> map = new LinkedHashMap<>();
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
