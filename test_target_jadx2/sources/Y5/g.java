package y5;

import C5.j;
import java.io.Writer;

/* loaded from: classes2.dex */
public final class g extends Writer {

    /* renamed from: a, reason: collision with root package name */
    private final j f45348a;

    public g(C5.a aVar) {
        this.f45348a = new j(aVar);
    }

    public String a() {
        String h10 = this.f45348a.h();
        this.f45348a.l();
        return h10;
    }

    @Override // java.io.Writer
    public void write(char[] cArr) {
        this.f45348a.c(cArr, 0, cArr.length);
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i10, int i11) {
        this.f45348a.c(cArr, i10, i11);
    }

    @Override // java.io.Writer
    public void write(int i10) {
        this.f45348a.a((char) i10);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(char c10) {
        write(c10);
        return this;
    }

    @Override // java.io.Writer
    public void write(String str) {
        this.f45348a.b(str, 0, str.length());
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence) {
        String charSequence2 = charSequence.toString();
        this.f45348a.b(charSequence2, 0, charSequence2.length());
        return this;
    }

    @Override // java.io.Writer
    public void write(String str, int i10, int i11) {
        this.f45348a.b(str, i10, i11);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence, int i10, int i11) {
        String charSequence2 = charSequence.subSequence(i10, i11).toString();
        this.f45348a.b(charSequence2, 0, charSequence2.length());
        return this;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
    }
}
