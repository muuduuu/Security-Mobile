package k6;

import com.github.penfeizhou.animation.gif.io.GifReader;

/* loaded from: classes2.dex */
public class k implements InterfaceC3547b {

    /* renamed from: a, reason: collision with root package name */
    public int f36254a;

    /* renamed from: b, reason: collision with root package name */
    public int f36255b;

    /* renamed from: c, reason: collision with root package name */
    byte f36256c;

    /* renamed from: d, reason: collision with root package name */
    public byte f36257d;

    /* renamed from: e, reason: collision with root package name */
    byte f36258e;

    @Override // k6.InterfaceC3547b
    public void a(GifReader gifReader) {
        this.f36254a = gifReader.readUInt16();
        this.f36255b = gifReader.readUInt16();
        this.f36256c = gifReader.peek();
        this.f36257d = gifReader.peek();
        this.f36258e = gifReader.peek();
    }

    public boolean b() {
        return (this.f36256c & 128) == 128;
    }

    public int c() {
        return 2 << (this.f36256c & 7);
    }
}
