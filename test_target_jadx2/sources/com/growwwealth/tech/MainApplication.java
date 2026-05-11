package com.growwwealth.tech;

import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Color;
import com.facebook.react.A;
import com.facebook.react.C1897l;
import com.facebook.react.InterfaceC1995x;
import com.facebook.react.O;
import com.facebook.react.P;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.soloader.OpenSourceMergedSoMapping;
import com.facebook.soloader.SoLoader;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import com.growwwealth.tech.MainApplication;
import com.nextbillion.gobblerrn.GobblerRnModule;
import com.webengage.WebengageBridge;
import com.webengage.sdk.android.PushChannelConfiguration;
import com.webengage.sdk.android.WebEngage;
import com.webengage.sdk.android.WebEngageActivityLifeCycleCallbacks;
import com.webengage.sdk.android.WebEngageConfig;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;
import pa.C3855a;
import pa.C3860f;
import r9.AbstractC4290b;
import u5.C4870a;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0004J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u000f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/growwwealth/tech/MainApplication;", "Landroid/app/Application;", "Lcom/facebook/react/x;", "<init>", "()V", BuildConfig.FLAVOR, "onCreate", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "Lcom/facebook/react/O;", C4870a.f43493a, "Lcom/facebook/react/O;", "()Lcom/facebook/react/O;", "reactNativeHost", "Lcom/facebook/react/A;", "b", "()Lcom/facebook/react/A;", "reactHost", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MainApplication extends Application implements InterfaceC1995x {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final O reactNativeHost = new C3860f(this, new a(this));

    public static final class a extends com.facebook.react.defaults.b {

        /* renamed from: c, reason: collision with root package name */
        private final boolean f28829c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f28830d;

        /* renamed from: com.growwwealth.tech.MainApplication$a$a, reason: collision with other inner class name */
        public static final class C0426a implements P {
            C0426a() {
            }

            @Override // com.facebook.react.P
            public List createNativeModules(ReactApplicationContext p02) {
                Intrinsics.checkNotNullParameter(p02, "p0");
                return CollectionsKt.e(new GobblerRnModule(p02));
            }

            @Override // com.facebook.react.P
            public List createViewManagers(ReactApplicationContext p02) {
                Intrinsics.checkNotNullParameter(p02, "p0");
                return CollectionsKt.j();
            }
        }

        public static final class b implements P {
            b() {
            }

            @Override // com.facebook.react.P
            public List createNativeModules(ReactApplicationContext p02) {
                Intrinsics.checkNotNullParameter(p02, "p0");
                return CollectionsKt.e(new EncryptedKeyModule(p02));
            }

            @Override // com.facebook.react.P
            public List createViewManagers(ReactApplicationContext p02) {
                Intrinsics.checkNotNullParameter(p02, "p0");
                return CollectionsKt.j();
            }
        }

        a(MainApplication mainApplication) {
            super(mainApplication);
            this.f28829c = true;
            this.f28830d = true;
        }

        @Override // com.facebook.react.O
        public boolean f() {
            return false;
        }

        @Override // com.facebook.react.O
        protected String getJSMainModuleName() {
            return ".expo/.virtual-metro-entry";
        }

        @Override // com.facebook.react.O
        protected List getPackages() {
            ArrayList a10 = new C1897l(this).a();
            a10.add(new C0426a());
            a10.add(new b());
            Intrinsics.d(a10);
            return a10;
        }

        @Override // com.facebook.react.defaults.b
        protected Boolean k() {
            return Boolean.valueOf(this.f28830d);
        }

        @Override // com.facebook.react.defaults.b
        protected boolean l() {
            return this.f28829c;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(Task task) {
        Intrinsics.checkNotNullParameter(task, "task");
        try {
            WebEngage.get().setRegistrationID((String) task.getResult());
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // com.facebook.react.InterfaceC1995x
    /* renamed from: a, reason: from getter */
    public O getReactNativeHost() {
        return this.reactNativeHost;
    }

    @Override // com.facebook.react.InterfaceC1995x
    public A b() {
        C3860f.a aVar = C3860f.f38526f;
        Context applicationContext = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        return aVar.a(applicationContext, getReactNativeHost());
    }

    @Override // android.app.Application, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        C3855a.c(this, newConfig);
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        WebengageBridge.getInstance();
        registerActivityLifecycleCallbacks(new WebEngageActivityLifeCycleCallbacks(this, new WebEngageConfig.Builder().setPushSmallIcon(AbstractC4290b.f40537a).setDebugMode(false).setPushAccentColor(Color.parseColor("#C7A865")).setDefaultPushChannelConfiguration(new PushChannelConfiguration.Builder().setNotificationChannelName("Promotions and Offers").build()).setWebEngageKey("in~82617194").build()));
        FirebaseMessaging.t().w().addOnCompleteListener(new OnCompleteListener() { // from class: r9.a
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                MainApplication.d(task);
            }
        });
        SoLoader.l(this, OpenSourceMergedSoMapping.f22138a);
        com.facebook.react.defaults.a.d(false, false, false, 7, null);
        C3855a.b(this);
    }
}
