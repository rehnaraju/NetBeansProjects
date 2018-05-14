package de.gfn.oca.basics;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tlubowiecki
 */
public class ArrayListTest {
    
    public static void main(String[] args) {
        
        ArrayList<String> list = new ArrayList<>();
//        list.add(1); 
//        list.add(10.2);
        list.add("Peter");
//        list.add(new Object());
        list.add("Bruce");
        list.add("Clark");

        // ((alt * 3) / 2) + 1
        
        for(String l : list) {
            System.out.println(l.charAt(0));
        }
        
        System.out.println("------------");
        
        ArrayList<Test> l1 = new ArrayList<>();
        l1.add(new Test("Peter"));
        l1.add(new Test("Clark"));
        l1.add(new Test("Bruce"));
        
        ArrayList<Test> l2 = new ArrayList<>(l1);
        
        ArrayList<Test> l3 = (ArrayList<Test>)l1.clone();
        
        System.out.println(l2.get(1).getName());
        l2.get(1).setName("David");
        
        System.out.println(l1.get(1).getName());
        
        System.out.println(l3.get(1).getName());
        
        System.out.println("----------");
        
        List<String> liste3 = new ArrayList<>();
        liste3.add("Bob");
        liste3.add("Peter");
        liste3.add(2, "Max");
        
        for(String str : liste3) {
            System.out.println(str); 
        }
        
        int i;
        for(i = 0; i < liste3.size(); i++) {
            System.out.println(liste3.get(i));
        }
        
        String x = "Moin Moin";
        x.substring(0, x.length());
        
        String []a[] = {{"A", "B"},{"C", "D"}};
        
        
    }
}

class Test {
    
    private String name;

    public Test(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
