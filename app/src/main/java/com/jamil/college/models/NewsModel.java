package com.jamil.college.models;

public class NewsModel {

    String NewsID;
    String NewsTitle;
    String NewsDescription;
    String NewsPostBy;
    String NewsDate;
    String NewsImage;
    String NewsLink;

    public NewsModel(String newsID, String newsTitle, String newsDescription, String newsPostBy, String newsDate, String newsImage, String newsLink) {
        NewsID = newsID;
        NewsTitle = newsTitle;
        NewsDescription = newsDescription;
        NewsPostBy = newsPostBy;
        NewsDate = newsDate;
        NewsImage = newsImage;
        NewsLink = newsLink;
    }

    public String getNewsID() {
        return NewsID;
    }

    public void setNewsID(String newsID) {
        NewsID = newsID;
    }

    public String getNewsTitle() {
        return NewsTitle;
    }

    public void setNewsTitle(String newsTitle) {
        NewsTitle = newsTitle;
    }

    public String getNewsDescription() {
        return NewsDescription;
    }

    public void setNewsDescription(String newsDescription) {
        NewsDescription = newsDescription;
    }

    public String getNewsPostBy() {
        return NewsPostBy;
    }

    public void setNewsPostBy(String newsPostBy) {
        NewsPostBy = newsPostBy;
    }

    public String getNewsDate() {
        return NewsDate;
    }

    public void setNewsDate(String newsDate) {
        NewsDate = newsDate;
    }

    public String getNewsImage() {
        return NewsImage;
    }

    public void setNewsImage(String newsImage) {
        NewsImage = newsImage;
    }

    public String getNewsLink() {
        return NewsLink;
    }

    public void setNewsLink(String newsLink) {
        NewsLink = newsLink;
    }
}
