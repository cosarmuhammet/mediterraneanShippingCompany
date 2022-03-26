package entity;

public class Brand {

    private String brand_ID;
    private String name;
    private String contract_Dates;
    private String contract_Duration;

    public Brand() {
    }

    public Brand(String brand_ID, String name, String contract_Dates, String contract_Duration){
        this.brand_ID=brand_ID;
        this.name=name;
        this.contract_Dates=contract_Dates;
        this.contract_Duration=contract_Duration;
  
    }
    
    public String getBrand_ID() {
        return brand_ID;
    }

    public void setBrand_ID(String brand_ID) {
        this.brand_ID = brand_ID;
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
        return "Brand{" + "brand_ID=" + brand_ID + ", name=" + name + ", contract_Dates=" + contract_Dates + ", contract_Duration=" + contract_Duration + '}';
    }

}
