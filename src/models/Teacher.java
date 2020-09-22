package models;

public class Teacher extends Human{


    private String name;

    public Teacher(String name) {
        this.name = name;
        this.randomAccessMemory = "";
    }

    @Override
    public void enterTheRoom(Room room) {
        room.setTeacher(this);
    }

    public String getTeacherName() {
        return name;
    }

    public void setRandomAccessMemory(String think) {
        randomAccessMemory = think;
    }

    @Override
    public void talk(String phrase, Room room) {
        room.setSound(phrase);
    }
}
