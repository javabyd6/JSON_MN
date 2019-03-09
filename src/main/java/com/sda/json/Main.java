package com.sda.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sda.Person;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * @author nieckarz
 * Stworzyc liste typu Person i dodac do niej 4 obiekty Person
 *  Zapisac liste do jsona  plik person.json
 *
 *  Stworzyc klase Student: name String, lastName String, address com.sda.Person.Address
 *  Stworzyc klase com.sda.Person.Address: city String, street String
 *
 *  Stworzyc liste typu Student i dodac do niej 3 obiekty Student
 *  Zapisac liste do jsona
 */
public class Main {

    public static void main(String[] args) {
        List<Student> listStudents = new ArrayList<>();
        List<Person> listPersons = new ArrayList<>();

        listPersons.add(new Person("Mirek", "1",20));
        listPersons.add(new Person("Mirek2", "2",22));
        listPersons.add(new Person("Mirek3", "3",40));
        listPersons.add(new Person("Mirek4", "4",50));


        //tworzymy JSON
        ObjectMapper mapper = new ObjectMapper();
        try {
            String personStr = mapper.writeValueAsString(listPersons);
            System.out.println(personStr);
            //zapis do pliku
            Files.write(Paths.get("person.json"),personStr.getBytes());

        } catch (IOException e) {
            e.printStackTrace();
        }


        // zadanie kolejne.

        listStudents.add(new Student("Noemi","Noemi1",new Address("Miasto","Ulica 1")));
        listStudents.add(new Student("Noemi1","Noemi2",new Address("Miasto1","Ulica 2")));
        listStudents.add(new Student("Noemi2","Noemi3",new Address("Miasto2","Ulica 3")));
        listStudents.add(new Student("Noemi3","Noemi4",new Address("Miasto3","Ulica 4")));

        ObjectMapper mapper2 = new ObjectMapper();
        try {
            String personStr = mapper2.writeValueAsString(listStudents);
            System.out.println(personStr);
            //zapis do pliku
            Files.write(Paths.get("Students.json"),personStr.getBytes());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
