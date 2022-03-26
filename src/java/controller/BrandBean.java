package controller;

import dao.BrandDAO;
import entity.Brand;
import jakarta.inject.Named;
import jakarta.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;

@Named(value = "brandBean")
@SessionScoped
public class BrandBean implements Serializable {

    private Brand entity;
    private BrandDAO dao;
    private List<Brand> list;

    public BrandBean() {

    }
    public void create(){
        this.getDao().BrandDAO(entity);
    }
    
    public void delete(Brand c){
        this.getDao().delete(c);
    }

    public Brand getEntity() {
         if( this.entity == null ){
            this.entity = new Brand();
        }
        return entity;
    }

    public void setEntity(Brand entity) {
        this.entity = entity;
    }

    public BrandDAO getDao() {
        if( this.dao == null ){
            this.dao = new BrandDAO();
        }
        return dao;
    }

    public void setDao(BrandDAO dao) {
        this.dao = dao;
    }

    public List<Brand> getList() {
        this.list = this.getDao().getCategoryList();
        return list;
    }

    public void setList(List<Brand> list) {
        this.list = list;
    }
    
    

}
