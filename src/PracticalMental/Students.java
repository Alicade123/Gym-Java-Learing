package PracticalMental;


import java.util.Arrays;

public class Students {
    //Declaring variables
    private String name;
    private double[][] grade = new double [5][5];
    static int numberOfStudents = 0;
    Students(String name ,  double [][] grade) {
        setName(name);
        Students.numberOfStudents++;
        setGrade(grade);

    }
    //1. Set and get Name
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name.toUpperCase();
    }
    //2. set and get Grades
    public void setGrade(double[][] grade) {
        this.grade = grade;
    }
    public double[][] getGrade() {
        return this.grade;
    }
    //3. Number of students
    public int getNumberOfStudents() {
        return Students.numberOfStudents;
    }
    public double calculateAverage(double [][] grade) {
        double total = 0.0;
        double average =0.0;

        for (int i = 0; i < grade.length; i++) {
            double sum = 0.0;
            for (int j = 0; j < grade[i].length; j++) {
                sum +=grade[i][j]/grade[i].length;
            }
            total += sum;
        }
        return total/grade.length;
    }
    //Checking Pass or Fail
    public String  showResult(){
        double min= 50.00;
        if(calculateAverage(this.grade)>min) return "Pass";
        return "Fail";
    }

    // 4. Display all grades using loops
    public void displayGrades() {
        System.out.println("Grades for " + getName() + ":");
        for (int i = 0; i < grade.length; i++) {
            double sum = 0.0;// loop through subjects
            for (int j = 0; j < grade[i].length; j++) {     // loop through grades per subject

                System.out.print(grade[i][j] + " ");
                sum += grade[i][j];
                if(j ==grade[i].length-1){
                    System.out.print(" Total =>: "+sum);
                }
            }
            System.out.println(); // move to next line after each subject
        }
    }

}
class MainStudent {
    public static void main(String[] args) {
        Students student1 = new Students("Arcade" , new double[][]{{89,90,20,88,78},{89,28,8,8,90},{89,90,20,88,78},{89,28,8,8,90},{89,90,20,88,78}});
        Students student2 = new Students("John", new double[][]{{89,90,20,88,78},{89,28,8,8,90},{89,90,20,88,78},{89,28,8,8,90},{89,90,20,88,78}});
        Students student3 = new Students("Jane", new double[][]{{89,90,20,88,78},{89,28,8,8,90},{89,90,20,88,78},{89,28,8,8,90},{89,90,20,88,78}});
        Students student4 = new Students("Jack", new double[][]{{89,90,20,88,78},{89,28,8,8,90},{89,90,20,88,78},{1,2,4,5,6},{89,90,20,88,78}});

        System.out.println(student1.getNumberOfStudents());
        System.out.println(student2.getName());
        System.out.println(student4.calculateAverage(student4.getGrade()));
        System.out.println(student1.showResult());
        student1.displayGrades();

    }

}
