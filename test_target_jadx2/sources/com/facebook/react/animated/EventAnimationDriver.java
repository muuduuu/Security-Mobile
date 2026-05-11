package com.facebook.react.animated;

import co.hyperverge.hypersnapsdk.analytics.mixpanel.Keys;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.UnexpectedNativeTypeException;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTModernEventEmitter;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J1\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0014J'\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u0018\u0010\u001cJI\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010 \u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010!R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\"R\u0016\u0010\u0005\u001a\u00020\u00048\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010#R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010$R\u0016\u0010\t\u001a\u00020\b8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\t\u0010%¨\u0006&"}, d2 = {"Lcom/facebook/react/animated/EventAnimationDriver;", "Lcom/facebook/react/uimanager/events/RCTModernEventEmitter;", BuildConfig.FLAVOR, "eventName", BuildConfig.FLAVOR, "viewTag", BuildConfig.FLAVOR, "eventPath", "Lcom/facebook/react/animated/x;", "valueNode", "<init>", "(Ljava/lang/String;ILjava/util/List;Lcom/facebook/react/animated/x;)V", "targetReactTag", "Lcom/facebook/react/bridge/WritableMap;", Keys.EVENT, BuildConfig.FLAVOR, "receiveEvent", "(ILjava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V", "surfaceId", "targetTag", "(IILjava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V", "Lcom/facebook/react/bridge/WritableArray;", "touches", "changedIndices", "receiveTouches", "(Ljava/lang/String;Lcom/facebook/react/bridge/WritableArray;Lcom/facebook/react/bridge/WritableArray;)V", "Lcom/facebook/react/uimanager/events/p;", "touchEvent", "(Lcom/facebook/react/uimanager/events/p;)V", BuildConfig.FLAVOR, "canCoalesceEvent", "customCoalesceKey", "category", "(IILjava/lang/String;ZILcom/facebook/react/bridge/WritableMap;I)V", "Ljava/lang/String;", "I", "Ljava/util/List;", "Lcom/facebook/react/animated/x;", "ReactAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class EventAnimationDriver implements RCTModernEventEmitter {
    public String eventName;
    private final List<String> eventPath;
    public x valueNode;
    public int viewTag;

    public EventAnimationDriver(String eventName, int i10, List<String> eventPath, x valueNode) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(eventPath, "eventPath");
        Intrinsics.checkNotNullParameter(valueNode, "valueNode");
        this.eventName = eventName;
        this.viewTag = i10;
        this.eventPath = eventPath;
        this.valueNode = valueNode;
    }

    @Override // com.facebook.react.uimanager.events.RCTEventEmitter
    public void receiveEvent(int targetReactTag, String eventName, WritableMap event) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        receiveEvent(-1, targetReactTag, eventName, event);
    }

    @Override // com.facebook.react.uimanager.events.RCTEventEmitter
    public void receiveTouches(String eventName, WritableArray touches, WritableArray changedIndices) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(touches, "touches");
        Intrinsics.checkNotNullParameter(changedIndices, "changedIndices");
        throw new UnsupportedOperationException("receiveTouches is not support by native animated events");
    }

    @Override // com.facebook.react.uimanager.events.RCTModernEventEmitter
    public void receiveEvent(int surfaceId, int targetTag, String eventName, WritableMap event) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        receiveEvent(surfaceId, targetTag, eventName, false, 0, event, 2);
    }

    @Override // com.facebook.react.uimanager.events.RCTModernEventEmitter
    public void receiveTouches(com.facebook.react.uimanager.events.p touchEvent) {
        Intrinsics.checkNotNullParameter(touchEvent, "touchEvent");
        throw new UnsupportedOperationException("receiveTouches is not support by native animated events");
    }

    @Override // com.facebook.react.uimanager.events.RCTModernEventEmitter
    public void receiveEvent(int surfaceId, int targetTag, String eventName, boolean canCoalesceEvent, int customCoalesceKey, WritableMap event, int category) {
        ReadableMap map;
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        if (event != null) {
            int size = this.eventPath.size() - 1;
            ReadableArray readableArray = null;
            for (int i10 = 0; i10 < size; i10++) {
                if (event != null) {
                    String str = this.eventPath.get(i10);
                    ReadableType type = event.getType(str);
                    if (type == ReadableType.Map) {
                        map = event.getMap(str);
                        event = map;
                        readableArray = null;
                    } else {
                        if (type != ReadableType.Array) {
                            throw new UnexpectedNativeTypeException("Unexpected type " + type + " for key '" + str + "'");
                        }
                        readableArray = event.getArray(str);
                        event = null;
                    }
                } else {
                    int parseInt = Integer.parseInt(this.eventPath.get(i10));
                    ReadableType type2 = readableArray != null ? readableArray.getType(parseInt) : null;
                    if (type2 == ReadableType.Map) {
                        map = readableArray != null ? readableArray.getMap(parseInt) : null;
                        event = map;
                        readableArray = null;
                    } else {
                        if (type2 != ReadableType.Array) {
                            throw new UnexpectedNativeTypeException("Unexpected type " + type2 + " for index '" + parseInt + "'");
                        }
                        readableArray = readableArray != null ? readableArray.getArray(parseInt) : null;
                        event = null;
                    }
                }
            }
            String str2 = this.eventPath.get(r3.size() - 1);
            if (event != null) {
                this.valueNode.f21376f = event.getDouble(str2);
                return;
            }
            this.valueNode.f21376f = readableArray != null ? readableArray.getDouble(Integer.parseInt(str2)) : 0.0d;
            return;
        }
        throw new IllegalArgumentException("Native animated events must have event data.");
    }
}
