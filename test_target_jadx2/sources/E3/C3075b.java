package e3;

import java.nio.ByteBuffer;

/* renamed from: e3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3075b implements y0.d {

    /* renamed from: a, reason: collision with root package name */
    public static final C3075b f32181a = new C3075b();

    /* renamed from: b, reason: collision with root package name */
    private static int f32182b = 16384;

    /* renamed from: c, reason: collision with root package name */
    private static final ThreadLocal f32183c = new a();

    /* renamed from: e3.b$a */
    class a extends ThreadLocal {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ByteBuffer initialValue() {
            return ByteBuffer.allocate(C3075b.f32182b);
        }
    }

    public static int e() {
        return f32182b;
    }

    @Override // y0.d
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public ByteBuffer b() {
        return (ByteBuffer) f32183c.get();
    }

    @Override // y0.d
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean a(ByteBuffer byteBuffer) {
        return true;
    }
}
