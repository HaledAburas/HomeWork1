package Homework;

import lombok.*;
@ToString


public class mobile {
  public  String color;
   public float size;
   public float current_0s;
   public static float latest_os_v = 4.4f;

    public static void newOS()
    {
        latest_os_v+=0.1;
    }
    public void upgradeToLatestOS()
    {
        current_0s = latest_os_v;
    }

    public mobile(String color, float size) {
        this.color = color;
        this.size = size;
        this.current_0s = latest_os_v;
    }
}
