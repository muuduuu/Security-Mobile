package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.T;
import androidx.core.view.AbstractC1484a0;
import androidx.core.view.AbstractC1518s;
import g.AbstractC3175f;

/* loaded from: classes.dex */
public class AlertDialogLayout extends T {
    public AlertDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void A(View view, int i10, int i11, int i12, int i13) {
        view.layout(i10, i11, i12 + i10, i13 + i11);
    }

    private static int B(View view) {
        int B10 = AbstractC1484a0.B(view);
        if (B10 > 0) {
            return B10;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 1) {
                return B(viewGroup.getChildAt(0));
            }
        }
        return 0;
    }

    private boolean C(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int childCount = getChildCount();
        View view = null;
        View view2 = null;
        View view3 = null;
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                int id2 = childAt.getId();
                if (id2 == AbstractC3175f.f33175Q) {
                    view = childAt;
                } else if (id2 == AbstractC3175f.f33187l) {
                    view2 = childAt;
                } else {
                    if ((id2 != AbstractC3175f.f33189n && id2 != AbstractC3175f.f33191p) || view3 != null) {
                        return false;
                    }
                    view3 = childAt;
                }
            }
        }
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i10);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (view != null) {
            view.measure(i10, 0);
            paddingTop += view.getMeasuredHeight();
            i12 = View.combineMeasuredStates(0, view.getMeasuredState());
        } else {
            i12 = 0;
        }
        if (view2 != null) {
            view2.measure(i10, 0);
            i13 = B(view2);
            i14 = view2.getMeasuredHeight() - i13;
            paddingTop += i13;
            i12 = View.combineMeasuredStates(i12, view2.getMeasuredState());
        } else {
            i13 = 0;
            i14 = 0;
        }
        if (view3 != null) {
            view3.measure(i10, mode == 0 ? 0 : View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingTop), mode));
            i15 = view3.getMeasuredHeight();
            paddingTop += i15;
            i12 = View.combineMeasuredStates(i12, view3.getMeasuredState());
        } else {
            i15 = 0;
        }
        int i17 = size - paddingTop;
        if (view2 != null) {
            int i18 = paddingTop - i13;
            int min = Math.min(i17, i14);
            if (min > 0) {
                i17 -= min;
                i13 += min;
            }
            view2.measure(i10, View.MeasureSpec.makeMeasureSpec(i13, 1073741824));
            paddingTop = i18 + view2.getMeasuredHeight();
            i12 = View.combineMeasuredStates(i12, view2.getMeasuredState());
        }
        if (view3 != null && i17 > 0) {
            view3.measure(i10, View.MeasureSpec.makeMeasureSpec(i15 + i17, mode));
            paddingTop = (paddingTop - i15) + view3.getMeasuredHeight();
            i12 = View.combineMeasuredStates(i12, view3.getMeasuredState());
        }
        int i19 = 0;
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt2 = getChildAt(i20);
            if (childAt2.getVisibility() != 8) {
                i19 = Math.max(i19, childAt2.getMeasuredWidth());
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(i19 + getPaddingLeft() + getPaddingRight(), i10, i12), View.resolveSizeAndState(paddingTop, i11, 0));
        if (mode2 == 1073741824) {
            return true;
        }
        l(childCount, i11);
        return true;
    }

    private void l(int i10, int i11) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i12 = 0; i12 < i10; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                T.a aVar = (T.a) childAt.getLayoutParams();
                if (((LinearLayout.LayoutParams) aVar).width == -1) {
                    int i13 = ((LinearLayout.LayoutParams) aVar).height;
                    ((LinearLayout.LayoutParams) aVar).height = childAt.getMeasuredHeight();
                    measureChildWithMargins(childAt, makeMeasureSpec, 0, i11, 0);
                    ((LinearLayout.LayoutParams) aVar).height = i13;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00a9  */
    @Override // androidx.appcompat.widget.T, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int paddingLeft = getPaddingLeft();
        int i17 = i12 - i10;
        int paddingRight = i17 - getPaddingRight();
        int paddingRight2 = (i17 - paddingLeft) - getPaddingRight();
        int measuredHeight = getMeasuredHeight();
        int childCount = getChildCount();
        int gravity = getGravity();
        int i18 = gravity & 112;
        int i19 = gravity & 8388615;
        int paddingTop = i18 != 16 ? i18 != 80 ? getPaddingTop() : ((getPaddingTop() + i13) - i11) - measuredHeight : getPaddingTop() + (((i13 - i11) - measuredHeight) / 2);
        Drawable dividerDrawable = getDividerDrawable();
        int intrinsicHeight = dividerDrawable == null ? 0 : dividerDrawable.getIntrinsicHeight();
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt = getChildAt(i20);
            if (childAt != null && childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight2 = childAt.getMeasuredHeight();
                T.a aVar = (T.a) childAt.getLayoutParams();
                int i21 = ((LinearLayout.LayoutParams) aVar).gravity;
                if (i21 < 0) {
                    i21 = i19;
                }
                int b10 = AbstractC1518s.b(i21, getLayoutDirection()) & 7;
                if (b10 == 1) {
                    i14 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((LinearLayout.LayoutParams) aVar).leftMargin;
                    i15 = ((LinearLayout.LayoutParams) aVar).rightMargin;
                } else if (b10 != 5) {
                    i16 = ((LinearLayout.LayoutParams) aVar).leftMargin + paddingLeft;
                    if (t(i20)) {
                        paddingTop += intrinsicHeight;
                    }
                    int i22 = paddingTop + ((LinearLayout.LayoutParams) aVar).topMargin;
                    A(childAt, i16, i22, measuredWidth, measuredHeight2);
                    paddingTop = i22 + measuredHeight2 + ((LinearLayout.LayoutParams) aVar).bottomMargin;
                } else {
                    i14 = paddingRight - measuredWidth;
                    i15 = ((LinearLayout.LayoutParams) aVar).rightMargin;
                }
                i16 = i14 - i15;
                if (t(i20)) {
                }
                int i222 = paddingTop + ((LinearLayout.LayoutParams) aVar).topMargin;
                A(childAt, i16, i222, measuredWidth, measuredHeight2);
                paddingTop = i222 + measuredHeight2 + ((LinearLayout.LayoutParams) aVar).bottomMargin;
            }
        }
    }

    @Override // androidx.appcompat.widget.T, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (C(i10, i11)) {
            return;
        }
        super.onMeasure(i10, i11);
    }
}
