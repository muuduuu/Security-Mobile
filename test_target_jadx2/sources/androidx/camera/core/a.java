package androidx.camera.core;

import A.AbstractC0694e0;
import A.Y;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.media.Image;
import androidx.camera.core.impl.d1;
import androidx.camera.core.n;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
final class a implements n {

    /* renamed from: a, reason: collision with root package name */
    private final Image f14344a;

    /* renamed from: b, reason: collision with root package name */
    private final C0249a[] f14345b;

    /* renamed from: c, reason: collision with root package name */
    private final Y f14346c;

    /* renamed from: androidx.camera.core.a$a, reason: collision with other inner class name */
    private static final class C0249a implements n.a {

        /* renamed from: a, reason: collision with root package name */
        private final Image.Plane f14347a;

        C0249a(Image.Plane plane) {
            this.f14347a = plane;
        }

        @Override // androidx.camera.core.n.a
        public ByteBuffer m() {
            return this.f14347a.getBuffer();
        }

        @Override // androidx.camera.core.n.a
        public int n() {
            return this.f14347a.getRowStride();
        }

        @Override // androidx.camera.core.n.a
        public int o() {
            return this.f14347a.getPixelStride();
        }
    }

    a(Image image) {
        this.f14344a = image;
        Image.Plane[] planes = image.getPlanes();
        if (planes != null) {
            this.f14345b = new C0249a[planes.length];
            for (int i10 = 0; i10 < planes.length; i10++) {
                this.f14345b[i10] = new C0249a(planes[i10]);
            }
        } else {
            this.f14345b = new C0249a[0];
        }
        this.f14346c = AbstractC0694e0.e(d1.b(), image.getTimestamp(), 0, new Matrix());
    }

    @Override // androidx.camera.core.n
    public Image E1() {
        return this.f14344a;
    }

    @Override // androidx.camera.core.n
    public Y G() {
        return this.f14346c;
    }

    @Override // androidx.camera.core.n
    public n.a[] S() {
        return this.f14345b;
    }

    @Override // androidx.camera.core.n, java.lang.AutoCloseable
    public void close() {
        this.f14344a.close();
    }

    @Override // androidx.camera.core.n
    public int getFormat() {
        return this.f14344a.getFormat();
    }

    @Override // androidx.camera.core.n
    public int getHeight() {
        return this.f14344a.getHeight();
    }

    @Override // androidx.camera.core.n
    public int getWidth() {
        return this.f14344a.getWidth();
    }

    @Override // androidx.camera.core.n
    public void j1(Rect rect) {
        this.f14344a.setCropRect(rect);
    }
}
