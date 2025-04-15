package ru.yandex.praktikum;

public class SpeedLight {

    public static void main(String[] args) {
    }

    public String showLight(int currentSpeed) {
        if (currentSpeed < 60) {
            return "green";
        } else if (currentSpeed <= 80) {
            return "yellow";
        } else {
            return "red";
        }
    }
}