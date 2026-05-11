package yd;

import Kc.InterfaceC0933e;
import Kc.InterfaceC0936h;
import co.hyperverge.hypersnapsdk.activities.HVRetakeActivity;
import co.hyperverge.hypersnapsdk.objects.HVError;
import com.appsflyer.attribution.RequestError;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import u5.C4870a;

/* loaded from: classes3.dex */
public abstract class q0 {

    /* renamed from: a, reason: collision with root package name */
    public static final M f45559a = kotlin.reflect.jvm.internal.impl.types.error.k.d(kotlin.reflect.jvm.internal.impl.types.error.j.DONT_CARE, new String[0]);

    /* renamed from: b, reason: collision with root package name */
    public static final M f45560b = kotlin.reflect.jvm.internal.impl.types.error.k.d(kotlin.reflect.jvm.internal.impl.types.error.j.UNINFERRED_LAMBDA_PARAMETER_TYPE, new String[0]);

    /* renamed from: c, reason: collision with root package name */
    public static final M f45561c = new a("NO_EXPECTED_TYPE");

    /* renamed from: d, reason: collision with root package name */
    public static final M f45562d = new a("UNIT_EXPECTED_TYPE");

    public static class a extends AbstractC5215q {

        /* renamed from: b, reason: collision with root package name */
        private final String f45563b;

        public a(String str) {
            this.f45563b = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0044  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x003e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static /* synthetic */ void i1(int i10) {
            String format;
            String str = (i10 == 1 || i10 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i10 == 1 || i10 == 4) ? 2 : 3];
            if (i10 != 1) {
                if (i10 == 2) {
                    objArr[0] = "delegate";
                } else if (i10 == 3) {
                    objArr[0] = "kotlinTypeRefiner";
                } else if (i10 != 4) {
                    objArr[0] = "newAttributes";
                }
                if (i10 != 1) {
                    objArr[1] = "toString";
                } else if (i10 != 4) {
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType";
                } else {
                    objArr[1] = "refine";
                }
                if (i10 != 1) {
                    if (i10 == 2) {
                        objArr[2] = "replaceDelegate";
                    } else if (i10 == 3) {
                        objArr[2] = "refine";
                    } else if (i10 != 4) {
                        objArr[2] = "replaceAttributes";
                    }
                }
                format = String.format(str, objArr);
                if (i10 == 1 && i10 != 4) {
                    throw new IllegalArgumentException(format);
                }
                throw new IllegalStateException(format);
            }
            objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType";
            if (i10 != 1) {
            }
            if (i10 != 1) {
            }
            format = String.format(str, objArr);
            if (i10 == 1) {
            }
            throw new IllegalStateException(format);
        }

        @Override // yd.t0
        /* renamed from: d1, reason: merged with bridge method [inline-methods] */
        public M a1(boolean z10) {
            throw new IllegalStateException(this.f45563b);
        }

        @Override // yd.t0
        /* renamed from: e1, reason: merged with bridge method [inline-methods] */
        public M c1(a0 a0Var) {
            if (a0Var == null) {
                i1(0);
            }
            throw new IllegalStateException(this.f45563b);
        }

        @Override // yd.AbstractC5215q
        protected M f1() {
            throw new IllegalStateException(this.f45563b);
        }

        @Override // yd.AbstractC5215q
        public AbstractC5215q h1(M m10) {
            if (m10 == null) {
                i1(2);
            }
            throw new IllegalStateException(this.f45563b);
        }

