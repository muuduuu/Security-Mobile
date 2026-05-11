package androidx.recyclerview.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class d extends RecyclerView.o {

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f17658d = {R.attr.listDivider};

    /* renamed from: a, reason: collision with root package name */
    private Drawable f17659a;

    /* renamed from: b, reason: collision with root package name */
    private int f17660b;

    /* renamed from: c, reason: collision with root package name */
    private final Rect f17661c = new Rect();

    public d(Context context, int i10) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f17658d);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        this.f17659a = drawable;
        if (drawable == null) {
            Log.w("DividerItem", "@android:attr/listDivider was not set in the theme used for this DividerItemDecoration. Please set that attribute all call setDrawable()");
        }
        obtainStyledAttributes.recycle();
        l(i10);
    }

    private void j(Canvas canvas, RecyclerView recyclerView) {
        int height;
        int i10;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            i10 = recyclerView.getPaddingTop();
            height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            canvas.clipRect(recyclerView.getPaddingLeft(), i10, recyclerView.getWidth() - recyclerView.getPaddingRight(), height);
        } else {
            height = recyclerView.getHeight();
            i10 = 0;
        }
        int childCount = recyclerView.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = recyclerView.getChildAt(i11);
            recyclerView.getLayoutManager().P(childAt, this.f17661c);
            int round = this.f17661c.right + Math.round(childAt.getTranslationX());
            this.f17659a.setBounds(round - this.f17659a.getIntrinsicWidth(), i10, round, height);
            this.f17659a.draw(canvas);
        }
        canvas.restore();
    }

    private void k(Canvas canvas, RecyclerView recyclerView) {
        int width;
        int i10;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            i10 = recyclerView.getPaddingLeft();
            width = recyclerView.getWidth() - recyclerView.getPaddingRight();
            canvas.clipRect(i10, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
        } else {
            width = recyclerView.getWidth();
            i10 = 0;
        }
        int childCount = recyclerView.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = recyclerView.getChildAt(i11);
            recyclerView.m0(childAt, this.f17661c);
            int round = this.f17661c.bottom + Math.round(childAt.getTranslationY());
            this.f17659a.setBounds(i10, round - this.f17659a.getIntrinsicHeight(), width, round);
            this.f17659a.draw(canvas);
        }
        canvas.restore();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void e(Rect rect, View view, RecyclerView recyclerView, RecyclerView.B b10) {
        Drawable drawable = this.f17659a;
        if (drawable == null) {
            rect.set(0, 0, 0, 0);
        } else if (this.f17660b == 1) {
            rect.set(0, 0, 0, drawable.getIntrinsicHeight());
        } else {
            rect.set(0, 0, drawable.getIntrinsicWidth(), 0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void g(Canvas canvas, RecyclerView recyclerView, RecyclerView.B b10) {
        if (recyclerView.getLayoutManager() == null || this.f17659a == null) {
            return;
        }
        if (this.f17660b == 1) {
            k(canvas, recyclerView);
        } else {
            j(canvas, recyclerView);
        }
    }

    public void l(int i10) {
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException("Invalid orientation. It should be either HORIZONTAL or VERTICAL");
        }
        this.f17660b = i10;
    }
}
