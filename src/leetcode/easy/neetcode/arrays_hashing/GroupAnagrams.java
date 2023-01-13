package leetcode.easy.neetcode.arrays_hashing;

import java.awt.print.Pageable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] str2 = {"eat", "tea", "tan", "ate", "nat", "bat"};
        String[] str = {"a"};
        System.out.println(groupAnagrams(str));
        System.out.println(groupAnagrams(str2));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        if (strs.length == 0) return res;
        HashMap<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] hash = new char[26];
            for (char c : s.toCharArray()) {
                hash[c - 'a']++;
            }
            String key = new String(hash);
            map.computeIfAbsent(key, k -> new ArrayList<>());
            map.get(key).add(s);
        }
        res.addAll(map.values());
        return res;
    }
}




















//    public static List<List<String>> groupAnagrams(String[] strs) {
//        List<String> curr = new ArrayList<>();
//        List<List<String>> result = new ArrayList<>();
//        List<List<String>> f  = new ArrayList<>();
//
//        if(strs.length == 0) {
//            return result;
//        }
//
//        if(strs.length == 1) {
//            var collect = Arrays.stream(strs).distinct().collect(Collectors.toList());
//            result.add(collect);
//            return result;
//        }
//
//        for(String str: strs) {
//            char[] chars = str.toCharArray();
//            Arrays.sort(chars);
//            String sorted = new String(chars);
//            curr.add(sorted);
//        }
//
//        for(int i = 0; i < curr.size()+2; i++) {
//            var anagrams = anagrams(curr);
//            result.add(anagrams);
//            for(String anagram : anagrams) {
//                curr.remove(anagram);
//            }
//        }
//
//        return result.stream()
//                .sorted(List::indexOf)
//                .collect(Collectors.toList());
//    }
//
//    private static List<String> anagrams(List<String> list) {
//        List<String> anagrams = new ArrayList<>();
//        var first = list.get(0);
//        for(String str : list) {
//            if(first.equals(str)) {
//                anagrams.add(str);
//            }
//        }
//
//        return anagrams;
//    }

