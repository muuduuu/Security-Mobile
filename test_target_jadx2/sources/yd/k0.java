package yd;

/* loaded from: classes3.dex */
public class k0 extends j0 {

    /* renamed from: a, reason: collision with root package name */
    private final u0 f45545a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC5197E f45546b;

    public k0(u0 u0Var, AbstractC5197E abstractC5197E) {
        if (u0Var == null) {
            d(0);
        }
        if (abstractC5197E == null) {
            d(1);
        }
        this.f45545a = u0Var;
        this.f45546b = abstractC5197E;
    }

    private static /* synthetic */ void d(int i10) {
        String str = (i10 == 4 || i10 == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 4 || i10 == 5) ? 2 : 3];
        switch (i10) {
            case 1:
            case 2:
            case 3:
                objArr[0] = "type";
                break;
            case 4:
            case 5:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
                break;
            case 6:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "projection";
                break;
        }
        if (i10 == 4) {
            objArr[1] = "getProjectionKind";
        } else if (i10 != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
        } else {
            objArr[1] = "getType";
        }
        if (i10 == 3) {
            objArr[2] = "replaceType";
        } else if (i10 != 4 && i10 != 5) {
            if (i10 != 6) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "refine";
            }
        }
        String format = String.format(str, objArr);
        if (i10 != 4 && i10 != 5) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // yd.i0
    public u0 a() {
        u0 u0Var = this.f45545a;
        if (u0Var == null) {
            d(4);
        }
        return u0Var;
    }

    @Override // yd.i0
    public i0 b(kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
        if (gVar == null) {
            d(6);
        }
        return new k0(this.f45545a, gVar.a(this.f45546b));
    }

    @Override // yd.i0
    public boolean c() {
        return false;
    }

    @Override // yd.i0
    public AbstractC5197E getType() {
        AbstractC5197E abstractC5197E = this.f45546b;
        if (abstractC5197E == null) {
            d(5);
        }
        return abstractC5197E;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k0(AbstractC5197E abstractC5197E) {
        this(u0.INVARIANT, abstractC5197E);
        if (abstractC5197E == null) {
            d(2);
        }
    }
}
