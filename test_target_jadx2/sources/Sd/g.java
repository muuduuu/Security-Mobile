package Sd;

import Od.D;

/* loaded from: classes3.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    private static final D f9095a = new D("NO_OWNER");

    /* renamed from: b, reason: collision with root package name */
    private static final D f9096b = new D("ALREADY_LOCKED_BY_OWNER");

    public static final a a(boolean z10) {
        return new f(z10);
    }

    public static /* synthetic */ a b(boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return a(z10);
    }
}
