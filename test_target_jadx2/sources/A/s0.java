package A;

import A.C0693e;
import android.graphics.Rect;
import android.util.Size;

/* loaded from: classes.dex */
public class s0 {

    /* renamed from: a, reason: collision with root package name */
    private final a f229a;

    static abstract class a {

        /* renamed from: A.s0$a$a, reason: collision with other inner class name */
        static abstract class AbstractC0000a {
            AbstractC0000a() {
            }

            abstract a a();

            abstract AbstractC0000a b(Rect rect);

            abstract AbstractC0000a c(int i10);
        }

        a() {
        }

        abstract Rect a();

        abstract Size b();

        abstract int c();
    }

    public s0(Size size, Rect rect, int i10) {
        this.f229a = new C0693e.b().d(size).b(rect).c(i10).a();
    }

    public Size a() {
        return this.f229a.b();
    }

    public boolean equals(Object obj) {
        return this.f229a.equals(obj);
    }

    public int hashCode() {
        return this.f229a.hashCode();
    }

    public String toString() {
        return this.f229a.toString();
    }
}
