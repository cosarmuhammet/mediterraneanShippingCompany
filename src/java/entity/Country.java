package entity;
public class Country {   
    private String country_ID;
    private String name;
    
    public Country(){
    }

    public Country(String country_ID, String name) {
        this.country_ID = country_ID;
        this.name = name;
    }

    public String getCountry_ID() {
        return country_ID;
    }

    public void setCountry_ID(String country_ID) {
        this.country_ID = country_ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Country{" + "country_ID=" + country_ID + ", name=" + name + '}';
    }
    
    
    
    
}
