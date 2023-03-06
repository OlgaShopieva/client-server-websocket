package org.example;

public class Students {
    private String name;
    private int phone;
    private int group;

    public Students(String name, int phone, int group) {
        this.name = name;
        this.phone = phone;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Студент: " +
                "Имя: " + name + '\'' +
                "Телефон: " + phone +
                "Группа: " + group +
                '}';
    }
}
