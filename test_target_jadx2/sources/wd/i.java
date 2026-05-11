package Wd;

import Td.E;
import Td.z;
import kotlin.jvm.internal.Intrinsics;
import pe.C3880h;
import pe.InterfaceC3878f;

/* loaded from: classes3.dex */
public abstract class i {

    public static final class a extends E {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ z f11580a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f11581b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ byte[] f11582c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f11583d;

        a(z zVar, int i10, byte[] bArr, int i11) {
            this.f11580a = zVar;
            this.f11581b = i10;
            this.f11582c = bArr;
            this.f11583d = i11;
        }

        @Override // Td.E
        public long contentLength() {
            return this.f11581b;
        }

        @Override // Td.E
        /* renamed from: contentType */
        public z getContentType() {
            return this.f11580a;
        }

        @Override // Td.E
        public void writeTo(InterfaceC3878f sink) {
            Intrinsics.checkNotNullParameter(sink, "sink");
            sink.write(this.f11582c, this.f11583d, this.f11581b);
        }
    }

    public static final class b extends E {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ z f11584a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C3880h f11585b;

        b(z zVar, C3880h c3880h) {
            this.f11584a = zVar;
            this.f11585b = c3880h;
        }

        @Override // Td.E
        public long contentLength() {
            return this.f11585b.L();
        }

        @Override // Td.E
        /* renamed from: contentType */
        public z getContentType() {
            return this.f11584a;
        }

        @Override // Td.E
        public void writeTo(InterfaceC3878f sink) {
            Intrinsics.checkNotNullParameter(sink, "sink");
            sink.Q1(this.f11585b);
        }
    }

    public static final long a(E e10) {
        Intrinsics.checkNotNullParameter(e10, "<this>");
        return -1L;
    }

    public static final boolean b(E e10) {
        Intrinsics.checkNotNullParameter(e10, "<this>");
        return false;
    }

    public static final boolean c(E e10) {
        Intrinsics.checkNotNullParameter(e10, "<this>");
        return false;
    }

    public static final E d(C3880h c3880h, z zVar) {
        Intrinsics.checkNotNullParameter(c3880h, "<this>");
        return new b(zVar, c3880h);
    }

    public static final E e(byte[] bArr, z zVar, int i10, int i11) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        m.e(bArr.length, i10, i11);
        return new a(zVar, i11, bArr, i10);
    }
}
