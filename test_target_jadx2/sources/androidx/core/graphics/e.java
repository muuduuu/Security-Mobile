package androidx.core.graphics;

import android.graphics.Insets;
import android.graphics.Rect;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: e, reason: collision with root package name */
    public static final e f15923e = new e(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f15924a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15925b;

    /* renamed from: c, reason: collision with root package name */
    public final int f15926c;

    /* renamed from: d, reason: collision with root package name */
    public final int f15927d;

    static class a {
        static Insets a(int i10, int i11, int i12, int i13) {
            return Insets.of(i10, i11, i12, i13);
        }
    }

    private e(int i10, int i11, int i12, int i13) {
        this.f15924a = i10;
        this.f15925b = i11;
        this.f15926c = i12;
        this.f15927d = i13;
    }

    public static e a(e eVar, e eVar2) {
        return b(Math.max(eVar.f15924a, eVar2.f15924a), Math.max(eVar.f15925b, eVar2.f15925b), Math.max(eVar.f15926c, eVar2.f15926c), Math.max(eVar.f15927d, eVar2.f15927d));
    }

    public static e b(int i10, int i11, int i12, int i13) {
        return (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) ? f15923e : new e(i10, i11, i12, i13);
    }

    public static e c(Rect rect) {
        return b(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static e d(e eVar, e eVar2) {
        return b(eVar.f15924a - eVar2.f15924a, eVar.f15925b - eVar2.f15925b, eVar.f15926c - eVar2.f15926c, eVar.f15927d - eVar2.f15927d);
    }

    public static e e(Insets insets) {
        int i10;
        int i11;
        int i12;
        int i13;
        i10 = insets.left;
        i11 = insets.top;
        i12 = insets.right;
        i13 = insets.bottom;
        return b(i10, i11, i12, i13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return this.f15927d == eVar.f15927d && this.f15924a == eVar.f15924a && this.f15926c == eVar.f15926c && this.f15925b == eVar.f15925b;
    }

    public Insets f() {
        return a.a(this.f15924a, this.f15925b, this.f15926c, this.f15927d);
    }

    public int hashCode() {
        return (((((this.f15924a * 31) + this.f15925b) * 31) + this.f15926c) * 31) + this.f15927d;
    }

    public String toString() {
        return "Insets{left=" + this.f15924a + ", top=" + this.f15925b + ", right=" + this.f15926c + ", bottom=" + this.f15927d + '}';
    }
}
