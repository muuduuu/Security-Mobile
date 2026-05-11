package J7;

import H7.d;
import H7.f;
import H7.j;
import J7.b;
import Y7.g;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.AbstractC1484a0;
import com.google.android.material.internal.k;
import com.google.android.material.internal.m;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
public class a extends Drawable implements k.b {

    /* renamed from: n, reason: collision with root package name */
    private static final int f4805n = H7.k.f3337m;

    /* renamed from: o, reason: collision with root package name */
    private static final int f4806o = H7.b.f3131d;

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f4807a;

    /* renamed from: b, reason: collision with root package name */
    private final g f4808b;

    /* renamed from: c, reason: collision with root package name */
    private final k f4809c;

    /* renamed from: d, reason: collision with root package name */
    private final Rect f4810d;

    /* renamed from: e, reason: collision with root package name */
    private final b f4811e;

    /* renamed from: f, reason: collision with root package name */
    private float f4812f;

    /* renamed from: g, reason: collision with root package name */
    private float f4813g;

    /* renamed from: h, reason: collision with root package name */
    private int f4814h;

    /* renamed from: i, reason: collision with root package name */
    private float f4815i;

    /* renamed from: j, reason: collision with root package name */
    private float f4816j;

    /* renamed from: k, reason: collision with root package name */
    private float f4817k;

    /* renamed from: l, reason: collision with root package name */
    private WeakReference f4818l;

    /* renamed from: m, reason: collision with root package name */
    private WeakReference f4819m;

    /* renamed from: J7.a$a, reason: collision with other inner class name */
    class RunnableC0095a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f4820a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ FrameLayout f4821b;

