package u6;

import u8.InterfaceC4873a;
import u8.InterfaceC4874b;
import w8.C5044a;
import x6.C5111a;
import x6.C5112b;
import x6.C5113c;
import x6.C5114d;
import x6.C5115e;

/* renamed from: u6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4871a implements InterfaceC4873a {

    /* renamed from: a, reason: collision with root package name */
    public static final InterfaceC4873a f43496a = new C4871a();

    /* renamed from: u6.a$a, reason: collision with other inner class name */
    private static final class C0621a implements t8.d {

        /* renamed from: a, reason: collision with root package name */
        static final C0621a f43497a = new C0621a();

        /* renamed from: b, reason: collision with root package name */
        private static final t8.c f43498b = t8.c.a("window").b(C5044a.b().c(1).a()).a();

        /* renamed from: c, reason: collision with root package name */
        private static final t8.c f43499c = t8.c.a("logSourceMetrics").b(C5044a.b().c(2).a()).a();

        /* renamed from: d, reason: collision with root package name */
        private static final t8.c f43500d = t8.c.a("globalMetrics").b(C5044a.b().c(3).a()).a();

        /* renamed from: e, reason: collision with root package name */
        private static final t8.c f43501e = t8.c.a("appNamespace").b(C5044a.b().c(4).a()).a();

        private C0621a() {
        }

        @Override // t8.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(C5111a c5111a, t8.e eVar) {
            eVar.a(f43498b, c5111a.d());
            eVar.a(f43499c, c5111a.c());
            eVar.a(f43500d, c5111a.b());
            eVar.a(f43501e, c5111a.a());
        }
    }

    /* renamed from: u6.a$b */
    private static final class b implements t8.d {

        /* renamed from: a, reason: collision with root package name */
        static final b f43502a = new b();

        /* renamed from: b, reason: collision with root package name */
        private static final t8.c f43503b = t8.c.a("storageMetrics").b(C5044a.b().c(1).a()).a();

        private b() {
        }

        @Override // t8.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(C5112b c5112b, t8.e eVar) {
            eVar.a(f43503b, c5112b.a());
        }
    }

    /* renamed from: u6.a$c */
    private static final class c implements t8.d {

        /* renamed from: a, reason: collision with root package name */
        static final c f43504a = new c();

        /* renamed from: b, reason: collision with root package name */
        private static final t8.c f43505b = t8.c.a("eventsDroppedCount").b(C5044a.b().c(1).a()).a();

        /* renamed from: c, reason: collision with root package name */
        private static final t8.c f43506c = t8.c.a("reason").b(C5044a.b().c(3).a()).a();

        private c() {
        }

        @Override // t8.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(C5113c c5113c, t8.e eVar) {
            eVar.b(f43505b, c5113c.a());
            eVar.a(f43506c, c5113c.b());
        }
    }

    /* renamed from: u6.a$d */
    private static final class d implements t8.d {

        /* renamed from: a, reason: collision with root package name */
        static final d f43507a = new d();

        /* renamed from: b, reason: collision with root package name */
        private static final t8.c f43508b = t8.c.a("logSource").b(C5044a.b().c(1).a()).a();

        /* renamed from: c, reason: collision with root package name */
        private static final t8.c f43509c = t8.c.a("logEventDropped").b(C5044a.b().c(2).a()).a();

        private d() {
        }

        @Override // t8.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(C5114d c5114d, t8.e eVar) {
            eVar.a(f43508b, c5114d.b());
            eVar.a(f43509c, c5114d.a());
        }
    }

    /* renamed from: u6.a$e */
    private static final class e implements t8.d {

        /* renamed from: a, reason: collision with root package name */
        static final e f43510a = new e();

        /* renamed from: b, reason: collision with root package name */
        private static final t8.c f43511b = t8.c.d("clientMetrics");

        private e() {
        }

        @Override // t8.d
        public /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
            android.support.v4.media.session.b.a(obj);
            b(null, (t8.e) obj2);
        }

        public void b(l lVar, t8.e eVar) {
            throw null;
        }
    }

    /* renamed from: u6.a$f */
    private static final class f implements t8.d {

        /* renamed from: a, reason: collision with root package name */
        static final f f43512a = new f();

        /* renamed from: b, reason: collision with root package name */
        private static final t8.c f43513b = t8.c.a("currentCacheSizeBytes").b(C5044a.b().c(1).a()).a();

        /* renamed from: c, reason: collision with root package name */
        private static final t8.c f43514c = t8.c.a("maxCacheSizeBytes").b(C5044a.b().c(2).a()).a();

        private f() {
        }

        @Override // t8.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(C5115e c5115e, t8.e eVar) {
            eVar.b(f43513b, c5115e.a());
            eVar.b(f43514c, c5115e.b());
        }
    }

    /* renamed from: u6.a$g */
    private static final class g implements t8.d {

        /* renamed from: a, reason: collision with root package name */
        static final g f43515a = new g();

        /* renamed from: b, reason: collision with root package name */
        private static final t8.c f43516b = t8.c.a("startMs").b(C5044a.b().c(1).a()).a();

        /* renamed from: c, reason: collision with root package name */
        private static final t8.c f43517c = t8.c.a("endMs").b(C5044a.b().c(2).a()).a();

        private g() {
        }

        @Override // t8.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(x6.f fVar, t8.e eVar) {
            eVar.b(f43516b, fVar.b());
            eVar.b(f43517c, fVar.a());
        }
    }

    private C4871a() {
    }

    @Override // u8.InterfaceC4873a
    public void a(InterfaceC4874b interfaceC4874b) {
        interfaceC4874b.a(l.class, e.f43510a);
        interfaceC4874b.a(C5111a.class, C0621a.f43497a);
        interfaceC4874b.a(x6.f.class, g.f43515a);
        interfaceC4874b.a(C5114d.class, d.f43507a);
        interfaceC4874b.a(C5113c.class, c.f43504a);
        interfaceC4874b.a(C5112b.class, b.f43502a);
        interfaceC4874b.a(C5115e.class, f.f43512a);
    }
}
