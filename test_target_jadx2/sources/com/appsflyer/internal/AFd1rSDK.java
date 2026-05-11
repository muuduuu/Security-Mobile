package com.appsflyer.internal;

import co.hyperverge.hypersnapsdk.service.framerecorder.HVFrameRecorder;
import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.collections.AbstractC3574i;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.MatchGroup;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.conscrypt.BuildConfig;

/* loaded from: classes.dex */
public final class AFd1rSDK {
    public static final String AFAdRevenueData(String str, String str2) {
        MessageDigest messageDigest = MessageDigest.getInstance(str2);
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        byte[] digest = messageDigest.digest(bytes);
        Intrinsics.checkNotNullExpressionValue(digest, "");
        String str3 = BuildConfig.FLAVOR;
        for (byte b10 : digest) {
            String format = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b10)}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "");
            str3 = str3 + format;
        }
        return str3;
    }

    public static final String getCurrencyIso4217Code(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return "[Exception Manager]: " + str;
    }

    public static final Pair<Integer, Integer> getMonetizationNetwork(String str) {
        String value;
        String value2;
        String value3;
        String value4;
        String value5;
        String value6;
        Intrinsics.checkNotNullParameter(str, "");
        MatchResult c10 = new Regex("(\\d+).(\\d+).(\\d+)-(\\d+).(\\d+).(\\d+)").c(str);
        if (c10 != null) {
            MatchGroup matchGroup = c10.c().get(1);
            Integer intOrNull = (matchGroup == null || (value6 = matchGroup.getValue()) == null) ? null : StringsKt.toIntOrNull(value6);
            MatchGroup matchGroup2 = c10.c().get(2);
            Integer intOrNull2 = (matchGroup2 == null || (value5 = matchGroup2.getValue()) == null) ? null : StringsKt.toIntOrNull(value5);
            MatchGroup matchGroup3 = c10.c().get(3);
            Integer intOrNull3 = (matchGroup3 == null || (value4 = matchGroup3.getValue()) == null) ? null : StringsKt.toIntOrNull(value4);
            MatchGroup matchGroup4 = c10.c().get(4);
            Integer intOrNull4 = (matchGroup4 == null || (value3 = matchGroup4.getValue()) == null) ? null : StringsKt.toIntOrNull(value3);
            MatchGroup matchGroup5 = c10.c().get(5);
            Integer intOrNull5 = (matchGroup5 == null || (value2 = matchGroup5.getValue()) == null) ? null : StringsKt.toIntOrNull(value2);
            MatchGroup matchGroup6 = c10.c().get(6);
            Integer intOrNull6 = (matchGroup6 == null || (value = matchGroup6.getValue()) == null) ? null : StringsKt.toIntOrNull(value);
            if (AFAdRevenueData(intOrNull, intOrNull2, intOrNull3, intOrNull4, intOrNull5, intOrNull6)) {
                Intrinsics.d(intOrNull);
                int intValue = intOrNull.intValue() * HVFrameRecorder.BITRATE;
                Intrinsics.d(intOrNull2);
                int intValue2 = intValue + (intOrNull2.intValue() * 1000);
                Intrinsics.d(intOrNull3);
                Integer valueOf = Integer.valueOf(intValue2 + intOrNull3.intValue());
                Intrinsics.d(intOrNull4);
                int intValue3 = intOrNull4.intValue() * HVFrameRecorder.BITRATE;
                Intrinsics.d(intOrNull5);
                int intValue4 = intValue3 + (intOrNull5.intValue() * 1000);
                Intrinsics.d(intOrNull6);
                return lc.t.a(valueOf, Integer.valueOf(intValue4 + intOrNull6.intValue()));
            }
        }
        return null;
    }

    public static final Pair<Integer, Integer> AFAdRevenueData(String str) {
        String value;
        String value2;
        String value3;
        Intrinsics.checkNotNullParameter(str, "");
        MatchResult c10 = new Regex("^(\\d+).(\\+)$|^(\\d+).(\\d+).(\\+)$").c(str);
        if (c10 != null) {
            MatchGroup matchGroup = c10.c().get(1);
            Integer intOrNull = (matchGroup == null || (value3 = matchGroup.getValue()) == null) ? null : StringsKt.toIntOrNull(value3);
            MatchGroup matchGroup2 = c10.c().get(3);
            Integer intOrNull2 = (matchGroup2 == null || (value2 = matchGroup2.getValue()) == null) ? null : StringsKt.toIntOrNull(value2);
            MatchGroup matchGroup3 = c10.c().get(4);
            Integer intOrNull3 = (matchGroup3 == null || (value = matchGroup3.getValue()) == null) ? null : StringsKt.toIntOrNull(value);
            if (intOrNull != null) {
                return lc.t.a(Integer.valueOf(intOrNull.intValue() * HVFrameRecorder.BITRATE), Integer.valueOf(((intOrNull.intValue() + 1) * HVFrameRecorder.BITRATE) - 1));
            }
            if (intOrNull2 != null && intOrNull3 != null) {
                return lc.t.a(Integer.valueOf((intOrNull2.intValue() * HVFrameRecorder.BITRATE) + (intOrNull3.intValue() * 1000)), Integer.valueOf(((intOrNull2.intValue() * HVFrameRecorder.BITRATE) + ((intOrNull3.intValue() + 1) * 1000)) - 1));
            }
        }
        return null;
    }

    private static boolean AFAdRevenueData(Object... objArr) {
        Intrinsics.checkNotNullParameter(objArr, "");
        return !AbstractC3574i.v(objArr, null);
    }
}
