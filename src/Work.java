import java.util.ArrayList;

public class Work {
    private String companyName;
    private String title;
    private String startDate;
    private String endDate;
    private String jobDesc;

    public Work() {
    }

    public Work(String companyName, String title, String startDate, String endDate, String jobDesc) {
        this.companyName = companyName;
        this.title = title;
        this.startDate = startDate;
        this.endDate = endDate;
        this.jobDesc = jobDesc;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getJobDesc() {
        return jobDesc;
    }

    public void setJobDesc(String jobDesc) {
        this.jobDesc = jobDesc;
    }

    public void displayWork()
    {
        System.out.println(companyName + "\n"+ title +"\n"
                        + startDate + " - " + endDate +"\n"
                        + jobDesc);
    }
}
