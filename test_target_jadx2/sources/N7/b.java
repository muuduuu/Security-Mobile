package N7;

import H7.k;
import Y7.g;
import a8.AbstractC1367a;
import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import android.widget.ListAdapter;
import androidx.appcompat.app.c;
import androidx.appcompat.view.d;
import androidx.core.view.AbstractC1484a0;

/* loaded from: classes2.dex */
public class b extends c.a {

    /* renamed from: e, reason: collision with root package name */
    private static final int f6571e = H7.b.f3128a;

    /* renamed from: f, reason: collision with root package name */
    private static final int f6572f = k.f3325a;

    /* renamed from: g, reason: collision with root package name */
    private static final int f6573g = H7.b.f3151x;

    /* renamed from: c, reason: collision with root package name */
    private Drawable f6574c;

    /* renamed from: d, reason: collision with root package name */
    private final Rect f6575d;

    public b(Context context) {
        this(context, 0);
    }

    private static Context r(Context context) {
        int s10 = s(context);
        Context c10 = AbstractC1367a.c(context, null, f6571e, f6572f);
        return s10 == 0 ? c10 : new d(c10, s10);
    }

    private static int s(Context context) {
        TypedValue a10 = V7.b.a(context, f6573g);
        if (a10 == null) {
            return 0;
        }
        return a10.data;
    }

    private static int t(Context context, int i10) {
        return i10 == 0 ? s(context) : i10;
    }

    @Override // androidx.appcompat.app.c.a
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public b i(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        return (b) super.i(charSequence, onClickListener);
    }

    @Override // androidx.appcompat.app.c.a
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public b j(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        return (b) super.j(charSequence, onClickListener);
    }

    @Override // androidx.appcompat.app.c.a
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public b k(DialogInterface.OnKeyListener onKeyListener) {
        return (b) super.k(onKeyListener);
    }

    @Override // androidx.appcompat.app.c.a
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public b l(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        return (b) super.l(charSequence, onClickListener);
    }

    @Override // androidx.appcompat.app.c.a
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public b m(ListAdapter listAdapter, int i10, DialogInterface.OnClickListener onClickListener) {
        return (b) super.m(listAdapter, i10, onClickListener);
    }

    @Override // androidx.appcompat.app.c.a
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public b n(int i10) {
        return (b) super.n(i10);
    }

    @Override // androidx.appcompat.app.c.a
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public b o(CharSequence charSequence) {
        return (b) super.o(charSequence);
    }

    @Override // androidx.appcompat.app.c.a
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public b p(View view) {
        return (b) super.p(view);
    }

    @Override // androidx.appcompat.app.c.a
    public androidx.appcompat.app.c a() {
        androidx.appcompat.app.c a10 = super.a();
        Window window = a10.getWindow();
        View decorView = window.getDecorView();
        Drawable drawable = this.f6574c;
        if (drawable instanceof g) {
            ((g) drawable).W(AbstractC1484a0.v(decorView));
        }
        window.setBackgroundDrawable(c.b(this.f6574c, this.f6575d));
        decorView.setOnTouchListener(new a(a10, this.f6575d));
        return a10;
    }

    @Override // androidx.appcompat.app.c.a
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public b c(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
        return (b) super.c(listAdapter, onClickListener);
    }

    @Override // androidx.appcompat.app.c.a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public b d(boolean z10) {
        return (b) super.d(z10);
    }

    @Override // androidx.appcompat.app.c.a
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public b e(View view) {
        return (b) super.e(view);
    }

    @Override // androidx.appcompat.app.c.a
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public b f(Drawable drawable) {
        return (b) super.f(drawable);
    }

    @Override // androidx.appcompat.app.c.a
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public b g(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
        return (b) super.g(charSequenceArr, onClickListener);
    }

    @Override // androidx.appcompat.app.c.a
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public b h(CharSequence charSequence) {
        return (b) super.h(charSequence);
    }

    public b(Context context, int i10) {
        super(r(context), t(context, i10));
        Context b10 = b();
        Resources.Theme theme = b10.getTheme();
        int i11 = f6571e;
        int i12 = f6572f;
        this.f6575d = c.a(b10, i11, i12);
        int c10 = M7.a.c(b10, H7.b.f3143p, getClass().getCanonicalName());
        g gVar = new g(b10, null, i11, i12);
        gVar.M(b10);
        gVar.X(ColorStateList.valueOf(c10));
        if (Build.VERSION.SDK_INT >= 28) {
            TypedValue typedValue = new TypedValue();
            theme.resolveAttribute(R.attr.dialogCornerRadius, typedValue, true);
            float dimension = typedValue.getDimension(b().getResources().getDisplayMetrics());
            if (typedValue.type == 5 && dimension >= 0.0f) {
                gVar.U(dimension);
            }
        }
        this.f6574c = gVar;
    }
}
