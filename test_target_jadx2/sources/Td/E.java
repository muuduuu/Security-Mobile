package Td;

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.nio.charset.Charset;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import pe.AbstractC3884l;
import pe.C3880h;
import pe.C3889q;
import pe.InterfaceC3878f;
import pe.M;
import pe.S;
import pe.b0;

/* loaded from: classes3.dex */
public abstract class E {
    public static final a Companion = new a(null);

    public static final class a {

        /* renamed from: Td.E$a$a, reason: collision with other inner class name */
        public static final class C0187a extends E {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ z f9877a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ File f9878b;

            C0187a(z zVar, File file) {
                this.f9877a = zVar;
                this.f9878b = file;
            }

            @Override // Td.E
            public long contentLength() {
                return this.f9878b.length();
            }

            @Override // Td.E
            public z contentType() {
                return this.f9877a;
            }

            @Override // Td.E
            public void writeTo(InterfaceC3878f sink) {
                Intrinsics.checkNotNullParameter(sink, "sink");
                b0 j10 = M.j(this.f9878b);
                try {
                    sink.s0(j10);
                    kotlin.io.c.a(j10, null);
                } finally {
                }
            }
        }

        public static final class b extends E {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ z f9879a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AbstractC3884l f9880b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ S f9881c;

            b(z zVar, AbstractC3884l abstractC3884l, S s10) {
                this.f9879a = zVar;
                this.f9880b = abstractC3884l;
                this.f9881c = s10;
            }

            @Override // Td.E
            public long contentLength() {
                Long c10 = this.f9880b.l(this.f9881c).c();
                if (c10 != null) {
                    return c10.longValue();
                }
                return -1L;
            }

            @Override // Td.E
            public z contentType() {
                return this.f9879a;
            }

            @Override // Td.E
            public void writeTo(InterfaceC3878f sink) {
                Intrinsics.checkNotNullParameter(sink, "sink");
                b0 q10 = this.f9880b.q(this.f9881c);
                try {
                    sink.s0(q10);
                    kotlin.io.c.a(q10, null);
                } finally {
                }
            }
        }

        public static final class c extends E {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ E f9882a;

            c(E e10) {
                this.f9882a = e10;
            }

            @Override // Td.E
            public long contentLength() {
                return -1L;
            }

            @Override // Td.E
            public z contentType() {
                return this.f9882a.contentType();
            }

            @Override // Td.E
            public boolean isOneShot() {
                return this.f9882a.isOneShot();
            }

            @Override // Td.E
            public void writeTo(InterfaceC3878f sink) {
                Intrinsics.checkNotNullParameter(sink, "sink");
                InterfaceC3878f b10 = M.b(new C3889q(sink));
                try {
                    this.f9882a.writeTo(b10);
                    Unit unit = Unit.f36324a;
                    kotlin.io.c.a(b10, null);
                } finally {
                }
            }
        }

        public static final class d extends E {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ z f9883a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ FileDescriptor f9884b;

            d(z zVar, FileDescriptor fileDescriptor) {
                this.f9883a = zVar;
                this.f9884b = fileDescriptor;
            }

            @Override // Td.E
            public z contentType() {
                return this.f9883a;
            }

            @Override // Td.E
            public boolean isOneShot() {
                return true;
            }

            @Override // Td.E
            public void writeTo(InterfaceC3878f sink) {
                Intrinsics.checkNotNullParameter(sink, "sink");
                FileInputStream fileInputStream = new FileInputStream(this.f9884b);
                try {
                    sink.m().s0(M.k(fileInputStream));
                    kotlin.io.c.a(fileInputStream, null);
                } finally {
                }
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ E p(a aVar, z zVar, byte[] bArr, int i10, int i11, int i12, Object obj) {
            if ((i12 & 4) != 0) {
                i10 = 0;
            }
            if ((i12 & 8) != 0) {
                i11 = bArr.length;
            }
            return aVar.f(zVar, bArr, i10, i11);
        }

        public static /* synthetic */ E q(a aVar, String str, z zVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                zVar = null;
            }
            return aVar.i(str, zVar);
        }

        public static /* synthetic */ E r(a aVar, byte[] bArr, z zVar, int i10, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                zVar = null;
            }
            if ((i12 & 2) != 0) {
                i10 = 0;
            }
            if ((i12 & 4) != 0) {
                i11 = bArr.length;
            }
            return aVar.o(bArr, zVar, i10, i11);
        }

