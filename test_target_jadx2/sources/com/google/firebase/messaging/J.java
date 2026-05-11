package com.google.firebase.messaging;

import D7.C0787k;
import V6.AbstractC1287s;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* loaded from: classes2.dex */
public class J implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    private final URL f28078a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Future f28079b;

    /* renamed from: c, reason: collision with root package name */
    private Task f28080c;

    private J(URL url) {
        this.f28078a = url;
    }

    private byte[] c() {
        URLConnection openConnection = this.f28078a.openConnection();
        if (openConnection.getContentLength() > 1048576) {
            throw new IOException("Content-Length exceeds max size of 1048576");
        }
        InputStream inputStream = openConnection.getInputStream();
        try {
            byte[] d10 = AbstractC2837b.d(AbstractC2837b.b(inputStream, 1048577L));
            if (inputStream != null) {
                inputStream.close();
            }
            if (Log.isLoggable("FirebaseMessaging", 2)) {
                Log.v("FirebaseMessaging", "Downloaded " + d10.length + " bytes from " + this.f28078a);
            }
            if (d10.length <= 1048576) {
                return d10;
            }
            throw new IOException("Image exceeds max size of 1048576");
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static J d(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new J(new URL(str));
        } catch (MalformedURLException unused) {
            Log.w("FirebaseMessaging", "Not downloading image, bad URL: " + str);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(C0787k c0787k) {
        try {
            c0787k.c(b());
        } catch (Exception e10) {
            c0787k.b(e10);
        }
    }

    public Bitmap b() {
        if (Log.isLoggable("FirebaseMessaging", 4)) {
            Log.i("FirebaseMessaging", "Starting download of: " + this.f28078a);
        }
        byte[] c10 = c();
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(c10, 0, c10.length);
        if (decodeByteArray == null) {
            throw new IOException("Failed to decode image: " + this.f28078a);
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Successfully downloaded image: " + this.f28078a);
        }
        return decodeByteArray;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f28079b.cancel(true);
    }

    public Task e() {
        return (Task) AbstractC1287s.m(this.f28080c);
    }

    public void g(ExecutorService executorService) {
        final C0787k c0787k = new C0787k();
        this.f28079b = executorService.submit(new Runnable() { // from class: com.google.firebase.messaging.I
            @Override // java.lang.Runnable
            public final void run() {
                J.this.f(c0787k);
            }
        });
        this.f28080c = c0787k.a();
    }
}
