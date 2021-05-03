package prog2.finalgroup;

/**
 *
 */
public class Citizen implements Comparable{
    private String fullName; // a combination of the first name
                             // and last name (separated by a space)
    private String email;
    private String address; // should not contain double quotes
    private int age;
    private boolean resident; // should hold true if the citizen is a
                              // resident and false if otherwise
    private int district;
    private char gender; // should store M for males and F for females

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    public boolean isResident() {
        return resident;
    }

    public int getDistrict() {
        return getDistrict();
    }

    public char getGender() {
        return gender;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setResident(boolean resident) {
        this.resident = resident;
    }

    public void setDistrict(int district) {
        this.district = district;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
