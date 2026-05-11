package W2;

import V2.a;
import W2.i;
import a3.AbstractC1348a;
import a3.c;
import c3.AbstractC1721a;
import java.io.File;
import java.io.IOException;
import java.util.Collection;

/* loaded from: classes.dex */
public class k implements i {

    /* renamed from: f, reason: collision with root package name */
    private static final Class f11336f = k.class;

    /* renamed from: a, reason: collision with root package name */
    private final int f11337a;

    /* renamed from: b, reason: collision with root package name */
    private final b3.o f11338b;

    /* renamed from: c, reason: collision with root package name */
    private final String f11339c;

    /* renamed from: d, reason: collision with root package name */
    private final V2.a f11340d;

    /* renamed from: e, reason: collision with root package name */
    volatile a f11341e = new a(null, null);

    static class a {

        /* renamed from: a, reason: collision with root package name */
        public final i f11342a;

        /* renamed from: b, reason: collision with root package name */
        public final File f11343b;

        a(File file, i iVar) {
            this.f11342a = iVar;
            this.f11343b = file;
        }
    }

    public k(int i10, b3.o oVar, String str, V2.a aVar) {
        this.f11337a = i10;
        this.f11340d = aVar;
        this.f11338b = oVar;
        this.f11339c = str;
    }

    private void j() {
        File file = new File((File) this.f11338b.get(), this.f11339c);
        i(file);
        this.f11341e = new a(file, new b(file, this.f11337a, this.f11340d));
    }

    private boolean m() {
        File file;
        a aVar = this.f11341e;
        return aVar.f11342a == null || (file = aVar.f11343b) == null || !file.exists();
    }

    @Override // W2.i
    public void a() {
        l().a();
    }

    @Override // W2.i
    public void b() {
        try {
            l().b();
        } catch (IOException e10) {
            AbstractC1721a.j(f11336f, "purgeUnexpectedResources", e10);
        }
    }

    @Override // W2.i
    public i.b c(String str, Object obj) {
        return l().c(str, obj);
    }

    @Override // W2.i
    public boolean d(String str, Object obj) {
        return l().d(str, obj);
    }

    @Override // W2.i
    public boolean e(String str, Object obj) {
        return l().e(str, obj);
    }

    @Override // W2.i
    public U2.a f(String str, Object obj) {
        return l().f(str, obj);
    }

    @Override // W2.i
    public Collection g() {
        return l().g();
    }

    @Override // W2.i
    public long h(i.a aVar) {
        return l().h(aVar);
    }

    void i(File file) {
        try {
            a3.c.a(file);
            AbstractC1721a.a(f11336f, "Created cache directory %s", file.getAbsolutePath());
        } catch (c.a e10) {
            this.f11340d.a(a.EnumC0200a.WRITE_CREATE_DIR, f11336f, "createRootDirectoryIfNecessary", e10);
            throw e10;
        }
    }

    void k() {
        if (this.f11341e.f11342a == null || this.f11341e.f11343b == null) {
            return;
        }
        AbstractC1348a.b(this.f11341e.f11343b);
    }

    synchronized i l() {
        try {
            if (m()) {
                k();
                j();
            }
        } catch (Throwable th) {
            throw th;
        }
        return (i) b3.l.g(this.f11341e.f11342a);
    }

    @Override // W2.i
    public boolean q() {
        try {
            return l().q();
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // W2.i
    public long remove(String str) {
        return l().remove(str);
    }
}
