import java.util.Objects;

public class MyTestingClass {
    private final int id;
    private final String name;

    public MyTestingClass(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Custom hashCode method that uses both id and name fields
    @Override
    public int hashCode() {
        int sum = 17; // start with a prime number
        sum = 31 * sum + id;
        sum = 31 * sum + (name != null ? name.hashCode() : 0);
        return sum;
    }

    // equals method for testing purposes
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        MyTestingClass other = (MyTestingClass) obj;
        return id == other.id && (Objects.equals(name, other.name));
    }
}

