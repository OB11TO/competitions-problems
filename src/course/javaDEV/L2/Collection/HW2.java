package course.javaDEV.L2.Collection;


import java.util.*;

/**
 * Создать класс Student, представляющий собой ученика.
 * Добавить ему данные об имени, фамилии, возрасте и среднем балле за год.
 * Создать список (List) учеников.
 *
 * Найти и вывести ученика с самым высоким средним баллом используя итератор.
 *
 * Отсортировать и вывести список учеников по полному имени (имя + фамилия),
 * возрасту и среднему баллу, используя компараторы.
 */

public class HW2 {

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Ivan", "Ivanov", 33, 5),
                new Student("Ivan", "Ivanov", 20, 9),
                new Student("Sveta", "Svetikova", 18, 7),
                new Student("Petr", "Aetrov", 25, 8),
                new Student("Petr", "Petrov", 25, 0),
                new Student("Mike", "Glotov", 31, 6));

       // Collections.sort(students);\

        students.sort(Comparator.comparing(Student::getFullName)
                        .thenComparing(Student::getAge)
                                .thenComparing(Student::getAverageScore));

        for(Student s : students){
            System.out.println(s);
        }

        System.out.println(StudentHelper.getTheBestStudent(students));


    }



}

class Student implements Comparable<Student>{
    private final String firstName;
    private final String lastName;
    private final int age;
    private final int averageScore;

    public Student(String firstName, String lastName, int age, int averageScore) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.averageScore = averageScore;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (age != student.age) return false;
        if (averageScore != student.averageScore) return false;
        if (!Objects.equals(firstName, student.firstName)) return false;
        return Objects.equals(lastName, student.lastName);
    }

    @Override
    public int hashCode() {
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + age;
        result = 31 * result + averageScore;
        return result;
    }

    @Override
    public int compareTo(Student o) {
        return CharSequence.compare(this.getFirstName(),o.getFirstName());
    }

    public String getFullName(){
        return getFirstName() + " " + getLastName();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public int getAverageScore() {
        return averageScore;
    }

    @Override
    public String toString() {
        return "Student{" + "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", averageScore=" + averageScore +
                '}';
    }

}

final class  StudentHelper{
    private StudentHelper() {
    }

    public static Student getTheBestStudent(List<Student> students){
        Student theBestStudent = null;
        for(Student student : students){
            if(theBestStudent == null || theBestStudent.getAverageScore() < student.getAverageScore()){
                theBestStudent = student;
            }
        }

        return theBestStudent;
    }
}

