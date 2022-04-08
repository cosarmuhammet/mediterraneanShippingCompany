package entity;

public class Harbor {

    private String harbor_id;
    private String country_id;
    private String harbor_name;
    private String contract_dates;
    private String contract_duration;

    public Harbor() {

    }

    public Harbor(String harbor_id, String country_id, String harbor_name, String contract_Dates, String contract_Duration) {
        this.harbor_id = harbor_id;
        this.country_id = country_id;
        this.harbor_name = harbor_name;
        this.contract_dates = contract_Dates;
        this.contract_duration = contract_Duration;
    }

    public String getHarbor_id() {
        return harbor_id;
    }

    public void setHarbor_id(String harbor_id) {
        this.harbor_id = harbor_id;
    }

    public String getCountry_id() {
        return country_id;
    }

    public void setCountry_id(String country_id) {
        this.country_id = country_id;
    }

    public String getHarbor_name() {
        return harbor_name;
    }

    public void setHarbor_name(String harbor_name) {
        this.harbor_name = harbor_name;
    }

    public String getContract_dates() {
        return contract_dates;
    }

    public void setContract_dates(String contract_Dates) {
        this.contract_dates = contract_Dates;
    }

    public String getContract_duration() {
        return contract_duration;
    }

    public void setContract_duration(String contract_Duration) {
        this.contract_duration = contract_Duration;
    }

    @Override
    public String toString() {
        return "Harbor{" + "harbor_id=" + harbor_id + ", country_id=" + country_id + ", harbor_name=" + harbor_name + ", contract_Dates=" + contract_dates + ", contract_Duration=" + contract_duration + '}';
    }

}
