package com.webengage.sdk.android;

import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
public class j3 {

    /* renamed from: a, reason: collision with root package name */
    private Integer f30668a;

    /* renamed from: b, reason: collision with root package name */
    private Float f30669b;

    /* renamed from: c, reason: collision with root package name */
    private final a f30670c;

    public enum a {
        PX,
        EM,
        PERCENTAGE,
        PT
    }

    public j3(float f10, a aVar) {
        this.f30669b = Float.valueOf(f10);
        this.f30670c = aVar;
    }

    public float a() {
        return this.f30669b.floatValue();
    }

    public int b() {
        return this.f30668a.intValue();
    }

    public a c() {
        return this.f30670c;
    }

    public String toString() {
        StringBuilder sb2;
        Object obj;
        if (this.f30668a != null) {
            sb2 = new StringBuilder();
            sb2.append(BuildConfig.FLAVOR);
            obj = this.f30668a;
        } else {
            sb2 = new StringBuilder();
            sb2.append(BuildConfig.FLAVOR);
            obj = this.f30669b;
        }
        sb2.append(obj);
        sb2.append(this.f30670c);
        return sb2.toString();
    }

    public j3(int i10) {
        this.f30670c = a.PX;
        this.f30668a = Integer.valueOf(i10);
    }

    public static j3 a(String str) {
        StringBuilder sb2;
        if (str.equals("0")) {
            return new j3(0.0f, a.EM);
        }
        String replaceAll = str.replaceAll("\\s+", BuildConfig.FLAVOR);
        String substring = replaceAll.substring(0, replaceAll.length() - 2);
        if (replaceAll.endsWith("px")) {
            try {
                return new j3(Integer.parseInt(substring));
            } catch (NumberFormatException unused) {
                sb2 = new StringBuilder();
            }
        } else if (replaceAll.endsWith("pt")) {
            try {
                return new j3(Integer.parseInt(substring), a.PT);
            } catch (NumberFormatException unused2) {
                sb2 = new StringBuilder();
            }
        } else if (replaceAll.endsWith("%")) {
            try {
                return new j3(Integer.parseInt(replaceAll.substring(0, replaceAll.length() - 1)) / 100.0f, a.PERCENTAGE);
            } catch (NumberFormatException unused3) {
                sb2 = new StringBuilder();
                sb2.append("Can't parse font-size: ");
            }
        } else {
            if (!replaceAll.endsWith("em")) {
                return null;
            }
            try {
                return new j3(Float.parseFloat(substring), a.EM);
            } catch (NumberFormatException unused4) {
                sb2 = new StringBuilder();
            }
        }
        sb2.append("Can't parse value: ");
        sb2.append(replaceAll);
        Logger.e("WebEngage", sb2.toString());
        return null;
    }

    public j3(int i10, a aVar) {
        this.f30670c = aVar;
        this.f30668a = Integer.valueOf(i10);
    }

    public void a(Integer num) {
        this.f30668a = num;
    }
}
