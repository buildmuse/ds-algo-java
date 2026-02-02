package com.ds_algo.strings;

import java.util.HashMap;
import java.util.Map;

public class strings {

    // frequency map for alphabets and unicode characters
    private void frequencyMap( String s) {
        Map<Character, Integer> map = new HashMap<>();

        for(char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0)+1);
        }
    }

    
}
