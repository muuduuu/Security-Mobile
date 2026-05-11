package com.appsflyer.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Process;
import android.view.ViewConfiguration;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.PurchaseHandler;
import java.lang.reflect.Constructor;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function0;
import org.conscrypt.BuildConfig;

/* loaded from: classes.dex */
public final class AFc1bSDK implements AFd1zSDK {
    private static final int getMediationNetwork = (int) TimeUnit.SECONDS.toMillis(30);
    private ExecutorService AFAdRevenueData;
    private AFc1tSDK AFInAppEventParameterName;
    private AFf1eSDK AFInAppEventType;
    private AFd1wSDK AFKeystoreWrapper;
    private AFe1vSDK AFLogger;
    private AFg1zSDK AFLoggerLogLevel;
    private AFa1lSDK afDebugLog;
    private AFg1vSDK afErrorLog;
    private AFi1oSDK afInfoLog;
    private AFg1bSDK afLogForce;
    private AFi1hSDK afRDLog;
    private AFf1fSDK afVerboseLog;
    private AFe1sSDK afWarnLog;
    private PurchaseHandler areAllFieldsValid;
    private AFc1pSDK component1;
    private AFf1kSDK component2;
    private AFd1mSDK component3;
    private AFc1oSDK component4;
    private AFj1lSDK copy;
    private AFe1oSDK copydefault;

    /* renamed from: d, reason: collision with root package name */
    private AFj1cSDK f20122d;

    /* renamed from: e, reason: collision with root package name */
    private AFb1aSDK f20123e;
    private AFg1nSDK equals;
    private AFa1mSDK force;
    private AFh1pSDK getLevel;
    private ExecutorService getMonetizationNetwork;
    private ScheduledExecutorService getRevenue;
    private AFd1oSDK hashCode;

    /* renamed from: i, reason: collision with root package name */
    private AFi1kSDK f20124i;
    private AFj1sSDK registerClient;
    private AFh1xSDK toString;
    private AFg1uSDK unregisterClient;

    /* renamed from: v, reason: collision with root package name */
    private AFa1cSDK f20125v;
    private AFc1eSDK valueOf;

    /* renamed from: w, reason: collision with root package name */
    private AFi1pSDK f20126w;
    private String afErrorLogForExcManagerOnly = null;
    public final AFc1hSDK getCurrencyIso4217Code = new AFc1hSDK();

    static class AFa1zSDK implements ThreadFactory {
        private static final AtomicInteger getCurrencyIso4217Code = new AtomicInteger();
        private final AtomicInteger getRevenue = new AtomicInteger();

        public AFa1zSDK() {
            getCurrencyIso4217Code.incrementAndGet();
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            int i10 = getCurrencyIso4217Code.get();
            int incrementAndGet = this.getRevenue.incrementAndGet();
            StringBuilder sb2 = new StringBuilder("queue-");
            sb2.append(i10);
            sb2.append("-");
            sb2.append(incrementAndGet);
            return new Thread(runnable, sb2.toString());
        }
    }

    private String AFLoggerLogLevel() {
        if (this.afErrorLogForExcManagerOnly == null) {
            this.afErrorLogForExcManagerOnly = new AFa1uSDK().AFAdRevenueData();
        }
        return this.afErrorLogForExcManagerOnly;
    }

