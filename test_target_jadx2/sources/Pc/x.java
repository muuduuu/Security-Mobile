package Pc;

import java.util.Collection;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class x extends z implements Zc.v {

    /* renamed from: b, reason: collision with root package name */
    private final Class f7771b;

    /* renamed from: c, reason: collision with root package name */
    private final Collection f7772c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f7773d;

    public x(Class reflectType) {
        Intrinsics.checkNotNullParameter(reflectType, "reflectType");
        this.f7771b = reflectType;
        this.f7772c = CollectionsKt.j();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Pc.z
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public Class X() {
        return this.f7771b;
    }

    @Override // Zc.v
    public Hc.h getType() {
        if (Intrinsics.b(X(), Void.TYPE)) {
            return null;
        }
        return pd.e.get(X().getName()).getPrimitiveType();
    }

    @Override // Zc.InterfaceC1331d
    public Collection i() {
        return this.f7772c;
    }

    @Override // Zc.InterfaceC1331d
    public boolean s() {
        return this.f7773d;
    }
}
