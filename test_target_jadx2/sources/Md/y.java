package Md;

import Od.D;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes3.dex */
public abstract class y {

    /* renamed from: a, reason: collision with root package name */
    private static final D f6466a = new D("NONE");

    /* renamed from: b, reason: collision with root package name */
    private static final D f6467b = new D("PENDING");

    public static final s a(Object obj) {
        if (obj == null) {
            obj = Nd.p.f6786a;
        }
        return new x(obj);
    }

    public static final e d(w wVar, CoroutineContext coroutineContext, int i10, Ld.a aVar) {
        return (((i10 < 0 || i10 >= 2) && i10 != -2) || aVar != Ld.a.DROP_OLDEST) ? v.a(wVar, coroutineContext, i10, aVar) : wVar;
    }
}
