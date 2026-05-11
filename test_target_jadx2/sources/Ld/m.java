package Ld;

import Jd.V0;
import Od.A;
import Od.D;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class m extends A {

    /* renamed from: e, reason: collision with root package name */
    private final e f5809e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ AtomicReferenceArray f5810f;

    public m(long j10, m mVar, e eVar, int i10) {
        super(j10, mVar, i10);
        this.f5809e = eVar;
        this.f5810f = new AtomicReferenceArray(f.f5782b * 2);
    }

    private final void E(int i10, Object obj) {
        z().set(i10 * 2, obj);
    }

    private final /* synthetic */ AtomicReferenceArray z() {
        return this.f5810f;
    }

    public final Object A(int i10) {
        return z().get(i10 * 2);
    }

    public final Object B(int i10) {
        return z().get((i10 * 2) + 1);
    }

    public final void C(int i10, boolean z10) {
        if (z10) {
            y().n1((this.f7300c * f.f5782b) + i10);
        }
        t();
    }

    public final Object D(int i10) {
        Object A10 = A(i10);
        w(i10);
        return A10;
    }

    public final void F(int i10, Object obj) {
        z().set((i10 * 2) + 1, obj);
    }

    public final void G(int i10, Object obj) {
        E(i10, obj);
    }

    @Override // Od.A
    public int r() {
        return f.f5782b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0063, code lost:
    
        w(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0066, code lost:
    
        if (r0 == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0068, code lost:
    
        r4 = y().f5766b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x006e, code lost:
    
        if (r4 == null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0070, code lost:
    
        Od.w.a(r4, r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0073, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:?, code lost:
    
        return;
     */
    @Override // Od.A
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void s(int i10, Throwable th, CoroutineContext coroutineContext) {
        Function1 function1;
        D d10;
        D d11;
        D d12;
        D d13;
        D d14;
        int i11 = f.f5782b;
        boolean z10 = i10 >= i11;
        if (z10) {
            i10 -= i11;
        }
        Object A10 = A(i10);
        while (true) {
            Object B10 = B(i10);
            if (!(B10 instanceof V0) && !(B10 instanceof y)) {
                d10 = f.f5790j;
                if (B10 == d10) {
                    break;
                }
                d11 = f.f5791k;
                if (B10 == d11) {
                    break;
                }
                d12 = f.f5787g;
                if (B10 != d12) {
                    d13 = f.f5786f;
                    if (B10 != d13) {
                        d14 = f.f5789i;
                        if (B10 == d14 || B10 == f.f5784d || B10 == f.z()) {
                            return;
                        }
                        throw new IllegalStateException(("unexpected state: " + B10).toString());
                    }
                } else {
                    continue;
                }
            } else {
                if (v(i10, B10, z10 ? f.f5790j : f.f5791k)) {
                    w(i10);
                    C(i10, !z10);
                    if (!z10 || (function1 = y().f5766b) == null) {
                        return;
                    }
                    Od.w.a(function1, A10, coroutineContext);
                    return;
                }
            }
        }
    }

    public final boolean v(int i10, Object obj, Object obj2) {
        return l.a(z(), (i10 * 2) + 1, obj, obj2);
    }

    public final void w(int i10) {
        E(i10, null);
    }

    public final Object x(int i10, Object obj) {
        return z().getAndSet((i10 * 2) + 1, obj);
    }

    public final e y() {
        e eVar = this.f5809e;
        Intrinsics.d(eVar);
        return eVar;
    }
}
