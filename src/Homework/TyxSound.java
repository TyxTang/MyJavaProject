package Homework;

import java.util.Scanner;

public class TyxSound {
    public static void main(String[] args) {
        System.out.println("你想用哪个设备：");
        System.out.println("1-收音机    2-手机");
        Scanner Input = new Scanner(System.in);
        Sound sound = new Sound();
        Mobilephone mobilephone = new Mobilephone();
        int device = Input.nextInt();
        switch(device){
            case 1 -> {
                sound.playSound();
                sound.decreaseVolumn();
                sound.stopSound();
            }
            case 2 -> {
                mobilephone.playSound();
                mobilephone.decreaseVolumn();
                mobilephone.stopSound();
            }
        }
    }
}

interface Soundable {
    abstract void playSound();
    abstract void decreaseVolumn();
    abstract void stopSound();
}

class Sound implements Soundable {
    public void playSound() {
        System.out.println("收音机播放广播");
    }
    public void decreaseVolumn() {
        System.out.println("收音机减小音量");
    }
    public void stopSound() {
        System.out.println("收音机停止播放");
    }
}

class Mobilephone implements Soundable {
    public void playSound() {
        System.out.println("手机播放铃声");
    }
    public void decreaseVolumn() {
        System.out.println("手机减小音量");
    }
    public void stopSound() {
        System.out.println("手机停止播放");
    }
}
