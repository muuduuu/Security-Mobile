package C3;

import C3.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import b3.j;

/* loaded from: classes.dex */
public abstract class c extends ImageView {

    /* renamed from: g, reason: collision with root package name */
    private static boolean f880g = false;

    /* renamed from: a, reason: collision with root package name */
    private final a.C0014a f881a;

    /* renamed from: b, reason: collision with root package name */
    private float f882b;

    /* renamed from: c, reason: collision with root package name */
    private b f883c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f884d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f885e;

    /* renamed from: f, reason: collision with root package name */
    private Object f886f;

    public c(Context context) {
        super(context);
        this.f881a = new a.C0014a();
        this.f882b = 0.0f;
        this.f884d = false;
        this.f885e = false;
        this.f886f = null;
        c(context);
    }

    private void c(Context context) {
        try {
            if (n4.b.d()) {
                n4.b.a("DraweeView#init");
            }
            if (this.f884d) {
                if (n4.b.d()) {
                    n4.b.b();
                    return;
                }
                return;
            }
            boolean z10 = true;
            this.f884d = true;
            this.f883c = b.d(null, context);
            ColorStateList imageTintList = getImageTintList();
            if (imageTintList == null) {
                if (n4.b.d()) {
                    n4.b.b();
                    return;
                }
                return;
            }
            setColorFilter(imageTintList.getDefaultColor());
            if (!f880g || context.getApplicationInfo().targetSdkVersion < 24) {
                z10 = false;
            }
            this.f885e = z10;
            if (n4.b.d()) {
                n4.b.b();
            }
        } catch (Throwable th) {
            if (n4.b.d()) {
                n4.b.b();
            }
            throw th;
        }
    }

    private void d() {
        Drawable drawable;
        if (!this.f885e || (drawable = getDrawable()) == null) {
            return;
        }
        drawable.setVisible(getVisibility() == 0, false);
    }

    public static void setGlobalLegacyVisibilityHandlingEnabled(boolean z10) {
        f880g = z10;
    }

    protected void a() {
        this.f883c.j();
    }

    protected void b() {
        this.f883c.k();
    }

    protected void e() {
        a();
    }

    protected void f() {
        b();
    }

    public float getAspectRatio() {
        return this.f882b;
    }

    public B3.a getController() {
        return this.f883c.f();
    }

    public Object getExtraData() {
        return this.f886f;
    }

    public B3.b getHierarchy() {
        return this.f883c.g();
    }

    public Drawable getTopLevelDrawable() {
        return this.f883c.h();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        d();
        e();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d();
        f();
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        d();
        e();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i10, int i11) {
        a.C0014a c0014a = this.f881a;
        c0014a.f872a = i10;
        c0014a.f873b = i11;
        a.b(c0014a, this.f882b, getLayoutParams(), getPaddingLeft() + getPaddingRight(), getPaddingTop() + getPaddingBottom());
        a.C0014a c0014a2 = this.f881a;
        super.onMeasure(c0014a2.f872a, c0014a2.f873b);
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        d();
        f();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f883c.l(motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        d();
    }

    public void setAspectRatio(float f10) {
        if (f10 == this.f882b) {
            return;
        }
        this.f882b = f10;
        requestLayout();
    }

    public void setController(B3.a aVar) {
        this.f883c.o(aVar);
        super.setImageDrawable(this.f883c.h());
    }

    public void setExtraData(Object obj) {
        this.f886f = obj;
    }

    public void setHierarchy(B3.b bVar) {
        this.f883c.p(bVar);
        super.setImageDrawable(this.f883c.h());
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageBitmap(Bitmap bitmap) {
        c(getContext());
        this.f883c.n();
        super.setImageBitmap(bitmap);
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageDrawable(Drawable drawable) {
        c(getContext());
        this.f883c.n();
        super.setImageDrawable(drawable);
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageResource(int i10) {
        c(getContext());
        this.f883c.n();
        super.setImageResource(i10);
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageURI(Uri uri) {
        c(getContext());
        this.f883c.n();
        super.setImageURI(uri);
    }

    public void setLegacyVisibilityHandlingEnabled(boolean z10) {
        this.f885e = z10;
    }

    @Override // android.view.View
    public String toString() {
        j.a c10 = j.c(this);
        b bVar = this.f883c;
        return c10.b("holder", bVar != null ? bVar.toString() : "<no holder set>").toString();
    }
}