        @Override // yd.AbstractC5215q
        /* renamed from: j1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public a g1(kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
            if (gVar == null) {
                i1(3);
            }
            return this;
        }

        @Override // yd.M
        public String toString() {
            String str = this.f45563b;
            if (str == null) {
                i1(1);
            }
            return str;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01c1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        if (i10 != 4 && i10 != 9 && i10 != 11 && i10 != 15 && i10 != 17 && i10 != 19 && i10 != 26 && i10 != 35 && i10 != 48 && i10 != 53 && i10 != 6 && i10 != 7) {
            switch (i10) {
                case 56:
                case 57:
                case 58:
                case 59:
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
            if (i10 != 4 && i10 != 9 && i10 != 11 && i10 != 15 && i10 != 17 && i10 != 19 && i10 != 26 && i10 != 35 && i10 != 48 && i10 != 53 && i10 != 6 && i10 != 7) {
                switch (i10) {
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                        break;
                    default:
                        i11 = 3;
                        break;
                }
                Object[] objArr = new Object[i11];
                switch (i10) {
                    case 4:
                    case 6:
                    case 7:
                    case 9:
                    case 11:
                    case HVError.SSL_CONNECT_ERROR /* 15 */:
                    case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                    case 19:
                    case 26:
                    case HVError.FACE_CAPTURE_TIMEOUT /* 35 */:
                    case 48:
                    case 53:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                        objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils";
                        break;
                    case 5:
                    case 8:
                    case RequestError.EVENT_TIMEOUT /* 10 */:
                    case 18:
                    case HVError.BLURRY_FACE_DETECTION_ERROR /* 23 */:
                    case HVError.LOW_STORAGE_ERROR /* 25 */:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 38:
                    case RequestError.NETWORK_FAILURE /* 40 */:
                    default:
                        objArr[0] = "type";
                        break;
                    case 12:
                        objArr[0] = "typeConstructor";
                        break;
                    case 13:
                        objArr[0] = "unsubstitutedMemberScope";
                        break;
                    case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                        objArr[0] = "refinedTypeFactory";
                        break;
                    case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                        objArr[0] = "parameters";
                        break;
                    case HVRetakeActivity.CLOSE_ACTION /* 20 */:
                        objArr[0] = "subType";
                        break;
                    case HVRetakeActivity.RECHECK_ACTION /* 21 */:
                        objArr[0] = "superType";
                        break;
                    case HVError.FACE_DETECTION_ERROR /* 22 */:
                        objArr[0] = "substitutor";
                        break;
                    case HVError.TILT_FACE_DETECTED_ERROR /* 24 */:
                        objArr[0] = "result";
                        break;
                    case HVError.INSTRUCTION_ERROR /* 31 */:
                    case HVError.GPS_ACCESS_DENIED /* 33 */:
                        objArr[0] = "clazz";
                        break;
                    case 32:
                        objArr[0] = "typeArguments";
                        break;
                    case 34:
                        objArr[0] = "projections";
                        break;
                    case HVError.HYPER_DOC_DETECT_ERROR /* 36 */:
                        objArr[0] = C4870a.f43493a;
                        break;
                    case HVError.INVALID_FILE_ERROR /* 37 */:
                        objArr[0] = "b";
                        break;
                    case 39:
                        objArr[0] = "typeParameters";
                        break;
                    case RequestError.NO_DEV_KEY /* 41 */:
                        objArr[0] = "typeParameterConstructors";
                        break;
                    case HVError.CONSENT_DENIED /* 42 */:
                        objArr[0] = "specialType";
                        break;
                    case HVError.ENCRYPTION_ERROR /* 43 */:
                    case HVError.SDK_CLOSE_ERROR /* 44 */:
                        objArr[0] = "isSpecialType";
                        break;
                    case HVError.PERMISSION_REVOKED_ERROR /* 45 */:
                    case 46:
                        objArr[0] = "parameterDescriptor";
                        break;
                    case 47:
                    case 51:
                        objArr[0] = "numberValueTypeConstructor";
                        break;
                    case 49:
                    case 50:
                        objArr[0] = "supertypes";
                        break;
                    case 52:
                    case 55:
                        objArr[0] = "expectedType";
                        break;
                    case 54:
                        objArr[0] = "literalTypeConstructor";
                        break;
                }
                if (i10 == 4) {
                    if (i10 != 9) {
                        if (i10 == 11 || i10 == 15) {
                            objArr[1] = "makeUnsubstitutedType";
                        } else if (i10 == 17) {
                            objArr[1] = "getDefaultTypeProjections";
                        } else if (i10 == 19) {
                            objArr[1] = "getImmediateSupertypes";
                        } else if (i10 == 26) {
                            objArr[1] = "getAllSupertypes";
                        } else if (i10 == 35) {
                            objArr[1] = "substituteProjectionsForParameters";
                        } else if (i10 != 48) {
                            if (i10 != 53) {
                                if (i10 != 6 && i10 != 7) {
                                    switch (i10) {
                                        case 56:
                                        case 57:
                                        case 58:
                                        case 59:
                                            break;
                                        default:
                                            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils";
                                            break;
                                    }
                                }
                            }
                            objArr[1] = "getPrimitiveNumberType";
                        } else {
                            objArr[1] = "getDefaultPrimitiveNumberType";
                        }
                    }
                    objArr[1] = "makeNullableIfNeeded";
                } else {
                    objArr[1] = "makeNullableAsSpecified";
                }
                switch (i10) {
                    case 1:
                        objArr[2] = "makeNullable";
                        break;
                    case 2:
                        objArr[2] = "makeNotNullable";
                        break;
                    case 3:
                        objArr[2] = "makeNullableAsSpecified";
                        break;
                    case 4:
                    case 6:
                    case 7:
                    case 9:
                    case 11:
                    case HVError.SSL_CONNECT_ERROR /* 15 */:
                    case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                    case 19:
                    case 26:
                    case HVError.FACE_CAPTURE_TIMEOUT /* 35 */:
                    case 48:
                    case 53:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                        break;
                    case 5:
                    case 8:
                        objArr[2] = "makeNullableIfNeeded";
                        break;
                    case RequestError.EVENT_TIMEOUT /* 10 */:
                        objArr[2] = "canHaveSubtypes";
                        break;
                    case 12:
                    case 13:
                    case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                        objArr[2] = "makeUnsubstitutedType";
                        break;
                    case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                        objArr[2] = "getDefaultTypeProjections";
                        break;
                    case 18:
                        objArr[2] = "getImmediateSupertypes";
                        break;
                    case HVRetakeActivity.CLOSE_ACTION /* 20 */:
                    case HVRetakeActivity.RECHECK_ACTION /* 21 */:
                    case HVError.FACE_DETECTION_ERROR /* 22 */:
                        objArr[2] = "createSubstitutedSupertype";
                        break;
                    case HVError.BLURRY_FACE_DETECTION_ERROR /* 23 */:
                    case HVError.TILT_FACE_DETECTED_ERROR /* 24 */:
                        objArr[2] = "collectAllSupertypes";
                        break;
                    case HVError.LOW_STORAGE_ERROR /* 25 */:
                        objArr[2] = "getAllSupertypes";
                        break;
                    case 27:
                        objArr[2] = "isNullableType";
                        break;
                    case 28:
                        objArr[2] = "acceptsNullable";
                        break;
                    case 29:
                        objArr[2] = "hasNullableSuperType";
                        break;
                    case 30:
                        objArr[2] = "getClassDescriptor";
                        break;
                    case HVError.INSTRUCTION_ERROR /* 31 */:
                    case 32:
                        objArr[2] = "substituteParameters";
                        break;
                    case HVError.GPS_ACCESS_DENIED /* 33 */:
                    case 34:
                        objArr[2] = "substituteProjectionsForParameters";
                        break;
                    case HVError.HYPER_DOC_DETECT_ERROR /* 36 */:
                    case HVError.INVALID_FILE_ERROR /* 37 */:
                        objArr[2] = "equalTypes";
                        break;
                    case 38:
                    case 39:
                        objArr[2] = "dependsOnTypeParameters";
                        break;
                    case RequestError.NETWORK_FAILURE /* 40 */:
                    case RequestError.NO_DEV_KEY /* 41 */:
                        objArr[2] = "dependsOnTypeConstructors";
                        break;
                    case HVError.CONSENT_DENIED /* 42 */:
                    case HVError.ENCRYPTION_ERROR /* 43 */:
                    case HVError.SDK_CLOSE_ERROR /* 44 */:
                        objArr[2] = "contains";
                        break;
                    case HVError.PERMISSION_REVOKED_ERROR /* 45 */:
                    case 46:
                        objArr[2] = "makeStarProjection";
                        break;
                    case 47:
                    case 49:
                        objArr[2] = "getDefaultPrimitiveNumberType";
                        break;
                    case 50:
                        objArr[2] = "findByFqName";
                        break;
                    case 51:
                    case 52:
                    case 54:
                    case 55:
                        objArr[2] = "getPrimitiveNumberType";
                        break;
                    case HVError.DETECTOR_NOT_AVAILABLE_ERROR /* 60 */:
                        objArr[2] = "isTypeParameter";
                        break;
                    case 61:
                        objArr[2] = "isReifiedTypeParameter";
                        break;
                    case 62:
                        objArr[2] = "isNonReifiedTypeParameter";
                        break;
                    case 63:
                        objArr[2] = "getTypeParameterDescriptorOrNull";
                        break;
                    default:
                        objArr[2] = "noExpectedType";
                        break;
                }
                String format = String.format(str, objArr);
                if (i10 != 4 && i10 != 9 && i10 != 11 && i10 != 15 && i10 != 17 && i10 != 19 && i10 != 26 && i10 != 35 && i10 != 48 && i10 != 53 && i10 != 6 && i10 != 7) {
                    switch (i10) {
                        case 56:
                        case 57:
                        case 58:
                        case 59:
                            break;
                        default:
                            throw new IllegalArgumentException(format);
                    }
                }
                throw new IllegalStateException(format);
            }
            i11 = 2;
            Object[] objArr2 = new Object[i11];
            switch (i10) {
            }
            if (i10 == 4) {
            }
            switch (i10) {
            }
            String format2 = String.format(str, objArr2);
            if (i10 != 4) {
                switch (i10) {
                }
            }
            throw new IllegalStateException(format2);
        }
        str = "@NotNull method %s.%s must not return null";
        if (i10 != 4) {
            switch (i10) {
            }
            Object[] objArr22 = new Object[i11];
            switch (i10) {
            }
            if (i10 == 4) {
            }
            switch (i10) {
            }
            String format22 = String.format(str, objArr22);
            if (i10 != 4) {
            }
            throw new IllegalStateException(format22);
        }
        i11 = 2;
        Object[] objArr222 = new Object[i11];
        switch (i10) {
        }
        if (i10 == 4) {
        }
        switch (i10) {
        }
        String format222 = String.format(str, objArr222);
        if (i10 != 4) {
        }
        throw new IllegalStateException(format222);
    }

    public static boolean b(AbstractC5197E abstractC5197E) {
        if (abstractC5197E == null) {
            a(28);
        }
        if (abstractC5197E.X0()) {
            return true;
        }
        return AbstractC5194B.b(abstractC5197E) && b(AbstractC5194B.a(abstractC5197E).f1());
    }

    public static boolean c(AbstractC5197E abstractC5197E, Function1 function1) {
        if (function1 == null) {
            a(43);
        }
        return d(abstractC5197E, function1, null);
    }

    private static boolean d(AbstractC5197E abstractC5197E, Function1 function1, Gd.g gVar) {
        if (function1 == null) {
            a(44);
        }
        if (abstractC5197E == null) {
            return false;
        }
        t0 Z02 = abstractC5197E.Z0();
        if (w(abstractC5197E)) {
            return ((Boolean) function1.invoke(Z02)).booleanValue();
        }
        if (gVar != null && gVar.contains(abstractC5197E)) {
            return false;
        }
        if (((Boolean) function1.invoke(Z02)).booleanValue()) {
            return true;
        }
        if (gVar == null) {
            gVar = Gd.g.c();
        }
        gVar.add(abstractC5197E);
        AbstractC5222y abstractC5222y = Z02 instanceof AbstractC5222y ? (AbstractC5222y) Z02 : null;
        if (abstractC5222y != null && (d(abstractC5222y.e1(), function1, gVar) || d(abstractC5222y.f1(), function1, gVar))) {
            return true;
        }
        if ((Z02 instanceof C5213o) && d(((C5213o) Z02).i1(), function1, gVar)) {
            return true;
        }
        e0 W02 = abstractC5197E.W0();
        if (W02 instanceof C5196D) {
            Iterator it = ((C5196D) W02).a().iterator();
            while (it.hasNext()) {
                if (d((AbstractC5197E) it.next(), function1, gVar)) {
                    return true;
                }
            }
            return false;
        }
        for (i0 i0Var : abstractC5197E.U0()) {
            if (!i0Var.c() && d(i0Var.getType(), function1, gVar)) {
                return true;
            }
        }
        return false;
    }

    public static AbstractC5197E e(AbstractC5197E abstractC5197E, AbstractC5197E abstractC5197E2, n0 n0Var) {
        if (abstractC5197E == null) {
            a(20);
        }
        if (abstractC5197E2 == null) {
            a(21);
        }
        if (n0Var == null) {
            a(22);
        }
        AbstractC5197E p10 = n0Var.p(abstractC5197E2, u0.INVARIANT);
        if (p10 != null) {
            return q(p10, abstractC5197E.X0());
        }
        return null;
    }

    public static InterfaceC0933e f(AbstractC5197E abstractC5197E) {
        if (abstractC5197E == null) {
            a(30);
        }
        InterfaceC0936h d10 = abstractC5197E.W0().d();
        if (d10 instanceof InterfaceC0933e) {
            return (InterfaceC0933e) d10;
        }
        return null;
    }

    public static List g(List list) {
        if (list == null) {
            a(16);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new k0(((Kc.f0) it.next()).y()));
        }
        List O02 = CollectionsKt.O0(arrayList);
        if (O02 == null) {
            a(17);
        }
        return O02;
    }

    public static List h(AbstractC5197E abstractC5197E) {
        if (abstractC5197E == null) {
            a(18);
        }
        n0 f10 = n0.f(abstractC5197E);
        Collection a10 = abstractC5197E.W0().a();
        ArrayList arrayList = new ArrayList(a10.size());
        Iterator it = a10.iterator();
        while (it.hasNext()) {
            AbstractC5197E e10 = e(abstractC5197E, (AbstractC5197E) it.next(), f10);
            if (e10 != null) {
                arrayList.add(e10);
            }
        }
        return arrayList;
    }

    public static Kc.f0 i(AbstractC5197E abstractC5197E) {
        if (abstractC5197E == null) {
            a(63);
        }
        if (abstractC5197E.W0().d() instanceof Kc.f0) {
            return (Kc.f0) abstractC5197E.W0().d();
        }
        return null;
    }

    public static boolean j(AbstractC5197E abstractC5197E) {
        if (abstractC5197E == null) {
            a(29);
        }
        if (abstractC5197E.W0().d() instanceof InterfaceC0933e) {
            return false;
        }
        Iterator it = h(abstractC5197E).iterator();
        while (it.hasNext()) {
            if (l((AbstractC5197E) it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean k(AbstractC5197E abstractC5197E) {
        return abstractC5197E != null && abstractC5197E.W0() == f45559a.W0();
    }

    public static boolean l(AbstractC5197E abstractC5197E) {
        if (abstractC5197E == null) {
            a(27);
        }
        if (abstractC5197E.X0()) {
            return true;
        }
        if (AbstractC5194B.b(abstractC5197E) && l(AbstractC5194B.a(abstractC5197E).f1())) {
            return true;
        }
        if (Q.c(abstractC5197E)) {
            return false;
        }
        if (m(abstractC5197E)) {
            return j(abstractC5197E);
        }
        e0 W02 = abstractC5197E.W0();
        if (W02 instanceof C5196D) {
            Iterator it = W02.a().iterator();
            while (it.hasNext()) {
                if (l((AbstractC5197E) it.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean m(AbstractC5197E abstractC5197E) {
        if (abstractC5197E == null) {
            a(60);
        }
        if (i(abstractC5197E) != null) {
            return true;
        }
        abstractC5197E.W0();
        return false;
    }

    public static AbstractC5197E n(AbstractC5197E abstractC5197E) {
        if (abstractC5197E == null) {
            a(2);
        }
        return p(abstractC5197E, false);
    }

    public static AbstractC5197E o(AbstractC5197E abstractC5197E) {
        if (abstractC5197E == null) {
            a(1);
        }
        return p(abstractC5197E, true);
    }

    public static AbstractC5197E p(AbstractC5197E abstractC5197E, boolean z10) {
        if (abstractC5197E == null) {
            a(3);
        }
        t0 a12 = abstractC5197E.Z0().a1(z10);
        if (a12 == null) {
            a(4);
        }
        return a12;
    }

    public static AbstractC5197E q(AbstractC5197E abstractC5197E, boolean z10) {
        if (abstractC5197E == null) {
            a(8);
        }
        if (z10) {
            return o(abstractC5197E);
        }
        if (abstractC5197E == null) {
            a(9);
        }
        return abstractC5197E;
    }

    public static M r(M m10, boolean z10) {
        if (m10 == null) {
            a(5);
        }
        if (!z10) {
            if (m10 == null) {
                a(7);
            }
            return m10;
        }
        M a12 = m10.a1(true);
        if (a12 == null) {
            a(6);
        }
        return a12;
    }

    public static i0 s(Kc.f0 f0Var) {
        if (f0Var == null) {
            a(45);
        }
        return new T(f0Var);
    }

    public static i0 t(Kc.f0 f0Var, AbstractC5220w abstractC5220w) {
        if (f0Var == null) {
            a(46);
        }
        return abstractC5220w.b() == p0.SUPERTYPE ? new k0(U.b(f0Var)) : new T(f0Var);
    }

    public static M u(InterfaceC0936h interfaceC0936h, rd.h hVar, Function1 function1) {
        if (!kotlin.reflect.jvm.internal.impl.types.error.k.m(interfaceC0936h)) {
            return v(interfaceC0936h.r(), hVar, function1);
        }
        kotlin.reflect.jvm.internal.impl.types.error.h d10 = kotlin.reflect.jvm.internal.impl.types.error.k.d(kotlin.reflect.jvm.internal.impl.types.error.j.UNABLE_TO_SUBSTITUTE_TYPE, interfaceC0936h.toString());
        if (d10 == null) {
            a(11);
        }
        return d10;
    }

    public static M v(e0 e0Var, rd.h hVar, Function1 function1) {
        if (e0Var == null) {
            a(12);
        }
        if (hVar == null) {
            a(13);
        }
        if (function1 == null) {
            a(14);
        }
        M l10 = C5198F.l(a0.f45478b.i(), e0Var, g(e0Var.c()), false, hVar, function1);
        if (l10 == null) {
            a(15);
        }
        return l10;
    }

    public static boolean w(AbstractC5197E abstractC5197E) {
        if (abstractC5197E == null) {
            a(0);
        }
        return abstractC5197E == f45561c || abstractC5197E == f45562d;
    }
}
