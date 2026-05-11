package V6;

import android.accounts.Account;
import android.view.View;
import j0.C3477b;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: V6.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1271e {

    /* renamed from: a, reason: collision with root package name */
    private final Account f10927a;

    /* renamed from: b, reason: collision with root package name */
    private final Set f10928b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f10929c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f10930d;

    /* renamed from: e, reason: collision with root package name */
    private final int f10931e;

    /* renamed from: f, reason: collision with root package name */
    private final View f10932f;

    /* renamed from: g, reason: collision with root package name */
    private final String f10933g;

    /* renamed from: h, reason: collision with root package name */
    private final String f10934h;

    /* renamed from: i, reason: collision with root package name */
    private final A7.a f10935i;

    /* renamed from: j, reason: collision with root package name */
    private Integer f10936j;

    /* renamed from: V6.e$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private Account f10937a;

        /* renamed from: b, reason: collision with root package name */
        private C3477b f10938b;

        /* renamed from: c, reason: collision with root package name */
        private String f10939c;

        /* renamed from: d, reason: collision with root package name */
        private String f10940d;

        /* renamed from: e, reason: collision with root package name */
        private final A7.a f10941e = A7.a.f375j;

        public C1271e a() {
            return new C1271e(this.f10937a, this.f10938b, null, 0, null, this.f10939c, this.f10940d, this.f10941e, false);
        }

        public a b(String str) {
            this.f10939c = str;
            return this;
        }

        public final a c(Collection collection) {
            if (this.f10938b == null) {
                this.f10938b = new C3477b();
            }
            this.f10938b.addAll(collection);
            return this;
        }

        public final a d(Account account) {
            this.f10937a = account;
            return this;
        }

        public final a e(String str) {
            this.f10940d = str;
            return this;
        }
    }

    public C1271e(Account account, Set set, Map map, int i10, View view, String str, String str2, A7.a aVar, boolean z10) {
        this.f10927a = account;
        Set emptySet = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        this.f10928b = emptySet;
        map = map == null ? Collections.emptyMap() : map;
        this.f10930d = map;
        this.f10932f = view;
        this.f10931e = i10;
        this.f10933g = str;
        this.f10934h = str2;
        this.f10935i = aVar == null ? A7.a.f375j : aVar;
        HashSet hashSet = new HashSet(emptySet);
        Iterator it = map.values().iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
        this.f10929c = Collections.unmodifiableSet(hashSet);
    }

    public Account a() {
        return this.f10927a;
    }

    public String b() {
        Account account = this.f10927a;
        if (account != null) {
            return account.name;
        }
        return null;
    }

    public Account c() {
        Account account = this.f10927a;
        return account != null ? account : new Account("<<default account>>", "com.google");
    }

    public Set d() {
        return this.f10929c;
    }

    public Set e(S6.a aVar) {
        android.support.v4.media.session.b.a(this.f10930d.get(aVar));
        return this.f10928b;
    }

    public String f() {
        return this.f10933g;
    }

    public Set g() {
        return this.f10928b;
    }

    public final A7.a h() {
        return this.f10935i;
    }

    public final Integer i() {
        return this.f10936j;
    }

    public final String j() {
        return this.f10934h;
    }

    public final Map k() {
        return this.f10930d;
    }

    public final void l(Integer num) {
        this.f10936j = num;
    }
}
