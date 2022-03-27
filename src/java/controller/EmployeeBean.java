package controller;

import dao.EmployeeDAO;
import entity.Employee;
import jakarta.inject.Named;
import jakarta.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;

@Named(value = "employeeBean")
@SessionScoped
public class EmployeeBean implements Serializable {

    private Employee entity;
    private EmployeeDAO dao;
    private List<Employee> list;

    public EmployeeBean() {
    }

    public void create() {
        this.getDao().EmployeeDAO(entity);//gelen Employee nesnesini EmployeeDAO sınıfındaki constructor methoduna yollar
    }

    public void delete(Employee c) {//gelen Employee nesnesini EmployeeDAO sınıfındaki delete methoduna yollar
        this.getDao().delete(c);
    }

    public Employee getEntity() {
        if (this.entity == null) {
            this.entity = new Employee();
        }
        return entity;
    }

    public void setEntity(Employee entity) {
        this.entity = entity;
    }

    public EmployeeDAO getDao() {
        if (this.dao == null) {
            this.dao = new EmployeeDAO();
        }
        return dao;
    }

    public void setDao(EmployeeDAO dao) {
        this.dao = dao;
    }

    public List<Employee> getList() {
        this.list = this.getDao().getCategoryList();
        return list;
    }

    public void setList(List<Employee> list) {
        this.list = list;
    }

}
