package entity;

public class Harbor {

    private String harbor_ID;
    private String name;
    private String contract_Dates;
    private String contract_Duration;

    public Harbor() {
        
    }

    public Harbor(String harbor_ID, String name, String contract_Dates, String contract_Duration) {
        this.harbor_ID = harbor_ID;
        this.name = name;
        this.contract_Dates = contract_Dates;
        this.contract_Duration = contract_Duration;
    }

    public String getHarbor_ID() {
        return harbor_ID;
    }

    public void setHarbor_ID(String harbor_ID) {
        this.harbor_ID = harbor_ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContract_Dates() {
        return contract_Dates;
    }

    public void setContract_Dates(String contract_Dates) {
        this.contract_Dates = contract_Dates;
    }

    public String getContract_Duration() {
        return contract_Duration;
    }

    public void setContract_Duration(String contract_Duration) {
        this.contract_Duration = contract_Duration;
    }

    @Override
    public String toString() {
        return "Harbor{" + "harbor_ID=" + harbor_ID + ", name=" + name + ", contract_Dates=" + contract_Dates + ", contract_Duration=" + contract_Duration + '}';
    }
   
    
    
}
