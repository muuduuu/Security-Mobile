package f2;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;

/* renamed from: f2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC3137a {

    /* renamed from: f2.a$a, reason: collision with other inner class name */
    public interface InterfaceC0480a {
        Bitmap a(int i10, int i11, Bitmap.Config config);

        int[] b(int i10);

        void c(Bitmap bitmap);

        void d(byte[] bArr);

        byte[] e(int i10);

        void f(int[] iArr);
    }

    int a();

    Bitmap b();

    void c();

    void clear();

    int d();

    void e(Bitmap.Config config);

    void f();

    int g();

    ByteBuffer getData();

    int h();
}
