package kd;

import Kc.AbstractC0947t;
import Kc.AbstractC0948u;
import Kc.C;
import Kc.D;
import Kc.InterfaceC0929a;
import Kc.InterfaceC0930b;
import Kc.InterfaceC0933e;
import Kc.InterfaceC0941m;
import Kc.InterfaceC0945q;
import Kc.InterfaceC0952y;
import Kc.T;
import Kc.U;
import Kc.X;
import Kc.f0;
import Kc.j0;
import Mc.B;
import co.hyperverge.hypersnapsdk.activities.HVRetakeActivity;
import co.hyperverge.hypersnapsdk.objects.HVError;
import co.hyperverge.hypersnapsdk.utils.AppConstants;
import com.appsflyer.attribution.RequestError;
import com.swmansion.reanimated.BuildConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Queue;
import java.util.ServiceLoader;
import java.util.Set;
import kd.g;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.jvm.internal.impl.types.checker.e;
import kotlin.reflect.jvm.internal.impl.types.checker.f;
import kotlin.reflect.jvm.internal.impl.types.checker.g;
import od.AbstractC3778c;
import u5.C4870a;
import yd.AbstractC5194B;
import yd.AbstractC5197E;
import yd.C5203e;
import yd.G;
import yd.d0;
import yd.e0;

/* loaded from: classes3.dex */
public class l {

    /* renamed from: e, reason: collision with root package name */
    private static final List f36295e = CollectionsKt.O0(ServiceLoader.load(kd.g.class, kd.g.class.getClassLoader()));

    /* renamed from: f, reason: collision with root package name */
    public static final l f36296f;

    /* renamed from: g, reason: collision with root package name */
    private static final e.a f36297g;

    /* renamed from: a, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.types.checker.g f36298a;

    /* renamed from: b, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.types.checker.f f36299b;

    /* renamed from: c, reason: collision with root package name */
    private final e.a f36300c;

    /* renamed from: d, reason: collision with root package name */
    private final Function2 f36301d;

    static class a implements e.a {
        a() {
        }

        private static /* synthetic */ void b(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = C4870a.f43493a;
            } else {
                objArr[0] = "b";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$1";
            objArr[2] = "equals";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.e.a
        public boolean a(e0 e0Var, e0 e0Var2) {
            if (e0Var == null) {
                b(0);
            }
            if (e0Var2 == null) {
                b(1);
            }
            return e0Var.equals(e0Var2);
        }
    }

    static class b implements Function2 {
        b() {
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Pair invoke(InterfaceC0929a interfaceC0929a, InterfaceC0929a interfaceC0929a2) {
            return new Pair(interfaceC0929a, interfaceC0929a2);
        }
    }

    static class c implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC0941m f36302a;

        c(InterfaceC0941m interfaceC0941m) {
            this.f36302a = interfaceC0941m;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean invoke(InterfaceC0930b interfaceC0930b) {
            return Boolean.valueOf(interfaceC0930b.b() == this.f36302a);
        }
    }

    static class e implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC0933e f36303a;

        e(InterfaceC0933e interfaceC0933e) {
            this.f36303a = interfaceC0933e;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean invoke(InterfaceC0930b interfaceC0930b) {
            boolean z10 = false;
            if (!AbstractC0947t.g(interfaceC0930b.h()) && AbstractC0947t.h(interfaceC0930b, this.f36303a, false)) {
                z10 = true;
            }
            return Boolean.valueOf(z10);
        }
    }

    static class g implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ k f36304a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC0930b f36305b;

        g(k kVar, InterfaceC0930b interfaceC0930b) {
            this.f36304a = kVar;
            this.f36305b = interfaceC0930b;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unit invoke(InterfaceC0930b interfaceC0930b) {
            this.f36304a.b(this.f36305b, interfaceC0930b);
            return Unit.f36324a;
        }
    }

    static /* synthetic */ class h {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f36306a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f36307b;

        /* renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f36308c;

        static {
            int[] iArr = new int[D.values().length];
            f36308c = iArr;
            try {
                iArr[D.FINAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f36308c[D.SEALED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f36308c[D.OPEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f36308c[D.ABSTRACT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[i.a.values().length];
            f36307b = iArr2;
            try {
                iArr2[i.a.OVERRIDABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f36307b[i.a.CONFLICT.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f36307b[i.a.INCOMPATIBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[g.b.values().length];
            f36306a = iArr3;
            try {
                iArr3[g.b.OVERRIDABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f36306a[g.b.CONFLICT.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f36306a[g.b.INCOMPATIBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f36306a[g.b.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public static class i {

        /* renamed from: c, reason: collision with root package name */
        private static final i f36309c = new i(a.OVERRIDABLE, "SUCCESS");

        /* renamed from: a, reason: collision with root package name */
        private final a f36310a;

        /* renamed from: b, reason: collision with root package name */
        private final String f36311b;

        public enum a {
            OVERRIDABLE,
            INCOMPATIBLE,
            CONFLICT
        }

        public i(a aVar, String str) {
            if (aVar == null) {
                a(3);
            }
            if (str == null) {
                a(4);
            }
            this.f36310a = aVar;
            this.f36311b = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0049  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x005a  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x003b  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0040  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0045  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static /* synthetic */ void a(int i10) {
            String format;
            String str = (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[(i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) ? 3 : 2];
            if (i10 != 1 && i10 != 2) {
                if (i10 == 3) {
                    objArr[0] = "success";
                } else if (i10 != 4) {
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$OverrideCompatibilityInfo";
                }
                switch (i10) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$OverrideCompatibilityInfo";
                        break;
                    case 5:
                        objArr[1] = "getResult";
                        break;
                    case 6:
                        objArr[1] = "getDebugMessage";
                        break;
                    default:
                        objArr[1] = "success";
                        break;
                }
                if (i10 != 1) {
                    objArr[2] = "incompatible";
                } else if (i10 == 2) {
                    objArr[2] = "conflict";
                } else if (i10 == 3 || i10 == 4) {
                    objArr[2] = "<init>";
                }
                format = String.format(str, objArr);
                if (i10 == 1 && i10 != 2 && i10 != 3 && i10 != 4) {
                    throw new IllegalStateException(format);
                }
                throw new IllegalArgumentException(format);
            }
            objArr[0] = "debugMessage";
            switch (i10) {
            }
            if (i10 != 1) {
            }
            format = String.format(str, objArr);
            if (i10 == 1) {
            }
            throw new IllegalArgumentException(format);
        }

        public static i b(String str) {
            if (str == null) {
                a(2);
            }
            return new i(a.CONFLICT, str);
        }

        public static i d(String str) {
            if (str == null) {
                a(1);
            }
            return new i(a.INCOMPATIBLE, str);
        }

        public static i e() {
            i iVar = f36309c;
            if (iVar == null) {
                a(0);
            }
            return iVar;
        }

        public a c() {
            a aVar = this.f36310a;
            if (aVar == null) {
                a(5);
            }
            return aVar;
        }
    }

    static {
        a aVar = new a();
        f36297g = aVar;
        f36296f = new l(aVar, g.a.f36674a, f.a.f36673a, null);
    }

    private l(e.a aVar, kotlin.reflect.jvm.internal.impl.types.checker.g gVar, kotlin.reflect.jvm.internal.impl.types.checker.f fVar, Function2 function2) {
        if (aVar == null) {
            a(5);
        }
        if (gVar == null) {
            a(6);
        }
        if (fVar == null) {
            a(7);
        }
        this.f36300c = aVar;
        this.f36298a = gVar;
        this.f36299b = fVar;
        this.f36301d = function2;
    }

    private static boolean A(T t10, T t11) {
        if (t10 == null || t11 == null) {
            return true;
        }
        return H(t10, t11);
    }

    public static boolean B(InterfaceC0929a interfaceC0929a, InterfaceC0929a interfaceC0929a2) {
        if (interfaceC0929a == null) {
            a(67);
        }
        if (interfaceC0929a2 == null) {
            a(68);
        }
        AbstractC5197E g10 = interfaceC0929a.g();
        AbstractC5197E g11 = interfaceC0929a2.g();
        if (!H(interfaceC0929a, interfaceC0929a2)) {
            return false;
        }
        d0 l10 = f36296f.l(interfaceC0929a.n(), interfaceC0929a2.n());
        if (interfaceC0929a instanceof InterfaceC0952y) {
            return G(interfaceC0929a, g10, interfaceC0929a2, g11, l10);
        }
        if (!(interfaceC0929a instanceof U)) {
            throw new IllegalArgumentException("Unexpected callable: " + interfaceC0929a.getClass());
        }
        U u10 = (U) interfaceC0929a;
        U u11 = (U) interfaceC0929a2;
        if (A(u10.l(), u11.l())) {
            return (u10.q0() && u11.q0()) ? C5203e.f45496a.k(l10, g10.Z0(), g11.Z0()) : (u10.q0() || !u11.q0()) && G(interfaceC0929a, g10, interfaceC0929a2, g11, l10);
        }
        return false;
    }

    private static boolean C(InterfaceC0929a interfaceC0929a, Collection collection) {
        if (interfaceC0929a == null) {
            a(71);
        }
        if (collection == null) {
            a(72);
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!B(interfaceC0929a, (InterfaceC0929a) it.next())) {
                return false;
            }
        }
        return true;
    }

