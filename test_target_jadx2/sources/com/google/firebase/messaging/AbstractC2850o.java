package com.google.firebase.messaging;

import c7.ThreadFactoryC1738b;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.firebase.messaging.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC2850o {
    private static Executor a(String str) {
        return new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC1738b(str));
    }

    static Executor b() {
        return a("Firebase-Messaging-File-Io");
    }

    static ScheduledExecutorService c() {
        return new ScheduledThreadPoolExecutor(1, new ThreadFactoryC1738b("Firebase-Messaging-Init"));
    }

    static ExecutorService d() {
        return H8.b.a().a(new ThreadFactoryC1738b("Firebase-Messaging-Intent-Handle"), H8.c.HIGH_SPEED);
    }

    static ExecutorService e() {
        return Executors.newSingleThreadExecutor(new ThreadFactoryC1738b("Firebase-Messaging-Network-Io"));
    }

    static ExecutorService f() {
        return Executors.newSingleThreadExecutor(new ThreadFactoryC1738b("Firebase-Messaging-Task"));
    }

    static ScheduledExecutorService g() {
        return new ScheduledThreadPoolExecutor(1, new ThreadFactoryC1738b("Firebase-Messaging-Topics-Io"));
    }
}
