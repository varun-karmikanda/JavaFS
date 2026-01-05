package com.varunbkarmikanda.core.oops.challenge5;

public class Developer extends Employee{

    private String programmingLanguage;

    public Developer(String id, String name, String programmingLanguage){
        super(id, name);
        this.programmingLanguage = programmingLanguage;
    }

//    @Override
//    public String toString() {
//        return super.toString() +
//                "\n-> speciality: " + programmingLanguage;
//    }

    @Override
    public String toString() {

        String employeeDetails = super.toString();

        String openedDetails = employeeDetails.substring(0, employeeDetails.lastIndexOf("}"));

        StringBuilder sb = new StringBuilder(openedDetails);
        sb.append("\tDeveloper{");
        sb.append("\n\t\tprogrammingLanguage=").append(programmingLanguage);
        sb.append("\n\t}");
        sb.append("\n}");

        return sb.toString();
    }
}
