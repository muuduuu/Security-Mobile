package s7;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;

/* renamed from: s7.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4424o {

    /* renamed from: a, reason: collision with root package name */
    private final Map f41364a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f41365b;

    /* renamed from: c, reason: collision with root package name */
    private final t8.d f41366c;

    C4424o(Map map, Map map2, t8.d dVar) {
        this.f41364a = map;
        this.f41365b = map2;
        this.f41366c = dVar;
    }

    public final byte[] a(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new C4403l(byteArrayOutputStream, this.f41364a, this.f41365b, this.f41366c).i(obj);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
