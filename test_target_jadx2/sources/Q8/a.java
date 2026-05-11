package Q8;

import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private static final TimeZone f8282a = TimeZone.getTimeZone("UTC");

    private static boolean a(String str, int i10, char c10) {
        return i10 < str.length() && str.charAt(i10) == c10;
    }

    private static int b(String str, int i10) {
        while (i10 < str.length()) {
            char charAt = str.charAt(i10);
            if (charAt < '0' || charAt > '9') {
                return i10;
            }
            i10++;
        }
        return str.length();
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Date c(String str, ParsePosition parsePosition) {
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
            int d10 = d(str, index, i14);
            if (a(str, i14, '-')) {
                i14 = index + 5;
            }
            int i15 = i14 + 2;
            int d11 = d(str, i14, i15);
            if (a(str, i15, '-')) {
                i15 = i14 + 3;
            }
            int i16 = i15 + 2;
            int d12 = d(str, i15, i16);
            boolean a10 = a(str, i16, 'T');
            if (!a10 && str.length() <= i16) {
                GregorianCalendar gregorianCalendar = new GregorianCalendar(d10, d11 - 1, d12);
                gregorianCalendar.setLenient(false);
                parsePosition.setIndex(i16);
                return gregorianCalendar.getTime();
            }
            if (a10) {
                int i17 = i15 + 5;
                int d13 = d(str, i15 + 3, i17);
                if (a(str, i17, ':')) {
                    i17 = i15 + 6;
                }
                int i18 = i17 + 2;
                int d14 = d(str, i17, i18);
                if (a(str, i18, ':')) {
                    i18 = i17 + 3;
                }
                if (str.length() <= i18 || (charAt = str.charAt(i18)) == 'Z' || charAt == '+' || charAt == '-') {
                    i11 = d14;
                    i12 = 0;
                    i13 = 0;
                    i16 = i18;
                    i10 = d13;
                } else {
                    int i19 = i18 + 2;
                    i13 = d(str, i18, i19);
                    if (i13 > 59 && i13 < 63) {
                        i13 = 59;
                    }
                    if (a(str, i19, '.')) {
                        int i20 = i18 + 3;
                        int b10 = b(str, i18 + 4);
                        int min = Math.min(b10, i18 + 6);
                        int d15 = d(str, i20, min);
                        int i21 = min - i20;
                        if (i21 == 1) {
                            d15 *= 100;
                        } else if (i21 == 2) {
                            d15 *= 10;
                        }
                        i10 = d13;
                        i16 = b10;
                        i11 = d14;
                        i12 = d15;
                    } else {
                        i10 = d13;
                        i16 = i19;
                        i11 = d14;
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
                timeZone = f8282a;
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
                if (!substring.equals("+0000") && !substring.equals("+00:00")) {
                    String str3 = "GMT" + substring;
                    TimeZone timeZone2 = TimeZone.getTimeZone(str3);
                    String id2 = timeZone2.getID();
                    if (!id2.equals(str3) && !id2.replace(":", BuildConfig.FLAVOR).equals(str3)) {
                        throw new IndexOutOfBoundsException("Mismatching time zone indicator: " + str3 + " given, resolves to " + timeZone2.getID());
                    }
                    timeZone = timeZone2;
                }
                timeZone = f8282a;
            }
            GregorianCalendar gregorianCalendar2 = new GregorianCalendar(timeZone);
            gregorianCalendar2.setLenient(false);
            gregorianCalendar2.set(1, d10);
            gregorianCalendar2.set(2, d11 - 1);
            gregorianCalendar2.set(5, d12);
            gregorianCalendar2.set(11, i10);
            gregorianCalendar2.set(12, i11);
            gregorianCalendar2.set(13, i13);
            gregorianCalendar2.set(14, i12);
            parsePosition.setIndex(length);
            return gregorianCalendar2.getTime();
        } catch (IllegalArgumentException e10) {
            e = e10;
            if (str != null) {
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
            if (str != null) {
            }
            message = e.getMessage();
            if (message != null) {
            }
            message = "(" + e.getClass().getName() + ")";
            ParseException parseException2 = new ParseException("Failed to parse date [" + str2 + "]: " + message, parsePosition.getIndex());
            parseException2.initCause(e);
            throw parseException2;
        }
    }

    private static int d(String str, int i10, int i11) {
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
