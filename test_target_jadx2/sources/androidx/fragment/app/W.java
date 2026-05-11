package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

/* loaded from: classes.dex */
final class W extends Writer {

    /* renamed from: a, reason: collision with root package name */
    private final String f16864a;

    /* renamed from: b, reason: collision with root package name */
    private StringBuilder f16865b = new StringBuilder(128);

    W(String str) {
        this.f16864a = str;
    }

    private void a() {
        if (this.f16865b.length() > 0) {
            Log.d(this.f16864a, this.f16865b.toString());
            StringBuilder sb2 = this.f16865b;
            sb2.delete(0, sb2.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        a();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            char c10 = cArr[i10 + i12];
            if (c10 == '\n') {
                a();
            } else {
                this.f16865b.append(c10);
            }
        }
    }
}
