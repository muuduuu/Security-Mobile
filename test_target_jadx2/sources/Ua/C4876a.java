package ua;

import Db.C0792a;
import Db.C0794c;
import Db.M;
import android.view.View;
import expo.modules.blur.enums.BlurMethod;
import expo.modules.blur.enums.TintStyle;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.o;
import q1.AbstractC3901a;
import xb.AbstractC5139a;
import xc.C5142C;
import xc.m;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lua/a;", "Lxb/a;", "<init>", "()V", "Lxb/c;", "b", "()Lxb/c;", "expo-blur_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ua.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4876a extends AbstractC5139a {

    /* renamed from: ua.a$a, reason: collision with other inner class name */
    static final class C0624a extends m implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        public static final C0624a f43588a = new C0624a();

        C0624a() {
            super(2);
        }

        public final void a(C4877b view, float f10) {
            Intrinsics.checkNotNullParameter(view, "view");
            view.setBlurRadius(f10);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4877b) obj, ((Number) obj2).floatValue());
            return Unit.f36324a;
        }
    }

    /* renamed from: ua.a$b */
    static final class b extends m implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f43589a = new b();

        b() {
            super(2);
        }

        public final void a(C4877b view, TintStyle tint) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(tint, "tint");
            view.setTint$expo_blur_release(tint);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4877b) obj, (TintStyle) obj2);
            return Unit.f36324a;
        }
    }

    /* renamed from: ua.a$c */
    static final class c extends m implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        public static final c f43590a = new c();

        c() {
            super(2);
        }

        public final void a(C4877b view, float f10) {
            Intrinsics.checkNotNullParameter(view, "view");
            view.d(f10);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4877b) obj, ((Number) obj2).floatValue());
            return Unit.f36324a;
        }
    }

    /* renamed from: ua.a$d */
    static final class d extends m implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        public static final d f43591a = new d();

        d() {
            super(2);
        }

        public final void a(C4877b view, BlurMethod experimentalBlurMethod) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(experimentalBlurMethod, "experimentalBlurMethod");
            view.setBlurMethod(experimentalBlurMethod);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4877b) obj, (BlurMethod) obj2);
            return Unit.f36324a;
        }
    }

    /* renamed from: ua.a$e */
    public static final class e extends m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final e f43592a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o invoke() {
            return C5142C.o(C4877b.class);
        }
    }

    /* renamed from: ua.a$f */
    public static final class f extends m implements Function1 {
        public f() {
            super(1);
        }

        public final void a(View it) {
            Intrinsics.checkNotNullParameter(it, "it");
            ((C4877b) it).f();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((View) obj);
            return Unit.f36324a;
        }
    }

    /* renamed from: ua.a$g */
    public static final class g extends m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final g f43593a = new g();

        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o invoke() {
            return C5142C.o(Float.TYPE);
        }
    }

    /* renamed from: ua.a$h */
    public static final class h extends m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final h f43594a = new h();

        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o invoke() {
            return C5142C.o(TintStyle.class);
        }
    }

    /* renamed from: ua.a$i */
    public static final class i extends m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final i f43595a = new i();

        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o invoke() {
            return C5142C.o(Float.TYPE);
        }
    }

    /* renamed from: ua.a$j */
    public static final class j extends m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final j f43596a = new j();

        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o invoke() {
            return C5142C.o(BlurMethod.class);
        }
    }

    @Override // xb.AbstractC5139a
    public xb.c b() {
        AbstractC3901a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            xb.b bVar = new xb.b(this);
            bVar.o("ExpoBlurView");
            kotlin.reflect.d b10 = C5142C.b(C4877b.class);
            if (bVar.t() != null) {
                throw new IllegalArgumentException("The module definition may have exported only one view manager.");
            }
            expo.modules.kotlin.views.m mVar = new expo.modules.kotlin.views.m(b10, new M(C5142C.b(C4877b.class), false, e.f43592a, 2, null));
            Jb.b.g(mVar);
            C0624a c0624a = C0624a.f43588a;
            Map g10 = mVar.g();
            C0794c c0794c = C0794c.f1454a;
            kotlin.reflect.d b11 = C5142C.b(Float.class);
            Boolean bool = Boolean.FALSE;
            C0792a c0792a = (C0792a) c0794c.a().get(new Pair(b11, bool));
            if (c0792a == null) {
                c0792a = new C0792a(new M(C5142C.b(Float.class), false, g.f43593a));
            }
            g10.put("intensity", new expo.modules.kotlin.views.c("intensity", c0792a, c0624a));
            b bVar2 = b.f43589a;
            Map g11 = mVar.g();
            C0792a c0792a2 = (C0792a) c0794c.a().get(new Pair(C5142C.b(TintStyle.class), bool));
            if (c0792a2 == null) {
                c0792a2 = new C0792a(new M(C5142C.b(TintStyle.class), false, h.f43594a));
            }
            g11.put("tint", new expo.modules.kotlin.views.c("tint", c0792a2, bVar2));
            c cVar = c.f43590a;
            Map g12 = mVar.g();
            C0792a c0792a3 = (C0792a) c0794c.a().get(new Pair(C5142C.b(Float.class), bool));
            if (c0792a3 == null) {
                c0792a3 = new C0792a(new M(C5142C.b(Float.class), false, i.f43595a));
            }
            g12.put("blurReductionFactor", new expo.modules.kotlin.views.c("blurReductionFactor", c0792a3, cVar));
            d dVar = d.f43591a;
            Map g13 = mVar.g();
            C0792a c0792a4 = (C0792a) c0794c.a().get(new Pair(C5142C.b(BlurMethod.class), bool));
            if (c0792a4 == null) {
                c0792a4 = new C0792a(new M(C5142C.b(BlurMethod.class), false, j.f43596a));
            }
            g13.put("experimentalBlurMethod", new expo.modules.kotlin.views.c("experimentalBlurMethod", c0792a4, dVar));
            mVar.k(new f());
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
