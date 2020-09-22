package models;

import java.util.ArrayList;

public class Room {

    private int number;
    private String sound;
    ArrayList<Student> studentsList;
    Teacher teacher;

    public Room(int number) {
        this.number = number;
        sound = "...";
        studentsList = new ArrayList<>();
    }

    public int getNumber() {
        return number;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public void distributeSound(ArrayList<Student> students) {
        students.forEach(student -> student.listen(sound));
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void setStudent(Student student) {
        studentsList.add(student);
    }

    public ArrayList<Student> getStudents() {
        return studentsList;
    }

    public String whatTeacherInRoomNow() {
        return teacher.getTeacherName();
    }
}
