package t;

import u.C4832C;

/* renamed from: t.j1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C4554j1 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f42119a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final C4832C f42120b;

    /* renamed from: c, reason: collision with root package name */
    private int f42121c;

    C4554j1(C4832C c4832c, int i10) {
        this.f42120b = c4832c;
        this.f42121c = i10;
    }

    public int a() {
        int i10;
        synchronized (this.f42119a) {
            i10 = this.f42121c;
        }
        return i10;
    }

    void b(int i10) {
        synchronized (this.f42119a) {
            this.f42121c = i10;
        }
    }
}
