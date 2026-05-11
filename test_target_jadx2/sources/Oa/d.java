package Oa;

import Td.E;
import kotlin.jvm.internal.Intrinsics;
import pe.AbstractC3886n;
import pe.C3877e;
import pe.Z;

/* loaded from: classes2.dex */
final class d extends AbstractC3886n {

    /* renamed from: b, reason: collision with root package name */
    private final E f7163b;

    /* renamed from: c, reason: collision with root package name */
    private final c f7164c;

    /* renamed from: d, reason: collision with root package name */
    private long f7165d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Z sink, E requestBody, c progressListener) {
        super(sink);
        Intrinsics.checkNotNullParameter(sink, "sink");
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(progressListener, "progressListener");
        this.f7163b = requestBody;
        this.f7164c = progressListener;
    }

    @Override // pe.AbstractC3886n, pe.Z
    public void N0(C3877e source, long j10) {
        Intrinsics.checkNotNullParameter(source, "source");
        super.N0(source, j10);
        long j11 = this.f7165d + j10;
        this.f7165d = j11;
        this.f7164c.a(j11, this.f7163b.contentLength());
    }
}
