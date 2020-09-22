import models.Room;
import models.Student;
import models.Teacher;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Room room = new Room(112);

        Teacher teacher = new Teacher("Учитель");
        teacher.enterTheRoom(room);

        ArrayList<Student> students = new ArrayList<>();
        while (students.size() != 15) students.add(new Student());
        students.forEach(student -> student.enterTheRoom(room));

        teacher.talk("Сегодня тема: синглтон", room);
        room.distributeSound(room.getStudents());

        room.getStudents().forEach(student -> student.write(student.getRandomAccessMemory()));

    }
}
