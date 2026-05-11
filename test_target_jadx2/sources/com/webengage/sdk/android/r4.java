package com.webengage.sdk.android;

import android.content.Context;
import java.lang.Thread;

/* loaded from: classes2.dex */
class r4 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    private Thread.UncaughtExceptionHandler f30795a;

    /* renamed from: b, reason: collision with root package name */
    private Context f30796b;

    /* renamed from: c, reason: collision with root package name */
    private C2961i f30797c;

    r4(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, Context context, C2961i c2961i) {
        this.f30796b = null;
        this.f30797c = null;
        this.f30795a = uncaughtExceptionHandler;
        this.f30796b = context.getApplicationContext();
        this.f30797c = c2961i;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        Logger.e("WebEngage", "App has crashed\n" + th);
        C2961i c2961i = this.f30797c;
        if (c2961i != null) {
            c2961i.a(true);
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f30795a;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }
}
