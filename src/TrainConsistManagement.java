import java.util.*;

class TrainApp{
public static void main(String args[]){

System.out.println("=== Train Consist Management App ===");

ArrayList<String> b=new ArrayList<>();

b.add("Sleeper");b.add("AC Chair");b.add("First Class");

System.out.println("after adding: "+b);

b.remove("AC Chair");

System.out.println("after removing: "+b);

System.out.println("sleeper exists? "+b.contains("Sleeper"));

}
}
