package com.swmansion.rnscreens;

import android.view.View;
import android.view.ViewParent;
import com.facebook.react.bridge.ReactContext;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import qc.AbstractC3958a;

/* loaded from: classes2.dex */
public final class H extends com.facebook.react.views.view.j {

    /* renamed from: a, reason: collision with root package name */
    private int f29889a;

    /* renamed from: b, reason: collision with root package name */
    private int f29890b;

    /* renamed from: c, reason: collision with root package name */
    private a f29891c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a LEFT = new a("LEFT", 0);
        public static final a CENTER = new a("CENTER", 1);
        public static final a RIGHT = new a("RIGHT", 2);
        public static final a BACK = new a("BACK", 3);
        public static final a SEARCH_BAR = new a("SEARCH_BAR", 4);

        private static final /* synthetic */ a[] $values() {
            return new a[]{LEFT, CENTER, RIGHT, BACK, SEARCH_BAR};
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

    public H(ReactContext reactContext) {
        super(reactContext);
        this.f29891c = a.RIGHT;
    }

    public final F getConfig() {
        ViewParent parent = getParent();
        C2934d c2934d = parent instanceof C2934d ? (C2934d) parent : null;
        if (c2934d != null) {
            return c2934d.getConfig();
        }
        return null;
    }

    public final a getType() {
        return this.f29891c;
    }

    @Override // com.facebook.react.views.view.j, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }

    @Override // com.facebook.react.views.view.j, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (View.MeasureSpec.getMode(i10) == 1073741824 && View.MeasureSpec.getMode(i11) == 1073741824) {
            this.f29889a = View.MeasureSpec.getSize(i10);
            this.f29890b = View.MeasureSpec.getSize(i11);
            Object parent = getParent();
            if (parent != null) {
                forceLayout();
                ((View) parent).requestLayout();
            }
        }
        setMeasuredDimension(this.f29889a, this.f29890b);
    }

    public final void setType(a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f29891c = aVar;
    }
}
