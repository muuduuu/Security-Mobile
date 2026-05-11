package com.swmansion.rnscreens;

import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import androidx.appcompat.widget.SearchView;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.L0;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.swmansion.rnscreens.H;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;
import qc.AbstractC3958a;

/* loaded from: classes2.dex */
public final class T extends com.facebook.react.views.view.j {

    /* renamed from: a, reason: collision with root package name */
    private b f29919a;

    /* renamed from: b, reason: collision with root package name */
    private a f29920b;

    /* renamed from: c, reason: collision with root package name */
    private Integer f29921c;

    /* renamed from: d, reason: collision with root package name */
    private Integer f29922d;

    /* renamed from: e, reason: collision with root package name */
    private Integer f29923e;

    /* renamed from: f, reason: collision with root package name */
    private Integer f29924f;

    /* renamed from: g, reason: collision with root package name */
    private String f29925g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f29926h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f29927i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f29928j;

    /* renamed from: k, reason: collision with root package name */
    private U f29929k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f29930l;

    /* renamed from: m, reason: collision with root package name */
    private final int f29931m;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a NONE = new a("NONE", 0);
        public static final a WORDS = new a("WORDS", 1);
        public static final a SENTENCES = new a("SENTENCES", 2);
        public static final a CHARACTERS = new a("CHARACTERS", 3);

        private static final /* synthetic */ a[] $values() {
            return new a[]{NONE, WORDS, SENTENCES, CHARACTERS};
        }

        static {
            a[] $values = $values();
            $VALUES = $values;
            $ENTRIES = AbstractC3958a.a($values);
        }

