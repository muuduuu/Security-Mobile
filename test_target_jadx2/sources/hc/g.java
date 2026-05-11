package Hc;

import Hc.j;
import Kc.AbstractC0946s;
import Kc.AbstractC0951x;
import Kc.G;
import Kc.InterfaceC0933e;
import Kc.InterfaceC0936h;
import Kc.InterfaceC0941m;
import Kc.K;
import Kc.U;
import Kc.V;
import Kc.W;
import Lc.a;
import Lc.c;
import Mc.x;
import co.hyperverge.hypersnapsdk.activities.HVRetakeActivity;
import co.hyperverge.hypersnapsdk.objects.HVError;
import co.hyperverge.hypersnapsdk.service.framerecorder.HVFrameRecorder;
import co.hyperverge.hypersnapsdk.utils.AppConstants;
import com.appsflyer.attribution.RequestError;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.swmansion.reanimated.BuildConfig;
import id.C3367b;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import od.AbstractC3778c;
import yd.AbstractC5197E;
import yd.C5198F;
import yd.M;
import yd.b0;
import yd.e0;
import yd.i0;
import yd.k0;
import yd.q0;
import yd.u0;

/* loaded from: classes3.dex */
public abstract class g {

    /* renamed from: g, reason: collision with root package name */
    public static final id.f f3830g = id.f.r("<built-ins module>");

    /* renamed from: a, reason: collision with root package name */
    private x f3831a;

    /* renamed from: b, reason: collision with root package name */
    private xd.i f3832b;

    /* renamed from: c, reason: collision with root package name */
    private final xd.i f3833c;

    /* renamed from: d, reason: collision with root package name */
    private final xd.i f3834d;

    /* renamed from: e, reason: collision with root package name */
    private final xd.g f3835e;

    /* renamed from: f, reason: collision with root package name */
    private final xd.n f3836f;

    class a implements Function0 {
        a() {
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Collection invoke() {
            return Arrays.asList(g.this.r().p0(j.f3891y), g.this.r().p0(j.f3861A), g.this.r().p0(j.f3862B), g.this.r().p0(j.f3892z));
        }
    }

    class b implements Function0 {
        b() {
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e invoke() {
            EnumMap enumMap = new EnumMap(h.class);
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            for (h hVar : h.values()) {
                M q10 = g.this.q(hVar.getTypeName().c());
                M q11 = g.this.q(hVar.getArrayTypeName().c());
                enumMap.put((EnumMap) hVar, (h) q11);
                hashMap.put(q10, q11);
                hashMap2.put(q11, q10);
            }
            return new e(enumMap, hashMap, hashMap2, null);
        }
    }

    class c implements Function1 {
        c() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public InterfaceC0933e invoke(id.f fVar) {
            InterfaceC0936h f10 = g.this.s().f(fVar, Rc.d.FROM_BUILTINS);
            if (f10 == null) {
                throw new AssertionError("Built-in class " + j.f3891y.c(fVar) + " is not found");
            }
            if (f10 instanceof InterfaceC0933e) {
                return (InterfaceC0933e) f10;
            }
            throw new AssertionError("Must be a class descriptor " + fVar + ", but was " + f10);
        }
    }

    class d implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ x f3840a;

        d(x xVar) {
            this.f3840a = xVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void invoke() {
            if (g.this.f3831a == null) {
                g.this.f3831a = this.f3840a;
                return null;
            }
            throw new AssertionError("Built-ins module is already set: " + g.this.f3831a + " (attempting to reset to " + this.f3840a + ")");
        }
    }

    private static class e {

        /* renamed from: a, reason: collision with root package name */
        public final Map f3842a;

        /* renamed from: b, reason: collision with root package name */
        public final Map f3843b;

        /* renamed from: c, reason: collision with root package name */
        public final Map f3844c;

        /* synthetic */ e(Map map, Map map2, Map map3, a aVar) {
            this(map, map2, map3);
        }

        private static /* synthetic */ void a(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "primitiveKotlinTypeToKotlinArrayType";
            } else if (i10 != 2) {
                objArr[0] = "primitiveTypeToArrayKotlinType";
            } else {
                objArr[0] = "kotlinArrayTypeToPrimitiveKotlinType";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns$Primitives";
            objArr[2] = "<init>";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        private e(Map map, Map map2, Map map3) {
            if (map == null) {
                a(0);
            }
            if (map2 == null) {
                a(1);
            }
            if (map3 == null) {
                a(2);
            }
            this.f3842a = map;
            this.f3843b = map2;
            this.f3844c = map3;
        }
    }

    protected g(xd.n nVar) {
        if (nVar == null) {
            a(0);
        }
        this.f3836f = nVar;
        this.f3834d = nVar.d(new a());
        this.f3833c = nVar.d(new b());
        this.f3835e = nVar.h(new c());
    }

    private static AbstractC5197E A(AbstractC5197E abstractC5197E, G g10) {
        C3367b k10;
        C3367b a10;
        InterfaceC0933e a11;
        if (abstractC5197E == null) {
            a(72);
        }
        if (g10 == null) {
            a(73);
        }
        InterfaceC0936h d10 = abstractC5197E.W0().d();
        if (d10 == null) {
            return null;
        }
        n nVar = n.f3984a;
        if (!nVar.b(d10.getName()) || (k10 = AbstractC3778c.k(d10)) == null || (a10 = nVar.a(k10)) == null || (a11 = AbstractC0951x.a(g10, a10)) == null) {
            return null;
        }
        return a11.y();
    }

    public static boolean A0(AbstractC5197E abstractC5197E) {
        if (abstractC5197E == null) {
            a(130);
        }
        return i0(abstractC5197E, j.a.f3904F0.j());
    }

