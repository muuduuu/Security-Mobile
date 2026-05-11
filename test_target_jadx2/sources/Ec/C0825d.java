package Ec;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ec.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C0825d extends AbstractC0822a {

    /* renamed from: a, reason: collision with root package name */
    private final Function1 f1968a;

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentHashMap f1969b;

    public C0825d(Function1 compute) {
        Intrinsics.checkNotNullParameter(compute, "compute");
        this.f1968a = compute;
        this.f1969b = new ConcurrentHashMap();
    }

    @Override // Ec.AbstractC0822a
    public Object a(Class key) {
        Intrinsics.checkNotNullParameter(key, "key");
        ConcurrentHashMap concurrentHashMap = this.f1969b;
        Object obj = concurrentHashMap.get(key);
        if (obj != null) {
            return obj;
        }
        Object invoke = this.f1968a.invoke(key);
        Object putIfAbsent = concurrentHashMap.putIfAbsent(key, invoke);
        return putIfAbsent == null ? invoke : putIfAbsent;
    }
}
