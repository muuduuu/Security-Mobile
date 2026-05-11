package yd;

import Hc.j;
import co.hyperverge.hypersnapsdk.activities.HVRetakeActivity;
import co.hyperverge.hypersnapsdk.objects.HVError;
import com.appsflyer.attribution.RequestError;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import ld.AbstractC3629d;

/* loaded from: classes3.dex */
public class n0 {

    /* renamed from: b, reason: collision with root package name */
    public static final n0 f45552b = g(l0.f45549b);

    /* renamed from: a, reason: collision with root package name */
    private final l0 f45553a;

    static class a implements Function1 {
        a() {
        }

        private static /* synthetic */ void a(int i10) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "name", "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor$1", "invoke"));
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Boolean invoke(id.c cVar) {
            if (cVar == null) {
                a(0);
            }
            return Boolean.valueOf(!cVar.equals(j.a.f3921Q));
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f45554a;

        static {
            int[] iArr = new int[d.values().length];
            f45554a = iArr;
            try {
                iArr[d.OUT_IN_IN_POSITION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f45554a[d.IN_IN_OUT_POSITION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f45554a[d.NO_CONFLICT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private static final class c extends Exception {
        public c(String str) {
            super(str);
        }
    }

    private enum d {
        NO_CONFLICT,
        IN_IN_OUT_POSITION,
        OUT_IN_IN_POSITION
    }

    protected n0(l0 l0Var) {
        if (l0Var == null) {
            a(7);
        }
        this.f45553a = l0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x003b A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0021 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        if (i10 != 1 && i10 != 2 && i10 != 8 && i10 != 34 && i10 != 37) {
            switch (i10) {
                default:
                    switch (i10) {
                        default:
                            switch (i10) {
                                default:
                                    switch (i10) {
                                        case RequestError.NETWORK_FAILURE /* 40 */:
                                        case RequestError.NO_DEV_KEY /* 41 */:
                                        case HVError.CONSENT_DENIED /* 42 */:
                                            break;
                                        default:
                                            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                            break;
                                    }
                                case 29:
                                case 30:
                                case HVError.INSTRUCTION_ERROR /* 31 */:
                                case 32:
                                    str = "@NotNull method %s.%s must not return null";
                                    break;
                            }
                        case 19:
                        case HVRetakeActivity.CLOSE_ACTION /* 20 */:
                        case HVRetakeActivity.RECHECK_ACTION /* 21 */:
                        case HVError.FACE_DETECTION_ERROR /* 22 */:
                        case HVError.BLURRY_FACE_DETECTION_ERROR /* 23 */:
                        case HVError.TILT_FACE_DETECTED_ERROR /* 24 */:
                        case HVError.LOW_STORAGE_ERROR /* 25 */:
                            break;
                    }
                case 11:
                case 12:
                case 13:
                    break;
            }
            if (i10 != 1 && i10 != 2 && i10 != 8 && i10 != 34 && i10 != 37) {
                switch (i10) {
                    default:
                        switch (i10) {
                            default:
                                switch (i10) {
                                    default:
                                        switch (i10) {
                                            case RequestError.NETWORK_FAILURE /* 40 */:
                                            case RequestError.NO_DEV_KEY /* 41 */:
                                            case HVError.CONSENT_DENIED /* 42 */:
                                                break;
                                            default:
                                                i11 = 3;
                                                break;
                                        }
                                    case 29:
                                    case 30:
                                    case HVError.INSTRUCTION_ERROR /* 31 */:
                                    case 32:
                                        i11 = 2;
                                        break;
                                }
                            case 19:
                            case HVRetakeActivity.CLOSE_ACTION /* 20 */:
                            case HVRetakeActivity.RECHECK_ACTION /* 21 */:
                            case HVError.FACE_DETECTION_ERROR /* 22 */:
                            case HVError.BLURRY_FACE_DETECTION_ERROR /* 23 */:
                            case HVError.TILT_FACE_DETECTED_ERROR /* 24 */:
                            case HVError.LOW_STORAGE_ERROR /* 25 */:
                                break;
                        }
                    case 11:
                    case 12:
                    case 13:
                        break;
                }
                Object[] objArr = new Object[i11];
                switch (i10) {
                    case 1:
                    case 2:
                    case 8:
                    case 11:
                    case 12:
                    case 13:
                    case 19:
                    case HVRetakeActivity.CLOSE_ACTION /* 20 */:
                    case HVRetakeActivity.RECHECK_ACTION /* 21 */:
                    case HVError.FACE_DETECTION_ERROR /* 22 */:
                    case HVError.BLURRY_FACE_DETECTION_ERROR /* 23 */:
                    case HVError.TILT_FACE_DETECTED_ERROR /* 24 */:
                    case HVError.LOW_STORAGE_ERROR /* 25 */:
                    case 29:
                    case 30:
                    case HVError.INSTRUCTION_ERROR /* 31 */:
                    case 32:
                    case 34:
                    case HVError.INVALID_FILE_ERROR /* 37 */:
                    case RequestError.NETWORK_FAILURE /* 40 */:
                    case RequestError.NO_DEV_KEY /* 41 */:
                    case HVError.CONSENT_DENIED /* 42 */:
                        objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor";
                        break;
                    case 3:
                        objArr[0] = "first";
                        break;
                    case 4:
                        objArr[0] = "second";
                        break;
                    case 5:
                        objArr[0] = "substitutionContext";
                        break;
                    case 6:
                        objArr[0] = "context";
                        break;
                    case 7:
                    default:
                        objArr[0] = "substitution";
                        break;
                    case 9:
                    case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                        objArr[0] = "type";
                        break;
                    case RequestError.EVENT_TIMEOUT /* 10 */:
                    case HVError.SSL_CONNECT_ERROR /* 15 */:
                        objArr[0] = "howThisTypeIsUsed";
                        break;
                    case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                    case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                    case HVError.HYPER_DOC_DETECT_ERROR /* 36 */:
                        objArr[0] = "typeProjection";
                        break;
                    case 18:
                    case 28:
                        objArr[0] = "originalProjection";
                        break;
                    case 26:
                        objArr[0] = "originalType";
                        break;
                    case 27:
                        objArr[0] = "substituted";
                        break;
                    case HVError.GPS_ACCESS_DENIED /* 33 */:
                        objArr[0] = "annotations";
                        break;
                    case HVError.FACE_CAPTURE_TIMEOUT /* 35 */:
                    case 38:
                        objArr[0] = "typeParameterVariance";
                        break;
                    case 39:
                        objArr[0] = "projectionKind";
                        break;
                }
                if (i10 != 1) {
                    objArr[1] = "replaceWithNonApproximatingSubstitution";
                } else if (i10 == 2) {
                    objArr[1] = "replaceWithContravariantApproximatingSubstitution";
                } else if (i10 == 8) {
                    objArr[1] = "getSubstitution";
                } else if (i10 != 34) {
                    if (i10 != 37) {
                        switch (i10) {
                            case 11:
                            case 12:
                            case 13:
                                objArr[1] = "safeSubstitute";
                                break;
                            default:
                                switch (i10) {
                                    case 19:
                                    case HVRetakeActivity.CLOSE_ACTION /* 20 */:
                                    case HVRetakeActivity.RECHECK_ACTION /* 21 */:
                                    case HVError.FACE_DETECTION_ERROR /* 22 */:
                                    case HVError.BLURRY_FACE_DETECTION_ERROR /* 23 */:
                                    case HVError.TILT_FACE_DETECTED_ERROR /* 24 */:
                                    case HVError.LOW_STORAGE_ERROR /* 25 */:
                                        objArr[1] = "unsafeSubstitute";
                                        break;
                                    default:
                                        switch (i10) {
                                            case 29:
                                            case 30:
                                            case HVError.INSTRUCTION_ERROR /* 31 */:
                                            case 32:
                                                objArr[1] = "projectedTypeForConflictedTypeWithUnsafeVariance";
                                                break;
                                            default:
                                                switch (i10) {
                                                    case RequestError.NETWORK_FAILURE /* 40 */:
                                                    case RequestError.NO_DEV_KEY /* 41 */:
                                                    case HVError.CONSENT_DENIED /* 42 */:
                                                        break;
                                                    default:
                                                        objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor";
                                                        break;
                                                }
                                        }
                                }
                        }
                    }
                    objArr[1] = "combine";
                } else {
                    objArr[1] = "filterOutUnsafeVariance";
                }
                switch (i10) {
                    case 1:
                    case 2:
                    case 8:
                    case 11:
                    case 12:
                    case 13:
                    case 19:
                    case HVRetakeActivity.CLOSE_ACTION /* 20 */:
                    case HVRetakeActivity.RECHECK_ACTION /* 21 */:
                    case HVError.FACE_DETECTION_ERROR /* 22 */:
                    case HVError.BLURRY_FACE_DETECTION_ERROR /* 23 */:
                    case HVError.TILT_FACE_DETECTED_ERROR /* 24 */:
                    case HVError.LOW_STORAGE_ERROR /* 25 */:
                    case 29:
                    case 30:
                    case HVError.INSTRUCTION_ERROR /* 31 */:
                    case 32:
                    case 34:
                    case HVError.INVALID_FILE_ERROR /* 37 */:
                    case RequestError.NETWORK_FAILURE /* 40 */:
                    case RequestError.NO_DEV_KEY /* 41 */:
                    case HVError.CONSENT_DENIED /* 42 */:
                        break;
                    case 3:
                    case 4:
                        objArr[2] = "createChainedSubstitutor";
                        break;
                    case 5:
                    case 6:
                    default:
                        objArr[2] = "create";
                        break;
                    case 7:
                        objArr[2] = "<init>";
                        break;
                    case 9:
                    case RequestError.EVENT_TIMEOUT /* 10 */:
                        objArr[2] = "safeSubstitute";
                        break;
                    case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                    case HVError.SSL_CONNECT_ERROR /* 15 */:
                    case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                        objArr[2] = "substitute";
                        break;
                    case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                        objArr[2] = "substituteWithoutApproximation";
                        break;
                    case 18:
                        objArr[2] = "unsafeSubstitute";
                        break;
                    case 26:
                    case 27:
                    case 28:
                        objArr[2] = "projectedTypeForConflictedTypeWithUnsafeVariance";
                        break;
                    case HVError.GPS_ACCESS_DENIED /* 33 */:
                        objArr[2] = "filterOutUnsafeVariance";
                        break;
                    case HVError.FACE_CAPTURE_TIMEOUT /* 35 */:
                    case HVError.HYPER_DOC_DETECT_ERROR /* 36 */:
                    case 38:
                    case 39:
                        objArr[2] = "combine";
                        break;
                }
                String format = String.format(str, objArr);
                if (i10 != 1 && i10 != 2 && i10 != 8 && i10 != 34 && i10 != 37) {
                    switch (i10) {
                        case 11:
                        case 12:
                        case 13:
                            break;
                        default:
                            switch (i10) {
                                case 19:
                                case HVRetakeActivity.CLOSE_ACTION /* 20 */:
                                case HVRetakeActivity.RECHECK_ACTION /* 21 */:
                                case HVError.FACE_DETECTION_ERROR /* 22 */:
                                case HVError.BLURRY_FACE_DETECTION_ERROR /* 23 */:
                                case HVError.TILT_FACE_DETECTED_ERROR /* 24 */:
                                case HVError.LOW_STORAGE_ERROR /* 25 */:
                                    break;
                                default:
                                    switch (i10) {
                                        case 29:
                                        case 30:
                                        case HVError.INSTRUCTION_ERROR /* 31 */:
                                        case 32:
                                            break;
                                        default:
                                            switch (i10) {
                                                case RequestError.NETWORK_FAILURE /* 40 */:
                                                case RequestError.NO_DEV_KEY /* 41 */:
                                                case HVError.CONSENT_DENIED /* 42 */:
                                                    break;
                                                default:
                                                    throw new IllegalArgumentException(format);
                                            }
                                    }
                            }
                    }
                }
                throw new IllegalStateException(format);
            }
            i11 = 2;
            Object[] objArr2 = new Object[i11];
            switch (i10) {
            }
            if (i10 != 1) {
            }
            switch (i10) {
            }
            String format2 = String.format(str, objArr2);
            if (i10 != 1) {
                switch (i10) {
                }
            }
            throw new IllegalStateException(format2);
        }
        str = "@NotNull method %s.%s must not return null";
        if (i10 != 1) {
            switch (i10) {
            }
            Object[] objArr22 = new Object[i11];
            switch (i10) {
            }
            if (i10 != 1) {
            }
            switch (i10) {
            }
            String format22 = String.format(str, objArr22);
            if (i10 != 1) {
            }
            throw new IllegalStateException(format22);
        }
        i11 = 2;
        Object[] objArr222 = new Object[i11];
        switch (i10) {
        }
        if (i10 != 1) {
        }
        switch (i10) {
        }
        String format222 = String.format(str, objArr222);
        if (i10 != 1) {
        }
        throw new IllegalStateException(format222);
    }

    private static void b(int i10, i0 i0Var, l0 l0Var) {
        if (i10 <= 100) {
            return;
        }
        throw new IllegalStateException("Recursion too deep. Most likely infinite loop while substituting " + o(i0Var) + "; substitution: " + o(l0Var));
    }

    public static u0 c(u0 u0Var, i0 i0Var) {
        if (u0Var == null) {
            a(35);
        }
        if (i0Var == null) {
            a(36);
        }
        if (!i0Var.c()) {
            return d(u0Var, i0Var.a());
        }
        u0 u0Var2 = u0.OUT_VARIANCE;
        if (u0Var2 == null) {
            a(37);
        }
        return u0Var2;
    }

    public static u0 d(u0 u0Var, u0 u0Var2) {
        if (u0Var == null) {
            a(38);
        }
        if (u0Var2 == null) {
            a(39);
        }
        u0 u0Var3 = u0.INVARIANT;
        if (u0Var == u0Var3) {
            if (u0Var2 == null) {
                a(40);
            }
            return u0Var2;
        }
        if (u0Var2 == u0Var3) {
            if (u0Var == null) {
                a(41);
            }
            return u0Var;
        }
        if (u0Var == u0Var2) {
            if (u0Var2 == null) {
                a(42);
            }
            return u0Var2;
        }
        throw new AssertionError("Variance conflict: type parameter variance '" + u0Var + "' and projection kind '" + u0Var2 + "' cannot be combined");
    }

    private static d e(u0 u0Var, u0 u0Var2) {
        u0 u0Var3 = u0.IN_VARIANCE;
        return (u0Var == u0Var3 && u0Var2 == u0.OUT_VARIANCE) ? d.OUT_IN_IN_POSITION : (u0Var == u0.OUT_VARIANCE && u0Var2 == u0Var3) ? d.IN_IN_OUT_POSITION : d.NO_CONFLICT;
    }

    public static n0 f(AbstractC5197E abstractC5197E) {
        if (abstractC5197E == null) {
            a(6);
        }
        return g(f0.i(abstractC5197E.W0(), abstractC5197E.U0()));
    }

    public static n0 g(l0 l0Var) {
        if (l0Var == null) {
            a(0);
        }
        return new n0(l0Var);
    }

    public static n0 h(l0 l0Var, l0 l0Var2) {
        if (l0Var == null) {
            a(3);
        }
        if (l0Var2 == null) {
            a(4);
        }
        return g(C5217t.i(l0Var, l0Var2));
    }

    private static kotlin.reflect.jvm.internal.impl.descriptors.annotations.g i(kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar) {
        if (gVar == null) {
            a(33);
        }
        return !gVar.A1(j.a.f3921Q) ? gVar : new kotlin.reflect.jvm.internal.impl.descriptors.annotations.l(gVar, new a());
    }

    private static i0 l(AbstractC5197E abstractC5197E, i0 i0Var, Kc.f0 f0Var, i0 i0Var2) {
        if (abstractC5197E == null) {
            a(26);
        }
        if (i0Var == null) {
            a(27);
        }
        if (i0Var2 == null) {
            a(28);
        }
        if (!abstractC5197E.i().A1(j.a.f3921Q)) {
            if (i0Var == null) {
                a(29);
            }
            return i0Var;
        }
        e0 W02 = i0Var.getType().W0();
        if (!(W02 instanceof kotlin.reflect.jvm.internal.impl.types.checker.j)) {
            return i0Var;
        }
        i0 f10 = ((kotlin.reflect.jvm.internal.impl.types.checker.j) W02).f();
        u0 a10 = f10.a();
        d e10 = e(i0Var2.a(), a10);
        d dVar = d.OUT_IN_IN_POSITION;
        return e10 == dVar ? new k0(f10.getType()) : f0Var == null ? i0Var : e(f0Var.u(), a10) == dVar ? new k0(f10.getType()) : i0Var;
    }

    private static String o(Object obj) {
        try {
            return obj.toString();
        } catch (Throwable th) {
            if (Gd.d.a(th)) {
                throw th;
            }
            return "[Exception while computing toString(): " + th + "]";
        }
    }

    private i0 r(i0 i0Var, int i10) {
        AbstractC5197E type = i0Var.getType();
        u0 a10 = i0Var.a();
        if (type.W0().d() instanceof Kc.f0) {
            return i0Var;
        }
        M b10 = Q.b(type);
        AbstractC5197E p10 = b10 != null ? m().p(b10, u0.INVARIANT) : null;
        AbstractC5197E b11 = m0.b(type, s(type.W0().c(), type.U0(), i10), this.f45553a.d(type.i()));
        if ((b11 instanceof M) && (p10 instanceof M)) {
            b11 = Q.j((M) b11, (M) p10);
        }
        return new k0(a10, b11);
    }

    private List s(List list, List list2, int i10) {
        ArrayList arrayList = new ArrayList(list.size());
        boolean z10 = false;
        for (int i11 = 0; i11 < list.size(); i11++) {
            Kc.f0 f0Var = (Kc.f0) list.get(i11);
            i0 i0Var = (i0) list2.get(i11);
            i0 u10 = u(i0Var, f0Var, i10 + 1);
            int i12 = b.f45554a[e(f0Var.u(), u10.a()).ordinal()];
            if (i12 == 1 || i12 == 2) {
                u10 = q0.s(f0Var);
            } else if (i12 == 3) {
                u0 u11 = f0Var.u();
                u0 u0Var = u0.INVARIANT;
                if (u11 != u0Var && !u10.c()) {
                    u10 = new k0(u0Var, u10.getType());
                }
            }
            if (u10 != i0Var) {
                z10 = true;
            }
            arrayList.add(u10);
        }
        return !z10 ? list2 : arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private i0 u(i0 i0Var, Kc.f0 f0Var, int i10) {
        if (i0Var == null) {
            a(18);
        }
        b(i10, i0Var, this.f45553a);
        if (i0Var.c()) {
            return i0Var;
        }
        AbstractC5197E type = i0Var.getType();
        if (type instanceof r0) {
            r0 r0Var = (r0) type;
            t0 N02 = r0Var.N0();
            AbstractC5197E N10 = r0Var.N();
            i0 u10 = u(new k0(i0Var.a(), N02), f0Var, i10 + 1);
            return u10.c() ? u10 : new k0(u10.a(), s0.d(u10.getType().Z0(), p(N10, i0Var.a())));
        }
        if (!AbstractC5218u.a(type) && !(type.Z0() instanceof L)) {
            i0 e10 = this.f45553a.e(type);
            i0 l10 = e10 != null ? l(type, e10, f0Var, i0Var) : null;
            u0 a10 = i0Var.a();
            if (l10 == null && AbstractC5194B.b(type) && !c0.b(type)) {
                AbstractC5222y a11 = AbstractC5194B.a(type);
                int i11 = i10 + 1;
                i0 u11 = u(new k0(a10, a11.e1()), f0Var, i11);
                i0 u12 = u(new k0(a10, a11.f1()), f0Var, i11);
                return (u11.getType() == a11.e1() && u12.getType() == a11.f1()) ? i0Var : new k0(u11.a(), C5198F.d(m0.a(u11.getType()), m0.a(u12.getType())));
            }
            if (!Hc.g.n0(type) && !G.a(type)) {
                if (l10 != null) {
                    d e11 = e(a10, l10.a());
                    if (!AbstractC3629d.d(type)) {
                        int i12 = b.f45554a[e11.ordinal()];
                        if (i12 == 1) {
                            throw new c("Out-projection in in-position");
                        }
                        if (i12 == 2) {
                            return new k0(u0.OUT_VARIANCE, type.W0().v().I());
                        }
                    }
                    InterfaceC5211m a12 = c0.a(type);
                    if (l10.c()) {
                        return l10;
                    }
                    AbstractC5197E D10 = a12 != null ? a12.D(l10.getType()) : q0.q(l10.getType(), type.X0());
                    if (!type.i().isEmpty()) {
                        D10 = Bd.a.x(D10, new kotlin.reflect.jvm.internal.impl.descriptors.annotations.k(D10.i(), i(this.f45553a.d(type.i()))));
                    }
                    if (e11 == d.NO_CONFLICT) {
                        a10 = d(a10, l10.a());
                    }
                    return new k0(a10, D10);
                }
                i0Var = r(i0Var, i10);
                if (i0Var == null) {
                    a(25);
                }
            }
        }
        return i0Var;
    }

    public l0 j() {
        l0 l0Var = this.f45553a;
        if (l0Var == null) {
            a(8);
        }
        return l0Var;
    }

    public boolean k() {
        return this.f45553a.f();
    }

    public n0 m() {
        l0 l0Var = this.f45553a;
        return ((l0Var instanceof C5195C) && l0Var.b()) ? new n0(new C5195C(((C5195C) this.f45553a).j(), ((C5195C) this.f45553a).i(), false)) : this;
    }

    public AbstractC5197E n(AbstractC5197E abstractC5197E, u0 u0Var) {
        if (abstractC5197E == null) {
            a(9);
        }
        if (u0Var == null) {
            a(10);
        }
        if (k()) {
            if (abstractC5197E == null) {
                a(11);
            }
            return abstractC5197E;
        }
        try {
            AbstractC5197E type = u(new k0(u0Var, abstractC5197E), null, 0).getType();
            if (type == null) {
                a(12);
            }
            return type;
        } catch (c e10) {
            kotlin.reflect.jvm.internal.impl.types.error.h d10 = kotlin.reflect.jvm.internal.impl.types.error.k.d(kotlin.reflect.jvm.internal.impl.types.error.j.UNABLE_TO_SUBSTITUTE_TYPE, e10.getMessage());
            if (d10 == null) {
                a(13);
            }
            return d10;
        }
    }

    public AbstractC5197E p(AbstractC5197E abstractC5197E, u0 u0Var) {
        if (abstractC5197E == null) {
            a(14);
        }
        if (u0Var == null) {
            a(15);
        }
        i0 q10 = q(new k0(u0Var, j().g(abstractC5197E, u0Var)));
        if (q10 == null) {
            return null;
        }
        return q10.getType();
    }

    public i0 q(i0 i0Var) {
        if (i0Var == null) {
            a(16);
        }
        i0 t10 = t(i0Var);
        return (this.f45553a.a() || this.f45553a.b()) ? Cd.b.c(t10, this.f45553a.b()) : t10;
    }

    public i0 t(i0 i0Var) {
        if (i0Var == null) {
            a(17);
        }
        if (k()) {
            return i0Var;
        }
        try {
            return u(i0Var, null, 0);
        } catch (c unused) {
            return null;
        }
    }
}
