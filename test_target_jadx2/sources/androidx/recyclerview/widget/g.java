package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
class g {

    /* renamed from: b, reason: collision with root package name */
    int f17714b;

    /* renamed from: c, reason: collision with root package name */
    int f17715c;

    /* renamed from: d, reason: collision with root package name */
    int f17716d;

    /* renamed from: e, reason: collision with root package name */
    int f17717e;

    /* renamed from: h, reason: collision with root package name */
    boolean f17720h;

    /* renamed from: i, reason: collision with root package name */
    boolean f17721i;

    /* renamed from: a, reason: collision with root package name */
    boolean f17713a = true;

    /* renamed from: f, reason: collision with root package name */
    int f17718f = 0;

    /* renamed from: g, reason: collision with root package name */
    int f17719g = 0;

    g() {
    }

    boolean a(RecyclerView.B b10) {
        int i10 = this.f17715c;
        return i10 >= 0 && i10 < b10.b();
    }

    View b(RecyclerView.w wVar) {
        View o10 = wVar.o(this.f17715c);
        this.f17715c += this.f17716d;
        return o10;
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.f17714b + ", mCurrentPosition=" + this.f17715c + ", mItemDirection=" + this.f17716d + ", mLayoutDirection=" + this.f17717e + ", mStartLine=" + this.f17718f + ", mEndLine=" + this.f17719g + '}';
    }
}