    public static boolean B0(InterfaceC0941m interfaceC0941m) {
        if (interfaceC0941m == null) {
            a(10);
        }
        while (interfaceC0941m != null) {
            if (interfaceC0941m instanceof K) {
                return ((K) interfaceC0941m).e().i(j.f3890x);
            }
            interfaceC0941m = interfaceC0941m.b();
        }
        return false;
    }

    public static boolean C0(AbstractC5197E abstractC5197E) {
        if (abstractC5197E == null) {
            a(143);
        }
        return m0(abstractC5197E, j.a.f3941f);
    }

    public static boolean D0(AbstractC5197E abstractC5197E) {
        if (abstractC5197E == null) {
            a(133);
        }
        return x0(abstractC5197E) || A0(abstractC5197E) || y0(abstractC5197E) || z0(abstractC5197E);
    }

    public static h N(AbstractC5197E abstractC5197E) {
        if (abstractC5197E == null) {
            a(93);
        }
        InterfaceC0936h d10 = abstractC5197E.W0().d();
        if (d10 == null) {
            return null;
        }
        return P(d10);
    }

    public static h P(InterfaceC0941m interfaceC0941m) {
        if (interfaceC0941m == null) {
            a(78);
        }
        if (j.a.f3912J0.contains(interfaceC0941m.getName())) {
            return (h) j.a.f3916L0.get(kd.f.m(interfaceC0941m));
        }
        return null;
    }

    private InterfaceC0933e Q(h hVar) {
        if (hVar == null) {
            a(16);
        }
        return p(hVar.getTypeName().c());
    }

    public static h S(InterfaceC0941m interfaceC0941m) {
        if (interfaceC0941m == null) {
            a(77);
        }
        if (j.a.f3910I0.contains(interfaceC0941m.getName())) {
            return (h) j.a.f3914K0.get(kd.f.m(interfaceC0941m));
        }
        return null;
    }

