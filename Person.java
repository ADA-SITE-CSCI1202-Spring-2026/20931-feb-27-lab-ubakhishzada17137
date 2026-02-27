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
