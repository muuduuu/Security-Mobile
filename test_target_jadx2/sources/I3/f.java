package I3;

import I3.i;
import I3.k;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import f3.AbstractC3142a;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.D;
import kotlin.collections.G;
import kotlin.collections.O;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* loaded from: classes.dex */
public final class f implements i {

    /* renamed from: m, reason: collision with root package name */
    public static final b f4278m = new b(null);

    /* renamed from: a, reason: collision with root package name */
    private final Y3.d f4279a;

    /* renamed from: b, reason: collision with root package name */
    private final E3.c f4280b;

    /* renamed from: c, reason: collision with root package name */
    private final H3.c f4281c;

    /* renamed from: d, reason: collision with root package name */
    private final D3.d f4282d;

    /* renamed from: e, reason: collision with root package name */
    private final int f4283e;

    /* renamed from: f, reason: collision with root package name */
    private final ConcurrentHashMap f4284f;

    /* renamed from: g, reason: collision with root package name */
    private volatile int f4285g;

    /* renamed from: h, reason: collision with root package name */
    private volatile boolean f4286h;

    /* renamed from: i, reason: collision with root package name */
    private final g f4287i;

    /* renamed from: j, reason: collision with root package name */
    private int f4288j;

    /* renamed from: k, reason: collision with root package name */
    private Map f4289k;

    /* renamed from: l, reason: collision with root package name */
    private Set f4290l;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final AbstractC3142a f4291a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f4292b;

        public a(AbstractC3142a bitmapRef) {
            Intrinsics.checkNotNullParameter(bitmapRef, "bitmapRef");
            this.f4291a = bitmapRef;
        }

        public final AbstractC3142a a() {
            return this.f4291a;
        }

        public final boolean b() {
            return !this.f4292b && this.f4291a.s();
        }

        public final void c() {
            AbstractC3142a.n(this.f4291a);
        }

        public final void d(boolean z10) {
            this.f4292b = z10;
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public f(Y3.d platformBitmapFactory, E3.c bitmapFrameRenderer, H3.c fpsCompressor, D3.d animationInformation) {
        Intrinsics.checkNotNullParameter(platformBitmapFactory, "platformBitmapFactory");
        Intrinsics.checkNotNullParameter(bitmapFrameRenderer, "bitmapFrameRenderer");
        Intrinsics.checkNotNullParameter(fpsCompressor, "fpsCompressor");
        Intrinsics.checkNotNullParameter(animationInformation, "animationInformation");
        this.f4279a = platformBitmapFactory;
        this.f4280b = bitmapFrameRenderer;
        this.f4281c = fpsCompressor;
        this.f4282d = animationInformation;
        int k10 = k(l());
        this.f4283e = k10;
        this.f4284f = new ConcurrentHashMap();
        this.f4287i = new g(l().a());
        this.f4288j = -1;
        this.f4289k = G.h();
        this.f4290l = O.d();
        d(k(l()));
        this.f4285g = (int) (k10 * 0.5f);
    }

    private final void f(AbstractC3142a abstractC3142a) {
        if (abstractC3142a.s()) {
            new Canvas((Bitmap) abstractC3142a.p()).drawColor(0, PorterDuff.Mode.CLEAR);
        }
    }

    private final boolean g(int i10, int i11, int i12, int i13) {
        int intValue;
        AbstractC3142a a10;
        List d10 = this.f4287i.d(i10, this.f4283e);
        ArrayList arrayList = new ArrayList();
        for (Object obj : d10) {
            if (this.f4290l.contains(Integer.valueOf(((Number) obj).intValue()))) {
                arrayList.add(obj);
            }
        }
        Set S02 = CollectionsKt.S0(arrayList);
        Set keySet = this.f4284f.keySet();
        Intrinsics.checkNotNullExpressionValue(keySet, "bufferFramesHash.keys");
        ArrayDeque arrayDeque = new ArrayDeque(O.i(keySet, S02));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int intValue2 = ((Number) it.next()).intValue();
            if (this.f4284f.get(Integer.valueOf(intValue2)) == null) {
                int i14 = this.f4288j;
                if (i14 != -1 && !S02.contains(Integer.valueOf(i14))) {
                    return false;
                }
                Integer num = (Integer) arrayDeque.pollFirst();
                if (num == null) {
                    num = -1;
                }
                Intrinsics.checkNotNullExpressionValue(num, "oldFramesNumbers.pollFirst() ?: -1");
                int intValue3 = num.intValue();
                a aVar = (a) this.f4284f.get(Integer.valueOf(intValue3));
                AbstractC3142a d11 = (aVar == null || (a10 = aVar.a()) == null) ? null : a10.d();
                if (d11 == null) {
                    AbstractC3142a a11 = this.f4279a.a(i11, i12);
                    Intrinsics.checkNotNullExpressionValue(a11, "platformBitmapFactory.createBitmap(width, height)");
                    aVar = new a(a11);
                    d11 = aVar.a().clone();
                    Intrinsics.checkNotNullExpressionValue(d11, "bufferFrame.bitmapRef.clone()");
                }
                aVar.d(true);
                try {
                    o(d11, intValue2, i11, i12);
                    Unit unit = Unit.f36324a;
                    kotlin.io.c.a(d11, null);
                    this.f4284f.remove(Integer.valueOf(intValue3));
                    aVar.d(false);
                    this.f4284f.put(Integer.valueOf(intValue2), aVar);
                } finally {
                }
            }
        }
        if (arrayList.isEmpty()) {
            intValue = (int) (this.f4283e * 0.5f);
        } else {
            int size = arrayList.size();
            intValue = ((Number) arrayList.get(kotlin.ranges.d.k((int) (size * 0.5f), 0, size - 1))).intValue();
        }
        this.f4285g = intValue;
        return true;
    }

