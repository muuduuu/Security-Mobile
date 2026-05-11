package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.c;
import g.AbstractC3170a;
import g.AbstractC3176g;
import g.AbstractC3179j;
import h.AbstractC3220a;
import l.InterfaceC3588e;

/* loaded from: classes.dex */
public class A extends Spinner {

    /* renamed from: i, reason: collision with root package name */
    private static final int[] f13585i = {R.attr.spinnerMode};

    /* renamed from: a, reason: collision with root package name */
    private final C1403e f13586a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f13587b;

    /* renamed from: c, reason: collision with root package name */
    private S f13588c;

    /* renamed from: d, reason: collision with root package name */
    private SpinnerAdapter f13589d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f13590e;

    /* renamed from: f, reason: collision with root package name */
    private h f13591f;

    /* renamed from: g, reason: collision with root package name */
    int f13592g;

    /* renamed from: h, reason: collision with root package name */
    final Rect f13593h;

    class a extends S {

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ f f13594j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(View view, f fVar) {
            super(view);
            this.f13594j = fVar;
        }

        @Override // androidx.appcompat.widget.S
        public InterfaceC3588e b() {
            return this.f13594j;
        }

        @Override // androidx.appcompat.widget.S
        public boolean c() {
            if (A.this.getInternalPopup().a()) {
                return true;
            }
            A.this.b();
            return true;
        }
    }

