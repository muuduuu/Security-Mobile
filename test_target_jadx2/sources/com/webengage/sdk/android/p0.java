package com.webengage.sdk.android;

import com.webengage.sdk.android.utils.DataType;
import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
public class p0 implements Serializable, g1 {

    /* renamed from: b, reason: collision with root package name */
    String f30751b;

    /* renamed from: c, reason: collision with root package name */
    String f30752c;

    /* renamed from: a, reason: collision with root package name */
    Integer f30750a = -1;

    /* renamed from: d, reason: collision with root package name */
    String f30753d = BuildConfig.FLAVOR;

    /* renamed from: e, reason: collision with root package name */
    String f30754e = BuildConfig.FLAVOR;

    /* renamed from: f, reason: collision with root package name */
    String f30755f = BuildConfig.FLAVOR;

    /* renamed from: g, reason: collision with root package name */
    String f30756g = BuildConfig.FLAVOR;

    /* renamed from: h, reason: collision with root package name */
    String f30757h = BuildConfig.FLAVOR;

    /* renamed from: i, reason: collision with root package name */
    Date f30758i = null;

    /* renamed from: j, reason: collision with root package name */
    Map<String, Object> f30759j = null;

    /* renamed from: k, reason: collision with root package name */
    Map<String, Object> f30760k = null;

    /* renamed from: l, reason: collision with root package name */
    Map<String, Object> f30761l = null;

    public String a() {
        return this.f30755f;
    }

    public String b() {
        return this.f30756g;
    }

    public Map<String, Object> c() {
        try {
            return (Map) DataType.cloneInternal(this.f30759j);
        } catch (Exception unused) {
            return null;
        }
    }

    public String d() {
        return this.f30757h;
    }

    public Date e() {
        try {
            return (Date) DataType.cloneInternal(this.f30758i);
        } catch (Exception unused) {
            return null;
        }
    }

    public boolean equals(Object obj) {
        return false;
    }

    public Map<String, Object> f() {
        try {
            return (Map) DataType.cloneInternal(this.f30761l);
        } catch (Exception unused) {
            return null;
        }
    }

    public Integer g() {
        return this.f30750a;
    }

    public String h() {
        return this.f30751b;
    }

    public int hashCode() {
        return (this.f30757h + this.f30753d + this.f30754e + this.f30755f + this.f30758i.toString()).hashCode();
    }

    public String i() {
        return this.f30753d;
    }

    public String j() {
        return this.f30752c;
    }

    public String k() {
        return this.f30754e;
    }

    public Map<String, Object> l() {
        try {
            return (Map) DataType.cloneInternal(this.f30760k);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.webengage.sdk.android.g1
    public Map<String, Object> toMap() {
        HashMap hashMap = new HashMap();
        hashMap.put("license_code", this.f30752c);
        hashMap.put("interface_id", this.f30751b);
        hashMap.put("suid", this.f30754e);
        hashMap.put("luid", this.f30753d);
        hashMap.put("cuid", this.f30755f.isEmpty() ? null : this.f30755f);
        hashMap.put("category", this.f30756g);
        hashMap.put("event_name", this.f30757h);
        hashMap.put("event_time", e());
        hashMap.put("event_data", c());
        hashMap.put("system_data", l());
        return hashMap;
    }

    public String toString() {
        try {
            return DataType.convert(toMap(), DataType.STRING, true).toString();
        } catch (Exception unused) {
            return null;
        }
    }

    public void a(Integer num) {
        this.f30750a = num;
    }

    public void b(String str) {
        this.f30756g = str;
    }

    public void c(String str) {
        this.f30757h = str;
    }

    public void d(String str) {
        this.f30751b = str;
    }

    public void e(String str) {
        this.f30753d = str;
    }

    public void f(String str) {
        this.f30752c = str;
    }

    public void g(String str) {
        this.f30754e = str;
    }

    public void a(String str) {
        this.f30755f = str;
    }

    public void b(Map<String, Object> map) {
        this.f30761l = map;
    }

    public void c(Map<String, Object> map) {
        this.f30760k = map;
    }

    public void a(Date date) {
        this.f30758i = date;
    }

    public void a(Map<String, Object> map) {
        this.f30759j = map;
    }
}
