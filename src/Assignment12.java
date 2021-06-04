import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Student{
    public Integer id;
    public String name;
    public Integer age;
    public String gender;
    public String engDepartment;
    public Integer yearOfEnrollment ;
    public Double  perTillDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEngDepartment() {
        return engDepartment;
    }

    public void setEngDepartment(String engDepartment) {
        this.engDepartment = engDepartment;
    }

    public Integer getYearOfEnrollment() {
        return yearOfEnrollment;
    }

    public void setYearOfEnrollment(Integer yearOfEnrollment) {
        this.yearOfEnrollment = yearOfEnrollment;
    }

    public Double getPerTillDate() {
        return perTillDate;
    }

    public void setPerTillDate(Double perTillDate) {
        this.perTillDate = perTillDate;
    }

    public Student(Integer id, String name, Integer age, String gender, String engDepartment, Integer yearOfEnrollment, Double perTillDate){
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.engDepartment = engDepartment;
        this.yearOfEnrollment = yearOfEnrollment;
        this.perTillDate = perTillDate;
    }
}



public class Assignment12 {

    public static void main(String[] args) {
        List<Student> student = new ArrayList<Student>();
        student.add(new  Student(111, "Jiya Brein", 17, "Female", "Computer Science", 2018, 70.8));
        student.add(new Student(122, "Paul Niksui", 18, "Male", "Mechanical", 2016, 50.2));
        student.add(new Student(133, "Martin Theron", 17, "Male", "Electronic", 2017, 90.3));
        student.add(new Student(144, "Murali Gowda", 18, "Male","Electrical", 2018, (double)80));
        student.add(new Student(155, "Nima Roy", 19, "Female", "Textile", 2016, (double)70));
        student.add(new Student(166, "Iqbal Hussain", 18, "Male", "Security", 2016, (double)70));
        student.add(new Student(177, "Manu Sharma", 16, "Male", "Chemical", 2018, (double)70));
        student.add(new Student(188, "Wang Liu", 20, "Male", "Computer Science", 2015, (double)80));
        student.add(new Student(199, "Amelia Zoe", 18, "Female", "Computer Science", 2016, (double)85));
        student.add(new Student(200, "Jaden Dough", 18, "Male", "Security", 2015, (double)82));
        student.add(new Student(211, "Jasna Kaur", 20, "Female", "Electronic", 2019, (double)83));
        student.add(new Student(222, "Nitin Joshi", 19, "Male", "Textile", 2016, (double)60.4));
        student.add(new Student(233, "Jyothi Reddy", 16, "Female", "Computer Science", 2015, (double)45.6));
        student.add(new Student(244, "Nicolus Den", 16, "Male", "Electronic", 2017, (double)95.8));
        student.add(new Student(255, "Ali Baig", 17, "Male", "Electronic", 2018, (double)88.4));
        student.add(new Student(266, "Sanvi Pandey", 17, "Female", "Electric", 2019, 72.4));
        student.add(new Student(277, "Anuj Chettiar", 18, "Male", "Computer Science", 2017, 57.5));
        // departments in college
        student.stream()
                .forEach(Student -> System.out.println(Student.engDepartment));
        //students who enrolled after 2018
        student.stream()
                .filter(Student -> Student.yearOfEnrollment >2018)
                .forEach(Student -> System.out.println(Student.name));
        //details of all male student in the computer sci department
        student.stream()
                .filter(Student -> (Student.gender=="Male" && Student.engDepartment=="Computer Science"))
                .forEach(Student -> System.out.println(Student.name));
        // male and female student count
        Map<String, Long> byGender = student.stream()
                .collect(Collectors.groupingBy(s -> s.getGender(), Collectors.counting()));
        System.out.println(byGender);
        //average age of male and female students?

        Map<String, Double> averageAgeByGender =
                student.stream()
                        .collect(
                                Collectors.groupingBy(
                                        Student::getGender,
                                        Collectors.averagingInt(Student::getAge)));
        System.out.println(averageAgeByGender);


        //details of student having highest percentage ?
        Student highestPercentage=student.stream()
                .collect(Collectors.<Student>maxBy(
                        Comparator.comparing(Student::getPerTillDate))).get();
        System.out.println(highestPercentage.getName());


        //Count  students in each department
        Map <String, Long> byDepartment = student.stream()
                .collect(Collectors.groupingBy(s -> s.getEngDepartment(), Collectors.counting()));
        System.out.println(byDepartment);

        //average percentage in each department
        Map<String, Double> averagePercentageByDepartment =
                student.stream()
                        .collect(
                                Collectors.groupingBy(
                                        Student::getEngDepartment,
                                        Collectors.averagingDouble(Student::getPerTillDate)));
        System.out.println(averagePercentageByDepartment);

        //details of youngest male student in the Electronic department
        Student result=student.stream()
                .filter(Student->Student.engDepartment=="Electronic")
                .collect(Collectors.<Student>minBy(
                        Comparator.comparing(Student::getAge))).get();
        System.out.println(result.getName());

        //male and female students are there in the computer science department
        Map <String, Long> byGenderDepartment = student.stream()
                .filter(Student->Student.engDepartment=="Computer Science")
                .collect(Collectors.groupingBy(s -> s.getGender(), Collectors.counting()));
        System.out.println(byGenderDepartment);
    }

}

