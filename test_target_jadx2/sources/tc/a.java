package Tc;

import Kc.InterfaceC0930b;
import Kc.InterfaceC0932d;
import Kc.InterfaceC0933e;
import Kc.j0;
import co.hyperverge.hypersnapsdk.activities.HVRetakeActivity;
import co.hyperverge.hypersnapsdk.objects.HVError;
import com.appsflyer.attribution.RequestError;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kd.l;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ud.r;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: Tc.a$a, reason: collision with other inner class name */
    static class C0185a extends kd.j {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ r f9736a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Set f9737b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f9738c;

        /* renamed from: Tc.a$a$a, reason: collision with other inner class name */
        class C0186a implements Function1 {
            C0186a() {
            }

            private static /* synthetic */ void a(int i10) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "descriptor", "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1$1", "invoke"));
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Unit invoke(InterfaceC0930b interfaceC0930b) {
                if (interfaceC0930b == null) {
                    a(0);
                }
                C0185a.this.f9736a.a(interfaceC0930b);
                return Unit.f36324a;
            }
        }

        C0185a(r rVar, Set set, boolean z10) {
            this.f9736a = rVar;
            this.f9737b = set;
            this.f9738c = z10;
        }

        private static /* synthetic */ void f(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "fromSuper";
            } else if (i10 == 2) {
                objArr[0] = "fromCurrent";
            } else if (i10 == 3) {
                objArr[0] = "member";
            } else if (i10 != 4) {
                objArr[0] = "fakeOverride";
            } else {
                objArr[0] = "overridden";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1";
            if (i10 == 1 || i10 == 2) {
                objArr[2] = "conflict";
            } else if (i10 == 3 || i10 == 4) {
                objArr[2] = "setOverriddenDescriptors";
            } else {
                objArr[2] = "addFakeOverride";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kd.k
        public void a(InterfaceC0930b interfaceC0930b) {
            if (interfaceC0930b == null) {
                f(0);
            }
            l.K(interfaceC0930b, new C0186a());
            this.f9737b.add(interfaceC0930b);
        }

        @Override // kd.k
        public void d(InterfaceC0930b interfaceC0930b, Collection collection) {
            if (interfaceC0930b == null) {
                f(3);
            }
            if (collection == null) {
                f(4);
            }
            if (!this.f9738c || interfaceC0930b.o() == InterfaceC0930b.a.FAKE_OVERRIDE) {
                super.d(interfaceC0930b, collection);
            }
        }

        @Override // kd.j
        public void e(InterfaceC0930b interfaceC0930b, InterfaceC0930b interfaceC0930b2) {
            if (interfaceC0930b == null) {
                f(1);
            }
            if (interfaceC0930b2 == null) {
                f(2);
            }
        }
    }

    private static /* synthetic */ void a(int i10) {
        String str = i10 != 18 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i10 != 18 ? 3 : 2];
        switch (i10) {
            case 1:
            case 7:
            case 13:
                objArr[0] = "membersFromSupertypes";
                break;
            case 2:
            case 8:
            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                objArr[0] = "membersFromCurrent";
                break;
            case 3:
            case 9:
            case HVError.SSL_CONNECT_ERROR /* 15 */:
                objArr[0] = "classDescriptor";
                break;
            case 4:
            case RequestError.EVENT_TIMEOUT /* 10 */:
            case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                objArr[0] = "errorReporter";
                break;
            case 5:
            case 11:
            case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                objArr[0] = "overridingUtil";
                break;
            case 6:
            case 12:
            case 19:
            default:
                objArr[0] = "name";
                break;
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
                break;
            case HVRetakeActivity.CLOSE_ACTION /* 20 */:
                objArr[0] = "annotationClass";
                break;
        }
        if (i10 != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
        } else {
            objArr[1] = "resolveOverrides";
        }
        switch (i10) {
            case 6:
            case 7:
            case 8:
            case 9:
            case RequestError.EVENT_TIMEOUT /* 10 */:
            case 11:
                objArr[2] = "resolveOverridesForStaticMembers";
                break;
            case 12:
            case 13:
            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
            case HVError.SSL_CONNECT_ERROR /* 15 */:
            case HVError.ACTIVE_SESSION_ERROR /* 16 */:
            case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                objArr[2] = "resolveOverrides";
                break;
            case 18:
                break;
            case 19:
            case HVRetakeActivity.CLOSE_ACTION /* 20 */:
                objArr[2] = "getAnnotationParameterByName";
                break;
            default:
                objArr[2] = "resolveOverridesForNonStaticMembers";
                break;
        }
        String format = String.format(str, objArr);
        if (i10 == 18) {
            throw new IllegalStateException(format);
        }
    }

    public static j0 b(id.f fVar, InterfaceC0933e interfaceC0933e) {
        if (fVar == null) {
            a(19);
        }
        if (interfaceC0933e == null) {
            a(20);
        }
        Collection k10 = interfaceC0933e.k();
        if (k10.size() != 1) {
            return null;
        }
        for (j0 j0Var : ((InterfaceC0932d) k10.iterator().next()).m()) {
            if (j0Var.getName().equals(fVar)) {
                return j0Var;
            }
        }
        return null;
    }

    private static Collection c(id.f fVar, Collection collection, Collection collection2, InterfaceC0933e interfaceC0933e, r rVar, l lVar, boolean z10) {
        if (fVar == null) {
            a(12);
        }
        if (collection == null) {
            a(13);
        }
        if (collection2 == null) {
            a(14);
        }
        if (interfaceC0933e == null) {
            a(15);
        }
        if (rVar == null) {
            a(16);
        }
        if (lVar == null) {
            a(17);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        lVar.v(fVar, collection, collection2, interfaceC0933e, new C0185a(rVar, linkedHashSet, z10));
        return linkedHashSet;
    }

    public static Collection d(id.f fVar, Collection collection, Collection collection2, InterfaceC0933e interfaceC0933e, r rVar, l lVar) {
        if (fVar == null) {
            a(0);
        }
        if (collection == null) {
            a(1);
        }
        if (collection2 == null) {
            a(2);
        }
        if (interfaceC0933e == null) {
            a(3);
        }
        if (rVar == null) {
            a(4);
        }
        if (lVar == null) {
            a(5);
        }
        return c(fVar, collection, collection2, interfaceC0933e, rVar, lVar, false);
    }

    public static Collection e(id.f fVar, Collection collection, Collection collection2, InterfaceC0933e interfaceC0933e, r rVar, l lVar) {
        if (fVar == null) {
            a(6);
        }
        if (collection == null) {
            a(7);
        }
        if (collection2 == null) {
            a(8);
        }
        if (interfaceC0933e == null) {
            a(9);
        }
        if (rVar == null) {
            a(10);
        }
        if (lVar == null) {
            a(11);
        }
        return c(fVar, collection, collection2, interfaceC0933e, rVar, lVar, true);
    }
}
