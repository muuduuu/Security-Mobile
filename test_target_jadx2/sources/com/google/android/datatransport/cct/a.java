package com.google.android.datatransport.cct;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import org.conscrypt.BuildConfig;
import s6.C4317c;
import u6.g;

/* loaded from: classes2.dex */
public final class a implements g {

    /* renamed from: c, reason: collision with root package name */
    static final String f23197c;

    /* renamed from: d, reason: collision with root package name */
    static final String f23198d;

    /* renamed from: e, reason: collision with root package name */
    private static final String f23199e;

    /* renamed from: f, reason: collision with root package name */
    private static final Set f23200f;

    /* renamed from: g, reason: collision with root package name */
    public static final a f23201g;

    /* renamed from: h, reason: collision with root package name */
    public static final a f23202h;

    /* renamed from: a, reason: collision with root package name */
    private final String f23203a;

    /* renamed from: b, reason: collision with root package name */
    private final String f23204b;

    static {
        String a10 = e.a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f23197c = a10;
        String a11 = e.a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        f23198d = a11;
        String a12 = e.a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f23199e = a12;
        f23200f = Collections.unmodifiableSet(new HashSet(Arrays.asList(C4317c.b("proto"), C4317c.b("json"))));
        f23201g = new a(a10, null);
        f23202h = new a(a11, a12);
    }

    public a(String str, String str2) {
        this.f23203a = str;
        this.f23204b = str2;
    }

    public static a c(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (!str.startsWith("1$")) {
            throw new IllegalArgumentException("Version marker missing from extras");
        }
        String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
        if (split.length != 2) {
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        String str2 = split[0];
        if (str2.isEmpty()) {
            throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
        }
        String str3 = split[1];
        if (str3.isEmpty()) {
            str3 = null;
        }
        return new a(str2, str3);
    }

    @Override // u6.g
    public Set a() {
        return f23200f;
    }

    public byte[] b() {
        String str = this.f23204b;
        if (str == null && this.f23203a == null) {
            return null;
        }
        String str2 = this.f23203a;
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        return String.format("%s%s%s%s", "1$", str2, "\\", str).getBytes(Charset.forName("UTF-8"));
    }

    public String d() {
        return this.f23204b;
    }

    public String e() {
        return this.f23203a;
    }

    @Override // u6.f
    public byte[] getExtras() {
        return b();
    }

    @Override // u6.f
    public String getName() {
        return "cct";
    }
}
