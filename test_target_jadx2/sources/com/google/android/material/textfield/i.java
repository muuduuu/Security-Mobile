package com.google.android.material.textfield;

import a8.AbstractC1367a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Filterable;
import android.widget.ListAdapter;
import androidx.appcompat.widget.C1402d;
import androidx.appcompat.widget.U;
import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
public class i extends C1402d {

    /* renamed from: e, reason: collision with root package name */
    private final U f27714e;

    /* renamed from: f, reason: collision with root package name */
    private final AccessibilityManager f27715f;

    /* renamed from: g, reason: collision with root package name */
    private final Rect f27716g;

    /* renamed from: h, reason: collision with root package name */
    private final int f27717h;

    class a implements AdapterView.OnItemClickListener {
        a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
            i iVar = i.this;
            i.this.f(i10 < 0 ? iVar.f27714e.v() : iVar.getAdapter().getItem(i10));
            AdapterView.OnItemClickListener onItemClickListener = i.this.getOnItemClickListener();
            if (onItemClickListener != null) {
                if (view == null || i10 < 0) {
                    view = i.this.f27714e.y();
                    i10 = i.this.f27714e.x();
                    j10 = i.this.f27714e.w();
                }
                onItemClickListener.onItemClick(i.this.f27714e.j(), view, i10, j10);
            }
            i.this.f27714e.dismiss();
        }
    }

    public i(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, H7.b.f3130c);
    }

    private TextInputLayout d() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    private int e() {
        ListAdapter adapter = getAdapter();
        TextInputLayout d10 = d();
        int i10 = 0;
        if (adapter == null || d10 == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int min = Math.min(adapter.getCount(), Math.max(0, this.f27714e.x()) + 15);
        View view = null;
        int i11 = 0;
        for (int max = Math.max(0, min - 15); max < min; max++) {
            int itemViewType = adapter.getItemViewType(max);
            if (itemViewType != i10) {
                view = null;
                i10 = itemViewType;
            }
            view = adapter.getView(max, view, d10);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i11 = Math.max(i11, view.getMeasuredWidth());
        }
        Drawable i12 = this.f27714e.i();
        if (i12 != null) {
            i12.getPadding(this.f27716g);
            Rect rect = this.f27716g;
            i11 += rect.left + rect.right;
        }
        return i11 + d10.getEndIconView().getMeasuredWidth();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(Object obj) {
        setText(convertSelectionToString(obj), false);
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout d10 = d();
        return (d10 == null || !d10.O()) ? super.getHint() : d10.getHint();
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout d10 = d();
        if (d10 != null && d10.O() && super.getHint() == null && com.google.android.material.internal.g.a()) {
            setHint(BuildConfig.FLAVOR);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), e()), View.MeasureSpec.getSize(i10)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t10) {
        super.setAdapter(t10);
        this.f27714e.p(getAdapter());
    }

    public void setSimpleItems(int i10) {
        setSimpleItems(getResources().getStringArray(i10));
    }

    @Override // android.widget.AutoCompleteTextView
    public void showDropDown() {
        AccessibilityManager accessibilityManager = this.f27715f;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            super.showDropDown();
        } else {
            this.f27714e.b();
        }
    }

    public i(Context context, AttributeSet attributeSet, int i10) {
        super(AbstractC1367a.c(context, attributeSet, i10, 0), attributeSet, i10);
        this.f27716g = new Rect();
        Context context2 = getContext();
        TypedArray h10 = com.google.android.material.internal.m.h(context2, attributeSet, H7.l.f3543V2, i10, H7.k.f3330f, new int[0]);
        if (h10.hasValue(H7.l.f3552W2) && h10.getInt(H7.l.f3552W2, 0) == 0) {
            setKeyListener(null);
        }
        this.f27717h = h10.getResourceId(H7.l.f3561X2, H7.h.f3292o);
        this.f27715f = (AccessibilityManager) context2.getSystemService("accessibility");
        U u10 = new U(context2);
        this.f27714e = u10;
        u10.J(true);
        u10.D(this);
        u10.I(2);
        u10.p(getAdapter());
        u10.L(new a());
        if (h10.hasValue(H7.l.f3570Y2)) {
            setSimpleItems(h10.getResourceId(H7.l.f3570Y2, 0));
        }
        h10.recycle();
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new ArrayAdapter(getContext(), this.f27717h, strArr));
    }
}
