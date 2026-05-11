package Fc;

import Ec.L;
import Ec.n;
import Fc.f;
import Kc.InterfaceC0930b;
import Kc.InterfaceC0933e;
import Kc.InterfaceC0936h;
import Kc.InterfaceC0940l;
import Kc.InterfaceC0941m;
import Kc.InterfaceC0952y;
import Kc.Q;
import Kc.X;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.AbstractC3574i;
import kotlin.collections.CollectionsKt;
import kotlin.collections.D;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import pc.AbstractC3868b;
import xc.m;
import yd.AbstractC5197E;
import yd.m0;

/* loaded from: classes3.dex */
public final class j implements e {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f2697a;

    /* renamed from: b, reason: collision with root package name */
    private final e f2698b;

    /* renamed from: c, reason: collision with root package name */
    private final Member f2699c;

    /* renamed from: d, reason: collision with root package name */
    private final a f2700d;

    /* renamed from: e, reason: collision with root package name */
    private final IntRange[] f2701e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f2702f;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final IntRange f2703a;

        /* renamed from: b, reason: collision with root package name */
        private final List[] f2704b;

        /* renamed from: c, reason: collision with root package name */
        private final Method f2705c;

        public a(IntRange argumentRange, List[] unboxParameters, Method method) {
            Intrinsics.checkNotNullParameter(argumentRange, "argumentRange");
            Intrinsics.checkNotNullParameter(unboxParameters, "unboxParameters");
            this.f2703a = argumentRange;
            this.f2704b = unboxParameters;
            this.f2705c = method;
        }

        public final IntRange a() {
            return this.f2703a;
        }

        public final Method b() {
            return this.f2705c;
        }

