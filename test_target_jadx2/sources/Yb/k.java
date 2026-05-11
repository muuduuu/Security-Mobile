package Yb;

import Db.C0792a;
import Db.C0794c;
import Db.M;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.browser.customtabs.d;
import expo.modules.webbrowser.OpenBrowserOptions;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lc.t;
import org.conscrypt.BuildConfig;
import q1.AbstractC3901a;
import vb.C5006a;
import vb.EnumC5010e;
import xb.AbstractC5139a;
import xc.C5142C;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0017\u001a\u00020\u00108\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u001f\u001a\u00020\u00188\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"LYb/k;", "Lxb/a;", "<init>", "()V", "Lexpo/modules/webbrowser/OpenBrowserOptions;", "options", "Landroid/content/Intent;", "k", "(Lexpo/modules/webbrowser/OpenBrowserOptions;)Landroid/content/Intent;", BuildConfig.FLAVOR, "packageName", "n", "(Ljava/lang/String;)Ljava/lang/String;", "Lxb/c;", "b", "()Lxb/c;", "LYb/a;", "d", "LYb/a;", "m", "()LYb/a;", "p", "(LYb/a;)V", "customTabsResolver", "LYb/f;", "e", "LYb/f;", "l", "()LYb/f;", "o", "(LYb/f;)V", "connectionHelper", "expo-web-browser_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class k extends AbstractC5139a {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public Yb.a customTabsResolver;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public Yb.f connectionHelper;

    public static final class a extends xc.m implements Function1 {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            Intrinsics.checkNotNullParameter(it, "it");
            ArrayList<String> c10 = k.this.m().c();
            ArrayList<String> d10 = k.this.m().d();
            String g10 = k.this.m().g(c10);
            String e10 = k.this.m().e();
            if (!CollectionsKt.V(c10, e10)) {
                e10 = null;
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("browserPackages", c10);
            bundle.putStringArrayList("servicePackages", d10);
            bundle.putString("preferredBrowserPackage", g10);
            bundle.putString("defaultBrowserPackage", e10);
            return bundle;
        }
    }

    public static final class b extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f12180a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(String.class);
        }
    }

    public static final class c extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final c f12181a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(OpenBrowserOptions.class);
        }
    }

    public static final class d extends xc.m implements Function1 {
        public d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            Intrinsics.checkNotNullParameter(objArr, "<name for destructuring parameter 0>");
            Object obj = objArr[0];
            Intent k10 = k.this.k((OpenBrowserOptions) objArr[1]);
            k10.setData(Uri.parse((String) obj));
            if (!k.this.m().a(k10)) {
                throw new Yb.h();
            }
            k.this.m().i(k10);
            return androidx.core.os.c.b(t.a("type", "opened"));
        }
    }

    public static final class e extends xc.m implements Function2 {
        public e() {
            super(2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(Object[] objArr, pb.m promise) {
            Intrinsics.checkNotNullParameter(objArr, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(promise, "promise");
            String n10 = k.this.n((String) promise);
            k.this.l().o(n10);
            androidx.core.os.c.b(t.a("servicePackage", n10));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (pb.m) obj2);
            return Unit.f36324a;
        }
    }

    public static final class f extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final f f12184a = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.f(String.class);
        }
    }

    public static final class g extends xc.m implements Function1 {
        public g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            Intrinsics.checkNotNullParameter(objArr, "<name for destructuring parameter 0>");
            String n10 = k.this.n((String) objArr[0]);
            k.this.l().o(n10);
            return androidx.core.os.c.b(t.a("servicePackage", n10));
        }
    }

    public static final class h extends xc.m implements Function2 {
        public h() {
            super(2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(Object[] objArr, pb.m promise) {
            Intrinsics.checkNotNullParameter(objArr, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(promise, "promise");
            String n10 = k.this.n((String) promise);
            if (k.this.l().g(n10)) {
                androidx.core.os.c.b(t.a("servicePackage", n10));
            } else {
                new Bundle();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (pb.m) obj2);
            return Unit.f36324a;
        }
    }

    public static final class i extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final i f12187a = new i();

        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.f(String.class);
        }
    }

    public static final class j extends xc.m implements Function1 {
        public j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            Intrinsics.checkNotNullParameter(objArr, "<name for destructuring parameter 0>");
            String n10 = k.this.n((String) objArr[0]);
            return k.this.l().g(n10) ? androidx.core.os.c.b(t.a("servicePackage", n10)) : new Bundle();
        }
    }

    /* renamed from: Yb.k$k, reason: collision with other inner class name */
    public static final class C0225k extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final C0225k f12189a = new C0225k();

        public C0225k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(String.class);
        }
    }

    public static final class l extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final l f12190a = new l();

        public l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.f(String.class);
        }
    }

    public static final class m extends xc.m implements Function1 {
        public m() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            Intrinsics.checkNotNullParameter(objArr, "<name for destructuring parameter 0>");
            Object obj = objArr[0];
            String n10 = k.this.n((String) objArr[1]);
            Yb.f l10 = k.this.l();
            Uri parse = Uri.parse((String) obj);
            Intrinsics.checkNotNullExpressionValue(parse, "parse(...)");
            l10.m(n10, parse);
            return androidx.core.os.c.b(t.a("servicePackage", n10));
        }
    }

    public static final class n extends xc.m implements Function0 {
        public n() {
            super(0);
        }

        public final void a() {
            k.this.l().h();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f36324a;
        }
    }

    public static final class o extends xc.m implements Function0 {
        public o() {
            super(0);
        }

        public final void a() {
            k kVar = k.this;
            kVar.p(new Yb.a(kVar.a().f()));
            k kVar2 = k.this;
            Context w10 = kVar2.a().w();
            if (w10 == null) {
                throw new IllegalArgumentException("Cannot initialize WebBrowser, ReactContext is null");
            }
            kVar2.o(new Yb.f(w10));
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f36324a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Intent k(OpenBrowserOptions options) {
        d.b bVar = new d.b();
        Integer toolbarColor = options.getToolbarColor();
        if (toolbarColor != null) {
            bVar.h(toolbarColor.intValue());
        }
        Integer secondaryToolbarColor = options.getSecondaryToolbarColor();
        if (secondaryToolbarColor != null) {
            bVar.d(secondaryToolbarColor.intValue());
        }
        bVar.g(options.getShowTitle());
        if (options.getEnableDefaultShareMenuItem()) {
            bVar.a();
        }
        Intent intent = bVar.b().f14291a;
        Intrinsics.checkNotNullExpressionValue(intent, "intent");
        intent.putExtra("android.support.customtabs.extra.ENABLE_URLBAR_HIDING", options.getEnableBarCollapsing());
        String browserPackage = options.getBrowserPackage();
        if (!TextUtils.isEmpty(browserPackage)) {
            intent.setPackage(browserPackage);
        }
        if (options.getShouldCreateTask()) {
            intent.addFlags(268435456);
            if (!options.getShowInRecents()) {
                intent.addFlags(8388608);
                intent.addFlags(1073741824);
            }
        }
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:5:0x000d A[Catch: j -> 0x0016, c -> 0x001c, TRY_LEAVE, TryCatch #2 {c -> 0x001c, j -> 0x0016, blocks: (B:21:0x0003, B:5:0x000d), top: B:20:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String n(String packageName) {
        if (packageName != null) {
            try {
                if (packageName.length() > 0) {
                    if (packageName == null) {
                        packageName = m().g(null);
                    }
                    if (packageName != null) {
                        String str = packageName.length() > 0 ? packageName : null;
                        if (str != null) {
                            return str;
                        }
                    }
                    throw new Yb.i();
                }
            } catch (Da.c unused) {
                throw new Yb.i();
            } catch (Yb.j unused2) {
                throw new Yb.i();
            }
        }
        packageName = null;
        if (packageName == null) {
        }
        if (packageName != null) {
        }
        throw new Yb.i();
    }

    @Override // xb.AbstractC5139a
    public xb.c b() {
        wb.g kVar;
        wb.g kVar2;
        AbstractC3901a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            xb.b bVar = new xb.b(this);
            bVar.o("ExpoWebBrowser");
            Map s10 = bVar.s();
            EnumC5010e enumC5010e = EnumC5010e.MODULE_CREATE;
            s10.put(enumC5010e, new C5006a(enumC5010e, new o()));
            Map s11 = bVar.s();
            EnumC5010e enumC5010e2 = EnumC5010e.ACTIVITY_DESTROYS;
            s11.put(enumC5010e2, new C5006a(enumC5010e2, new n()));
            if (Intrinsics.b(String.class, pb.m.class)) {
                kVar = new wb.f("warmUpAsync", new C0792a[0], new e());
            } else {
                C0792a c0792a = (C0792a) C0794c.f1454a.a().get(new Pair(C5142C.b(String.class), Boolean.TRUE));
                if (c0792a == null) {
                    c0792a = new C0792a(new M(C5142C.b(String.class), true, f.f12184a));
                }
                C0792a[] c0792aArr = {c0792a};
                g gVar = new g();
                kVar = Intrinsics.b(Bundle.class, Integer.TYPE) ? new wb.k("warmUpAsync", c0792aArr, gVar) : Intrinsics.b(Bundle.class, Boolean.TYPE) ? new wb.h("warmUpAsync", c0792aArr, gVar) : Intrinsics.b(Bundle.class, Double.TYPE) ? new wb.i("warmUpAsync", c0792aArr, gVar) : Intrinsics.b(Bundle.class, Float.TYPE) ? new wb.j("warmUpAsync", c0792aArr, gVar) : Intrinsics.b(Bundle.class, String.class) ? new wb.m("warmUpAsync", c0792aArr, gVar) : new wb.e("warmUpAsync", c0792aArr, gVar);
            }
            bVar.k().put("warmUpAsync", kVar);
            if (Intrinsics.b(String.class, pb.m.class)) {
                kVar2 = new wb.f("coolDownAsync", new C0792a[0], new h());
            } else {
                C0792a c0792a2 = (C0792a) C0794c.f1454a.a().get(new Pair(C5142C.b(String.class), Boolean.TRUE));
                if (c0792a2 == null) {
                    c0792a2 = new C0792a(new M(C5142C.b(String.class), true, i.f12187a));
                }
                C0792a[] c0792aArr2 = {c0792a2};
                j jVar = new j();
                kVar2 = Intrinsics.b(Bundle.class, Integer.TYPE) ? new wb.k("coolDownAsync", c0792aArr2, jVar) : Intrinsics.b(Bundle.class, Boolean.TYPE) ? new wb.h("coolDownAsync", c0792aArr2, jVar) : Intrinsics.b(Bundle.class, Double.TYPE) ? new wb.i("coolDownAsync", c0792aArr2, jVar) : Intrinsics.b(Bundle.class, Float.TYPE) ? new wb.j("coolDownAsync", c0792aArr2, jVar) : Intrinsics.b(Bundle.class, String.class) ? new wb.m("coolDownAsync", c0792aArr2, jVar) : new wb.e("coolDownAsync", c0792aArr2, jVar);
            }
            bVar.k().put("coolDownAsync", kVar2);
            C0794c c0794c = C0794c.f1454a;
            kotlin.reflect.d b10 = C5142C.b(String.class);
            Boolean bool = Boolean.FALSE;
            C0792a c0792a3 = (C0792a) c0794c.a().get(new Pair(b10, bool));
            if (c0792a3 == null) {
                c0792a3 = new C0792a(new M(C5142C.b(String.class), false, C0225k.f12189a));
            }
            C0792a c0792a4 = (C0792a) c0794c.a().get(new Pair(C5142C.b(String.class), Boolean.TRUE));
            if (c0792a4 == null) {
                c0792a4 = new C0792a(new M(C5142C.b(String.class), true, l.f12190a));
            }
            C0792a[] c0792aArr3 = {c0792a3, c0792a4};
            m mVar = new m();
            Class cls = Integer.TYPE;
            bVar.k().put("mayInitWithUrlAsync", Intrinsics.b(Bundle.class, cls) ? new wb.k("mayInitWithUrlAsync", c0792aArr3, mVar) : Intrinsics.b(Bundle.class, Boolean.TYPE) ? new wb.h("mayInitWithUrlAsync", c0792aArr3, mVar) : Intrinsics.b(Bundle.class, Double.TYPE) ? new wb.i("mayInitWithUrlAsync", c0792aArr3, mVar) : Intrinsics.b(Bundle.class, Float.TYPE) ? new wb.j("mayInitWithUrlAsync", c0792aArr3, mVar) : Intrinsics.b(Bundle.class, String.class) ? new wb.m("mayInitWithUrlAsync", c0792aArr3, mVar) : new wb.e("mayInitWithUrlAsync", c0792aArr3, mVar));
            C0792a[] c0792aArr4 = new C0792a[0];
            a aVar = new a();
            bVar.k().put("getCustomTabsSupportingBrowsersAsync", Intrinsics.b(Bundle.class, cls) ? new wb.k("getCustomTabsSupportingBrowsersAsync", c0792aArr4, aVar) : Intrinsics.b(Bundle.class, Boolean.TYPE) ? new wb.h("getCustomTabsSupportingBrowsersAsync", c0792aArr4, aVar) : Intrinsics.b(Bundle.class, Double.TYPE) ? new wb.i("getCustomTabsSupportingBrowsersAsync", c0792aArr4, aVar) : Intrinsics.b(Bundle.class, Float.TYPE) ? new wb.j("getCustomTabsSupportingBrowsersAsync", c0792aArr4, aVar) : Intrinsics.b(Bundle.class, String.class) ? new wb.m("getCustomTabsSupportingBrowsersAsync", c0792aArr4, aVar) : new wb.e("getCustomTabsSupportingBrowsersAsync", c0792aArr4, aVar));
            C0792a c0792a5 = (C0792a) c0794c.a().get(new Pair(C5142C.b(String.class), bool));
            if (c0792a5 == null) {
                c0792a5 = new C0792a(new M(C5142C.b(String.class), false, b.f12180a));
            }
            C0792a c0792a6 = (C0792a) c0794c.a().get(new Pair(C5142C.b(OpenBrowserOptions.class), bool));
            if (c0792a6 == null) {
                c0792a6 = new C0792a(new M(C5142C.b(OpenBrowserOptions.class), false, c.f12181a));
            }
            C0792a[] c0792aArr5 = {c0792a5, c0792a6};
            d dVar = new d();
            bVar.k().put("openBrowserAsync", Intrinsics.b(Bundle.class, cls) ? new wb.k("openBrowserAsync", c0792aArr5, dVar) : Intrinsics.b(Bundle.class, Boolean.TYPE) ? new wb.h("openBrowserAsync", c0792aArr5, dVar) : Intrinsics.b(Bundle.class, Double.TYPE) ? new wb.i("openBrowserAsync", c0792aArr5, dVar) : Intrinsics.b(Bundle.class, Float.TYPE) ? new wb.j("openBrowserAsync", c0792aArr5, dVar) : Intrinsics.b(Bundle.class, String.class) ? new wb.m("openBrowserAsync", c0792aArr5, dVar) : new wb.e("openBrowserAsync", c0792aArr5, dVar));
            xb.c q10 = bVar.q();
            AbstractC3901a.f();
            return q10;
        } catch (Throwable th) {
            AbstractC3901a.f();
            throw th;
        }
    }

    public final Yb.f l() {
        Yb.f fVar = this.connectionHelper;
        if (fVar != null) {
            return fVar;
        }
        Intrinsics.v("connectionHelper");
        return null;
    }

    public final Yb.a m() {
        Yb.a aVar = this.customTabsResolver;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.v("customTabsResolver");
        return null;
    }

    public final void o(Yb.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<set-?>");
        this.connectionHelper = fVar;
    }

    public final void p(Yb.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.customTabsResolver = aVar;
    }
}
