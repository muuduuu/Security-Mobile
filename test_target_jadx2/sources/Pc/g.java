package Pc;

import Zc.InterfaceC1328a;
import Zc.InterfaceC1330c;
import java.lang.annotation.Annotation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class g extends f implements InterfaceC1330c {

    /* renamed from: c, reason: collision with root package name */
    private final Annotation f7747c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(id.f fVar, Annotation annotation) {
        super(fVar, null);
        Intrinsics.checkNotNullParameter(annotation, "annotation");
        this.f7747c = annotation;
    }

    @Override // Zc.InterfaceC1330c
    public InterfaceC1328a a() {
        return new e(this.f7747c);
    }
}
