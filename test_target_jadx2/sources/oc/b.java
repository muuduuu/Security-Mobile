package Oc;

import Kc.a0;
import Kc.b0;
import java.lang.annotation.Annotation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class b implements a0 {

    /* renamed from: b, reason: collision with root package name */
    private final Annotation f7283b;

    public b(Annotation annotation) {
        Intrinsics.checkNotNullParameter(annotation, "annotation");
        this.f7283b = annotation;
    }

    @Override // Kc.a0
    public b0 a() {
        b0 NO_SOURCE_FILE = b0.f5561a;
        Intrinsics.checkNotNullExpressionValue(NO_SOURCE_FILE, "NO_SOURCE_FILE");
        return NO_SOURCE_FILE;
    }

    public final Annotation d() {
        return this.f7283b;
    }
}
