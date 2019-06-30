package com.poyuyang.visualyser.entity;


import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "titanic")
public class Record {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String passengerid;
    private String survived;
    private String pclass;
    private String name;
    private String sex;
    private String age;
    private String sibsp;
    private String parch;
    private String ticket;
    private String fare;
    private String cabin;
    private String embarked;

    public Record() {

    }

    public Record(String survived, String pclass, String name, String sex, String age, String sibsp, String parch, String ticket, String fare, String cabin, String embarked) {

        this.survived = survived;
        this.pclass = pclass;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.sibsp = sibsp;
        this.parch = parch;
        this.ticket = ticket;
        this.fare = fare;
        this.cabin = cabin;
        this.embarked = embarked;
    }


    public String getPassengerid() {
        return passengerid;
    }

    public void setPassengerid(String passengerid) {
        this.passengerid = passengerid;
    }

    public String getSurvived() {
        return survived;
    }

    public void setSurvived(String survived) {
        this.survived = survived;
    }

    public String getPclass() {
        return pclass;
    }

    public void setPclass(String pclass) {
        this.pclass = pclass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSibsp() {
        return sibsp;
    }

    public void setSibsp(String sibsp) {
        this.sibsp = sibsp;
    }

    public String getParch() {
        return parch;
    }

    public void setParch(String parch) {
        this.parch = parch;
    }

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    public String getFare() {
        return fare;
    }

    public void setFare(String fare) {
        this.fare = fare;
    }

    public String getCabin() {
        return cabin;
    }

    public void setCabin(String cabin) {
        this.cabin = cabin;
    }


    public String getEmbarked() {
        return embarked;
    }

    public void setEmbarked(String embarked) {
        this.embarked = embarked;
    }
}
