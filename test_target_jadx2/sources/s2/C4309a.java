package s2;

import com.bumptech.glide.load.data.e;
import java.nio.ByteBuffer;

/* renamed from: s2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4309a implements e {

    /* renamed from: a, reason: collision with root package name */
    private final ByteBuffer f40760a;

    /* renamed from: s2.a$a, reason: collision with other inner class name */
    public static class C0610a implements e.a {
        @Override // com.bumptech.glide.load.data.e.a
        public Class a() {
            return ByteBuffer.class;
        }

        @Override // com.bumptech.glide.load.data.e.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public e b(ByteBuffer byteBuffer) {
            return new C4309a(byteBuffer);
        }
    }

    public C4309a(ByteBuffer byteBuffer) {
        this.f40760a = byteBuffer;
    }

    @Override // com.bumptech.glide.load.data.e
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public ByteBuffer a() {
        this.f40760a.position(0);
        return this.f40760a;
    }

    @Override // com.bumptech.glide.load.data.e
    public void b() {
    }
}