        RunnableC0095a(View view, FrameLayout frameLayout) {
            this.f4820a = view;
            this.f4821b = frameLayout;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.y(this.f4820a, this.f4821b);
        }
    }

    private a(Context context, int i10, int i11, int i12, b.a aVar) {
        this.f4807a = new WeakReference(context);
        m.c(context);
        this.f4810d = new Rect();
        this.f4808b = new g();
        k kVar = new k(this);
        this.f4809c = kVar;
        kVar.e().setTextAlign(Paint.Align.CENTER);
        v(H7.k.f3328d);
        this.f4811e = new b(context, i10, i11, i12, aVar);
        t();
    }

    private void A() {
        this.f4814h = ((int) Math.pow(10.0d, h() - 1.0d)) - 1;
    }

    private void b(Context context, Rect rect, View view) {
        int k10 = k();
        int f10 = this.f4811e.f();
        if (f10 == 8388691 || f10 == 8388693) {
            this.f4813g = rect.bottom - k10;
        } else {
            this.f4813g = rect.top + k10;
        }
        if (i() <= 9) {
            float f11 = !l() ? this.f4811e.f4825c : this.f4811e.f4826d;
            this.f4815i = f11;
            this.f4817k = f11;
            this.f4816j = f11;
        } else {
            float f12 = this.f4811e.f4826d;
            this.f4815i = f12;
            this.f4817k = f12;
            this.f4816j = (this.f4809c.f(e()) / 2.0f) + this.f4811e.f4827e;
        }
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(l() ? d.f3171H : d.f3168E);
        int j10 = j();
        int f13 = this.f4811e.f();
        if (f13 == 8388659 || f13 == 8388691) {
            this.f4812f = AbstractC1484a0.A(view) == 0 ? (rect.left - this.f4816j) + dimensionPixelSize + j10 : ((rect.right + this.f4816j) - dimensionPixelSize) - j10;
        } else {
            this.f4812f = AbstractC1484a0.A(view) == 0 ? ((rect.right + this.f4816j) - dimensionPixelSize) - j10 : (rect.left - this.f4816j) + dimensionPixelSize + j10;
        }
    }

    public static a c(Context context) {
        return new a(context, 0, f4806o, f4805n, null);
    }

    private void d(Canvas canvas) {
        Rect rect = new Rect();
        String e10 = e();
        this.f4809c.e().getTextBounds(e10, 0, e10.length(), rect);
        canvas.drawText(e10, this.f4812f, this.f4813g + (rect.height() / 2), this.f4809c.e());
    }

    private String e() {
        if (i() <= this.f4814h) {
            return NumberFormat.getInstance(this.f4811e.o()).format(i());
        }
        Context context = (Context) this.f4807a.get();
        return context == null ? BuildConfig.FLAVOR : String.format(this.f4811e.o(), context.getString(j.f3315l), Integer.valueOf(this.f4814h), "+");
    }

    private int j() {
        return (l() ? this.f4811e.k() : this.f4811e.l()) + this.f4811e.b();
    }

    private int k() {
        return (l() ? this.f4811e.p() : this.f4811e.q()) + this.f4811e.c();
    }

    private void m() {
        this.f4809c.e().setAlpha(getAlpha());
        invalidateSelf();
    }

    private void n() {
        ColorStateList valueOf = ColorStateList.valueOf(this.f4811e.e());
        if (this.f4808b.x() != valueOf) {
            this.f4808b.X(valueOf);
            invalidateSelf();
        }
    }

    private void o() {
        WeakReference weakReference = this.f4818l;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        View view = (View) this.f4818l.get();
        WeakReference weakReference2 = this.f4819m;
        y(view, weakReference2 != null ? (FrameLayout) weakReference2.get() : null);
    }

    private void p() {
        this.f4809c.e().setColor(this.f4811e.g());
        invalidateSelf();
    }

    private void q() {
        A();
        this.f4809c.i(true);
        z();
        invalidateSelf();
    }

    private void r() {
        this.f4809c.i(true);
        z();
        invalidateSelf();
    }

    private void s() {
        boolean s10 = this.f4811e.s();
        setVisible(s10, false);
        if (!c.f4846a || g() == null || s10) {
            return;
        }
        ((ViewGroup) g().getParent()).invalidate();
    }

    private void t() {
        q();
        r();
        m();
        n();
        p();
        o();
        z();
        s();
    }

    private void u(V7.d dVar) {
        Context context;
        if (this.f4809c.d() == dVar || (context = (Context) this.f4807a.get()) == null) {
            return;
        }
        this.f4809c.h(dVar, context);
        z();
    }

    private void v(int i10) {
        Context context = (Context) this.f4807a.get();
        if (context == null) {
            return;
        }
        u(new V7.d(context, i10));
    }

    private void w(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup == null || viewGroup.getId() != f.f3270v) {
            WeakReference weakReference = this.f4819m;
            if (weakReference == null || weakReference.get() != viewGroup) {
                x(view);
                FrameLayout frameLayout = new FrameLayout(view.getContext());
                frameLayout.setId(f.f3270v);
                frameLayout.setClipChildren(false);
                frameLayout.setClipToPadding(false);
                frameLayout.setLayoutParams(view.getLayoutParams());
                frameLayout.setMinimumWidth(view.getWidth());
                frameLayout.setMinimumHeight(view.getHeight());
                int indexOfChild = viewGroup.indexOfChild(view);
                viewGroup.removeViewAt(indexOfChild);
                view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                frameLayout.addView(view);
                viewGroup.addView(frameLayout, indexOfChild);
                this.f4819m = new WeakReference(frameLayout);
                frameLayout.post(new RunnableC0095a(view, frameLayout));
            }
        }
    }

    private static void x(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
    }

    private void z() {
        Context context = (Context) this.f4807a.get();
        WeakReference weakReference = this.f4818l;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (context == null || view == null) {
            return;
        }
        Rect rect = new Rect();
        rect.set(this.f4810d);
        Rect rect2 = new Rect();
        view.getDrawingRect(rect2);
        WeakReference weakReference2 = this.f4819m;
        ViewGroup viewGroup = weakReference2 != null ? (FrameLayout) weakReference2.get() : null;
        if (viewGroup != null || c.f4846a) {
            if (viewGroup == null) {
                viewGroup = (ViewGroup) view.getParent();
            }
            viewGroup.offsetDescendantRectToMyCoords(view, rect2);
        }
        b(context, rect2, view);
        c.d(this.f4810d, this.f4812f, this.f4813g, this.f4816j, this.f4817k);
        this.f4808b.U(this.f4815i);
        if (rect.equals(this.f4810d)) {
            return;
        }
        this.f4808b.setBounds(this.f4810d);
    }

    @Override // com.google.android.material.internal.k.b
    public void a() {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (getBounds().isEmpty() || getAlpha() == 0 || !isVisible()) {
            return;
        }
        this.f4808b.draw(canvas);
        if (l()) {
            d(canvas);
        }
    }

    public CharSequence f() {
        Context context;
        if (!isVisible()) {
            return null;
        }
        if (!l()) {
            return this.f4811e.i();
        }
        if (this.f4811e.j() == 0 || (context = (Context) this.f4807a.get()) == null) {
            return null;
        }
        return i() <= this.f4814h ? context.getResources().getQuantityString(this.f4811e.j(), i(), Integer.valueOf(i())) : context.getString(this.f4811e.h(), Integer.valueOf(this.f4814h));
    }

    public FrameLayout g() {
        WeakReference weakReference = this.f4819m;
        if (weakReference != null) {
            return (FrameLayout) weakReference.get();
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f4811e.d();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f4810d.height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f4810d.width();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public int h() {
        return this.f4811e.m();
    }

    public int i() {
        if (l()) {
            return this.f4811e.n();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return false;
    }

    public boolean l() {
        return this.f4811e.r();
    }

    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.k.b
    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f4811e.u(i10);
        m();
    }

    public void y(View view, FrameLayout frameLayout) {
        this.f4818l = new WeakReference(view);
        boolean z10 = c.f4846a;
        if (z10 && frameLayout == null) {
            w(view);
        } else {
            this.f4819m = new WeakReference(frameLayout);
        }
        if (!z10) {
            x(view);
        }
        z();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
