package o2;

import com.bumptech.glide.load.data.d;
import i2.EnumC3313a;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import o2.n;

/* renamed from: o2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3743b implements n {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC0579b f37811a;

    /* renamed from: o2.b$b, reason: collision with other inner class name */
    public interface InterfaceC0579b {
        Class a();

        Object b(byte[] bArr);
    }

    public C3743b(InterfaceC0579b interfaceC0579b) {
        this.f37811a = interfaceC0579b;
    }

    @Override // o2.n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a b(byte[] bArr, int i10, int i11, i2.h hVar) {
        return new n.a(new C2.c(bArr), new c(bArr, this.f37811a));
    }

    @Override // o2.n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(byte[] bArr) {
        return true;
    }

    /* renamed from: o2.b$a */
    public static class a implements o {

        /* renamed from: o2.b$a$a, reason: collision with other inner class name */
        class C0578a implements InterfaceC0579b {
            C0578a() {
            }

            @Override // o2.C3743b.InterfaceC0579b
            public Class a() {
                return ByteBuffer.class;
            }

            @Override // o2.C3743b.InterfaceC0579b
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public ByteBuffer b(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }
        }

        @Override // o2.o
        public n e(r rVar) {
            return new C3743b(new C0578a());
        }

        @Override // o2.o
        public void d() {
        }
    }

    /* renamed from: o2.b$c */
    private static class c implements com.bumptech.glide.load.data.d {

        /* renamed from: a, reason: collision with root package name */
        private final byte[] f37813a;

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC0579b f37814b;

        c(byte[] bArr, InterfaceC0579b interfaceC0579b) {
            this.f37813a = bArr;
            this.f37814b = interfaceC0579b;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class a() {
            return this.f37814b.a();
        }

        @Override // com.bumptech.glide.load.data.d
        public EnumC3313a e() {
            return EnumC3313a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void f(com.bumptech.glide.h hVar, d.a aVar) {
            aVar.d(this.f37814b.b(this.f37813a));
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }
    }

    /* renamed from: o2.b$d */
    public static class d implements o {

        /* renamed from: o2.b$d$a */
        class a implements InterfaceC0579b {
            a() {
            }

            @Override // o2.C3743b.InterfaceC0579b
            public Class a() {
                return InputStream.class;
            }

            @Override // o2.C3743b.InterfaceC0579b
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public InputStream b(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }
        }

        @Override // o2.o
        public n e(r rVar) {
            return new C3743b(new a());
        }

        @Override // o2.o
        public void d() {
        }
    }
}
