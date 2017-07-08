package com.ibrahim.popularmovies;

/**
 * Created by ibam
 * <p/>
 * Based on http://stackoverflow.com/questions/9963691/android-asynctask-sending-callbacks-to-ui
 */
interface OnTaskCompleted {
    void onFetchMoviesTaskCompleted(Movie[] movies);
}
