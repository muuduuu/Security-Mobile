package k6;

import com.github.penfeizhou.animation.gif.io.GifReader;

/* renamed from: k6.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3550e implements InterfaceC3547b {

    /* renamed from: c, reason: collision with root package name */
    public static final C3550e f36233c = new C3550e(0);

    /* renamed from: a, reason: collision with root package name */
    private final int f36234a;

    /* renamed from: b, reason: collision with root package name */
    private int f36235b;

    public C3550e(int i10) {
        this.f36234a = i10;
    }

    public static C3550e c(GifReader gifReader) {
        int peek = gifReader.peek() & 255;
        if (peek == 0) {
            return f36233c;
        }
        C3550e c3550e = new C3550e(peek);
        c3550e.f36235b = gifReader.position();
        c3550e.a(gifReader);
        return c3550e;
    }

    @Override // k6.InterfaceC3547b
    public void a(GifReader gifReader) {
        gifReader.skip(this.f36234a);
    }

    public boolean b() {
        return this == f36233c;
    }
}
