package controller;

import dao.CompanyDAO;
import entity.Company;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named(value = "companyBean")
@SessionScoped
public class CompanyBean implements Serializable {

    private Company entity;
    private CompanyDAO dao;
    private List<Company> list;

    public CompanyBean() {
    }

    public void create() {
        this.getDao().CompanyDAO(entity);//gelen Company nesnesini companyDAO sınıfındaki constructor methoduna yollar
    }

    public void delete(Company c) {//gelen Company nesnesini companyDAO sınıfındaki delete methoduna yollar
        this.getDao().delete(c);
    }

    public Company getEntity() {
        if (this.entity == null) {
            this.entity = new Company();
        }
        return entity;
    }

    public void setEntity(Company entity) {
        this.entity = entity;
    }

    public CompanyDAO getDao() {
        if (this.dao == null) {
            this.dao = new CompanyDAO();
        }
        return dao;
    }

    public void setDao(CompanyDAO dao) {
        this.dao = dao;
    }

    public List<Company> getList() {
        this.list = this.getDao().getCategoryList();
        return list;
    }

    public void setList(List<Company> list) {
        this.list = list;
    }

}
