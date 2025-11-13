package PracticalMental;
import java.util.Arrays;
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

public class OneOnone1 {
        public static void main(String[] args) {
//      Question:
// Store student names and their scores in a 2D array.
// Print the highest score and the student who got it.

            String [][] studentScores = new String[][] {
                    {"Alicade","130"},
                    {"Alice","80"},
                    {"Agnes","90"},
                    {"Eric","10"},
                    {"Mugisha","605"}
            };
            String [] results = studentScores[0];
            int highestScores = Integer.parseInt(studentScores[0][1]);
            StringBuilder student = new StringBuilder();

            for(int i=0; i<studentScores.length; i++){
                for(int j=0 ; j<studentScores[i].length; j++){
                    if(Integer.parseInt(studentScores[i][1])>highestScores){
                        highestScores = Integer.parseInt(studentScores[i][1]);
                        student.append(studentScores[i][0]);
                    }
                    // System.out.print(studentScores[i][1] +" ");
                }
            }

//   System.out.println(Arrays.deepToString(studentScores));
//   System.out.println(Arrays.toString(results));
            System.out.println();
            System.out.println(highestScores);
            System.out.println(student);

        }
    }

