package in.ashokit.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entities.Course;
import in.ashokit.entities.Student;
import in.ashokit.repo.CourseRepo;
import in.ashokit.repo.StudentRepo;

@Service
public class StudentService {

    @Autowired
    private CourseRepo courseRepository;

    @Autowired
    private StudentRepo studentRepository;

    public void saveStudentWithCourse() {
        // Create a student
        Student student = new Student();
        student.setName("Eshwar");

        // Create a course
        Course course = new Course();
        course.setCName("Devops");

        // Add the student to the course
        Set<Student> students = new HashSet<>();
        students.add(student);
        course.setStudents(students);

        // Add the course to the student
        Set<Course> courses = new HashSet<>();
        courses.add(course);
        
        
        student.setCourses(courses);

        // Save the student and course
        studentRepository.save(student);
        courseRepository.save(course);
    }
}
