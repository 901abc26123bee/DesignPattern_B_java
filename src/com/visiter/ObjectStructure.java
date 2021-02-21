package com.visiter;

import java.util.LinkedList;
import java.util.List;
// 數據結構，管理了很多人 man woman
public class ObjectStructure {
	// 維護一個集合
    private List<Person> persons = new LinkedList<>();
    public void attach(Person p) {
        persons.add(p);
    }
    public void detach(Person p){
        persons.remove(p);
    }

    public void display(Action action){
        // persons.forEach(person -> person.accept(action));
    	for(Person p: persons) {
    		p.accept(action);
    	}
    }

}