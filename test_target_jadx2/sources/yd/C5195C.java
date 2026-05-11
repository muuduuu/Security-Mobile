package yd;

import Kc.InterfaceC0936h;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: yd.C, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5195C extends l0 {

    /* renamed from: c, reason: collision with root package name */
    private final Kc.f0[] f45423c;

    /* renamed from: d, reason: collision with root package name */
    private final i0[] f45424d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f45425e;

    public /* synthetic */ C5195C(Kc.f0[] f0VarArr, i0[] i0VarArr, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(f0VarArr, i0VarArr, (i10 & 4) != 0 ? false : z10);
    }

    @Override // yd.l0
    public boolean b() {
        return this.f45425e;
    }

    @Override // yd.l0
    public i0 e(AbstractC5197E key) {
        Intrinsics.checkNotNullParameter(key, "key");
        InterfaceC0936h d10 = key.W0().d();
        Kc.f0 f0Var = d10 instanceof Kc.f0 ? (Kc.f0) d10 : null;
        if (f0Var == null) {
            return null;
        }
        int index = f0Var.getIndex();
        Kc.f0[] f0VarArr = this.f45423c;
        if (index >= f0VarArr.length || !Intrinsics.b(f0VarArr[index].r(), f0Var.r())) {
            return null;
        }
        return this.f45424d[index];
    }

    @Override // yd.l0
    public boolean f() {
        return this.f45424d.length == 0;
    }

    public final i0[] i() {
        return this.f45424d;
    }

    public final Kc.f0[] j() {
        return this.f45423c;
    }

    public C5195C(Kc.f0[] parameters, i0[] arguments, boolean z10) {
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        this.f45423c = parameters;
        this.f45424d = arguments;
        this.f45425e = z10;
        int length = parameters.length;
        int length2 = arguments.length;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5195C(List parameters, List argumentsList) {
        this((Kc.f0[]) parameters.toArray(new Kc.f0[0]), (i0[]) argumentsList.toArray(new i0[0]), false, 4, null);
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(argumentsList, "argumentsList");
    }
}
