package v6;

import android.content.Context;

/* renamed from: v6.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4951c extends AbstractC4956h {

    /* renamed from: a, reason: collision with root package name */
    private final Context f43978a;

    /* renamed from: b, reason: collision with root package name */
    private final E6.a f43979b;

    /* renamed from: c, reason: collision with root package name */
    private final E6.a f43980c;

    /* renamed from: d, reason: collision with root package name */
    private final String f43981d;

    C4951c(Context context, E6.a aVar, E6.a aVar2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.f43978a = context;
        if (aVar == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.f43979b = aVar;
        if (aVar2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.f43980c = aVar2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f43981d = str;
    }

    @Override // v6.AbstractC4956h
    public Context b() {
        return this.f43978a;
    }

    @Override // v6.AbstractC4956h
    public String c() {
        return this.f43981d;
    }

    @Override // v6.AbstractC4956h
    public E6.a d() {
        return this.f43980c;
    }

    @Override // v6.AbstractC4956h
    public E6.a e() {
        return this.f43979b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC4956h)) {
            return false;
        }
        AbstractC4956h abstractC4956h = (AbstractC4956h) obj;
        return this.f43978a.equals(abstractC4956h.b()) && this.f43979b.equals(abstractC4956h.e()) && this.f43980c.equals(abstractC4956h.d()) && this.f43981d.equals(abstractC4956h.c());
    }

    public int hashCode() {
        return ((((((this.f43978a.hashCode() ^ 1000003) * 1000003) ^ this.f43979b.hashCode()) * 1000003) ^ this.f43980c.hashCode()) * 1000003) ^ this.f43981d.hashCode();
    }

    public String toString() {
        return "CreationContext{applicationContext=" + this.f43978a + ", wallClock=" + this.f43979b + ", monotonicClock=" + this.f43980c + ", backendName=" + this.f43981d + "}";
    }
}