        public final E a(z zVar, File file) {
            Intrinsics.checkNotNullParameter(file, "file");
            return g(file, zVar);
        }

        public final E b(z zVar, String content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return i(content, zVar);
        }

        public final E c(z zVar, C3880h content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return j(content, zVar);
        }

        public final E d(z zVar, byte[] content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return p(this, zVar, content, 0, 0, 12, null);
        }

        public final E e(z zVar, byte[] content, int i10) {
            Intrinsics.checkNotNullParameter(content, "content");
            return p(this, zVar, content, i10, 0, 8, null);
        }

        public final E f(z zVar, byte[] content, int i10, int i11) {
            Intrinsics.checkNotNullParameter(content, "content");
            return o(content, zVar, i10, i11);
        }

        public final E g(File file, z zVar) {
            Intrinsics.checkNotNullParameter(file, "<this>");
            return new C0187a(zVar, file);
        }

        public final E h(FileDescriptor fileDescriptor, z zVar) {
            Intrinsics.checkNotNullParameter(fileDescriptor, "<this>");
            return new d(zVar, fileDescriptor);
        }

        public final E i(String str, z zVar) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            Pair b10 = Wd.a.b(zVar);
            Charset charset = (Charset) b10.getFirst();
            z zVar2 = (z) b10.getSecond();
            byte[] bytes = str.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            return o(bytes, zVar2, 0, bytes.length);
        }

        public final E j(C3880h c3880h, z zVar) {
            Intrinsics.checkNotNullParameter(c3880h, "<this>");
            return Wd.i.d(c3880h, zVar);
        }

        public final E k(S s10, AbstractC3884l fileSystem, z zVar) {
            Intrinsics.checkNotNullParameter(s10, "<this>");
            Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
            return new b(zVar, fileSystem, s10);
        }

        public final E l(byte[] bArr) {
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            return r(this, bArr, null, 0, 0, 7, null);
        }

        public final E m(byte[] bArr, z zVar) {
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            return r(this, bArr, zVar, 0, 0, 6, null);
        }

        public final E n(byte[] bArr, z zVar, int i10) {
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            return r(this, bArr, zVar, i10, 0, 4, null);
        }

        public final E o(byte[] bArr, z zVar, int i10, int i11) {
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            return Wd.i.e(bArr, zVar, i10, i11);
        }

        public final E s(E e10) {
            Intrinsics.checkNotNullParameter(e10, "<this>");
            return new c(e10);
        }

        private a() {
        }
    }

    public static final E create(z zVar, File file) {
        return Companion.a(zVar, file);
    }

    public static final E gzip(E e10) {
        return Companion.s(e10);
    }

    public long contentLength() {
        return Wd.i.a(this);
    }

    public abstract z contentType();

    public boolean isDuplex() {
        return Wd.i.b(this);
    }

    public boolean isOneShot() {
        return Wd.i.c(this);
    }

    public abstract void writeTo(InterfaceC3878f interfaceC3878f);

    public static final E create(z zVar, String str) {
        return Companion.b(zVar, str);
    }

    public static final E create(z zVar, C3880h c3880h) {
        return Companion.c(zVar, c3880h);
    }

    public static final E create(z zVar, byte[] bArr) {
        return Companion.d(zVar, bArr);
    }

    public static final E create(z zVar, byte[] bArr, int i10) {
        return Companion.e(zVar, bArr, i10);
    }

    public static final E create(z zVar, byte[] bArr, int i10, int i11) {
        return Companion.f(zVar, bArr, i10, i11);
    }

    public static final E create(File file, z zVar) {
        return Companion.g(file, zVar);
    }

    public static final E create(FileDescriptor fileDescriptor, z zVar) {
        return Companion.h(fileDescriptor, zVar);
    }

    public static final E create(String str, z zVar) {
        return Companion.i(str, zVar);
    }

    public static final E create(C3880h c3880h, z zVar) {
        return Companion.j(c3880h, zVar);
    }

    public static final E create(S s10, AbstractC3884l abstractC3884l, z zVar) {
        return Companion.k(s10, abstractC3884l, zVar);
    }

    public static final E create(byte[] bArr) {
        return Companion.l(bArr);
    }

    public static final E create(byte[] bArr, z zVar) {
        return Companion.m(bArr, zVar);
    }

    public static final E create(byte[] bArr, z zVar, int i10) {
        return Companion.n(bArr, zVar, i10);
    }

    public static final E create(byte[] bArr, z zVar, int i10, int i11) {
        return Companion.o(bArr, zVar, i10, i11);
    }
}
