package models;
import java.lang.ref.WeakReference;
import java.util.*;
public class StudentDabase {
    private final List<WeakReference<Student>> students = new ArrayList<>();

    public void addStudent(Student student){
        students.add(new WeakReference<>(student));
    }

    public void removeStudent(String name){
        students.removeIf(ref -> {
            Student student = ref.get();
            return student != null && student.getName().equals(name);
        });
    }

    public List<Student> getStudents(){
        List<Student> studentList = new ArrayList<>();
        Iterator<WeakReference<Student>> iterator = students.iterator();
        while (iterator.hasNext()){
            Student student = iterator.next().get();
            if (student == null){
                iterator.remove();
            }else {
                studentList.add(student);
            }
        }
        return studentList;
    }
}
