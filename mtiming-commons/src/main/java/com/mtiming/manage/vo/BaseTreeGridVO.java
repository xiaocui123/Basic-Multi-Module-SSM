package com.mtiming.manage.vo;

import java.util.ArrayList;
import java.util.List;

/**
 * 前端树形抽象结构
 *
 * @param <T>
 */
public class BaseTreeGridVO<T> {

    private String id;
    private List<T> children;
    private boolean isLeaf;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<T> getChildren() {
        if (children == null) {
            children = new ArrayList<T>();
        }
        return children;
    }

    public void setChildren(List<T> children) {
        this.children = children;
    }

    public boolean isLeaf() {
        return isLeaf;
    }

    public void setLeaf(boolean isLeaf) {
        this.isLeaf = isLeaf;
    }
}
