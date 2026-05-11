package Pc;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class s extends f implements Zc.o {

    /* renamed from: c, reason: collision with root package name */
    private final Object f7768c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(id.f fVar, Object value) {
        super(fVar, null);
        Intrinsics.checkNotNullParameter(value, "value");
        this.f7768c = value;
    }

    @Override // Zc.o
    public Object getValue() {
        return this.f7768c;
    }
}
