package b8;

import android.graphics.Rect;
import java.io.Closeable;
import java.util.Collections;
import java.util.List;

/* renamed from: b8.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1659f implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    private final j f18867a;

    /* renamed from: b, reason: collision with root package name */
    private final int f18868b;

    /* renamed from: c, reason: collision with root package name */
    private final Rect f18869c;

    /* renamed from: d, reason: collision with root package name */
    private final int f18870d;

    /* renamed from: e, reason: collision with root package name */
    private final int f18871e;

    /* renamed from: f, reason: collision with root package name */
    private int f18872f;

    /* renamed from: b8.f$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final C1659f f18873a;

        /* synthetic */ a(C1659f c1659f, m mVar) {
            this.f18873a = c1659f;
        }

        public void a() {
            this.f18873a.g();
        }
    }

    C1659f(j jVar, int i10, Rect rect, long j10, int i11, int i12) {
        this.f18867a = jVar;
        this.f18868b = i10;
        Rect rect2 = new Rect();
        this.f18869c = rect2;
        rect2.set(rect);
        this.f18870d = i11;
        this.f18871e = i12;
        this.f18872f = 1;
    }

    static void f(int i10) {
        if (i10 == 0 || i10 == 90 || i10 == 180 || i10 == 270) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(68);
        sb2.append("Rotation value ");
        sb2.append(i10);
        sb2.append(" is not valid. Use only 0, 90, 180 or 270.");
        throw new IllegalArgumentException(sb2.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void g() {
        this.f18872f++;
    }

    public List a() {
        return Collections.singletonList(this.f18867a.zzb());
    }

    public a b() {
        return new a(this, null);
    }

    public int c() {
        return this.f18868b;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        int i10 = this.f18872f - 1;
        this.f18872f = i10;
        if (i10 == 0) {
            this.f18867a.a();
        }
    }

    final j d() {
        return this.f18867a;
    }

    public int getHeight() {
        return this.f18871e;
    }

    public int getWidth() {
        return this.f18870d;
    }
}
