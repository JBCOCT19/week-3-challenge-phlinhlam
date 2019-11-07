import java.util.ArrayList;

public class Education  {
    private String degree;
    private String major;
    private String universityName;
    private String gradYear;

    public Education() {  }

    public Education(String degree, String major, String universityName, String gradYear) {
        this.degree = degree;
        this.major = major;
        this.universityName = universityName;
        this.gradYear = gradYear;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getGradYear() {
        return gradYear;
    }

    public void setGradYear(String gradYear) {
        this.gradYear = gradYear;
    }

    public void displayEdu(){

        System.out.println(degree + " in " + major +"," +"\n"+
                universityName + ", " + gradYear);
    }

}
