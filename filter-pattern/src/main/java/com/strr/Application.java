package com.strr;

import com.strr.code.Person;
import com.strr.code.criteria.AndCriteria;
import com.strr.code.criteria.Criteria;
import com.strr.code.criteria.CriteriaMale;
import com.strr.code.criteria.CriteriaSingle;

import java.util.ArrayList;
import java.util.List;

/**
 * 过滤器模式
 * 使用不同的标准来过滤一组对象
 */
public class Application {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Robert","Male", "Single"));
        persons.add(new Person("John","Male", "Married"));
        persons.add(new Person("Laura","Female", "Married"));
        persons.add(new Person("Diana","Female", "Single"));
        persons.add(new Person("Mike","Male", "Single"));
        persons.add(new Person("Bobby","Male", "Single"));
        Criteria criteria = new AndCriteria(new CriteriaMale(), new CriteriaSingle());
        printPersons(criteria.meetCriteria(persons));
    }

    public static void printPersons(List<Person> persons){
        for (Person person : persons) {
            System.out.println("Person : [ Name : " + person.getName()
                    +", Gender : " + person.getGender()
                    +", Marital Status : " + person.getMaritalStatus()
                    +" ]");
        }
    }
}
