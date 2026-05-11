package Qd;

import Jd.J;
import Od.AbstractC1084l;

/* loaded from: classes3.dex */
public final class c extends f {

    /* renamed from: i, reason: collision with root package name */
    public static final c f8327i = new c();

    private c() {
        super(j.f8339c, j.f8340d, j.f8341e, j.f8337a);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // Jd.J
    public J i0(int i10, String str) {
        AbstractC1084l.a(i10);
        return i10 >= j.f8339c ? AbstractC1084l.b(this, str) : super.i0(i10, str);
    }

    @Override // Jd.J
    public String toString() {
        return "Dispatchers.Default";
    }
}
