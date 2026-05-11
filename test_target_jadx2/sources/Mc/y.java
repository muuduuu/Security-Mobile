package Mc;

import Kc.AbstractC0948u;
import Kc.EnumC0934f;
import Kc.InterfaceC0932d;
import Kc.InterfaceC0933e;
import Kc.InterfaceC0941m;
import Kc.InterfaceC0952y;
import Kc.a0;
import Kc.h0;
import co.hyperverge.hypersnapsdk.objects.HVError;
import com.appsflyer.attribution.RequestError;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import rd.h;
import yd.C5209k;
import yd.e0;

/* loaded from: classes3.dex */
public class y extends AbstractC0981g {

    /* renamed from: i, reason: collision with root package name */
    private final EnumC0934f f6370i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f6371j;

    /* renamed from: k, reason: collision with root package name */
    private Kc.D f6372k;

    /* renamed from: l, reason: collision with root package name */
    private AbstractC0948u f6373l;

    /* renamed from: m, reason: collision with root package name */
    private e0 f6374m;

    /* renamed from: n, reason: collision with root package name */
    private List f6375n;

    /* renamed from: o, reason: collision with root package name */
    private final Collection f6376o;

    /* renamed from: p, reason: collision with root package name */
    private final xd.n f6377p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(InterfaceC0941m interfaceC0941m, EnumC0934f enumC0934f, boolean z10, boolean z11, id.f fVar, a0 a0Var, xd.n nVar) {
        super(nVar, interfaceC0941m, fVar, a0Var, z11);
        if (interfaceC0941m == null) {
            I0(0);
        }
        if (enumC0934f == null) {
            I0(1);
        }
        if (fVar == null) {
            I0(2);
        }
        if (a0Var == null) {
            I0(3);
        }
        if (nVar == null) {
            I0(4);
        }
        this.f6376o = new ArrayList();
        this.f6377p = nVar;
        this.f6370i = enumC0934f;
        this.f6371j = z10;
    }

