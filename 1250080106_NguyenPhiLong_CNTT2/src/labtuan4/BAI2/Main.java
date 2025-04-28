package labtuan4.BAI2;
public class Main {
    public static void main(String[] args) {
        Person person = new Person("Nguyen Van Phep", "123 Le Van Sy");
        System.out.println(person.toString());

        Student student = new Student("Nguyen Thi No", "456 Cong Hoa", "Computer Science", 2, 5000.0);
        System.out.println(student.toString());

        Staff staff = new Staff("Anh Huynh", "789 Cao Thang", "Tech University", 60000.0);
        System.out.println(staff.toString());

        person.setAddress("321 Tran Hung Dao");
        System.out.println(person.toString());

        student.setProgram("Information Technology");
        student.setYear(3);
        student.setFee(5500.0);
        System.out.println(student.toString());

        staff.setSchool("National University");
        staff.setPay(65000.0);
        System.out.println(staff.toString());
    }
}

