package org.reactnative.maskedview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.view.View;
import com.facebook.react.views.view.j;

/* loaded from: classes3.dex */
public class a extends j {

    /* renamed from: a, reason: collision with root package name */
    private Bitmap f38068a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f38069b;

    /* renamed from: c, reason: collision with root package name */
    private Paint f38070c;

    /* renamed from: d, reason: collision with root package name */
    private PorterDuffXfermode f38071d;

    /* renamed from: e, reason: collision with root package name */
    private int f38072e;

    public a(Context context) {
        super(context);
        this.f38068a = null;
        this.f38069b = false;
        this.f38072e = 2;
        this.f38070c = new Paint(1);
        this.f38071d = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
    }

    public static Bitmap r(View view) {
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        if (view.getMeasuredWidth() <= 0 || view.getMeasuredHeight() <= 0) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(view.getMeasuredWidth(), view.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        view.draw(new Canvas(createBitmap));
        return createBitmap;
    }

    private void s() {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setVisibility(0);
            Bitmap bitmap = this.f38068a;
            if (bitmap != null) {
                bitmap.recycle();
            }
            this.f38068a = r(childAt);
            childAt.setVisibility(4);
        }
    }

    @Override // com.facebook.react.views.view.j, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f38069b) {
            s();
            this.f38069b = false;
        }
        if (this.f38068a != null) {
            setLayerType(this.f38072e, this.f38070c);
            this.f38070c.setXfermode(this.f38071d);
            canvas.drawBitmap(this.f38068a, 0.0f, 0.0f, this.f38070c);
            this.f38070c.setXfermode(null);
        }
    }

    @Override // com.facebook.react.views.view.j, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f38069b = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onDescendantInvalidated(View view, View view2) {
        View childAt;
        super.onDescendantInvalidated(view, view2);
        if (!this.f38069b && (childAt = getChildAt(0)) != null && childAt.equals(view)) {
            this.f38069b = true;
        }
        invalidate();
    }

    @Override // com.facebook.react.views.view.j, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            this.f38069b = true;
        }
    }

    public void setRenderingMode(String str) {
        this.f38072e = str.equals("software") ? 1 : 2;
    }
}
