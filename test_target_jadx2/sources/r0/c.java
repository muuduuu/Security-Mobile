package R0;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    protected int f8366a;

    /* renamed from: b, reason: collision with root package name */
    protected ByteBuffer f8367b;

    /* renamed from: c, reason: collision with root package name */
    private int f8368c;

    /* renamed from: d, reason: collision with root package name */
    private int f8369d;

    /* renamed from: e, reason: collision with root package name */
    d f8370e = d.a();

    protected int a(int i10) {
        return i10 + this.f8367b.getInt(i10);
    }

    protected int b(int i10) {
        if (i10 < this.f8369d) {
            return this.f8367b.getShort(this.f8368c + i10);
        }
        return 0;
    }

    protected void c(int i10, ByteBuffer byteBuffer) {
        this.f8367b = byteBuffer;
        if (byteBuffer == null) {
            this.f8366a = 0;
            this.f8368c = 0;
            this.f8369d = 0;
        } else {
            this.f8366a = i10;
            int i11 = i10 - byteBuffer.getInt(i10);
            this.f8368c = i11;
            this.f8369d = this.f8367b.getShort(i11);
        }
    }

    protected int d(int i10) {
        int i11 = i10 + this.f8366a;
        return i11 + this.f8367b.getInt(i11) + 4;
    }

    protected int e(int i10) {
        int i11 = i10 + this.f8366a;
        return this.f8367b.getInt(i11 + this.f8367b.getInt(i11));
    }
}
