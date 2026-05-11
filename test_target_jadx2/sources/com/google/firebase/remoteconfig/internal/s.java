package com.google.firebase.remoteconfig.internal;

import D7.AbstractC0789m;
import D7.InterfaceC0779c;
import J8.q;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import j8.C3511e;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.conscrypt.PSKKeyManager;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class s {

    /* renamed from: t, reason: collision with root package name */
    static final int[] f28402t = {2, 4, 8, 16, 32, 64, 128, PSKKeyManager.MAX_KEY_LENGTH_BYTES};

    /* renamed from: u, reason: collision with root package name */
    private static final Pattern f28403u = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");

    /* renamed from: a, reason: collision with root package name */
    private final Set f28404a;

    /* renamed from: c, reason: collision with root package name */
    private int f28406c;

    /* renamed from: f, reason: collision with root package name */
    private HttpURLConnection f28409f;

    /* renamed from: g, reason: collision with root package name */
    private com.google.firebase.remoteconfig.internal.b f28410g;

    /* renamed from: i, reason: collision with root package name */
    private final ScheduledExecutorService f28412i;

    /* renamed from: j, reason: collision with root package name */
    private final m f28413j;

    /* renamed from: k, reason: collision with root package name */
    private final C3511e f28414k;

    /* renamed from: l, reason: collision with root package name */
    private final B8.f f28415l;

    /* renamed from: m, reason: collision with root package name */
    f f28416m;

    /* renamed from: n, reason: collision with root package name */
    private final Context f28417n;

    /* renamed from: o, reason: collision with root package name */
    private final String f28418o;

    /* renamed from: r, reason: collision with root package name */
    private final t f28421r;

    /* renamed from: h, reason: collision with root package name */
    private final int f28411h = 8;

    /* renamed from: b, reason: collision with root package name */
    private boolean f28405b = false;

    /* renamed from: p, reason: collision with root package name */
    private final Random f28419p = new Random();

    /* renamed from: q, reason: collision with root package name */
    private final com.google.android.gms.common.util.f f28420q = com.google.android.gms.common.util.i.d();

    /* renamed from: d, reason: collision with root package name */
    private boolean f28407d = false;

    /* renamed from: e, reason: collision with root package name */
    private boolean f28408e = false;

    /* renamed from: s, reason: collision with root package name */
    private final Object f28422s = new Object();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            s.this.e();
        }
    }

    public s(C3511e c3511e, B8.f fVar, m mVar, f fVar2, Context context, String str, Set set, t tVar, ScheduledExecutorService scheduledExecutorService) {
        this.f28404a = set;
        this.f28412i = scheduledExecutorService;
        this.f28406c = Math.max(8 - tVar.j().b(), 1);
        this.f28414k = c3511e;
        this.f28413j = mVar;
        this.f28415l = fVar;
        this.f28416m = fVar2;
        this.f28417n = context;
        this.f28418o = str;
        this.f28421r = tVar;
    }

    private synchronized void A(boolean z10) {
        this.f28405b = z10;
    }

    private void F(Date date) {
        int b10 = this.f28421r.j().b() + 1;
        this.f28421r.s(b10, new Date(date.getTime() + o(b10)));
    }

    private synchronized boolean f() {
        boolean z10;
        if (!this.f28404a.isEmpty() && !this.f28405b && !this.f28407d) {
            z10 = this.f28408e ? false : true;
        }
        return z10;
    }

    private synchronized boolean g() {
        boolean f10;
        f10 = f();
        if (f10) {
            A(true);
        }
        return f10;
    }

    private void h(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e10) {
                Log.d("FirebaseRemoteConfig", "Error closing connection stream.", e10);
            }
        }
    }

    private JSONObject k(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("project", m(this.f28414k.q().c()));
        hashMap.put("namespace", this.f28418o);
        hashMap.put("lastKnownVersionNumber", Long.toString(this.f28413j.r()));
        hashMap.put("appId", this.f28414k.q().c());
        hashMap.put("sdkVersion", "23.0.1");
        hashMap.put("appInstanceId", str);
        return new JSONObject(hashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void l() {
        this.f28407d = true;
    }

    private static String m(String str) {
        Matcher matcher = f28403u.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return null;
    }

    private String n() {
        try {
            Context context = this.f28417n;
            byte[] a10 = com.google.android.gms.common.util.a.a(context, context.getPackageName());
            if (a10 != null) {
                return com.google.android.gms.common.util.k.b(a10, false);
            }
            Log.e("FirebaseRemoteConfig", "Could not get fingerprint hash for package: " + this.f28417n.getPackageName());
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.i("FirebaseRemoteConfig", "No such package: " + this.f28417n.getPackageName());
            return null;
        }
    }

    private long o(int i10) {
        int length = f28402t.length;
        if (i10 >= length) {
            i10 = length;
        }
        return (TimeUnit.MINUTES.toMillis(r0[i10 - 1]) / 2) + this.f28419p.nextInt((int) r0);
    }

    private String p(String str) {
        return String.format("https://firebaseremoteconfigrealtime.googleapis.com/v1/projects/%s/namespaces/%s:streamFetchInvalidations", m(this.f28414k.q().c()), str);
    }

    private URL q() {
        try {
            return new URL(p(this.f28418o));
        } catch (MalformedURLException unused) {
            Log.e("FirebaseRemoteConfig", "URL is malformed");
            return null;
        }
    }

    private boolean r(int i10) {
        return i10 == 408 || i10 == 429 || i10 == 502 || i10 == 503 || i10 == 504;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00be A[Catch: all -> 0x0041, TryCatch #0 {all -> 0x0041, blocks: (B:30:0x002d, B:33:0x00ba, B:35:0x00be, B:51:0x00c2), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c2 A[Catch: all -> 0x0041, TRY_LEAVE, TryCatch #0 {all -> 0x0041, blocks: (B:30:0x002d, B:33:0x00ba, B:35:0x00be, B:51:0x00c2), top: B:2:0x0009 }] */
    /* JADX WARN: Type inference failed for: r10v0, types: [com.google.firebase.remoteconfig.internal.s] */
    /* JADX WARN: Type inference failed for: r11v0, types: [com.google.android.gms.tasks.Task] */
    /* JADX WARN: Type inference failed for: r11v17, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v33, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v43 */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Integer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Integer, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ Task s(Task task, Task task2) {
        InputStream inputStream;
        Integer num;
        Throwable th;
        ?? r72;
        J8.t tVar;
        int responseCode;
        try {
            try {
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e10) {
            e = e10;
            task = 0;
            inputStream = null;
        } catch (Throwable th3) {
            inputStream = null;
            num = null;
            th = th3;
            task = 0;
        }
        if (!task.isSuccessful()) {
            throw new IOException(task.getException());
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) task.getResult();
        this.f28409f = httpURLConnection;
        task = httpURLConnection.getInputStream();
        try {
            inputStream = this.f28409f.getErrorStream();
            try {
                responseCode = this.f28409f.getResponseCode();
                r72 = Integer.valueOf(responseCode);
                if (responseCode == 200) {
                    try {
                        x();
                        this.f28421r.l();
                        com.google.firebase.remoteconfig.internal.b D10 = D(this.f28409f);
                        this.f28410g = D10;
                        D10.i();
                    } catch (IOException e11) {
                        e = e11;
                        if (this.f28408e) {
                            Log.d("FirebaseRemoteConfig", "Exception connecting to real-time RC backend. Retrying the connection...", e);
                        } else {
                            x();
                        }
                        i(task, inputStream);
                        A(false);
                        if (!this.f28408e || (r72 != 0 && !r(r72.intValue()))) {
                            r1 = false;
                        }
                        if (r1) {
                            F(new Date(this.f28420q.a()));
                        }
                        if (!r1 && r72.intValue() != 200) {
                            String format = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", r72);
                            if (r72.intValue() == 403) {
                                format = v(this.f28409f.getErrorStream());
                            }
                            tVar = new J8.t(r72.intValue(), format, q.a.CONFIG_UPDATE_STREAM_ERROR);
                            w(tVar);
                            this.f28409f = null;
                            this.f28410g = null;
                            return AbstractC0789m.g(null);
                        }
                        y();
                        this.f28409f = null;
                        this.f28410g = null;
                        return AbstractC0789m.g(null);
                    }
                }
                i(task, inputStream);
                A(false);
                r1 = !this.f28408e && r(responseCode);
                if (r1) {
                    F(new Date(this.f28420q.a()));
                }
            } catch (IOException e12) {
                e = e12;
                r72 = 0;
            } catch (Throwable th4) {
                num = null;
                th = th4;
                i(task, inputStream);
                A(false);
                if (this.f28408e || (num != null && !r(num.intValue()))) {
                    r1 = false;
                }
                if (r1) {
                    F(new Date(this.f28420q.a()));
                }
                if (r1 || num.intValue() == 200) {
                    y();
                } else {
                    String format2 = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", num);
                    if (num.intValue() == 403) {
                        format2 = v(this.f28409f.getErrorStream());
                    }
                    w(new J8.t(num.intValue(), format2, q.a.CONFIG_UPDATE_STREAM_ERROR));
                }
                throw th;
            }
        } catch (IOException e13) {
            e = e13;
            inputStream = null;
            task = task;
            r72 = inputStream;
            if (this.f28408e) {
            }
            i(task, inputStream);
            A(false);
            if (!this.f28408e) {
            }
            r1 = false;
            if (r1) {
            }
            if (!r1) {
                String format3 = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", r72);
                if (r72.intValue() == 403) {
                }
                tVar = new J8.t(r72.intValue(), format3, q.a.CONFIG_UPDATE_STREAM_ERROR);
                w(tVar);
                this.f28409f = null;
                this.f28410g = null;
                return AbstractC0789m.g(null);
            }
            y();
            this.f28409f = null;
            this.f28410g = null;
            return AbstractC0789m.g(null);
        } catch (Throwable th5) {
            num = null;
            th = th5;
            inputStream = null;
        }
        if (!r1 && responseCode != 200) {
            String format4 = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", r72);
            if (responseCode == 403) {
                format4 = v(this.f28409f.getErrorStream());
            }
            tVar = new J8.t(responseCode, format4, q.a.CONFIG_UPDATE_STREAM_ERROR);
            w(tVar);
            this.f28409f = null;
            this.f28410g = null;
            return AbstractC0789m.g(null);
        }
        y();
        this.f28409f = null;
        this.f28410g = null;
        return AbstractC0789m.g(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task t(Task task, Task task2, Task task3) {
        if (!task.isSuccessful()) {
            return AbstractC0789m.f(new J8.p("Firebase Installations failed to get installation auth token for config update listener connection.", task.getException()));
        }
        if (!task2.isSuccessful()) {
            return AbstractC0789m.f(new J8.p("Firebase Installations failed to get installation ID for config update listener connection.", task2.getException()));
        }
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) q().openConnection();
            C(httpURLConnection, (String) task2.getResult(), ((com.google.firebase.installations.g) task.getResult()).b());
            return AbstractC0789m.g(httpURLConnection);
        } catch (IOException e10) {
            return AbstractC0789m.f(new J8.p("Failed to open HTTP stream connection", e10));
        }
    }

    private synchronized void u(long j10) {
        try {
            if (f()) {
                int i10 = this.f28406c;
                if (i10 > 0) {
                    this.f28406c = i10 - 1;
                    this.f28412i.schedule(new a(), j10, TimeUnit.MILLISECONDS);
                } else if (!this.f28408e) {
                    w(new J8.p("Unable to connect to the server. Check your connection and try again.", q.a.CONFIG_UPDATE_STREAM_ERROR));
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private String v(InputStream inputStream) {
        StringBuilder sb2 = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb2.append(readLine);
            }
        } catch (IOException unused) {
            if (sb2.length() == 0) {
                return "Unable to connect to the server, access is forbidden. HTTP status code: 403";
            }
        }
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void w(J8.q qVar) {
        Iterator it = this.f28404a.iterator();
        while (it.hasNext()) {
            ((J8.c) it.next()).b(qVar);
        }
    }

    private synchronized void x() {
        this.f28406c = 8;
    }

    private void z(HttpURLConnection httpURLConnection, String str) {
        httpURLConnection.setRequestProperty("X-Goog-Firebase-Installations-Auth", str);
        httpURLConnection.setRequestProperty("X-Goog-Api-Key", this.f28414k.q().b());
        httpURLConnection.setRequestProperty("X-Android-Package", this.f28417n.getPackageName());
        httpURLConnection.setRequestProperty("X-Android-Cert", n());
        httpURLConnection.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
        httpURLConnection.setRequestProperty("X-Accept-Response-Streaming", "true");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept", "application/json");
    }

    public void B(boolean z10) {
        HttpURLConnection httpURLConnection;
        synchronized (this.f28422s) {
            try {
                this.f28408e = z10;
                com.google.firebase.remoteconfig.internal.b bVar = this.f28410g;
                if (bVar != null) {
                    bVar.l(z10);
                }
                if (Build.VERSION.SDK_INT >= 26 && z10 && (httpURLConnection = this.f28409f) != null) {
                    httpURLConnection.disconnect();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void C(HttpURLConnection httpURLConnection, String str, String str2) {
        httpURLConnection.setRequestMethod("POST");
        z(httpURLConnection, str2);
        byte[] bytes = k(str).toString().getBytes("utf-8");
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bytes);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    public synchronized com.google.firebase.remoteconfig.internal.b D(HttpURLConnection httpURLConnection) {
        return new com.google.firebase.remoteconfig.internal.b(httpURLConnection, this.f28413j, this.f28416m, this.f28404a, new b(), this.f28412i, this.f28421r);
    }

    public void E() {
        u(0L);
    }

    public void e() {
        if (g()) {
            if (new Date(this.f28420q.a()).before(this.f28421r.j().a())) {
                y();
            } else {
                final Task j10 = j();
                AbstractC0789m.k(j10).i(this.f28412i, new InterfaceC0779c() { // from class: com.google.firebase.remoteconfig.internal.q
                    @Override // D7.InterfaceC0779c
                    public final Object a(Task task) {
                        Task s10;
                        s10 = s.this.s(j10, task);
                        return s10;
                    }
                });
            }
        }
    }

    public void i(InputStream inputStream, InputStream inputStream2) {
        HttpURLConnection httpURLConnection = this.f28409f;
        if (httpURLConnection != null && !this.f28408e) {
            httpURLConnection.disconnect();
        }
        h(inputStream);
        h(inputStream2);
    }

    public Task j() {
        final Task a10 = this.f28415l.a(false);
        final Task id2 = this.f28415l.getId();
        return AbstractC0789m.k(a10, id2).j(this.f28412i, new InterfaceC0779c() { // from class: com.google.firebase.remoteconfig.internal.r
            @Override // D7.InterfaceC0779c
            public final Object a(Task task) {
                Task t10;
                t10 = s.this.t(a10, id2, task);
                return t10;
            }
        });
    }

    public synchronized void y() {
        u(Math.max(0L, this.f28421r.j().a().getTime() - new Date(this.f28420q.a()).getTime()));
    }

    class b implements J8.c {
        b() {
        }

        @Override // J8.c
        public void b(J8.q qVar) {
            s.this.l();
            s.this.w(qVar);
        }

        @Override // J8.c
        public void a(J8.b bVar) {
        }
    }
}
