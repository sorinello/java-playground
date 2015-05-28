package model;

public class Author implements Comparable<Author> {
    String lastName;

    String firstName;

    public Author(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public int compareTo(Author o) {
        if (!this.lastName.equals(o.getLastName()))
            return this.lastName.compareTo(o.getLastName());
        else {
            return this.firstName.compareTo(o.getFirstName());
        }
    }

    @Override
    public String toString() {
        return "Author [lastName=" + lastName + ", firstName=" + firstName + "]";
    }

}
