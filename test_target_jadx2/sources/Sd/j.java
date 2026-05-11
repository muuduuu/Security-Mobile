package Sd;

import Od.D;
import Od.G;

/* loaded from: classes3.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    private static final int f9107a;

    /* renamed from: b, reason: collision with root package name */
    private static final D f9108b;

    /* renamed from: c, reason: collision with root package name */
    private static final D f9109c;

    /* renamed from: d, reason: collision with root package name */
    private static final D f9110d;

    /* renamed from: e, reason: collision with root package name */
    private static final D f9111e;

    /* renamed from: f, reason: collision with root package name */
    private static final int f9112f;

    static {
        int e10;
        int e11;
        e10 = G.e("kotlinx.coroutines.semaphore.maxSpinCycles", 100, 0, 0, 12, null);
        f9107a = e10;
        f9108b = new D("PERMIT");
        f9109c = new D("TAKEN");
        f9110d = new D("BROKEN");
        f9111e = new D("CANCELLED");
        e11 = G.e("kotlinx.coroutines.semaphore.segmentSize", 16, 0, 0, 12, null);
        f9112f = e11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final k h(long j10, k kVar) {
        return new k(j10, kVar, 0);
    }
}
