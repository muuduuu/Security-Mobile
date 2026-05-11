package V6;

import android.content.ComponentName;

/* loaded from: classes2.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f11021a;

    /* renamed from: b, reason: collision with root package name */
    private final String f11022b;

    /* renamed from: c, reason: collision with root package name */
    private final ComponentName f11023c;

    /* renamed from: d, reason: collision with root package name */
    private final int f11024d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f11025e;

    public v0(ComponentName componentName, int i10) {
        this.f11021a = null;
        this.f11022b = null;
        AbstractC1287s.m(componentName);
        this.f11023c = componentName;
        this.f11024d = 4225;
        this.f11025e = false;
    }

    public final String a() {
        return this.f11021a;
    }

    public final String b() {
        return this.f11022b;
    }

    public final ComponentName c() {
        return this.f11023c;
    }

    public final boolean d() {
        return this.f11025e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return AbstractC1286q.a(this.f11021a, v0Var.f11021a) && AbstractC1286q.a(this.f11022b, v0Var.f11022b) && AbstractC1286q.a(this.f11023c, v0Var.f11023c) && this.f11025e == v0Var.f11025e;
    }

    public final int hashCode() {
        return AbstractC1286q.b(this.f11021a, this.f11022b, this.f11023c, 4225, Boolean.valueOf(this.f11025e));
    }

    public final String toString() {
        String str = this.f11021a;
        if (str != null) {
            return str;
        }
        ComponentName componentName = this.f11023c;
        AbstractC1287s.m(componentName);
        return componentName.flattenToString();
    }

    public v0(String str, String str2, int i10, boolean z10) {
        AbstractC1287s.g(str);
        this.f11021a = str;
        AbstractC1287s.g(str2);
        this.f11022b = str2;
        this.f11023c = null;
        this.f11024d = 4225;
        this.f11025e = z10;
    }
}
