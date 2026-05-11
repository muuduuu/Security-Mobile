package Ta;

import android.content.Context;
import android.graphics.Point;
import android.view.Display;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class y {

    /* renamed from: e, reason: collision with root package name */
    public static final a f9660e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    private static Integer f9661f;

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f9662a;

    /* renamed from: b, reason: collision with root package name */
    private final List f9663b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f9664c;

    /* renamed from: d, reason: collision with root package name */
    private b f9665d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int b(Context context) {
            if (c() == null) {
                Object systemService = context.getSystemService("window");
                Intrinsics.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
                Display defaultDisplay = ((WindowManager) D2.k.d((WindowManager) systemService)).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                d(Integer.valueOf(Math.max(point.x, point.y)));
            }
            Integer c10 = c();
            Intrinsics.d(c10);
            return c10.intValue();
        }

        public final Integer c() {
            return y.f9661f;
        }

        public final void d(Integer num) {
            y.f9661f = num;
        }

        private a() {
        }
    }

    private static final class b implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference f9666a;

        public b(y sizeDeterminer) {
            Intrinsics.checkNotNullParameter(sizeDeterminer, "sizeDeterminer");
            this.f9666a = new WeakReference(sizeDeterminer);
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            y yVar = (y) this.f9666a.get();
            if (yVar == null) {
                return true;
            }
            yVar.c();
            return true;
        }
    }

    public y(WeakReference imageViewHolder) {
        Intrinsics.checkNotNullParameter(imageViewHolder, "imageViewHolder");
        this.f9662a = imageViewHolder;
        this.f9663b = new ArrayList();
    }

    private final int f(int i10, int i11, int i12) {
        k kVar = (k) this.f9662a.get();
        if (kVar == null) {
            return Integer.MIN_VALUE;
        }
        int i13 = i11 - i12;
        if (i13 > 0) {
            return i13;
        }
        if (this.f9664c && kVar.isLayoutRequested()) {
            return 0;
        }
        int i14 = i10 - i12;
        if (i14 > 0) {
            return i14;
        }
        if (kVar.isLayoutRequested() || i11 != -2) {
            return 0;
        }
        a aVar = f9660e;
        Context context = kVar.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return aVar.b(context);
    }

    private final int g() {
        k kVar = (k) this.f9662a.get();
        if (kVar == null) {
            return Integer.MIN_VALUE;
        }
        int paddingTop = kVar.getPaddingTop() + kVar.getPaddingBottom();
        ViewGroup.LayoutParams layoutParams = kVar.getLayoutParams();
        return f(kVar.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingTop);
    }

    private final int h() {
        k kVar = (k) this.f9662a.get();
        if (kVar == null) {
            return Integer.MIN_VALUE;
        }
        int paddingLeft = kVar.getPaddingLeft() + kVar.getPaddingRight();
        ViewGroup.LayoutParams layoutParams = kVar.getLayoutParams();
        return f(kVar.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingLeft);
    }

    private final boolean i(int i10) {
        return i10 > 0 || i10 == Integer.MIN_VALUE;
    }

    private final boolean j(int i10, int i11) {
        return i(i10) && i(i11);
    }

    private final void k(int i10, int i11) {
        Iterator it = new ArrayList(this.f9663b).iterator();
        while (it.hasNext()) {
            ((A2.c) it.next()).c(i10, i11);
        }
    }

    public final void c() {
        if (this.f9663b.isEmpty()) {
            return;
        }
        int h10 = h();
        int g10 = g();
        if (j(h10, g10)) {
            k(h10, g10);
            d();
        }
    }

    public final void d() {
        k kVar = (k) this.f9662a.get();
        ViewTreeObserver viewTreeObserver = kVar != null ? kVar.getViewTreeObserver() : null;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this.f9665d);
        }
        this.f9665d = null;
        this.f9663b.clear();
    }

    public final void e(A2.c cb2) {
        Intrinsics.checkNotNullParameter(cb2, "cb");
        k kVar = (k) this.f9662a.get();
        if (kVar == null) {
            return;
        }
        int h10 = h();
        int g10 = g();
        if (j(h10, g10)) {
            cb2.c(h10, g10);
            return;
        }
        if (!this.f9663b.contains(cb2)) {
            this.f9663b.add(cb2);
        }
        if (this.f9665d == null) {
            ViewTreeObserver viewTreeObserver = kVar.getViewTreeObserver();
            b bVar = new b(this);
            this.f9665d = bVar;
            viewTreeObserver.addOnPreDrawListener(bVar);
        }
    }

    public final void l(A2.c cb2) {
        Intrinsics.checkNotNullParameter(cb2, "cb");
        this.f9663b.remove(cb2);
    }
}
