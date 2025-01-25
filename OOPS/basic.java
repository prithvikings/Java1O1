//class and object
//class is a blueprint for object and object is an instance of class 
//class is a template and object is a real world entity 
//class is a user defined data type and object is a variable of that data type
//class is a logical entity and object is a physical entity
//class is a collection of objects and object is a single entity
//class is a collection of objects and objects are real world entities

//In java parent reference can be used to refer child object but child reference cannot be used to refer parent object

public class basic{
    public static void main(String[] args) {

        Pen p1=new Pen(); //object of class Pen
        p1.setColor("Red");
        p1.setTip(5);
        System.out.println(p1.color);
        System.out.println(p1.tip);


        Student s1=new Student("Rahul"); //object of class Student
        s1.calcgpa(90, 80, 70);
        System.out.println(s1.name);
        System.out.println(s1.cgpa);

        Student s2=new Student();
        s2.name="Crazy";
        s2.roll=123;
        s2.age=19;

        Student s3=new Student(12);
        System.out.println(s3.roll);

        Student s4=new Student(s2);
        System.out.println(s4.name);
        s4.age=90;
        System.out.println(s4.age);
    }
}

class Pen{
    String color;
    int tip;

    void setColor(String color){
        this.color=color;
    }

    void setTip(int tip){
        this.tip=tip;
    }
}

class Student {
    String name;
    int age;
    float cgpa;
    int roll;


    void calcgpa(int phy, int chem, int math){
        cgpa = (phy+chem+math)/3;
    }

    //Parameter constructor
    Student(String name){
        this.name=name;
        System.out.println("Parameterised Constructor called");
    }

    //Non Parameter constructor
    Student(){
        System.out.println("Non parameterised Constructor called");
    }

    
    Student (int roll){
        this.roll=roll;;
    }

    //copy constructor
    Student(Student s2){
        this.age=s2.age;
        this.name=s2.name;
        this.roll=s2.roll;
    }
}