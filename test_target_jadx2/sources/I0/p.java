package I0;

import Sd.a;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lc.AbstractC3622a;
import pc.AbstractC3868b;
import wc.InterfaceC5068n;

/* loaded from: classes.dex */
public final class p implements F {

    /* renamed from: a, reason: collision with root package name */
    private final File f4217a;

    /* renamed from: b, reason: collision with root package name */
    private final A f4218b;

    /* renamed from: c, reason: collision with root package name */
    private final t f4219c;

    /* renamed from: d, reason: collision with root package name */
    private final Function0 f4220d;

    /* renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f4221e;

    /* renamed from: f, reason: collision with root package name */
    private final Sd.a f4222f;

    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f4223a;

        /* renamed from: b, reason: collision with root package name */
        Object f4224b;

        /* renamed from: c, reason: collision with root package name */
        boolean f4225c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f4226d;

        /* renamed from: f, reason: collision with root package name */
        int f4228f;

        a(kotlin.coroutines.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f4226d = obj;
            this.f4228f |= Integer.MIN_VALUE;
            return p.this.b(null, this);
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f4229a;

        /* renamed from: b, reason: collision with root package name */
        Object f4230b;

        /* renamed from: c, reason: collision with root package name */
        Object f4231c;

        /* renamed from: d, reason: collision with root package name */
        Object f4232d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f4233e;

        /* renamed from: g, reason: collision with root package name */
        int f4235g;

        b(kotlin.coroutines.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f4233e = obj;
            this.f4235g |= Integer.MIN_VALUE;
            return p.this.c(null, this);
        }
    }

