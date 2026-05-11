package Wc;

import Kc.InterfaceC0933e;
import Kc.a0;
import Mc.z;
import bd.s;
import bd.t;
import cd.C1750a;
import id.C3367b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.G;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import xc.C5142C;
import xc.u;

/* loaded from: classes3.dex */
public final class h extends z {

    /* renamed from: o, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.k[] f11501o = {C5142C.k(new u(C5142C.b(h.class), "binaryClasses", "getBinaryClasses$descriptors_jvm()Ljava/util/Map;")), C5142C.k(new u(C5142C.b(h.class), "partToFacade", "getPartToFacade()Ljava/util/HashMap;"))};

    /* renamed from: g, reason: collision with root package name */
    private final Zc.u f11502g;

    /* renamed from: h, reason: collision with root package name */
    private final Vc.g f11503h;

    /* renamed from: i, reason: collision with root package name */
    private final hd.e f11504i;

    /* renamed from: j, reason: collision with root package name */
    private final xd.i f11505j;

    /* renamed from: k, reason: collision with root package name */
    private final d f11506k;

    /* renamed from: l, reason: collision with root package name */
    private final xd.i f11507l;

    /* renamed from: m, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g f11508m;

    /* renamed from: n, reason: collision with root package name */
    private final xd.i f11509n;

    static final class a extends xc.m implements Function0 {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Map invoke() {
            bd.z o10 = h.this.f11503h.a().o();
            String b10 = h.this.e().b();
            Intrinsics.checkNotNullExpressionValue(b10, "asString(...)");
            List<String> a10 = o10.a(b10);
            h hVar = h.this;
            ArrayList arrayList = new ArrayList();
            for (String str : a10) {
                C3367b m10 = C3367b.m(pd.d.d(str).e());
                Intrinsics.checkNotNullExpressionValue(m10, "topLevel(...)");
                t b11 = s.b(hVar.f11503h.a().j(), m10, hVar.f11504i);
                Pair a11 = b11 != null ? lc.t.a(str, b11) : null;
                if (a11 != null) {
                    arrayList.add(a11);
                }
            }
            return G.r(arrayList);
        }
    }

    static final class b extends xc.m implements Function0 {

        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f11512a;

            static {
                int[] iArr = new int[C1750a.EnumC0347a.values().length];
                try {
                    iArr[C1750a.EnumC0347a.MULTIFILE_CLASS_PART.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[C1750a.EnumC0347a.FILE_FACADE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f11512a = iArr;
            }
        }

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final HashMap invoke() {
            HashMap hashMap = new HashMap();
            for (Map.Entry entry : h.this.W0().entrySet()) {
                String str = (String) entry.getKey();
                t tVar = (t) entry.getValue();
                pd.d d10 = pd.d.d(str);
                Intrinsics.checkNotNullExpressionValue(d10, "byInternalName(...)");
                C1750a a10 = tVar.a();
                int i10 = a.f11512a[a10.c().ordinal()];
                if (i10 == 1) {
                    String e10 = a10.e();
                    if (e10 != null) {
                        pd.d d11 = pd.d.d(e10);
                        Intrinsics.checkNotNullExpressionValue(d11, "byInternalName(...)");
                        hashMap.put(d10, d11);
                    }
                } else if (i10 == 2) {
                    hashMap.put(d10, d10);
                }
            }
            return hashMap;
        }
    }

    static final class c extends xc.m implements Function0 {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke() {
            Collection F10 = h.this.f11502g.F();
            ArrayList arrayList = new ArrayList(CollectionsKt.u(F10, 10));
            Iterator it = F10.iterator();
            while (it.hasNext()) {
                arrayList.add(((Zc.u) it.next()).e());
            }
            return arrayList;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Vc.g outerContext, Zc.u jPackage) {
        super(outerContext.d(), jPackage.e());
        Intrinsics.checkNotNullParameter(outerContext, "outerContext");
        Intrinsics.checkNotNullParameter(jPackage, "jPackage");
        this.f11502g = jPackage;
        Vc.g d10 = Vc.a.d(outerContext, this, null, 0, 6, null);
        this.f11503h = d10;
        this.f11504i = Gd.c.a(outerContext.a().b().d().g());
        this.f11505j = d10.e().d(new a());
        this.f11506k = new d(d10, jPackage, this);
        this.f11507l = d10.e().c(new c(), CollectionsKt.j());
        this.f11508m = d10.a().i().b() ? kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f36445g0.b() : Vc.e.a(d10, jPackage);
        this.f11509n = d10.e().d(new b());
    }

    public final InterfaceC0933e V0(Zc.g jClass) {
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        return this.f11506k.j().P(jClass);
    }

    public final Map W0() {
        return (Map) xd.m.a(this.f11505j, this, f11501o[0]);
    }

    @Override // Kc.K
    /* renamed from: X0, reason: merged with bridge method [inline-methods] */
    public d w() {
        return this.f11506k;
    }

    public final List Y0() {
        return (List) this.f11507l.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.b, kotlin.reflect.jvm.internal.impl.descriptors.annotations.a
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.g i() {
        return this.f11508m;
    }

    @Override // Mc.z, Mc.AbstractC0985k, Kc.InterfaceC0944p
    public a0 j() {
        return new bd.u(this);
    }

    @Override // Mc.z, Mc.AbstractC0984j
    public String toString() {
        return "Lazy Java package fragment: " + e() + " of module " + this.f11503h.a().m();
    }
}
