package Vb;

import Db.C0792a;
import Db.C0794c;
import Db.M;
import Db.T;
import Db.U;
import Jd.AbstractC0891k;
import Jd.InterfaceC0915w0;
import Jd.N;
import expo.modules.splashscreen.SplashScreenOptions;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.o;
import lc.p;
import org.conscrypt.BuildConfig;
import pc.AbstractC3868b;
import q1.AbstractC3901a;
import vb.C5006a;
import vb.EnumC5010e;
import wb.j;
import wb.k;
import wb.q;
import xb.AbstractC5139a;
import xc.C5142C;
import xc.m;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"LVb/e;", "Lxb/a;", "<init>", "()V", "Lxb/c;", "b", "()Lxb/c;", BuildConfig.FLAVOR, "d", "Z", "userControlledAutoHideEnabled", "expo-splash-screen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class e extends AbstractC5139a {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean userControlledAutoHideEnabled;

    static final class a extends l implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        int f11101a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ SplashScreenOptions f11102b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(SplashScreenOptions splashScreenOptions, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f11102b = splashScreenOptions;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
            return new a(this.f11102b, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, kotlin.coroutines.d dVar) {
            return ((a) create(n10, dVar)).invokeSuspend(Unit.f36324a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC3868b.e();
            if (this.f11101a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p.b(obj);
            Vb.d.f11094a.m(this.f11102b);
            return Unit.f36324a;
        }
    }

    public static final class b extends m implements Function1 {
        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            Intrinsics.checkNotNullParameter(it, "it");
            e.this.userControlledAutoHideEnabled = true;
            Vb.d.f11094a.l(true);
            return Boolean.TRUE;
        }
    }

    public static final class c extends m implements Function1 {
        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            Intrinsics.checkNotNullParameter(it, "it");
            Vb.d.f11094a.l(true);
            return Unit.f36324a;
        }
    }

    public static final class d extends m implements Function1 {
        public d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            Intrinsics.checkNotNullParameter(it, "it");
            Vb.d.f11094a.j();
            return Unit.f36324a;
        }
    }

    /* renamed from: Vb.e$e, reason: collision with other inner class name */
    public static final class C0205e extends m implements Function1 {
        public C0205e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (!e.this.userControlledAutoHideEnabled) {
                Vb.d.f11094a.j();
            }
            return Unit.f36324a;
        }
    }

    public static final class f extends m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final f f11105a = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o invoke() {
            return C5142C.o(SplashScreenOptions.class);
        }
    }

    public static final class g extends m implements Function1 {
        public g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            InterfaceC0915w0 d10;
            Intrinsics.checkNotNullParameter(objArr, "<name for destructuring parameter 0>");
            d10 = AbstractC0891k.d(e.this.a().t(), null, null, new a((SplashScreenOptions) objArr[0], null), 3, null);
            return d10;
        }
    }

    public static final class h extends m implements Function1 {
        public h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            Intrinsics.checkNotNullParameter(it, "it");
            Vb.d.f11094a.j();
            return Unit.f36324a;
        }
    }

    public static final class i extends m implements Function0 {
        public i() {
            super(0);
        }

        public final void a() {
            Vb.d.f11094a.n();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f36324a;
        }
    }

    @Override // xb.AbstractC5139a
    public xb.c b() {
        AbstractC3901a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            xb.b bVar = new xb.b(this);
            bVar.o("ExpoSplashScreen");
            C0792a[] c0792aArr = new C0792a[0];
            b bVar2 = new b();
            Class cls = Integer.TYPE;
            bVar.k().put("preventAutoHideAsync", Intrinsics.b(Boolean.class, cls) ? new k("preventAutoHideAsync", c0792aArr, bVar2) : Intrinsics.b(Boolean.class, Boolean.TYPE) ? new wb.h("preventAutoHideAsync", c0792aArr, bVar2) : Intrinsics.b(Boolean.class, Double.TYPE) ? new wb.i("preventAutoHideAsync", c0792aArr, bVar2) : Intrinsics.b(Boolean.class, Float.TYPE) ? new j("preventAutoHideAsync", c0792aArr, bVar2) : Intrinsics.b(Boolean.class, String.class) ? new wb.m("preventAutoHideAsync", c0792aArr, bVar2) : new wb.e("preventAutoHideAsync", c0792aArr, bVar2));
            C0792a[] c0792aArr2 = new C0792a[0];
            c cVar = new c();
            bVar.k().put("internalPreventAutoHideAsync", Intrinsics.b(Unit.class, cls) ? new k("internalPreventAutoHideAsync", c0792aArr2, cVar) : Intrinsics.b(Unit.class, Boolean.TYPE) ? new wb.h("internalPreventAutoHideAsync", c0792aArr2, cVar) : Intrinsics.b(Unit.class, Double.TYPE) ? new wb.i("internalPreventAutoHideAsync", c0792aArr2, cVar) : Intrinsics.b(Unit.class, Float.TYPE) ? new j("internalPreventAutoHideAsync", c0792aArr2, cVar) : Intrinsics.b(Unit.class, String.class) ? new wb.m("internalPreventAutoHideAsync", c0792aArr2, cVar) : new wb.e("internalPreventAutoHideAsync", c0792aArr2, cVar));
            C0792a c0792a = (C0792a) C0794c.f1454a.a().get(new Pair(C5142C.b(SplashScreenOptions.class), Boolean.FALSE));
            if (c0792a == null) {
                c0792a = new C0792a(new M(C5142C.b(SplashScreenOptions.class), false, f.f11105a));
            }
            C0792a[] c0792aArr3 = {c0792a};
            U u10 = U.f1425a;
            T t10 = (T) u10.a().get(C5142C.b(InterfaceC0915w0.class));
            if (t10 == null) {
                t10 = new T(C5142C.b(InterfaceC0915w0.class));
                u10.a().put(C5142C.b(InterfaceC0915w0.class), t10);
            }
            bVar.n().put("setOptions", new q("setOptions", c0792aArr3, t10, new g()));
            C0792a[] c0792aArr4 = new C0792a[0];
            T t11 = (T) u10.a().get(C5142C.b(Object.class));
            if (t11 == null) {
                t11 = new T(C5142C.b(Object.class));
                u10.a().put(C5142C.b(Object.class), t11);
            }
            bVar.n().put("hide", new q("hide", c0792aArr4, t11, new h()));
            bVar.k().put("hideAsync", new wb.e("hideAsync", new C0792a[0], new d()));
            bVar.k().put("internalMaybeHideAsync", new wb.e("internalMaybeHideAsync", new C0792a[0], new C0205e()));
            Map s10 = bVar.s();
            EnumC5010e enumC5010e = EnumC5010e.MODULE_DESTROY;
            s10.put(enumC5010e, new C5006a(enumC5010e, new i()));
            xb.c q10 = bVar.q();
            AbstractC3901a.f();
            return q10;
        } catch (Throwable th) {
            AbstractC3901a.f();
            throw th;
        }
    }
}
