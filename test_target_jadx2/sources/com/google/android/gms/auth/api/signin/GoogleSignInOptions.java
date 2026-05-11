package com.google.android.gms.auth.api.signin;

import S6.a;
import V6.AbstractC1287s;
import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
/* loaded from: classes2.dex */
public class GoogleSignInOptions extends W6.a implements a.d, ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR;

    /* renamed from: l, reason: collision with root package name */
    public static final GoogleSignInOptions f23243l;

    /* renamed from: m, reason: collision with root package name */
    public static final GoogleSignInOptions f23244m;

    /* renamed from: n, reason: collision with root package name */
    public static final Scope f23245n = new Scope("profile");

    /* renamed from: o, reason: collision with root package name */
    public static final Scope f23246o = new Scope("email");

    /* renamed from: p, reason: collision with root package name */
    public static final Scope f23247p = new Scope("openid");

    /* renamed from: q, reason: collision with root package name */
    public static final Scope f23248q;

    /* renamed from: r, reason: collision with root package name */
    public static final Scope f23249r;

    /* renamed from: s, reason: collision with root package name */
    private static final Comparator f23250s;

    /* renamed from: a, reason: collision with root package name */
    final int f23251a;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList f23252b;

    /* renamed from: c, reason: collision with root package name */
    private Account f23253c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f23254d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f23255e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f23256f;

    /* renamed from: g, reason: collision with root package name */
    private String f23257g;

    /* renamed from: h, reason: collision with root package name */
    private String f23258h;

    /* renamed from: i, reason: collision with root package name */
    private ArrayList f23259i;

    /* renamed from: j, reason: collision with root package name */
    private String f23260j;

    /* renamed from: k, reason: collision with root package name */
    private Map f23261k;

    static {
        Scope scope = new Scope("https://www.googleapis.com/auth/games_lite");
        f23248q = scope;
        f23249r = new Scope("https://www.googleapis.com/auth/games");
        a aVar = new a();
        aVar.b();
        aVar.d();
        f23243l = aVar.a();
        a aVar2 = new a();
        aVar2.e(scope, new Scope[0]);
        f23244m = aVar2.a();
        CREATOR = new e();
        f23250s = new d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Map l2(List list) {
        HashMap hashMap = new HashMap();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                O6.a aVar = (O6.a) it.next();
                hashMap.put(Integer.valueOf(aVar.j()), aVar);
            }
        }
        return hashMap;
    }

    public static GoogleSignInOptions m1(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            hashSet.add(new Scope(jSONArray.getString(i10)));
        }
        String optString = jSONObject.has("accountName") ? jSONObject.optString("accountName") : null;
        return new GoogleSignInOptions(3, new ArrayList(hashSet), !TextUtils.isEmpty(optString) ? new Account(optString, "com.google") : null, jSONObject.getBoolean("idTokenRequested"), jSONObject.getBoolean("serverAuthRequested"), jSONObject.getBoolean("forceCodeForRefreshToken"), jSONObject.has("serverClientId") ? jSONObject.optString("serverClientId") : null, jSONObject.has("hostedDomain") ? jSONObject.optString("hostedDomain") : null, new HashMap(), (String) null);
    }

    public String F() {
        return this.f23260j;
    }

    public ArrayList I() {
        return new ArrayList(this.f23252b);
    }

    public boolean Z0() {
        return this.f23256f;
    }

    public boolean a1() {
        return this.f23254d;
    }

    public final String e2() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            Collections.sort(this.f23252b, f23250s);
            Iterator it = this.f23252b.iterator();
            while (it.hasNext()) {
                jSONArray.put(((Scope) it.next()).j());
            }
            jSONObject.put("scopes", jSONArray);
            Account account = this.f23253c;
            if (account != null) {
                jSONObject.put("accountName", account.name);
            }
            jSONObject.put("idTokenRequested", this.f23254d);
            jSONObject.put("forceCodeForRefreshToken", this.f23256f);
            jSONObject.put("serverAuthRequested", this.f23255e);
            if (!TextUtils.isEmpty(this.f23257g)) {
                jSONObject.put("serverClientId", this.f23257g);
            }
            if (!TextUtils.isEmpty(this.f23258h)) {
                jSONObject.put("hostedDomain", this.f23258h);
            }
            return jSONObject.toString();
        } catch (JSONException e10) {
            throw new RuntimeException(e10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0048, code lost:
    
        if (r1.equals(r4.j()) != false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
            if (this.f23259i.isEmpty() && googleSignInOptions.f23259i.isEmpty() && this.f23252b.size() == googleSignInOptions.I().size() && this.f23252b.containsAll(googleSignInOptions.I())) {
                Account account = this.f23253c;
                if (account == null) {
                    if (googleSignInOptions.j() == null) {
                    }
                }
                if (TextUtils.isEmpty(this.f23257g)) {
                    if (TextUtils.isEmpty(googleSignInOptions.y0())) {
                    }
                } else if (!this.f23257g.equals(googleSignInOptions.y0())) {
                }
                if (this.f23256f == googleSignInOptions.Z0() && this.f23254d == googleSignInOptions.a1() && this.f23255e == googleSignInOptions.g1()) {
                    if (TextUtils.equals(this.f23260j, googleSignInOptions.F())) {
                        return true;
                    }
                }
            }
        } catch (ClassCastException unused) {
        }
        return false;
    }

    public boolean g1() {
        return this.f23255e;
    }

    public int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f23252b;
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(((Scope) arrayList2.get(i10)).j());
        }
        Collections.sort(arrayList);
        O6.b bVar = new O6.b();
        bVar.a(arrayList);
        bVar.a(this.f23253c);
        bVar.a(this.f23257g);
        bVar.c(this.f23256f);
        bVar.c(this.f23254d);
        bVar.c(this.f23255e);
        bVar.a(this.f23260j);
        return bVar.b();
    }

    public Account j() {
        return this.f23253c;
    }

    public ArrayList u() {
        return this.f23259i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f23251a;
        int a10 = W6.c.a(parcel);
        W6.c.m(parcel, 1, i11);
        W6.c.y(parcel, 2, I(), false);
        W6.c.s(parcel, 3, j(), i10, false);
        W6.c.c(parcel, 4, a1());
        W6.c.c(parcel, 5, g1());
        W6.c.c(parcel, 6, Z0());
        W6.c.u(parcel, 7, y0(), false);
        W6.c.u(parcel, 8, this.f23258h, false);
        W6.c.y(parcel, 9, u(), false);
        W6.c.u(parcel, 10, F(), false);
        W6.c.b(parcel, a10);
    }

    public String y0() {
        return this.f23257g;
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private Set f23262a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f23263b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f23264c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f23265d;

        /* renamed from: e, reason: collision with root package name */
        private String f23266e;

        /* renamed from: f, reason: collision with root package name */
        private Account f23267f;

        /* renamed from: g, reason: collision with root package name */
        private String f23268g;

        /* renamed from: h, reason: collision with root package name */
        private Map f23269h;

        /* renamed from: i, reason: collision with root package name */
        private String f23270i;

        public a() {
            this.f23262a = new HashSet();
            this.f23269h = new HashMap();
        }

        private final String j(String str) {
            AbstractC1287s.g(str);
            String str2 = this.f23266e;
            boolean z10 = true;
            if (str2 != null && !str2.equals(str)) {
                z10 = false;
            }
            AbstractC1287s.b(z10, "two different server client ids provided");
            return str;
        }

        public GoogleSignInOptions a() {
            if (this.f23262a.contains(GoogleSignInOptions.f23249r)) {
                Set set = this.f23262a;
                Scope scope = GoogleSignInOptions.f23248q;
                if (set.contains(scope)) {
                    this.f23262a.remove(scope);
                }
            }
            if (this.f23265d && (this.f23267f == null || !this.f23262a.isEmpty())) {
                b();
            }
            return new GoogleSignInOptions(new ArrayList(this.f23262a), this.f23267f, this.f23265d, this.f23263b, this.f23264c, this.f23266e, this.f23268g, this.f23269h, this.f23270i);
        }

        public a b() {
            this.f23262a.add(GoogleSignInOptions.f23247p);
            return this;
        }

        public a c(String str) {
            this.f23265d = true;
            j(str);
            this.f23266e = str;
            return this;
        }

        public a d() {
            this.f23262a.add(GoogleSignInOptions.f23245n);
            return this;
        }

        public a e(Scope scope, Scope... scopeArr) {
            this.f23262a.add(scope);
            this.f23262a.addAll(Arrays.asList(scopeArr));
            return this;
        }

        public a f(String str, boolean z10) {
            this.f23263b = true;
            j(str);
            this.f23266e = str;
            this.f23264c = z10;
            return this;
        }

        public a g(String str) {
            this.f23267f = new Account(AbstractC1287s.g(str), "com.google");
            return this;
        }

        public a h(String str) {
            this.f23268g = AbstractC1287s.g(str);
            return this;
        }

        public a i(String str) {
            this.f23270i = str;
            return this;
        }

        public a(GoogleSignInOptions googleSignInOptions) {
            this.f23262a = new HashSet();
            this.f23269h = new HashMap();
            AbstractC1287s.m(googleSignInOptions);
            this.f23262a = new HashSet(googleSignInOptions.f23252b);
            this.f23263b = googleSignInOptions.f23255e;
            this.f23264c = googleSignInOptions.f23256f;
            this.f23265d = googleSignInOptions.f23254d;
            this.f23266e = googleSignInOptions.f23257g;
            this.f23267f = googleSignInOptions.f23253c;
            this.f23268g = googleSignInOptions.f23258h;
            this.f23269h = GoogleSignInOptions.l2(googleSignInOptions.f23259i);
            this.f23270i = googleSignInOptions.f23260j;
        }
    }

    GoogleSignInOptions(int i10, ArrayList arrayList, Account account, boolean z10, boolean z11, boolean z12, String str, String str2, ArrayList arrayList2, String str3) {
        this(i10, arrayList, account, z10, z11, z12, str, str2, l2(arrayList2), str3);
    }

    private GoogleSignInOptions(int i10, ArrayList arrayList, Account account, boolean z10, boolean z11, boolean z12, String str, String str2, Map map, String str3) {
        this.f23251a = i10;
        this.f23252b = arrayList;
        this.f23253c = account;
        this.f23254d = z10;
        this.f23255e = z11;
        this.f23256f = z12;
        this.f23257g = str;
        this.f23258h = str2;
        this.f23259i = new ArrayList(map.values());
        this.f23261k = map;
        this.f23260j = str3;
    }
}
