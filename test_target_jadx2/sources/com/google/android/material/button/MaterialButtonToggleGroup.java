package com.google.android.material.button;

import H7.k;
import H7.l;
import Y7.k;
import a8.AbstractC1367a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import androidx.core.view.AbstractC1484a0;
import androidx.core.view.AbstractC1524v;
import androidx.core.view.C1483a;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.m;
import com.google.android.material.internal.o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import z0.C5228A;

/* loaded from: classes2.dex */
public class MaterialButtonToggleGroup extends LinearLayout {

    /* renamed from: k, reason: collision with root package name */
    private static final String f26750k = "MaterialButtonToggleGroup";

    /* renamed from: l, reason: collision with root package name */
    private static final int f26751l = k.f3346v;

    /* renamed from: a, reason: collision with root package name */
    private final List f26752a;

    /* renamed from: b, reason: collision with root package name */
    private final e f26753b;

    /* renamed from: c, reason: collision with root package name */
    private final LinkedHashSet f26754c;

    /* renamed from: d, reason: collision with root package name */
    private final Comparator f26755d;

    /* renamed from: e, reason: collision with root package name */
    private Integer[] f26756e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f26757f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f26758g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f26759h;

    /* renamed from: i, reason: collision with root package name */
    private final int f26760i;

    /* renamed from: j, reason: collision with root package name */
    private Set f26761j;

