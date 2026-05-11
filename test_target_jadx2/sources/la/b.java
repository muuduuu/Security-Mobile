package La;

import Db.C0792a;
import Db.C0794c;
import Db.M;
import Ka.a;
import android.app.Activity;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.o;
import oa.InterfaceC3770a;
import q1.AbstractC3901a;
import vb.C5006a;
import vb.EnumC5010e;
import wb.h;
import wb.i;
import wb.j;
import wb.k;
import xb.AbstractC5139a;
import xc.C5142C;
import xc.m;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\n\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"LLa/b;", "Lxb/a;", "<init>", "()V", "Lxb/c;", "b", "()Lxb/c;", "Landroid/app/Activity;", "i", "()Landroid/app/Activity;", "currentActivity", "expo-dev-menu_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class b extends AbstractC5139a {

    public static final class a extends m implements Function1 {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            Intrinsics.checkNotNullParameter(it, "it");
            InterfaceC3770a.C0581a.a(Ka.a.f5502a, b.this.i(), null, 2, null);
            return Unit.f36324a;
        }
    }

    /* renamed from: La.b$b, reason: collision with other inner class name */
    public static final class C0112b extends m implements Function1 {
        public C0112b() {
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

    public static final class c extends m implements Function1 {
        public c() {
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

    public static final class d extends m implements Function2 {
        public d() {
            super(2);
        }

        public final void a(Object[] objArr, pb.m promise) {
            String string;
            Intrinsics.checkNotNullParameter(objArr, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(promise, "promise");
            ReadableArray readableArray = (ReadableArray) promise;
            Ka.a.f5502a.d().clear();
            int size = readableArray.size();
            for (int i10 = 0; i10 < size; i10++) {
                ReadableMap map = readableArray.getMap(i10);
                if (map != null && (string = map.getString("name")) != null) {
                    Ka.a.f5502a.d().add(new a.C0105a(string, map.hasKey("shouldCollapse") ? map.getBoolean("shouldCollapse") : true));
                }
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (pb.m) obj2);
            return Unit.f36324a;
        }
    }

    public static final class e extends m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final e f5731a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o invoke() {
            return C5142C.o(ReadableArray.class);
        }
    }

    public static final class f extends m implements Function1 {
        public f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            String string;
            Intrinsics.checkNotNullParameter(objArr, "<name for destructuring parameter 0>");
            ReadableArray readableArray = (ReadableArray) objArr[0];
            Ka.a.f5502a.d().clear();
            int size = readableArray.size();
            for (int i10 = 0; i10 < size; i10++) {
                ReadableMap map = readableArray.getMap(i10);
                if (map != null && (string = map.getString("name")) != null) {
                    Ka.a.f5502a.d().add(new a.C0105a(string, map.hasKey("shouldCollapse") ? map.getBoolean("shouldCollapse") : true));
                }
            }
            return Unit.f36324a;
        }
    }

    public static final class g extends m implements Function0 {
        public g() {
            super(0);
        }

        public final void a() {
            Ka.a.f5502a.d().clear();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f36324a;
        }
    }

    @Override // xb.AbstractC5139a
    public xb.c b() {
        wb.g kVar;
        AbstractC3901a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            xb.b bVar = new xb.b(this);
            bVar.o("ExpoDevMenu");
            C0792a[] c0792aArr = new C0792a[0];
            a aVar = new a();
            Class cls = Integer.TYPE;
            bVar.k().put("openMenu", Intrinsics.b(Unit.class, cls) ? new k("openMenu", c0792aArr, aVar) : Intrinsics.b(Unit.class, Boolean.TYPE) ? new h("openMenu", c0792aArr, aVar) : Intrinsics.b(Unit.class, Double.TYPE) ? new i("openMenu", c0792aArr, aVar) : Intrinsics.b(Unit.class, Float.TYPE) ? new j("openMenu", c0792aArr, aVar) : Intrinsics.b(Unit.class, String.class) ? new wb.m("openMenu", c0792aArr, aVar) : new wb.e("openMenu", c0792aArr, aVar));
            C0792a[] c0792aArr2 = new C0792a[0];
            C0112b c0112b = new C0112b();
            bVar.k().put("closeMenu", Intrinsics.b(Unit.class, cls) ? new k("closeMenu", c0792aArr2, c0112b) : Intrinsics.b(Unit.class, Boolean.TYPE) ? new h("closeMenu", c0792aArr2, c0112b) : Intrinsics.b(Unit.class, Double.TYPE) ? new i("closeMenu", c0792aArr2, c0112b) : Intrinsics.b(Unit.class, Float.TYPE) ? new j("closeMenu", c0792aArr2, c0112b) : Intrinsics.b(Unit.class, String.class) ? new wb.m("closeMenu", c0792aArr2, c0112b) : new wb.e("closeMenu", c0792aArr2, c0112b));
            C0792a[] c0792aArr3 = new C0792a[0];
            c cVar = new c();
            bVar.k().put("hideMenu", Intrinsics.b(Unit.class, cls) ? new k("hideMenu", c0792aArr3, cVar) : Intrinsics.b(Unit.class, Boolean.TYPE) ? new h("hideMenu", c0792aArr3, cVar) : Intrinsics.b(Unit.class, Double.TYPE) ? new i("hideMenu", c0792aArr3, cVar) : Intrinsics.b(Unit.class, Float.TYPE) ? new j("hideMenu", c0792aArr3, cVar) : Intrinsics.b(Unit.class, String.class) ? new wb.m("hideMenu", c0792aArr3, cVar) : new wb.e("hideMenu", c0792aArr3, cVar));
            if (Intrinsics.b(ReadableArray.class, pb.m.class)) {
                kVar = new wb.f("addDevMenuCallbacks", new C0792a[0], new d());
            } else {
                C0792a c0792a = (C0792a) C0794c.f1454a.a().get(new Pair(C5142C.b(ReadableArray.class), Boolean.FALSE));
                if (c0792a == null) {
                    c0792a = new C0792a(new M(C5142C.b(ReadableArray.class), false, e.f5731a));
                }
                C0792a[] c0792aArr4 = {c0792a};
                f fVar = new f();
                kVar = Intrinsics.b(Unit.class, cls) ? new k("addDevMenuCallbacks", c0792aArr4, fVar) : Intrinsics.b(Unit.class, Boolean.TYPE) ? new h("addDevMenuCallbacks", c0792aArr4, fVar) : Intrinsics.b(Unit.class, Double.TYPE) ? new i("addDevMenuCallbacks", c0792aArr4, fVar) : Intrinsics.b(Unit.class, Float.TYPE) ? new j("addDevMenuCallbacks", c0792aArr4, fVar) : Intrinsics.b(Unit.class, String.class) ? new wb.m("addDevMenuCallbacks", c0792aArr4, fVar) : new wb.e("addDevMenuCallbacks", c0792aArr4, fVar);
            }
            bVar.k().put("addDevMenuCallbacks", kVar);
            Map s10 = bVar.s();
            EnumC5010e enumC5010e = EnumC5010e.MODULE_DESTROY;
            s10.put(enumC5010e, new C5006a(enumC5010e, new g()));
            xb.c q10 = bVar.q();
            AbstractC3901a.f();
            return q10;
        } catch (Throwable th) {
            AbstractC3901a.f();
            throw th;
        }
    }

    public final Activity i() {
        Activity a10 = a().a();
        if (a10 != null) {
            return a10;
        }
        throw new expo.modules.kotlin.exception.g();
    }
}
