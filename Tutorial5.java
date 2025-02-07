import java.io.*;
import java.util.*;

public class Tutorial5{
    public static void main(String[] args) {
        LinkedList vaccineList = new LinkedList();
        CovidVaccine name1 = new CovidVaccine(672115001, "Joly", "West", new String[]{"Pfizer","Moderna"});
        vaccineList.insert(name1);
        CovidVaccine name2 = new CovidVaccine(672115002, "Mary", "Ann", new String[]{"AstraZeneca","Sinopharm"});
        vaccineList.insert(name2);
        CovidVaccine name3 = new CovidVaccine(672115003, "Diana", "Rosaly", new String[]{"Moderna"});
        vaccineList.insert(name3);
        CovidVaccine name4 = new CovidVaccine(672115004, "Jim", "Thomson", new String[]{"Sinopharm","Pfizer"});
        vaccineList.insert(name4);
        CovidVaccine name5 = new CovidVaccine(672115005, "John", "Doe", new String[]{"AstraZeneca"});
        vaccineList.insert(name5);
        CovidVaccine name6 = new CovidVaccine(672115006, "Jessie", "Winston", new String[]{"Sinopharm"});
        vaccineList.insert(name6);
        CovidVaccine name7 = new CovidVaccine(672115007, "Anna", "Brown", new String[]{"Pfizer"});
        vaccineList.insert(name7);
        CovidVaccine name8 = new CovidVaccine(672115008, "Chris", "Jame", new String[]{"AstraZeneca","Pfizer"});
        vaccineList.insert(name8);
        CovidVaccine name9 = new CovidVaccine(672115009, "Minnie", "Mouse", new String[]{"Moderna","AstraZeneca"});
        vaccineList.insert(name9);
        CovidVaccine name10 = new CovidVaccine(672115010, "Micky", "Mouse", new String[]{"Pfizer","Moderna"});
        vaccineList.insert(name10);

        Random rand = new Random();
        int random1 = 672115001+rand.nextInt(10)+1;
        int random2 = 672115001+rand.nextInt(10)+1;
        System.out.println("Deleting SID: " + random1 + " and " + random2);
        vaccineList.delete(random1);
        vaccineList.delete(random2);

        System.out.println("Traversing: ");
        vaccineList.traversal();

        System.out.println("Deleting all: ");
        vaccineList.deleteAll();
        vaccineList.traversal();
    }
    
}
