import java.lang.Math;
import java.util.Arrays;
public class AA1 {
    public static void main(String args[]) {
        char[] Student = new char[26];
        int[] grade = new int[26];
        String[] letter = new String[26];
        String[] Placement = new String[26];
        int total = 0;
        
        for(int i = 0; i < 26; i++){
            Student[i] = (char)(i+65);
            grade[i] = (int)(Math.random()*30) + 70;
            if(grade[i] >= 90){
                letter[i] = "A";
                Placement[i] = "Honors Advanced Geometry";
            } else if(grade[i] >= 80){
                letter[i] = "B";
                Placement[i] = "Honors Geometry";
            } else if(grade[i] >= 70){
                letter[i] = "C";
                Placement[i] = "Geometry";
            }
            
            if(letter[i].indexOf("F") == -1){
                if(grade[i]%10 >= 0 && grade[i]%10 <= 2){
                    letter[i] += "-";
                } else if(grade[i]%10 >= 7 && grade[i]%10 <= 9){
                    letter[i] += "+";
                } else {
                    letter[i] += " ";
                }
            }
        }
        
        System.out.println("Class 801: Advanced Algebra 1");
        for(int i = 0; i < 13; i++){
            System.out.println(Student[i] + ": " + grade[i] + " " + letter[i] + " " + Placement[i]);
            total += grade[i];
        }
        System.out.println("Class Avg.: " + Math.round(total/13.0*10.0)/10.0);
        System.out.println();
        total = 0;
        System.out.println("Class 802: Advanced Algebra 1");
        for(int i = 13; i < 26; i++){
            System.out.println(Student[i] + ": " + grade[i] + " " + letter[i] + " " + Placement[i]);
            total += grade[i];
        }
        System.out.println("Class Avg.: " + Math.round(total/13.0*10.0)/10.0);
        
        total = 0;
        for(int i = 0; i < 26; i++){
            total += grade[i];
        }
        System.out.println();
        System.out.println("AA1 Avg.: " + Math.round(total/26.0*10.0)/10.0);
        
    }
}
