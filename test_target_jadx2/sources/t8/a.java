package T8;

import V6.AbstractC1287s;

/* loaded from: classes2.dex */
public class a extends Exception {

    /* renamed from: a, reason: collision with root package name */
    private final int f9500a;

    public a(String str, int i10) {
        super(AbstractC1287s.h(str, "Provided message must not be empty."));
        this.f9500a = i10;
    }

    public int a() {
        return this.f9500a;
    }

    public a(String str, int i10, Throwable th) {
        super(AbstractC1287s.h(str, "Provided message must not be empty."), th);
        this.f9500a = i10;
    }
}
