package Mc;

import Kc.AbstractC0947t;
import Kc.AbstractC0948u;
import Kc.EnumC0934f;
import Kc.InterfaceC0932d;
import Kc.InterfaceC0933e;
import Kc.InterfaceC0941m;
import Kc.a0;
import Kc.h0;
import co.hyperverge.hypersnapsdk.objects.HVError;
import com.appsflyer.attribution.RequestError;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import rd.h;
import yd.C5209k;
import yd.e0;

/* renamed from: Mc.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C0982h extends AbstractC0981g {

    /* renamed from: i, reason: collision with root package name */
    private final Kc.D f6253i;

    /* renamed from: j, reason: collision with root package name */
    private final EnumC0934f f6254j;

    /* renamed from: k, reason: collision with root package name */
    private final e0 f6255k;

    /* renamed from: l, reason: collision with root package name */
    private rd.h f6256l;

    /* renamed from: m, reason: collision with root package name */
    private Set f6257m;

    /* renamed from: n, reason: collision with root package name */
    private InterfaceC0932d f6258n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0982h(InterfaceC0941m interfaceC0941m, id.f fVar, Kc.D d10, EnumC0934f enumC0934f, Collection collection, a0 a0Var, boolean z10, xd.n nVar) {
        super(nVar, interfaceC0941m, fVar, a0Var, z10);
        if (interfaceC0941m == null) {
            I0(0);
        }
        if (fVar == null) {
            I0(1);
        }
        if (d10 == null) {
            I0(2);
        }
        if (enumC0934f == null) {
            I0(3);
        }
        if (collection == null) {
            I0(4);
        }
        if (a0Var == null) {
            I0(5);
        }
        if (nVar == null) {
            I0(6);
        }
        this.f6253i = d10;
        this.f6254j = enumC0934f;
        this.f6255k = new C5209k(this, Collections.emptyList(), collection, nVar);
    }

    private static /* synthetic */ void I0(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 9:
            case RequestError.EVENT_TIMEOUT /* 10 */:
            case 11:
            case 13:
            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
            case HVError.SSL_CONNECT_ERROR /* 15 */:
            case HVError.ACTIVE_SESSION_ERROR /* 16 */:
            case HVError.TRANSACTION_ID_EMPTY /* 17 */:
            case 18:
            case 19:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 12:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 9:
            case RequestError.EVENT_TIMEOUT /* 10 */:
            case 11:
            case 13:
            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
            case HVError.SSL_CONNECT_ERROR /* 15 */:
            case HVError.ACTIVE_SESSION_ERROR /* 16 */:
            case HVError.TRANSACTION_ID_EMPTY /* 17 */:
            case 18:
            case 19:
                i11 = 2;
                break;
            case 12:
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "supertypes";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "unsubstitutedMemberScope";
                break;
            case 8:
                objArr[0] = "constructors";
                break;
            case 9:
            case RequestError.EVENT_TIMEOUT /* 10 */:
            case 11:
            case 13:
            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
            case HVError.SSL_CONNECT_ERROR /* 15 */:
            case HVError.ACTIVE_SESSION_ERROR /* 16 */:
            case HVError.TRANSACTION_ID_EMPTY /* 17 */:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case 12:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i10) {
            case 9:
                objArr[1] = "getAnnotations";
                break;
            case RequestError.EVENT_TIMEOUT /* 10 */:
                objArr[1] = "getTypeConstructor";
                break;
            case 11:
                objArr[1] = "getConstructors";
                break;
            case 12:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case 13:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                objArr[1] = "getStaticScope";
                break;
            case HVError.SSL_CONNECT_ERROR /* 15 */:
                objArr[1] = "getKind";
                break;
            case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                objArr[1] = "getModality";
                break;
            case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                objArr[1] = "getVisibility";
                break;
            case 18:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 19:
                objArr[1] = "getSealedSubclasses";
                break;
        }
        switch (i10) {
            case 7:
            case 8:
                objArr[2] = "initialize";
                break;
            case 9:
            case RequestError.EVENT_TIMEOUT /* 10 */:
            case 11:
            case 13:
            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
            case HVError.SSL_CONNECT_ERROR /* 15 */:
            case HVError.ACTIVE_SESSION_ERROR /* 16 */:
            case HVError.TRANSACTION_ID_EMPTY /* 17 */:
            case 18:
            case 19:
                break;
            case 12:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i10) {
            case 9:
            case RequestError.EVENT_TIMEOUT /* 10 */:
            case 11:
            case 13:
            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
            case HVError.SSL_CONNECT_ERROR /* 15 */:
            case HVError.ACTIVE_SESSION_ERROR /* 16 */:
            case HVError.TRANSACTION_ID_EMPTY /* 17 */:
            case 18:
            case 19:
                throw new IllegalStateException(format);
            case 12:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @Override // Kc.InterfaceC0933e, Kc.InterfaceC0937i
    public List B() {
        List emptyList = Collections.emptyList();
        if (emptyList == null) {
            I0(18);
        }
        return emptyList;
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
            I0(12);
        }
        rd.h hVar = this.f6256l;
        if (hVar == null) {
            I0(13);
        }
        return hVar;
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
        return false;
    }

    public final void T0(rd.h hVar, Set set, InterfaceC0932d interfaceC0932d) {
        if (hVar == null) {
            I0(7);
        }
        if (set == null) {
            I0(8);
        }
        this.f6256l = hVar;
        this.f6257m = set;
        this.f6258n = interfaceC0932d;
    }

    @Override // Kc.InterfaceC0933e
    public InterfaceC0932d W() {
        return this.f6258n;
    }

    @Override // Kc.InterfaceC0933e
    public rd.h X() {
        h.b bVar = h.b.f40647b;
        if (bVar == null) {
            I0(14);
        }
        return bVar;
    }

    @Override // Kc.InterfaceC0933e
    public InterfaceC0933e Z() {
        return null;
    }

    @Override // Kc.InterfaceC0933e, Kc.InterfaceC0945q, Kc.C
    public AbstractC0948u h() {
        AbstractC0948u abstractC0948u = AbstractC0947t.f5589e;
        if (abstractC0948u == null) {
            I0(17);
        }
        return abstractC0948u;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.a
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.g i() {
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g b10 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f36445g0.b();
        if (b10 == null) {
            I0(9);
        }
        return b10;
    }

    @Override // Kc.InterfaceC0933e
    public Collection k() {
        Set set = this.f6257m;
        if (set == null) {
            I0(11);
        }
        return set;
    }

    @Override // Kc.InterfaceC0933e
    public EnumC0934f o() {
        EnumC0934f enumC0934f = this.f6254j;
        if (enumC0934f == null) {
            I0(15);
        }
        return enumC0934f;
    }

    @Override // Kc.InterfaceC0933e
    public boolean p() {
        return false;
    }

    @Override // Kc.InterfaceC0936h
    public e0 r() {
        e0 e0Var = this.f6255k;
        if (e0Var == null) {
            I0(10);
        }
        return e0Var;
    }

    @Override // Kc.InterfaceC0933e, Kc.C
    public Kc.D s() {
        Kc.D d10 = this.f6253i;
        if (d10 == null) {
            I0(16);
        }
        return d10;
    }

    public String toString() {
        return "class " + getName();
    }
}
