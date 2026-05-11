package com.facebook.react.fabric;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/facebook/react/fabric/SynchronousEvent;", BuildConfig.FLAVOR, "surfaceId", BuildConfig.FLAVOR, "viewTag", "eventName", BuildConfig.FLAVOR, "(IILjava/lang/String;)V", "getEventName", "()Ljava/lang/String;", "getSurfaceId", "()I", "getViewTag", "component1", "component2", "component3", "copy", "equals", BuildConfig.FLAVOR, "other", "hashCode", "toString", "ReactAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class SynchronousEvent {
    private final String eventName;
    private final int surfaceId;
    private final int viewTag;

    public SynchronousEvent(int i10, int i11, String eventName) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        this.surfaceId = i10;
        this.viewTag = i11;
        this.eventName = eventName;
    }

    public static /* synthetic */ SynchronousEvent copy$default(SynchronousEvent synchronousEvent, int i10, int i11, String str, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = synchronousEvent.surfaceId;
        }
        if ((i12 & 2) != 0) {
            i11 = synchronousEvent.viewTag;
        }
        if ((i12 & 4) != 0) {
            str = synchronousEvent.eventName;
        }
        return synchronousEvent.copy(i10, i11, str);
    }

    /* renamed from: component1, reason: from getter */
    public final int getSurfaceId() {
        return this.surfaceId;
    }

    /* renamed from: component2, reason: from getter */
    public final int getViewTag() {
        return this.viewTag;
    }

    /* renamed from: component3, reason: from getter */
    public final String getEventName() {
        return this.eventName;
    }

    public final SynchronousEvent copy(int surfaceId, int viewTag, String eventName) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        return new SynchronousEvent(surfaceId, viewTag, eventName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SynchronousEvent)) {
            return false;
        }
        SynchronousEvent synchronousEvent = (SynchronousEvent) other;
        return this.surfaceId == synchronousEvent.surfaceId && this.viewTag == synchronousEvent.viewTag && Intrinsics.b(this.eventName, synchronousEvent.eventName);
    }

    public final String getEventName() {
        return this.eventName;
    }

    public final int getSurfaceId() {
        return this.surfaceId;
    }

    public final int getViewTag() {
        return this.viewTag;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.surfaceId) * 31) + Integer.hashCode(this.viewTag)) * 31) + this.eventName.hashCode();
    }

    public String toString() {
        return "SynchronousEvent(surfaceId=" + this.surfaceId + ", viewTag=" + this.viewTag + ", eventName=" + this.eventName + ")";
    }
}
