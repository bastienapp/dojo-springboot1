package com.wildcodeschool.school.repositories;

import com.wildcodeschool.school.entities.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository {

    private static List<Student> students = new ArrayList<Student>() {{
        add(new Student(0L, "Eric", "Cartman", 11));
        add(new Student(1L, "Stan", "Marsh", 11));
        add(new Student(2L, "Kyle", "Broflovski", 11));
    }};

    public List<Student> findAll() {
        return students;
    }

    public Student findById(Long id) {
        for (Student s : students) {
            if (s.getId().equals(id)) {
                return s;
            }
        }
        return null;
    }

    public Student save(Student student) {
        for (Student s : students) {
            if (s.getId().equals(student.getId())) {
                s.setFirstName(student.getFirstName());
                s.setLastName(student.getLastName());
                s.setAge(student.getAge());
                return student;
            }
        }
        students.add(student);
        return student;
    }

    public void	deleteById(Long id) {
        Student delete = null;
        for (Student s : students) {
            if (s.getId().equals(id)) {
                delete = s;
                break;
            }
        }
        if (delete != null) {
            students.remove(delete);
        }
    }

    public long count() {
        return students.size();
    }
}
