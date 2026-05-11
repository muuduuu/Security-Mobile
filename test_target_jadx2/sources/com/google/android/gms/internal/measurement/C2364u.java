package com.google.android.gms.internal.measurement;

import co.hyperverge.hypersnapsdk.objects.HVError;
import com.appsflyer.attribution.RequestError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.conscrypt.BuildConfig;

/* renamed from: com.google.android.gms.internal.measurement.u, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2364u implements Iterable, InterfaceC2329q {

    /* renamed from: a, reason: collision with root package name */
    private final String f24661a;

    public C2364u(String str) {
        if (str == null) {
            throw new IllegalArgumentException("StringValue cannot be null.");
        }
        this.f24661a = str;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329q
    public final String a() {
        return this.f24661a;
    }

    final /* synthetic */ String c() {
        return this.f24661a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2364u) {
            return this.f24661a.equals(((C2364u) obj).f24661a);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329q
    public final Double f() {
        String str = this.f24661a;
        if (str.isEmpty()) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(str);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329q
    public final Boolean g() {
        return Boolean.valueOf(!this.f24661a.isEmpty());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329q
    public final Iterator h() {
        return new C2346s(this);
    }

    public final int hashCode() {
        return this.f24661a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C2355t(this);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329q
    public final InterfaceC2329q j() {
        return new C2364u(this.f24661a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x056a  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x05be  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0606  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0641  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x032d  */
    @Override // com.google.android.gms.internal.measurement.InterfaceC2329q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC2329q m(String str, Y1 y12, List list) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        char c10;
        C2364u c2364u;
        InterfaceC2329q c2364u2;
        InterfaceC2329q interfaceC2329q;
        int i10;
        String str7;
        int i11;
        int i12;
        int i13;
        int i14;
        Y1 y13;
        int i15;
        if ("charAt".equals(str) || "concat".equals(str) || "hasOwnProperty".equals(str) || "indexOf".equals(str) || "lastIndexOf".equals(str) || "match".equals(str) || "replace".equals(str) || "search".equals(str) || "slice".equals(str) || "split".equals(str) || "substring".equals(str) || "toLowerCase".equals(str) || "toLocaleLowerCase".equals(str) || "toString".equals(str) || "toUpperCase".equals(str)) {
            str2 = "toLocaleUpperCase";
        } else {
            str2 = "toLocaleUpperCase";
            if (!str2.equals(str)) {
                str3 = "hasOwnProperty";
                str4 = "trim";
                if (!str4.equals(str)) {
                    throw new IllegalArgumentException(String.format("%s is not a String function", str));
                }
                switch (str.hashCode()) {
                    case -1789698943:
                        str5 = "charAt";
                        str6 = str3;
                        if (str.equals(str6)) {
                            c10 = 2;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -1776922004:
                        str5 = "charAt";
                        if (str.equals("toString")) {
                            c10 = 14;
                            str6 = str3;
                            break;
                        }
                        str6 = str3;
                        c10 = 65535;
                        break;
                    case -1464939364:
                        str5 = "charAt";
                        if (str.equals("toLocaleLowerCase")) {
                            c10 = '\f';
                            str6 = str3;
                            break;
                        }
                        str6 = str3;
                        c10 = 65535;
                        break;
                    case -1361633751:
                        str5 = "charAt";
                        if (str.equals(str5)) {
                            str6 = str3;
                            c10 = 0;
                            break;
                        }
                        str6 = str3;
                        c10 = 65535;
                        break;
                    case -1354795244:
                        if (str.equals("concat")) {
                            str5 = "charAt";
                            str6 = str3;
                            c10 = 1;
                            break;
                        }
                        str5 = "charAt";
                        str6 = str3;
                        c10 = 65535;
                        break;
                    case -1137582698:
                        if (str.equals("toLowerCase")) {
                            c10 = '\r';
                            str5 = "charAt";
                            str6 = str3;
                            break;
                        }
                        str5 = "charAt";
                        str6 = str3;
                        c10 = 65535;
                        break;
                    case -906336856:
                        if (str.equals("search")) {
                            c10 = 7;
                            str5 = "charAt";
                            str6 = str3;
                            break;
                        }
                        str5 = "charAt";
                        str6 = str3;
                        c10 = 65535;
                        break;
                    case -726908483:
                        if (str.equals(str2)) {
                            c10 = 11;
                            str5 = "charAt";
                            str6 = str3;
                            break;
                        }
                        str5 = "charAt";
                        str6 = str3;
                        c10 = 65535;
                        break;
                    case -467511597:
                        if (str.equals("lastIndexOf")) {
                            c10 = 4;
                            str5 = "charAt";
                            str6 = str3;
                            break;
                        }
                        str5 = "charAt";
                        str6 = str3;
                        c10 = 65535;
                        break;
                    case -399551817:
                        if (str.equals("toUpperCase")) {
                            c10 = 15;
                            str5 = "charAt";
                            str6 = str3;
                            break;
                        }
                        str5 = "charAt";
                        str6 = str3;
                        c10 = 65535;
                        break;
                    case 3568674:
                        if (str.equals(str4)) {
                            c10 = 16;
                            str5 = "charAt";
                            str6 = str3;
                            break;
                        }
                        str5 = "charAt";
                        str6 = str3;
                        c10 = 65535;
                        break;
                    case 103668165:
                        if (str.equals("match")) {
                            c10 = 5;
                            str5 = "charAt";
                            str6 = str3;
                            break;
                        }
                        str5 = "charAt";
                        str6 = str3;
                        c10 = 65535;
                        break;
                    case 109526418:
                        if (str.equals("slice")) {
                            c10 = '\b';
                            str5 = "charAt";
                            str6 = str3;
                            break;
                        }
                        str5 = "charAt";
                        str6 = str3;
                        c10 = 65535;
                        break;
                    case 109648666:
                        if (str.equals("split")) {
                            c10 = '\t';
                            str5 = "charAt";
                            str6 = str3;
                            break;
                        }
                        str5 = "charAt";
                        str6 = str3;
                        c10 = 65535;
                        break;
                    case 530542161:
                        if (str.equals("substring")) {
                            c10 = '\n';
                            str5 = "charAt";
                            str6 = str3;
                            break;
                        }
                        str5 = "charAt";
                        str6 = str3;
                        c10 = 65535;
                        break;
                    case 1094496948:
                        if (str.equals("replace")) {
                            c10 = 6;
                            str5 = "charAt";
                            str6 = str3;
                            break;
                        }
                        str5 = "charAt";
                        str6 = str3;
                        c10 = 65535;
                        break;
                    case 1943291465:
                        if (str.equals("indexOf")) {
                            str5 = "charAt";
                            str6 = str3;
                            c10 = 3;
                            break;
                        }
                        str5 = "charAt";
                        str6 = str3;
                        c10 = 65535;
                        break;
                    default:
                        str5 = "charAt";
                        str6 = str3;
                        c10 = 65535;
                        break;
                }
                switch (c10) {
                    case 0:
                        AbstractC2412z2.c(str5, 1, list);
                        int i16 = !list.isEmpty() ? (int) AbstractC2412z2.i(y12.a((InterfaceC2329q) list.get(0)).f().doubleValue()) : 0;
                        String str8 = this.f24661a;
                        return (i16 < 0 || i16 >= str8.length()) ? InterfaceC2329q.f24627e0 : new C2364u(String.valueOf(str8.charAt(i16)));
                    case 1:
                        c2364u = this;
                        if (!list.isEmpty()) {
                            StringBuilder sb2 = new StringBuilder(c2364u.f24661a);
                            for (int i17 = 0; i17 < list.size(); i17++) {
                                sb2.append(y12.a((InterfaceC2329q) list.get(i17)).a());
                            }
                            c2364u2 = new C2364u(sb2.toString());
                            return c2364u2;
                        }
                        return c2364u;
                    case 2:
                        c2364u = this;
                        AbstractC2412z2.a(str6, 1, list);
                        String str9 = c2364u.f24661a;
                        InterfaceC2329q a10 = y12.a((InterfaceC2329q) list.get(0));
                        if ("length".equals(a10.a())) {
                            interfaceC2329q = InterfaceC2329q.f24625c0;
                        } else {
                            double doubleValue = a10.f().doubleValue();
                            interfaceC2329q = (doubleValue != Math.floor(doubleValue) || (i10 = (int) doubleValue) < 0 || i10 >= str9.length()) ? InterfaceC2329q.f24626d0 : InterfaceC2329q.f24625c0;
                        }
                        return interfaceC2329q;
                    case 3:
                        c2364u = this;
                        AbstractC2412z2.c("indexOf", 2, list);
                        c2364u2 = new C2266j(Double.valueOf(c2364u.f24661a.indexOf(list.size() > 0 ? y12.a((InterfaceC2329q) list.get(0)).a() : "undefined", (int) AbstractC2412z2.i(list.size() >= 2 ? y12.a((InterfaceC2329q) list.get(1)).f().doubleValue() : 0.0d))));
                        return c2364u2;
                    case 4:
                        c2364u = this;
                        AbstractC2412z2.c("lastIndexOf", 2, list);
                        String str10 = c2364u.f24661a;
                        String a11 = list.size() > 0 ? y12.a((InterfaceC2329q) list.get(0)).a() : "undefined";
                        c2364u2 = new C2266j(Double.valueOf(str10.lastIndexOf(a11, (int) (Double.isNaN(list.size() < 2 ? Double.NaN : y12.a((InterfaceC2329q) list.get(1)).f().doubleValue()) ? Double.POSITIVE_INFINITY : AbstractC2412z2.i(r0)))));
                        return c2364u2;
                    case 5:
                        c2364u = this;
                        AbstractC2412z2.c("match", 1, list);
                        Matcher matcher = Pattern.compile(list.size() <= 0 ? BuildConfig.FLAVOR : y12.a((InterfaceC2329q) list.get(0)).a()).matcher(c2364u.f24661a);
                        if (matcher.find()) {
                            c2364u2 = new C2230f(Arrays.asList(new C2364u(matcher.group())));
                            return c2364u2;
                        }
                        interfaceC2329q = InterfaceC2329q.f24621V;
                        return interfaceC2329q;
                    case 6:
                        c2364u = this;
                        AbstractC2412z2.c("replace", 2, list);
                        InterfaceC2329q interfaceC2329q2 = InterfaceC2329q.f24620U;
                        if (!list.isEmpty()) {
                            str7 = y12.a((InterfaceC2329q) list.get(0)).a();
                            if (list.size() > 1) {
                                interfaceC2329q2 = y12.a((InterfaceC2329q) list.get(1));
                            }
                        }
                        String str11 = str7;
                        String str12 = c2364u.f24661a;
                        int indexOf = str12.indexOf(str11);
                        if (indexOf >= 0) {
                            if (interfaceC2329q2 instanceof AbstractC2275k) {
                                i11 = 0;
                                interfaceC2329q2 = ((AbstractC2275k) interfaceC2329q2).b(y12, Arrays.asList(new C2364u(str11), new C2266j(Double.valueOf(indexOf)), c2364u));
                            } else {
                                i11 = 0;
                            }
                            String substring = str12.substring(i11, indexOf);
                            String a12 = interfaceC2329q2.a();
                            String substring2 = str12.substring(indexOf + str11.length());
                            StringBuilder sb3 = new StringBuilder(String.valueOf(substring).length() + String.valueOf(a12).length() + String.valueOf(substring2).length());
                            sb3.append(substring);
                            sb3.append(a12);
                            sb3.append(substring2);
                            c2364u2 = new C2364u(sb3.toString());
                            return c2364u2;
                        }
                        return c2364u;
                    case 7:
                        c2364u = this;
                        AbstractC2412z2.c("search", 1, list);
                        if (Pattern.compile(list.isEmpty() ? "undefined" : y12.a((InterfaceC2329q) list.get(0)).a()).matcher(c2364u.f24661a).find()) {
                            c2364u2 = new C2266j(Double.valueOf(r0.start()));
                            return c2364u2;
                        }
                        interfaceC2329q = new C2266j(Double.valueOf(-1.0d));
                        return interfaceC2329q;
                    case '\b':
                        c2364u = this;
                        AbstractC2412z2.c("slice", 2, list);
                        String str13 = c2364u.f24661a;
                        double i18 = AbstractC2412z2.i(!list.isEmpty() ? y12.a((InterfaceC2329q) list.get(0)).f().doubleValue() : 0.0d);
                        double max = i18 < 0.0d ? Math.max(str13.length() + i18, 0.0d) : Math.min(i18, str13.length());
                        double i19 = AbstractC2412z2.i(list.size() > 1 ? y12.a((InterfaceC2329q) list.get(1)).f().doubleValue() : str13.length());
                        int i20 = (int) max;
                        c2364u2 = new C2364u(str13.substring(i20, Math.max(0, ((int) (i19 < 0.0d ? Math.max(str13.length() + i19, 0.0d) : Math.min(i19, str13.length()))) - i20) + i20));
                        return c2364u2;
                    case '\t':
                        c2364u = this;
                        AbstractC2412z2.c("split", 2, list);
                        String str14 = c2364u.f24661a;
                        if (str14.length() == 0) {
                            interfaceC2329q = new C2230f(Arrays.asList(c2364u));
                        } else {
                            ArrayList arrayList = new ArrayList();
                            if (list.isEmpty()) {
                                arrayList.add(c2364u);
                            } else {
                                String a13 = y12.a((InterfaceC2329q) list.get(0)).a();
                                long h10 = list.size() > 1 ? AbstractC2412z2.h(y12.a((InterfaceC2329q) list.get(1)).f().doubleValue()) : 2147483647L;
                                if (h10 == 0) {
                                    interfaceC2329q = new C2230f();
                                } else {
                                    String[] split = str14.split(Pattern.quote(a13), ((int) h10) + 1);
                                    int length = split.length;
                                    if (!a13.isEmpty() || length <= 0) {
                                        i12 = -1;
                                        i13 = length;
                                        i14 = 0;
                                    } else {
                                        boolean isEmpty = split[0].isEmpty();
                                        i12 = -1;
                                        i13 = length - 1;
                                        i14 = isEmpty;
                                        if (!split[i13].isEmpty()) {
                                            i13 = length;
                                            i14 = isEmpty;
                                        }
                                    }
                                    if (length > h10) {
                                        i13 += i12;
                                    }
                                    while (i14 < i13) {
                                        arrayList.add(new C2364u(split[i14]));
                                        i14++;
                                    }
                                }
                            }
                            interfaceC2329q = new C2230f(arrayList);
                        }
                        return interfaceC2329q;
                    case RequestError.EVENT_TIMEOUT /* 10 */:
                        c2364u = this;
                        AbstractC2412z2.c("substring", 2, list);
                        String str15 = c2364u.f24661a;
                        if (list.isEmpty()) {
                            y13 = y12;
                            i15 = 0;
                        } else {
                            y13 = y12;
                            i15 = (int) AbstractC2412z2.i(y13.a((InterfaceC2329q) list.get(0)).f().doubleValue());
                        }
                        int i21 = list.size() > 1 ? (int) AbstractC2412z2.i(y13.a((InterfaceC2329q) list.get(1)).f().doubleValue()) : str15.length();
                        int min = Math.min(Math.max(i15, 0), str15.length());
                        int min2 = Math.min(Math.max(i21, 0), str15.length());
                        c2364u2 = new C2364u(str15.substring(Math.min(min, min2), Math.max(min, min2)));
                        return c2364u2;
                    case 11:
                        c2364u = this;
                        AbstractC2412z2.a(str2, 0, list);
                        c2364u2 = new C2364u(c2364u.f24661a.toUpperCase());
                        return c2364u2;
                    case '\f':
                        c2364u = this;
                        AbstractC2412z2.a("toLocaleLowerCase", 0, list);
                        c2364u2 = new C2364u(c2364u.f24661a.toLowerCase());
                        return c2364u2;
                    case '\r':
                        c2364u = this;
                        AbstractC2412z2.a("toLowerCase", 0, list);
                        c2364u2 = new C2364u(c2364u.f24661a.toLowerCase(Locale.ENGLISH));
                        return c2364u2;
                    case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                        c2364u = this;
                        AbstractC2412z2.a("toString", 0, list);
                        return c2364u;
                    case HVError.SSL_CONNECT_ERROR /* 15 */:
                        c2364u = this;
                        AbstractC2412z2.a("toUpperCase", 0, list);
                        c2364u2 = new C2364u(c2364u.f24661a.toUpperCase(Locale.ENGLISH));
                        return c2364u2;
                    case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                        AbstractC2412z2.a("toUpperCase", 0, list);
                        c2364u = this;
                        c2364u2 = new C2364u(c2364u.f24661a.trim());
                        return c2364u2;
                    default:
                        throw new IllegalArgumentException("Command not supported");
                }
            }
        }
        str3 = "hasOwnProperty";
        str4 = "trim";
        switch (str.hashCode()) {
            case -1789698943:
                break;
            case -1776922004:
                break;
            case -1464939364:
                break;
            case -1361633751:
                break;
            case -1354795244:
                break;
            case -1137582698:
                break;
            case -906336856:
                break;
            case -726908483:
                break;
            case -467511597:
                break;
            case -399551817:
                break;
            case 3568674:
                break;
            case 103668165:
                break;
            case 109526418:
                break;
            case 109648666:
                break;
            case 530542161:
                break;
            case 1094496948:
                break;
            case 1943291465:
                break;
        }
        switch (c10) {
        }
    }

    public final String toString() {
        String str = this.f24661a;
        StringBuilder sb2 = new StringBuilder(str.length() + 2);
        sb2.append("\"");
        sb2.append(str);
        sb2.append("\"");
        return sb2.toString();
    }
}
