package less4.controller;

import java.util.List;

import less4.model.Teacher;
import less4.service.TeacherService;
import less4.view.TeacherView;

public class TeacherController {
    private TeacherService teacherService = new TeacherService();
    private TeacherView teacherView = new TeacherView();

    public void createTeacher(int id, String name, String lastName) {
        Teacher teacher = new Teacher(id, name,lastName);
        teacherService.addTeacher(teacher);
    }

    public void updateTeacher(int id, String name, String subject) {
        Teacher updatedTeacher = new Teacher(id, name, subject);
        teacherService.updateTeacher(id, updatedTeacher);
    }

    public void showAllTeachers() {
        List<Teacher> teachers = teacherService.getAllTeachers();
        teacherView.sendOnConsole(teachers);
    }

   
}

