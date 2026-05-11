package j8;

import V6.AbstractC1286q;
import V6.AbstractC1287s;
import V6.C1290v;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.util.q;

/* renamed from: j8.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3517k {

    /* renamed from: a, reason: collision with root package name */
    private final String f35911a;

    /* renamed from: b, reason: collision with root package name */
    private final String f35912b;

    /* renamed from: c, reason: collision with root package name */
    private final String f35913c;

    /* renamed from: d, reason: collision with root package name */
    private final String f35914d;

    /* renamed from: e, reason: collision with root package name */
    private final String f35915e;

    /* renamed from: f, reason: collision with root package name */
    private final String f35916f;

    /* renamed from: g, reason: collision with root package name */
    private final String f35917g;

    /* renamed from: j8.k$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private String f35918a;

        /* renamed from: b, reason: collision with root package name */
        private String f35919b;

        /* renamed from: c, reason: collision with root package name */
        private String f35920c;

        /* renamed from: d, reason: collision with root package name */
        private String f35921d;

        /* renamed from: e, reason: collision with root package name */
        private String f35922e;

        /* renamed from: f, reason: collision with root package name */
        private String f35923f;

        /* renamed from: g, reason: collision with root package name */
        private String f35924g;

        public C3517k a() {
            return new C3517k(this.f35919b, this.f35918a, this.f35920c, this.f35921d, this.f35922e, this.f35923f, this.f35924g);
        }

        public b b(String str) {
            this.f35918a = AbstractC1287s.h(str, "ApiKey must be set.");
            return this;
        }

        public b c(String str) {
            this.f35919b = AbstractC1287s.h(str, "ApplicationId must be set.");
            return this;
        }

        public b d(String str) {
            this.f35920c = str;
            return this;
        }

        public b e(String str) {
            this.f35921d = str;
            return this;
        }

        public b f(String str) {
            this.f35922e = str;
            return this;
        }

        public b g(String str) {
            this.f35924g = str;
            return this;
        }

        public b h(String str) {
            this.f35923f = str;
            return this;
        }
    }

    public static C3517k a(Context context) {
        C1290v c1290v = new C1290v(context);
        String a10 = c1290v.a("google_app_id");
        if (TextUtils.isEmpty(a10)) {
            return null;
        }
        return new C3517k(a10, c1290v.a("google_api_key"), c1290v.a("firebase_database_url"), c1290v.a("ga_trackingId"), c1290v.a("gcm_defaultSenderId"), c1290v.a("google_storage_bucket"), c1290v.a("project_id"));
    }

    public String b() {
        return this.f35911a;
    }

    public String c() {
        return this.f35912b;
    }

    public String d() {
        return this.f35913c;
    }

    public String e() {
        return this.f35914d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C3517k)) {
            return false;
        }
        C3517k c3517k = (C3517k) obj;
        return AbstractC1286q.a(this.f35912b, c3517k.f35912b) && AbstractC1286q.a(this.f35911a, c3517k.f35911a) && AbstractC1286q.a(this.f35913c, c3517k.f35913c) && AbstractC1286q.a(this.f35914d, c3517k.f35914d) && AbstractC1286q.a(this.f35915e, c3517k.f35915e) && AbstractC1286q.a(this.f35916f, c3517k.f35916f) && AbstractC1286q.a(this.f35917g, c3517k.f35917g);
    }

    public String f() {
        return this.f35915e;
    }

    public String g() {
        return this.f35917g;
    }

    public String h() {
        return this.f35916f;
    }

    public int hashCode() {
        return AbstractC1286q.b(this.f35912b, this.f35911a, this.f35913c, this.f35914d, this.f35915e, this.f35916f, this.f35917g);
    }

    public String toString() {
        return AbstractC1286q.c(this).a("applicationId", this.f35912b).a("apiKey", this.f35911a).a("databaseUrl", this.f35913c).a("gcmSenderId", this.f35915e).a("storageBucket", this.f35916f).a("projectId", this.f35917g).toString();
    }

    private C3517k(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        AbstractC1287s.q(!q.a(str), "ApplicationId must be set.");
        this.f35912b = str;
        this.f35911a = str2;
        this.f35913c = str3;
        this.f35914d = str4;
        this.f35915e = str5;
        this.f35916f = str6;
        this.f35917g = str7;
    }
}
