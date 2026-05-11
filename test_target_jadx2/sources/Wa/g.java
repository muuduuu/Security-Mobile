package wa;

import Jd.AbstractC0887i;
import Jd.C0874b0;
import Jd.N;
import Z8.b;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.util.Log;
import b9.C1662a;
import com.google.android.gms.tasks.Task;
import e9.C3102a;
import ib.C3362a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import lc.p;
import pc.AbstractC3868b;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: d, reason: collision with root package name */
    public static final a f44388d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    private static final String f44389e = g.class.getSimpleName();

    /* renamed from: a, reason: collision with root package name */
    private List f44390a;

    /* renamed from: b, reason: collision with root package name */
    private Z8.b f44391b;

    /* renamed from: c, reason: collision with root package name */
    private Z8.a f44392c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static final class b extends l implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        Object f44393a;

        /* renamed from: b, reason: collision with root package name */
        int f44394b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Bitmap f44395c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ g f44396d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Bitmap bitmap, g gVar, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f44395c = bitmap;
            this.f44396d = gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
            return new b(this.f44395c, this.f44396d, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, kotlin.coroutines.d dVar) {
            return ((b) create(n10, dVar)).invokeSuspend(Unit.f36324a);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0089  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x009b A[Catch: Exception -> 0x0014, TryCatch #0 {Exception -> 0x0014, blocks: (B:6:0x0010, B:7:0x0049, B:11:0x005c, B:12:0x0060, B:14:0x0066, B:16:0x0072, B:18:0x0078, B:19:0x0083, B:22:0x0090, B:24:0x009b, B:26:0x009f, B:28:0x00bd, B:30:0x008b, B:39:0x002d), top: B:2:0x0008 }] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00bd A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x008b A[Catch: Exception -> 0x0014, TryCatch #0 {Exception -> 0x0014, blocks: (B:6:0x0010, B:7:0x0049, B:11:0x005c, B:12:0x0060, B:14:0x0066, B:16:0x0072, B:18:0x0078, B:19:0x0083, B:22:0x0090, B:24:0x009b, B:26:0x009f, B:28:0x00bd, B:30:0x008b, B:39:0x002d), top: B:2:0x0008 }] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            C3102a c3102a;
            String str;
            Point[] a10;
            Object e10 = AbstractC3868b.e();
            int i10 = this.f44394b;
            try {
                if (i10 == 0) {
                    p.b(obj);
                    C3102a a11 = C3102a.a(this.f44395c, 0);
                    Intrinsics.checkNotNullExpressionValue(a11, "fromBitmap(...)");
                    Task D10 = this.f44396d.f44392c.D(a11);
                    Intrinsics.checkNotNullExpressionValue(D10, "process(...)");
                    this.f44393a = a11;
                    this.f44394b = 1;
                    Object a12 = h.a(D10, this);
                    if (a12 == e10) {
                        return e10;
                    }
                    c3102a = a11;
                    obj = a12;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c3102a = (C3102a) this.f44393a;
                    p.b(obj);
                }
                Intrinsics.checkNotNullExpressionValue(obj, "await(...)");
                List<C1662a> list = (List) obj;
                ArrayList arrayList = new ArrayList();
                if (list.isEmpty()) {
                    return arrayList;
                }
                for (C1662a c1662a : list) {
                    String e11 = c1662a.e();
                    if (e11 == null) {
                        byte[] d10 = c1662a.d();
                        if (d10 != null) {
                            str = new String(d10, Charsets.UTF_8);
                            String b10 = c1662a.f() != 1 ? str : c1662a.b();
                            ArrayList arrayList2 = new ArrayList();
                            a10 = c1662a.a();
                            if (a10 == null) {
                                for (Point point : a10) {
                                    arrayList2.addAll(CollectionsKt.m(kotlin.coroutines.jvm.internal.b.b(point.x), kotlin.coroutines.jvm.internal.b.b(point.y)));
                                }
                            }
                            arrayList.add(new C3362a(c1662a.c(), b10, str, arrayList2, c3102a.i(), c3102a.m()));
                        } else {
                            e11 = null;
                        }
                    }
                    str = e11;
                    if (c1662a.f() != 1) {
                    }
                    ArrayList arrayList22 = new ArrayList();
                    a10 = c1662a.a();
                    if (a10 == null) {
                    }
                    arrayList.add(new C3362a(c1662a.c(), b10, str, arrayList22, c3102a.i(), c3102a.m()));
                }
                return arrayList;
            } catch (Exception e12) {
                Log.e(g.f44389e, "Failed to detect barcode: " + e12.getMessage());
                return CollectionsKt.j();
            }
        }
    }

    public g() {
        Z8.b a10 = new b.a().b(0, new int[0]).a();
        Intrinsics.checkNotNullExpressionValue(a10, "build(...)");
        this.f44391b = a10;
        Z8.a a11 = Z8.c.a(a10);
        Intrinsics.checkNotNullExpressionValue(a11, "getClient(...)");
        this.f44392c = a11;
    }

    private final boolean c(List list) {
        List list2 = this.f44390a;
        if (list2 == null) {
            return false;
        }
        HashSet M02 = CollectionsKt.M0(list2);
        HashSet M03 = CollectionsKt.M0(list);
        if (M02.size() != M03.size()) {
            return false;
        }
        M02.removeAll(M03);
        return M02.isEmpty();
    }

    public final Object d(Bitmap bitmap, kotlin.coroutines.d dVar) {
        return AbstractC0887i.g(C0874b0.b(), new b(bitmap, this, null), dVar);
    }

    public final void e(List formats) {
        Intrinsics.checkNotNullParameter(formats, "formats");
        if (c(formats)) {
            return;
        }
        Iterator it = formats.iterator();
        if (!it.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = Integer.valueOf(((Number) next).intValue() | ((Number) it.next()).intValue());
        }
        int intValue = ((Number) next).intValue();
        this.f44390a = formats;
        Z8.b a10 = new b.a().b(intValue, new int[0]).a();
        Intrinsics.checkNotNullExpressionValue(a10, "build(...)");
        this.f44391b = a10;
        Z8.a a11 = Z8.c.a(a10);
        Intrinsics.checkNotNullExpressionValue(a11, "getClient(...)");
        this.f44392c = a11;
    }
}
