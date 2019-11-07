import java.util.HashMap;

public class Skills {
    HashMap<String,String> skills;

    public Skills() {
        skills = new HashMap<>();
    }

    public HashMap<String, String> getSkills() {
        return skills;
    }

    public void setSkills(HashMap<String, String> skills) {
        this.skills = skills;
    }

    public void displaySkills() {
        System.out.println("\nSkills");
        skills.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + ", " + entry.getValue());
        });

    }
}