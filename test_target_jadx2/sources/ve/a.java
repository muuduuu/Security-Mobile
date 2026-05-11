package ve;

import java.io.Serializable;
import java.io.Writer;

/* loaded from: classes3.dex */
public class a extends Writer implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private final StringBuilder f44224a;

    public a() {
        this.f44224a = new StringBuilder();
    }

    public String toString() {
        return this.f44224a.toString();
    }

    @Override // java.io.Writer
    public void write(String str) {
        if (str != null) {
            this.f44224a.append(str);
        }
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i10, int i11) {
        if (cArr != null) {
            this.f44224a.append(cArr, i10, i11);
        }
    }

    public a(int i10) {
        this.f44224a = new StringBuilder(i10);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(char c10) {
        this.f44224a.append(c10);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence) {
        this.f44224a.append(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence, int i10, int i11) {
        this.f44224a.append(charSequence, i10, i11);
        return this;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
    }
}
