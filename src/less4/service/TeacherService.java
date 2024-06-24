package less4.service;

import java.util.ArrayList;
import java.util.List;

import less4.model.Teacher;


public class TeacherService {
    
    private List<Teacher> teachers = new ArrayList<>();


    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

   
    public void updateTeacher(int id, Teacher updatedTeacher) {
        for (int i = 0; i < teachers.size(); i++) {
            if (teachers.get(i).getId() == id) {
                teachers.set(i, updatedTeacher);
                return;
            }
        }
    }

   
    public List<Teacher> getAllTeachers() {
        return teachers;
    }


    public Teacher getTeacherById(int id) {
        for (Teacher teacher : teachers) {
            if (teacher.getId() == id) {
                return teacher;
            }
        }
        return null;
    }
}