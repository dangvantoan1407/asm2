package asm4;

import java.util.ArrayList;
import java.util.Scanner;

public class News implements INews {
    private int ID;
    private String Title, PublishDate, Author, Content;
    private double AverageRate;
    ArrayList<Integer> rateList;

    public News(int ID, String title, String publishDate, String author, String content, double averageRate) {
        this.ID = ID;
        Title = title;
        PublishDate = publishDate;
        Author = author;
        Content = content;
        AverageRate = averageRate;
        rateList = new ArrayList<>();

    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getPublishDate() {
        return PublishDate;
    }

    public void setPublishDate(String publishDate) {
        PublishDate = publishDate;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }


    public double getAverageRate() {
        return AverageRate;
    }


    @Override
    public void Display() {
        System.out.println("Title : " + Title);
        System.out.println("PublishDate : " + PublishDate);
        System.out.println("Author : " + Author);
        System.out.println("Content : " + Content);
        System.out.println("AverageRate : " +AverageRate);
    }
    public void calculate() {
        double total = 0;
        for ((Integer i : rateList){
            total+=i;
        }
        AverageRate = total/rateList.size();
    }
    public void inputRate(int star)

}