    class b implements ViewTreeObserver.OnGlobalLayoutListener {
        b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!A.this.getInternalPopup().a()) {
                A.this.b();
            }
            ViewTreeObserver viewTreeObserver = A.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
        }
    }

    private static final class c {
        static void a(ThemedSpinnerAdapter themedSpinnerAdapter, Resources.Theme theme) {
            if (y0.b.a(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
                return;
            }
            themedSpinnerAdapter.setDropDownViewTheme(theme);
        }
    }

    class d implements h, DialogInterface.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        androidx.appcompat.app.c f13597a;

        /* renamed from: b, reason: collision with root package name */
        private ListAdapter f13598b;

        /* renamed from: c, reason: collision with root package name */
        private CharSequence f13599c;

        d() {
        }

        @Override // androidx.appcompat.widget.A.h
        public boolean a() {
            androidx.appcompat.app.c cVar = this.f13597a;
            if (cVar != null) {
                return cVar.isShowing();
            }
            return false;
        }

        @Override // androidx.appcompat.widget.A.h
        public void c(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.A.h
        public int d() {
            return 0;
        }

        @Override // androidx.appcompat.widget.A.h
        public void dismiss() {
            androidx.appcompat.app.c cVar = this.f13597a;
            if (cVar != null) {
                cVar.dismiss();
                this.f13597a = null;
            }
        }

        @Override // androidx.appcompat.widget.A.h
        public void f(int i10) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.A.h
        public CharSequence g() {
            return this.f13599c;
        }

        @Override // androidx.appcompat.widget.A.h
        public Drawable i() {
            return null;
        }

        @Override // androidx.appcompat.widget.A.h
        public void k(CharSequence charSequence) {
            this.f13599c = charSequence;
        }

        @Override // androidx.appcompat.widget.A.h
        public void l(int i10) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.A.h
        public void m(int i10) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.A.h
        public void n(int i10, int i11) {
            if (this.f13598b == null) {
                return;
            }
            c.a aVar = new c.a(A.this.getPopupContext());
            CharSequence charSequence = this.f13599c;
            if (charSequence != null) {
                aVar.o(charSequence);
            }
            androidx.appcompat.app.c a10 = aVar.m(this.f13598b, A.this.getSelectedItemPosition(), this).a();
            this.f13597a = a10;
            ListView i12 = a10.i();
            i12.setTextDirection(i10);
            i12.setTextAlignment(i11);
            this.f13597a.show();
        }

        @Override // androidx.appcompat.widget.A.h
        public int o() {
            return 0;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            A.this.setSelection(i10);
            if (A.this.getOnItemClickListener() != null) {
                A.this.performItemClick(null, i10, this.f13598b.getItemId(i10));
            }
            dismiss();
        }

        @Override // androidx.appcompat.widget.A.h
        public void p(ListAdapter listAdapter) {
            this.f13598b = listAdapter;
        }
    }

    private static class e implements ListAdapter, SpinnerAdapter {

        /* renamed from: a, reason: collision with root package name */
        private SpinnerAdapter f13601a;

        /* renamed from: b, reason: collision with root package name */
        private ListAdapter f13602b;

        public e(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f13601a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f13602b = (ListAdapter) spinnerAdapter;
            }
            if (theme == null || !(spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                return;
            }
            c.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f13602b;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f13601a;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f13601a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i10, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public Object getItem(int i10) {
            SpinnerAdapter spinnerAdapter = this.f13601a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i10);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i10) {
            SpinnerAdapter spinnerAdapter = this.f13601a;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i10);
        }

        @Override // android.widget.Adapter
        public int getItemViewType(int i10) {
            return 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            return getDropDownView(i10, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f13601a;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i10) {
            ListAdapter listAdapter = this.f13602b;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i10);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f13601a;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f13601a;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    class f extends U implements h {

        /* renamed from: I, reason: collision with root package name */
        private CharSequence f13603I;

        /* renamed from: J, reason: collision with root package name */
        ListAdapter f13604J;

        /* renamed from: K, reason: collision with root package name */
        private final Rect f13605K;

        /* renamed from: X, reason: collision with root package name */
        private int f13606X;

        class a implements AdapterView.OnItemClickListener {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ A f13608a;

            a(A a10) {
                this.f13608a = a10;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
                A.this.setSelection(i10);
                if (A.this.getOnItemClickListener() != null) {
                    f fVar = f.this;
                    A.this.performItemClick(view, i10, fVar.f13604J.getItemId(i10));
                }
                f.this.dismiss();
            }
        }

        class b implements ViewTreeObserver.OnGlobalLayoutListener {
            b() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                f fVar = f.this;
                if (!fVar.U(A.this)) {
                    f.this.dismiss();
                } else {
                    f.this.S();
                    f.super.b();
                }
            }
        }

        class c implements PopupWindow.OnDismissListener {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f13611a;

            c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f13611a = onGlobalLayoutListener;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = A.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f13611a);
                }
            }
        }

        public f(Context context, AttributeSet attributeSet, int i10) {
            super(context, attributeSet, i10);
            this.f13605K = new Rect();
            D(A.this);
            J(true);
            O(0);
            L(new a(A.this));
        }

        void S() {
            int i10;
            Drawable i11 = i();
            if (i11 != null) {
                i11.getPadding(A.this.f13593h);
                i10 = s0.b(A.this) ? A.this.f13593h.right : -A.this.f13593h.left;
            } else {
                Rect rect = A.this.f13593h;
                rect.right = 0;
                rect.left = 0;
                i10 = 0;
            }
            int paddingLeft = A.this.getPaddingLeft();
            int paddingRight = A.this.getPaddingRight();
            int width = A.this.getWidth();
            A a10 = A.this;
            int i12 = a10.f13592g;
            if (i12 == -2) {
                int a11 = a10.a((SpinnerAdapter) this.f13604J, i());
                int i13 = A.this.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = A.this.f13593h;
                int i14 = (i13 - rect2.left) - rect2.right;
                if (a11 > i14) {
                    a11 = i14;
                }
                F(Math.max(a11, (width - paddingLeft) - paddingRight));
            } else if (i12 == -1) {
                F((width - paddingLeft) - paddingRight);
            } else {
                F(i12);
            }
            f(s0.b(A.this) ? i10 + (((width - paddingRight) - z()) - T()) : i10 + paddingLeft + T());
        }

        public int T() {
            return this.f13606X;
        }

        boolean U(View view) {
            return view.isAttachedToWindow() && view.getGlobalVisibleRect(this.f13605K);
        }

        @Override // androidx.appcompat.widget.A.h
        public CharSequence g() {
            return this.f13603I;
        }

        @Override // androidx.appcompat.widget.A.h
        public void k(CharSequence charSequence) {
            this.f13603I = charSequence;
        }

        @Override // androidx.appcompat.widget.A.h
        public void m(int i10) {
            this.f13606X = i10;
        }

        @Override // androidx.appcompat.widget.A.h
        public void n(int i10, int i11) {
            ViewTreeObserver viewTreeObserver;
            boolean a10 = a();
            S();
            I(2);
            super.b();
            ListView j10 = j();
            j10.setChoiceMode(1);
            j10.setTextDirection(i10);
            j10.setTextAlignment(i11);
            P(A.this.getSelectedItemPosition());
            if (a10 || (viewTreeObserver = A.this.getViewTreeObserver()) == null) {
                return;
            }
            b bVar = new b();
            viewTreeObserver.addOnGlobalLayoutListener(bVar);
            K(new c(bVar));
        }

        @Override // androidx.appcompat.widget.U, androidx.appcompat.widget.A.h
        public void p(ListAdapter listAdapter) {
            super.p(listAdapter);
            this.f13604J = listAdapter;
        }
    }

    static class g extends View.BaseSavedState {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        boolean f13613a;

        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public g createFromParcel(Parcel parcel) {
                return new g(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public g[] newArray(int i10) {
                return new g[i10];
            }
        }

        g(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeByte(this.f13613a ? (byte) 1 : (byte) 0);
        }

        g(Parcel parcel) {
            super(parcel);
            this.f13613a = parcel.readByte() != 0;
        }
    }

    interface h {
        boolean a();

        void c(Drawable drawable);

        int d();

        void dismiss();

        void f(int i10);

        CharSequence g();

        Drawable i();

        void k(CharSequence charSequence);

        void l(int i10);

        void m(int i10);

        void n(int i10, int i11);

        int o();

        void p(ListAdapter listAdapter);
    }

    public A(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC3170a.f33061I);
    }

    int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i10 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i11 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i10) {
                view = null;
                i10 = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i11 = Math.max(i11, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i11;
        }
        drawable.getPadding(this.f13593h);
        Rect rect = this.f13593h;
        return i11 + rect.left + rect.right;
    }

    void b() {
        this.f13591f.n(getTextDirection(), getTextAlignment());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C1403e c1403e = this.f13586a;
        if (c1403e != null) {
            c1403e.b();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        h hVar = this.f13591f;
        return hVar != null ? hVar.d() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        h hVar = this.f13591f;
        return hVar != null ? hVar.o() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f13591f != null ? this.f13592g : super.getDropDownWidth();
    }

    final h getInternalPopup() {
        return this.f13591f;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        h hVar = this.f13591f;
        return hVar != null ? hVar.i() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f13587b;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        h hVar = this.f13591f;
        return hVar != null ? hVar.g() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1403e c1403e = this.f13586a;
        if (c1403e != null) {
            return c1403e.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1403e c1403e = this.f13586a;
        if (c1403e != null) {
            return c1403e.d();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h hVar = this.f13591f;
        if (hVar == null || !hVar.a()) {
            return;
        }
        this.f13591f.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f13591f == null || View.MeasureSpec.getMode(i10) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i10)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.getSuperState());
        if (!gVar.f13613a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new b());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public Parcelable onSaveInstanceState() {
        g gVar = new g(super.onSaveInstanceState());
        h hVar = this.f13591f;
        gVar.f13613a = hVar != null && hVar.a();
        return gVar;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        S s10 = this.f13588c;
        if (s10 == null || !s10.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        h hVar = this.f13591f;
        if (hVar == null) {
            return super.performClick();
        }
        if (hVar.a()) {
            return true;
        }
        b();
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1403e c1403e = this.f13586a;
        if (c1403e != null) {
            c1403e.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C1403e c1403e = this.f13586a;
        if (c1403e != null) {
            c1403e.g(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i10) {
        h hVar = this.f13591f;
        if (hVar == null) {
            super.setDropDownHorizontalOffset(i10);
        } else {
            hVar.m(i10);
            this.f13591f.f(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i10) {
        h hVar = this.f13591f;
        if (hVar != null) {
            hVar.l(i10);
        } else {
            super.setDropDownVerticalOffset(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i10) {
        if (this.f13591f != null) {
            this.f13592g = i10;
        } else {
            super.setDropDownWidth(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        h hVar = this.f13591f;
        if (hVar != null) {
            hVar.c(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i10) {
        setPopupBackgroundDrawable(AbstractC3220a.b(getPopupContext(), i10));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        h hVar = this.f13591f;
        if (hVar != null) {
            hVar.k(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1403e c1403e = this.f13586a;
        if (c1403e != null) {
            c1403e.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1403e c1403e = this.f13586a;
        if (c1403e != null) {
            c1403e.j(mode);
        }
    }

    public A(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, -1);
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f13590e) {
            this.f13589d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f13591f != null) {
            Context context = this.f13587b;
            if (context == null) {
                context = getContext();
            }
            this.f13591f.p(new e(spinnerAdapter, context.getTheme()));
        }
    }

    public A(Context context, AttributeSet attributeSet, int i10, int i11) {
        this(context, attributeSet, i10, i11, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0064, code lost:
    
        if (r11 == null) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v7, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.view.View, androidx.appcompat.widget.A] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public A(Context context, AttributeSet attributeSet, int i10, int i11, Resources.Theme theme) {
        super(context, attributeSet, i10);
        TypedArray typedArray;
        this.f13593h = new Rect();
        d0.a(this, getContext());
        h0 v10 = h0.v(context, attributeSet, AbstractC3179j.f33480x2, i10, 0);
        this.f13586a = new C1403e(this);
        if (theme != null) {
            this.f13587b = new androidx.appcompat.view.d(context, theme);
        } else {
            int n10 = v10.n(AbstractC3179j.f33253C2, 0);
            if (n10 != 0) {
                this.f13587b = new androidx.appcompat.view.d(context, n10);
            } else {
                this.f13587b = context;
            }
        }
        ?? r11 = -1;
        TypedArray typedArray2 = null;
        try {
            if (i11 == -1) {
                try {
                    typedArray = context.obtainStyledAttributes(attributeSet, f13585i, i10, 0);
                    try {
                        boolean hasValue = typedArray.hasValue(0);
                        r11 = typedArray;
                        if (hasValue) {
                            i11 = typedArray.getInt(0, 0);
                            r11 = typedArray;
                        }
                    } catch (Exception e10) {
                        e = e10;
                        Log.i("AppCompatSpinner", "Could not read android:spinnerMode", e);
                        r11 = typedArray;
                    }
                } catch (Exception e11) {
                    e = e11;
                    typedArray = null;
                } catch (Throwable th) {
                    th = th;
                    if (typedArray2 != null) {
                        typedArray2.recycle();
                    }
                    throw th;
                }
                r11.recycle();
            }
            if (i11 == 0) {
                d dVar = new d();
                this.f13591f = dVar;
                dVar.k(v10.o(AbstractC3179j.f33243A2));
            } else if (i11 == 1) {
                f fVar = new f(this.f13587b, attributeSet, i10);
                h0 v11 = h0.v(this.f13587b, attributeSet, AbstractC3179j.f33480x2, i10, 0);
                this.f13592g = v11.m(AbstractC3179j.f33248B2, -2);
                fVar.c(v11.g(AbstractC3179j.f33490z2));
                fVar.k(v10.o(AbstractC3179j.f33243A2));
                v11.x();
                this.f13591f = fVar;
                this.f13588c = new a(this, fVar);
            }
            CharSequence[] q10 = v10.q(AbstractC3179j.f33485y2);
            if (q10 != null) {
                ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, q10);
                arrayAdapter.setDropDownViewResource(AbstractC3176g.f33221t);
                setAdapter(arrayAdapter);
            }
            v10.x();
            this.f13590e = true;
            SpinnerAdapter spinnerAdapter = this.f13589d;
            if (spinnerAdapter != null) {
                setAdapter(spinnerAdapter);
                this.f13589d = null;
            }
            this.f13586a.e(attributeSet, i10);
        } catch (Throwable th2) {
            th = th2;
            typedArray2 = r11;
        }
    }
}
