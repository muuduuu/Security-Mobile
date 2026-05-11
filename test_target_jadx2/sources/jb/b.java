package Jb;

import Db.C0792a;
import Db.C0794c;
import Db.M;
import android.content.Context;
import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.C1931a;
import com.facebook.react.uimanager.X;
import com.facebook.react.uimanager.Y;
import com.rssignaturecapture.RSSignatureCaptureViewManager;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import e5.C3084f;
import e5.EnumC3081c;
import e5.EnumC3083e;
import e5.j;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lc.t;
import wc.InterfaceC5068n;
import xc.C5142C;
import xc.m;

/* loaded from: classes2.dex */
public abstract class b {

    public static final class a extends m implements Function2 {
        public a() {
            super(2);
        }

        public final void a(View view, Integer num) {
            Intrinsics.checkNotNullParameter(view, "view");
            C1931a.i(view, num);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((View) obj, (Integer) obj2);
            return Unit.f36324a;
        }
    }

    /* renamed from: Jb.b$b, reason: collision with other inner class name */
    public static final class C0097b extends m implements InterfaceC5068n {
        public C0097b() {
            super(3);
        }

        public final void a(View view, int i10, Integer num) {
            Intrinsics.checkNotNullParameter(view, "view");
            C1931a.k(view, j.Companion.a(i10), num);
        }

        @Override // wc.InterfaceC5068n
        public /* bridge */ /* synthetic */ Object n(Object obj, Object obj2, Object obj3) {
            a((View) obj, ((Number) obj2).intValue(), (Integer) obj3);
            return Unit.f36324a;
        }
    }

