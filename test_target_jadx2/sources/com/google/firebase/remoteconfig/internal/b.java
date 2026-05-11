package com.google.firebase.remoteconfig.internal;

import D7.AbstractC0789m;
import D7.InterfaceC0779c;
import J8.q;
import android.util.Log;
import co.hyperverge.hypersnapsdk.service.framerecorder.HVFrameRecorder;
import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.internal.m;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.conscrypt.BuildConfig;
import org.json.JSONException;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final Set f28308a;

    /* renamed from: b, reason: collision with root package name */
    private final HttpURLConnection f28309b;

    /* renamed from: c, reason: collision with root package name */
    private final m f28310c;

    /* renamed from: d, reason: collision with root package name */
    private final f f28311d;

    /* renamed from: e, reason: collision with root package name */
    private final J8.c f28312e;

    /* renamed from: f, reason: collision with root package name */
    private final ScheduledExecutorService f28313f;

    /* renamed from: i, reason: collision with root package name */
    private final t f28316i;

    /* renamed from: g, reason: collision with root package name */
    private final Random f28314g = new Random();

    /* renamed from: j, reason: collision with root package name */
    private boolean f28317j = false;

    /* renamed from: h, reason: collision with root package name */
    private final com.google.android.gms.common.util.f f28315h = com.google.android.gms.common.util.i.d();

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f28318a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f28319b;

        a(int i10, long j10) {
            this.f28318a = i10;
            this.f28319b = j10;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.d(this.f28318a, this.f28319b);
        }
    }

    public b(HttpURLConnection httpURLConnection, m mVar, f fVar, Set set, J8.c cVar, ScheduledExecutorService scheduledExecutorService, t tVar) {
        this.f28309b = httpURLConnection;
        this.f28310c = mVar;
        this.f28311d = fVar;
        this.f28308a = set;
        this.f28312e = cVar;
        this.f28313f = scheduledExecutorService;
        this.f28316i = tVar;
    }

    private void b(int i10, long j10) {
        if (i10 == 0) {
            k(new J8.t("Unable to fetch the latest version of the template.", q.a.CONFIG_UPDATE_NOT_FETCHED));
        } else {
            this.f28313f.schedule(new a(i10, j10), this.f28314g.nextInt(4), TimeUnit.SECONDS);
        }
    }

    private synchronized void c(J8.b bVar) {
        Iterator it = this.f28308a.iterator();
        while (it.hasNext()) {
            ((J8.c) it.next()).a(bVar);
        }
    }

    private static Boolean e(m.a aVar, long j10) {
        if (aVar.d() != null) {
            return Boolean.valueOf(aVar.d().k() >= j10);
        }
        return Boolean.valueOf(aVar.f() == 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003d, code lost:
    
        r5 = new org.json.JSONObject(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0046, code lost:
    
        if (r5.has("featureDisabled") == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
    
        if (r5.getBoolean("featureDisabled") == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004e, code lost:
    
        r10.f28312e.b(new J8.t("The server is temporarily unavailable. Try again in a few minutes.", J8.q.a.CONFIG_UPDATE_UNAVAILABLE));
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0063, code lost:
    
        if (g() == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006a, code lost:
    
        if (r5.has("latestTemplateVersionNumber") == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006c, code lost:
    
        r6 = r10.f28310c.r();
        r8 = r5.getLong("latestTemplateVersionNumber");
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0078, code lost:
    
        if (r8 <= r6) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007a, code lost:
    
        b(3, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0082, code lost:
    
        if (r5.has("retryIntervalSeconds") == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0084, code lost:
    
        m(r5.getInt("retryIntervalSeconds"));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void f(InputStream inputStream) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "utf-8"));
        loop0: while (true) {
            String str = BuildConfig.FLAVOR;
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break loop0;
                }
                str = str + readLine;
                if (readLine.contains("}")) {
                    str = j(str);
                    if (!str.isEmpty()) {
                        try {
                            break;
                        } catch (JSONException e10) {
                            k(new J8.p("Unable to parse config update message.", e10.getCause(), q.a.CONFIG_UPDATE_MESSAGE_INVALID));
                            Log.e("FirebaseRemoteConfig", "Unable to parse latest config update message.", e10);
                        }
                    }
                }
            }
        }
        bufferedReader.close();
    }

    private synchronized boolean g() {
        return this.f28308a.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task h(Task task, Task task2, long j10, int i10, Task task3) {
        if (!task.isSuccessful()) {
            return AbstractC0789m.f(new J8.p("Failed to auto-fetch config update.", task.getException()));
        }
        if (!task2.isSuccessful()) {
            return AbstractC0789m.f(new J8.p("Failed to get activated config for auto-fetch", task2.getException()));
        }
        m.a aVar = (m.a) task.getResult();
        g gVar = (g) task2.getResult();
        if (!e(aVar, j10).booleanValue()) {
            Log.d("FirebaseRemoteConfig", "Fetched template version is the same as SDK's current version. Retrying fetch.");
            b(i10, j10);
            return AbstractC0789m.g(null);
        }
        if (aVar.d() == null) {
            Log.d("FirebaseRemoteConfig", "The fetch succeeded, but the backend had no updates.");
            return AbstractC0789m.g(null);
        }
        if (gVar == null) {
            gVar = g.l().a();
        }
        Set f10 = gVar.f(aVar.d());
        if (f10.isEmpty()) {
            Log.d("FirebaseRemoteConfig", "Config was fetched, but no params changed.");
            return AbstractC0789m.g(null);
        }
        c(J8.b.a(f10));
        return AbstractC0789m.g(null);
    }

    private String j(String str) {
        int indexOf = str.indexOf(123);
        int lastIndexOf = str.lastIndexOf(HVFrameRecorder.FRAME_DURATION);
        return (indexOf < 0 || lastIndexOf < 0 || indexOf >= lastIndexOf) ? BuildConfig.FLAVOR : str.substring(indexOf, lastIndexOf + 1);
    }

    private synchronized void k(J8.q qVar) {
        Iterator it = this.f28308a.iterator();
        while (it.hasNext()) {
            ((J8.c) it.next()).b(qVar);
        }
    }

    private synchronized void m(int i10) {
        this.f28316i.r(new Date(new Date(this.f28315h.a()).getTime() + (i10 * 1000)));
    }

    public synchronized Task d(int i10, final long j10) {
        final int i11;
        final Task n10;
        final Task e10;
        i11 = i10 - 1;
        n10 = this.f28310c.n(m.b.REALTIME, 3 - i11);
        e10 = this.f28311d.e();
        return AbstractC0789m.k(n10, e10).j(this.f28313f, new InterfaceC0779c() { // from class: com.google.firebase.remoteconfig.internal.a
            @Override // D7.InterfaceC0779c
            public final Object a(Task task) {
                Task h10;
                h10 = b.this.h(n10, e10, j10, i11, task);
                return h10;
            }
        });
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0018 -> B:11:0x002d). Please report as a decompilation issue!!! */
    public void i() {
        HttpURLConnection httpURLConnection = this.f28309b;
        if (httpURLConnection == null) {
            return;
        }
        InputStream inputStream = null;
        try {
            try {
                try {
                    inputStream = httpURLConnection.getInputStream();
                    f(inputStream);
                    if (inputStream != null) {
                        inputStream.close();
                    }
                } catch (IOException e10) {
                    Log.d("FirebaseRemoteConfig", "Exception thrown when closing connection stream. Retrying connection...", e10);
                }
            } catch (IOException e11) {
                if (!this.f28317j) {
                    Log.d("FirebaseRemoteConfig", "Real-time connection was closed due to an exception.", e11);
                }
                if (inputStream == null) {
                } else {
                    inputStream.close();
                }
            }
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    inputStream.close();
                } catch (IOException e12) {
                    Log.d("FirebaseRemoteConfig", "Exception thrown when closing connection stream. Retrying connection...", e12);
                }
            }
            throw th;
        }
    }

    public void l(boolean z10) {
        this.f28317j = z10;
    }
}
