package Q3;

import android.icu.util.ULocale;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public class g implements b {

    /* renamed from: a, reason: collision with root package name */
    private ULocale f8148a;

    /* renamed from: b, reason: collision with root package name */
    private ULocale.Builder f8149b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f8150c;

    private g(ULocale uLocale) {
        this.f8149b = null;
        this.f8150c = false;
        this.f8148a = uLocale;
    }

    public static b i() {
        return new g(ULocale.getDefault(ULocale.Category.FORMAT));
    }

    public static b j(String str) {
        return new g(str);
    }

    public static b k(ULocale uLocale) {
        return new g(uLocale);
    }

    private void l() {
        if (this.f8150c) {
            try {
                this.f8148a = this.f8149b.build();
                this.f8150c = false;
            } catch (RuntimeException e10) {
                throw new e(e10.getMessage());
            }
        }
    }

    @Override // Q3.b
    public String a() {
        return h().toLanguageTag();
    }

    @Override // Q3.b
    public HashMap b() {
        l();
        HashMap hashMap = new HashMap();
        Iterator<String> keywords = this.f8148a.getKeywords();
        if (keywords != null) {
            while (keywords.hasNext()) {
                String next = keywords.next();
                hashMap.put(h.b(next), this.f8148a.getKeywordValue(next));
            }
        }
        return hashMap;
    }

    @Override // Q3.b
    public ArrayList c(String str) {
        l();
        String a10 = h.a(str);
        ArrayList arrayList = new ArrayList();
        String keywordValue = this.f8148a.getKeywordValue(a10);
        if (keywordValue != null && !keywordValue.isEmpty()) {
            Collections.addAll(arrayList, keywordValue.split("-|_"));
        }
        return arrayList;
    }

    @Override // Q3.b
    public b e() {
        l();
        return new g(this.f8148a);
    }

    @Override // Q3.b
    public String f() {
        return d().toLanguageTag();
    }

    @Override // Q3.b
    public void g(String str, ArrayList arrayList) {
        l();
        if (this.f8149b == null) {
            this.f8149b = new ULocale.Builder().setLocale(this.f8148a);
        }
        try {
            this.f8149b.setUnicodeLocaleKeyword(str, TextUtils.join("-", arrayList));
            this.f8150c = true;
        } catch (RuntimeException e10) {
            throw new e(e10.getMessage());
        }
    }

    @Override // Q3.b
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public ULocale h() {
        l();
        return this.f8148a;
    }

    @Override // Q3.b
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public ULocale d() {
        l();
        ULocale.Builder builder = new ULocale.Builder();
        builder.setLocale(this.f8148a);
        builder.clearExtensions();
        return builder.build();
    }

    private g(String str) {
        this.f8148a = null;
        this.f8149b = null;
        this.f8150c = false;
        ULocale.Builder builder = new ULocale.Builder();
        this.f8149b = builder;
        try {
            builder.setLanguageTag(str);
            this.f8150c = true;
        } catch (RuntimeException e10) {
            throw new e(e10.getMessage());
        }
    }
}
