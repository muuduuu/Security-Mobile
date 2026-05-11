package Pb;

import Db.C0792a;
import Db.C0794c;
import Db.M;
import android.app.Activity;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowInsets;
import androidx.core.view.AbstractC1484a0;
import androidx.core.view.i1;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import q1.AbstractC3901a;
import u5.C4870a;
import wb.f;
import xb.AbstractC5139a;
import xc.C5142C;
import xc.C5146G;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u000b2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"LPb/b;", "Lxb/a;", "<init>", "()V", "Lxb/c;", "b", "()Lxb/c;", "Landroid/app/Activity;", "j", "()Landroid/app/Activity;", "currentActivity", "d", C4870a.f43493a, "expo-navigation-bar_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class b extends AbstractC5139a {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public static final class A extends xc.m implements Function2 {
        public A() {
            super(2);
        }

        public final void a(Object[] objArr, pb.m promise) {
            Intrinsics.checkNotNullParameter(objArr, "<name for destructuring parameter 0>");
            Intrinsics.checkNotNullParameter(promise, "promise");
            Qb.b.f8292a.e(b.this.j(), ((Number) objArr[0]).intValue(), new i(promise), new j(promise));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (pb.m) obj2);
            return Unit.f36324a;
        }
    }

    public static final class B extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final B f7676a = new B();

        public B() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(String.class);
        }
    }

    public static final class C extends xc.m implements Function2 {
        public C() {
            super(2);
        }

        public final void a(Object[] objArr, pb.m promise) {
            Intrinsics.checkNotNullParameter(objArr, "<name for destructuring parameter 0>");
            Intrinsics.checkNotNullParameter(promise, "promise");
            Qb.b.f8292a.f(b.this.j(), (String) objArr[0], new k(promise), new l(promise));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (pb.m) obj2);
            return Unit.f36324a;
        }
    }

    public static final class D extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final D f7678a = new D();

        public D() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(String.class);
        }
    }

    public static final class E extends xc.m implements Function2 {
        public E() {
            super(2);
        }

        public final void a(Object[] objArr, pb.m promise) {
            Intrinsics.checkNotNullParameter(objArr, "<name for destructuring parameter 0>");
            Intrinsics.checkNotNullParameter(promise, "promise");
            Qb.b.f8292a.k(b.this.j(), (String) objArr[0], new m(promise), new n(promise));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (pb.m) obj2);
            return Unit.f36324a;
        }
    }

    public static final class F extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final F f7680a = new F();

        public F() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(String.class);
        }
    }

    /* renamed from: Pb.b$a, reason: case insensitive filesystem and from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(int i10) {
            C5146G c5146g = C5146G.f44966a;
            String format = String.format("#%02x%02x%02x", Arrays.copyOf(new Object[]{Integer.valueOf(Color.red(i10)), Integer.valueOf(Color.green(i10)), Integer.valueOf(Color.blue(i10))}, 3));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            return format;
        }

        private Companion() {
        }
    }

    /* renamed from: Pb.b$b, reason: collision with other inner class name */
    static final class C0149b extends xc.m implements Function0 {

        /* renamed from: Pb.b$b$a */
        static final class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ View f7682a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f7683b;

            /* renamed from: Pb.b$b$a$a, reason: collision with other inner class name */
            static final class ViewOnSystemUiVisibilityChangeListenerC0150a implements View.OnSystemUiVisibilityChangeListener {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ b f7684a;

                ViewOnSystemUiVisibilityChangeListenerC0150a(b bVar) {
                    this.f7684a = bVar;
                }

                @Override // android.view.View.OnSystemUiVisibilityChangeListener
                public final void onSystemUiVisibilityChange(int i10) {
                    String str = (i10 & 2) == 0 ? "visible" : "hidden";
                    b bVar = this.f7684a;
                    Bundle bundle = new Bundle();
                    bundle.putString("visibility", str);
                    bundle.putInt("rawVisibility", i10);
                    Unit unit = Unit.f36324a;
                    bVar.f("ExpoNavigationBar.didChange", bundle);
                }
            }

            a(View view, b bVar) {
                this.f7682a = view;
                this.f7683b = bVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f7682a.setOnSystemUiVisibilityChangeListener(new ViewOnSystemUiVisibilityChangeListenerC0150a(this.f7683b));
            }
        }

        C0149b() {
            super(0);
        }

        public final void a() {
            View decorView = b.this.j().getWindow().getDecorView();
            Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
            decorView.post(new a(decorView, b.this));
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f36324a;
        }
    }

    /* renamed from: Pb.b$c, reason: case insensitive filesystem */
    static final class C1115c extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ pb.m f7685a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1115c(pb.m mVar) {
            super(0);
            this.f7685a = mVar;
        }

        public final void a() {
            this.f7685a.resolve(null);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f36324a;
        }
    }

    /* renamed from: Pb.b$d, reason: case insensitive filesystem */
    static final class C1116d extends xc.m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ pb.m f7686a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1116d(pb.m mVar) {
            super(1);
            this.f7686a = mVar;
        }

        public final void a(String m10) {
            Intrinsics.checkNotNullParameter(m10, "m");
            this.f7686a.h(new a(m10));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((String) obj);
            return Unit.f36324a;
        }
    }

    /* renamed from: Pb.b$e, reason: case insensitive filesystem */
    static final class C1117e extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ pb.m f7687a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1117e(pb.m mVar) {
            super(0);
            this.f7687a = mVar;
        }

        public final void a() {
            this.f7687a.resolve(null);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f36324a;
        }
    }

    /* renamed from: Pb.b$f, reason: case insensitive filesystem */
    static final class C1118f extends xc.m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ pb.m f7688a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1118f(pb.m mVar) {
            super(1);
            this.f7688a = mVar;
        }

        public final void a(String m10) {
            Intrinsics.checkNotNullParameter(m10, "m");
            this.f7688a.h(new a(m10));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((String) obj);
            return Unit.f36324a;
        }
    }

    static final class g extends xc.m implements Function0 {

        static final class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ View f7690a;

            a(View view) {
                this.f7690a = view;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f7690a.setOnSystemUiVisibilityChangeListener(null);
            }
        }

        g() {
            super(0);
        }

        public final void a() {
            View decorView = b.this.j().getWindow().getDecorView();
            Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
            decorView.post(new a(decorView));
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f36324a;
        }
    }

    static final class h extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ pb.m f7691a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(pb.m mVar) {
            super(0);
            this.f7691a = mVar;
        }

        public final void a() {
            this.f7691a.resolve(null);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f36324a;
        }
    }

    static final class i extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ pb.m f7692a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(pb.m mVar) {
            super(0);
            this.f7692a = mVar;
        }

        public final void a() {
            this.f7692a.resolve(null);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f36324a;
        }
    }

    static final class j extends xc.m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ pb.m f7693a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(pb.m mVar) {
            super(1);
            this.f7693a = mVar;
        }

        public final void a(String m10) {
            Intrinsics.checkNotNullParameter(m10, "m");
            this.f7693a.h(new a(m10));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((String) obj);
            return Unit.f36324a;
        }
    }

    static final class k extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ pb.m f7694a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(pb.m mVar) {
            super(0);
            this.f7694a = mVar;
        }

        public final void a() {
            this.f7694a.resolve(null);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f36324a;
        }
    }

    static final class l extends xc.m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ pb.m f7695a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(pb.m mVar) {
            super(1);
            this.f7695a = mVar;
        }

        public final void a(String m10) {
            Intrinsics.checkNotNullParameter(m10, "m");
            this.f7695a.h(new a(m10));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((String) obj);
            return Unit.f36324a;
        }
    }

    static final class m extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ pb.m f7696a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(pb.m mVar) {
            super(0);
            this.f7696a = mVar;
        }

        public final void a() {
            this.f7696a.resolve(null);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f36324a;
        }
    }

    static final class n extends xc.m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ pb.m f7697a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(pb.m mVar) {
            super(1);
            this.f7697a = mVar;
        }

        public final void a(String m10) {
            Intrinsics.checkNotNullParameter(m10, "m");
            this.f7697a.h(new a(m10));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((String) obj);
            return Unit.f36324a;
        }
    }

    public static final class o extends xc.m implements Function1 {
        public o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return b.INSTANCE.a(b.this.j().getWindow().getNavigationBarColor());
        }
    }

    public static final class p extends xc.m implements Function1 {
        public p() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            int navigationBarDividerColor;
            Intrinsics.checkNotNullParameter(it, "it");
            if (Build.VERSION.SDK_INT < 28) {
                throw new a("'getBorderColorAsync' is only available on Android API 28 or higher");
            }
            Companion companion = b.INSTANCE;
            navigationBarDividerColor = b.this.j().getWindow().getNavigationBarDividerColor();
            return companion.a(navigationBarDividerColor);
        }
    }

    public static final class q extends xc.m implements Function1 {
        public q() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new i1(b.this.j().getWindow(), b.this.j().getWindow().getDecorView()).d() ? "dark" : "light";
        }
    }

    public static final class r extends xc.m implements Function1 {
        public r() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            boolean z10;
            int navigationBars;
            Intrinsics.checkNotNullParameter(it, "it");
            if (Build.VERSION.SDK_INT >= 30) {
                WindowInsets rootWindowInsets = b.this.j().getWindow().getDecorView().getRootWindowInsets();
                navigationBars = WindowInsets.Type.navigationBars();
                z10 = rootWindowInsets.isVisible(navigationBars);
            } else {
                z10 = (b.this.j().getWindow().getDecorView().getSystemUiVisibility() & 2) == 0;
            }
            return z10 ? "visible" : "hidden";
        }
    }

    public static final class s extends xc.m implements Function1 {
        public s() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return AbstractC1484a0.x(b.this.j().getWindow().getDecorView()) ? "relative" : "absolute";
        }
    }

    public static final class t extends xc.m implements Function1 {
        public t() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            Intrinsics.checkNotNullParameter(it, "it");
            int b10 = new i1(b.this.j().getWindow(), b.this.j().getWindow().getDecorView()).b();
            return b10 != 1 ? b10 != 2 ? "inset-touch" : "overlay-swipe" : "inset-swipe";
        }
    }

    public static final class u extends xc.m implements Function2 {
        public u() {
            super(2);
        }

        public final void a(Object[] objArr, pb.m promise) {
            Intrinsics.checkNotNullParameter(objArr, "<name for destructuring parameter 0>");
            Intrinsics.checkNotNullParameter(promise, "promise");
            Qb.b.f8292a.i(b.this.j(), (String) objArr[0], new C1115c(promise), new C1116d(promise));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (pb.m) obj2);
            return Unit.f36324a;
        }
    }

    public static final class v extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final v f7705a = new v();

        public v() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(String.class);
        }
    }

    public static final class w extends xc.m implements Function2 {
        public w() {
            super(2);
        }

        public final void a(Object[] objArr, pb.m promise) {
            Intrinsics.checkNotNullParameter(objArr, "<name for destructuring parameter 0>");
            Intrinsics.checkNotNullParameter(promise, "promise");
            Qb.b.f8292a.c(b.this.j(), (String) objArr[0], new C1117e(promise), new C1118f(promise));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (pb.m) obj2);
            return Unit.f36324a;
        }
    }

    public static final class x extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final x f7707a = new x();

        public x() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(Integer.TYPE);
        }
    }

    public static final class y extends xc.m implements Function2 {
        public y() {
            super(2);
        }

        public final void a(Object[] objArr, pb.m promise) {
            Intrinsics.checkNotNullParameter(objArr, "<name for destructuring parameter 0>");
            Intrinsics.checkNotNullParameter(promise, "promise");
            Qb.b.f8292a.a(b.this.j(), ((Number) objArr[0]).intValue(), new h(promise));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (pb.m) obj2);
            return Unit.f36324a;
        }
    }

    public static final class z extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final z f7709a = new z();

        public z() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(Integer.TYPE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Activity j() {
        return a().x();
    }

    @Override // xb.AbstractC5139a
    public xb.c b() {
        AbstractC3901a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            xb.b bVar = new xb.b(this);
            bVar.o("ExpoNavigationBar");
            bVar.d("ExpoNavigationBar.didChange");
            bVar.f(new C0149b());
            bVar.h(new g());
            C0794c c0794c = C0794c.f1454a;
            kotlin.reflect.d b10 = C5142C.b(Integer.class);
            Boolean bool = Boolean.FALSE;
            C0792a c0792a = (C0792a) c0794c.a().get(new Pair(b10, bool));
            if (c0792a == null) {
                c0792a = new C0792a(new M(C5142C.b(Integer.class), false, x.f7707a));
            }
            f fVar = new f("setBackgroundColorAsync", new C0792a[]{c0792a}, new y());
            bVar.k().put("setBackgroundColorAsync", fVar);
            wb.l lVar = wb.l.MAIN;
            fVar.m(lVar);
            C0792a[] c0792aArr = new C0792a[0];
            o oVar = new o();
            Class cls = Integer.TYPE;
            wb.g kVar = Intrinsics.b(String.class, cls) ? new wb.k("getBackgroundColorAsync", c0792aArr, oVar) : Intrinsics.b(String.class, Boolean.TYPE) ? new wb.h("getBackgroundColorAsync", c0792aArr, oVar) : Intrinsics.b(String.class, Double.TYPE) ? new wb.i("getBackgroundColorAsync", c0792aArr, oVar) : Intrinsics.b(String.class, Float.TYPE) ? new wb.j("getBackgroundColorAsync", c0792aArr, oVar) : Intrinsics.b(String.class, String.class) ? new wb.m("getBackgroundColorAsync", c0792aArr, oVar) : new wb.e("getBackgroundColorAsync", c0792aArr, oVar);
            bVar.k().put("getBackgroundColorAsync", kVar);
            kVar.m(lVar);
            C0792a c0792a2 = (C0792a) c0794c.a().get(new Pair(C5142C.b(Integer.class), bool));
            if (c0792a2 == null) {
                c0792a2 = new C0792a(new M(C5142C.b(Integer.class), false, z.f7709a));
            }
            f fVar2 = new f("setBorderColorAsync", new C0792a[]{c0792a2}, new A());
            bVar.k().put("setBorderColorAsync", fVar2);
            fVar2.m(lVar);
            C0792a[] c0792aArr2 = new C0792a[0];
            p pVar = new p();
            wb.g kVar2 = Intrinsics.b(String.class, cls) ? new wb.k("getBorderColorAsync", c0792aArr2, pVar) : Intrinsics.b(String.class, Boolean.TYPE) ? new wb.h("getBorderColorAsync", c0792aArr2, pVar) : Intrinsics.b(String.class, Double.TYPE) ? new wb.i("getBorderColorAsync", c0792aArr2, pVar) : Intrinsics.b(String.class, Float.TYPE) ? new wb.j("getBorderColorAsync", c0792aArr2, pVar) : Intrinsics.b(String.class, String.class) ? new wb.m("getBorderColorAsync", c0792aArr2, pVar) : new wb.e("getBorderColorAsync", c0792aArr2, pVar);
            bVar.k().put("getBorderColorAsync", kVar2);
            kVar2.m(lVar);
            C0792a c0792a3 = (C0792a) c0794c.a().get(new Pair(C5142C.b(String.class), bool));
            if (c0792a3 == null) {
                c0792a3 = new C0792a(new M(C5142C.b(String.class), false, B.f7676a));
            }
            f fVar3 = new f("setButtonStyleAsync", new C0792a[]{c0792a3}, new C());
            bVar.k().put("setButtonStyleAsync", fVar3);
            fVar3.m(lVar);
            C0792a[] c0792aArr3 = new C0792a[0];
            q qVar = new q();
            wb.g kVar3 = Intrinsics.b(String.class, cls) ? new wb.k("getButtonStyleAsync", c0792aArr3, qVar) : Intrinsics.b(String.class, Boolean.TYPE) ? new wb.h("getButtonStyleAsync", c0792aArr3, qVar) : Intrinsics.b(String.class, Double.TYPE) ? new wb.i("getButtonStyleAsync", c0792aArr3, qVar) : Intrinsics.b(String.class, Float.TYPE) ? new wb.j("getButtonStyleAsync", c0792aArr3, qVar) : Intrinsics.b(String.class, String.class) ? new wb.m("getButtonStyleAsync", c0792aArr3, qVar) : new wb.e("getButtonStyleAsync", c0792aArr3, qVar);
            bVar.k().put("getButtonStyleAsync", kVar3);
            kVar3.m(lVar);
            C0792a c0792a4 = (C0792a) c0794c.a().get(new Pair(C5142C.b(String.class), bool));
            if (c0792a4 == null) {
                c0792a4 = new C0792a(new M(C5142C.b(String.class), false, D.f7678a));
            }
            f fVar4 = new f("setVisibilityAsync", new C0792a[]{c0792a4}, new E());
            bVar.k().put("setVisibilityAsync", fVar4);
            fVar4.m(lVar);
            C0792a[] c0792aArr4 = new C0792a[0];
            r rVar = new r();
            wb.g kVar4 = Intrinsics.b(String.class, cls) ? new wb.k("getVisibilityAsync", c0792aArr4, rVar) : Intrinsics.b(String.class, Boolean.TYPE) ? new wb.h("getVisibilityAsync", c0792aArr4, rVar) : Intrinsics.b(String.class, Double.TYPE) ? new wb.i("getVisibilityAsync", c0792aArr4, rVar) : Intrinsics.b(String.class, Float.TYPE) ? new wb.j("getVisibilityAsync", c0792aArr4, rVar) : Intrinsics.b(String.class, String.class) ? new wb.m("getVisibilityAsync", c0792aArr4, rVar) : new wb.e("getVisibilityAsync", c0792aArr4, rVar);
            bVar.k().put("getVisibilityAsync", kVar4);
            kVar4.m(lVar);
            C0792a c0792a5 = (C0792a) c0794c.a().get(new Pair(C5142C.b(String.class), bool));
            if (c0792a5 == null) {
                c0792a5 = new C0792a(new M(C5142C.b(String.class), false, F.f7680a));
            }
            f fVar5 = new f("setPositionAsync", new C0792a[]{c0792a5}, new u());
            bVar.k().put("setPositionAsync", fVar5);
            fVar5.m(lVar);
            C0792a[] c0792aArr5 = new C0792a[0];
            s sVar = new s();
            wb.g kVar5 = Intrinsics.b(String.class, cls) ? new wb.k("unstable_getPositionAsync", c0792aArr5, sVar) : Intrinsics.b(String.class, Boolean.TYPE) ? new wb.h("unstable_getPositionAsync", c0792aArr5, sVar) : Intrinsics.b(String.class, Double.TYPE) ? new wb.i("unstable_getPositionAsync", c0792aArr5, sVar) : Intrinsics.b(String.class, Float.TYPE) ? new wb.j("unstable_getPositionAsync", c0792aArr5, sVar) : Intrinsics.b(String.class, String.class) ? new wb.m("unstable_getPositionAsync", c0792aArr5, sVar) : new wb.e("unstable_getPositionAsync", c0792aArr5, sVar);
            bVar.k().put("unstable_getPositionAsync", kVar5);
            kVar5.m(lVar);
            C0792a c0792a6 = (C0792a) c0794c.a().get(new Pair(C5142C.b(String.class), bool));
            if (c0792a6 == null) {
                c0792a6 = new C0792a(new M(C5142C.b(String.class), false, v.f7705a));
            }
            f fVar6 = new f("setBehaviorAsync", new C0792a[]{c0792a6}, new w());
            bVar.k().put("setBehaviorAsync", fVar6);
            fVar6.m(lVar);
            C0792a[] c0792aArr6 = new C0792a[0];
            t tVar = new t();
            wb.g kVar6 = Intrinsics.b(String.class, cls) ? new wb.k("getBehaviorAsync", c0792aArr6, tVar) : Intrinsics.b(String.class, Boolean.TYPE) ? new wb.h("getBehaviorAsync", c0792aArr6, tVar) : Intrinsics.b(String.class, Double.TYPE) ? new wb.i("getBehaviorAsync", c0792aArr6, tVar) : Intrinsics.b(String.class, Float.TYPE) ? new wb.j("getBehaviorAsync", c0792aArr6, tVar) : Intrinsics.b(String.class, String.class) ? new wb.m("getBehaviorAsync", c0792aArr6, tVar) : new wb.e("getBehaviorAsync", c0792aArr6, tVar);
            bVar.k().put("getBehaviorAsync", kVar6);
            kVar6.m(lVar);
            xb.c q10 = bVar.q();
            AbstractC3901a.f();
            return q10;
        } catch (Throwable th) {
            AbstractC3901a.f();
            throw th;
        }
    }
}
