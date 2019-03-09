package com.sda.writejson;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


/**
 * @author nieckarz
 */
public class Main {

    static List<Student> listStudents = new ArrayList<>();
    static List<Person> listPersons = new ArrayList<>();
    static ObjectMapper mapper = new ObjectMapper();

    public static  void writeStudentList(String file){
        try{

            String personStr = mapper.writeValueAsString(listStudents);
            Files.write(Paths.get(file), personStr.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void writePersonList(String file){
        try{

            String personStr = mapper.writeValueAsString(listPersons);
            Files.write(Paths.get(file), personStr.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        listStudents.add(new Student("Noemi", "Noemi1", new Address("Miasto", "Ulica 1")));
        listStudents.add(new Student("Noemi1", "Noemi2", new Address("Miasto1", "Ulica 2")));
        listStudents.add(new Student("Noemi2", "Noemi3", new Address("Miasto2", "Ulica 3")));
        listStudents.add(new Student("Noemi3", "Noemi4", new Address("Miasto3", "Ulica 4")));
        writeStudentList("writeFileTestStudents.json");
    }

}
