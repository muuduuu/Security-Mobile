package ud;

import Kc.AbstractC0947t;
import Kc.AbstractC0948u;
import Kc.InterfaceC0930b;
import dd.EnumC3033j;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class C {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f43634a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f43635b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f43636c;

        static {
            int[] iArr = new int[EnumC3033j.values().length];
            try {
                iArr[EnumC3033j.DECLARATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC3033j.FAKE_OVERRIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC3033j.DELEGATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC3033j.SYNTHESIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f43634a = iArr;
            int[] iArr2 = new int[InterfaceC0930b.a.values().length];
            try {
                iArr2[InterfaceC0930b.a.DECLARATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[InterfaceC0930b.a.FAKE_OVERRIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[InterfaceC0930b.a.DELEGATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[InterfaceC0930b.a.SYNTHESIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            f43635b = iArr2;
            int[] iArr3 = new int[dd.x.values().length];
            try {
                iArr3[dd.x.INTERNAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[dd.x.PRIVATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[dd.x.PRIVATE_TO_THIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[dd.x.PROTECTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[dd.x.PUBLIC.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[dd.x.LOCAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused14) {
            }
            f43636c = iArr3;
        }
    }

    public static final AbstractC0948u a(B b10, dd.x xVar) {
        Intrinsics.checkNotNullParameter(b10, "<this>");
        switch (xVar == null ? -1 : a.f43636c[xVar.ordinal()]) {
            case 1:
                AbstractC0948u INTERNAL = AbstractC0947t.f5588d;
                Intrinsics.checkNotNullExpressionValue(INTERNAL, "INTERNAL");
                return INTERNAL;
            case 2:
                AbstractC0948u PRIVATE = AbstractC0947t.f5585a;
                Intrinsics.checkNotNullExpressionValue(PRIVATE, "PRIVATE");
                return PRIVATE;
            case 3:
                AbstractC0948u PRIVATE_TO_THIS = AbstractC0947t.f5586b;
                Intrinsics.checkNotNullExpressionValue(PRIVATE_TO_THIS, "PRIVATE_TO_THIS");
                return PRIVATE_TO_THIS;
            case 4:
                AbstractC0948u PROTECTED = AbstractC0947t.f5587c;
                Intrinsics.checkNotNullExpressionValue(PROTECTED, "PROTECTED");
                return PROTECTED;
            case 5:
                AbstractC0948u PUBLIC = AbstractC0947t.f5589e;
                Intrinsics.checkNotNullExpressionValue(PUBLIC, "PUBLIC");
                return PUBLIC;
            case 6:
                AbstractC0948u LOCAL = AbstractC0947t.f5590f;
                Intrinsics.checkNotNullExpressionValue(LOCAL, "LOCAL");
                return LOCAL;
            default:
                AbstractC0948u PRIVATE2 = AbstractC0947t.f5585a;
                Intrinsics.checkNotNullExpressionValue(PRIVATE2, "PRIVATE");
                return PRIVATE2;
        }
    }

    public static final InterfaceC0930b.a b(B b10, EnumC3033j enumC3033j) {
        Intrinsics.checkNotNullParameter(b10, "<this>");
        int i10 = enumC3033j == null ? -1 : a.f43634a[enumC3033j.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? InterfaceC0930b.a.DECLARATION : InterfaceC0930b.a.SYNTHESIZED : InterfaceC0930b.a.DELEGATION : InterfaceC0930b.a.FAKE_OVERRIDE : InterfaceC0930b.a.DECLARATION;
    }
}
