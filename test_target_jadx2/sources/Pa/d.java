package Pa;

import Db.C0792a;
import Db.C0794c;
import Jd.C0899o;
import Jd.InterfaceC0895m;
import Td.D;
import Td.InterfaceC1229e;
import Td.InterfaceC1230f;
import android.content.Context;
import android.net.Uri;
import android.webkit.URLUtil;
import co.hyperverge.hypersnapsdk.analytics.mixpanel.Keys;
import expo.modules.filesystem.next.FileSystemDirectory;
import expo.modules.filesystem.next.FileSystemFile;
import expo.modules.filesystem.next.FileSystemFileHandle;
import expo.modules.filesystem.next.FileSystemPath;
import expo.modules.kotlin.types.Either;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.o;
import lc.o;
import lc.p;
import lc.t;
import pc.AbstractC3868b;
import q1.AbstractC3901a;
import tb.C4826a;
import vc.AbstractC5011a;
import wb.q;
import wc.InterfaceC5068n;
import xb.AbstractC5139a;
import xc.C5142C;
import yb.C5190h;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"LPa/d;", "Lxb/a;", "<init>", "()V", "Lxb/c;", "b", "()Lxb/c;", "Landroid/content/Context;", "j", "()Landroid/content/Context;", "context", "expo-file-system_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class d extends AbstractC5139a {

    public static final class A extends xc.m implements Function1 {
        public A() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            Intrinsics.checkNotNullParameter(objArr, "<name for destructuring parameter 0>");
            ((FileSystemFile) objArr[0]).A0();
            return Unit.f36324a;
        }
    }

    public static final class B extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final B f7632a = new B();

        public B() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o invoke() {
            return C5142C.o(FileSystemFile.class);
        }
    }

    public static final class C extends xc.m implements Function1 {
        public C() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            Intrinsics.checkNotNullParameter(objArr, "<name for destructuring parameter 0>");
            ((FileSystemFile) objArr[0]).N();
            return Unit.f36324a;
        }
    }

    public static final class D extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final D f7633a = new D();

        public D() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o invoke() {
            return C5142C.o(FileSystemFile.class);
        }
    }

    public static final class E extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final E f7634a = new E();

        public E() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o invoke() {
            KTypeProjection.Companion companion = KTypeProjection.INSTANCE;
            return C5142C.q(Either.class, companion.d(C5142C.o(String.class)), companion.d(C5142C.o(Cb.j.class)));
        }
    }

    public static final class F extends xc.m implements Function1 {
        public F() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            Intrinsics.checkNotNullParameter(objArr, "<name for destructuring parameter 0>");
            Object obj = objArr[0];
            Either either = (Either) objArr[1];
            FileSystemFile fileSystemFile = (FileSystemFile) obj;
            if (either.e(C5142C.b(String.class))) {
                fileSystemFile.Z0((String) either.b(C5142C.b(String.class)));
            }
            if (either.f(C5142C.b(Cb.j.class))) {
                fileSystemFile.O0((Cb.j) either.c(C5142C.b(Cb.j.class)));
            }
            return Unit.f36324a;
        }
    }

    static final class G extends xc.m implements Function1 {
        public G() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(((FileSystemFile) it[0]).Q());
        }
    }

    static final class H extends xc.m implements Function1 {
        public H() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return ((FileSystemFile) it[0]).H();
        }
    }

    static final class I extends xc.m implements Function1 {
        public I() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            Intrinsics.checkNotNullParameter(it, "it");
            try {
                return ((FileSystemFile) it[0]).i0();
            } catch (Exception unused) {
                return null;
            }
        }
    }

    static final class J extends xc.m implements Function1 {
        public J() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            Intrinsics.checkNotNullParameter(it, "it");
            try {
                return ((FileSystemFile) it[0]).o0();
            } catch (Exception unused) {
                return null;
            }
        }
    }

    static final class K extends xc.m implements Function1 {
        public K() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return ((FileSystemFile) it[0]).y0();
        }
    }

    public static final class L extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final L f7635a = new L();

        public L() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o invoke() {
            return C5142C.o(FileSystemFile.class);
        }
    }

    public static final class M extends xc.m implements Function1 {
        public M() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            Intrinsics.checkNotNullParameter(objArr, "<name for destructuring parameter 0>");
            return new FileSystemFileHandle((FileSystemFile) objArr[0]);
        }
    }

    public static final class N extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final N f7636a = new N();

        public N() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o invoke() {
            return C5142C.o(FileSystemFileHandle.class);
        }
    }

    public static final class O extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final O f7637a = new O();

        public O() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o invoke() {
            return C5142C.o(Integer.TYPE);
        }
    }

    public static final class P extends xc.m implements Function1 {
        public P() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            Intrinsics.checkNotNullParameter(objArr, "<name for destructuring parameter 0>");
            return ((FileSystemFileHandle) objArr[0]).z(((Number) objArr[1]).intValue());
        }
    }

    public static final class Q extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final Q f7638a = new Q();

        public Q() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o invoke() {
            return C5142C.o(FileSystemFileHandle.class);
        }
    }

    public static final class R extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final R f7639a = new R();

        public R() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o invoke() {
            return C5142C.o(byte[].class);
        }
    }

    public static final class S extends xc.m implements Function1 {
        public S() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            Intrinsics.checkNotNullParameter(objArr, "<name for destructuring parameter 0>");
            ((FileSystemFileHandle) objArr[0]).F((byte[]) objArr[1]);
            return Unit.f36324a;
        }
    }

    public static final class T extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final T f7640a = new T();

        public T() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o invoke() {
            return C5142C.o(FileSystemFileHandle.class);
        }
    }

    public static final class U extends xc.m implements Function1 {
        public U() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            Intrinsics.checkNotNullParameter(objArr, "<name for destructuring parameter 0>");
            ((FileSystemFileHandle) objArr[0]).close();
            return Unit.f36324a;
        }
    }

    static final class V extends xc.m implements Function1 {
        public V() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return ((FileSystemFileHandle) it[0]).x();
        }
    }

    static final class W extends xc.m implements Function1 {
        public W() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return ((FileSystemFileHandle) it[0]).y();
        }
    }

    public static final class X extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final X f7641a = new X();

        public X() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o invoke() {
            return C5142C.o(Long.TYPE);
        }
    }

    static final class Y extends xc.m implements Function1 {
        public Y() {
            super(1);
        }

        public final void a(Object[] it) {
            Intrinsics.checkNotNullParameter(it, "it");
            Object obj = it[0];
            Object obj2 = it[1];
            if (obj2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
            }
            ((FileSystemFileHandle) obj).C(Long.valueOf(((Long) obj2).longValue()));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Object[]) obj);
            return Unit.f36324a;
        }
    }

    public static final class Z extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final Z f7642a = new Z();

        public Z() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o invoke() {
            return C5142C.o(URI.class);
        }
    }

    /* renamed from: Pa.d$a, reason: case insensitive filesystem */
    public static final class C1089a extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final C1089a f7643a = new C1089a();

        public C1089a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o invoke() {
            return C5142C.o(FileSystemFile.class);
        }
    }

    public static final class a0 extends xc.m implements Function1 {
        public a0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            Intrinsics.checkNotNullParameter(objArr, "<name for destructuring parameter 0>");
            return new FileSystemDirectory(new File(((URI) objArr[0]).getPath()));
        }
    }

    /* renamed from: Pa.d$b, reason: case insensitive filesystem */
    public static final class C1090b extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final C1090b f7644a = new C1090b();

        public C1090b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o invoke() {
            return C5142C.o(FileSystemFileHandle.class);
        }
    }

    public static final class b0 extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final b0 f7645a = new b0();

        public b0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o invoke() {
            return C5142C.o(FileSystemDirectory.class);
        }
    }

    /* renamed from: Pa.d$c, reason: case insensitive filesystem */
    public static final class C1091c extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final C1091c f7646a = new C1091c();

        public C1091c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o invoke() {
            return C5142C.o(FileSystemDirectory.class);
        }
    }

    public static final class c0 extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final c0 f7647a = new c0();

        public c0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o invoke() {
            return C5142C.o(FileSystemPath.class);
        }
    }

    /* renamed from: Pa.d$d, reason: collision with other inner class name */
    public static final class C0148d extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final C0148d f7648a = new C0148d();

        public C0148d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o invoke() {
            return C5142C.o(URI.class);
        }
    }

    public static final class d0 extends xc.m implements Function1 {
        public d0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            Intrinsics.checkNotNullParameter(objArr, "<name for destructuring parameter 0>");
            ((FileSystemDirectory) objArr[0]).z((FileSystemPath) objArr[1]);
            return Unit.f36324a;
        }
    }

    /* renamed from: Pa.d$e, reason: case insensitive filesystem */
    public static final class C1092e extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final C1092e f7649a = new C1092e();

        public C1092e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o invoke() {
            return C5142C.o(FileSystemPath.class);
        }
    }

    public static final class e0 extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final e0 f7650a = new e0();

        public e0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o invoke() {
            return C5142C.o(FileSystemDirectory.class);
        }
    }

    /* renamed from: Pa.d$f, reason: case insensitive filesystem */
    public static final class C1093f extends kotlin.coroutines.jvm.internal.l implements InterfaceC5068n {

        /* renamed from: a, reason: collision with root package name */
        int f7651a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f7652b;

        /* renamed from: c, reason: collision with root package name */
        Object f7653c;

        /* renamed from: d, reason: collision with root package name */
        Object f7654d;

        /* renamed from: e, reason: collision with root package name */
        Object f7655e;

        /* renamed from: f, reason: collision with root package name */
        Object f7656f;

        public C1093f(kotlin.coroutines.d dVar) {
            super(3, dVar);
        }

        @Override // wc.InterfaceC5068n
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object n(Jd.N n10, Object[] objArr, kotlin.coroutines.d dVar) {
            C1093f c1093f = new C1093f(dVar);
            c1093f.f7652b = objArr;
            return c1093f.invokeSuspend(Unit.f36324a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            URI uri;
            FileSystemPath fileSystemPath;
            Object e10 = AbstractC3868b.e();
            int i10 = this.f7651a;
            if (i10 == 0) {
                p.b(obj);
                Object[] objArr = (Object[]) this.f7652b;
                Object obj2 = objArr[0];
                FileSystemPath fileSystemPath2 = (FileSystemPath) objArr[1];
                URI uri2 = (URI) obj2;
                fileSystemPath2.C(kb.c.WRITE);
                D.a aVar = new D.a();
                URL url = uri2.toURL();
                Intrinsics.checkNotNullExpressionValue(url, "toURL(...)");
                Td.D b10 = aVar.y(url).b();
                Td.B b11 = new Td.B();
                this.f7652b = fileSystemPath2;
                this.f7653c = uri2;
                this.f7654d = b11;
                this.f7655e = b10;
                this.f7656f = this;
                this.f7651a = 1;
                C0899o c0899o = new C0899o(AbstractC3868b.c(this), 1);
                c0899o.F();
                b11.a(b10).g1(new C1094g(c0899o));
                Object y10 = c0899o.y();
                if (y10 == AbstractC3868b.e()) {
                    kotlin.coroutines.jvm.internal.h.c(this);
                }
                if (y10 == e10) {
                    return e10;
                }
                uri = uri2;
                fileSystemPath = fileSystemPath2;
                obj = y10;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                uri = (URI) this.f7653c;
                fileSystemPath = (FileSystemPath) this.f7652b;
                p.b(obj);
            }
            Td.F f10 = (Td.F) obj;
            if (!f10.isSuccessful()) {
                throw new k("response has status: " + f10.f());
            }
            File file = fileSystemPath instanceof FileSystemDirectory ? new File(fileSystemPath.getFile(), URLUtil.guessFileName(uri.toString(), f10.p().c("content-disposition"), f10.p().c(Keys.CONTENT_TYPE))) : fileSystemPath.getFile();
            if (file.exists()) {
                throw new b();
            }
            Td.G b12 = f10.b();
            if (b12 == null) {
                throw new k("response body is null");
            }
            InputStream a10 = b12.a();
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    kotlin.io.b.b(a10, fileOutputStream, 0, 2, null);
                    kotlin.io.c.a(fileOutputStream, null);
                    kotlin.io.c.a(a10, null);
                    return file.getPath();
                } finally {
                }
            } finally {
            }
        }
    }

    public static final class f0 extends xc.m implements Function1 {
        public f0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            Intrinsics.checkNotNullParameter(objArr, "<name for destructuring parameter 0>");
            return ((FileSystemDirectory) objArr[0]).N();
        }
    }

    /* renamed from: Pa.d$g, reason: case insensitive filesystem */
    public static final class C1094g implements InterfaceC1230f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC0895m f7657a;

        public C1094g(InterfaceC0895m interfaceC0895m) {
            this.f7657a = interfaceC0895m;
        }

        @Override // Td.InterfaceC1230f
        public void c(InterfaceC1229e call, Td.F response) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(response, "response");
            this.f7657a.resumeWith(lc.o.b(response));
        }

        @Override // Td.InterfaceC1230f
        public void d(InterfaceC1229e call, IOException e10) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(e10, "e");
            if (this.f7657a.isCancelled()) {
                return;
            }
            InterfaceC0895m interfaceC0895m = this.f7657a;
            o.a aVar = lc.o.f37128b;
            interfaceC0895m.resumeWith(lc.o.b(p.a(e10)));
        }
    }

    public static final class g0 extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final g0 f7658a = new g0();

        public g0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(FileSystemDirectory.class);
        }
    }

    /* renamed from: Pa.d$h, reason: case insensitive filesystem */
    public static final class C1095h extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final C1095h f7659a = new C1095h();

        public C1095h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(URI.class);
        }
    }

    public static final class h0 extends xc.m implements Function1 {
        public h0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            Intrinsics.checkNotNullParameter(objArr, "<name for destructuring parameter 0>");
            FileSystemPath.u((FileSystemDirectory) objArr[0], null, 1, null);
            return Unit.f36324a;
        }
    }

    /* renamed from: Pa.d$i, reason: case insensitive filesystem */
    public static final class C1096i extends xc.m implements Function1 {
        public C1096i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            Intrinsics.checkNotNullParameter(objArr, "<name for destructuring parameter 0>");
            return new FileSystemFile(new File(((URI) objArr[0]).getPath()));
        }
    }

    public static final class i0 extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final i0 f7660a = new i0();

        public i0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(FileSystemDirectory.class);
        }
    }

    /* renamed from: Pa.d$j, reason: case insensitive filesystem */
    public static final class C1097j extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final C1097j f7661a = new C1097j();

        public C1097j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(FileSystemFile.class);
        }
    }

    public static final class j0 extends xc.m implements Function1 {
        public j0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            Intrinsics.checkNotNullParameter(objArr, "<name for destructuring parameter 0>");
            ((FileSystemDirectory) objArr[0]).I();
            return Unit.f36324a;
        }
    }

    /* renamed from: Pa.d$k, reason: case insensitive filesystem */
    public static final class C1098k extends xc.m implements Function1 {
        public C1098k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            Intrinsics.checkNotNullParameter(objArr, "<name for destructuring parameter 0>");
            return ((FileSystemFile) objArr[0]).z0();
        }
    }

    public static final class k0 extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final k0 f7662a = new k0();

        public k0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(FileSystemDirectory.class);
        }
    }

    /* renamed from: Pa.d$l, reason: case insensitive filesystem */
    public static final class C1099l extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final C1099l f7663a = new C1099l();

        public C1099l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(FileSystemFile.class);
        }
    }

    public static final class l0 extends xc.m implements Function1 {
        public l0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            Intrinsics.checkNotNullParameter(objArr, "<name for destructuring parameter 0>");
            ((FileSystemDirectory) objArr[0]).Q();
            return Unit.f36324a;
        }
    }

    /* renamed from: Pa.d$m, reason: case insensitive filesystem */
    public static final class C1100m extends xc.m implements Function1 {
        public C1100m() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            Intrinsics.checkNotNullParameter(objArr, "<name for destructuring parameter 0>");
            return ((FileSystemFile) objArr[0]).I();
        }
    }

    public static final class m0 extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final m0 f7664a = new m0();

        public m0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(FileSystemDirectory.class);
        }
    }

    /* renamed from: Pa.d$n, reason: case insensitive filesystem */
    public static final class C1101n extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final C1101n f7665a = new C1101n();

        public C1101n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(FileSystemFile.class);
        }
    }

    public static final class n0 extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final n0 f7666a = new n0();

        public n0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(FileSystemPath.class);
        }
    }

    /* renamed from: Pa.d$o, reason: case insensitive filesystem */
    public static final class C1102o extends xc.m implements Function1 {
        public C1102o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            Intrinsics.checkNotNullParameter(objArr, "<name for destructuring parameter 0>");
            return ((FileSystemFile) objArr[0]).K();
        }
    }

    public static final class o0 extends xc.m implements Function1 {
        public o0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            Intrinsics.checkNotNullParameter(objArr, "<name for destructuring parameter 0>");
            ((FileSystemDirectory) objArr[0]).s((FileSystemPath) objArr[1]);
            return Unit.f36324a;
        }
    }

    /* renamed from: Pa.d$p, reason: case insensitive filesystem */
    public static final class C1103p extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final C1103p f7667a = new C1103p();

        public C1103p() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(FileSystemFile.class);
        }
    }

    static final class p0 extends xc.m implements Function1 {
        public p0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(((FileSystemDirectory) it[0]).K());
        }
    }

    /* renamed from: Pa.d$q, reason: case insensitive filesystem */
    public static final class C1104q extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final C1104q f7668a = new C1104q();

        public C1104q() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(FileSystemPath.class);
        }
    }

    static final class q0 extends xc.m implements Function1 {
        public q0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return ((FileSystemDirectory) it[0]).H();
        }
    }

    /* renamed from: Pa.d$r, reason: case insensitive filesystem */
    public static final class C1105r extends xc.m implements Function1 {
        public C1105r() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            Intrinsics.checkNotNullParameter(objArr, "<name for destructuring parameter 0>");
            ((FileSystemFile) objArr[0]).s((FileSystemPath) objArr[1]);
            return Unit.f36324a;
        }
    }

    /* renamed from: Pa.d$s, reason: case insensitive filesystem */
    public static final class C1106s extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final C1106s f7669a = new C1106s();

        public C1106s() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(FileSystemFile.class);
        }
    }

    /* renamed from: Pa.d$t, reason: case insensitive filesystem */
    public static final class C1107t extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final C1107t f7670a = new C1107t();

        public C1107t() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(FileSystemFile.class);
        }
    }

    /* renamed from: Pa.d$u, reason: case insensitive filesystem */
    public static final class C1108u extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final C1108u f7671a = new C1108u();

        public C1108u() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(FileSystemPath.class);
        }
    }

    /* renamed from: Pa.d$v, reason: case insensitive filesystem */
    public static final class C1109v extends xc.m implements Function1 {
        public C1109v() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            Intrinsics.checkNotNullParameter(objArr, "<name for destructuring parameter 0>");
            ((FileSystemFile) objArr[0]).z((FileSystemPath) objArr[1]);
            return Unit.f36324a;
        }
    }

    /* renamed from: Pa.d$w, reason: case insensitive filesystem */
    public static final class C1110w extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final C1110w f7672a = new C1110w();

        public C1110w() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(FileSystemFile.class);
        }
    }

    /* renamed from: Pa.d$x, reason: case insensitive filesystem */
    public static final class C1111x extends xc.m implements Function1 {
        public C1111x() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            Intrinsics.checkNotNullParameter(objArr, "<name for destructuring parameter 0>");
            return new FileSystemFileHandle((FileSystemFile) objArr[0]);
        }
    }

    /* renamed from: Pa.d$y, reason: case insensitive filesystem */
    public static final class C1112y extends xc.m implements Function1 {
        public C1112y() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            Intrinsics.checkNotNullParameter(objArr, "<name for destructuring parameter 0>");
            FileSystemPath.u((FileSystemFile) objArr[0], null, 1, null);
            return Unit.f36324a;
        }
    }

    /* renamed from: Pa.d$z, reason: case insensitive filesystem */
    public static final class C1113z extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final C1113z f7673a = new C1113z();

        public C1113z() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(FileSystemFile.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Context j() {
        Context w10 = a().w();
        if (w10 != null) {
            return w10;
        }
        throw new expo.modules.kotlin.exception.e();
    }

    @Override // xb.AbstractC5139a
    public xb.c b() {
        String str;
        String str2;
        String str3;
        Class cls;
        String str4;
        String str5;
        String str6;
        Class cls2;
        String str7;
        String str8;
        Class cls3;
        AbstractC3901a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            xb.b bVar = new xb.b(this);
            bVar.o("FileSystemNext");
            bVar.c(t.a("documentDirectory", Uri.fromFile(j().getFilesDir()).toString() + "/"), t.a("cacheDirectory", Uri.fromFile(j().getCacheDir()).toString() + "/"), t.a("bundleDirectory", "asset:///"));
            wb.d a10 = bVar.a("downloadFileAsync");
            String b10 = a10.b();
            C0794c c0794c = C0794c.f1454a;
            kotlin.reflect.d b11 = C5142C.b(URI.class);
            Boolean bool = Boolean.FALSE;
            C0792a c0792a = (C0792a) c0794c.a().get(new Pair(b11, bool));
            if (c0792a == null) {
                str = "create";
                str2 = "validatePath";
                str3 = "delete";
                c0792a = new C0792a(new Db.M(C5142C.b(URI.class), false, C0148d.f7648a));
            } else {
                str = "create";
                str2 = "validatePath";
                str3 = "delete";
            }
            C0792a c0792a2 = (C0792a) c0794c.a().get(new Pair(C5142C.b(FileSystemPath.class), bool));
            if (c0792a2 == null) {
                cls = FileSystemPath.class;
                c0792a2 = new C0792a(new Db.M(C5142C.b(FileSystemPath.class), false, C1092e.f7649a));
            } else {
                cls = FileSystemPath.class;
            }
            a10.c(new wb.o(b10, new C0792a[]{c0792a, c0792a2}, new C1093f(null)));
            kotlin.reflect.d b12 = C5142C.b(FileSystemFile.class);
            String simpleName = AbstractC5011a.b(b12).getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
            C0792a c0792a3 = (C0792a) c0794c.a().get(new Pair(C5142C.b(FileSystemFile.class), bool));
            if (c0792a3 == null) {
                c0792a3 = new C0792a(new Db.M(C5142C.b(FileSystemFile.class), false, C1089a.f7643a));
            }
            C4826a c4826a = new C4826a(simpleName, b12, c0792a3);
            C0792a c0792a4 = (C0792a) c0794c.a().get(new Pair(C5142C.b(URI.class), bool));
            if (c0792a4 == null) {
                c0792a4 = new C0792a(new Db.M(C5142C.b(URI.class), false, C1095h.f7659a));
            }
            C0792a[] c0792aArr = {c0792a4};
            Db.U u10 = Db.U.f1425a;
            Db.T t10 = (Db.T) u10.a().get(C5142C.b(Object.class));
            if (t10 == null) {
                t10 = new Db.T(C5142C.b(Object.class));
                u10.a().put(C5142C.b(Object.class), t10);
            }
            c4826a.q(new q("constructor", c0792aArr, t10, new C1096i()));
            C0792a c0792a5 = (C0792a) c0794c.a().get(new Pair(C5142C.b(FileSystemFile.class), bool));
            if (c0792a5 == null) {
                c0792a5 = new C0792a(new Db.M(C5142C.b(FileSystemFile.class), false, C1107t.f7670a));
            }
            C0792a[] c0792aArr2 = {c0792a5};
            Db.T t11 = (Db.T) u10.a().get(C5142C.b(Unit.class));
            if (t11 == null) {
                t11 = new Db.T(C5142C.b(Unit.class));
                u10.a().put(C5142C.b(Unit.class), t11);
            }
            String str9 = str3;
            c4826a.n().put(str9, new q(str9, c0792aArr2, t11, new C1112y()));
            C0792a c0792a6 = (C0792a) c0794c.a().get(new Pair(C5142C.b(FileSystemFile.class), bool));
            if (c0792a6 == null) {
                c0792a6 = new C0792a(new Db.M(C5142C.b(FileSystemFile.class), false, C1113z.f7673a));
            }
            C0792a[] c0792aArr3 = {c0792a6};
            Db.T t12 = (Db.T) u10.a().get(C5142C.b(Unit.class));
            if (t12 == null) {
                t12 = new Db.T(C5142C.b(Unit.class));
                u10.a().put(C5142C.b(Unit.class), t12);
            }
            String str10 = str2;
            c4826a.n().put(str10, new q(str10, c0792aArr3, t12, new A()));
            C0792a c0792a7 = (C0792a) c0794c.a().get(new Pair(C5142C.b(FileSystemFile.class), bool));
            if (c0792a7 == null) {
                str4 = str10;
                c0792a7 = new C0792a(new Db.M(C5142C.b(FileSystemFile.class), false, B.f7632a));
            } else {
                str4 = str10;
            }
            C0792a[] c0792aArr4 = {c0792a7};
            Db.T t13 = (Db.T) u10.a().get(C5142C.b(Unit.class));
            if (t13 == null) {
                t13 = new Db.T(C5142C.b(Unit.class));
                u10.a().put(C5142C.b(Unit.class), t13);
            }
            String str11 = str;
            c4826a.n().put(str11, new q(str11, c0792aArr4, t13, new C()));
            C0792a c0792a8 = (C0792a) c0794c.a().get(new Pair(C5142C.b(FileSystemFile.class), bool));
            if (c0792a8 == null) {
                str6 = str11;
                str5 = str9;
                c0792a8 = new C0792a(new Db.M(C5142C.b(FileSystemFile.class), false, D.f7633a));
            } else {
                str5 = str9;
                str6 = str11;
            }
            C0792a c0792a9 = (C0792a) c0794c.a().get(new Pair(C5142C.b(Either.class), bool));
            if (c0792a9 == null) {
                cls2 = URI.class;
                c0792a9 = new C0792a(new Db.M(C5142C.b(Either.class), false, E.f7634a));
            } else {
                cls2 = URI.class;
            }
            C0792a[] c0792aArr5 = {c0792a8, c0792a9};
            Db.T t14 = (Db.T) u10.a().get(C5142C.b(Unit.class));
            if (t14 == null) {
                t14 = new Db.T(C5142C.b(Unit.class));
                u10.a().put(C5142C.b(Unit.class), t14);
            }
            c4826a.n().put("write", new q("write", c0792aArr5, t14, new F()));
            C0792a c0792a10 = (C0792a) c0794c.a().get(new Pair(C5142C.b(FileSystemFile.class), bool));
            if (c0792a10 == null) {
                c0792a10 = new C0792a(new Db.M(C5142C.b(FileSystemFile.class), false, C1097j.f7661a));
            }
            C0792a[] c0792aArr6 = {c0792a10};
            Db.T t15 = (Db.T) u10.a().get(C5142C.b(String.class));
            if (t15 == null) {
                t15 = new Db.T(C5142C.b(String.class));
                u10.a().put(C5142C.b(String.class), t15);
            }
            c4826a.n().put("text", new q("text", c0792aArr6, t15, new C1098k()));
            C0792a c0792a11 = (C0792a) c0794c.a().get(new Pair(C5142C.b(FileSystemFile.class), bool));
            if (c0792a11 == null) {
                c0792a11 = new C0792a(new Db.M(C5142C.b(FileSystemFile.class), false, C1099l.f7663a));
            }
            C0792a[] c0792aArr7 = {c0792a11};
            Db.T t16 = (Db.T) u10.a().get(C5142C.b(String.class));
            if (t16 == null) {
                t16 = new Db.T(C5142C.b(String.class));
                u10.a().put(C5142C.b(String.class), t16);
            }
            c4826a.n().put("base64", new q("base64", c0792aArr7, t16, new C1100m()));
            C0792a c0792a12 = (C0792a) c0794c.a().get(new Pair(C5142C.b(FileSystemFile.class), bool));
            if (c0792a12 == null) {
                c0792a12 = new C0792a(new Db.M(C5142C.b(FileSystemFile.class), false, C1101n.f7665a));
            }
            C0792a[] c0792aArr8 = {c0792a12};
            Db.T t17 = (Db.T) u10.a().get(C5142C.b(byte[].class));
            if (t17 == null) {
                t17 = new Db.T(C5142C.b(byte[].class));
                u10.a().put(C5142C.b(byte[].class), t17);
            }
            c4826a.n().put("bytes", new q("bytes", c0792aArr8, t17, new C1102o()));
            C5190h c5190h = new C5190h(c4826a.p().d(), "exists");
            C0792a[] c0792aArr9 = {new C0792a(c5190h.d())};
            Db.T t18 = (Db.T) u10.a().get(C5142C.b(Boolean.class));
            if (t18 == null) {
                t18 = new Db.T(C5142C.b(Boolean.class));
                u10.a().put(C5142C.b(Boolean.class), t18);
            }
            q qVar = new q("get", c0792aArr9, t18, new G());
            qVar.k(c5190h.d());
            qVar.j(true);
            c5190h.b(qVar);
            c4826a.m().put("exists", c5190h);
            C0792a c0792a13 = (C0792a) c0794c.a().get(new Pair(C5142C.b(FileSystemFile.class), bool));
            if (c0792a13 == null) {
                c0792a13 = new C0792a(new Db.M(C5142C.b(FileSystemFile.class), false, C1103p.f7667a));
            }
            C0792a c0792a14 = (C0792a) c0794c.a().get(new Pair(C5142C.b(cls), bool));
            if (c0792a14 == null) {
                str7 = "constructor";
                c0792a14 = new C0792a(new Db.M(C5142C.b(cls), false, C1104q.f7668a));
            } else {
                str7 = "constructor";
            }
            C0792a[] c0792aArr10 = {c0792a13, c0792a14};
            Db.T t19 = (Db.T) u10.a().get(C5142C.b(Unit.class));
            if (t19 == null) {
                t19 = new Db.T(C5142C.b(Unit.class));
                u10.a().put(C5142C.b(Unit.class), t19);
            }
            c4826a.n().put("copy", new q("copy", c0792aArr10, t19, new C1105r()));
            C0792a c0792a15 = (C0792a) c0794c.a().get(new Pair(C5142C.b(FileSystemFile.class), bool));
            if (c0792a15 == null) {
                c0792a15 = new C0792a(new Db.M(C5142C.b(FileSystemFile.class), false, C1106s.f7669a));
            }
            C0792a c0792a16 = (C0792a) c0794c.a().get(new Pair(C5142C.b(cls), bool));
            if (c0792a16 == null) {
                c0792a16 = new C0792a(new Db.M(C5142C.b(cls), false, C1108u.f7671a));
            }
            C0792a[] c0792aArr11 = {c0792a15, c0792a16};
            Db.T t20 = (Db.T) u10.a().get(C5142C.b(Unit.class));
            if (t20 == null) {
                t20 = new Db.T(C5142C.b(Unit.class));
                u10.a().put(C5142C.b(Unit.class), t20);
            }
            c4826a.n().put("move", new q("move", c0792aArr11, t20, new C1109v()));
            C5190h c5190h2 = new C5190h(c4826a.p().d(), "uri");
            C0792a[] c0792aArr12 = {new C0792a(c5190h2.d())};
            Db.T t21 = (Db.T) u10.a().get(C5142C.b(String.class));
            if (t21 == null) {
                t21 = new Db.T(C5142C.b(String.class));
                u10.a().put(C5142C.b(String.class), t21);
            }
            q qVar2 = new q("get", c0792aArr12, t21, new H());
            qVar2.k(c5190h2.d());
            qVar2.j(true);
            c5190h2.b(qVar2);
            c4826a.m().put("uri", c5190h2);
            C5190h c5190h3 = new C5190h(c4826a.p().d(), "md5");
            C0792a[] c0792aArr13 = {new C0792a(c5190h3.d())};
            Db.T t22 = (Db.T) u10.a().get(C5142C.b(String.class));
            if (t22 == null) {
                t22 = new Db.T(C5142C.b(String.class));
                u10.a().put(C5142C.b(String.class), t22);
            }
            q qVar3 = new q("get", c0792aArr13, t22, new I());
            qVar3.k(c5190h3.d());
            qVar3.j(true);
            c5190h3.b(qVar3);
            c4826a.m().put("md5", c5190h3);
            C5190h c5190h4 = new C5190h(c4826a.p().d(), "size");
            C0792a[] c0792aArr14 = {new C0792a(c5190h4.d())};
            Db.T t23 = (Db.T) u10.a().get(C5142C.b(Long.class));
            if (t23 == null) {
                t23 = new Db.T(C5142C.b(Long.class));
                u10.a().put(C5142C.b(Long.class), t23);
            }
            q qVar4 = new q("get", c0792aArr14, t23, new J());
            qVar4.k(c5190h4.d());
            qVar4.j(true);
            c5190h4.b(qVar4);
            c4826a.m().put("size", c5190h4);
            C5190h c5190h5 = new C5190h(c4826a.p().d(), "type");
            C0792a[] c0792aArr15 = {new C0792a(c5190h5.d())};
            Db.T t24 = (Db.T) u10.a().get(C5142C.b(String.class));
            if (t24 == null) {
                t24 = new Db.T(C5142C.b(String.class));
                u10.a().put(C5142C.b(String.class), t24);
            }
            q qVar5 = new q("get", c0792aArr15, t24, new K());
            qVar5.k(c5190h5.d());
            qVar5.j(true);
            c5190h5.b(qVar5);
            c4826a.m().put("type", c5190h5);
            C0792a c0792a17 = (C0792a) c0794c.a().get(new Pair(C5142C.b(FileSystemFile.class), bool));
            if (c0792a17 == null) {
                c0792a17 = new C0792a(new Db.M(C5142C.b(FileSystemFile.class), false, C1110w.f7672a));
            }
            C0792a[] c0792aArr16 = {c0792a17};
            Db.T t25 = (Db.T) u10.a().get(C5142C.b(FileSystemFileHandle.class));
            if (t25 == null) {
                t25 = new Db.T(C5142C.b(FileSystemFileHandle.class));
                u10.a().put(C5142C.b(FileSystemFileHandle.class), t25);
            }
            c4826a.n().put("open", new q("open", c0792aArr16, t25, new C1111x()));
            bVar.r().add(c4826a.o());
            kotlin.reflect.d b13 = C5142C.b(FileSystemFileHandle.class);
            String simpleName2 = AbstractC5011a.b(b13).getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName2, "getSimpleName(...)");
            C0792a c0792a18 = (C0792a) c0794c.a().get(new Pair(C5142C.b(FileSystemFileHandle.class), bool));
            if (c0792a18 == null) {
                c0792a18 = new C0792a(new Db.M(C5142C.b(FileSystemFileHandle.class), false, C1090b.f7644a));
            }
            C4826a c4826a2 = new C4826a(simpleName2, b13, c0792a18);
            C0792a c0792a19 = (C0792a) c0794c.a().get(new Pair(C5142C.b(FileSystemFile.class), bool));
            if (c0792a19 == null) {
                c0792a19 = new C0792a(new Db.M(C5142C.b(FileSystemFile.class), false, L.f7635a));
            }
            C0792a[] c0792aArr17 = {c0792a19};
            Db.T t26 = (Db.T) u10.a().get(C5142C.b(Object.class));
            if (t26 == null) {
                t26 = new Db.T(C5142C.b(Object.class));
                u10.a().put(C5142C.b(Object.class), t26);
            }
            String str12 = str7;
            c4826a2.q(new q(str12, c0792aArr17, t26, new M()));
            C0792a c0792a20 = (C0792a) c0794c.a().get(new Pair(C5142C.b(FileSystemFileHandle.class), bool));
            if (c0792a20 == null) {
                c0792a20 = new C0792a(new Db.M(C5142C.b(FileSystemFileHandle.class), false, N.f7636a));
            }
            C0792a c0792a21 = (C0792a) c0794c.a().get(new Pair(C5142C.b(Integer.class), bool));
            if (c0792a21 == null) {
                str8 = str12;
                c0792a21 = new C0792a(new Db.M(C5142C.b(Integer.class), false, O.f7637a));
            } else {
                str8 = str12;
            }
            C0792a[] c0792aArr18 = {c0792a20, c0792a21};
            Db.T t27 = (Db.T) u10.a().get(C5142C.b(byte[].class));
            if (t27 == null) {
                t27 = new Db.T(C5142C.b(byte[].class));
                u10.a().put(C5142C.b(byte[].class), t27);
            }
            c4826a2.n().put("readBytes", new q("readBytes", c0792aArr18, t27, new P()));
            C0792a c0792a22 = (C0792a) c0794c.a().get(new Pair(C5142C.b(FileSystemFileHandle.class), bool));
            if (c0792a22 == null) {
                c0792a22 = new C0792a(new Db.M(C5142C.b(FileSystemFileHandle.class), false, Q.f7638a));
            }
            C0792a c0792a23 = (C0792a) c0794c.a().get(new Pair(C5142C.b(byte[].class), bool));
            if (c0792a23 == null) {
                c0792a23 = new C0792a(new Db.M(C5142C.b(byte[].class), false, R.f7639a));
            }
            C0792a[] c0792aArr19 = {c0792a22, c0792a23};
            Db.T t28 = (Db.T) u10.a().get(C5142C.b(Unit.class));
            if (t28 == null) {
                t28 = new Db.T(C5142C.b(Unit.class));
                u10.a().put(C5142C.b(Unit.class), t28);
            }
            c4826a2.n().put("writeBytes", new q("writeBytes", c0792aArr19, t28, new S()));
            C0792a c0792a24 = (C0792a) c0794c.a().get(new Pair(C5142C.b(FileSystemFileHandle.class), bool));
            if (c0792a24 == null) {
                c0792a24 = new C0792a(new Db.M(C5142C.b(FileSystemFileHandle.class), false, T.f7640a));
            }
            C0792a[] c0792aArr20 = {c0792a24};
            Db.T t29 = (Db.T) u10.a().get(C5142C.b(Unit.class));
            if (t29 == null) {
                t29 = new Db.T(C5142C.b(Unit.class));
                u10.a().put(C5142C.b(Unit.class), t29);
            }
            c4826a2.n().put("close", new q("close", c0792aArr20, t29, new U()));
            C5190h c5190h6 = new C5190h(c4826a2.p().d(), "offset");
            C0792a[] c0792aArr21 = {new C0792a(c5190h6.d())};
            Db.T t30 = (Db.T) u10.a().get(C5142C.b(Long.class));
            if (t30 == null) {
                t30 = new Db.T(C5142C.b(Long.class));
                u10.a().put(C5142C.b(Long.class), t30);
            }
            q qVar6 = new q("get", c0792aArr21, t30, new V());
            qVar6.k(c5190h6.d());
            qVar6.j(true);
            c5190h6.b(qVar6);
            c4826a2.m().put("offset", c5190h6);
            C0792a c0792a25 = new C0792a(c5190h6.d());
            C0792a c0792a26 = (C0792a) c0794c.a().get(new Pair(C5142C.b(Long.class), bool));
            if (c0792a26 == null) {
                cls3 = Object.class;
                c0792a26 = new C0792a(new Db.M(C5142C.b(Long.class), false, X.f7641a));
            } else {
                cls3 = Object.class;
            }
            C0792a[] c0792aArr22 = {c0792a25, c0792a26};
            Db.T t31 = (Db.T) u10.a().get(C5142C.b(Unit.class));
            if (t31 == null) {
                t31 = new Db.T(C5142C.b(Unit.class));
                u10.a().put(C5142C.b(Unit.class), t31);
            }
            q qVar7 = new q("set", c0792aArr22, t31, new Y());
            qVar7.k(c5190h6.d());
            qVar7.j(true);
            c5190h6.c(qVar7);
            C5190h c5190h7 = new C5190h(c4826a2.p().d(), "size");
            C0792a[] c0792aArr23 = {new C0792a(c5190h7.d())};
            Db.T t32 = (Db.T) u10.a().get(C5142C.b(Long.class));
            if (t32 == null) {
                t32 = new Db.T(C5142C.b(Long.class));
                u10.a().put(C5142C.b(Long.class), t32);
            }
            q qVar8 = new q("get", c0792aArr23, t32, new W());
            qVar8.k(c5190h7.d());
            qVar8.j(true);
            c5190h7.b(qVar8);
            c4826a2.m().put("size", c5190h7);
            bVar.r().add(c4826a2.o());
            kotlin.reflect.d b14 = C5142C.b(FileSystemDirectory.class);
            String simpleName3 = AbstractC5011a.b(b14).getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName3, "getSimpleName(...)");
            C0792a c0792a27 = (C0792a) c0794c.a().get(new Pair(C5142C.b(FileSystemDirectory.class), bool));
            if (c0792a27 == null) {
                c0792a27 = new C0792a(new Db.M(C5142C.b(FileSystemDirectory.class), false, C1091c.f7646a));
            }
            C4826a c4826a3 = new C4826a(simpleName3, b14, c0792a27);
            C0792a c0792a28 = (C0792a) c0794c.a().get(new Pair(C5142C.b(cls2), bool));
            if (c0792a28 == null) {
                c0792a28 = new C0792a(new Db.M(C5142C.b(cls2), false, Z.f7642a));
            }
            C0792a[] c0792aArr24 = {c0792a28};
            Db.T t33 = (Db.T) u10.a().get(C5142C.b(cls3));
            if (t33 == null) {
                t33 = new Db.T(C5142C.b(cls3));
                u10.a().put(C5142C.b(cls3), t33);
            }
            c4826a3.q(new q(str8, c0792aArr24, t33, new a0()));
            C0792a c0792a29 = (C0792a) c0794c.a().get(new Pair(C5142C.b(FileSystemDirectory.class), bool));
            if (c0792a29 == null) {
                c0792a29 = new C0792a(new Db.M(C5142C.b(FileSystemDirectory.class), false, g0.f7658a));
            }
            C0792a[] c0792aArr25 = {c0792a29};
            Db.T t34 = (Db.T) u10.a().get(C5142C.b(Unit.class));
            if (t34 == null) {
                t34 = new Db.T(C5142C.b(Unit.class));
                u10.a().put(C5142C.b(Unit.class), t34);
            }
            String str13 = str5;
            c4826a3.n().put(str13, new q(str13, c0792aArr25, t34, new h0()));
            C0792a c0792a30 = (C0792a) c0794c.a().get(new Pair(C5142C.b(FileSystemDirectory.class), bool));
            if (c0792a30 == null) {
                c0792a30 = new C0792a(new Db.M(C5142C.b(FileSystemDirectory.class), false, i0.f7660a));
            }
            C0792a[] c0792aArr26 = {c0792a30};
            Db.T t35 = (Db.T) u10.a().get(C5142C.b(Unit.class));
            if (t35 == null) {
                t35 = new Db.T(C5142C.b(Unit.class));
                u10.a().put(C5142C.b(Unit.class), t35);
            }
            String str14 = str6;
            c4826a3.n().put(str14, new q(str14, c0792aArr26, t35, new j0()));
            C5190h c5190h8 = new C5190h(c4826a3.p().d(), "exists");
            C0792a[] c0792aArr27 = {new C0792a(c5190h8.d())};
            Db.T t36 = (Db.T) u10.a().get(C5142C.b(Boolean.class));
            if (t36 == null) {
                t36 = new Db.T(C5142C.b(Boolean.class));
                u10.a().put(C5142C.b(Boolean.class), t36);
            }
            q qVar9 = new q("get", c0792aArr27, t36, new p0());
            qVar9.k(c5190h8.d());
            qVar9.j(true);
            c5190h8.b(qVar9);
            c4826a3.m().put("exists", c5190h8);
            C0792a c0792a31 = (C0792a) c0794c.a().get(new Pair(C5142C.b(FileSystemDirectory.class), bool));
            if (c0792a31 == null) {
                c0792a31 = new C0792a(new Db.M(C5142C.b(FileSystemDirectory.class), false, k0.f7662a));
            }
            C0792a[] c0792aArr28 = {c0792a31};
            Db.T t37 = (Db.T) u10.a().get(C5142C.b(Unit.class));
            if (t37 == null) {
                t37 = new Db.T(C5142C.b(Unit.class));
                u10.a().put(C5142C.b(Unit.class), t37);
            }
            String str15 = str4;
            c4826a3.n().put(str15, new q(str15, c0792aArr28, t37, new l0()));
            C0792a c0792a32 = (C0792a) c0794c.a().get(new Pair(C5142C.b(FileSystemDirectory.class), bool));
            if (c0792a32 == null) {
                c0792a32 = new C0792a(new Db.M(C5142C.b(FileSystemDirectory.class), false, m0.f7664a));
            }
            C0792a c0792a33 = (C0792a) c0794c.a().get(new Pair(C5142C.b(cls), bool));
            if (c0792a33 == null) {
                c0792a33 = new C0792a(new Db.M(C5142C.b(cls), false, n0.f7666a));
            }
            C0792a[] c0792aArr29 = {c0792a32, c0792a33};
            Db.T t38 = (Db.T) u10.a().get(C5142C.b(Unit.class));
            if (t38 == null) {
                t38 = new Db.T(C5142C.b(Unit.class));
                u10.a().put(C5142C.b(Unit.class), t38);
            }
            c4826a3.n().put("copy", new q("copy", c0792aArr29, t38, new o0()));
            C0792a c0792a34 = (C0792a) c0794c.a().get(new Pair(C5142C.b(FileSystemDirectory.class), bool));
            if (c0792a34 == null) {
                c0792a34 = new C0792a(new Db.M(C5142C.b(FileSystemDirectory.class), false, b0.f7645a));
            }
            C0792a c0792a35 = (C0792a) c0794c.a().get(new Pair(C5142C.b(cls), bool));
            if (c0792a35 == null) {
                c0792a35 = new C0792a(new Db.M(C5142C.b(cls), false, c0.f7647a));
            }
            C0792a[] c0792aArr30 = {c0792a34, c0792a35};
            Db.T t39 = (Db.T) u10.a().get(C5142C.b(Unit.class));
            if (t39 == null) {
                t39 = new Db.T(C5142C.b(Unit.class));
                u10.a().put(C5142C.b(Unit.class), t39);
            }
            c4826a3.n().put("move", new q("move", c0792aArr30, t39, new d0()));
            C5190h c5190h9 = new C5190h(c4826a3.p().d(), "uri");
            C0792a[] c0792aArr31 = {new C0792a(c5190h9.d())};
            Db.T t40 = (Db.T) u10.a().get(C5142C.b(String.class));
            if (t40 == null) {
                t40 = new Db.T(C5142C.b(String.class));
                u10.a().put(C5142C.b(String.class), t40);
            }
            q qVar10 = new q("get", c0792aArr31, t40, new q0());
            qVar10.k(c5190h9.d());
            qVar10.j(true);
            c5190h9.b(qVar10);
            c4826a3.m().put("uri", c5190h9);
            C0792a c0792a36 = (C0792a) c0794c.a().get(new Pair(C5142C.b(FileSystemDirectory.class), bool));
            if (c0792a36 == null) {
                c0792a36 = new C0792a(new Db.M(C5142C.b(FileSystemDirectory.class), false, e0.f7650a));
            }
            C0792a[] c0792aArr32 = {c0792a36};
            Db.T t41 = (Db.T) u10.a().get(C5142C.b(List.class));
            if (t41 == null) {
                t41 = new Db.T(C5142C.b(List.class));
                u10.a().put(C5142C.b(List.class), t41);
            }
            c4826a3.n().put("listAsRecords", new q("listAsRecords", c0792aArr32, t41, new f0()));
            bVar.r().add(c4826a3.o());
            xb.c q10 = bVar.q();
            AbstractC3901a.f();
            return q10;
        } catch (Throwable th) {
            AbstractC3901a.f();
            throw th;
        }
    }
}
