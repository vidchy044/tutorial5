import java.io.*;
import java.util.*;

public class CovidVaccine {
    private int SID;
    private String firstName;
    private String lastName;
    private String[] Vaccines;

    public CovidVaccine(int SID, String firstName, String lastName, String[] Vaccines) {
        this.SID = SID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.Vaccines = Vaccines;
    }

    public int getSID() {
        return SID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String[] getPreviousVaccines() {
        return Vaccines;
    }

    @Override
    public String toString() {
        return "SID: " + SID + ", Name: " + firstName + " " + lastName;
    }
}
