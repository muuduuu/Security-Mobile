package La;

import Db.C0792a;
import Db.C0794c;
import Db.M;
import android.content.Context;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import expo.modules.kotlin.exception.l;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.o;
import lc.i;
import q1.AbstractC3901a;
import wb.f;
import wb.g;
import wb.h;
import wb.j;
import wb.k;
import xb.AbstractC5139a;
import xc.C5142C;
import xc.m;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u001b\u0010\f\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"LLa/c;", "Lxb/a;", "<init>", "()V", "Lxb/c;", "b", "()Lxb/c;", "LLa/d;", "d", "Lkotlin/Lazy;", "j", "()LLa/d;", "preferencesHandel", "expo-dev-menu_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class c extends AbstractC5139a {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Lazy preferencesHandel = i.a(new e());

    public static final class a extends m implements Function1 {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return c.this.j().i();
        }
    }

    public static final class b extends m implements Function2 {
        public b() {
            super(2);
        }

        public final void a(Object[] objArr, pb.m promise) {
            Intrinsics.checkNotNullParameter(objArr, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(promise, "promise");
            c.this.j().l((ReadableMap) promise);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (pb.m) obj2);
            return Unit.f36324a;
        }
    }

    /* renamed from: La.c$c, reason: collision with other inner class name */
    public static final class C0113c extends m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final C0113c f5735a = new C0113c();

        public C0113c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o invoke() {
            return C5142C.o(ReadableMap.class);
        }
    }

    public static final class d extends m implements Function1 {
        public d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            Intrinsics.checkNotNullParameter(objArr, "<name for destructuring parameter 0>");
            c.this.j().l((ReadableMap) objArr[0]);
            return Unit.f36324a;
        }
    }

    static final class e extends m implements Function0 {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final La.d invoke() {
            Context w10 = c.this.a().w();
            if (w10 != null) {
                return new La.d(w10);
            }
            throw new l();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final La.d j() {
        return (La.d) this.preferencesHandel.getValue();
    }

    @Override // xb.AbstractC5139a
    public xb.c b() {
        g kVar;
        AbstractC3901a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            xb.b bVar = new xb.b(this);
            bVar.o("DevMenuPreferences");
            C0792a[] c0792aArr = new C0792a[0];
            a aVar = new a();
            Class cls = Integer.TYPE;
            bVar.k().put("getPreferencesAsync", Intrinsics.b(WritableMap.class, cls) ? new k("getPreferencesAsync", c0792aArr, aVar) : Intrinsics.b(WritableMap.class, Boolean.TYPE) ? new h("getPreferencesAsync", c0792aArr, aVar) : Intrinsics.b(WritableMap.class, Double.TYPE) ? new wb.i("getPreferencesAsync", c0792aArr, aVar) : Intrinsics.b(WritableMap.class, Float.TYPE) ? new j("getPreferencesAsync", c0792aArr, aVar) : Intrinsics.b(WritableMap.class, String.class) ? new wb.m("getPreferencesAsync", c0792aArr, aVar) : new wb.e("getPreferencesAsync", c0792aArr, aVar));
            if (Intrinsics.b(ReadableMap.class, pb.m.class)) {
                kVar = new f("setPreferencesAsync", new C0792a[0], new b());
            } else {
                C0792a c0792a = (C0792a) C0794c.f1454a.a().get(new Pair(C5142C.b(ReadableMap.class), Boolean.FALSE));
                if (c0792a == null) {
                    c0792a = new C0792a(new M(C5142C.b(ReadableMap.class), false, C0113c.f5735a));
                }
                C0792a[] c0792aArr2 = {c0792a};
                d dVar = new d();
                kVar = Intrinsics.b(Unit.class, cls) ? new k("setPreferencesAsync", c0792aArr2, dVar) : Intrinsics.b(Unit.class, Boolean.TYPE) ? new h("setPreferencesAsync", c0792aArr2, dVar) : Intrinsics.b(Unit.class, Double.TYPE) ? new wb.i("setPreferencesAsync", c0792aArr2, dVar) : Intrinsics.b(Unit.class, Float.TYPE) ? new j("setPreferencesAsync", c0792aArr2, dVar) : Intrinsics.b(Unit.class, String.class) ? new wb.m("setPreferencesAsync", c0792aArr2, dVar) : new wb.e("setPreferencesAsync", c0792aArr2, dVar);
            }
            bVar.k().put("setPreferencesAsync", kVar);
            xb.c q10 = bVar.q();
            AbstractC3901a.f();
            return q10;
        } catch (Throwable th) {
            AbstractC3901a.f();
            throw th;
        }
    }
}
