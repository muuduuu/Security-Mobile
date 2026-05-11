package androidx.camera.core;

import A.Y;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.media.Image;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public interface n extends AutoCloseable {

    public interface a {
        ByteBuffer m();

        int n();

        int o();
    }

    Image E1();

    Y G();

    a[] S();

    @Override // java.lang.AutoCloseable
    void close();

    int getFormat();

    int getHeight();

    int getWidth();

    void j1(Rect rect);

    default Bitmap r1() {
        return L.b.b(this);
    }
}
