package lab1.dbmodel;

import java.util.Objects;

public class Company {
    private int id;
    private int personID;
    private int orgRegistrationID;
    private int orgLegFormID;
    private String nameFull;
    private String nameShort;
    private String numberReg;
    private String dataReg;

    public Company(int id, int personID, int orgRegistrationID, int orgLegFormID, String nameFull, String nameShort, String numberReg, String dataReg) {
        this.id = id;
        this.personID = personID;
        this.orgRegistrationID = orgRegistrationID;
        this.orgLegFormID = orgLegFormID;
        this.nameFull = nameFull;
        this.nameShort = nameShort;
        this.numberReg = numberReg;
        this.dataReg = dataReg;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPersonID() {
        return personID;
    }

    public void setPersonID(int personID) {
        this.personID = personID;
    }

    public int getOrgRegistrationID() {
        return orgRegistrationID;
    }

    public void setOrgRegistrationID(int orgRegistrationID) {
        this.orgRegistrationID = orgRegistrationID;
    }

    public int getOrgLegFormID() {
        return orgLegFormID;
    }

    public void setOrgLegFormID(int orgLegFormID) {
        this.orgLegFormID = orgLegFormID;
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

    public String getNumberReg() {
        return numberReg;
    }

    public void setNumberReg(String numberReg) {
        this.numberReg = numberReg;
    }

    public String getDataReg() {
        return dataReg;
    }

    public void setDataReg(String dataReg) {
        this.dataReg = dataReg;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return id == company.id && personID == company.personID && orgRegistrationID == company.orgRegistrationID && orgLegFormID == company.orgLegFormID && nameFull == company.nameFull && nameShort == company.nameShort && numberReg == company.numberReg && dataReg == company.dataReg;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, personID, orgRegistrationID, orgLegFormID, nameFull, nameShort, numberReg, dataReg);
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", personID=" + personID +
                ", orgRegistrationID=" + orgRegistrationID +
                ", orgLegFormID=" + orgLegFormID +
                ", nameFull='" + nameFull + '\'' +
                ", nameShort='" + nameShort + '\'' +
                ", numberReg='" + numberReg + '\'' +
                ", dataReg='" + dataReg + '\'' +
                '}';
    }
}
