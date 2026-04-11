package ru.netology.lavaqa.hw07042026.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldCreateRadioWithDefaultStations() {
        Radio radio = new Radio();
        Assertions.assertEquals(0, radio.getCurrentStation());
        Assertions.assertEquals(0, radio.getCurrentVolume());
        radio.setCurrentStation(9);
        Assertions.assertEquals(9, radio.getCurrentStation());
        radio.setCurrentStation(10);
        Assertions.assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldCreateRadioWithCustomStations() {
        Radio radio = new Radio(30);
        Assertions.assertEquals(0, radio.getCurrentStation());
        Assertions.assertEquals(0, radio.getCurrentVolume());
        radio.setCurrentStation(29);
        Assertions.assertEquals(29, radio.getCurrentStation());
        radio.setCurrentStation(30);
        Assertions.assertEquals(29, radio.getCurrentStation());
    }

    @Test
    public void shouldHandleInvalidStationsCount() {
        Radio radio1 = new Radio(0);
        Radio radio2 = new Radio(-5);
        radio1.setCurrentStation(5);
        radio2.setCurrentStation(5);
        Assertions.assertEquals(5, radio1.getCurrentStation());
        Assertions.assertEquals(5, radio2.getCurrentStation());
    }

    @Test
    public void shouldSetValidStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        Assertions.assertEquals(5, radio.getCurrentStation());
        radio.setCurrentStation(0);
        Assertions.assertEquals(0, radio.getCurrentStation());
        radio.setCurrentStation(9);
        Assertions.assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldNotSetInvalidStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.setCurrentStation(-1);
        Assertions.assertEquals(5, radio.getCurrentStation());
        radio.setCurrentStation(10);
        Assertions.assertEquals(5, radio.getCurrentStation());
    }
    @Test
    public void shouldNotSetInvalidStationWithCustomCount() {
        Radio radio = new Radio(15);
        radio.setCurrentStation(10);
        radio.setCurrentStation(-5);
        Assertions.assertEquals(10, radio.getCurrentStation());
        radio.setCurrentStation(15);
        Assertions.assertEquals(10, radio.getCurrentStation());
        radio.setCurrentStation(14);
        Assertions.assertEquals(14, radio.getCurrentStation());
    }
        @Test
    public void shouldGoToNextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.nextStation();
        Assertions.assertEquals(1, radio.getCurrentStation());
        radio.setCurrentStation(9);
        radio.nextStation();
        Assertions.assertEquals(0, radio.getCurrentStation());
        }

     @Test
    public void shouldGoToPrevStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        radio.prevStation();
        Assertions.assertEquals(0, radio.getCurrentStation());
        radio.setCurrentStation(0);
        radio.prevStation();
        Assertions.assertEquals(9, radio.getCurrentStation());
     }

    @Test
    public void shouldSetValidVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(30);
        Assertions.assertEquals(30, radio.getCurrentVolume());
        radio.setCurrentVolume(0);
        Assertions.assertEquals(0, radio.getCurrentVolume());
        radio.setCurrentVolume(100);
        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotSetNewVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-30);
        Assertions.assertEquals(0, radio.getCurrentVolume());
        radio.setCurrentVolume(130);
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.increaseVolume();
        Assertions.assertEquals(1, radio.getCurrentVolume());
        radio.setCurrentVolume(99);
        radio.increaseVolume();
        Assertions.assertEquals(100, radio.getCurrentVolume());
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.decreaseVolume();
        Assertions.assertEquals(99, radio.getCurrentVolume());
        radio.setCurrentVolume(1);
        radio.decreaseVolume();
        Assertions.assertEquals(0, radio.getCurrentVolume());
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }
}