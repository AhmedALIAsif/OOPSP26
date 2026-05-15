package cui.login.demo1;

import java.io.Serializable;

public class Student implements Serializable, Comparable<Student> {
    private static final long serialVersionUID = 1L;
    String name;
    String email;
    String address;
    double gpa;
    public Student(String name, String email, String address, double gpa) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.gpa = gpa;
    }
    public Student(String name, String email, String address) {
        this.name = name;
        this.email = email;
        this.address = address;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", gpa=" + gpa +
                '}';
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public boolean equals(Object other){
        Student otherStudent=(Student) other;
        return this.getName().equalsIgnoreCase(otherStudent.name);
    }

    @Override
    public int compareTo(Student o) {
        int flag=0;
        if(this.gpa<o.gpa)
            flag=-1;
        if(this.gpa>o.gpa)
            flag=1;
        if(this.gpa==o.gpa)
            flag=0;
        return flag;
    }
}
