package com.example.book.bean;

import org.apache.ibatis.type.Alias;

@Alias("billRecord")
public class BillRecord {
    private String id;
    private String person;
    private String type;
    private String project;
    private String date;
    private String money;
    private String note;
    private String createTime;
    private String lastUpdateTime;

    @Override
    public String toString() {
        return "BillRecord{" +
                "id='" + id + '\'' +
                ", type='" + type + '\'' +
                ", project='" + project + '\'' +
                ", date='" + date + '\'' +
                ", money='" + money + '\'' +
                ", note='" + note + '\'' +
                ", createtime='" + createTime + '\'' +
                ", lastupdatetime='" + lastUpdateTime + '\'' +
                '}';
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
