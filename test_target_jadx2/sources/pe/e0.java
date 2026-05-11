package pe;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.zip.Inflater;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lc.AbstractC3622a;
import pe.S;

/* loaded from: classes3.dex */
public final class e0 extends AbstractC3884l {

    /* renamed from: i, reason: collision with root package name */
    private static final a f38677i = new a(null);

    /* renamed from: j, reason: collision with root package name */
    private static final S f38678j = S.a.e(S.f38611b, "/", false, 1, null);

    /* renamed from: e, reason: collision with root package name */
    private final S f38679e;

    /* renamed from: f, reason: collision with root package name */
    private final AbstractC3884l f38680f;

    /* renamed from: g, reason: collision with root package name */
    private final Map f38681g;

    /* renamed from: h, reason: collision with root package name */
    private final String f38682h;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public e0(S zipPath, AbstractC3884l fileSystem, Map entries, String str) {
        Intrinsics.checkNotNullParameter(zipPath, "zipPath");
        Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        Intrinsics.checkNotNullParameter(entries, "entries");
        this.f38679e = zipPath;
        this.f38680f = fileSystem;
        this.f38681g = entries;
        this.f38682h = str;
    }

    private final S r(S s10) {
        return f38678j.t(s10, true);
    }

    private final List s(S s10, boolean z10) {
        qe.i iVar = (qe.i) this.f38681g.get(r(s10));
        if (iVar != null) {
            return CollectionsKt.O0(iVar.c());
        }
        if (!z10) {
            return null;
        }
        throw new IOException("not a directory: " + s10);
    }

    @Override // pe.AbstractC3884l
    public Z b(S file, boolean z10) {
        Intrinsics.checkNotNullParameter(file, "file");
        throw new IOException("zip file systems are read-only");
    }

    @Override // pe.AbstractC3884l
    public void c(S source, S target) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        throw new IOException("zip file systems are read-only");
    }

    @Override // pe.AbstractC3884l
    public void g(S dir, boolean z10) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        throw new IOException("zip file systems are read-only");
    }

    @Override // pe.AbstractC3884l
    public void i(S path, boolean z10) {
        Intrinsics.checkNotNullParameter(path, "path");
        throw new IOException("zip file systems are read-only");
    }

    @Override // pe.AbstractC3884l
    public List k(S dir) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        List s10 = s(dir, true);
        Intrinsics.d(s10);
        return s10;
    }

    @Override // pe.AbstractC3884l
    public C3883k m(S path) {
        Throwable th;
        Throwable th2;
        Intrinsics.checkNotNullParameter(path, "path");
        qe.i iVar = (qe.i) this.f38681g.get(r(path));
        if (iVar == null) {
            return null;
        }
        if (iVar.i() != -1) {
            AbstractC3882j n10 = this.f38680f.n(this.f38679e);
            try {
                InterfaceC3879g c10 = M.c(n10.l(iVar.i()));
                try {
                    iVar = qe.j.j(c10, iVar);
                    if (c10 != null) {
                        try {
                            c10.close();
                        } catch (Throwable th3) {
                            th2 = th3;
                        }
                    }
                    th2 = null;
                } catch (Throwable th4) {
                    if (c10 != null) {
                        try {
                            c10.close();
                        } catch (Throwable th5) {
                            AbstractC3622a.a(th4, th5);
                        }
                    }
                    th2 = th4;
                    iVar = null;
                }
            } catch (Throwable th6) {
                if (n10 != null) {
                    try {
                        n10.close();
                    } catch (Throwable th7) {
                        AbstractC3622a.a(th6, th7);
                    }
                }
                th = th6;
                iVar = null;
            }
            if (th2 != null) {
                throw th2;
            }
            if (n10 != null) {
                try {
                    n10.close();
                } catch (Throwable th8) {
                    th = th8;
                }
            }
            th = null;
            if (th != null) {
                throw th;
            }
        }
        return new C3883k(!iVar.k(), iVar.k(), null, iVar.k() ? null : Long.valueOf(iVar.j()), iVar.f(), iVar.h(), iVar.g(), null, 128, null);
    }

    @Override // pe.AbstractC3884l
    public AbstractC3882j n(S file) {
        Intrinsics.checkNotNullParameter(file, "file");
        throw new UnsupportedOperationException("not implemented yet!");
    }

    @Override // pe.AbstractC3884l
    public Z p(S file, boolean z10) {
        Intrinsics.checkNotNullParameter(file, "file");
        throw new IOException("zip file systems are read-only");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v8 */
    @Override // pe.AbstractC3884l
    public b0 q(S file) {
        Intrinsics.checkNotNullParameter(file, "file");
        qe.i iVar = (qe.i) this.f38681g.get(r(file));
        if (iVar == null) {
            throw new FileNotFoundException("no such file: " + file);
        }
        AbstractC3882j n10 = this.f38680f.n(this.f38679e);
        InterfaceC3879g th = null;
        try {
            InterfaceC3879g c10 = M.c(n10.l(iVar.i()));
            if (n10 != null) {
                try {
                    n10.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            th = th;
            th = c10;
        } catch (Throwable th3) {
            th = th3;
            if (n10 != null) {
                try {
                    n10.close();
                } catch (Throwable th4) {
                    AbstractC3622a.a(th, th4);
                }
            }
        }
        if (th != 0) {
            throw th;
        }
        qe.j.m(th);
        return iVar.e() == 0 ? new qe.g(th, iVar.j(), true) : new qe.g(new C3890s(new qe.g(th, iVar.d(), true), new Inflater(true)), iVar.j(), false);
    }
}
