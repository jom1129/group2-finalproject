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

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
