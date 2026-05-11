package c0;

import android.util.Range;

/* loaded from: classes.dex */
public interface r0 extends f0 {
    default boolean a(int i10, int i11) {
        return i(i10, i11) || (d() && i(i11, i10));
    }

    int b();

    Range c();

    boolean d();

    Range e(int i10);

    Range f(int i10);

    int g();

    Range h();

    boolean i(int i10, int i11);

    Range j();
}
