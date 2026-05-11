package ze;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.conscrypt.PSKKeyManager;

/* loaded from: classes3.dex */
public abstract class H {

    /* renamed from: c, reason: collision with root package name */
    private static String f45911c;

    /* renamed from: a, reason: collision with root package name */
    static final Pattern f45909a = a("^[:A-Z_a-z\\u00C0\\u00D6\\u00D8-\\u00F6\\u00F8-\\u02ff\\u0370-\\u037d\\u037f-\\u1fff\\u200c\\u200d\\u2070-\\u218f\\u2c00-\\u2fef\\u3001-\\ud7ff\\uf900-\\ufdcf\\ufdf0-\\ufffd\\x{10000}-\\x{EFFFF}]");

    /* renamed from: b, reason: collision with root package name */
    static final Pattern f45910b = a("^[:A-Z_a-z\\u00C0-\\u00D6\\u00D8-\\u00F6\\u00F8-\\u02ff\\u0370-\\u037d\\u037f-\\u1fff\\u200c\\u200d\\u2070-\\u218f\\u2c00-\\u2fef\\u3001-\\ud7ff\\uf900-\\ufdcf\\ufdf0-\\ufffd\\x{10000}-\\x{EFFFF}][:A-Z_a-z\\u00C0-\\u00D6\\u00D8-\\u00F6\\u00F8-\\u02ff\\u0370-\\u037d\\u037f-\\u1fff\\u200c\\u200d\\u2070-\\u218f\\u2c00-\\u2fef\\u3001-\\udfff\\uf900-\\ufdcf\\ufdf0-\\ufffd\\-\\.0-9\\u00b7\\u0300-\\u036f\\u203f-\\u2040]*\\Z");

    /* renamed from: d, reason: collision with root package name */
    private static final Pattern f45912d = Pattern.compile("\\p{Print}");

    /* renamed from: e, reason: collision with root package name */
    public static Pattern f45913e = Pattern.compile("^([x|X][\\p{XDigit}]+)(;?)");

    /* renamed from: f, reason: collision with root package name */
    public static Pattern f45914f = Pattern.compile("^0*([x|X][\\p{XDigit}]+)(;?)");

    /* renamed from: g, reason: collision with root package name */
    public static Pattern f45915g = Pattern.compile("^([\\p{Digit}]+)(;?)");

