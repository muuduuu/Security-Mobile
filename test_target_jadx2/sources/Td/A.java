package Td;

import Td.E;
import Td.v;
import Td.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import pe.C3877e;
import pe.C3880h;
import pe.InterfaceC3878f;

/* loaded from: classes3.dex */
public final class A extends E {

    /* renamed from: f, reason: collision with root package name */
    public static final b f9775f = new b(null);

    /* renamed from: g, reason: collision with root package name */
    public static final z f9776g;

    /* renamed from: h, reason: collision with root package name */
    public static final z f9777h;

    /* renamed from: i, reason: collision with root package name */
    public static final z f9778i;

    /* renamed from: j, reason: collision with root package name */
    public static final z f9779j;

    /* renamed from: k, reason: collision with root package name */
    public static final z f9780k;

    /* renamed from: l, reason: collision with root package name */
    private static final byte[] f9781l;

    /* renamed from: m, reason: collision with root package name */
    private static final byte[] f9782m;

    /* renamed from: n, reason: collision with root package name */
    private static final byte[] f9783n;

    /* renamed from: a, reason: collision with root package name */
    private final C3880h f9784a;

    /* renamed from: b, reason: collision with root package name */
    private final z f9785b;

    /* renamed from: c, reason: collision with root package name */
    private final List f9786c;

    /* renamed from: d, reason: collision with root package name */
    private final z f9787d;

    /* renamed from: e, reason: collision with root package name */
    private long f9788e;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final C3880h f9789a;

        /* renamed from: b, reason: collision with root package name */
        private z f9790b;

        /* renamed from: c, reason: collision with root package name */
        private final List f9791c;

        /* JADX WARN: Multi-variable type inference failed */
        public a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final a a(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            d(c.f9792c.b(name, value));
            return this;
        }

