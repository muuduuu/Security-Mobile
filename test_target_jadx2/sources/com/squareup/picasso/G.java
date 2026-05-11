package com.squareup.picasso;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.StatFs;
import android.provider.Settings;
import android.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.concurrent.ThreadFactory;
import org.conscrypt.BuildConfig;
import pe.C3880h;
import pe.InterfaceC3879g;

/* loaded from: classes2.dex */
abstract class G {

    /* renamed from: a, reason: collision with root package name */
    static final StringBuilder f29530a = new StringBuilder();

    /* renamed from: b, reason: collision with root package name */
    private static final C3880h f29531b = C3880h.n("RIFF");

    /* renamed from: c, reason: collision with root package name */
    private static final C3880h f29532c = C3880h.n("WEBP");

    static class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            sendMessageDelayed(obtainMessage(), 1000L);
        }
    }

    private static class b extends Thread {
        b(Runnable runnable) {
            super(runnable);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Process.setThreadPriority(10);
            super.run();
        }
    }

    static class c implements ThreadFactory {
        c() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new b(runnable);
        }
    }

    static long a(File file) {
        long j10;
        try {
            StatFs statFs = new StatFs(file.getAbsolutePath());
            j10 = (statFs.getBlockCountLong() * statFs.getBlockSizeLong()) / 50;
        } catch (IllegalArgumentException unused) {
            j10 = 5242880;
        }
        return Math.max(Math.min(j10, 52428800L), 5242880L);
    }

    static int b(Context context) {
        ActivityManager activityManager = (ActivityManager) n(context, "activity");
        return (int) ((((context.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass()) * 1048576) / 7);
    }

    static void c() {
        if (!q()) {
            throw new IllegalStateException("Method call should happen from the main thread.");
        }
    }

    static Object d(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    static File e(Context context) {
        File file = new File(context.getApplicationContext().getCacheDir(), "picasso-cache");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    static String f(x xVar) {
        StringBuilder sb2 = f29530a;
        String g10 = g(xVar, sb2);
        sb2.setLength(0);
        return g10;
    }

    static String g(x xVar, StringBuilder sb2) {
        String str = xVar.f29668f;
        if (str != null) {
            sb2.ensureCapacity(str.length() + 50);
            sb2.append(xVar.f29668f);
        } else {
            Uri uri = xVar.f29666d;
            if (uri != null) {
                String uri2 = uri.toString();
                sb2.ensureCapacity(uri2.length() + 50);
                sb2.append(uri2);
            } else {
                sb2.ensureCapacity(50);
                sb2.append(xVar.f29667e);
            }
        }
        sb2.append('\n');
        if (xVar.f29676n != 0.0f) {
            sb2.append("rotation:");
            sb2.append(xVar.f29676n);
            if (xVar.f29679q) {
                sb2.append('@');
                sb2.append(xVar.f29677o);
                sb2.append('x');
                sb2.append(xVar.f29678p);
            }
            sb2.append('\n');
        }
        if (xVar.c()) {
            sb2.append("resize:");
            sb2.append(xVar.f29670h);
            sb2.append('x');
            sb2.append(xVar.f29671i);
            sb2.append('\n');
        }
        if (xVar.f29672j) {
            sb2.append("centerCrop:");
            sb2.append(xVar.f29673k);
            sb2.append('\n');
        } else if (xVar.f29674l) {
            sb2.append("centerInside");
            sb2.append('\n');
        }
        List list = xVar.f29669g;
        if (list == null || list.size() <= 0) {
            return sb2.toString();
        }
        android.support.v4.media.session.b.a(xVar.f29669g.get(0));
        throw null;
    }

    static void h(Looper looper) {
        a aVar = new a(looper);
        aVar.sendMessageDelayed(aVar.obtainMessage(), 1000L);
    }

    static int i(Bitmap bitmap) {
        int allocationByteCount = bitmap.getAllocationByteCount();
        if (allocationByteCount >= 0) {
            return allocationByteCount;
        }
        throw new IllegalStateException("Negative size: " + bitmap);
    }

    static String j(RunnableC2926c runnableC2926c) {
        return k(runnableC2926c, BuildConfig.FLAVOR);
    }

    static String k(RunnableC2926c runnableC2926c, String str) {
        StringBuilder sb2 = new StringBuilder(str);
        AbstractC2924a h10 = runnableC2926c.h();
        if (h10 != null) {
            sb2.append(h10.f29535b.d());
        }
        List i10 = runnableC2926c.i();
        if (i10 != null) {
            int size = i10.size();
            for (int i11 = 0; i11 < size; i11++) {
                if (i11 > 0 || h10 != null) {
                    sb2.append(", ");
                }
                sb2.append(((AbstractC2924a) i10.get(i11)).f29535b.d());
            }
        }
        return sb2.toString();
    }

    static int l(Resources resources, x xVar) {
        Uri uri;
        int i10 = xVar.f29667e;
        if (i10 != 0 || (uri = xVar.f29666d) == null) {
            return i10;
        }
        String authority = uri.getAuthority();
        if (authority == null) {
            throw new FileNotFoundException("No package provided: " + xVar.f29666d);
        }
        List<String> pathSegments = xVar.f29666d.getPathSegments();
        if (pathSegments == null || pathSegments.isEmpty()) {
            throw new FileNotFoundException("No path segments: " + xVar.f29666d);
        }
        if (pathSegments.size() == 1) {
            try {
                return Integer.parseInt(pathSegments.get(0));
            } catch (NumberFormatException unused) {
                throw new FileNotFoundException("Last path segment is not a resource ID: " + xVar.f29666d);
            }
        }
        if (pathSegments.size() == 2) {
            return resources.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
        }
        throw new FileNotFoundException("More than two path segments: " + xVar.f29666d);
    }

    static Resources m(Context context, x xVar) {
        Uri uri;
        if (xVar.f29667e != 0 || (uri = xVar.f29666d) == null) {
            return context.getResources();
        }
        String authority = uri.getAuthority();
        if (authority == null) {
            throw new FileNotFoundException("No package provided: " + xVar.f29666d);
        }
        try {
            return context.getPackageManager().getResourcesForApplication(authority);
        } catch (PackageManager.NameNotFoundException unused) {
            throw new FileNotFoundException("Unable to obtain resources for package: " + xVar.f29666d);
        }
    }

    static Object n(Context context, String str) {
        return context.getSystemService(str);
    }

    static boolean o(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    static boolean p(Context context) {
        try {
            return Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0;
        } catch (NullPointerException | SecurityException unused) {
            return false;
        }
    }

    static boolean q() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    static boolean r(InterfaceC3879g interfaceC3879g) {
        return interfaceC3879g.D0(0L, f29531b) && interfaceC3879g.D0(8L, f29532c);
    }

    static void s(String str, String str2, String str3) {
        t(str, str2, str3, BuildConfig.FLAVOR);
    }

    static void t(String str, String str2, String str3, String str4) {
        Log.d("Picasso", String.format("%1$-11s %2$-12s %3$s %4$s", str, str2, str3, str4));
    }
}
