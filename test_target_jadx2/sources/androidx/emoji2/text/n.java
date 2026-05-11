package androidx.emoji2.text;

import android.graphics.Typeface;
import android.util.SparseArray;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private final R0.b f16567a;

    /* renamed from: b, reason: collision with root package name */
    private final char[] f16568b;

    /* renamed from: c, reason: collision with root package name */
    private final a f16569c = new a(1024);

    /* renamed from: d, reason: collision with root package name */
    private final Typeface f16570d;

    static class a {

        /* renamed from: a, reason: collision with root package name */
        private final SparseArray f16571a;

        /* renamed from: b, reason: collision with root package name */
        private p f16572b;

        private a() {
            this(1);
        }

        a a(int i10) {
            SparseArray sparseArray = this.f16571a;
            if (sparseArray == null) {
                return null;
            }
            return (a) sparseArray.get(i10);
        }

        final p b() {
            return this.f16572b;
        }

        void c(p pVar, int i10, int i11) {
            a a10 = a(pVar.b(i10));
            if (a10 == null) {
                a10 = new a();
                this.f16571a.put(pVar.b(i10), a10);
            }
            if (i11 > i10) {
                a10.c(pVar, i10 + 1, i11);
            } else {
                a10.f16572b = pVar;
            }
        }

        a(int i10) {
            this.f16571a = new SparseArray(i10);
        }
    }

    private n(Typeface typeface, R0.b bVar) {
        this.f16570d = typeface;
        this.f16567a = bVar;
        this.f16568b = new char[bVar.k() * 2];
        a(bVar);
    }

    private void a(R0.b bVar) {
        int k10 = bVar.k();
        for (int i10 = 0; i10 < k10; i10++) {
            p pVar = new p(this, i10);
            Character.toChars(pVar.f(), this.f16568b, i10 * 2);
            h(pVar);
        }
    }

    public static n b(Typeface typeface, ByteBuffer byteBuffer) {
        try {
            androidx.core.os.o.a("EmojiCompat.MetadataRepo.create");
            return new n(typeface, m.b(byteBuffer));
        } finally {
            androidx.core.os.o.b();
        }
    }

    public char[] c() {
        return this.f16568b;
    }

    public R0.b d() {
        return this.f16567a;
    }

    int e() {
        return this.f16567a.l();
    }

    a f() {
        return this.f16569c;
    }

    Typeface g() {
        return this.f16570d;
    }

    void h(p pVar) {
        y0.f.h(pVar, "emoji metadata cannot be null");
        y0.f.b(pVar.c() > 0, "invalid metadata codepoint length");
        this.f16569c.c(pVar, 0, pVar.c() - 1);
    }
}
