package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import q.AbstractC3898a;

@Deprecated
/* loaded from: classes.dex */
public class BrowserActionsFallbackMenuView extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private final int f14276a;

    /* renamed from: b, reason: collision with root package name */
    private final int f14277b;

    public BrowserActionsFallbackMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14276a = getResources().getDimensionPixelOffset(AbstractC3898a.f38732b);
        this.f14277b = getResources().getDimensionPixelOffset(AbstractC3898a.f38731a);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.f14276a * 2), this.f14277b), 1073741824), i11);
    }
}
