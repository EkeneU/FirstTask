package com.HNGTask1.FirstTask.rest;

import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.Calendar;

@Service
public class StageOneObject {

    private String slack_name;
    private String track;
    private String github_file_url, github_repo_url, status_code, utc_time;

    private String current_day;

    public StageOneObject() {
    }

    public StageOneObject(String slack_name, String track, String github_file_url, String github_repo_url, String status_code, String current_day, String utc_time) {
        this.slack_name = slack_name;
        this.track = track;
        this.github_file_url = github_file_url;
        this.github_repo_url = github_repo_url;
        this.status_code = status_code;
        this.current_day = current_day;
        this.utc_time = utc_time;
    }

    public String getSlack_name() {
        return slack_name;
    }

    public void setSlack_name(String slack_name) {
        this.slack_name = slack_name;
    }

    public String getTrack() {
        return track;
    }

    public void setTrack(String track) {
        this.track = track;
    }

    public String getGithub_file_url() {
        return github_file_url;
    }

    public void setGithub_file_url(String github_file_url) {
        this.github_file_url = github_file_url;
    }

    public String getGithub_repo_url() {
        return github_repo_url;
    }

    public void setGithub_repo_url(String github_repo_url) {
        this.github_repo_url = github_repo_url;
    }

    public String getStatus_code() {
        return status_code;
    }

    public void setStatus_code(String status_code) {
        this.status_code = status_code;
    }

    public String getCurrent_day() {
        final Calendar c = Calendar.getInstance();
        int today = c.get(Calendar.DAY_OF_WEEK);
        switch (today) {
            case Calendar.SUNDAY:
                current_day = "Sunday";
                break;
            case Calendar.MONDAY:
                current_day = "Monday";
                break;
            case Calendar.TUESDAY:
                current_day = "Tuesday";
                break;
            case Calendar.WEDNESDAY:
                current_day = "Wednesday";
                break;
            case Calendar.THURSDAY:
                current_day = "Thursday";
                break;
            case Calendar.FRIDAY:
                current_day = "Friday";
                break;
            case Calendar.SATURDAY:
                current_day = "Saturday";
                    break;
        }
        return current_day;
    }

    public void setCurrent_day(String current_day) {
        this.current_day = current_day;
    }

    public String getUtc_time() {
        Instant instant = Instant.now();
        utc_time = instant.toString();
        return utc_time;
    }

    public void setUtc_time(String utc_time) {
        this.utc_time = utc_time;
    }
}
