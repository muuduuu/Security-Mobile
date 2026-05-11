package Y5;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f12011a = a();

    /* renamed from: b, reason: collision with root package name */
    private final a f12012b;

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f12013a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f12014b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f12015c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f12016d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f12017e;

        /* renamed from: f, reason: collision with root package name */
        private final boolean f12018f;

        /* renamed from: g, reason: collision with root package name */
        private final boolean f12019g;

        /* renamed from: h, reason: collision with root package name */
        private final boolean f12020h;

        /* renamed from: i, reason: collision with root package name */
        private final boolean f12021i;

        a(Context context) {
            Z9.b bVar = new Z9.b(context);
            bVar.q(false);
            this.f12013a = bVar.k();
            this.f12014b = bVar.i();
            this.f12015c = bVar.g();
            this.f12016d = bVar.c();
            this.f12017e = bVar.e();
            this.f12018f = bVar.m();
            this.f12019g = bVar.h();
            this.f12020h = bVar.f();
            this.f12021i = bVar.d();
        }

        public boolean a() {
            return this.f12013a || this.f12014b || this.f12015c || this.f12016d || this.f12017e || this.f12018f || this.f12019g || this.f12020h || this.f12021i;
        }

        public Map b() {
            HashMap hashMap = new HashMap();
            hashMap.put("detectRootManagementApps", Boolean.valueOf(this.f12013a));
            hashMap.put("detectPotentiallyDangerousApps", Boolean.valueOf(this.f12014b));
            hashMap.put("checkForSuBinary", Boolean.valueOf(this.f12015c));
            hashMap.put("checkForDangerousProps", Boolean.valueOf(this.f12016d));
            hashMap.put("checkForRWPaths", Boolean.valueOf(this.f12017e));
            hashMap.put("detectTestKeys", Boolean.valueOf(this.f12018f));
            hashMap.put("checkSuExists", Boolean.valueOf(this.f12019g));
            hashMap.put("checkForRootNative", Boolean.valueOf(this.f12020h));
            hashMap.put("checkForMagiskBinary", Boolean.valueOf(this.f12021i));
            return hashMap;
        }
    }

    public c(Context context) {
        this.f12012b = new a(context);
    }

    private static boolean a() {
        return new b().a();
    }

    public Map b() {
        HashMap hashMap = new HashMap();
        hashMap.put("jailMonkey", Boolean.valueOf(this.f12011a));
        hashMap.put("rootBeer", this.f12012b.b());
        return hashMap;
    }

    public boolean c() {
        return this.f12011a || this.f12012b.a();
    }
}
