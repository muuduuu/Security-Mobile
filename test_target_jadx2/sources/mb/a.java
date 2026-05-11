package Mb;

import Db.C0792a;
import Db.C0794c;
import Db.M;
import Jd.AbstractC0891k;
import Jd.N;
import android.app.Activity;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.AbstractActivityC1577t;
import androidx.fragment.app.ComponentCallbacksC1573o;
import co.hyperverge.hypersnapsdk.objects.HVError;
import co.hyperverge.hypersnapsdk.utils.AppConstants;
import com.appsflyer.attribution.RequestError;
import com.facebook.react.bridge.BaseJavaModule;
import expo.modules.kotlin.exception.UnexpectedException;
import expo.modules.localauthentication.AuthOptions;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.o;
import lc.p;
import org.conscrypt.BuildConfig;
import p.n;
import pc.AbstractC3868b;
import q1.AbstractC3901a;
import vb.C5009d;
import vb.EnumC5010e;
import xb.AbstractC5139a;
import xc.C5142C;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001c\u0010\u001bJ'\u0010 \u001a\u00020\u001f2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$R\u001b\u0010*\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R#\u00100\u001a\n ,*\u0004\u0018\u00010+0+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010'\u001a\u0004\b.\u0010/R\u0018\u00104\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u00109\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010<\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010>\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010;R\u0014\u0010B\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010F\u001a\u00020C8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0014\u0010J\u001a\u00020G8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bH\u0010IR\u0014\u0010M\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bK\u0010L¨\u0006N"}, d2 = {"LMb/a;", "Lxb/a;", "<init>", "()V", "Landroidx/fragment/app/t;", "fragmentActivity", "Lexpo/modules/localauthentication/AuthOptions;", "options", "Lpb/m;", BaseJavaModule.METHOD_TYPE_PROMISE, BuildConfig.FLAVOR, "D", "(Landroidx/fragment/app/t;Lexpo/modules/localauthentication/AuthOptions;Lpb/m;)V", "Q", "(Lexpo/modules/localauthentication/AuthOptions;Lpb/m;)V", BuildConfig.FLAVOR, "feature", BuildConfig.FLAVOR, "N", "(Ljava/lang/String;)Z", BuildConfig.FLAVOR, AppConstants.RETAKE_ERROR_CODE, "G", "(I)Ljava/lang/String;", "O", "(I)Z", "F", "()I", "E", AppConstants.VIDEO_RECORDING_ERROR, "warning", "Landroid/os/Bundle;", "H", "(Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;", "Lxb/c;", "b", "()Lxb/c;", "Lp/m;", "d", "Lkotlin/Lazy;", "J", "()Lp/m;", "biometricManager", "Landroid/content/pm/PackageManager;", "kotlin.jvm.PlatformType", "e", "M", "()Landroid/content/pm/PackageManager;", "packageManager", "Lp/n;", "f", "Lp/n;", "biometricPrompt", "g", "Lpb/m;", "h", "Lexpo/modules/localauthentication/AuthOptions;", "authOptions", "i", "Z", "isRetryingWithDeviceCredentials", "j", "isAuthenticating", "Lp/n$a;", "k", "Lp/n$a;", "authenticationCallback", "Landroid/content/Context;", "K", "()Landroid/content/Context;", "context", "Landroid/app/KeyguardManager;", "L", "()Landroid/app/KeyguardManager;", "keyguardManager", "P", "()Z", "isDeviceSecure", "expo-local-authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class a extends AbstractC5139a {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private n biometricPrompt;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private pb.m promise;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private AuthOptions authOptions;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private boolean isRetryingWithDeviceCredentials;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private boolean isAuthenticating;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Lazy biometricManager = lc.i.a(new b());

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Lazy packageManager = lc.i.a(new l());

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final n.a authenticationCallback = new C0123a();

    /* renamed from: Mb.a$a, reason: collision with other inner class name */
    public static final class C0123a extends n.a {
        C0123a() {
        }

        @Override // p.n.a
        public void a(int i10, CharSequence errString) {
            AuthOptions authOptions;
            pb.m mVar;
            Intrinsics.checkNotNullParameter(errString, "errString");
            if (a.this.O(i10) && a.this.P() && !a.this.isRetryingWithDeviceCredentials && (authOptions = a.this.authOptions) != null && !authOptions.getDisableDeviceFallback() && (mVar = a.this.promise) != null) {
                a aVar = a.this;
                aVar.isRetryingWithDeviceCredentials = true;
                aVar.Q(authOptions, mVar);
                return;
            }
            a.this.isAuthenticating = false;
            a.this.isRetryingWithDeviceCredentials = false;
            a.this.biometricPrompt = null;
            pb.m mVar2 = a.this.promise;
            if (mVar2 != null) {
                a aVar2 = a.this;
                mVar2.resolve(aVar2.H(aVar2.G(i10), errString.toString()));
            }
            a.this.promise = null;
            a.this.authOptions = null;
        }

        @Override // p.n.a
        public void c(n.b result) {
            Intrinsics.checkNotNullParameter(result, "result");
            a.this.isAuthenticating = false;
            a.this.isRetryingWithDeviceCredentials = false;
            a.this.biometricPrompt = null;
            pb.m mVar = a.this.promise;
            if (mVar != null) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("success", true);
                mVar.resolve(bundle);
            }
            a.this.promise = null;
            a.this.authOptions = null;
        }
    }

    static final class b extends xc.m implements Function0 {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p.m invoke() {
            return p.m.g(a.this.K());
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        int f6120a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractActivityC1577t f6122c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ AuthOptions f6123d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ pb.m f6124e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(AbstractActivityC1577t abstractActivityC1577t, AuthOptions authOptions, pb.m mVar, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f6122c = abstractActivityC1577t;
            this.f6123d = authOptions;
            this.f6124e = mVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
            return a.this.new c(this.f6122c, this.f6123d, this.f6124e, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, kotlin.coroutines.d dVar) {
            return ((c) create(n10, dVar)).invokeSuspend(Unit.f36324a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC3868b.e();
            if (this.f6120a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p.b(obj);
            a.this.D(this.f6122c, this.f6123d, this.f6124e);
            return Unit.f36324a;
        }
    }

    public static final class d extends xc.m implements Function1 {
        public d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            Intrinsics.checkNotNullParameter(it, "it");
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            if (a.this.F() != 12) {
                Mb.b.a(linkedHashSet, a.this.N("android.hardware.fingerprint"), 1);
                Mb.b.a(linkedHashSet, a.this.N("android.hardware.biometrics.face"), 2);
                Mb.b.a(linkedHashSet, a.this.N("android.hardware.biometrics.iris"), 3);
                Mb.b.a(linkedHashSet, a.this.N("com.samsung.android.bio.face"), 2);
            }
            return linkedHashSet;
        }
    }

    public static final class e extends xc.m implements Function1 {
        public e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(a.this.F() != 12);
        }
    }

    public static final class f extends xc.m implements Function1 {
        public f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(a.this.F() == 0);
        }
    }

    public static final class g extends xc.m implements Function1 {
        public g() {
            super(1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v3 */
        /* JADX WARN: Type inference failed for: r2v7 */
        /* JADX WARN: Type inference failed for: r2v8 */
        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            Intrinsics.checkNotNullParameter(it, "it");
            ?? r22 = a.this.P();
            if (a.this.F() == 0) {
                r22 = 2;
            }
            int i10 = r22;
            if (a.this.E() == 0) {
                i10 = 3;
            }
            return Integer.valueOf(i10);
        }
    }

    public static final class h extends xc.m implements Function1 {
        public h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            Intrinsics.checkNotNullParameter(it, "it");
            n nVar = a.this.biometricPrompt;
            if (nVar != null) {
                nVar.d();
            }
            a.this.isAuthenticating = false;
            return Unit.f36324a;
        }
    }

    public static final class i extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final i f6130a = new i();

        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o invoke() {
            return C5142C.o(AuthOptions.class);
        }
    }

    public static final class j extends xc.m implements Function2 {
        public j() {
            super(2);
        }

        public final void a(Object[] objArr, pb.m promise) {
            Intrinsics.checkNotNullParameter(objArr, "<name for destructuring parameter 0>");
            Intrinsics.checkNotNullParameter(promise, "promise");
            AuthOptions authOptions = (AuthOptions) objArr[0];
            Activity x10 = a.this.a().x();
            AbstractActivityC1577t abstractActivityC1577t = x10 instanceof AbstractActivityC1577t ? (AbstractActivityC1577t) x10 : null;
            if (abstractActivityC1577t == null) {
                promise.h(new expo.modules.kotlin.exception.g());
            } else if (!a.this.L().isDeviceSecure()) {
                promise.resolve(a.this.H("not_enrolled", "KeyguardManager#isDeviceSecure() returned false"));
            } else {
                a.this.authOptions = authOptions;
                AbstractC0891k.d(a.this.a().t(), null, null, a.this.new c(abstractActivityC1577t, authOptions, promise, null), 3, null);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (pb.m) obj2);
            return Unit.f36324a;
        }
    }

    public static final class k extends xc.m implements Function2 {
        public k() {
            super(2);
        }

        public final void a(Activity sender, vb.j payload) {
            ComponentCallbacksC1573o i02;
            Intrinsics.checkNotNullParameter(sender, "sender");
            Intrinsics.checkNotNullParameter(payload, "payload");
            int a10 = payload.a();
            int b10 = payload.b();
            Intent c10 = payload.c();
            if (a10 != 6) {
                if (!(sender instanceof AbstractActivityC1577t) || (i02 = ((AbstractActivityC1577t) sender).getSupportFragmentManager().i0("androidx.biometric.BiometricFragment")) == null) {
                    return;
                }
                i02.onActivityResult(a10 & 65535, b10, c10);
                return;
            }
            if (b10 == -1) {
                pb.m mVar = a.this.promise;
                if (mVar != null) {
                    mVar.resolve(a.I(a.this, null, null, 3, null));
                }
            } else {
                pb.m mVar2 = a.this.promise;
                if (mVar2 != null) {
                    mVar2.resolve(a.this.H("user_cancel", "Device Credentials canceled"));
                }
            }
            a.this.isAuthenticating = false;
            a.this.isRetryingWithDeviceCredentials = false;
            a.this.biometricPrompt = null;
            a.this.promise = null;
            a.this.authOptions = null;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Activity) obj, (vb.j) obj2);
            return Unit.f36324a;
        }
    }

    static final class l extends xc.m implements Function0 {
        l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PackageManager invoke() {
            return a.this.K().getPackageManager();
        }
    }

    static final class m extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        int f6134a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f6136c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ AbstractActivityC1577t f6137d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ pb.m f6138e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f6139f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(String str, AbstractActivityC1577t abstractActivityC1577t, pb.m mVar, boolean z10, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f6136c = str;
            this.f6137d = abstractActivityC1577t;
            this.f6138e = mVar;
            this.f6139f = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
            return a.this.new m(this.f6136c, this.f6137d, this.f6138e, this.f6139f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, kotlin.coroutines.d dVar) {
            return ((m) create(n10, dVar)).invokeSuspend(Unit.f36324a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC3868b.e();
            if (this.f6134a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p.b(obj);
            if (Build.VERSION.SDK_INT < 30) {
                this.f6137d.startActivityForResult(a.this.L().createConfirmDeviceCredentialIntent(this.f6136c, BuildConfig.FLAVOR), 6);
                return Unit.f36324a;
            }
            ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
            Intrinsics.checkNotNullExpressionValue(newSingleThreadExecutor, "newSingleThreadExecutor(...)");
            n nVar = new n(this.f6137d, newSingleThreadExecutor, a.this.authenticationCallback);
            a.this.biometricPrompt = nVar;
            n.d.a aVar = new n.d.a();
            String str = this.f6136c;
            boolean z10 = this.f6139f;
            aVar.e(str);
            aVar.b(32768);
            aVar.c(z10);
            n.d a10 = aVar.a();
            Intrinsics.checkNotNullExpressionValue(a10, "build(...)");
            try {
                nVar.a(a10);
            } catch (NullPointerException e10) {
                this.f6138e.h(new UnexpectedException("Canceled authentication due to an internal error", e10));
            }
            return Unit.f36324a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D(AbstractActivityC1577t fragmentActivity, AuthOptions options, pb.m promise) {
        if (this.isAuthenticating) {
            pb.m mVar = this.promise;
            if (mVar != null) {
                mVar.resolve(I(this, "app_cancel", null, 2, null));
            }
            this.promise = promise;
            return;
        }
        String promptMessage = options.getPromptMessage();
        String cancelLabel = options.getCancelLabel();
        boolean requireConfirmation = options.getRequireConfirmation();
        int nativeBiometricSecurityLevel = options.getDisableDeviceFallback() ? options.getBiometricsSecurityLevel().toNativeBiometricSecurityLevel() : options.getBiometricsSecurityLevel().toNativeBiometricSecurityLevel() | 32768;
        this.isAuthenticating = true;
        this.promise = promise;
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        Intrinsics.checkNotNullExpressionValue(newSingleThreadExecutor, "newSingleThreadExecutor(...)");
        this.biometricPrompt = new n(fragmentActivity, newSingleThreadExecutor, this.authenticationCallback);
        n.d.a aVar = new n.d.a();
        aVar.e(promptMessage);
        aVar.b(nativeBiometricSecurityLevel);
        if (options.getDisableDeviceFallback()) {
            aVar.d(cancelLabel);
        }
        aVar.c(requireConfirmation);
        n.d a10 = aVar.a();
        Intrinsics.checkNotNullExpressionValue(a10, "build(...)");
        try {
            n nVar = this.biometricPrompt;
            Intrinsics.d(nVar);
            nVar.a(a10);
        } catch (NullPointerException e10) {
            promise.h(new UnexpectedException("Canceled authentication due to an internal error", e10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int E() {
        return J().a(15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int F() {
        return J().a(255);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String G(int code) {
        switch (code) {
            case 1:
            case 11:
            case 12:
            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                return "not_available";
            case 2:
                return "unable_to_process";
            case 3:
                return "timeout";
            case 4:
                return "no_space";
            case 5:
            case RequestError.EVENT_TIMEOUT /* 10 */:
            case 13:
                return "user_cancel";
            case 6:
            case 8:
            default:
                return "unknown";
            case 7:
            case 9:
                return "lockout";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bundle H(String error, String warning) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("success", error == null);
        if (error != null) {
            bundle.putString(AppConstants.VIDEO_RECORDING_ERROR, error);
        }
        if (warning != null) {
            bundle.putString("warning", warning);
        }
        return bundle;
    }

    static /* synthetic */ Bundle I(a aVar, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        return aVar.H(str, str2);
    }

    private final p.m J() {
        return (p.m) this.biometricManager.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Context K() {
        Context w10 = a().w();
        if (w10 != null) {
            return w10;
        }
        throw new expo.modules.kotlin.exception.l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final KeyguardManager L() {
        Object systemService = K().getSystemService("keyguard");
        Intrinsics.e(systemService, "null cannot be cast to non-null type android.app.KeyguardManager");
        return (KeyguardManager) systemService;
    }

    private final PackageManager M() {
        return (PackageManager) this.packageManager.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean N(String feature) {
        return M().hasSystemFeature(feature);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean O(int code) {
        return code == 1 || code == 2 || code == 4 || code == 11 || code == 12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean P() {
        return L().isDeviceSecure();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q(AuthOptions options, pb.m promise) {
        AbstractActivityC1577t abstractActivityC1577t = (AbstractActivityC1577t) a().x();
        if (abstractActivityC1577t == null) {
            promise.resolve(H("not_available", "getCurrentActivity() returned null"));
            return;
        }
        AbstractC0891k.d(a().t(), null, null, new m(options.getPromptMessage(), abstractActivityC1577t, promise, options.getRequireConfirmation(), null), 3, null);
    }

    @Override // xb.AbstractC5139a
    public xb.c b() {
        AbstractC3901a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            xb.b bVar = new xb.b(this);
            bVar.o("ExpoLocalAuthentication");
            C0792a[] c0792aArr = new C0792a[0];
            d dVar = new d();
            Class cls = Integer.TYPE;
            bVar.k().put("supportedAuthenticationTypesAsync", Intrinsics.b(Set.class, cls) ? new wb.k("supportedAuthenticationTypesAsync", c0792aArr, dVar) : Intrinsics.b(Set.class, Boolean.TYPE) ? new wb.h("supportedAuthenticationTypesAsync", c0792aArr, dVar) : Intrinsics.b(Set.class, Double.TYPE) ? new wb.i("supportedAuthenticationTypesAsync", c0792aArr, dVar) : Intrinsics.b(Set.class, Float.TYPE) ? new wb.j("supportedAuthenticationTypesAsync", c0792aArr, dVar) : Intrinsics.b(Set.class, String.class) ? new wb.m("supportedAuthenticationTypesAsync", c0792aArr, dVar) : new wb.e("supportedAuthenticationTypesAsync", c0792aArr, dVar));
            C0792a[] c0792aArr2 = new C0792a[0];
            e eVar = new e();
            bVar.k().put("hasHardwareAsync", Intrinsics.b(Boolean.class, cls) ? new wb.k("hasHardwareAsync", c0792aArr2, eVar) : Intrinsics.b(Boolean.class, Boolean.TYPE) ? new wb.h("hasHardwareAsync", c0792aArr2, eVar) : Intrinsics.b(Boolean.class, Double.TYPE) ? new wb.i("hasHardwareAsync", c0792aArr2, eVar) : Intrinsics.b(Boolean.class, Float.TYPE) ? new wb.j("hasHardwareAsync", c0792aArr2, eVar) : Intrinsics.b(Boolean.class, String.class) ? new wb.m("hasHardwareAsync", c0792aArr2, eVar) : new wb.e("hasHardwareAsync", c0792aArr2, eVar));
            C0792a[] c0792aArr3 = new C0792a[0];
            f fVar = new f();
            bVar.k().put("isEnrolledAsync", Intrinsics.b(Boolean.class, cls) ? new wb.k("isEnrolledAsync", c0792aArr3, fVar) : Intrinsics.b(Boolean.class, Boolean.TYPE) ? new wb.h("isEnrolledAsync", c0792aArr3, fVar) : Intrinsics.b(Boolean.class, Double.TYPE) ? new wb.i("isEnrolledAsync", c0792aArr3, fVar) : Intrinsics.b(Boolean.class, Float.TYPE) ? new wb.j("isEnrolledAsync", c0792aArr3, fVar) : Intrinsics.b(Boolean.class, String.class) ? new wb.m("isEnrolledAsync", c0792aArr3, fVar) : new wb.e("isEnrolledAsync", c0792aArr3, fVar));
            C0792a[] c0792aArr4 = new C0792a[0];
            g gVar = new g();
            bVar.k().put("getEnrolledLevelAsync", Intrinsics.b(Integer.class, cls) ? new wb.k("getEnrolledLevelAsync", c0792aArr4, gVar) : Intrinsics.b(Integer.class, Boolean.TYPE) ? new wb.h("getEnrolledLevelAsync", c0792aArr4, gVar) : Intrinsics.b(Integer.class, Double.TYPE) ? new wb.i("getEnrolledLevelAsync", c0792aArr4, gVar) : Intrinsics.b(Integer.class, Float.TYPE) ? new wb.j("getEnrolledLevelAsync", c0792aArr4, gVar) : Intrinsics.b(Integer.class, String.class) ? new wb.m("getEnrolledLevelAsync", c0792aArr4, gVar) : new wb.e("getEnrolledLevelAsync", c0792aArr4, gVar));
            C0792a c0792a = (C0792a) C0794c.f1454a.a().get(new Pair(C5142C.b(AuthOptions.class), Boolean.FALSE));
            if (c0792a == null) {
                c0792a = new C0792a(new M(C5142C.b(AuthOptions.class), false, i.f6130a));
            }
            bVar.k().put("authenticateAsync", new wb.f("authenticateAsync", new C0792a[]{c0792a}, new j()));
            C0792a[] c0792aArr5 = new C0792a[0];
            h hVar = new h();
            wb.g kVar = Intrinsics.b(Unit.class, cls) ? new wb.k("cancelAuthenticate", c0792aArr5, hVar) : Intrinsics.b(Unit.class, Boolean.TYPE) ? new wb.h("cancelAuthenticate", c0792aArr5, hVar) : Intrinsics.b(Unit.class, Double.TYPE) ? new wb.i("cancelAuthenticate", c0792aArr5, hVar) : Intrinsics.b(Unit.class, Float.TYPE) ? new wb.j("cancelAuthenticate", c0792aArr5, hVar) : Intrinsics.b(Unit.class, String.class) ? new wb.m("cancelAuthenticate", c0792aArr5, hVar) : new wb.e("cancelAuthenticate", c0792aArr5, hVar);
            bVar.k().put("cancelAuthenticate", kVar);
            kVar.m(wb.l.MAIN);
            Map s10 = bVar.s();
            EnumC5010e enumC5010e = EnumC5010e.ON_ACTIVITY_RESULT;
            s10.put(enumC5010e, new C5009d(enumC5010e, new k()));
            xb.c q10 = bVar.q();
            AbstractC3901a.f();
            return q10;
        } catch (Throwable th) {
            AbstractC3901a.f();
            throw th;
        }
    }
}
