package Wb;

import Db.C0792a;
import Db.C0794c;
import Db.M;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.g;
import expo.modules.kotlin.exception.l;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.o;
import org.conscrypt.BuildConfig;
import q1.AbstractC3901a;
import u5.C4870a;
import wb.f;
import wb.h;
import wb.i;
import wb.j;
import wb.k;
import xb.AbstractC5139a;
import xc.C5142C;
import xc.C5146G;
import xc.m;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00172\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"LWb/b;", "Lxb/a;", "<init>", "()V", BuildConfig.FLAVOR, "color", BuildConfig.FLAVOR, "o", "(I)V", "Lxb/c;", "b", "()Lxb/c;", "Landroid/content/Context;", "l", "()Landroid/content/Context;", "context", "Landroid/content/SharedPreferences;", "m", "()Landroid/content/SharedPreferences;", "prefs", "n", "()I", "systemBackgroundColor", "d", C4870a.f43493a, "expo-system-ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class b extends AbstractC5139a {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: Wb.b$a, reason: from kotlin metadata */
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

    /* renamed from: Wb.b$b, reason: collision with other inner class name */
    public static final class C0212b extends m implements Function2 {
        public C0212b() {
            super(2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(Object[] objArr, pb.m promise) {
            Intrinsics.checkNotNullParameter(objArr, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(promise, "promise");
            Integer num = (Integer) promise;
            b.this.m().edit().putInt("expoRootBackgroundColor", num.intValue()).apply();
            b.this.o(num.intValue());
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (pb.m) obj2);
            return Unit.f36324a;
        }
    }

    public static final class c extends m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final c f11426a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o invoke() {
            return C5142C.f(Integer.class);
        }
    }

    public static final class d extends m implements Function1 {
        public d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            Unit unit;
            Intrinsics.checkNotNullParameter(objArr, "<name for destructuring parameter 0>");
            Integer num = (Integer) objArr[0];
            if (num != null) {
                b.this.m().edit().putInt("expoRootBackgroundColor", num.intValue()).apply();
                unit = Unit.f36324a;
            } else {
                unit = null;
            }
            if (unit == null) {
                b.this.m().edit().remove("expoRootBackgroundColor").apply();
            }
            b bVar = b.this;
            bVar.o(num != null ? num.intValue() : bVar.n());
            return Unit.f36324a;
        }
    }

    public static final class e extends m implements Function1 {
        public e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            Intrinsics.checkNotNullParameter(it, "it");
            Drawable background = b.this.a().x().getWindow().getDecorView().getBackground();
            if (!(background instanceof ColorDrawable)) {
                return null;
            }
            Companion companion = b.INSTANCE;
            Drawable mutate = background.mutate();
            Intrinsics.e(mutate, "null cannot be cast to non-null type android.graphics.drawable.ColorDrawable");
            return companion.a(((ColorDrawable) mutate).getColor());
        }
    }

    private final Context l() {
        Context w10 = a().w();
        if (w10 != null) {
            return w10;
        }
        throw new l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SharedPreferences m() {
        SharedPreferences sharedPreferences = l().getSharedPreferences("expo_ui_preferences", 0);
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        throw new l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int n() {
        int o10 = g.o();
        if (o10 == -1) {
            int i10 = l().getResources().getConfiguration().uiMode & 48;
            if (i10 != 16 && i10 == 32) {
                return -16777216;
            }
        } else if (o10 != 1 && o10 == 2) {
            return -16777216;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o(int color) {
        Window window = a().x().getWindow();
        View decorView = window != null ? window.getDecorView() : null;
        int parseColor = Color.parseColor(INSTANCE.a(color));
        if (decorView != null) {
            decorView.setBackgroundColor(parseColor);
        }
    }

    @Override // xb.AbstractC5139a
    public xb.c b() {
        wb.g kVar;
        AbstractC3901a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            xb.b bVar = new xb.b(this);
            bVar.o("ExpoSystemUI");
            if (Intrinsics.b(Integer.class, pb.m.class)) {
                kVar = new f("setBackgroundColorAsync", new C0792a[0], new C0212b());
            } else {
                C0792a c0792a = (C0792a) C0794c.f1454a.a().get(new Pair(C5142C.b(Integer.class), Boolean.TRUE));
                if (c0792a == null) {
                    c0792a = new C0792a(new M(C5142C.b(Integer.class), true, c.f11426a));
                }
                C0792a[] c0792aArr = {c0792a};
                d dVar = new d();
                kVar = Intrinsics.b(Unit.class, Integer.TYPE) ? new k("setBackgroundColorAsync", c0792aArr, dVar) : Intrinsics.b(Unit.class, Boolean.TYPE) ? new h("setBackgroundColorAsync", c0792aArr, dVar) : Intrinsics.b(Unit.class, Double.TYPE) ? new i("setBackgroundColorAsync", c0792aArr, dVar) : Intrinsics.b(Unit.class, Float.TYPE) ? new j("setBackgroundColorAsync", c0792aArr, dVar) : Intrinsics.b(Unit.class, String.class) ? new wb.m("setBackgroundColorAsync", c0792aArr, dVar) : new wb.e("setBackgroundColorAsync", c0792aArr, dVar);
            }
            bVar.k().put("setBackgroundColorAsync", kVar);
            kVar.m(wb.l.MAIN);
            bVar.k().put("getBackgroundColorAsync", new wb.e("getBackgroundColorAsync", new C0792a[0], new e()));
            xb.c q10 = bVar.q();
            AbstractC3901a.f();
            return q10;
        } catch (Throwable th) {
            AbstractC3901a.f();
            throw th;
        }
    }
}