    private static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case HVError.SSL_CONNECT_ERROR /* 15 */:
            case 18:
            case 19:
            case HVRetakeActivity.CLOSE_ACTION /* 20 */:
            case HVRetakeActivity.RECHECK_ACTION /* 21 */:
            case HVError.FACE_DETECTION_ERROR /* 22 */:
            case HVError.BLURRY_FACE_DETECTION_ERROR /* 23 */:
            case HVError.TILT_FACE_DETECTED_ERROR /* 24 */:
            case HVError.LOW_STORAGE_ERROR /* 25 */:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case HVError.INSTRUCTION_ERROR /* 31 */:
            case 32:
            case HVError.GPS_ACCESS_DENIED /* 33 */:
            case 34:
            case HVError.FACE_CAPTURE_TIMEOUT /* 35 */:
            case HVError.HYPER_DOC_DETECT_ERROR /* 36 */:
            case HVError.INVALID_FILE_ERROR /* 37 */:
            case 38:
            case 39:
            case RequestError.NETWORK_FAILURE /* 40 */:
            case RequestError.NO_DEV_KEY /* 41 */:
            case HVError.CONSENT_DENIED /* 42 */:
            case HVError.ENCRYPTION_ERROR /* 43 */:
            case HVError.SDK_CLOSE_ERROR /* 44 */:
            case HVError.PERMISSION_REVOKED_ERROR /* 45 */:
            case 46:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case HVError.DETECTOR_NOT_AVAILABLE_ERROR /* 60 */:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 69:
            case 70:
            case 71:
            case 75:
            case 82:
            case 85:
            case AppConstants.REQUEST_CODE /* 87 */:
            case 88:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 9:
            case RequestError.EVENT_TIMEOUT /* 10 */:
            case 12:
            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
            case HVError.ACTIVE_SESSION_ERROR /* 16 */:
            case HVError.TRANSACTION_ID_EMPTY /* 17 */:
            case 47:
            case 54:
            case 68:
            case 72:
            case 73:
            case 74:
            case BuildConfig.REACT_NATIVE_MINOR_VERSION /* 76 */:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 83:
            case 84:
            case 86:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case HVError.SSL_CONNECT_ERROR /* 15 */:
            case 18:
            case 19:
            case HVRetakeActivity.CLOSE_ACTION /* 20 */:
            case HVRetakeActivity.RECHECK_ACTION /* 21 */:
            case HVError.FACE_DETECTION_ERROR /* 22 */:
            case HVError.BLURRY_FACE_DETECTION_ERROR /* 23 */:
            case HVError.TILT_FACE_DETECTED_ERROR /* 24 */:
            case HVError.LOW_STORAGE_ERROR /* 25 */:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case HVError.INSTRUCTION_ERROR /* 31 */:
            case 32:
            case HVError.GPS_ACCESS_DENIED /* 33 */:
            case 34:
            case HVError.FACE_CAPTURE_TIMEOUT /* 35 */:
            case HVError.HYPER_DOC_DETECT_ERROR /* 36 */:
            case HVError.INVALID_FILE_ERROR /* 37 */:
            case 38:
            case 39:
            case RequestError.NETWORK_FAILURE /* 40 */:
            case RequestError.NO_DEV_KEY /* 41 */:
            case HVError.CONSENT_DENIED /* 42 */:
            case HVError.ENCRYPTION_ERROR /* 43 */:
            case HVError.SDK_CLOSE_ERROR /* 44 */:
            case HVError.PERMISSION_REVOKED_ERROR /* 45 */:
            case 46:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case HVError.DETECTOR_NOT_AVAILABLE_ERROR /* 60 */:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 69:
            case 70:
            case 71:
            case 75:
            case 82:
            case 85:
            case AppConstants.REQUEST_CODE /* 87 */:
            case 88:
                i11 = 2;
                break;
            case 9:
            case RequestError.EVENT_TIMEOUT /* 10 */:
            case 12:
            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
            case HVError.ACTIVE_SESSION_ERROR /* 16 */:
            case HVError.TRANSACTION_ID_EMPTY /* 17 */:
            case 47:
            case 54:
            case 68:
            case 72:
            case 73:
            case 74:
            case BuildConfig.REACT_NATIVE_MINOR_VERSION /* 76 */:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 83:
            case 84:
            case 86:
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
            case 73:
                objArr[0] = "module";
                break;
            case 2:
                objArr[0] = "computation";
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case HVError.SSL_CONNECT_ERROR /* 15 */:
            case 18:
            case 19:
            case HVRetakeActivity.CLOSE_ACTION /* 20 */:
            case HVRetakeActivity.RECHECK_ACTION /* 21 */:
            case HVError.FACE_DETECTION_ERROR /* 22 */:
            case HVError.BLURRY_FACE_DETECTION_ERROR /* 23 */:
            case HVError.TILT_FACE_DETECTED_ERROR /* 24 */:
            case HVError.LOW_STORAGE_ERROR /* 25 */:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case HVError.INSTRUCTION_ERROR /* 31 */:
            case 32:
            case HVError.GPS_ACCESS_DENIED /* 33 */:
            case 34:
            case HVError.FACE_CAPTURE_TIMEOUT /* 35 */:
            case HVError.HYPER_DOC_DETECT_ERROR /* 36 */:
            case HVError.INVALID_FILE_ERROR /* 37 */:
            case 38:
            case 39:
            case RequestError.NETWORK_FAILURE /* 40 */:
            case RequestError.NO_DEV_KEY /* 41 */:
            case HVError.CONSENT_DENIED /* 42 */:
            case HVError.ENCRYPTION_ERROR /* 43 */:
            case HVError.SDK_CLOSE_ERROR /* 44 */:
            case HVError.PERMISSION_REVOKED_ERROR /* 45 */:
            case 46:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case HVError.DETECTOR_NOT_AVAILABLE_ERROR /* 60 */:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 69:
            case 70:
            case 71:
            case 75:
            case 82:
            case 85:
            case AppConstants.REQUEST_CODE /* 87 */:
            case 88:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                break;
            case 9:
            case RequestError.EVENT_TIMEOUT /* 10 */:
            case 77:
            case 78:
            case 90:
            case 97:
            case 104:
            case 108:
            case 109:
            case 144:
            case 147:
            case 148:
            case 150:
            case 158:
            case 159:
            case 160:
            case 161:
                objArr[0] = "descriptor";
                break;
            case 12:
            case 99:
            case 101:
            case 103:
            case 105:
            case 107:
            case 136:
                objArr[0] = "fqName";
                break;
            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                objArr[0] = "simpleName";
                break;
            case HVError.ACTIVE_SESSION_ERROR /* 16 */:
            case HVError.TRANSACTION_ID_EMPTY /* 17 */:
            case 54:
            case 89:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 96:
            case 98:
            case 100:
            case 106:
            case 110:
            case 111:
            case 112:
            case 114:
            case 115:
            case 116:
            case 117:
            case 118:
            case 119:
            case 120:
            case 121:
            case 122:
            case 123:
            case 124:
            case HVFrameRecorder.FRAME_DURATION /* 125 */:
            case 126:
            case 127:
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 135:
            case 137:
            case 138:
            case 139:
            case 140:
            case 141:
            case 142:
            case 143:
            case 145:
            case 146:
            case 149:
            case HVError.CPR_CHECK_SESSION_INTERNAL_ERROR /* 151 */:
            case 152:
            case 153:
            case 154:
            case ModuleDescriptor.MODULE_VERSION /* 155 */:
            case 156:
            case 157:
            case 163:
                objArr[0] = "type";
                break;
            case 47:
                objArr[0] = "classSimpleName";
                break;
            case 68:
                objArr[0] = "arrayType";
                break;
            case 72:
                objArr[0] = "notNullArrayType";
                break;
            case 74:
                objArr[0] = "primitiveType";
                break;
            case BuildConfig.REACT_NATIVE_MINOR_VERSION /* 76 */:
                objArr[0] = "kotlinType";
                break;
            case 79:
            case 83:
                objArr[0] = "projectionType";
                break;
            case 80:
            case 84:
            case 86:
                objArr[0] = "argument";
                break;
            case 81:
                objArr[0] = "annotations";
                break;
            case 102:
                objArr[0] = "typeConstructor";
                break;
            case 113:
                objArr[0] = "classDescriptor";
                break;
            case 162:
                objArr[0] = "declarationDescriptor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i10) {
            case 3:
                objArr[1] = "getAdditionalClassPartsProvider";
                break;
            case 4:
                objArr[1] = "getPlatformDependentDeclarationFilter";
                break;
            case 5:
                objArr[1] = "getClassDescriptorFactories";
                break;
            case 6:
                objArr[1] = "getStorageManager";
                break;
            case 7:
                objArr[1] = "getBuiltInsModule";
                break;
            case 8:
                objArr[1] = "getBuiltInPackagesImportedByDefault";
                break;
            case 9:
            case RequestError.EVENT_TIMEOUT /* 10 */:
            case 12:
            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
            case HVError.ACTIVE_SESSION_ERROR /* 16 */:
            case HVError.TRANSACTION_ID_EMPTY /* 17 */:
            case 47:
            case 54:
            case 68:
            case 72:
            case 73:
            case 74:
            case BuildConfig.REACT_NATIVE_MINOR_VERSION /* 76 */:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 83:
            case 84:
            case 86:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                break;
            case 11:
                objArr[1] = "getBuiltInsPackageScope";
                break;
            case 13:
                objArr[1] = "getBuiltInClassByFqName";
                break;
            case HVError.SSL_CONNECT_ERROR /* 15 */:
                objArr[1] = "getBuiltInClassByName";
                break;
            case 18:
                objArr[1] = "getSuspendFunction";
                break;
            case 19:
                objArr[1] = "getKFunction";
                break;
            case HVRetakeActivity.CLOSE_ACTION /* 20 */:
                objArr[1] = "getKSuspendFunction";
                break;
            case HVRetakeActivity.RECHECK_ACTION /* 21 */:
                objArr[1] = "getKClass";
                break;
            case HVError.FACE_DETECTION_ERROR /* 22 */:
                objArr[1] = "getKType";
                break;
            case HVError.BLURRY_FACE_DETECTION_ERROR /* 23 */:
                objArr[1] = "getKCallable";
                break;
            case HVError.TILT_FACE_DETECTED_ERROR /* 24 */:
                objArr[1] = "getKProperty";
                break;
            case HVError.LOW_STORAGE_ERROR /* 25 */:
                objArr[1] = "getKProperty0";
                break;
            case 26:
                objArr[1] = "getKProperty1";
                break;
            case 27:
                objArr[1] = "getKProperty2";
                break;
            case 28:
                objArr[1] = "getKMutableProperty0";
                break;
            case 29:
                objArr[1] = "getKMutableProperty1";
                break;
            case 30:
                objArr[1] = "getKMutableProperty2";
                break;
            case HVError.INSTRUCTION_ERROR /* 31 */:
                objArr[1] = "getIterator";
                break;
            case 32:
                objArr[1] = "getIterable";
                break;
            case HVError.GPS_ACCESS_DENIED /* 33 */:
                objArr[1] = "getMutableIterable";
                break;
            case 34:
                objArr[1] = "getMutableIterator";
                break;
            case HVError.FACE_CAPTURE_TIMEOUT /* 35 */:
                objArr[1] = "getCollection";
                break;
            case HVError.HYPER_DOC_DETECT_ERROR /* 36 */:
                objArr[1] = "getMutableCollection";
                break;
            case HVError.INVALID_FILE_ERROR /* 37 */:
                objArr[1] = "getList";
                break;
            case 38:
                objArr[1] = "getMutableList";
                break;
            case 39:
                objArr[1] = "getSet";
                break;
            case RequestError.NETWORK_FAILURE /* 40 */:
                objArr[1] = "getMutableSet";
                break;
            case RequestError.NO_DEV_KEY /* 41 */:
                objArr[1] = "getMap";
                break;
            case HVError.CONSENT_DENIED /* 42 */:
                objArr[1] = "getMutableMap";
                break;
            case HVError.ENCRYPTION_ERROR /* 43 */:
                objArr[1] = "getMapEntry";
                break;
            case HVError.SDK_CLOSE_ERROR /* 44 */:
                objArr[1] = "getMutableMapEntry";
                break;
            case HVError.PERMISSION_REVOKED_ERROR /* 45 */:
                objArr[1] = "getListIterator";
                break;
            case 46:
                objArr[1] = "getMutableListIterator";
                break;
            case 48:
                objArr[1] = "getBuiltInTypeByClassName";
                break;
            case 49:
                objArr[1] = "getNothingType";
                break;
            case 50:
                objArr[1] = "getNullableNothingType";
                break;
            case 51:
                objArr[1] = "getAnyType";
                break;
            case 52:
                objArr[1] = "getNullableAnyType";
                break;
            case 53:
                objArr[1] = "getDefaultBound";
                break;
            case 55:
                objArr[1] = "getPrimitiveKotlinType";
                break;
            case 56:
                objArr[1] = "getNumberType";
                break;
            case 57:
                objArr[1] = "getByteType";
                break;
            case 58:
                objArr[1] = "getShortType";
                break;
            case 59:
                objArr[1] = "getIntType";
                break;
            case HVError.DETECTOR_NOT_AVAILABLE_ERROR /* 60 */:
                objArr[1] = "getLongType";
                break;
            case 61:
                objArr[1] = "getFloatType";
                break;
            case 62:
                objArr[1] = "getDoubleType";
                break;
            case 63:
                objArr[1] = "getCharType";
                break;
            case 64:
                objArr[1] = "getBooleanType";
                break;
            case 65:
                objArr[1] = "getUnitType";
                break;
            case 66:
                objArr[1] = "getStringType";
                break;
            case 67:
                objArr[1] = "getIterableType";
                break;
            case 69:
            case 70:
            case 71:
                objArr[1] = "getArrayElementType";
                break;
            case 75:
                objArr[1] = "getPrimitiveArrayKotlinType";
                break;
            case 82:
            case 85:
                objArr[1] = "getArrayType";
                break;
            case AppConstants.REQUEST_CODE /* 87 */:
                objArr[1] = "getEnumType";
                break;
            case 88:
                objArr[1] = "getAnnotationType";
                break;
        }
        switch (i10) {
            case 1:
                objArr[2] = "setBuiltInsModule";
                break;
            case 2:
                objArr[2] = "setPostponedBuiltinsModuleComputation";
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case HVError.SSL_CONNECT_ERROR /* 15 */:
            case 18:
            case 19:
            case HVRetakeActivity.CLOSE_ACTION /* 20 */:
            case HVRetakeActivity.RECHECK_ACTION /* 21 */:
            case HVError.FACE_DETECTION_ERROR /* 22 */:
            case HVError.BLURRY_FACE_DETECTION_ERROR /* 23 */:
            case HVError.TILT_FACE_DETECTED_ERROR /* 24 */:
            case HVError.LOW_STORAGE_ERROR /* 25 */:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case HVError.INSTRUCTION_ERROR /* 31 */:
            case 32:
            case HVError.GPS_ACCESS_DENIED /* 33 */:
            case 34:
            case HVError.FACE_CAPTURE_TIMEOUT /* 35 */:
            case HVError.HYPER_DOC_DETECT_ERROR /* 36 */:
            case HVError.INVALID_FILE_ERROR /* 37 */:
            case 38:
            case 39:
            case RequestError.NETWORK_FAILURE /* 40 */:
            case RequestError.NO_DEV_KEY /* 41 */:
            case HVError.CONSENT_DENIED /* 42 */:
            case HVError.ENCRYPTION_ERROR /* 43 */:
            case HVError.SDK_CLOSE_ERROR /* 44 */:
            case HVError.PERMISSION_REVOKED_ERROR /* 45 */:
            case 46:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case HVError.DETECTOR_NOT_AVAILABLE_ERROR /* 60 */:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 69:
            case 70:
            case 71:
            case 75:
            case 82:
            case 85:
            case AppConstants.REQUEST_CODE /* 87 */:
            case 88:
                break;
            case 9:
                objArr[2] = "isBuiltIn";
                break;
            case RequestError.EVENT_TIMEOUT /* 10 */:
                objArr[2] = "isUnderKotlinPackage";
                break;
            case 12:
                objArr[2] = "getBuiltInClassByFqName";
                break;
            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                objArr[2] = "getBuiltInClassByName";
                break;
            case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                objArr[2] = "getPrimitiveClassDescriptor";
                break;
            case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                objArr[2] = "getPrimitiveArrayClassDescriptor";
                break;
            case 47:
                objArr[2] = "getBuiltInTypeByClassName";
                break;
            case 54:
                objArr[2] = "getPrimitiveKotlinType";
                break;
            case 68:
                objArr[2] = "getArrayElementType";
                break;
            case 72:
            case 73:
                objArr[2] = "getElementTypeForUnsignedArray";
                break;
            case 74:
                objArr[2] = "getPrimitiveArrayKotlinType";
                break;
            case BuildConfig.REACT_NATIVE_MINOR_VERSION /* 76 */:
                objArr[2] = "getPrimitiveArrayKotlinTypeByPrimitiveKotlinType";
                break;
            case 77:
            case 94:
                objArr[2] = "getPrimitiveType";
                break;
            case 78:
                objArr[2] = "getPrimitiveArrayType";
                break;
            case 79:
            case 80:
            case 81:
            case 83:
            case 84:
                objArr[2] = "getArrayType";
                break;
            case 86:
                objArr[2] = "getEnumType";
                break;
            case 89:
                objArr[2] = "isArray";
                break;
            case 90:
            case 91:
                objArr[2] = "isArrayOrPrimitiveArray";
                break;
            case 92:
                objArr[2] = "isPrimitiveArray";
                break;
            case 93:
                objArr[2] = "getPrimitiveArrayElementType";
                break;
            case 95:
                objArr[2] = "isPrimitiveType";
                break;
            case 96:
                objArr[2] = "isPrimitiveTypeOrNullablePrimitiveType";
                break;
            case 97:
                objArr[2] = "isPrimitiveClass";
                break;
            case 98:
            case 99:
            case 100:
            case 101:
                objArr[2] = "isConstructedFromGivenClass";
                break;
            case 102:
            case 103:
                objArr[2] = "isTypeConstructorForGivenClass";
                break;
            case 104:
            case 105:
                objArr[2] = "classFqNameEquals";
                break;
            case 106:
            case 107:
                objArr[2] = "isNotNullConstructedFromGivenClass";
                break;
            case 108:
                objArr[2] = "isSpecialClassWithNoSupertypes";
                break;
            case 109:
            case 110:
                objArr[2] = "isAny";
                break;
            case 111:
            case 113:
                objArr[2] = "isBoolean";
                break;
            case 112:
                objArr[2] = "isBooleanOrNullableBoolean";
                break;
            case 114:
                objArr[2] = "isNumber";
                break;
            case 115:
                objArr[2] = "isChar";
                break;
            case 116:
                objArr[2] = "isCharOrNullableChar";
                break;
            case 117:
                objArr[2] = "isInt";
                break;
            case 118:
                objArr[2] = "isByte";
                break;
            case 119:
                objArr[2] = "isLong";
                break;
            case 120:
                objArr[2] = "isLongOrNullableLong";
                break;
            case 121:
                objArr[2] = "isShort";
                break;
            case 122:
                objArr[2] = "isFloat";
                break;
            case 123:
                objArr[2] = "isFloatOrNullableFloat";
                break;
            case 124:
                objArr[2] = "isDouble";
                break;
            case HVFrameRecorder.FRAME_DURATION /* 125 */:
                objArr[2] = "isUByte";
                break;
            case 126:
                objArr[2] = "isUShort";
                break;
            case 127:
                objArr[2] = "isUInt";
                break;
            case 128:
                objArr[2] = "isULong";
                break;
            case 129:
                objArr[2] = "isUByteArray";
                break;
            case 130:
                objArr[2] = "isUShortArray";
                break;
            case 131:
                objArr[2] = "isUIntArray";
                break;
            case 132:
                objArr[2] = "isULongArray";
                break;
            case 133:
                objArr[2] = "isUnsignedArrayType";
                break;
            case 134:
                objArr[2] = "isDoubleOrNullableDouble";
                break;
            case 135:
            case 136:
                objArr[2] = "isConstructedFromGivenClassAndNotNullable";
                break;
            case 137:
                objArr[2] = "isNothing";
                break;
            case 138:
                objArr[2] = "isNullableNothing";
                break;
            case 139:
                objArr[2] = "isNothingOrNullableNothing";
                break;
            case 140:
                objArr[2] = "isAnyOrNullableAny";
                break;
            case 141:
                objArr[2] = "isNullableAny";
                break;
            case 142:
                objArr[2] = "isDefaultBound";
                break;
            case 143:
                objArr[2] = "isUnit";
                break;
            case 144:
                objArr[2] = "mayReturnNonUnitValue";
                break;
            case 145:
                objArr[2] = "isUnitOrNullableUnit";
                break;
            case 146:
                objArr[2] = "isBooleanOrSubtype";
                break;
            case 147:
                objArr[2] = "isMemberOfAny";
                break;
            case 148:
            case 149:
                objArr[2] = "isEnum";
                break;
            case 150:
            case HVError.CPR_CHECK_SESSION_INTERNAL_ERROR /* 151 */:
                objArr[2] = "isComparable";
                break;
            case 152:
                objArr[2] = "isCollectionOrNullableCollection";
                break;
            case 153:
                objArr[2] = "isListOrNullableList";
                break;
            case 154:
                objArr[2] = "isSetOrNullableSet";
                break;
            case ModuleDescriptor.MODULE_VERSION /* 155 */:
                objArr[2] = "isMapOrNullableMap";
                break;
            case 156:
                objArr[2] = "isIterableOrNullableIterable";
                break;
            case 157:
                objArr[2] = "isThrowableOrNullableThrowable";
                break;
            case 158:
                objArr[2] = "isThrowable";
                break;
            case 159:
                objArr[2] = "isKClass";
                break;
            case 160:
                objArr[2] = "isNonPrimitiveArray";
                break;
            case 161:
                objArr[2] = "isCloneable";
                break;
            case 162:
                objArr[2] = "isDeprecated";
                break;
            case 163:
                objArr[2] = "isNotNullOrNullableFunctionSupertype";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i10) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case HVError.SSL_CONNECT_ERROR /* 15 */:
            case 18:
            case 19:
            case HVRetakeActivity.CLOSE_ACTION /* 20 */:
            case HVRetakeActivity.RECHECK_ACTION /* 21 */:
            case HVError.FACE_DETECTION_ERROR /* 22 */:
            case HVError.BLURRY_FACE_DETECTION_ERROR /* 23 */:
            case HVError.TILT_FACE_DETECTED_ERROR /* 24 */:
            case HVError.LOW_STORAGE_ERROR /* 25 */:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case HVError.INSTRUCTION_ERROR /* 31 */:
            case 32:
            case HVError.GPS_ACCESS_DENIED /* 33 */:
            case 34:
            case HVError.FACE_CAPTURE_TIMEOUT /* 35 */:
            case HVError.HYPER_DOC_DETECT_ERROR /* 36 */:
            case HVError.INVALID_FILE_ERROR /* 37 */:
            case 38:
            case 39:
            case RequestError.NETWORK_FAILURE /* 40 */:
            case RequestError.NO_DEV_KEY /* 41 */:
            case HVError.CONSENT_DENIED /* 42 */:
            case HVError.ENCRYPTION_ERROR /* 43 */:
            case HVError.SDK_CLOSE_ERROR /* 44 */:
            case HVError.PERMISSION_REVOKED_ERROR /* 45 */:
            case 46:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case HVError.DETECTOR_NOT_AVAILABLE_ERROR /* 60 */:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 69:
            case 70:
            case 71:
            case 75:
            case 82:
            case 85:
            case AppConstants.REQUEST_CODE /* 87 */:
            case 88:
                throw new IllegalStateException(format);
            case 9:
            case RequestError.EVENT_TIMEOUT /* 10 */:
            case 12:
            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
            case HVError.ACTIVE_SESSION_ERROR /* 16 */:
            case HVError.TRANSACTION_ID_EMPTY /* 17 */:
            case 47:
            case 54:
            case 68:
            case 72:
            case 73:
            case 74:
            case BuildConfig.REACT_NATIVE_MINOR_VERSION /* 76 */:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 83:
            case 84:
            case 86:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    public static boolean a0(InterfaceC0933e interfaceC0933e) {
        if (interfaceC0933e == null) {
            a(109);
        }
        return e(interfaceC0933e, j.a.f3933b);
    }

