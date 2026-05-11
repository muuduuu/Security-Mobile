package sd;

import yd.AbstractC5197E;

/* renamed from: sd.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4513a implements InterfaceC4519g {

    /* renamed from: a, reason: collision with root package name */
    protected final AbstractC5197E f41693a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4519g f41694b;

    public AbstractC4513a(AbstractC5197E abstractC5197E, InterfaceC4519g interfaceC4519g) {
        if (abstractC5197E == null) {
            b(0);
        }
        this.f41693a = abstractC5197E;
        this.f41694b = interfaceC4519g == null ? this : interfaceC4519g;
    }

    private static /* synthetic */ void b(int i10) {
        String str = (i10 == 1 || i10 == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 1 || i10 == 2) ? 2 : 3];
        if (i10 == 1 || i10 == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[0] = "receiverType";
        }
        if (i10 == 1) {
            objArr[1] = "getType";
        } else if (i10 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[1] = "getOriginal";
        }
        if (i10 != 1 && i10 != 2) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i10 != 1 && i10 != 2) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // sd.InterfaceC4519g
    public AbstractC5197E getType() {
        AbstractC5197E abstractC5197E = this.f41693a;
        if (abstractC5197E == null) {
            b(1);
        }
        return abstractC5197E;
    }
}
