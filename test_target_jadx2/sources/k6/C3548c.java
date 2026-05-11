package k6;

import com.github.penfeizhou.animation.gif.io.GifReader;

/* renamed from: k6.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3548c implements InterfaceC3547b {

    /* renamed from: a, reason: collision with root package name */
    private int[] f36231a;

    public C3548c(int i10) {
        this.f36231a = new int[i10];
    }

    @Override // k6.InterfaceC3547b
    public void a(GifReader gifReader) {
        for (int i10 = 0; i10 < this.f36231a.length; i10++) {
            byte peek = gifReader.peek();
            byte peek2 = gifReader.peek();
            int i11 = (peek2 & 255) << 8;
            int i12 = peek & 255;
            this.f36231a[i10] = i12 | i11 | ((gifReader.peek() & 255) << 16) | (-16777216);
        }
    }

    public int[] b() {
        return this.f36231a;
    }
}