    public p(File file, A serializer, t coordinator, Function0 onClose) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(coordinator, "coordinator");
        Intrinsics.checkNotNullParameter(onClose, "onClose");
        this.f4217a = file;
        this.f4218b = serializer;
        this.f4219c = coordinator;
        this.f4220d = onClose;
        this.f4221e = new AtomicBoolean(false);
        this.f4222f = Sd.g.b(false, 1, null);
    }

    private final void f() {
        if (this.f4221e.get()) {
            throw new IllegalStateException("StorageConnection has already been disposed.");
        }
    }

    private final void g(File file) {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (parentFile.isDirectory()) {
                return;
            }
            throw new IOException("Unable to create parent directories of " + file);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:(2:3|(8:5|6|7|(1:(3:10|11|12)(2:32|33))(6:34|35|36|38|39|(1:41)(1:42))|13|14|15|(2:(1:18)|19)(1:21)))|7|(0)(0)|13|14|15|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0070, code lost:
    
        r1 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007b A[Catch: all -> 0x007c, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x007c, blocks: (B:21:0x007b, B:28:0x008c, B:31:0x0089, B:27:0x0084), top: B:7:0x0022, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r0v11, types: [I0.p] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v2, types: [I0.p$a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [I0.p] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r9v0, types: [wc.n] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v7 */
    @Override // I0.F
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object b(InterfaceC5068n interfaceC5068n, kotlin.coroutines.d dVar) {
        ?? r02;
        int i10;
        InterfaceC0837c interfaceC0837c;
        Throwable th;
        p pVar;
        boolean z10;
        try {
            if (dVar instanceof a) {
                a aVar = (a) dVar;
                int i11 = aVar.f4228f;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    aVar.f4228f = i11 - Integer.MIN_VALUE;
                    r02 = aVar;
                    Object obj = r02.f4226d;
                    Object e10 = AbstractC3868b.e();
                    i10 = r02.f4228f;
                    if (i10 != 0) {
                        lc.p.b(obj);
                        f();
                        boolean a10 = a.C0178a.a(this.f4222f, null, 1, null);
                        try {
                            n nVar = new n(this.f4217a, this.f4218b);
                            try {
                                Boolean a11 = kotlin.coroutines.jvm.internal.b.a(a10);
                                r02.f4223a = this;
                                r02.f4224b = nVar;
                                r02.f4225c = a10;
                                r02.f4228f = 1;
                                Object n10 = interfaceC5068n.n(nVar, a11, r02);
                                if (n10 == e10) {
                                    return e10;
                                }
                                pVar = this;
                                interfaceC0837c = nVar;
                                obj = n10;
                                z10 = a10;
                            } catch (Throwable th2) {
                                r02 = this;
                                interfaceC0837c = nVar;
                                th = th2;
                                interfaceC5068n = a10;
                                interfaceC0837c.close();
                                throw th;
                            }
                        } catch (Throwable th3) {
                            r02 = this;
                            th = th3;
                            interfaceC5068n = a10;
                            if (interfaceC5068n != 0) {
                            }
                            throw th;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        interfaceC5068n = r02.f4225c;
                        interfaceC0837c = (InterfaceC0837c) r02.f4224b;
                        r02 = (p) r02.f4223a;
                        try {
                            lc.p.b(obj);
                            pVar = r02;
                            z10 = interfaceC5068n;
                        } catch (Throwable th4) {
                            th = th4;
                            try {
                                interfaceC0837c.close();
                            } catch (Throwable th5) {
                                AbstractC3622a.a(th, th5);
                            }
                            throw th;
                        }
                    }
                    interfaceC0837c.close();
                    th = null;
                    if (th == null) {
                        throw th;
                    }
                    if (z10) {
                        a.C0178a.b(pVar.f4222f, null, 1, null);
                    }
                    return obj;
                }
            }
            if (i10 != 0) {
            }
            interfaceC0837c.close();
            th = null;
            if (th == null) {
            }
        } catch (Throwable th6) {
            th = th6;
            if (interfaceC5068n != 0) {
                a.C0178a.b(r02.f4222f, null, 1, null);
            }
            throw th;
        }
        r02 = new a(dVar);
        Object obj2 = r02.f4226d;
        Object e102 = AbstractC3868b.e();
        i10 = r02.f4228f;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(6:(2:3|(10:5|6|7|(1:(1:(8:11|12|13|14|15|16|17|(5:19|(2:24|25)|27|28|29)(1:30))(2:41|42))(1:43))(2:61|(1:63)(1:64))|44|45|46|47|48|(1:50)(6:51|14|15|16|17|(0)(0))))|45|46|47|48|(0)(0))|70|6|7|(0)(0)|44|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00f2, code lost:
    
        r10 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00f3, code lost:
    
        r11 = r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00bb A[Catch: all -> 0x00f0, IOException -> 0x00f2, TRY_ENTER, TryCatch #0 {all -> 0x00f0, blocks: (B:19:0x00bb, B:21:0x00c1, B:24:0x00ca, B:25:0x00ef, B:27:0x00f5, B:30:0x00fd, B:57:0x010c, B:59:0x0112, B:60:0x0115, B:37:0x010a, B:40:0x0107, B:44:0x007a, B:46:0x0096), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00fd A[Catch: all -> 0x00f0, IOException -> 0x00f2, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00f0, blocks: (B:19:0x00bb, B:21:0x00c1, B:24:0x00ca, B:25:0x00ef, B:27:0x00f5, B:30:0x00fd, B:57:0x010c, B:59:0x0112, B:60:0x0115, B:37:0x010a, B:40:0x0107, B:44:0x007a, B:46:0x0096), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ad A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r2v0, types: [Sd.a, int] */
    @Override // I0.F
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object c(Function2 function2, kotlin.coroutines.d dVar) {
        b bVar;
        Object e10;
        ?? r22;
        File file;
        p pVar;
        Sd.a aVar;
        q qVar;
        Throwable th;
        InterfaceC0837c interfaceC0837c;
        File file2;
        p pVar2;
        try {
            try {
                try {
                    if (dVar instanceof b) {
                        bVar = (b) dVar;
                        int i10 = bVar.f4235g;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            bVar.f4235g = i10 - Integer.MIN_VALUE;
                            Object obj = bVar.f4233e;
                            e10 = AbstractC3868b.e();
                            r22 = bVar.f4235g;
                            if (r22 != 0) {
                                lc.p.b(obj);
                                f();
                                g(this.f4217a);
                                Sd.a aVar2 = this.f4222f;
                                bVar.f4229a = this;
                                bVar.f4230b = function2;
                                bVar.f4231c = aVar2;
                                bVar.f4235g = 1;
                                if (aVar2.b(null, bVar) == e10) {
                                    return e10;
                                }
                                pVar = this;
                                aVar = aVar2;
                            } else {
                                if (r22 != 1) {
                                    if (r22 != 2) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    interfaceC0837c = (InterfaceC0837c) bVar.f4232d;
                                    file2 = (File) bVar.f4231c;
                                    aVar = (Sd.a) bVar.f4230b;
                                    pVar2 = (p) bVar.f4229a;
                                    try {
                                        lc.p.b(obj);
                                        Unit unit = Unit.f36324a;
                                        try {
                                            interfaceC0837c.close();
                                            th = null;
                                        } catch (Throwable th2) {
                                            th = th2;
                                        }
                                        if (th == null) {
                                            throw th;
                                        }
                                        if (file2.exists() && !m.a(file2, pVar2.f4217a)) {
                                            throw new IOException("Unable to rename " + file2 + " to " + pVar2.f4217a + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                                        }
                                        Unit unit2 = Unit.f36324a;
                                        aVar.c(null);
                                        return Unit.f36324a;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        try {
                                            interfaceC0837c.close();
                                        } catch (Throwable th4) {
                                            AbstractC3622a.a(th, th4);
                                        }
                                        throw th;
                                    }
                                }
                                Sd.a aVar3 = (Sd.a) bVar.f4231c;
                                Function2 function22 = (Function2) bVar.f4230b;
                                pVar = (p) bVar.f4229a;
                                lc.p.b(obj);
                                aVar = aVar3;
                                function2 = function22;
                            }
                            file = new File(pVar.f4217a.getAbsolutePath() + ".tmp");
                            qVar = new q(file, pVar.f4218b);
                            bVar.f4229a = pVar;
                            bVar.f4230b = aVar;
                            bVar.f4231c = file;
                            bVar.f4232d = qVar;
                            bVar.f4235g = 2;
                            if (function2.invoke(qVar, bVar) != e10) {
                                return e10;
                            }
                            file2 = file;
                            pVar2 = pVar;
                            interfaceC0837c = qVar;
                            Unit unit3 = Unit.f36324a;
                            interfaceC0837c.close();
                            th = null;
                            if (th == null) {
                            }
                        }
                    }
                    bVar.f4229a = pVar;
                    bVar.f4230b = aVar;
                    bVar.f4231c = file;
                    bVar.f4232d = qVar;
                    bVar.f4235g = 2;
                    if (function2.invoke(qVar, bVar) != e10) {
                    }
                } catch (Throwable th5) {
                    th = th5;
                    interfaceC0837c = qVar;
                    interfaceC0837c.close();
                    throw th;
                }
                qVar = new q(file, pVar.f4218b);
            } catch (IOException e11) {
                e = e11;
                if (file.exists()) {
                    file.delete();
                }
                throw e;
            }
            if (r22 != 0) {
            }
            file = new File(pVar.f4217a.getAbsolutePath() + ".tmp");
        } catch (Throwable th6) {
            r22.c(null);
            throw th6;
        }
        bVar = new b(dVar);
        Object obj2 = bVar.f4233e;
        e10 = AbstractC3868b.e();
        r22 = bVar.f4235g;
    }

    @Override // I0.InterfaceC0837c
    public void close() {
        this.f4221e.set(true);
        this.f4220d.invoke();
    }

    @Override // I0.F
    public t d() {
        return this.f4219c;
    }
}