    class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(MaterialButton materialButton, MaterialButton materialButton2) {
            int compareTo = Boolean.valueOf(materialButton.isChecked()).compareTo(Boolean.valueOf(materialButton2.isChecked()));
            if (compareTo != 0) {
                return compareTo;
            }
            int compareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
            return compareTo2 != 0 ? compareTo2 : Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton)).compareTo(Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton2)));
        }
    }

    class b extends C1483a {
        b() {
        }

        @Override // androidx.core.view.C1483a
        public void g(View view, C5228A c5228a) {
            super.g(view, c5228a);
            c5228a.t0(C5228A.f.b(0, 1, MaterialButtonToggleGroup.this.i(view), 1, false, ((MaterialButton) view).isChecked()));
        }
    }

    private static class c {

        /* renamed from: e, reason: collision with root package name */
        private static final Y7.c f26764e = new Y7.a(0.0f);

        /* renamed from: a, reason: collision with root package name */
        Y7.c f26765a;

        /* renamed from: b, reason: collision with root package name */
        Y7.c f26766b;

        /* renamed from: c, reason: collision with root package name */
        Y7.c f26767c;

        /* renamed from: d, reason: collision with root package name */
        Y7.c f26768d;

        c(Y7.c cVar, Y7.c cVar2, Y7.c cVar3, Y7.c cVar4) {
            this.f26765a = cVar;
            this.f26766b = cVar3;
            this.f26767c = cVar4;
            this.f26768d = cVar2;
        }

        public static c a(c cVar) {
            Y7.c cVar2 = f26764e;
            return new c(cVar2, cVar.f26768d, cVar2, cVar.f26767c);
        }

        public static c b(c cVar, View view) {
            return o.e(view) ? c(cVar) : d(cVar);
        }

        public static c c(c cVar) {
            Y7.c cVar2 = cVar.f26765a;
            Y7.c cVar3 = cVar.f26768d;
            Y7.c cVar4 = f26764e;
            return new c(cVar2, cVar3, cVar4, cVar4);
        }

        public static c d(c cVar) {
            Y7.c cVar2 = f26764e;
            return new c(cVar2, cVar2, cVar.f26766b, cVar.f26767c);
        }

        public static c e(c cVar, View view) {
            return o.e(view) ? d(cVar) : c(cVar);
        }

        public static c f(c cVar) {
            Y7.c cVar2 = cVar.f26765a;
            Y7.c cVar3 = f26764e;
            return new c(cVar2, cVar3, cVar.f26766b, cVar3);
        }
    }

    public interface d {
        void a(MaterialButtonToggleGroup materialButtonToggleGroup, int i10, boolean z10);
    }

    private class e implements MaterialButton.a {
        private e() {
        }

        @Override // com.google.android.material.button.MaterialButton.a
        public void a(MaterialButton materialButton, boolean z10) {
            MaterialButtonToggleGroup.this.invalidate();
        }

        /* synthetic */ e(MaterialButtonToggleGroup materialButtonToggleGroup, a aVar) {
            this();
        }
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, H7.b.f3153z);
    }

    private void c() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i10 = firstVisibleChildIndex + 1; i10 < getChildCount(); i10++) {
            MaterialButton h10 = h(i10);
            int min = Math.min(h10.getStrokeWidth(), h(i10 - 1).getStrokeWidth());
            LinearLayout.LayoutParams d10 = d(h10);
            if (getOrientation() == 0) {
                AbstractC1524v.c(d10, 0);
                AbstractC1524v.d(d10, -min);
                d10.topMargin = 0;
            } else {
                d10.bottomMargin = 0;
                d10.topMargin = -min;
                AbstractC1524v.d(d10, 0);
            }
            h10.setLayoutParams(d10);
        }
        n(firstVisibleChildIndex);
    }

    private LinearLayout.LayoutParams d(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        return layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
    }

    private void e(int i10, boolean z10) {
        if (i10 == -1) {
            Log.e(f26750k, "Button ID is not valid: " + i10);
            return;
        }
        HashSet hashSet = new HashSet(this.f26761j);
        if (z10 && !hashSet.contains(Integer.valueOf(i10))) {
            if (this.f26758g && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i10));
        } else {
            if (z10 || !hashSet.contains(Integer.valueOf(i10))) {
                return;
            }
            if (!this.f26759h || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i10));
            }
        }
        q(hashSet);
    }

    private void g(int i10, boolean z10) {
        Iterator it = this.f26754c.iterator();
        while (it.hasNext()) {
            ((d) it.next()).a(this, i10, z10);
        }
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (k(i10)) {
                return i10;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (k(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if ((getChildAt(i11) instanceof MaterialButton) && k(i11)) {
                i10++;
            }
        }
        return i10;
    }

    private MaterialButton h(int i10) {
        return (MaterialButton) getChildAt(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int i(View view) {
        if (!(view instanceof MaterialButton)) {
            return -1;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if (getChildAt(i11) == view) {
                return i10;
            }
            if ((getChildAt(i11) instanceof MaterialButton) && k(i11)) {
                i10++;
            }
        }
        return -1;
    }

    private c j(int i10, int i11, int i12) {
        c cVar = (c) this.f26752a.get(i10);
        if (i11 == i12) {
            return cVar;
        }
        boolean z10 = getOrientation() == 0;
        if (i10 == i11) {
            return z10 ? c.e(cVar, this) : c.f(cVar);
        }
        if (i10 == i12) {
            return z10 ? c.b(cVar, this) : c.a(cVar);
        }
        return null;
    }

    private boolean k(int i10) {
        return getChildAt(i10).getVisibility() != 8;
    }

    private void n(int i10) {
        if (getChildCount() == 0 || i10 == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) h(i10).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams.topMargin = 0;
            layoutParams.bottomMargin = 0;
        } else {
            AbstractC1524v.c(layoutParams, 0);
            AbstractC1524v.d(layoutParams, 0);
            layoutParams.leftMargin = 0;
            layoutParams.rightMargin = 0;
        }
    }

    private void o(int i10, boolean z10) {
        View findViewById = findViewById(i10);
        if (findViewById instanceof MaterialButton) {
            this.f26757f = true;
            ((MaterialButton) findViewById).setChecked(z10);
            this.f26757f = false;
        }
    }

    private static void p(k.b bVar, c cVar) {
        if (cVar == null) {
            bVar.o(0.0f);
        } else {
            bVar.C(cVar.f26765a).t(cVar.f26768d).H(cVar.f26766b).x(cVar.f26767c);
        }
    }

    private void q(Set set) {
        Set set2 = this.f26761j;
        this.f26761j = new HashSet(set);
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            int id2 = h(i10).getId();
            o(id2, set.contains(Integer.valueOf(id2)));
            if (set2.contains(Integer.valueOf(id2)) != set.contains(Integer.valueOf(id2))) {
                g(id2, set.contains(Integer.valueOf(id2)));
            }
        }
        invalidate();
    }

    private void r() {
        TreeMap treeMap = new TreeMap(this.f26755d);
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            treeMap.put(h(i10), Integer.valueOf(i10));
        }
        this.f26756e = (Integer[]) treeMap.values().toArray(new Integer[0]);
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(AbstractC1484a0.k());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.f26753b);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e(f26750k, "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i10, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        e(materialButton.getId(), materialButton.isChecked());
        Y7.k shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f26752a.add(new c(shapeAppearanceModel.r(), shapeAppearanceModel.j(), shapeAppearanceModel.t(), shapeAppearanceModel.l()));
        AbstractC1484a0.q0(materialButton, new b());
    }

    public void b(d dVar) {
        this.f26754c.add(dVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        r();
        super.dispatchDraw(canvas);
    }

    public void f() {
        q(new HashSet());
    }

    public int getCheckedButtonId() {
        if (!this.f26758g || this.f26761j.isEmpty()) {
            return -1;
        }
        return ((Integer) this.f26761j.iterator().next()).intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            int id2 = h(i10).getId();
            if (this.f26761j.contains(Integer.valueOf(id2))) {
                arrayList.add(Integer.valueOf(id2));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i10, int i11) {
        Integer[] numArr = this.f26756e;
        if (numArr != null && i11 < numArr.length) {
            return numArr[i11].intValue();
        }
        Log.w(f26750k, "Child order wasn't updated");
        return i11;
    }

    public boolean l() {
        return this.f26758g;
    }

    void m(MaterialButton materialButton, boolean z10) {
        if (this.f26757f) {
            return;
        }
        e(materialButton.getId(), z10);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        int i10 = this.f26760i;
        if (i10 != -1) {
            q(Collections.singleton(Integer.valueOf(i10)));
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C5228A.Y0(accessibilityNodeInfo).s0(C5228A.e.b(1, getVisibleButtonCount(), false, l() ? 1 : 2));
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        s();
        c();
        super.onMeasure(i10, i11);
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.f26752a.remove(indexOfChild);
        }
        s();
        c();
    }

    void s() {
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i10 = 0; i10 < childCount; i10++) {
            MaterialButton h10 = h(i10);
            if (h10.getVisibility() != 8) {
                k.b v10 = h10.getShapeAppearanceModel().v();
                p(v10, j(i10, firstVisibleChildIndex, lastVisibleChildIndex));
                h10.setShapeAppearanceModel(v10.m());
            }
        }
    }

    public void setSelectionRequired(boolean z10) {
        this.f26759h = z10;
    }

    public void setSingleSelection(boolean z10) {
        if (this.f26758g != z10) {
            this.f26758g = z10;
            f();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet, int i10) {
        super(AbstractC1367a.c(context, attributeSet, i10, r4), attributeSet, i10);
        int i11 = f26751l;
        this.f26752a = new ArrayList();
        this.f26753b = new e(this, null);
        this.f26754c = new LinkedHashSet();
        this.f26755d = new a();
        this.f26757f = false;
        this.f26761j = new HashSet();
        TypedArray h10 = m.h(getContext(), attributeSet, l.f3759t3, i10, i11, new int[0]);
        setSingleSelection(h10.getBoolean(l.f3786w3, false));
        this.f26760i = h10.getResourceId(l.f3768u3, -1);
        this.f26759h = h10.getBoolean(l.f3777v3, false);
        setChildrenDrawingOrderEnabled(true);
        h10.recycle();
        AbstractC1484a0.B0(this, 1);
    }

    public void setSingleSelection(int i10) {
        setSingleSelection(getResources().getBoolean(i10));
    }
}
