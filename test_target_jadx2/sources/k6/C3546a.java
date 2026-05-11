package k6;

import com.github.penfeizhou.animation.gif.io.GifReader;

/* renamed from: k6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3546a extends f {

    /* renamed from: a, reason: collision with root package name */
    public int f36229a = -1;

    /* renamed from: b, reason: collision with root package name */
    public String f36230b;

    @Override // k6.InterfaceC3547b
    public void a(GifReader gifReader) {
        byte peek = gifReader.peek();
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < peek; i10++) {
            sb2.append((char) gifReader.peek());
        }
        String sb3 = sb2.toString();
        this.f36230b = sb3;
        if (!"NETSCAPE2.0".equals(sb3)) {
            while (!C3550e.c(gifReader).b()) {
            }
            return;
        }
        if ((gifReader.peek() & 255) == 3 && (gifReader.peek() & 255) == 1) {
            this.f36229a = gifReader.readUInt16();
        }
        while (!C3550e.c(gifReader).b()) {
        }
    }
}
