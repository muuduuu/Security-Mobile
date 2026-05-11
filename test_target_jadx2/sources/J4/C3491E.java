package j4;

import c3.AbstractC1721a;
import com.facebook.imagepipeline.memory.AshmemMemoryChunkPool;
import com.facebook.imagepipeline.memory.BufferMemoryChunkPool;
import com.facebook.imagepipeline.memory.NativeMemoryChunkPool;
import e3.InterfaceC3074a;
import java.lang.reflect.InvocationTargetException;
import org.conscrypt.BuildConfig;

/* renamed from: j4.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3491E {

    /* renamed from: a, reason: collision with root package name */
    private final C3489C f35780a;

    /* renamed from: b, reason: collision with root package name */
    private com.facebook.imagepipeline.memory.f f35781b;

    /* renamed from: c, reason: collision with root package name */
    private i f35782c;

    /* renamed from: d, reason: collision with root package name */
    private com.facebook.imagepipeline.memory.f f35783d;

    /* renamed from: e, reason: collision with root package name */
    private com.facebook.imagepipeline.memory.d f35784e;

    /* renamed from: f, reason: collision with root package name */
    private com.facebook.imagepipeline.memory.f f35785f;

    /* renamed from: g, reason: collision with root package name */
    private e3.i f35786g;

    /* renamed from: h, reason: collision with root package name */
    private e3.l f35787h;

    /* renamed from: i, reason: collision with root package name */
    private InterfaceC3074a f35788i;

    public C3491E(C3489C c3489c) {
        this.f35780a = (C3489C) b3.l.g(c3489c);
    }

    private com.facebook.imagepipeline.memory.f a() {
        if (this.f35781b == null) {
            try {
                this.f35781b = (com.facebook.imagepipeline.memory.f) AshmemMemoryChunkPool.class.getConstructor(e3.d.class, C3492F.class, G.class).newInstance(this.f35780a.i(), this.f35780a.g(), this.f35780a.h());
            } catch (ClassNotFoundException unused) {
                this.f35781b = null;
            } catch (IllegalAccessException unused2) {
                this.f35781b = null;
            } catch (InstantiationException unused3) {
                this.f35781b = null;
            } catch (NoSuchMethodException unused4) {
                this.f35781b = null;
            } catch (InvocationTargetException unused5) {
                this.f35781b = null;
            }
        }
        return this.f35781b;
    }

    private com.facebook.imagepipeline.memory.f f(int i10) {
        if (i10 == 0) {
            return g();
        }
        if (i10 == 1) {
            return c();
        }
        if (i10 == 2) {
            return a();
        }
        throw new IllegalArgumentException("Invalid MemoryChunkType");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public i b() {
        char c10;
        if (this.f35782c == null) {
            String e10 = this.f35780a.e();
            switch (e10.hashCode()) {
                case -1868884870:
                    if (e10.equals("legacy_default_params")) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1106578487:
                    if (e10.equals("legacy")) {
                        c10 = 4;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -404562712:
                    if (e10.equals("experimental")) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -402149703:
                    if (e10.equals("dummy_with_tracking")) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 95945896:
                    if (e10.equals("dummy")) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                default:
                    c10 = 65535;
                    break;
            }
            if (c10 == 0) {
                this.f35782c = new r();
            } else if (c10 == 1) {
                this.f35782c = new s();
            } else if (c10 == 2) {
                this.f35782c = new t(this.f35780a.b(), this.f35780a.a(), z.h(), this.f35780a.m() ? this.f35780a.i() : null);
            } else if (c10 != 3) {
                this.f35782c = new com.facebook.imagepipeline.memory.c(this.f35780a.i(), this.f35780a.c(), this.f35780a.d(), this.f35780a.l());
            } else {
                this.f35782c = new com.facebook.imagepipeline.memory.c(this.f35780a.i(), n.a(), this.f35780a.d(), this.f35780a.l());
            }
        }
        return this.f35782c;
    }

    public com.facebook.imagepipeline.memory.f c() {
        if (this.f35783d == null) {
            try {
                this.f35783d = (com.facebook.imagepipeline.memory.f) BufferMemoryChunkPool.class.getConstructor(e3.d.class, C3492F.class, G.class).newInstance(this.f35780a.i(), this.f35780a.g(), this.f35780a.h());
            } catch (ClassNotFoundException unused) {
                this.f35783d = null;
            } catch (IllegalAccessException unused2) {
                this.f35783d = null;
            } catch (InstantiationException unused3) {
                this.f35783d = null;
            } catch (NoSuchMethodException unused4) {
                this.f35783d = null;
            } catch (InvocationTargetException unused5) {
                this.f35783d = null;
            }
        }
        return this.f35783d;
    }

    public com.facebook.imagepipeline.memory.d d() {
        if (this.f35784e == null) {
            this.f35784e = new com.facebook.imagepipeline.memory.d(this.f35780a.i(), this.f35780a.f());
        }
        return this.f35784e;
    }

    public int e() {
        return this.f35780a.f().f35795g;
    }

    public com.facebook.imagepipeline.memory.f g() {
        if (this.f35785f == null) {
            try {
                this.f35785f = (com.facebook.imagepipeline.memory.f) NativeMemoryChunkPool.class.getConstructor(e3.d.class, C3492F.class, G.class).newInstance(this.f35780a.i(), this.f35780a.g(), this.f35780a.h());
            } catch (ClassNotFoundException e10) {
                AbstractC1721a.n("PoolFactory", BuildConfig.FLAVOR, e10);
                this.f35785f = null;
            } catch (IllegalAccessException e11) {
                AbstractC1721a.n("PoolFactory", BuildConfig.FLAVOR, e11);
                this.f35785f = null;
            } catch (InstantiationException e12) {
                AbstractC1721a.n("PoolFactory", BuildConfig.FLAVOR, e12);
                this.f35785f = null;
            } catch (NoSuchMethodException e13) {
                AbstractC1721a.n("PoolFactory", BuildConfig.FLAVOR, e13);
                this.f35785f = null;
            } catch (InvocationTargetException e14) {
                AbstractC1721a.n("PoolFactory", BuildConfig.FLAVOR, e14);
                this.f35785f = null;
            }
        }
        return this.f35785f;
    }

    public e3.i h() {
        return i(!b4.p.a() ? 1 : 0);
    }

    public e3.i i(int i10) {
        if (this.f35786g == null) {
            com.facebook.imagepipeline.memory.f f10 = f(i10);
            b3.l.h(f10, "failed to get pool for chunk type: " + i10);
            this.f35786g = new y(f10, j());
        }
        return this.f35786g;
    }

    public e3.l j() {
        if (this.f35787h == null) {
            this.f35787h = new e3.l(k());
        }
        return this.f35787h;
    }

    public InterfaceC3074a k() {
        if (this.f35788i == null) {
            this.f35788i = new com.facebook.imagepipeline.memory.e(this.f35780a.i(), this.f35780a.j(), this.f35780a.k());
        }
        return this.f35788i;
    }
}
