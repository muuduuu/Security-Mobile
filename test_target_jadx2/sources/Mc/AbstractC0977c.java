package Mc;

import Kc.AbstractC0947t;
import Kc.AbstractC0948u;
import Kc.InterfaceC0933e;
import Kc.InterfaceC0943o;
import Kc.Q;
import Kc.X;
import Kc.a0;
import com.appsflyer.attribution.RequestError;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import sd.C4521i;
import yd.AbstractC5197E;
import yd.n0;
import yd.u0;

/* renamed from: Mc.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0977c extends AbstractC0984j implements X {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC0977c(kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar) {
        super(gVar, id.h.f34201h);
        if (gVar == null) {
            D(0);
        }
    }

    private static /* synthetic */ void D(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case RequestError.EVENT_TIMEOUT /* 10 */:
            case 11:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case RequestError.EVENT_TIMEOUT /* 10 */:
            case 11:
                i11 = 2;
                break;
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "substitutor";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case RequestError.EVENT_TIMEOUT /* 10 */:
            case 11:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        switch (i10) {
            case 4:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 5:
                objArr[1] = "getTypeParameters";
                break;
            case 6:
                objArr[1] = "getType";
                break;
            case 7:
                objArr[1] = "getValueParameters";
                break;
            case 8:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 9:
                objArr[1] = "getVisibility";
                break;
            case RequestError.EVENT_TIMEOUT /* 10 */:
                objArr[1] = "getOriginal";
                break;
            case 11:
                objArr[1] = "getSource";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
        }
        switch (i10) {
            case 3:
                objArr[2] = "substitute";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case RequestError.EVENT_TIMEOUT /* 10 */:
            case 11:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case RequestError.EVENT_TIMEOUT /* 10 */:
            case 11:
                throw new IllegalStateException(format);
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @Override // Kc.InterfaceC0929a
    public boolean M() {
        return false;
    }

    @Override // Kc.InterfaceC0929a
    public Collection f() {
        Set emptySet = Collections.emptySet();
        if (emptySet == null) {
            D(8);
        }
        return emptySet;
    }

    @Override // Kc.InterfaceC0941m
    public Object f0(InterfaceC0943o interfaceC0943o, Object obj) {
        return interfaceC0943o.g(this, obj);
    }

    @Override // Kc.InterfaceC0929a
    public AbstractC5197E g() {
        return getType();
    }

    @Override // Kc.i0
    public AbstractC5197E getType() {
        AbstractC5197E type = getValue().getType();
        if (type == null) {
            D(6);
        }
        return type;
    }

    @Override // Kc.InterfaceC0945q, Kc.C
    public AbstractC0948u h() {
        AbstractC0948u abstractC0948u = AbstractC0947t.f5590f;
        if (abstractC0948u == null) {
            D(9);
        }
        return abstractC0948u;
    }

    @Override // Kc.InterfaceC0944p
    public a0 j() {
        a0 a0Var = a0.f5560a;
        if (a0Var == null) {
            D(11);
        }
        return a0Var;
    }

    @Override // Kc.InterfaceC0929a
    public X l0() {
        return null;
    }

    @Override // Kc.InterfaceC0929a
    public List m() {
        List emptyList = Collections.emptyList();
        if (emptyList == null) {
            D(7);
        }
        return emptyList;
    }

    @Override // Kc.InterfaceC0929a
    public List n() {
        List emptyList = Collections.emptyList();
        if (emptyList == null) {
            D(5);
        }
        return emptyList;
    }

    @Override // Kc.InterfaceC0929a
    public X s0() {
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC0977c(kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, id.f fVar) {
        super(gVar, fVar);
        if (gVar == null) {
            D(1);
        }
        if (fVar == null) {
            D(2);
        }
    }

    @Override // Kc.c0
    public X c(n0 n0Var) {
        if (n0Var == null) {
            D(3);
        }
        if (n0Var.k()) {
            return this;
        }
        AbstractC5197E p10 = b() instanceof InterfaceC0933e ? n0Var.p(getType(), u0.OUT_VARIANCE) : n0Var.p(getType(), u0.INVARIANT);
        if (p10 == null) {
            return null;
        }
        return p10 == getType() ? this : new F(b(), new C4521i(p10), i());
    }

    @Override // Mc.AbstractC0984j, Kc.InterfaceC0941m
    /* renamed from: I0, reason: merged with bridge method [inline-methods] */
    public Q a() {
        return this;
    }
}
