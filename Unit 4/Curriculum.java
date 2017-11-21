//Created by Brian Yu on 10/22/2017
public class Curriculum {
    public static void main(String[] args){
        System.out.println("My curriculum consists of these courses:");
        Course calculus = new Course("Calculus", 100,"the mathematical study of continuous change", "Math", "Mathematics");
        calculus.printCourse();
        Course creativeWriting = new Course("Creative Writing", 101, "the art of writing creatively", "English", "Literature");
        creativeWriting.printCourse();
        Course computerScience = new Course("Computer Science", 102, "the science of programming in Java", "Computer Science", "Engineering");
        computerScience.printCourse();
    }
}

class Category {
    public String category;

    public Category(){
    }

    public Category(String category){
        this.category = category;
    }
}

class Course extends Category {
    public String title;
    public int courseNumber;
    public String description;
    public String department;

    public Course(String title, int courseNumber, String description, String department, String category){
        this.title = title;
        this.courseNumber = courseNumber;
        this.description = description;
        this.department = department;
        this.category = category;
    }

    public void printCourse() {
        System.out.println(department + " " + courseNumber + " " + title + " which covers " + description + "fulfills the requirement for " + category);
    }
}
