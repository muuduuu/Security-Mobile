package sd;

import Kc.InterfaceC0933e;
import kotlin.jvm.internal.Intrinsics;
import yd.AbstractC5197E;

/* renamed from: sd.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4514b extends AbstractC4513a implements InterfaceC4518f {

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC0933e f41695c;

    /* renamed from: d, reason: collision with root package name */
    private final id.f f41696d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4514b(InterfaceC0933e classDescriptor, AbstractC5197E receiverType, id.f fVar, InterfaceC4519g interfaceC4519g) {
        super(receiverType, interfaceC4519g);
        Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
        Intrinsics.checkNotNullParameter(receiverType, "receiverType");
        this.f41695c = classDescriptor;
        this.f41696d = fVar;
    }

    @Override // sd.InterfaceC4518f
    public id.f a() {
        return this.f41696d;
    }

    public String toString() {
        return getType() + ": Ctx { " + this.f41695c + " }";
    }
}
