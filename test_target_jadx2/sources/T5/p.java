package T5;

import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public class p extends DateFormat {

    /* renamed from: g, reason: collision with root package name */
    protected static final Pattern f9311g = Pattern.compile("\\d\\d\\d\\d[-]\\d\\d[-]\\d\\d");

    /* renamed from: h, reason: collision with root package name */
    protected static final Pattern f9312h;

    /* renamed from: i, reason: collision with root package name */
    protected static final String[] f9313i;

    /* renamed from: j, reason: collision with root package name */
    protected static final TimeZone f9314j;

    /* renamed from: k, reason: collision with root package name */
    protected static final Locale f9315k;

    /* renamed from: l, reason: collision with root package name */
    protected static final DateFormat f9316l;

    /* renamed from: m, reason: collision with root package name */
    public static final p f9317m;

    /* renamed from: n, reason: collision with root package name */
    protected static final Calendar f9318n;

    /* renamed from: a, reason: collision with root package name */
    protected transient TimeZone f9319a;

    /* renamed from: b, reason: collision with root package name */
    protected final Locale f9320b;

    /* renamed from: c, reason: collision with root package name */
    protected Boolean f9321c;

    /* renamed from: d, reason: collision with root package name */
    private transient Calendar f9322d;

    /* renamed from: e, reason: collision with root package name */
    private transient DateFormat f9323e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f9324f;

    static {
        try {
            f9312h = Pattern.compile("\\d\\d\\d\\d[-]\\d\\d[-]\\d\\d[T]\\d\\d[:]\\d\\d(?:[:]\\d\\d)?(\\.\\d+)?(Z|[+-]\\d\\d(?:[:]?\\d\\d)?)?");
            f9313i = new String[]{"yyyy-MM-dd'T'HH:mm:ss.SSSX", "yyyy-MM-dd'T'HH:mm:ss.SSS", "EEE, dd MMM yyyy HH:mm:ss zzz", "yyyy-MM-dd"};
            TimeZone timeZone = TimeZone.getTimeZone("UTC");
            f9314j = timeZone;
            Locale locale = Locale.US;
            f9315k = locale;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", locale);
            f9316l = simpleDateFormat;
            simpleDateFormat.setTimeZone(timeZone);
            f9317m = new p();
            f9318n = new GregorianCalendar(timeZone, locale);
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }

    public p() {
        this.f9324f = true;
        this.f9320b = f9315k;
    }

    private static final DateFormat b(DateFormat dateFormat, String str, TimeZone timeZone, Locale locale, Boolean bool) {
        DateFormat dateFormat2;
        if (locale.equals(f9315k)) {
            dateFormat2 = (DateFormat) dateFormat.clone();
            if (timeZone != null) {
                dateFormat2.setTimeZone(timeZone);
            }
        } else {
            dateFormat2 = new SimpleDateFormat(str, locale);
            if (timeZone == null) {
                timeZone = f9314j;
            }
            dateFormat2.setTimeZone(timeZone);
        }
        if (bool != null) {
            dateFormat2.setLenient(bool.booleanValue());
        }
        return dateFormat2;
    }

    protected static boolean d(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        return obj != null && obj.equals(obj2);
    }

    private static int l(String str, int i10) {
        return ((str.charAt(i10) - '0') * 10) + (str.charAt(i10 + 1) - '0');
    }

    private static int m(String str, int i10) {
        return ((str.charAt(i10) - '0') * 1000) + ((str.charAt(i10 + 1) - '0') * 100) + ((str.charAt(i10 + 2) - '0') * 10) + (str.charAt(i10 + 3) - '0');
    }

    private Date p(String str, ParsePosition parsePosition) {
        try {
            return new Date(y5.e.c(str));
        } catch (NumberFormatException unused) {
            throw new ParseException(String.format("Timestamp value %s out of 64-bit value range", str), parsePosition.getErrorIndex());
        }
    }

    private static void v(StringBuffer stringBuffer, int i10) {
        int i11 = i10 / 10;
        if (i11 == 0) {
            stringBuffer.append('0');
        } else {
            stringBuffer.append((char) (i11 + 48));
            i10 -= i11 * 10;
        }
        stringBuffer.append((char) (i10 + 48));
    }

    private static void w(StringBuffer stringBuffer, int i10) {
        int i11 = i10 / 100;
        if (i11 == 0) {
            stringBuffer.append('0');
        } else {
            stringBuffer.append((char) (i11 + 48));
            i10 -= i11 * 100;
        }
        v(stringBuffer, i10);
    }

    private static void x(StringBuffer stringBuffer, int i10) {
        int i11 = i10 / 100;
        if (i11 == 0) {
            stringBuffer.append('0');
            stringBuffer.append('0');
        } else {
            if (i11 > 99) {
                stringBuffer.append(i11);
            } else {
                v(stringBuffer, i11);
            }
            i10 -= i11 * 100;
        }
        v(stringBuffer, i10);
    }

    public p A(Locale locale) {
        return locale.equals(this.f9320b) ? this : new p(this.f9319a, locale, this.f9321c, this.f9324f);
    }

    public p B(TimeZone timeZone) {
        if (timeZone == null) {
            timeZone = f9314j;
        }
        TimeZone timeZone2 = this.f9319a;
        return (timeZone == timeZone2 || timeZone.equals(timeZone2)) ? this : new p(timeZone, this.f9320b, this.f9321c, this.f9324f);
    }

    protected void a() {
        this.f9323e = null;
    }

    @Override // java.text.DateFormat
    public boolean equals(Object obj) {
        return obj == this;
    }

    @Override // java.text.DateFormat
    public StringBuffer format(Date date, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        TimeZone timeZone = this.f9319a;
        if (timeZone == null) {
            timeZone = f9314j;
        }
        h(timeZone, this.f9320b, date, stringBuffer);
        return stringBuffer;
    }

    @Override // java.text.DateFormat
    public TimeZone getTimeZone() {
        return this.f9319a;
    }

    protected void h(TimeZone timeZone, Locale locale, Date date, StringBuffer stringBuffer) {
        Calendar k10 = k(timeZone);
        k10.setTime(date);
        int i10 = k10.get(1);
        if (k10.get(0) == 0) {
            i(stringBuffer, i10);
        } else {
            if (i10 > 9999) {
                stringBuffer.append('+');
            }
            x(stringBuffer, i10);
        }
        stringBuffer.append('-');
        v(stringBuffer, k10.get(2) + 1);
        stringBuffer.append('-');
        v(stringBuffer, k10.get(5));
        stringBuffer.append('T');
        v(stringBuffer, k10.get(11));
        stringBuffer.append(':');
        v(stringBuffer, k10.get(12));
        stringBuffer.append(':');
        v(stringBuffer, k10.get(13));
        stringBuffer.append('.');
        w(stringBuffer, k10.get(14));
        int offset = timeZone.getOffset(k10.getTimeInMillis());
        if (offset == 0) {
            if (this.f9324f) {
                stringBuffer.append("+00:00");
                return;
            } else {
                stringBuffer.append("+0000");
                return;
            }
        }
        int i11 = offset / 60000;
        int abs = Math.abs(i11 / 60);
        int abs2 = Math.abs(i11 % 60);
        stringBuffer.append(offset < 0 ? '-' : '+');
        v(stringBuffer, abs);
        if (this.f9324f) {
            stringBuffer.append(':');
        }
        v(stringBuffer, abs2);
    }

    @Override // java.text.DateFormat
    public int hashCode() {
        return System.identityHashCode(this);
    }

    protected void i(StringBuffer stringBuffer, int i10) {
        if (i10 == 1) {
            stringBuffer.append("+0000");
        } else {
            stringBuffer.append('-');
            x(stringBuffer, i10 - 1);
        }
    }

    @Override // java.text.DateFormat
    public boolean isLenient() {
        Boolean bool = this.f9321c;
        return bool == null || bool.booleanValue();
    }

    protected Calendar k(TimeZone timeZone) {
        Calendar calendar = this.f9322d;
        if (calendar == null) {
            calendar = (Calendar) f9318n.clone();
            this.f9322d = calendar;
        }
        if (!calendar.getTimeZone().equals(timeZone)) {
            calendar.setTimeZone(timeZone);
        }
        calendar.setLenient(isLenient());
        return calendar;
    }

    protected Date n(String str, ParsePosition parsePosition) {
        String str2;
        int length = str.length();
        TimeZone timeZone = f9314j;
        if (this.f9319a != null && 'Z' != str.charAt(length - 1)) {
            timeZone = this.f9319a;
        }
        Calendar k10 = k(timeZone);
        k10.clear();
        int i10 = 0;
        if (length > 10) {
            Matcher matcher = f9312h.matcher(str);
            if (matcher.matches()) {
                int start = matcher.start(2);
                int end = matcher.end(2);
                int i11 = end - start;
                if (i11 > 1) {
                    int l10 = l(str, start + 1) * 3600;
                    if (i11 >= 5) {
                        l10 += l(str, end - 2) * 60;
                    }
                    k10.set(15, str.charAt(start) == '-' ? l10 * (-1000) : l10 * 1000);
                    k10.set(16, 0);
                }
                k10.set(m(str, 0), l(str, 5) - 1, l(str, 8), l(str, 11), l(str, 14), (length <= 16 || str.charAt(16) != ':') ? 0 : l(str, 17));
                int start2 = matcher.start(1);
                int i12 = start2 + 1;
                int end2 = matcher.end(1);
                if (i12 >= end2) {
                    k10.set(14, 0);
                } else {
                    int i13 = end2 - i12;
                    if (i13 != 0) {
                        if (i13 != 1) {
                            if (i13 != 2) {
                                if (i13 != 3 && i13 > 9) {
                                    throw new ParseException(String.format("Cannot parse date \"%s\": invalid fractional seconds '%s'; can use at most 9 digits", str, matcher.group(1).substring(1)), i12);
                                }
                                i10 = str.charAt(start2 + 3) - '0';
                            }
                            i10 += (str.charAt(start2 + 2) - '0') * 10;
                        }
                        i10 += (str.charAt(i12) - '0') * 100;
                    }
                    k10.set(14, i10);
                }
                return k10.getTime();
            }
            str2 = "yyyy-MM-dd'T'HH:mm:ss.SSSX";
        } else {
            if (f9311g.matcher(str).matches()) {
                k10.set(m(str, 0), l(str, 5) - 1, l(str, 8), 0, 0, 0);
                k10.set(14, 0);
                return k10.getTime();
            }
            str2 = "yyyy-MM-dd";
        }
        throw new ParseException(String.format("Cannot parse date \"%s\": while it seems to fit format '%s', parsing fails (leniency? %s)", str, str2, this.f9321c), 0);
    }

    protected Date o(String str, ParsePosition parsePosition) {
        if (s(str)) {
            return y(str, parsePosition);
        }
        int length = str.length();
        while (true) {
            length--;
            if (length < 0) {
                break;
            }
            char charAt = str.charAt(length);
            if (charAt < '0' || charAt > '9') {
                if (length > 0 || charAt != '-') {
                    break;
                }
            }
        }
        return (length >= 0 || !(str.charAt(0) == '-' || y5.e.a(str, false))) ? z(str, parsePosition) : p(str, parsePosition);
    }

    @Override // java.text.DateFormat
    public Date parse(String str) {
        String trim = str.trim();
        ParsePosition parsePosition = new ParsePosition(0);
        Date o10 = o(trim, parsePosition);
        if (o10 != null) {
            return o10;
        }
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : f9313i) {
            if (sb2.length() > 0) {
                sb2.append("\", \"");
            } else {
                sb2.append('\"');
            }
            sb2.append(str2);
        }
        sb2.append('\"');
        throw new ParseException(String.format("Cannot parse date \"%s\": not compatible with any of standard forms (%s)", trim, sb2.toString()), parsePosition.getErrorIndex());
    }

    @Override // java.text.DateFormat, java.text.Format
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public p clone() {
        return new p(this.f9319a, this.f9320b, this.f9321c, this.f9324f);
    }

    protected boolean s(String str) {
        return str.length() >= 7 && Character.isDigit(str.charAt(0)) && Character.isDigit(str.charAt(3)) && str.charAt(4) == '-' && Character.isDigit(str.charAt(5));
    }

    @Override // java.text.DateFormat
    public void setLenient(boolean z10) {
        Boolean valueOf = Boolean.valueOf(z10);
        if (d(valueOf, this.f9321c)) {
            return;
        }
        this.f9321c = valueOf;
        a();
    }

    @Override // java.text.DateFormat
    public void setTimeZone(TimeZone timeZone) {
        if (timeZone.equals(this.f9319a)) {
            return;
        }
        a();
        this.f9319a = timeZone;
    }

    public String toString() {
        return String.format("DateFormat %s: (timezone: %s, locale: %s, lenient: %s)", getClass().getName(), this.f9319a, this.f9320b, this.f9321c);
    }

    protected Date y(String str, ParsePosition parsePosition) {
        try {
            return n(str, parsePosition);
        } catch (IllegalArgumentException e10) {
            throw new ParseException(String.format("Cannot parse date \"%s\", problem: %s", str, e10.getMessage()), parsePosition.getErrorIndex());
        }
    }

    protected Date z(String str, ParsePosition parsePosition) {
        if (this.f9323e == null) {
            this.f9323e = b(f9316l, "EEE, dd MMM yyyy HH:mm:ss zzz", this.f9319a, this.f9320b, this.f9321c);
        }
        return this.f9323e.parse(str, parsePosition);
    }

    protected p(TimeZone timeZone, Locale locale, Boolean bool, boolean z10) {
        this.f9319a = timeZone;
        this.f9320b = locale;
        this.f9321c = bool;
        this.f9324f = z10;
    }

    @Override // java.text.DateFormat
    public Date parse(String str, ParsePosition parsePosition) {
        try {
            return o(str, parsePosition);
        } catch (ParseException unused) {
            return null;
        }
    }
}
