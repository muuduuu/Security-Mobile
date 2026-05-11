package com.google.android.gms.auth.api.signin;

import V6.AbstractC1287s;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.util.i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
/* loaded from: classes2.dex */
public class GoogleSignInAccount extends W6.a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new c();

    /* renamed from: n, reason: collision with root package name */
    public static final com.google.android.gms.common.util.f f23229n = i.d();

    /* renamed from: a, reason: collision with root package name */
    final int f23230a;

    /* renamed from: b, reason: collision with root package name */
    private final String f23231b;

    /* renamed from: c, reason: collision with root package name */
    private final String f23232c;

    /* renamed from: d, reason: collision with root package name */
    private final String f23233d;

    /* renamed from: e, reason: collision with root package name */
    private final String f23234e;

    /* renamed from: f, reason: collision with root package name */
    private final Uri f23235f;

    /* renamed from: g, reason: collision with root package name */
    private String f23236g;

    /* renamed from: h, reason: collision with root package name */
    private final long f23237h;

    /* renamed from: i, reason: collision with root package name */
    private final String f23238i;

    /* renamed from: j, reason: collision with root package name */
    final List f23239j;

    /* renamed from: k, reason: collision with root package name */
    private final String f23240k;

    /* renamed from: l, reason: collision with root package name */
    private final String f23241l;

    /* renamed from: m, reason: collision with root package name */
    private final Set f23242m = new HashSet();

    GoogleSignInAccount(int i10, String str, String str2, String str3, String str4, Uri uri, String str5, long j10, String str6, List list, String str7, String str8) {
        this.f23230a = i10;
        this.f23231b = str;
        this.f23232c = str2;
        this.f23233d = str3;
        this.f23234e = str4;
        this.f23235f = uri;
        this.f23236g = str5;
        this.f23237h = j10;
        this.f23238i = str6;
        this.f23239j = list;
        this.f23240k = str7;
        this.f23241l = str8;
    }

    public static GoogleSignInAccount t1(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Long l10, String str7, Set set) {
        return new GoogleSignInAccount(3, str, str2, str3, str4, uri, null, l10.longValue(), AbstractC1287s.g(str7), new ArrayList((Collection) AbstractC1287s.m(set)), str5, str6);
    }

    public static GoogleSignInAccount v1(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl");
        Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            hashSet.add(new Scope(jSONArray.getString(i10)));
        }
        GoogleSignInAccount t12 = t1(jSONObject.optString("id"), jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null, jSONObject.has("email") ? jSONObject.optString("email") : null, jSONObject.has("displayName") ? jSONObject.optString("displayName") : null, jSONObject.has("givenName") ? jSONObject.optString("givenName") : null, jSONObject.has("familyName") ? jSONObject.optString("familyName") : null, parse, Long.valueOf(parseLong), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        t12.f23236g = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return t12;
    }

    public String F() {
        return this.f23241l;
    }

    public String I() {
        return this.f23240k;
    }

    public String Z0() {
        return this.f23231b;
    }

    public String a1() {
        return this.f23232c;
    }

    public final String e2() {
        return this.f23238i;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.f23238i.equals(this.f23238i) && googleSignInAccount.i1().equals(i1());
    }

    public final String f2() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (Z0() != null) {
                jSONObject.put("id", Z0());
            }
            if (a1() != null) {
                jSONObject.put("tokenId", a1());
            }
            if (u() != null) {
                jSONObject.put("email", u());
            }
            if (j() != null) {
                jSONObject.put("displayName", j());
            }
            if (I() != null) {
                jSONObject.put("givenName", I());
            }
            if (F() != null) {
                jSONObject.put("familyName", F());
            }
            Uri g12 = g1();
            if (g12 != null) {
                jSONObject.put("photoUrl", g12.toString());
            }
            if (m1() != null) {
                jSONObject.put("serverAuthCode", m1());
            }
            jSONObject.put("expirationTime", this.f23237h);
            jSONObject.put("obfuscatedIdentifier", this.f23238i);
            JSONArray jSONArray = new JSONArray();
            List list = this.f23239j;
            Scope[] scopeArr = (Scope[]) list.toArray(new Scope[list.size()]);
            Arrays.sort(scopeArr, new Comparator() { // from class: N6.d
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    Parcelable.Creator<GoogleSignInAccount> creator = GoogleSignInAccount.CREATOR;
                    return ((Scope) obj).j().compareTo(((Scope) obj2).j());
                }
            });
            for (Scope scope : scopeArr) {
                jSONArray.put(scope.j());
            }
            jSONObject.put("grantedScopes", jSONArray);
            jSONObject.remove("serverAuthCode");
            return jSONObject.toString();
        } catch (JSONException e10) {
            throw new RuntimeException(e10);
        }
    }

    public Uri g1() {
        return this.f23235f;
    }

    public int hashCode() {
        return ((this.f23238i.hashCode() + 527) * 31) + i1().hashCode();
    }

    public Set i1() {
        HashSet hashSet = new HashSet(this.f23239j);
        hashSet.addAll(this.f23242m);
        return hashSet;
    }

    public String j() {
        return this.f23234e;
    }

    public String m1() {
        return this.f23236g;
    }

    public boolean o1() {
        return f23229n.a() / 1000 >= this.f23237h + (-300);
    }

    public String u() {
        return this.f23233d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = W6.c.a(parcel);
        W6.c.m(parcel, 1, this.f23230a);
        W6.c.u(parcel, 2, Z0(), false);
        W6.c.u(parcel, 3, a1(), false);
        W6.c.u(parcel, 4, u(), false);
        W6.c.u(parcel, 5, j(), false);
        W6.c.s(parcel, 6, g1(), i10, false);
        W6.c.u(parcel, 7, m1(), false);
        W6.c.q(parcel, 8, this.f23237h);
        W6.c.u(parcel, 9, this.f23238i, false);
        W6.c.y(parcel, 10, this.f23239j, false);
        W6.c.u(parcel, 11, I(), false);
        W6.c.u(parcel, 12, F(), false);
        W6.c.b(parcel, a10);
    }

    public Set y0() {
        return new HashSet(this.f23239j);
    }
}
