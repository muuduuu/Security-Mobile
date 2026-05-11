package kd;

import Kc.InterfaceC0929a;
import kotlin.reflect.jvm.internal.impl.types.checker.e;
import yd.e0;

/* renamed from: kd.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C3563c implements e.a {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f36283a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC0929a f36284b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC0929a f36285c;

    public C3563c(boolean z10, InterfaceC0929a interfaceC0929a, InterfaceC0929a interfaceC0929a2) {
        this.f36283a = z10;
        this.f36284b = interfaceC0929a;
        this.f36285c = interfaceC0929a2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.e.a
    public boolean a(e0 e0Var, e0 e0Var2) {
        boolean d10;
        d10 = C3564d.d(this.f36283a, this.f36284b, this.f36285c, e0Var, e0Var2);
        return d10;
    }
}
