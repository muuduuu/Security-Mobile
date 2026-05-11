package Pc;

import Pc.z;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import kotlin.collections.AbstractC3574i;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class C extends z implements Zc.C {

    /* renamed from: b, reason: collision with root package name */
    private final WildcardType f7721b;

    /* renamed from: c, reason: collision with root package name */
    private final Collection f7722c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f7723d;

    public C(WildcardType reflectType) {
        Intrinsics.checkNotNullParameter(reflectType, "reflectType");
        this.f7721b = reflectType;
        this.f7722c = CollectionsKt.j();
    }

    @Override // Zc.C
    public boolean Q() {
        Intrinsics.checkNotNullExpressionValue(X().getUpperBounds(), "getUpperBounds(...)");
        return !Intrinsics.b(AbstractC3574i.A(r0), Object.class);
    }

    @Override // Zc.C
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public z H() {
        Type[] upperBounds = X().getUpperBounds();
        Type[] lowerBounds = X().getLowerBounds();
        if (upperBounds.length > 1 || lowerBounds.length > 1) {
            throw new UnsupportedOperationException("Wildcard types with many bounds are not yet supported: " + X());
        }
        if (lowerBounds.length == 1) {
            z.a aVar = z.f7775a;
            Intrinsics.d(lowerBounds);
            Object Z10 = AbstractC3574i.Z(lowerBounds);
            Intrinsics.checkNotNullExpressionValue(Z10, "single(...)");
            return aVar.a((Type) Z10);
        }
        if (upperBounds.length == 1) {
            Intrinsics.d(upperBounds);
            Type type = (Type) AbstractC3574i.Z(upperBounds);
            if (!Intrinsics.b(type, Object.class)) {
                z.a aVar2 = z.f7775a;
                Intrinsics.d(type);
                return aVar2.a(type);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Pc.z
    /* renamed from: Z, reason: merged with bridge method [inline-methods] */
    public WildcardType X() {
        return this.f7721b;
    }

    @Override // Zc.InterfaceC1331d
    public Collection i() {
        return this.f7722c;
    }

    @Override // Zc.InterfaceC1331d
    public boolean s() {
        return this.f7723d;
    }
}