    private static Pattern a(String str) {
        try {
            return Pattern.compile(str, PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        } catch (IllegalArgumentException unused) {
            return Pattern.compile(str);
        }
    }

    private static int b(String str, boolean z10, boolean z11, boolean z12, StringBuilder sb2, int i10) {
        StringBuilder sb3 = new StringBuilder();
        int f10 = f(str, i10, true, sb3);
        if (sb3.length() > 0) {
            try {
                boolean equals = sb3.substring(0, 1).equals("x");
                int parseInt = equals ? Integer.parseInt(sb3.substring(1), 16) : Integer.parseInt(sb3.toString());
                char[] chars = Character.toChars(parseInt);
                B d10 = A.f45857f.d(parseInt);
                if (chars.length == 1 && chars[0] == 0) {
                    sb2.append("&amp;");
                } else if (d10 != null && (!d10.i() || !z11)) {
                    sb2.append(z10 ? d10.f() : z12 ? equals ? d10.e() : d10.a() : d10.d());
                } else if (z11) {
                    sb2.append(String.valueOf(chars));
                } else if (f45912d.matcher(new String(chars)).find()) {
                    sb2.append(String.valueOf(chars));
                } else {
                    sb2.append("&#");
                    sb2.append((CharSequence) sb3);
                    sb2.append(";");
                }
            } catch (NumberFormatException unused) {
                sb2.append("&amp;#");
                sb2.append((CharSequence) sb3);
                sb2.append(";");
            } catch (IllegalArgumentException unused2) {
                sb2.append("&amp;#");
                sb2.append((CharSequence) sb3);
                sb2.append(";");
            }
        } else {
            sb2.append("&amp;");
        }
        return f10;
    }

    private static int c(String str, boolean z10, boolean z11, boolean z12, StringBuilder sb2, int i10) {
        int parseInt;
        char[] chars;
        StringBuilder sb3 = new StringBuilder();
        int f10 = f(str, i10, true, sb3);
        if (sb3.length() > 0) {
            try {
                boolean equals = sb3.substring(0, 1).equals("x");
                if (equals) {
                    parseInt = Integer.parseInt(sb3.substring(1), 16);
                    chars = Character.toChars(parseInt);
                } else {
                    parseInt = Integer.parseInt(sb3.toString());
                    chars = Character.toChars(parseInt);
                }
                B d10 = A.f45857f.d(parseInt);
                if (chars.length == 1 && chars[0] == 0) {
                    sb2.append("&amp;");
                } else if (d10 != null) {
                    if (d10.i()) {
                        sb2.append(z10 ? d10.f() : d10.c());
                    } else {
                        sb2.append(z10 ? d10.f() : z12 ? equals ? d10.e() : d10.a() : d10.f());
                    }
                } else if (z11) {
                    sb2.append(String.valueOf(chars));
                } else if (f45912d.matcher(new String(chars)).find()) {
                    sb2.append(String.valueOf(chars));
                } else {
                    sb2.append("&#");
                    sb2.append((CharSequence) sb3);
                    sb2.append(";");
                }
            } catch (NumberFormatException unused) {
                sb2.append("&amp;#");
                sb2.append((CharSequence) sb3);
                sb2.append(";");
            }
        } else {
            sb2.append("&amp;");
        }
        return f10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0055, code lost:
    
        if (r14 == false) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String d(String str, boolean z10) {
        int h10;
        StringBuffer stringBuffer = new StringBuffer(str);
        A a10 = A.f45857f;
        int b10 = a10.b();
        int length = stringBuffer.length();
        int i10 = -1;
        int i11 = 0;
        boolean z11 = false;
        boolean z12 = false;
        while (i11 < length) {
            if (stringBuffer.charAt(i11) == '&') {
                z11 = false;
                z12 = false;
                i10 = i11;
                i11++;
            } else {
                if (i10 != -1) {
                    if (stringBuffer.charAt(i11) == ';') {
                        if (z11) {
                            try {
                                h10 = Integer.parseInt(stringBuffer.substring((z12 ? 3 : 2) + i10, i11), z12 ? 16 : 10);
                            } catch (NumberFormatException unused) {
                                h10 = -1;
                            }
                            B d10 = a10.d(h10);
                            if (d10 != null) {
                                h10 = d10.h();
                            }
                            if (h10 >= 0) {
                                char[] chars = Character.toChars(h10);
                                stringBuffer.replace(i10, i11 + 1, new String(chars));
                                int length2 = stringBuffer.length();
                                int length3 = i10 + chars.length;
                                length = length2;
                                i11 = length3;
                            } else {
                                i11++;
                            }
                            i10 = -1;
                        } else {
                            B c10 = a10.c(stringBuffer.substring(i10 + 1, i11));
                            if (c10 != null) {
                                h10 = c10.h();
                                if (h10 >= 0) {
                                }
                                i10 = -1;
                            }
                            h10 = -1;
                            if (h10 >= 0) {
                            }
                            i10 = -1;
                        }
                    } else if (i11 == i10 + 1 && stringBuffer.charAt(i11) == '#') {
                        z11 = true;
                    } else if (i11 == i10 + 2 && z11 && stringBuffer.charAt(i11) == 'x') {
                        z12 = true;
                    } else if (i11 - i10 > b10) {
                        i10 = -1;
                    }
                }
                i11++;
            }
        }
        return stringBuffer.toString();
    }

    public static String e(String str, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        B c10;
        String b10;
        int length;
        if (str == null) {
            return null;
        }
        int length2 = str.length();
        StringBuilder sb2 = new StringBuilder(length2);
        int i10 = 0;
        while (i10 < length2) {
            char charAt = str.charAt(i10);
            if (charAt != '&') {
                B d10 = A.f45857f.d(charAt);
                if (d10 == null) {
                    sb2.append(charAt);
                } else if (z16) {
                    if ("apos".equals(d10.g())) {
                        sb2.append(charAt);
                    } else {
                        sb2.append(z13 ? d10.f() : d10.c());
                    }
                } else if (!z13 || i(String.valueOf(charAt))) {
                    sb2.append(z14 ? d10.a() : d10.b(z13));
                } else {
                    sb2.append(charAt);
                }
            } else if ((z10 || z11) && i10 < length2 - 1 && str.charAt(i10 + 1) == '#') {
                i10 = b(str, z13, z11, z15, sb2, i10 + 2);
            } else {
                if ((z12 || z10) && (c10 = A.f45857f.c(str.substring(i10, Math.min(10, length2 - i10) + i10))) != null) {
                    if (z12 && c10.i()) {
                        if (z11) {
                            sb2.append((char) c10.h());
                        } else {
                            sb2.append(c10.a());
                        }
                        length = c10.g().length();
                    } else if (z10) {
                        if (z14) {
                            b10 = c10.a();
                        } else {
                            b10 = c10.b(z16 || z13);
                        }
                        sb2.append(b10);
                        length = c10.g().length();
                    } else {
                        sb2.append(z14 ? g() : "&amp;");
                    }
                    i10 += length + 1;
                } else if (z16) {
                    B c11 = A.f45857f.c(str.substring(i10, Math.min(10, length2 - i10) + i10));
                    if (c11 != null) {
                        sb2.append(c11.c());
                        length = c11.g().length();
                        i10 += length + 1;
                    } else if (i10 >= length2 - 1 || str.charAt(i10 + 1) != '#') {
                        sb2.append(z14 ? g() : "&amp;");
                    } else {
                        i10 = c(str, false, false, false, sb2, i10 + 2);
                    }
                } else {
                    sb2.append(z14 ? g() : "&amp;");
                }
            }
            i10++;
        }
        return sb2.toString();
    }

    private static int f(String str, int i10, boolean z10, StringBuilder sb2) {
        CharSequence subSequence = str.subSequence(i10, Math.min(str.length(), i10 + 15));
        Matcher matcher = z10 ? f45914f.matcher(subSequence) : f45913e.matcher(subSequence);
        if (!matcher.find()) {
            matcher = f45915g.matcher(subSequence);
            if (!matcher.find()) {
                return i10;
            }
        }
        int end = i10 + (matcher.end() - 1);
        sb2.append(matcher.group(1));
        return end;
    }

    private static String g() {
        if (f45911c == null) {
            f45911c = A.f45857f.d(38).a();
        }
        return f45911c;
    }

    public static boolean h(Object obj) {
        return obj == null || e(obj.toString(), true, false, false, false, false, false, false).replace((char) 160, ' ').trim().length() == 0;
    }

    public static boolean i(String str) {
        return "'\"<>&".contains(str);
    }
}