    private synchronized ExecutorService AFPurchaseDetails() {
        try {
            if (this.getMonetizationNetwork == null) {
                this.getMonetizationNetwork = AFc1kSDK.getMediationNetwork();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.getMonetizationNetwork;
    }

    private synchronized AFd1mSDK afRDLog() {
        try {
            if (this.component3 == null) {
                this.component3 = new AFd1mSDK(new AFd1gSDK(getMediationNetwork), getMonetizationNetwork());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.component3;
    }

    private synchronized ScheduledExecutorService getLevel() {
        try {
            if (this.getRevenue == null) {
                this.getRevenue = AFc1kSDK.getRevenue();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.getRevenue;
    }

    private synchronized AFj1cSDK getPurchaseToken() {
        try {
            if (this.f20122d == null) {
                this.f20122d = new AFj1cSDK(AFAdRevenueData());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f20122d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ SharedPreferences o_() {
        Context context = this.getCurrencyIso4217Code.getMonetizationNetwork;
        if (context != null) {
            return AFa1ySDK.d_(context);
        }
        throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
    }

    private synchronized AFg1zSDK valueOf() {
        try {
            if (this.AFLoggerLogLevel == null) {
                this.AFLoggerLogLevel = new AFg1zSDK(AFInAppEventParameterName(), AFAdRevenueData());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.AFLoggerLogLevel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.appsflyer.internal.AFd1zSDK
    /* renamed from: values, reason: merged with bridge method [inline-methods] */
    public synchronized AFd1wSDK afErrorLogForExcManagerOnly() {
        try {
            if (this.AFKeystoreWrapper == null) {
                this.AFKeystoreWrapper = new AFd1wSDK(this);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.AFKeystoreWrapper;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    public final synchronized AFc1oSDK AFAdRevenueData() {
        try {
            if (this.component4 == null) {
                AFc1hSDK AFInAppEventParameterName = AFInAppEventParameterName();
                AFc1qSDK component4 = component4();
                if (this.valueOf == null) {
                    this.valueOf = new AFc1eSDK();
                }
                this.component4 = new AFc1oSDK(AFInAppEventParameterName, component4, this.valueOf, getMonetizationNetwork());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.component4;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    public final synchronized AFc1hSDK AFInAppEventParameterName() {
        return this.getCurrencyIso4217Code;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    public final synchronized AFf1eSDK AFInAppEventType() {
        try {
            if (this.AFInAppEventType == null) {
                this.AFInAppEventType = new AFf1eSDK(AFInAppEventParameterName(), new AFf1dSDK());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.AFInAppEventType;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    public final synchronized AFe1vSDK AFKeystoreWrapper() {
        try {
            if (this.AFLogger == null) {
                this.AFLogger = new AFe1vSDK(AFAdRevenueData(), component4());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.AFLogger;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    public final synchronized AFj1sSDK AFLogger() {
        try {
            if (this.registerClient == null) {
                this.registerClient = new AFj1sSDK(this);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.registerClient;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    public final AFf1fSDK afDebugLog() {
        if (this.afVerboseLog == null) {
            Context context = this.getCurrencyIso4217Code.getMonetizationNetwork;
            if (context == null) {
                throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
            }
            AFg1ySDK aFg1ySDK = new AFg1ySDK(context, AppsFlyerProperties.getInstance());
            if (this.valueOf == null) {
                this.valueOf = new AFc1eSDK();
            }
            this.afVerboseLog = new AFf1gSDK(aFg1ySDK, this.valueOf, AppsFlyerProperties.getInstance());
        }
        return this.afVerboseLog;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    public final AFi1hSDK afErrorLog() {
        try {
            if (this.afRDLog == null) {
                try {
                    Object[] objArr = {AFAdRevenueData(), AFInAppEventParameterName(), AFInAppEventType()};
                    Map map = AFi1fSDK.f20139w;
                    Object obj = map.get(-362937351);
                    if (obj == null) {
                        obj = ((Class) AFi1fSDK.getMediationNetwork((char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 31028), ViewConfiguration.getMaximumDrawingCacheSize() >> 24, (Process.myPid() >> 22) + 37)).getDeclaredConstructor(AFc1oSDK.class, AFc1hSDK.class, AFf1eSDK.class);
                        map.put(-362937351, obj);
                    }
                    this.afRDLog = (AFi1hSDK) ((Constructor) obj).newInstance(objArr);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            AFLogger.INSTANCE.e(AFg1cSDK.PLAY_INTEGRITY_API, th2.getMessage() != null ? th2.getMessage() : BuildConfig.FLAVOR, th2, false, false);
        }
        return this.afRDLog;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    public final AFg1bSDK afInfoLog() {
        if (this.afLogForce == null) {
            this.afLogForce = new AFh1uSDK(this);
        }
        return this.afLogForce;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    public final AFb1hSDK afLogForce() {
        if (this.valueOf == null) {
            this.valueOf = new AFc1eSDK();
        }
        return new AFb1cSDK(this.valueOf, AFInAppEventParameterName(), AFInAppEventType());
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    public final AFa1lSDK afVerboseLog() {
        if (this.afDebugLog == null) {
            this.afDebugLog = new AFa1gSDK(component4());
        }
        return this.afDebugLog;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    public final AFh1pSDK afWarnLog() {
        if (AFh1sSDK.getMonetizationNetwork() && this.getLevel == null) {
            this.getLevel = new AFh1oSDK(AFAdRevenueData(), AFLogger());
        }
        return this.getLevel;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    public final synchronized AFh1xSDK areAllFieldsValid() {
        try {
            if (this.toString == null) {
                this.toString = new AFh1xSDK(component4(), AFAdRevenueData());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.toString;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    public final synchronized AFf1kSDK component1() {
        try {
            if (this.component2 == null) {
                AFf1hSDK aFf1hSDK = new AFf1hSDK(component4());
                this.component2 = new AFf1kSDK(new AFf1nSDK(), AFAdRevenueData(), AFInAppEventType(), aFf1hSDK, new AFd1nSDK(afRDLog(), AFAdRevenueData(), AppsFlyerProperties.getInstance(), AFKeystoreWrapper(), getPurchaseToken(), AFInAppEventType()), new AFf1jSDK(AFAdRevenueData(), aFf1hSDK), copydefault());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.component2;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    public final synchronized PurchaseHandler component2() {
        try {
            if (this.areAllFieldsValid == null) {
                this.areAllFieldsValid = new PurchaseHandler(this);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.areAllFieldsValid;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    public final AFg1nSDK component3() {
        if (this.equals == null) {
            String AFLoggerLogLevel = AFLoggerLogLevel();
            Context context = this.getCurrencyIso4217Code.getMonetizationNetwork;
            if (context == null) {
                throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
            }
            if (this.f20124i == null) {
                this.f20124i = new AFi1iSDK();
            }
            AFi1kSDK aFi1kSDK = this.f20124i;
            if (this.unregisterClient == null) {
                this.unregisterClient = new AFg1wSDK();
            }
            AFg1uSDK aFg1uSDK = this.unregisterClient;
            if (this.copy == null) {
                Context context2 = this.getCurrencyIso4217Code.getMonetizationNetwork;
                if (context2 == null) {
                    throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
                }
                this.copy = new AFj1pSDK(context2, AFPurchaseDetails());
            }
            AFj1lSDK aFj1lSDK = this.copy;
            if (this.afErrorLog == null) {
                this.afErrorLog = new AFg1qSDK();
            }
            AFg1vSDK aFg1vSDK = this.afErrorLog;
            AFh1xSDK areAllFieldsValid = areAllFieldsValid();
            AFc1qSDK component4 = component4();
            AFc1oSDK AFAdRevenueData = AFAdRevenueData();
            if (this.f20126w == null) {
                Context context3 = this.getCurrencyIso4217Code.getMonetizationNetwork;
                if (context3 == null) {
                    throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
                }
                this.f20126w = new AFi1pSDK(context3);
            }
            AFi1pSDK aFi1pSDK = this.f20126w;
            AFf1eSDK AFInAppEventType = AFInAppEventType();
            AFc1hSDK AFInAppEventParameterName = AFInAppEventParameterName();
            AFg1zSDK valueOf = valueOf();
            if (this.valueOf == null) {
                this.valueOf = new AFc1eSDK();
            }
            this.equals = new AFg1rSDK(AFLoggerLogLevel, context, aFi1kSDK, aFg1uSDK, aFj1lSDK, aFg1vSDK, areAllFieldsValid, component4, AFAdRevenueData, aFi1pSDK, AFInAppEventType, AFInAppEventParameterName, valueOf, this.valueOf);
        }
        return this.equals;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    public final AFc1qSDK component4() {
        if (this.component1 == null) {
            this.component1 = new AFc1pSDK(new AFc1gSDK(new Function0() { // from class: com.appsflyer.internal.n
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    SharedPreferences o_;
                    o_ = AFc1bSDK.this.o_();
                    return o_;
                }
            }));
        }
        return this.component1;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    public final synchronized AFd1oSDK copy() {
        try {
            if (this.hashCode == null) {
                this.hashCode = new AFd1lSDK(this);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.hashCode;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    public final synchronized AFe1oSDK copydefault() {
        try {
            if (this.copydefault == null) {
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 6, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>() { // from class: com.appsflyer.internal.AFc1bSDK.1
                    /* JADX INFO: Access modifiers changed from: private */
                    @Override // java.util.concurrent.LinkedBlockingQueue, java.util.Queue, java.util.concurrent.BlockingQueue
                    /* renamed from: getMediationNetwork, reason: merged with bridge method [inline-methods] */
                    public boolean offer(Runnable runnable) {
                        if (isEmpty()) {
                            return super.offer(runnable);
                        }
                        return false;
                    }
                }, new AFa1zSDK());
                threadPoolExecutor.setRejectedExecutionHandler(new RejectedExecutionHandler() { // from class: com.appsflyer.internal.m
                    @Override // java.util.concurrent.RejectedExecutionHandler
                    public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor2) {
                        AFc1bSDK.getCurrencyIso4217Code(runnable, threadPoolExecutor2);
                    }
                });
                this.copydefault = new AFe1oSDK(threadPoolExecutor);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.copydefault;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    public final AFi1pSDK d() {
        if (this.f20126w == null) {
            Context context = this.getCurrencyIso4217Code.getMonetizationNetwork;
            if (context == null) {
                throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
            }
            this.f20126w = new AFi1pSDK(context);
        }
        return this.f20126w;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    public final synchronized AFa1cSDK e() {
        try {
            if (this.f20125v == null) {
                this.f20125v = new AFb1zSDK(AFInAppEventParameterName());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f20125v;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    public final AFj1lSDK equals() {
        if (this.copy == null) {
            Context context = this.getCurrencyIso4217Code.getMonetizationNetwork;
            if (context == null) {
                throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
            }
            this.copy = new AFj1pSDK(context, AFPurchaseDetails());
        }
        return this.copy;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    public final AFc1eSDK force() {
        if (this.valueOf == null) {
            this.valueOf = new AFc1eSDK();
        }
        return this.valueOf;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    public final AFe1sSDK getCurrencyIso4217Code() {
        if (this.afWarnLog == null) {
            this.afWarnLog = new AFe1sSDK(component4(), AFInAppEventParameterName(), AFAdRevenueData(), getMonetizationNetwork(), component3(), AFInAppEventType(), copydefault());
        }
        return this.afWarnLog;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    public final synchronized ScheduledExecutorService getMediationNetwork() {
        try {
            if (this.getRevenue == null) {
                this.getRevenue = AFc1kSDK.getMonetizationNetwork();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.getRevenue;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    public final synchronized ExecutorService getMonetizationNetwork() {
        try {
            if (this.AFAdRevenueData == null) {
                this.AFAdRevenueData = AFc1kSDK.getCurrencyIso4217Code();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.AFAdRevenueData;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    public final AFd1nSDK getRevenue() {
        return new AFd1nSDK(afRDLog(), AFAdRevenueData(), AppsFlyerProperties.getInstance(), AFKeystoreWrapper(), getPurchaseToken(), AFInAppEventType());
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    public final synchronized AFa1mSDK i() {
        try {
            if (this.force == null) {
                this.force = new AFa1mSDK(this);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.force;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    public final synchronized AFc1tSDK registerClient() {
        try {
            if (this.AFInAppEventParameterName == null) {
                this.AFInAppEventParameterName = new AFc1vSDK(AFInAppEventParameterName(), component4());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.AFInAppEventParameterName;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    public final AFi1kSDK unregisterClient() {
        if (this.f20124i == null) {
            this.f20124i = new AFi1iSDK();
        }
        return this.f20124i;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    public final AFb1aSDK v() {
        if (this.f20123e == null) {
            ScheduledExecutorService level = getLevel();
            AFa1mSDK i10 = i();
            if (this.afInfoLog == null) {
                this.afInfoLog = new AFi1lSDK();
            }
            this.f20123e = new AFb1bSDK(level, i10, this.afInfoLog);
        }
        return this.f20123e;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    public final AFi1oSDK w() {
        if (this.afInfoLog == null) {
            this.afInfoLog = new AFi1lSDK();
        }
        return this.afInfoLog;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void getCurrencyIso4217Code(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        try {
            threadPoolExecutor.getQueue().put(runnable);
        } catch (InterruptedException e10) {
            AFLogger.afErrorLogForExcManagerOnly("could not create executor for queue", e10);
            Thread.currentThread().interrupt();
        }
    }
}
