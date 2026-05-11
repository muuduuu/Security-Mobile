package Fc;

import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class i implements e {

    /* renamed from: a, reason: collision with root package name */
    public static final i f2696a = new i();

    private i() {
    }

    @Override // Fc.e
    public /* bridge */ /* synthetic */ Member a() {
        return (Member) b();
    }

    public Void b() {
        return null;
    }

    @Override // Fc.e
    public Type g() {
        Class TYPE = Void.TYPE;
        Intrinsics.checkNotNullExpressionValue(TYPE, "TYPE");
        return TYPE;
    }

    @Override // Fc.e
    public Object h(Object[] args) {
        Intrinsics.checkNotNullParameter(args, "args");
        throw new UnsupportedOperationException("call/callBy are not supported for this declaration.");
    }

    @Override // Fc.e
    public List i() {
        return CollectionsKt.j();
    }
}
