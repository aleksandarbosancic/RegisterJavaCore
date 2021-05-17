package com.dejan.register;

import javax.jws.soap.SOAPBinding;
import java.util.HashMap;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        HashMap<String, Register<User>> mapa=new HashMap<>();
        String[] cities=new String[] { "Banja Luka", "Prijedor", "Doboj" };
        for(int i=0;i<30;i++) {
            String city=cities[i%3];
            if(!mapa.containsKey(city)) mapa.put(city, new Register<>());
            // add elements
            Register<User> reg=mapa.get(city);
            if(Math.random()>0.5) reg.addElement(new Individual("First name" + i,"Last Name" + i," Personal Id " + i," address" + i," phone number" + i,city));
            else reg.addElement(new WeldedFace("id" + i," name" + i,"address" + i,"phone number" + i,city));
        }
        // ispis
        Iterator<String> it=mapa.keySet().iterator();
        while(it.hasNext()) {
            String city=it.next();
            System.out.println("\nUsers for city: " + city);
            Iterator<User> inner=mapa.get(city).getIterator();
            while(inner.hasNext()) {
                User k=inner.next();
                System.out.println(k);
            }
        }
    }
}
