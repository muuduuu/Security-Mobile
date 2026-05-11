package C5;

import C5.d;

/* loaded from: classes2.dex */
public class c extends d.c {

    /* renamed from: e, reason: collision with root package name */
    public static final String f894e;

    /* renamed from: f, reason: collision with root package name */
    public static final c f895f;

    /* renamed from: b, reason: collision with root package name */
    private final char[] f896b;

    /* renamed from: c, reason: collision with root package name */
    private final int f897c;

    /* renamed from: d, reason: collision with root package name */
    private final String f898d;

    static {
        String str;
        try {
            str = System.getProperty("line.separator");
        } catch (Throwable unused) {
            str = "\n";
        }
        f894e = str;
        f895f = new c("  ", str);
    }

    public c(String str, String str2) {
        this.f897c = str.length();
        this.f896b = new char[str.length() * 16];
        int i10 = 0;
        for (int i11 = 0; i11 < 16; i11++) {
            str.getChars(0, str.length(), this.f896b, i10);
            i10 += str.length();
        }
        this.f898d = str2;
    }

    @Override // C5.d.c, C5.d.b
    public boolean p() {
        return false;
    }

    @Override // C5.d.c, C5.d.b
    public void q(com.fasterxml.jackson.core.f fVar, int i10) {
        fVar.y1(this.f898d);
        if (i10 <= 0) {
            return;
        }
        int i11 = i10 * this.f897c;
        while (true) {
            char[] cArr = this.f896b;
            if (i11 <= cArr.length) {
                fVar.z1(cArr, 0, i11);
                return;
            } else {
                fVar.z1(cArr, 0, cArr.length);
                i11 -= this.f896b.length;
            }
        }
    }
}
