package Controlador;

public class Reloj {
    private final long nanoSecondsPerMillisecond = 1000000;
    private final long nanoSecondsPerSecond = 1000000000;
    private final long nanoSecondsPerMinute = 60000000000L;
    private final long nanoSecondsPerHour = 3600000000000L;

    private long stopWatchStartTime = 0;
    private long stopWatchStopTime = 0;
    private boolean stopWatchRunning = false;

    //Funcion para marcar inicio del tiempo
    public void start() {
        this.stopWatchStartTime = System.nanoTime();
        this.stopWatchRunning = true;
    }

    //Funcion para marcar final del tiempo
    public void stop() {
        this.stopWatchStopTime = System.nanoTime();
        this.stopWatchRunning = false;
    }

    //Funcion para determinar el tiempo tardado en segundos
    public long getElapsedSeconds() {
        long elapsedTime;

        if (stopWatchRunning)
            elapsedTime = (System.nanoTime() - stopWatchStartTime);
        else
            elapsedTime = (stopWatchStopTime - stopWatchStartTime);

        return elapsedTime / nanoSecondsPerSecond;
    }
}
