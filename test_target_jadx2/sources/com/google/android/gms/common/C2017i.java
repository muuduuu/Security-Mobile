package com.google.android.gms.common;

import D7.AbstractC0789m;
import T6.C1162a0;
import T6.InterfaceC1179j;
import V6.AbstractC1287s;
import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import android.widget.ProgressBar;
import androidx.core.app.s;
import androidx.fragment.app.AbstractActivityC1577t;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.tasks.Task;
import d7.AbstractC2995a;
import org.conscrypt.BuildConfig;

/* renamed from: com.google.android.gms.common.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2017i extends C2018j {

    /* renamed from: c, reason: collision with root package name */
    private String f23504c;

    /* renamed from: e, reason: collision with root package name */
    private static final Object f23502e = new Object();

    /* renamed from: f, reason: collision with root package name */
    private static final C2017i f23503f = new C2017i();

    /* renamed from: d, reason: collision with root package name */
    public static final int f23501d = C2018j.f23505a;

    public static C2017i q() {
        return f23503f;
    }

    public final boolean A(Activity activity, InterfaceC1179j interfaceC1179j, int i10, int i11, DialogInterface.OnCancelListener onCancelListener) {
        Dialog u10 = u(activity, i10, V6.I.c(interfaceC1179j, d(activity, i10, "d"), 2), onCancelListener, null);
        if (u10 == null) {
            return false;
        }
        x(activity, u10, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public final boolean B(Context context, C2010b c2010b, int i10) {
        PendingIntent p10;
        if (AbstractC2995a.a(context) || (p10 = p(context, c2010b)) == null) {
            return false;
        }
        y(context, c2010b.u(), null, PendingIntent.getActivity(context, 0, GoogleApiActivity.a(context, p10, i10, true), l7.g.f37103a | 134217728));
        return true;
    }

    @Override // com.google.android.gms.common.C2018j
    public Intent d(Context context, int i10, String str) {
        return super.d(context, i10, str);
    }

    @Override // com.google.android.gms.common.C2018j
    public PendingIntent e(Context context, int i10, int i11) {
        return super.e(context, i10, i11);
    }

    @Override // com.google.android.gms.common.C2018j
    public final String g(int i10) {
        return super.g(i10);
    }

    @Override // com.google.android.gms.common.C2018j
    public int i(Context context) {
        return super.i(context);
    }

    @Override // com.google.android.gms.common.C2018j
    public int j(Context context, int i10) {
        return super.j(context, i10);
    }

    @Override // com.google.android.gms.common.C2018j
    public final boolean m(int i10) {
        return super.m(i10);
    }

    public Dialog n(Activity activity, int i10, int i11) {
        return o(activity, i10, i11, null);
    }

    public Dialog o(Activity activity, int i10, int i11, DialogInterface.OnCancelListener onCancelListener) {
        return u(activity, i10, V6.I.b(activity, d(activity, i10, "d"), i11), onCancelListener, null);
    }

    public PendingIntent p(Context context, C2010b c2010b) {
        return c2010b.y0() ? c2010b.I() : e(context, c2010b.u(), 0);
    }

    public Task r(Activity activity) {
        int i10 = f23501d;
        AbstractC1287s.f("makeGooglePlayServicesAvailable must be called from the main thread");
        int j10 = j(activity, i10);
        if (j10 == 0) {
            return AbstractC0789m.g(null);
        }
        C1162a0 t10 = C1162a0.t(activity);
        t10.s(new C2010b(j10, null), 0);
        return t10.u();
    }

    public boolean s(Activity activity, int i10, int i11, DialogInterface.OnCancelListener onCancelListener) {
        Dialog o10 = o(activity, i10, i11, onCancelListener);
        if (o10 == null) {
            return false;
        }
        x(activity, o10, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public void t(Context context, int i10) {
        y(context, i10, null, f(context, i10, 0, "n"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    final Dialog u(Context context, int i10, V6.I i11, DialogInterface.OnCancelListener onCancelListener, DialogInterface.OnClickListener onClickListener) {
        if (i10 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(context, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(V6.F.c(context, i10));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String b10 = V6.F.b(context, i10);
        if (b10 != null) {
            if (i11 == null) {
                i11 = onClickListener;
            }
            builder.setPositiveButton(b10, i11);
        }
        String f10 = V6.F.f(context, i10);
        if (f10 != null) {
            builder.setTitle(f10);
        }
        Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", Integer.valueOf(i10)), new IllegalArgumentException());
        return builder.create();
    }

    public final Dialog v(Activity activity, DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, null, R.attr.progressBarStyleLarge);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(V6.F.c(activity, 18));
        builder.setPositiveButton(BuildConfig.FLAVOR, (DialogInterface.OnClickListener) null);
        AlertDialog create = builder.create();
        x(activity, create, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return create;
    }

    public final T6.V w(Context context, T6.U u10) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        T6.V v10 = new T6.V(u10);
        l7.f.p(context, v10, intentFilter);
        v10.a(context);
        if (l(context, "com.google.android.gms")) {
            return v10;
        }
        u10.a();
        v10.b();
        return null;
    }

    final void x(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof AbstractActivityC1577t) {
                C2028u.V(dialog, onCancelListener).U(((AbstractActivityC1577t) activity).getSupportFragmentManager(), str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        DialogFragmentC2011c.a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    final void y(Context context, int i10, String str, PendingIntent pendingIntent) {
        int i11;
        String str2;
        NotificationChannel notificationChannel;
        CharSequence name;
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", Integer.valueOf(i10), null), new IllegalArgumentException());
        if (i10 == 18) {
            z(context);
            return;
        }
        if (pendingIntent == null) {
            if (i10 == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String e10 = V6.F.e(context, i10);
        String d10 = V6.F.d(context, i10);
        Resources resources = context.getResources();
        NotificationManager notificationManager = (NotificationManager) AbstractC1287s.m(context.getSystemService("notification"));
        s.e w10 = new s.e(context).q(true).f(true).k(e10).w(new s.c().h(d10));
        if (com.google.android.gms.common.util.j.c(context)) {
            AbstractC1287s.p(com.google.android.gms.common.util.m.b());
            w10.u(context.getApplicationInfo().icon).s(2);
            if (com.google.android.gms.common.util.j.d(context)) {
                w10.a(P6.b.f7521a, resources.getString(P6.c.f7540o), pendingIntent);
            } else {
                w10.i(pendingIntent);
            }
        } else {
            w10.u(R.drawable.stat_sys_warning).y(resources.getString(P6.c.f7533h)).B(System.currentTimeMillis()).i(pendingIntent).j(d10);
        }
        if (com.google.android.gms.common.util.m.e()) {
            AbstractC1287s.p(com.google.android.gms.common.util.m.e());
            synchronized (f23502e) {
                str2 = this.f23504c;
            }
            if (str2 == null) {
                str2 = "com.google.android.gms.availability";
                notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                String string = context.getResources().getString(P6.c.f7532g);
                if (notificationChannel == null) {
                    notificationManager.createNotificationChannel(Q2.u.a("com.google.android.gms.availability", string, 4));
                } else {
                    name = notificationChannel.getName();
                    if (!string.contentEquals(name)) {
                        notificationChannel.setName(string);
                        notificationManager.createNotificationChannel(notificationChannel);
                    }
                }
            }
            w10.g(str2);
        }
        Notification c10 = w10.c();
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            AbstractC2022n.f23511b.set(false);
            i11 = 10436;
        } else {
            i11 = 39789;
        }
        notificationManager.notify(i11, c10);
    }

    final void z(Context context) {
        new HandlerC2030w(this, context).sendEmptyMessageDelayed(1, 120000L);
    }
}
