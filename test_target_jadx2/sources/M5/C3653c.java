package m5;

import android.content.Context;
import com.facebook.react.views.view.j;

/* renamed from: m5.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3653c extends j {

    /* renamed from: a, reason: collision with root package name */
    private int f37384a;

    public C3653c(Context context) {
        super(context);
        this.f37384a = com.facebook.react.modules.i18nmanager.a.f().i(context) ? 1 : 0;
    }

    @Override // android.view.View, android.view.ViewParent
    public int getLayoutDirection() {
        return G4.a.o() ? super.getLayoutDirection() : this.f37384a;
    }

    @Override // com.facebook.react.views.view.j, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        if (getLayoutDirection() == 1) {
            setLeft(0);
            setTop(i11);
            setRight(i12 - i10);
            setBottom(i13);
        }
    }

    @Override // com.facebook.react.views.view.j
    public void setRemoveClippedSubviews(boolean z10) {
        if (getLayoutDirection() == 1) {
            super.setRemoveClippedSubviews(false);
        } else {
            super.setRemoveClippedSubviews(z10);
        }
    }
}