    private static boolean G(InterfaceC0929a interfaceC0929a, AbstractC5197E abstractC5197E, InterfaceC0929a interfaceC0929a2, AbstractC5197E abstractC5197E2, d0 d0Var) {
        if (interfaceC0929a == null) {
            a(73);
        }
        if (abstractC5197E == null) {
            a(74);
        }
        if (interfaceC0929a2 == null) {
            a(75);
        }
        if (abstractC5197E2 == null) {
            a(76);
        }
        if (d0Var == null) {
            a(77);
        }
        return C5203e.f45496a.r(d0Var, abstractC5197E.Z0(), abstractC5197E2.Z0());
    }

    private static boolean H(InterfaceC0945q interfaceC0945q, InterfaceC0945q interfaceC0945q2) {
        if (interfaceC0945q == null) {
            a(69);
        }
        if (interfaceC0945q2 == null) {
            a(70);
        }
        Integer d10 = AbstractC0947t.d(interfaceC0945q.h(), interfaceC0945q2.h());
        return d10 == null || d10.intValue() >= 0;
    }

    public static boolean I(C c10, C c11, boolean z10) {
        if (c10 == null) {
            a(57);
        }
        if (c11 == null) {
            a(58);
        }
        return !AbstractC0947t.g(c11.h()) && AbstractC0947t.h(c11, c10, z10);
    }

    public static boolean J(InterfaceC0929a interfaceC0929a, InterfaceC0929a interfaceC0929a2, boolean z10, boolean z11) {
        if (interfaceC0929a == null) {
            a(13);
        }
        if (interfaceC0929a2 == null) {
            a(14);
        }
        if (!interfaceC0929a.equals(interfaceC0929a2) && C3564d.f36286a.f(interfaceC0929a.a(), interfaceC0929a2.a(), z10, z11)) {
            return true;
        }
        InterfaceC0929a a10 = interfaceC0929a2.a();
        Iterator it = kd.f.d(interfaceC0929a).iterator();
        while (it.hasNext()) {
            if (C3564d.f36286a.f(a10, (InterfaceC0929a) it.next(), z10, z11)) {
                return true;
            }
        }
        return false;
    }

    public static void K(InterfaceC0930b interfaceC0930b, Function1 function1) {
        AbstractC0948u abstractC0948u;
        if (interfaceC0930b == null) {
            a(107);
        }
        for (InterfaceC0930b interfaceC0930b2 : interfaceC0930b.f()) {
            if (interfaceC0930b2.h() == AbstractC0947t.f5591g) {
                K(interfaceC0930b2, function1);
            }
        }
        if (interfaceC0930b.h() != AbstractC0947t.f5591g) {
            return;
        }
        AbstractC0948u h10 = h(interfaceC0930b);
        if (h10 == null) {
            if (function1 != null) {
                function1.invoke(interfaceC0930b);
            }
            abstractC0948u = AbstractC0947t.f5589e;
        } else {
            abstractC0948u = h10;
        }
        if (interfaceC0930b instanceof Mc.C) {
            ((Mc.C) interfaceC0930b).l1(abstractC0948u);
            Iterator it = ((U) interfaceC0930b).C().iterator();
            while (it.hasNext()) {
                K((T) it.next(), h10 == null ? null : function1);
            }
            return;
        }
        if (interfaceC0930b instanceof Mc.p) {
            ((Mc.p) interfaceC0930b).s1(abstractC0948u);
            return;
        }
        B b10 = (B) interfaceC0930b;
        b10.W0(abstractC0948u);
        if (abstractC0948u != b10.J0().h()) {
            b10.U0(false);
        }
    }

