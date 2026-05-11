package m2;

import java.io.File;
import m2.InterfaceC3639a;

/* renamed from: m2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3642d implements InterfaceC3639a.InterfaceC0556a {

    /* renamed from: a, reason: collision with root package name */
    private final long f37299a;

    /* renamed from: b, reason: collision with root package name */
    private final a f37300b;

    /* renamed from: m2.d$a */
    public interface a {
        File a();
    }

    public AbstractC3642d(a aVar, long j10) {
        this.f37299a = j10;
        this.f37300b = aVar;
    }

    @Override // m2.InterfaceC3639a.InterfaceC0556a
    public InterfaceC3639a c() {
        File a10 = this.f37300b.a();
        if (a10 == null) {
            return null;
        }
        if (a10.isDirectory() || a10.mkdirs()) {
            return C3643e.c(a10, this.f37299a);
        }
        return null;
    }
}
