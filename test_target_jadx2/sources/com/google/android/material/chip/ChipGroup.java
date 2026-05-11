package com.google.android.material.chip;

import H7.k;
import H7.l;
import a8.AbstractC1367a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.AbstractC1484a0;
import com.google.android.material.internal.a;
import com.google.android.material.internal.m;
import java.util.List;
import java.util.Set;
import z0.C5228A;

/* loaded from: classes2.dex */
public class ChipGroup extends com.google.android.material.internal.e {

    /* renamed from: k, reason: collision with root package name */
    private static final int f26818k = k.f3340p;

    /* renamed from: e, reason: collision with root package name */
    private int f26819e;

    /* renamed from: f, reason: collision with root package name */
    private int f26820f;

    /* renamed from: g, reason: collision with root package name */
    private e f26821g;

    /* renamed from: h, reason: collision with root package name */
    private final com.google.android.material.internal.a f26822h;

    /* renamed from: i, reason: collision with root package name */
    private final int f26823i;

    /* renamed from: j, reason: collision with root package name */
    private final f f26824j;

    class a implements a.b {
        a() {
        }

        @Override // com.google.android.material.internal.a.b
        public void a(Set set) {
            if (ChipGroup.this.f26821g != null) {
                e eVar = ChipGroup.this.f26821g;
                ChipGroup chipGroup = ChipGroup.this;
                eVar.a(chipGroup, chipGroup.f26822h.j(ChipGroup.this));
            }
        }
    }

    class b implements e {
        b(d dVar) {
        }

        @Override // com.google.android.material.chip.ChipGroup.e
        public void a(ChipGroup chipGroup, List list) {
            if (ChipGroup.this.f26822h.l()) {
                ChipGroup.this.getCheckedChipId();
                throw null;
            }
        }
    }

    public static class c extends ViewGroup.MarginLayoutParams {
        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(int i10, int i11) {
            super(i10, i11);
        }
    }

    public interface d {
    }

    public interface e {
        void a(ChipGroup chipGroup, List list);
    }

    private class f implements ViewGroup.OnHierarchyChangeListener {

        /* renamed from: a, reason: collision with root package name */
        private ViewGroup.OnHierarchyChangeListener f26827a;

        private f() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                if (view2.getId() == -1) {
                    view2.setId(AbstractC1484a0.k());
                }
                ChipGroup.this.f26822h.e((Chip) view2);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f26827a;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            ChipGroup chipGroup = ChipGroup.this;
            if (view == chipGroup && (view2 instanceof Chip)) {
                chipGroup.f26822h.n((Chip) view2);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f26827a;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }

        /* synthetic */ f(ChipGroup chipGroup, a aVar) {
            this();
        }
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, H7.b.f3135h);
    }

    private int getChipCount() {
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if (getChildAt(i11) instanceof Chip) {
                i10++;
            }
        }
        return i10;
    }

    @Override // com.google.android.material.internal.e
    public boolean c() {
        return super.c();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof c);
    }

    int g(View view) {
        if (!(view instanceof Chip)) {
            return -1;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if (getChildAt(i11) instanceof Chip) {
                if (((Chip) getChildAt(i11)) == view) {
                    return i10;
                }
                i10++;
            }
        }
        return -1;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new c(-2, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    public int getCheckedChipId() {
        return this.f26822h.k();
    }

    public List<Integer> getCheckedChipIds() {
        return this.f26822h.j(this);
    }

    public int getChipSpacingHorizontal() {
        return this.f26819e;
    }

    public int getChipSpacingVertical() {
        return this.f26820f;
    }

    public boolean h() {
        return this.f26822h.l();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        int i10 = this.f26823i;
        if (i10 != -1) {
            this.f26822h.f(i10);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C5228A.Y0(accessibilityNodeInfo).s0(C5228A.e.b(getRowCount(), c() ? getChipCount() : -1, false, h() ? 1 : 2));
    }

    public void setChipSpacing(int i10) {
        setChipSpacingHorizontal(i10);
        setChipSpacingVertical(i10);
    }

    public void setChipSpacingHorizontal(int i10) {
        if (this.f26819e != i10) {
            this.f26819e = i10;
            setItemSpacing(i10);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i10) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i10));
    }

    public void setChipSpacingResource(int i10) {
        setChipSpacing(getResources().getDimensionPixelOffset(i10));
    }

    public void setChipSpacingVertical(int i10) {
        if (this.f26820f != i10) {
            this.f26820f = i10;
            setLineSpacing(i10);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i10) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i10));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i10) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    @Deprecated
    public void setOnCheckedChangeListener(d dVar) {
        if (dVar == null) {
            setOnCheckedStateChangeListener(null);
        } else {
            setOnCheckedStateChangeListener(new b(dVar));
        }
    }

    public void setOnCheckedStateChangeListener(e eVar) {
        this.f26821g = eVar;
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f26824j.f26827a = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z10) {
        this.f26822h.p(z10);
    }

    @Deprecated
    public void setShowDividerHorizontal(int i10) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i10) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Override // com.google.android.material.internal.e
    public void setSingleLine(boolean z10) {
        super.setSingleLine(z10);
    }

    public void setSingleSelection(boolean z10) {
        this.f26822h.q(z10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ChipGroup(Context context, AttributeSet attributeSet, int i10) {
        super(AbstractC1367a.c(context, attributeSet, i10, r4), attributeSet, i10);
        int i11 = f26818k;
        com.google.android.material.internal.a aVar = new com.google.android.material.internal.a();
        this.f26822h = aVar;
        f fVar = new f(this, null);
        this.f26824j = fVar;
        TypedArray h10 = m.h(getContext(), attributeSet, l.f3712o1, i10, i11, new int[0]);
        int dimensionPixelOffset = h10.getDimensionPixelOffset(l.f3730q1, 0);
        setChipSpacingHorizontal(h10.getDimensionPixelOffset(l.f3739r1, dimensionPixelOffset));
        setChipSpacingVertical(h10.getDimensionPixelOffset(l.f3748s1, dimensionPixelOffset));
        setSingleLine(h10.getBoolean(l.f3766u1, false));
        setSingleSelection(h10.getBoolean(l.f3775v1, false));
        setSelectionRequired(h10.getBoolean(l.f3757t1, false));
        this.f26823i = h10.getResourceId(l.f3721p1, -1);
        h10.recycle();
        aVar.o(new a());
        super.setOnHierarchyChangeListener(fVar);
        AbstractC1484a0.B0(this, 1);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new c(layoutParams);
    }

    public void setSingleLine(int i10) {
        setSingleLine(getResources().getBoolean(i10));
    }

    public void setSingleSelection(int i10) {
        setSingleSelection(getResources().getBoolean(i10));
    }
}
