package br.com.empresas.Util;

import com.atom.Ignore;
import com.atom.TableName;
import java.io.Serializable;


@TableName(value = "dynamic")
public class Dynamic implements Serializable {


    @Ignore
    private static final long serialVersionUID = 1L;

    @Ignore
    private boolean add = true;
    @Ignore
    private boolean edit = false;
    @Ignore
    private boolean del = false;

    private String route;

    private String tablebase;

    private int pagging = 1;

    private String filters = "";

    private String orders = "";

    private int id;

    private String sql;

    public int getPagging() {
        return pagging;
    }

    public void setPagging(int pagging) {
        this.pagging = pagging;
    }

    public String getFilters() {
        return filters;
    }

    public void setFilters(String filters) {
        this.filters = filters;
    }

    public String getOrders() {
        return orders;
    }

    public void setOrders(String orders) {
        this.orders = orders;
    }

    public boolean isAdd() {
        return add;
    }

    public void setAdd(boolean add) {
        this.add = add;
    }

    public boolean isEdit() {
        return edit;
    }

    public void setEdit(boolean edit) {
        this.edit = edit;
    }

    public boolean isDel() {
        return del;
    }

    public void setDel(boolean del) {
        this.del = del;
    }
    public String getRoute() {
        return route;
    }


    public void setRoute(String route) {
        this.route = route;
    }
    public String getTablebase() {
        return tablebase;
    }


    public void setTablebase(String tablebase) {
        this.tablebase = tablebase;
    }
    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }
    public String getSql() {
        return sql;
    }


    public void setSql(String sql) {
        this.sql = sql;
    }
}

