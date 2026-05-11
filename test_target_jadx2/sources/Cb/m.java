package Cb;

import Cb.e;
import expo.modules.kotlin.jni.JavaScriptTypedArray;
import java.nio.ByteBuffer;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import lc.w;

/* loaded from: classes2.dex */
public final class m implements j, e, i {

    /* renamed from: a, reason: collision with root package name */
    private final JavaScriptTypedArray f1080a;

    public m(JavaScriptTypedArray rawArray) {
        Intrinsics.checkNotNullParameter(rawArray, "rawArray");
        this.f1080a = rawArray;
    }

    @Override // Cb.i
    public JavaScriptTypedArray c() {
        return this.f1080a;
    }

    @Override // Cb.j
    public int e() {
        return this.f1080a.e();
    }

    @Override // Cb.e
    public /* bridge */ /* synthetic */ Object get(int i10) {
        return w.b(j(i10));
    }

    @Override // Cb.j
    public int getLength() {
        return this.f1080a.getLength();
    }

    @Override // Cb.j
    public int h() {
        return this.f1080a.h();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return e.a.a(this);
    }

    public int j(int i10) {
        if (i10 < 0 || i10 >= getLength()) {
            throw new IndexOutOfBoundsException();
        }
        return w.c(m(i10 * 4));
    }

    public int m(int i10) {
        return this.f1080a.read4Byte(i10);
    }

    @Override // Cb.j
    public ByteBuffer toDirectBuffer() {
        return this.f1080a.toDirectBuffer();
    }

    @Override // Cb.j
    public void write(byte[] buffer, int i10, int i11) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        this.f1080a.write(buffer, i10, i11);
    }
}
