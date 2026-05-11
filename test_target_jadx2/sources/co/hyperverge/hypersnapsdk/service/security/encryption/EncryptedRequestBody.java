package co.hyperverge.hypersnapsdk.service.security.encryption;

import Td.E;
import Td.z;
import co.hyperverge.hypersnapsdk.utils.HVLogUtils;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.c;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;
import pe.InterfaceC3878f;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000f¨\u0006\u0010"}, d2 = {"Lco/hyperverge/hypersnapsdk/service/security/encryption/EncryptedRequestBody;", "LTd/E;", "Ljava/io/InputStream;", "encryptedStream", "LTd/z;", "contentType", "<init>", "(Ljava/io/InputStream;LTd/z;)V", "()LTd/z;", "Lpe/f;", "sink", BuildConfig.FLAVOR, "writeTo", "(Lpe/f;)V", "Ljava/io/InputStream;", "LTd/z;", "hypersnapsdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class EncryptedRequestBody extends E {
    private final z contentType;
    private final InputStream encryptedStream;

    public EncryptedRequestBody(InputStream encryptedStream, z contentType) {
        Intrinsics.checkNotNullParameter(encryptedStream, "encryptedStream");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        this.encryptedStream = encryptedStream;
        this.contentType = contentType;
    }

    @Override // Td.E
    /* renamed from: contentType, reason: from getter */
    public z getContentType() {
        return this.contentType;
    }

    @Override // Td.E
    public void writeTo(InterfaceC3878f sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        InputStream inputStream = this.encryptedStream;
        try {
            byte[] bArr = new byte[8192];
            long j10 = 0;
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    HVLogUtils.i("EncryptedRequestBody", "Final bytes written to Sink: " + j10);
                    Unit unit = Unit.f36324a;
                    c.a(inputStream, null);
                    return;
                }
                sink.write(bArr, 0, read);
                j10 += read;
            }
        } finally {
        }
    }
}