        public final List[] c() {
            return this.f2704b;
        }
    }

    public static final class b implements e {

        /* renamed from: a, reason: collision with root package name */
        private final Method f2706a;

        /* renamed from: b, reason: collision with root package name */
        private final Method f2707b;

        /* renamed from: c, reason: collision with root package name */
        private final List f2708c;

        /* renamed from: d, reason: collision with root package name */
        private final List f2709d;

        /* renamed from: e, reason: collision with root package name */
        private final List f2710e;

        public b(InterfaceC0952y descriptor, n container, String constructorDesc, List originalParameters) {
            Collection e10;
            List o10;
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(container, "container");
            Intrinsics.checkNotNullParameter(constructorDesc, "constructorDesc");
            Intrinsics.checkNotNullParameter(originalParameters, "originalParameters");
            Method F10 = container.F("constructor-impl", constructorDesc);
            Intrinsics.d(F10);
            this.f2706a = F10;
            Method F11 = container.F("box-impl", StringsKt.p0(constructorDesc, "V") + Pc.d.b(container.m()));
            Intrinsics.d(F11);
            this.f2707b = F11;
            List list = originalParameters;
            ArrayList arrayList = new ArrayList(CollectionsKt.u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AbstractC5197E type = ((Q) it.next()).getType();
                Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                o10 = k.o(m0.a(type), descriptor);
                arrayList.add(o10);
            }
            this.f2708c = arrayList;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.u(list, 10));
            int i10 = 0;
            for (Object obj : list) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    CollectionsKt.t();
                }
                InterfaceC0936h d10 = ((Q) obj).getType().W0().d();
                Intrinsics.e(d10, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                InterfaceC0933e interfaceC0933e = (InterfaceC0933e) d10;
                List list2 = (List) this.f2708c.get(i10);
                if (list2 != null) {
                    List list3 = list2;
                    e10 = new ArrayList(CollectionsKt.u(list3, 10));
                    Iterator it2 = list3.iterator();
                    while (it2.hasNext()) {
                        e10.add(((Method) it2.next()).getReturnType());
                    }
                } else {
                    Class q10 = L.q(interfaceC0933e);
                    Intrinsics.d(q10);
                    e10 = CollectionsKt.e(q10);
                }
                arrayList2.add(e10);
                i10 = i11;
            }
            this.f2709d = arrayList2;
            this.f2710e = CollectionsKt.w(arrayList2);
        }

        @Override // Fc.e
        public /* bridge */ /* synthetic */ Member a() {
            return (Member) b();
        }

        public Void b() {
            return null;
        }

        public final List c() {
            return this.f2709d;
        }

        @Override // Fc.e
        public Type g() {
            Class<?> returnType = this.f2707b.getReturnType();
            Intrinsics.checkNotNullExpressionValue(returnType, "getReturnType(...)");
            return returnType;
        }

        @Override // Fc.e
        public Object h(Object[] args) {
            Collection e10;
            Intrinsics.checkNotNullParameter(args, "args");
            List<Pair> B02 = AbstractC3574i.B0(args, this.f2708c);
            ArrayList arrayList = new ArrayList();
            for (Pair pair : B02) {
                Object first = pair.getFirst();
                List list = (List) pair.getSecond();
                if (list != null) {
                    List list2 = list;
                    e10 = new ArrayList(CollectionsKt.u(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        e10.add(((Method) it.next()).invoke(first, null));
                    }
                } else {
                    e10 = CollectionsKt.e(first);
                }
                CollectionsKt.z(arrayList, e10);
            }
            Object[] array = arrayList.toArray(new Object[0]);
            this.f2706a.invoke(null, Arrays.copyOf(array, array.length));
            return this.f2707b.invoke(null, Arrays.copyOf(array, array.length));
        }

        @Override // Fc.e
        public List i() {
            return this.f2710e;
        }
    }

    static final class c extends m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final c f2711a = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(InterfaceC0933e makeKotlinParameterTypes) {
            Intrinsics.checkNotNullParameter(makeKotlinParameterTypes, "$this$makeKotlinParameterTypes");
            return Boolean.valueOf(kd.h.g(makeKotlinParameterTypes));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x00a5, code lost:
    
        r13 = Fc.k.s(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00d4, code lost:
    
        if ((r12 instanceof Fc.d) != false) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public j(InterfaceC0930b descriptor, e oldCaller, boolean z10) {
        Class s10;
        List q10;
        int i10;
        a aVar;
        AbstractC5197E j10;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(oldCaller, "oldCaller");
        this.f2697a = z10;
        boolean z11 = false;
        if (oldCaller instanceof f.h.c) {
            X s02 = descriptor.s0();
            s02 = s02 == null ? descriptor.l0() : s02;
            AbstractC5197E type = s02 != null ? s02.getType() : null;
            if (type != null && kd.h.i(type)) {
                List m10 = k.m(m0.a(type));
                Intrinsics.d(m10);
                List list = m10;
                ArrayList arrayList = new ArrayList(CollectionsKt.u(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((Method) it.next()).invoke(((f.h.c) oldCaller).f(), null));
                }
                oldCaller = new f.h.d((Method) ((f.h.c) oldCaller).a(), arrayList.toArray(new Object[0]));
            }
        }
        this.f2698b = oldCaller;
        this.f2699c = oldCaller.a();
        AbstractC5197E g10 = descriptor.g();
        Intrinsics.d(g10);
        boolean z12 = descriptor instanceof InterfaceC0952y;
        Method j11 = ((z12 && ((InterfaceC0952y) descriptor).z() && (j10 = kd.h.j(g10)) != null && Hc.g.s0(j10)) || s10 == null) ? null : k.j(s10, descriptor);
        if (kd.h.a(descriptor)) {
            aVar = new a(IntRange.INSTANCE.a(), new List[0], j11);
        } else {
            int i11 = -1;
            if (!(oldCaller instanceof f.h.c) && !(oldCaller instanceof f.h.d)) {
                if (!(descriptor instanceof InterfaceC0940l)) {
                    if (descriptor.l0() != null && !(oldCaller instanceof d)) {
                        InterfaceC0941m b10 = descriptor.b();
                        Intrinsics.checkNotNullExpressionValue(b10, "getContainingDeclaration(...)");
                        if (!kd.h.g(b10)) {
                            i11 = 1;
                        }
                    }
                    i11 = 0;
                }
            }
            int i12 = oldCaller instanceof f.h.d ? -((f.h.d) oldCaller).j() : i11;
            q10 = k.q(descriptor, c.f2711a);
            if (this.f2697a) {
                Iterator it2 = q10.iterator();
                int i13 = 0;
                while (it2.hasNext()) {
                    i13 += b((AbstractC5197E) it2.next());
                }
                i10 = ((i13 + 31) / 32) + 1;
            } else {
                i10 = 0;
            }
            int i14 = i10 + ((z12 && ((InterfaceC0952y) descriptor).z()) ? 1 : 0);
            Iterator it3 = q10.iterator();
            int i15 = 0;
            while (it3.hasNext()) {
                i15 += b((AbstractC5197E) it3.next());
            }
            int i16 = i15 + i12 + i14;
            k.f(this, i16, descriptor, this.f2697a);
            IntRange p10 = kotlin.ranges.d.p(Math.max(i11, 0), q10.size() + i11);
            List[] listArr = new List[i16];
            int i17 = 0;
            while (i17 < i16) {
                listArr[i17] = (i17 > p10.e() || p10.c() > i17) ? null : k.o(m0.a((AbstractC5197E) q10.get(i17 - i11)), descriptor);
                i17++;
            }
            aVar = new a(p10, listArr, j11);
        }
        this.f2700d = aVar;
        List c10 = CollectionsKt.c();
        e eVar = this.f2698b;
        int length = eVar instanceof f.h.d ? ((f.h.d) eVar).f().length : eVar instanceof f.h.c ? 1 : 0;
        if (length > 0) {
            c10.add(kotlin.ranges.d.p(0, length));
        }
        List[] c11 = aVar.c();
        int length2 = c11.length;
        int i18 = 0;
        while (i18 < length2) {
            List list2 = c11[i18];
            int size = (list2 != null ? list2.size() : 1) + length;
            c10.add(kotlin.ranges.d.p(length, size));
            i18++;
            length = size;
        }
        this.f2701e = (IntRange[]) CollectionsKt.a(c10).toArray(new IntRange[0]);
        Iterable a10 = this.f2700d.a();
        if (!(a10 instanceof Collection) || !((Collection) a10).isEmpty()) {
            Iterator it4 = a10.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    break;
                }
                List list3 = this.f2700d.c()[((D) it4).a()];
                if (list3 != null && list3.size() > 1) {
                    z11 = true;
                    break;
                }
            }
        }
        this.f2702f = z11;
    }

    private static final int b(AbstractC5197E abstractC5197E) {
        List m10 = k.m(m0.a(abstractC5197E));
        if (m10 != null) {
            return m10.size();
        }
        return 1;
    }

    @Override // Fc.e
    public Member a() {
        return this.f2699c;
    }

    public final IntRange c(int i10) {
        IntRange intRange;
        if (i10 >= 0) {
            IntRange[] intRangeArr = this.f2701e;
            if (i10 < intRangeArr.length) {
                return intRangeArr[i10];
            }
        }
        IntRange[] intRangeArr2 = this.f2701e;
        if (intRangeArr2.length == 0) {
            intRange = new IntRange(i10, i10);
        } else {
            int length = (i10 - intRangeArr2.length) + ((IntRange) AbstractC3574i.T(intRangeArr2)).e() + 1;
            intRange = new IntRange(length, length);
        }
        return intRange;
    }

    @Override // Fc.e
    public Type g() {
        return this.f2698b.g();
    }

    @Override // Fc.e
    public Object h(Object[] args) {
        Object invoke;
        Object obj;
        Object g10;
        Intrinsics.checkNotNullParameter(args, "args");
        IntRange a10 = this.f2700d.a();
        List[] c10 = this.f2700d.c();
        Method b10 = this.f2700d.b();
        if (!a10.isEmpty()) {
            if (this.f2702f) {
                List d10 = CollectionsKt.d(args.length);
                int c11 = a10.c();
                for (int i10 = 0; i10 < c11; i10++) {
                    d10.add(args[i10]);
                }
                int c12 = a10.c();
                int e10 = a10.e();
                if (c12 <= e10) {
                    while (true) {
                        List<Method> list = c10[c12];
                        Object obj2 = args[c12];
                        if (list != null) {
                            for (Method method : list) {
                                List list2 = d10;
                                if (obj2 != null) {
                                    g10 = method.invoke(obj2, null);
                                } else {
                                    Class<?> returnType = method.getReturnType();
                                    Intrinsics.checkNotNullExpressionValue(returnType, "getReturnType(...)");
                                    g10 = L.g(returnType);
                                }
                                list2.add(g10);
                            }
                        } else {
                            d10.add(obj2);
                        }
                        if (c12 == e10) {
                            break;
                        }
                        c12++;
                    }
                }
                int e11 = a10.e() + 1;
                int D10 = AbstractC3574i.D(args);
                if (e11 <= D10) {
                    while (true) {
                        d10.add(args[e11]);
                        if (e11 == D10) {
                            break;
                        }
                        e11++;
                    }
                }
                args = CollectionsKt.a(d10).toArray(new Object[0]);
            } else {
                int length = args.length;
                Object[] objArr = new Object[length];
                for (int i11 = 0; i11 < length; i11++) {
                    int c13 = a10.c();
                    if (i11 > a10.e() || c13 > i11) {
                        obj = args[i11];
                    } else {
                        List list3 = c10[i11];
                        Method method2 = list3 != null ? (Method) CollectionsKt.A0(list3) : null;
                        obj = args[i11];
                        if (method2 != null) {
                            if (obj != null) {
                                obj = method2.invoke(obj, null);
                            } else {
                                Class<?> returnType2 = method2.getReturnType();
                                Intrinsics.checkNotNullExpressionValue(returnType2, "getReturnType(...)");
                                obj = L.g(returnType2);
                            }
                        }
                    }
                    objArr[i11] = obj;
                }
                args = objArr;
            }
        }
        Object h10 = this.f2698b.h(args);
        return h10 == AbstractC3868b.e() ? h10 : (b10 == null || (invoke = b10.invoke(null, h10)) == null) ? h10 : invoke;
    }

    @Override // Fc.e
    public List i() {
        return this.f2698b.i();
    }
}
