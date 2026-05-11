package com.facebook.react.uimanager.events;

import com.facebook.react.bridge.WritableMap;

/* loaded from: classes.dex */
public abstract class d {
    private static int sUniqueID;
    private b mEventAnimationDriverMatchSpec;
    private boolean mInitialized;
    private int mSurfaceId;
    private long mTimestampMs;
    private int mUniqueID;
    private int mViewTag;

    class a implements b {
        a() {
        }

        @Override // com.facebook.react.uimanager.events.d.b
        public boolean a(int i10, String str) {
            return i10 == d.this.getViewTag() && str.equals(d.this.getEventName());
        }
    }

    public interface b {
        boolean a(int i10, String str);
    }

    protected d() {
        int i10 = sUniqueID;
        sUniqueID = i10 + 1;
        this.mUniqueID = i10;
    }

    public boolean canCoalesce() {
        return true;
    }

    public d coalesce(d dVar) {
        return getTimestampMs() >= dVar.getTimestampMs() ? this : dVar;
    }

    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(getViewTag(), getEventName(), getEventData());
    }

    public void dispatchModern(RCTModernEventEmitter rCTModernEventEmitter) {
        if (getSurfaceId() != -1) {
            rCTModernEventEmitter.receiveEvent(getSurfaceId(), getViewTag(), getEventName(), canCoalesce(), getCoalescingKey(), getEventData(), getEventCategory());
        } else {
            dispatch(rCTModernEventEmitter);
        }
    }

    final void dispose() {
        this.mInitialized = false;
        onDispose();
    }

    protected boolean experimental_isSynchronous() {
        return false;
    }

    public short getCoalescingKey() {
        return (short) 0;
    }

    public b getEventAnimationDriverMatchSpec() {
        if (this.mEventAnimationDriverMatchSpec == null) {
            this.mEventAnimationDriverMatchSpec = new a();
        }
        return this.mEventAnimationDriverMatchSpec;
    }

    protected int getEventCategory() {
        return 2;
    }

    protected WritableMap getEventData() {
        return null;
    }

    public abstract String getEventName();

    public final int getSurfaceId() {
        return this.mSurfaceId;
    }

    public final long getTimestampMs() {
        return this.mTimestampMs;
    }

    public int getUniqueID() {
        return this.mUniqueID;
    }

    public final int getViewTag() {
        return this.mViewTag;
    }

    @Deprecated
    protected void init(int i10) {
        init(-1, i10);
    }

    boolean isInitialized() {
        return this.mInitialized;
    }

    public void onDispose() {
    }

    protected void init(int i10, int i11) {
        init(i10, i11, v4.k.c());
    }

    protected d(int i10) {
        int i11 = sUniqueID;
        sUniqueID = i11 + 1;
        this.mUniqueID = i11;
        init(i10);
    }

    protected void init(int i10, int i11, long j10) {
        this.mSurfaceId = i10;
        this.mViewTag = i11;
        this.mTimestampMs = j10;
        this.mInitialized = true;
    }

    protected d(int i10, int i11) {
        int i12 = sUniqueID;
        sUniqueID = i12 + 1;
        this.mUniqueID = i12;
        init(i10, i11);
    }
}
