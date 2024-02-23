package oop;

public class StudentDriver {
	
	    public static void main(String[] args) {
	        Student student = new Student("Alice", 12345, "Computer Science", 20);

	        System.out.println("Student Name: " + student.getStudentName());
	        System.out.println("Student ID: " + student.getStudentId());
	        System.out.println("Course: " + student.getCourse());
	        System.out.println("Age: " + student.getAge());

	        student.updateAge(21);
	        System.out.println("New Age: " + student.getAge());

	        student.updateAge(-5); // Invalid age value
	    }

}
