package Cb;

import Cb.e;
import expo.modules.kotlin.jni.JavaScriptTypedArray;
import java.nio.ByteBuffer;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class f implements j, e, i {

    /* renamed from: a, reason: collision with root package name */
    private final JavaScriptTypedArray f1074a;

    public f(JavaScriptTypedArray rawArray) {
        Intrinsics.checkNotNullParameter(rawArray, "rawArray");
        this.f1074a = rawArray;
    }

    @Override // Cb.i
    public JavaScriptTypedArray c() {
        return this.f1074a;
    }

    @Override // Cb.j
    public int e() {
        return this.f1074a.e();
    }

    @Override // Cb.j
    public int getLength() {
        return this.f1074a.getLength();
    }

    @Override // Cb.j
    public int h() {
        return this.f1074a.h();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return e.a.a(this);
    }

    @Override // Cb.e
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public Short get(int i10) {
        if (i10 < 0 || i10 >= getLength()) {
            throw new IndexOutOfBoundsException();
        }
        return Short.valueOf(m(i10 * 2));
    }

    public short m(int i10) {
        return this.f1074a.read2Byte(i10);
    }

    @Override // Cb.j
    public ByteBuffer toDirectBuffer() {
        return this.f1074a.toDirectBuffer();
    }

    @Override // Cb.j
    public void write(byte[] buffer, int i10, int i11) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        this.f1074a.write(buffer, i10, i11);
    }
}
