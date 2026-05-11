package R6;

import D7.AbstractC0789m;
import D7.C0787k;
import D7.InterfaceC0779c;
import D7.InterfaceC0786j;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import co.hyperverge.hypersnapsdk.utils.AppConstants;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import m7.AbstractC3656a;

/* renamed from: R6.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1145c {

    /* renamed from: h, reason: collision with root package name */
    private static int f8580h;

    /* renamed from: i, reason: collision with root package name */
    private static PendingIntent f8581i;

    /* renamed from: j, reason: collision with root package name */
    private static final Executor f8582j = new Executor() { // from class: R6.G
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            runnable.run();
        }
    };

    /* renamed from: k, reason: collision with root package name */
    private static final Pattern f8583k = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");

    /* renamed from: b, reason: collision with root package name */
    private final Context f8585b;

    /* renamed from: c, reason: collision with root package name */
    private final E f8586c;

    /* renamed from: d, reason: collision with root package name */
    private final ScheduledExecutorService f8587d;

    /* renamed from: f, reason: collision with root package name */
    private Messenger f8589f;

    /* renamed from: g, reason: collision with root package name */
    private l f8590g;

    /* renamed from: a, reason: collision with root package name */
    private final j0.i f8584a = new j0.i();

    /* renamed from: e, reason: collision with root package name */
    private final Messenger f8588e = new Messenger(new i(this, Looper.getMainLooper()));

    public C1145c(Context context) {
        this.f8585b = context;
        this.f8586c = new E(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f8587d = scheduledThreadPoolExecutor;
    }

    static /* synthetic */ Task e(Bundle bundle) {
        return m(bundle) ? AbstractC0789m.g(null) : AbstractC0789m.g(bundle);
    }

    static /* bridge */ /* synthetic */ void g(C1145c c1145c, Message message) {
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new k());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof l) {
                        c1145c.f8590g = (l) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        c1145c.f8589f = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if (!Objects.equals(action, "com.google.android.c2dm.intent.REGISTRATION")) {
                    if (Log.isLoggable("Rpc", 3)) {
                        Log.d("Rpc", "Unexpected response action: ".concat(String.valueOf(action)));
                        return;
                    }
                    return;
                }
                String stringExtra = intent2.getStringExtra("registration_id");
                if (stringExtra == null) {
                    stringExtra = intent2.getStringExtra("unregistered");
                }
                if (stringExtra != null) {
                    Matcher matcher = f8583k.matcher(stringExtra);
                    if (!matcher.matches()) {
                        if (Log.isLoggable("Rpc", 3)) {
                            Log.d("Rpc", "Unexpected response string: ".concat(stringExtra));
                            return;
                        }
                        return;
                    }
                    String group = matcher.group(1);
                    String group2 = matcher.group(2);
                    if (group != null) {
                        Bundle extras = intent2.getExtras();
                        extras.putString("registration_id", group2);
                        c1145c.l(group, extras);
                        return;
                    }
                    return;
                }
                String stringExtra2 = intent2.getStringExtra(AppConstants.VIDEO_RECORDING_ERROR);
                if (stringExtra2 == null) {
                    Log.w("Rpc", "Unexpected response, no error or registration id ".concat(String.valueOf(intent2.getExtras())));
                    return;
                }
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Received InstanceID error ".concat(stringExtra2));
                }
                if (!stringExtra2.startsWith("|")) {
                    synchronized (c1145c.f8584a) {
                        for (int i10 = 0; i10 < c1145c.f8584a.size(); i10++) {
                            try {
                                c1145c.l((String) c1145c.f8584a.f(i10), intent2.getExtras());
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return;
                }
                String[] split = stringExtra2.split("\\|");
                if (split.length <= 2 || !Objects.equals(split[1], "ID")) {
                    Log.w("Rpc", "Unexpected structured response ".concat(stringExtra2));
                    return;
                }
                String str = split[2];
                String str2 = split[3];
                if (str2.startsWith(":")) {
                    str2 = str2.substring(1);
                }
                c1145c.l(str, intent2.putExtra(AppConstants.VIDEO_RECORDING_ERROR, str2).getExtras());
                return;
            }
        }
        Log.w("Rpc", "Dropping invalid message");
    }

    private final Task i(Bundle bundle) {
        final String j10 = j();
        final C0787k c0787k = new C0787k();
        synchronized (this.f8584a) {
            this.f8584a.put(j10, c0787k);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.f8586c.b() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        k(this.f8585b, intent);
        intent.putExtra("kid", "|ID|" + j10 + "|");
        if (Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Sending ".concat(String.valueOf(intent.getExtras())));
        }
        intent.putExtra("google.messenger", this.f8588e);
        if (this.f8589f != null || this.f8590g != null) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.f8589f;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    this.f8590g.b(obtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
            }
            final ScheduledFuture<?> schedule = this.f8587d.schedule(new Runnable() { // from class: R6.g
                @Override // java.lang.Runnable
                public final void run() {
                    if (C0787k.this.d(new IOException("TIMEOUT"))) {
                        Log.w("Rpc", "No response");
                    }
                }
            }, 30L, TimeUnit.SECONDS);
            c0787k.a().c(f8582j, new OnCompleteListener() { // from class: R6.h
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    C1145c.this.h(j10, schedule, task);
                }
            });
            return c0787k.a();
        }
        if (this.f8586c.b() == 2) {
            this.f8585b.sendBroadcast(intent);
        } else {
            this.f8585b.startService(intent);
        }
        final ScheduledFuture schedule2 = this.f8587d.schedule(new Runnable() { // from class: R6.g
            @Override // java.lang.Runnable
            public final void run() {
                if (C0787k.this.d(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                }
            }
        }, 30L, TimeUnit.SECONDS);
        c0787k.a().c(f8582j, new OnCompleteListener() { // from class: R6.h
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                C1145c.this.h(j10, schedule2, task);
            }
        });
        return c0787k.a();
    }

    private static synchronized String j() {
        String num;
        synchronized (C1145c.class) {
            int i10 = f8580h;
            f8580h = i10 + 1;
            num = Integer.toString(i10);
        }
        return num;
    }

    private static synchronized void k(Context context, Intent intent) {
        synchronized (C1145c.class) {
            try {
                if (f8581i == null) {
                    Intent intent2 = new Intent();
                    intent2.setPackage("com.google.example.invalidpackage");
                    f8581i = PendingIntent.getBroadcast(context, 0, intent2, AbstractC3656a.f37398a);
                }
                intent.putExtra("app", f8581i);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void l(String str, Bundle bundle) {
        synchronized (this.f8584a) {
            try {
                C0787k c0787k = (C0787k) this.f8584a.remove(str);
                if (c0787k != null) {
                    c0787k.c(bundle);
                    return;
                }
                Log.w("Rpc", "Missing callback for " + str);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static boolean m(Bundle bundle) {
        return bundle != null && bundle.containsKey("google.messenger");
    }

    public Task a() {
        return this.f8586c.a() >= 241100000 ? D.b(this.f8585b).d(5, Bundle.EMPTY).i(f8582j, new InterfaceC0779c() { // from class: R6.f
            @Override // D7.InterfaceC0779c
            public final Object a(Task task) {
                Intent intent = (Intent) ((Bundle) task.getResult()).getParcelable("notification_data");
                if (intent != null) {
                    return new C1143a(intent);
                }
                return null;
            }
        }) : AbstractC0789m.f(new IOException("SERVICE_NOT_AVAILABLE"));
    }

    public Task b(C1143a c1143a) {
        if (this.f8586c.a() < 233700000) {
            return AbstractC0789m.f(new IOException("SERVICE_NOT_AVAILABLE"));
        }
        Bundle bundle = new Bundle();
        bundle.putString("google.message_id", c1143a.u());
        Integer F10 = c1143a.F();
        if (F10 != null) {
            bundle.putInt("google.product_id", F10.intValue());
        }
        return D.b(this.f8585b).c(3, bundle);
    }

    public Task c(final Bundle bundle) {
        return this.f8586c.a() < 12000000 ? this.f8586c.b() != 0 ? i(bundle).j(f8582j, new InterfaceC0779c() { // from class: R6.H
            @Override // D7.InterfaceC0779c
            public final Object a(Task task) {
                return C1145c.this.f(bundle, task);
            }
        }) : AbstractC0789m.f(new IOException("MISSING_INSTANCEID_SERVICE")) : D.b(this.f8585b).d(1, bundle).i(f8582j, new InterfaceC0779c() { // from class: R6.e
            @Override // D7.InterfaceC0779c
            public final Object a(Task task) {
                if (task.isSuccessful()) {
                    return (Bundle) task.getResult();
                }
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Error making request: ".concat(String.valueOf(task.getException())));
                }
                throw new IOException("SERVICE_NOT_AVAILABLE", task.getException());
            }
        });
    }

    public Task d(boolean z10) {
        if (this.f8586c.a() < 241100000) {
            return AbstractC0789m.f(new IOException("SERVICE_NOT_AVAILABLE"));
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("proxy_retention", z10);
        return D.b(this.f8585b).c(4, bundle);
    }

    final /* synthetic */ Task f(Bundle bundle, Task task) {
        return (task.isSuccessful() && m((Bundle) task.getResult())) ? i(bundle).o(f8582j, new InterfaceC0786j() { // from class: R6.F
            @Override // D7.InterfaceC0786j
            public final Task a(Object obj) {
                return C1145c.e((Bundle) obj);
            }
        }) : task;
    }

    final /* synthetic */ void h(String str, ScheduledFuture scheduledFuture, Task task) {
        synchronized (this.f8584a) {
            this.f8584a.remove(str);
        }
        scheduledFuture.cancel(false);
    }
}
