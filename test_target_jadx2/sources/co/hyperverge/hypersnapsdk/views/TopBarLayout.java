package co.hyperverge.hypersnapsdk.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import co.hyperverge.hypersnapsdk.R;
import co.hyperverge.hypersnapsdk.utils.UIUtils;

/* loaded from: classes.dex */
public class TopBarLayout extends LinearLayout {
    int numberOfButtons;

    public TopBarLayout(Context context) {
        super(context);
        this.numberOfButtons = 3;
        if (isInEditMode()) {
            return;
        }
        init();
    }

    private void init() {
        int i10 = 0;
        setOrientation(0);
        while (i10 < this.numberOfButtons) {
            View inflate = View.inflate(getContext(), R.layout.view_top_tick, null);
            if (i10 == 0) {
                setCustomBackground(inflate, R.drawable.circular_dots);
            } else {
                setCustomBackground(inflate, R.drawable.grey_dots);
            }
            int i11 = i10 + 1;
            inflate.setTag("dot" + i11);
            addView(inflate);
            if (i10 < 2) {
                View inflate2 = View.inflate(getContext(), R.layout.view_bar, null);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(UIUtils.dpToPx(getContext(), 40.0f), UIUtils.dpToPx(getContext(), 1.0f));
                layoutParams.gravity = 17;
                inflate2.setTag("bar" + i11);
                inflate2.setLayoutParams(layoutParams);
                addView(inflate2);
            }
            i10 = i11;
        }
    }

    public void resetViewsToOriginalState() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (i10 % 2 != 0) {
                childAt.setBackgroundColor(getResources().getColor(R.color.grey_circle));
            } else if (i10 == 0) {
                setCustomBackground(childAt, R.drawable.circular_dots);
            } else {
                setCustomBackground(childAt, R.drawable.grey_dots);
            }
        }
    }

    public void setCustomBackground(View view, int i10) {
        view.setBackground(getContext().getDrawable(i10));
    }

    public void updateAttemptView(int i10) {
        View findViewWithTag = findViewWithTag("dot" + i10);
        if (findViewWithTag != null) {
            setCustomBackground(findViewWithTag, R.drawable.green_dots);
            if (i10 < 3) {
                setCustomBackground(findViewWithTag("dot" + (i10 + 1)), R.drawable.circular_dots);
                findViewWithTag("bar" + i10).setBackgroundColor(getResources().getColor(R.color.progress_green));
            }
        }
    }

    public TopBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.numberOfButtons = 3;
        if (isInEditMode()) {
            return;
        }
        init();
    }

    public TopBarLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.numberOfButtons = 3;
        if (isInEditMode()) {
            return;
        }
        init();
    }
}