    public static final class c extends m implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC5068n f4873a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f4874b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC5068n interfaceC5068n, Object obj) {
            super(2);
            this.f4873a = interfaceC5068n;
            this.f4874b = obj;
        }

        public final void a(View view, Object obj) {
            Intrinsics.checkNotNullParameter(view, "view");
            this.f4873a.n(view, this.f4874b, obj);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((View) obj, obj2);
            return Unit.f36324a;
        }
    }

    public static final class d extends m implements InterfaceC5068n {
        public d() {
            super(3);
        }

        public final void a(View view, int i10, Float f10) {
            Intrinsics.checkNotNullParameter(view, "view");
            C1931a.l(view, (EnumC3081c) Jb.e.f4881a.get(i10), f10 != null ? new X(f10.floatValue(), Y.POINT) : null);
        }

        @Override // wc.InterfaceC5068n
        public /* bridge */ /* synthetic */ Object n(Object obj, Object obj2, Object obj3) {
            a((View) obj, ((Number) obj2).intValue(), (Float) obj3);
            return Unit.f36324a;
        }
    }

    static final class e extends m implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC5068n f4875a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f4876b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC5068n interfaceC5068n, int i10) {
            super(2);
            this.f4875a = interfaceC5068n;
            this.f4876b = i10;
        }

        public final void a(View view, Object obj) {
            Intrinsics.checkNotNullParameter(view, "view");
            this.f4875a.n(view, Integer.valueOf(this.f4876b), obj);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((View) obj, obj2);
            return Unit.f36324a;
        }
    }

    public static final class f extends m implements Function2 {
        public f() {
            super(2);
        }

        public final void a(View view, String str) {
            Intrinsics.checkNotNullParameter(view, "view");
            C1931a.m(view, str != null ? EnumC3083e.Companion.a(str) : null);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((View) obj, (String) obj2);
            return Unit.f36324a;
        }
    }

    public static final class g extends m implements InterfaceC5068n {
        public g() {
            super(3);
        }

        public final void a(View view, int i10, Float f10) {
            Intrinsics.checkNotNullParameter(view, "view");
            C1931a.n(view, (j) Jb.h.f4884a.get(i10), Float.valueOf(f10 != null ? f10.floatValue() : Float.NaN));
        }

        @Override // wc.InterfaceC5068n
        public /* bridge */ /* synthetic */ Object n(Object obj, Object obj2, Object obj3) {
            a((View) obj, ((Number) obj2).intValue(), (Float) obj3);
            return Unit.f36324a;
        }
    }

    static final class h extends m implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC5068n f4877a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f4878b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC5068n interfaceC5068n, int i10) {
            super(2);
            this.f4877a = interfaceC5068n;
            this.f4878b = i10;
        }

        public final void a(View view, Object obj) {
            Intrinsics.checkNotNullParameter(view, "view");
            this.f4877a.n(view, Integer.valueOf(this.f4878b), obj);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((View) obj, obj2);
            return Unit.f36324a;
        }
    }

    public static final class i extends m implements Function2 {
        public i() {
            super(2);
        }

        public final void a(View view, ReadableArray readableArray) {
            Intrinsics.checkNotNullParameter(view, "view");
            if (readableArray == null) {
                C1931a.p(view, CollectionsKt.j());
                return;
            }
            ArrayList arrayList = new ArrayList();
            int size = readableArray.size();
            for (int i10 = 0; i10 < size; i10++) {
                ReadableMap map = readableArray.getMap(i10);
                Context context = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                C3084f a10 = Sb.a.a(map, context);
                if (a10 != null) {
                    arrayList.add(a10);
                }
            }
            C1931a.p(view, arrayList);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((View) obj, (ReadableArray) obj2);
            return Unit.f36324a;
        }
    }

    private static final void a(expo.modules.kotlin.views.m mVar) {
        a aVar = new a();
        Map g10 = mVar.g();
        C0794c c0794c = C0794c.f1454a;
        C0792a c0792a = (C0792a) c0794c.a().get(new Pair(C5142C.b(Integer.class), Boolean.TRUE));
        if (c0792a == null) {
            c0792a = new C0792a(new M(C5142C.b(Integer.class), true, Jb.a.f4872a));
        }
        g10.put(RSSignatureCaptureViewManager.PROPS_BACKGROUND_COLOR, new expo.modules.kotlin.views.c(RSSignatureCaptureViewManager.PROPS_BACKGROUND_COLOR, c0792a, aVar));
    }

    private static final void b(expo.modules.kotlin.views.m mVar) {
        Pair[] pairArr = {t.a("borderColor", 8), t.a("borderLeftColor", 0), t.a("borderRightColor", 2), t.a("borderTopColor", 1), t.a("borderBottomColor", 3), t.a("borderStartColor", 4), t.a("borderEndColor", 5), t.a("borderBlockColor", 9), t.a("borderBlockEndColor", 10), t.a("borderBlockStartColor", 11)};
        C0097b c0097b = new C0097b();
        for (int i10 = 0; i10 < 10; i10++) {
            Pair pair = pairArr[i10];
            String str = (String) pair.getFirst();
            c cVar = new c(c0097b, pair.getSecond());
            Map g10 = mVar.g();
            C0794c c0794c = C0794c.f1454a;
            C0792a c0792a = (C0792a) c0794c.a().get(new Pair(C5142C.b(Integer.class), Boolean.TRUE));
            if (c0792a == null) {
                c0792a = new C0792a(new M(C5142C.b(Integer.class), true, Jb.c.f4879a));
            }
            g10.put(str, new expo.modules.kotlin.views.c(str, c0792a, cVar));
        }
    }

    private static final void c(expo.modules.kotlin.views.m mVar) {
        String[] strArr = {Snapshot.BORDER_RADIUS, Snapshot.BORDER_TOP_LEFT_RADIUS, Snapshot.BORDER_TOP_RIGHT_RADIUS, Snapshot.BORDER_BOTTOM_RIGHT_RADIUS, Snapshot.BORDER_BOTTOM_LEFT_RADIUS, "borderTopStartRadius", "borderTopEndRadius", "borderBottomStartRadius", "borderBottomEndRadius", "borderEndEndRadius", "borderEndStartRadius", "borderStartEndRadius", "borderStartStartRadius"};
        d dVar = new d();
        int i10 = 0;
        int i11 = 0;
        while (i10 < 13) {
            String str = strArr[i10];
            int i12 = i11 + 1;
            e eVar = new e(dVar, i11);
            Map g10 = mVar.g();
            C0792a c0792a = (C0792a) C0794c.f1454a.a().get(new Pair(C5142C.b(Float.class), Boolean.TRUE));
            if (c0792a == null) {
                c0792a = new C0792a(new M(C5142C.b(Float.class), true, Jb.d.f4880a));
            }
            g10.put(str, new expo.modules.kotlin.views.c(str, c0792a, eVar));
            i10++;
            i11 = i12;
        }
    }

    private static final void d(expo.modules.kotlin.views.m mVar) {
        f fVar = new f();
        Map g10 = mVar.g();
        C0794c c0794c = C0794c.f1454a;
        C0792a c0792a = (C0792a) c0794c.a().get(new Pair(C5142C.b(String.class), Boolean.TRUE));
        if (c0792a == null) {
            c0792a = new C0792a(new M(C5142C.b(String.class), true, Jb.f.f4882a));
        }
        g10.put("borderStyle", new expo.modules.kotlin.views.c("borderStyle", c0792a, fVar));
    }

    private static final void e(expo.modules.kotlin.views.m mVar) {
        String[] strArr = {"borderWidth", "borderLeftWidth", "borderRightWidth", "borderTopWidth", "borderBottomWidth", "borderStartWidth", "borderEndWidth"};
        g gVar = new g();
        int i10 = 0;
        int i11 = 0;
        while (i10 < 7) {
            String str = strArr[i10];
            int i12 = i11 + 1;
            h hVar = new h(gVar, i11);
            Map g10 = mVar.g();
            C0792a c0792a = (C0792a) C0794c.f1454a.a().get(new Pair(C5142C.b(Float.class), Boolean.TRUE));
            if (c0792a == null) {
                c0792a = new C0792a(new M(C5142C.b(Float.class), true, Jb.g.f4883a));
            }
            g10.put(str, new expo.modules.kotlin.views.c(str, c0792a, hVar));
            i10++;
            i11 = i12;
        }
    }

    private static final void f(expo.modules.kotlin.views.m mVar) {
        i iVar = new i();
        Map g10 = mVar.g();
        C0794c c0794c = C0794c.f1454a;
        C0792a c0792a = (C0792a) c0794c.a().get(new Pair(C5142C.b(ReadableArray.class), Boolean.TRUE));
        if (c0792a == null) {
            c0792a = new C0792a(new M(C5142C.b(ReadableArray.class), true, Jb.i.f4885a));
        }
        g10.put("boxShadow", new expo.modules.kotlin.views.c("boxShadow", c0792a, iVar));
    }

    public static final void g(expo.modules.kotlin.views.m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        b(mVar);
        e(mVar);
        c(mVar);
        d(mVar);
        a(mVar);
        f(mVar);
    }
}
