package co.hyperverge.hypersnapsdk.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import co.hyperverge.hypersnapsdk.R;

/* loaded from: classes.dex */
public class CrossHairView extends View {
    private Drawable crossHair;
    private Drawable crossHairFocused;
    private Runnable hideCrosshair;
    private boolean isFocused;
    private boolean isShowing;

    /* renamed from: x, reason: collision with root package name */
    private int f19814x;

    /* renamed from: y, reason: collision with root package name */
    private int f19815y;

    public CrossHairView(Context context) {
        super(context);
        this.hideCrosshair = new Runnable() { // from class: co.hyperverge.hypersnapsdk.views.CrossHairView.1
            @Override // java.lang.Runnable
            public void run() {
                CrossHairView.this.isShowing = false;
                CrossHairView.this.invalidate();
            }
        };
        init();
    }

    private void init() {
        this.crossHair = getContext().getResources().getDrawable(R.drawable.ic_camera_focus_white_svg);
        this.crossHairFocused = getContext().getResources().getDrawable(R.drawable.ic_camera_focus_white_svg);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.isShowing) {
            int intrinsicWidth = this.crossHair.getIntrinsicWidth();
            int intrinsicHeight = this.crossHair.getIntrinsicHeight();
            if (this.isFocused) {
                Drawable drawable = this.crossHairFocused;
                int i10 = this.f19814x;
                int i11 = intrinsicWidth / 2;
                int i12 = this.f19815y;
                int i13 = intrinsicHeight / 2;
                drawable.setBounds(i10 - i11, i12 - i13, i10 + i11, i12 + i13);
                this.crossHairFocused.draw(canvas);
                return;
            }
            Drawable drawable2 = this.crossHair;
            int i14 = this.f19814x;
            int i15 = intrinsicWidth / 2;
            int i16 = this.f19815y;
            int i17 = intrinsicHeight / 2;
            drawable2.setBounds(i14 - i15, i16 - i17, i14 + i15, i16 + i17);
            this.crossHair.draw(canvas);
        }
    }

    public void showCrosshair(float f10, float f11, boolean z10) {
        this.isFocused = z10;
        showCrosshair(f10, f11);
    }

    public void showCrosshair(float f10, float f11) {
        this.f19814x = (int) f10;
        this.f19815y = (int) f11;
        removeCallbacks(this.hideCrosshair);
        this.isShowing = true;
        invalidate();
        postDelayed(this.hideCrosshair, 1000L);
    }
}
