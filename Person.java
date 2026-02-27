public class Person {
    String firstName;
    String lastName;
    String gender;

    public Person(String firstName, String lastName, String gender){
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    //Getters
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getGender(){
        return gender;
    }
    

    //Setters

    public void setFirstName(String newFirstName){
        this.firstName = newFirstName;
    }
    public void setLastName(String newLastName){
        this.lastName = newLastName;
    }
    public void setGender(String newGender){
        this.gender = newGender;
    }

    //toString()

    @Override
    public String toString(){
        return this.firstName + " " + this.lastName + ": " + gender;
    }

    public boolean equals(Person p) {
        return this.firstName.equals(p.firstName) && 
               this.lastName.equals(p.lastName) && 
               this.gender.equals(p.gender);
    }
}
class Teacher extends Person {
    private String department;
    private String[] courses;

    public Teacher(String firstName, String lastName, String gender, String department, String[] courses) {
        super(firstName, lastName, gender);
        this.department = department;
        this.courses = courses;
    }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    public String[] getCourses() { return courses; }
    public void setCourses(String[] courses) { this.courses = courses; }

    @Override
    public String toString() {
        return super.toString() + " | Dept: " + department + " | Courses: " + java.util.Arrays.toString(courses);
    }

    public boolean equals(Teacher t) {
        if (t == null) return false;
        if (!super.equals(t)) return false;
        
        return this.department.equals(t.getDepartment()) && 
               java.util.Arrays.equals(this.courses, t.getCourses());
    }
}
