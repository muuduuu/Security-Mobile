package sd;

import yd.AbstractC5197E;

/* renamed from: sd.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4521i extends AbstractC4513a {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4521i(AbstractC5197E abstractC5197E) {
        this(abstractC5197E, null);
        if (abstractC5197E == null) {
            b(0);
        }
    }

    private static /* synthetic */ void b(int i10) {
        Object[] objArr = new Object[3];
        if (i10 != 2) {
            objArr[0] = "type";
        } else {
            objArr[0] = "newType";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/TransientReceiver";
        if (i10 != 2) {
            objArr[2] = "<init>";
        } else {
            objArr[2] = "replaceType";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public String toString() {
        return "{Transient} : " + getType();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private C4521i(AbstractC5197E abstractC5197E, InterfaceC4519g interfaceC4519g) {
        super(abstractC5197E, interfaceC4519g);
        if (abstractC5197E == null) {
            b(1);
        }
    }
}
