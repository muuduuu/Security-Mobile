package La;

import Db.C0792a;
import Db.C0794c;
import Db.M;
import Ka.a;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import expo.modules.kotlin.exception.UnexpectedException;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lc.t;
import oa.InterfaceC3771b;
import q1.AbstractC3901a;
import xb.AbstractC5139a;
import xc.C5142C;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"LLa/a;", "Lxb/a;", "<init>", "()V", "Lxb/c;", "b", "()Lxb/c;", "Landroid/content/Context;", "j", "()Landroid/content/Context;", "context", "expo-dev-menu_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class a extends AbstractC5139a {

    /* renamed from: La.a$a, reason: collision with other inner class name */
    public static final class C0111a extends xc.m implements Function1 {
        public C0111a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            Intrinsics.checkNotNullParameter(objArr, "<name for destructuring parameter 0>");
            String str = (String) objArr[0];
            Object systemService = a.this.j().getSystemService("clipboard");
            Intrinsics.e(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
            ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText(null, str));
            return Unit.f36324a;
        }
    }

    public static final class b extends xc.m implements Function2 {
        public b() {
            super(2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(Object[] objArr, pb.m promise) {
            Object obj;
            Intrinsics.checkNotNullParameter(objArr, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(promise, "promise");
            String str = (String) promise;
            Iterator it = Ka.a.f5502a.d().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (Intrinsics.b(((a.C0105a) obj).a(), str)) {
                        break;
                    }
                }
            }
            a.C0105a c0105a = (a.C0105a) obj;
            if (c0105a == null) {
                throw new UnexpectedException("Callback with name: " + str + " is not registered");
            }
            Ka.a aVar = Ka.a.f5502a;
            aVar.j("registeredCallbackFired", str);
            if (c0105a.b()) {
                aVar.b();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (pb.m) obj2);
            return Unit.f36324a;
        }
    }

    public static final class c extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final c f5719a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(String.class);
        }
    }

    public static final class d extends xc.m implements Function1 {
        public d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            Object obj;
            Intrinsics.checkNotNullParameter(objArr, "<name for destructuring parameter 0>");
            String str = (String) objArr[0];
            Iterator it = Ka.a.f5502a.d().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.b(((a.C0105a) obj).a(), str)) {
                    break;
                }
            }
            a.C0105a c0105a = (a.C0105a) obj;
            if (c0105a != null) {
                Ka.a aVar = Ka.a.f5502a;
                aVar.j("registeredCallbackFired", str);
                if (c0105a.b()) {
                    aVar.b();
                }
                return Unit.f36324a;
            }
            throw new UnexpectedException("Callback with name: " + str + " is not registered");
        }
    }

    public static final class e extends xc.m implements Function1 {
        public e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            Intrinsics.checkNotNullParameter(it, "it");
            Ka.a.f5502a.g(a.this.j());
            return Unit.f36324a;
        }
    }

    public static final class f extends xc.m implements Function1 {
        public f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            Intrinsics.checkNotNullParameter(it, "it");
            Ka.a.f5502a.f();
            return Unit.f36324a;
        }
    }

    public static final class g extends xc.m implements Function1 {
        public g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            Intrinsics.checkNotNullParameter(it, "it");
            Ka.a.f5502a.b();
            return Unit.f36324a;
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
            boolean booleanValue = ((Boolean) promise).booleanValue();
            InterfaceC3771b e10 = Ka.a.f5502a.e();
            if (e10 == null) {
                return;
            }
            e10.a(booleanValue);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (pb.m) obj2);
            return Unit.f36324a;
        }
    }

    public static final class i extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final i f5721a = new i();

        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(Boolean.TYPE);
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
            boolean booleanValue = ((Boolean) objArr[0]).booleanValue();
            InterfaceC3771b e10 = Ka.a.f5502a.e();
            if (e10 != null) {
                e10.a(booleanValue);
            }
            return Unit.f36324a;
        }
    }

    public static final class k extends xc.m implements Function1 {
        public k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            Intrinsics.checkNotNullParameter(it, "it");
            Ka.a.f5502a.c();
            return Unit.f36324a;
        }
    }

    public static final class l extends xc.m implements Function2 {
        public l() {
            super(2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(Object[] objArr, pb.m promise) {
            Intrinsics.checkNotNullParameter(objArr, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(promise, "promise");
            Object systemService = a.this.j().getSystemService("clipboard");
            Intrinsics.e(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
            ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText(null, (String) promise));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (pb.m) obj2);
            return Unit.f36324a;
        }
    }

    public static final class m extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final m f5723a = new m();

        public m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(String.class);
        }
    }

    public static final class n extends xc.m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Ka.a f5724a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(Ka.a aVar) {
            super(1);
            this.f5724a = aVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            Intrinsics.checkNotNullParameter(it, "it");
            this.f5724a.i();
            return Unit.f36324a;
        }
    }

    public static final class o extends xc.m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Ka.a f5725a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(Ka.a aVar) {
            super(1);
            this.f5725a = aVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            Intrinsics.checkNotNullParameter(it, "it");
            this.f5725a.m();
            return Unit.f36324a;
        }
    }

    public static final class p extends xc.m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Ka.a f5726a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(Ka.a aVar) {
            super(1);
            this.f5726a = aVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            Intrinsics.checkNotNullParameter(it, "it");
            this.f5726a.l();
            return Unit.f36324a;
        }
    }

    public static final class q extends xc.m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Ka.a f5727a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(Ka.a aVar) {
            super(1);
            this.f5727a = aVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            Intrinsics.checkNotNullParameter(it, "it");
            this.f5727a.n();
            return Unit.f36324a;
        }
    }

    public static final class r extends xc.m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Ka.a f5728a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(Ka.a aVar) {
            super(1);
            this.f5728a = aVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            Intrinsics.checkNotNullParameter(it, "it");
            this.f5728a.h();
            return Unit.f36324a;
        }
    }

    public static final class s extends xc.m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Ka.a f5729a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(Ka.a aVar) {
            super(1);
            this.f5729a = aVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            Intrinsics.checkNotNullParameter(it, "it");
            this.f5729a.k();
            return Unit.f36324a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Context j() {
        Context w10 = a().w();
        if (w10 != null) {
            return w10;
        }
        throw new expo.modules.kotlin.exception.l();
    }

    @Override // xb.AbstractC5139a
    public xb.c b() {
        wb.g kVar;
        wb.g kVar2;
        wb.g kVar3;
        AbstractC3901a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            xb.b bVar = new xb.b(this);
            bVar.o("ExpoDevMenuInternal");
            bVar.c(t.a("doesDeviceSupportKeyCommands", Boolean.valueOf(Ha.a.f3820a.a())));
            C0792a[] c0792aArr = new C0792a[0];
            e eVar = new e();
            Class cls = Integer.TYPE;
            bVar.k().put("loadFontsAsync", Intrinsics.b(Unit.class, cls) ? new wb.k("loadFontsAsync", c0792aArr, eVar) : Intrinsics.b(Unit.class, Boolean.TYPE) ? new wb.h("loadFontsAsync", c0792aArr, eVar) : Intrinsics.b(Unit.class, Double.TYPE) ? new wb.i("loadFontsAsync", c0792aArr, eVar) : Intrinsics.b(Unit.class, Float.TYPE) ? new wb.j("loadFontsAsync", c0792aArr, eVar) : Intrinsics.b(Unit.class, String.class) ? new wb.m("loadFontsAsync", c0792aArr, eVar) : new wb.e("loadFontsAsync", c0792aArr, eVar));
            Ka.a aVar = Ka.a.f5502a;
            bVar.k().put("reload", new wb.e("reload", new C0792a[0], new n(aVar)));
            bVar.k().put("togglePerformanceMonitor", new wb.e("togglePerformanceMonitor", new C0792a[0], new o(aVar)));
            bVar.k().put("toggleInspector", new wb.e("toggleInspector", new C0792a[0], new p(aVar)));
            bVar.k().put("toggleRemoteDebug", new wb.e("toggleRemoteDebug", new C0792a[0], new q(aVar)));
            bVar.k().put("openJSInspector", new wb.e("openJSInspector", new C0792a[0], new r(aVar)));
            bVar.k().put("toggleFastRefresh", new wb.e("toggleFastRefresh", new C0792a[0], new s(aVar)));
            C0792a[] c0792aArr2 = new C0792a[0];
            f fVar = new f();
            bVar.k().put("hideMenu", Intrinsics.b(Unit.class, cls) ? new wb.k("hideMenu", c0792aArr2, fVar) : Intrinsics.b(Unit.class, Boolean.TYPE) ? new wb.h("hideMenu", c0792aArr2, fVar) : Intrinsics.b(Unit.class, Double.TYPE) ? new wb.i("hideMenu", c0792aArr2, fVar) : Intrinsics.b(Unit.class, Float.TYPE) ? new wb.j("hideMenu", c0792aArr2, fVar) : Intrinsics.b(Unit.class, String.class) ? new wb.m("hideMenu", c0792aArr2, fVar) : new wb.e("hideMenu", c0792aArr2, fVar));
            C0792a[] c0792aArr3 = new C0792a[0];
            g gVar = new g();
            bVar.k().put("closeMenu", Intrinsics.b(Unit.class, cls) ? new wb.k("closeMenu", c0792aArr3, gVar) : Intrinsics.b(Unit.class, Boolean.TYPE) ? new wb.h("closeMenu", c0792aArr3, gVar) : Intrinsics.b(Unit.class, Double.TYPE) ? new wb.i("closeMenu", c0792aArr3, gVar) : Intrinsics.b(Unit.class, Float.TYPE) ? new wb.j("closeMenu", c0792aArr3, gVar) : Intrinsics.b(Unit.class, String.class) ? new wb.m("closeMenu", c0792aArr3, gVar) : new wb.e("closeMenu", c0792aArr3, gVar));
            if (Intrinsics.b(Boolean.class, pb.m.class)) {
                kVar = new wb.f("setOnboardingFinished", new C0792a[0], new h());
            } else {
                C0792a c0792a = (C0792a) C0794c.f1454a.a().get(new Pair(C5142C.b(Boolean.class), Boolean.FALSE));
                if (c0792a == null) {
                    c0792a = new C0792a(new M(C5142C.b(Boolean.class), false, i.f5721a));
                }
                C0792a[] c0792aArr4 = {c0792a};
                j jVar = new j();
                kVar = Intrinsics.b(Unit.class, cls) ? new wb.k("setOnboardingFinished", c0792aArr4, jVar) : Intrinsics.b(Unit.class, Boolean.TYPE) ? new wb.h("setOnboardingFinished", c0792aArr4, jVar) : Intrinsics.b(Unit.class, Double.TYPE) ? new wb.i("setOnboardingFinished", c0792aArr4, jVar) : Intrinsics.b(Unit.class, Float.TYPE) ? new wb.j("setOnboardingFinished", c0792aArr4, jVar) : Intrinsics.b(Unit.class, String.class) ? new wb.m("setOnboardingFinished", c0792aArr4, jVar) : new wb.e("setOnboardingFinished", c0792aArr4, jVar);
            }
            bVar.k().put("setOnboardingFinished", kVar);
            C0792a[] c0792aArr5 = new C0792a[0];
            k kVar4 = new k();
            bVar.k().put("openDevMenuFromReactNative", Intrinsics.b(Unit.class, cls) ? new wb.k("openDevMenuFromReactNative", c0792aArr5, kVar4) : Intrinsics.b(Unit.class, Boolean.TYPE) ? new wb.h("openDevMenuFromReactNative", c0792aArr5, kVar4) : Intrinsics.b(Unit.class, Double.TYPE) ? new wb.i("openDevMenuFromReactNative", c0792aArr5, kVar4) : Intrinsics.b(Unit.class, Float.TYPE) ? new wb.j("openDevMenuFromReactNative", c0792aArr5, kVar4) : Intrinsics.b(Unit.class, String.class) ? new wb.m("openDevMenuFromReactNative", c0792aArr5, kVar4) : new wb.e("openDevMenuFromReactNative", c0792aArr5, kVar4));
            if (Intrinsics.b(String.class, pb.m.class)) {
                kVar2 = new wb.f("copyToClipboardAsync", new C0792a[0], new l());
            } else {
                C0792a c0792a2 = (C0792a) C0794c.f1454a.a().get(new Pair(C5142C.b(String.class), Boolean.FALSE));
                if (c0792a2 == null) {
                    c0792a2 = new C0792a(new M(C5142C.b(String.class), false, m.f5723a));
                }
                C0792a[] c0792aArr6 = {c0792a2};
                C0111a c0111a = new C0111a();
                kVar2 = Intrinsics.b(Unit.class, cls) ? new wb.k("copyToClipboardAsync", c0792aArr6, c0111a) : Intrinsics.b(Unit.class, Boolean.TYPE) ? new wb.h("copyToClipboardAsync", c0792aArr6, c0111a) : Intrinsics.b(Unit.class, Double.TYPE) ? new wb.i("copyToClipboardAsync", c0792aArr6, c0111a) : Intrinsics.b(Unit.class, Float.TYPE) ? new wb.j("copyToClipboardAsync", c0792aArr6, c0111a) : Intrinsics.b(Unit.class, String.class) ? new wb.m("copyToClipboardAsync", c0792aArr6, c0111a) : new wb.e("copyToClipboardAsync", c0792aArr6, c0111a);
            }
            bVar.k().put("copyToClipboardAsync", kVar2);
            if (Intrinsics.b(String.class, pb.m.class)) {
                kVar3 = new wb.f("fireCallback", new C0792a[0], new b());
            } else {
                C0792a c0792a3 = (C0792a) C0794c.f1454a.a().get(new Pair(C5142C.b(String.class), Boolean.FALSE));
                if (c0792a3 == null) {
                    c0792a3 = new C0792a(new M(C5142C.b(String.class), false, c.f5719a));
                }
                C0792a[] c0792aArr7 = {c0792a3};
                d dVar = new d();
                kVar3 = Intrinsics.b(Unit.class, cls) ? new wb.k("fireCallback", c0792aArr7, dVar) : Intrinsics.b(Unit.class, Boolean.TYPE) ? new wb.h("fireCallback", c0792aArr7, dVar) : Intrinsics.b(Unit.class, Double.TYPE) ? new wb.i("fireCallback", c0792aArr7, dVar) : Intrinsics.b(Unit.class, Float.TYPE) ? new wb.j("fireCallback", c0792aArr7, dVar) : Intrinsics.b(Unit.class, String.class) ? new wb.m("fireCallback", c0792aArr7, dVar) : new wb.e("fireCallback", c0792aArr7, dVar);
            }
            bVar.k().put("fireCallback", kVar3);
            xb.c q10 = bVar.q();
            AbstractC3901a.f();
            return q10;
        } catch (Throwable th) {
            AbstractC3901a.f();
            throw th;
        }
    }
}
