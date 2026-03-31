public class Student{

    private String name;
    private String rollNumber;
    private String department;
    private int year;
    private char grade;

    Student(String name, String rollNumber, String dept, int year,char grade){
        this.name=name;
        this.rollNumber=rollNumber;
        this.department=dept;
        this.year=year;
        this.grade=grade;
    }

    public void printCard(){
        System.out.println("=================================");
        System.out.println("         STUDENT ID CARD         ");
        System.out.println("=================================");
        System.out.println("Name        : "+name);
        System.out.println("Roll No     : "+rollNumber);
        System.out.println("Department  : "+department);
        System.out.println("Year        : "+year);
        System.out.println("Grade       : "+grade);
        System.out.println("Pass/Fail   : "+(isPass() ? "Pass":"fail"));

        System.out.println("=================================");
    }
    public boolean isPass(){
        return grade == 'A'||grade == 'B'||grade=='C';

    }
}