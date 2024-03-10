package com.zipcodewilmington.person;

/**
 * If you did ObjectsOne lab, you might recognize this code?
 */
public class Person {
    private String name = "";
    private int age = Integer.MAX_VALUE;
    private String maritalStatus = "";
    private boolean isEmployed;
    private String stateOfResidence = "";
    private boolean isAdult;
    private int numOfPets = Integer.MAX_VALUE;


    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, boolean isEmployed, boolean isAdult, String stateOfResidence, int numOfPets, String maritalStatus) {
        this.name = name;
        this.age = age;
        this.isEmployed = isEmployed;
        this.isAdult = isAdult;
        this.stateOfResidence = stateOfResidence;
        this.numOfPets = numOfPets;
        this.maritalStatus = maritalStatus;
    }

    public Person(int age) {
        this.age = age;
    }


    public Person(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setStateOfResidence(String stateOfResidence){
        this.stateOfResidence = stateOfResidence;
    }

    public void setMaritalStatus (String maritalStatus){
        this.maritalStatus = maritalStatus;
    }

    public void setIsEmployed(boolean isEmployed){
        this.isEmployed = isEmployed;
    }

    public void setIsAdult(boolean isAdult){
        this.isAdult = isAdult;
    }

    public void setNumOfPets(int numOfPets){
        this.numOfPets = numOfPets;
    }
    public String getName() {

        return name;
    }

    public Integer getAge() {
        return age;
    }
    public String getMaritalStatus(){
        return maritalStatus;
    }
    public String getStateOfResidence(){
        return stateOfResidence;
    }

    public boolean getIsAdult() {
        return isAdult;
    }

    public boolean getIsEmployed(){
        return isEmployed;
    }

    public int getNumOfPets() {
        return numOfPets;
    }
}
