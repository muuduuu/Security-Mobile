package Kb;

import Db.C0792a;
import Db.C0794c;
import Db.M;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.o;
import q1.AbstractC3901a;
import xb.AbstractC5139a;
import xc.C5142C;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LKb/a;", "Lxb/a;", "<init>", "()V", "Lxb/c;", "b", "()Lxb/c;", "expo-linear-gradient_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class a extends AbstractC5139a {

    /* renamed from: Kb.a$a, reason: collision with other inner class name */
    static final class C0106a extends xc.m implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        public static final C0106a f5508a = new C0106a();

        C0106a() {
            super(2);
        }

        public final void a(Kb.b view, int[] colors) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(colors, "colors");
            view.setColors(colors);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Kb.b) obj, (int[]) obj2);
            return Unit.f36324a;
        }
    }

    static final class b extends xc.m implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f5509a = new b();

        b() {
            super(2);
        }

        public final void a(Kb.b view, float[] fArr) {
            Intrinsics.checkNotNullParameter(view, "view");
            if (fArr != null) {
                view.setLocations(fArr);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Kb.b) obj, (float[]) obj2);
            return Unit.f36324a;
        }
    }

    static final class c extends xc.m implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        public static final c f5510a = new c();

        c() {
            super(2);
        }

        public final void a(Kb.b view, Pair pair) {
            Intrinsics.checkNotNullParameter(view, "view");
            view.c(pair != null ? ((Number) pair.c()).floatValue() : 0.5f, pair != null ? ((Number) pair.d()).floatValue() : 0.0f);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Kb.b) obj, (Pair) obj2);
            return Unit.f36324a;
        }
    }

    static final class d extends xc.m implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        public static final d f5511a = new d();

        d() {
            super(2);
        }

        public final void a(Kb.b view, Pair pair) {
            Intrinsics.checkNotNullParameter(view, "view");
            view.b(pair != null ? ((Number) pair.c()).floatValue() : 0.5f, pair != null ? ((Number) pair.d()).floatValue() : 1.0f);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Kb.b) obj, (Pair) obj2);
            return Unit.f36324a;
        }
    }

    static final class e extends xc.m implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        public static final e f5512a = new e();

        e() {
            super(2);
        }

        public final void a(Kb.b view, float[] fArr) {
            Intrinsics.checkNotNullParameter(view, "view");
            if (fArr == null) {
                float[] fArr2 = new float[8];
                for (int i10 = 0; i10 < 8; i10++) {
                    fArr2[i10] = 0.0f;
                }
                fArr = fArr2;
            }
            view.setBorderRadii(fArr);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Kb.b) obj, (float[]) obj2);
            return Unit.f36324a;
        }
    }

    static final class f extends xc.m implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        public static final f f5513a = new f();

        f() {
            super(2);
        }

        public final void a(Kb.b view, Boolean bool) {
            Intrinsics.checkNotNullParameter(view, "view");
            view.setDither(bool != null ? bool.booleanValue() : true);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Kb.b) obj, (Boolean) obj2);
            return Unit.f36324a;
        }
    }

    public static final class g extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final g f5514a = new g();

        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o invoke() {
            return C5142C.o(Kb.b.class);
        }
    }

    public static final class h extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final h f5515a = new h();

        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o invoke() {
            return C5142C.o(int[].class);
        }
    }

    public static final class i extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final i f5516a = new i();

        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o invoke() {
            return C5142C.f(float[].class);
        }
    }

    public static final class j extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final j f5517a = new j();

        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o invoke() {
            KTypeProjection.Companion companion = KTypeProjection.INSTANCE;
            Class cls = Float.TYPE;
            return C5142C.h(Pair.class, companion.d(C5142C.o(cls)), companion.d(C5142C.o(cls)));
        }
    }

    public static final class k extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final k f5518a = new k();

        public k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o invoke() {
            KTypeProjection.Companion companion = KTypeProjection.INSTANCE;
            Class cls = Float.TYPE;
            return C5142C.h(Pair.class, companion.d(C5142C.o(cls)), companion.d(C5142C.o(cls)));
        }
    }

    public static final class l extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final l f5519a = new l();

        public l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o invoke() {
            return C5142C.f(float[].class);
        }
    }

    public static final class m extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final m f5520a = new m();

        public m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o invoke() {
            return C5142C.f(Boolean.class);
        }
    }

    @Override // xb.AbstractC5139a
    public xb.c b() {
        AbstractC3901a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            xb.b bVar = new xb.b(this);
            bVar.o("ExpoLinearGradient");
            kotlin.reflect.d b10 = C5142C.b(Kb.b.class);
            if (bVar.t() != null) {
                throw new IllegalArgumentException("The module definition may have exported only one view manager.");
            }
            expo.modules.kotlin.views.m mVar = new expo.modules.kotlin.views.m(b10, new M(C5142C.b(Kb.b.class), false, g.f5514a, 2, null));
            Jb.b.g(mVar);
            C0106a c0106a = C0106a.f5508a;
            Map g10 = mVar.g();
            C0794c c0794c = C0794c.f1454a;
            C0792a c0792a = (C0792a) c0794c.a().get(new Pair(C5142C.b(int[].class), Boolean.FALSE));
            if (c0792a == null) {
                c0792a = new C0792a(new M(C5142C.b(int[].class), false, h.f5515a));
            }
            g10.put("colors", new expo.modules.kotlin.views.c("colors", c0792a, c0106a));
            b bVar2 = b.f5509a;
            Map g11 = mVar.g();
            kotlin.reflect.d b11 = C5142C.b(float[].class);
            Boolean bool = Boolean.TRUE;
            C0792a c0792a2 = (C0792a) c0794c.a().get(new Pair(b11, bool));
            if (c0792a2 == null) {
                c0792a2 = new C0792a(new M(C5142C.b(float[].class), true, i.f5516a));
            }
            g11.put("locations", new expo.modules.kotlin.views.c("locations", c0792a2, bVar2));
            c cVar = c.f5510a;
            Map g12 = mVar.g();
            C0792a c0792a3 = (C0792a) c0794c.a().get(new Pair(C5142C.b(Pair.class), bool));
            if (c0792a3 == null) {
                c0792a3 = new C0792a(new M(C5142C.b(Pair.class), true, j.f5517a));
            }
            g12.put("startPoint", new expo.modules.kotlin.views.c("startPoint", c0792a3, cVar));
            d dVar = d.f5511a;
            Map g13 = mVar.g();
            C0792a c0792a4 = (C0792a) c0794c.a().get(new Pair(C5142C.b(Pair.class), bool));
            if (c0792a4 == null) {
                c0792a4 = new C0792a(new M(C5142C.b(Pair.class), true, k.f5518a));
            }
            g13.put("endPoint", new expo.modules.kotlin.views.c("endPoint", c0792a4, dVar));
            e eVar = e.f5512a;
            Map g14 = mVar.g();
            C0792a c0792a5 = (C0792a) c0794c.a().get(new Pair(C5142C.b(float[].class), bool));
            if (c0792a5 == null) {
                c0792a5 = new C0792a(new M(C5142C.b(float[].class), true, l.f5519a));
            }
            g14.put("borderRadii", new expo.modules.kotlin.views.c("borderRadii", c0792a5, eVar));
            f fVar = f.f5513a;
            Map g15 = mVar.g();
            C0792a c0792a6 = (C0792a) c0794c.a().get(new Pair(C5142C.b(Boolean.class), bool));
            if (c0792a6 == null) {
                c0792a6 = new C0792a(new M(C5142C.b(Boolean.class), true, m.f5520a));
            }
            g15.put("dither", new expo.modules.kotlin.views.c("dither", c0792a6, fVar));
            bVar.u(mVar.d());
            xb.c q10 = bVar.q();
            AbstractC3901a.f();
            return q10;
        } catch (Throwable th) {
            AbstractC3901a.f();
            throw th;
        }
    }
}
