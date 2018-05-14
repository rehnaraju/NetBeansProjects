package de.gfn.oca.flowcontrol;

/**
 *
 * @author Administrator
 */
public class SchleifenTest {
    
    public static void main(String[] args) {
        
        Scout[] arr = {new Scout("Peter"), new Scout("Bob"), new Scout("Andrew")};
        
//        for(Scout s : arr) {
//            s.setName("");
//        }
//        
//        for(Scout s : arr) {
//            System.out.println(s.getName());
//        }
        
        System.out.println("-------------");
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].getName().equals("Bob"))
                //continue;
                break;
            
            System.out.println(arr[i].getName());
        }
        
//        for(int i = 0, j = 20; i < arr.length; System.out.println(arr[i])) {
//             i++;
//        }
        
        System.out.println("-------------");
        
        int[][] zahlen = {{1,2},{4,5,8,9},{15,22,44}};
        
        f1: for(int i = 0; i < zahlen.length; i++){
            f2: for(int j = 0; j < zahlen[i].length; j++){
                System.out.println(zahlen[i][j]);
                if(zahlen[i][j] == 8)
                    break f1;
            }
        }
        
        System.out.println("---------------");
        
        int i = 9;
        while(i < 10) {
            System.out.println("...");
            i++;
        }
        
        do {
            System.out.println("...");
            i++;
        } while(i < 10);
        
        //JPA
        //Spring
        //JSF
        //Microservices
        //DevOps
        //SOA
    }
}

class Scout {
    
    private String name;

    public Scout(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}