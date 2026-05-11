package yd;

import Kc.InterfaceC0941m;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: yd.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5212n implements Z {

    /* renamed from: a, reason: collision with root package name */
    public static final C5212n f45551a = new C5212n();

    private C5212n() {
    }

    @Override // yd.Z
    public a0 a(kotlin.reflect.jvm.internal.impl.descriptors.annotations.g annotations, e0 e0Var, InterfaceC0941m interfaceC0941m) {
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        return annotations.isEmpty() ? a0.f45478b.i() : a0.f45478b.h(CollectionsKt.e(new C5207i(annotations)));
    }
}
