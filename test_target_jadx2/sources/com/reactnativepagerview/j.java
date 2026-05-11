package com.reactnativepagerview;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class j extends RecyclerView.h {

    /* renamed from: d, reason: collision with root package name */
    private final ArrayList f29414d = new ArrayList();

    public final void A(View child, int i10) {
        Intrinsics.checkNotNullParameter(child, "child");
        this.f29414d.add(i10, child);
        l(i10);
    }

    public final View B(int i10) {
        Object obj = this.f29414d.get(i10);
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        return (View) obj;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public void p(k holder, int i10) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        FrameLayout O10 = holder.O();
        View B10 = B(i10);
        if (O10.getChildCount() > 0) {
            O10.removeAllViews();
        }
        if (B10.getParent() != null) {
            ViewParent parent = B10.getParent();
            Intrinsics.e(parent, "null cannot be cast to non-null type android.widget.FrameLayout");
            ((FrameLayout) parent).removeView(B10);
        }
        O10.addView(B10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public k r(ViewGroup parent, int i10) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return k.f29415u.a(parent);
    }

    public final void E() {
        int size = this.f29414d.size();
        int i10 = 1;
        if (1 <= size) {
            while (true) {
                Object obj = this.f29414d.get(i10 - 1);
                Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                View view = (View) obj;
                ViewParent parent = view.getParent();
                if ((parent != null ? parent.getParent() : null) != null) {
                    ViewParent parent2 = view.getParent().getParent();
                    Intrinsics.e(parent2, "null cannot be cast to non-null type android.view.ViewGroup");
                    Object parent3 = view.getParent();
                    Intrinsics.e(parent3, "null cannot be cast to non-null type android.view.View");
                    ((ViewGroup) parent2).removeView((View) parent3);
                }
                if (i10 == size) {
                    break;
                } else {
                    i10++;
                }
            }
        }
        int size2 = this.f29414d.size();
        this.f29414d.clear();
        m(0, size2);
    }

    public final void F(View child) {
        Intrinsics.checkNotNullParameter(child, "child");
        int indexOf = this.f29414d.indexOf(child);
        if (indexOf > -1) {
            G(indexOf);
        }
    }

    public final void G(int i10) {
        if (i10 < 0 || i10 >= this.f29414d.size()) {
            return;
        }
        this.f29414d.remove(i10);
        n(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int e() {
        return this.f29414d.size();
    }
}
