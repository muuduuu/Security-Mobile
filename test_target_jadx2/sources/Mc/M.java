package Mc;

import Kc.InterfaceC0941m;
import Kc.X;
import Kc.a0;
import Kc.k0;
import com.appsflyer.attribution.RequestError;
import java.util.Collections;
import java.util.List;
import yd.AbstractC5197E;

/* loaded from: classes3.dex */
public abstract class M extends AbstractC0985k implements k0 {

    /* renamed from: e, reason: collision with root package name */
    protected AbstractC5197E f6213e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(InterfaceC0941m interfaceC0941m, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, id.f fVar, AbstractC5197E abstractC5197E, a0 a0Var) {
        super(interfaceC0941m, gVar, fVar, a0Var);
        if (interfaceC0941m == null) {
            D(0);
        }
        if (gVar == null) {
            D(1);
        }
        if (fVar == null) {
            D(2);
        }
        if (a0Var == null) {
            D(3);
        }
        this.f6213e = abstractC5197E;
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
                i11 = 2;
                break;
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case RequestError.EVENT_TIMEOUT /* 10 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i10) {
            case 4:
                objArr[1] = "getType";
                break;
            case 5:
                objArr[1] = "getOriginal";
                break;
            case 6:
                objArr[1] = "getValueParameters";
                break;
            case 7:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 8:
                objArr[1] = "getTypeParameters";
                break;
            case 9:
                objArr[1] = "getContextReceiverParameters";
                break;
            case RequestError.EVENT_TIMEOUT /* 10 */:
                objArr[1] = "getReturnType";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
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
                throw new IllegalStateException(format);
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @Override // Kc.InterfaceC0929a
    public boolean M() {
        return false;
    }

    public void N0(AbstractC5197E abstractC5197E) {
        this.f6213e = abstractC5197E;
    }

    public AbstractC5197E g() {
        AbstractC5197E type = getType();
        if (type == null) {
            D(10);
        }
        return type;
    }

    @Override // Kc.i0
    public AbstractC5197E getType() {
        AbstractC5197E abstractC5197E = this.f6213e;
        if (abstractC5197E == null) {
            D(4);
        }
        return abstractC5197E;
    }

    public X l0() {
        return null;
    }

    @Override // Kc.InterfaceC0929a
    public List m() {
        List emptyList = Collections.emptyList();
        if (emptyList == null) {
            D(6);
        }
        return emptyList;
    }

    public List n() {
        List emptyList = Collections.emptyList();
        if (emptyList == null) {
            D(8);
        }
        return emptyList;
    }

    public X s0() {
        return null;
    }
}
