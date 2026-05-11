package bd;

import bd.AbstractC1675b;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: bd.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1677d extends AbstractC1675b.a {

    /* renamed from: a, reason: collision with root package name */
    private final Map f18978a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f18979b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f18980c;

    public C1677d(Map memberAnnotations, Map propertyConstants, Map annotationParametersDefaultValues) {
        Intrinsics.checkNotNullParameter(memberAnnotations, "memberAnnotations");
        Intrinsics.checkNotNullParameter(propertyConstants, "propertyConstants");
        Intrinsics.checkNotNullParameter(annotationParametersDefaultValues, "annotationParametersDefaultValues");
        this.f18978a = memberAnnotations;
        this.f18979b = propertyConstants;
        this.f18980c = annotationParametersDefaultValues;
    }

    @Override // bd.AbstractC1675b.a
    public Map a() {
        return this.f18978a;
    }

    public final Map b() {
        return this.f18980c;
    }

    public final Map c() {
        return this.f18979b;
    }
}
