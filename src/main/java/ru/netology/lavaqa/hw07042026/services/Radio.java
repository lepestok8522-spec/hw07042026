package ru.netology.lavaqa.hw07042026.services;

public class Radio {
    private int currentStation;
    private int currentVolume;
    private int numberOfStations;

    public Radio() {
        this.numberOfStations = 10; // кол-во станций
    }

    public Radio(int numberOfStations) {
        if (numberOfStations <= 0) {
            this.numberOfStations = 10;
        } else {
            this.numberOfStations = numberOfStations;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newStation) {
        if (newStation < numberOfStations && newStation >= 0) {
            currentStation = newStation;
        }
    }

    public void nextStation() {
        if (currentStation < numberOfStations - 1) {
            currentStation = currentStation + 1;
        } else {
            currentStation = 0;
        }
    }

    public void prevStation() {
        if (currentStation == 0) {
            currentStation = numberOfStations - 1;
        } else {
            currentStation--;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume <= 100 && newCurrentVolume >= 0) {
            currentVolume = newCurrentVolume;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}