    public static Object L(Collection collection, Function1 function1) {
        Object obj;
        if (collection == null) {
            a(78);
        }
        if (function1 == null) {
            a(79);
        }
        if (collection.size() == 1) {
            Object c02 = CollectionsKt.c0(collection);
            if (c02 == null) {
                a(80);
            }
            return c02;
        }
        ArrayList arrayList = new ArrayList(2);
        List q02 = CollectionsKt.q0(collection, function1);
        Object c03 = CollectionsKt.c0(collection);
        InterfaceC0929a interfaceC0929a = (InterfaceC0929a) function1.invoke(c03);
        for (Object obj2 : collection) {
            InterfaceC0929a interfaceC0929a2 = (InterfaceC0929a) function1.invoke(obj2);
            if (C(interfaceC0929a2, q02)) {
                arrayList.add(obj2);
            }
            if (B(interfaceC0929a2, interfaceC0929a) && !B(interfaceC0929a, interfaceC0929a2)) {
                c03 = obj2;
            }
        }
        if (arrayList.isEmpty()) {
            if (c03 == null) {
                a(81);
            }
            return c03;
        }
        if (arrayList.size() == 1) {
            Object c04 = CollectionsKt.c0(arrayList);
            if (c04 == null) {
                a(82);
            }
            return c04;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (!AbstractC5194B.b(((InterfaceC0929a) function1.invoke(obj)).g())) {
                break;
            }
        }
        if (obj != null) {
            return obj;
        }
        Object c05 = CollectionsKt.c0(arrayList);
        if (c05 == null) {
            a(84);
        }
        return c05;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0058 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0035 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x016f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0255 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0268  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        Object[] objArr;
        if (i10 != 11 && i10 != 12 && i10 != 16 && i10 != 21 && i10 != 95 && i10 != 98 && i10 != 103 && i10 != 44 && i10 != 45) {
            switch (i10) {
                default:
                    switch (i10) {
                        default:
                            switch (i10) {
                                default:
                                    switch (i10) {
                                        case 90:
                                        case 91:
                                        case 92:
                                            break;
                                        default:
                                            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                            break;
                                    }
                                case 80:
                                case 81:
                                case 82:
                                case 83:
                                case 84:
                                    str = "@NotNull method %s.%s must not return null";
                                    break;
                            }
                        case 32:
                        case HVError.GPS_ACCESS_DENIED /* 33 */:
                        case 34:
                        case HVError.FACE_CAPTURE_TIMEOUT /* 35 */:
                        case HVError.HYPER_DOC_DETECT_ERROR /* 36 */:
                        case HVError.INVALID_FILE_ERROR /* 37 */:
                        case 38:
                        case 39:
                            break;
                    }
                case HVError.TILT_FACE_DETECTED_ERROR /* 24 */:
                case HVError.LOW_STORAGE_ERROR /* 25 */:
                case 26:
                case 27:
                case 28:
                case 29:
                    break;
            }
            if (i10 != 11 && i10 != 12 && i10 != 16 && i10 != 21 && i10 != 95 && i10 != 98 && i10 != 103 && i10 != 44 && i10 != 45) {
                switch (i10) {
                    default:
                        switch (i10) {
                            default:
                                switch (i10) {
                                    default:
                                        switch (i10) {
                                            case 90:
                                            case 91:
                                            case 92:
                                                break;
                                            default:
                                                i11 = 3;
                                                break;
                                        }
                                    case 80:
                                    case 81:
                                    case 82:
                                    case 83:
                                    case 84:
                                        i11 = 2;
                                        break;
                                }
                            case 32:
                            case HVError.GPS_ACCESS_DENIED /* 33 */:
                            case 34:
                            case HVError.FACE_CAPTURE_TIMEOUT /* 35 */:
                            case HVError.HYPER_DOC_DETECT_ERROR /* 36 */:
                            case HVError.INVALID_FILE_ERROR /* 37 */:
                            case 38:
                            case 39:
                                break;
                        }
                    case HVError.TILT_FACE_DETECTED_ERROR /* 24 */:
                    case HVError.LOW_STORAGE_ERROR /* 25 */:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                        break;
                }
                objArr = new Object[i11];
                switch (i10) {
                    case 1:
                    case 7:
                        objArr[0] = "kotlinTypePreparator";
                        break;
                    case 2:
                        objArr[0] = "customSubtype";
                        break;
                    case 3:
                    case 6:
                    default:
                        objArr[0] = "kotlinTypeRefiner";
                        break;
                    case 4:
                        objArr[0] = "equalityAxioms";
                        break;
                    case 5:
                        objArr[0] = "axioms";
                        break;
                    case 8:
                    case 9:
                        objArr[0] = "candidateSet";
                        break;
                    case RequestError.EVENT_TIMEOUT /* 10 */:
                        objArr[0] = "transformFirst";
                        break;
                    case 11:
                    case 12:
                    case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                    case HVRetakeActivity.RECHECK_ACTION /* 21 */:
                    case HVError.TILT_FACE_DETECTED_ERROR /* 24 */:
                    case HVError.LOW_STORAGE_ERROR /* 25 */:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 32:
                    case HVError.GPS_ACCESS_DENIED /* 33 */:
                    case 34:
                    case HVError.FACE_CAPTURE_TIMEOUT /* 35 */:
                    case HVError.HYPER_DOC_DETECT_ERROR /* 36 */:
                    case HVError.INVALID_FILE_ERROR /* 37 */:
                    case 38:
                    case 39:
                    case HVError.SDK_CLOSE_ERROR /* 44 */:
                    case HVError.PERMISSION_REVOKED_ERROR /* 45 */:
                    case 80:
                    case 81:
                    case 82:
                    case 83:
                    case 84:
                    case 90:
                    case 91:
                    case 92:
                    case 95:
                    case 98:
                    case 103:
                        objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil";
                        break;
                    case 13:
                        objArr[0] = "f";
                        break;
                    case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                        objArr[0] = "g";
                        break;
                    case HVError.SSL_CONNECT_ERROR /* 15 */:
                    case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                        objArr[0] = "descriptor";
                        break;
                    case 18:
                        objArr[0] = "result";
                        break;
                    case 19:
                    case HVError.FACE_DETECTION_ERROR /* 22 */:
                    case 30:
                    case RequestError.NETWORK_FAILURE /* 40 */:
                        objArr[0] = "superDescriptor";
                        break;
                    case HVRetakeActivity.CLOSE_ACTION /* 20 */:
                    case HVError.BLURRY_FACE_DETECTION_ERROR /* 23 */:
                    case HVError.INSTRUCTION_ERROR /* 31 */:
                    case RequestError.NO_DEV_KEY /* 41 */:
                        objArr[0] = "subDescriptor";
                        break;
                    case HVError.CONSENT_DENIED /* 42 */:
                        objArr[0] = "firstParameters";
                        break;
                    case HVError.ENCRYPTION_ERROR /* 43 */:
                        objArr[0] = "secondParameters";
                        break;
                    case 46:
                        objArr[0] = "typeInSuper";
                        break;
                    case 47:
                        objArr[0] = "typeInSub";
                        break;
                    case 48:
                    case 51:
                    case 77:
                        objArr[0] = "typeCheckerState";
                        break;
                    case 49:
                        objArr[0] = "superTypeParameter";
                        break;
                    case 50:
                        objArr[0] = "subTypeParameter";
                        break;
                    case 52:
                        objArr[0] = "name";
                        break;
                    case 53:
                        objArr[0] = "membersFromSupertypes";
                        break;
                    case 54:
                        objArr[0] = "membersFromCurrent";
                        break;
                    case 55:
                    case 61:
                    case 64:
                    case 86:
                    case 89:
                    case 96:
                        objArr[0] = "current";
                        break;
                    case 56:
                    case 62:
                    case 66:
                    case AppConstants.REQUEST_CODE /* 87 */:
                    case 106:
                        objArr[0] = "strategy";
                        break;
                    case 57:
                        objArr[0] = "overriding";
                        break;
                    case 58:
                        objArr[0] = "fromSuper";
                        break;
                    case 59:
                        objArr[0] = "fromCurrent";
                        break;
                    case HVError.DETECTOR_NOT_AVAILABLE_ERROR /* 60 */:
                        objArr[0] = "descriptorsFromSuper";
                        break;
                    case 63:
                    case 65:
                        objArr[0] = "notOverridden";
                        break;
                    case 67:
                    case 69:
                    case 73:
                        objArr[0] = C4870a.f43493a;
                        break;
                    case 68:
                    case 70:
                    case 75:
                        objArr[0] = "b";
                        break;
                    case 71:
                        objArr[0] = "candidate";
                        break;
                    case 72:
                    case 88:
                    case 93:
                    case 109:
                        objArr[0] = "descriptors";
                        break;
                    case 74:
                        objArr[0] = "aReturnType";
                        break;
                    case BuildConfig.REACT_NATIVE_MINOR_VERSION /* 76 */:
                        objArr[0] = "bReturnType";
                        break;
                    case 78:
                    case 85:
                        objArr[0] = "overridables";
                        break;
                    case 79:
                    case 101:
                        objArr[0] = "descriptorByHandle";
                        break;
                    case 94:
                        objArr[0] = "classModality";
                        break;
                    case 97:
                        objArr[0] = "toFilter";
                        break;
                    case 99:
                    case 104:
                        objArr[0] = "overrider";
                        break;
                    case 100:
                    case 105:
                        objArr[0] = "extractFrom";
                        break;
                    case 102:
                        objArr[0] = "onConflict";
                        break;
                    case 107:
                    case 108:
                        objArr[0] = "memberDescriptor";
                        break;
                }
                if (i10 != 11 || i10 == 12) {
                    objArr[1] = "filterOverrides";
                } else if (i10 != 16) {
                    if (i10 != 21) {
                        if (i10 == 95) {
                            objArr[1] = "getMinimalModality";
                        } else if (i10 == 98) {
                            objArr[1] = "filterVisibleFakeOverrides";
                        } else if (i10 == 103) {
                            objArr[1] = "extractMembersOverridableInBothWays";
                        } else if (i10 != 44 && i10 != 45) {
                            switch (i10) {
                                case HVError.TILT_FACE_DETECTED_ERROR /* 24 */:
                                case HVError.LOW_STORAGE_ERROR /* 25 */:
                                case 26:
                                case 27:
                                case 28:
                                case 29:
                                    break;
                                default:
                                    switch (i10) {
                                        case 32:
                                        case HVError.GPS_ACCESS_DENIED /* 33 */:
                                        case 34:
                                        case HVError.FACE_CAPTURE_TIMEOUT /* 35 */:
                                        case HVError.HYPER_DOC_DETECT_ERROR /* 36 */:
                                        case HVError.INVALID_FILE_ERROR /* 37 */:
                                        case 38:
                                        case 39:
                                            objArr[1] = "isOverridableByWithoutExternalConditions";
                                            break;
                                        default:
                                            switch (i10) {
                                                case 80:
                                                case 81:
                                                case 82:
                                                case 83:
                                                case 84:
                                                    objArr[1] = "selectMostSpecificMember";
                                                    break;
                                                default:
                                                    switch (i10) {
                                                        case 90:
                                                        case 91:
                                                        case 92:
                                                            objArr[1] = "determineModalityForFakeOverride";
                                                            break;
                                                        default:
                                                            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil";
                                                            break;
                                                    }
                                            }
                                    }
                            }
                        } else {
                            objArr[1] = "createTypeCheckerState";
                        }
                    }
                    objArr[1] = "isOverridableBy";
                } else {
                    objArr[1] = "getOverriddenDeclarations";
                }
                switch (i10) {
                    case 1:
                    case 2:
                        objArr[2] = "createWithTypePreparatorAndCustomSubtype";
                        break;
                    case 3:
                    case 4:
                        objArr[2] = "create";
                        break;
                    case 5:
                    case 6:
                    case 7:
                        objArr[2] = "<init>";
                        break;
                    case 8:
                        objArr[2] = "filterOutOverridden";
                        break;
                    case 9:
                    case RequestError.EVENT_TIMEOUT /* 10 */:
                        objArr[2] = "filterOverrides";
                        break;
                    case 11:
                    case 12:
                    case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                    case HVRetakeActivity.RECHECK_ACTION /* 21 */:
                    case HVError.TILT_FACE_DETECTED_ERROR /* 24 */:
                    case HVError.LOW_STORAGE_ERROR /* 25 */:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 32:
                    case HVError.GPS_ACCESS_DENIED /* 33 */:
                    case 34:
                    case HVError.FACE_CAPTURE_TIMEOUT /* 35 */:
                    case HVError.HYPER_DOC_DETECT_ERROR /* 36 */:
                    case HVError.INVALID_FILE_ERROR /* 37 */:
                    case 38:
                    case 39:
                    case HVError.SDK_CLOSE_ERROR /* 44 */:
                    case HVError.PERMISSION_REVOKED_ERROR /* 45 */:
                    case 80:
                    case 81:
                    case 82:
                    case 83:
                    case 84:
                    case 90:
                    case 91:
                    case 92:
                    case 95:
                    case 98:
                    case 103:
                        break;
                    case 13:
                    case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                        objArr[2] = "overrides";
                        break;
                    case HVError.SSL_CONNECT_ERROR /* 15 */:
                        objArr[2] = "getOverriddenDeclarations";
                        break;
                    case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                    case 18:
                        objArr[2] = "collectOverriddenDeclarations";
                        break;
                    case 19:
                    case HVRetakeActivity.CLOSE_ACTION /* 20 */:
                    case HVError.FACE_DETECTION_ERROR /* 22 */:
                    case HVError.BLURRY_FACE_DETECTION_ERROR /* 23 */:
                        objArr[2] = "isOverridableBy";
                        break;
                    case 30:
                    case HVError.INSTRUCTION_ERROR /* 31 */:
                        objArr[2] = "isOverridableByWithoutExternalConditions";
                        break;
                    case RequestError.NETWORK_FAILURE /* 40 */:
                    case RequestError.NO_DEV_KEY /* 41 */:
                        objArr[2] = "getBasicOverridabilityProblem";
                        break;
                    case HVError.CONSENT_DENIED /* 42 */:
                    case HVError.ENCRYPTION_ERROR /* 43 */:
                        objArr[2] = "createTypeCheckerState";
                        break;
                    case 46:
                    case 47:
                    case 48:
                        objArr[2] = "areTypesEquivalent";
                        break;
                    case 49:
                    case 50:
                    case 51:
                        objArr[2] = "areTypeParametersEquivalent";
                        break;
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                        objArr[2] = "generateOverridesInFunctionGroup";
                        break;
                    case 57:
                    case 58:
                        objArr[2] = "isVisibleForOverride";
                        break;
                    case 59:
                    case HVError.DETECTOR_NOT_AVAILABLE_ERROR /* 60 */:
                    case 61:
                    case 62:
                        objArr[2] = "extractAndBindOverridesForMember";
                        break;
                    case 63:
                        objArr[2] = "allHasSameContainingDeclaration";
                        break;
                    case 64:
                    case 65:
                    case 66:
                        objArr[2] = "createAndBindFakeOverrides";
                        break;
                    case 67:
                    case 68:
                        objArr[2] = "isMoreSpecific";
                        break;
                    case 69:
                    case 70:
                        objArr[2] = "isVisibilityMoreSpecific";
                        break;
                    case 71:
                    case 72:
                        objArr[2] = "isMoreSpecificThenAllOf";
                        break;
                    case 73:
                    case 74:
                    case 75:
                    case BuildConfig.REACT_NATIVE_MINOR_VERSION /* 76 */:
                    case 77:
                        objArr[2] = "isReturnTypeMoreSpecific";
                        break;
                    case 78:
                    case 79:
                        objArr[2] = "selectMostSpecificMember";
                        break;
                    case 85:
                    case 86:
                    case AppConstants.REQUEST_CODE /* 87 */:
                        objArr[2] = "createAndBindFakeOverride";
                        break;
                    case 88:
                    case 89:
                        objArr[2] = "determineModalityForFakeOverride";
                        break;
                    case 93:
                    case 94:
                        objArr[2] = "getMinimalModality";
                        break;
                    case 96:
                    case 97:
                        objArr[2] = "filterVisibleFakeOverrides";
                        break;
                    case 99:
                    case 100:
                    case 101:
                    case 102:
                    case 104:
                    case 105:
                    case 106:
                        objArr[2] = "extractMembersOverridableInBothWays";
                        break;
                    case 107:
                        objArr[2] = "resolveUnknownVisibilityForMember";
                        break;
                    case 108:
                        objArr[2] = "computeVisibilityToInherit";
                        break;
                    case 109:
                        objArr[2] = "findMaxVisibility";
                        break;
                    default:
                        objArr[2] = "createWithTypeRefiner";
                        break;
                }
                String format = String.format(str, objArr);
                if (i10 != 11 && i10 != 12 && i10 != 16 && i10 != 21 && i10 != 95 && i10 != 98 && i10 != 103 && i10 != 44 && i10 != 45) {
                    switch (i10) {
                        case HVError.TILT_FACE_DETECTED_ERROR /* 24 */:
                        case HVError.LOW_STORAGE_ERROR /* 25 */:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                            break;
                        default:
                            switch (i10) {
                                case 32:
                                case HVError.GPS_ACCESS_DENIED /* 33 */:
                                case 34:
                                case HVError.FACE_CAPTURE_TIMEOUT /* 35 */:
                                case HVError.HYPER_DOC_DETECT_ERROR /* 36 */:
                                case HVError.INVALID_FILE_ERROR /* 37 */:
                                case 38:
                                case 39:
                                    break;
                                default:
                                    switch (i10) {
                                        case 80:
                                        case 81:
                                        case 82:
                                        case 83:
                                        case 84:
                                            break;
                                        default:
                                            switch (i10) {
                                                case 90:
                                                case 91:
                                                case 92:
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
            objArr = new Object[i11];
            switch (i10) {
            }
            if (i10 != 11) {
            }
            objArr[1] = "filterOverrides";
            switch (i10) {
            }
            String format2 = String.format(str, objArr);
            if (i10 != 11) {
                switch (i10) {
                }
            }
            throw new IllegalStateException(format2);
        }
        str = "@NotNull method %s.%s must not return null";
        if (i10 != 11) {
            switch (i10) {
            }
            objArr = new Object[i11];
            switch (i10) {
            }
            if (i10 != 11) {
            }
            objArr[1] = "filterOverrides";
            switch (i10) {
            }
            String format22 = String.format(str, objArr);
            if (i10 != 11) {
            }
            throw new IllegalStateException(format22);
        }
        i11 = 2;
        objArr = new Object[i11];
        switch (i10) {
        }
        if (i10 != 11) {
        }
        objArr[1] = "filterOverrides";
        switch (i10) {
        }
        String format222 = String.format(str, objArr);
        if (i10 != 11) {
        }
        throw new IllegalStateException(format222);
    }

    private static boolean b(Collection collection) {
        if (collection == null) {
            a(63);
        }
        if (collection.size() < 2) {
            return true;
        }
        return CollectionsKt.S(collection, new c(((InterfaceC0930b) collection.iterator().next()).b()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0054, code lost:
    
        r1.remove();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean c(f0 f0Var, f0 f0Var2, d0 d0Var) {
        if (f0Var == null) {
            a(49);
        }
        if (f0Var2 == null) {
            a(50);
        }
        if (d0Var == null) {
            a(51);
        }
        List<AbstractC5197E> upperBounds = f0Var.getUpperBounds();
        ArrayList arrayList = new ArrayList(f0Var2.getUpperBounds());
        if (upperBounds.size() != arrayList.size()) {
            return false;
        }
        for (AbstractC5197E abstractC5197E : upperBounds) {
            ListIterator listIterator = arrayList.listIterator();
            while (listIterator.hasNext()) {
                if (d(abstractC5197E, (AbstractC5197E) listIterator.next(), d0Var)) {
                    break;
                }
            }
            return false;
        }
        return true;
    }

    private static boolean d(AbstractC5197E abstractC5197E, AbstractC5197E abstractC5197E2, d0 d0Var) {
        if (abstractC5197E == null) {
            a(46);
        }
        if (abstractC5197E2 == null) {
            a(47);
        }
        if (d0Var == null) {
            a(48);
        }
        if (G.a(abstractC5197E) && G.a(abstractC5197E2)) {
            return true;
        }
        return C5203e.f45496a.k(d0Var, abstractC5197E.Z0(), abstractC5197E2.Z0());
    }

    private static i e(InterfaceC0929a interfaceC0929a, InterfaceC0929a interfaceC0929a2) {
        if ((interfaceC0929a.s0() == null) != (interfaceC0929a2.s0() == null)) {
            return i.d("Receiver presence mismatch");
        }
        if (interfaceC0929a.m().size() != interfaceC0929a2.m().size()) {
            return i.d("Value parameter number mismatch");
        }
        return null;
    }

    private static void f(InterfaceC0930b interfaceC0930b, Set set) {
        if (interfaceC0930b == null) {
            a(17);
        }
        if (set == null) {
            a(18);
        }
        if (interfaceC0930b.o().isReal()) {
            set.add(interfaceC0930b);
            return;
        }
        if (interfaceC0930b.f().isEmpty()) {
            throw new IllegalStateException("No overridden descriptors found for (fake override) " + interfaceC0930b);
        }
        Iterator it = interfaceC0930b.f().iterator();
        while (it.hasNext()) {
            f((InterfaceC0930b) it.next(), set);
        }
    }

    private static List g(InterfaceC0929a interfaceC0929a) {
        X s02 = interfaceC0929a.s0();
        ArrayList arrayList = new ArrayList();
        if (s02 != null) {
            arrayList.add(s02.getType());
        }
        Iterator it = interfaceC0929a.m().iterator();
        while (it.hasNext()) {
            arrayList.add(((j0) it.next()).getType());
        }
        return arrayList;
    }

    private static AbstractC0948u h(InterfaceC0930b interfaceC0930b) {
        if (interfaceC0930b == null) {
            a(108);
        }
        Collection<InterfaceC0930b> f10 = interfaceC0930b.f();
        AbstractC0948u u10 = u(f10);
        if (u10 == null) {
            return null;
        }
        if (interfaceC0930b.o() != InterfaceC0930b.a.FAKE_OVERRIDE) {
            return u10.f();
        }
        for (InterfaceC0930b interfaceC0930b2 : f10) {
            if (interfaceC0930b2.s() != D.ABSTRACT && !interfaceC0930b2.h().equals(u10)) {
                return null;
            }
        }
        return u10;
    }

    public static l i(kotlin.reflect.jvm.internal.impl.types.checker.g gVar, e.a aVar) {
        if (gVar == null) {
            a(3);
        }
        if (aVar == null) {
            a(4);
        }
        return new l(aVar, gVar, f.a.f36673a, null);
    }

    private static void j(Collection collection, InterfaceC0933e interfaceC0933e, k kVar) {
        if (collection == null) {
            a(85);
        }
        if (interfaceC0933e == null) {
            a(86);
        }
        if (kVar == null) {
            a(87);
        }
        Collection t10 = t(interfaceC0933e, collection);
        boolean isEmpty = t10.isEmpty();
        if (!isEmpty) {
            collection = t10;
        }
        InterfaceC0930b o02 = ((InterfaceC0930b) L(collection, new d())).o0(interfaceC0933e, n(collection, interfaceC0933e), isEmpty ? AbstractC0947t.f5592h : AbstractC0947t.f5591g, InterfaceC0930b.a.FAKE_OVERRIDE, false);
        kVar.d(o02, collection);
        kVar.a(o02);
    }

    private static void k(InterfaceC0933e interfaceC0933e, Collection collection, k kVar) {
        if (interfaceC0933e == null) {
            a(64);
        }
        if (collection == null) {
            a(65);
        }
        if (kVar == null) {
            a(66);
        }
        if (b(collection)) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                j(Collections.singleton((InterfaceC0930b) it.next()), interfaceC0933e, kVar);
            }
        } else {
            LinkedList linkedList = new LinkedList(collection);
            while (!linkedList.isEmpty()) {
                j(p(s.a(linkedList), linkedList, kVar), interfaceC0933e, kVar);
            }
        }
    }

    private d0 l(List list, List list2) {
        if (list == null) {
            a(42);
        }
        if (list2 == null) {
            a(43);
        }
        if (list.isEmpty()) {
            d0 H02 = new m(null, this.f36300c, this.f36298a, this.f36299b, this.f36301d).H0(true, true);
            if (H02 == null) {
                a(44);
            }
            return H02;
        }
        HashMap hashMap = new HashMap();
        for (int i10 = 0; i10 < list.size(); i10++) {
            hashMap.put(((f0) list.get(i10)).r(), ((f0) list2.get(i10)).r());
        }
        d0 H03 = new m(hashMap, this.f36300c, this.f36298a, this.f36299b, this.f36301d).H0(true, true);
        if (H03 == null) {
            a(45);
        }
        return H03;
    }

    public static l m(kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
        if (gVar == null) {
            a(0);
        }
        return new l(f36297g, gVar, f.a.f36673a, null);
    }

    private static D n(Collection collection, InterfaceC0933e interfaceC0933e) {
        if (collection == null) {
            a(88);
        }
        if (interfaceC0933e == null) {
            a(89);
        }
        Iterator it = collection.iterator();
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        while (it.hasNext()) {
            InterfaceC0930b interfaceC0930b = (InterfaceC0930b) it.next();
            int i10 = h.f36308c[interfaceC0930b.s().ordinal()];
            if (i10 == 1) {
                D d10 = D.FINAL;
                if (d10 == null) {
                    a(90);
                }
                return d10;
            }
            if (i10 == 2) {
                throw new IllegalStateException("Member cannot have SEALED modality: " + interfaceC0930b);
            }
            if (i10 == 3) {
                z11 = true;
            } else if (i10 == 4) {
                z12 = true;
            }
        }
        if (interfaceC0933e.R() && interfaceC0933e.s() != D.ABSTRACT && interfaceC0933e.s() != D.SEALED) {
            z10 = true;
        }
        if (z11 && !z12) {
            D d11 = D.OPEN;
            if (d11 == null) {
                a(91);
            }
            return d11;
        }
        if (!z11 && z12) {
            D s10 = z10 ? interfaceC0933e.s() : D.ABSTRACT;
            if (s10 == null) {
                a(92);
            }
            return s10;
        }
        HashSet hashSet = new HashSet();
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            hashSet.addAll(z((InterfaceC0930b) it2.next()));
        }
        return y(r(hashSet), z10, interfaceC0933e.s());
    }

    private Collection o(InterfaceC0930b interfaceC0930b, Collection collection, InterfaceC0933e interfaceC0933e, k kVar) {
        if (interfaceC0930b == null) {
            a(59);
        }
        if (collection == null) {
            a(60);
        }
        if (interfaceC0933e == null) {
            a(61);
        }
        if (kVar == null) {
            a(62);
        }
        ArrayList arrayList = new ArrayList(collection.size());
        Gd.g c10 = Gd.g.c();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            InterfaceC0930b interfaceC0930b2 = (InterfaceC0930b) it.next();
            i.a c11 = D(interfaceC0930b2, interfaceC0930b, interfaceC0933e).c();
            boolean I10 = I(interfaceC0930b, interfaceC0930b2, false);
            int i10 = h.f36307b[c11.ordinal()];
            if (i10 == 1) {
                if (I10) {
                    c10.add(interfaceC0930b2);
                }
                arrayList.add(interfaceC0930b2);
            } else if (i10 == 2) {
                if (I10) {
                    kVar.c(interfaceC0930b2, interfaceC0930b);
                }
                arrayList.add(interfaceC0930b2);
            }
        }
        kVar.d(interfaceC0930b, c10);
        return arrayList;
    }

    private static Collection p(InterfaceC0930b interfaceC0930b, Queue queue, k kVar) {
        if (interfaceC0930b == null) {
            a(104);
        }
        if (queue == null) {
            a(105);
        }
        if (kVar == null) {
            a(106);
        }
        return q(interfaceC0930b, queue, new f(), new g(kVar, interfaceC0930b));
    }

    public static Collection q(Object obj, Collection collection, Function1 function1, Function1 function12) {
        if (obj == null) {
            a(99);
        }
        if (collection == null) {
            a(100);
        }
        if (function1 == null) {
            a(101);
        }
        if (function12 == null) {
            a(102);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(obj);
        InterfaceC0929a interfaceC0929a = (InterfaceC0929a) function1.invoke(obj);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            InterfaceC0929a interfaceC0929a2 = (InterfaceC0929a) function1.invoke(next);
            if (obj == next) {
                it.remove();
            } else {
                i.a x10 = x(interfaceC0929a, interfaceC0929a2);
                if (x10 == i.a.OVERRIDABLE) {
                    arrayList.add(next);
                    it.remove();
                } else if (x10 == i.a.CONFLICT) {
                    function12.invoke(next);
                    it.remove();
                }
            }
        }
        return arrayList;
    }

    public static Set r(Set set) {
        if (set == null) {
            a(8);
        }
        return s(set, !set.isEmpty() && AbstractC3778c.v(AbstractC3778c.p((InterfaceC0941m) set.iterator().next())), null, new b());
    }

    public static Set s(Set set, boolean z10, Function0 function0, Function2 function2) {
        if (set == null) {
            a(9);
        }
        if (function2 == null) {
            a(10);
        }
        if (set.size() <= 1) {
            return set;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : set) {
            if (function0 != null) {
                function0.invoke();
            }
            Iterator it = linkedHashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    linkedHashSet.add(obj);
                    break;
                }
                Pair pair = (Pair) function2.invoke(obj, it.next());
                InterfaceC0929a interfaceC0929a = (InterfaceC0929a) pair.getFirst();
                InterfaceC0929a interfaceC0929a2 = (InterfaceC0929a) pair.getSecond();
                if (!J(interfaceC0929a, interfaceC0929a2, z10, true)) {
                    if (J(interfaceC0929a2, interfaceC0929a, z10, true)) {
                        break;
                    }
                } else {
                    it.remove();
                }
            }
        }
        return linkedHashSet;
    }

    public static Collection t(InterfaceC0933e interfaceC0933e, Collection collection) {
        if (interfaceC0933e == null) {
            a(96);
        }
        if (collection == null) {
            a(97);
        }
        List Z10 = CollectionsKt.Z(collection, new e(interfaceC0933e));
        if (Z10 == null) {
            a(98);
        }
        return Z10;
    }

    public static AbstractC0948u u(Collection collection) {
        AbstractC0948u abstractC0948u;
        if (collection == null) {
            a(109);
        }
        if (collection.isEmpty()) {
            return AbstractC0947t.f5596l;
        }
        Iterator it = collection.iterator();
        loop0: while (true) {
            abstractC0948u = null;
            while (it.hasNext()) {
                AbstractC0948u h10 = ((InterfaceC0930b) it.next()).h();
                if (abstractC0948u != null) {
                    Integer d10 = AbstractC0947t.d(h10, abstractC0948u);
                    if (d10 == null) {
                        break;
                    }
                    if (d10.intValue() > 0) {
                    }
                }
                abstractC0948u = h10;
            }
        }
        if (abstractC0948u == null) {
            return null;
        }
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            Integer d11 = AbstractC0947t.d(abstractC0948u, ((InterfaceC0930b) it2.next()).h());
            if (d11 == null || d11.intValue() < 0) {
                return null;
            }
        }
        return abstractC0948u;
    }

    public static i w(InterfaceC0929a interfaceC0929a, InterfaceC0929a interfaceC0929a2) {
        boolean z10;
        if (interfaceC0929a == null) {
            a(40);
        }
        if (interfaceC0929a2 == null) {
            a(41);
        }
        boolean z11 = interfaceC0929a instanceof InterfaceC0952y;
        if ((z11 && !(interfaceC0929a2 instanceof InterfaceC0952y)) || (((z10 = interfaceC0929a instanceof U)) && !(interfaceC0929a2 instanceof U))) {
            return i.d("Member kind mismatch");
        }
        if (!z11 && !z10) {
            throw new IllegalArgumentException("This type of CallableDescriptor cannot be checked for overridability: " + interfaceC0929a);
        }
        if (!interfaceC0929a.getName().equals(interfaceC0929a2.getName())) {
            return i.d("Name mismatch");
        }
        i e10 = e(interfaceC0929a, interfaceC0929a2);
        if (e10 != null) {
            return e10;
        }
        return null;
    }

    public static i.a x(InterfaceC0929a interfaceC0929a, InterfaceC0929a interfaceC0929a2) {
        l lVar = f36296f;
        i.a c10 = lVar.D(interfaceC0929a2, interfaceC0929a, null).c();
        i.a c11 = lVar.D(interfaceC0929a, interfaceC0929a2, null).c();
        i.a aVar = i.a.OVERRIDABLE;
        if (c10 == aVar && c11 == aVar) {
            return aVar;
        }
        i.a aVar2 = i.a.CONFLICT;
        return (c10 == aVar2 || c11 == aVar2) ? aVar2 : i.a.INCOMPATIBLE;
    }

    private static D y(Collection collection, boolean z10, D d10) {
        if (collection == null) {
            a(93);
        }
        if (d10 == null) {
            a(94);
        }
        D d11 = D.ABSTRACT;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            InterfaceC0930b interfaceC0930b = (InterfaceC0930b) it.next();
            D s10 = (z10 && interfaceC0930b.s() == D.ABSTRACT) ? d10 : interfaceC0930b.s();
            if (s10.compareTo(d11) < 0) {
                d11 = s10;
            }
        }
        if (d11 == null) {
            a(95);
        }
        return d11;
    }

    public static Set z(InterfaceC0930b interfaceC0930b) {
        if (interfaceC0930b == null) {
            a(15);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        f(interfaceC0930b, linkedHashSet);
        return linkedHashSet;
    }

    public i D(InterfaceC0929a interfaceC0929a, InterfaceC0929a interfaceC0929a2, InterfaceC0933e interfaceC0933e) {
        if (interfaceC0929a == null) {
            a(19);
        }
        if (interfaceC0929a2 == null) {
            a(20);
        }
        i E10 = E(interfaceC0929a, interfaceC0929a2, interfaceC0933e, false);
        if (E10 == null) {
            a(21);
        }
        return E10;
    }

    public i E(InterfaceC0929a interfaceC0929a, InterfaceC0929a interfaceC0929a2, InterfaceC0933e interfaceC0933e, boolean z10) {
        if (interfaceC0929a == null) {
            a(22);
        }
        if (interfaceC0929a2 == null) {
            a(23);
        }
        i F10 = F(interfaceC0929a, interfaceC0929a2, z10);
        boolean z11 = F10.c() == i.a.OVERRIDABLE;
        for (kd.g gVar : f36295e) {
            if (gVar.a() != g.a.CONFLICTS_ONLY && (!z11 || gVar.a() != g.a.SUCCESS_ONLY)) {
                int i10 = h.f36306a[gVar.b(interfaceC0929a, interfaceC0929a2, interfaceC0933e).ordinal()];
                if (i10 == 1) {
                    z11 = true;
                } else {
                    if (i10 == 2) {
                        i b10 = i.b("External condition failed");
                        if (b10 == null) {
                            a(24);
                        }
                        return b10;
                    }
                    if (i10 == 3) {
                        i d10 = i.d("External condition");
                        if (d10 == null) {
                            a(25);
                        }
                        return d10;
                    }
                }
            }
        }
        if (!z11) {
            return F10;
        }
        for (kd.g gVar2 : f36295e) {
            if (gVar2.a() == g.a.CONFLICTS_ONLY) {
                int i11 = h.f36306a[gVar2.b(interfaceC0929a, interfaceC0929a2, interfaceC0933e).ordinal()];
                if (i11 == 1) {
                    throw new IllegalStateException("Contract violation in " + gVar2.getClass().getName() + " condition. It's not supposed to end with success");
                }
                if (i11 == 2) {
                    i b11 = i.b("External condition failed");
                    if (b11 == null) {
                        a(27);
                    }
                    return b11;
                }
                if (i11 == 3) {
                    i d11 = i.d("External condition");
                    if (d11 == null) {
                        a(28);
                    }
                    return d11;
                }
            }
        }
        i e10 = i.e();
        if (e10 == null) {
            a(29);
        }
        return e10;
    }

    public i F(InterfaceC0929a interfaceC0929a, InterfaceC0929a interfaceC0929a2, boolean z10) {
        if (interfaceC0929a == null) {
            a(30);
        }
        if (interfaceC0929a2 == null) {
            a(31);
        }
        i w10 = w(interfaceC0929a, interfaceC0929a2);
        if (w10 != null) {
            return w10;
        }
        List g10 = g(interfaceC0929a);
        List g11 = g(interfaceC0929a2);
        List n10 = interfaceC0929a.n();
        List n11 = interfaceC0929a2.n();
        int i10 = 0;
        if (n10.size() != n11.size()) {
            while (i10 < g10.size()) {
                if (!kotlin.reflect.jvm.internal.impl.types.checker.e.f36672a.b((AbstractC5197E) g10.get(i10), (AbstractC5197E) g11.get(i10))) {
                    i d10 = i.d("Type parameter number mismatch");
                    if (d10 == null) {
                        a(33);
                    }
                    return d10;
                }
                i10++;
            }
            i b10 = i.b("Type parameter number mismatch");
            if (b10 == null) {
                a(34);
            }
            return b10;
        }
        d0 l10 = l(n10, n11);
        for (int i11 = 0; i11 < n10.size(); i11++) {
            if (!c((f0) n10.get(i11), (f0) n11.get(i11), l10)) {
                i d11 = i.d("Type parameter bounds mismatch");
                if (d11 == null) {
                    a(35);
                }
                return d11;
            }
        }
        while (i10 < g10.size()) {
            if (!d((AbstractC5197E) g10.get(i10), (AbstractC5197E) g11.get(i10), l10)) {
                i d12 = i.d("Value parameter type mismatch");
                if (d12 == null) {
                    a(36);
                }
                return d12;
            }
            i10++;
        }
        if ((interfaceC0929a instanceof InterfaceC0952y) && (interfaceC0929a2 instanceof InterfaceC0952y) && ((InterfaceC0952y) interfaceC0929a).z() != ((InterfaceC0952y) interfaceC0929a2).z()) {
            i b11 = i.b("Incompatible suspendability");
            if (b11 == null) {
                a(37);
            }
            return b11;
        }
        if (z10) {
            AbstractC5197E g12 = interfaceC0929a.g();
            AbstractC5197E g13 = interfaceC0929a2.g();
            if (g12 != null && g13 != null && ((!G.a(g13) || !G.a(g12)) && !C5203e.f45496a.r(l10, g13.Z0(), g12.Z0()))) {
                i b12 = i.b("Return type mismatch");
                if (b12 == null) {
                    a(38);
                }
                return b12;
            }
        }
        i e10 = i.e();
        if (e10 == null) {
            a(39);
        }
        return e10;
    }

    public void v(id.f fVar, Collection collection, Collection collection2, InterfaceC0933e interfaceC0933e, k kVar) {
        if (fVar == null) {
            a(52);
        }
        if (collection == null) {
            a(53);
        }
        if (collection2 == null) {
            a(54);
        }
        if (interfaceC0933e == null) {
            a(55);
        }
        if (kVar == null) {
            a(56);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            linkedHashSet.removeAll(o((InterfaceC0930b) it.next(), collection, interfaceC0933e, kVar));
        }
        k(interfaceC0933e, linkedHashSet, kVar);
    }

    static class d implements Function1 {
        d() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public InterfaceC0930b invoke(InterfaceC0930b interfaceC0930b) {
            return interfaceC0930b;
        }
    }

    static class f implements Function1 {
        f() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public InterfaceC0929a invoke(InterfaceC0930b interfaceC0930b) {
            return interfaceC0930b;
        }
    }
}
