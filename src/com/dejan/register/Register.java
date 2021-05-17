package com.dejan.register;

import java.util.ArrayList;
import java.util.Iterator;

public class Register<T extends User>{
    private ArrayList<T> users=new ArrayList<>();

    public Iterator<T> getIterator(){
        return users.iterator();
    }

    public void addElement(T k){
        users.add(k);
    }
    public void deleteElement(T k){
        users.remove(k);
    }

    public ArrayList<T> search(String query){
        ArrayList<T> result=new ArrayList<>();
        for(T k : users){
            User user=(User) k;
            if(k.searchObject(query)) result.add(k);
        }
        return result;
    }
}
