import java.io.*;
import java.net.*;
import java.util.*;

// This class downloads a file from a URL.
class Download extends Observable implements Runnable {

    // Max size of download buffer.
    private static final int MAX_BUFFER_SIZE = 1024;

    // These are the status names.
    public static final String STATUSES[] = {"Downloading",
            "Paused", "Complete", "Cancelled", "Error"};

    // These are the status codes.
    public static final int DOWNLOADING = 0;
    public static final int PAUSED = 1;
    public static final int COMPLETE = 2;
    public static final int CANCELLED = 3;
    public static final int ERROR = 4;

    private URL url; // download URL
    private long size; // size of download in bytes
    private long downloaded; // number of bytes downloaded
    private int status; // current status of download
    private long initTime; //inital time when download started or resumed
    private long startTime; // start time for current bytes
    private long readSinceStart; // number of bytes downloaded since startTime
    private long elapsedTime = 0; // elapsed time till now
    private long prevElapsedTime = 0; // time elapsed before resuming download
    private long remainingTime = -1; //time remaining to finish download
    private float avgSpeed = 0; //average download speed in KB/s
    private float speed = 0; //download speed in KB/s

    // Constructor for Download.
    public Download(URL url) {
        this.url = url;
        size = -1;
        downloaded = 0;
        status = DOWNLOADING;
        // Begin the download.
        download();
    }
    public String getUrl() {
        return url.toString();
    }
    public float getProgress() {
        return ((float) downloaded / size) * 100;
    }

    // Get this download's status.
    public int getStatus() {
        return status;
    }

    // Pause this download.
    public void pause() {
        prevElapsedTime=elapsedTime;
        status = PAUSED;
        stateChanged();
    }

    // Resume this download.
    public void resume() {
        status = DOWNLOADING;
        stateChanged();
        download();
    }

    // Cancel this download.
    public void cancel() {
        prevElapsedTime=elapsedTime;
        status = CANCELLED;
        stateChanged();
    }

    // Mark this download as having an error.
    private void error() {
        prevElapsedTime=elapsedTime;
        status = ERROR;
        stateChanged();
    }

    // Start or resume downloading.
    private void download() {
        Thread thread = new Thread(this);
        thread.start();
    }

    public void run() {

    }

    private void stateChanged() {
        setChanged();
        notifyObservers();
    }
}