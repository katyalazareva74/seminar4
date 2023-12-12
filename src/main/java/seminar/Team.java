package seminar;

import java.util.*;

public class Team {
    public  static void sortalph(List<String> names){
        names.stream().sorted().forEach((s1)->System.out.println(s1));
    }
    public  static void sortchar(List<String> names){
        names.stream().sorted((s1, s2)->s1.length()-s2.length()).forEach((s1)->System.out.println(s1));
    }
    public  static void reverslist(List<String> names){
        List<String> name1=new ArrayList<>();
        for (int i = 0; i < names.size(); i++) {
            name1.add(names.get(names.size()-1-i));
        }
        name1.stream().forEach((s1)->System.out.println(s1));
     }
    public  static void set2(List<String> names){
        Set<String> set1 = new HashSet<>(names);
        set1.stream().forEach((s1)->System.out.println(s1));
    }
    public  static String sortalphset(List<String> names){
        Set<String> set1 = new HashSet<>(names);
        String str = set1.stream().sorted().findFirst().get();
        return str;
    }
    public  static String sortcharset(List<String> names){
        Set<String> set1 = new HashSet<>(names);
        String str = set1.stream().sorted((s1, s2)->s2.length()-s1.length()).findFirst().get();
        return str;
    }
    public  static void containrset(List<String> names){
        Set<String> set1 = new HashSet<>(names);
        Iterator<String> iter = set1.iterator();
        while(iter.hasNext()){
            if((iter.next().contains("а"))){
                iter.remove();
            }
        }
        set1.stream().forEach((s1)->System.out.println(s1));
    }
    public  static String humanfind(Map<String, String> names){
        String minkey = names.keySet().stream().sorted().findFirst().get();
        return minkey;
    }
    public  static void phonefind(Map<String, String> names){
        String maxvalue = names.values().stream().sorted((s1, s2)->s2.compareTo(s1)).findFirst().get();
        System.out.println(maxvalue+" -> ");
        names.keySet().stream().filter((e)->names.get(e).equals(maxvalue)).forEach((e)->System.out.println(e));
    }
}
