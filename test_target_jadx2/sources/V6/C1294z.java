package V6;

import S6.a;
import android.os.Bundle;

/* renamed from: V6.z, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1294z implements a.d {

    /* renamed from: b, reason: collision with root package name */
    public static final C1294z f11044b = a().a();

    /* renamed from: a, reason: collision with root package name */
    private final String f11045a;

    /* renamed from: V6.z$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private String f11046a;

        /* synthetic */ a(D d10) {
        }

        public C1294z a() {
            return new C1294z(this.f11046a, null);
        }

        public a b(String str) {
            this.f11046a = str;
            return this;
        }
    }

    /* synthetic */ C1294z(String str, E e10) {
        this.f11045a = str;
    }

    public static a a() {
        return new a(null);
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        String str = this.f11045a;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1294z) {
            return AbstractC1286q.a(this.f11045a, ((C1294z) obj).f11045a);
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC1286q.b(this.f11045a);
    }
}
