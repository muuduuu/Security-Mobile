package Mc;

import Kc.AbstractC0948u;
import Kc.InterfaceC0930b;
import Kc.InterfaceC0943o;
import Kc.U;
import Kc.W;
import Kc.a0;
import Kc.j0;
import com.appsflyer.attribution.RequestError;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import od.AbstractC3778c;
import yd.AbstractC5197E;

/* loaded from: classes3.dex */
public class E extends B implements W {

    /* renamed from: m, reason: collision with root package name */
    private j0 f6187m;

    /* renamed from: n, reason: collision with root package name */
    private final W f6188n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public E(U u10, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, Kc.D d10, AbstractC0948u abstractC0948u, boolean z10, boolean z11, boolean z12, InterfaceC0930b.a aVar, W w10, a0 a0Var) {
        super(d10, abstractC0948u, u10, gVar, id.f.r("<set-" + u10.getName() + ">"), z10, z11, z12, aVar, a0Var);
        E e10;
        E e11;
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
        if (w10 != 0) {
            e11 = this;
            e10 = w10;
        } else {
            e10 = this;
            e11 = e10;
        }
        e11.f6188n = e10;
    }

    private static /* synthetic */ void D(int i10) {
        String str;
        int i11;
        switch (i10) {
            case RequestError.EVENT_TIMEOUT /* 10 */:
            case 11:
            case 12:
            case 13:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case RequestError.EVENT_TIMEOUT /* 10 */:
            case 11:
            case 12:
            case 13:
                i11 = 2;
                break;
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
            case 9:
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
                objArr[0] = "parameter";
                break;
            case 7:
                objArr[0] = "setterDescriptor";
                break;
            case 8:
                objArr[0] = "type";
                break;
            case RequestError.EVENT_TIMEOUT /* 10 */:
            case 11:
            case 12:
            case 13:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        switch (i10) {
            case RequestError.EVENT_TIMEOUT /* 10 */:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 11:
                objArr[1] = "getValueParameters";
                break;
            case 12:
                objArr[1] = "getReturnType";
                break;
            case 13:
                objArr[1] = "getOriginal";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
        }
        switch (i10) {
            case 6:
                objArr[2] = "initialize";
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "createSetterParameter";
                break;
            case RequestError.EVENT_TIMEOUT /* 10 */:
            case 11:
            case 12:
            case 13:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i10) {
            case RequestError.EVENT_TIMEOUT /* 10 */:
            case 11:
            case 12:
            case 13:
                throw new IllegalStateException(format);
            default:
                throw new IllegalArgumentException(format);
        }
    }

    public static L X0(W w10, AbstractC5197E abstractC5197E, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar) {
        if (w10 == null) {
            D(7);
        }
        if (abstractC5197E == null) {
            D(8);
        }
        if (gVar == null) {
            D(9);
        }
        return new L(w10, null, 0, gVar, id.h.f34207n, abstractC5197E, false, false, false, null, a0.f5560a);
    }

    @Override // Mc.AbstractC0985k, Mc.AbstractC0984j, Kc.InterfaceC0941m
    /* renamed from: Y0, reason: merged with bridge method [inline-methods] */
    public W a() {
        W w10 = this.f6188n;
        if (w10 == null) {
            D(13);
        }
        return w10;
    }

    public void Z0(j0 j0Var) {
        if (j0Var == null) {
            D(6);
        }
        this.f6187m = j0Var;
    }

    @Override // Kc.InterfaceC0952y, Kc.InterfaceC0930b, Kc.InterfaceC0929a
    public Collection f() {
        Collection T02 = super.T0(false);
        if (T02 == null) {
            D(10);
        }
        return T02;
    }

    @Override // Kc.InterfaceC0941m
    public Object f0(InterfaceC0943o interfaceC0943o, Object obj) {
        return interfaceC0943o.f(this, obj);
    }

    @Override // Kc.InterfaceC0929a
    public AbstractC5197E g() {
        yd.M Z10 = AbstractC3778c.j(this).Z();
        if (Z10 == null) {
            D(12);
        }
        return Z10;
    }

    @Override // Kc.InterfaceC0929a
    public List m() {
        j0 j0Var = this.f6187m;
        if (j0Var == null) {
            throw new IllegalStateException();
        }
        List singletonList = Collections.singletonList(j0Var);
        if (singletonList == null) {
            D(11);
        }
        return singletonList;
    }
}
