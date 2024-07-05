package easy.Task_925;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Long Pressed Name
// https://leetcode.com/problems/long-pressed-name/description/
public class Solution {
    public boolean isLongPressedName(String name, String typed) {


       List<String> listName = separate(name);
       List<String> listType = separate(typed);

       if(listName.size()!=listType.size())return false;

       for(int i=0;i<listName.size();i++)
            if((listType.get(i).length()<listName.get(i).length())||
                listType.get(i).charAt(0)!=listName.get(i).charAt(0)
            ) return false;


       return true;
       }

       private List<String> separate(String word){
           StringBuilder sb = new StringBuilder();
           List<String> list = new ArrayList<>();
           sb.append(word.charAt(0));
           for(int i=1;i<word.length();i++)
           {
               if(word.charAt(i)!=word.charAt(i-1))
               {
                   list.add(sb.toString());
                   sb=new StringBuilder();
               }
               sb.append(word.charAt(i));
           }
           list.add(sb.toString());
           return list;
       }
}

