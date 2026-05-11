package k6;

import com.github.penfeizhou.animation.gif.io.GifReader;

/* loaded from: classes2.dex */
public class j implements InterfaceC3547b {

    /* renamed from: a, reason: collision with root package name */
    public int f36246a;

    /* renamed from: b, reason: collision with root package name */
    public int f36247b;

    /* renamed from: c, reason: collision with root package name */
    public int f36248c;

    /* renamed from: d, reason: collision with root package name */
    public int f36249d;

    /* renamed from: e, reason: collision with root package name */
    private byte f36250e;

    /* renamed from: f, reason: collision with root package name */
    public C3548c f36251f;

    /* renamed from: g, reason: collision with root package name */
    public int f36252g;

    /* renamed from: h, reason: collision with root package name */
    public int f36253h;

    @Override // k6.InterfaceC3547b
    public void a(GifReader gifReader) {
        this.f36246a = gifReader.readUInt16();
        this.f36247b = gifReader.readUInt16();
        this.f36248c = gifReader.readUInt16();
        this.f36249d = gifReader.readUInt16();
        this.f36250e = gifReader.peek();
        if (c()) {
            C3548c c3548c = new C3548c(d());
            this.f36251f = c3548c;
            c3548c.a(gifReader);
        }
        this.f36252g = gifReader.peek() & 255;
        this.f36253h = gifReader.position();
        while (true) {
            if (gifReader.peek() == 0) {
                return;
            } else {
                gifReader.skip(r0 & 255);
            }
        }
    }

    public boolean b() {
        return (this.f36250e & 64) == 64;
    }

    public boolean c() {
        return (this.f36250e & 128) == 128;
    }

    public int d() {
        return 2 << (this.f36250e & 15);
    }
}
