package o2;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: o2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3744c implements i2.d {
    @Override // i2.d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean b(ByteBuffer byteBuffer, File file, i2.h hVar) {
        try {
            D2.a.f(byteBuffer, file);
            return true;
        } catch (IOException e10) {
            if (Log.isLoggable("ByteBufferEncoder", 3)) {
                Log.d("ByteBufferEncoder", "Failed to write data", e10);
            }
            return false;
        }
    }
}
