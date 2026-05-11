package com.facebook.hermes.unicode;

import java.text.Collator;
import java.text.DateFormat;
import java.text.Normalizer;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\b\u001a\u00020\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0017\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0016\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/facebook/hermes/unicode/AndroidUnicodeUtils;", BuildConfig.FLAVOR, "<init>", "()V", BuildConfig.FLAVOR, "left", "right", BuildConfig.FLAVOR, "localeCompare", "(Ljava/lang/String;Ljava/lang/String;)I", BuildConfig.FLAVOR, "unixtimeMs", BuildConfig.FLAVOR, "formatDate", "formatTime", "dateFormat", "(DZZ)Ljava/lang/String;", "input", "targetCase", "useCurrentLocale", "convertToCase", "(Ljava/lang/String;IZ)Ljava/lang/String;", "form", "normalize", "(Ljava/lang/String;I)Ljava/lang/String;", "ReactAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidUnicodeUtils {

    /* renamed from: a, reason: collision with root package name */
    public static final AndroidUnicodeUtils f20689a = new AndroidUnicodeUtils();

    private AndroidUnicodeUtils() {
    }

    public static final String convertToCase(String input, int targetCase, boolean useCurrentLocale) {
        Intrinsics.checkNotNullParameter(input, "input");
        Locale locale = useCurrentLocale ? Locale.getDefault() : Locale.ENGLISH;
        if (targetCase == 0) {
            Intrinsics.d(locale);
            String upperCase = input.toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            return upperCase;
        }
        if (targetCase != 1) {
            throw new IllegalStateException("Invalid target case");
        }
        Intrinsics.d(locale);
        String lowerCase = input.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    public static final String dateFormat(double unixtimeMs, boolean formatDate, boolean formatTime) {
        DateFormat timeInstance;
        if (formatDate && formatTime) {
            timeInstance = DateFormat.getDateTimeInstance(2, 2);
        } else if (formatDate) {
            timeInstance = DateFormat.getDateInstance(2);
        } else {
            if (!formatTime) {
                throw new IllegalStateException("Bad dateFormat configuration");
            }
            timeInstance = DateFormat.getTimeInstance(2);
        }
        return timeInstance.format(Long.valueOf((long) unixtimeMs)).toString();
    }

    public static final int localeCompare(String left, String right) {
        return Collator.getInstance().compare(left, right);
    }

    public static final String normalize(String input, int form) {
        if (form == 0) {
            String normalize = Normalizer.normalize(input, Normalizer.Form.NFC);
            Intrinsics.checkNotNullExpressionValue(normalize, "normalize(...)");
            return normalize;
        }
        if (form == 1) {
            String normalize2 = Normalizer.normalize(input, Normalizer.Form.NFD);
            Intrinsics.checkNotNullExpressionValue(normalize2, "normalize(...)");
            return normalize2;
        }
        if (form == 2) {
            String normalize3 = Normalizer.normalize(input, Normalizer.Form.NFKC);
            Intrinsics.checkNotNullExpressionValue(normalize3, "normalize(...)");
            return normalize3;
        }
        if (form != 3) {
            throw new IllegalStateException("Invalid form");
        }
        String normalize4 = Normalizer.normalize(input, Normalizer.Form.NFKD);
        Intrinsics.checkNotNullExpressionValue(normalize4, "normalize(...)");
        return normalize4;
    }
}
