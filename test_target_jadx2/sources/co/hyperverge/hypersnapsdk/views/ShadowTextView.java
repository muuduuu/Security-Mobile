package co.hyperverge.hypersnapsdk.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import co.hyperverge.hypersnapsdk.R;

/* loaded from: classes.dex */
public class ShadowTextView extends TextView {
    private int shadowColor;
    private float shadowDy;
    private float shadowRadius;
    private int textColor;

    public ShadowTextView(Context context) {
        super(context);
        this.shadowColor = R.color.shadow_color;
        this.textColor = R.color.hv_white;
        this.shadowDy = 2.0f;
        this.shadowRadius = 4.0f;
        init();
    }

    public void init() {
    }

    public void setShadow(boolean z10) {
        if (z10) {
            setTextAppearance(getContext(), R.style.TextviewShadow);
        }
    }

    public ShadowTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.shadowColor = R.color.shadow_color;
        this.textColor = R.color.hv_white;
        this.shadowDy = 2.0f;
        this.shadowRadius = 4.0f;
        init();
    }

    public ShadowTextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.shadowColor = R.color.shadow_color;
        this.textColor = R.color.hv_white;
        this.shadowDy = 2.0f;
        this.shadowRadius = 4.0f;
        init();
    }
}
