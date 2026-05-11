package bd;

import Kc.AbstractC0951x;
import Kc.G;
import Kc.InterfaceC0933e;
import Kc.J;
import Kc.a0;
import Kc.j0;
import bd.t;
import dd.C3025b;
import id.C3367b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import md.AbstractC3680g;
import md.AbstractC3684k;
import md.C3674a;
import md.C3677d;
import md.C3679f;
import md.C3681h;
import md.C3683j;
import md.C3686m;
import md.C3689p;
import md.C3690q;
import md.C3693t;
import md.C3696w;
import md.C3697x;
import md.C3698y;
import md.C3699z;
import ud.C4887e;
import yd.AbstractC5197E;

/* renamed from: bd.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1678e extends AbstractC1674a {

    /* renamed from: d, reason: collision with root package name */
    private final G f18981d;

    /* renamed from: e, reason: collision with root package name */
    private final J f18982e;

    /* renamed from: f, reason: collision with root package name */
    private final C4887e f18983f;

    /* renamed from: g, reason: collision with root package name */
    private hd.e f18984g;

    /* renamed from: bd.e$a */
    private abstract class a implements t.a {

        /* renamed from: bd.e$a$a, reason: collision with other inner class name */
        public static final class C0334a implements t.a {

            /* renamed from: a, reason: collision with root package name */
            private final /* synthetic */ t.a f18986a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ t.a f18987b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ a f18988c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ id.f f18989d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ ArrayList f18990e;

            C0334a(t.a aVar, a aVar2, id.f fVar, ArrayList arrayList) {
                this.f18987b = aVar;
                this.f18988c = aVar2;
                this.f18989d = fVar;
                this.f18990e = arrayList;
                this.f18986a = aVar;
            }

            @Override // bd.t.a
            public void a() {
                this.f18987b.a();
                this.f18988c.h(this.f18989d, new C3674a((kotlin.reflect.jvm.internal.impl.descriptors.annotations.c) CollectionsKt.A0(this.f18990e)));
            }

            @Override // bd.t.a
            public void b(id.f fVar, C3679f value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this.f18986a.b(fVar, value);
            }

            @Override // bd.t.a
            public t.b c(id.f fVar) {
                return this.f18986a.c(fVar);
            }

            @Override // bd.t.a
            public void d(id.f fVar, Object obj) {
                this.f18986a.d(fVar, obj);
            }

            @Override // bd.t.a
            public t.a e(id.f fVar, C3367b classId) {
                Intrinsics.checkNotNullParameter(classId, "classId");
                return this.f18986a.e(fVar, classId);
            }

            @Override // bd.t.a
            public void f(id.f fVar, C3367b enumClassId, id.f enumEntryName) {
                Intrinsics.checkNotNullParameter(enumClassId, "enumClassId");
                Intrinsics.checkNotNullParameter(enumEntryName, "enumEntryName");
                this.f18986a.f(fVar, enumClassId, enumEntryName);
            }
        }

        /* renamed from: bd.e$a$b */
        public static final class b implements t.b {

            /* renamed from: a, reason: collision with root package name */
            private final ArrayList f18991a = new ArrayList();

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C1678e f18992b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ id.f f18993c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ a f18994d;

            /* renamed from: bd.e$a$b$a, reason: collision with other inner class name */
            public static final class C0335a implements t.a {

                /* renamed from: a, reason: collision with root package name */
                private final /* synthetic */ t.a f18995a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ t.a f18996b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ b f18997c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ ArrayList f18998d;

                C0335a(t.a aVar, b bVar, ArrayList arrayList) {
                    this.f18996b = aVar;
                    this.f18997c = bVar;
                    this.f18998d = arrayList;
                    this.f18995a = aVar;
                }

                @Override // bd.t.a
                public void a() {
                    this.f18996b.a();
                    this.f18997c.f18991a.add(new C3674a((kotlin.reflect.jvm.internal.impl.descriptors.annotations.c) CollectionsKt.A0(this.f18998d)));
                }

                @Override // bd.t.a
                public void b(id.f fVar, C3679f value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    this.f18995a.b(fVar, value);
                }

                @Override // bd.t.a
                public t.b c(id.f fVar) {
                    return this.f18995a.c(fVar);
                }

                @Override // bd.t.a
                public void d(id.f fVar, Object obj) {
                    this.f18995a.d(fVar, obj);
                }

                @Override // bd.t.a
                public t.a e(id.f fVar, C3367b classId) {
                    Intrinsics.checkNotNullParameter(classId, "classId");
                    return this.f18995a.e(fVar, classId);
                }

                @Override // bd.t.a
                public void f(id.f fVar, C3367b enumClassId, id.f enumEntryName) {
                    Intrinsics.checkNotNullParameter(enumClassId, "enumClassId");
                    Intrinsics.checkNotNullParameter(enumEntryName, "enumEntryName");
                    this.f18995a.f(fVar, enumClassId, enumEntryName);
                }
            }

            b(C1678e c1678e, id.f fVar, a aVar) {
                this.f18992b = c1678e;
                this.f18993c = fVar;
                this.f18994d = aVar;
            }

            @Override // bd.t.b
            public void a() {
                this.f18994d.g(this.f18993c, this.f18991a);
            }

            @Override // bd.t.b
            public t.a b(C3367b classId) {
                Intrinsics.checkNotNullParameter(classId, "classId");
                ArrayList arrayList = new ArrayList();
                C1678e c1678e = this.f18992b;
                a0 NO_SOURCE = a0.f5560a;
                Intrinsics.checkNotNullExpressionValue(NO_SOURCE, "NO_SOURCE");
                t.a w10 = c1678e.w(classId, NO_SOURCE, arrayList);
                Intrinsics.d(w10);
                return new C0335a(w10, this, arrayList);
            }

            @Override // bd.t.b
            public void c(C3367b enumClassId, id.f enumEntryName) {
                Intrinsics.checkNotNullParameter(enumClassId, "enumClassId");
                Intrinsics.checkNotNullParameter(enumEntryName, "enumEntryName");
                this.f18991a.add(new C3683j(enumClassId, enumEntryName));
            }

            @Override // bd.t.b
            public void d(Object obj) {
                this.f18991a.add(this.f18992b.J(this.f18993c, obj));
            }

            @Override // bd.t.b
            public void e(C3679f value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this.f18991a.add(new C3689p(value));
            }
        }

        public a() {
        }

        @Override // bd.t.a
        public void b(id.f fVar, C3679f value) {
            Intrinsics.checkNotNullParameter(value, "value");
            h(fVar, new C3689p(value));
        }

        @Override // bd.t.a
        public t.b c(id.f fVar) {
            return new b(C1678e.this, fVar, this);
        }

        @Override // bd.t.a
        public void d(id.f fVar, Object obj) {
            h(fVar, C1678e.this.J(fVar, obj));
        }

        @Override // bd.t.a
        public t.a e(id.f fVar, C3367b classId) {
            Intrinsics.checkNotNullParameter(classId, "classId");
            ArrayList arrayList = new ArrayList();
            C1678e c1678e = C1678e.this;
            a0 NO_SOURCE = a0.f5560a;
            Intrinsics.checkNotNullExpressionValue(NO_SOURCE, "NO_SOURCE");
            t.a w10 = c1678e.w(classId, NO_SOURCE, arrayList);
            Intrinsics.d(w10);
            return new C0334a(w10, this, fVar, arrayList);
        }

        @Override // bd.t.a
        public void f(id.f fVar, C3367b enumClassId, id.f enumEntryName) {
            Intrinsics.checkNotNullParameter(enumClassId, "enumClassId");
            Intrinsics.checkNotNullParameter(enumEntryName, "enumEntryName");
            h(fVar, new C3683j(enumClassId, enumEntryName));
        }

        public abstract void g(id.f fVar, ArrayList arrayList);

        public abstract void h(id.f fVar, AbstractC3680g abstractC3680g);
    }

    /* renamed from: bd.e$b */
    public static final class b extends a {

        /* renamed from: b, reason: collision with root package name */
        private final HashMap f18999b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC0933e f19001d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C3367b f19002e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f19003f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ a0 f19004g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC0933e interfaceC0933e, C3367b c3367b, List list, a0 a0Var) {
            super();
            this.f19001d = interfaceC0933e;
            this.f19002e = c3367b;
            this.f19003f = list;
            this.f19004g = a0Var;
            this.f18999b = new HashMap();
        }

        @Override // bd.t.a
        public void a() {
            if (C1678e.this.D(this.f19002e, this.f18999b) || C1678e.this.v(this.f19002e)) {
                return;
            }
            this.f19003f.add(new kotlin.reflect.jvm.internal.impl.descriptors.annotations.d(this.f19001d.y(), this.f18999b, this.f19004g));
        }

        @Override // bd.C1678e.a
        public void g(id.f fVar, ArrayList elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            if (fVar == null) {
                return;
            }
            j0 b10 = Tc.a.b(fVar, this.f19001d);
            if (b10 != null) {
                HashMap hashMap = this.f18999b;
                C3681h c3681h = C3681h.f37480a;
                List c10 = Gd.a.c(elements);
                AbstractC5197E type = b10.getType();
                Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                hashMap.put(fVar, c3681h.b(c10, type));
                return;
            }
            if (C1678e.this.v(this.f19002e) && Intrinsics.b(fVar.c(), "value")) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : elements) {
                    if (obj instanceof C3674a) {
                        arrayList.add(obj);
                    }
                }
                List list = this.f19003f;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    list.add((kotlin.reflect.jvm.internal.impl.descriptors.annotations.c) ((C3674a) it.next()).b());
                }
            }
        }

        @Override // bd.C1678e.a
        public void h(id.f fVar, AbstractC3680g value) {
            Intrinsics.checkNotNullParameter(value, "value");
            if (fVar != null) {
                this.f18999b.put(fVar, value);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1678e(G module, J notFoundClasses, xd.n storageManager, r kotlinClassFinder) {
        super(storageManager, kotlinClassFinder);
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(notFoundClasses, "notFoundClasses");
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(kotlinClassFinder, "kotlinClassFinder");
        this.f18981d = module;
        this.f18982e = notFoundClasses;
        this.f18983f = new C4887e(module, notFoundClasses);
        this.f18984g = hd.e.f34067i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AbstractC3680g J(id.f fVar, Object obj) {
        AbstractC3680g c10 = C3681h.f37480a.c(obj, this.f18981d);
        if (c10 != null) {
            return c10;
        }
        return AbstractC3684k.f37484b.a("Unsupported annotation argument: " + fVar);
    }

    private final InterfaceC0933e M(C3367b c3367b) {
        return AbstractC0951x.c(this.f18981d, c3367b, this.f18982e);
    }

    @Override // bd.AbstractC1675b
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.c x(C3025b proto, fd.c nameResolver) {
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        return this.f18983f.a(proto, nameResolver);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // bd.AbstractC1674a
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public AbstractC3680g F(String desc, Object initializer) {
        Intrinsics.checkNotNullParameter(desc, "desc");
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        if (StringsKt.K("ZBCS", desc, false, 2, null)) {
            int intValue = ((Integer) initializer).intValue();
            int hashCode = desc.hashCode();
            if (hashCode == 66) {
                if (desc.equals("B")) {
                    initializer = Byte.valueOf((byte) intValue);
                }
                throw new AssertionError(desc);
            }
            if (hashCode == 67) {
                if (desc.equals("C")) {
                    initializer = Character.valueOf((char) intValue);
                }
                throw new AssertionError(desc);
            }
            if (hashCode == 83) {
                if (desc.equals("S")) {
                    initializer = Short.valueOf((short) intValue);
                }
                throw new AssertionError(desc);
            }
            if (hashCode == 90 && desc.equals("Z")) {
                initializer = Boolean.valueOf(intValue != 0);
            }
            throw new AssertionError(desc);
        }
        return C3681h.f37480a.c(initializer, this.f18981d);
    }

    public void N(hd.e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<set-?>");
        this.f18984g = eVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // bd.AbstractC1674a
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public AbstractC3680g H(AbstractC3680g constant) {
        AbstractC3680g c3698y;
        Intrinsics.checkNotNullParameter(constant, "constant");
        if (constant instanceof C3677d) {
            c3698y = new C3696w(((Number) ((C3677d) constant).b()).byteValue());
        } else if (constant instanceof C3693t) {
            c3698y = new C3699z(((Number) ((C3693t) constant).b()).shortValue());
        } else if (constant instanceof C3686m) {
            c3698y = new C3697x(((Number) ((C3686m) constant).b()).intValue());
        } else {
            if (!(constant instanceof C3690q)) {
                return constant;
            }
            c3698y = new C3698y(((Number) ((C3690q) constant).b()).longValue());
        }
        return c3698y;
    }

    @Override // bd.AbstractC1675b
    public hd.e t() {
        return this.f18984g;
    }

    @Override // bd.AbstractC1675b
    protected t.a w(C3367b annotationClassId, a0 source, List result) {
        Intrinsics.checkNotNullParameter(annotationClassId, "annotationClassId");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(result, "result");
        return new b(M(annotationClassId), annotationClassId, result, source);
    }
}
