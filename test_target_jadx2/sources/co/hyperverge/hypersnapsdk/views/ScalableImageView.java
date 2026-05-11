package co.hyperverge.hypersnapsdk.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import co.hyperverge.hypersnapsdk.utils.UIUtils;

/* loaded from: classes.dex */
public class ScalableImageView extends ImageView {
    public ScalableImageView(Context context) {
        super(context);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (getDrawable() == null) {
            super.onMeasure(i10, i11);
            return;
        }
        int dpToPx = UIUtils.dpToPx(getContext(), 120.0f);
        if (UIUtils.hasNavBar(getContext())) {
            dpToPx = UIUtils.dpToPx(getContext(), 100.0f);
        }
        setMeasuredDimension(dpToPx, dpToPx);
    }

    public ScalableImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ScalableImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
