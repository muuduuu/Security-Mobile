package r2;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
public final class G implements i2.j {
    @Override // i2.j
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public k2.v b(Bitmap bitmap, int i10, int i11, i2.h hVar) {
        return new a(bitmap);
    }

    @Override // i2.j
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(Bitmap bitmap, i2.h hVar) {
        return true;
    }

    private static final class a implements k2.v {

        /* renamed from: a, reason: collision with root package name */
        private final Bitmap f39133a;

        a(Bitmap bitmap) {
            this.f39133a = bitmap;
        }

        @Override // k2.v
        public Class a() {
            return Bitmap.class;
        }

        @Override // k2.v
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Bitmap get() {
            return this.f39133a;
        }

        @Override // k2.v
        public int k() {
            return D2.l.i(this.f39133a);
        }

        @Override // k2.v
        public void recycle() {
        }
    }
}
