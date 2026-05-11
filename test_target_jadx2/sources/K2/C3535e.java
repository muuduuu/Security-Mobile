package k2;

import java.io.File;
import m2.InterfaceC3639a;

/* renamed from: k2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C3535e implements InterfaceC3639a.b {

    /* renamed from: a, reason: collision with root package name */
    private final i2.d f36003a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f36004b;

    /* renamed from: c, reason: collision with root package name */
    private final i2.h f36005c;

    C3535e(i2.d dVar, Object obj, i2.h hVar) {
        this.f36003a = dVar;
        this.f36004b = obj;
        this.f36005c = hVar;
    }

    @Override // m2.InterfaceC3639a.b
    public boolean a(File file) {
        return this.f36003a.b(this.f36004b, file, this.f36005c);
    }
}
