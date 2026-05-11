package d5;

import android.os.Handler;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;

/* renamed from: d5.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2983e {
    private Runnable mCompletionRunnable;
    private boolean mShouldAnimateLayout;
    private final AbstractC2979a mLayoutCreateAnimation = new C2986h();
    private final AbstractC2979a mLayoutUpdateAnimation = new C2989k();
    private final AbstractC2979a mLayoutDeleteAnimation = new C2987i();
    private final SparseArray<InterfaceC2988j> mLayoutHandlers = new SparseArray<>(0);
    private long mMaxAnimationDuration = -1;

    /* renamed from: d5.e$a */
    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Callback f31210a;

        a(Callback callback) {
            this.f31210a = callback;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f31210a.invoke(Boolean.TRUE);
        }
    }

    private void b(View view) {
        view.setClickable(false);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                b(viewGroup.getChildAt(i10));
            }
        }
    }

    private void c(long j10) {
        if (this.mCompletionRunnable != null) {
            Handler uiThreadHandler = UiThreadUtil.getUiThreadHandler();
            uiThreadHandler.removeCallbacks(this.mCompletionRunnable);
            uiThreadHandler.postDelayed(this.mCompletionRunnable, j10);
        }
    }

    public void applyLayoutUpdate(View view, int i10, int i11, int i12, int i13) {
        UiThreadUtil.assertOnUiThread();
        int id2 = view.getId();
        InterfaceC2988j interfaceC2988j = this.mLayoutHandlers.get(id2);
        if (interfaceC2988j != null) {
            interfaceC2988j.a(i10, i11, i12, i13);
            return;
        }
        Animation a10 = ((view.getWidth() == 0 || view.getHeight() == 0) ? this.mLayoutCreateAnimation : this.mLayoutUpdateAnimation).a(view, i10, i11, i12, i13);
        if (a10 instanceof InterfaceC2988j) {
            a10.setAnimationListener(new b(id2));
        } else {
            view.layout(i10, i11, i12 + i10, i13 + i11);
        }
        if (a10 != null) {
            long duration = a10.getDuration();
            if (duration > this.mMaxAnimationDuration) {
                this.mMaxAnimationDuration = duration;
                c(duration);
            }
            view.startAnimation(a10);
        }
    }

    public void deleteView(View view, InterfaceC2984f interfaceC2984f) {
        UiThreadUtil.assertOnUiThread();
        Animation a10 = this.mLayoutDeleteAnimation.a(view, view.getLeft(), view.getTop(), view.getWidth(), view.getHeight());
        if (a10 == null) {
            interfaceC2984f.a();
            return;
        }
        b(view);
        a10.setAnimationListener(new c(interfaceC2984f));
        long duration = a10.getDuration();
        if (duration > this.mMaxAnimationDuration) {
            c(duration);
            this.mMaxAnimationDuration = duration;
        }
        view.startAnimation(a10);
    }

    public void initializeFromConfig(ReadableMap readableMap, Callback callback) {
        if (readableMap == null) {
            reset();
            return;
        }
        this.mShouldAnimateLayout = false;
        int i10 = readableMap.hasKey("duration") ? readableMap.getInt("duration") : 0;
        EnumC2985g enumC2985g = EnumC2985g.CREATE;
        if (readableMap.hasKey(EnumC2985g.toString(enumC2985g))) {
            this.mLayoutCreateAnimation.d(readableMap.getMap(EnumC2985g.toString(enumC2985g)), i10);
            this.mShouldAnimateLayout = true;
        }
        EnumC2985g enumC2985g2 = EnumC2985g.UPDATE;
        if (readableMap.hasKey(EnumC2985g.toString(enumC2985g2))) {
            this.mLayoutUpdateAnimation.d(readableMap.getMap(EnumC2985g.toString(enumC2985g2)), i10);
            this.mShouldAnimateLayout = true;
        }
        EnumC2985g enumC2985g3 = EnumC2985g.DELETE;
        if (readableMap.hasKey(EnumC2985g.toString(enumC2985g3))) {
            this.mLayoutDeleteAnimation.d(readableMap.getMap(EnumC2985g.toString(enumC2985g3)), i10);
            this.mShouldAnimateLayout = true;
        }
        if (!this.mShouldAnimateLayout || callback == null) {
            return;
        }
        this.mCompletionRunnable = new a(callback);
    }

    public void reset() {
        this.mLayoutCreateAnimation.f();
        this.mLayoutUpdateAnimation.f();
        this.mLayoutDeleteAnimation.f();
        this.mCompletionRunnable = null;
        this.mShouldAnimateLayout = false;
        this.mMaxAnimationDuration = -1L;
    }

    public boolean shouldAnimateLayout(View view) {
        if (view == null) {
            return false;
        }
        return (this.mShouldAnimateLayout && view.getParent() != null) || this.mLayoutHandlers.get(view.getId()) != null;
    }

    /* renamed from: d5.e$b */
    class b implements Animation.AnimationListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f31212a;

        b(int i10) {
            this.f31212a = i10;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            C2983e.this.mLayoutHandlers.remove(this.f31212a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            C2983e.this.mLayoutHandlers.put(this.f31212a, (InterfaceC2988j) animation);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }
    }

    /* renamed from: d5.e$c */
    class c implements Animation.AnimationListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2984f f31214a;

        c(InterfaceC2984f interfaceC2984f) {
            this.f31214a = interfaceC2984f;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f31214a.a();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }
}
