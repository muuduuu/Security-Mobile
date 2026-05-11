package androidx.camera.core;

import android.media.ImageReader;
import androidx.camera.core.impl.InterfaceC1458r0;

/* loaded from: classes.dex */
public abstract class o {
    public static InterfaceC1458r0 a(int i10, int i11, int i12, int i13) {
        return new d(ImageReader.newInstance(i10, i11, i12, i13));
    }
}