    public static boolean b0(AbstractC5197E abstractC5197E) {
        if (abstractC5197E == null) {
            a(140);
        }
        return h0(abstractC5197E, j.a.f3933b);
    }

    public static boolean c0(AbstractC5197E abstractC5197E) {
        if (abstractC5197E == null) {
            a(89);
        }
        return h0(abstractC5197E, j.a.f3947i);
    }

    public static boolean d0(InterfaceC0933e interfaceC0933e) {
        if (interfaceC0933e == null) {
            a(90);
        }
        return e(interfaceC0933e, j.a.f3947i) || P(interfaceC0933e) != null;
    }

    private static boolean e(InterfaceC0936h interfaceC0936h, id.d dVar) {
        if (interfaceC0936h == null) {
            a(104);
        }
        if (dVar == null) {
            a(105);
        }
        return interfaceC0936h.getName().equals(dVar.i()) && dVar.equals(kd.f.m(interfaceC0936h));
    }

    public static boolean e0(AbstractC5197E abstractC5197E) {
        if (abstractC5197E == null) {
            a(91);
        }
        return c0(abstractC5197E) || q0(abstractC5197E);
    }

    public static boolean f0(AbstractC5197E abstractC5197E) {
        if (abstractC5197E == null) {
            a(111);
        }
        return i0(abstractC5197E, j.a.f3949j);
    }

