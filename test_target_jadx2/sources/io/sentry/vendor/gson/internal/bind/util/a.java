package io.sentry.vendor.gson.internal.bind.util;

import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final TimeZone f35586a = TimeZone.getTimeZone("UTC");

    private static boolean a(String str, int i10, char c10) {
        return i10 < str.length() && str.charAt(i10) == c10;
    }

    public static String b(Date date, boolean z10) {
        return c(date, z10, f35586a);
    }

    public static String c(Date date, boolean z10, TimeZone timeZone) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone, Locale.US);
        gregorianCalendar.setTime(date);
        StringBuilder sb2 = new StringBuilder(19 + (z10 ? 4 : 0) + (timeZone.getRawOffset() == 0 ? 1 : 6));
        e(sb2, gregorianCalendar.get(1), 4);
        sb2.append('-');
        e(sb2, gregorianCalendar.get(2) + 1, 2);
        sb2.append('-');
        e(sb2, gregorianCalendar.get(5), 2);
        sb2.append('T');
        e(sb2, gregorianCalendar.get(11), 2);
        sb2.append(':');
        e(sb2, gregorianCalendar.get(12), 2);
        sb2.append(':');
        e(sb2, gregorianCalendar.get(13), 2);
        if (z10) {
            sb2.append('.');
            e(sb2, gregorianCalendar.get(14), 3);
        }
        int offset = timeZone.getOffset(gregorianCalendar.getTimeInMillis());
        if (offset != 0) {
            int i10 = offset / 60000;
            int abs = Math.abs(i10 / 60);
            int abs2 = Math.abs(i10 % 60);
            sb2.append(offset >= 0 ? '+' : '-');
            e(sb2, abs, 2);
            sb2.append(':');
            e(sb2, abs2, 2);
        } else {
            sb2.append('Z');
        }
        return sb2.toString();
    }

    private static int d(String str, int i10) {
        while (i10 < str.length()) {
            char charAt = str.charAt(i10);
            if (charAt < '0' || charAt > '9') {
                return i10;
            }
            i10++;
        }
        return str.length();
    }

    private static void e(StringBuilder sb2, int i10, int i11) {
        String num = Integer.toString(i10);
        for (int length = i11 - num.length(); length > 0; length--) {
            sb2.append('0');
        }
        sb2.append(num);
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Date f(String str, ParsePosition parsePosition) {
        String str2;
        String message;
        int i10;
        int i11;
        int i12;
        int i13;
        int length;
        TimeZone timeZone;
        char charAt;
        try {
            int index = parsePosition.getIndex();
            int i14 = index + 4;
            int g10 = g(str, index, i14);
            if (a(str, i14, '-')) {
                i14 = index + 5;
            }
            int i15 = i14 + 2;
            int g11 = g(str, i14, i15);
            if (a(str, i15, '-')) {
                i15 = i14 + 3;
            }
            int i16 = i15 + 2;
            int g12 = g(str, i15, i16);
            boolean a10 = a(str, i16, 'T');
            if (!a10 && str.length() <= i16) {
                GregorianCalendar gregorianCalendar = new GregorianCalendar(g10, g11 - 1, g12);
                parsePosition.setIndex(i16);
                return gregorianCalendar.getTime();
            }
            if (a10) {
                int i17 = i15 + 5;
                int g13 = g(str, i15 + 3, i17);
                if (a(str, i17, ':')) {
                    i17 = i15 + 6;
                }
                int i18 = i17 + 2;
                int g14 = g(str, i17, i18);
                if (a(str, i18, ':')) {
                    i18 = i17 + 3;
                }
                if (str.length() <= i18 || (charAt = str.charAt(i18)) == 'Z' || charAt == '+' || charAt == '-') {
                    i11 = g14;
                    i12 = 0;
                    i13 = 0;
                    i16 = i18;
                    i10 = g13;
                } else {
                    int i19 = i18 + 2;
                    i13 = g(str, i18, i19);
                    if (i13 > 59 && i13 < 63) {
                        i13 = 59;
                    }
                    if (a(str, i19, '.')) {
                        int i20 = i18 + 3;
                        int d10 = d(str, i18 + 4);
                        int min = Math.min(d10, i18 + 6);
                        int g15 = g(str, i20, min);
                        int i21 = min - i20;
                        if (i21 == 1) {
                            g15 *= 100;
                        } else if (i21 == 2) {
                            g15 *= 10;
                        }
                        i10 = g13;
                        i16 = d10;
                        i11 = g14;
                        i12 = g15;
                    } else {
                        i10 = g13;
                        i16 = i19;
                        i11 = g14;
                        i12 = 0;
                    }
                }
            } else {
                i10 = 0;
                i11 = 0;
                i12 = 0;
                i13 = 0;
            }
            if (str.length() <= i16) {
                throw new IllegalArgumentException("No time zone indicator");
            }
            char charAt2 = str.charAt(i16);
            if (charAt2 == 'Z') {
                timeZone = f35586a;
                length = i16 + 1;
            } else {
                if (charAt2 != '+' && charAt2 != '-') {
                    throw new IndexOutOfBoundsException("Invalid time zone indicator '" + charAt2 + "'");
                }
                String substring = str.substring(i16);
                if (substring.length() < 5) {
                    substring = substring + "00";
                }
                length = i16 + substring.length();
                if (!"+0000".equals(substring) && !"+00:00".equals(substring)) {
                    String str3 = "GMT" + substring;
                    TimeZone timeZone2 = TimeZone.getTimeZone(str3);
                    String id2 = timeZone2.getID();
                    if (!id2.equals(str3) && !id2.replace(":", BuildConfig.FLAVOR).equals(str3)) {
                        throw new IndexOutOfBoundsException("Mismatching time zone indicator: " + str3 + " given, resolves to " + timeZone2.getID());
                    }
                    timeZone = timeZone2;
                }
                timeZone = f35586a;
            }
            GregorianCalendar gregorianCalendar2 = new GregorianCalendar(timeZone);
            gregorianCalendar2.setLenient(false);
            gregorianCalendar2.set(1, g10);
            gregorianCalendar2.set(2, g11 - 1);
            gregorianCalendar2.set(5, g12);
            gregorianCalendar2.set(11, i10);
            gregorianCalendar2.set(12, i11);
            gregorianCalendar2.set(13, i13);
            gregorianCalendar2.set(14, i12);
            parsePosition.setIndex(length);
            return gregorianCalendar2.getTime();
        } catch (IllegalArgumentException e10) {
            e = e10;
            if (str == null) {
                str2 = null;
            } else {
                str2 = '\"' + str + '\"';
            }
            message = e.getMessage();
            if (message != null || message.isEmpty()) {
                message = "(" + e.getClass().getName() + ")";
            }
            ParseException parseException = new ParseException("Failed to parse date [" + str2 + "]: " + message, parsePosition.getIndex());
            parseException.initCause(e);
            throw parseException;
        } catch (IndexOutOfBoundsException e11) {
            e = e11;
            if (str == null) {
            }
            message = e.getMessage();
            if (message != null) {
            }
            message = "(" + e.getClass().getName() + ")";
            ParseException parseException2 = new ParseException("Failed to parse date [" + str2 + "]: " + message, parsePosition.getIndex());
            parseException2.initCause(e);
            throw parseException2;
        } catch (NumberFormatException e12) {
            e = e12;
            if (str == null) {
            }
            message = e.getMessage();
            if (message != null) {
            }
            message = "(" + e.getClass().getName() + ")";
            ParseException parseException22 = new ParseException("Failed to parse date [" + str2 + "]: " + message, parsePosition.getIndex());
            parseException22.initCause(e);
            throw parseException22;
        }
    }

    private static int g(String str, int i10, int i11) {
        int i12;
        int i13;
        if (i10 < 0 || i11 > str.length() || i10 > i11) {
            throw new NumberFormatException(str);
        }
        if (i10 < i11) {
            i13 = i10 + 1;
            int digit = Character.digit(str.charAt(i10), 10);
            if (digit < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i10, i11));
            }
            i12 = -digit;
        } else {
            i12 = 0;
            i13 = i10;
        }
        while (i13 < i11) {
            int i14 = i13 + 1;
            int digit2 = Character.digit(str.charAt(i13), 10);
            if (digit2 < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i10, i11));
            }
            i12 = (i12 * 10) - digit2;
            i13 = i14;
        }
        return -i12;
    }
}
