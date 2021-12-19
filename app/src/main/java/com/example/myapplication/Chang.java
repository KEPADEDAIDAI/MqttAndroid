package com.example.myapplication;

public class Chang {
    public static String msg;
    public static String nowNum = "0";
    public static String state = "未在馆";
    public static String allTime = "0分钟";
    public static String thisTime = "0分钟";
    public static void setMsg(String msg)
    {
        Chang.msg = msg;
    }
    public static boolean[] sit = {false,false,false,false,false,false,false,false,false,false};
}
