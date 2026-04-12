// File: result/Result.java
package Result;

import info.student;

public class result {

    public void calculateGrade(student s) {
        int total = s.eng + s.math + s.sci + s.soc + s.hin;
        double avg = total / 5.0;

        System.out.println("Total Marks: " + total);
        System.out.println("Average: " + avg);

        if(avg >= 90)
            System.out.println("Grade: A");
        else if(avg >= 75)
            System.out.println("Grade: B");
        else if(avg >= 60)
            System.out.println("Grade: C");
        else
            System.out.println("Grade: Fail");
    }
}