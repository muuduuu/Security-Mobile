package r7;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes2.dex */
public final class X0 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f39817a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f39818b;

    /* renamed from: c, reason: collision with root package name */
    private final t8.d f39819c;

    X0(Map map, Map map2, t8.d dVar) {
        this.f39817a = map;
        this.f39818b = map2;
        this.f39819c = dVar;
    }

    public final byte[] a(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new U0(byteArrayOutputStream, this.f39817a, this.f39818b, this.f39819c).i(obj);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
