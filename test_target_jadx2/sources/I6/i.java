package I6;

import D7.AbstractC0789m;
import V6.AbstractC1278i;
import V6.AbstractC1287s;
import android.accounts.Account;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.common.AbstractC2022n;
import com.google.android.gms.common.C2017i;
import com.google.android.gms.common.C2019k;
import com.google.android.gms.common.C2020l;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import com.google.android.gms.common.ServiceConnectionC2005a;
import com.google.android.gms.internal.auth.AbstractBinderC2063k0;
import com.google.android.gms.internal.auth.AbstractC2084r1;
import com.google.android.gms.internal.auth.C2050g;
import com.google.android.gms.internal.auth.EnumC2056i;
import com.google.android.gms.internal.auth.InterfaceC2040c1;
import com.google.android.gms.internal.auth.J1;
import com.google.android.gms.internal.auth.M;
import com.google.android.gms.internal.auth.M1;
import com.google.android.gms.tasks.Task;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeoutException;

/* loaded from: classes2.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f4331a = {"com.google", "com.google.work", "cn.google"};

    /* renamed from: b, reason: collision with root package name */
    public static final String f4332b = "androidPackageName";

    /* renamed from: c, reason: collision with root package name */
    private static final ComponentName f4333c = new ComponentName("com.google.android.gms", "com.google.android.gms.auth.GetToken");

    /* renamed from: d, reason: collision with root package name */
    private static final Y6.a f4334d = d.a("GoogleAuthUtil");

    public static void a(Context context, String str) {
        g(context, str, 0L);
    }

    public static String b(Context context, Account account, String str) {
        return c(context, account, str, new Bundle());
    }

    public static String c(Context context, Account account, String str, Bundle bundle) {
        p(account);
        return d(context, account, str, bundle, 0L, null).j();
    }

    public static TokenData d(final Context context, final Account account, final String str, Bundle bundle, long j10, Executor executor) {
        AbstractC1287s.l("Calling this from your main thread can lead to deadlock");
        AbstractC1287s.h(str, "Scope cannot be empty or null.");
        p(account);
        l(context, 8400000);
        final Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        n(context, bundle2);
        M.d(context);
        if (M1.c() && q(context)) {
            try {
                Bundle bundle3 = (Bundle) j(AbstractC2084r1.a(context).f(account, str, bundle2), "token retrieval");
                k(bundle3);
                return h(context, "getTokenWithDetails", bundle3);
            } catch (S6.b e10) {
                m(e10, "token retrieval");
            }
        }
        return (TokenData) i(context, f4333c, new h() { // from class: I6.f
            @Override // I6.h
            public final Object a(IBinder iBinder) {
                return i.e(account, str, bundle2, context, iBinder);
            }
        }, 0L, null);
    }

    static /* synthetic */ TokenData e(Account account, String str, Bundle bundle, Context context, IBinder iBinder) {
        Bundle s10 = AbstractBinderC2063k0.k1(iBinder).s(account, str, bundle);
        if (s10 != null) {
            return h(context, "getTokenWithDetails", s10);
        }
        throw new IOException("Service call returned null");
    }

    static /* bridge */ /* synthetic */ Object f(Object obj) {
        k(obj);
        return obj;
    }

    public static void g(Context context, String str, long j10) {
        AbstractC1287s.l("Calling this from your main thread can lead to deadlock");
        l(context, 8400000);
        Bundle bundle = new Bundle();
        n(context, bundle);
        M.d(context);
        if (M1.c() && q(context)) {
            InterfaceC2040c1 a10 = AbstractC2084r1.a(context);
            C2050g c2050g = new C2050g();
            c2050g.j(str);
            try {
                j(a10.q(c2050g), "clear token");
                return;
            } catch (S6.b e10) {
                m(e10, "clear token");
            }
        }
        i(context, f4333c, new g(str, bundle), 0L, null);
    }

    private static TokenData h(Context context, String str, Bundle bundle) {
        TokenData tokenData;
        Parcelable.Creator<TokenData> creator = TokenData.CREATOR;
        ClassLoader classLoader = TokenData.class.getClassLoader();
        if (classLoader != null) {
            bundle.setClassLoader(classLoader);
        }
        Bundle bundle2 = bundle.getBundle("tokenDetails");
        if (bundle2 == null) {
            tokenData = null;
        } else {
            if (classLoader != null) {
                bundle2.setClassLoader(classLoader);
            }
            tokenData = (TokenData) bundle2.getParcelable("TokenData");
        }
        if (tokenData != null) {
            return tokenData;
        }
        o(context, "getTokenWithDetails", bundle.getString("Error"), (Intent) bundle.getParcelable("userRecoveryIntent"), (PendingIntent) bundle.getParcelable("userRecoveryPendingIntent"));
        throw new a("Invalid state. Shouldn't happen");
    }

    private static Object i(Context context, ComponentName componentName, h hVar, long j10, Executor executor) {
        ServiceConnectionC2005a serviceConnectionC2005a = new ServiceConnectionC2005a();
        AbstractC1278i b10 = AbstractC1278i.b(context);
        try {
            try {
                if (!b10.a(componentName, serviceConnectionC2005a, "GoogleAuthUtil", null)) {
                    throw new IOException("Could not bind to service.");
                }
                try {
                    return hVar.a(serviceConnectionC2005a.a());
                } catch (RemoteException | InterruptedException | TimeoutException e10) {
                    Log.i("GoogleAuthUtil", "Error on service connection.", e10);
                    throw new IOException("Error on service connection.", e10);
                }
            } finally {
                b10.d(componentName, serviceConnectionC2005a, "GoogleAuthUtil");
            }
        } catch (SecurityException e11) {
            Log.w("GoogleAuthUtil", String.format("SecurityException while bind to auth service: %s", e11.getMessage()));
            throw new IOException("SecurityException while binding to Auth service.", e11);
        }
    }

    private static Object j(Task task, String str) {
        try {
            return AbstractC0789m.a(task);
        } catch (InterruptedException e10) {
            String format = String.format("Interrupted while waiting for the task of %s to finish.", str);
            f4334d.e(format, new Object[0]);
            throw new IOException(format, e10);
        } catch (CancellationException e11) {
            String format2 = String.format("Canceled while waiting for the task of %s to finish.", str);
            f4334d.e(format2, new Object[0]);
            throw new IOException(format2, e11);
        } catch (ExecutionException e12) {
            Throwable cause = e12.getCause();
            if (cause instanceof S6.b) {
                throw ((S6.b) cause);
            }
            String format3 = String.format("Unable to get a result for %s due to ExecutionException.", str);
            f4334d.e(format3, new Object[0]);
            throw new IOException(format3, e12);
        }
    }

    private static Object k(Object obj) {
        if (obj != null) {
            return obj;
        }
        f4334d.e("Service call returned null.", new Object[0]);
        throw new IOException("Service unavailable.");
    }

    private static void l(Context context, int i10) {
        try {
            AbstractC2022n.b(context.getApplicationContext(), i10);
        } catch (GooglePlayServicesIncorrectManifestValueException e10) {
            e = e10;
            throw new a(e.getMessage(), e);
        } catch (C2019k e11) {
            e = e11;
            throw new a(e.getMessage(), e);
        } catch (C2020l e12) {
            throw new c(e12.b(), e12.getMessage(), e12.a());
        }
    }

    private static void m(S6.b bVar, String str) {
        f4334d.e("%s failed via GoogleAuthServiceClient, falling back to previous approach:\n%s", str, Log.getStackTraceString(bVar));
    }

    private static void n(Context context, Bundle bundle) {
        String str = context.getApplicationInfo().packageName;
        bundle.putString("clientPackageName", str);
        String str2 = f4332b;
        if (TextUtils.isEmpty(bundle.getString(str2))) {
            bundle.putString(str2, str);
        }
        bundle.putLong("service_connection_start_time_millis", SystemClock.elapsedRealtime());
    }

    private static void o(Context context, String str, String str2, Intent intent, PendingIntent pendingIntent) {
        EnumC2056i zza = EnumC2056i.zza(str2);
        Y6.a aVar = f4334d;
        aVar.e(String.format("[GoogleAuthUtil] error status:%s with method:%s", zza, str), new Object[0]);
        if (!EnumC2056i.BAD_AUTHENTICATION.equals(zza) && !EnumC2056i.CAPTCHA.equals(zza) && !EnumC2056i.NEED_PERMISSION.equals(zza) && !EnumC2056i.NEED_REMOTE_CONSENT.equals(zza) && !EnumC2056i.NEEDS_BROWSER.equals(zza) && !EnumC2056i.USER_CANCEL.equals(zza) && !EnumC2056i.DEVICE_MANAGEMENT_REQUIRED.equals(zza) && !EnumC2056i.DM_INTERNAL_ERROR.equals(zza) && !EnumC2056i.DM_SYNC_DISABLED.equals(zza) && !EnumC2056i.DM_ADMIN_BLOCKED.equals(zza) && !EnumC2056i.DM_ADMIN_PENDING_APPROVAL.equals(zza) && !EnumC2056i.DM_STALE_SYNC_REQUIRED.equals(zza) && !EnumC2056i.DM_DEACTIVATED.equals(zza) && !EnumC2056i.DM_REQUIRED.equals(zza) && !EnumC2056i.THIRD_PARTY_DEVICE_MANAGEMENT_REQUIRED.equals(zza) && !EnumC2056i.DM_SCREENLOCK_REQUIRED.equals(zza)) {
            if (!EnumC2056i.NETWORK_ERROR.equals(zza) && !EnumC2056i.SERVICE_UNAVAILABLE.equals(zza) && !EnumC2056i.INTNERNAL_ERROR.equals(zza) && !EnumC2056i.AUTH_SECURITY_ERROR.equals(zza) && !EnumC2056i.ACCOUNT_NOT_PRESENT.equals(zza)) {
                throw new a(str2);
            }
            throw new IOException(str2);
        }
        M.d(context);
        if (!J1.b()) {
            throw new UserRecoverableAuthException(str2, intent);
        }
        if (pendingIntent != null && intent != null) {
            throw UserRecoverableAuthException.b(str2, intent, pendingIntent);
        }
        if (C2017i.q().b(context) >= Integer.MAX_VALUE && pendingIntent == null) {
            aVar.b(String.format("Recovery PendingIntent is missing on current Gms version: %s for method: %s. It should always be present on or above Gms version %s. This indicates a bug in Gms implementation.", Integer.MAX_VALUE, str, Integer.MAX_VALUE), new Object[0]);
        }
        if (intent == null) {
            aVar.b(String.format("no recovery Intent found with status=%s for method=%s. This shouldn't happen", str2, str), new Object[0]);
        }
        throw new UserRecoverableAuthException(str2, intent);
    }

    private static void p(Account account) {
        if (account == null) {
            throw new IllegalArgumentException("Account cannot be null");
        }
        if (TextUtils.isEmpty(account.name)) {
            throw new IllegalArgumentException("Account name cannot be empty!");
        }
        String[] strArr = f4331a;
        for (int i10 = 0; i10 < 3; i10++) {
            if (strArr[i10].equals(account.type)) {
                return;
            }
        }
        throw new IllegalArgumentException("Account type not supported");
    }

    private static boolean q(Context context) {
        if (C2017i.q().j(context, 17895000) != 0) {
            return false;
        }
        List s10 = M1.a().s();
        String str = context.getApplicationInfo().packageName;
        Iterator it = s10.iterator();
        while (it.hasNext()) {
            if (((String) it.next()).equals(str)) {
                return false;
            }
        }
        return true;
    }
}
