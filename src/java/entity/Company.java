
package entity;

public class Company {
    private String Company_ID;
    private String Company_Name;
    private String Company_type;
    private String Founder;
    private String Year_of_Foundation;

    public Company() {
    }
    //constructor method
    public Company(String Company_ID, String Company_Name, String Company_type, String Founder, String Year_of_Foundation) {
        this.Company_ID = Company_ID;
        this.Company_Name = Company_Name;
        this.Company_type = Company_type;
        this.Founder = Founder;
        this.Year_of_Foundation = Year_of_Foundation;
    }

    //gemi idsi ve ülke id eklenecek
    public String getCompany_ID() {
        return Company_ID;
    }

    public void setCompany_ID(String Company_ID) {
        this.Company_ID = Company_ID;
    }

    public String getCompany_Name() {
        return Company_Name;
    }

    public void setCompany_Name(String Company_Name) {
        this.Company_Name = Company_Name;
    }

    public String getCompany_type() {
        return Company_type;
    }

    public void setCompany_type(String Company_type) {
        this.Company_type = Company_type;
    }

    public String getFounder() {
        return Founder;
    }

    public void setFounder(String Founder) {
        this.Founder = Founder;
    }

    public String getYear_of_Foundation() {
        return Year_of_Foundation;
    }

    public void setYear_of_Foundation(String Year_of_Foundation) {
        this.Year_of_Foundation = Year_of_Foundation;
    }

}
