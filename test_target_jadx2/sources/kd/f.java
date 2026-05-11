package kd;

import Kc.AbstractC0947t;
import Kc.AbstractC0948u;
import Kc.D;
import Kc.EnumC0934f;
import Kc.InterfaceC0929a;
import Kc.InterfaceC0930b;
import Kc.InterfaceC0933e;
import Kc.InterfaceC0936h;
import Kc.InterfaceC0941m;
import Kc.InterfaceC0944p;
import Kc.InterfaceC0945q;
import Kc.K;
import Kc.P;
import Kc.W;
import Kc.X;
import Kc.b0;
import Kc.k0;
import co.hyperverge.hypersnapsdk.activities.HVRetakeActivity;
import co.hyperverge.hypersnapsdk.objects.HVError;
import co.hyperverge.hypersnapsdk.utils.AppConstants;
import com.appsflyer.attribution.RequestError;
import com.swmansion.reanimated.BuildConfig;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import od.AbstractC3778c;
import yd.AbstractC5197E;
import yd.G;
import yd.e0;
import yd.q0;

/* loaded from: classes3.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final id.c f36291a = new id.c("kotlin.jvm.JvmName");

    public static boolean A(InterfaceC0941m interfaceC0941m) {
        return D(interfaceC0941m, EnumC0934f.ENUM_CLASS);
    }

    public static boolean B(InterfaceC0941m interfaceC0941m) {
        if (interfaceC0941m == null) {
            a(36);
        }
        return D(interfaceC0941m, EnumC0934f.ENUM_ENTRY);
    }

    public static boolean C(InterfaceC0941m interfaceC0941m) {
        return D(interfaceC0941m, EnumC0934f.INTERFACE);
    }

    private static boolean D(InterfaceC0941m interfaceC0941m, EnumC0934f enumC0934f) {
        if (enumC0934f == null) {
            a(37);
        }
        return (interfaceC0941m instanceof InterfaceC0933e) && ((InterfaceC0933e) interfaceC0941m).o() == enumC0934f;
    }

    public static boolean E(InterfaceC0941m interfaceC0941m) {
        if (interfaceC0941m == null) {
            a(1);
        }
        while (interfaceC0941m != null) {
            if (u(interfaceC0941m) || y(interfaceC0941m)) {
                return true;
            }
            interfaceC0941m = interfaceC0941m.b();
        }
        return false;
    }

    private static boolean F(AbstractC5197E abstractC5197E, InterfaceC0941m interfaceC0941m) {
        if (abstractC5197E == null) {
            a(30);
        }
        if (interfaceC0941m == null) {
            a(31);
        }
        InterfaceC0936h d10 = abstractC5197E.W0().d();
        if (d10 == null) {
            return false;
        }
        InterfaceC0941m a10 = d10.a();
        return (a10 instanceof InterfaceC0936h) && (interfaceC0941m instanceof InterfaceC0936h) && ((InterfaceC0936h) interfaceC0941m).r().equals(((InterfaceC0936h) a10).r());
    }

    public static boolean G(InterfaceC0941m interfaceC0941m) {
        return (D(interfaceC0941m, EnumC0934f.CLASS) || D(interfaceC0941m, EnumC0934f.INTERFACE)) && ((InterfaceC0933e) interfaceC0941m).s() == D.SEALED;
    }

    public static boolean H(InterfaceC0933e interfaceC0933e, InterfaceC0933e interfaceC0933e2) {
        if (interfaceC0933e == null) {
            a(28);
        }
        if (interfaceC0933e2 == null) {
            a(29);
        }
        return I(interfaceC0933e.y(), interfaceC0933e2.a());
    }

    public static boolean I(AbstractC5197E abstractC5197E, InterfaceC0941m interfaceC0941m) {
        if (abstractC5197E == null) {
            a(32);
        }
        if (interfaceC0941m == null) {
            a(33);
        }
        if (F(abstractC5197E, interfaceC0941m)) {
            return true;
        }
        Iterator it = abstractC5197E.W0().a().iterator();
        while (it.hasNext()) {
            if (I((AbstractC5197E) it.next(), interfaceC0941m)) {
                return true;
            }
        }
        return false;
    }

    public static boolean J(InterfaceC0941m interfaceC0941m) {
        return interfaceC0941m != null && (interfaceC0941m.b() instanceof K);
    }

    public static boolean K(k0 k0Var, AbstractC5197E abstractC5197E) {
        if (k0Var == null) {
            a(66);
        }
        if (abstractC5197E == null) {
            a(67);
        }
        if (k0Var.q0() || G.a(abstractC5197E)) {
            return false;
        }
        if (q0.b(abstractC5197E)) {
            return true;
        }
        Hc.g j10 = AbstractC3778c.j(k0Var);
        if (!Hc.g.s0(abstractC5197E)) {
            kotlin.reflect.jvm.internal.impl.types.checker.e eVar = kotlin.reflect.jvm.internal.impl.types.checker.e.f36672a;
            if (!eVar.b(j10.W(), abstractC5197E) && !eVar.b(j10.K().y(), abstractC5197E) && !eVar.b(j10.i(), abstractC5197E) && !Hc.n.d(abstractC5197E)) {
                return false;
            }
        }
        return true;
    }

    public static InterfaceC0930b L(InterfaceC0930b interfaceC0930b) {
        if (interfaceC0930b == null) {
            a(59);
        }
        while (interfaceC0930b.o() == InterfaceC0930b.a.FAKE_OVERRIDE) {
            Collection f10 = interfaceC0930b.f();
            if (f10.isEmpty()) {
                throw new IllegalStateException("Fake override should have at least one overridden descriptor: " + interfaceC0930b);
            }
            interfaceC0930b = (InterfaceC0930b) f10.iterator().next();
        }
        return interfaceC0930b;
    }

    public static InterfaceC0945q M(InterfaceC0945q interfaceC0945q) {
        if (interfaceC0945q == null) {
            a(64);
        }
        if (interfaceC0945q instanceof InterfaceC0930b) {
            return L((InterfaceC0930b) interfaceC0945q);
        }
        if (interfaceC0945q == null) {
            a(65);
        }
        return interfaceC0945q;
    }

    private static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 4:
            case 7:
            case 9:
            case RequestError.EVENT_TIMEOUT /* 10 */:
            case 12:
            case HVError.FACE_DETECTION_ERROR /* 22 */:
            case RequestError.NETWORK_FAILURE /* 40 */:
            case HVError.CONSENT_DENIED /* 42 */:
            case HVError.ENCRYPTION_ERROR /* 43 */:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case HVError.DETECTOR_NOT_AVAILABLE_ERROR /* 60 */:
            case 62:
            case 63:
            case 65:
            case 72:
            case BuildConfig.REACT_NATIVE_MINOR_VERSION /* 76 */:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 4:
            case 7:
            case 9:
            case RequestError.EVENT_TIMEOUT /* 10 */:
            case 12:
            case HVError.FACE_DETECTION_ERROR /* 22 */:
            case RequestError.NETWORK_FAILURE /* 40 */:
            case HVError.CONSENT_DENIED /* 42 */:
            case HVError.ENCRYPTION_ERROR /* 43 */:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case HVError.DETECTOR_NOT_AVAILABLE_ERROR /* 60 */:
            case 62:
            case 63:
            case 65:
            case 72:
            case BuildConfig.REACT_NATIVE_MINOR_VERSION /* 76 */:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                i11 = 2;
                break;
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 11:
            case 13:
            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
            case HVError.SSL_CONNECT_ERROR /* 15 */:
            case HVRetakeActivity.RECHECK_ACTION /* 21 */:
            case HVError.BLURRY_FACE_DETECTION_ERROR /* 23 */:
            case HVError.TILT_FACE_DETECTED_ERROR /* 24 */:
            case 34:
            case HVError.FACE_CAPTURE_TIMEOUT /* 35 */:
            case HVError.HYPER_DOC_DETECT_ERROR /* 36 */:
            case 57:
            case 58:
            case 59:
            case 61:
            case 64:
            case 82:
            case 95:
            case 97:
                objArr[0] = "descriptor";
                break;
            case 4:
            case 7:
            case 9:
            case RequestError.EVENT_TIMEOUT /* 10 */:
            case 12:
            case HVError.FACE_DETECTION_ERROR /* 22 */:
            case RequestError.NETWORK_FAILURE /* 40 */:
            case HVError.CONSENT_DENIED /* 42 */:
            case HVError.ENCRYPTION_ERROR /* 43 */:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case HVError.DETECTOR_NOT_AVAILABLE_ERROR /* 60 */:
            case 62:
            case 63:
            case 65:
            case 72:
            case BuildConfig.REACT_NATIVE_MINOR_VERSION /* 76 */:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
            case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                objArr[0] = "first";
                break;
            case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                objArr[0] = "second";
                break;
            case 18:
            case 19:
                objArr[0] = "aClass";
                break;
            case HVRetakeActivity.CLOSE_ACTION /* 20 */:
                objArr[0] = "kotlinType";
                break;
            case HVError.LOW_STORAGE_ERROR /* 25 */:
                objArr[0] = "declarationDescriptor";
                break;
            case 26:
            case 28:
                objArr[0] = "subClass";
                break;
            case 27:
            case 29:
            case HVError.GPS_ACCESS_DENIED /* 33 */:
                objArr[0] = "superClass";
                break;
            case 30:
            case 32:
            case HVError.PERMISSION_REVOKED_ERROR /* 45 */:
            case 67:
                objArr[0] = "type";
                break;
            case HVError.INSTRUCTION_ERROR /* 31 */:
                objArr[0] = "other";
                break;
            case HVError.INVALID_FILE_ERROR /* 37 */:
                objArr[0] = "classKind";
                break;
            case 38:
            case 39:
            case RequestError.NO_DEV_KEY /* 41 */:
            case HVError.SDK_CLOSE_ERROR /* 44 */:
            case 48:
            case 54:
            case 68:
            case 69:
            case 70:
            case 77:
            case 78:
                objArr[0] = "classDescriptor";
                break;
            case 46:
                objArr[0] = "typeConstructor";
                break;
            case 55:
                objArr[0] = "innerClassName";
                break;
            case 56:
                objArr[0] = "location";
                break;
            case 66:
                objArr[0] = "variable";
                break;
            case 71:
                objArr[0] = "f";
                break;
            case 73:
                objArr[0] = "current";
                break;
            case 74:
                objArr[0] = "result";
                break;
            case 75:
                objArr[0] = "memberDescriptor";
                break;
            case 79:
            case 80:
            case 81:
                objArr[0] = "annotated";
                break;
            case 85:
            case AppConstants.REQUEST_CODE /* 87 */:
            case 90:
            case 92:
                objArr[0] = "scope";
                break;
            case 88:
            case 91:
            case 93:
                objArr[0] = "name";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i10) {
            case 4:
                objArr[1] = "getFqNameSafe";
                break;
            case 7:
                objArr[1] = "getFqNameUnsafe";
                break;
            case 9:
            case RequestError.EVENT_TIMEOUT /* 10 */:
                objArr[1] = "getFqNameFromTopLevelClass";
                break;
            case 12:
                objArr[1] = "getClassIdForNonLocalClass";
                break;
            case HVError.FACE_DETECTION_ERROR /* 22 */:
                objArr[1] = "getContainingModule";
                break;
            case RequestError.NETWORK_FAILURE /* 40 */:
                objArr[1] = "getSuperclassDescriptors";
                break;
            case HVError.CONSENT_DENIED /* 42 */:
            case HVError.ENCRYPTION_ERROR /* 43 */:
                objArr[1] = "getSuperClassType";
                break;
            case 47:
                objArr[1] = "getClassDescriptorForTypeConstructor";
                break;
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
                objArr[1] = "getDefaultConstructorVisibility";
                break;
            case HVError.DETECTOR_NOT_AVAILABLE_ERROR /* 60 */:
                objArr[1] = "unwrapFakeOverride";
                break;
            case 62:
            case 63:
                objArr[1] = "unwrapSubstitutionOverride";
                break;
            case 65:
                objArr[1] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 72:
                objArr[1] = "getAllOverriddenDescriptors";
                break;
            case BuildConfig.REACT_NATIVE_MINOR_VERSION /* 76 */:
                objArr[1] = "getAllOverriddenDeclarations";
                break;
            case 83:
            case 84:
                objArr[1] = "getContainingSourceFile";
                break;
            case 86:
                objArr[1] = "getAllDescriptors";
                break;
            case 89:
                objArr[1] = "getFunctionByName";
                break;
            case 94:
                objArr[1] = "getPropertyByName";
                break;
            case 96:
                objArr[1] = "getDirectMember";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
        }
        switch (i10) {
            case 1:
                objArr[2] = "isLocal";
                break;
            case 2:
                objArr[2] = "getFqName";
                break;
            case 3:
                objArr[2] = "getFqNameSafe";
                break;
            case 4:
            case 7:
            case 9:
            case RequestError.EVENT_TIMEOUT /* 10 */:
            case 12:
            case HVError.FACE_DETECTION_ERROR /* 22 */:
            case RequestError.NETWORK_FAILURE /* 40 */:
            case HVError.CONSENT_DENIED /* 42 */:
            case HVError.ENCRYPTION_ERROR /* 43 */:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case HVError.DETECTOR_NOT_AVAILABLE_ERROR /* 60 */:
            case 62:
            case 63:
            case 65:
            case 72:
            case BuildConfig.REACT_NATIVE_MINOR_VERSION /* 76 */:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                break;
            case 5:
                objArr[2] = "getFqNameSafeIfPossible";
                break;
            case 6:
                objArr[2] = "getFqNameUnsafe";
                break;
            case 8:
                objArr[2] = "getFqNameFromTopLevelClass";
                break;
            case 11:
                objArr[2] = "getClassIdForNonLocalClass";
                break;
            case 13:
                objArr[2] = "isExtension";
                break;
            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                objArr[2] = "isOverride";
                break;
            case HVError.SSL_CONNECT_ERROR /* 15 */:
                objArr[2] = "isStaticDeclaration";
                break;
            case HVError.ACTIVE_SESSION_ERROR /* 16 */:
            case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                objArr[2] = "areInSameModule";
                break;
            case 18:
            case 19:
                objArr[2] = "getParentOfType";
                break;
            case HVRetakeActivity.CLOSE_ACTION /* 20 */:
            case HVError.BLURRY_FACE_DETECTION_ERROR /* 23 */:
                objArr[2] = "getContainingModuleOrNull";
                break;
            case HVRetakeActivity.RECHECK_ACTION /* 21 */:
                objArr[2] = "getContainingModule";
                break;
            case HVError.TILT_FACE_DETECTED_ERROR /* 24 */:
                objArr[2] = "getContainingClass";
                break;
            case HVError.LOW_STORAGE_ERROR /* 25 */:
                objArr[2] = "isAncestor";
                break;
            case 26:
            case 27:
                objArr[2] = "isDirectSubclass";
                break;
            case 28:
            case 29:
                objArr[2] = "isSubclass";
                break;
            case 30:
            case HVError.INSTRUCTION_ERROR /* 31 */:
                objArr[2] = "isSameClass";
                break;
            case 32:
            case HVError.GPS_ACCESS_DENIED /* 33 */:
                objArr[2] = "isSubtypeOfClass";
                break;
            case 34:
                objArr[2] = "isAnonymousObject";
                break;
            case HVError.FACE_CAPTURE_TIMEOUT /* 35 */:
                objArr[2] = "isAnonymousFunction";
                break;
            case HVError.HYPER_DOC_DETECT_ERROR /* 36 */:
                objArr[2] = "isEnumEntry";
                break;
            case HVError.INVALID_FILE_ERROR /* 37 */:
                objArr[2] = "isKindOf";
                break;
            case 38:
                objArr[2] = "hasAbstractMembers";
                break;
            case 39:
                objArr[2] = "getSuperclassDescriptors";
                break;
            case RequestError.NO_DEV_KEY /* 41 */:
                objArr[2] = "getSuperClassType";
                break;
            case HVError.SDK_CLOSE_ERROR /* 44 */:
                objArr[2] = "getSuperClassDescriptor";
                break;
            case HVError.PERMISSION_REVOKED_ERROR /* 45 */:
                objArr[2] = "getClassDescriptorForType";
                break;
            case 46:
                objArr[2] = "getClassDescriptorForTypeConstructor";
                break;
            case 48:
                objArr[2] = "getDefaultConstructorVisibility";
                break;
            case 54:
            case 55:
            case 56:
                objArr[2] = "getInnerClassByName";
                break;
            case 57:
                objArr[2] = "isStaticNestedClass";
                break;
            case 58:
                objArr[2] = "isTopLevelOrInnerClass";
                break;
            case 59:
                objArr[2] = "unwrapFakeOverride";
                break;
            case 61:
                objArr[2] = "unwrapSubstitutionOverride";
                break;
            case 64:
                objArr[2] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 66:
            case 67:
                objArr[2] = "shouldRecordInitializerForProperty";
                break;
            case 68:
                objArr[2] = "classCanHaveAbstractFakeOverride";
                break;
            case 69:
                objArr[2] = "classCanHaveAbstractDeclaration";
                break;
            case 70:
                objArr[2] = "classCanHaveOpenMembers";
                break;
            case 71:
                objArr[2] = "getAllOverriddenDescriptors";
                break;
            case 73:
            case 74:
                objArr[2] = "collectAllOverriddenDescriptors";
                break;
            case 75:
                objArr[2] = "getAllOverriddenDeclarations";
                break;
            case 77:
                objArr[2] = "isSingletonOrAnonymousObject";
                break;
            case 78:
                objArr[2] = "canHaveDeclaredConstructors";
                break;
            case 79:
                objArr[2] = "getJvmName";
                break;
            case 80:
                objArr[2] = "findJvmNameAnnotation";
                break;
            case 81:
                objArr[2] = "hasJvmNameAnnotation";
                break;
            case 82:
                objArr[2] = "getContainingSourceFile";
                break;
            case 85:
                objArr[2] = "getAllDescriptors";
                break;
            case AppConstants.REQUEST_CODE /* 87 */:
            case 88:
                objArr[2] = "getFunctionByName";
                break;
            case 90:
            case 91:
                objArr[2] = "getFunctionByNameOrNull";
                break;
            case 92:
            case 93:
                objArr[2] = "getPropertyByName";
                break;
            case 95:
                objArr[2] = "getDirectMember";
                break;
            case 97:
                objArr[2] = "isMethodOfAny";
                break;
            default:
                objArr[2] = "getDispatchReceiverParameterIfNeeded";
                break;
        }
        String format = String.format(str, objArr);
        switch (i10) {
            case 4:
            case 7:
            case 9:
            case RequestError.EVENT_TIMEOUT /* 10 */:
            case 12:
            case HVError.FACE_DETECTION_ERROR /* 22 */:
            case RequestError.NETWORK_FAILURE /* 40 */:
            case HVError.CONSENT_DENIED /* 42 */:
            case HVError.ENCRYPTION_ERROR /* 43 */:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case HVError.DETECTOR_NOT_AVAILABLE_ERROR /* 60 */:
            case 62:
            case 63:
            case 65:
            case 72:
            case BuildConfig.REACT_NATIVE_MINOR_VERSION /* 76 */:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                throw new IllegalStateException(format);
            default:
                throw new IllegalArgumentException(format);
        }
    }

    public static boolean b(InterfaceC0941m interfaceC0941m, InterfaceC0941m interfaceC0941m2) {
        if (interfaceC0941m == null) {
            a(16);
        }
        if (interfaceC0941m2 == null) {
            a(17);
        }
        return g(interfaceC0941m).equals(g(interfaceC0941m2));
    }

    private static void c(InterfaceC0929a interfaceC0929a, Set set) {
        if (interfaceC0929a == null) {
            a(73);
        }
        if (set == null) {
            a(74);
        }
        if (set.contains(interfaceC0929a)) {
            return;
        }
        Iterator it = interfaceC0929a.a().f().iterator();
        while (it.hasNext()) {
            InterfaceC0929a a10 = ((InterfaceC0929a) it.next()).a();
            c(a10, set);
            set.add(a10);
        }
    }

    public static Set d(InterfaceC0929a interfaceC0929a) {
        if (interfaceC0929a == null) {
            a(71);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        c(interfaceC0929a.a(), linkedHashSet);
        return linkedHashSet;
    }

    public static InterfaceC0933e e(AbstractC5197E abstractC5197E) {
        if (abstractC5197E == null) {
            a(45);
        }
        return f(abstractC5197E.W0());
    }

    public static InterfaceC0933e f(e0 e0Var) {
        if (e0Var == null) {
            a(46);
        }
        InterfaceC0933e interfaceC0933e = (InterfaceC0933e) e0Var.d();
        if (interfaceC0933e == null) {
            a(47);
        }
        return interfaceC0933e;
    }

    public static Kc.G g(InterfaceC0941m interfaceC0941m) {
        if (interfaceC0941m == null) {
            a(21);
        }
        Kc.G h10 = h(interfaceC0941m);
        if (h10 == null) {
            a(22);
        }
        return h10;
    }

    public static Kc.G h(InterfaceC0941m interfaceC0941m) {
        if (interfaceC0941m == null) {
            a(23);
        }
        while (interfaceC0941m != null) {
            if (interfaceC0941m instanceof Kc.G) {
                return (Kc.G) interfaceC0941m;
            }
            if (interfaceC0941m instanceof P) {
                return ((P) interfaceC0941m).C0();
            }
            interfaceC0941m = interfaceC0941m.b();
        }
        return null;
    }

    public static Kc.G i(AbstractC5197E abstractC5197E) {
        if (abstractC5197E == null) {
            a(20);
        }
        InterfaceC0936h d10 = abstractC5197E.W0().d();
        if (d10 == null) {
            return null;
        }
        return h(d10);
    }

    public static b0 j(InterfaceC0941m interfaceC0941m) {
        if (interfaceC0941m == null) {
            a(82);
        }
        if (interfaceC0941m instanceof W) {
            interfaceC0941m = ((W) interfaceC0941m).J0();
        }
        if (interfaceC0941m instanceof InterfaceC0944p) {
            b0 a10 = ((InterfaceC0944p) interfaceC0941m).j().a();
            if (a10 == null) {
                a(83);
            }
            return a10;
        }
        b0 b0Var = b0.f5561a;
        if (b0Var == null) {
            a(84);
        }
        return b0Var;
    }

    public static AbstractC0948u k(InterfaceC0933e interfaceC0933e, boolean z10) {
        if (interfaceC0933e == null) {
            a(48);
        }
        EnumC0934f o10 = interfaceC0933e.o();
        if (o10 == EnumC0934f.ENUM_CLASS || o10.isSingleton()) {
            AbstractC0948u abstractC0948u = AbstractC0947t.f5585a;
            if (abstractC0948u == null) {
                a(49);
            }
            return abstractC0948u;
        }
        if (G(interfaceC0933e)) {
            if (z10) {
                AbstractC0948u abstractC0948u2 = AbstractC0947t.f5587c;
                if (abstractC0948u2 == null) {
                    a(50);
                }
                return abstractC0948u2;
            }
            AbstractC0948u abstractC0948u3 = AbstractC0947t.f5585a;
            if (abstractC0948u3 == null) {
                a(51);
            }
            return abstractC0948u3;
        }
        if (u(interfaceC0933e)) {
            AbstractC0948u abstractC0948u4 = AbstractC0947t.f5596l;
            if (abstractC0948u4 == null) {
                a(52);
            }
            return abstractC0948u4;
        }
        AbstractC0948u abstractC0948u5 = AbstractC0947t.f5589e;
        if (abstractC0948u5 == null) {
            a(53);
        }
        return abstractC0948u5;
    }

    public static X l(InterfaceC0941m interfaceC0941m) {
        if (interfaceC0941m == null) {
            a(0);
        }
        if (interfaceC0941m instanceof InterfaceC0933e) {
            return ((InterfaceC0933e) interfaceC0941m).S0();
        }
        return null;
    }

    public static id.d m(InterfaceC0941m interfaceC0941m) {
        if (interfaceC0941m == null) {
            a(2);
        }
        id.c o10 = o(interfaceC0941m);
        return o10 != null ? o10.j() : p(interfaceC0941m);
    }

    public static id.c n(InterfaceC0941m interfaceC0941m) {
        if (interfaceC0941m == null) {
            a(3);
        }
        id.c o10 = o(interfaceC0941m);
        if (o10 == null) {
            o10 = p(interfaceC0941m).l();
        }
        if (o10 == null) {
            a(4);
        }
        return o10;
    }

    private static id.c o(InterfaceC0941m interfaceC0941m) {
        if (interfaceC0941m == null) {
            a(5);
        }
        if ((interfaceC0941m instanceof Kc.G) || kotlin.reflect.jvm.internal.impl.types.error.k.m(interfaceC0941m)) {
            return id.c.f34178c;
        }
        if (interfaceC0941m instanceof P) {
            return ((P) interfaceC0941m).e();
        }
        if (interfaceC0941m instanceof K) {
            return ((K) interfaceC0941m).e();
        }
        return null;
    }

    private static id.d p(InterfaceC0941m interfaceC0941m) {
        if (interfaceC0941m == null) {
            a(6);
        }
        id.d c10 = m(interfaceC0941m.b()).c(interfaceC0941m.getName());
        if (c10 == null) {
            a(7);
        }
        return c10;
    }

    public static InterfaceC0941m q(InterfaceC0941m interfaceC0941m, Class cls) {
        if (cls == null) {
            a(18);
        }
        return r(interfaceC0941m, cls, true);
    }

    public static InterfaceC0941m r(InterfaceC0941m interfaceC0941m, Class cls, boolean z10) {
        if (cls == null) {
            a(19);
        }
        if (interfaceC0941m == null) {
            return null;
        }
        if (z10) {
            interfaceC0941m = interfaceC0941m.b();
        }
        while (interfaceC0941m != null) {
            if (cls.isInstance(interfaceC0941m)) {
                return interfaceC0941m;
            }
            interfaceC0941m = interfaceC0941m.b();
        }
        return null;
    }

    public static InterfaceC0933e s(InterfaceC0933e interfaceC0933e) {
        if (interfaceC0933e == null) {
            a(44);
        }
        Iterator it = interfaceC0933e.r().a().iterator();
        while (it.hasNext()) {
            InterfaceC0933e e10 = e((AbstractC5197E) it.next());
            if (e10.o() != EnumC0934f.INTERFACE) {
                return e10;
            }
        }
        return null;
    }

    public static boolean t(InterfaceC0941m interfaceC0941m) {
        return D(interfaceC0941m, EnumC0934f.ANNOTATION_CLASS);
    }

    public static boolean u(InterfaceC0941m interfaceC0941m) {
        if (interfaceC0941m == null) {
            a(34);
        }
        return v(interfaceC0941m) && interfaceC0941m.getName().equals(id.h.f34195b);
    }

    public static boolean v(InterfaceC0941m interfaceC0941m) {
        return D(interfaceC0941m, EnumC0934f.CLASS);
    }

    public static boolean w(InterfaceC0941m interfaceC0941m) {
        return v(interfaceC0941m) || A(interfaceC0941m);
    }

    public static boolean x(InterfaceC0941m interfaceC0941m) {
        return D(interfaceC0941m, EnumC0934f.OBJECT) && ((InterfaceC0933e) interfaceC0941m).F();
    }

    public static boolean y(InterfaceC0941m interfaceC0941m) {
        return (interfaceC0941m instanceof InterfaceC0945q) && ((InterfaceC0945q) interfaceC0941m).h() == AbstractC0947t.f5590f;
    }

    public static boolean z(InterfaceC0933e interfaceC0933e, InterfaceC0933e interfaceC0933e2) {
        if (interfaceC0933e == null) {
            a(26);
        }
        if (interfaceC0933e2 == null) {
            a(27);
        }
        Iterator it = interfaceC0933e.r().a().iterator();
        while (it.hasNext()) {
            if (F((AbstractC5197E) it.next(), interfaceC0933e2.a())) {
                return true;
            }
        }
        return false;
    }
}
