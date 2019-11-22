package com.oop.java;


public class person {

    private int age;
    private String sex;
    private String name;
    private String [] interest;


    public person(int age, String sex, String name, String [] interest){
        this.age = age;
        this.sex = sex;
        this.name = name;
        this.interest =  interest;
    }

    public String hello() {

        String output = " ";

        for (int i = 0; i < interest.length; i++) {
            if(i < interest.length-1)
                output += interest[i] +  ", ";
            else if (i == interest.length-1){
                output += "and " + interest[i];
            }
            else if (i == interest.length-2){
                output += interest[i] +  " ";
            }
        }
        return  "Hello, my name is  " + name + " and i am " + age + " years old. My interest are "+ output;



    }



}
