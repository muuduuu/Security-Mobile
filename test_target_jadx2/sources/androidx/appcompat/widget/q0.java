package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import g.AbstractC3173d;
import g.AbstractC3175f;
import g.AbstractC3176g;
import g.AbstractC3178i;

/* loaded from: classes.dex */
class q0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f14243a;

    /* renamed from: b, reason: collision with root package name */
    private final View f14244b;

    /* renamed from: c, reason: collision with root package name */
    private final TextView f14245c;

    /* renamed from: d, reason: collision with root package name */
    private final WindowManager.LayoutParams f14246d;

    /* renamed from: e, reason: collision with root package name */
    private final Rect f14247e;

    /* renamed from: f, reason: collision with root package name */
    private final int[] f14248f;

    /* renamed from: g, reason: collision with root package name */
    private final int[] f14249g;

    q0(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f14246d = layoutParams;
        this.f14247e = new Rect();
        this.f14248f = new int[2];
        this.f14249g = new int[2];
        this.f14243a = context;
        View inflate = LayoutInflater.from(context).inflate(AbstractC3176g.f33220s, (ViewGroup) null);
        this.f14244b = inflate;
        this.f14245c = (TextView) inflate.findViewById(AbstractC3175f.f33195t);
        layoutParams.setTitle(getClass().getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = AbstractC3178i.f33236a;
        layoutParams.flags = 24;
    }

    private void a(View view, int i10, int i11, boolean z10, WindowManager.LayoutParams layoutParams) {
        int height;
        int i12;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f14243a.getResources().getDimensionPixelOffset(AbstractC3173d.f33111k);
        if (view.getWidth() < dimensionPixelOffset) {
            i10 = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f14243a.getResources().getDimensionPixelOffset(AbstractC3173d.f33110j);
            height = i11 + dimensionPixelOffset2;
            i12 = i11 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i12 = 0;
        }
        layoutParams.gravity = 49;
        int dimensionPixelOffset3 = this.f14243a.getResources().getDimensionPixelOffset(z10 ? AbstractC3173d.f33113m : AbstractC3173d.f33112l);
        View b10 = b(view);
        if (b10 == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            return;
        }
        b10.getWindowVisibleDisplayFrame(this.f14247e);
        Rect rect = this.f14247e;
        if (rect.left < 0 && rect.top < 0) {
            Resources resources = this.f14243a.getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            this.f14247e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        b10.getLocationOnScreen(this.f14249g);
        view.getLocationOnScreen(this.f14248f);
        int[] iArr = this.f14248f;
        int i13 = iArr[0];
        int[] iArr2 = this.f14249g;
        int i14 = i13 - iArr2[0];
        iArr[0] = i14;
        iArr[1] = iArr[1] - iArr2[1];
        layoutParams.x = (i14 + i10) - (b10.getWidth() / 2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f14244b.measure(makeMeasureSpec, makeMeasureSpec);
        int measuredHeight = this.f14244b.getMeasuredHeight();
        int i15 = this.f14248f[1];
        int i16 = ((i12 + i15) - dimensionPixelOffset3) - measuredHeight;
        int i17 = i15 + height + dimensionPixelOffset3;
        if (z10) {
            if (i16 >= 0) {
                layoutParams.y = i16;
                return;
            } else {
                layoutParams.y = i17;
                return;
            }
        }
        if (measuredHeight + i17 <= this.f14247e.height()) {
            layoutParams.y = i17;
        } else {
            layoutParams.y = i16;
        }
    }

    private static View b(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if ((layoutParams instanceof WindowManager.LayoutParams) && ((WindowManager.LayoutParams) layoutParams).type == 2) {
            return rootView;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity) context).getWindow().getDecorView();
            }
        }
        return rootView;
    }

    void c() {
        if (d()) {
            ((WindowManager) this.f14243a.getSystemService("window")).removeView(this.f14244b);
        }
    }

    boolean d() {
        return this.f14244b.getParent() != null;
    }

    void e(View view, int i10, int i11, boolean z10, CharSequence charSequence) {
        if (d()) {
            c();
        }
        this.f14245c.setText(charSequence);
        a(view, i10, i11, z10, this.f14246d);
        ((WindowManager) this.f14243a.getSystemService("window")).addView(this.f14244b, this.f14246d);
    }
}