    public static boolean g0(InterfaceC0941m interfaceC0941m) {
        if (interfaceC0941m == null) {
            a(9);
        }
        return kd.f.r(interfaceC0941m, Hc.b.class, false) != null;
    }

    private static boolean h0(AbstractC5197E abstractC5197E, id.d dVar) {
        if (abstractC5197E == null) {
            a(98);
        }
        if (dVar == null) {
            a(99);
        }
        return w0(abstractC5197E.W0(), dVar);
    }

    private static boolean i0(AbstractC5197E abstractC5197E, id.d dVar) {
        if (abstractC5197E == null) {
            a(135);
        }
        if (dVar == null) {
            a(136);
        }
        return h0(abstractC5197E, dVar) && !abstractC5197E.X0();
    }

    public static boolean j0(AbstractC5197E abstractC5197E) {
        if (abstractC5197E == null) {
            a(142);
        }
        return p0(abstractC5197E);
    }

    public static boolean k0(InterfaceC0941m interfaceC0941m) {
        if (interfaceC0941m == null) {
            a(162);
        }
        if (interfaceC0941m.a().i().A1(j.a.f3979y)) {
            return true;
        }
        if (!(interfaceC0941m instanceof U)) {
            return false;
        }
        U u10 = (U) interfaceC0941m;
        boolean q02 = u10.q0();
        V d10 = u10.d();
        W l10 = u10.l();
        if (d10 != null && k0(d10)) {
            if (!q02) {
                return true;
            }
            if (l10 != null && k0(l10)) {
                return true;
            }
        }
        return false;
    }