        public final a b(String name, String str, E body) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(body, "body");
            d(c.f9792c.c(name, str, body));
            return this;
        }

        public final a c(v vVar, E body) {
            Intrinsics.checkNotNullParameter(body, "body");
            d(c.f9792c.a(vVar, body));
            return this;
        }

        public final a d(c part) {
            Intrinsics.checkNotNullParameter(part, "part");
            this.f9791c.add(part);
            return this;
        }

        public final A e() {
            if (this.f9791c.isEmpty()) {
                throw new IllegalStateException("Multipart body must have at least one part.");
            }
            return new A(this.f9789a, this.f9790b, Wd.p.w(this.f9791c));
        }

        public final a f(z type) {
            Intrinsics.checkNotNullParameter(type, "type");
            if (Intrinsics.b(type.i(), "multipart")) {
                this.f9790b = type;
                return this;
            }
            throw new IllegalArgumentException(("multipart != " + type).toString());
        }

        public a(String boundary) {
            Intrinsics.checkNotNullParameter(boundary, "boundary");
            this.f9789a = C3880h.f38683d.d(boundary);
            this.f9790b = A.f9776g;
            this.f9791c = new ArrayList();
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ a(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
            if ((i10 & 1) != 0) {
                str = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(str, "toString(...)");
            }
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(StringBuilder sb2, String key) {
            Intrinsics.checkNotNullParameter(sb2, "<this>");
            Intrinsics.checkNotNullParameter(key, "key");
            sb2.append('\"');
            int length = key.length();
            for (int i10 = 0; i10 < length; i10++) {
                char charAt = key.charAt(i10);
                if (charAt == '\n') {
                    sb2.append("%0A");
                } else if (charAt == '\r') {
                    sb2.append("%0D");
                } else if (charAt == '\"') {
                    sb2.append("%22");
                } else {
                    sb2.append(charAt);
                }
            }
            sb2.append('\"');
        }

        private b() {
        }
    }

    public static final class c {

        /* renamed from: c, reason: collision with root package name */
        public static final a f9792c = new a(null);

        /* renamed from: a, reason: collision with root package name */
        private final v f9793a;

        /* renamed from: b, reason: collision with root package name */
        private final E f9794b;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final c a(v vVar, E body) {
                Intrinsics.checkNotNullParameter(body, "body");
                DefaultConstructorMarker defaultConstructorMarker = null;
                if ((vVar != null ? vVar.c("Content-Type") : null) != null) {
                    throw new IllegalArgumentException("Unexpected header: Content-Type");
                }
                if ((vVar != null ? vVar.c("Content-Length") : null) == null) {
                    return new c(vVar, body, defaultConstructorMarker);
                }
                throw new IllegalArgumentException("Unexpected header: Content-Length");
            }

            public final c b(String name, String value) {
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(value, "value");
                return c(name, null, E.a.q(E.Companion, value, null, 1, null));
            }

            public final c c(String name, String str, E body) {
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(body, "body");
                StringBuilder sb2 = new StringBuilder();
                sb2.append("form-data; name=");
                b bVar = A.f9775f;
                bVar.a(sb2, name);
                if (str != null) {
                    sb2.append("; filename=");
                    bVar.a(sb2, str);
                }
                String sb3 = sb2.toString();
                Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
                return a(new v.a().e("Content-Disposition", sb3).f(), body);
            }

            private a() {
            }
        }

        public /* synthetic */ c(v vVar, E e10, DefaultConstructorMarker defaultConstructorMarker) {
            this(vVar, e10);
        }

        public static final c b(String str, String str2) {
            return f9792c.b(str, str2);
        }

        public static final c c(String str, String str2, E e10) {
            return f9792c.c(str, str2, e10);
        }

        public final E a() {
            return this.f9794b;
        }

        public final v d() {
            return this.f9793a;
        }

        private c(v vVar, E e10) {
            this.f9793a = vVar;
            this.f9794b = e10;
        }
    }

    static {
        z.a aVar = z.f10239e;
        f9776g = aVar.a("multipart/mixed");
        f9777h = aVar.a("multipart/alternative");
        f9778i = aVar.a("multipart/digest");
        f9779j = aVar.a("multipart/parallel");
        f9780k = aVar.a("multipart/form-data");
        f9781l = new byte[]{58, 32};
        f9782m = new byte[]{13, 10};
        f9783n = new byte[]{45, 45};
    }

    public A(C3880h boundaryByteString, z type, List parts) {
        Intrinsics.checkNotNullParameter(boundaryByteString, "boundaryByteString");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(parts, "parts");
        this.f9784a = boundaryByteString;
        this.f9785b = type;
        this.f9786c = parts;
        this.f9787d = z.f10239e.a(type + "; boundary=" + a());
        this.f9788e = -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final long b(InterfaceC3878f interfaceC3878f, boolean z10) {
        C3877e c3877e;
        if (z10) {
            interfaceC3878f = new C3877e();
            c3877e = interfaceC3878f;
        } else {
            c3877e = 0;
        }
        int size = this.f9786c.size();
        long j10 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            c cVar = (c) this.f9786c.get(i10);
            v d10 = cVar.d();
            E a10 = cVar.a();
            Intrinsics.d(interfaceC3878f);
            interfaceC3878f.G1(f9783n);
            interfaceC3878f.Q1(this.f9784a);
            interfaceC3878f.G1(f9782m);
            if (d10 != null) {
                int size2 = d10.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    interfaceC3878f.T0(d10.h(i11)).G1(f9781l).T0(d10.v(i11)).G1(f9782m);
                }
            }
            z contentType = a10.contentType();
            if (contentType != null) {
                interfaceC3878f.T0("Content-Type: ").T0(contentType.toString()).G1(f9782m);
            }
            long contentLength = a10.contentLength();
            if (contentLength == -1 && z10) {
                Intrinsics.d(c3877e);
                c3877e.a();
                return -1L;
            }
            byte[] bArr = f9782m;
            interfaceC3878f.G1(bArr);
            if (z10) {
                j10 += contentLength;
            } else {
                a10.writeTo(interfaceC3878f);
            }
            interfaceC3878f.G1(bArr);
        }
        Intrinsics.d(interfaceC3878f);
        byte[] bArr2 = f9783n;
        interfaceC3878f.G1(bArr2);
        interfaceC3878f.Q1(this.f9784a);
        interfaceC3878f.G1(bArr2);
        interfaceC3878f.G1(f9782m);
        if (!z10) {
            return j10;
        }
        Intrinsics.d(c3877e);
        long size3 = j10 + c3877e.size();
        c3877e.a();
        return size3;
    }

    public final String a() {
        return this.f9784a.R();
    }

    @Override // Td.E
    public long contentLength() {
        long j10 = this.f9788e;
        if (j10 != -1) {
            return j10;
        }
        long b10 = b(null, true);
        this.f9788e = b10;
        return b10;
    }

    @Override // Td.E
    public z contentType() {
        return this.f9787d;
    }

    @Override // Td.E
    public boolean isOneShot() {
        List list = this.f9786c;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((c) it.next()).a().isOneShot()) {
                return true;
            }
        }
        return false;
    }

    @Override // Td.E
    public void writeTo(InterfaceC3878f sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        b(sink, false);
    }
}
