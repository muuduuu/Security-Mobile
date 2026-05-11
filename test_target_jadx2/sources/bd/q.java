package bd;

import bd.o;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
final class q implements p {

    /* renamed from: a, reason: collision with root package name */
    public static final q f19039a = new q();

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19040a;

        static {
            int[] iArr = new int[Hc.h.values().length];
            try {
                iArr[Hc.h.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Hc.h.CHAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Hc.h.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Hc.h.SHORT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Hc.h.INT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Hc.h.FLOAT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Hc.h.LONG.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[Hc.h.DOUBLE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f19040a = iArr;
        }
    }

    private q() {
    }

    @Override // bd.p
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public o e(o possiblyPrimitiveType) {
        Intrinsics.checkNotNullParameter(possiblyPrimitiveType, "possiblyPrimitiveType");
        if (!(possiblyPrimitiveType instanceof o.d)) {
            return possiblyPrimitiveType;
        }
        o.d dVar = (o.d) possiblyPrimitiveType;
        if (dVar.i() == null) {
            return possiblyPrimitiveType;
        }
        String f10 = pd.d.c(dVar.i().getWrapperFqName()).f();
        Intrinsics.checkNotNullExpressionValue(f10, "getInternalName(...)");
        return d(f10);
    }

    @Override // bd.p
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public o c(String representation) {
        pd.e eVar;
        o cVar;
        Intrinsics.checkNotNullParameter(representation, "representation");
        representation.length();
        char charAt = representation.charAt(0);
        pd.e[] values = pd.e.values();
        int length = values.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                eVar = null;
                break;
            }
            eVar = values[i10];
            if (eVar.getDesc().charAt(0) == charAt) {
                break;
            }
            i10++;
        }
        if (eVar != null) {
            return new o.d(eVar);
        }
        if (charAt == 'V') {
            return new o.d(null);
        }
        if (charAt == '[') {
            String substring = representation.substring(1);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            cVar = new o.a(c(substring));
        } else {
            if (charAt == 'L') {
                StringsKt.N(representation, ';', false, 2, null);
            }
            String substring2 = representation.substring(1, representation.length() - 1);
            Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
            cVar = new o.c(substring2);
        }
        return cVar;
    }

    @Override // bd.p
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public o.c d(String internalName) {
        Intrinsics.checkNotNullParameter(internalName, "internalName");
        return new o.c(internalName);
    }

    @Override // bd.p
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public o b(Hc.h primitiveType) {
        Intrinsics.checkNotNullParameter(primitiveType, "primitiveType");
        switch (a.f19040a[primitiveType.ordinal()]) {
            case 1:
                return o.f19027a.a();
            case 2:
                return o.f19027a.c();
            case 3:
                return o.f19027a.b();
            case 4:
                return o.f19027a.h();
            case 5:
                return o.f19027a.f();
            case 6:
                return o.f19027a.e();
            case 7:
                return o.f19027a.g();
            case 8:
                return o.f19027a.d();
            default:
                throw new lc.m();
        }
    }

    @Override // bd.p
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public o f() {
        return d("java/lang/Class");
    }

    @Override // bd.p
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public String a(o type) {
        String desc;
        Intrinsics.checkNotNullParameter(type, "type");
        if (type instanceof o.a) {
            return '[' + a(((o.a) type).i());
        }
        if (type instanceof o.d) {
            pd.e i10 = ((o.d) type).i();
            return (i10 == null || (desc = i10.getDesc()) == null) ? "V" : desc;
        }
        if (!(type instanceof o.c)) {
            throw new lc.m();
        }
        return 'L' + ((o.c) type).i() + ';';
    }
}
