package expo.modules.crypto;

import Db.C0792a;
import Db.C0794c;
import Db.M;
import Db.T;
import Db.U;
import android.util.Base64;
import expo.modules.crypto.DigestOptions;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.AbstractC3574i;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.Charsets;
import org.conscrypt.BuildConfig;
import org.conscrypt.PSKKeyManager;
import q1.AbstractC3901a;
import xb.AbstractC5139a;
import xc.C5142C;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lexpo/modules/crypto/a;", "Lxb/a;", "<init>", "()V", BuildConfig.FLAVOR, "randomByteCount", BuildConfig.FLAVOR, "o", "(I)Ljava/lang/String;", "Lexpo/modules/crypto/DigestAlgorithm;", "algorithm", "data", "Lexpo/modules/crypto/DigestOptions;", "options", "n", "(Lexpo/modules/crypto/DigestAlgorithm;Ljava/lang/String;Lexpo/modules/crypto/DigestOptions;)Ljava/lang/String;", "LCb/j;", "output", BuildConfig.FLAVOR, "m", "(Lexpo/modules/crypto/DigestAlgorithm;LCb/j;LCb/j;)V", "typedArray", "p", "(LCb/j;)V", "Lxb/c;", "b", "()Lxb/c;", "Ljava/security/SecureRandom;", "d", "Lkotlin/Lazy;", "q", "()Ljava/security/SecureRandom;", "secureRandom", "expo-crypto_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class a extends AbstractC5139a {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Lazy secureRandom = lc.i.a(w.f32638a);

    /* renamed from: expo.modules.crypto.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C0472a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f32617a;

        static {
            int[] iArr = new int[DigestOptions.Encoding.values().length];
            try {
                iArr[DigestOptions.Encoding.BASE64.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DigestOptions.Encoding.HEX.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f32617a = iArr;
        }
    }

    public static final class b extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f32618a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(DigestAlgorithm.class);
        }
    }

    public static final class c extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final c f32619a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(String.class);
        }
    }

    public static final class d extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final d f32620a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(DigestOptions.class);
        }
    }

    public static final class e extends xc.m implements Function1 {
        public e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            Intrinsics.checkNotNullParameter(objArr, "<name for destructuring parameter 0>");
            Object obj = objArr[0];
            Object obj2 = objArr[1];
            DigestOptions digestOptions = (DigestOptions) objArr[2];
            DigestAlgorithm digestAlgorithm = (DigestAlgorithm) obj;
            return a.this.n(digestAlgorithm, (String) obj2, digestOptions);
        }
    }

    public static final class f extends xc.m implements Function2 {
        public f() {
            super(2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(Object[] objArr, pb.m promise) {
            Intrinsics.checkNotNullParameter(objArr, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(promise, "promise");
            a.this.o(((Integer) promise).intValue());
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (pb.m) obj2);
            return Unit.f36324a;
        }
    }

    public static final class g extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final g f32623a = new g();

        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(Integer.TYPE);
        }
    }

    public static final class h extends xc.m implements Function1 {
        public h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            Intrinsics.checkNotNullParameter(objArr, "<name for destructuring parameter 0>");
            return a.this.o(((Number) objArr[0]).intValue());
        }
    }

    public static final class i extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final i f32625a = new i();

        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(Cb.j.class);
        }
    }

    public static final class j extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final j f32626a = new j();

        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(Cb.j.class);
        }
    }

    public static final class k extends xc.m implements Function1 {
        public k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            Intrinsics.checkNotNullParameter(objArr, "<name for destructuring parameter 0>");
            Object obj = objArr[0];
            Object obj2 = objArr[1];
            Cb.j jVar = (Cb.j) objArr[2];
            a aVar = a.this;
            aVar.m((DigestAlgorithm) obj, (Cb.j) obj2, jVar);
            return Unit.f36324a;
        }
    }

    public static final class l extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final l f32628a = new l();

        public l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(DigestAlgorithm.class);
        }
    }

    public static final class m extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final m f32629a = new m();

        public m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(String.class);
        }
    }

    public static final class n extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final n f32630a = new n();

        public n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(DigestOptions.class);
        }
    }

    public static final class o extends xc.m implements Function1 {
        public o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            Intrinsics.checkNotNullParameter(objArr, "<name for destructuring parameter 0>");
            Object obj = objArr[0];
            Object obj2 = objArr[1];
            DigestOptions digestOptions = (DigestOptions) objArr[2];
            DigestAlgorithm digestAlgorithm = (DigestAlgorithm) obj;
            return a.this.n(digestAlgorithm, (String) obj2, digestOptions);
        }
    }

    public static final class p extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final p f32632a = new p();

        public p() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(Integer.TYPE);
        }
    }

    public static final class q extends xc.m implements Function1 {
        public q() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            Intrinsics.checkNotNullParameter(objArr, "<name for destructuring parameter 0>");
            return a.this.o(((Number) objArr[0]).intValue());
        }
    }

    public static final class r extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final r f32634a = new r();

        public r() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(Cb.j.class);
        }
    }

    public static final class s extends xc.m implements Function1 {
        public s() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            Intrinsics.checkNotNullParameter(objArr, "<name for destructuring parameter 0>");
            a.this.p((Cb.j) objArr[0]);
            return Unit.f36324a;
        }
    }

    public static final class t extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final t f32636a = new t();

        public t() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(DigestAlgorithm.class);
        }
    }

    public static final class u extends xc.m implements Function1 {
        public u() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return UUID.randomUUID().toString();
        }
    }

    static final class v extends xc.m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final v f32637a = new v();

        v() {
            super(1);
        }

        public final CharSequence a(byte b10) {
            String num = Integer.toString((b10 & 255) + PSKKeyManager.MAX_KEY_LENGTH_BYTES, CharsKt.checkRadix(16));
            Intrinsics.checkNotNullExpressionValue(num, "toString(...)");
            String substring = num.substring(1);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            return substring;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).byteValue());
        }
    }

    static final class w extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final w f32638a = new w();

        w() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SecureRandom invoke() {
            return new SecureRandom();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m(DigestAlgorithm algorithm, Cb.j output, Cb.j data) {
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm.getValue());
        messageDigest.update(data.toDirectBuffer());
        byte[] digest = messageDigest.digest();
        Intrinsics.checkNotNullExpressionValue(digest, "digest(...)");
        output.write(digest, output.h(), output.e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String n(DigestAlgorithm algorithm, String data, DigestOptions options) {
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm.getValue());
        byte[] bytes = data.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        messageDigest.update(bytes);
        byte[] digest = messageDigest.digest();
        Intrinsics.checkNotNullExpressionValue(digest, "digest(...)");
        int i10 = C0472a.f32617a[options.getEncoding().ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                return AbstractC3574i.Q(digest, BuildConfig.FLAVOR, null, null, 0, null, v.f32637a, 30, null);
            }
            throw new lc.m();
        }
        String encodeToString = Base64.encodeToString(digest, 2);
        Intrinsics.d(encodeToString);
        return encodeToString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String o(int randomByteCount) {
        byte[] bArr = new byte[randomByteCount];
        q().nextBytes(bArr);
        String encodeToString = Base64.encodeToString(bArr, 2);
        Intrinsics.checkNotNullExpressionValue(encodeToString, "encodeToString(...)");
        return encodeToString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p(Cb.j typedArray) {
        byte[] bArr = new byte[typedArray.e()];
        q().nextBytes(bArr);
        typedArray.write(bArr, typedArray.h(), typedArray.e());
    }

    private final SecureRandom q() {
        return (SecureRandom) this.secureRandom.getValue();
    }

    @Override // xb.AbstractC5139a
    public xb.c b() {
        Class cls;
        Class cls2;
        Class cls3;
        Class cls4;
        wb.g kVar;
        AbstractC3901a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            xb.b bVar = new xb.b(this);
            bVar.o("ExpoCrypto");
            C0794c c0794c = C0794c.f1454a;
            kotlin.reflect.d b10 = C5142C.b(DigestAlgorithm.class);
            Boolean bool = Boolean.FALSE;
            C0792a c0792a = (C0792a) c0794c.a().get(new Pair(b10, bool));
            if (c0792a == null) {
                cls = Object.class;
                cls2 = Unit.class;
                c0792a = new C0792a(new M(C5142C.b(DigestAlgorithm.class), false, l.f32628a));
            } else {
                cls = Object.class;
                cls2 = Unit.class;
            }
            C0792a c0792a2 = (C0792a) c0794c.a().get(new Pair(C5142C.b(String.class), bool));
            if (c0792a2 == null) {
                cls3 = Cb.j.class;
                c0792a2 = new C0792a(new M(C5142C.b(String.class), false, m.f32629a));
            } else {
                cls3 = Cb.j.class;
            }
            C0792a c0792a3 = (C0792a) c0794c.a().get(new Pair(C5142C.b(DigestOptions.class), bool));
            if (c0792a3 == null) {
                cls4 = Integer.class;
                c0792a3 = new C0792a(new M(C5142C.b(DigestOptions.class), false, n.f32630a));
            } else {
                cls4 = Integer.class;
            }
            C0792a[] c0792aArr = {c0792a, c0792a2, c0792a3};
            U u10 = U.f1425a;
            T t10 = (T) u10.a().get(C5142C.b(String.class));
            if (t10 == null) {
                t10 = new T(C5142C.b(String.class));
                u10.a().put(C5142C.b(String.class), t10);
            }
            bVar.n().put("digestString", new wb.q("digestString", c0792aArr, t10, new o()));
            C0792a c0792a4 = (C0792a) c0794c.a().get(new Pair(C5142C.b(DigestAlgorithm.class), bool));
            if (c0792a4 == null) {
                c0792a4 = new C0792a(new M(C5142C.b(DigestAlgorithm.class), false, b.f32618a));
            }
            C0792a c0792a5 = (C0792a) c0794c.a().get(new Pair(C5142C.b(String.class), bool));
            if (c0792a5 == null) {
                c0792a5 = new C0792a(new M(C5142C.b(String.class), false, c.f32619a));
            }
            C0792a c0792a6 = (C0792a) c0794c.a().get(new Pair(C5142C.b(DigestOptions.class), bool));
            if (c0792a6 == null) {
                c0792a6 = new C0792a(new M(C5142C.b(DigestOptions.class), false, d.f32620a));
            }
            C0792a[] c0792aArr2 = {c0792a4, c0792a5, c0792a6};
            e eVar = new e();
            Class cls5 = Integer.TYPE;
            bVar.k().put("digestStringAsync", Intrinsics.b(String.class, cls5) ? new wb.k("digestStringAsync", c0792aArr2, eVar) : Intrinsics.b(String.class, Boolean.TYPE) ? new wb.h("digestStringAsync", c0792aArr2, eVar) : Intrinsics.b(String.class, Double.TYPE) ? new wb.i("digestStringAsync", c0792aArr2, eVar) : Intrinsics.b(String.class, Float.TYPE) ? new wb.j("digestStringAsync", c0792aArr2, eVar) : Intrinsics.b(String.class, String.class) ? new wb.m("digestStringAsync", c0792aArr2, eVar) : new wb.e("digestStringAsync", c0792aArr2, eVar));
            C0792a c0792a7 = (C0792a) c0794c.a().get(new Pair(C5142C.b(cls4), bool));
            if (c0792a7 == null) {
                c0792a7 = new C0792a(new M(C5142C.b(cls4), false, p.f32632a));
            }
            C0792a[] c0792aArr3 = {c0792a7};
            T t11 = (T) u10.a().get(C5142C.b(String.class));
            if (t11 == null) {
                t11 = new T(C5142C.b(String.class));
                u10.a().put(C5142C.b(String.class), t11);
            }
            bVar.n().put("getRandomBase64String", new wb.q("getRandomBase64String", c0792aArr3, t11, new q()));
            Class cls6 = cls4;
            if (Intrinsics.b(cls6, pb.m.class)) {
                kVar = new wb.f("getRandomBase64StringAsync", new C0792a[0], new f());
            } else {
                C0792a c0792a8 = (C0792a) c0794c.a().get(new Pair(C5142C.b(cls6), bool));
                if (c0792a8 == null) {
                    c0792a8 = new C0792a(new M(C5142C.b(cls6), false, g.f32623a));
                }
                C0792a[] c0792aArr4 = {c0792a8};
                h hVar = new h();
                kVar = Intrinsics.b(String.class, cls5) ? new wb.k("getRandomBase64StringAsync", c0792aArr4, hVar) : Intrinsics.b(String.class, Boolean.TYPE) ? new wb.h("getRandomBase64StringAsync", c0792aArr4, hVar) : Intrinsics.b(String.class, Double.TYPE) ? new wb.i("getRandomBase64StringAsync", c0792aArr4, hVar) : Intrinsics.b(String.class, Float.TYPE) ? new wb.j("getRandomBase64StringAsync", c0792aArr4, hVar) : Intrinsics.b(String.class, String.class) ? new wb.m("getRandomBase64StringAsync", c0792aArr4, hVar) : new wb.e("getRandomBase64StringAsync", c0792aArr4, hVar);
            }
            bVar.k().put("getRandomBase64StringAsync", kVar);
            C0792a c0792a9 = (C0792a) c0794c.a().get(new Pair(C5142C.b(cls3), bool));
            if (c0792a9 == null) {
                c0792a9 = new C0792a(new M(C5142C.b(cls3), false, r.f32634a));
            }
            C0792a[] c0792aArr5 = {c0792a9};
            T t12 = (T) u10.a().get(C5142C.b(cls2));
            if (t12 == null) {
                t12 = new T(C5142C.b(cls2));
                u10.a().put(C5142C.b(cls2), t12);
            }
            bVar.n().put("getRandomValues", new wb.q("getRandomValues", c0792aArr5, t12, new s()));
            C0792a c0792a10 = (C0792a) c0794c.a().get(new Pair(C5142C.b(DigestAlgorithm.class), bool));
            if (c0792a10 == null) {
                c0792a10 = new C0792a(new M(C5142C.b(DigestAlgorithm.class), false, t.f32636a));
            }
            C0792a c0792a11 = (C0792a) c0794c.a().get(new Pair(C5142C.b(cls3), bool));
            if (c0792a11 == null) {
                c0792a11 = new C0792a(new M(C5142C.b(cls3), false, i.f32625a));
            }
            C0792a c0792a12 = (C0792a) c0794c.a().get(new Pair(C5142C.b(cls3), bool));
            if (c0792a12 == null) {
                c0792a12 = new C0792a(new M(C5142C.b(cls3), false, j.f32626a));
            }
            C0792a[] c0792aArr6 = {c0792a10, c0792a11, c0792a12};
            T t13 = (T) u10.a().get(C5142C.b(cls2));
            if (t13 == null) {
                t13 = new T(C5142C.b(cls2));
                u10.a().put(C5142C.b(cls2), t13);
            }
            bVar.n().put("digest", new wb.q("digest", c0792aArr6, t13, new k()));
            C0792a[] c0792aArr7 = new C0792a[0];
            T t14 = (T) u10.a().get(C5142C.b(cls));
            if (t14 == null) {
                t14 = new T(C5142C.b(cls));
                u10.a().put(C5142C.b(cls), t14);
            }
            bVar.n().put("randomUUID", new wb.q("randomUUID", c0792aArr7, t14, new u()));
            xb.c q10 = bVar.q();
            AbstractC3901a.f();
            return q10;
        } catch (Throwable th) {
            AbstractC3901a.f();
            throw th;
        }
    }
}
