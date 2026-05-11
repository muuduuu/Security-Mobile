package Oa;

import Td.E;
import Td.z;
import kotlin.jvm.internal.Intrinsics;
import pe.InterfaceC3878f;
import pe.M;

/* loaded from: classes2.dex */
public final class b extends E {

    /* renamed from: a, reason: collision with root package name */
    private final E f7161a;

    /* renamed from: b, reason: collision with root package name */
    private final c f7162b;

    public b(E requestBody, c progressListener) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(progressListener, "progressListener");
        this.f7161a = requestBody;
        this.f7162b = progressListener;
    }

    @Override // Td.E
    public long contentLength() {
        return this.f7161a.contentLength();
    }

    @Override // Td.E
    /* renamed from: contentType */
    public z getContentType() {
        return this.f7161a.getContentType();
    }

    @Override // Td.E
    public void writeTo(InterfaceC3878f sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        InterfaceC3878f b10 = M.b(new d(sink, this, this.f7162b));
        this.f7161a.writeTo(b10);
        b10.flush();
    }
}
