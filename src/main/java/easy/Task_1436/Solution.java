package easy.Task_1436;

import java.util.*;

//Destination City
//https://leetcode.com/problems/destination-city/
public class Solution {
    public String destCity(List<List<String>> paths) {

        Set<String> allCities = new HashSet<>();
        Set<String> pathCities = new HashSet<>();

        for(int i=0;i < paths.size();i++)
        {
            allCities.add(paths.get(i).get(1));
            pathCities.add(paths.get(i).get(0));
        }

        allCities.removeAll(pathCities);
        return allCities.stream().findFirst().get();

    }
}