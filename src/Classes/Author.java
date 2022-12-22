package Classes;
public class Author {
    private String name;
    private String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return this.name;
    }
    public String getSurname() {
        return this.surname;
    }

    public String toString(){
        return "Name " + getName() + " " + getSurname();
    }
    public boolean equals(Object obj) {
        return (this == obj);
    }
    public int hashCode() {
        return java.util.Objects.hash(this.getClass());
    }
}
