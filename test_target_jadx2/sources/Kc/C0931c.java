package Kc;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import yd.u0;

/* renamed from: Kc.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C0931c implements f0 {

    /* renamed from: a, reason: collision with root package name */
    private final f0 f5562a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC0941m f5563b;

    /* renamed from: c, reason: collision with root package name */
    private final int f5564c;

    public C0931c(f0 originalDescriptor, InterfaceC0941m declarationDescriptor, int i10) {
        Intrinsics.checkNotNullParameter(originalDescriptor, "originalDescriptor");
        Intrinsics.checkNotNullParameter(declarationDescriptor, "declarationDescriptor");
        this.f5562a = originalDescriptor;
        this.f5563b = declarationDescriptor;
        this.f5564c = i10;
    }

    @Override // Kc.f0
    public boolean L() {
        return this.f5562a.L();
    }

    @Override // Kc.InterfaceC0942n, Kc.InterfaceC0941m
    public InterfaceC0941m b() {
        return this.f5563b;
    }

    @Override // Kc.InterfaceC0941m
    public Object f0(InterfaceC0943o interfaceC0943o, Object obj) {
        return this.f5562a.f0(interfaceC0943o, obj);
    }

    @Override // Kc.f0
    public int getIndex() {
        return this.f5564c + this.f5562a.getIndex();
    }

    @Override // Kc.I
    public id.f getName() {
        return this.f5562a.getName();
    }

    @Override // Kc.f0
    public List getUpperBounds() {
        return this.f5562a.getUpperBounds();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.a
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.g i() {
        return this.f5562a.i();
    }

    @Override // Kc.InterfaceC0944p
    public a0 j() {
        return this.f5562a.j();
    }

    @Override // Kc.f0
    public xd.n n0() {
        return this.f5562a.n0();
    }

    @Override // Kc.f0, Kc.InterfaceC0936h
    public yd.e0 r() {
        return this.f5562a.r();
    }

    public String toString() {
        return this.f5562a + "[inner-copy]";
    }

    @Override // Kc.f0
    public u0 u() {
        return this.f5562a.u();
    }

    @Override // Kc.f0
    public boolean u0() {
        return true;
    }

    @Override // Kc.InterfaceC0936h
    public yd.M y() {
        return this.f5562a.y();
    }

    @Override // Kc.InterfaceC0941m
    public f0 a() {
        f0 a10 = this.f5562a.a();
        Intrinsics.checkNotNullExpressionValue(a10, "getOriginal(...)");
        return a10;
    }
}
