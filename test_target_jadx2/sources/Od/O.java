package Od;

import Jd.P0;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
final class O {

    /* renamed from: a, reason: collision with root package name */
    public final CoroutineContext f7310a;

    /* renamed from: b, reason: collision with root package name */
    private final Object[] f7311b;

    /* renamed from: c, reason: collision with root package name */
    private final P0[] f7312c;

    /* renamed from: d, reason: collision with root package name */
    private int f7313d;

    public O(CoroutineContext coroutineContext, int i10) {
        this.f7310a = coroutineContext;
        this.f7311b = new Object[i10];
        this.f7312c = new P0[i10];
    }

    public final void a(P0 p02, Object obj) {
        Object[] objArr = this.f7311b;
        int i10 = this.f7313d;
        objArr[i10] = obj;
        P0[] p0Arr = this.f7312c;
        this.f7313d = i10 + 1;
        Intrinsics.e(p02, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        p0Arr[i10] = p02;
    }

    public final void b(CoroutineContext coroutineContext) {
        int length = this.f7312c.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i10 = length - 1;
            P0 p02 = this.f7312c[length];
            Intrinsics.d(p02);
            p02.C(coroutineContext, this.f7311b[length]);
            if (i10 < 0) {
                return;
            } else {
                length = i10;
            }
        }
    }
}
