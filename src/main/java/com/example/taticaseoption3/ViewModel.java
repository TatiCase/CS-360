package com.example.taticaseoption3;

public class ViewModel {

    private int id;
    private String date;
    private int weight;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }




    public ViewModel(int id, String date, int weight) {
        this.id = id;
        this.date = date;
        this.weight = weight;
    }

    public ViewModel() {
    }


    @Override
    public String toString() {
        return date + ' ' +
                + weight +
                ' ';
    }



}

