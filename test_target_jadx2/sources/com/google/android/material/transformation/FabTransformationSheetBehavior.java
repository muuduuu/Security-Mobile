package com.google.android.material.transformation;

import H7.a;
import I7.g;
import I7.i;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AbstractC1484a0;
import com.google.android.material.transformation.FabTransformationBehavior;
import java.util.HashMap;
import java.util.Map;

@Deprecated
/* loaded from: classes2.dex */
public class FabTransformationSheetBehavior extends FabTransformationBehavior {

    /* renamed from: i, reason: collision with root package name */
    private Map f27823i;

    public FabTransformationSheetBehavior() {
    }

    private void b0(View view, boolean z10) {
        ViewParent parent = view.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z10) {
                this.f27823i = new HashMap(childCount);
            }
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                boolean z11 = (childAt.getLayoutParams() instanceof CoordinatorLayout.f) && (((CoordinatorLayout.f) childAt.getLayoutParams()).f() instanceof FabTransformationScrimBehavior);
                if (childAt != view && !z11) {
                    if (z10) {
                        this.f27823i.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        AbstractC1484a0.B0(childAt, 4);
                    } else {
                        Map map = this.f27823i;
                        if (map != null && map.containsKey(childAt)) {
                            AbstractC1484a0.B0(childAt, ((Integer) this.f27823i.get(childAt)).intValue());
                        }
                    }
                }
            }
            if (z10) {
                return;
            }
            this.f27823i = null;
        }
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior, com.google.android.material.transformation.ExpandableBehavior
    protected boolean H(View view, View view2, boolean z10, boolean z11) {
        b0(view2, z10);
        return super.H(view, view2, z10, z11);
    }

    @Override // com.google.android.material.transformation.FabTransformationBehavior
    protected FabTransformationBehavior.b Z(Context context, boolean z10) {
        int i10 = z10 ? a.f3108d : a.f3107c;
        FabTransformationBehavior.b bVar = new FabTransformationBehavior.b();
        bVar.f27816a = g.c(context, i10);
        bVar.f27817b = new i(17, 0.0f, 0.0f);
        return bVar;
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
