package yd;

import Kc.InterfaceC0936h;
import java.util.Collection;
import java.util.List;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: yd.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5204f extends AbstractC5210l {

    /* renamed from: b, reason: collision with root package name */
    private final xd.i f45508b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f45509c;

    /* renamed from: yd.f$a */
    private final class a implements e0 {

        /* renamed from: a, reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.types.checker.g f45510a;

        /* renamed from: b, reason: collision with root package name */
        private final Lazy f45511b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC5204f f45512c;

        /* renamed from: yd.f$a$a, reason: collision with other inner class name */
        static final class C0668a extends xc.m implements Function0 {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AbstractC5204f f45514b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0668a(AbstractC5204f abstractC5204f) {
                super(0);
                this.f45514b = abstractC5204f;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List invoke() {
                return kotlin.reflect.jvm.internal.impl.types.checker.h.b(a.this.f45510a, this.f45514b.a());
            }
        }

        public a(AbstractC5204f abstractC5204f, kotlin.reflect.jvm.internal.impl.types.checker.g kotlinTypeRefiner) {
            Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
            this.f45512c = abstractC5204f;
            this.f45510a = kotlinTypeRefiner;
            this.f45511b = lc.i.b(lc.l.PUBLICATION, new C0668a(abstractC5204f));
        }

        private final List h() {
            return (List) this.f45511b.getValue();
        }

        @Override // yd.e0
        public e0 b(kotlin.reflect.jvm.internal.impl.types.checker.g kotlinTypeRefiner) {
            Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
            return this.f45512c.b(kotlinTypeRefiner);
        }

        @Override // yd.e0
        public List c() {
            List c10 = this.f45512c.c();
            Intrinsics.checkNotNullExpressionValue(c10, "getParameters(...)");
            return c10;
        }

        @Override // yd.e0
        public InterfaceC0936h d() {
            return this.f45512c.d();
        }

        @Override // yd.e0
        public boolean e() {
            return this.f45512c.e();
        }

        public boolean equals(Object obj) {
            return this.f45512c.equals(obj);
        }

        public int hashCode() {
            return this.f45512c.hashCode();
        }

        @Override // yd.e0
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public List a() {
            return h();
        }

        public String toString() {
            return this.f45512c.toString();
        }

        @Override // yd.e0
        public Hc.g v() {
            Hc.g v10 = this.f45512c.v();
            Intrinsics.checkNotNullExpressionValue(v10, "getBuiltIns(...)");
            return v10;
        }
    }

    /* renamed from: yd.f$b */
    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final Collection f45515a;

        /* renamed from: b, reason: collision with root package name */
        private List f45516b;

        public b(Collection allSupertypes) {
            Intrinsics.checkNotNullParameter(allSupertypes, "allSupertypes");
            this.f45515a = allSupertypes;
            this.f45516b = CollectionsKt.e(kotlin.reflect.jvm.internal.impl.types.error.k.f36726a.l());
        }

        public final Collection a() {
            return this.f45515a;
        }

        public final List b() {
            return this.f45516b;
        }

        public final void c(List list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.f45516b = list;
        }
    }

    /* renamed from: yd.f$c */
    static final class c extends xc.m implements Function0 {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b invoke() {
            return new b(AbstractC5204f.this.l());
        }
    }

    /* renamed from: yd.f$d */
    static final class d extends xc.m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final d f45518a = new d();

        d() {
            super(1);
        }

        public final b a(boolean z10) {
            return new b(CollectionsKt.e(kotlin.reflect.jvm.internal.impl.types.error.k.f36726a.l()));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Boolean) obj).booleanValue());
        }
    }

    /* renamed from: yd.f$e */
    static final class e extends xc.m implements Function1 {

        /* renamed from: yd.f$e$a */
        static final class a extends xc.m implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ AbstractC5204f f45520a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(AbstractC5204f abstractC5204f) {
                super(1);
                this.f45520a = abstractC5204f;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Iterable invoke(e0 it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return this.f45520a.k(it, true);
            }
        }

        /* renamed from: yd.f$e$b */
        static final class b extends xc.m implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ AbstractC5204f f45521a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(AbstractC5204f abstractC5204f) {
                super(1);
                this.f45521a = abstractC5204f;
            }

            public final void a(AbstractC5197E it) {
                Intrinsics.checkNotNullParameter(it, "it");
                this.f45521a.s(it);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((AbstractC5197E) obj);
                return Unit.f36324a;
            }
        }

        /* renamed from: yd.f$e$c */
        static final class c extends xc.m implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ AbstractC5204f f45522a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(AbstractC5204f abstractC5204f) {
                super(1);
                this.f45522a = abstractC5204f;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Iterable invoke(e0 it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return this.f45522a.k(it, false);
            }
        }

        /* renamed from: yd.f$e$d */
        static final class d extends xc.m implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ AbstractC5204f f45523a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(AbstractC5204f abstractC5204f) {
                super(1);
                this.f45523a = abstractC5204f;
            }

            public final void a(AbstractC5197E it) {
                Intrinsics.checkNotNullParameter(it, "it");
                this.f45523a.t(it);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((AbstractC5197E) obj);
                return Unit.f36324a;
            }
        }

        e() {
            super(1);
        }

        public final void a(b supertypes) {
            Intrinsics.checkNotNullParameter(supertypes, "supertypes");
            List a10 = AbstractC5204f.this.p().a(AbstractC5204f.this, supertypes.a(), new c(AbstractC5204f.this), new d(AbstractC5204f.this));
            if (a10.isEmpty()) {
                AbstractC5197E m10 = AbstractC5204f.this.m();
                List e10 = m10 != null ? CollectionsKt.e(m10) : null;
                if (e10 == null) {
                    e10 = CollectionsKt.j();
                }
                a10 = e10;
            }
            if (AbstractC5204f.this.o()) {
                Kc.d0 p10 = AbstractC5204f.this.p();
                AbstractC5204f abstractC5204f = AbstractC5204f.this;
                p10.a(abstractC5204f, a10, new a(abstractC5204f), new b(AbstractC5204f.this));
            }
            AbstractC5204f abstractC5204f2 = AbstractC5204f.this;
            List list = a10 instanceof List ? (List) a10 : null;
            if (list == null) {
                list = CollectionsKt.O0(a10);
            }
            supertypes.c(abstractC5204f2.r(list));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((b) obj);
            return Unit.f36324a;
        }
    }

    public AbstractC5204f(xd.n storageManager) {
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        this.f45508b = storageManager.g(new c(), d.f45518a, new e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Collection k(e0 e0Var, boolean z10) {
        List w02;
        AbstractC5204f abstractC5204f = e0Var instanceof AbstractC5204f ? (AbstractC5204f) e0Var : null;
        if (abstractC5204f != null && (w02 = CollectionsKt.w0(((b) abstractC5204f.f45508b.invoke()).a(), abstractC5204f.n(z10))) != null) {
            return w02;
        }
        Collection a10 = e0Var.a();
        Intrinsics.checkNotNullExpressionValue(a10, "getSupertypes(...)");
        return a10;
    }

    @Override // yd.e0
    public e0 b(kotlin.reflect.jvm.internal.impl.types.checker.g kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new a(this, kotlinTypeRefiner);
    }

    protected abstract Collection l();

    protected abstract AbstractC5197E m();

    protected Collection n(boolean z10) {
        return CollectionsKt.j();
    }

    protected boolean o() {
        return this.f45509c;
    }

    protected abstract Kc.d0 p();

    @Override // yd.e0
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public List a() {
        return ((b) this.f45508b.invoke()).b();
    }

    protected List r(List supertypes) {
        Intrinsics.checkNotNullParameter(supertypes, "supertypes");
        return supertypes;
    }

    protected void s(AbstractC5197E type) {
        Intrinsics.checkNotNullParameter(type, "type");
    }

    protected void t(AbstractC5197E type) {
        Intrinsics.checkNotNullParameter(type, "type");
    }
}
