package model;

import com.google.gson.annotations.SerializedName;

public class Movie {
    @SerializedName("poster_path")
    private String poster_path;
    @SerializedName("vote_average")
    private String vote_average;
    @SerializedName("id")
    private int id;
    @SerializedName("title")
    private String title;
    @SerializedName("overview")
    private String overview;
    @SerializedName("original_title")
    private String original_title;

    public Movie(int id, String title,String original_title,String overview, String vote_average, String poster_path){
        this.id = id;
        this.title = title;
        this.original_title =original_title;
        this.overview = overview;
        this.vote_average = vote_average;
        this.poster_path =poster_path;
    }

    public String getPoster_path() {
        return poster_path;
    }

    public String getVote_average() {
        return vote_average;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }
    public String getOriginal_title() {
        return original_title;
    }

    public String getOverview() {
        return overview;
    }

    public void setPoster_path(String poster_path) {
        this.poster_path = poster_path;
    }
    public void setOriginal_title(String original_title) {
        this.original_title = original_title;
    }

    public void setVote_average(String vote_average) {
        this.vote_average = vote_average;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }
}
