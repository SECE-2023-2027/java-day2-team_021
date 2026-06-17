import java.util.*;

public class Qn11 {
    
    static class Student {
        String name;
        String id;
        int score;
        
        Student(String name, String id, int score) {
            this.name = name;
            this.id = id;
            this.score = score;
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Input number of students: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine(); // Consume the newline
        
        List<Student> students = new ArrayList<>();
        
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Input Student Name, ID, Score: ");
            String[] parts = scanner.nextLine().split(" ");
            String name = parts[0];
            String id = parts[1];
            int score = Integer.parseInt(parts[2]);
            
            students.add(new Student(name, id, score));
        }
        
        // Find student with highest score
        Student maxStudent = students.get(0);
        for (Student student : students) {
            if (student.score > maxStudent.score) {
                maxStudent = student;
            }
        }
        
        // Find student with lowest score
        Student minStudent = students.get(0);
        for (Student student : students) {
            if (student.score < minStudent.score) {
                minStudent = student;
            }
        }
        
        System.out.println("\nname, ID of the highest score and the lowest score:");
        System.out.println(maxStudent.name + " " + maxStudent.id);
        System.out.println(minStudent.name + " " + minStudent.id);
        
        scanner.close();
    }
}
