package kotlin.reflect.jvm.internal.impl.types.error;

import Kc.InterfaceC0936h;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import yd.e0;

/* loaded from: classes3.dex */
public final class i implements e0 {

    /* renamed from: a, reason: collision with root package name */
    private final j f36723a;

    /* renamed from: b, reason: collision with root package name */
    private final String[] f36724b;

    /* renamed from: c, reason: collision with root package name */
    private final String f36725c;

    public i(j kind, String... formatParams) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(formatParams, "formatParams");
        this.f36723a = kind;
        this.f36724b = formatParams;
        String debugText = b.ERROR_TYPE.getDebugText();
        String debugMessage = kind.getDebugMessage();
        Object[] copyOf = Arrays.copyOf(formatParams, formatParams.length);
        String format = String.format(debugMessage, Arrays.copyOf(copyOf, copyOf.length));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        String format2 = String.format(debugText, Arrays.copyOf(new Object[]{format}, 1));
        Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
        this.f36725c = format2;
    }

    @Override // yd.e0
    public Collection a() {
        return CollectionsKt.j();
    }

    @Override // yd.e0
    public e0 b(kotlin.reflect.jvm.internal.impl.types.checker.g kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    @Override // yd.e0
    public List c() {
        return CollectionsKt.j();
    }

    @Override // yd.e0
    public InterfaceC0936h d() {
        return k.f36726a.h();
    }

    @Override // yd.e0
    public boolean e() {
        return false;
    }

    public final j g() {
        return this.f36723a;
    }

    public final String h(int i10) {
        return this.f36724b[i10];
    }

    public String toString() {
        return this.f36725c;
    }

    @Override // yd.e0
    public Hc.g v() {
        return Hc.e.f3827h.a();
    }
}
