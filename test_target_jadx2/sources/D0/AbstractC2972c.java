package d0;

import android.util.Range;
import android.util.Size;
import androidx.camera.core.impl.InterfaceC1441i0;
import b0.k;

/* renamed from: d0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2972c {
    public static InterfaceC1441i0.c a(InterfaceC1441i0.c cVar, Size size, Range range) {
        return InterfaceC1441i0.c.a(cVar.e(), cVar.i(), k.e(cVar.c(), cVar.b(), cVar.b(), cVar.f(), cVar.f(), size.getWidth(), cVar.k(), size.getHeight(), cVar.h(), range), cVar.f(), size.getWidth(), size.getHeight(), cVar.j(), cVar.b(), cVar.d(), cVar.g());
    }

    public static InterfaceC1441i0.c b(InterfaceC1441i0 interfaceC1441i0) {
        if (interfaceC1441i0 == null || interfaceC1441i0.d().isEmpty()) {
            return null;
        }
        return (InterfaceC1441i0.c) interfaceC1441i0.d().get(0);
    }
}
