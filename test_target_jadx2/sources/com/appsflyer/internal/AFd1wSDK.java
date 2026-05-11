package com.appsflyer.internal;

import android.graphics.PointF;
import android.os.Build;
import co.hyperverge.hypersnapsdk.service.framerecorder.HVFrameRecorder;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFd1xSDK;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.MatchGroup;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class AFd1wSDK implements AFd1xSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int AFKeystoreWrapper = 1;
    private static char copy = 10357;
    private static int copydefault = 0;
    private static char equals = 787;
    private static char hashCode = 7956;
    private static char toString = 48673;
    private AFd1zSDK AFAdRevenueData;
    private final Lazy areAllFieldsValid;
    private AFd1xSDK.AFa1vSDK component1;
    private final Lazy component2;
    private final Lazy component3;
    private final String component4;
    private final Lazy getCurrencyIso4217Code;
    private final Lazy getMediationNetwork;
    private final Lazy getMonetizationNetwork;
    private final Lazy getRevenue;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/appsflyer/internal/AFd1ySDK;", "AFAdRevenueData", "()Lcom/appsflyer/internal/AFd1ySDK;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFd1wSDK$1, reason: invalid class name */
    static final class AnonymousClass1 extends xc.m implements Function0<AFd1ySDK> {
        AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: AFAdRevenueData, reason: merged with bridge method [inline-methods] */
        public final AFd1ySDK invoke() {
            AFc1hSDK AFInAppEventParameterName = AFd1wSDK.getCurrencyIso4217Code(AFd1wSDK.this).AFInAppEventParameterName();
            Intrinsics.checkNotNullExpressionValue(AFInAppEventParameterName, "");
            return new AFd1ySDK(AFInAppEventParameterName);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/appsflyer/internal/AFc1qSDK;", "getCurrencyIso4217Code", "()Lcom/appsflyer/internal/AFc1qSDK;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFd1wSDK$2, reason: invalid class name */
    static final class AnonymousClass2 extends xc.m implements Function0<AFc1qSDK> {
        AnonymousClass2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: getCurrencyIso4217Code, reason: merged with bridge method [inline-methods] */
        public final AFc1qSDK invoke() {
            AFc1qSDK component4 = AFd1wSDK.getCurrencyIso4217Code(AFd1wSDK.this).component4();
            Intrinsics.checkNotNullExpressionValue(component4, "");
            return component4;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/appsflyer/internal/AFc1oSDK;", "getCurrencyIso4217Code", "()Lcom/appsflyer/internal/AFc1oSDK;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFd1wSDK$3, reason: invalid class name */
    static final class AnonymousClass3 extends xc.m implements Function0<AFc1oSDK> {
        AnonymousClass3() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: getCurrencyIso4217Code, reason: merged with bridge method [inline-methods] */
        public final AFc1oSDK invoke() {
            AFc1oSDK AFAdRevenueData = AFd1wSDK.getCurrencyIso4217Code(AFd1wSDK.this).AFAdRevenueData();
            Intrinsics.checkNotNullExpressionValue(AFAdRevenueData, "");
            return AFAdRevenueData;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/appsflyer/internal/AFf1kSDK;", "getRevenue", "()Lcom/appsflyer/internal/AFf1kSDK;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFd1wSDK$4, reason: invalid class name */
    static final class AnonymousClass4 extends xc.m implements Function0<AFf1kSDK> {
        AnonymousClass4() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: getRevenue, reason: merged with bridge method [inline-methods] */
        public final AFf1kSDK invoke() {
            AFf1kSDK component1 = AFd1wSDK.getCurrencyIso4217Code(AFd1wSDK.this).component1();
            Intrinsics.checkNotNullExpressionValue(component1, "");
            return component1;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljava/util/concurrent/ExecutorService;", "getMediationNetwork", "()Ljava/util/concurrent/ExecutorService;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFd1wSDK$5, reason: invalid class name */
    static final class AnonymousClass5 extends xc.m implements Function0<ExecutorService> {
        AnonymousClass5() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: getMediationNetwork, reason: merged with bridge method [inline-methods] */
        public final ExecutorService invoke() {
            ExecutorService monetizationNetwork = AFd1wSDK.getCurrencyIso4217Code(AFd1wSDK.this).getMonetizationNetwork();
            Intrinsics.checkNotNullExpressionValue(monetizationNetwork, "");
            return monetizationNetwork;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/appsflyer/internal/AFf1eSDK;", "getRevenue", "()Lcom/appsflyer/internal/AFf1eSDK;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFd1wSDK$6, reason: invalid class name */
    static final class AnonymousClass6 extends xc.m implements Function0<AFf1eSDK> {
        AnonymousClass6() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: getRevenue, reason: merged with bridge method [inline-methods] */
        public final AFf1eSDK invoke() {
            AFf1eSDK AFInAppEventType = AFd1wSDK.getCurrencyIso4217Code(AFd1wSDK.this).AFInAppEventType();
            Intrinsics.checkNotNullExpressionValue(AFInAppEventType, "");
            return AFInAppEventType;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/appsflyer/internal/AFd1vSDK;", "getMediationNetwork", "()Lcom/appsflyer/internal/AFd1vSDK;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFd1wSDK$7, reason: invalid class name */
    static final class AnonymousClass7 extends xc.m implements Function0<AFd1vSDK> {
        AnonymousClass7() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: getMediationNetwork, reason: merged with bridge method [inline-methods] */
        public final AFd1vSDK invoke() {
            return new AFd1vSDK(AFd1wSDK.this.getRevenue());
        }
    }

    public AFd1wSDK(AFd1zSDK aFd1zSDK) {
        Intrinsics.checkNotNullParameter(aFd1zSDK, "");
        this.AFAdRevenueData = aFd1zSDK;
        this.getRevenue = lc.i.a(new AnonymousClass4());
        this.getMediationNetwork = lc.i.a(new AnonymousClass3());
        this.getMonetizationNetwork = lc.i.a(new AnonymousClass2());
        this.getCurrencyIso4217Code = lc.i.a(new AnonymousClass6());
        this.component2 = lc.i.a(new AnonymousClass5());
        this.component4 = "6.17.5";
        this.component3 = lc.i.a(new AnonymousClass1());
        this.areAllFieldsValid = lc.i.a(new AnonymousClass7());
    }

    private static /* synthetic */ Object AFAdRevenueData(Object[] objArr) {
        AFi1zSDK aFi1zSDK;
        AFd1wSDK aFd1wSDK = (AFd1wSDK) objArr[0];
        AFKeystoreWrapper = (copydefault + 77) % 128;
        AFi1vSDK aFi1vSDK = aFd1wSDK.getCurrencyIso4217Code().AFAdRevenueData.getCurrencyIso4217Code;
        if (aFi1vSDK == null || (aFi1zSDK = aFi1vSDK.getMonetizationNetwork) == null) {
            return null;
        }
        int i10 = AFKeystoreWrapper + 109;
        copydefault = i10 % 128;
        if (i10 % 2 == 0) {
            return aFi1zSDK.getCurrencyIso4217Code;
        }
        AFh1aSDK aFh1aSDK = aFi1zSDK.getCurrencyIso4217Code;
        throw null;
    }

    private final ExecutorService areAllFieldsValid() {
        copydefault = (AFKeystoreWrapper + 53) % 128;
        ExecutorService executorService = (ExecutorService) this.component2.getValue();
        AFKeystoreWrapper = (copydefault + 119) % 128;
        return executorService;
    }

    private final AFf1eSDK component1() {
        AFKeystoreWrapper = (copydefault + 109) % 128;
        AFf1eSDK aFf1eSDK = (AFf1eSDK) this.getCurrencyIso4217Code.getValue();
        copydefault = (AFKeystoreWrapper + 117) % 128;
        return aFf1eSDK;
    }

    private final AFc1qSDK component2() {
        return (AFc1qSDK) getMediationNetwork(new Object[]{this}, 1891172040, -1891172038, System.identityHashCode(this));
    }

    private AFd1uSDK component3() {
        copydefault = (AFKeystoreWrapper + 75) % 128;
        AFd1uSDK aFd1uSDK = (AFd1uSDK) this.areAllFieldsValid.getValue();
        int i10 = copydefault + 77;
        AFKeystoreWrapper = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 15 / 0;
        }
        return aFd1uSDK;
    }

    private final AFh1aSDK component4() {
        return (AFh1aSDK) getMediationNetwork(new Object[]{this}, -2108652204, 2108652208, System.identityHashCode(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003b, code lost:
    
        if (getMediationNetwork(r0) == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
    
        com.appsflyer.internal.AFd1wSDK.copydefault = (com.appsflyer.internal.AFd1wSDK.AFKeystoreWrapper + 121) % 128;
        r1 = component1().getMediationNetwork();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
    
        if (r1 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004f, code lost:
    
        r0 = new org.json.JSONObject(getMonetizationNetwork(getRevenue(r0), getRevenue().getRevenue())).toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, "");
        getMediationNetwork(new java.lang.Object[]{r10, r0, r1}, -1856843688, 1856843689, java.lang.System.identityHashCode(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0081, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0082, code lost:
    
        com.appsflyer.internal.AFh1ySDK.v$default(com.appsflyer.AFLogger.INSTANCE, com.appsflyer.internal.AFg1cSDK.EXCEPTION_MANAGER, "skipping", false, 4, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x008e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0035, code lost:
    
        if (r0 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0024, code lost:
    
        if (r0 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x008f, code lost:
    
        r0 = com.appsflyer.internal.AFd1wSDK.AFKeystoreWrapper + 3;
        com.appsflyer.internal.AFd1wSDK.copydefault = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0099, code lost:
    
        if ((r0 % 2) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x009b, code lost:
    
        r0 = 18 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x009f, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void copy() {
        AFh1aSDK aFh1aSDK;
        int i10 = copydefault + 15;
        AFKeystoreWrapper = i10 % 128;
        if (i10 % 2 == 0) {
            aFh1aSDK = (AFh1aSDK) getMediationNetwork(new Object[]{this}, -2108652204, 2108652208, System.identityHashCode(this));
            int i11 = 33 / 0;
        } else {
            aFh1aSDK = (AFh1aSDK) getMediationNetwork(new Object[]{this}, -2108652204, 2108652208, System.identityHashCode(this));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x013f, code lost:
    
        if (r6 != null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0148, code lost:
    
        r6 = com.appsflyer.internal.AFd1rSDK.getMonetizationNetwork(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x017f, code lost:
    
        if (r0.intValue() == (-1)) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0146, code lost:
    
        if (r6 != null) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:63:0x016d A[Catch: all -> 0x0022, TryCatch #1 {all -> 0x0022, blocks: (B:3:0x0001, B:5:0x001f, B:6:0x0027, B:8:0x003b, B:12:0x0063, B:14:0x0074, B:16:0x007b, B:18:0x008e, B:20:0x0092, B:22:0x00a4, B:24:0x00ae, B:26:0x00b4, B:28:0x00c2, B:29:0x00c8, B:31:0x00d6, B:33:0x00dc, B:35:0x00e2, B:37:0x00ed, B:38:0x00f6, B:40:0x0104, B:42:0x010a, B:44:0x0110, B:45:0x0116, B:46:0x0119, B:47:0x011f, B:49:0x012f, B:51:0x013a, B:56:0x0148, B:57:0x014e, B:59:0x015e, B:61:0x0162, B:63:0x016d, B:64:0x0172, B:69:0x0177, B:73:0x0183, B:74:0x020a, B:76:0x020e, B:78:0x021e, B:79:0x0222, B:85:0x019b, B:87:0x01b9, B:88:0x01d5, B:89:0x017b, B:93:0x0143, B:94:0x0144, B:102:0x00f4, B:107:0x01f0, B:54:0x013e, B:99:0x00f2, B:66:0x0175), top: B:2:0x0001, inners: #0, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0172 A[Catch: all -> 0x0022, TRY_LEAVE, TryCatch #1 {all -> 0x0022, blocks: (B:3:0x0001, B:5:0x001f, B:6:0x0027, B:8:0x003b, B:12:0x0063, B:14:0x0074, B:16:0x007b, B:18:0x008e, B:20:0x0092, B:22:0x00a4, B:24:0x00ae, B:26:0x00b4, B:28:0x00c2, B:29:0x00c8, B:31:0x00d6, B:33:0x00dc, B:35:0x00e2, B:37:0x00ed, B:38:0x00f6, B:40:0x0104, B:42:0x010a, B:44:0x0110, B:45:0x0116, B:46:0x0119, B:47:0x011f, B:49:0x012f, B:51:0x013a, B:56:0x0148, B:57:0x014e, B:59:0x015e, B:61:0x0162, B:63:0x016d, B:64:0x0172, B:69:0x0177, B:73:0x0183, B:74:0x020a, B:76:0x020e, B:78:0x021e, B:79:0x0222, B:85:0x019b, B:87:0x01b9, B:88:0x01d5, B:89:0x017b, B:93:0x0143, B:94:0x0144, B:102:0x00f4, B:107:0x01f0, B:54:0x013e, B:99:0x00f2, B:66:0x0175), top: B:2:0x0001, inners: #0, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0183 A[Catch: all -> 0x0022, TryCatch #1 {all -> 0x0022, blocks: (B:3:0x0001, B:5:0x001f, B:6:0x0027, B:8:0x003b, B:12:0x0063, B:14:0x0074, B:16:0x007b, B:18:0x008e, B:20:0x0092, B:22:0x00a4, B:24:0x00ae, B:26:0x00b4, B:28:0x00c2, B:29:0x00c8, B:31:0x00d6, B:33:0x00dc, B:35:0x00e2, B:37:0x00ed, B:38:0x00f6, B:40:0x0104, B:42:0x010a, B:44:0x0110, B:45:0x0116, B:46:0x0119, B:47:0x011f, B:49:0x012f, B:51:0x013a, B:56:0x0148, B:57:0x014e, B:59:0x015e, B:61:0x0162, B:63:0x016d, B:64:0x0172, B:69:0x0177, B:73:0x0183, B:74:0x020a, B:76:0x020e, B:78:0x021e, B:79:0x0222, B:85:0x019b, B:87:0x01b9, B:88:0x01d5, B:89:0x017b, B:93:0x0143, B:94:0x0144, B:102:0x00f4, B:107:0x01f0, B:54:0x013e, B:99:0x00f2, B:66:0x0175), top: B:2:0x0001, inners: #0, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x019b A[Catch: all -> 0x0022, TryCatch #1 {all -> 0x0022, blocks: (B:3:0x0001, B:5:0x001f, B:6:0x0027, B:8:0x003b, B:12:0x0063, B:14:0x0074, B:16:0x007b, B:18:0x008e, B:20:0x0092, B:22:0x00a4, B:24:0x00ae, B:26:0x00b4, B:28:0x00c2, B:29:0x00c8, B:31:0x00d6, B:33:0x00dc, B:35:0x00e2, B:37:0x00ed, B:38:0x00f6, B:40:0x0104, B:42:0x010a, B:44:0x0110, B:45:0x0116, B:46:0x0119, B:47:0x011f, B:49:0x012f, B:51:0x013a, B:56:0x0148, B:57:0x014e, B:59:0x015e, B:61:0x0162, B:63:0x016d, B:64:0x0172, B:69:0x0177, B:73:0x0183, B:74:0x020a, B:76:0x020e, B:78:0x021e, B:79:0x0222, B:85:0x019b, B:87:0x01b9, B:88:0x01d5, B:89:0x017b, B:93:0x0143, B:94:0x0144, B:102:0x00f4, B:107:0x01f0, B:54:0x013e, B:99:0x00f2, B:66:0x0175), top: B:2:0x0001, inners: #0, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x017b A[Catch: all -> 0x0022, TryCatch #1 {all -> 0x0022, blocks: (B:3:0x0001, B:5:0x001f, B:6:0x0027, B:8:0x003b, B:12:0x0063, B:14:0x0074, B:16:0x007b, B:18:0x008e, B:20:0x0092, B:22:0x00a4, B:24:0x00ae, B:26:0x00b4, B:28:0x00c2, B:29:0x00c8, B:31:0x00d6, B:33:0x00dc, B:35:0x00e2, B:37:0x00ed, B:38:0x00f6, B:40:0x0104, B:42:0x010a, B:44:0x0110, B:45:0x0116, B:46:0x0119, B:47:0x011f, B:49:0x012f, B:51:0x013a, B:56:0x0148, B:57:0x014e, B:59:0x015e, B:61:0x0162, B:63:0x016d, B:64:0x0172, B:69:0x0177, B:73:0x0183, B:74:0x020a, B:76:0x020e, B:78:0x021e, B:79:0x0222, B:85:0x019b, B:87:0x01b9, B:88:0x01d5, B:89:0x017b, B:93:0x0143, B:94:0x0144, B:102:0x00f4, B:107:0x01f0, B:54:0x013e, B:99:0x00f2, B:66:0x0175), top: B:2:0x0001, inners: #0, #2, #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final synchronized void copydefault() {
        Integer num;
        Pair<Integer, Integer> pair;
        AFh1aSDK aFh1aSDK;
        String str;
        int i10;
        String str2;
        String str3;
        int i11;
        int i12;
        MatchGroup matchGroup;
        int i13;
        String value;
        Integer intOrNull;
        String value2;
        Integer intOrNull2;
        String value3;
        try {
            copydefault = (AFKeystoreWrapper + 13) % 128;
            AFh1aSDK aFh1aSDK2 = (AFh1aSDK) getMediationNetwork(new Object[]{this}, -2108652204, 2108652208, System.identityHashCode(this));
            if ((aFh1aSDK2 != null ? aFh1aSDK2.getMonetizationNetwork : -1L) < TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis())) {
                AFh1ySDK.v$default(AFLogger.INSTANCE, AFg1cSDK.EXCEPTION_MANAGER, "TTL is already passed", false, 4, null);
                ((AFc1qSDK) getMediationNetwork(new Object[]{this}, 1891172040, -1891172038, System.identityHashCode(this))).AFAdRevenueData("af_send_exc_to_server_window");
                getRevenue().getCurrencyIso4217Code();
                return;
            }
            AFh1aSDK aFh1aSDK3 = (AFh1aSDK) getMediationNetwork(new Object[]{this}, -2108652204, 2108652208, System.identityHashCode(this));
            if (aFh1aSDK3 == null || !getMonetizationNetwork(aFh1aSDK3)) {
                ((AFc1qSDK) getMediationNetwork(new Object[]{this}, 1891172040, -1891172038, System.identityHashCode(this))).AFAdRevenueData("af_send_exc_to_server_window");
                getRevenue().getCurrencyIso4217Code();
            } else {
                AFh1aSDK aFh1aSDK4 = (AFh1aSDK) getMediationNetwork(new Object[]{this}, -2108652204, 2108652208, System.identityHashCode(this));
                Pair<Integer, Integer> pair2 = null;
                if (aFh1aSDK4 == null || (str3 = aFh1aSDK4.getRevenue) == null) {
                    num = null;
                } else {
                    Intrinsics.checkNotNullParameter(str3, "");
                    MatchResult c10 = new Regex("(\\d+).(\\d+).(\\d+).*").c(str3);
                    if (c10 != null) {
                        MatchGroup matchGroup2 = c10.c().get(1);
                        if (matchGroup2 != null && (value3 = matchGroup2.getValue()) != null) {
                            copydefault = (AFKeystoreWrapper + 109) % 128;
                            Integer intOrNull3 = StringsKt.toIntOrNull(value3);
                            if (intOrNull3 != null) {
                                i12 = intOrNull3.intValue();
                                int i14 = i12 * HVFrameRecorder.BITRATE;
                                matchGroup = c10.c().get(2);
                                if (matchGroup != null || (value2 = matchGroup.getValue()) == null || (intOrNull2 = StringsKt.toIntOrNull(value2)) == null) {
                                    i13 = 0;
                                } else {
                                    int i15 = copydefault + 123;
                                    AFKeystoreWrapper = i15 % 128;
                                    if (i15 % 2 == 0) {
                                        throw null;
                                    }
                                    i13 = intOrNull2.intValue();
                                }
                                int i16 = i14 + (i13 * 1000);
                                MatchGroup matchGroup3 = c10.c().get(3);
                                i11 = i16 + ((matchGroup3 != null || (value = matchGroup3.getValue()) == null || (intOrNull = StringsKt.toIntOrNull(value)) == null) ? 0 : intOrNull.intValue());
                            }
                        }
                        i12 = 0;
                        int i142 = i12 * HVFrameRecorder.BITRATE;
                        matchGroup = c10.c().get(2);
                        if (matchGroup != null) {
                        }
                        i13 = 0;
                        int i162 = i142 + (i13 * 1000);
                        MatchGroup matchGroup32 = c10.c().get(3);
                        i11 = i162 + ((matchGroup32 != null || (value = matchGroup32.getValue()) == null || (intOrNull = StringsKt.toIntOrNull(value)) == null) ? 0 : intOrNull.intValue());
                    } else {
                        i11 = -1;
                    }
                    num = Integer.valueOf(i11);
                }
                AFh1aSDK aFh1aSDK5 = (AFh1aSDK) getMediationNetwork(new Object[]{this}, -2108652204, 2108652208, System.identityHashCode(this));
                if (aFh1aSDK5 != null) {
                    int i17 = copydefault + 15;
                    AFKeystoreWrapper = i17 % 128;
                    if (i17 % 2 == 0) {
                        str2 = aFh1aSDK5.getRevenue;
                        int i18 = 29 / 0;
                    } else {
                        str2 = aFh1aSDK5.getRevenue;
                    }
                    aFh1aSDK = (AFh1aSDK) getMediationNetwork(new Object[]{this}, -2108652204, 2108652208, System.identityHashCode(this));
                    if (aFh1aSDK != null && (str = aFh1aSDK.getRevenue) != null) {
                        i10 = AFKeystoreWrapper + 99;
                        copydefault = i10 % 128;
                        if (i10 % 2 == 0) {
                            AFd1rSDK.AFAdRevenueData(str);
                            throw null;
                        }
                        pair2 = AFd1rSDK.AFAdRevenueData(str);
                    }
                    if (num != null) {
                    }
                    if (pair == null) {
                        AFKeystoreWrapper = (copydefault + 59) % 128;
                        getRevenue().getMonetizationNetwork(this.component4);
                    }
                    if (pair == null) {
                        getRevenue().getCurrencyIso4217Code(((Number) pair.c()).intValue(), ((Number) pair.d()).intValue());
                    } else if (pair2 != null) {
                        getRevenue().getCurrencyIso4217Code(((Number) pair2.c()).intValue(), ((Number) pair2.d()).intValue());
                    } else {
                        ((AFc1qSDK) getMediationNetwork(new Object[]{this}, 1891172040, -1891172038, System.identityHashCode(this))).AFAdRevenueData("af_send_exc_to_server_window");
                        getRevenue().getCurrencyIso4217Code();
                    }
                }
                pair = null;
                aFh1aSDK = (AFh1aSDK) getMediationNetwork(new Object[]{this}, -2108652204, 2108652208, System.identityHashCode(this));
                if (aFh1aSDK != null) {
                    i10 = AFKeystoreWrapper + 99;
                    copydefault = i10 % 128;
                    if (i10 % 2 == 0) {
                    }
                }
                if (num != null) {
                }
                if (pair == null) {
                }
                if (pair == null) {
                }
            }
            AFd1xSDK.AFa1vSDK aFa1vSDK = this.component1;
            if (aFa1vSDK != null) {
                AFh1aSDK aFh1aSDK6 = (AFh1aSDK) getMediationNetwork(new Object[]{this}, -2108652204, 2108652208, System.identityHashCode(this));
                aFa1vSDK.onConfigurationChanged(aFh1aSDK6 != null ? AFAdRevenueData(aFh1aSDK6) : false);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized void equals() {
        boolean z10;
        try {
            copydefault = (AFKeystoreWrapper + 119) % 128;
            AFh1aSDK aFh1aSDK = (AFh1aSDK) getMediationNetwork(new Object[]{this}, -2108652204, 2108652208, System.identityHashCode(this));
            if (aFh1aSDK != null) {
                if (aFh1aSDK.getMediationNetwork == -1) {
                    ((AFc1qSDK) getMediationNetwork(new Object[]{this}, 1891172040, -1891172038, System.identityHashCode(this))).AFAdRevenueData("af_send_exc_to_server_window");
                } else if (((AFc1qSDK) getMediationNetwork(new Object[]{this}, 1891172040, -1891172038, System.identityHashCode(this))).getMonetizationNetwork("af_send_exc_to_server_window", -1L) == -1) {
                    AFKeystoreWrapper = (copydefault + 21) % 128;
                    getCurrencyIso4217Code(aFh1aSDK);
                }
                z10 = AFAdRevenueData(aFh1aSDK);
            } else {
                z10 = false;
            }
            AFd1xSDK.AFa1vSDK aFa1vSDK = this.component1;
            if (aFa1vSDK != null) {
                aFa1vSDK.onConfigurationChanged(z10);
                int i10 = AFKeystoreWrapper + 111;
                copydefault = i10 % 128;
                if (i10 % 2 == 0) {
                } else {
                    throw null;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static final /* synthetic */ AFd1zSDK getCurrencyIso4217Code(AFd1wSDK aFd1wSDK) {
        int i10 = copydefault + 101;
        AFKeystoreWrapper = i10 % 128;
        int i11 = i10 % 2;
        AFd1zSDK aFd1zSDK = aFd1wSDK.AFAdRevenueData;
        if (i11 != 0) {
            return aFd1zSDK;
        }
        throw null;
    }

    public static /* synthetic */ Object getMediationNetwork(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~((~i10) | (~i11));
        int i14 = ~i12;
        int i15 = (i10 * 221) + (i11 * (-219)) + ((i13 | (~(i14 | i10 | i11))) * 220) + (((~(i14 | i11)) | i10) * (-440)) + ((i10 | i11 | i12) * 220);
        return i15 != 1 ? i15 != 2 ? i15 != 3 ? i15 != 4 ? getMonetizationNetwork(objArr) : AFAdRevenueData(objArr) : getMediationNetwork(objArr) : getRevenue(objArr) : getCurrencyIso4217Code(objArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMonetizationNetwork(AFd1wSDK aFd1wSDK) {
        int i10 = copydefault + 13;
        AFKeystoreWrapper = i10 % 128;
        if (i10 % 2 != 0) {
            Intrinsics.checkNotNullParameter(aFd1wSDK, "");
            aFd1wSDK.copydefault();
        } else {
            Intrinsics.checkNotNullParameter(aFd1wSDK, "");
            aFd1wSDK.copydefault();
            throw null;
        }
    }

    private static /* synthetic */ Object getRevenue(Object[] objArr) {
        AFd1wSDK aFd1wSDK = (AFd1wSDK) objArr[0];
        int i10 = copydefault + 25;
        AFKeystoreWrapper = i10 % 128;
        int i11 = i10 % 2;
        AFc1qSDK aFc1qSDK = (AFc1qSDK) aFd1wSDK.getMonetizationNetwork.getValue();
        if (i11 == 0) {
            int i12 = 60 / 0;
        }
        AFKeystoreWrapper = (copydefault + 51) % 128;
        return aFc1qSDK;
    }

    private static void a(String str, int i10, Object[] objArr) {
        char[] cArr;
        if (str != null) {
            $11 = ($10 + 51) % 128;
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        AFk1qSDK aFk1qSDK = new AFk1qSDK();
        char[] cArr3 = new char[cArr2.length];
        aFk1qSDK.getRevenue = 0;
        char[] cArr4 = new char[2];
        while (true) {
            int i11 = aFk1qSDK.getRevenue;
            if (i11 >= cArr2.length) {
                break;
            }
            cArr4[0] = cArr2[i11];
            cArr4[1] = cArr2[i11 + 1];
            int i12 = 58224;
            for (int i13 = 0; i13 < 16; i13++) {
                char c10 = cArr4[1];
                char c11 = cArr4[0];
                char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + ((char) (toString ^ (-1199070254561146252L))))) ^ ((c11 >>> 5) + ((char) (copy ^ (-1199070254561146252L))))));
                cArr4[1] = c12;
                cArr4[0] = (char) (c11 - (((c12 >>> 5) + ((char) (hashCode ^ (-1199070254561146252L)))) ^ ((c12 + i12) ^ ((c12 << 4) + ((char) (equals ^ (-1199070254561146252L)))))));
                i12 -= 40503;
            }
            int i14 = aFk1qSDK.getRevenue;
            cArr3[i14] = cArr4[0];
            cArr3[i14 + 1] = cArr4[1];
            aFk1qSDK.getRevenue = i14 + 2;
        }
        String str2 = new String(cArr3, 0, i10);
        int i15 = $10 + 97;
        $11 = i15 % 128;
        if (i15 % 2 != 0) {
            objArr[0] = str2;
        } else {
            int i16 = 2 / 0;
            objArr[0] = str2;
        }
    }

    private final AFf1kSDK getCurrencyIso4217Code() {
        copydefault = (AFKeystoreWrapper + 1) % 128;
        AFf1kSDK aFf1kSDK = (AFf1kSDK) this.getRevenue.getValue();
        int i10 = AFKeystoreWrapper + 1;
        copydefault = i10 % 128;
        if (i10 % 2 == 0) {
            return aFf1kSDK;
        }
        throw null;
    }

    private final AFc1oSDK getMediationNetwork() {
        copydefault = (AFKeystoreWrapper + 9) % 128;
        AFc1oSDK aFc1oSDK = (AFc1oSDK) this.getMediationNetwork.getValue();
        copydefault = (AFKeystoreWrapper + 21) % 128;
        return aFc1oSDK;
    }

    public final AFc1cSDK getRevenue() {
        copydefault = (AFKeystoreWrapper + 93) % 128;
        AFc1cSDK aFc1cSDK = (AFc1cSDK) this.component3.getValue();
        int i10 = copydefault + 121;
        AFKeystoreWrapper = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 3 / 0;
        }
        return aFc1cSDK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getCurrencyIso4217Code(AFd1wSDK aFd1wSDK, Throwable th, String str) {
        Intrinsics.checkNotNullParameter(aFd1wSDK, "");
        Intrinsics.checkNotNullParameter(th, "");
        Intrinsics.checkNotNullParameter(str, "");
        AFh1aSDK aFh1aSDK = (AFh1aSDK) getMediationNetwork(new Object[]{aFd1wSDK}, -2108652204, 2108652208, System.identityHashCode(aFd1wSDK));
        if (aFh1aSDK != null) {
            int i10 = copydefault + 99;
            AFKeystoreWrapper = i10 % 128;
            if (i10 % 2 != 0 ? aFd1wSDK.AFAdRevenueData(aFh1aSDK) : !aFd1wSDK.AFAdRevenueData(aFh1aSDK)) {
                AFKeystoreWrapper = (copydefault + 91) % 128;
                aFd1wSDK.getRevenue().AFAdRevenueData(th, str);
            } else {
                AFKeystoreWrapper = (copydefault + 49) % 128;
            }
        }
    }

    private static /* synthetic */ Object getMediationNetwork(Object[] objArr) {
        final AFd1wSDK aFd1wSDK = (AFd1wSDK) objArr[0];
        final Throwable th = (Throwable) objArr[1];
        final String str = (String) objArr[2];
        AFKeystoreWrapper = (copydefault + 49) % 128;
        Intrinsics.checkNotNullParameter(th, "");
        Intrinsics.checkNotNullParameter(str, "");
        aFd1wSDK.areAllFieldsValid().execute(new Runnable() { // from class: com.appsflyer.internal.t
            @Override // java.lang.Runnable
            public final void run() {
                AFd1wSDK.getCurrencyIso4217Code(AFd1wSDK.this, th, str);
            }
        });
        int i10 = copydefault + 41;
        AFKeystoreWrapper = i10 % 128;
        if (i10 % 2 != 0) {
            return null;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getRevenue(AFd1wSDK aFd1wSDK) {
        int i10 = AFKeystoreWrapper + 61;
        copydefault = i10 % 128;
        if (i10 % 2 == 0) {
            Intrinsics.checkNotNullParameter(aFd1wSDK, "");
            aFd1wSDK.equals();
            copydefault = (AFKeystoreWrapper + 99) % 128;
        } else {
            Intrinsics.checkNotNullParameter(aFd1wSDK, "");
            aFd1wSDK.equals();
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMediationNetwork(AFd1wSDK aFd1wSDK) {
        AFKeystoreWrapper = (copydefault + 83) % 128;
        Intrinsics.checkNotNullParameter(aFd1wSDK, "");
        aFd1wSDK.copy();
        AFKeystoreWrapper = (copydefault + 45) % 128;
    }

    @Override // com.appsflyer.internal.AFd1xSDK
    public final void getMonetizationNetwork(AFd1xSDK.AFa1vSDK aFa1vSDK) {
        int i10 = AFKeystoreWrapper + 31;
        copydefault = i10 % 128;
        if (i10 % 2 == 0) {
            this.component1 = aFa1vSDK;
            areAllFieldsValid().execute(new Runnable() { // from class: com.appsflyer.internal.s
                @Override // java.lang.Runnable
                public final void run() {
                    AFd1wSDK.getMonetizationNetwork(AFd1wSDK.this);
                }
            });
        } else {
            this.component1 = aFa1vSDK;
            areAllFieldsValid().execute(new Runnable() { // from class: com.appsflyer.internal.s
                @Override // java.lang.Runnable
                public final void run() {
                    AFd1wSDK.getMonetizationNetwork(AFd1wSDK.this);
                }
            });
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFd1xSDK
    public final void AFAdRevenueData() {
        int i10 = AFKeystoreWrapper + 97;
        copydefault = i10 % 128;
        if (i10 % 2 != 0) {
            areAllFieldsValid().execute(new Runnable() { // from class: com.appsflyer.internal.u
                @Override // java.lang.Runnable
                public final void run() {
                    AFd1wSDK.getMediationNetwork(AFd1wSDK.this);
                }
            });
            int i11 = 82 / 0;
        } else {
            areAllFieldsValid().execute(new Runnable() { // from class: com.appsflyer.internal.u
                @Override // java.lang.Runnable
                public final void run() {
                    AFd1wSDK.getMediationNetwork(AFd1wSDK.this);
                }
            });
        }
        copydefault = (AFKeystoreWrapper + 119) % 128;
    }

    private final void getCurrencyIso4217Code(AFh1aSDK aFh1aSDK) {
        copydefault = (AFKeystoreWrapper + 97) % 128;
        int i10 = aFh1aSDK.getCurrencyIso4217Code;
        long currentTimeMillis = System.currentTimeMillis() + TimeUnit.DAYS.toMillis(aFh1aSDK.getMediationNetwork);
        AFc1qSDK aFc1qSDK = (AFc1qSDK) getMediationNetwork(new Object[]{this}, 1891172040, -1891172038, System.identityHashCode(this));
        aFc1qSDK.AFAdRevenueData("af_send_exc_to_server_window", currentTimeMillis);
        aFc1qSDK.getMediationNetwork("af_send_exc_min", i10);
        int i11 = AFKeystoreWrapper + 17;
        copydefault = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    private final Map<String, String> getRevenue(AFh1aSDK aFh1aSDK) {
        Object[] objArr = new Object[1];
        a("炜桪ꪴ鐅⠖ᰫ", (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 5, objArr);
        Map<String, String> k10 = kotlin.collections.G.k(lc.t.a(((String) objArr[0]).intern(), Build.BRAND), lc.t.a("model", Build.MODEL), lc.t.a("app_id", getMediationNetwork().getCurrencyIso4217Code.getMonetizationNetwork.getPackageName()), lc.t.a("p_ex", new AFa1uSDK().AFAdRevenueData()), lc.t.a("api", String.valueOf(Build.VERSION.SDK_INT)), lc.t.a("sdk", this.component4), lc.t.a("uid", AFb1kSDK.getCurrencyIso4217Code(getMediationNetwork().getMediationNetwork)), lc.t.a("exc_config", aFh1aSDK.AFAdRevenueData()));
        int i10 = AFKeystoreWrapper + 111;
        copydefault = i10 % 128;
        if (i10 % 2 == 0) {
            return k10;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x007e, code lost:
    
        if (r0 == (-1)) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0080, code lost:
    
        r1 = com.appsflyer.internal.AFd1wSDK.AFKeystoreWrapper + 31;
        com.appsflyer.internal.AFd1wSDK.copydefault = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x008a, code lost:
    
        if ((r1 % 2) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x008c, code lost:
    
        r2 = 95 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0097, code lost:
    
        if (getRevenue().getMediationNetwork() >= r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a9, code lost:
    
        return getMonetizationNetwork(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a2, code lost:
    
        if (getRevenue().getMediationNetwork() >= r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00aa, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ab, code lost:
    
        r14 = com.appsflyer.internal.AFd1wSDK.copydefault + 63;
        com.appsflyer.internal.AFd1wSDK.AFKeystoreWrapper = r14 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b5, code lost:
    
        if ((r14 % 2) == 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b7, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b9, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005d, code lost:
    
        if (r14.getMonetizationNetwork < java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(r7)) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x003a, code lost:
    
        if (r14.getMonetizationNetwork < java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(r7)) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0062, code lost:
    
        if (r0 == (-1)) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0066, code lost:
    
        if (r0 >= r7) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0069, code lost:
    
        r0 = ((com.appsflyer.internal.AFc1qSDK) getMediationNetwork(new java.lang.Object[]{r13}, 1891172040, -1891172038, java.lang.System.identityHashCode(r13))).getRevenue("af_send_exc_min", -1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean getMediationNetwork(AFh1aSDK aFh1aSDK) {
        long currentTimeMillis;
        long monetizationNetwork;
        int i10 = copydefault + 19;
        AFKeystoreWrapper = i10 % 128;
        if (i10 % 2 == 0) {
            currentTimeMillis = System.currentTimeMillis();
            monetizationNetwork = ((AFc1qSDK) getMediationNetwork(new Object[]{this}, 1891172040, -1891172038, System.identityHashCode(this))).getMonetizationNetwork("af_send_exc_to_server_window", -1L);
            int i11 = 9 / 0;
        } else {
            currentTimeMillis = System.currentTimeMillis();
            monetizationNetwork = ((AFc1qSDK) getMediationNetwork(new Object[]{this}, 1891172040, -1891172038, System.identityHashCode(this))).getMonetizationNetwork("af_send_exc_to_server_window", -1L);
        }
    }

    private final boolean AFAdRevenueData(AFh1aSDK aFh1aSDK) {
        AFKeystoreWrapper = (copydefault + 29) % 128;
        long currentTimeMillis = System.currentTimeMillis();
        long monetizationNetwork = ((AFc1qSDK) getMediationNetwork(new Object[]{this}, 1891172040, -1891172038, System.identityHashCode(this))).getMonetizationNetwork("af_send_exc_to_server_window", -1L);
        if (aFh1aSDK.getMonetizationNetwork >= TimeUnit.MILLISECONDS.toSeconds(currentTimeMillis) && monetizationNetwork != -1) {
            AFKeystoreWrapper = (copydefault + 123) % 128;
            if (monetizationNetwork >= currentTimeMillis) {
                return getMonetizationNetwork(aFh1aSDK);
            }
        }
        return false;
    }

    private static /* synthetic */ Object getMonetizationNetwork(Object[] objArr) {
        final AFd1wSDK aFd1wSDK = (AFd1wSDK) objArr[0];
        int i10 = AFKeystoreWrapper + 77;
        copydefault = i10 % 128;
        if (i10 % 2 != 0) {
            aFd1wSDK.areAllFieldsValid().execute(new Runnable() { // from class: com.appsflyer.internal.v
                @Override // java.lang.Runnable
                public final void run() {
                    AFd1wSDK.getRevenue(AFd1wSDK.this);
                }
            });
            int i11 = 69 / 0;
            return null;
        }
        aFd1wSDK.areAllFieldsValid().execute(new Runnable() { // from class: com.appsflyer.internal.v
            @Override // java.lang.Runnable
            public final void run() {
                AFd1wSDK.getRevenue(AFd1wSDK.this);
            }
        });
        return null;
    }

    private static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr) {
        AFd1wSDK aFd1wSDK = (AFd1wSDK) objArr[0];
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        copydefault = (AFKeystoreWrapper + 61) % 128;
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        aFd1wSDK.component3().getMonetizationNetwork(bytes, kotlin.collections.G.e(lc.t.a("Authorization", AFj1dSDK.getMonetizationNetwork(str, str2))), 2000);
        int i10 = AFKeystoreWrapper + 69;
        copydefault = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 36 / 0;
        }
        return null;
    }

    private static Map<String, Object> getMonetizationNetwork(Map<String, ? extends Object> map, List<ExceptionInfo> list) {
        AFKeystoreWrapper = (copydefault + 121) % 128;
        Map<String, Object> k10 = kotlin.collections.G.k(lc.t.a("deviceInfo", map), lc.t.a("excs", AFd1qSDK.getMediationNetwork(list)));
        copydefault = (AFKeystoreWrapper + 15) % 128;
        return k10;
    }

    private final boolean getMonetizationNetwork(AFh1aSDK aFh1aSDK) {
        new AFd1pSDK();
        String str = this.component4;
        String str2 = aFh1aSDK.getRevenue;
        Intrinsics.checkNotNullExpressionValue(str2, "");
        boolean currencyIso4217Code = AFd1pSDK.getCurrencyIso4217Code(str, str2);
        int i10 = copydefault + 97;
        AFKeystoreWrapper = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 79 / 0;
        }
        return currencyIso4217Code;
    }

    @Override // com.appsflyer.internal.AFd1xSDK
    public final void getMonetizationNetwork() {
        getMediationNetwork(new Object[]{this}, 452613973, -452613973, System.identityHashCode(this));
    }

    @Override // com.appsflyer.internal.AFd1xSDK
    public final void getMonetizationNetwork(Throwable th, String str) {
        getMediationNetwork(new Object[]{this, th, str}, -1045855402, 1045855405, System.identityHashCode(this));
    }

    private final void getMediationNetwork(String str, String str2) {
        getMediationNetwork(new Object[]{this, str, str2}, -1856843688, 1856843689, System.identityHashCode(this));
    }
}
