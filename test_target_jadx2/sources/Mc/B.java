package Mc;

import Kc.AbstractC0948u;
import Kc.InterfaceC0929a;
import Kc.InterfaceC0930b;
import Kc.InterfaceC0941m;
import Kc.InterfaceC0952y;
import Kc.T;
import Kc.U;
import Kc.X;
import Kc.a0;
import co.hyperverge.hypersnapsdk.objects.HVError;
import com.appsflyer.attribution.RequestError;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import yd.n0;

/* loaded from: classes3.dex */
public abstract class B extends AbstractC0985k implements T {

    /* renamed from: e, reason: collision with root package name */
    private boolean f6144e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f6145f;

    /* renamed from: g, reason: collision with root package name */
    private final Kc.D f6146g;

    /* renamed from: h, reason: collision with root package name */
    private final U f6147h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f6148i;

    /* renamed from: j, reason: collision with root package name */
    private final InterfaceC0930b.a f6149j;

    /* renamed from: k, reason: collision with root package name */
    private AbstractC0948u f6150k;

    /* renamed from: l, reason: collision with root package name */
    private InterfaceC0952y f6151l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(Kc.D d10, AbstractC0948u abstractC0948u, U u10, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, id.f fVar, boolean z10, boolean z11, boolean z12, InterfaceC0930b.a aVar, a0 a0Var) {
        super(u10.b(), gVar, fVar, a0Var);
        if (d10 == null) {
            D(0);
        }
        if (abstractC0948u == null) {
            D(1);
        }
        if (u10 == null) {
            D(2);
        }
        if (gVar == null) {
            D(3);
        }
        if (fVar == null) {
            D(4);
        }
        if (a0Var == null) {
            D(5);
        }
        this.f6151l = null;
        this.f6146g = d10;
        this.f6150k = abstractC0948u;
        this.f6147h = u10;
        this.f6144e = z10;
        this.f6145f = z11;
        this.f6148i = z12;
        this.f6149j = aVar;
    }

