package controller;

import dao.HarborDAO;
import entity.Harbor;
import jakarta.inject.Named;
import jakarta.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import java.io.Serializable;

@Named(value = "harborBean")
@SessionScoped

public class HarborBean implements Serializable {

    private Harbor entity;
    private HarborDAO dao;
    private List<Harbor> list;

    public HarborBean() {

    }

    public void create() {
        this.getDao().HarborDAO(entity);
        this.entity = new Harbor();
    }

    public void update() {
        this.getDao().update(entity);
        this.entity = new Harbor();
    }

    public void delete(Harbor c) {
        this.getDao().delete(c);
        this.entity = new Harbor();
    }

    public Harbor getEntity() {
        if (this.entity == null) {
            this.entity = new Harbor();
        }
        return entity;
    }

    public void setEntity(Harbor entity) {
        this.entity = entity;
    }

    public HarborDAO getDao() {
        if (this.dao == null) {
            this.dao = new HarborDAO();
        }
        return dao;
    }

    public void setDao(HarborDAO dao) {
        this.dao = dao;
    }

    public List<Harbor> getList() {
        this.list = this.getDao().getCategoryList();
        return list;
    }

    public void setList(List<Harbor> list) {
        this.list = list;
    }

}
