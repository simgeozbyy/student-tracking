package com.example.student_tracking.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BackgroundTask extends Thread {

    private final String taskName;
    private static final Logger logger = LoggerFactory.getLogger(BackgroundTask.class);

    public BackgroundTask(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void run() {
        System.out.println(taskName + " başladı.");
        try {
            Thread.sleep(2000); // 2 saniye uyut
        } catch (InterruptedException e) {
            logger.error("Thread beklerken hata oluştu", e);
        }
        System.out.println(taskName + " tamamlandı.");
    }
}
