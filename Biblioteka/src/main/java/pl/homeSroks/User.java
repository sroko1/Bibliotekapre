package pl.homeSroks;

import java.util.Objects;

public class User {

    private String name;
    private String surname;
    private final long  personalIdentifyNumber;

    public User(String aName, String aSurname,long aPersonalIdentifyNumber){
        name = aName;
        surname = aSurname;
        personalIdentifyNumber = aPersonalIdentifyNumber;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return personalIdentifyNumber == user.personalIdentifyNumber &&
                Objects.equals(name, user.name) &&
                Objects.equals(surname, user.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, personalIdentifyNumber);
    }
}
