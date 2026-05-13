package week12;

public class StudentLL {
    String nim;
    String name;
    String className;
    String studyProgram;

    public StudentLL(String nim, String name, String className, String studyProgram) {
        this.nim = nim;
        this.name = name;
        this.className = className;
        this.studyProgram = studyProgram;
    }

    void print() {
        System.out.println(nim + " - " + name + " - " + className + " - " + studyProgram);
    }
}