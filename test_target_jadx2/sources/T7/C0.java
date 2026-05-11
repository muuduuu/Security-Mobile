package t7;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes2.dex */
public final class C0 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f42443a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f42444b;

    /* renamed from: c, reason: collision with root package name */
    private final t8.d f42445c;

    C0(Map map, Map map2, t8.d dVar) {
        this.f42443a = map;
        this.f42444b = map2;
        this.f42445c = dVar;
    }

    public final byte[] a(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new C4814z0(byteArrayOutputStream, this.f42443a, this.f42444b, this.f42445c).i(obj);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
