package androidx.recyclerview.widget;

import android.view.View;

/* loaded from: classes.dex */
class p {

    /* renamed from: a, reason: collision with root package name */
    final b f17747a;

    /* renamed from: b, reason: collision with root package name */
    a f17748b = new a();

    static class a {

        /* renamed from: a, reason: collision with root package name */
        int f17749a = 0;

        /* renamed from: b, reason: collision with root package name */
        int f17750b;

        /* renamed from: c, reason: collision with root package name */
        int f17751c;

        /* renamed from: d, reason: collision with root package name */
        int f17752d;

        /* renamed from: e, reason: collision with root package name */
        int f17753e;

        a() {
        }

        void a(int i10) {
            this.f17749a = i10 | this.f17749a;
        }

        boolean b() {
            int i10 = this.f17749a;
            if ((i10 & 7) != 0 && (i10 & c(this.f17752d, this.f17750b)) == 0) {
                return false;
            }
            int i11 = this.f17749a;
            if ((i11 & 112) != 0 && (i11 & (c(this.f17752d, this.f17751c) << 4)) == 0) {
                return false;
            }
            int i12 = this.f17749a;
            if ((i12 & 1792) != 0 && (i12 & (c(this.f17753e, this.f17750b) << 8)) == 0) {
                return false;
            }
            int i13 = this.f17749a;
            return (i13 & 28672) == 0 || (i13 & (c(this.f17753e, this.f17751c) << 12)) != 0;
        }

        int c(int i10, int i11) {
            if (i10 > i11) {
                return 1;
            }
            return i10 == i11 ? 2 : 4;
        }

        void d() {
            this.f17749a = 0;
        }

        void e(int i10, int i11, int i12, int i13) {
            this.f17750b = i10;
            this.f17751c = i11;
            this.f17752d = i12;
            this.f17753e = i13;
        }
    }

    interface b {
        int a(View view);

        View b(int i10);

        int c();

        int d();

        int e(View view);
    }

    p(b bVar) {
        this.f17747a = bVar;
    }

    View a(int i10, int i11, int i12, int i13) {
        int c10 = this.f17747a.c();
        int d10 = this.f17747a.d();
        int i14 = i11 > i10 ? 1 : -1;
        View view = null;
        while (i10 != i11) {
            View b10 = this.f17747a.b(i10);
            this.f17748b.e(c10, d10, this.f17747a.a(b10), this.f17747a.e(b10));
            if (i12 != 0) {
                this.f17748b.d();
                this.f17748b.a(i12);
                if (this.f17748b.b()) {
                    return b10;
                }
            }
            if (i13 != 0) {
                this.f17748b.d();
                this.f17748b.a(i13);
                if (this.f17748b.b()) {
                    view = b10;
                }
            }
            i10 += i14;
        }
        return view;
    }

    boolean b(View view, int i10) {
        this.f17748b.e(this.f17747a.c(), this.f17747a.d(), this.f17747a.a(view), this.f17747a.e(view));
        if (i10 == 0) {
            return false;
        }
        this.f17748b.d();
        this.f17748b.a(i10);
        return this.f17748b.b();
    }
}
