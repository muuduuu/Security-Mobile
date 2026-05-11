package I0;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import pc.AbstractC3868b;

/* loaded from: classes.dex */
public class n implements y {

    /* renamed from: a, reason: collision with root package name */
    private final File f4201a;

    /* renamed from: b, reason: collision with root package name */
    private final A f4202b;

    /* renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f4203c;

    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f4204a;

        /* renamed from: b, reason: collision with root package name */
        Object f4205b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f4206c;

        /* renamed from: e, reason: collision with root package name */
        int f4208e;

        a(kotlin.coroutines.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f4206c = obj;
            this.f4208e |= Integer.MIN_VALUE;
            return n.i(n.this, this);
        }
    }

    public n(File file, A serializer) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        this.f4201a = file;
        this.f4202b = serializer;
        this.f4203c = new AtomicBoolean(false);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(6:5|6|7|(1:(1:(5:11|12|13|14|15)(2:25|26))(3:27|28|29))(6:40|41|42|43|44|(1:46)(1:47))|30|31))|67|6|7|(0)(0)|30|31|(3:(1:36)|(1:21)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x006f, code lost:
    
        r7 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11, types: [I0.n] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ Object i(n nVar, kotlin.coroutines.d dVar) {
        a aVar;
        ?? r22;
        Throwable th;
        Closeable closeable;
        Closeable closeable2;
        Throwable th2;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.f4208e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f4208e = i10 - Integer.MIN_VALUE;
                Object obj = aVar.f4206c;
                Object e10 = AbstractC3868b.e();
                r22 = aVar.f4208e;
                if (r22 != 0) {
                    lc.p.b(obj);
                    nVar.f();
                    try {
                        FileInputStream fileInputStream = new FileInputStream(nVar.f4201a);
                        try {
                            A a10 = nVar.f4202b;
                            aVar.f4204a = nVar;
                            aVar.f4205b = fileInputStream;
                            aVar.f4208e = 1;
                            Object c10 = a10.c(fileInputStream, aVar);
                            if (c10 == e10) {
                                return e10;
                            }
                            closeable2 = fileInputStream;
                            obj = c10;
                        } catch (Throwable th3) {
                            r22 = nVar;
                            closeable2 = fileInputStream;
                            th2 = th3;
                            throw th;
                        }
                    } catch (FileNotFoundException unused) {
                        if (!nVar.f4201a.exists()) {
                            return nVar.f4202b.a();
                        }
                        FileInputStream fileInputStream2 = new FileInputStream(nVar.f4201a);
                        try {
                            A a11 = nVar.f4202b;
                            aVar.f4204a = fileInputStream2;
                            aVar.f4205b = null;
                            aVar.f4208e = 2;
                            Object c11 = a11.c(fileInputStream2, aVar);
                            if (c11 == e10) {
                                return e10;
                            }
                            obj = c11;
                            closeable = fileInputStream2;
                            kotlin.io.c.a(closeable, null);
                            return obj;
                        } catch (Throwable th4) {
                            th = th4;
                            closeable = fileInputStream2;
                            throw th;
                        }
                    }
                } else {
                    if (r22 != 1) {
                        if (r22 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        closeable = (Closeable) aVar.f4204a;
                        try {
                            lc.p.b(obj);
                            kotlin.io.c.a(closeable, null);
                            return obj;
                        } catch (Throwable th5) {
                            th = th5;
                            try {
                                throw th;
                            } finally {
                            }
                        }
                    }
                    closeable2 = (Closeable) aVar.f4205b;
                    r22 = (n) aVar.f4204a;
                    try {
                        lc.p.b(obj);
                    } catch (Throwable th6) {
                        th2 = th6;
                        try {
                            throw th;
                        } finally {
                        }
                    }
                }
                kotlin.io.c.a(closeable2, null);
                return obj;
            }
        }
        aVar = nVar.new a(dVar);
        Object obj2 = aVar.f4206c;
        Object e102 = AbstractC3868b.e();
        r22 = aVar.f4208e;
        if (r22 != 0) {
        }
        kotlin.io.c.a(closeable2, null);
        return obj2;
    }

    @Override // I0.InterfaceC0837c
    public void close() {
        this.f4203c.set(true);
    }

    @Override // I0.y
    public Object e(kotlin.coroutines.d dVar) {
        return i(this, dVar);
    }

    protected final void f() {
        if (this.f4203c.get()) {
            throw new IllegalStateException("This scope has already been closed.");
        }
    }

    protected final File g() {
        return this.f4201a;
    }

    protected final A h() {
        return this.f4202b;
    }
}
