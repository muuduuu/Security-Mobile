package Sc;

import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class E implements D {

    /* renamed from: b, reason: collision with root package name */
    private final Map f8987b;

    /* renamed from: c, reason: collision with root package name */
    private final xd.f f8988c;

    /* renamed from: d, reason: collision with root package name */
    private final xd.h f8989d;

    static final class a extends xc.m implements Function1 {
        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(id.c cVar) {
            Intrinsics.d(cVar);
            return id.e.a(cVar, E.this.b());
        }
    }

    public E(Map states) {
        Intrinsics.checkNotNullParameter(states, "states");
        this.f8987b = states;
        xd.f fVar = new xd.f("Java nullability annotation states");
        this.f8988c = fVar;
        xd.h i10 = fVar.i(new a());
        Intrinsics.checkNotNullExpressionValue(i10, "createMemoizedFunctionWithNullableValues(...)");
        this.f8989d = i10;
    }

    @Override // Sc.D
    public Object a(id.c fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        return this.f8989d.invoke(fqName);
    }

    public final Map b() {
        return this.f8987b;
    }
}
