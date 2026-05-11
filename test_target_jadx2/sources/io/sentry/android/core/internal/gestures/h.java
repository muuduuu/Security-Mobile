package io.sentry.android.core.internal.gestures;

import android.content.Context;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.GestureDetectorCompat;
import io.sentry.P1;
import io.sentry.g2;

/* loaded from: classes2.dex */
public final class h extends j {

    /* renamed from: b, reason: collision with root package name */
    private final Window.Callback f34881b;

    /* renamed from: c, reason: collision with root package name */
    private final g f34882c;

    /* renamed from: d, reason: collision with root package name */
    private final GestureDetectorCompat f34883d;

    /* renamed from: e, reason: collision with root package name */
    private final P1 f34884e;

    /* renamed from: f, reason: collision with root package name */
    private final b f34885f;

    class a implements b {
        a() {
        }
    }

    interface b {
        default MotionEvent a(MotionEvent motionEvent) {
            return MotionEvent.obtain(motionEvent);
        }
    }

    public h(Window.Callback callback, Context context, g gVar, P1 p12) {
        this(callback, new GestureDetectorCompat(context, gVar), gVar, p12, new a());
    }

    private void b(MotionEvent motionEvent) {
        this.f34883d.a(motionEvent);
        if (motionEvent.getActionMasked() == 1) {
            this.f34882c.n(motionEvent);
        }
    }

    public Window.Callback a() {
        return this.f34881b;
    }

    public void c() {
        this.f34882c.p(g2.CANCELLED);
    }

    @Override // io.sentry.android.core.internal.gestures.j, android.view.Window.Callback
    public /* bridge */ /* synthetic */ boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return super.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // io.sentry.android.core.internal.gestures.j, android.view.Window.Callback
    public /* bridge */ /* synthetic */ boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // io.sentry.android.core.internal.gestures.j, android.view.Window.Callback
    public /* bridge */ /* synthetic */ boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // io.sentry.android.core.internal.gestures.j, android.view.Window.Callback
    public /* bridge */ /* synthetic */ boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // io.sentry.android.core.internal.gestures.j, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null) {
            try {
                b(this.f34885f.a(motionEvent));
            } finally {
                try {
                } finally {
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // io.sentry.android.core.internal.gestures.j, android.view.Window.Callback
    public /* bridge */ /* synthetic */ boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return super.dispatchTrackballEvent(motionEvent);
    }

    @Override // io.sentry.android.core.internal.gestures.j, android.view.Window.Callback
    public /* bridge */ /* synthetic */ void onActionModeFinished(ActionMode actionMode) {
        super.onActionModeFinished(actionMode);
    }

    @Override // io.sentry.android.core.internal.gestures.j, android.view.Window.Callback
    public /* bridge */ /* synthetic */ void onActionModeStarted(ActionMode actionMode) {
        super.onActionModeStarted(actionMode);
    }

    @Override // io.sentry.android.core.internal.gestures.j, android.view.Window.Callback
    public /* bridge */ /* synthetic */ void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // io.sentry.android.core.internal.gestures.j, android.view.Window.Callback
    public /* bridge */ /* synthetic */ void onContentChanged() {
        super.onContentChanged();
    }

    @Override // io.sentry.android.core.internal.gestures.j, android.view.Window.Callback
    public /* bridge */ /* synthetic */ boolean onCreatePanelMenu(int i10, Menu menu) {
        return super.onCreatePanelMenu(i10, menu);
    }

    @Override // io.sentry.android.core.internal.gestures.j, android.view.Window.Callback
    public /* bridge */ /* synthetic */ View onCreatePanelView(int i10) {
        return super.onCreatePanelView(i10);
    }

    @Override // io.sentry.android.core.internal.gestures.j, android.view.Window.Callback
    public /* bridge */ /* synthetic */ void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // io.sentry.android.core.internal.gestures.j, android.view.Window.Callback
    public /* bridge */ /* synthetic */ boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        return super.onMenuItemSelected(i10, menuItem);
    }

    @Override // io.sentry.android.core.internal.gestures.j, android.view.Window.Callback
    public /* bridge */ /* synthetic */ boolean onMenuOpened(int i10, Menu menu) {
        return super.onMenuOpened(i10, menu);
    }

    @Override // io.sentry.android.core.internal.gestures.j, android.view.Window.Callback
    public /* bridge */ /* synthetic */ void onPanelClosed(int i10, Menu menu) {
        super.onPanelClosed(i10, menu);
    }

    @Override // io.sentry.android.core.internal.gestures.j, android.view.Window.Callback
    public /* bridge */ /* synthetic */ boolean onPreparePanel(int i10, View view, Menu menu) {
        return super.onPreparePanel(i10, view, menu);
    }

    @Override // io.sentry.android.core.internal.gestures.j, android.view.Window.Callback
    public /* bridge */ /* synthetic */ boolean onSearchRequested() {
        return super.onSearchRequested();
    }

    @Override // io.sentry.android.core.internal.gestures.j, android.view.Window.Callback
    public /* bridge */ /* synthetic */ void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        super.onWindowAttributesChanged(layoutParams);
    }

    @Override // io.sentry.android.core.internal.gestures.j, android.view.Window.Callback
    public /* bridge */ /* synthetic */ void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
    }

    @Override // io.sentry.android.core.internal.gestures.j, android.view.Window.Callback
    public /* bridge */ /* synthetic */ ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return super.onWindowStartingActionMode(callback);
    }

    h(Window.Callback callback, GestureDetectorCompat gestureDetectorCompat, g gVar, P1 p12, b bVar) {
        super(callback);
        this.f34881b = callback;
        this.f34882c = gVar;
        this.f34884e = p12;
        this.f34883d = gestureDetectorCompat;
        this.f34885f = bVar;
    }

    @Override // io.sentry.android.core.internal.gestures.j, android.view.Window.Callback
    public /* bridge */ /* synthetic */ boolean onSearchRequested(SearchEvent searchEvent) {
        return super.onSearchRequested(searchEvent);
    }

    @Override // io.sentry.android.core.internal.gestures.j, android.view.Window.Callback
    public /* bridge */ /* synthetic */ ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i10) {
        return super.onWindowStartingActionMode(callback, i10);
    }
}