        private a(String str, int i10) {
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b TEXT = new d("TEXT", 0);
        public static final b PHONE = new c("PHONE", 1);
        public static final b NUMBER = new C0439b("NUMBER", 2);
        public static final b EMAIL = new a("EMAIL", 3);

        static final class a extends b {
            a(String str, int i10) {
                super(str, i10, null);
            }

            @Override // com.swmansion.rnscreens.T.b
            public int toAndroidInputType(a capitalize) {
                Intrinsics.checkNotNullParameter(capitalize, "capitalize");
                return 32;
            }
        }

        /* renamed from: com.swmansion.rnscreens.T$b$b, reason: collision with other inner class name */
        static final class C0439b extends b {
            C0439b(String str, int i10) {
                super(str, i10, null);
            }

            @Override // com.swmansion.rnscreens.T.b
            public int toAndroidInputType(a capitalize) {
                Intrinsics.checkNotNullParameter(capitalize, "capitalize");
                return 2;
            }
        }

        static final class c extends b {
            c(String str, int i10) {
                super(str, i10, null);
            }

            @Override // com.swmansion.rnscreens.T.b
            public int toAndroidInputType(a capitalize) {
                Intrinsics.checkNotNullParameter(capitalize, "capitalize");
                return 3;
            }
        }

        static final class d extends b {

            public /* synthetic */ class a {

                /* renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f29932a;

                static {
                    int[] iArr = new int[a.values().length];
                    try {
                        iArr[a.NONE.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[a.WORDS.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[a.SENTENCES.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[a.CHARACTERS.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    f29932a = iArr;
                }
            }

            d(String str, int i10) {
                super(str, i10, null);
            }

            @Override // com.swmansion.rnscreens.T.b
            public int toAndroidInputType(a capitalize) {
                Intrinsics.checkNotNullParameter(capitalize, "capitalize");
                int i10 = a.f29932a[capitalize.ordinal()];
                if (i10 == 1) {
                    return 1;
                }
                if (i10 == 2) {
                    return 8192;
                }
                if (i10 == 3) {
                    return 16384;
                }
                if (i10 == 4) {
                    return 4096;
                }
                throw new lc.m();
            }
        }

        private static final /* synthetic */ b[] $values() {
            return new b[]{TEXT, PHONE, NUMBER, EMAIL};
        }

        static {
            b[] $values = $values();
            $VALUES = $values;
            $ENTRIES = AbstractC3958a.a($values);
        }

        public /* synthetic */ b(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i10);
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }

        public abstract int toAndroidInputType(a aVar);

        private b(String str, int i10) {
        }
    }

    static final class c extends xc.m implements Function1 {
        c() {
            super(1);
        }

        public final void a(C2933c newSearchView) {
            C screenStackFragment;
            C2933c searchView;
            Intrinsics.checkNotNullParameter(newSearchView, "newSearchView");
            if (T.this.f29929k == null) {
                T.this.f29929k = new U(newSearchView);
            }
            T.this.P();
            if (!T.this.getAutoFocus() || (screenStackFragment = T.this.getScreenStackFragment()) == null || (searchView = screenStackFragment.getSearchView()) == null) {
                return;
            }
            searchView.r0();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C2933c) obj);
            return Unit.f36324a;
        }
    }

    public static final class d implements SearchView.m {
        d() {
        }

        @Override // androidx.appcompat.widget.SearchView.m
        public boolean g(String str) {
            T.this.H(str);
            return true;
        }

        @Override // androidx.appcompat.widget.SearchView.m
        public boolean i(String str) {
            T.this.I(str);
            return true;
        }
    }

    public T(ReactContext reactContext) {
        super(reactContext);
        this.f29919a = b.TEXT;
        this.f29920b = a.NONE;
        this.f29925g = BuildConfig.FLAVOR;
        this.f29926h = true;
        this.f29928j = true;
        this.f29931m = L0.f(this);
    }

    private final void C() {
        L(new ha.m(this.f29931m, getId()));
        setToolbarElementsVisibility(0);
    }

    private final void D(boolean z10) {
        L(z10 ? new ha.n(this.f29931m, getId()) : new ha.k(this.f29931m, getId()));
    }

    private final void F() {
        L(new ha.o(this.f29931m, getId()));
        setToolbarElementsVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H(String str) {
        L(new ha.l(this.f29931m, getId(), str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I(String str) {
        L(new ha.p(this.f29931m, getId(), str));
    }

    private final void L(com.facebook.react.uimanager.events.d dVar) {
        Context context = getContext();
        Intrinsics.e(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        EventDispatcher c10 = L0.c((ReactContext) context, getId());
        if (c10 != null) {
            c10.c(dVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M(T this$0, View view, boolean z10) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.D(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean N(T this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.C();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(T this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.F();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P() {
        C screenStackFragment = getScreenStackFragment();
        C2933c searchView = screenStackFragment != null ? screenStackFragment.getSearchView() : null;
        if (searchView != null) {
            if (!this.f29930l) {
                setSearchViewListeners(searchView);
                this.f29930l = true;
            }
            searchView.setInputType(this.f29919a.toAndroidInputType(this.f29920b));
            U u10 = this.f29929k;
            if (u10 != null) {
                u10.h(this.f29921c);
            }
            U u11 = this.f29929k;
            if (u11 != null) {
                u11.i(this.f29922d);
            }
            U u12 = this.f29929k;
            if (u12 != null) {
                u12.e(this.f29923e);
            }
            U u13 = this.f29929k;
            if (u13 != null) {
                u13.f(this.f29924f);
            }
            U u14 = this.f29929k;
            if (u14 != null) {
                u14.g(this.f29925g, this.f29928j);
            }
            searchView.setOverrideBackAction(this.f29926h);
        }
    }

    private final F getHeaderConfig() {
        ViewParent parent = getParent();
        if (parent instanceof H) {
            return ((H) parent).getConfig();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C getScreenStackFragment() {
        F headerConfig = getHeaderConfig();
        if (headerConfig != null) {
            return headerConfig.getScreenFragment();
        }
        return null;
    }

    private final void setSearchViewListeners(SearchView searchView) {
        searchView.setOnQueryTextListener(new d());
        searchView.setOnQueryTextFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.swmansion.rnscreens.P
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                T.M(T.this, view, z10);
            }
        });
        searchView.setOnCloseListener(new SearchView.l() { // from class: com.swmansion.rnscreens.Q
            @Override // androidx.appcompat.widget.SearchView.l
            public final boolean a() {
                boolean N10;
                N10 = T.N(T.this);
                return N10;
            }
        });
        searchView.setOnSearchClickListener(new View.OnClickListener() { // from class: com.swmansion.rnscreens.S
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                T.O(T.this, view);
            }
        });
    }

    private final void setToolbarElementsVisibility(int i10) {
        int i11 = 0;
        int configSubviewsCount = getHeaderConfig() != null ? r0.getConfigSubviewsCount() - 1 : 0;
        if (configSubviewsCount < 0) {
            return;
        }
        while (true) {
            F headerConfig = getHeaderConfig();
            H g10 = headerConfig != null ? headerConfig.g(i11) : null;
            if ((g10 != null ? g10.getType() : null) != H.a.SEARCH_BAR && g10 != null) {
                g10.setVisibility(i10);
            }
            if (i11 == configSubviewsCount) {
                return;
            } else {
                i11++;
            }
        }
    }

    public final void A() {
        C2933c searchView;
        C screenStackFragment = getScreenStackFragment();
        if (screenStackFragment == null || (searchView = screenStackFragment.getSearchView()) == null) {
            return;
        }
        searchView.clearFocus();
    }

    public final void B() {
        C2933c searchView;
        C screenStackFragment = getScreenStackFragment();
        if (screenStackFragment == null || (searchView = screenStackFragment.getSearchView()) == null) {
            return;
        }
        searchView.q0();
    }

    public final void E() {
        C2933c searchView;
        C screenStackFragment = getScreenStackFragment();
        if (screenStackFragment == null || (searchView = screenStackFragment.getSearchView()) == null) {
            return;
        }
        searchView.r0();
    }

    public final void G(String str) {
        C screenStackFragment;
        C2933c searchView;
        if (str == null || (screenStackFragment = getScreenStackFragment()) == null || (searchView = screenStackFragment.getSearchView()) == null) {
            return;
        }
        searchView.setText(str);
    }

    public final void J(boolean z10) {
    }

    public final void K() {
        P();
    }

    public final a getAutoCapitalize() {
        return this.f29920b;
    }

    public final boolean getAutoFocus() {
        return this.f29927i;
    }

    public final Integer getHeaderIconColor() {
        return this.f29923e;
    }

    public final Integer getHintTextColor() {
        return this.f29924f;
    }

    public final b getInputType() {
        return this.f29919a;
    }

    public final String getPlaceholder() {
        return this.f29925g;
    }

    public final boolean getShouldOverrideBackButton() {
        return this.f29926h;
    }

    public final boolean getShouldShowHintSearchIcon() {
        return this.f29928j;
    }

    public final Integer getTextColor() {
        return this.f29921c;
    }

    public final Integer getTintColor() {
        return this.f29922d;
    }

    @Override // com.facebook.react.views.view.j, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C screenStackFragment = getScreenStackFragment();
        if (screenStackFragment == null) {
            return;
        }
        screenStackFragment.g0(new c());
    }

    public final void setAutoCapitalize(a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f29920b = aVar;
    }

    public final void setAutoFocus(boolean z10) {
        this.f29927i = z10;
    }

    public final void setHeaderIconColor(Integer num) {
        this.f29923e = num;
    }

    public final void setHintTextColor(Integer num) {
        this.f29924f = num;
    }

    public final void setInputType(b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<set-?>");
        this.f29919a = bVar;
    }

    public final void setPlaceholder(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f29925g = str;
    }

    public final void setShouldOverrideBackButton(boolean z10) {
        this.f29926h = z10;
    }

    public final void setShouldShowHintSearchIcon(boolean z10) {
        this.f29928j = z10;
    }

    public final void setTextColor(Integer num) {
        this.f29921c = num;
    }

    public final void setTintColor(Integer num) {
        this.f29922d = num;
    }
}
