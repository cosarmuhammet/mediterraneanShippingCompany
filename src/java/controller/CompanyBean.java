/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package controller;

import dao.CompanyDAO;

import jakarta.enterprise.context.Dependent;
import entity.Company;
import jakarta.inject.Named;

import java.util.List;

/**
 *
 * @author husam
 */
@Named(value = "companyBean")
@Dependent
public class CompanyBean {

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
