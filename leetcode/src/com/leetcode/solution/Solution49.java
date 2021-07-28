package com.leetcode.solution;

import java.util.*;

public class Solution49 {


    public List<List<String>> groupAnagrams(String[] strs) {

        if (strs.length == 0) {
            return new ArrayList<>();
        }

        if (strs.length == 1) {
            return new ArrayList(Arrays.asList(strs));
        }

        for (int i = 0; i < strs.length; i++) {
            String temp = strs[i];
            Set set = new HashSet();
            for (int x = 0; x< temp.length(); x++) {

            }

            for (int j = i+1; j< strs.length; j++) {



            }
        }


        return null;
    }

}
