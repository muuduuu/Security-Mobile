package Kc;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class S {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC0937i f5548a;

    /* renamed from: b, reason: collision with root package name */
    private final List f5549b;

    /* renamed from: c, reason: collision with root package name */
    private final S f5550c;

    public S(InterfaceC0937i classifierDescriptor, List arguments, S s10) {
        Intrinsics.checkNotNullParameter(classifierDescriptor, "classifierDescriptor");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        this.f5548a = classifierDescriptor;
        this.f5549b = arguments;
        this.f5550c = s10;
    }

    public final List a() {
        return this.f5549b;
    }

    public final InterfaceC0937i b() {
        return this.f5548a;
    }

    public final S c() {
        return this.f5550c;
    }
}
