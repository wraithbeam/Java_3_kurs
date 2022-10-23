package lab1.dbmodel;

import java.util.Objects;

public abstract class Form {
    private int Id;
    private String nameFull;
    private String nameShort;

    public Form(int id, String nameFull, String nameShort) {
        Id = id;
        this.nameFull = nameFull;
        this.nameShort = nameShort;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNameFull() {
        return nameFull;
    }

    public void setNameFull(String nameFull) {
        this.nameFull = nameFull;
    }

    public String getNameShort() {
        return nameShort;
    }

    public void setNameShort(String nameShort) {
        this.nameShort = nameShort;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Form form = (Form) o;
        return Id == form.Id && Objects.equals(nameFull, form.nameFull) && Objects.equals(nameShort, form.nameShort);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, nameFull, nameShort);
    }

    @Override
    public String toString() {
        return "Form{" +
                "Id=" + Id +
                ", nameFull='" + nameFull + '\'' +
                ", nameShort='" + nameShort + '\'' +
                '}';
    }
}
