package controller;

import dao.ShipDAO;
import entity.Ship;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named(value = "shipBean")
@SessionScoped

public class ShipBean implements Serializable {

    private Ship entity;
    private ShipDAO dao;
    private List<Ship> list;

    public ShipBean() {

    }

    public void create() {
        this.getDao().ShipDAO(entity);
    }

    public void delete(Ship c) {
        this.getDao().delete(c);
    }

    public Ship getEntity() {
        if (this.entity == null) {
            this.entity = new Ship();
        }
        return entity;
    }

    public void setEntity(Ship entity) {
        this.entity = entity;
    }

    public ShipDAO getDao() {
        if (this.dao == null) {
            this.dao = new ShipDAO();
        }
        return dao;
    }

    public void setDao(ShipDAO dao) {
        this.dao = dao;
    }

    public List<Ship> getList() {
        this.list = this.getDao().getCategoryList();
        return list;
    }

    public void setList(List<Ship> list) {
        this.list = list;
    }

}
