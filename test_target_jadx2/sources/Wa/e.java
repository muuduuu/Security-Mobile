package wa;

import D7.InterfaceC0782f;
import D7.InterfaceC0783g;
import Z8.b;
import android.graphics.Point;
import android.media.Image;
import android.util.Log;
import androidx.camera.core.f;
import androidx.camera.core.n;
import b9.C1662a;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import e9.C3102a;
import expo.modules.camera.records.BarcodeType;
import expo.modules.camera.records.CameraType;
import ib.C3362a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import xc.m;

/* loaded from: classes2.dex */
public final class e implements f.a {

    /* renamed from: a, reason: collision with root package name */
    private final CameraType f44381a;

    /* renamed from: b, reason: collision with root package name */
    private final Function1 f44382b;

    /* renamed from: c, reason: collision with root package name */
    private final int f44383c;

    /* renamed from: d, reason: collision with root package name */
    private Z8.b f44384d;

    /* renamed from: e, reason: collision with root package name */
    private Z8.a f44385e;

    static final class a extends m implements Function1 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C3102a f44387b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C3102a c3102a) {
            super(1);
            this.f44387b = c3102a;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void a(List list) {
            String str;
            Point[] a10;
            if (list.isEmpty()) {
                return;
            }
            Intrinsics.d(list);
            C1662a c1662a = (C1662a) CollectionsKt.d0(list);
            String e10 = c1662a.e();
            if (e10 == null) {
                byte[] d10 = c1662a.d();
                if (d10 != null) {
                    str = new String(d10, Charsets.UTF_8);
                    ArrayList arrayList = new ArrayList();
                    a10 = c1662a.a();
                    if (a10 != null) {
                        for (Point point : a10) {
                            arrayList.addAll(CollectionsKt.m(Integer.valueOf(point.x), Integer.valueOf(point.y)));
                        }
                    }
                    e.this.g().invoke(new C3362a(c1662a.c(), c1662a.b(), str, arrayList, this.f44387b.m(), this.f44387b.i()));
                }
                e10 = null;
            }
            str = e10;
            ArrayList arrayList2 = new ArrayList();
            a10 = c1662a.a();
            if (a10 != null) {
            }
            e.this.g().invoke(new C3362a(c1662a.c(), c1662a.b(), str, arrayList2, this.f44387b.m(), this.f44387b.i()));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((List) obj);
            return Unit.f36324a;
        }
    }

    public e(CameraType lensFacing, List formats, Function1 onComplete) {
        int intValue;
        Intrinsics.checkNotNullParameter(lensFacing, "lensFacing");
        Intrinsics.checkNotNullParameter(formats, "formats");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        this.f44381a = lensFacing;
        this.f44382b = onComplete;
        if (formats.isEmpty()) {
            intValue = 0;
        } else {
            List list = formats;
            ArrayList arrayList = new ArrayList(CollectionsKt.u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((BarcodeType) it.next()).mapToBarcode()));
            }
            Iterator it2 = arrayList.iterator();
            if (!it2.hasNext()) {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
            Object next = it2.next();
            while (it2.hasNext()) {
                next = Integer.valueOf(((Number) next).intValue() | ((Number) it2.next()).intValue());
            }
            intValue = ((Number) next).intValue();
        }
        this.f44383c = intValue;
        Z8.b a10 = new b.a().b(intValue, new int[0]).a();
        Intrinsics.checkNotNullExpressionValue(a10, "build(...)");
        this.f44384d = a10;
        Z8.a a11 = Z8.c.a(a10);
        Intrinsics.checkNotNullExpressionValue(a11, "getClient(...)");
        this.f44385e = a11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(Exception it) {
        String str;
        Intrinsics.checkNotNullParameter(it, "it");
        Throwable cause = it.getCause();
        if (cause == null || (str = cause.getMessage()) == null) {
            str = "Barcode scanning failed";
        }
        Log.d("SCANNER", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(n imageProxy, Task it) {
        Intrinsics.checkNotNullParameter(imageProxy, "$imageProxy");
        Intrinsics.checkNotNullParameter(it, "it");
        imageProxy.close();
    }

    @Override // androidx.camera.core.f.a
    public void analyze(final n imageProxy) {
        Intrinsics.checkNotNullParameter(imageProxy, "imageProxy");
        Image E12 = imageProxy.E1();
        if (E12 != null) {
            C3102a d10 = C3102a.d(E12, va.e.b(imageProxy.G().d(), this.f44381a));
            Intrinsics.checkNotNullExpressionValue(d10, "fromMediaImage(...)");
            Task D10 = this.f44385e.D(d10);
            final a aVar = new a(d10);
            D10.f(new InterfaceC0783g() { // from class: wa.b
                @Override // D7.InterfaceC0783g
                public final void onSuccess(Object obj) {
                    e.d(Function1.this, obj);
                }
            }).d(new InterfaceC0782f() { // from class: wa.c
                @Override // D7.InterfaceC0782f
                public final void b(Exception exc) {
                    e.e(exc);
                }
            }).addOnCompleteListener(new OnCompleteListener() { // from class: wa.d
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    e.f(n.this, task);
                }
            });
        }
    }

    public final Function1 g() {
        return this.f44382b;
    }
}
