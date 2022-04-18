// 1. Write a program to take student details as input and display the results.
import java.util.Scanner;

public class Assignment {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter name");
        System.out.println("Enter Age");
        System.out.println("Enter Address");
        System.out.println("Enter Batch");
        String name = scanner.nextLine();
        String age = scanner.nextLine();
        String address = scanner.nextLine();
        String batch = scanner.nextLine();

        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Address: "+address);
        System.out.println("Batch: "+batch);

    }
}

//2. Write a program to calculate sum of four numbers taking user input.

class Second{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any 4 number: ");
        int num1, num2, num3, num4, sum;
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();
        num4 = scanner.nextInt();
        sum = num1+num2+num3+num4;
        System.out.println("Sum of 4 number= " +sum);

    }
}

// 3.Write a program to take input of the total marks of four subjects of a student and calculate
//the total percentage secured. Then display the percentage and final result of the student;
//a. If equal to or more than 70 -> First Class
//b. If more than 59 -> Upper second Class
//c. If more than 49 -> Second class
//d. If more than 39 -> Third class and if below than 40 the result is fail.

class Third{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter marks for all 4 subjects");
        float maths, science, english, computer, total_marks,percentage;
        maths = scanner.nextFloat();
        science = scanner.nextFloat();
        english = scanner.nextFloat();
        computer = scanner.nextFloat();
        total_marks = (maths+science+english+computer);
        percentage = (total_marks*100)/400;
        String remarks;
        System.out.println("Total Marks: "+total_marks);
        System.out.println("Percentage: "+percentage);
        remarks = (percentage>=70) ? "First Class" :  (percentage>=59 && percentage<70) ? "Second Upper Class" : (percentage>=49 && percentage<59) ? "Second Class" : (percentage>=39 && percentage<49) ? "Third Class" : "Fail";
        System.out.println(remarks);
    }
}

//4. Write a program to take two integer inputs from user and print sum and product of them.

class Fourth{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any two integer");
        int a ,b, sum, product;
        a = scanner.nextInt();
        b = scanner.nextInt();
        sum = a+b ;
        product = a*b;
        System.out.println("Sum = "+ sum + " Product = "+product);
    }
}

//5. Take two integer inputs from user. First calculate the sum of two then product of two. Finally, print the sum and product of both obtained results.

class Fifth{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any two integer");
        int a ,b, sum, product, result_Sum, result_product;
        a = scanner.nextInt();
        b = scanner.nextInt();
        sum = a+b ;
        product = a*b;
        result_product = sum*product;
        result_Sum = sum+product;
        System.out.println("Sum = "+ sum + " Product = "+product);
        System.out.println("Sum of obtained result "+result_Sum);
        System.out.println(("Product of Obtained result "+result_product));


    }
}

// 6. Ask user to give two double input for length and breadth of a rectangle and print area type casted to int.
class Sixth{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length and breadth: ");
        double length, breadth, area;
        length = scanner.nextDouble();
        breadth = scanner.nextDouble();
        area = length*breadth;
        int IntArea = (int)area;
        System.out.println("Area in Int= " + IntArea);

    }
}

//7. Take name, roll number and field of interest from user and print in the format below :Hey,my name is xyz and my roll number is xyz. My field of interest are xyz.
class Seventh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Name,  interest and roll no. : ");
        String name= scanner.nextLine();
        String interest= scanner.nextLine();
        int roll_no = scanner.nextInt();
        System.out.println("Hey, my name is "+name+ " and my roll number is "+ roll_no+ ". My field of interest are "+interest);

    }
}

//8. Take side of a square from user and print area and perimeter of it. Also, calculate SI, Area of triangle and Volume of Cube and Cuboid. Take the attributes as user input.
class Eighth{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side of square: ");
        float a = scanner.nextFloat();
        float area = a*a;
        float perimeter = 4*a;
        System.out.println("Area of Square: "+area+ "  Perimeter of Square: "+perimeter);

        System.out.println("Enter Principle, rate, years");
        float principle = scanner.nextFloat();
        float rate = scanner.nextFloat();
        float years = scanner.nextFloat();
        float simple_interest;
        simple_interest = (principle*rate*years)/100;
        System.out.println("SI ="+simple_interest);

        System.out.println("Enter base and height ");
        float base = scanner.nextFloat();
        float height = scanner.nextFloat();
        float area_tri = (base*height)/2;
        System.out.println("Area of triangle: "+area_tri);

        System.out.println("Enter edge of cube ");
        float b = scanner.nextFloat();
        float vol = (b*b*b);
        System.out.println("Volume of cube: "+vol);

        System.out.println("Enter length, breadth and height");
        float length = scanner.nextFloat();
        float breadth = scanner.nextFloat();
        float hei = scanner.nextFloat();
        float volume = (length*breadth*hei);
        System.out.println("Volume of cuboid= "+volume);

    }
}

//9. write a program to find square of a number.  E.g.- INPUT : 2 OUTPUT : 4 INPUT : 5 OUTPUT : 25

class Ninth{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        float a = scanner.nextFloat();
        float square = a*a;
        System.out.println("Square of number = "+square);
    }
}

//10. Take two different string input and print them in same line. E.g.- INPUT : Codes Dope  OUTPUT : CodesDope

class Tenth{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the 1st string: ");
        System.out.println("Enter the 2nd string: ");
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        System.out.println(a+b);

    }
}

//11. Take 3 inputs from user and check : all are equal any of two are equal ( use && || with ternary operator )

class Eleventh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the 1st num: ");
        System.out.println("Enter the 2nd num: ");
        System.out.println("Enter the 3rd num: ");
        int s1 = scanner.nextInt();
        int s2 = scanner.nextInt();
        int s3 = scanner.nextInt();
        String equal;
        equal = (s1==s2 && s2==s3) ? "All numbers are equal" : (s1==s2 || s2==s3) ? "Two numbers are equal": "None is equal";
        System.out.println(equal);
    }
}

//12. Write a program to enter the values of two variables 'a' and 'b' from keyboard and then check if both the conditions
// 'a < 50' and 'a < b' are true.
class Twelfth{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the a and b: ");
        int a,b;
        a= scanner.nextInt();
        b= scanner.nextInt();
        System.out.println(a<50 && a<b);
    }
}

//13. If the marks of Robert in three subjects are entered through keyboard (each out of 100 ), write a program to
// calculate his total marks and percentage marks.
class Thirteenth{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Robert's marks in all 3 subjects: ");
        float maths, science, computer, total_marks, percentage;
        maths=scanner.nextFloat();
        science=scanner.nextFloat();
        computer=scanner.nextFloat();
        total_marks = maths+science+computer;
        percentage = total_marks*100/300;
        System.out.println("Total marks= "+total_marks);
        System.out.println("Percentage = "+percentage);

    }
}
