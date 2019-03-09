package com.sda.readjson;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author nieckarz
 */
public class Main {
    static List<Student> listStudents = new ArrayList<>();
    static List<Person> listPersons = new ArrayList<>();
    static ObjectMapper mapper = new ObjectMapper();

    public static  void readStudentList(String file){
        try{

        Student[] personArray = mapper.readValue(new File(file), Student[].class);
        listStudents = Arrays.asList(personArray);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void readPersonList(String file){
        try{

            Person[] personArray = mapper.readValue(new File(file), Person[].class);
            listPersons = Arrays.asList(personArray);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        readStudentList("writeFileTestStudents.json");
        System.out.println(listStudents.toString());
    }
}
