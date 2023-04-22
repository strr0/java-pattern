package com.strr.code.criteria;

import com.strr.code.Person;

import java.util.List;

public interface Criteria {
    List<Person> meetCriteria(List<Person> persons);
}
