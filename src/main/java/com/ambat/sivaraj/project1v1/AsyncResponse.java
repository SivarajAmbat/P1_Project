package com.ambat.sivaraj.project1v1;

import com.ambat.sivaraj.project1v1.Model.Movie;

import java.util.List;

/**
 * Created by admin on 27/12/15.
 */
public interface AsyncResponse {

    void OnTaskCompleted(List<Movie> results);

}
