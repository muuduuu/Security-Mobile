package Ra;

import Db.C0792a;
import Db.C0794c;
import Db.M;
import android.content.Context;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import expo.modules.kotlin.exception.l;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.o;
import org.conscrypt.BuildConfig;
import q1.AbstractC3901a;
import wb.h;
import wb.i;
import wb.j;
import wb.k;
import xb.AbstractC5139a;
import xc.C5142C;
import xc.m;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"LRa/b;", "Lxb/a;", "<init>", "()V", "LSa/e;", "type", BuildConfig.FLAVOR, "l", "(LSa/e;)V", "Lxb/c;", "b", "()Lxb/c;", "Landroid/content/Context;", "j", "()Landroid/content/Context;", "context", "Landroid/os/Vibrator;", "k", "()Landroid/os/Vibrator;", "vibrator", "expo-haptics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class b extends AbstractC5139a {

    public static final class a extends m implements Function2 {
        public a() {
            super(2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(Object[] objArr, pb.m promise) {
            Intrinsics.checkNotNullParameter(objArr, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(promise, "promise");
            b.this.l(Sa.c.f8930a.a((String) promise));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (pb.m) obj2);
            return Unit.f36324a;
        }
    }

    /* renamed from: Ra.b$b, reason: collision with other inner class name */
    public static final class C0166b extends m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final C0166b f8644a = new C0166b();

        public C0166b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o invoke() {
            return C5142C.o(String.class);
        }
    }

    public static final class c extends m implements Function1 {
        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            Intrinsics.checkNotNullParameter(objArr, "<name for destructuring parameter 0>");
            b.this.l(Sa.c.f8930a.a((String) objArr[0]));
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
            b.this.l(Sa.d.a());
            return Unit.f36324a;
        }
    }

    public static final class e extends m implements Function2 {
        public e() {
            super(2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(Object[] objArr, pb.m promise) {
            Intrinsics.checkNotNullParameter(objArr, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(promise, "promise");
            b.this.l(Sa.a.f8928a.a((String) promise));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (pb.m) obj2);
            return Unit.f36324a;
        }
    }

    public static final class f extends m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final f f8648a = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o invoke() {
            return C5142C.o(String.class);
        }
    }

    public static final class g extends m implements Function1 {
        public g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            Intrinsics.checkNotNullParameter(objArr, "<name for destructuring parameter 0>");
            b.this.l(Sa.a.f8928a.a((String) objArr[0]));
            return Unit.f36324a;
        }
    }

    private final Context j() {
        Context w10 = a().w();
        if (w10 != null) {
            return w10;
        }
        throw new l();
    }

    private final Vibrator k() {
        Vibrator defaultVibrator;
        if (Build.VERSION.SDK_INT < 31) {
            Object systemService = j().getSystemService("vibrator");
            Intrinsics.e(systemService, "null cannot be cast to non-null type android.os.Vibrator");
            return (Vibrator) systemService;
        }
        Object systemService2 = j().getSystemService("vibrator_manager");
        Intrinsics.e(systemService2, "null cannot be cast to non-null type android.os.VibratorManager");
        defaultVibrator = U4.d.a(systemService2).getDefaultVibrator();
        Intrinsics.d(defaultVibrator);
        return defaultVibrator;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(Sa.e type) {
        VibrationEffect createWaveform;
        if (Build.VERSION.SDK_INT < 26) {
            k().vibrate(type.b(), -1);
            return;
        }
        Vibrator k10 = k();
        createWaveform = VibrationEffect.createWaveform(type.c(), type.a(), -1);
        k10.vibrate(createWaveform);
    }

    @Override // xb.AbstractC5139a
    public xb.c b() {
        wb.g kVar;
        wb.g kVar2;
        AbstractC3901a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            xb.b bVar = new xb.b(this);
            bVar.o("ExpoHaptics");
            if (Intrinsics.b(String.class, pb.m.class)) {
                kVar = new wb.f("notificationAsync", new C0792a[0], new a());
            } else {
                C0792a c0792a = (C0792a) C0794c.f1454a.a().get(new Pair(C5142C.b(String.class), Boolean.FALSE));
                if (c0792a == null) {
                    c0792a = new C0792a(new M(C5142C.b(String.class), false, C0166b.f8644a));
                }
                C0792a[] c0792aArr = {c0792a};
                c cVar = new c();
                kVar = Intrinsics.b(Unit.class, Integer.TYPE) ? new k("notificationAsync", c0792aArr, cVar) : Intrinsics.b(Unit.class, Boolean.TYPE) ? new h("notificationAsync", c0792aArr, cVar) : Intrinsics.b(Unit.class, Double.TYPE) ? new i("notificationAsync", c0792aArr, cVar) : Intrinsics.b(Unit.class, Float.TYPE) ? new j("notificationAsync", c0792aArr, cVar) : Intrinsics.b(Unit.class, String.class) ? new wb.m("notificationAsync", c0792aArr, cVar) : new wb.e("notificationAsync", c0792aArr, cVar);
            }
            bVar.k().put("notificationAsync", kVar);
            C0792a[] c0792aArr2 = new C0792a[0];
            d dVar = new d();
            Class cls = Integer.TYPE;
            bVar.k().put("selectionAsync", Intrinsics.b(Unit.class, cls) ? new k("selectionAsync", c0792aArr2, dVar) : Intrinsics.b(Unit.class, Boolean.TYPE) ? new h("selectionAsync", c0792aArr2, dVar) : Intrinsics.b(Unit.class, Double.TYPE) ? new i("selectionAsync", c0792aArr2, dVar) : Intrinsics.b(Unit.class, Float.TYPE) ? new j("selectionAsync", c0792aArr2, dVar) : Intrinsics.b(Unit.class, String.class) ? new wb.m("selectionAsync", c0792aArr2, dVar) : new wb.e("selectionAsync", c0792aArr2, dVar));
            if (Intrinsics.b(String.class, pb.m.class)) {
                kVar2 = new wb.f("impactAsync", new C0792a[0], new e());
            } else {
                C0792a c0792a2 = (C0792a) C0794c.f1454a.a().get(new Pair(C5142C.b(String.class), Boolean.FALSE));
                if (c0792a2 == null) {
                    c0792a2 = new C0792a(new M(C5142C.b(String.class), false, f.f8648a));
                }
                C0792a[] c0792aArr3 = {c0792a2};
                g gVar = new g();
                kVar2 = Intrinsics.b(Unit.class, cls) ? new k("impactAsync", c0792aArr3, gVar) : Intrinsics.b(Unit.class, Boolean.TYPE) ? new h("impactAsync", c0792aArr3, gVar) : Intrinsics.b(Unit.class, Double.TYPE) ? new i("impactAsync", c0792aArr3, gVar) : Intrinsics.b(Unit.class, Float.TYPE) ? new j("impactAsync", c0792aArr3, gVar) : Intrinsics.b(Unit.class, String.class) ? new wb.m("impactAsync", c0792aArr3, gVar) : new wb.e("impactAsync", c0792aArr3, gVar);
            }
            bVar.k().put("impactAsync", kVar2);
            xb.c q10 = bVar.q();
            AbstractC3901a.f();
            return q10;
        } catch (Throwable th) {
            AbstractC3901a.f();
            throw th;
        }
    }
}
