package C;

import E.i;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.media.Image;
import androidx.camera.core.impl.d1;
import androidx.camera.core.n;
import java.nio.ByteBuffer;
import java.util.Objects;

/* loaded from: classes.dex */
public final class U implements androidx.camera.core.n {

    /* renamed from: a, reason: collision with root package name */
    private final Object f635a;

    /* renamed from: b, reason: collision with root package name */
    private final int f636b;

    /* renamed from: c, reason: collision with root package name */
    private final int f637c;

    /* renamed from: d, reason: collision with root package name */
    private final Rect f638d;

    /* renamed from: e, reason: collision with root package name */
    n.a[] f639e;

    /* renamed from: f, reason: collision with root package name */
    private final A.Y f640f;

    class a implements n.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f641a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f642b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ByteBuffer f643c;

        a(int i10, int i11, ByteBuffer byteBuffer) {
            this.f641a = i10;
            this.f642b = i11;
            this.f643c = byteBuffer;
        }

        @Override // androidx.camera.core.n.a
        public ByteBuffer m() {
            return this.f643c;
        }

        @Override // androidx.camera.core.n.a
        public int n() {
            return this.f641a;
        }

        @Override // androidx.camera.core.n.a
        public int o() {
            return this.f642b;
        }
    }

    class b implements A.Y {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f644a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f645b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Matrix f646c;

        b(long j10, int i10, Matrix matrix) {
            this.f644a = j10;
            this.f645b = i10;
            this.f646c = matrix;
        }

        @Override // A.Y
        public long a() {
            return this.f644a;
        }

        @Override // A.Y
        public void b(i.b bVar) {
            throw new UnsupportedOperationException("Custom ImageProxy does not contain Exif data.");
        }

        @Override // A.Y
        public d1 c() {
            throw new UnsupportedOperationException("Custom ImageProxy does not contain TagBundle");
        }

        @Override // A.Y
        public int d() {
            return this.f645b;
        }
    }

    public U(M.z zVar) {
        this((Bitmap) zVar.c(), zVar.b(), zVar.f(), zVar.g(), zVar.a().a());
    }

    private void a() {
        synchronized (this.f635a) {
            y0.f.j(this.f639e != null, "The image is closed.");
        }
    }

    private static A.Y b(long j10, int i10, Matrix matrix) {
        return new b(j10, i10, matrix);
    }

    private static n.a c(ByteBuffer byteBuffer, int i10, int i11) {
        return new a(i10, i11, byteBuffer);
    }

    @Override // androidx.camera.core.n
    public Image E1() {
        synchronized (this.f635a) {
            a();
        }
        return null;
    }

    @Override // androidx.camera.core.n
    public A.Y G() {
        A.Y y10;
        synchronized (this.f635a) {
            a();
            y10 = this.f640f;
        }
        return y10;
    }

    @Override // androidx.camera.core.n
    public n.a[] S() {
        n.a[] aVarArr;
        synchronized (this.f635a) {
            a();
            n.a[] aVarArr2 = this.f639e;
            Objects.requireNonNull(aVarArr2);
            aVarArr = aVarArr2;
        }
        return aVarArr;
    }

    @Override // androidx.camera.core.n, java.lang.AutoCloseable
    public void close() {
        synchronized (this.f635a) {
            a();
            this.f639e = null;
        }
    }

    @Override // androidx.camera.core.n
    public int getFormat() {
        synchronized (this.f635a) {
            a();
        }
        return 1;
    }

    @Override // androidx.camera.core.n
    public int getHeight() {
        int i10;
        synchronized (this.f635a) {
            a();
            i10 = this.f637c;
        }
        return i10;
    }

    @Override // androidx.camera.core.n
    public int getWidth() {
        int i10;
        synchronized (this.f635a) {
            a();
            i10 = this.f636b;
        }
        return i10;
    }

    @Override // androidx.camera.core.n
    public void j1(Rect rect) {
        synchronized (this.f635a) {
            try {
                a();
                if (rect != null) {
                    this.f638d.set(rect);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public U(Bitmap bitmap, Rect rect, int i10, Matrix matrix, long j10) {
        this(L.b.e(bitmap), 4, bitmap.getWidth(), bitmap.getHeight(), rect, i10, matrix, j10);
    }

    public U(ByteBuffer byteBuffer, int i10, int i11, int i12, Rect rect, int i13, Matrix matrix, long j10) {
        this.f635a = new Object();
        this.f636b = i11;
        this.f637c = i12;
        this.f638d = rect;
        this.f640f = b(j10, i13, matrix);
        byteBuffer.rewind();
        this.f639e = new n.a[]{c(byteBuffer, i11 * i10, i10)};
    }
}
