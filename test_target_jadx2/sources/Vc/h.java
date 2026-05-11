package Vc;

import Kc.InterfaceC0941m;
import Kc.f0;
import Wc.n;
import Zc.y;
import Zc.z;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import xc.m;

/* loaded from: classes3.dex */
public final class h implements k {

    /* renamed from: a, reason: collision with root package name */
    private final g f11150a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC0941m f11151b;

    /* renamed from: c, reason: collision with root package name */
    private final int f11152c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f11153d;

    /* renamed from: e, reason: collision with root package name */
    private final xd.h f11154e;

    static final class a extends m implements Function1 {
        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final n invoke(y typeParameter) {
            Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
            Integer num = (Integer) h.this.f11153d.get(typeParameter);
            if (num == null) {
                return null;
            }
            h hVar = h.this;
            return new n(Vc.a.h(Vc.a.b(hVar.f11150a, hVar), hVar.f11151b.i()), typeParameter, hVar.f11152c + num.intValue(), hVar.f11151b);
        }
    }

    public h(g c10, InterfaceC0941m containingDeclaration, z typeParameterOwner, int i10) {
        Intrinsics.checkNotNullParameter(c10, "c");
        Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
        Intrinsics.checkNotNullParameter(typeParameterOwner, "typeParameterOwner");
        this.f11150a = c10;
        this.f11151b = containingDeclaration;
        this.f11152c = i10;
        this.f11153d = Gd.a.d(typeParameterOwner.n());
        this.f11154e = c10.e().i(new a());
    }

    @Override // Vc.k
    public f0 a(y javaTypeParameter) {
        Intrinsics.checkNotNullParameter(javaTypeParameter, "javaTypeParameter");
        n nVar = (n) this.f11154e.invoke(javaTypeParameter);
        return nVar != null ? nVar : this.f11150a.f().a(javaTypeParameter);
    }
}