    private static /* synthetic */ void I0(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 5:
            case 7:
            case 8:
            case RequestError.EVENT_TIMEOUT /* 10 */:
            case 11:
            case 13:
            case HVError.SSL_CONNECT_ERROR /* 15 */:
            case HVError.TRANSACTION_ID_EMPTY /* 17 */:
            case 18:
            case 19:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 6:
            case 9:
            case 12:
            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
            case HVError.ACTIVE_SESSION_ERROR /* 16 */:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 5:
            case 7:
            case 8:
            case RequestError.EVENT_TIMEOUT /* 10 */:
            case 11:
            case 13:
            case HVError.SSL_CONNECT_ERROR /* 15 */:
            case HVError.TRANSACTION_ID_EMPTY /* 17 */:
            case 18:
            case 19:
                i11 = 2;
                break;
            case 6:
            case 9:
            case 12:
            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
            case HVError.ACTIVE_SESSION_ERROR /* 16 */:
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "kind";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 7:
            case 8:
            case RequestError.EVENT_TIMEOUT /* 10 */:
            case 11:
            case 13:
            case HVError.SSL_CONNECT_ERROR /* 15 */:
            case HVError.TRANSACTION_ID_EMPTY /* 17 */:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 6:
                objArr[0] = "modality";
                break;
            case 9:
                objArr[0] = "visibility";
                break;
            case 12:
                objArr[0] = "supertype";
                break;
            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                objArr[0] = "typeParameters";
                break;
            case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i10) {
            case 5:
                objArr[1] = "getAnnotations";
                break;
            case 6:
            case 9:
            case 12:
            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
            case HVError.ACTIVE_SESSION_ERROR /* 16 */:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 7:
                objArr[1] = "getModality";
                break;
            case 8:
                objArr[1] = "getKind";
                break;
            case RequestError.EVENT_TIMEOUT /* 10 */:
                objArr[1] = "getVisibility";
                break;
            case 11:
                objArr[1] = "getTypeConstructor";
                break;
            case 13:
                objArr[1] = "getConstructors";
                break;
            case HVError.SSL_CONNECT_ERROR /* 15 */:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 18:
                objArr[1] = "getStaticScope";
                break;
            case 19:
                objArr[1] = "getSealedSubclasses";
                break;
        }
        switch (i10) {
            case 5:
            case 7:
            case 8:
            case RequestError.EVENT_TIMEOUT /* 10 */:
            case 11:
            case 13:
            case HVError.SSL_CONNECT_ERROR /* 15 */:
            case HVError.TRANSACTION_ID_EMPTY /* 17 */:
            case 18:
            case 19:
                break;
            case 6:
                objArr[2] = "setModality";
                break;
            case 9:
                objArr[2] = "setVisibility";
                break;
            case 12:
                objArr[2] = "addSupertype";
                break;
            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                objArr[2] = "setTypeParameterDescriptors";
                break;
            case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i10) {
            case 5:
            case 7:
            case 8:
            case RequestError.EVENT_TIMEOUT /* 10 */:
            case 11:
            case 13:
            case HVError.SSL_CONNECT_ERROR /* 15 */:
            case HVError.TRANSACTION_ID_EMPTY /* 17 */:
            case 18:
            case 19:
                throw new IllegalStateException(format);
            case 6:
            case 9:
            case 12:
            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
            case HVError.ACTIVE_SESSION_ERROR /* 16 */:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @Override // Kc.InterfaceC0933e, Kc.InterfaceC0937i
    public List B() {
        List list = this.f6375n;
        if (list == null) {
            I0(15);
        }
        return list;
    }

    @Override // Kc.InterfaceC0933e
    public boolean F() {
        return false;
    }

    @Override // Kc.InterfaceC0933e
    public h0 H0() {
        return null;
    }

    @Override // Kc.InterfaceC0933e
    public boolean J() {
        return false;
    }

    @Override // Kc.C
    public boolean M0() {
        return false;
    }

    @Override // Mc.t
    public rd.h N(kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
        if (gVar == null) {
            I0(16);
        }
        h.b bVar = h.b.f40647b;
        if (bVar == null) {
            I0(17);
        }
        return bVar;
    }

    @Override // Kc.InterfaceC0933e
    public Collection P() {
        List emptyList = Collections.emptyList();
        if (emptyList == null) {
            I0(19);
        }
        return emptyList;
    }

    @Override // Kc.InterfaceC0933e
    public boolean Q() {
        return false;
    }

    @Override // Kc.C
    public boolean R() {
        return false;
    }

    @Override // Kc.InterfaceC0933e
    public boolean R0() {
        return false;
    }

    @Override // Kc.InterfaceC0937i
    public boolean S() {
        return this.f6371j;
    }

    public void T0() {
        this.f6374m = new C5209k(this, this.f6375n, this.f6376o, this.f6377p);
        Iterator it = k().iterator();
        while (it.hasNext()) {
            ((C0980f) ((InterfaceC0952y) it.next())).p1(y());
        }
    }

    @Override // Kc.InterfaceC0933e
    /* renamed from: U0, reason: merged with bridge method [inline-methods] */
    public Set k() {
        Set emptySet = Collections.emptySet();
        if (emptySet == null) {
            I0(13);
        }
        return emptySet;
    }

    public void V0(Kc.D d10) {
        if (d10 == null) {
            I0(6);
        }
        this.f6372k = d10;
    }

    @Override // Kc.InterfaceC0933e
    public InterfaceC0932d W() {
        return null;
    }

    public void W0(List list) {
        if (list == null) {
            I0(14);
        }
        if (this.f6375n == null) {
            this.f6375n = new ArrayList(list);
            return;
        }
        throw new IllegalStateException("Type parameters are already set for " + getName());
    }

    @Override // Kc.InterfaceC0933e
    public rd.h X() {
        h.b bVar = h.b.f40647b;
        if (bVar == null) {
            I0(18);
        }
        return bVar;
    }

    public void X0(AbstractC0948u abstractC0948u) {
        if (abstractC0948u == null) {
            I0(9);
        }
        this.f6373l = abstractC0948u;
    }

    @Override // Kc.InterfaceC0933e
    public InterfaceC0933e Z() {
        return null;
    }

    @Override // Kc.InterfaceC0933e, Kc.InterfaceC0945q, Kc.C
    public AbstractC0948u h() {
        AbstractC0948u abstractC0948u = this.f6373l;
        if (abstractC0948u == null) {
            I0(10);
        }
        return abstractC0948u;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.a
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.g i() {
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g b10 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f36445g0.b();
        if (b10 == null) {
            I0(5);
        }
        return b10;
    }

    @Override // Kc.InterfaceC0933e
    public EnumC0934f o() {
        EnumC0934f enumC0934f = this.f6370i;
        if (enumC0934f == null) {
            I0(8);
        }
        return enumC0934f;
    }

    @Override // Kc.InterfaceC0933e
    public boolean p() {
        return false;
    }

    @Override // Kc.InterfaceC0936h
    public e0 r() {
        e0 e0Var = this.f6374m;
        if (e0Var == null) {
            I0(11);
        }
        return e0Var;
    }

    @Override // Kc.InterfaceC0933e, Kc.C
    public Kc.D s() {
        Kc.D d10 = this.f6372k;
        if (d10 == null) {
            I0(7);
        }
        return d10;
    }

    public String toString() {
        return AbstractC0984j.N(this);
    }
}
