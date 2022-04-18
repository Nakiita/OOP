import javax.swing.*;

//1. Write a program to take student details as input and display the result.
public class Assignment2 {
    public static void main(String[] args) {
        String name, address;
        int age, batch;
        name = (JOptionPane.showInputDialog(null,"Name: " ));
        address = (JOptionPane.showInputDialog(null,"Address: " ));
        age = Integer.parseInt(JOptionPane.showInputDialog(null,"Age: " ));
        batch = Integer.parseInt(JOptionPane.showInputDialog(null,"Batch: " ));
        JOptionPane.showMessageDialog(null,"Name: "+name+ " Address: "+address+ " Age: "+age+  " Batch: "+batch );

        }
    }

//2. Write a program to calculate sum of four numbers taking user input.
class Sum{
    public static void main(String[] args) {
        float a,b,c,d, sum4;
        a = Integer.parseInt(JOptionPane.showInputDialog(null,"1st number: "));
        b = Integer.parseInt(JOptionPane.showInputDialog(null,"2nd number: "));
        c = Integer.parseInt(JOptionPane.showInputDialog(null,"3rd number: "));
        d = Integer.parseInt(JOptionPane.showInputDialog(null,"4tt number: "));
        sum4 = a+b+c+d;
        JOptionPane.showMessageDialog(null,"Sum of all number= "+sum4);

    }
}


//3. Write a program to take input of the total marks of four subjects of a student and calculate the total percentage secured. Then display the percentage and final result of the student;
// If equal to or more than 70 -> First Class
//If more than 59 -> Upper second Class
//If more than 49 -> Second class
//If more than 39 -> Third class and if below than 40 the result is fail.*/
class Class{
    public static void main(String[] args) {
        float maths, science, computer, english, tot, percent;
        String remarks;
        maths = Float.parseFloat(JOptionPane.showInputDialog(null, "marks obtaines in maths "));
        science = Float.parseFloat(JOptionPane.showInputDialog(null, "marks obtaines in science "));
        computer = Float.parseFloat(JOptionPane.showInputDialog(null, "marks obtaines in computer "));
        english = Float.parseFloat(JOptionPane.showInputDialog(null, "marks obtaines in english"));
        tot = maths + science + computer + english;
        percent = tot * 100 / 400;
        remarks = (percent >= 70) ? "First Class" : (percent >= 59 && percent < 70) ? "Second Upper Class" : (percent >= 49 && percent < 59) ? "Second Class" : (percent >= 39 && percent < 49) ? "Third Class" : "Fail";
        JOptionPane.showMessageDialog(null, "Total marks= " + tot);
        JOptionPane.showMessageDialog(null, "Percentage= " + percent);
        JOptionPane.showMessageDialog(null, "Percentage= " + remarks);
    }
}

//4. Write a program to take two integer inputs from user and print sum and product of them.
class SumProduct{
    public static void main(String[] args) {
        float x,y,sum,prod;
        x = Float.parseFloat(JOptionPane.showInputDialog(null,"x"));
        y = Float.parseFloat(JOptionPane.showInputDialog(null,"y"));
        sum = x+y;
        prod = x*y;
        JOptionPane.showMessageDialog(null,"Sum of Two number = "+sum);
        JOptionPane.showMessageDialog(null,"Product of Two number = "+prod);
    }
}

//5. Take two integer inputs from user. First calculate the sum of two then product of two. Finally, print the sum and product of both obtained results.
class Five{
    public static void main(String[] args) {
        float x,y,sum,prod,sum2,prod2;
        x = Float.parseFloat(JOptionPane.showInputDialog(null,"x"));
        y = Float.parseFloat(JOptionPane.showInputDialog(null,"y"));
        sum = x+y;
        prod = x*y;
        sum2 = sum+prod;
        prod2 = sum*prod;

        JOptionPane.showMessageDialog(null,"Sum of Two number = "+sum);
        JOptionPane.showMessageDialog(null,"Product of Two number = "+prod);
        JOptionPane.showMessageDialog(null,"Sum of Answer = "+sum2);
        JOptionPane.showMessageDialog(null,"Product of Answer = "+prod2);
    }
}

//6. Ask user to give two double input for length and breadth of a rectangle and print area type cast to int.
class LengthBreadtth{
    public static void main(String[] args) {
        double l, b, areaOfRec;
        l = Double.parseDouble(JOptionPane.showInputDialog(null,"Length"));
        b = Double.parseDouble(JOptionPane.showInputDialog(null,"Breadth"));
        areaOfRec = l*b;
        int int_area = (int)areaOfRec;
        JOptionPane.showMessageDialog(null,"Area in Integer: "+int_area);


    }
}

//7. Take name, roll number and field of interest from user and print in the format below :Hey,my name is xyz and my roll number is xyz. My field of interest are xyz.
class abc{
    public static void main(String[] args) {
        String name, interest;
        int roll_no;
        name = JOptionPane.showInputDialog(null,"Name: ");
        interest= JOptionPane.showInputDialog(null,"Interest: ");
        roll_no= Integer.parseInt(JOptionPane.showInputDialog(null,"Roll no.: "));
        JOptionPane.showMessageDialog(null,"Hey,my name is "+ name+ " and my roll number is " +roll_no+ ". My field of interest are "+interest);
    }
}


