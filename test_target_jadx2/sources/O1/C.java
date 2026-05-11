package O1;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    private final Object f6895a;

    /* renamed from: b, reason: collision with root package name */
    private final Throwable f6896b;

    public C(Object obj) {
        this.f6895a = obj;
        this.f6896b = null;
    }

    public Throwable a() {
        return this.f6896b;
    }

    public Object b() {
        return this.f6895a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c10 = (C) obj;
        if (b() != null && b().equals(c10.b())) {
            return true;
        }
        if (a() == null || c10.a() == null) {
            return false;
        }
        return a().toString().equals(a().toString());
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{b(), a()});
    }

    public C(Throwable th) {
        this.f6896b = th;
        this.f6895a = null;
    }
}
