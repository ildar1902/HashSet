package passport;

import java.time.LocalDate;
import java.util.Objects;

public class Passport {

    private String serialNumber;
    private String surname;
    private String name;
    private String patronymic;
    private LocalDate birthDate;

    public Passport(String serialNumber, String surname, String name, String patronymic, LocalDate birthDate) {
        this.serialNumber = serialNumber;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.birthDate = birthDate;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return getSerialNumber() + " " + getSurname() + " " + getName() + " " + getPatronymic() + " " + getBirthDate();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return Objects.equals(serialNumber, passport.serialNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serialNumber);
    }
}
