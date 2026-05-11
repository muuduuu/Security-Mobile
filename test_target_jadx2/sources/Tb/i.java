package Tb;

import Db.C0792a;
import Db.C0794c;
import Db.M;
import Db.T;
import Db.U;
import Jd.AbstractC0889j;
import Jd.N;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.security.keystore.KeyPermanentlyInvalidatedException;
import android.util.Log;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.securestore.SecureStoreOptions;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.util.Map;
import javax.crypto.BadPaddingException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;
import org.json.JSONException;
import org.json.JSONObject;
import pc.AbstractC3868b;
import q1.AbstractC3901a;
import u5.C4870a;
import vb.C5006a;
import vb.EnumC5010e;
import wc.InterfaceC5068n;
import xb.AbstractC5139a;
import xc.C5142C;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 I2\u00020\u0001:\u0001JB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\b\u0010\tJ*\u0010\f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\f\u0010\rJ2\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0082@¢\u0006\u0004\b\u0012\u0010\u0013J7\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001f\u0010 J?\u0010&\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0012*\u00020!2\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\"2\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000$2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b&\u0010'JG\u0010(\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0012*\u00020!2\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\"2\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000$2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u000fH\u0002¢\u0006\u0004\b(\u0010)JE\u0010*\u001a\u00028\u0000\"\b\b\u0000\u0010\u0012*\u00020!2\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\"2\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000$2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u000fH\u0002¢\u0006\u0004\b*\u0010)JO\u0010,\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0012*\u00020!2\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\"2\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000$2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010+\u001a\u00020\u000fH\u0002¢\u0006\u0004\b,\u0010-J\u001f\u0010.\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0004H\u0002¢\u0006\u0004\b.\u0010/J\u000f\u00101\u001a\u000200H\u0016¢\u0006\u0004\b1\u00102J\r\u00103\u001a\u00020\n¢\u0006\u0004\b3\u00104R\u0014\u00108\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u0010<\u001a\u0002098\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010@\u001a\u00020=8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010D\u001a\u00020A8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010H\u001a\u00020E8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bF\u0010G¨\u0006K"}, d2 = {"LTb/i;", "Lxb/a;", "<init>", "()V", BuildConfig.FLAVOR, "key", "Lexpo/modules/securestore/SecureStoreOptions;", "options", "t", "(Ljava/lang/String;Lexpo/modules/securestore/SecureStoreOptions;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroid/content/SharedPreferences;", "prefs", "A", "(Ljava/lang/String;Landroid/content/SharedPreferences;Lexpo/modules/securestore/SecureStoreOptions;Lkotlin/coroutines/d;)Ljava/lang/Object;", "value", BuildConfig.FLAVOR, "keyIsInvalidated", BuildConfig.FLAVOR, "E", "(Ljava/lang/String;Ljava/lang/String;Lexpo/modules/securestore/SecureStoreOptions;ZLkotlin/coroutines/d;)Ljava/lang/Object;", "Lorg/json/JSONObject;", "encryptedItem", "requireAuthentication", "keychainService", "D", "(Lorg/json/JSONObject;Landroid/content/SharedPreferences;Ljava/lang/String;ZLjava/lang/String;)Z", "s", "(Ljava/lang/String;Lexpo/modules/securestore/SecureStoreOptions;)V", "keyStoreAlias", "C", "(Ljava/lang/String;Ljava/lang/String;)V", "B", "(Ljava/lang/String;)V", "Ljava/security/KeyStore$Entry;", "Ljava/lang/Class;", "keyStoreEntryClass", "LUb/c;", "encryptor", "w", "(Ljava/lang/Class;LUb/c;Lexpo/modules/securestore/SecureStoreOptions;)Ljava/security/KeyStore$Entry;", "u", "(Ljava/lang/Class;LUb/c;Lexpo/modules/securestore/SecureStoreOptions;Z)Ljava/security/KeyStore$Entry;", "x", "usesKeystoreSuffix", "v", "(Ljava/lang/Class;LUb/c;Lexpo/modules/securestore/SecureStoreOptions;ZZ)Ljava/security/KeyStore$Entry;", "r", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Lxb/c;", "b", "()Lxb/c;", "z", "()Landroid/content/SharedPreferences;", "LUb/a;", "d", "LUb/a;", "mAESEncryptor", "Ljava/security/KeyStore;", "e", "Ljava/security/KeyStore;", "keyStore", "LUb/b;", "f", "LUb/b;", "hybridAESEncryptor", "LTb/b;", "g", "LTb/b;", "authenticationHelper", "Landroid/content/Context;", "y", "()Landroid/content/Context;", "reactContext", "h", C4870a.f43493a, "expo-secure-store_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public class i extends AbstractC5139a {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Ub.a mAESEncryptor = new Ub.a();

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private KeyStore keyStore;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private Ub.b hybridAESEncryptor;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private Tb.b authenticationHelper;

    static final class b extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        int f9688a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f9690c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f9691d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ SecureStoreOptions f9692e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, String str2, SecureStoreOptions secureStoreOptions, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f9690c = str;
            this.f9691d = str2;
            this.f9692e = secureStoreOptions;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
            return i.this.new b(this.f9690c, this.f9691d, this.f9692e, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, kotlin.coroutines.d dVar) {
            return ((b) create(n10, dVar)).invokeSuspend(Unit.f36324a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = AbstractC3868b.e();
            int i10 = this.f9688a;
            if (i10 == 0) {
                lc.p.b(obj);
                i iVar = i.this;
                String str = this.f9690c;
                String str2 = this.f9691d;
                SecureStoreOptions secureStoreOptions = this.f9692e;
                this.f9688a = 1;
                if (iVar.E(str, str2, secureStoreOptions, false, this) == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                lc.p.b(obj);
            }
            return Unit.f36324a;
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        int f9693a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f9695c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ SecureStoreOptions f9696d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, SecureStoreOptions secureStoreOptions, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f9695c = str;
            this.f9696d = secureStoreOptions;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
            return i.this.new c(this.f9695c, this.f9696d, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, kotlin.coroutines.d dVar) {
            return ((c) create(n10, dVar)).invokeSuspend(Unit.f36324a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = AbstractC3868b.e();
            int i10 = this.f9693a;
            if (i10 == 0) {
                lc.p.b(obj);
                i iVar = i.this;
                String str = this.f9695c;
                SecureStoreOptions secureStoreOptions = this.f9696d;
                this.f9693a = 1;
                obj = iVar.t(str, secureStoreOptions, this);
                if (obj == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                lc.p.b(obj);
            }
            return obj;
        }
    }

    public static final class d extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final d f9697a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(String.class);
        }
    }

    public static final class e extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final e f9698a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(SecureStoreOptions.class);
        }
    }

    public static final class f extends xc.m implements Function1 {
        public f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            Intrinsics.checkNotNullParameter(objArr, "<name for destructuring parameter 0>");
            Object obj = objArr[0];
            SecureStoreOptions secureStoreOptions = (SecureStoreOptions) objArr[1];
            String str = (String) obj;
            try {
                i.this.s(str, secureStoreOptions);
                return Unit.f36324a;
            } catch (CodedException e10) {
                throw e10;
            } catch (Exception e11) {
                throw new Tb.e(e11.getMessage(), str, secureStoreOptions.getKeychainService(), e11);
            }
        }
    }

    public static final class g extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final g f9700a = new g();

        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.f(String.class);
        }
    }

    public static final class h extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final h f9701a = new h();

        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.f(String.class);
        }
    }

    /* renamed from: Tb.i$i, reason: collision with other inner class name */
    public static final class C0184i extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final C0184i f9702a = new C0184i();

        public C0184i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(SecureStoreOptions.class);
        }
    }

    public static final class j extends kotlin.coroutines.jvm.internal.l implements InterfaceC5068n {

        /* renamed from: a, reason: collision with root package name */
        int f9703a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f9704b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ i f9705c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(kotlin.coroutines.d dVar, i iVar) {
            super(3, dVar);
            this.f9705c = iVar;
        }

        @Override // wc.InterfaceC5068n
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object n(N n10, Object[] objArr, kotlin.coroutines.d dVar) {
            j jVar = new j(dVar, this.f9705c);
            jVar.f9704b = objArr;
            return jVar.invokeSuspend(Unit.f36324a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = AbstractC3868b.e();
            int i10 = this.f9703a;
            if (i10 == 0) {
                lc.p.b(obj);
                Object[] objArr = (Object[]) this.f9704b;
                Object obj2 = objArr[0];
                Object obj3 = objArr[1];
                SecureStoreOptions secureStoreOptions = (SecureStoreOptions) objArr[2];
                String str = (String) obj3;
                String str2 = (String) obj2;
                if (str == null) {
                    throw new Tb.h();
                }
                i iVar = this.f9705c;
                this.f9703a = 1;
                if (iVar.E(str, str2, secureStoreOptions, false, this) == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                lc.p.b(obj);
            }
            return Unit.f36324a;
        }
    }

    public static final class k extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final k f9706a = new k();

        public k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(String.class);
        }
    }

    public static final class l extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final l f9707a = new l();

        public l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(SecureStoreOptions.class);
        }
    }

    public static final class m extends kotlin.coroutines.jvm.internal.l implements InterfaceC5068n {

        /* renamed from: a, reason: collision with root package name */
        int f9708a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f9709b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ i f9710c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(kotlin.coroutines.d dVar, i iVar) {
            super(3, dVar);
            this.f9710c = iVar;
        }

        @Override // wc.InterfaceC5068n
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object n(N n10, Object[] objArr, kotlin.coroutines.d dVar) {
            m mVar = new m(dVar, this.f9710c);
            mVar.f9709b = objArr;
            return mVar.invokeSuspend(Unit.f36324a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = AbstractC3868b.e();
            int i10 = this.f9708a;
            if (i10 == 0) {
                lc.p.b(obj);
                Object[] objArr = (Object[]) this.f9709b;
                Object obj2 = objArr[0];
                SecureStoreOptions secureStoreOptions = (SecureStoreOptions) objArr[1];
                i iVar = this.f9710c;
                this.f9708a = 1;
                obj = iVar.t((String) obj2, secureStoreOptions, this);
                if (obj == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                lc.p.b(obj);
            }
            return obj;
        }
    }

    public static final class n extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final n f9711a = new n();

        public n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.f(String.class);
        }
    }

    public static final class o extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final o f9712a = new o();

        public o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.f(String.class);
        }
    }

    public static final class p extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final p f9713a = new p();

        public p() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(SecureStoreOptions.class);
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
            Object obj = objArr[0];
            Object obj2 = objArr[1];
            SecureStoreOptions secureStoreOptions = (SecureStoreOptions) objArr[2];
            String str = (String) obj2;
            String str2 = (String) obj;
            if (str == null) {
                throw new Tb.h();
            }
            AbstractC0889j.b(null, i.this.new b(str, str2, secureStoreOptions, null), 1, null);
            return Unit.f36324a;
        }
    }

    public static final class r extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final r f9715a = new r();

        public r() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(String.class);
        }
    }

    public static final class s extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final s f9716a = new s();

        public s() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(SecureStoreOptions.class);
        }
    }

    public static final class t extends xc.m implements Function1 {
        public t() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            Object b10;
            Intrinsics.checkNotNullParameter(objArr, "<name for destructuring parameter 0>");
            Object obj = objArr[0];
            SecureStoreOptions secureStoreOptions = (SecureStoreOptions) objArr[1];
            b10 = AbstractC0889j.b(null, i.this.new c((String) obj, secureStoreOptions, null), 1, null);
            return (String) b10;
        }
    }

    public static final class u extends xc.m implements Function1 {
        public u() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            boolean z10;
            Intrinsics.checkNotNullParameter(it, "it");
            try {
                Tb.b bVar = i.this.authenticationHelper;
                if (bVar == null) {
                    Intrinsics.v("authenticationHelper");
                    bVar = null;
                }
                bVar.b();
                z10 = true;
            } catch (a unused) {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        }
    }

    public static final class v extends xc.m implements Function0 {
        public v() {
            super(0);
        }

        public final void a() {
            i.this.authenticationHelper = new Tb.b(i.this.y(), i.this.a().r());
            i.this.hybridAESEncryptor = new Ub.b(i.this.y(), i.this.mAESEncryptor);
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            i iVar = i.this;
            Intrinsics.d(keyStore);
            iVar.keyStore = keyStore;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f36324a;
        }
    }

    static final class w extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f9720a;

        /* renamed from: b, reason: collision with root package name */
        Object f9721b;

        /* renamed from: c, reason: collision with root package name */
        Object f9722c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f9723d;

        /* renamed from: f, reason: collision with root package name */
        int f9725f;

        w(kotlin.coroutines.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f9723d = obj;
            this.f9725f |= Integer.MIN_VALUE;
            return i.this.A(null, null, null, this);
        }
    }

    static final class x extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f9726a;

        /* renamed from: b, reason: collision with root package name */
        Object f9727b;

        /* renamed from: c, reason: collision with root package name */
        Object f9728c;

        /* renamed from: d, reason: collision with root package name */
        Object f9729d;

        /* renamed from: e, reason: collision with root package name */
        Object f9730e;

        /* renamed from: f, reason: collision with root package name */
        Object f9731f;

        /* renamed from: g, reason: collision with root package name */
        boolean f9732g;

        /* renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f9733h;

        /* renamed from: j, reason: collision with root package name */
        int f9735j;

        x(kotlin.coroutines.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f9733h = obj;
            this.f9735j |= Integer.MIN_VALUE;
            return i.this.E(null, null, null, false, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0035 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v22, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r21v0, types: [android.content.SharedPreferences] */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v39, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v40 */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r2v44 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v20, types: [int] */
    /* JADX WARN: Type inference failed for: r3v21, types: [int] */
    /* JADX WARN: Type inference failed for: r8v2, types: [Ub.a] */
    /* JADX WARN: Type inference failed for: r8v4, types: [Ub.b] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object A(String str, SharedPreferences sharedPreferences, SecureStoreOptions secureStoreOptions, kotlin.coroutines.d dVar) {
        w wVar;
        String str2;
        ?? r22;
        Object obj;
        ?? r23;
        i iVar;
        String str3;
        String str4;
        String str5;
        String str6;
        ?? b10;
        KeyStore.SecretKeyEntry secretKeyEntry;
        Ub.b bVar;
        ?? r32;
        String str7 = str;
        SecureStoreOptions secureStoreOptions2 = secureStoreOptions;
        try {
            try {
                if (dVar instanceof w) {
                    wVar = (w) dVar;
                    r32 = wVar.f9725f;
                    if ((r32 & Integer.MIN_VALUE) != 0) {
                        ?? r33 = r32 - Integer.MIN_VALUE;
                        wVar.f9725f = r33;
                        str2 = r33;
                        w wVar2 = wVar;
                        Object obj2 = wVar2.f9723d;
                        Object e10 = AbstractC3868b.e();
                        r22 = wVar2.f9725f;
                        String str8 = " under keychain ";
                        if (r22 == 0) {
                            try {
                                if (r22 != 1) {
                                    if (r22 != 2) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    lc.p.b(obj2);
                                    return obj2;
                                }
                                lc.p.b(obj2);
                            } catch (BadPaddingException unused) {
                                iVar = sharedPreferences;
                                secureStoreOptions2 = r22;
                                str7 = str2;
                                obj = null;
                                str3 = "ExpoSecureStore";
                                str4 = " under keychain ";
                                Log.w(str3, "Failed to decrypt the entry for " + str7 + str4 + secureStoreOptions2.getKeychainService() + ". The entry in shared preferences is out of sync with the keystore. It will be removed, returning null.");
                                iVar.s(str7, secureStoreOptions2);
                                return obj;
                            } catch (GeneralSecurityException e11) {
                                e = e11;
                                secureStoreOptions2 = r22;
                                str7 = str2;
                                throw new Tb.d(e.getMessage(), str7, secureStoreOptions2.getKeychainService(), e);
                            } catch (Exception e12) {
                                e = e12;
                                secureStoreOptions2 = r22;
                                str7 = str2;
                                throw new Tb.d(e.getMessage(), str7, secureStoreOptions2.getKeychainService(), e);
                            }
                        } else {
                            lc.p.b(obj2);
                            String r10 = r(str7, secureStoreOptions.getKeychainService());
                            String string = sharedPreferences.getString(str7, null);
                            String string2 = sharedPreferences.getString(r10, null);
                            if (string2 != null) {
                                string = string2;
                            }
                            if (string == null) {
                                return null;
                            }
                            try {
                                ?? jSONObject = new JSONObject(string);
                                String optString = jSONObject.optString("scheme");
                                Intrinsics.d(optString);
                                if (optString.length() <= 0) {
                                    optString = null;
                                }
                                if (optString == null) {
                                    throw new Tb.d("Could not find the encryption scheme used for key: " + str7, str, secureStoreOptions.getKeychainService(), null, 8, null);
                                }
                                boolean optBoolean = jSONObject.optBoolean("requireAuthentication", false);
                                boolean optBoolean2 = jSONObject.optBoolean("usesKeystoreSuffix", false);
                                try {
                                    try {
                                        b10 = Intrinsics.b(optString, "aes");
                                    } catch (BadPaddingException unused2) {
                                        obj = null;
                                        r23 = "ExpoSecureStore";
                                    }
                                    try {
                                        try {
                                            if (b10 != 0) {
                                                try {
                                                    try {
                                                        obj = null;
                                                        try {
                                                            try {
                                                                secretKeyEntry = (KeyStore.SecretKeyEntry) v(KeyStore.SecretKeyEntry.class, this.mAESEncryptor, secureStoreOptions, optBoolean, optBoolean2);
                                                            } catch (BadPaddingException unused3) {
                                                                iVar = this;
                                                                str3 = "ExpoSecureStore";
                                                                str4 = " under keychain ";
                                                                Log.w(str3, "Failed to decrypt the entry for " + str7 + str4 + secureStoreOptions2.getKeychainService() + ". The entry in shared preferences is out of sync with the keystore. It will be removed, returning null.");
                                                                iVar.s(str7, secureStoreOptions2);
                                                                return obj;
                                                            }
                                                        } catch (KeyPermanentlyInvalidatedException unused4) {
                                                            r23 = "ExpoSecureStore";
                                                            Log.w((String) r23, "The requested key has been permanently invalidated. Returning null");
                                                            return obj;
                                                        }
                                                    } catch (BadPaddingException unused5) {
                                                        obj = null;
                                                    }
                                                } catch (GeneralSecurityException e13) {
                                                    e = e13;
                                                } catch (Exception e14) {
                                                    e = e14;
                                                }
                                                try {
                                                    if (secretKeyEntry == null) {
                                                        Log.w("ExpoSecureStore", "An entry was found for key " + str7 + " under keychain " + secureStoreOptions.getKeychainService() + ", but there is no corresponding KeyStore key. This situation occurs when the app is reinstalled. The value will be removed to avoid future errors. Returning null");
                                                        s(str7, secureStoreOptions2);
                                                        return null;
                                                    }
                                                    ?? r82 = this.mAESEncryptor;
                                                    Tb.b bVar2 = this.authenticationHelper;
                                                    if (bVar2 == null) {
                                                        Intrinsics.v("authenticationHelper");
                                                        bVar2 = null;
                                                    }
                                                    wVar2.f9720a = this;
                                                    wVar2.f9721b = str7;
                                                    wVar2.f9722c = secureStoreOptions2;
                                                    wVar2.f9725f = 1;
                                                    obj2 = r82.f(str, jSONObject, secretKeyEntry, secureStoreOptions, bVar2, wVar2);
                                                    if (obj2 == e10) {
                                                        return e10;
                                                    }
                                                } catch (BadPaddingException unused6) {
                                                    iVar = this;
                                                    str3 = "ExpoSecureStore";
                                                    str4 = " under keychain ";
                                                    Log.w(str3, "Failed to decrypt the entry for " + str7 + str4 + secureStoreOptions2.getKeychainService() + ". The entry in shared preferences is out of sync with the keystore. It will be removed, returning null.");
                                                    iVar.s(str7, secureStoreOptions2);
                                                    return obj;
                                                } catch (GeneralSecurityException e15) {
                                                    e = e15;
                                                    throw new Tb.d(e.getMessage(), str7, secureStoreOptions2.getKeychainService(), e);
                                                } catch (Exception e16) {
                                                    e = e16;
                                                    throw new Tb.d(e.getMessage(), str7, secureStoreOptions2.getKeychainService(), e);
                                                }
                                            } else {
                                                obj = null;
                                                r23 = secureStoreOptions2;
                                                try {
                                                } catch (BadPaddingException unused7) {
                                                    jSONObject = " under keychain ";
                                                    r23 = "ExpoSecureStore";
                                                }
                                                try {
                                                    if (!Intrinsics.b(optString, "hybrid")) {
                                                        throw new Tb.d("The item for key " + str7 + " in SecureStore has an unknown encoding scheme " + optString + ")", str, secureStoreOptions.getKeychainService(), null, 8, null);
                                                    }
                                                    Ub.b bVar3 = this.hybridAESEncryptor;
                                                    if (bVar3 == null) {
                                                        Intrinsics.v("hybridAESEncryptor");
                                                        bVar = null;
                                                    } else {
                                                        bVar = bVar3;
                                                    }
                                                    Ub.b bVar4 = bVar;
                                                    str8 = " under keychain ";
                                                    try {
                                                        try {
                                                            KeyStore.PrivateKeyEntry privateKeyEntry = (KeyStore.PrivateKeyEntry) v(KeyStore.PrivateKeyEntry.class, bVar4, secureStoreOptions, optBoolean, optBoolean2);
                                                            if (privateKeyEntry == null) {
                                                                return null;
                                                            }
                                                            Ub.b bVar5 = this.hybridAESEncryptor;
                                                            if (bVar5 == null) {
                                                                try {
                                                                    Intrinsics.v("hybridAESEncryptor");
                                                                    bVar5 = null;
                                                                } catch (BadPaddingException unused8) {
                                                                    iVar = this;
                                                                    str3 = "ExpoSecureStore";
                                                                    str4 = str8;
                                                                    secureStoreOptions2 = r23;
                                                                    Log.w(str3, "Failed to decrypt the entry for " + str7 + str4 + secureStoreOptions2.getKeychainService() + ". The entry in shared preferences is out of sync with the keystore. It will be removed, returning null.");
                                                                    iVar.s(str7, secureStoreOptions2);
                                                                    return obj;
                                                                } catch (GeneralSecurityException e17) {
                                                                    e = e17;
                                                                    secureStoreOptions2 = r23;
                                                                    throw new Tb.d(e.getMessage(), str7, secureStoreOptions2.getKeychainService(), e);
                                                                } catch (Exception e18) {
                                                                    e = e18;
                                                                    secureStoreOptions2 = r23;
                                                                    throw new Tb.d(e.getMessage(), str7, secureStoreOptions2.getKeychainService(), e);
                                                                }
                                                            }
                                                            Tb.b bVar6 = this.authenticationHelper;
                                                            if (bVar6 == null) {
                                                                Intrinsics.v("authenticationHelper");
                                                                bVar6 = null;
                                                            }
                                                            wVar2.f9720a = this;
                                                            wVar2.f9721b = str7;
                                                            wVar2.f9722c = r23;
                                                            wVar2.f9725f = 2;
                                                            Object d10 = bVar5.d(str, jSONObject, privateKeyEntry, secureStoreOptions, bVar6, wVar2);
                                                            return d10 == e10 ? e10 : d10;
                                                        } catch (BadPaddingException unused9) {
                                                            r23 = "ExpoSecureStore";
                                                            jSONObject = str8;
                                                            secureStoreOptions2 = secureStoreOptions;
                                                            str6 = jSONObject;
                                                            str5 = r23;
                                                            iVar = this;
                                                            str4 = str6;
                                                            str3 = str5;
                                                            Log.w(str3, "Failed to decrypt the entry for " + str7 + str4 + secureStoreOptions2.getKeychainService() + ". The entry in shared preferences is out of sync with the keystore. It will be removed, returning null.");
                                                            iVar.s(str7, secureStoreOptions2);
                                                            return obj;
                                                        }
                                                    } catch (KeyPermanentlyInvalidatedException unused10) {
                                                        r23 = "ExpoSecureStore";
                                                        Log.w((String) r23, "The requested key has been permanently invalidated. Returning null");
                                                        return obj;
                                                    }
                                                } catch (KeyPermanentlyInvalidatedException unused11) {
                                                } catch (BadPaddingException unused12) {
                                                    secureStoreOptions2 = secureStoreOptions;
                                                    str6 = jSONObject;
                                                    str5 = r23;
                                                    iVar = this;
                                                    str4 = str6;
                                                    str3 = str5;
                                                    Log.w(str3, "Failed to decrypt the entry for " + str7 + str4 + secureStoreOptions2.getKeychainService() + ". The entry in shared preferences is out of sync with the keystore. It will be removed, returning null.");
                                                    iVar.s(str7, secureStoreOptions2);
                                                    return obj;
                                                }
                                            }
                                        } catch (KeyPermanentlyInvalidatedException unused13) {
                                            r23 = 0;
                                        }
                                    } catch (BadPaddingException unused14) {
                                        secureStoreOptions2 = b10;
                                        str6 = -2147483648;
                                        str5 = null;
                                        iVar = this;
                                        str4 = str6;
                                        str3 = str5;
                                        Log.w(str3, "Failed to decrypt the entry for " + str7 + str4 + secureStoreOptions2.getKeychainService() + ". The entry in shared preferences is out of sync with the keystore. It will be removed, returning null.");
                                        iVar.s(str7, secureStoreOptions2);
                                        return obj;
                                    } catch (GeneralSecurityException e19) {
                                        e = e19;
                                        secureStoreOptions2 = b10;
                                    } catch (Exception e20) {
                                        e = e20;
                                        secureStoreOptions2 = b10;
                                    }
                                } catch (GeneralSecurityException e21) {
                                    e = e21;
                                    secureStoreOptions2 = secureStoreOptions;
                                } catch (Exception e22) {
                                    e = e22;
                                    secureStoreOptions2 = secureStoreOptions;
                                }
                            } catch (JSONException e23) {
                                throw new Tb.d("Could not parse the encrypted JSON item in SecureStore: " + e23.getMessage(), str7, secureStoreOptions.getKeychainService(), e23);
                            }
                        }
                        return obj2;
                    }
                }
                if (r22 == 0) {
                }
                return obj2;
            } catch (KeyPermanentlyInvalidatedException unused15) {
                obj = null;
            }
        } catch (CodedException e24) {
            throw e24;
        }
        wVar = new w(dVar);
        str2 = r32;
        w wVar22 = wVar;
        Object obj22 = wVar22.f9723d;
        Object e102 = AbstractC3868b.e();
        r22 = wVar22.f9725f;
        String str82 = " under keychain ";
    }

    private final void B(String keychainService) {
        SharedPreferences z10 = z();
        Map<String, ?> all = z10.getAll();
        Intrinsics.checkNotNullExpressionValue(all, "getAll(...)");
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            String str = value instanceof String ? (String) value : null;
            if (str != null) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    String optString = jSONObject.optString("keystoreAlias");
                    if (optString != null && jSONObject.optBoolean("requireAuthentication", false) && Intrinsics.b(keychainService, optString)) {
                        z10.edit().remove(key).apply();
                        Log.w("ExpoSecureStore", "Removing entry: " + key + " due to the encryption key being deleted");
                    }
                } catch (JSONException unused) {
                }
            }
        }
    }

    private final void C(String keyStoreAlias, String keychainService) {
        KeyStore keyStore = this.keyStore;
        if (keyStore == null) {
            Intrinsics.v("keyStore");
            keyStore = null;
        }
        keyStore.deleteEntry(keyStoreAlias);
        B(keychainService);
    }

    private final boolean D(JSONObject encryptedItem, SharedPreferences prefs, String key, boolean requireAuthentication, String keychainService) {
        encryptedItem.put("usesKeystoreSuffix", true);
        encryptedItem.put("keystoreAlias", keychainService);
        encryptedItem.put("requireAuthentication", requireAuthentication);
        String jSONObject = encryptedItem.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "toString(...)");
        if (jSONObject.length() != 0) {
            return prefs.edit().putString(key, jSONObject).commit();
        }
        throw new Tb.j("Could not JSON-encode the encrypted item for SecureStore - the string " + jSONObject + " is null or empty", key, keychainService, null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(8:(2:3|(10:5|6|7|8|(1:(1:(3:12|13|14)(2:16|17))(4:18|19|20|21))(2:50|(2:52|(2:54|55)(2:56|57))(11:(2:86|87)|59|60|62|63|(3:76|77|78)|65|66|67|68|(1:70)(1:71)))|22|23|(1:25)|33|34))|8|(0)(0)|22|23|(0)|33|34) */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0155, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0156, code lost:
    
        r8 = r2;
        r9 = r3;
        r7 = r4;
        r6 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x018a, code lost:
    
        android.util.Log.w("ExpoSecureStore", "Key has been invalidated, retrying with the key deleted");
        r13.f9726a = r15;
        r13.f9727b = r15;
        r13.f9728c = r15;
        r13.f9729d = r15;
        r13.f9730e = r15;
        r13.f9731f = r15;
        r13.f9735j = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01a6, code lost:
    
        if (r6.E(r7, r8, r9, true, r13) == r14) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01a8, code lost:
    
        return r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01cb, code lost:
    
        throw new Tb.f("Encryption Failed. The key " + r7 + " has been permanently invalidated and cannot be reinitialized", r7, r9.getKeychainService(), r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0149 A[Catch: CodedException -> 0x0071, Exception -> 0x00cd, GeneralSecurityException -> 0x00d0, KeyPermanentlyInvalidatedException -> 0x0155, TRY_LEAVE, TryCatch #7 {KeyPermanentlyInvalidatedException -> 0x0155, blocks: (B:23:0x012b, B:25:0x0149), top: B:22:0x012b }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object E(String str, String str2, SecureStoreOptions secureStoreOptions, boolean z10, kotlin.coroutines.d dVar) {
        x xVar;
        int i10;
        i iVar;
        String str3;
        SecureStoreOptions secureStoreOptions2;
        String str4;
        Object obj;
        KeyStore.SecretKeyEntry secretKeyEntry;
        Ub.a aVar;
        boolean requireAuthentication;
        String authenticationPrompt;
        Tb.b bVar;
        String str5;
        Object obj2;
        SharedPreferences sharedPreferences;
        i iVar2;
        Exception e10;
        GeneralSecurityException e11;
        String str6 = str;
        String str7 = str2;
        SecureStoreOptions secureStoreOptions3 = secureStoreOptions;
        boolean z11 = z10;
        try {
            if (dVar instanceof x) {
                xVar = (x) dVar;
                int i11 = xVar.f9735j;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    xVar.f9735j = i11 - Integer.MIN_VALUE;
                    x xVar2 = xVar;
                    Object obj3 = xVar2.f9733h;
                    Object e12 = AbstractC3868b.e();
                    i10 = xVar2.f9735j;
                    if (i10 != 0) {
                        lc.p.b(obj3);
                        String r10 = r(str6, secureStoreOptions.getKeychainService());
                        SharedPreferences z12 = z();
                        if (str7 == null) {
                            if (z12.edit().putString(r10, null).commit()) {
                                return Unit.f36324a;
                            }
                            throw new Tb.j("Could not write a null value to SecureStore", str, secureStoreOptions.getKeychainService(), null, 8, null);
                        }
                        if (z11) {
                            try {
                                try {
                                    C(this.mAESEncryptor.c(secureStoreOptions3, secureStoreOptions.getRequireAuthentication()), secureStoreOptions.getKeychainService());
                                } catch (KeyPermanentlyInvalidatedException e13) {
                                    e = e13;
                                    iVar = this;
                                    str3 = str7;
                                    secureStoreOptions2 = secureStoreOptions3;
                                    str4 = str6;
                                    obj = null;
                                    if (!z11) {
                                    }
                                }
                            } catch (GeneralSecurityException e14) {
                                e11 = e14;
                                throw new Tb.f(e11.getMessage(), str6, secureStoreOptions3.getKeychainService(), e11);
                            } catch (Exception e15) {
                                e10 = e15;
                                throw new Tb.j(e10.getMessage(), str6, secureStoreOptions3.getKeychainService(), e10);
                            }
                        }
                        try {
                            secretKeyEntry = (KeyStore.SecretKeyEntry) x(KeyStore.SecretKeyEntry.class, this.mAESEncryptor, secureStoreOptions3, secureStoreOptions.getRequireAuthentication());
                            aVar = this.mAESEncryptor;
                            requireAuthentication = secureStoreOptions.getRequireAuthentication();
                            authenticationPrompt = secureStoreOptions.getAuthenticationPrompt();
                            try {
                                bVar = this.authenticationHelper;
                                if (bVar == null) {
                                    try {
                                        Intrinsics.v("authenticationHelper");
                                        bVar = null;
                                    } catch (KeyPermanentlyInvalidatedException e16) {
                                        e = e16;
                                        iVar = this;
                                        str3 = str7;
                                        secureStoreOptions2 = secureStoreOptions3;
                                        str4 = str6;
                                        obj = null;
                                        if (!z11) {
                                        }
                                    }
                                }
                                xVar2.f9726a = this;
                                xVar2.f9727b = str6;
                                xVar2.f9728c = str7;
                                xVar2.f9729d = secureStoreOptions3;
                                xVar2.f9730e = r10;
                                xVar2.f9731f = z12;
                                xVar2.f9732g = z11;
                                xVar2.f9735j = 1;
                                obj = null;
                            } catch (KeyPermanentlyInvalidatedException e17) {
                                e = e17;
                                obj = null;
                            }
                        } catch (KeyPermanentlyInvalidatedException e18) {
                            e = e18;
                            obj = null;
                        }
                        try {
                            Object d10 = aVar.d(str2, secretKeyEntry, requireAuthentication, authenticationPrompt, bVar, xVar2);
                            if (d10 == e12) {
                                return e12;
                            }
                            str5 = r10;
                            obj2 = d10;
                            sharedPreferences = z12;
                            iVar2 = this;
                        } catch (KeyPermanentlyInvalidatedException e19) {
                            e = e19;
                            iVar = this;
                            str3 = str7;
                            secureStoreOptions2 = secureStoreOptions3;
                            str4 = str6;
                            if (!z11) {
                            }
                        }
                    } else {
                        if (i10 != 1) {
                            if (i10 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            lc.p.b(obj3);
                            return Unit.f36324a;
                        }
                        boolean z13 = xVar2.f9732g;
                        SharedPreferences sharedPreferences2 = (SharedPreferences) xVar2.f9731f;
                        String str8 = (String) xVar2.f9730e;
                        SecureStoreOptions secureStoreOptions4 = (SecureStoreOptions) xVar2.f9729d;
                        String str9 = (String) xVar2.f9728c;
                        str4 = (String) xVar2.f9727b;
                        i iVar3 = (i) xVar2.f9726a;
                        try {
                            lc.p.b(obj3);
                            z11 = z13;
                            str7 = str9;
                            iVar2 = iVar3;
                            obj = null;
                            sharedPreferences = sharedPreferences2;
                            str5 = str8;
                            secureStoreOptions3 = secureStoreOptions4;
                            str6 = str4;
                            obj2 = obj3;
                        } catch (KeyPermanentlyInvalidatedException e20) {
                            e = e20;
                            z11 = z13;
                            secureStoreOptions2 = secureStoreOptions4;
                            obj = null;
                            str3 = str9;
                            iVar = iVar3;
                            if (!z11) {
                            }
                        } catch (GeneralSecurityException e21) {
                            e11 = e21;
                            secureStoreOptions3 = secureStoreOptions4;
                            str6 = str4;
                            throw new Tb.f(e11.getMessage(), str6, secureStoreOptions3.getKeychainService(), e11);
                        } catch (Exception e22) {
                            e10 = e22;
                            secureStoreOptions3 = secureStoreOptions4;
                            str6 = str4;
                            throw new Tb.j(e10.getMessage(), str6, secureStoreOptions3.getKeychainService(), e10);
                        }
                    }
                    JSONObject jSONObject = (JSONObject) obj2;
                    jSONObject.put("scheme", "aes");
                    iVar2.D(jSONObject, sharedPreferences, str5, secureStoreOptions3.getRequireAuthentication(), secureStoreOptions3.getKeychainService());
                    if (sharedPreferences.contains(str6)) {
                        sharedPreferences.edit().remove(str6).apply();
                    }
                    return Unit.f36324a;
                }
            }
            if (i10 != 0) {
            }
            JSONObject jSONObject2 = (JSONObject) obj2;
            jSONObject2.put("scheme", "aes");
            iVar2.D(jSONObject2, sharedPreferences, str5, secureStoreOptions3.getRequireAuthentication(), secureStoreOptions3.getKeychainService());
            if (sharedPreferences.contains(str6)) {
            }
            return Unit.f36324a;
        } catch (CodedException e23) {
            throw e23;
        }
        xVar = new x(dVar);
        x xVar22 = xVar;
        Object obj32 = xVar22.f9733h;
        Object e122 = AbstractC3868b.e();
        i10 = xVar22.f9735j;
    }

    private final String r(String key, String keychainService) {
        return keychainService + "-" + key;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s(String key, SecureStoreOptions options) {
        SharedPreferences z10 = z();
        String r10 = r(key, options.getKeychainService());
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(y());
        boolean commit = z10.contains(r10) ? z10.edit().remove(r10).commit() : true;
        if (z10.contains(key)) {
            commit = z10.edit().remove(key).commit() && commit;
        }
        if (defaultSharedPreferences.contains(key)) {
            commit = defaultSharedPreferences.edit().remove(key).commit() && commit;
        }
        if (!commit) {
            throw new Tb.e("Could not delete the item from SecureStore", key, options.getKeychainService(), null, 8, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object t(String str, SecureStoreOptions secureStoreOptions, kotlin.coroutines.d dVar) {
        SharedPreferences z10 = z();
        if (z10.contains(r(str, secureStoreOptions.getKeychainService()))) {
            return A(str, z10, secureStoreOptions, dVar);
        }
        if (z10.contains(str)) {
            return A(str, z10, secureStoreOptions, dVar);
        }
        return null;
    }

    private final KeyStore.Entry u(Class keyStoreEntryClass, Ub.c encryptor, SecureStoreOptions options, boolean requireAuthentication) {
        String c10 = encryptor.c(options, requireAuthentication);
        KeyStore keyStore = this.keyStore;
        if (keyStore == null) {
            Intrinsics.v("keyStore");
            keyStore = null;
        }
        if (!keyStore.containsAlias(c10)) {
            return null;
        }
        KeyStore keyStore2 = this.keyStore;
        if (keyStore2 == null) {
            Intrinsics.v("keyStore");
            keyStore2 = null;
        }
        KeyStore.Entry entry = keyStore2.getEntry(c10, null);
        if (!keyStoreEntryClass.isInstance(entry)) {
            throw new Tb.g("The entry for the keystore alias \"" + c10 + "\" is not a " + keyStoreEntryClass.getSimpleName());
        }
        KeyStore.Entry entry2 = (KeyStore.Entry) keyStoreEntryClass.cast(entry);
        if (entry2 != null) {
            return entry2;
        }
        throw new Tb.g("The entry for the keystore alias \"" + c10 + "\" couldn't be cast to correct class");
    }

    private final KeyStore.Entry v(Class keyStoreEntryClass, Ub.c encryptor, SecureStoreOptions options, boolean requireAuthentication, boolean usesKeystoreSuffix) {
        return usesKeystoreSuffix ? u(keyStoreEntryClass, encryptor, options, requireAuthentication) : w(keyStoreEntryClass, encryptor, options);
    }

    private final KeyStore.Entry w(Class keyStoreEntryClass, Ub.c encryptor, SecureStoreOptions options) {
        String a10 = encryptor.a(options);
        KeyStore keyStore = this.keyStore;
        if (keyStore == null) {
            Intrinsics.v("keyStore");
            keyStore = null;
        }
        if (!keyStore.containsAlias(encryptor.a(options))) {
            return null;
        }
        KeyStore keyStore2 = this.keyStore;
        if (keyStore2 == null) {
            Intrinsics.v("keyStore");
            keyStore2 = null;
        }
        KeyStore.Entry entry = keyStore2.getEntry(a10, null);
        if (keyStoreEntryClass.isInstance(entry)) {
            return (KeyStore.Entry) keyStoreEntryClass.cast(entry);
        }
        return null;
    }

    private final KeyStore.Entry x(Class keyStoreEntryClass, Ub.c encryptor, SecureStoreOptions options, boolean requireAuthentication) {
        KeyStore.Entry u10 = u(keyStoreEntryClass, encryptor, options, requireAuthentication);
        if (u10 != null) {
            return u10;
        }
        KeyStore keyStore = null;
        if (requireAuthentication) {
            Tb.b bVar = this.authenticationHelper;
            if (bVar == null) {
                Intrinsics.v("authenticationHelper");
                bVar = null;
            }
            bVar.b();
        }
        KeyStore keyStore2 = this.keyStore;
        if (keyStore2 == null) {
            Intrinsics.v("keyStore");
        } else {
            keyStore = keyStore2;
        }
        return encryptor.b(keyStore, options);
    }

    @Override // xb.AbstractC5139a
    public xb.c b() {
        Class cls;
        Class cls2;
        Boolean bool;
        AbstractC3901a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            xb.b bVar = new xb.b(this);
            bVar.o("ExpoSecureStore");
            wb.d a10 = bVar.a("setValueWithKeyAsync");
            String b10 = a10.b();
            C0794c c0794c = C0794c.f1454a;
            kotlin.reflect.d b11 = C5142C.b(String.class);
            Boolean bool2 = Boolean.TRUE;
            C0792a c0792a = (C0792a) c0794c.a().get(new Pair(b11, bool2));
            if (c0792a == null) {
                c0792a = new C0792a(new M(C5142C.b(String.class), true, g.f9700a));
            }
            C0792a c0792a2 = (C0792a) c0794c.a().get(new Pair(C5142C.b(String.class), bool2));
            if (c0792a2 == null) {
                cls = Object.class;
                c0792a2 = new C0792a(new M(C5142C.b(String.class), true, h.f9701a));
            } else {
                cls = Object.class;
            }
            kotlin.reflect.d b12 = C5142C.b(SecureStoreOptions.class);
            Boolean bool3 = Boolean.FALSE;
            C0792a c0792a3 = (C0792a) c0794c.a().get(new Pair(b12, bool3));
            if (c0792a3 == null) {
                cls2 = Unit.class;
                bool = bool2;
                c0792a3 = new C0792a(new M(C5142C.b(SecureStoreOptions.class), false, C0184i.f9702a));
            } else {
                cls2 = Unit.class;
                bool = bool2;
            }
            a10.c(new wb.o(b10, new C0792a[]{c0792a, c0792a2, c0792a3}, new j(null, this)));
            wb.d a11 = bVar.a("getValueWithKeyAsync");
            String b13 = a11.b();
            C0792a c0792a4 = (C0792a) c0794c.a().get(new Pair(C5142C.b(String.class), bool3));
            if (c0792a4 == null) {
                c0792a4 = new C0792a(new M(C5142C.b(String.class), false, k.f9706a));
            }
            C0792a c0792a5 = (C0792a) c0794c.a().get(new Pair(C5142C.b(SecureStoreOptions.class), bool3));
            if (c0792a5 == null) {
                c0792a5 = new C0792a(new M(C5142C.b(SecureStoreOptions.class), false, l.f9707a));
            }
            a11.c(new wb.o(b13, new C0792a[]{c0792a4, c0792a5}, new m(null, this)));
            Boolean bool4 = bool;
            C0792a c0792a6 = (C0792a) c0794c.a().get(new Pair(C5142C.b(String.class), bool4));
            if (c0792a6 == null) {
                c0792a6 = new C0792a(new M(C5142C.b(String.class), true, n.f9711a));
            }
            C0792a c0792a7 = (C0792a) c0794c.a().get(new Pair(C5142C.b(String.class), bool4));
            if (c0792a7 == null) {
                c0792a7 = new C0792a(new M(C5142C.b(String.class), true, o.f9712a));
            }
            C0792a c0792a8 = (C0792a) c0794c.a().get(new Pair(C5142C.b(SecureStoreOptions.class), bool3));
            if (c0792a8 == null) {
                c0792a8 = new C0792a(new M(C5142C.b(SecureStoreOptions.class), false, p.f9713a));
            }
            C0792a[] c0792aArr = {c0792a6, c0792a7, c0792a8};
            U u10 = U.f1425a;
            T t10 = (T) u10.a().get(C5142C.b(cls2));
            if (t10 == null) {
                t10 = new T(C5142C.b(cls2));
                u10.a().put(C5142C.b(cls2), t10);
            }
            bVar.n().put("setValueWithKeySync", new wb.q("setValueWithKeySync", c0792aArr, t10, new q()));
            C0792a c0792a9 = (C0792a) c0794c.a().get(new Pair(C5142C.b(String.class), bool3));
            if (c0792a9 == null) {
                c0792a9 = new C0792a(new M(C5142C.b(String.class), false, r.f9715a));
            }
            C0792a c0792a10 = (C0792a) c0794c.a().get(new Pair(C5142C.b(SecureStoreOptions.class), bool3));
            if (c0792a10 == null) {
                c0792a10 = new C0792a(new M(C5142C.b(SecureStoreOptions.class), false, s.f9716a));
            }
            C0792a[] c0792aArr2 = {c0792a9, c0792a10};
            T t11 = (T) u10.a().get(C5142C.b(String.class));
            if (t11 == null) {
                t11 = new T(C5142C.b(String.class));
                u10.a().put(C5142C.b(String.class), t11);
            }
            bVar.n().put("getValueWithKeySync", new wb.q("getValueWithKeySync", c0792aArr2, t11, new t()));
            C0792a c0792a11 = (C0792a) c0794c.a().get(new Pair(C5142C.b(String.class), bool3));
            if (c0792a11 == null) {
                c0792a11 = new C0792a(new M(C5142C.b(String.class), false, d.f9697a));
            }
            C0792a c0792a12 = (C0792a) c0794c.a().get(new Pair(C5142C.b(SecureStoreOptions.class), bool3));
            if (c0792a12 == null) {
                c0792a12 = new C0792a(new M(C5142C.b(SecureStoreOptions.class), false, e.f9698a));
            }
            C0792a[] c0792aArr3 = {c0792a11, c0792a12};
            f fVar = new f();
            Class cls3 = cls2;
            bVar.k().put("deleteValueWithKeyAsync", Intrinsics.b(cls3, Integer.TYPE) ? new wb.k("deleteValueWithKeyAsync", c0792aArr3, fVar) : Intrinsics.b(cls3, Boolean.TYPE) ? new wb.h("deleteValueWithKeyAsync", c0792aArr3, fVar) : Intrinsics.b(cls3, Double.TYPE) ? new wb.i("deleteValueWithKeyAsync", c0792aArr3, fVar) : Intrinsics.b(cls3, Float.TYPE) ? new wb.j("deleteValueWithKeyAsync", c0792aArr3, fVar) : Intrinsics.b(cls3, String.class) ? new wb.m("deleteValueWithKeyAsync", c0792aArr3, fVar) : new wb.e("deleteValueWithKeyAsync", c0792aArr3, fVar));
            C0792a[] c0792aArr4 = new C0792a[0];
            T t12 = (T) u10.a().get(C5142C.b(cls));
            if (t12 == null) {
                t12 = new T(C5142C.b(cls));
                u10.a().put(C5142C.b(cls), t12);
            }
            bVar.n().put("canUseBiometricAuthentication", new wb.q("canUseBiometricAuthentication", c0792aArr4, t12, new u()));
            Map s10 = bVar.s();
            EnumC5010e enumC5010e = EnumC5010e.MODULE_CREATE;
            s10.put(enumC5010e, new C5006a(enumC5010e, new v()));
            xb.c q10 = bVar.q();
            AbstractC3901a.f();
            return q10;
        } catch (Throwable th) {
            AbstractC3901a.f();
            throw th;
        }
    }

    public Context y() {
        Context w10 = a().w();
        if (w10 != null) {
            return w10;
        }
        throw new expo.modules.kotlin.exception.l();
    }

    public final SharedPreferences z() {
        SharedPreferences sharedPreferences = y().getSharedPreferences("SecureStore", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        return sharedPreferences;
    }
}
