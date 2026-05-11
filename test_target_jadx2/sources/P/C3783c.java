package p;

import java.util.Arrays;

/* renamed from: p.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C3783c {

    /* renamed from: a, reason: collision with root package name */
    private final int f38091a;

    /* renamed from: b, reason: collision with root package name */
    private final CharSequence f38092b;

    C3783c(int i10, CharSequence charSequence) {
        this.f38091a = i10;
        this.f38092b = charSequence;
    }

    private static String a(CharSequence charSequence) {
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    private boolean d(CharSequence charSequence) {
        String a10 = a(this.f38092b);
        String a11 = a(charSequence);
        return (a10 == null && a11 == null) || (a10 != null && a10.equals(a11));
    }

    int b() {
        return this.f38091a;
    }

    CharSequence c() {
        return this.f38092b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C3783c)) {
            return false;
        }
        C3783c c3783c = (C3783c) obj;
        return this.f38091a == c3783c.f38091a && d(c3783c.f38092b);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f38091a), a(this.f38092b)});
    }
}
