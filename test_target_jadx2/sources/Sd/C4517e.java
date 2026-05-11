package sd;

import Kc.InterfaceC0933e;
import kotlin.jvm.internal.Intrinsics;
import yd.M;

/* renamed from: sd.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4517e implements InterfaceC4519g, InterfaceC4520h {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC0933e f41700a;

    /* renamed from: b, reason: collision with root package name */
    private final C4517e f41701b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC0933e f41702c;

    public C4517e(InterfaceC0933e classDescriptor, C4517e c4517e) {
        Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
        this.f41700a = classDescriptor;
        this.f41701b = c4517e == null ? this : c4517e;
        this.f41702c = classDescriptor;
    }

    @Override // sd.InterfaceC4519g
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public M getType() {
        M y10 = this.f41700a.y();
        Intrinsics.checkNotNullExpressionValue(y10, "getDefaultType(...)");
        return y10;
    }

    public boolean equals(Object obj) {
        InterfaceC0933e interfaceC0933e = this.f41700a;
        C4517e c4517e = obj instanceof C4517e ? (C4517e) obj : null;
        return Intrinsics.b(interfaceC0933e, c4517e != null ? c4517e.f41700a : null);
    }

    public int hashCode() {
        return this.f41700a.hashCode();
    }

    public String toString() {
        return "Class{" + getType() + '}';
    }

    @Override // sd.InterfaceC4520h
    public final InterfaceC0933e x() {
        return this.f41700a;
    }
}