//8. Take side of a square from user and print area and perimeter of it. Also, calculate SI, Area of triangle and Volume of Cube and Cuboid. Take the attributes as user input.
class XYZ{
    public static void main(String[] args) {
        float a,p, areaOfSquare,perimeterOfSquare;
        a = Float.parseFloat(JOptionPane.showInputDialog(null,"Side of square: "));
        areaOfSquare = a*a;
        perimeterOfSquare = 4*a;
        JOptionPane.showMessageDialog(null,"Area of Square"+areaOfSquare);
        JOptionPane.showMessageDialog(null,"Perimeter of Square"+perimeterOfSquare);

        float pr,ra,ti,sim_int;
        pr = Float.parseFloat(JOptionPane.showInputDialog(null,"Principle"));
        ra = Float.parseFloat(JOptionPane.showInputDialog(null,"Rate"));
        ti = Float.parseFloat(JOptionPane.showInputDialog(null,"Time"));
        sim_int = (pr*ra*ti)*100;
        JOptionPane.showMessageDialog(null, "Simple Interest"+sim_int);

        float b1, h1,tri;
        b1 = Float.parseFloat(JOptionPane.showInputDialog(null,"Breadth"));
        h1 = Float.parseFloat(JOptionPane.showInputDialog(null,"Height"));
        tri = b1*h1/2;
        JOptionPane.showMessageDialog(null, "Area of Triangle "+tri);

        float br, volumeOfCube;
        br = Float.parseFloat(JOptionPane.showInputDialog(null,"Edge"));
        volumeOfCube = br*br*br;
        JOptionPane.showMessageDialog(null,"Volume of cube"+volumeOfCube);

        float len, width, height, volumeOfCuboid;
        len = Float.parseFloat(JOptionPane.showInputDialog(null,"Length"));
        width = Float.parseFloat(JOptionPane.showInputDialog(null,"Breadth"));
        height= Float.parseFloat(JOptionPane.showInputDialog(null,"Height"));
        volumeOfCuboid = len*width*height;
        JOptionPane.showMessageDialog(null,"Volume of cubloid: "+volumeOfCuboid);
    }
}

//9. Write a program to find square of a number.
class Square{
    public static void main(String[] args) {
        float sq1, sqOfNum;
        sq1 = Float.parseFloat(JOptionPane.showInputDialog(null,"Number"));
        sqOfNum = sq1*sq1;
        JOptionPane.showMessageDialog(null,"Square of number "+sqOfNum);

    }
}

// 10 Take two different string input and print them in same line.
class Ten{
    public static void main(String[] args) {
        String z,y;
        z = JOptionPane.showInputDialog(null,"1st string:");
        y = JOptionPane.showInputDialog(null,"2nd string:");
        JOptionPane.showMessageDialog(null, z+y);
    }
}

 /*11 Take 3 inputs from user and check : all are equal
any of two are equal
( use && || with ternary operator )*/

class Eleven{
    public static void main(String[] args) {
        int x,y,z;
        String eq;
        x =Integer.parseInt(JOptionPane.showInputDialog(null,"1st num"));
        y =Integer.parseInt(JOptionPane.showInputDialog(null,"2nd num"));
        z =Integer.parseInt(JOptionPane.showInputDialog(null,"3rd num"));
        eq = (x==y && y==z) ? "All numbers are equal" : (x==y || y==z)? "Two numbers are equal" : "No numbers are equal";
        JOptionPane.showMessageDialog(null,eq);
    }
}

//12  Write a program to enter the values of two variables 'a' and 'b' from keyboard and then check if both the conditions 'a < 50' and 'a < b' are true.

class Sec{
    public static void main(String[] args) {
        int a, b;
        a = Integer.parseInt(JOptionPane.showInputDialog(null,"a"));
        b = Integer.parseInt(JOptionPane.showInputDialog(null,"b"));
        boolean c = (a<50 && a<b);
        JOptionPane.showMessageDialog(null,"The condition is "+c);
    }
}

// 13  If the marks of Robert in three subjects are entered through keyboard (each out of 100 ), write a program to
// calculate his total marks and percentage marks.

class Last{
    public static void main(String[] args) {
        float one,two, three, totalOf3Subs, percentage;
        one = Float.parseFloat(JOptionPane.showInputDialog(null,"Maths"));
        two = Float.parseFloat(JOptionPane.showInputDialog(null,"English"));
        three = Float.parseFloat(JOptionPane.showInputDialog(null,"Computer"));
        totalOf3Subs = one+two+three;
        percentage = totalOf3Subs*100 / 300;
        JOptionPane.showMessageDialog(null,"Total marks "+totalOf3Subs);
        JOptionPane.showMessageDialog(null,"Percentage "+percentage);
    }
}