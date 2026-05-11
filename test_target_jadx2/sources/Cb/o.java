package Cb;

import Cb.e;
import expo.modules.kotlin.jni.JavaScriptTypedArray;
import java.nio.ByteBuffer;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import lc.v;

/* loaded from: classes2.dex */
public final class o implements j, e, i {

    /* renamed from: a, reason: collision with root package name */
    private final JavaScriptTypedArray f1082a;

    public o(JavaScriptTypedArray rawArray) {
        Intrinsics.checkNotNullParameter(rawArray, "rawArray");
        this.f1082a = rawArray;
    }

    @Override // Cb.i
    public JavaScriptTypedArray c() {
        return this.f1082a;
    }

    @Override // Cb.j
    public int e() {
        return this.f1082a.e();
    }

    @Override // Cb.e
    public /* bridge */ /* synthetic */ Object get(int i10) {
        return v.b(j(i10));
    }

    @Override // Cb.j
    public int getLength() {
        return this.f1082a.getLength();
    }

    @Override // Cb.j
    public int h() {
        return this.f1082a.h();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return e.a.a(this);
    }

    public byte j(int i10) {
        if (i10 < 0 || i10 >= getLength()) {
            throw new IndexOutOfBoundsException();
        }
        return v.c(m(i10));
    }

    public byte m(int i10) {
        return this.f1082a.readByte(i10);
    }

    @Override // Cb.j
    public ByteBuffer toDirectBuffer() {
        return this.f1082a.toDirectBuffer();
    }

    @Override // Cb.j
    public void write(byte[] buffer, int i10, int i11) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        this.f1082a.write(buffer, i10, i11);
    }
}
