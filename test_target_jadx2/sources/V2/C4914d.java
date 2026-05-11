package v2;

import android.util.Log;
import i2.EnumC3315c;
import i2.k;
import java.io.File;
import java.io.IOException;
import k2.v;

/* renamed from: v2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4914d implements k {
    @Override // i2.k
    public EnumC3315c a(i2.h hVar) {
        return EnumC3315c.SOURCE;
    }

    @Override // i2.d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean b(v vVar, File file, i2.h hVar) {
        try {
            D2.a.f(((C4913c) vVar.get()).c(), file);
            return true;
        } catch (IOException e10) {
            if (Log.isLoggable("GifEncoder", 5)) {
                Log.w("GifEncoder", "Failed to encode GIF drawable data", e10);
            }
            return false;
        }
    }
}
