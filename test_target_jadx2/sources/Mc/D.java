package Mc;

import Kc.AbstractC0948u;
import Kc.InterfaceC0930b;
import Kc.InterfaceC0943o;
import Kc.U;
import Kc.V;
import Kc.a0;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import yd.AbstractC5197E;

/* loaded from: classes3.dex */
public class D extends B implements V {

    /* renamed from: m, reason: collision with root package name */
    private AbstractC5197E f6185m;

    /* renamed from: n, reason: collision with root package name */
    private final V f6186n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public D(U u10, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, Kc.D d10, AbstractC0948u abstractC0948u, boolean z10, boolean z11, boolean z12, InterfaceC0930b.a aVar, V v10, a0 a0Var) {
        super(d10, abstractC0948u, u10, gVar, id.f.r("<get-" + u10.getName() + ">"), z10, z11, z12, aVar, a0Var);
        D d11;
        D d12;
        if (u10 == null) {
            D(0);
        }
        if (gVar == null) {
            D(1);
        }
        if (d10 == null) {
            D(2);
        }
        if (abstractC0948u == null) {
            D(3);
        }
        if (aVar == null) {
            D(4);
        }
        if (a0Var == null) {
            D(5);
        }
        if (v10 != 0) {
            d12 = this;
            d11 = v10;
        } else {
            d11 = this;
            d12 = d11;
        }
        d12.f6186n = d11;
    }

    private static /* synthetic */ void D(int i10) {
        String str = (i10 == 6 || i10 == 7 || i10 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 6 || i10 == 7 || i10 == 8) ? 2 : 3];
        switch (i10) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "visibility";
                break;
            case 4:
                objArr[0] = "kind";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        if (i10 == 6) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i10 == 7) {
            objArr[1] = "getValueParameters";
        } else if (i10 != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
        } else {
            objArr[1] = "getOriginal";
        }
        if (i10 != 6 && i10 != 7 && i10 != 8) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i10 != 6 && i10 != 7 && i10 != 8) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // Mc.AbstractC0985k, Mc.AbstractC0984j, Kc.InterfaceC0941m
    /* renamed from: X0, reason: merged with bridge method [inline-methods] */
    public V a() {
        V v10 = this.f6186n;
        if (v10 == null) {
            D(8);
        }
        return v10;
    }

    public void Y0(AbstractC5197E abstractC5197E) {
        if (abstractC5197E == null) {
            abstractC5197E = J0().getType();
        }
        this.f6185m = abstractC5197E;
    }

    @Override // Kc.InterfaceC0952y, Kc.InterfaceC0930b, Kc.InterfaceC0929a
    public Collection f() {
        Collection T02 = super.T0(true);
        if (T02 == null) {
            D(6);
        }
        return T02;
    }

    @Override // Kc.InterfaceC0941m
    public Object f0(InterfaceC0943o interfaceC0943o, Object obj) {
        return interfaceC0943o.i(this, obj);
    }

    @Override // Kc.InterfaceC0929a
    public AbstractC5197E g() {
        return this.f6185m;
    }

    @Override // Kc.InterfaceC0929a
    public List m() {
        List emptyList = Collections.emptyList();
        if (emptyList == null) {
            D(7);
        }
        return emptyList;
    }
}
