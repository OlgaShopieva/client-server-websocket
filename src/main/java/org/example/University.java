package org.example;

import java.util.ArrayList;

public class University {

    private ArrayList<Students> list = new ArrayList<>();

    public String addStudent(String name, int phone, int group) {
        list.add(new Students(name, phone, group));
        return "Студент добавлен";
    }

    public String deleteStudent(String name, int phone) {
        boolean result = false;
        for (Students st : list) {
            if (st.getName().equals(name) && st.getPhone() == phone) {
                list.remove(st);
                result = true;
                break;
            }
        }
        if (result) {
           return "Студент отчислен";
        } else {
           return "Нет такого студента";
        }
    }

    public String printStudents(int groupNumber) {
        String res = "Студент группы: " + groupNumber + "\n";
        for(Students st: list){
            if(st.getGroup() == groupNumber){
                res += st.getName() + st.getPhone() + "\n";
            }
        }
        return res;
    }
}
