package Jd;

import Jd.J;
import Od.AbstractC1084l;
import Od.C1080h;
import Od.C1083k;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class J extends kotlin.coroutines.a implements kotlin.coroutines.e {

    /* renamed from: b, reason: collision with root package name */
    public static final a f4999b = new a(null);

    public static final class a extends kotlin.coroutines.b {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final J d(CoroutineContext.Element element) {
            if (element instanceof J) {
                return (J) element;
            }
            return null;
        }

        private a() {
            super(kotlin.coroutines.e.f36370f0, new Function1() { // from class: Jd.I
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    J d10;
                    d10 = J.a.d((CoroutineContext.Element) obj);
                    return d10;
                }
            });
        }
    }

    public J() {
        super(kotlin.coroutines.e.f36370f0);
    }

    public static /* synthetic */ J o0(J j10, int i10, String str, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: limitedParallelism");
        }
        if ((i11 & 2) != 0) {
            str = null;
        }
        return j10.i0(i10, str);
    }

    @Override // kotlin.coroutines.a, kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public CoroutineContext.Element a(CoroutineContext.b bVar) {
        return e.a.a(this, bVar);
    }

    @Override // kotlin.coroutines.e
    public final void f(kotlin.coroutines.d dVar) {
        Intrinsics.e(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        ((C1080h) dVar).t();
    }

    @Override // kotlin.coroutines.e
    public final kotlin.coroutines.d i(kotlin.coroutines.d dVar) {
        return new C1080h(this, dVar);
    }

    public J i0(int i10, String str) {
        AbstractC1084l.a(i10);
        return new C1083k(this, i10, str);
    }

    public abstract void s(CoroutineContext coroutineContext, Runnable runnable);

    @Override // kotlin.coroutines.a, kotlin.coroutines.CoroutineContext
    public CoroutineContext t(CoroutineContext.b bVar) {
        return e.a.b(this, bVar);
    }

    public String toString() {
        return S.a(this) + '@' + S.b(this);
    }

    public void u(CoroutineContext coroutineContext, Runnable runnable) {
        s(coroutineContext, runnable);
    }

    public boolean y(CoroutineContext coroutineContext) {
        return true;
    }
}
