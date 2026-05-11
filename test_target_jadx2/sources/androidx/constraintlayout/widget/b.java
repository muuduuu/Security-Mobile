package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class b extends View {

    /* renamed from: a, reason: collision with root package name */
    protected int[] f15055a;

    /* renamed from: b, reason: collision with root package name */
    protected int f15056b;

    /* renamed from: c, reason: collision with root package name */
    protected Context f15057c;

    /* renamed from: d, reason: collision with root package name */
    protected o0.h f15058d;

    /* renamed from: e, reason: collision with root package name */
    protected boolean f15059e;

    /* renamed from: f, reason: collision with root package name */
    protected String f15060f;

    /* renamed from: g, reason: collision with root package name */
    protected String f15061g;

    /* renamed from: h, reason: collision with root package name */
    private View[] f15062h;

    /* renamed from: i, reason: collision with root package name */
    protected HashMap f15063i;

    public b(Context context) {
        super(context);
        this.f15055a = new int[32];
        this.f15059e = false;
        this.f15062h = null;
        this.f15063i = new HashMap();
        this.f15057c = context;
        i(null);
    }

    private void a(String str) {
        if (str == null || str.length() == 0 || this.f15057c == null) {
            return;
        }
        String trim = str.trim();
        if (getParent() instanceof ConstraintLayout) {
        }
        int h10 = h(trim);
        if (h10 != 0) {
            this.f15063i.put(Integer.valueOf(h10), trim);
            b(h10);
            return;
        }
        Log.w("ConstraintHelper", "Could not find id of \"" + trim + "\"");
    }

    private void b(int i10) {
        if (i10 == getId()) {
            return;
        }
        int i11 = this.f15056b + 1;
        int[] iArr = this.f15055a;
        if (i11 > iArr.length) {
            this.f15055a = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f15055a;
        int i12 = this.f15056b;
        iArr2[i12] = i10;
        this.f15056b = i12 + 1;
    }

    private void c(String str) {
        if (str == null || str.length() == 0 || this.f15057c == null) {
            return;
        }
        String trim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof ConstraintLayout.b) && trim.equals(((ConstraintLayout.b) layoutParams).f14993c0)) {
                if (childAt.getId() == -1) {
                    Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                } else {
                    b(childAt.getId());
                }
            }
        }
    }

    private int g(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String str2;
        if (str == null || constraintLayout == null || (resources = this.f15057c.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            if (childAt.getId() != -1) {
                try {
                    str2 = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                    str2 = null;
                }
                if (str.equals(str2)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    private int h(String str) {
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int i10 = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object designInformation = constraintLayout.getDesignInformation(0, str);
            if (designInformation instanceof Integer) {
                i10 = ((Integer) designInformation).intValue();
            }
        }
        if (i10 == 0 && constraintLayout != null) {
            i10 = g(constraintLayout, str);
        }
        if (i10 == 0) {
            try {
                i10 = f.class.getField(str).getInt(null);
            } catch (Exception unused) {
            }
        }
        return i10 == 0 ? this.f15057c.getResources().getIdentifier(str, "id", this.f15057c.getPackageName()) : i10;
    }

    protected void d() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        e((ConstraintLayout) parent);
    }

    protected void e(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i10 = 0; i10 < this.f15056b; i10++) {
            View viewById = constraintLayout.getViewById(this.f15055a[i10]);
            if (viewById != null) {
                viewById.setVisibility(visibility);
                if (elevation > 0.0f) {
                    viewById.setTranslationZ(viewById.getTranslationZ() + elevation);
                }
            }
        }
    }

    protected void f(ConstraintLayout constraintLayout) {
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f15055a, this.f15056b);
    }

    protected void i(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, g.f15540n1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == g.f15620x1) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f15060f = string;
                    setIds(string);
                } else if (index == g.f15628y1) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.f15061g = string2;
                    setReferenceTags(string2);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void k(ConstraintLayout constraintLayout) {
    }

    public void l(ConstraintLayout constraintLayout) {
    }

    public void m(ConstraintLayout constraintLayout) {
    }

    public void n(ConstraintLayout constraintLayout) {
        String str;
        int g10;
        if (isInEditMode()) {
            setIds(this.f15060f);
        }
        o0.h hVar = this.f15058d;
        if (hVar == null) {
            return;
        }
        hVar.a();
        for (int i10 = 0; i10 < this.f15056b; i10++) {
            int i11 = this.f15055a[i10];
            View viewById = constraintLayout.getViewById(i11);
            if (viewById == null && (g10 = g(constraintLayout, (str = (String) this.f15063i.get(Integer.valueOf(i11))))) != 0) {
                this.f15055a[i10] = g10;
                this.f15063i.put(Integer.valueOf(g10), str);
                viewById = constraintLayout.getViewById(g10);
            }
            if (viewById != null) {
                this.f15058d.b(constraintLayout.getViewWidget(viewById));
            }
        }
        this.f15058d.c(constraintLayout.mLayoutWidget);
    }

    public void o() {
        if (this.f15058d == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.b) {
            ((ConstraintLayout.b) layoutParams).f15031v0 = (o0.e) this.f15058d;
        }
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f15060f;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f15061g;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        if (this.f15059e) {
            super.onMeasure(i10, i11);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    protected void setIds(String str) {
        this.f15060f = str;
        if (str == null) {
            return;
        }
        int i10 = 0;
        this.f15056b = 0;
        while (true) {
            int indexOf = str.indexOf(44, i10);
            if (indexOf == -1) {
                a(str.substring(i10));
                return;
            } else {
                a(str.substring(i10, indexOf));
                i10 = indexOf + 1;
            }
        }
    }

    protected void setReferenceTags(String str) {
        this.f15061g = str;
        if (str == null) {
            return;
        }
        int i10 = 0;
        this.f15056b = 0;
        while (true) {
            int indexOf = str.indexOf(44, i10);
            if (indexOf == -1) {
                c(str.substring(i10));
                return;
            } else {
                c(str.substring(i10, indexOf));
                i10 = indexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f15060f = null;
        this.f15056b = 0;
        for (int i10 : iArr) {
            b(i10);
        }
    }

    @Override // android.view.View
    public void setTag(int i10, Object obj) {
        super.setTag(i10, obj);
        if (obj == null && this.f15060f == null) {
            b(i10);
        }
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15055a = new int[32];
        this.f15059e = false;
        this.f15062h = null;
        this.f15063i = new HashMap();
        this.f15057c = context;
        i(attributeSet);
    }

    public void j(o0.e eVar, boolean z10) {
    }
}
