package lab1.dbmodel;

import java.util.Objects;

public class Person {
    private int Id;
    private String shifer;
    private String inn;
    private String type;
    private String data;

    public Person(int id, String shifer, String inn, String type, String data) {
        Id = id;
        this.shifer = shifer;
        this.inn = inn;
        this.type = type;
        this.data = data;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getShifer() {
        return shifer;
    }

    public void setShifer(String shifer) {
        this.shifer = shifer;
    }

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Id == person.Id && Objects.equals(shifer, person.shifer) && Objects.equals(inn, person.inn) && Objects.equals(type, person.type) && Objects.equals(data, person.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, shifer, inn, type, data);
    }

    @Override
    public String toString() {
        return "Person{" +
                "Id=" + Id +
                ", shifer='" + shifer + '\'' +
                ", inn='" + inn + '\'' +
                ", type='" + type + '\'' +
                ", data='" + data + '\'' +
                '}';
    }
}
