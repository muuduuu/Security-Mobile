package com.facebook.react.devsupport;

import Td.D;
import Td.InterfaceC1229e;
import Td.InterfaceC1230f;
import c3.AbstractC1721a;
import co.hyperverge.hypersnapsdk.analytics.mixpanel.Keys;
import com.facebook.react.devsupport.W;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
import pe.C3877e;
import pe.InterfaceC3879g;
import r4.AbstractC4012a;
import v4.C4927c;

/* renamed from: com.facebook.react.devsupport.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1865a {

    /* renamed from: a, reason: collision with root package name */
    private final Td.B f21562a;

    /* renamed from: b, reason: collision with root package name */
    private InterfaceC1229e f21563b;

    /* renamed from: com.facebook.react.devsupport.a$a, reason: collision with other inner class name */
    class C0377a implements InterfaceC1230f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C4.b f21564a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ File f21565b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ c f21566c;

        C0377a(C4.b bVar, File file, c cVar) {
            this.f21564a = bVar;
            this.f21565b = file;
            this.f21566c = cVar;
        }

        @Override // Td.InterfaceC1230f
        public void c(InterfaceC1229e interfaceC1229e, Td.F f10) {
            try {
                if (C1865a.this.f21563b != null && !C1865a.this.f21563b.e()) {
                    C1865a.this.f21563b = null;
                    String wVar = f10.z().n().toString();
                    Matcher matcher = Pattern.compile("multipart/mixed;.*boundary=\"([^\"]+)\"").matcher(f10.l(Keys.CONTENT_TYPE));
                    if (matcher.find()) {
                        C1865a.this.i(wVar, f10, matcher.group(1), this.f21565b, this.f21566c, this.f21564a);
                    } else {
                        Td.G b10 = f10.b();
                        try {
                            C1865a.this.h(wVar, f10.f(), f10.p(), f10.b().j(), this.f21565b, this.f21566c, this.f21564a);
                            if (b10 != null) {
                                b10.close();
                            }
                        } finally {
                        }
                    }
                    f10.close();
                    return;
                }
                C1865a.this.f21563b = null;
                if (f10 != null) {
                    f10.close();
                }
            } catch (Throwable th) {
                if (f10 != null) {
                    try {
                        f10.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }

        @Override // Td.InterfaceC1230f
        public void d(InterfaceC1229e interfaceC1229e, IOException iOException) {
            if (C1865a.this.f21563b == null || C1865a.this.f21563b.e()) {
                C1865a.this.f21563b = null;
                return;
            }
            C1865a.this.f21563b = null;
            String wVar = interfaceC1229e.t().n().toString();
            this.f21564a.b(C4927c.b(wVar, "Could not connect to development server.", "URL: " + wVar, iOException));
        }
    }

    /* renamed from: com.facebook.react.devsupport.a$b */
    class b implements W.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Td.F f21568a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f21569b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ File f21570c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ c f21571d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C4.b f21572e;

        b(Td.F f10, String str, File file, c cVar, C4.b bVar) {
            this.f21568a = f10;
            this.f21569b = str;
            this.f21570c = file;
            this.f21571d = cVar;
            this.f21572e = bVar;
        }

        @Override // com.facebook.react.devsupport.W.a
        public void a(Map map, long j10, long j11) {
            if ("application/javascript".equals(map.get("Content-Type"))) {
                this.f21572e.c("Downloading", Integer.valueOf((int) (j10 / 1024)), Integer.valueOf((int) (j11 / 1024)));
            }
        }

        @Override // com.facebook.react.devsupport.W.a
        public void b(Map map, C3877e c3877e, boolean z10) {
            if (z10) {
                int f10 = this.f21568a.f();
                if (map.containsKey("X-Http-Status")) {
                    f10 = Integer.parseInt((String) map.get("X-Http-Status"));
                }
                C1865a.this.h(this.f21569b, f10, Td.v.r(map), c3877e, this.f21570c, this.f21571d, this.f21572e);
                return;
            }
            if (map.containsKey("Content-Type") && ((String) map.get("Content-Type")).equals("application/json")) {
                try {
                    JSONObject jSONObject = new JSONObject(c3877e.F1());
                    this.f21572e.c(jSONObject.has("status") ? jSONObject.getString("status") : "Bundling", jSONObject.has("done") ? Integer.valueOf(jSONObject.getInt("done")) : null, jSONObject.has("total") ? Integer.valueOf(jSONObject.getInt("total")) : null);
                } catch (JSONException e10) {
                    AbstractC1721a.m("ReactNative", "Error parsing progress JSON. " + e10.toString());
                }
            }
        }
    }

    /* renamed from: com.facebook.react.devsupport.a$c */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        private String f21574a;

        /* renamed from: b, reason: collision with root package name */
        private int f21575b;

        public String c() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("url", this.f21574a);
                jSONObject.put("filesChangedCount", this.f21575b);
                return jSONObject.toString();
            } catch (JSONException e10) {
                AbstractC1721a.n("BundleDownloader", "Can't serialize bundle info: ", e10);
                return null;
            }
        }
    }

    public C1865a(Td.B b10) {
        this.f21562a = b10;
    }

    private static void g(String str, Td.v vVar, c cVar) {
        cVar.f21574a = str;
        String c10 = vVar.c("X-Metro-Files-Changed-Count");
        if (c10 != null) {
            try {
                cVar.f21575b = Integer.parseInt(c10);
            } catch (NumberFormatException unused) {
                cVar.f21575b = -2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(String str, int i10, Td.v vVar, InterfaceC3879g interfaceC3879g, File file, c cVar, C4.b bVar) {
        if (i10 != 200) {
            String F12 = interfaceC3879g.F1();
            C4927c d10 = C4927c.d(str, F12);
            if (d10 != null) {
                bVar.b(d10);
                return;
            }
            bVar.b(new C4927c("The development server returned response error code: " + i10 + "\n\nURL: " + str + "\n\nBody:\n" + F12));
            return;
        }
        if (cVar != null) {
            g(str, vVar, cVar);
        }
        File file2 = new File(file.getPath() + ".tmp");
        if (!j(interfaceC3879g, file2) || file2.renameTo(file)) {
            bVar.onSuccess();
            return;
        }
        throw new IOException("Couldn't rename " + file2 + " to " + file);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(String str, Td.F f10, String str2, File file, c cVar, C4.b bVar) {
        if (new W(f10.b().j(), str2).d(new b(f10, str, file, cVar, bVar))) {
            return;
        }
        bVar.b(new C4927c("Error while reading multipart response.\n\nResponse code: " + f10.f() + "\n\nURL: " + str.toString() + "\n\n"));
    }

    private static boolean j(InterfaceC3879g interfaceC3879g, File file) {
        pe.Z z10;
        try {
            z10 = pe.M.e(file);
        } catch (Throwable th) {
            th = th;
            z10 = null;
        }
        try {
            interfaceC3879g.J1(z10);
            if (z10 == null) {
                return true;
            }
            z10.close();
            return true;
        } catch (Throwable th2) {
            th = th2;
            if (z10 != null) {
                z10.close();
            }
            throw th;
        }
    }

    public void e(C4.b bVar, File file, String str, c cVar) {
        f(bVar, file, str, cVar, new D.a());
    }

    public void f(C4.b bVar, File file, String str, c cVar, D.a aVar) {
        InterfaceC1229e interfaceC1229e = (InterfaceC1229e) AbstractC4012a.c(this.f21562a.a(aVar.x(str).a("Accept", "multipart/mixed").b()));
        this.f21563b = interfaceC1229e;
        interfaceC1229e.g1(new C0377a(bVar, file, cVar));
    }
}
