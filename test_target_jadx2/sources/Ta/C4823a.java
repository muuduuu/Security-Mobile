package ta;

import Db.C0792a;
import Db.C0794c;
import Db.M;
import Jd.AbstractC0887i;
import Jd.N;
import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URI;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.EnumSet;
import kb.InterfaceC3558b;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.AbstractC3574i;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.o;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import lc.p;
import org.conscrypt.BuildConfig;
import pb.C3862a;
import pc.AbstractC3868b;
import q1.AbstractC3901a;
import wc.InterfaceC5068n;
import xb.AbstractC5139a;
import xc.C5142C;
import xc.m;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\tH\u0082@¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lta/a;", "Lxb/a;", "<init>", "()V", "Ljava/net/URI;", "uri", BuildConfig.FLAVOR, "p", "(Ljava/net/URI;)Ljava/lang/String;", "Ljava/io/File;", "file", "o", "(Ljava/io/File;)Ljava/lang/String;", "Lpb/a;", "appContext", "localUrl", "Landroid/net/Uri;", "m", "(Lpb/a;Ljava/net/URI;Ljava/io/File;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lxb/c;", "b", "()Lxb/c;", "Landroid/content/Context;", "n", "()Landroid/content/Context;", "context", "expo-asset_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ta.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4823a extends AbstractC5139a {

    /* renamed from: ta.a$a, reason: collision with other inner class name */
    public static final class C0618a extends m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final C0618a f43336a = new C0618a();

        public C0618a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o invoke() {
            return C5142C.o(URI.class);
        }
    }

    /* renamed from: ta.a$b */
    public static final class b extends m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f43337a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o invoke() {
            return C5142C.f(String.class);
        }
    }

    /* renamed from: ta.a$c */
    public static final class c extends m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final c f43338a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o invoke() {
            return C5142C.o(String.class);
        }
    }

    /* renamed from: ta.a$d */
    public static final class d extends l implements InterfaceC5068n {

        /* renamed from: a, reason: collision with root package name */
        int f43339a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f43340b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C4823a f43341c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(kotlin.coroutines.d dVar, C4823a c4823a) {
            super(3, dVar);
            this.f43341c = c4823a;
        }

        @Override // wc.InterfaceC5068n
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object n(N n10, Object[] objArr, kotlin.coroutines.d dVar) {
            d dVar2 = new d(dVar, this.f43341c);
            dVar2.f43340b = objArr;
            return dVar2.invokeSuspend(Unit.f36324a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = AbstractC3868b.e();
            int i10 = this.f43339a;
            if (i10 == 0) {
                p.b(obj);
                Object[] objArr = (Object[]) this.f43340b;
                Object obj2 = objArr[0];
                Object obj3 = objArr[1];
                String str = (String) objArr[2];
                String str2 = (String) obj3;
                URI uri = (URI) obj2;
                if (uri.getScheme() == "file") {
                    return uri;
                }
                String p10 = str2 == null ? this.f43341c.p(uri) : str2;
                File file = new File(this.f43341c.a().j() + "/ExponentAsset-" + p10 + "." + str);
                if (!file.exists()) {
                    C4823a c4823a = this.f43341c;
                    C3862a a10 = c4823a.a();
                    this.f43339a = 1;
                    obj = c4823a.m(a10, uri, file, this);
                    if (obj == e10) {
                        return e10;
                    }
                } else {
                    if (str2 == null || Intrinsics.b(str2, this.f43341c.o(file))) {
                        return Uri.fromFile(file);
                    }
                    C4823a c4823a2 = this.f43341c;
                    C3862a a11 = c4823a2.a();
                    this.f43339a = 2;
                    obj = c4823a2.m(a11, uri, file, this);
                    if (obj == e10) {
                        return e10;
                    }
                }
            } else {
                if (i10 != 1 && i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p.b(obj);
            }
            return obj;
        }
    }

    /* renamed from: ta.a$e */
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f43342a;

        /* renamed from: c, reason: collision with root package name */
        int f43344c;

        e(kotlin.coroutines.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f43342a = obj;
            this.f43344c |= Integer.MIN_VALUE;
            return C4823a.this.m(null, null, null, this);
        }
    }

    /* renamed from: ta.a$f */
    static final class f extends l implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        int f43345a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ URI f43346b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C4823a f43347c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ File f43348d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(URI uri, C4823a c4823a, File file, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f43346b = uri;
            this.f43347c = c4823a;
            this.f43348d = file;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
            return new f(this.f43346b, this.f43347c, this.f43348d, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, kotlin.coroutines.d dVar) {
            return ((f) create(n10, dVar)).invokeSuspend(Unit.f36324a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            InputStream openStream;
            AbstractC3868b.e();
            if (this.f43345a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p.b(obj);
            try {
                String uri = this.f43346b.toString();
                Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
                if (StringsKt.K(uri, ":", false, 2, null)) {
                    openStream = this.f43346b.toURL().openStream();
                } else {
                    Context n10 = this.f43347c.n();
                    String uri2 = this.f43346b.toString();
                    Intrinsics.checkNotNullExpressionValue(uri2, "toString(...)");
                    openStream = AbstractC4824b.b(n10, uri2);
                }
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(this.f43348d);
                    try {
                        Intrinsics.d(openStream);
                        kotlin.io.b.b(openStream, fileOutputStream, 0, 2, null);
                        kotlin.io.c.a(fileOutputStream, null);
                        kotlin.io.c.a(openStream, null);
                        return Uri.fromFile(this.f43348d);
                    } finally {
                    }
                } finally {
                }
            } catch (Exception unused) {
                String uri3 = this.f43346b.toString();
                Intrinsics.checkNotNullExpressionValue(uri3, "toString(...)");
                throw new C4825c(uri3);
            }
        }
    }

    /* renamed from: ta.a$g */
    static final class g extends m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final g f43349a = new g();

        g() {
            super(1);
        }

        public final CharSequence a(byte b10) {
            String format = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b10)}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            return format;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).byteValue());
        }
    }

    /* renamed from: ta.a$h */
    static final class h extends m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final h f43350a = new h();

        h() {
            super(1);
        }

        public final CharSequence a(byte b10) {
            String format = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b10)}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            return format;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).byteValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(C3862a c3862a, URI uri, File file, kotlin.coroutines.d dVar) {
        e eVar;
        int i10;
        EnumSet a10;
        if (dVar instanceof e) {
            eVar = (e) dVar;
            int i11 = eVar.f43344c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                eVar.f43344c = i11 - Integer.MIN_VALUE;
                Object obj = eVar.f43342a;
                Object e10 = AbstractC3868b.e();
                i10 = eVar.f43344c;
                if (i10 != 0) {
                    p.b(obj);
                    File parentFile = file.getParentFile();
                    if (parentFile == null || !parentFile.exists()) {
                        file.mkdirs();
                    }
                    InterfaceC3558b n10 = c3862a.n();
                    if (n10 == null || (a10 = n10.a(c3862a.w(), file.getParent())) == null || !a10.contains(kb.c.WRITE)) {
                        String uri2 = uri.toString();
                        Intrinsics.checkNotNullExpressionValue(uri2, "toString(...)");
                        throw new C4825c(uri2);
                    }
                    CoroutineContext y10 = c3862a.i().y();
                    f fVar = new f(uri, this, file, null);
                    eVar.f43344c = 1;
                    obj = AbstractC0887i.g(y10, fVar, eVar);
                    if (obj == e10) {
                        return e10;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p.b(obj);
                }
                Intrinsics.checkNotNullExpressionValue(obj, "withContext(...)");
                return obj;
            }
        }
        eVar = new e(dVar);
        Object obj2 = eVar.f43342a;
        Object e102 = AbstractC3868b.e();
        i10 = eVar.f43344c;
        if (i10 != 0) {
        }
        Intrinsics.checkNotNullExpressionValue(obj2, "withContext(...)");
        return obj2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Context n() {
        Context w10 = a().w();
        if (w10 != null) {
            return w10;
        }
        throw new expo.modules.kotlin.exception.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String o(File file) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                DigestInputStream digestInputStream = new DigestInputStream(fileInputStream, MessageDigest.getInstance("MD5"));
                try {
                    byte[] digest = digestInputStream.getMessageDigest().digest();
                    Intrinsics.checkNotNullExpressionValue(digest, "digest(...)");
                    String Q10 = AbstractC3574i.Q(digest, BuildConfig.FLAVOR, null, null, 0, null, g.f43349a, 30, null);
                    kotlin.io.c.a(digestInputStream, null);
                    kotlin.io.c.a(fileInputStream, null);
                    return Q10;
                } finally {
                }
            } finally {
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String p(URI uri) {
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        String uri2 = uri.toString();
        Intrinsics.checkNotNullExpressionValue(uri2, "toString(...)");
        byte[] bytes = uri2.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        byte[] digest = messageDigest.digest(bytes);
        Intrinsics.checkNotNullExpressionValue(digest, "digest(...)");
        return AbstractC3574i.Q(digest, BuildConfig.FLAVOR, null, null, 0, null, h.f43350a, 30, null);
    }

    @Override // xb.AbstractC5139a
    public xb.c b() {
        AbstractC3901a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            xb.b bVar = new xb.b(this);
            bVar.o("ExpoAsset");
            wb.d a10 = bVar.a("downloadAsync");
            String b10 = a10.b();
            C0794c c0794c = C0794c.f1454a;
            kotlin.reflect.d b11 = C5142C.b(URI.class);
            Boolean bool = Boolean.FALSE;
            C0792a c0792a = (C0792a) c0794c.a().get(new Pair(b11, bool));
            if (c0792a == null) {
                c0792a = new C0792a(new M(C5142C.b(URI.class), false, C0618a.f43336a));
            }
            C0792a c0792a2 = (C0792a) c0794c.a().get(new Pair(C5142C.b(String.class), Boolean.TRUE));
            if (c0792a2 == null) {
                c0792a2 = new C0792a(new M(C5142C.b(String.class), true, b.f43337a));
            }
            C0792a c0792a3 = (C0792a) c0794c.a().get(new Pair(C5142C.b(String.class), bool));
            if (c0792a3 == null) {
                c0792a3 = new C0792a(new M(C5142C.b(String.class), false, c.f43338a));
            }
            a10.c(new wb.o(b10, new C0792a[]{c0792a, c0792a2, c0792a3}, new d(null, this)));
            xb.c q10 = bVar.q();
            AbstractC3901a.f();
            return q10;
        } catch (Throwable th) {
            AbstractC3901a.f();
            throw th;
        }
    }
}
