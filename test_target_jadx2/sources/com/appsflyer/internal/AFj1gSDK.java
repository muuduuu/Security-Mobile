package com.appsflyer.internal;

import android.content.Intent;
import android.os.Parcelable;
import com.appsflyer.AFLogger;
import java.util.ConcurrentModificationException;
import kotlin.Metadata;
import kotlin.collections.AbstractC3574i;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lc.o;
import org.conscrypt.BuildConfig;
import xc.C5142C;

/* loaded from: classes.dex */
public final class AFj1gSDK {
    final Intent getCurrencyIso4217Code;

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Parcelable;", "T", "J_", "()Landroid/os/Parcelable;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFj1gSDK$2, reason: invalid class name */
    static final class AnonymousClass2<T> extends xc.m implements Function0<T> {
        private /* synthetic */ String $getMonetizationNetwork;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(String str) {
            super(0);
            this.$getMonetizationNetwork = str;
        }

        /* JADX WARN: Incorrect return type in method signature: ()TT; */
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: J_, reason: merged with bridge method [inline-methods] */
        public final Parcelable invoke() {
            return AFj1gSDK.this.getCurrencyIso4217Code.getParcelableExtra(this.$getMonetizationNetwork);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {BuildConfig.FLAVOR, "getMediationNetwork", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFj1gSDK$3, reason: invalid class name */
    static final class AnonymousClass3 extends xc.m implements Function0<String> {
        private /* synthetic */ String $AFAdRevenueData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(String str) {
            super(0);
            this.$AFAdRevenueData = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: getMediationNetwork, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return AFj1gSDK.this.getCurrencyIso4217Code.getStringExtra(this.$AFAdRevenueData);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {BuildConfig.FLAVOR, "getCurrencyIso4217Code", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFj1gSDK$4, reason: invalid class name */
    static final class AnonymousClass4 extends xc.m implements Function0<Boolean> {
        private /* synthetic */ String $getMonetizationNetwork;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(String str) {
            super(0);
            this.$getMonetizationNetwork = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: getCurrencyIso4217Code, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(AFj1gSDK.this.getCurrencyIso4217Code.hasExtra(this.$getMonetizationNetwork));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/content/Intent;", "K_", "()Landroid/content/Intent;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFj1gSDK$5, reason: invalid class name */
    static final class AnonymousClass5 extends xc.m implements Function0<Intent> {
        private /* synthetic */ long $AFAdRevenueData;
        private /* synthetic */ String $getRevenue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass5(String str, long j10) {
            super(0);
            this.$getRevenue = str;
            this.$AFAdRevenueData = j10;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: K_, reason: merged with bridge method [inline-methods] */
        public final Intent invoke() {
            return AFj1gSDK.this.getCurrencyIso4217Code.putExtra(this.$getRevenue, this.$AFAdRevenueData);
        }
    }

    public AFj1gSDK(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "");
        this.getCurrencyIso4217Code = intent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006a A[Catch: all -> 0x006f, TRY_LEAVE, TryCatch #1 {, blocks: (B:5:0x001a, B:7:0x0062, B:13:0x006a, B:25:0x0057, B:30:0x0010, B:15:0x0035, B:18:0x0045, B:19:0x0050, B:21:0x004c, B:22:0x0056, B:4:0x0004), top: B:3:0x0004, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0068  */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final <T> T getRevenue(Function0<? extends T> function0, String str, T t10, boolean z10) {
        T t11;
        Throwable d10;
        ?? b10;
        Object obj;
        Throwable d11;
        synchronized (this.getCurrencyIso4217Code) {
            try {
                o.a aVar = lc.o.f37128b;
                t11 = lc.o.b(function0.invoke());
            } finally {
                kotlin.reflect.d[] dVarArr = {C5142C.b(ConcurrentModificationException.class), C5142C.b(ArrayIndexOutOfBoundsException.class)};
                d10 = lc.o.d(t11);
                T t12 = t11;
                if (d10 != null) {
                }
                d11 = lc.o.d(t12);
                if (d11 != null) {
                }
                return t10;
            }
            kotlin.reflect.d[] dVarArr2 = {C5142C.b(ConcurrentModificationException.class), C5142C.b(ArrayIndexOutOfBoundsException.class)};
            d10 = lc.o.d(t11);
            T t122 = t11;
            if (d10 != null) {
                try {
                } catch (Throwable th) {
                    o.a aVar2 = lc.o.f37128b;
                    b10 = lc.o.b(lc.p.a(th));
                }
                if (!AbstractC3574i.v(dVarArr2, C5142C.b(d10.getClass()))) {
                    throw d10;
                }
                if (z10) {
                    obj = getRevenue(function0, str, t10, false);
                } else {
                    AFLogger.afErrorLog(str, d10, false, false);
                    obj = t10;
                }
                b10 = lc.o.b(obj);
                t122 = b10;
            }
            d11 = lc.o.d(t122);
            if (d11 != null) {
                t10 = t122;
            } else {
                AFLogger.afErrorLog(str, d11, false, false);
            }
        }
        return t10;
    }

    public final String AFAdRevenueData(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return (String) getRevenue(new AnonymousClass3(str), "Error while trying to read " + str + " extra from intent", null, true);
    }

    public final <T extends Parcelable> T H_(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return (T) getRevenue(new AnonymousClass2(str), "Error while trying to read " + str + " extra from intent", null, true);
    }

    public final Intent I_(String str, long j10) {
        Intrinsics.checkNotNullParameter(str, "");
        return (Intent) getRevenue(new AnonymousClass5(str, j10), "Error while trying to write " + str + " extra to intent", null, true);
    }

    public final boolean getMediationNetwork(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        Boolean bool = (Boolean) getRevenue(new AnonymousClass4(str), "Error while trying to check presence of " + str + " extra from intent", Boolean.TRUE, true);
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }
}
