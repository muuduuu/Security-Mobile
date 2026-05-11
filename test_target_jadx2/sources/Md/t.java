package Md;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import pc.AbstractC3868b;

/* loaded from: classes3.dex */
final class t extends AbstractC0989a {

    /* renamed from: a, reason: collision with root package name */
    private final Function2 f6454a;

    public t(Function2 function2) {
        this.f6454a = function2;
    }

    @Override // Md.AbstractC0989a
    public Object d(f fVar, kotlin.coroutines.d dVar) {
        Object invoke = this.f6454a.invoke(fVar, dVar);
        return invoke == AbstractC3868b.e() ? invoke : Unit.f36324a;
    }
}
