package com.webengage.sdk.android;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
public class w3 {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f31091a = Pattern.compile("(&[a-z]*;|&#x?([a-f]|[A-F]|[0-9])*;|[\\s\n]+)");

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f31092b = Pattern.compile("(&[a-z]*;|&#x?([a-f]|[A-F]|[0-9])*;)");

    /* renamed from: c, reason: collision with root package name */
    private static final Map<String, String> f31093c;

    static {
        HashMap hashMap = new HashMap();
        f31093c = hashMap;
        hashMap.put("&nbsp;", " ");
        hashMap.put("&amp;", "&");
        hashMap.put("&quot;", "\"");
        hashMap.put("&cent;", "¢");
        hashMap.put("&lt;", "<");
        hashMap.put("&gt;", ">");
        hashMap.put("&sect;", "§");
        hashMap.put("&ldquo;", "“");
        hashMap.put("&rdquo;", "”");
        hashMap.put("&lsquo;", "‘");
        hashMap.put("&rsquo;", "’");
        hashMap.put("&ndash;", "–");
        hashMap.put("&mdash;", "—");
        hashMap.put("&horbar;", "―");
    }

    public static String a(String str, boolean z10) {
        Matcher matcher;
        StringBuffer stringBuffer = new StringBuffer();
        HashMap hashMap = new HashMap(f31093c);
        if (z10) {
            matcher = f31092b.matcher(str);
        } else {
            matcher = f31091a.matcher(str);
            hashMap.put(BuildConfig.FLAVOR, " ");
            hashMap.put("\n", " ");
        }
        while (matcher.find()) {
            try {
                matcher.appendReplacement(stringBuffer, a(matcher, hashMap));
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    private static String a(Matcher matcher, Map<String, String> map) {
        Integer valueOf;
        String trim = matcher.group(0).trim();
        String str = map.get(trim);
        if (str != null) {
            return str;
        }
        if (trim.startsWith("&#")) {
            try {
                if (trim.startsWith("&#x")) {
                    valueOf = Integer.decode("0x" + trim.substring(3, trim.length() - 1));
                } else {
                    valueOf = Integer.valueOf(Integer.parseInt(trim.substring(2, trim.length() - 1)));
                }
                return BuildConfig.FLAVOR + ((char) valueOf.intValue());
            } catch (NumberFormatException unused) {
            }
        }
        return BuildConfig.FLAVOR;
    }
}