    private static /* synthetic */ void D(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 6:
            case 8:
            case 9:
            case RequestError.EVENT_TIMEOUT /* 10 */:
            case 11:
            case 12:
            case 13:
            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
            case HVError.SSL_CONNECT_ERROR /* 15 */:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 7:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 6:
            case 8:
            case 9:
            case RequestError.EVENT_TIMEOUT /* 10 */:
            case 11:
            case 12:
            case 13:
            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
            case HVError.SSL_CONNECT_ERROR /* 15 */:
                i11 = 2;
                break;
            case 7:
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "visibility";
                break;
            case 2:
                objArr[0] = "correspondingProperty";
                break;
            case 3:
                objArr[0] = "annotations";
                break;
            case 4:
                objArr[0] = "name";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
            case 8:
            case 9:
            case RequestError.EVENT_TIMEOUT /* 10 */:
            case 11:
            case 12:
            case 13:
            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
            case HVError.SSL_CONNECT_ERROR /* 15 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 7:
                objArr[0] = "substitutor";
                break;
            case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                objArr[0] = "overriddenDescriptors";
                break;
            default:
                objArr[0] = "modality";
                break;
        }
        switch (i10) {
            case 6:
                objArr[1] = "getKind";
                break;
            case 7:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 8:
                objArr[1] = "substitute";
                break;
            case 9:
                objArr[1] = "getTypeParameters";
                break;
            case RequestError.EVENT_TIMEOUT /* 10 */:
                objArr[1] = "getModality";
                break;
            case 11:
                objArr[1] = "getVisibility";
                break;
            case 12:
                objArr[1] = "getCorrespondingVariable";
                break;
            case 13:
                objArr[1] = "getCorrespondingProperty";
                break;
            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                objArr[1] = "getContextReceiverParameters";
                break;
            case HVError.SSL_CONNECT_ERROR /* 15 */:
                objArr[1] = "getOverriddenDescriptors";
                break;
        }
        switch (i10) {
            case 6:
            case 8:
            case 9:
            case RequestError.EVENT_TIMEOUT /* 10 */:
            case 11:
            case 12:
            case 13:
            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
            case HVError.SSL_CONNECT_ERROR /* 15 */:
                break;
            case 7:
                objArr[2] = "substitute";
                break;
            case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i10) {
            case 6:
            case 8:
            case 9:
            case RequestError.EVENT_TIMEOUT /* 10 */:
            case 11:
            case 12:
            case 13:
            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
            case HVError.SSL_CONNECT_ERROR /* 15 */:
                throw new IllegalStateException(format);
            case 7:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @Override // Kc.InterfaceC0929a
    public Object A0(InterfaceC0929a.InterfaceC0107a interfaceC0107a) {
        return null;
    }

    @Override // Kc.InterfaceC0952y
    public boolean D0() {
        return false;
    }

    @Override // Kc.InterfaceC0930b
    public void F0(Collection collection) {
        if (collection == null) {
            D(16);
        }
    }

    @Override // Kc.T
    public U J0() {
        U u10 = this.f6147h;
        if (u10 == null) {
            D(13);
        }
        return u10;
    }

    @Override // Kc.InterfaceC0952y
    public boolean K0() {
        return false;
    }

    @Override // Kc.InterfaceC0929a
    public boolean M() {
        return false;
    }

    @Override // Kc.C
    public boolean M0() {
        return false;
    }

    @Override // Kc.InterfaceC0930b
    /* renamed from: N0, reason: merged with bridge method [inline-methods] */
    public T o0(InterfaceC0941m interfaceC0941m, Kc.D d10, AbstractC0948u abstractC0948u, InterfaceC0930b.a aVar, boolean z10) {
        throw new UnsupportedOperationException("Accessors must be copied by the corresponding property");
    }

    @Override // Kc.InterfaceC0952y
    public boolean Q0() {
        return false;
    }

    @Override // Kc.C
    public boolean R() {
        return false;
    }

    protected Collection T0(boolean z10) {
        ArrayList arrayList = new ArrayList(0);
        for (U u10 : J0().f()) {
            InterfaceC0952y d10 = z10 ? u10.d() : u10.l();
            if (d10 != null) {
                arrayList.add(d10);
            }
        }
        return arrayList;
    }

    @Override // Kc.InterfaceC0952y
    public boolean U() {
        return false;
    }

    public void U0(boolean z10) {
        this.f6144e = z10;
    }

    @Override // Kc.InterfaceC0952y
    public boolean V() {
        return false;
    }

    public void V0(InterfaceC0952y interfaceC0952y) {
        this.f6151l = interfaceC0952y;
    }

    public void W0(AbstractC0948u abstractC0948u) {
        this.f6150k = abstractC0948u;
    }

    @Override // Kc.T
    public boolean a0() {
        return this.f6144e;
    }

    @Override // Kc.c0
    public InterfaceC0952y c(n0 n0Var) {
        if (n0Var == null) {
            D(7);
        }
        return this;
    }

    @Override // Kc.InterfaceC0945q, Kc.C
    public AbstractC0948u h() {
        AbstractC0948u abstractC0948u = this.f6150k;
        if (abstractC0948u == null) {
            D(11);
        }
        return abstractC0948u;
    }

    @Override // Kc.InterfaceC0952y
    public InterfaceC0952y j0() {
        return this.f6151l;
    }

    @Override // Kc.InterfaceC0929a
    public X l0() {
        return J0().l0();
    }

    @Override // Kc.InterfaceC0929a
    public List n() {
        List emptyList = Collections.emptyList();
        if (emptyList == null) {
            D(9);
        }
        return emptyList;
    }

    @Override // Kc.InterfaceC0930b
    public InterfaceC0930b.a o() {
        InterfaceC0930b.a aVar = this.f6149j;
        if (aVar == null) {
            D(6);
        }
        return aVar;
    }

    @Override // Kc.InterfaceC0952y
    public boolean p() {
        return this.f6148i;
    }

    @Override // Kc.C
    public boolean q() {
        return this.f6145f;
    }

    @Override // Kc.C
    public Kc.D s() {
        Kc.D d10 = this.f6146g;
        if (d10 == null) {
            D(10);
        }
        return d10;
    }

    @Override // Kc.InterfaceC0929a
    public X s0() {
        return J0().s0();
    }

    @Override // Kc.InterfaceC0929a
    public List x0() {
        List x02 = J0().x0();
        if (x02 == null) {
            D(14);
        }
        return x02;
    }

    @Override // Kc.InterfaceC0952y
    public boolean z() {
        return false;
    }
}
