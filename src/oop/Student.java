package oop;

public class Student {
	
	    private String studentName;
	    private int studentId;
	    private String course;
	    private int age;

	    public Student(String name, int id, String course, int age) {
	        this.studentName = name;
	        this.studentId = id;
	        this.course = course;
	        this.age = age;
	    }

	    public String getStudentName() {
	        return studentName;
	    }

	    public int getStudentId() {
	        return studentId;
	    }

	    public String getCourse() {
	        return course;
	    }

	    public int getAge() {
	        return age;
	    }

	    public void updateAge(int newAge) {
	        if (newAge >= 0) {
	            age = newAge;
	            System.out.println("Age updated successfully.");
	        } else {
	            System.out.println("Invalid age value.");
	        }
	    }
}

