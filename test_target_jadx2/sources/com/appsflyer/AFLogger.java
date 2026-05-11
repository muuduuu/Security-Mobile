package com.appsflyer;

import com.appsflyer.internal.AFc1kSDK;
import com.appsflyer.internal.AFg1cSDK;
import com.appsflyer.internal.AFh1ySDK;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.AbstractC3574i;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import lc.i;
import org.conscrypt.BuildConfig;
import xc.m;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001:B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0007\u0010\u000bJ7\u0010\u0012\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0012\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\b\u0012\u0010\u0015J+\u0010\u0012\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0012\u0010\u0016J3\u0010\u0012\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0012\u0010\u0017J#\u0010\u0018\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\b\u0018\u0010\u0015J+\u0010\u0018\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0019\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0018\u0010\u0016J\u0017\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001b\u0010\bJ\u001f\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u001b\u0010\u000bJ\u0017\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001c\u0010\bJ\u0017\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001e\u0010\bJ\u0017\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001f\u0010\bJ\u0017\u0010!\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u0004H\u0007¢\u0006\u0004\b!\u0010\bJ\u001f\u0010!\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b!\u0010\u000bJ'\u0010%\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b%\u0010&JG\u0010)\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\r2\u0006\u0010(\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b)\u0010*J\u001f\u0010+\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0004H\u0016¢\u0006\u0004\b+\u0010,J'\u0010-\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b-\u0010&J!\u00100\u001a\u00020\u00062\u0012\u0010/\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010.\"\u00020\u0001¢\u0006\u0004\b0\u00101J!\u00102\u001a\u00020\u00062\u0012\u0010/\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010.\"\u00020\u0001¢\u0006\u0004\b2\u00101J'\u00103\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b3\u0010&J'\u00104\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b4\u0010&R\u0015\u00106\u001a\u0002058BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b6\u00107R\u001b\u00109\u001a\b\u0012\u0004\u0012\u00020\u0001088BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b9\u00107"}, d2 = {"Lcom/appsflyer/AFLogger;", "Lcom/appsflyer/internal/AFh1ySDK;", "<init>", "()V", BuildConfig.FLAVOR, "debugLogMessage", BuildConfig.FLAVOR, "afDebugLog", "(Ljava/lang/String;)V", BuildConfig.FLAVOR, "shouldRemoteDebug", "(Ljava/lang/String;Z)V", "message", BuildConfig.FLAVOR, "ex", "printMessage", "printThrowable", "shouldReportToExManager", "afErrorLog", "(Ljava/lang/String;Ljava/lang/Throwable;ZZZ)V", "errorLogMessage", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "(Ljava/lang/String;Ljava/lang/Throwable;Z)V", "(Ljava/lang/String;Ljava/lang/Throwable;ZZ)V", "afErrorLogForExcManagerOnly", "disableReporting", "logMessage", "afInfoLog", "afLogForce", "rdLogMessage", "afRDLog", "afVerboseLog", "warningLogMessage", "afWarnLog", "Lcom/appsflyer/internal/AFg1cSDK;", "tag", "msg", "d", "(Lcom/appsflyer/internal/AFg1cSDK;Ljava/lang/String;Z)V", "throwable", "printMsg", "e", "(Lcom/appsflyer/internal/AFg1cSDK;Ljava/lang/String;Ljava/lang/Throwable;ZZZZ)V", "force", "(Lcom/appsflyer/internal/AFg1cSDK;Ljava/lang/String;)V", "i", BuildConfig.FLAVOR, "client", "registerClient", "([Lcom/appsflyer/internal/AFh1ySDK;)V", "unregisterClient", "v", "w", "Ljava/util/concurrent/ExecutorService;", "getCurrencyIso4217Code", "Lkotlin/Lazy;", BuildConfig.FLAVOR, "getMediationNetwork", "LogLevel"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AFLogger extends AFh1ySDK {
    public static final AFLogger INSTANCE = new AFLogger();
    private static final Lazy getMediationNetwork = i.a(AnonymousClass7.getRevenue);
    private static final Lazy getCurrencyIso4217Code = i.a(AnonymousClass5.AFAdRevenueData);

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/appsflyer/internal/AFh1ySDK;", "p0", BuildConfig.FLAVOR, "AFAdRevenueData", "(Lcom/appsflyer/internal/AFh1ySDK;)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.appsflyer.AFLogger$1, reason: invalid class name */
    static final class AnonymousClass1 extends m implements Function1<AFh1ySDK, Unit> {
        private /* synthetic */ boolean $AFAdRevenueData;
        private /* synthetic */ String $getCurrencyIso4217Code;
        private /* synthetic */ AFg1cSDK $getMonetizationNetwork;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AFg1cSDK aFg1cSDK, String str, boolean z10) {
            super(1);
            this.$getMonetizationNetwork = aFg1cSDK;
            this.$getCurrencyIso4217Code = str;
            this.$AFAdRevenueData = z10;
        }

        public final void AFAdRevenueData(AFh1ySDK aFh1ySDK) {
            Intrinsics.checkNotNullParameter(aFh1ySDK, "");
            aFh1ySDK.i(this.$getMonetizationNetwork, this.$getCurrencyIso4217Code, this.$AFAdRevenueData);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            AFAdRevenueData((AFh1ySDK) obj);
            return Unit.f36324a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/appsflyer/internal/AFh1ySDK;", "p0", BuildConfig.FLAVOR, "getMediationNetwork", "(Lcom/appsflyer/internal/AFh1ySDK;)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.appsflyer.AFLogger$10, reason: invalid class name */
    static final class AnonymousClass10 extends m implements Function1<AFh1ySDK, Unit> {
        private /* synthetic */ String $getCurrencyIso4217Code;
        private /* synthetic */ AFg1cSDK $getMonetizationNetwork;
        private /* synthetic */ boolean $getRevenue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass10(AFg1cSDK aFg1cSDK, String str, boolean z10) {
            super(1);
            this.$getMonetizationNetwork = aFg1cSDK;
            this.$getCurrencyIso4217Code = str;
            this.$getRevenue = z10;
        }

        public final void getMediationNetwork(AFh1ySDK aFh1ySDK) {
            Intrinsics.checkNotNullParameter(aFh1ySDK, "");
            aFh1ySDK.v(this.$getMonetizationNetwork, this.$getCurrencyIso4217Code, this.$getRevenue);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            getMediationNetwork((AFh1ySDK) obj);
            return Unit.f36324a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/appsflyer/internal/AFh1ySDK;", "p0", BuildConfig.FLAVOR, "getCurrencyIso4217Code", "(Lcom/appsflyer/internal/AFh1ySDK;)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.appsflyer.AFLogger$2, reason: invalid class name */
    static final class AnonymousClass2 extends m implements Function1<AFh1ySDK, Unit> {
        private /* synthetic */ boolean $getCurrencyIso4217Code;
        private /* synthetic */ AFg1cSDK $getMonetizationNetwork;
        private /* synthetic */ String $getRevenue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(AFg1cSDK aFg1cSDK, String str, boolean z10) {
            super(1);
            this.$getMonetizationNetwork = aFg1cSDK;
            this.$getRevenue = str;
            this.$getCurrencyIso4217Code = z10;
        }

        public final void getCurrencyIso4217Code(AFh1ySDK aFh1ySDK) {
            Intrinsics.checkNotNullParameter(aFh1ySDK, "");
            aFh1ySDK.d(this.$getMonetizationNetwork, this.$getRevenue, this.$getCurrencyIso4217Code);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            getCurrencyIso4217Code((AFh1ySDK) obj);
            return Unit.f36324a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/appsflyer/internal/AFh1ySDK;", "p0", BuildConfig.FLAVOR, "getRevenue", "(Lcom/appsflyer/internal/AFh1ySDK;)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.appsflyer.AFLogger$3, reason: invalid class name */
    static final class AnonymousClass3 extends m implements Function1<AFh1ySDK, Unit> {
        private /* synthetic */ String $AFAdRevenueData;
        private /* synthetic */ boolean $areAllFieldsValid;
        private /* synthetic */ boolean $component1;
        private /* synthetic */ AFg1cSDK $getCurrencyIso4217Code;
        private /* synthetic */ boolean $getMediationNetwork;
        private /* synthetic */ Throwable $getMonetizationNetwork;
        private /* synthetic */ boolean $getRevenue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(AFg1cSDK aFg1cSDK, String str, Throwable th, boolean z10, boolean z11, boolean z12, boolean z13) {
            super(1);
            this.$getCurrencyIso4217Code = aFg1cSDK;
            this.$AFAdRevenueData = str;
            this.$getMonetizationNetwork = th;
            this.$getMediationNetwork = z10;
            this.$getRevenue = z11;
            this.$component1 = z12;
            this.$areAllFieldsValid = z13;
        }

        public final void getRevenue(AFh1ySDK aFh1ySDK) {
            Intrinsics.checkNotNullParameter(aFh1ySDK, "");
            aFh1ySDK.e(this.$getCurrencyIso4217Code, this.$AFAdRevenueData, this.$getMonetizationNetwork, this.$getMediationNetwork, this.$getRevenue, this.$component1, this.$areAllFieldsValid);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            getRevenue((AFh1ySDK) obj);
            return Unit.f36324a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/appsflyer/internal/AFh1ySDK;", "p0", BuildConfig.FLAVOR, "getMonetizationNetwork", "(Lcom/appsflyer/internal/AFh1ySDK;)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.appsflyer.AFLogger$4, reason: invalid class name */
    static final class AnonymousClass4 extends m implements Function1<AFh1ySDK, Unit> {
        private /* synthetic */ AFg1cSDK $getMonetizationNetwork;
        private /* synthetic */ String $getRevenue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(AFg1cSDK aFg1cSDK, String str) {
            super(1);
            this.$getMonetizationNetwork = aFg1cSDK;
            this.$getRevenue = str;
        }

        public final void getMonetizationNetwork(AFh1ySDK aFh1ySDK) {
            Intrinsics.checkNotNullParameter(aFh1ySDK, "");
            aFh1ySDK.force(this.$getMonetizationNetwork, this.$getRevenue);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            getMonetizationNetwork((AFh1ySDK) obj);
            return Unit.f36324a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljava/util/concurrent/ExecutorService;", "AFAdRevenueData", "()Ljava/util/concurrent/ExecutorService;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.appsflyer.AFLogger$5, reason: invalid class name */
    static final class AnonymousClass5 extends m implements Function0<ExecutorService> {
        public static final AnonymousClass5 AFAdRevenueData = new AnonymousClass5();

        AnonymousClass5() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: AFAdRevenueData, reason: merged with bridge method [inline-methods] */
        public final ExecutorService invoke() {
            return AFc1kSDK.getMediationNetwork();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {BuildConfig.FLAVOR, "Lcom/appsflyer/internal/AFh1ySDK;", "getMediationNetwork", "()Ljava/util/Set;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.appsflyer.AFLogger$7, reason: invalid class name */
    static final class AnonymousClass7 extends m implements Function0<Set<AFh1ySDK>> {
        public static final AnonymousClass7 getRevenue = new AnonymousClass7();

        AnonymousClass7() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: getMediationNetwork, reason: merged with bridge method [inline-methods] */
        public final Set<AFh1ySDK> invoke() {
            return new LinkedHashSet();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/appsflyer/internal/AFh1ySDK;", "p0", BuildConfig.FLAVOR, "AFAdRevenueData", "(Lcom/appsflyer/internal/AFh1ySDK;)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.appsflyer.AFLogger$9, reason: invalid class name */
    static final class AnonymousClass9 extends m implements Function1<AFh1ySDK, Unit> {
        private /* synthetic */ String $AFAdRevenueData;
        private /* synthetic */ AFg1cSDK $getMediationNetwork;
        private /* synthetic */ boolean $getMonetizationNetwork;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass9(AFg1cSDK aFg1cSDK, String str, boolean z10) {
            super(1);
            this.$getMediationNetwork = aFg1cSDK;
            this.$AFAdRevenueData = str;
            this.$getMonetizationNetwork = z10;
        }

        public final void AFAdRevenueData(AFh1ySDK aFh1ySDK) {
            Intrinsics.checkNotNullParameter(aFh1ySDK, "");
            aFh1ySDK.w(this.$getMediationNetwork, this.$AFAdRevenueData, this.$getMonetizationNetwork);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            AFAdRevenueData((AFh1ySDK) obj);
            return Unit.f36324a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f"}, d2 = {"Lcom/appsflyer/AFLogger$LogLevel;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "p0", "<init>", "(Ljava/lang/String;II)V", "level", "I", "getLevel", "()I", "NONE", "ERROR", "WARNING", "INFO", "DEBUG", "VERBOSE"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum LogLevel {
        NONE(0),
        ERROR(1),
        WARNING(2),
        INFO(3),
        DEBUG(4),
        VERBOSE(5);

        private final int level;

        LogLevel(int i10) {
            this.level = i10;
        }

        public final int getLevel() {
            return this.level;
        }
    }

    private AFLogger() {
    }

    public static final void afDebugLog(String debugLogMessage, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(debugLogMessage, "");
        INSTANCE.d(AFg1cSDK.OTHER, debugLogMessage, shouldRemoteDebug);
    }

    public static final void afErrorLog(String message, Throwable ex, boolean printMessage, boolean printThrowable, boolean shouldReportToExManager) {
        Intrinsics.checkNotNullParameter(message, "");
        Intrinsics.checkNotNullParameter(ex, "");
        AFh1ySDK.e$default(INSTANCE, AFg1cSDK.OTHER, message, ex, printMessage, printThrowable, shouldReportToExManager, false, 64, null);
    }

    public static final void afErrorLogForExcManagerOnly(String errorLogMessage, Throwable ex) {
        AFLogger aFLogger = INSTANCE;
        AFg1cSDK aFg1cSDK = AFg1cSDK.OTHER;
        if (errorLogMessage == null || StringsKt.Z(errorLogMessage)) {
            errorLogMessage = "null";
        }
        String str = errorLogMessage;
        if (ex == null) {
            ex = new NullPointerException("Invoked with null Throwable");
        }
        AFh1ySDK.e$default(aFLogger, aFg1cSDK, str, ex, false, false, true, false, 64, null);
    }

    public static final void afInfoLog(String logMessage, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(logMessage, "");
        INSTANCE.i(AFg1cSDK.OTHER, logMessage, shouldRemoteDebug);
    }

    public static final void afLogForce(String logMessage) {
        Intrinsics.checkNotNullParameter(logMessage, "");
        INSTANCE.force(AFg1cSDK.OTHER, logMessage);
    }

    public static final void afRDLog(String rdLogMessage) {
        Intrinsics.checkNotNullParameter(rdLogMessage, "");
        INSTANCE.v(AFg1cSDK.OTHER, rdLogMessage, true);
    }

    public static final void afVerboseLog(String rdLogMessage) {
        Intrinsics.checkNotNullParameter(rdLogMessage, "");
        INSTANCE.v(AFg1cSDK.OTHER, rdLogMessage, false);
    }

    public static final void afWarnLog(String warningLogMessage, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(warningLogMessage, "");
        INSTANCE.w(AFg1cSDK.OTHER, warningLogMessage, shouldRemoteDebug);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getCurrencyIso4217Code(AFh1ySDK[] aFh1ySDKArr) {
        Intrinsics.checkNotNullParameter(aFh1ySDKArr, "");
        CollectionsKt.A((Set) getMediationNetwork.getValue(), aFh1ySDKArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMediationNetwork(AFh1ySDK[] aFh1ySDKArr) {
        Intrinsics.checkNotNullParameter(aFh1ySDKArr, "");
        ((Set) getMediationNetwork.getValue()).removeAll(AbstractC3574i.y0(aFh1ySDKArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMonetizationNetwork(Function1 function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        Iterator it = ((Set) getMediationNetwork.getValue()).iterator();
        while (it.hasNext()) {
            function1.invoke((AFh1ySDK) it.next());
        }
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final void d(AFg1cSDK tag, String msg, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(tag, "");
        Intrinsics.checkNotNullParameter(msg, "");
        ((ExecutorService) getCurrencyIso4217Code.getValue()).execute(new a(new AnonymousClass2(tag, msg, shouldRemoteDebug)));
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final void e(AFg1cSDK tag, String msg, Throwable throwable, boolean printMsg, boolean printThrowable, boolean shouldReportToExManager, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(tag, "");
        Intrinsics.checkNotNullParameter(msg, "");
        Intrinsics.checkNotNullParameter(throwable, "");
        ((ExecutorService) getCurrencyIso4217Code.getValue()).execute(new a(new AnonymousClass3(tag, msg, throwable, printMsg, printThrowable, shouldReportToExManager, shouldRemoteDebug)));
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final void force(AFg1cSDK tag, String msg) {
        Intrinsics.checkNotNullParameter(tag, "");
        Intrinsics.checkNotNullParameter(msg, "");
        ((ExecutorService) getCurrencyIso4217Code.getValue()).execute(new a(new AnonymousClass4(tag, msg)));
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final void i(AFg1cSDK tag, String msg, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(tag, "");
        Intrinsics.checkNotNullParameter(msg, "");
        ((ExecutorService) getCurrencyIso4217Code.getValue()).execute(new a(new AnonymousClass1(tag, msg, shouldRemoteDebug)));
    }

    public final void registerClient(final AFh1ySDK... client) {
        Intrinsics.checkNotNullParameter(client, "");
        ((ExecutorService) getCurrencyIso4217Code.getValue()).execute(new Runnable() { // from class: com.appsflyer.c
            @Override // java.lang.Runnable
            public final void run() {
                AFLogger.getCurrencyIso4217Code(client);
            }
        });
    }

    public final void unregisterClient(final AFh1ySDK... client) {
        Intrinsics.checkNotNullParameter(client, "");
        ((ExecutorService) getCurrencyIso4217Code.getValue()).execute(new Runnable() { // from class: com.appsflyer.b
            @Override // java.lang.Runnable
            public final void run() {
                AFLogger.getMediationNetwork(client);
            }
        });
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final void v(AFg1cSDK tag, String msg, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(tag, "");
        Intrinsics.checkNotNullParameter(msg, "");
        ((ExecutorService) getCurrencyIso4217Code.getValue()).execute(new a(new AnonymousClass10(tag, msg, shouldRemoteDebug)));
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final void w(AFg1cSDK tag, String msg, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(tag, "");
        Intrinsics.checkNotNullParameter(msg, "");
        ((ExecutorService) getCurrencyIso4217Code.getValue()).execute(new a(new AnonymousClass9(tag, msg, shouldRemoteDebug)));
    }

    public static final void afDebugLog(String debugLogMessage) {
        Intrinsics.checkNotNullParameter(debugLogMessage, "");
        INSTANCE.d(AFg1cSDK.OTHER, debugLogMessage, true);
    }

    public static final void afInfoLog(String logMessage) {
        Intrinsics.checkNotNullParameter(logMessage, "");
        INSTANCE.i(AFg1cSDK.OTHER, logMessage, true);
    }

    public static final void afWarnLog(String warningLogMessage) {
        Intrinsics.checkNotNullParameter(warningLogMessage, "");
        AFh1ySDK.w$default(INSTANCE, AFg1cSDK.OTHER, warningLogMessage, false, 4, null);
    }

    public static final void afErrorLog(String errorLogMessage, Throwable ex) {
        AFLogger aFLogger = INSTANCE;
        AFg1cSDK aFg1cSDK = AFg1cSDK.OTHER;
        if (errorLogMessage == null || StringsKt.Z(errorLogMessage)) {
            errorLogMessage = "null";
        }
        String str = errorLogMessage;
        if (ex == null) {
            ex = new NullPointerException("Invoked with null Throwable");
        }
        AFh1ySDK.e$default(aFLogger, aFg1cSDK, str, ex, false, false, false, false, 120, null);
    }

    public static final void afErrorLogForExcManagerOnly(String errorLogMessage, Throwable ex, boolean disableReporting) {
        AFLogger aFLogger = INSTANCE;
        AFg1cSDK aFg1cSDK = AFg1cSDK.OTHER;
        if (errorLogMessage == null || StringsKt.Z(errorLogMessage)) {
            errorLogMessage = "null";
        }
        String str = errorLogMessage;
        if (ex == null) {
            ex = new NullPointerException("Invoked with null Throwable");
        }
        AFh1ySDK.e$default(aFLogger, aFg1cSDK, str, ex, false, false, !disableReporting, false, 64, null);
    }

    public static final void afErrorLog(String errorLogMessage, Throwable ex, boolean printThrowable) {
        AFLogger aFLogger = INSTANCE;
        AFg1cSDK aFg1cSDK = AFg1cSDK.OTHER;
        if (errorLogMessage == null || StringsKt.Z(errorLogMessage)) {
            errorLogMessage = "null";
        }
        String str = errorLogMessage;
        if (ex == null) {
            ex = new NullPointerException("Invoked with null Throwable");
        }
        AFh1ySDK.e$default(aFLogger, aFg1cSDK, str, ex, false, printThrowable, false, false, 104, null);
    }

    public static final void afErrorLog(String errorLogMessage, Throwable ex, boolean printThrowable, boolean shouldReportToExManager) {
        AFLogger aFLogger = INSTANCE;
        AFg1cSDK aFg1cSDK = AFg1cSDK.OTHER;
        if (errorLogMessage == null || StringsKt.Z(errorLogMessage)) {
            errorLogMessage = "null";
        }
        String str = errorLogMessage;
        if (ex == null) {
            ex = new NullPointerException("Invoked with null Throwable");
        }
        AFh1ySDK.e$default(aFLogger, aFg1cSDK, str, ex, false, printThrowable, shouldReportToExManager, false, 72, null);
    }
}
