package Mc;

import Kc.InterfaceC0941m;
import com.appsflyer.attribution.RequestError;
import sd.InterfaceC4519g;

/* loaded from: classes3.dex */
public class F extends AbstractC0977c {

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC0941m f6189c;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC4519g f6190d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public F(InterfaceC0941m interfaceC0941m, InterfaceC4519g interfaceC4519g, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar) {
        this(interfaceC0941m, interfaceC4519g, gVar, id.h.f34201h);
        if (interfaceC0941m == null) {
            D(0);
        }
        if (interfaceC4519g == null) {
            D(1);
        }
        if (gVar == null) {
            D(2);
        }
    }

    private static /* synthetic */ void D(int i10) {
        String str = (i10 == 7 || i10 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 7 || i10 == 8) ? 2 : 3];
        switch (i10) {
            case 1:
            case 4:
                objArr[0] = "value";
                break;
            case 2:
            case 5:
                objArr[0] = "annotations";
                break;
            case 3:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 6:
                objArr[0] = "name";
                break;
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
                break;
            case 9:
                objArr[0] = "newOwner";
                break;
            case RequestError.EVENT_TIMEOUT /* 10 */:
                objArr[0] = "outType";
                break;
        }
        if (i10 == 7) {
            objArr[1] = "getValue";
        } else if (i10 != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        switch (i10) {
            case 7:
            case 8:
                break;
            case 9:
                objArr[2] = "copy";
                break;
            case RequestError.EVENT_TIMEOUT /* 10 */:
                objArr[2] = "setOutType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i10 != 7 && i10 != 8) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // Kc.InterfaceC0941m
    public InterfaceC0941m b() {
        InterfaceC0941m interfaceC0941m = this.f6189c;
        if (interfaceC0941m == null) {
            D(8);
        }
        return interfaceC0941m;
    }

    @Override // Kc.X
    public InterfaceC4519g getValue() {
        InterfaceC4519g interfaceC4519g = this.f6190d;
        if (interfaceC4519g == null) {
            D(7);
        }
        return interfaceC4519g;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(InterfaceC0941m interfaceC0941m, InterfaceC4519g interfaceC4519g, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, id.f fVar) {
        super(gVar, fVar);
        if (interfaceC0941m == null) {
            D(3);
        }
        if (interfaceC4519g == null) {
            D(4);
        }
        if (gVar == null) {
            D(5);
        }
        if (fVar == null) {
            D(6);
        }
        this.f6189c = interfaceC0941m;
        this.f6190d = interfaceC4519g;
    }
}