    static /* synthetic */ boolean h(f fVar, int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 8) != 0) {
            i13 = 0;
        }
        return fVar.g(i10, i11, i12, i13);
    }

    private final I3.a i(int i10) {
        I3.a aVar;
        Iterator it = new IntRange(0, this.f4287i.b()).iterator();
        do {
            aVar = null;
            if (!it.hasNext()) {
                break;
            }
            int a10 = this.f4287i.a(i10 - ((D) it).a());
            a aVar2 = (a) this.f4284f.get(Integer.valueOf(a10));
            if (aVar2 != null) {
                if (!aVar2.b()) {
                    aVar2 = null;
                }
                if (aVar2 != null) {
                    aVar = new I3.a(a10, aVar2.a());
                }
            }
        } while (aVar == null);
        return aVar;
    }

    private final k j(int i10) {
        I3.a i11 = i(i10);
        if (i11 == null) {
            return new k(null, k.a.MISSING);
        }
        AbstractC3142a clone = i11.a().clone();
        Intrinsics.checkNotNullExpressionValue(clone, "nearestFrame.bitmap.clone()");
        this.f4288j = i11.b();
        return new k(clone, k.a.NEAREST);
    }

    private final int k(D3.d dVar) {
        return (int) kotlin.ranges.d.e(TimeUnit.SECONDS.toMillis(1L) / (dVar.i() / dVar.a()), 1L);
    }

    private final void m(final int i10, final int i11) {
        if (this.f4286h) {
            return;
        }
        this.f4286h = true;
        H3.b.f3085a.b(new Runnable() { // from class: I3.e
            @Override // java.lang.Runnable
            public final void run() {
                f.n(f.this, i10, i11);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(f this$0, int i10, int i11) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        while (!h(this$0, kotlin.ranges.d.d(this$0.f4288j, 0), i10, i11, 0, 8, null)) {
        }
        this$0.f4286h = false;
    }

    private final void o(AbstractC3142a abstractC3142a, int i10, int i11, int i12) {
        AbstractC3142a a10;
        AbstractC3142a d10;
        I3.a i13 = i(i10);
        if (i13 != null && (a10 = i13.a()) != null && (d10 = a10.d()) != null) {
            try {
                int b10 = i13.b();
                if (b10 < i10) {
                    Object p10 = d10.p();
                    Intrinsics.checkNotNullExpressionValue(p10, "nearestBitmap.get()");
                    p(abstractC3142a, (Bitmap) p10);
                    Iterator it = new IntRange(b10 + 1, i10).iterator();
                    while (it.hasNext()) {
                        int a11 = ((D) it).a();
                        E3.c cVar = this.f4280b;
                        Object p11 = abstractC3142a.p();
                        Intrinsics.checkNotNullExpressionValue(p11, "targetBitmap.get()");
                        cVar.a(a11, (Bitmap) p11);
                    }
                    kotlin.io.c.a(d10, null);
                    return;
                }
                Unit unit = Unit.f36324a;
                kotlin.io.c.a(d10, null);
            } finally {
            }
        }
        f(abstractC3142a);
        Iterator it2 = new IntRange(0, i10).iterator();
        while (it2.hasNext()) {
            int a12 = ((D) it2).a();
            E3.c cVar2 = this.f4280b;
            Object p12 = abstractC3142a.p();
            Intrinsics.checkNotNullExpressionValue(p12, "targetBitmap.get()");
            cVar2.a(a12, (Bitmap) p12);
        }
    }

    private final AbstractC3142a p(AbstractC3142a abstractC3142a, Bitmap bitmap) {
        if (abstractC3142a.s() && !Intrinsics.b(abstractC3142a.p(), bitmap)) {
            Canvas canvas = new Canvas((Bitmap) abstractC3142a.p());
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        }
        return abstractC3142a;
    }

    @Override // I3.i
    public void a() {
        i.a.a(this);
    }

    @Override // I3.i
    public void b(int i10, int i11, Function0 onAnimationLoaded) {
        Intrinsics.checkNotNullParameter(onAnimationLoaded, "onAnimationLoaded");
        m(i10, i11);
        onAnimationLoaded.invoke();
    }

    @Override // I3.i
    public k c(int i10, int i11, int i12) {
        Integer num = (Integer) this.f4289k.get(Integer.valueOf(i10));
        if (num == null) {
            return j(i10);
        }
        int intValue = num.intValue();
        this.f4288j = intValue;
        a aVar = (a) this.f4284f.get(num);
        if (aVar == null || !aVar.b()) {
            aVar = null;
        }
        if (aVar == null) {
            m(i11, i12);
            return j(intValue);
        }
        if (this.f4287i.c(this.f4285g, intValue, this.f4283e)) {
            m(i11, i12);
        }
        return new k(aVar.a().clone(), k.a.SUCCESS);
    }

    @Override // I3.i
    public void clear() {
        Collection values = this.f4284f.values();
        Intrinsics.checkNotNullExpressionValue(values, "bufferFramesHash.values");
        Iterator it = values.iterator();
        while (it.hasNext()) {
            ((a) it.next()).c();
        }
        this.f4284f.clear();
        this.f4288j = -1;
    }

    @Override // I3.i
    public void d(int i10) {
        Map a10 = this.f4281c.a(l().i() * kotlin.ranges.d.d(l().b(), 1), l().a(), kotlin.ranges.d.h(i10, k(l())));
        this.f4289k = a10;
        this.f4290l = CollectionsKt.S0(a10.values());
    }

    public D3.d l() {
        return this.f4282d;
    }
}
