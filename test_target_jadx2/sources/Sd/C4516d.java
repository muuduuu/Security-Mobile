package sd;

import Kc.InterfaceC0929a;
import yd.AbstractC5197E;

/* renamed from: sd.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4516d extends AbstractC4513a implements InterfaceC4519g {

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC0929a f41699c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4516d(InterfaceC0929a interfaceC0929a, AbstractC5197E abstractC5197E, InterfaceC4519g interfaceC4519g) {
        super(abstractC5197E, interfaceC4519g);
        if (interfaceC0929a == null) {
            b(0);
        }
        if (abstractC5197E == null) {
            b(1);
        }
        this.f41699c = interfaceC0929a;
    }

    private static /* synthetic */ void b(int i10) {
        String str = i10 != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i10 != 2 ? 3 : 2];
        if (i10 == 1) {
            objArr[0] = "receiverType";
        } else if (i10 == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver";
        } else if (i10 != 3) {
            objArr[0] = "callableDescriptor";
        } else {
            objArr[0] = "newType";
        }
        if (i10 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver";
        } else {
            objArr[1] = "getDeclarationDescriptor";
        }
        if (i10 != 2) {
            if (i10 != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "replaceType";
            }
        }
        String format = String.format(str, objArr);
        if (i10 == 2) {
            throw new IllegalStateException(format);
        }
    }

    public String toString() {
        return getType() + ": Ext {" + this.f41699c + "}";
    }
}
