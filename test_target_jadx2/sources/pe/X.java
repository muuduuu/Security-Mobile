package pe;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class X {

    /* renamed from: a, reason: collision with root package name */
    public static final X f38636a = new X();

    /* renamed from: b, reason: collision with root package name */
    private static final int f38637b = 65536;

    /* renamed from: c, reason: collision with root package name */
    private static final W f38638c = new W(new byte[0], 0, 0, false, false);

    /* renamed from: d, reason: collision with root package name */
    private static final int f38639d;

    /* renamed from: e, reason: collision with root package name */
    private static final AtomicReference[] f38640e;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f38639d = highestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i10 = 0; i10 < highestOneBit; i10++) {
            atomicReferenceArr[i10] = new AtomicReference();
        }
        f38640e = atomicReferenceArr;
    }

    private X() {
    }

    private final AtomicReference a() {
        return f38640e[(int) (Thread.currentThread().getId() & (f38639d - 1))];
    }

    public static final void b(W segment) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        if (segment.f38634f != null || segment.f38635g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (segment.f38632d) {
            return;
        }
        AtomicReference a10 = f38636a.a();
        W w10 = f38638c;
        W w11 = (W) a10.getAndSet(w10);
        if (w11 == w10) {
            return;
        }
        int i10 = w11 != null ? w11.f38631c : 0;
        if (i10 >= f38637b) {
            a10.set(w11);
            return;
        }
        segment.f38634f = w11;
        segment.f38630b = 0;
        segment.f38631c = i10 + 8192;
        a10.set(segment);
    }

    public static final W c() {
        AtomicReference a10 = f38636a.a();
        W w10 = f38638c;
        W w11 = (W) a10.getAndSet(w10);
        if (w11 == w10) {
            return new W();
        }
        if (w11 == null) {
            a10.set(null);
            return new W();
        }
        a10.set(w11.f38634f);
        w11.f38634f = null;
        w11.f38631c = 0;
        return w11;
    }
}
