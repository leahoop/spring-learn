package com.leetcode.solution;

import java.lang.reflect.Array;
import java.util.*;

public class Solution49 {

    public static void main(String[] args) {

        List<List<String>> lists = groupAnagrams(new String[]{"", "", ""});
//        List<List<String>> lists = groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
        System.out.println(lists.get(0));

    }


    public static List<List<String>> groupAnagrams(String[] strs) {
        // 官方题解
        Map<String, List<String>> map = new HashMap<>();
        for (String str: strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            map.computeIfAbsent(new String(chars), k -> new ArrayList<>()).add(str);
        }
        return new ArrayList<>(map.values());
    }

}
