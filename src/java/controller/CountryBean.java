package controller;

import dao.CountryDAO;
import entity.Country;
import jakarta.inject.Named;
import jakarta.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;



@Named(value = "countryBean")
@SessionScoped
public class CountryBean implements Serializable {

    private Country entity;
    private CountryDAO dao;
    private List<Country> list;
    
    
    public CountryBean() {
    }
    
    public void create(){
        this.getDao().CountryDAO(entity);
        this.entity=new Country();
    }
    
    public void delete(Country c){
        this.getDao().delete(c);
          this.entity=new Country();
    }
    public void update(){
        this.getDao().update(entity);
        this.entity=new Country();
    }

    public Country getEntity() {
        if( this.entity == null ){
            this.entity = new Country();
        }
        return entity;
    }

    public void setEntity(Country entity) {
        this.entity = entity;
    }

    public CountryDAO getDao() {
        if( this.dao == null ){
            this.dao = new CountryDAO();
        }
        return dao;
    }

    public void setDao(CountryDAO dao) {
        this.dao = dao;
    }

    public List<Country> getList() {
        this.list = this.getDao().getCategoryList();
        return list;
    }

    public void setList(List<Country> list) {
        this.list = list;
    }
    
    
    
}
