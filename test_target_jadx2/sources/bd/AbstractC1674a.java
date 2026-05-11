package bd;

import Kc.a0;
import bd.t;
import bd.w;
import dd.C3037n;
import id.C3367b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import md.C3689p;
import ud.AbstractC4882A;
import ud.EnumC4884b;
import ud.InterfaceC4885c;
import yd.AbstractC5197E;

/* renamed from: bd.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1674a extends AbstractC1675b implements InterfaceC4885c {

    /* renamed from: c, reason: collision with root package name */
    private final xd.g f18960c;

    /* renamed from: bd.a$a, reason: collision with other inner class name */
    static final class C0330a extends xc.m implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        public static final C0330a f18961a = new C0330a();

        C0330a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C1677d loadConstantFromProperty, w it) {
            Intrinsics.checkNotNullParameter(loadConstantFromProperty, "$this$loadConstantFromProperty");
            Intrinsics.checkNotNullParameter(it, "it");
            return loadConstantFromProperty.b().get(it);
        }
    }

    /* renamed from: bd.a$b */
    public static final class b implements t.d {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ HashMap f18963b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ t f18964c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ HashMap f18965d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ HashMap f18966e;

        /* renamed from: bd.a$b$a, reason: collision with other inner class name */
        public final class C0331a extends C0332b implements t.e {

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ b f18967d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0331a(b bVar, w signature) {
                super(bVar, signature);
                Intrinsics.checkNotNullParameter(signature, "signature");
                this.f18967d = bVar;
            }

            @Override // bd.t.e
            public t.a c(int i10, C3367b classId, a0 source) {
                Intrinsics.checkNotNullParameter(classId, "classId");
                Intrinsics.checkNotNullParameter(source, "source");
                w e10 = w.f19048b.e(d(), i10);
                List list = (List) this.f18967d.f18963b.get(e10);
                if (list == null) {
                    list = new ArrayList();
                    this.f18967d.f18963b.put(e10, list);
                }
                return AbstractC1674a.this.y(classId, source, list);
            }
        }

        /* renamed from: bd.a$b$b, reason: collision with other inner class name */
        public class C0332b implements t.c {

            /* renamed from: a, reason: collision with root package name */
            private final w f18968a;

            /* renamed from: b, reason: collision with root package name */
            private final ArrayList f18969b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ b f18970c;

            public C0332b(b bVar, w signature) {
                Intrinsics.checkNotNullParameter(signature, "signature");
                this.f18970c = bVar;
                this.f18968a = signature;
                this.f18969b = new ArrayList();
            }

            @Override // bd.t.c
            public void a() {
                if (this.f18969b.isEmpty()) {
                    return;
                }
                this.f18970c.f18963b.put(this.f18968a, this.f18969b);
            }

            @Override // bd.t.c
            public t.a b(C3367b classId, a0 source) {
                Intrinsics.checkNotNullParameter(classId, "classId");
                Intrinsics.checkNotNullParameter(source, "source");
                return AbstractC1674a.this.y(classId, source, this.f18969b);
            }

            protected final w d() {
                return this.f18968a;
            }
        }

        b(HashMap hashMap, t tVar, HashMap hashMap2, HashMap hashMap3) {
            this.f18963b = hashMap;
            this.f18964c = tVar;
            this.f18965d = hashMap2;
            this.f18966e = hashMap3;
        }

        @Override // bd.t.d
        public t.c a(id.f name, String desc, Object obj) {
            Object F10;
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(desc, "desc");
            w.a aVar = w.f19048b;
            String c10 = name.c();
            Intrinsics.checkNotNullExpressionValue(c10, "asString(...)");
            w a10 = aVar.a(c10, desc);
            if (obj != null && (F10 = AbstractC1674a.this.F(desc, obj)) != null) {
                this.f18966e.put(a10, F10);
            }
            return new C0332b(this, a10);
        }

        @Override // bd.t.d
        public t.e b(id.f name, String desc) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(desc, "desc");
            w.a aVar = w.f19048b;
            String c10 = name.c();
            Intrinsics.checkNotNullExpressionValue(c10, "asString(...)");
            return new C0331a(this, aVar.d(c10, desc));
        }
    }

    /* renamed from: bd.a$c */
    static final class c extends xc.m implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        public static final c f18971a = new c();

        c() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C1677d loadConstantFromProperty, w it) {
            Intrinsics.checkNotNullParameter(loadConstantFromProperty, "$this$loadConstantFromProperty");
            Intrinsics.checkNotNullParameter(it, "it");
            return loadConstantFromProperty.c().get(it);
        }
    }

    /* renamed from: bd.a$d */
    static final class d extends xc.m implements Function1 {
        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1677d invoke(t kotlinClass) {
            Intrinsics.checkNotNullParameter(kotlinClass, "kotlinClass");
            return AbstractC1674a.this.E(kotlinClass);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC1674a(xd.n storageManager, r kotlinClassFinder) {
        super(kotlinClassFinder);
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(kotlinClassFinder, "kotlinClassFinder");
        this.f18960c = storageManager.h(new d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C1677d E(t tVar) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        tVar.b(new b(hashMap, tVar, hashMap3, hashMap2), q(tVar));
        return new C1677d(hashMap, hashMap2, hashMap3);
    }

    private final Object G(AbstractC4882A abstractC4882A, C3037n c3037n, EnumC4884b enumC4884b, AbstractC5197E abstractC5197E, Function2 function2) {
        Object invoke;
        t o10 = o(abstractC4882A, AbstractC1675b.f18973b.a(abstractC4882A, true, true, fd.b.f32995B.d(c3037n.X()), hd.i.f(c3037n), u(), t()));
        if (o10 == null) {
            return null;
        }
        w r10 = r(c3037n, abstractC4882A.b(), abstractC4882A.d(), enumC4884b, o10.a().d().d(j.f19009b.a()));
        if (r10 == null || (invoke = function2.invoke(this.f18960c.invoke(o10), r10)) == null) {
            return null;
        }
        return Hc.n.d(abstractC5197E) ? H(invoke) : invoke;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // bd.AbstractC1675b
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public C1677d p(t binaryClass) {
        Intrinsics.checkNotNullParameter(binaryClass, "binaryClass");
        return (C1677d) this.f18960c.invoke(binaryClass);
    }

    protected final boolean D(C3367b annotationClassId, Map arguments) {
        Intrinsics.checkNotNullParameter(annotationClassId, "annotationClassId");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        if (!Intrinsics.b(annotationClassId, Gc.a.f2992a.a())) {
            return false;
        }
        Object obj = arguments.get(id.f.o("value"));
        C3689p c3689p = obj instanceof C3689p ? (C3689p) obj : null;
        if (c3689p == null) {
            return false;
        }
        Object b10 = c3689p.b();
        C3689p.b.C0566b c0566b = b10 instanceof C3689p.b.C0566b ? (C3689p.b.C0566b) b10 : null;
        if (c0566b == null) {
            return false;
        }
        return v(c0566b.b());
    }

    protected abstract Object F(String str, Object obj);

    protected abstract Object H(Object obj);

    @Override // ud.InterfaceC4885c
    public Object a(AbstractC4882A container, C3037n proto, AbstractC5197E expectedType) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(expectedType, "expectedType");
        return G(container, proto, EnumC4884b.PROPERTY_GETTER, expectedType, C0330a.f18961a);
    }

    @Override // ud.InterfaceC4885c
    public Object d(AbstractC4882A container, C3037n proto, AbstractC5197E expectedType) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(expectedType, "expectedType");
        return G(container, proto, EnumC4884b.PROPERTY, expectedType, c.f18971a);
    }
}
