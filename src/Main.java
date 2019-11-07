import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();

        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to Resume Builder");
        System.out.println("Please enter the information below");
        System.out.println("Name:");
        person.setName(in.nextLine());
        System.out.println("Email");
        person.setEmail(in.nextLine());

        //EDUCATION
        Education ed = new Education();
        System.out.println("Degree: ");
        String d = in.nextLine();
        System.out.println("Major");
        String m = in.nextLine();
        System.out.println("University Name: ");
        String u = in.nextLine();
        System.out.println("Graduate year");
        String g = in.nextLine();

        ed.setDegree(d);
        ed.setGradYear(g);
        ed.setMajor(m);
        ed.setUniversityName(u);

        ArrayList<Person> persons = new ArrayList<>();
        persons.add(person);


        //WORK EXPERIENCE CODES
        Work wk = new Work();
        ArrayList<Work> works = new ArrayList<>();
        System.out.println("Enter your work history");
        System.out.println("Company ");
        String com = in.nextLine();
        System.out.println("Title");
        String t = in.nextLine();
        System.out.println("Start date: ");
        String st = in.nextLine();
        System.out.println("End date");
        String endD = in.nextLine();
        System.out.println("Job description");
        String jd = in.nextLine();

        wk.setCompanyName(com);
        wk.setTitle(t);
        wk.setStartDate(st);
        wk.setEndDate(endD);
        wk.setJobDesc(jd);
        works.add(wk);


        //SKILLS
        //ArrayList<Skills> skills = new ArrayList<>();
        HashMap<String, String> hashmap = new HashMap<>();
        System.out.println("Enter your skill #1");
        String sk = in.next();
        System.out.println("Enter your rating");
        String rt = in.next();
        hashmap.put(sk, rt);

        System.out.println("Enter your skill #2");
        String sk2 = in.next();
        System.out.println("Enter your rating");
        String rt2 = in.next();
        hashmap.put(sk2, rt2);

        System.out.println("Enter your skill #3");
        String sk3 = in.next();
        System.out.println("Enter your rating");
        String rt3 = in.next();
        hashmap.put(sk3, rt3);

        System.out.println("====================");
        for (Person p : persons) {
            p.displayPerson();
        }
        System.out.println("\nEducation");
        ArrayList<Education> educations = new ArrayList<>();
        educations.add(ed);
        for (Education e : educations) {
            e.displayEdu();
        }
        System.out.println("\nExperience ");
        for (Work w : works) {
            w.displayWork();
        }
        System.out.println("\nSkills");
        hashmap.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + ", " + entry.getValue());
        });

    }
}
