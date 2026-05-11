package Cc;

import Ec.A;
import Ec.D;
import Ec.InterfaceC0833l;
import Kc.InterfaceC0936h;
import Kc.f0;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.o;
import kotlin.reflect.q;
import lc.m;
import yd.AbstractC5197E;
import yd.C5198F;
import yd.M;
import yd.T;
import yd.a0;
import yd.e0;
import yd.k0;
import yd.u0;

/* loaded from: classes3.dex */
public abstract class e {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1086a;

        static {
            int[] iArr = new int[q.values().length];
            try {
                iArr[q.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[q.IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[q.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f1086a = iArr;
        }
    }

    private static final M a(a0 a0Var, e0 e0Var, List list, boolean z10) {
        Object t10;
        List c10 = e0Var.c();
        Intrinsics.checkNotNullExpressionValue(c10, "getParameters(...)");
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.u(list2, 10));
        int i10 = 0;
        for (Object obj : list2) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.t();
            }
            KTypeProjection kTypeProjection = (KTypeProjection) obj;
            A a10 = (A) kTypeProjection.c();
            AbstractC5197E r10 = a10 != null ? a10.r() : null;
            q d10 = kTypeProjection.d();
            int i12 = d10 == null ? -1 : a.f1086a[d10.ordinal()];
            if (i12 == -1) {
                Object obj2 = c10.get(i10);
                Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
                t10 = new T((f0) obj2);
            } else if (i12 == 1) {
                u0 u0Var = u0.INVARIANT;
                Intrinsics.d(r10);
                t10 = new k0(u0Var, r10);
            } else if (i12 == 2) {
                u0 u0Var2 = u0.IN_VARIANCE;
                Intrinsics.d(r10);
                t10 = new k0(u0Var2, r10);
            } else {
                if (i12 != 3) {
                    throw new m();
                }
                u0 u0Var3 = u0.OUT_VARIANCE;
                Intrinsics.d(r10);
                t10 = new k0(u0Var3, r10);
            }
            arrayList.add(t10);
            i10 = i11;
        }
        return C5198F.j(a0Var, e0Var, arrayList, z10, null, 16, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final o b(kotlin.reflect.e eVar, List arguments, boolean z10, List annotations) {
        InterfaceC0936h n10;
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Function0 function0 = null;
        Object[] objArr = 0;
        InterfaceC0833l interfaceC0833l = eVar instanceof InterfaceC0833l ? (InterfaceC0833l) eVar : null;
        if (interfaceC0833l == null || (n10 = interfaceC0833l.n()) == null) {
            throw new D("Cannot create type for an unsupported classifier: " + eVar + " (" + eVar.getClass() + ')');
        }
        e0 r10 = n10.r();
        Intrinsics.checkNotNullExpressionValue(r10, "getTypeConstructor(...)");
        List c10 = r10.c();
        Intrinsics.checkNotNullExpressionValue(c10, "getParameters(...)");
        if (c10.size() == arguments.size()) {
            return new A(a(annotations.isEmpty() ? a0.f45478b.i() : a0.f45478b.i(), r10, arguments, z10), function0, 2, objArr == true ? 1 : 0);
        }
        throw new IllegalArgumentException("Class declares " + c10.size() + " type parameters, but " + arguments.size() + " were provided.");
    }

    public static /* synthetic */ o c(kotlin.reflect.e eVar, List list, boolean z10, List list2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = CollectionsKt.j();
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            list2 = CollectionsKt.j();
        }
        return b(eVar, list, z10, list2);
    }
}
