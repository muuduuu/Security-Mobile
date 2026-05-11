package Md;

import Od.D;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes3.dex */
public abstract class v {

    /* renamed from: a, reason: collision with root package name */
    public static final D f6455a = new D("NO_VALUE");

    public static final e a(u uVar, CoroutineContext coroutineContext, int i10, Ld.a aVar) {
        return ((i10 == 0 || i10 == -3) && aVar == Ld.a.SUSPEND) ? uVar : new Nd.h(uVar, coroutineContext, i10, aVar);
    }
}
