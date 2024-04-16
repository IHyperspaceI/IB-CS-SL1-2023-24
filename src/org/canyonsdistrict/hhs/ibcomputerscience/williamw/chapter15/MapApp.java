package org.canyonsdistrict.hhs.ibcomputerscience.williamw.chapter15;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class MapApp {

    public static void main(String[] args) {

        Map<String, Color> favoriteColors = new HashMap<>();
        favoriteColors.put("Alex", Color.BLUE );
        favoriteColors.put("Matus", Color.PINK);
        favoriteColors.put("Srikar", Color.black);
        favoriteColors.put("Hailie", Color.green);
        favoriteColors.put("Christian", Color.orange);
        favoriteColors.put("Alex", Color.cyan);

        var keys = favoriteColors.keySet();
        for (var key : keys){
            if (key.equals("Alex")){
                favoriteColors.put("Alex", Color.cyan);
            }
            var color = favoriteColors.get(key);
            System.out.printf("%s : %s\n", key, color);
        }
    }
}
