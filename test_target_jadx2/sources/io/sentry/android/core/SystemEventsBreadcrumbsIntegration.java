package io.sentry.android.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import io.sentry.C3405e;
import io.sentry.ILogger;
import io.sentry.Integration;
import io.sentry.K1;
import io.sentry.P1;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class SystemEventsBreadcrumbsIntegration implements Integration, Closeable {

    /* renamed from: a, reason: collision with root package name */
    private final Context f34765a;

    /* renamed from: b, reason: collision with root package name */
    a f34766b;

    /* renamed from: c, reason: collision with root package name */
    private SentryAndroidOptions f34767c;

    /* renamed from: d, reason: collision with root package name */
    private final List f34768d;

    static final class a extends BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        private final io.sentry.L f34769a;

        /* renamed from: b, reason: collision with root package name */
        private final ILogger f34770b;

        a(io.sentry.L l10, ILogger iLogger) {
            this.f34769a = l10;
            this.f34770b = iLogger;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            C3405e c3405e = new C3405e();
            c3405e.l("system");
            c3405e.h("device.event");
            String action = intent.getAction();
            String c10 = io.sentry.util.r.c(action);
            if (c10 != null) {
                c3405e.i("action", c10);
            }
            Bundle extras = intent.getExtras();
            HashMap hashMap = new HashMap();
            if (extras != null && !extras.isEmpty()) {
                for (String str : extras.keySet()) {
                    try {
                        Object obj = extras.get(str);
                        if (obj != null) {
                            hashMap.put(str, obj.toString());
                        }
                    } catch (Throwable th) {
                        this.f34770b.a(K1.ERROR, th, "%s key of the %s action threw an error.", str, action);
                    }
                }
                c3405e.i("extras", hashMap);
            }
            c3405e.j(K1.INFO);
            io.sentry.A a10 = new io.sentry.A();
            a10.k("android:intent", intent);
            this.f34769a.A(c3405e, a10);
        }
    }

    public SystemEventsBreadcrumbsIntegration(Context context) {
        this(context, b());
    }

    private static List b() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("android.appwidget.action.APPWIDGET_DELETED");
        arrayList.add("android.appwidget.action.APPWIDGET_DISABLED");
        arrayList.add("android.appwidget.action.APPWIDGET_ENABLED");
        arrayList.add("android.appwidget.action.APPWIDGET_HOST_RESTORED");
        arrayList.add("android.appwidget.action.APPWIDGET_RESTORED");
        arrayList.add("android.appwidget.action.APPWIDGET_UPDATE");
        arrayList.add("android.appwidget.action.APPWIDGET_UPDATE_OPTIONS");
        arrayList.add("android.intent.action.ACTION_POWER_CONNECTED");
        arrayList.add("android.intent.action.ACTION_POWER_DISCONNECTED");
        arrayList.add("android.intent.action.ACTION_SHUTDOWN");
        arrayList.add("android.intent.action.AIRPLANE_MODE");
        arrayList.add("android.intent.action.BATTERY_LOW");
        arrayList.add("android.intent.action.BATTERY_OKAY");
        arrayList.add("android.intent.action.BOOT_COMPLETED");
        arrayList.add("android.intent.action.CAMERA_BUTTON");
        arrayList.add("android.intent.action.CONFIGURATION_CHANGED");
        arrayList.add("android.intent.action.CONTENT_CHANGED");
        arrayList.add("android.intent.action.DATE_CHANGED");
        arrayList.add("android.intent.action.DEVICE_STORAGE_LOW");
        arrayList.add("android.intent.action.DEVICE_STORAGE_OK");
        arrayList.add("android.intent.action.DOCK_EVENT");
        arrayList.add("android.intent.action.DREAMING_STARTED");
        arrayList.add("android.intent.action.DREAMING_STOPPED");
        arrayList.add("android.intent.action.INPUT_METHOD_CHANGED");
        arrayList.add("android.intent.action.LOCALE_CHANGED");
        arrayList.add("android.intent.action.REBOOT");
        arrayList.add("android.intent.action.SCREEN_OFF");
        arrayList.add("android.intent.action.SCREEN_ON");
        arrayList.add("android.intent.action.TIMEZONE_CHANGED");
        arrayList.add("android.intent.action.TIME_SET");
        arrayList.add("android.os.action.DEVICE_IDLE_MODE_CHANGED");
        arrayList.add("android.os.action.POWER_SAVE_MODE_CHANGED");
        arrayList.add("android.intent.action.APP_ERROR");
        arrayList.add("android.intent.action.BUG_REPORT");
        arrayList.add("android.intent.action.MEDIA_BAD_REMOVAL");
        arrayList.add("android.intent.action.MEDIA_MOUNTED");
        arrayList.add("android.intent.action.MEDIA_UNMOUNTABLE");
        arrayList.add("android.intent.action.MEDIA_UNMOUNTED");
        return arrayList;
    }

    @Override // io.sentry.Integration
    public void c(io.sentry.L l10, P1 p12) {
        io.sentry.util.n.c(l10, "Hub is required");
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) io.sentry.util.n.c(p12 instanceof SentryAndroidOptions ? (SentryAndroidOptions) p12 : null, "SentryAndroidOptions is required");
        this.f34767c = sentryAndroidOptions;
        sentryAndroidOptions.getLogger().c(K1.DEBUG, "SystemEventsBreadcrumbsIntegration enabled: %s", Boolean.valueOf(this.f34767c.isEnableSystemEventBreadcrumbs()));
        if (this.f34767c.isEnableSystemEventBreadcrumbs()) {
            this.f34766b = new a(l10, this.f34767c.getLogger());
            IntentFilter intentFilter = new IntentFilter();
            Iterator it = this.f34768d.iterator();
            while (it.hasNext()) {
                intentFilter.addAction((String) it.next());
            }
            try {
                this.f34765a.registerReceiver(this.f34766b, intentFilter);
                this.f34767c.getLogger().c(K1.DEBUG, "SystemEventsBreadcrumbsIntegration installed.", new Object[0]);
                a();
            } catch (Throwable th) {
                this.f34767c.setEnableSystemEventBreadcrumbs(false);
                this.f34767c.getLogger().b(K1.ERROR, "Failed to initialize SystemEventsBreadcrumbsIntegration.", th);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a aVar = this.f34766b;
        if (aVar != null) {
            this.f34765a.unregisterReceiver(aVar);
            this.f34766b = null;
            SentryAndroidOptions sentryAndroidOptions = this.f34767c;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().c(K1.DEBUG, "SystemEventsBreadcrumbsIntegration remove.", new Object[0]);
            }
        }
    }

    public SystemEventsBreadcrumbsIntegration(Context context, List list) {
        this.f34765a = (Context) io.sentry.util.n.c(context, "Context is required");
        this.f34768d = (List) io.sentry.util.n.c(list, "Actions list is required");
    }
}
