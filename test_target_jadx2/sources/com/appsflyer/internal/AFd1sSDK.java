package com.appsflyer.internal;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import lc.AbstractC3622a;
import org.conscrypt.BuildConfig;

/* loaded from: classes.dex */
public final class AFd1sSDK {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljava/lang/StackTraceElement;", "p0", BuildConfig.FLAVOR, "getCurrencyIso4217Code", "(Ljava/lang/StackTraceElement;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFd1sSDK$4, reason: invalid class name */
    static final class AnonymousClass4 extends xc.m implements Function1<StackTraceElement, CharSequence> {
        public static final AnonymousClass4 getCurrencyIso4217Code = new AnonymousClass4();

        AnonymousClass4() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: getCurrencyIso4217Code, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(StackTraceElement stackTraceElement) {
            Intrinsics.checkNotNullParameter(stackTraceElement, "");
            return "at " + stackTraceElement;
        }
    }

    private static String AFAdRevenueData(Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        Intrinsics.checkNotNullParameter(th, "");
        Intrinsics.checkNotNullParameter(th, "");
        StackTraceElement[] stackTrace = th.getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "");
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTrace) {
            String className = stackTraceElement.getClassName();
            Intrinsics.checkNotNullExpressionValue(className, "");
            if (!StringsKt.F(className, "com.appsflyer", false, 2, null)) {
                stackTraceElement = null;
            }
            if (stackTraceElement != null) {
                arrayList.add(stackTraceElement);
            }
        }
        String str = th + "\n" + CollectionsKt.l0(arrayList, "\n", null, null, 0, null, AnonymousClass4.getCurrencyIso4217Code, 30, null);
        Intrinsics.checkNotNullParameter(str, "");
        return AFd1rSDK.AFAdRevenueData(str, "SHA-256");
    }

    public static final ExceptionInfo getRevenue(Throwable th, String str) {
        Intrinsics.checkNotNullParameter(th, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th, "");
        String name = th.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "");
        return new ExceptionInfo(name + ": " + str, AFAdRevenueData(th), AbstractC3622a.b(th), 0, 8, null);
    }
}
