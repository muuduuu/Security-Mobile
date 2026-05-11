package io.sentry.android.core.internal.util;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import io.sentry.ILogger;
import io.sentry.K1;
import io.sentry.android.core.N;
import java.io.ByteArrayOutputStream;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public abstract class n {
    private static boolean b(Activity activity, N n10) {
        return n10.d() >= 17 ? (activity.isFinishing() || activity.isDestroyed()) ? false : true : !activity.isFinishing();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(View view, Canvas canvas, CountDownLatch countDownLatch, ILogger iLogger) {
        try {
            view.draw(canvas);
            countDownLatch.countDown();
        } catch (Throwable th) {
            iLogger.b(K1.ERROR, "Taking screenshot failed (view.draw).", th);
        }
    }

    public static byte[] d(Activity activity, io.sentry.util.thread.a aVar, final ILogger iLogger, N n10) {
        if (!b(activity, n10) || activity.getWindow() == null || activity.getWindow().getDecorView() == null || activity.getWindow().getDecorView().getRootView() == null) {
            iLogger.c(K1.DEBUG, "Activity isn't valid, not taking screenshot.", new Object[0]);
            return null;
        }
        final View rootView = activity.getWindow().getDecorView().getRootView();
        if (rootView.getWidth() <= 0 || rootView.getHeight() <= 0) {
            iLogger.c(K1.DEBUG, "View's width and height is zeroed, not taking screenshot.", new Object[0]);
            return null;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                Bitmap createBitmap = Bitmap.createBitmap(rootView.getWidth(), rootView.getHeight(), Bitmap.Config.ARGB_8888);
                final Canvas canvas = new Canvas(createBitmap);
                if (aVar.d()) {
                    rootView.draw(canvas);
                } else {
                    final CountDownLatch countDownLatch = new CountDownLatch(1);
                    activity.runOnUiThread(new Runnable() { // from class: io.sentry.android.core.internal.util.m
                        @Override // java.lang.Runnable
                        public final void run() {
                            n.c(rootView, canvas, countDownLatch, iLogger);
                        }
                    });
                    if (!countDownLatch.await(1000L, TimeUnit.MILLISECONDS)) {
                        byteArrayOutputStream.close();
                        return null;
                    }
                }
                createBitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
                if (byteArrayOutputStream.size() <= 0) {
                    iLogger.c(K1.DEBUG, "Screenshot is 0 bytes, not attaching the image.", new Object[0]);
                    byteArrayOutputStream.close();
                    return null;
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                return byteArray;
            } finally {
            }
        } catch (Throwable th) {
            iLogger.b(K1.ERROR, "Taking screenshot failed.", th);
            return null;
        }
    }
}