    public static boolean l0(InterfaceC0933e interfaceC0933e) {
        if (interfaceC0933e == null) {
            a(159);
        }
        return e(interfaceC0933e, j.a.f3950j0);
    }

    private static boolean m0(AbstractC5197E abstractC5197E, id.d dVar) {
        if (abstractC5197E == null) {
            a(106);
        }
        if (dVar == null) {
            a(107);
        }
        return !abstractC5197E.X0() && h0(abstractC5197E, dVar);
    }

    public static boolean n0(AbstractC5197E abstractC5197E) {
        if (abstractC5197E == null) {
            a(137);
        }
        return o0(abstractC5197E) && !q0.l(abstractC5197E);
    }

    public static boolean o0(AbstractC5197E abstractC5197E) {
        if (abstractC5197E == null) {
            a(139);
        }
        return h0(abstractC5197E, j.a.f3935c);
    }

    private InterfaceC0933e p(String str) {
        if (str == null) {
            a(14);
        }
        InterfaceC0933e interfaceC0933e = (InterfaceC0933e) this.f3835e.invoke(id.f.o(str));
        if (interfaceC0933e == null) {
            a(15);
        }
        return interfaceC0933e;
    }

    public static boolean p0(AbstractC5197E abstractC5197E) {
        if (abstractC5197E == null) {
            a(141);
        }
        return b0(abstractC5197E) && abstractC5197E.X0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public M q(String str) {
        if (str == null) {
            a(47);
        }
        M y10 = p(str).y();
        if (y10 == null) {
            a(48);
        }
        return y10;
    }

    public static boolean q0(AbstractC5197E abstractC5197E) {
        if (abstractC5197E == null) {
            a(92);
        }
        InterfaceC0936h d10 = abstractC5197E.W0().d();
        return (d10 == null || P(d10) == null) ? false : true;
    }

    public static boolean r0(InterfaceC0933e interfaceC0933e) {
        if (interfaceC0933e == null) {
            a(97);
        }
        return S(interfaceC0933e) != null;
    }

    public static boolean s0(AbstractC5197E abstractC5197E) {
        if (abstractC5197E == null) {
            a(95);
        }
        return !abstractC5197E.X0() && t0(abstractC5197E);
    }

    public static boolean t0(AbstractC5197E abstractC5197E) {
        if (abstractC5197E == null) {
            a(96);
        }
        InterfaceC0936h d10 = abstractC5197E.W0().d();
        return (d10 instanceof InterfaceC0933e) && r0((InterfaceC0933e) d10);
    }

    public static boolean u0(InterfaceC0933e interfaceC0933e) {
        if (interfaceC0933e == null) {
            a(108);
        }
        return e(interfaceC0933e, j.a.f3933b) || e(interfaceC0933e, j.a.f3935c);
    }

    public static boolean v0(AbstractC5197E abstractC5197E) {
        return abstractC5197E != null && m0(abstractC5197E, j.a.f3945h);
    }

    public static boolean w0(e0 e0Var, id.d dVar) {
        if (e0Var == null) {
            a(102);
        }
        if (dVar == null) {
            a(103);
        }
        InterfaceC0936h d10 = e0Var.d();
        return (d10 instanceof InterfaceC0933e) && e(d10, dVar);
    }

    public static boolean x0(AbstractC5197E abstractC5197E) {
        if (abstractC5197E == null) {
            a(129);
        }
        return i0(abstractC5197E, j.a.f3902E0.j());
    }

    public static boolean y0(AbstractC5197E abstractC5197E) {
        if (abstractC5197E == null) {
            a(131);
        }
        return i0(abstractC5197E, j.a.f3906G0.j());
    }

    public static boolean z0(AbstractC5197E abstractC5197E) {
        if (abstractC5197E == null) {
            a(132);
        }
        return i0(abstractC5197E, j.a.f3908H0.j());
    }

    public M B() {
        M R10 = R(h.FLOAT);
        if (R10 == null) {
            a(61);
        }
        return R10;
    }

    public InterfaceC0933e C(int i10) {
        return p(j.b(i10));
    }

    public M D() {
        M R10 = R(h.INT);
        if (R10 == null) {
            a(59);
        }
        return R10;
    }

    public InterfaceC0933e E() {
        InterfaceC0933e o10 = o(j.a.f3950j0.l());
        if (o10 == null) {
            a(21);
        }
        return o10;
    }

    public void E0(x xVar) {
        if (xVar == null) {
            a(1);
        }
        this.f3836f.e(new d(xVar));
    }

    public M F() {
        M R10 = R(h.LONG);
        if (R10 == null) {
            a(60);
        }
        return R10;
    }

    public InterfaceC0933e G() {
        return p("Nothing");
    }

    public M H() {
        M y10 = G().y();
        if (y10 == null) {
            a(49);
        }
        return y10;
    }

    public M I() {
        M a12 = i().a1(true);
        if (a12 == null) {
            a(52);
        }
        return a12;
    }

    public M J() {
        M a12 = H().a1(true);
        if (a12 == null) {
            a(50);
        }
        return a12;
    }

    public InterfaceC0933e K() {
        return p("Number");
    }

    public M L() {
        M y10 = K().y();
        if (y10 == null) {
            a(56);
        }
        return y10;
    }

    protected Lc.c M() {
        c.b bVar = c.b.f5749a;
        if (bVar == null) {
            a(4);
        }
        return bVar;
    }

    public M O(h hVar) {
        if (hVar == null) {
            a(74);
        }
        M m10 = (M) ((e) this.f3833c.invoke()).f3842a.get(hVar);
        if (m10 == null) {
            a(75);
        }
        return m10;
    }

    public M R(h hVar) {
        if (hVar == null) {
            a(54);
        }
        M y10 = Q(hVar).y();
        if (y10 == null) {
            a(55);
        }
        return y10;
    }

    public M T() {
        M R10 = R(h.SHORT);
        if (R10 == null) {
            a(58);
        }
        return R10;
    }

    protected xd.n U() {
        xd.n nVar = this.f3836f;
        if (nVar == null) {
            a(6);
        }
        return nVar;
    }

    public InterfaceC0933e V() {
        return p("String");
    }

    public M W() {
        M y10 = V().y();
        if (y10 == null) {
            a(66);
        }
        return y10;
    }

    public InterfaceC0933e X(int i10) {
        InterfaceC0933e o10 = o(j.f3883q.c(id.f.o(j.d(i10))));
        if (o10 == null) {
            a(18);
        }
        return o10;
    }

    public InterfaceC0933e Y() {
        return p("Unit");
    }

    public M Z() {
        M y10 = Y().y();
        if (y10 == null) {
            a(65);
        }
        return y10;
    }

    protected void f(boolean z10) {
        x xVar = new x(f3830g, this.f3836f, this, null);
        this.f3831a = xVar;
        xVar.b1(Hc.a.f3821a.a().a(this.f3836f, this.f3831a, v(), M(), g(), z10));
        x xVar2 = this.f3831a;
        xVar2.h1(xVar2);
    }

    protected Lc.a g() {
        a.C0116a c0116a = a.C0116a.f5747a;
        if (c0116a == null) {
            a(3);
        }
        return c0116a;
    }

    public InterfaceC0933e h() {
        return p("Any");
    }

    public M i() {
        M y10 = h().y();
        if (y10 == null) {
            a(51);
        }
        return y10;
    }

    public InterfaceC0933e j() {
        return p("Array");
    }

    public AbstractC5197E k(AbstractC5197E abstractC5197E) {
        AbstractC5197E A10;
        if (abstractC5197E == null) {
            a(68);
        }
        if (c0(abstractC5197E)) {
            if (abstractC5197E.U0().size() != 1) {
                throw new IllegalStateException();
            }
            AbstractC5197E type = ((i0) abstractC5197E.U0().get(0)).getType();
            if (type == null) {
                a(69);
            }
            return type;
        }
        AbstractC5197E n10 = q0.n(abstractC5197E);
        AbstractC5197E abstractC5197E2 = (AbstractC5197E) ((e) this.f3833c.invoke()).f3844c.get(n10);
        if (abstractC5197E2 != null) {
            return abstractC5197E2;
        }
        G i10 = kd.f.i(n10);
        if (i10 != null && (A10 = A(n10, i10)) != null) {
            return A10;
        }
        throw new IllegalStateException("not array: " + abstractC5197E);
    }

    public M l(u0 u0Var, AbstractC5197E abstractC5197E) {
        if (u0Var == null) {
            a(83);
        }
        if (abstractC5197E == null) {
            a(84);
        }
        M m10 = m(u0Var, abstractC5197E, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f36445g0.b());
        if (m10 == null) {
            a(85);
        }
        return m10;
    }

    public M m(u0 u0Var, AbstractC5197E abstractC5197E, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar) {
        if (u0Var == null) {
            a(79);
        }
        if (abstractC5197E == null) {
            a(80);
        }
        if (gVar == null) {
            a(81);
        }
        M g10 = C5198F.g(b0.b(gVar), j(), Collections.singletonList(new k0(u0Var, abstractC5197E)));
        if (g10 == null) {
            a(82);
        }
        return g10;
    }

    public M n() {
        M R10 = R(h.BOOLEAN);
        if (R10 == null) {
            a(64);
        }
        return R10;
    }

    public InterfaceC0933e o(id.c cVar) {
        if (cVar == null) {
            a(12);
        }
        InterfaceC0933e d10 = AbstractC0946s.d(r(), cVar, Rc.d.FROM_BUILTINS);
        if (d10 == null) {
            a(13);
        }
        return d10;
    }

    public x r() {
        if (this.f3831a == null) {
            this.f3831a = (x) this.f3832b.invoke();
        }
        x xVar = this.f3831a;
        if (xVar == null) {
            a(7);
        }
        return xVar;
    }

    public rd.h s() {
        rd.h w10 = r().p0(j.f3891y).w();
        if (w10 == null) {
            a(11);
        }
        return w10;
    }

    public M t() {
        M R10 = R(h.BYTE);
        if (R10 == null) {
            a(57);
        }
        return R10;
    }

    public M u() {
        M R10 = R(h.CHAR);
        if (R10 == null) {
            a(63);
        }
        return R10;
    }

    protected Iterable v() {
        List singletonList = Collections.singletonList(new Ic.a(this.f3836f, r()));
        if (singletonList == null) {
            a(5);
        }
        return singletonList;
    }

    public InterfaceC0933e w() {
        InterfaceC0933e o10 = o(j.a.f3926V);
        if (o10 == null) {
            a(35);
        }
        return o10;
    }

    public InterfaceC0933e x() {
        return p("Comparable");
    }

    public M y() {
        M I10 = I();
        if (I10 == null) {
            a(53);
        }
        return I10;
    }

    public M z() {
        M R10 = R(h.DOUBLE);
        if (R10 == null) {
            a(62);
        }
        return R10;
    }
}
