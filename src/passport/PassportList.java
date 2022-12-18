package passport;

import java.util.HashSet;
import java.util.Set;

public class PassportList {
    private final Set<Passport> passports;

    public PassportList(Set<Passport> passports) {
        this.passports = passports;
    }

    public Set<Passport> getPassports() {
        return passports;
    }

    public void add(Passport passport) {
        Passport old = get(passport.getSerialNumber());
        if (old != null) {
            passports.remove(old);
        }
        passports.add(passport);
    }

    public Passport get(String number) {
        for (Passport passport : passports) {
            if (passport.getSerialNumber().equals(number)) {
                return passport;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return passports.toString();
    }
}
