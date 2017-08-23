package com.moraleszez.videogamerr.backendcore;

/**
 * Created by moral_000 on 8/23/2017.
 */

public class VideoGame {

    private String name;
    private String description;
    private String videoUrl;
    private String reviewsDatabase;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public String getReviewsDatabase() {
        return reviewsDatabase;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public void setReviewsDatabase(String reviewsDatabase) {
        this.reviewsDatabase = reviewsDatabase;
    }
}
