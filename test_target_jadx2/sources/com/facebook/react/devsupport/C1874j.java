package com.facebook.react.devsupport;

import Td.B;
import Td.D;
import Td.InterfaceC1229e;
import Td.InterfaceC1230f;
import V4.e;
import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import android.provider.Settings;
import c3.AbstractC1721a;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.devsupport.C1865a;
import g5.C3193c;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.conscrypt.BuildConfig;

/* renamed from: com.facebook.react.devsupport.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1874j {

    /* renamed from: a, reason: collision with root package name */
    private final P4.a f21627a;

    /* renamed from: b, reason: collision with root package name */
    private final V4.d f21628b;

    /* renamed from: c, reason: collision with root package name */
    private final Td.B f21629c;

    /* renamed from: d, reason: collision with root package name */
    private final C1865a f21630d;

    /* renamed from: e, reason: collision with root package name */
    private final X f21631e;

    /* renamed from: f, reason: collision with root package name */
    private final Context f21632f;

    /* renamed from: g, reason: collision with root package name */
    private final String f21633g;

    /* renamed from: h, reason: collision with root package name */
    private V4.b f21634h;

    /* renamed from: i, reason: collision with root package name */
    private N f21635i;

    /* renamed from: com.facebook.react.devsupport.j$a */
    class a extends AsyncTask {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ h f21636a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f21637b;

        /* renamed from: com.facebook.react.devsupport.j$a$a, reason: collision with other inner class name */
        class C0378a extends V4.c {
            C0378a() {
            }

            @Override // V4.f
            public void b(Object obj) {
                a.this.f21636a.c();
            }
        }

        /* renamed from: com.facebook.react.devsupport.j$a$b */
        class b extends V4.c {
            b() {
            }

            @Override // V4.f
            public void b(Object obj) {
                a.this.f21636a.b();
            }
        }

        /* renamed from: com.facebook.react.devsupport.j$a$c */
        class c extends V4.g {
            c() {
            }

            @Override // V4.f
            public void a(Object obj, V4.h hVar) {
                a.this.f21636a.e(hVar);
            }
        }

        /* renamed from: com.facebook.react.devsupport.j$a$d */
        class d implements e.b {
            d() {
            }

            @Override // V4.e.b
            public void a() {
                a.this.f21636a.d();
            }

            @Override // V4.e.b
            public void b() {
                a.this.f21636a.a();
            }
        }

        a(h hVar, String str) {
            this.f21636a = hVar;
            this.f21637b = str;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Void... voidArr) {
            HashMap hashMap = new HashMap();
            hashMap.put("reload", new C0378a());
            hashMap.put("devMenu", new b());
            hashMap.put("captureHeap", new c());
            Map f10 = this.f21636a.f();
            if (f10 != null) {
                hashMap.putAll(f10);
            }
            hashMap.putAll(new V4.a().d());
            d dVar = new d();
            C1874j.this.f21634h = new V4.b(this.f21637b, C1874j.this.f21628b, hashMap, dVar);
            C1874j.this.f21634h.f();
            return null;
        }
    }

    /* renamed from: com.facebook.react.devsupport.j$b */
    class b extends AsyncTask {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Void... voidArr) {
            if (C1874j.this.f21634h != null) {
                C1874j.this.f21634h.e();
                C1874j.this.f21634h = null;
            }
            return null;
        }
    }

    /* renamed from: com.facebook.react.devsupport.j$c */
    class c extends AsyncTask {
        c() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Void... voidArr) {
            if (InspectorFlags.getFuseboxEnabled()) {
                C1874j.this.f21635i = new CxxInspectorPackagerConnection(C1874j.this.s(), C1874j.this.f21633g);
            } else {
                C1874j c1874j = C1874j.this;
                c1874j.f21635i = new O(c1874j.s(), C1874j.this.f21633g);
            }
            C1874j.this.f21635i.connect();
            return null;
        }
    }

    /* renamed from: com.facebook.react.devsupport.j$d */
    class d extends AsyncTask {
        d() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Void... voidArr) {
            if (C1874j.this.f21635i != null) {
                C1874j.this.f21635i.closeQuietly();
                C1874j.this.f21635i = null;
            }
            return null;
        }
    }

    /* renamed from: com.facebook.react.devsupport.j$g */
    private enum g {
        BUNDLE("bundle"),
        MAP("map");

        private final String mTypeID;

        g(String str) {
            this.mTypeID = str;
        }

        public String typeID() {
            return this.mTypeID;
        }
    }

    /* renamed from: com.facebook.react.devsupport.j$h */
    public interface h {
        void a();

        void b();

        void c();

        void d();

        void e(V4.h hVar);

        Map f();
    }

    public C1874j(P4.a aVar, Context context, V4.d dVar) {
        this.f21627a = aVar;
        this.f21628b = dVar;
        B.a aVar2 = new B.a();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        Td.B c10 = aVar2.g(5000L, timeUnit).d0(0L, timeUnit).i0(0L, timeUnit).c();
        this.f21629c = c10;
        this.f21630d = new C1865a(c10);
        this.f21631e = new X(c10);
        this.f21632f = context;
        this.f21633g = context.getPackageName();
    }

    private String j(String str, g gVar) {
        return k(str, gVar, this.f21628b.b());
    }

    private String k(String str, g gVar, String str2) {
        return l(str, gVar, str2, false, true);
    }

    private String l(String str, g gVar, String str2, boolean z10, boolean z11) {
        boolean p10 = p();
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry entry : this.f21628b.a().entrySet()) {
            if (((String) entry.getValue()).length() != 0) {
                sb2.append("&" + ((String) entry.getKey()) + "=" + Uri.encode((String) entry.getValue()));
            }
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(String.format(Locale.US, "http://%s/%s.%s?platform=android&dev=%s&lazy=%s&minify=%s&app=%s&modulesOnly=%s&runModule=%s", str2, str, gVar.typeID(), Boolean.valueOf(p10), Boolean.valueOf(p10), Boolean.valueOf(t()), this.f21633g, z10 ? "true" : "false", z11 ? "true" : "false"));
        sb3.append(InspectorFlags.getFuseboxEnabled() ? "&excludeSource=true&sourcePaths=url-server" : BuildConfig.FLAVOR);
        sb3.append(sb2.toString());
        return sb3.toString();
    }

    private String m() {
        return String.format(Locale.US, "http://%s/launch-js-devtools", this.f21628b.b());
    }

    private boolean p() {
        return this.f21627a.h();
    }

    private String r() {
        return u(String.format(Locale.US, "android-%s-%s-%s", this.f21633g, Settings.Secure.getString(this.f21632f.getContentResolver(), "android_id"), InspectorFlags.getFuseboxEnabled() ? "fusebox" : "legacy"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String s() {
        return String.format(Locale.US, "http://%s/inspector/device?name=%s&app=%s&device=%s", this.f21628b.b(), Uri.encode(S4.a.d()), Uri.encode(this.f21633g), Uri.encode(r()));
    }

    private boolean t() {
        return this.f21627a.d();
    }

    private static String u(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.reset();
            try {
                byte[] digest = messageDigest.digest(str.getBytes("UTF-8"));
                return String.format("%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x", Byte.valueOf(digest[0]), Byte.valueOf(digest[1]), Byte.valueOf(digest[2]), Byte.valueOf(digest[3]), Byte.valueOf(digest[4]), Byte.valueOf(digest[5]), Byte.valueOf(digest[6]), Byte.valueOf(digest[7]), Byte.valueOf(digest[8]), Byte.valueOf(digest[9]), Byte.valueOf(digest[10]), Byte.valueOf(digest[11]), Byte.valueOf(digest[12]), Byte.valueOf(digest[13]), Byte.valueOf(digest[14]), Byte.valueOf(digest[15]), Byte.valueOf(digest[16]), Byte.valueOf(digest[17]), Byte.valueOf(digest[18]), Byte.valueOf(digest[19]));
            } catch (UnsupportedEncodingException e10) {
                throw new AssertionError("This environment doesn't support UTF-8 encoding", e10);
            }
        } catch (NoSuchAlgorithmException e11) {
            throw new AssertionError("Could not get standard SHA-256 algorithm", e11);
        }
    }

    public void A(String str, h hVar) {
        if (this.f21634h != null) {
            AbstractC1721a.J("ReactNative", "Packager connection already open, nooping.");
        } else {
            new a(hVar, str).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    public void h() {
        new d().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public void i() {
        new b().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public void n() {
        N n10 = this.f21635i;
        if (n10 != null) {
            n10.sendEventToAllConnections("{ \"id\":1,\"method\":\"Debugger.disable\" }");
        }
    }

    public void o(C4.b bVar, File file, String str, C1865a.c cVar) {
        this.f21630d.e(bVar, file, str, cVar);
    }

    public String q(String str) {
        return k(str, g.BUNDLE, this.f21628b.b());
    }

    public String v(String str) {
        return j(str, g.BUNDLE);
    }

    public void w(C4.g gVar) {
        String b10 = this.f21628b.b();
        if (b10 != null) {
            this.f21631e.b(b10, gVar);
        } else {
            AbstractC1721a.J("ReactNative", "No packager host configured.");
            gVar.a(false);
        }
    }

    public void x() {
        this.f21629c.a(new D.a().x(m()).b()).g1(new e());
    }

    public void y(ReactContext reactContext, String str) {
        this.f21629c.a(new D.a().x(String.format(Locale.US, "http://%s/open-debugger?appId=%s&device=%s", this.f21628b.b(), Uri.encode(this.f21633g), Uri.encode(r()))).n("POST", Td.E.create((Td.z) null, BuildConfig.FLAVOR)).b()).g1(new f(reactContext, str));
    }

    public void z() {
        if (this.f21635i != null) {
            AbstractC1721a.J("ReactNative", "Inspector connection already open, nooping.");
        } else {
            new c().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    /* renamed from: com.facebook.react.devsupport.j$e */
    class e implements InterfaceC1230f {
        e() {
        }

        @Override // Td.InterfaceC1230f
        public void c(InterfaceC1229e interfaceC1229e, Td.F f10) {
        }

        @Override // Td.InterfaceC1230f
        public void d(InterfaceC1229e interfaceC1229e, IOException iOException) {
        }
    }

    /* renamed from: com.facebook.react.devsupport.j$f */
    class f implements InterfaceC1230f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ReactContext f21647a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f21648b;

        f(ReactContext reactContext, String str) {
            this.f21647a = reactContext;
            this.f21648b = str;
        }

        @Override // Td.InterfaceC1230f
        public void d(InterfaceC1229e interfaceC1229e, IOException iOException) {
            C3193c.d(this.f21647a, this.f21648b);
        }

        @Override // Td.InterfaceC1230f
        public void c(InterfaceC1229e interfaceC1229e, Td.F f10) {
        }
    }
}
