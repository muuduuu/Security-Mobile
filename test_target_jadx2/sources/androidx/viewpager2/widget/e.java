package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.f;
import java.util.Locale;

/* loaded from: classes.dex */
final class e extends RecyclerView.u {

    /* renamed from: a, reason: collision with root package name */
    private f.i f18026a;

    /* renamed from: b, reason: collision with root package name */
    private final f f18027b;

    /* renamed from: c, reason: collision with root package name */
    private final RecyclerView f18028c;

    /* renamed from: d, reason: collision with root package name */
    private final LinearLayoutManager f18029d;

    /* renamed from: e, reason: collision with root package name */
    private int f18030e;

    /* renamed from: f, reason: collision with root package name */
    private int f18031f;

    /* renamed from: g, reason: collision with root package name */
    private a f18032g;

    /* renamed from: h, reason: collision with root package name */
    private int f18033h;

    /* renamed from: i, reason: collision with root package name */
    private int f18034i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f18035j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f18036k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f18037l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f18038m;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        int f18039a;

        /* renamed from: b, reason: collision with root package name */
        float f18040b;

        /* renamed from: c, reason: collision with root package name */
        int f18041c;

        a() {
        }

        void a() {
            this.f18039a = -1;
            this.f18040b = 0.0f;
            this.f18041c = 0;
        }
    }

    e(f fVar) {
        this.f18027b = fVar;
        RecyclerView recyclerView = fVar.f18052j;
        this.f18028c = recyclerView;
        this.f18029d = (LinearLayoutManager) recyclerView.getLayoutManager();
        this.f18032g = new a();
        n();
    }

    private void c(int i10, float f10, int i11) {
        f.i iVar = this.f18026a;
        if (iVar != null) {
            iVar.b(i10, f10, i11);
        }
    }

    private void d(int i10) {
        f.i iVar = this.f18026a;
        if (iVar != null) {
            iVar.c(i10);
        }
    }

    private void e(int i10) {
        if ((this.f18030e == 3 && this.f18031f == 0) || this.f18031f == i10) {
            return;
        }
        this.f18031f = i10;
        f.i iVar = this.f18026a;
        if (iVar != null) {
            iVar.a(i10);
        }
    }

    private int f() {
        return this.f18029d.Y1();
    }

    private boolean k() {
        int i10 = this.f18030e;
        return i10 == 1 || i10 == 4;
    }

    private void n() {
        this.f18030e = 0;
        this.f18031f = 0;
        this.f18032g.a();
        this.f18033h = -1;
        this.f18034i = -1;
        this.f18035j = false;
        this.f18036k = false;
        this.f18038m = false;
        this.f18037l = false;
    }

    private void p(boolean z10) {
        this.f18038m = z10;
        this.f18030e = z10 ? 4 : 1;
        int i10 = this.f18034i;
        if (i10 != -1) {
            this.f18033h = i10;
            this.f18034i = -1;
        } else if (this.f18033h == -1) {
            this.f18033h = f();
        }
        e(1);
    }

    private void q() {
        int top;
        a aVar = this.f18032g;
        int Y12 = this.f18029d.Y1();
        aVar.f18039a = Y12;
        if (Y12 == -1) {
            aVar.a();
            return;
        }
        View C10 = this.f18029d.C(Y12);
        if (C10 == null) {
            aVar.a();
            return;
        }
        int a02 = this.f18029d.a0(C10);
        int j02 = this.f18029d.j0(C10);
        int m02 = this.f18029d.m0(C10);
        int H10 = this.f18029d.H(C10);
        ViewGroup.LayoutParams layoutParams = C10.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            a02 += marginLayoutParams.leftMargin;
            j02 += marginLayoutParams.rightMargin;
            m02 += marginLayoutParams.topMargin;
            H10 += marginLayoutParams.bottomMargin;
        }
        int height = C10.getHeight() + m02 + H10;
        int width = C10.getWidth() + a02 + j02;
        if (this.f18029d.l2() == 0) {
            top = (C10.getLeft() - a02) - this.f18028c.getPaddingLeft();
            if (this.f18027b.d()) {
                top = -top;
            }
            height = width;
        } else {
            top = (C10.getTop() - m02) - this.f18028c.getPaddingTop();
        }
        int i10 = -top;
        aVar.f18041c = i10;
        if (i10 >= 0) {
            aVar.f18040b = height == 0 ? 0.0f : i10 / height;
        } else {
            if (!new androidx.viewpager2.widget.a(this.f18029d).d()) {
                throw new IllegalStateException(String.format(Locale.US, "Page can only be offset by a positive amount, not by %d", Integer.valueOf(aVar.f18041c)));
            }
            throw new IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.u
    public void a(RecyclerView recyclerView, int i10) {
        if (!(this.f18030e == 1 && this.f18031f == 1) && i10 == 1) {
            p(false);
            return;
        }
        if (k() && i10 == 2) {
            if (this.f18036k) {
                e(2);
                this.f18035j = true;
                return;
            }
            return;
        }
        if (k() && i10 == 0) {
            q();
            if (this.f18036k) {
                a aVar = this.f18032g;
                if (aVar.f18041c == 0) {
                    int i11 = this.f18033h;
                    int i12 = aVar.f18039a;
                    if (i11 != i12) {
                        d(i12);
                    }
                }
            } else {
                int i13 = this.f18032g.f18039a;
                if (i13 != -1) {
                    c(i13, 0.0f, 0);
                }
            }
            e(0);
            n();
        }
        if (this.f18030e == 2 && i10 == 0 && this.f18037l) {
            q();
            a aVar2 = this.f18032g;
            if (aVar2.f18041c == 0) {
                int i14 = this.f18034i;
                int i15 = aVar2.f18039a;
                if (i14 != i15) {
                    if (i15 == -1) {
                        i15 = 0;
                    }
                    d(i15);
                }
                e(0);
                n();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        if ((r5 < 0) == r3.f18027b.d()) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    @Override // androidx.recyclerview.widget.RecyclerView.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        this.f18036k = true;
        q();
        if (this.f18035j) {
            this.f18035j = false;
            if (i11 <= 0) {
                if (i11 == 0) {
                }
                i12 = this.f18032g.f18039a;
                this.f18034i = i12;
                if (this.f18033h != i12) {
                    d(i12);
                }
            }
            a aVar = this.f18032g;
            if (aVar.f18041c != 0) {
                i12 = aVar.f18039a + 1;
                this.f18034i = i12;
                if (this.f18033h != i12) {
                }
            }
            i12 = this.f18032g.f18039a;
            this.f18034i = i12;
            if (this.f18033h != i12) {
            }
        } else if (this.f18030e == 0) {
            int i13 = this.f18032g.f18039a;
            if (i13 == -1) {
                i13 = 0;
            }
            d(i13);
        }
        a aVar2 = this.f18032g;
        int i14 = aVar2.f18039a;
        if (i14 == -1) {
            i14 = 0;
        }
        c(i14, aVar2.f18040b, aVar2.f18041c);
        a aVar3 = this.f18032g;
        int i15 = aVar3.f18039a;
        int i16 = this.f18034i;
        if ((i15 == i16 || i16 == -1) && aVar3.f18041c == 0 && this.f18031f != 1) {
            e(0);
            n();
        }
    }

    double g() {
        q();
        a aVar = this.f18032g;
        return aVar.f18039a + aVar.f18040b;
    }

    int h() {
        return this.f18031f;
    }

    boolean i() {
        return this.f18038m;
    }

    boolean j() {
        return this.f18031f == 0;
    }

    void l() {
        this.f18037l = true;
    }

    void m(int i10, boolean z10) {
        this.f18030e = z10 ? 2 : 3;
        this.f18038m = false;
        boolean z11 = this.f18034i != i10;
        this.f18034i = i10;
        e(2);
        if (z11) {
            d(i10);
        }
    }

    void o(f.i iVar) {
        this.f18026a = iVar;
    }
}
