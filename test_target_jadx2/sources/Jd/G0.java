package Jd;

import Od.AbstractC1084l;

/* loaded from: classes3.dex */
public abstract class G0 extends J {
    @Override // Jd.J
    public J i0(int i10, String str) {
        AbstractC1084l.a(i10);
        return AbstractC1084l.b(this, str);
    }

    public abstract G0 y0();

    protected final String z0() {
        G0 g02;
        G0 c10 = C0874b0.c();
        if (this == c10) {
            return "Dispatchers.Main";
        }
        try {
            g02 = c10.y0();
        } catch (UnsupportedOperationException unused) {
            g02 = null;
        }
        if (this == g02) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }
}
