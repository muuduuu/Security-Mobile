package Yd;

import java.io.IOException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pe.AbstractC3886n;
import pe.C3877e;
import pe.Z;

/* loaded from: classes3.dex */
public class f extends AbstractC3886n {

    /* renamed from: b, reason: collision with root package name */
    private final Function1 f12274b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f12275c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Z delegate, Function1 onException) {
        super(delegate);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(onException, "onException");
        this.f12274b = onException;
    }

    @Override // pe.AbstractC3886n, pe.Z
    public void N0(C3877e source, long j10) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (this.f12275c) {
            source.skip(j10);
            return;
        }
        try {
            super.N0(source, j10);
        } catch (IOException e10) {
            this.f12275c = true;
            this.f12274b.invoke(e10);
        }
    }

    @Override // pe.AbstractC3886n, pe.Z, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            super.close();
        } catch (IOException e10) {
            this.f12275c = true;
            this.f12274b.invoke(e10);
        }
    }

    @Override // pe.AbstractC3886n, pe.Z, java.io.Flushable
    public void flush() {
        if (this.f12275c) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e10) {
            this.f12275c = true;
            this.f12274b.invoke(e10);
        }
    }
}
