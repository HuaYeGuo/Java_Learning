package com.codergesu.calendar;

/**
 * @Date: 2021/9/20 21:51
 * @author: Eric
 */
////2023-08-21 copy by HUAYEGUO
public class AppStarter {
    public static void main(String[] args) {
        new CalendarUI("CoderGeshu-Calendar");
        CalendarUI.updateBeijingTime();
    }
}
