package Cb;

import Cb.e;
import expo.modules.kotlin.jni.JavaScriptTypedArray;
import java.nio.ByteBuffer;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import lc.z;

/* loaded from: classes2.dex */
public final class l implements j, e, i {

    /* renamed from: a, reason: collision with root package name */
    private final JavaScriptTypedArray f1079a;

    public l(JavaScriptTypedArray rawArray) {
        Intrinsics.checkNotNullParameter(rawArray, "rawArray");
        this.f1079a = rawArray;
    }

    @Override // Cb.i
    public JavaScriptTypedArray c() {
        return this.f1079a;
    }

    @Override // Cb.j
    public int e() {
        return this.f1079a.e();
    }

    @Override // Cb.e
    public /* bridge */ /* synthetic */ Object get(int i10) {
        return z.b(j(i10));
    }

    @Override // Cb.j
    public int getLength() {
        return this.f1079a.getLength();
    }

    @Override // Cb.j
    public int h() {
        return this.f1079a.h();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return e.a.a(this);
    }

    public short j(int i10) {
        if (i10 < 0 || i10 >= getLength()) {
            throw new IndexOutOfBoundsException();
        }
        return z.c(m(i10 * 2));
    }

    public short m(int i10) {
        return this.f1079a.read2Byte(i10);
    }

    @Override // Cb.j
    public ByteBuffer toDirectBuffer() {
        return this.f1079a.toDirectBuffer();
    }

    @Override // Cb.j
    public void write(byte[] buffer, int i10, int i11) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        this.f1079a.write(buffer, i10, i11);
    }
}
