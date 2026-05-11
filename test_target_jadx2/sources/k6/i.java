package k6;

import com.github.penfeizhou.animation.gif.io.GifReader;
import k6.h;

/* loaded from: classes2.dex */
public class i extends f {

    /* renamed from: a, reason: collision with root package name */
    private int f36242a;

    /* renamed from: b, reason: collision with root package name */
    private byte f36243b;

    /* renamed from: c, reason: collision with root package name */
    public int f36244c;

    /* renamed from: d, reason: collision with root package name */
    public int f36245d;

    @Override // k6.InterfaceC3547b
    public void a(GifReader gifReader) {
        this.f36242a = gifReader.peek() & 255;
        this.f36243b = gifReader.peek();
        this.f36244c = gifReader.readUInt16();
        this.f36245d = gifReader.peek() & 255;
        if (gifReader.peek() != 0) {
            throw new h.a();
        }
    }

    public int c() {
        return (this.f36243b >> 2) & 7;
    }

    public boolean d() {
        return (this.f36243b & 1) == 1;
    }
}
