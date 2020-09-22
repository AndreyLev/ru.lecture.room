package models;

public class Student extends Human {

    static int dynamicId = 1;

    private int id;

    public Student() {
        this.id = dynamicId;
        this.randomAccessMemory = "";
        dynamicId++;
    }

    public int getId() {
        return id;
    }

    public String getRandomAccessMemory() {
        return randomAccessMemory;
    }

    public void setRandomAccessMemory(String think) {
        randomAccessMemory = think;
    }

    public void enterTheRoom(Room room) {
        room.setStudent(this);
    }

    @Override
    public void listen(String sound) {
        System.out.println("Студент №" + id + " услышал: " + sound);
        setRandomAccessMemory(sound);
    }

    @Override
    public void write(String words) {
        System.out.println("Студент №" + id + " записал: " + words);
    }
}
