package sd;

import Kc.InterfaceC0929a;
import kotlin.jvm.internal.Intrinsics;
import yd.AbstractC5197E;

/* renamed from: sd.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4515c extends AbstractC4513a implements InterfaceC4518f {

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC0929a f41697c;

    /* renamed from: d, reason: collision with root package name */
    private final id.f f41698d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4515c(InterfaceC0929a declarationDescriptor, AbstractC5197E receiverType, id.f fVar, InterfaceC4519g interfaceC4519g) {
        super(receiverType, interfaceC4519g);
        Intrinsics.checkNotNullParameter(declarationDescriptor, "declarationDescriptor");
        Intrinsics.checkNotNullParameter(receiverType, "receiverType");
        this.f41697c = declarationDescriptor;
        this.f41698d = fVar;
    }

    @Override // sd.InterfaceC4518f
    public id.f a() {
        return this.f41698d;
    }

    public InterfaceC0929a c() {
        return this.f41697c;
    }

    public String toString() {
        return "Cxt { " + c() + " }";
    }
}
