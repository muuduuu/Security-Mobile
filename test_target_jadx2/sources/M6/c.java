package m6;

import com.github.penfeizhou.animation.io.d;
import i2.h;
import i2.j;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import k2.v;
import p6.m;

/* loaded from: classes2.dex */
public class c implements j {

    /* renamed from: a, reason: collision with root package name */
    private final j f37397a;

    public c(j jVar) {
        this.f37397a = jVar;
    }

    private static byte[] e(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    byteArrayOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // i2.j
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public v b(InputStream inputStream, int i10, int i11, h hVar) {
        byte[] e10 = e(inputStream);
        if (e10 == null) {
            return null;
        }
        return this.f37397a.b(ByteBuffer.wrap(e10), i10, i11, hVar);
    }

    @Override // i2.j
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(InputStream inputStream, h hVar) {
        return (!((Boolean) hVar.c(AbstractC3655a.f37389b)).booleanValue() && m.a(new d(inputStream))) || (!((Boolean) hVar.c(AbstractC3655a.f37390c)).booleanValue() && d6.d.a(new d(inputStream))) || ((!((Boolean) hVar.c(AbstractC3655a.f37388a)).booleanValue() && k6.h.b(new d(inputStream))) || (!((Boolean) hVar.c(AbstractC3655a.f37392e)).booleanValue() && g6.c.a(new d(inputStream))));
    }
}
