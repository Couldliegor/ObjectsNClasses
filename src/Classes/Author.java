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

    @Override
    public String toString(){
        return "Name " + this.getName() + " " + this.getSurname();
    }
    public boolean equals(Object obj) {
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        return (this == obj);
    }
    public int hashCode() {
        return java.util.Objects.hash(this.getName(), this.getSurname());
    }
}
