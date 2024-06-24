package less4;
import less4.controller.StudentController;
import less4.model.Student;
import less4.controller.TeacherController;

import java.util.List;

public class Lesson4 {

    public static void main(String[] args) {

        // new StudentController()
        //         .sendOnConsole(List.of(new Student(1, "Sasha", "Ivanov"),
        //                 new Student(1, "Ira", "Ivanova")));

       
           
            TeacherController teacherController = new TeacherController();
    
           
            teacherController.createTeacher(1, "John", "Doe");
            teacherController.createTeacher(2, "Jane ", "Science");
    
          
            System.out.println("Все учителя:");
            teacherController.showAllTeachers();
    
          
            teacherController.updateTeacher(1, "John", "Science");
    
                      
    }
    }

//    private static List<Student> getStudents() {
//        Student s1 = new Student(1, "Sasha", "Ivanov");
//        Student s2 = new Student(1, "Ira", "Ivanova");
//        return List.of(s1, s2);
//    }

